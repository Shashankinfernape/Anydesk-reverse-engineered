package com.anydesk.jni;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.TextAttribute;
import com.anydesk.anydeskandroid.gui.activity.GlowActivity;
import com.samsung.android.knox.application.ApplicationPolicy;
import defpackage.d00;
import defpackage.f70;
import defpackage.gw;
import defpackage.nd0;
import defpackage.od0;
import defpackage.t70;
import defpackage.uj;
import j$.util.Objects;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class JniImeConnection extends BaseInputConnection {
    public final GlowActivity a;
    public final f70 b;
    public byte[] c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;

    public static class EditorState {
        public final int a;
        public final int b;
        public final byte[] c;

        public EditorState(int i, int i2, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = bArr;
        }
    }

    public JniImeConnection(GlowActivity glowActivity, f70 f70Var, EditorInfo editorInfo, gw gwVar) {
        super(f70Var, true);
        this.d = 0;
        this.e = false;
        this.f = false;
        this.g = false;
        this.a = glowActivity;
        this.b = f70Var;
        EditorState editorStateJniGetEditorState = jniGetEditorState(glowActivity.i());
        if (editorStateJniGetEditorState == null) {
            return;
        }
        this.c = editorStateJniGetEditorState.c;
        Editable editable = getEditable();
        editable.append((CharSequence) nd0.t(this.c));
        h(editorStateJniGetEditorState.a, editorStateJniGetEditorState.b);
        long j = gwVar.c;
        int i = (j & 2) == 2 ? 163841 : 32769;
        i = (j & 8) == 8 ? i | 128 : i;
        editorInfo.inputType = (j & 32) == 32 ? i | 32 : i;
        editorInfo.initialSelStart = Selection.getSelectionStart(editable);
        editorInfo.initialSelEnd = Selection.getSelectionEnd(editable);
        editorInfo.initialCapsMode = TextUtils.getCapsMode(editable, editorInfo.initialSelStart, editorInfo.inputType);
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = new String[]{"*/*", "application/*", ApplicationPolicy.DEFAULT_TYPE_AUDIO, "font/*", "image/*", "model/*", "text/*", "video/*"};
        }
    }

    public static void a(JniImeConnection jniImeConnection, String str) {
        if (jniReceiveFileInEditor(jniImeConnection.a.i(), nd0.T(str))) {
            return;
        }
        t70.g0(jniImeConnection.b.getContext(), JniAdExt.n1("ad.status.tooltip.clipboard_files.no_paste.android"), 0);
    }

    public static int c(byte[] bArr, od0 od0Var) {
        int i = od0Var.c;
        int i2 = od0Var.a;
        return i > 0 ? ((i2 + bArr.length) + i) - 1 : i2 + i;
    }

    public static od0 e(Editable editable, int i, int i2, int i3) {
        if (i > i2) {
            i2 = i;
            i = i2;
        }
        int length = editable.length();
        int iF = uj.f(i, 0, length);
        int iF2 = uj.f(i2, 0, length);
        CharSequence charSequenceSubSequence = editable.subSequence(0, iF);
        Charset charset = StandardCharsets.UTF_8;
        ByteBuffer byteBufferEncode = charset.encode(CharBuffer.wrap(charSequenceSubSequence));
        ByteBuffer byteBufferEncode2 = charset.encode(CharBuffer.wrap(editable.subSequence(iF, iF2)));
        int iRemaining = byteBufferEncode.remaining();
        int iRemaining2 = byteBufferEncode2.remaining();
        od0 od0Var = new od0();
        od0Var.a = iRemaining;
        od0Var.b = iRemaining + iRemaining2;
        if (i3 > 0) {
            od0Var.c = charset.encode(CharBuffer.wrap(editable.subSequence(iF2, uj.f(i3 - 1, 0, length - iF2) + iF2))).remaining() + 1;
            return od0Var;
        }
        od0Var.c = -charset.encode(CharBuffer.wrap(editable.subSequence(iF - uj.f(-i3, 0, iF), iF))).remaining();
        return od0Var;
    }

    private static native boolean jniCanEditorReceiveFiles(long j);

    private static native EditorState jniDeleteEditorText(long j, int i, int i2);

    private static native EditorState jniGetEditorState(long j);

    private static native boolean jniReceiveFileInEditor(long j, byte[] bArr);

    private static native EditorState jniReplaceEditorText(long j, int i, int i2, int i3, byte[] bArr);

    private static native boolean jniSetEditorComposingRegion(long j, int i, int i2);

    private static native EditorState jniSetEditorSelection(long j, int i, int i2);

    public final void b(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return;
        }
        t70.b(this.b.getContext(), uri, true, new File(path).getName(), null, "", new d00(1, this));
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.d++;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean zJniCanEditorReceiveFiles = jniCanEditorReceiveFiles(this.a.i());
        if (zJniCanEditorReceiveFiles) {
            b(inputContentInfo.getContentUri());
        }
        return zJniCanEditorReceiveFiles;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        Editable editable = getEditable();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(editable);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(editable);
        if (composingSpanStart < 0) {
            composingSpanStart = Selection.getSelectionStart(editable);
        }
        if (composingSpanEnd < 0) {
            composingSpanEnd = Selection.getSelectionEnd(editable);
        }
        od0 od0VarE = e(editable, composingSpanStart, composingSpanEnd, i);
        super.commitText(charSequence, i);
        byte[] bytes = charSequence.toString().getBytes(StandardCharsets.UTF_8);
        return d(jniReplaceEditorText(this.a.i(), od0VarE.a, od0VarE.b, c(bytes, od0VarE), bytes));
    }

    public final boolean d(EditorState editorState) {
        if (editorState == null) {
            return false;
        }
        f(editorState.c);
        h(editorState.a, editorState.b);
        f70 f70Var = this.b;
        InputMethodManager inputMethodManager = (InputMethodManager) f70Var.getContext().getSystemService("input_method");
        if (this.d == 0) {
            g(inputMethodManager, true);
        } else {
            this.g = true;
        }
        if (this.e) {
            Editable editable = getEditable();
            inputMethodManager.updateCursorAnchorInfo(f70Var, new CursorAnchorInfo.Builder().setSelectionRange(Selection.getSelectionStart(editable), Selection.getSelectionEnd(editable)).build());
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editable = getEditable();
        int selectionStart = Selection.getSelectionStart(editable);
        od0 od0VarE = e(editable, selectionStart - uj.f(i, 0, selectionStart), uj.f(i2, 0, editable.length() - selectionStart) + selectionStart, 1);
        super.deleteSurroundingText(i, i2);
        return d(jniDeleteEditorText(this.a.i(), od0VarE.a, od0VarE.b));
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editable = getEditable();
        int selectionStart = Selection.getSelectionStart(editable);
        od0 od0VarE = e(editable, Character.offsetByCodePoints(editable, selectionStart, -uj.f(i, 0, selectionStart)), Character.offsetByCodePoints(editable, selectionStart, uj.f(i2, 0, editable.length() - selectionStart)), 1);
        super.deleteSurroundingTextInCodePoints(i, i2);
        return d(jniDeleteEditorText(this.a.i(), od0VarE.a, od0VarE.b));
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        int i = this.d - 1;
        this.d = i;
        boolean z = i > 0;
        if (!z && this.g) {
            g((InputMethodManager) this.b.getContext().getSystemService("input_method"), true);
            this.g = false;
        }
        return z;
    }

    public final void f(byte[] bArr) {
        this.c = bArr;
        String strT = nd0.t(bArr);
        Editable editable = getEditable();
        if (strT.contentEquals(editable)) {
            return;
        }
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(editable);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(editable);
        editable.replace(0, editable.length(), strT);
        if (composingSpanStart == -1 || composingSpanEnd == -1) {
            return;
        }
        setComposingRegion(Math.min(composingSpanStart, strT.length()), Math.min(composingSpanEnd, strT.length()));
    }

    public final void g(InputMethodManager inputMethodManager, boolean z) {
        int i;
        Editable editable = getEditable();
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(editable);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(editable);
        if (z || composingSpanStart != composingSpanEnd) {
            i = composingSpanStart;
        } else {
            composingSpanEnd = editable.length();
            i = 0;
        }
        inputMethodManager.updateSelection(this.b, selectionStart, selectionEnd, i, composingSpanEnd);
        if (this.f) {
            ExtractedText extractedText = new ExtractedText();
            extractedText.text = editable;
            extractedText.startOffset = 0;
            extractedText.partialStartOffset = -1;
            extractedText.partialEndOffset = -1;
            extractedText.selectionStart = selectionStart;
            extractedText.selectionEnd = selectionEnd;
            extractedText.flags = 0;
            inputMethodManager.updateExtractedText(this.b, this.h, extractedText);
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        Editable editable = super.getEditable();
        Objects.requireNonNull(editable);
        return editable;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        this.f = t70.e(i, 1);
        this.h = extractedTextRequest.token;
        Editable editable = getEditable();
        int iF = uj.f(extractedTextRequest.hintMaxChars, 0, editable.length());
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = editable.subSequence(0, iF);
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = Selection.getSelectionStart(editable);
        extractedText.selectionEnd = Selection.getSelectionEnd(editable);
        extractedText.flags = 0;
        return extractedText;
    }

    public final void h(int i, int i2) {
        byte[] bArr = this.c;
        if (bArr == null) {
            return;
        }
        if (i > i2) {
            i2 = i;
            i = i2;
        }
        int iF = uj.f(i, 0, bArr.length);
        int iF2 = uj.f(i2, 0, this.c.length);
        byte[] bArr2 = this.c;
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArr2, 0, iF, charset);
        String str2 = new String(this.c, iF, iF2 - iF, charset);
        int length = str.length();
        int length2 = str2.length() + length;
        Editable editable = getEditable();
        int length3 = editable.length();
        Selection.setSelection(editable, uj.f(length, 0, length3), uj.f(length2, 0, length3));
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean replaceText(int i, int i2, CharSequence charSequence, int i3, TextAttribute textAttribute) {
        od0 od0VarE = e(getEditable(), i, i2, i3);
        super.replaceText(i, i2, charSequence, i3, textAttribute);
        byte[] bytes = charSequence.toString().getBytes(StandardCharsets.UTF_8);
        return d(jniReplaceEditorText(this.a.i(), od0VarE.a, od0VarE.b, c(bytes, od0VarE), bytes));
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        this.e = t70.e(i, 2);
        if (t70.e(i, 1)) {
            f70 f70Var = this.b;
            InputMethodManager inputMethodManager = (InputMethodManager) f70Var.getContext().getSystemService("input_method");
            Editable editable = getEditable();
            inputMethodManager.updateCursorAnchorInfo(f70Var, new CursorAnchorInfo.Builder().setSelectionRange(Selection.getSelectionStart(editable), Selection.getSelectionEnd(editable)).build());
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        od0 od0VarE = e(getEditable(), i, i2, 1);
        super.setComposingRegion(i, i2);
        return jniSetEditorComposingRegion(this.a.i(), od0VarE.a, od0VarE.b);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        Editable editable = getEditable();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(editable);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(editable);
        if (composingSpanStart < 0) {
            composingSpanStart = Selection.getSelectionStart(editable);
        }
        if (composingSpanEnd < 0) {
            composingSpanEnd = Selection.getSelectionEnd(editable);
        }
        od0 od0VarE = e(editable, composingSpanStart, composingSpanEnd, i);
        super.setComposingText(charSequence, i);
        byte[] bytes = charSequence.toString().getBytes(StandardCharsets.UTF_8);
        return d(jniReplaceEditorText(this.a.i(), od0VarE.a, od0VarE.b, c(bytes, od0VarE), bytes));
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        od0 od0VarE = e(getEditable(), i, i2, 1);
        super.setSelection(i, i2);
        return d(jniSetEditorSelection(this.a.i(), od0VarE.a, od0VarE.b));
    }
}
