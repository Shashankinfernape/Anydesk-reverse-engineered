package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class q8 extends xu implements da1 {
    public n8 p;
    public boolean q;
    public n8 r;
    public ds s;
    public int t;
    public int u;
    public boolean v;

    public q8(n8 n8Var, Resources resources) {
        this.g = 255;
        this.i = -1;
        this.t = -1;
        this.u = -1;
        d(new n8(n8Var, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static q8 e(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        int depth;
        int next;
        int next2;
        Context context2 = context;
        Resources resources2 = resources;
        String name = xmlResourceParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        q8 q8Var = new q8(null, null);
        TypedArray typedArrayZ = hq.z(resources2, theme, attributeSet, pv0.a);
        int i = 1;
        q8Var.setVisible(typedArrayZ.getBoolean(1, true), true);
        n8 n8Var = q8Var.r;
        n8Var.d |= kn.b(typedArrayZ);
        int i2 = 2;
        n8Var.i = typedArrayZ.getBoolean(2, n8Var.i);
        int i3 = 3;
        n8Var.l = typedArrayZ.getBoolean(3, n8Var.l);
        n8Var.y = typedArrayZ.getInt(4, n8Var.y);
        n8Var.z = typedArrayZ.getInt(5, n8Var.z);
        boolean z = false;
        q8Var.setDither(typedArrayZ.getBoolean(0, n8Var.w));
        n8 n8Var2 = q8Var.c;
        if (resources2 != null) {
            n8Var2.b = resources2;
            int i4 = resources2.getDisplayMetrics().densityDpi;
            if (i4 == 0) {
                i4 = 160;
            }
            int i5 = n8Var2.c;
            n8Var2.c = i4;
            if (i5 != i4) {
                n8Var2.m = false;
                n8Var2.j = false;
            }
        } else {
            n8Var2.getClass();
        }
        typedArrayZ.recycle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next3 = xmlResourceParser.next();
            if (next3 == i || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i3)) {
                break;
            }
            if (next3 == i2 && depth <= depth2) {
                if (xmlResourceParser.getName().equals("item")) {
                    TypedArray typedArrayZ2 = hq.z(resources2, theme, attributeSet, pv0.b);
                    int resourceId = typedArrayZ2.getResourceId(z ? 1 : 0, z ? 1 : 0);
                    int resourceId2 = typedArrayZ2.getResourceId(i, -1);
                    Drawable drawableF = resourceId2 > 0 ? jy0.d().f(context2, resourceId2) : null;
                    typedArrayZ2.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i6 = 0;
                    for (int i7 = 0; i7 < attributeCount; i7++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i7);
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i8 = i6 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i7, z)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i6] = attributeNameResource;
                            i6 = i8;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i6);
                    if (drawableF == null) {
                        do {
                            next2 = xmlResourceParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("vector")) {
                            drawableF = new qd1();
                            drawableF.inflate(resources2, xmlResourceParser, attributeSet, theme);
                        } else {
                            drawableF = kn.a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (drawableF == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    n8 n8Var3 = q8Var.r;
                    int iA = n8Var3.a(drawableF);
                    n8Var3.H[iA] = iArrTrimStateSet;
                    n8Var3.J.e(iA, Integer.valueOf(resourceId));
                } else {
                    if (xmlResourceParser.getName().equals("transition")) {
                        TypedArray typedArrayZ3 = hq.z(resources2, theme, attributeSet, pv0.c);
                        int resourceId3 = typedArrayZ3.getResourceId(2, -1);
                        int resourceId4 = typedArrayZ3.getResourceId(1, -1);
                        int resourceId5 = typedArrayZ3.getResourceId(z ? 1 : 0, -1);
                        Drawable drawableF2 = resourceId5 > 0 ? jy0.d().f(context2, resourceId5) : null;
                        boolean z2 = typedArrayZ3.getBoolean(3, z);
                        typedArrayZ3.recycle();
                        if (drawableF2 == null) {
                            do {
                                next = xmlResourceParser.next();
                            } while (next == 4);
                            if (next != 2) {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                            if (xmlResourceParser.getName().equals("animated-vector")) {
                                drawableF2 = new u8(context2, z ? 1 : 0);
                                drawableF2.inflate(resources2, xmlResourceParser, attributeSet, theme);
                            } else {
                                drawableF2 = kn.a(resources, xmlResourceParser, attributeSet, theme);
                            }
                        }
                        if (drawableF2 == null) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (resourceId3 == -1 || resourceId4 == -1) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
                        }
                        n8 n8Var4 = q8Var.r;
                        int iA2 = n8Var4.a(drawableF2);
                        long j = resourceId3;
                        long j2 = resourceId4;
                        long j3 = (j << 32) | j2;
                        long j4 = z2 ? 8589934592L : 0L;
                        long j5 = iA2;
                        n8Var4.I.a(j3, Long.valueOf(j5 | j4));
                        if (z2) {
                            n8Var4.I.a((j2 << 32) | j, Long.valueOf(j5 | 4294967296L | j4));
                        }
                        context2 = context;
                        resources2 = resources;
                        i = 1;
                        z = false;
                    } else {
                        context2 = context;
                        resources2 = resources;
                    }
                    i2 = 2;
                    i3 = 3;
                }
                i = 1;
                i2 = 2;
                i3 = 3;
            }
        }
        q8Var.onStateChange(q8Var.getState());
        return q8Var;
    }

    @Override // defpackage.xu, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // defpackage.xu
    public final void d(n8 n8Var) {
        this.c = n8Var;
        int i = this.i;
        if (i >= 0) {
            Drawable drawableD = n8Var.d(i);
            this.e = drawableD;
            if (drawableD != null) {
                b(drawableD);
            }
        }
        this.f = null;
        this.p = n8Var;
        this.r = n8Var;
    }

    public final Drawable f() {
        if (!this.q) {
            super.mutate();
            n8 n8Var = this.p;
            n8Var.I = n8Var.I.clone();
            n8Var.J = n8Var.J.clone();
            this.q = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // defpackage.xu, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ds dsVar = this.s;
        if (dsVar != null) {
            dsVar.E();
            this.s = null;
            c(this.t);
            this.t = -1;
            this.u = -1;
        }
    }

    @Override // defpackage.xu, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.v) {
            f();
            n8 n8Var = this.r;
            n8Var.I = n8Var.I.clone();
            n8Var.J = n8Var.J.clone();
            this.v = true;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int i;
        ds m8Var;
        n8 n8Var = this.r;
        int iF = n8Var.f(iArr);
        if (iF < 0) {
            iF = n8Var.f(StateSet.WILD_CARD);
        }
        boolean z = false;
        z = false;
        if (iF != this.i) {
            ds dsVar = this.s;
            int i2 = 1;
            if (dsVar != null) {
                if (iF != this.t) {
                    if (iF == this.u && dsVar.c()) {
                        dsVar.B();
                        this.t = this.u;
                        this.u = iF;
                    } else {
                        i = this.t;
                        dsVar.E();
                    }
                }
                z = true;
            } else {
                i = this.i;
            }
            this.s = null;
            this.u = -1;
            this.t = -1;
            n8 n8Var2 = this.r;
            int iE = n8Var2.e(i);
            int iE2 = n8Var2.e(iF);
            if (iE2 != 0 && iE != 0) {
                long j = ((long) iE2) | (((long) iE) << 32);
                int iLongValue = (int) ((Long) n8Var2.I.e(j)).longValue();
                if (iLongValue >= 0) {
                    boolean z2 = (((Long) n8Var2.I.e(j)).longValue() & 8589934592L) != 0;
                    c(iLongValue);
                    Drawable drawable = this.e;
                    if (drawable instanceof AnimationDrawable) {
                        m8Var = new o8((AnimationDrawable) drawable, (((Long) n8Var2.I.e(j)).longValue() & 4294967296L) != 0, z2);
                    } else if (drawable instanceof u8) {
                        m8Var = new m8((u8) drawable, i2);
                    } else if (drawable instanceof Animatable) {
                        m8Var = new m8((Animatable) drawable, z ? 1 : 0);
                    } else if (c(iF)) {
                        z = true;
                    }
                    m8Var.D();
                    this.s = m8Var;
                    this.u = i;
                    this.t = iF;
                    z = true;
                } else if (c(iF)) {
                    z = true;
                }
            } else if (c(iF)) {
                z = true;
            }
        }
        Drawable drawable2 = this.e;
        return drawable2 != null ? (drawable2.setState(iArr) ? 1 : 0) | z : z;
    }

    @Override // defpackage.xu, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        ds dsVar = this.s;
        if (dsVar != null && (visible || z2)) {
            if (z) {
                dsVar.D();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }
}
