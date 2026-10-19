package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.anydesk.anydeskandroid.gui.activity.GlowActivity;
import com.anydesk.jni.JniImeConnection;

/* JADX INFO: loaded from: classes.dex */
public final class f70 extends FrameLayout {
    public final /* synthetic */ GlowActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f70(GlowActivity glowActivity, GlowActivity glowActivity2) {
        super(glowActivity2);
        this.c = glowActivity;
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public static void a(JniImeConnection jniImeConnection, Bundle bundle, boolean z) {
        int i;
        int i2 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        if (i2 == 1 || i2 == 2) {
            i = z ? 21 : 22;
        } else {
            i = z ? 19 : 20;
        }
        int i3 = i;
        int i4 = (i2 == 1 || i2 == 4) ? 0 : 4096;
        if (z2) {
            i4 |= 1;
        }
        int i5 = i4;
        jniImeConnection.sendKeyEvent(new KeyEvent(0L, 0L, 0, i3, 0, i5));
        jniImeConnection.sendKeyEvent(new KeyEvent(0L, 0L, 1, i3, 0, i5));
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        return this.c.g != null;
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        GlowActivity glowActivity = this.c;
        if (glowActivity.g == null) {
            return null;
        }
        JniImeConnection jniImeConnection = new JniImeConnection(glowActivity, this, editorInfo, glowActivity.g);
        glowActivity.h = jniImeConnection;
        return uj.j(this, jniImeConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        GlowActivity glowActivity = this.c;
        if (glowActivity.g == null || glowActivity.h == null) {
            return;
        }
        accessibilityNodeInfo.setClassName(EditText.class.getName());
        accessibilityNodeInfo.setVisibleToUser(true);
        accessibilityNodeInfo.setEditable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setFocused(true);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_TEXT);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_SELECTION);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_NEXT_AT_MOVEMENT_GRANULARITY);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY);
        accessibilityNodeInfo.setMovementGranularities(7);
        Editable editable = glowActivity.h.getEditable();
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        accessibilityNodeInfo.setText(editable);
        accessibilityNodeInfo.setTextSelection(selectionStart, selectionEnd);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            GlowActivity.jniOnActivityWindowRectChanged(this.c.mNativeActivityPtr, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        GlowActivity glowActivity = this.c;
        JniImeConnection jniImeConnection = glowActivity.h;
        if (jniImeConnection != null && bundle != null) {
            if (i == 256) {
                a(jniImeConnection, bundle, false);
                return true;
            }
            if (i == 512) {
                a(jniImeConnection, bundle, true);
                return true;
            }
            if (i == 131072) {
                int i2 = bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1);
                int i3 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1);
                if (i2 != -1 && i3 != -1) {
                    glowActivity.h.setSelection(i2, i3);
                    return true;
                }
            } else if (i == 2097152) {
                CharSequence charSequence = bundle.getCharSequence("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE", "");
                JniImeConnection jniImeConnection2 = glowActivity.h;
                jniImeConnection2.replaceText(0, jniImeConnection2.getEditable().length(), charSequence, 1, null);
                return true;
            }
        }
        return super.performAccessibilityAction(i, bundle);
    }
}
