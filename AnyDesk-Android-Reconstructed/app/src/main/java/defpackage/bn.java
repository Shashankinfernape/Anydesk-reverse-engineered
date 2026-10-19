package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.anydesk.anydeskandroid.R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class bn {
    public static final ThreadLocal a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int iY;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i = 0;
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == r4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr2 = sv0.a;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, i, i);
                int resourceId = typedArrayObtainAttributes.getResourceId(i, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, (boolean) r4);
                    int i3 = typedValue.type;
                    if (i3 < 28 || i3 > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = typedArrayObtainAttributes.getColor(i, -65281);
                        }
                    } else {
                        color = typedArrayObtainAttributes.getColor(i, -65281);
                    }
                } else {
                    color = typedArrayObtainAttributes.getColor(i, -65281);
                }
                float f = typedArrayObtainAttributes.hasValue(r4) ? typedArrayObtainAttributes.getFloat(r4, 1.0f) : typedArrayObtainAttributes.hasValue(3) ? typedArrayObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                float f2 = (Build.VERSION.SDK_INT < 31 || !typedArrayObtainAttributes.hasValue(2)) ? typedArrayObtainAttributes.getFloat(4, -1.0f) : typedArrayObtainAttributes.getFloat(2, -1.0f);
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i4 = 0;
                for (int i5 = 0; i5 < attributeCount; i5++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i5);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i6 = i4 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i5, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i4] = attributeNameResource;
                        i4 = i6;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i4);
                boolean z = f2 >= 0.0f && f2 <= 100.0f;
                if (f != 1.0f || z) {
                    int iF = uj.f((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                    if (z) {
                        ri riVarA = ri.a(color);
                        float f3 = riVarA.a;
                        float f4 = riVarA.b;
                        sf1 sf1Var = sf1.k;
                        if (f4 >= 1.0d && Math.round(f2) > 0.0d && Math.round(f2) < 100.0d) {
                            float fMin = f3 < 0.0f ? 0.0f : Math.min(360.0f, f3);
                            float f5 = f4;
                            ri riVar = null;
                            boolean z2 = true;
                            float f6 = 0.0f;
                            while (true) {
                                if (Math.abs(f6 - f4) < 0.4f) {
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                    if (riVar != null) {
                                        iY = riVar.c(sf1Var);
                                        break;
                                    }
                                    iY = th1.y(f2);
                                    break;
                                }
                                float f7 = 1000.0f;
                                float f8 = 1000.0f;
                                float f9 = 0.0f;
                                float f10 = 100.0f;
                                ri riVar2 = null;
                                while (true) {
                                    if (Math.abs(f9 - f10) <= 0.01f) {
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        depth2 = depth2;
                                        break;
                                    }
                                    float f11 = ((f10 - f9) / 2.0f) + f9;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    int iC = ri.b(f11, f5, fMin).c(sf1.k);
                                    float fC = th1.C(Color.red(iC));
                                    float fC2 = th1.C(Color.green(iC));
                                    float fC3 = th1.C(Color.blue(iC));
                                    float[] fArr = th1.d[1];
                                    float f12 = ((fC3 * fArr[2]) + ((fC2 * fArr[1]) + (fC * fArr[0]))) / 100.0f;
                                    float fCbrt = f12 <= 0.008856452f ? f12 * 903.2963f : (((float) Math.cbrt(f12)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f2 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        ri riVarA2 = ri.a(iC);
                                        ri riVarB = ri.b(riVarA2.c, riVarA2.b, fMin);
                                        float f13 = riVarA2.d - riVarB.d;
                                        float f14 = riVarA2.e - riVarB.e;
                                        float f15 = riVarA2.f - riVarB.f;
                                        depth2 = depth2;
                                        float fPow = (float) (Math.pow(Math.sqrt((f15 * f15) + (f14 * f14) + (f13 * f13)), 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f8 = fPow;
                                            f7 = fAbs;
                                            riVar2 = riVarA2;
                                        }
                                    } else {
                                        depth2 = depth2;
                                    }
                                    if (f7 == 0.0f && f8 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f2) {
                                        f9 = f11;
                                    } else {
                                        f10 = f11;
                                    }
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                }
                                ri riVar3 = riVar2;
                                if (!z2) {
                                    if (riVar3 == null) {
                                        f4 = f5;
                                    } else {
                                        riVar = riVar3;
                                        f6 = f5;
                                    }
                                    f5 = ((f4 - f6) / 2.0f) + f6;
                                } else {
                                    if (riVar3 != null) {
                                        iY = riVar3.c(sf1Var);
                                        break;
                                    }
                                    f5 = ((f4 - f6) / 2.0f) + f6;
                                    z2 = false;
                                }
                            }
                        } else {
                            iArrTrimStateSet = iArrTrimStateSet;
                            depth2 = depth2;
                            iY = th1.y(f2);
                        }
                        color = iY;
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        depth2 = depth2;
                    }
                    color = (16777215 & color) | (iF << 24);
                } else {
                    iArrTrimStateSet = iArrTrimStateSet;
                    depth2 = depth2;
                }
                int i7 = i2 + 1;
                if (i7 > iArr.length) {
                    int[] iArr4 = new int[i2 <= 4 ? 8 : i2 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i2);
                    iArr = iArr4;
                }
                iArr[i2] = color;
                if (i7 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2 > 4 ? i2 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i2);
                    objArr = objArr2;
                }
                objArr[i2] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i2 = i7;
                depth2 = depth2;
                r4 = 1;
                i = 0;
            } else {
                depth2 = depth2;
                r4 = 1;
                i = 0;
            }
        }
        int[] iArr5 = new int[i2];
        int[][] iArr6 = new int[i2][];
        System.arraycopy(iArr, 0, iArr5, 0, i2);
        System.arraycopy(objArr, 0, iArr6, 0, i2);
        return new ColorStateList(iArr6, iArr5);
    }
}
