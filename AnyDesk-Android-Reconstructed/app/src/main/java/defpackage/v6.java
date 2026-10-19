package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jnilib.Logging;

/* JADX INFO: loaded from: classes.dex */
public abstract class v6 extends LinearLayout {
    public final Logging c;
    public EditText d;
    public ImageView e;
    public ImageView f;
    public ImageView g;
    public View h;
    public Runnable i;
    public q6 j;
    public int k;
    public int l;
    public boolean m;
    public final Runnable n;
    public final Runnable o;

    public v6(Context context) {
        super(context);
        this.c = new Logging("AdEditText");
        final int i = 0;
        this.n = new Runnable(this) { // from class: s6
            public final /* synthetic */ v6 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                v6 v6Var = this.d;
                switch (i2) {
                    case 0:
                        try {
                            EditText editText = v6Var.d;
                            if (editText != null) {
                                editText.requestFocus();
                            }
                        } catch (Throwable unused) {
                            return;
                        }
                        break;
                    default:
                        v6.a(v6Var);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.o = new Runnable(this) { // from class: s6
            public final /* synthetic */ v6 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                v6 v6Var = this.d;
                switch (i3) {
                    case 0:
                        try {
                            EditText editText = v6Var.d;
                            if (editText != null) {
                                editText.requestFocus();
                            }
                        } catch (Throwable unused) {
                            return;
                        }
                        break;
                    default:
                        v6.a(v6Var);
                        break;
                }
            }
        };
        e(null, 0);
    }

    public static /* synthetic */ void a(v6 v6Var) {
        try {
            EditText editText = v6Var.d;
            if (editText == null || !editText.requestFocus()) {
                return;
            }
            editText.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, 0.0f, 0.0f, 0));
            editText.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, 0.0f, 0.0f, 0));
        } catch (Throwable unused) {
        }
    }

    public final void b() {
        removeCallbacks(this.o);
        removeCallbacks(this.n);
        c();
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        ImageView imageView3 = this.g;
        if (imageView3 != null) {
            imageView3.setOnClickListener(null);
        }
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }

    public abstract void c();

    public abstract void d();

    public final void e(AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        int i4;
        Context context = getContext();
        Looper looper = t70.a;
        this.k = uj.l(context, R.color.colorAddrBoxIconTint);
        this.l = uj.l(getContext(), R.color.colorAddrBoxIconTintDisabled);
        View.inflate(getContext(), R.layout.ad_edit_text_base, this);
        this.d = (EditText) findViewById(R.id.ad_edit_text_input);
        this.e = (ImageView) findViewById(R.id.ad_edit_text_password_toggle_button);
        this.f = (ImageView) findViewById(R.id.ad_edit_text_clear_button);
        this.g = (ImageView) findViewById(R.id.ad_edit_text_speak_button);
        this.h = findViewById(R.id.ad_edit_text_separator);
        d();
        this.d.setOnEditorActionListener(new t6(0, this));
        this.e.setOnClickListener(new u6(this, 0));
        this.f.setOnClickListener(new u6(this, 1));
        this.g.setOnClickListener(new u6(this, 2));
        if (attributeSet != null) {
            try {
                TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, nv0.b, i, 0);
                setSeparatorVisible(typedArrayObtainStyledAttributes.getBoolean(5, true));
                if (typedArrayObtainStyledAttributes.getBoolean(0, false)) {
                    this.d.setEllipsize(TextUtils.TruncateAt.END);
                }
                this.m = typedArrayObtainStyledAttributes.getBoolean(1, true);
                setHint(typedArrayObtainStyledAttributes.getString(2));
                TypedValue typedValue = new TypedValue();
                if (typedArrayObtainStyledAttributes.getValue(7, typedValue) && typedValue.type == 5) {
                    setTextSizePixel(typedValue.getDimension(Resources.getSystem().getDisplayMetrics()));
                }
                if (typedArrayObtainStyledAttributes.getValue(6, typedValue) && (i4 = typedValue.type) >= 28 && i4 <= 31) {
                    int i5 = typedValue.data;
                    this.k = i5;
                    setTextColor(i5);
                }
                if (typedArrayObtainStyledAttributes.getValue(4, typedValue) && (i3 = typedValue.type) >= 16 && i3 <= 31) {
                    setInputType(typedValue.data);
                }
                if (typedArrayObtainStyledAttributes.getValue(3, typedValue) && (i2 = typedValue.type) >= 16 && i2 <= 31) {
                    setImeOption(typedValue.data);
                }
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                this.c.d(th);
            }
        }
        k(0);
    }

    public final boolean f() {
        EditText editText = this.d;
        return editText != null && editText.getInputType() == 129;
    }

    public abstract boolean g();

    public abstract void h();

    public final void i(boolean z) {
        postDelayed(z ? this.o : this.n, 100L);
    }

    public final void j(boolean z) {
        if (!f() || !this.m) {
            r3.I(this.e, 8);
        } else {
            r3.D(this.e, z ? R.drawable.ic_key_password_show : R.drawable.ic_key_password_hide);
            r3.I(this.e, 0);
        }
    }

    public final void k(int i) {
        int i2;
        boolean z = false;
        int i3 = 8;
        if (i != 0) {
            i2 = 8;
            i3 = 0;
        } else if (this.i == null || !MainApplication.v().b0) {
            i2 = (f() && this.m) ? 8 : 4;
        } else {
            i2 = 0;
        }
        this.f.setVisibility(i3);
        this.g.setVisibility(i2);
        if (f()) {
            z = !this.m ? true : this.d.getTransformationMethod() instanceof PasswordTransformationMethod;
        }
        j(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.d.setEnabled(z);
        this.e.setEnabled(z);
        this.f.setEnabled(z);
        this.g.setEnabled(z);
        setTextColor(z ? this.k : this.l);
        ImageView imageView = this.e;
        if (z) {
            r3.e(imageView);
            r3.e(this.f);
            r3.e(this.g);
        } else {
            r3.u(imageView, this.l);
            r3.u(this.f, this.l);
            r3.u(this.g, this.l);
        }
    }

    public abstract void setFilter(String str);

    public void setHint(String str) {
        this.d.setHint(str);
    }

    public void setImeOption(int i) {
        this.d.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.d.setInputType(i);
    }

    public void setOnSpeakListener(Runnable runnable) {
        this.i = runnable;
        h();
    }

    public void setPasswordHidden(boolean z) {
        if (f() && this.m) {
            this.d.setTransformationMethod(z ? PasswordTransformationMethod.getInstance() : null);
            j(z);
        }
    }

    public void setSeparatorVisible(boolean z) {
        r3.I(this.h, z ? 0 : 8);
    }

    public void setTextColor(int i) {
        this.d.setTextColor(i);
    }

    public void setTextSizePixel(float f) {
        this.d.setTextSize(0, f);
    }

    public v6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Logging("AdEditText");
        final int i = 0;
        this.n = new Runnable(this) { // from class: s6
            public final /* synthetic */ v6 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                v6 v6Var = this.d;
                switch (i3) {
                    case 0:
                        try {
                            EditText editText = v6Var.d;
                            if (editText != null) {
                                editText.requestFocus();
                            }
                        } catch (Throwable unused) {
                            return;
                        }
                        break;
                    default:
                        v6.a(v6Var);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.o = new Runnable(this) { // from class: s6
            public final /* synthetic */ v6 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                v6 v6Var = this.d;
                switch (i3) {
                    case 0:
                        try {
                            EditText editText = v6Var.d;
                            if (editText != null) {
                                editText.requestFocus();
                            }
                        } catch (Throwable unused) {
                            return;
                        }
                        break;
                    default:
                        v6.a(v6Var);
                        break;
                }
            }
        };
        e(attributeSet, 0);
    }

    public v6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Logging("AdEditText");
        final int i2 = 0;
        this.n = new Runnable(this) { // from class: s6
            public final /* synthetic */ v6 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                v6 v6Var = this.d;
                switch (i3) {
                    case 0:
                        try {
                            EditText editText = v6Var.d;
                            if (editText != null) {
                                editText.requestFocus();
                            }
                        } catch (Throwable unused) {
                            return;
                        }
                        break;
                    default:
                        v6.a(v6Var);
                        break;
                }
            }
        };
        final int i3 = 1;
        this.o = new Runnable(this) { // from class: s6
            public final /* synthetic */ v6 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i3;
                v6 v6Var = this.d;
                switch (i4) {
                    case 0:
                        try {
                            EditText editText = v6Var.d;
                            if (editText != null) {
                                editText.requestFocus();
                            }
                        } catch (Throwable unused) {
                            return;
                        }
                        break;
                    default:
                        v6.a(v6Var);
                        break;
                }
            }
        };
        e(attributeSet, i);
    }
}
