package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.anydesk.anydeskandroid.R;
import defpackage.ea1;
import defpackage.fa1;
import defpackage.m7;
import defpackage.w91;
import defpackage.xb;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {
    public final m7 c;
    public final xb d;
    public boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ea1.a(context);
        this.e = false;
        w91.a(getContext(), this);
        m7 m7Var = new m7(this);
        this.c = m7Var;
        m7Var.k(attributeSet, i);
        xb xbVar = new xb(this);
        this.d = xbVar;
        xbVar.d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m7 m7Var = this.c;
        if (m7Var != null) {
            m7Var.a();
        }
        xb xbVar = this.d;
        if (xbVar != null) {
            xbVar.a();
        }
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

    public ColorStateList getSupportImageTintList() {
        fa1 fa1Var;
        xb xbVar = this.d;
        if (xbVar == null || (fa1Var = (fa1) xbVar.e) == null) {
            return null;
        }
        return fa1Var.a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        fa1 fa1Var;
        xb xbVar = this.d;
        if (xbVar == null || (fa1Var = (fa1) xbVar.e) == null) {
            return null;
        }
        return fa1Var.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.d.d).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
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

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        xb xbVar = this.d;
        if (xbVar != null) {
            xbVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        xb xbVar = this.d;
        if (xbVar != null && drawable != null && !this.e) {
            xbVar.c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (xbVar != null) {
            xbVar.a();
            if (this.e) {
                return;
            }
            ImageView imageView = (ImageView) xbVar.d;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(xbVar.c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.e = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.d.g(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        xb xbVar = this.d;
        if (xbVar != null) {
            xbVar.a();
        }
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

    public void setSupportImageTintList(ColorStateList colorStateList) {
        xb xbVar = this.d;
        if (xbVar != null) {
            if (((fa1) xbVar.e) == null) {
                xbVar.e = new fa1();
            }
            fa1 fa1Var = (fa1) xbVar.e;
            fa1Var.a = colorStateList;
            fa1Var.d = true;
            xbVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        xb xbVar = this.d;
        if (xbVar != null) {
            if (((fa1) xbVar.e) == null) {
                xbVar.e = new fa1();
            }
            fa1 fa1Var = (fa1) xbVar.e;
            fa1Var.b = mode;
            fa1Var.c = true;
            xbVar.a();
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public AppCompatImageButton(Context context) {
        this(context, null);
    }
}
