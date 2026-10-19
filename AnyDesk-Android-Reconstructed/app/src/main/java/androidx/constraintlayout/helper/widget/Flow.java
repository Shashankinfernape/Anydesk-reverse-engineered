package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.bq;
import defpackage.hg;
import defpackage.rv0;
import defpackage.u10;
import defpackage.wf1;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends wf1 {
    public u10 l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new int[32];
        this.i = new HashMap();
        this.e = context;
        g(attributeSet);
    }

    @Override // defpackage.wf1, defpackage.pp
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        u10 u10Var = new u10();
        u10Var.s0 = 0;
        u10Var.t0 = 0;
        u10Var.u0 = 0;
        u10Var.v0 = 0;
        u10Var.w0 = 0;
        u10Var.x0 = 0;
        u10Var.y0 = false;
        u10Var.z0 = 0;
        u10Var.A0 = 0;
        u10Var.B0 = new hg();
        u10Var.C0 = null;
        u10Var.D0 = -1;
        u10Var.E0 = -1;
        u10Var.F0 = -1;
        u10Var.G0 = -1;
        u10Var.H0 = -1;
        u10Var.I0 = -1;
        u10Var.J0 = 0.5f;
        u10Var.K0 = 0.5f;
        u10Var.L0 = 0.5f;
        u10Var.M0 = 0.5f;
        u10Var.N0 = 0.5f;
        u10Var.O0 = 0.5f;
        u10Var.P0 = 0;
        u10Var.Q0 = 0;
        u10Var.R0 = 2;
        u10Var.S0 = 2;
        u10Var.T0 = 0;
        u10Var.U0 = -1;
        u10Var.V0 = 0;
        u10Var.W0 = new ArrayList();
        u10Var.X0 = null;
        u10Var.Y0 = null;
        u10Var.Z0 = null;
        u10Var.b1 = 0;
        this.l = u10Var;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, rv0.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.l.V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    u10 u10Var2 = this.l;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    u10Var2.s0 = dimensionPixelSize;
                    u10Var2.t0 = dimensionPixelSize;
                    u10Var2.u0 = dimensionPixelSize;
                    u10Var2.v0 = dimensionPixelSize;
                } else if (index == 18) {
                    u10 u10Var3 = this.l;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    u10Var3.u0 = dimensionPixelSize2;
                    u10Var3.w0 = dimensionPixelSize2;
                    u10Var3.x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.l.v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.l.w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.l.s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.l.x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.l.t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.l.T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.l.D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.l.E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.l.F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.l.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.l.G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.l.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.l.J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.l.L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.l.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.l.M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.l.O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.l.K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.l.R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.l.S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.l.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.l.Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.l.U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f = this.l;
        i();
    }

    @Override // defpackage.pp
    public final void h(bq bqVar, boolean z) {
        u10 u10Var = this.l;
        int i = u10Var.u0;
        if (i > 0 || u10Var.v0 > 0) {
            if (z) {
                u10Var.w0 = u10Var.v0;
                u10Var.x0 = i;
            } else {
                u10Var.w0 = i;
                u10Var.x0 = u10Var.v0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:222:0x03d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:223:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:224:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:227:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:229:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:234:0x0402  */
    /* JADX WARN: Code duplicated, block: B:238:0x040a  */
    /* JADX WARN: Code duplicated, block: B:241:0x0411  */
    /* JADX WARN: Code duplicated, block: B:243:0x0414  */
    /* JADX WARN: Code duplicated, block: B:245:0x041a  */
    /* JADX WARN: Code duplicated, block: B:249:0x0421  */
    /* JADX WARN: Code duplicated, block: B:254:0x0430  */
    /* JADX WARN: Code duplicated, block: B:256:0x0436  */
    /* JADX WARN: Code duplicated, block: B:259:0x0444  */
    /* JADX WARN: Code duplicated, block: B:261:0x044a  */
    /* JADX WARN: Code duplicated, block: B:266:0x0458  */
    /* JADX WARN: Code duplicated, block: B:268:0x045e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:269:0x0460  */
    /* JADX WARN: Code duplicated, block: B:274:0x0470  */
    /* JADX WARN: Code duplicated, block: B:276:0x0476 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:277:0x0478  */
    /* JADX WARN: Code duplicated, block: B:286:0x0497 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:448:0x0495 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:451:0x049d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:0x03d2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x044e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:467:0x0469 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:0x0481 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:282:0x048d -> B:219:0x03d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:283:0x048f -> B:219:0x03d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:285:0x0495 -> B:219:0x03d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:286:0x0497 -> B:219:0x03d2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.wf1
    public final void j(defpackage.u10 r39, int r40, int r41) {
        /*
            Method dump skipped, instruction units count: 1883
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.j(u10, int, int):void");
    }

    @Override // defpackage.pp, android.view.View
    public final void onMeasure(int i, int i2) {
        j(this.l, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.l.L0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.l.F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.l.M0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.l.G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.l.R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.l.J0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.l.P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.l.D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.l.N0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.l.H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.l.O0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.l.I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.l.U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.l.V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        u10 u10Var = this.l;
        u10Var.s0 = i;
        u10Var.t0 = i;
        u10Var.u0 = i;
        u10Var.v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.l.t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.l.w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.l.x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.l.s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.l.S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.l.K0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.l.Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.l.E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.l.T0 = i;
        requestLayout();
    }

    public Flow(Context context) {
        super(context);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new int[32];
        this.i = new HashMap();
        this.e = context;
        g(attributeSet);
    }
}
