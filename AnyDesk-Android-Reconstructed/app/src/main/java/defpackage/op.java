package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class op {
    public boolean a = false;
    public int b;
    public int c;
    public float d;
    public String e;
    public boolean f;
    public int g;

    public op(op opVar, Object obj) {
        opVar.getClass();
        this.b = opVar.b;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), rv0.d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf = null;
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else if (index == 3) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                i = 3;
            } else if (index == 2) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                i = 4;
            } else {
                if (index == 7) {
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                    i = 2;
                } else if (index == 6) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                    i = 1;
                } else if (index == 9) {
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                    i = 5;
                } else if (index == 8) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                    i = 8;
                }
                i = 7;
            }
        }
        if (string != null && objValueOf != null) {
            op opVar = new op();
            opVar.b = i;
            opVar.a = z;
            opVar.b(objValueOf);
            map.put(string, opVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (q51.r(this.b)) {
            case 0:
            case 7:
                this.c = ((Integer) obj).intValue();
                break;
            case 1:
                this.d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.g = ((Integer) obj).intValue();
                break;
            case 4:
                this.e = (String) obj;
                break;
            case 5:
                this.f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.d = ((Float) obj).floatValue();
                break;
        }
    }
}
