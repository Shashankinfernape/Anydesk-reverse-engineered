package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.anydesk.anydeskandroid.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class jy0 {
    public static jy0 i;
    public WeakHashMap a;
    public i51 b;
    public x51 c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue e;
    public boolean f;
    public sb g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final hy0 j = new hy0(6);

    public static synchronized jy0 d() {
        try {
            if (i == null) {
                jy0 jy0Var = new jy0();
                i = jy0Var;
                j(jy0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        hy0 hy0Var = j;
        hy0Var.getClass();
        int i3 = (31 + i2) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) hy0Var.f(Integer.valueOf(mode.hashCode() + i3));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
        }
        return porterDuffColorFilter;
    }

    public static void j(jy0 jy0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            jy0Var.a("vector", new iy0(3));
            jy0Var.a("animated-vector", new iy0(2));
            jy0Var.a("animated-selector", new iy0(1));
            jy0Var.a("drawable", new iy0(0));
        }
    }

    public final void a(String str, iy0 iy0Var) {
        if (this.b == null) {
            this.b = new i51(0);
        }
        this.b.put(str, iy0Var);
    }

    public final synchronized void b(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                xh0 xh0Var = (xh0) this.d.get(context);
                if (xh0Var == null) {
                    xh0Var = new xh0();
                    this.d.put(context, xh0Var);
                }
                xh0Var.g(new WeakReference(constantState), j2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i2) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(context, j2);
        if (drawableE != null) {
            return drawableE;
        }
        LayerDrawable layerDrawableC = null;
        if (this.g != null) {
            if (i2 == R.drawable.abc_cab_background_top_material) {
                layerDrawableC = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i2 == R.drawable.abc_ratingbar_material) {
                layerDrawableC = sb.c(this, context, R.dimen.abc_star_big);
            } else if (i2 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableC = sb.c(this, context, R.dimen.abc_star_medium);
            } else if (i2 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableC = sb.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableC != null) {
            layerDrawableC.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j2, layerDrawableC);
        }
        return layerDrawableC;
    }

    public final synchronized Drawable e(Context context, long j2) {
        xh0 xh0Var = (xh0) this.d.get(context);
        if (xh0Var == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) xh0Var.d(j2);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iG = y90.g(xh0Var.d, xh0Var.f, j2);
            if (iG >= 0) {
                Object[] objArr = xh0Var.e;
                Object obj = objArr[iG];
                Object obj2 = y90.d;
                if (obj != obj2) {
                    objArr[iG] = obj2;
                    xh0Var.c = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i2) {
        return g(context, i2, false);
    }

    public final synchronized Drawable g(Context context, int i2, boolean z) {
        Drawable drawableK;
        try {
            if (!this.f) {
                this.f = true;
                Drawable drawableF = f(context, R.drawable.abc_vector_test);
                if (drawableF == null || (!(drawableF instanceof qd1) && !"android.graphics.drawable.VectorDrawable".equals(drawableF.getClass().getName()))) {
                    this.f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableK = k(context, i2);
            if (drawableK == null) {
                drawableK = c(context, i2);
            }
            if (drawableK == null) {
                drawableK = context.getDrawable(i2);
            }
            if (drawableK != null) {
                drawableK = n(context, i2, z, drawableK);
            }
            if (drawableK != null) {
                av.a(drawableK);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableK;
    }

    public final synchronized ColorStateList i(Context context, int i2) {
        ColorStateList colorStateList;
        x51 x51Var;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListD = null;
        colorStateList = (weakHashMap == null || (x51Var = (x51) weakHashMap.get(context)) == null) ? null : (ColorStateList) x51Var.c(i2);
        if (colorStateList == null) {
            sb sbVar = this.g;
            if (sbVar != null) {
                colorStateListD = sbVar.d(context, i2);
            }
            if (colorStateListD != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                x51 x51Var2 = (x51) this.a.get(context);
                if (x51Var2 == null) {
                    x51Var2 = new x51(0);
                    this.a.put(context, x51Var2);
                }
                x51Var2.a(i2, colorStateListD);
            }
            colorStateList = colorStateListD;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i2) {
        int next;
        i51 i51Var = this.b;
        if (i51Var == null || i51Var.isEmpty()) {
            return null;
        }
        x51 x51Var = this.c;
        if (x51Var != null) {
            String str = (String) x51Var.c(i2);
            if ("appcompat_skip_skip".equals(str)) {
                return null;
            }
            if (str != null && this.b.get(str) == null) {
                return null;
            }
        } else {
            this.c = new x51(0);
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(context, j2);
        if (drawableE != null) {
            return drawableE;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.c.a(i2, name);
                iy0 iy0Var = (iy0) this.b.get(name);
                if (iy0Var != null) {
                    drawableE = iy0Var.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableE != null) {
                    drawableE.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j2, drawableE);
                }
            } catch (Exception e) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
            }
        }
        if (drawableE == null) {
            this.c.a(i2, "appcompat_skip_skip");
        }
        return drawableE;
    }

    public final synchronized void l(Context context) {
        xh0 xh0Var = (xh0) this.d.get(context);
        if (xh0Var != null) {
            xh0Var.b();
        }
    }

    public final synchronized void m(sb sbVar) {
        this.g = sbVar;
    }

    public final Drawable n(Context context, int i2, boolean z, Drawable drawable) {
        int iRound;
        boolean z2;
        ColorStateList colorStateListI = i(context, i2);
        PorterDuff.Mode mode = null;
        if (colorStateListI != null) {
            Drawable drawableK = uj.K(drawable.mutate());
            drawableK.setTintList(colorStateListI);
            if (this.g != null && i2 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableK.setTintMode(mode);
            }
            return drawableK;
        }
        sb sbVar = this.g;
        int i3 = R.attr.colorControlNormal;
        if (sbVar != null) {
            if (i2 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = w91.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = tb.b;
                sb.e(drawableFindDrawableByLayerId, iC, mode2);
                sb.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), w91.c(context, R.attr.colorControlNormal), mode2);
                sb.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), w91.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i2 == R.drawable.abc_ratingbar_material || i2 == R.drawable.abc_ratingbar_indicator_material || i2 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = w91.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = tb.b;
                sb.e(drawableFindDrawableByLayerId2, iB, mode3);
                sb.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), w91.c(context, R.attr.colorControlActivated), mode3);
                sb.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), w91.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        sb sbVar2 = this.g;
        boolean z3 = false;
        if (sbVar2 != null) {
            PorterDuff.Mode mode4 = tb.b;
            if (sb.a((int[]) sbVar2.a, i2)) {
                iRound = -1;
                z2 = true;
            } else if (sb.a((int[]) sbVar2.c, i2)) {
                iRound = -1;
                z2 = true;
                i3 = R.attr.colorControlActivated;
            } else {
                boolean zA = sb.a((int[]) sbVar2.d, i2);
                i3 = android.R.attr.colorBackground;
                if (zA) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i2 == R.drawable.abc_list_divider_mtrl_alpha) {
                    iRound = Math.round(40.8f);
                    i3 = android.R.attr.colorForeground;
                    z2 = true;
                } else if (i2 != R.drawable.abc_dialog_material_background) {
                    iRound = -1;
                    z2 = false;
                    i3 = 0;
                }
                iRound = -1;
                z2 = true;
            }
            if (z2) {
                Drawable drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(tb.c(w91.c(context, i3), mode4));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                z3 = true;
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }
}
