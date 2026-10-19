package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class qd1 extends hd1 {
    public static final PorterDuff.Mode l = PorterDuff.Mode.SRC_IN;
    public od1 d;
    public PorterDuffColorFilter e;
    public ColorFilter f;
    public boolean g;
    public boolean h;
    public final float[] i;
    public final Matrix j;
    public final Rect k;

    public qd1() {
        this.h = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        od1 od1Var = new od1();
        od1Var.c = null;
        od1Var.d = l;
        od1Var.b = new nd1();
        this.d = od1Var;
    }

    public static qd1 a(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            qd1 qd1Var = new qd1();
            ThreadLocal threadLocal = my0.a;
            qd1Var.c = resources.getDrawable(i, theme);
            new pd1(qd1Var.c.getConstantState());
            return qd1Var;
        }
        try {
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
            qd1 qd1Var2 = new qd1();
            qd1Var2.inflate(resources, xml, attributeSetAsAttributeSet, theme);
            return qd1Var2;
        } catch (IOException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.c;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.k;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f;
        if (colorFilter == null) {
            colorFilter = this.e;
        }
        Matrix matrix = this.j;
        canvas.getMatrix(matrix);
        float[] fArr = this.i;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && uj.o(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        od1 od1Var = this.d;
        Bitmap bitmap = od1Var.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != od1Var.f.getHeight()) {
            od1Var.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            od1Var.k = true;
        }
        boolean z = this.h;
        od1 od1Var2 = this.d;
        if (!z) {
            od1Var2.f.eraseColor(0);
            Canvas canvas2 = new Canvas(od1Var2.f);
            nd1 nd1Var = od1Var2.b;
            nd1Var.a(nd1Var.g, nd1.p, canvas2, iMin, iMin2);
        } else if (od1Var2.k || od1Var2.g != od1Var2.c || od1Var2.h != od1Var2.d || od1Var2.j != od1Var2.e || od1Var2.i != od1Var2.b.getRootAlpha()) {
            od1 od1Var3 = this.d;
            od1Var3.f.eraseColor(0);
            Canvas canvas3 = new Canvas(od1Var3.f);
            nd1 nd1Var2 = od1Var3.b;
            nd1Var2.a(nd1Var2.g, nd1.p, canvas3, iMin, iMin2);
            od1 od1Var4 = this.d;
            od1Var4.g = od1Var4.c;
            od1Var4.h = od1Var4.d;
            od1Var4.i = od1Var4.b.getRootAlpha();
            od1Var4.j = od1Var4.e;
            od1Var4.k = false;
        }
        od1 od1Var5 = this.d;
        if (od1Var5.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (od1Var5.l == null) {
                Paint paint2 = new Paint();
                od1Var5.l = paint2;
                paint2.setFilterBitmap(true);
            }
            od1Var5.l.setAlpha(od1Var5.b.getRootAlpha());
            od1Var5.l.setColorFilter(colorFilter);
            paint = od1Var5.l;
        }
        canvas.drawBitmap(od1Var5.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.c;
        return drawable != null ? drawable.getAlpha() : this.d.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.c;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.c;
        return drawable != null ? drawable.getColorFilter() : this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.c != null && Build.VERSION.SDK_INT >= 24) {
            return new pd1(this.c.getConstantState());
        }
        this.d.a = getChangingConfigurations();
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.c;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.d.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.c;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.d.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        od1 od1Var = this.d;
        od1Var.b = new nd1();
        TypedArray typedArrayZ = hq.z(resources, theme, attributeSet, hq.c);
        od1 od1Var2 = this.d;
        nd1 nd1Var = od1Var2.b;
        int i2 = !hq.x(xmlPullParser, "tintMode") ? -1 : typedArrayZ.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i2 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i2 != 5) {
            if (i2 != 9) {
                switch (i2) {
                    case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        od1Var2.d = mode;
        ColorStateList colorStateListA = null;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayZ.getValue(1, typedValue);
            int i3 = typedValue.type;
            if (i3 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i3 < 28 || i3 > 31) {
                Resources resources2 = typedArrayZ.getResources();
                int resourceId = typedArrayZ.getResourceId(1, 0);
                ThreadLocal threadLocal = bn.a;
                try {
                    colorStateListA = bn.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            } else {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            od1Var2.c = colorStateList;
        }
        boolean z = od1Var2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayZ.getBoolean(5, z);
        }
        od1Var2.e = z;
        float f = nd1Var.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayZ.getFloat(7, f);
        }
        nd1Var.j = f;
        float f2 = nd1Var.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayZ.getFloat(8, f2);
        }
        nd1Var.k = f2;
        if (nd1Var.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayZ.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayZ.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        nd1Var.h = typedArrayZ.getDimension(3, nd1Var.h);
        float dimension = typedArrayZ.getDimension(2, nd1Var.i);
        nd1Var.i = dimension;
        if (nd1Var.h <= 0.0f) {
            throw new XmlPullParserException(typedArrayZ.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayZ.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = nd1Var.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = typedArrayZ.getFloat(4, alpha);
        }
        nd1Var.setAlpha(alpha);
        String string = typedArrayZ.getString(0);
        if (string != null) {
            nd1Var.m = string;
            nd1Var.o.put(string, nd1Var);
        }
        typedArrayZ.recycle();
        od1Var.a = getChangingConfigurations();
        od1Var.k = true;
        od1 od1Var3 = this.d;
        nd1 nd1Var2 = od1Var3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        kd1 kd1Var = nd1Var2.g;
        xd xdVar = nd1Var2.o;
        arrayDeque.push(kd1Var);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        for (int i4 = 1; eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != 3); i4 = 1) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                kd1 kd1Var2 = (kd1) arrayDeque.peek();
                i = depth;
                if ("path".equals(name)) {
                    jd1 jd1Var = new jd1();
                    jd1Var.e = 0.0f;
                    jd1Var.g = 1.0f;
                    jd1Var.h = 1.0f;
                    jd1Var.i = 0.0f;
                    jd1Var.j = 1.0f;
                    jd1Var.k = 0.0f;
                    Paint.Cap cap2 = Paint.Cap.BUTT;
                    jd1Var.l = cap2;
                    Paint.Join join2 = Paint.Join.MITER;
                    jd1Var.m = join2;
                    jd1Var.n = 4.0f;
                    TypedArray typedArrayZ2 = hq.z(resources, theme, attributeSet, hq.e);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = typedArrayZ2.getString(0);
                        if (string2 != null) {
                            jd1Var.b = string2;
                        }
                        String string3 = typedArrayZ2.getString(2);
                        if (string3 != null) {
                            jd1Var.a = uj.i(string3);
                        }
                        jd1Var.f = hq.s(typedArrayZ2, xmlPullParser, theme, "fillColor", 1);
                        float f3 = jd1Var.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f3 = typedArrayZ2.getFloat(12, f3);
                        }
                        jd1Var.h = f3;
                        int i5 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayZ2.getInt(8, -1) : -1;
                        Paint.Cap cap3 = jd1Var.l;
                        if (i5 == 0) {
                            cap = cap2;
                        } else if (i5 != 1) {
                            cap = i5 != 2 ? cap3 : Paint.Cap.SQUARE;
                        } else {
                            cap = Paint.Cap.ROUND;
                        }
                        jd1Var.l = cap;
                        int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayZ2.getInt(9, -1) : -1;
                        Paint.Join join3 = jd1Var.m;
                        if (i6 == 0) {
                            join = join2;
                        } else if (i6 != 1) {
                            join = i6 != 2 ? join3 : Paint.Join.BEVEL;
                        } else {
                            join = Paint.Join.ROUND;
                        }
                        jd1Var.m = join;
                        float f4 = jd1Var.n;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f4 = typedArrayZ2.getFloat(10, f4);
                        }
                        jd1Var.n = f4;
                        jd1Var.d = hq.s(typedArrayZ2, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = jd1Var.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f5 = typedArrayZ2.getFloat(11, f5);
                        }
                        jd1Var.g = f5;
                        float f6 = jd1Var.e;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f6 = typedArrayZ2.getFloat(4, f6);
                        }
                        jd1Var.e = f6;
                        float f7 = jd1Var.j;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f7 = typedArrayZ2.getFloat(6, f7);
                        }
                        jd1Var.j = f7;
                        float f8 = jd1Var.k;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f8 = typedArrayZ2.getFloat(7, f8);
                        }
                        jd1Var.k = f8;
                        float f9 = jd1Var.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f9 = typedArrayZ2.getFloat(5, f9);
                        }
                        jd1Var.i = f9;
                        int i7 = jd1Var.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i7 = typedArrayZ2.getInt(13, i7);
                        }
                        jd1Var.c = i7;
                    }
                    typedArrayZ2.recycle();
                    kd1Var2.b.add(jd1Var);
                    if (jd1Var.getPathName() != null) {
                        xdVar.put(jd1Var.getPathName(), jd1Var);
                    }
                    od1Var3.a = od1Var3.a;
                    z2 = false;
                } else if ("clip-path".equals(name)) {
                    id1 id1Var = new id1();
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        TypedArray typedArrayZ3 = hq.z(resources, theme, attributeSet, hq.f);
                        String string4 = typedArrayZ3.getString(0);
                        if (string4 != null) {
                            id1Var.b = string4;
                        }
                        String string5 = typedArrayZ3.getString(1);
                        if (string5 != null) {
                            id1Var.a = uj.i(string5);
                        }
                        id1Var.c = !hq.x(xmlPullParser, "fillType") ? 0 : typedArrayZ3.getInt(2, 0);
                        typedArrayZ3.recycle();
                    }
                    kd1Var2.b.add(id1Var);
                    if (id1Var.getPathName() != null) {
                        xdVar.put(id1Var.getPathName(), id1Var);
                    }
                    od1Var3.a = od1Var3.a;
                } else if ("group".equals(name)) {
                    kd1 kd1Var3 = new kd1();
                    TypedArray typedArrayZ4 = hq.z(resources, theme, attributeSet, hq.d);
                    float f10 = kd1Var3.c;
                    if (hq.x(xmlPullParser, "rotation")) {
                        f10 = typedArrayZ4.getFloat(5, f10);
                    }
                    kd1Var3.c = f10;
                    kd1Var3.d = typedArrayZ4.getFloat(1, kd1Var3.d);
                    kd1Var3.e = typedArrayZ4.getFloat(2, kd1Var3.e);
                    float f11 = kd1Var3.f;
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                        f11 = typedArrayZ4.getFloat(3, f11);
                    }
                    kd1Var3.f = f11;
                    float f12 = kd1Var3.g;
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                        f12 = typedArrayZ4.getFloat(4, f12);
                    }
                    kd1Var3.g = f12;
                    float f13 = kd1Var3.h;
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                        f13 = typedArrayZ4.getFloat(6, f13);
                    }
                    kd1Var3.h = f13;
                    float f14 = kd1Var3.i;
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                        f14 = typedArrayZ4.getFloat(7, f14);
                    }
                    kd1Var3.i = f14;
                    String string6 = typedArrayZ4.getString(0);
                    if (string6 != null) {
                        kd1Var3.k = string6;
                    }
                    kd1Var3.c();
                    typedArrayZ4.recycle();
                    kd1Var2.b.add(kd1Var3);
                    arrayDeque.push(kd1Var3);
                    if (kd1Var3.getGroupName() != null) {
                        xdVar.put(kd1Var3.getGroupName(), kd1Var3);
                    }
                    od1Var3.a = od1Var3.a;
                }
            } else {
                i = depth;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            depth = i;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.e = b(od1Var.c, od1Var.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.c;
        return drawable != null ? drawable.isAutoMirrored() : this.d.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        od1 od1Var = this.d;
        if (od1Var == null) {
            return false;
        }
        nd1 nd1Var = od1Var.b;
        if (nd1Var.n == null) {
            nd1Var.n = Boolean.valueOf(nd1Var.g.a());
        }
        if (nd1Var.n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.d.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.g && super.mutate() == this) {
            od1 od1Var = this.d;
            od1 od1Var2 = new od1();
            od1Var2.c = null;
            od1Var2.d = l;
            if (od1Var != null) {
                od1Var2.a = od1Var.a;
                nd1 nd1Var = new nd1(od1Var.b);
                od1Var2.b = nd1Var;
                if (od1Var.b.e != null) {
                    nd1Var.e = new Paint(od1Var.b.e);
                }
                if (od1Var.b.d != null) {
                    od1Var2.b.d = new Paint(od1Var.b.d);
                }
                od1Var2.c = od1Var.c;
                od1Var2.d = od1Var.d;
                od1Var2.e = od1Var.e;
            }
            this.d = od1Var2;
            this.g = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        od1 od1Var = this.d;
        ColorStateList colorStateList = od1Var.c;
        if (colorStateList == null || (mode = od1Var.d) == null) {
            z = false;
        } else {
            this.e = b(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        nd1 nd1Var = od1Var.b;
        if (nd1Var.n == null) {
            nd1Var.n = Boolean.valueOf(nd1Var.g.a());
        }
        if (nd1Var.n.booleanValue()) {
            boolean zB = od1Var.b.g.b(iArr);
            od1Var.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.d.b.getRootAlpha() != i) {
            this.d.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.d.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        od1 od1Var = this.d;
        if (od1Var.c != colorStateList) {
            od1Var.c = colorStateList;
            this.e = b(colorStateList, od1Var.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        od1 od1Var = this.d;
        if (od1Var.d != mode) {
            od1Var.d = mode;
            this.e = b(od1Var.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.c;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public qd1(od1 od1Var) {
        this.h = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.d = od1Var;
        this.e = b(od1Var.c, od1Var.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
