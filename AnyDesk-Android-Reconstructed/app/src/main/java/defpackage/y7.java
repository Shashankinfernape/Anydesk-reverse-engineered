package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.MenuItem;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.jni.JniAdExt;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class y7 implements ot, wu0 {
    public int c;
    public final Object d;
    public final Object e;

    public y7() {
        this.d = new l10();
        this.e = new xm0();
        this.c = -1;
    }

    public static y7 b(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        float f2;
        Shader.TileMode tileMode;
        Shader radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i);
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
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = bn.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new y7((Shader) null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayZ = hq.z(resources, theme, attributeSetAsAttributeSet, sv0.e);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayZ.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayZ.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayZ.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayZ.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayZ.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayZ.getFloat(4, 0.0f) : 0.0f;
        int i2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayZ.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayZ.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayZ.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayZ.getColor(1, 0) : 0;
        int i3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayZ.getInt(6, 0) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayZ.getFloat(5, 0.0f) : 0.0f;
        typedArrayZ.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f5;
            if (next2 == 1) {
                f2 = f6;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f6;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayZ2 = hq.z(resources, theme, attributeSetAsAttributeSet, sv0.f);
                boolean zHasValue = typedArrayZ2.hasValue(0);
                boolean zHasValue2 = typedArrayZ2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayZ2.getColor(0, 0);
                float f11 = typedArrayZ2.getFloat(1, 0.0f);
                typedArrayZ2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            f5 = f;
            f6 = f2;
        }
        bc bcVar = arrayList2.size() > 0 ? new bc(arrayList2, arrayList) : null;
        if (bcVar == null) {
            bcVar = z ? new bc(color, color2, color3) : new bc(color, color3);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                int[] iArr = (int[]) bcVar.d;
                float[] fArr = (float[]) bcVar.e;
                if (i3 != 1) {
                    tileMode2 = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f3, f4, f, f2, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f7, f8, (int[]) bcVar.d, (float[]) bcVar.e);
            }
        } else {
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = (int[]) bcVar.d;
            float[] fArr2 = (float[]) bcVar.e;
            if (i3 != 1) {
                tileMode = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f7, f8, f10, iArr2, fArr2, tileMode);
        }
        return new y7(radialGradient, (ColorStateList) null, 0);
    }

    public static y7 c(ByteBuffer byteBuffer) throws a8 {
        if (byteBuffer.remaining() < 8) {
            byteBuffer.position(byteBuffer.limit());
            return null;
        }
        int iPosition = byteBuffer.position();
        int i = byteBuffer.getShort() & 65535;
        int i2 = 65535 & byteBuffer.getShort();
        long j = ((long) byteBuffer.getInt()) & 4294967295L;
        if (j - 8 > byteBuffer.remaining()) {
            byteBuffer.position(byteBuffer.limit());
            return null;
        }
        if (i2 < 8) {
            throw new a8(q51.k(i2, "Malformed chunk: header too short: ", " bytes"));
        }
        if (i2 <= j) {
            int i3 = i2 + iPosition;
            long j2 = ((long) iPosition) + j;
            y7 y7Var = new y7(i, b8.f(iPosition, i3, byteBuffer), b8.g(byteBuffer, i3, j2));
            byteBuffer.position((int) j2);
            return y7Var;
        }
        throw new a8("Malformed chunk: header too long: " + i2 + " bytes. Chunk size: " + j + " bytes");
    }

    @Override // defpackage.ot
    public void a(boolean z) {
        MainActivity mainActivity;
        if (z && (mainActivity = ((MainApplication) this.e).f0) != null) {
            mainActivity.q0(this.c, (v11) this.d);
        }
    }

    public ByteBuffer d() {
        ByteBuffer byteBuffer = (ByteBuffer) this.e;
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.order(byteBuffer.order());
        return byteBufferSlice;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable e(sq sqVar) {
        j10 j10Var;
        xm0 xm0Var;
        y7 y7Var;
        if (sqVar instanceof j10) {
            j10Var = (j10) sqVar;
            int i = j10Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                j10Var.j = i - Integer.MIN_VALUE;
            } else {
                j10Var = new j10(this, sqVar);
            }
        } else {
            j10Var = new j10(this, sqVar);
        }
        Object obj = j10Var.h;
        int i2 = j10Var.j;
        if (i2 == 0) {
            y90.V(obj);
            xm0Var = (xm0) this.e;
            j10Var.f = this;
            j10Var.g = xm0Var;
            j10Var.j = 1;
            Object objD = xm0Var.d(j10Var);
            lr lrVar = lr.c;
            if (objD == lrVar) {
                return lrVar;
            }
            y7Var = this;
        } else {
            if (i2 != 1) {
                nh0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xm0Var = j10Var.g;
            y7Var = j10Var.f;
            y90.V(obj);
        }
        try {
            List listB = ((l10) y7Var.d).b();
            int size = (y7Var.c - listB.size()) + 1;
            ArrayList arrayList = new ArrayList(vm.c0(listB, 10));
            int i3 = 0;
            for (Object obj2 : listB) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    um.b0();
                    throw null;
                }
                arrayList.add(new d90(i3 + size, (wr0) obj2));
                i3 = i4;
            }
            xm0Var.f(null);
            return arrayList;
        } catch (Throwable th) {
            xm0Var.f(null);
            throw th;
        }
    }

    public boolean f() {
        ColorStateList colorStateList;
        return ((Shader) this.d) == null && (colorStateList = (ColorStateList) this.e) != null && colorStateList.isStateful();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(d90 d90Var, sq sqVar) {
        k10 k10Var;
        xm0 xm0Var;
        y7 y7Var;
        if (sqVar instanceof k10) {
            k10Var = (k10) sqVar;
            int i = k10Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                k10Var.k = i - Integer.MIN_VALUE;
            } else {
                k10Var = new k10(this, sqVar);
            }
        } else {
            k10Var = new k10(this, sqVar);
        }
        Object obj = k10Var.i;
        int i2 = k10Var.k;
        if (i2 == 0) {
            y90.V(obj);
            xm0Var = (xm0) this.e;
            k10Var.f = this;
            k10Var.g = d90Var;
            k10Var.h = xm0Var;
            k10Var.k = 1;
            Object objD = xm0Var.d(k10Var);
            lr lrVar = lr.c;
            if (objD == lrVar) {
                return lrVar;
            }
            y7Var = this;
        } else {
            if (i2 != 1) {
                nh0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xm0 xm0Var2 = k10Var.h;
            d90 d90Var2 = k10Var.g;
            y7Var = k10Var.f;
            y90.V(obj);
            xm0Var = xm0Var2;
            d90Var = d90Var2;
        }
        try {
            y7Var.c = d90Var.a;
            ((l10) y7Var.d).a((wr0) d90Var.b);
            return uc1.a;
        } finally {
            xm0Var.f(null);
        }
    }

    @Override // defpackage.wu0
    public boolean onMenuItemClick(MenuItem menuItem) {
        int i = this.c;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.motd_open) {
            ((dj) this.e).j(i, (String) this.d);
            return true;
        }
        if (itemId != R.id.motd_remove) {
            return false;
        }
        JniAdExt.d4(i, 3);
        return true;
    }

    public y7(Shader shader, ColorStateList colorStateList, int i) {
        this.d = shader;
        this.e = colorStateList;
        this.c = i;
    }

    public /* synthetic */ y7(Object obj, int i, Object obj2) {
        this.e = obj;
        this.c = i;
        this.d = obj2;
    }

    public y7(int i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        this.c = i;
        this.d = byteBuffer;
        this.e = byteBuffer2;
    }
}
