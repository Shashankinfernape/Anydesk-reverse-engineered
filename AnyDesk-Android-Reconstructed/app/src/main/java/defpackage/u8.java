package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class u8 extends hd1 implements Animatable {
    public static final /* synthetic */ int i = 0;
    public final Context e;
    public h0 f = null;
    public ArrayList g = null;
    public final r8 h = new r8(this);
    public final s8 d = new s8();

    public u8(Context context, int i2) {
        this.e = context;
    }

    public final void a(cg cgVar) {
        Drawable drawable = this.c;
        if (drawable != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
            if (cgVar.a == null) {
                cgVar.a = new l8(cgVar);
            }
            animatedVectorDrawable.registerAnimationCallback(cgVar.a);
            return;
        }
        if (cgVar == null) {
            return;
        }
        if (this.g == null) {
            this.g = new ArrayList();
        }
        if (this.g.contains(cgVar)) {
            return;
        }
        this.g.add(cgVar);
        if (this.f == null) {
            this.f = new h0(2, this);
        }
        this.d.b.addListener(this.f);
    }

    @Override // defpackage.hd1, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    public final void b(cg cgVar) {
        h0 h0Var;
        Drawable drawable = this.c;
        if (drawable != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
            if (cgVar.a == null) {
                cgVar.a = new l8(cgVar);
            }
            animatedVectorDrawable.unregisterAnimationCallback(cgVar.a);
        }
        ArrayList arrayList = this.g;
        if (arrayList == null || cgVar == null) {
            return;
        }
        arrayList.remove(cgVar);
        if (this.g.size() != 0 || (h0Var = this.f) == null) {
            return;
        }
        this.d.b.removeListener(h0Var);
        this.f = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        s8 s8Var = this.d;
        s8Var.a.draw(canvas);
        if (s8Var.b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.c;
        return drawable != null ? drawable.getAlpha() : this.d.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.d.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.c;
        return drawable != null ? drawable.getColorFilter() : this.d.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.c == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new t8(this.c.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.c;
        return drawable != null ? drawable.getIntrinsicHeight() : this.d.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.c;
        return drawable != null ? drawable.getIntrinsicWidth() : this.d.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.c;
        return drawable != null ? drawable.getOpacity() : this.d.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        s8 s8Var;
        Animator animatorL;
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int i2 = 1;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            s8Var = this.d;
            if (eventType == i2 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                XmlResourceParser xmlResourceParser = null;
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayZ = hq.z(resources, theme, attributeSet, hq.g);
                    int resourceId = typedArrayZ.getResourceId(0, 0);
                    if (resourceId != 0) {
                        qd1 qd1VarA = qd1.a(resources, resourceId, theme);
                        qd1VarA.h = false;
                        qd1VarA.setCallback(this.h);
                        qd1 qd1Var = s8Var.a;
                        if (qd1Var != null) {
                            qd1Var.setCallback(null);
                        }
                        s8Var.a = qd1VarA;
                    }
                    typedArrayZ.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, hq.h);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(i2, 0);
                    if (resourceId2 != 0) {
                        Context context = this.e;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            nh0.j("Context can't be null when inflating animators");
                            return;
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            animatorL = AnimatorInflater.loadAnimator(context, resourceId2);
                        } else {
                            Resources resources2 = context.getResources();
                            Resources.Theme theme2 = context.getTheme();
                            try {
                                try {
                                    XmlResourceParser animation = resources2.getAnimation(resourceId2);
                                    try {
                                        animatorL = y90.l(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                        animation.close();
                                    } catch (IOException e) {
                                        e = e;
                                        Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException.initCause(e);
                                        throw notFoundException;
                                    } catch (XmlPullParserException e2) {
                                        e = e2;
                                        Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException2.initCause(e);
                                        throw notFoundException2;
                                    } catch (Throwable th) {
                                        th = th;
                                        xmlResourceParser = animation;
                                        if (xmlResourceParser != null) {
                                            xmlResourceParser.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (IOException e3) {
                                e = e3;
                            } catch (XmlPullParserException e4) {
                                e = e4;
                            }
                        }
                        animatorL.setTarget(s8Var.a.d.b.o.get(string));
                        if (s8Var.c == null) {
                            s8Var.c = new ArrayList();
                            s8Var.d = new xd(0);
                        }
                        s8Var.c.add(animatorL);
                        s8Var.d.put(animatorL, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
            i2 = 1;
        }
        if (s8Var.b == null) {
            s8Var.b = new AnimatorSet();
        }
        s8Var.b.playTogether(s8Var.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.c;
        return drawable != null ? drawable.isAutoMirrored() : this.d.a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.c;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.d.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.c;
        return drawable != null ? drawable.isStateful() : this.d.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.d.a.setBounds(rect);
        }
    }

    @Override // defpackage.hd1, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        Drawable drawable = this.c;
        return drawable != null ? drawable.setLevel(i2) : this.d.a.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.c;
        return drawable != null ? drawable.setState(iArr) : this.d.a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.d.a.setAlpha(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.d.a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d.a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setTint(i2);
        } else {
            this.d.a.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.d.a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.d.a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.d.a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.c;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        s8 s8Var = this.d;
        if (s8Var.b.isStarted()) {
            return;
        }
        s8Var.b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.c;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.d.b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws Throwable {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
