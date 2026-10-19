package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class sx {
    public final TextInputLayout a;
    public final rx b;
    public final Context c;
    public final CheckableImageButton d;

    public sx(rx rxVar) {
        this.a = rxVar.c;
        this.b = rxVar;
        this.c = rxVar.getContext();
        this.d = rxVar.i;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public tk h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return this instanceof xv;
    }

    public boolean k() {
        return false;
    }

    public final void p() {
        this.b.f(false);
    }

    public void l(EditText editText) {
    }

    public void m(w3 w3Var) {
    }

    public void n(AccessibilityEvent accessibilityEvent) {
    }

    public void o(boolean z) {
    }

    public void a() {
    }

    public void b() {
    }

    public void q() {
    }

    public void r() {
    }
}
