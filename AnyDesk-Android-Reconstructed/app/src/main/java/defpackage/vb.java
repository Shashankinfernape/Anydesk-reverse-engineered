package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public class vb extends EditText implements zq0, ia1 {
    public final m7 c;
    public final wc d;
    public final bc e;
    public final v91 f;
    public final bc g;
    public ub h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        ea1.a(context);
        w91.a(getContext(), this);
        m7 m7Var = new m7(this);
        this.c = m7Var;
        m7Var.k(attributeSet, R.attr.editTextStyle);
        wc wcVar = new wc(this);
        this.d = wcVar;
        wcVar.f(attributeSet, R.attr.editTextStyle);
        wcVar.b();
        bc bcVar = new bc(9, false);
        bcVar.d = this;
        this.e = bcVar;
        this.f = new v91();
        bc bcVar2 = new bc(this, 8);
        this.g = bcVar2;
        bcVar2.Z(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerX = bcVar2.X(keyListener);
        if (keyListenerX == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerX);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    private ub getSuperCaller() {
        if (this.h == null) {
            this.h = new ub(this);
        }
        return this.h;
    }

    @Override // defpackage.zq0
    public final nq a(nq nqVar) {
        this.f.getClass();
        return v91.a(this, nqVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m7 m7Var = this.c;
        if (m7Var != null) {
            m7Var.a();
        }
        wc wcVar = this.d;
        if (wcVar != null) {
            wcVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return nd0.X(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        m7 m7Var = this.c;
        if (m7Var != null) {
            return m7Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        m7 m7Var = this.c;
        if (m7Var != null) {
            return m7Var.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.d.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.d.e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        bc bcVar;
        if (Build.VERSION.SDK_INT >= 28 || (bcVar = this.e) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) bcVar.e;
        return textClassifier == null ? qc.a((TextView) bcVar.d) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrG;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.d.getClass();
        wc.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        r71.C(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (strArrG = oe1.g(this)) != null) {
            hw.b(editorInfo, strArrG);
            inputConnectionOnCreateInputConnection = uj.j(this, inputConnectionOnCreateInputConnection, editorInfo);
        }
        return this.g.a0(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean zA = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && oe1.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = dc.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        lq lqVar;
        kq kqVar;
        int i2;
        jq jqVar;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || oe1.g(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                jqVar = new jq(primaryClip, 1);
            } else {
                lqVar = new lq();
                lqVar.b = primaryClip;
                lqVar.c = 1;
            }
            if (i == 16908322) {
                kqVar = lqVar;
                kqVar = jqVar;
                i2 = 0;
            } else {
                kqVar = lqVar;
                kqVar = jqVar;
                i2 = 1;
            }
            kqVar.f(i2);
            oe1.k(this, kqVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m7 m7Var = this.c;
        if (m7Var != null) {
            m7Var.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        m7 m7Var = this.c;
        if (m7Var != null) {
            m7Var.n(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        wc wcVar = this.d;
        if (wcVar != null) {
            wcVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        wc wcVar = this.d;
        if (wcVar != null) {
            wcVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(nd0.Y(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.g.h0(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.g.X(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        m7 m7Var = this.c;
        if (m7Var != null) {
            m7Var.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        m7 m7Var = this.c;
        if (m7Var != null) {
            m7Var.t(mode);
        }
    }

    @Override // defpackage.ia1
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        wc wcVar = this.d;
        wcVar.l(colorStateList);
        wcVar.b();
    }

    @Override // defpackage.ia1
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        wc wcVar = this.d;
        wcVar.m(mode);
        wcVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        wc wcVar = this.d;
        if (wcVar != null) {
            wcVar.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        bc bcVar;
        if (Build.VERSION.SDK_INT >= 28 || (bcVar = this.e) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            bcVar.e = textClassifier;
        }
    }
}
