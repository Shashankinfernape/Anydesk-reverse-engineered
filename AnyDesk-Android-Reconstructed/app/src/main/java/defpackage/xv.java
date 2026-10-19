package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.anydesk.anydeskandroid.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class xv extends sx {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final m i;
    public final jm j;
    public final tk k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    public xv(rx rxVar) {
        super(rxVar);
        this.i = new m(3, this);
        this.j = new jm(this, 1);
        this.k = new tk(this);
        this.o = Long.MAX_VALUE;
        this.f = lk0.G(rxVar.getContext(), R.attr.motionDurationShort3, 67);
        this.e = lk0.G(rxVar.getContext(), R.attr.motionDurationShort3, 50);
        this.g = lk0.H(rxVar.getContext(), R.attr.motionEasingLinearInterpolator, x8.a);
    }

    @Override // defpackage.sx
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && this.h.getInputType() != 0 && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new l(8, this));
    }

    @Override // defpackage.sx
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.sx
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.sx
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // defpackage.sx
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // defpackage.sx
    public final tk h() {
        return this.k;
    }

    @Override // defpackage.sx
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // defpackage.sx
    public final boolean k() {
        return this.n;
    }

    @Override // defpackage.sx
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: vv
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    xv xvVar = this.c;
                    long j = jCurrentTimeMillis - xvVar.o;
                    if (j < 0 || j > 300) {
                        xvVar.m = false;
                    }
                    xvVar.t();
                    xvVar.m = true;
                    xvVar.o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: wv
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                xv xvVar = this.a;
                xvVar.m = true;
                xvVar.o = System.currentTimeMillis();
                xvVar.s(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = oe1.a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // defpackage.sx
    public final void m(w3 w3Var) {
        if (this.h.getInputType() == 0) {
            w3Var.j(Spinner.class.getName());
        }
        if (w3Var.h()) {
            w3Var.m(null);
        }
    }

    @Override // defpackage.sx
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (this.p.isEnabled() && this.h.getInputType() == 0) {
            boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                t();
                this.m = true;
                this.o = System.currentTimeMillis();
            }
        }
    }

    @Override // defpackage.sx
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f);
        int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new kv(i, this));
        this.r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.e);
        valueAnimatorOfFloat2.addUpdateListener(new kv(i, this));
        this.q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new h0(3, this));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // defpackage.sx
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void t() {
        if (this.h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        s(!this.n);
        boolean z = this.n;
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.h.showDropDown();
        }
    }
}
