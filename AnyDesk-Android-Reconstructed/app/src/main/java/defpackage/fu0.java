package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jnilib.Logging;

/* JADX INFO: loaded from: classes.dex */
public abstract class fu0 extends FrameLayout {
    public final Logging c;
    public ImageView d;
    public ImageView e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;

    public fu0(Context context) {
        super(context);
        this.c = new Logging("PermissionIcon");
        a(null, 0);
    }

    public final void a(AttributeSet attributeSet, int i) {
        Logging logging = this.c;
        this.f = false;
        this.g = false;
        Context context = getContext();
        Looper looper = t70.a;
        this.h = uj.l(context, R.color.colorPermissionIconGrantedEnabled);
        this.i = uj.l(getContext(), R.color.colorPermissionIconGrantedDisabled);
        this.j = uj.l(getContext(), R.color.colorSettingsCategoryText);
        this.k = uj.l(getContext(), R.color.colorSettingsCategoryTextDisabled);
        View.inflate(getContext(), getLayoutId(), this);
        findViewById(R.id.permission_icon_layout);
        this.d = (ImageView) findViewById(R.id.permission_icon_image);
        this.e = (ImageView) findViewById(R.id.permission_icon_badge);
        if (attributeSet != null) {
            try {
                TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, nv0.f, i, 0);
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
                if (drawable != null) {
                    ImageView imageView = this.d;
                    if (imageView != null) {
                        imageView.setImageDrawable(drawable);
                    }
                } else {
                    logging.h("no icon set");
                }
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                logging.d(th);
            }
        }
    }

    public abstract int getLayoutId();

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.g;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        int i;
        this.g = z;
        if (this.f) {
            i = z ? this.h : this.i;
        } else {
            i = z ? this.j : this.k;
        }
        r3.u(this.d, i);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        r3.E(this.d, onClickListener);
    }

    public void setPermissionGranted(boolean z) {
        int iL;
        int i;
        this.f = z;
        ImageView imageView = this.d;
        if (z) {
            Context context = getContext();
            Looper looper = t70.a;
            iL = uj.l(context, R.color.colorPrimary);
        } else {
            iL = 0;
        }
        if (imageView != null) {
            imageView.setBackgroundColor(iL);
        }
        boolean z2 = this.f;
        boolean z3 = this.g;
        if (z2) {
            i = z3 ? this.h : this.i;
        } else {
            i = z3 ? this.j : this.k;
        }
        r3.u(this.d, i);
    }

    public void setPermissionLocked(boolean z) {
        setEnabled(!z);
        r3.I(this.e, z ? 0 : 4);
    }

    public void setTooltip(String str) {
        r3.H(this.d, str);
    }

    public fu0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Logging("PermissionIcon");
        a(attributeSet, 0);
    }

    public fu0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Logging("PermissionIcon");
        a(attributeSet, i);
    }
}
