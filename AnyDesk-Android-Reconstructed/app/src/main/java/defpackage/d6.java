package defpackage;

import android.app.Activity;
import android.app.Notification;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.PrecomputedText;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.DisplayCutout;
import android.view.Menu;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class d6 {
    public static View A(Activity activity) {
        return activity.requireViewById(R.id.nav_host_fragment);
    }

    public static void B(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static void C(Menu menu) {
        menu.setGroupDividerEnabled(true);
    }

    public static void D(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static boolean E(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static Class a(Field field) throws fe {
        String typeName = Build.VERSION.SDK_INT >= 28 ? field.getGenericType().getTypeName() : field.getGenericType().toString();
        int iIndexOf = typeName.indexOf(60);
        if (iIndexOf == -1) {
            throw new fe("Not a container type: " + field.getGenericType());
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = typeName.indexOf(62, i);
        if (iIndexOf2 != -1) {
            return Class.forName(typeName.substring(i, iIndexOf2));
        }
        throw new fe("Not a container type: " + field.getGenericType());
    }

    public static void b(Canvas canvas, Path path) {
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(path);
        } else {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public static Handler c(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler d(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static DynamicLayout e(String str, TextPaint textPaint, int i) {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        if (Build.VERSION.SDK_INT < 28) {
            return new DynamicLayout(str, textPaint, i, alignment, 1.0f, 0.0f, false);
        }
        DynamicLayout.Builder builderObtain = DynamicLayout.Builder.obtain(str, textPaint, i);
        builderObtain.setAlignment(alignment);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(false);
        return builderObtain.build();
    }

    public static StaticLayout f(CharSequence charSequence, TextPaint textPaint, int i) {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        if (Build.VERSION.SDK_INT < 28) {
            return new StaticLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, false);
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
        builderObtain.setAlignment(alignment);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(false);
        return builderObtain.build();
    }

    public static long g(ByteBuffer byteBuffer) {
        long j = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0L;
        }
        while (byteBuffer.hasRemaining()) {
            if (j > 72057594037927935L) {
                throw new fe("Base-128 number too large");
            }
            byte b = byteBuffer.get();
            j = (j << 7) | ((long) (b & 127));
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw new fe("Truncated base-128 encoded input: missing terminating byte, with highest bit not set");
    }

    public static ArrayList h(Class cls) throws fe {
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            ke keVar = (ke) field.getAnnotation(ke.class);
            if (keVar != null) {
                if (Modifier.isStatic(field.getModifiers())) {
                    throw new fe(ke.class.getName() + " used on a static field: " + cls.getName() + "." + field.getName());
                }
                try {
                    arrayList.add(new ce(field, keVar));
                } catch (fe e) {
                    throw new fe("Invalid ASN.1 annotation on " + cls.getName() + "." + field.getName(), e);
                }
            }
        }
        return arrayList;
    }

    public static String[] i(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static Executor j(MainApplication mainApplication) {
        return mainApplication.getMainExecutor();
    }

    public static int k(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String l(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int m(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int n(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int o(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int p(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int q(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params r(ad adVar) {
        return adVar.getTextMetricsParams();
    }

    public static int s(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri t(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static BigInteger u(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return BigInteger.ZERO;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return new BigInteger(bArr);
    }

    public static Object v(fj0 fj0Var, Class cls) throws fe {
        int i = fj0Var.b;
        int i2 = fj0Var.a;
        ee eeVar = (ee) uj.n(cls);
        if (eeVar == null) {
            throw new fe(cls.getName() + " is not annotated with " + ee.class.getName());
        }
        int iOrdinal = eeVar.type().ordinal();
        if (iOrdinal != 1 && iOrdinal != 5 && iOrdinal != 12) {
            throw new fe("Unsupported ASN.1 container annotation type: " + eeVar.type());
        }
        oe oeVarType = eeVar.type();
        int iOrdinal2 = oeVarType.ordinal();
        if (iOrdinal2 == 1) {
            return x(fj0Var, cls);
        }
        if (iOrdinal2 != 5) {
            if (iOrdinal2 == 12) {
                return y(fj0Var, cls, true);
            }
            throw new fe("Parsing container " + oeVarType + " not supported");
        }
        int iA = r71.A(oeVarType);
        if (i2 == 0 && i == iA) {
            return y(fj0Var, cls, false);
        }
        throw new de("Unexpected data value read as " + cls.getName() + ". Expected " + r71.N(0, iA) + ", but read: " + r71.N(i2, i));
    }

    public static Object w(ByteBuffer byteBuffer, Class cls) throws fe {
        try {
            fj0 fj0VarB = new zh(0, byteBuffer).b();
            if (fj0VarB != null) {
                return v(fj0VarB, cls);
            }
            throw new fe("Empty input");
        } catch (jg e) {
            throw new fe("Failed to decode top-level data value", e);
        }
    }

    public static Object x(fj0 fj0Var, Class cls) throws fe {
        ArrayList arrayListH = h(cls);
        if (arrayListH.isEmpty()) {
            throw new fe("No fields annotated with " + ke.class.getName() + " in CHOICE class " + cls.getName());
        }
        int i = 0;
        int i2 = 0;
        while (i2 < arrayListH.size() - 1) {
            ce ceVar = (ce) arrayListH.get(i2);
            int i3 = ceVar.e;
            int i4 = ceVar.d;
            i2++;
            for (int i5 = i2; i5 < arrayListH.size(); i5++) {
                ce ceVar2 = (ce) arrayListH.get(i5);
                int i6 = ceVar2.e;
                int i7 = ceVar2.d;
                if (i3 == i6 && i4 == i7) {
                    throw new fe("CHOICE fields are indistinguishable because they have the same tag class and number: " + cls.getName() + "." + ceVar.a.getName() + " and ." + ceVar2.a.getName());
                }
            }
        }
        try {
            Object objNewInstance = cls.getConstructor(null).newInstance(null);
            int size = arrayListH.size();
            while (i < size) {
                Object obj = arrayListH.get(i);
                i++;
                try {
                    ((ce) obj).a(fj0Var, objNewInstance);
                    return objNewInstance;
                } catch (de unused) {
                }
            }
            throw new fe("No options of CHOICE " + cls.getName() + " matched");
        } catch (IllegalArgumentException | ReflectiveOperationException e) {
            throw new fe("Failed to instantiate ".concat(cls.getName()), e);
        }
    }

    public static Object y(fj0 fj0Var, Class cls, boolean z) throws fe {
        fj0 fj0VarB;
        ArrayList arrayListH = h(cls);
        Collections.sort(arrayListH, new x9(1));
        int i = 0;
        if (arrayListH.size() > 1) {
            int size = arrayListH.size();
            ce ceVar = null;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListH.get(i2);
                i2++;
                ce ceVar2 = (ce) obj;
                if (ceVar != null && ceVar.b.index() == ceVar2.b.index()) {
                    throw new fe("Fields have the same index: " + cls.getName() + "." + ceVar.a.getName() + " and ." + ceVar2.a.getName());
                }
                ceVar = ceVar2;
            }
        }
        try {
            Object objNewInstance = cls.getConstructor(null).newInstance(null);
            zh zhVar = new zh(0, ((ByteBuffer) fj0Var.d).slice());
            while (i < arrayListH.size()) {
                if (z && i == 0) {
                    fj0VarB = fj0Var;
                } else {
                    try {
                        fj0VarB = zhVar.b();
                    } catch (jg e) {
                        throw new fe("Malformed data value", e);
                    }
                }
                if (fj0VarB == null) {
                    break;
                }
                for (int i3 = i; i3 < arrayListH.size(); i3++) {
                    ce ceVar3 = (ce) arrayListH.get(i3);
                    try {
                        if (ceVar3.g) {
                            try {
                                ceVar3.a(fj0VarB, objNewInstance);
                            } catch (de unused) {
                            }
                        } else {
                            ceVar3.a(fj0VarB, objNewInstance);
                        }
                        i = i3 + 1;
                        break;
                    } catch (fe e2) {
                        throw new fe("Failed to parse " + cls.getName() + "." + ceVar3.a.getName(), e2);
                    }
                }
            }
            return objNewInstance;
        } catch (IllegalArgumentException | ReflectiveOperationException e3) {
            throw new fe("Failed to instantiate ".concat(cls.getName()), e3);
        }
    }

    public static ArrayList z(fj0 fj0Var, Class cls) throws fe {
        Object leVar;
        ArrayList arrayList = new ArrayList();
        zh zhVar = new zh(0, ((ByteBuffer) fj0Var.d).slice());
        while (true) {
            try {
                fj0 fj0VarB = zhVar.b();
                if (fj0VarB == null) {
                    return arrayList;
                }
                if (ByteBuffer.class.equals(cls)) {
                    leVar = ((ByteBuffer) fj0VarB.d).slice();
                } else {
                    leVar = le.class.equals(cls) ? new le(((ByteBuffer) fj0VarB.c).slice()) : v(fj0VarB, cls);
                }
                arrayList.add(leVar);
            } catch (jg e) {
                throw new fe("Malformed data value", e);
            }
        }
    }
}
