package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class co0 {
    public static final ThreadLocal c = new ThreadLocal();
    public final Context a;
    public final gp0 b;

    public co0(Context context, gp0 gp0Var) {
        gp0Var.getClass();
        this.a = context;
        this.b = gp0Var;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x020e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0218  */
    /* JADX WARN: Code duplicated, block: B:127:0x022b  */
    /* JADX WARN: Code duplicated, block: B:128:0x023c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0240  */
    /* JADX WARN: Code duplicated, block: B:131:0x024a  */
    /* JADX WARN: Code duplicated, block: B:133:0x024e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0258  */
    /* JADX WARN: Code duplicated, block: B:136:0x025c  */
    /* JADX WARN: Code duplicated, block: B:137:0x0266  */
    /* JADX WARN: Instruction removed from duplicated block: B:137:0x0266, please report this as an issue */
    public static zm0 c(TypedArray typedArray, Resources resources, int i) throws XmlPullParserException {
        lo0 ko0Var;
        Object objD;
        boolean z;
        lo0 lo0Var;
        Class<?> componentType;
        boolean z2 = typedArray.getBoolean(3, false);
        ThreadLocal threadLocal = c;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        if (string != null) {
            String resourcePackageName = resources.getResourcePackageName(i);
            if (string.startsWith("java")) {
                try {
                    ko0Var = ds.p("j$".concat(string.substring(4)), resourcePackageName);
                } catch (RuntimeException e) {
                    if (!(e.getCause() instanceof ClassNotFoundException)) {
                        throw e;
                    }
                    ko0Var = ds.p(string, resourcePackageName);
                }
            } else {
                ko0Var = ds.p(string, resourcePackageName);
            }
        } else {
            ko0Var = null;
        }
        boolean value = typedArray.getValue(1, typedValue);
        lh lhVar = lo0.f;
        lh lhVar2 = lo0.l;
        lh lhVar3 = lo0.o;
        lh lhVar4 = lo0.b;
        lh lhVar5 = lo0.i;
        if (value) {
            int i2 = typedValue.resourceId;
            lh lhVar6 = lo0.c;
            if (ko0Var == lhVar6) {
                if (i2 != 0) {
                    objD = Integer.valueOf(i2);
                } else {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        StringBuilder sb = new StringBuilder("unsupported value '");
                        sb.append((Object) typedValue.string);
                        String strB = ko0Var.b();
                        sb.append("' for ");
                        sb.append(strB);
                        sb.append(". Must be a reference to a resource.");
                        throw new XmlPullParserException(sb.toString());
                    }
                    objD = 0;
                }
            } else if (i2 != 0) {
                if (ko0Var != null) {
                    StringBuilder sb2 = new StringBuilder("unsupported value '");
                    sb2.append((Object) typedValue.string);
                    String strB2 = ko0Var.b();
                    sb2.append("' for ");
                    sb2.append(strB2);
                    sb2.append(". You must use a \"reference\" type to reference other resources.");
                    throw new XmlPullParserException(sb2.toString());
                }
                objD = Integer.valueOf(i2);
                ko0Var = lhVar6;
            } else if (ko0Var == lhVar3) {
                objD = typedArray.getString(1);
            } else {
                int i3 = typedValue.type;
                if (i3 == 3) {
                    String string2 = typedValue.string.toString();
                    if (ko0Var == null) {
                        string2.getClass();
                        try {
                            try {
                                try {
                                    try {
                                        lhVar4.d(string2);
                                        ko0Var = lhVar4;
                                    } catch (IllegalArgumentException unused) {
                                        lhVar2.d(string2);
                                        ko0Var = lhVar2;
                                    }
                                } catch (IllegalArgumentException unused2) {
                                    lhVar5.d(string2);
                                    ko0Var = lhVar5;
                                }
                            } catch (IllegalArgumentException unused3) {
                                ko0Var = lhVar3;
                            }
                        } catch (IllegalArgumentException unused4) {
                            lhVar.d(string2);
                            ko0Var = lhVar;
                        }
                    }
                    objD = ko0Var.d(string2);
                } else if (i3 == 4) {
                    ko0Var = hq.i(typedValue, ko0Var, lhVar5, string, "float");
                    objD = Float.valueOf(typedValue.getFloat());
                } else if (i3 == 5) {
                    ko0Var = hq.i(typedValue, ko0Var, lhVar4, string, "dimension");
                    objD = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                } else if (i3 == 18) {
                    ko0Var = hq.i(typedValue, ko0Var, lhVar2, string, "boolean");
                    objD = Boolean.valueOf(typedValue.data != 0);
                } else {
                    if (i3 < 16 || i3 > 31) {
                        throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                    }
                    if (ko0Var == lhVar5) {
                        ko0Var = hq.i(typedValue, ko0Var, lhVar5, string, "float");
                        objD = Float.valueOf(typedValue.data);
                    } else {
                        ko0Var = hq.i(typedValue, ko0Var, lhVar4, string, "integer");
                        objD = Integer.valueOf(typedValue.data);
                    }
                }
            }
        } else {
            objD = null;
        }
        if (objD != null) {
            z = true;
        } else {
            objD = null;
            z = false;
        }
        if (ko0Var == null) {
            ko0Var = null;
        }
        if (ko0Var == null) {
            if (objD instanceof Integer) {
                lo0Var = lhVar4;
            } else if (objD instanceof int[]) {
                lo0Var = lo0.d;
            } else if (objD instanceof Long) {
                lo0Var = lhVar;
            } else if (objD instanceof long[]) {
                lo0Var = lo0.g;
            } else if (objD instanceof Float) {
                lo0Var = lhVar5;
            } else if (objD instanceof float[]) {
                lo0Var = lo0.j;
            } else if (objD instanceof Boolean) {
                lo0Var = lhVar2;
            } else if (objD instanceof boolean[]) {
                lo0Var = lo0.m;
            } else {
                lo0Var = ((objD instanceof String) || objD == null) ? lhVar3 : null;
            }
            if (lo0Var != null) {
                ko0Var = lo0Var;
            } else if ((objD instanceof Object[]) && (((Object[]) objD) instanceof String[])) {
                ko0Var = lo0.p;
            } else {
                objD.getClass();
                if (objD.getClass().isArray()) {
                    Class<?> componentType2 = objD.getClass().getComponentType();
                    componentType2.getClass();
                    if (Parcelable.class.isAssignableFrom(componentType2)) {
                        Class<?> componentType3 = objD.getClass().getComponentType();
                        componentType3.getClass();
                        ko0Var = new ho0(componentType3);
                    } else if (objD.getClass().isArray()) {
                        componentType = objD.getClass().getComponentType();
                        componentType.getClass();
                        if (Serializable.class.isAssignableFrom(componentType)) {
                            Class<?> componentType4 = objD.getClass().getComponentType();
                            componentType4.getClass();
                            ko0Var = new jo0(componentType4);
                        } else if (objD instanceof Parcelable) {
                            ko0Var = new io0(objD.getClass());
                        } else if (objD instanceof Enum) {
                            ko0Var = new go0(objD.getClass());
                        } else {
                            if (objD instanceof Serializable) {
                                throw new IllegalArgumentException("Object of type " + objD.getClass().getName() + " is not supported for navigation arguments.");
                            }
                            ko0Var = new ko0(objD.getClass());
                        }
                    } else if (objD instanceof Parcelable) {
                        ko0Var = new io0(objD.getClass());
                    } else if (objD instanceof Enum) {
                        ko0Var = new go0(objD.getClass());
                    } else {
                        if (objD instanceof Serializable) {
                            throw new IllegalArgumentException("Object of type " + objD.getClass().getName() + " is not supported for navigation arguments.");
                        }
                        ko0Var = new ko0(objD.getClass());
                    }
                } else if (objD.getClass().isArray()) {
                    componentType = objD.getClass().getComponentType();
                    componentType.getClass();
                    if (Serializable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType5 = objD.getClass().getComponentType();
                        componentType5.getClass();
                        ko0Var = new jo0(componentType5);
                    } else if (objD instanceof Parcelable) {
                        ko0Var = new io0(objD.getClass());
                    } else if (objD instanceof Enum) {
                        ko0Var = new go0(objD.getClass());
                    } else {
                        if (objD instanceof Serializable) {
                            throw new IllegalArgumentException("Object of type " + objD.getClass().getName() + " is not supported for navigation arguments.");
                        }
                        ko0Var = new ko0(objD.getClass());
                    }
                } else if (objD instanceof Parcelable) {
                    ko0Var = new io0(objD.getClass());
                } else if (objD instanceof Enum) {
                    ko0Var = new go0(objD.getClass());
                } else {
                    if (objD instanceof Serializable) {
                        throw new IllegalArgumentException("Object of type " + objD.getClass().getName() + " is not supported for navigation arguments.");
                    }
                    ko0Var = new ko0(objD.getClass());
                }
            }
        }
        return new zm0(ko0Var, z2, objD, z);
    }

    public final vn0 a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        int depth;
        String strR;
        String strR2;
        Context context;
        m7 m7Var;
        int i2;
        Object obj;
        int i3 = i;
        String name = xmlResourceParser.getName();
        name.getClass();
        vn0 vn0VarA = this.b.b(name).a();
        Context context2 = this.a;
        vn0VarA.f(context2, attributeSet);
        m7 m7Var2 = vn0VarA.d;
        int i4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                boolean zEquals = "argument".equals(name2);
                int[] iArr = wv0.b;
                if (zEquals) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                    typedArrayObtainAttributes.getClass();
                    String string = typedArrayObtainAttributes.getString(0);
                    if (string == null) {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                    zm0 zm0VarC = c(typedArrayObtainAttributes, resources, i3);
                    m7Var2.getClass();
                    ((LinkedHashMap) m7Var2.e).put(string, zm0VarC);
                    typedArrayObtainAttributes.recycle();
                } else {
                    String strR3 = null;
                    if ("deepLink".equals(name2)) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSet, wv0.c);
                        typedArrayObtainAttributes2.getClass();
                        String string2 = typedArrayObtainAttributes2.getString(3);
                        String string3 = typedArrayObtainAttributes2.getString(i4);
                        String string4 = typedArrayObtainAttributes2.getString(2);
                        if ((string2 == null || string2.length() == 0) && ((string3 == null || string3.length() == 0) && (string4 == null || string4.length() == 0))) {
                            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                        }
                        if (string2 != null) {
                            String packageName = context2.getPackageName();
                            packageName.getClass();
                            strR = p71.R(string2, "${applicationId}", packageName);
                        } else {
                            strR = null;
                        }
                        if (string3 == null || string3.length() == 0) {
                            strR2 = null;
                        } else {
                            String packageName2 = context2.getPackageName();
                            packageName2.getClass();
                            strR2 = p71.R(string3, "${applicationId}", packageName2);
                            if (strR2.length() <= 0) {
                                id.q("The NavDeepLink cannot have an empty action.");
                                return null;
                            }
                        }
                        if (string4 != null) {
                            String packageName3 = context2.getPackageName();
                            packageName3.getClass();
                            strR3 = p71.R(string4, "${applicationId}", packageName3);
                        }
                        sn0 sn0Var = new sn0(strR, strR2, strR3);
                        m7Var2.getClass();
                        ArrayList arrayListV = bu0.v((LinkedHashMap) m7Var2.e, new wn0(sn0Var, 0));
                        if (!arrayListV.isEmpty()) {
                            StringBuilder sbN = q51.n("Deep link ", strR, " can't be used to open destination ");
                            sbN.append((vn0) m7Var2.b);
                            sbN.append(".\nFollowing required arguments are missing: ");
                            sbN.append(arrayListV);
                            throw new IllegalArgumentException(sbN.toString().toString());
                        }
                        ((ArrayList) m7Var2.c).add(sn0Var);
                        typedArrayObtainAttributes2.recycle();
                    } else {
                        if ("action".equals(name2)) {
                            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, wv0.a, 0, 0);
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                            ym0 ym0Var = new ym0(typedArrayObtainStyledAttributes.getResourceId(i4, 0));
                            ym0Var.b = new eo0(typedArrayObtainStyledAttributes.getBoolean(4, false), typedArrayObtainStyledAttributes.getBoolean(10, false), typedArrayObtainStyledAttributes.getResourceId(7, -1), typedArrayObtainStyledAttributes.getBoolean(8, false), typedArrayObtainStyledAttributes.getBoolean(9, false), typedArrayObtainStyledAttributes.getResourceId(2, -1), typedArrayObtainStyledAttributes.getResourceId(3, -1), typedArrayObtainStyledAttributes.getResourceId(5, -1), typedArrayObtainStyledAttributes.getResourceId(6, -1));
                            Bundle bundleG = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
                            int depth3 = xmlResourceParser.getDepth() + 1;
                            context = context2;
                            while (true) {
                                int next2 = xmlResourceParser.next();
                                m7Var = m7Var2;
                                if (next2 == 1) {
                                    i2 = depth2;
                                    break;
                                }
                                int depth4 = xmlResourceParser.getDepth();
                                i2 = depth2;
                                if (depth4 < depth3 && next2 == 3) {
                                    break;
                                }
                                if (next2 == 2 && depth4 <= depth3) {
                                    if ("argument".equals(xmlResourceParser.getName())) {
                                        TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(attributeSet, iArr);
                                        typedArrayObtainAttributes3.getClass();
                                        String string5 = typedArrayObtainAttributes3.getString(0);
                                        if (string5 == null) {
                                            throw new XmlPullParserException("Arguments must have a name");
                                        }
                                        zm0 zm0VarC2 = c(typedArrayObtainAttributes3, resources, i3);
                                        boolean z = zm0VarC2.c;
                                        if (z && z && (obj = zm0VarC2.d) != null) {
                                            zm0VarC2.a.e(bundleG, string5, obj);
                                        }
                                        typedArrayObtainAttributes3.recycle();
                                    }
                                    i3 = i;
                                }
                                m7Var2 = m7Var;
                                depth2 = i2;
                            }
                            if (!bundleG.isEmpty()) {
                                ym0Var.c = bundleG;
                            }
                            if (vn0VarA instanceof e6) {
                                throw new UnsupportedOperationException("Cannot add action " + resourceId + " to " + vn0VarA + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                            }
                            if (resourceId == 0) {
                                id.q("Cannot have an action with actionId 0");
                                return null;
                            }
                            vn0VarA.g.e(resourceId, ym0Var);
                            typedArrayObtainStyledAttributes.recycle();
                        } else {
                            context = context2;
                            m7Var = m7Var2;
                            i2 = depth2;
                            if ("include".equals(name2) && (vn0VarA instanceof xn0)) {
                                TypedArray typedArrayObtainAttributes4 = resources.obtainAttributes(attributeSet, vv0.c);
                                typedArrayObtainAttributes4.getClass();
                                ((xn0) vn0VarA).g(b(typedArrayObtainAttributes4.getResourceId(0, 0)));
                                typedArrayObtainAttributes4.recycle();
                            } else if (vn0VarA instanceof xn0) {
                                ((xn0) vn0VarA).g(a(resources, xmlResourceParser, attributeSet, i));
                            }
                        }
                        i3 = i;
                        context2 = context;
                        m7Var2 = m7Var;
                        depth2 = i2;
                        i4 = 1;
                    }
                }
            }
        }
        return vn0VarA;
    }

    public final xn0 b(int i) {
        int next;
        Resources resources = this.a.getResources();
        XmlResourceParser xml = resources.getXml(i);
        xml.getClass();
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        attributeSetAsAttributeSet.getClass();
        vn0 vn0VarA = a(resources, xml, attributeSetAsAttributeSet, i);
        if (vn0VarA instanceof xn0) {
            xn0 xn0Var = (xn0) vn0VarA;
            xml.close();
            return xn0Var;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
