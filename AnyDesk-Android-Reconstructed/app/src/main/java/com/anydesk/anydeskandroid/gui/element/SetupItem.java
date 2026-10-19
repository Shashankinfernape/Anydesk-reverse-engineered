package com.anydesk.anydeskandroid.gui.element;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jnilib.Logging;
import defpackage.d30;
import defpackage.lg;
import defpackage.nv0;
import defpackage.r3;
import defpackage.rp;
import defpackage.t70;
import defpackage.uj;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class SetupItem extends LinearLayout {
    public final Logging c;
    public ViewGroup d;
    public TextView e;
    public TextView f;
    public ViewGroup g;
    public ImageView h;
    public TextView i;
    public View j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public Drawable o;
    public int p;
    public int q;

    public SetupItem(Context context) {
        super(context);
        this.c = new Logging("SetupItem");
        this.k = false;
        c(null, 0);
    }

    public final void a() {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public final void b(int i) {
        View view = this.j;
        if (view != null) {
            rp rpVar = (rp) view.getLayoutParams();
            Resources resources = getResources();
            Looper looper = t70.a;
            rpVar.setMarginStart(resources.getDimensionPixelSize(R.dimen.setup_item_padding) * i);
            view.setLayoutParams(rpVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(AttributeSet attributeSet, int i) {
        View.inflate(getContext(), R.layout.setup_item, this);
        this.d = (ViewGroup) findViewById(R.id.setup_item_layout);
        this.e = (TextView) findViewById(R.id.setup_item_title);
        this.f = (TextView) findViewById(R.id.setup_item_description);
        this.g = (ViewGroup) findViewById(R.id.setup_item_status_layout);
        this.h = (ImageView) findViewById(R.id.setup_item_status_icon);
        this.i = (TextView) findViewById(R.id.setup_item_status_text);
        this.j = findViewById(R.id.setup_item_separator);
        if (attributeSet != null) {
            try {
                TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, nv0.g, i, 0);
                try {
                    setTitle(typedArrayObtainStyledAttributes.getString(10));
                    setDescription(typedArrayObtainStyledAttributes.getString(5));
                    this.l = typedArrayObtainStyledAttributes.getBoolean(1, true);
                    this.m = typedArrayObtainStyledAttributes.getBoolean(0, true);
                    this.n = typedArrayObtainStyledAttributes.getBoolean(2, true);
                    String string = typedArrayObtainStyledAttributes.getString(9);
                    this.o = typedArrayObtainStyledAttributes.getDrawable(7);
                    if (typedArrayObtainStyledAttributes.hasValue(6)) {
                        this.p = typedArrayObtainStyledAttributes.getColor(6, 0);
                    } else {
                        Context context = getContext();
                        Looper looper = t70.a;
                        this.p = uj.l(context, R.color.colorSetupStatusCritical);
                    }
                    if (typedArrayObtainStyledAttributes.hasValue(8)) {
                        this.q = typedArrayObtainStyledAttributes.getColor(8, 0);
                    } else {
                        Context context2 = getContext();
                        Looper looper2 = t70.a;
                        this.q = uj.l(context2, R.color.colorSetupStatusWarning);
                    }
                    boolean z = this.n;
                    boolean z2 = this.k;
                    if (z) {
                        d(z2);
                    } else {
                        e(string, z2);
                    }
                    int integer = typedArrayObtainStyledAttributes.getInteger(3, 1);
                    int integer2 = typedArrayObtainStyledAttributes.getInteger(4, 0);
                    Resources resources = getResources();
                    Looper looper3 = t70.a;
                    int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.setup_item_padding);
                    ViewGroup viewGroup = this.d;
                    if (viewGroup != null) {
                        viewGroup.setPaddingRelative(integer * dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                    }
                    b(integer2);
                    if (typedArrayObtainStyledAttributes instanceof AutoCloseable) {
                        typedArrayObtainStyledAttributes.close();
                    } else if (typedArrayObtainStyledAttributes instanceof ExecutorService) {
                        d30.b((ExecutorService) typedArrayObtainStyledAttributes);
                    } else {
                        typedArrayObtainStyledAttributes.recycle();
                    }
                } catch (Throwable th) {
                    if (typedArrayObtainStyledAttributes != 0) {
                        try {
                            if (typedArrayObtainStyledAttributes instanceof AutoCloseable) {
                                typedArrayObtainStyledAttributes.close();
                            } else if (typedArrayObtainStyledAttributes instanceof ExecutorService) {
                                d30.b((ExecutorService) typedArrayObtainStyledAttributes);
                            } else {
                                typedArrayObtainStyledAttributes.recycle();
                            }
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                this.c.d(th3);
            }
        }
    }

    public final void d(boolean z) {
        this.k = z;
        if (!this.m) {
            r3.I(this.h, 8);
            r3.I(this.i, 8);
            return;
        }
        if (this.n) {
            if (z) {
                r3.D(this.h, R.drawable.ic_setup_granted);
            } else {
                Drawable drawable = this.o;
                ImageView imageView = this.h;
                if (drawable == null) {
                    r3.D(imageView, R.drawable.ic_setup_critical);
                } else if (imageView != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            ImageView imageView2 = this.h;
            if (z) {
                r3.e(imageView2);
            } else {
                r3.u(imageView2, this.l ? this.p : this.q);
            }
            r3.I(this.i, 8);
            r3.I(this.h, 0);
        }
    }

    public final void e(String str, boolean z) {
        this.k = z;
        if (!this.m) {
            r3.I(this.h, 8);
            r3.I(this.i, 8);
            return;
        }
        if (this.n) {
            return;
        }
        if (z) {
            r3.D(this.h, R.drawable.ic_setup_granted);
        } else {
            r3.F(this.i, lg.c().e(str));
            TextView textView = this.i;
            Context context = getContext();
            int i = this.l ? R.color.colorPrimary : R.color.colorSetupStatusWarning;
            Looper looper = t70.a;
            r3.G(textView, uj.l(context, i));
        }
        r3.I(this.h, z ? 0 : 8);
        r3.I(this.i, z ? 8 : 0);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        r3.A(this.d, f);
        r3.A(this.g, f);
    }

    public void setCritical(boolean z) {
        this.l = z;
    }

    public void setDescription(String str) {
        r3.F(this.f, lg.c().e(str));
        r3.I(this.f, TextUtils.isEmpty(str) ? 8 : 0);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayoutEnabled(z);
        setStatusEnabled(z);
    }

    public void setHasStatus(boolean z) {
        this.m = z;
    }

    public void setLayoutEnabled(boolean z) {
        r3.C(this.d, z);
    }

    public void setLayoutOnClickListener(View.OnClickListener onClickListener) {
        r3.E(this.d, onClickListener);
    }

    public void setStatusEnabled(boolean z) {
        r3.C(this.g, z);
    }

    public void setStatusOnClickListener(View.OnClickListener onClickListener) {
        r3.E(this.g, onClickListener);
    }

    public void setTitle(String str) {
        r3.F(this.e, lg.c().e(str));
    }

    public SetupItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Logging("SetupItem");
        this.k = false;
        c(attributeSet, 0);
    }

    public SetupItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Logging("SetupItem");
        this.k = false;
        c(attributeSet, i);
    }
}
