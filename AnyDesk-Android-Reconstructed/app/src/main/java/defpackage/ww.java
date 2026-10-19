package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ww extends InputConnectionWrapper {
    public final EditText a;
    public final fw b;

    public ww(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        fw fwVar = new fw(15);
        super(inputConnection, false);
        this.a = editText;
        this.b = fwVar;
        if (rw.k != null) {
            rw rwVarA = rw.a();
            if (rwVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            nw nwVar = rwVarA.e;
            nwVar.getClass();
            Bundle bundle = editorInfo.extras;
            ql0 ql0Var = (ql0) nwVar.c.a;
            int iA = ql0Var.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) ql0Var.f).getInt(iA + ql0Var.c) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return fw.f(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return fw.f(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
