package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.samsung.android.knox.EnterpriseDeviceManager;
import com.samsung.android.knox.accounts.Account;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class aq {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public final HashMap a = new HashMap();
    public final boolean b = true;
    public final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] b(yf yfVar, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = yfVar.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = kv0.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && yfVar.isInEditMode() && (yfVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) yfVar.getParent();
                if (q51.p(strTrim)) {
                    HashMap map = constraintLayout.o;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.o.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public static vp c(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        vp vpVar = new vp();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? rv0.c : rv0.a);
        String[] strArr = ec1.c;
        yp ypVar = vpVar.b;
        zp zpVar = vpVar.e;
        xp xpVar = vpVar.c;
        wp wpVar = vpVar.d;
        int[] iArr = d;
        SparseIntArray sparseIntArray = e;
        if (z) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            up upVar = new up();
            upVar.a = new int[10];
            upVar.b = new int[10];
            upVar.c = 0;
            upVar.d = new int[10];
            upVar.e = new float[10];
            upVar.f = 0;
            upVar.g = new int[5];
            upVar.h = new String[5];
            upVar.i = 0;
            upVar.j = new int[4];
            upVar.k = new boolean[4];
            upVar.l = 0;
            xpVar.getClass();
            wpVar.getClass();
            zpVar.getClass();
            int i3 = 0;
            while (i3 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = indexCount;
                switch (f.get(index)) {
                    case 2:
                        i2 = i3;
                        upVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, wpVar.I));
                        continue;
                        i3 = i2 + 1;
                        indexCount = i4;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i2 = i3;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i2 = i3;
                        upVar.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i3 = i2 + 1;
                        indexCount = i4;
                        break;
                    case 6:
                        i2 = i3;
                        upVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, wpVar.C));
                        break;
                    case 7:
                        i2 = i3;
                        upVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, wpVar.D));
                        break;
                    case 8:
                        i2 = i3;
                        upVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, wpVar.J));
                        break;
                    case 11:
                        i2 = i3;
                        upVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, wpVar.P));
                        break;
                    case 12:
                        i2 = i3;
                        upVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, wpVar.Q));
                        break;
                    case 13:
                        i2 = i3;
                        upVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, wpVar.M));
                        break;
                    case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                        i2 = i3;
                        upVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, wpVar.O));
                        break;
                    case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                        i2 = i3;
                        upVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, wpVar.R));
                        break;
                    case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                        i2 = i3;
                        upVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, wpVar.N));
                        break;
                    case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                        i2 = i3;
                        upVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, wpVar.d));
                        break;
                    case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                        i2 = i3;
                        upVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, wpVar.e));
                        break;
                    case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                        i2 = i3;
                        upVar.a(19, typedArrayObtainStyledAttributes.getFloat(index, wpVar.f));
                        break;
                    case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                        i2 = i3;
                        upVar.a(20, typedArrayObtainStyledAttributes.getFloat(index, wpVar.w));
                        break;
                    case 21:
                        i2 = i3;
                        upVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, wpVar.c));
                        break;
                    case 22:
                        i2 = i3;
                        upVar.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, ypVar.a)]);
                        break;
                    case 23:
                        i2 = i3;
                        upVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, wpVar.b));
                        break;
                    case 24:
                        i2 = i3;
                        upVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, wpVar.F));
                        break;
                    case 27:
                        i2 = i3;
                        upVar.b(27, typedArrayObtainStyledAttributes.getInt(index, wpVar.E));
                        break;
                    case 28:
                        i2 = i3;
                        upVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, wpVar.G));
                        break;
                    case 31:
                        i2 = i3;
                        upVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, wpVar.K));
                        break;
                    case 34:
                        i2 = i3;
                        upVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, wpVar.H));
                        break;
                    case 37:
                        i2 = i3;
                        upVar.a(37, typedArrayObtainStyledAttributes.getFloat(index, wpVar.x));
                        break;
                    case 38:
                        i2 = i3;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, vpVar.a);
                        vpVar.a = resourceId;
                        upVar.b(38, resourceId);
                        break;
                    case 39:
                        i2 = i3;
                        upVar.a(39, typedArrayObtainStyledAttributes.getFloat(index, wpVar.U));
                        break;
                    case 40:
                        i2 = i3;
                        upVar.a(40, typedArrayObtainStyledAttributes.getFloat(index, wpVar.T));
                        break;
                    case 41:
                        i2 = i3;
                        upVar.b(41, typedArrayObtainStyledAttributes.getInt(index, wpVar.V));
                        break;
                    case 42:
                        i2 = i3;
                        upVar.b(42, typedArrayObtainStyledAttributes.getInt(index, wpVar.W));
                        break;
                    case 43:
                        i2 = i3;
                        upVar.a(43, typedArrayObtainStyledAttributes.getFloat(index, ypVar.c));
                        break;
                    case 44:
                        i2 = i3;
                        upVar.d(44, true);
                        upVar.a(44, typedArrayObtainStyledAttributes.getDimension(index, zpVar.m));
                        break;
                    case 45:
                        i2 = i3;
                        upVar.a(45, typedArrayObtainStyledAttributes.getFloat(index, zpVar.b));
                        break;
                    case 46:
                        i2 = i3;
                        upVar.a(46, typedArrayObtainStyledAttributes.getFloat(index, zpVar.c));
                        break;
                    case 47:
                        i2 = i3;
                        upVar.a(47, typedArrayObtainStyledAttributes.getFloat(index, zpVar.d));
                        break;
                    case 48:
                        i2 = i3;
                        upVar.a(48, typedArrayObtainStyledAttributes.getFloat(index, zpVar.e));
                        break;
                    case 49:
                        i2 = i3;
                        upVar.a(49, typedArrayObtainStyledAttributes.getDimension(index, zpVar.f));
                        break;
                    case 50:
                        i2 = i3;
                        upVar.a(50, typedArrayObtainStyledAttributes.getDimension(index, zpVar.g));
                        break;
                    case 51:
                        i2 = i3;
                        upVar.a(51, typedArrayObtainStyledAttributes.getDimension(index, zpVar.i));
                        break;
                    case 52:
                        i2 = i3;
                        upVar.a(52, typedArrayObtainStyledAttributes.getDimension(index, zpVar.j));
                        break;
                    case 53:
                        i2 = i3;
                        upVar.a(53, typedArrayObtainStyledAttributes.getDimension(index, zpVar.k));
                        break;
                    case 54:
                        i2 = i3;
                        upVar.b(54, typedArrayObtainStyledAttributes.getInt(index, wpVar.X));
                        break;
                    case 55:
                        i2 = i3;
                        upVar.b(55, typedArrayObtainStyledAttributes.getInt(index, wpVar.Y));
                        break;
                    case 56:
                        i2 = i3;
                        upVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, wpVar.Z));
                        break;
                    case 57:
                        i2 = i3;
                        upVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, wpVar.a0));
                        break;
                    case 58:
                        i2 = i3;
                        upVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, wpVar.b0));
                        break;
                    case 59:
                        i2 = i3;
                        upVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, wpVar.c0));
                        break;
                    case 60:
                        i2 = i3;
                        upVar.a(60, typedArrayObtainStyledAttributes.getFloat(index, zpVar.a));
                        break;
                    case 62:
                        i2 = i3;
                        upVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, wpVar.A));
                        break;
                    case 63:
                        i2 = i3;
                        upVar.a(63, typedArrayObtainStyledAttributes.getFloat(index, wpVar.B));
                        break;
                    case Account.FLAGS_VIBRATE_WHEN_SILENT /* 64 */:
                        i2 = i3;
                        upVar.b(64, e(typedArrayObtainStyledAttributes, index, xpVar.a));
                        break;
                    case 65:
                        i2 = i3;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            upVar.c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            upVar.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        i2 = i3;
                        upVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = i3;
                        upVar.a(67, typedArrayObtainStyledAttributes.getFloat(index, xpVar.e));
                        break;
                    case 68:
                        i2 = i3;
                        upVar.a(68, typedArrayObtainStyledAttributes.getFloat(index, ypVar.d));
                        break;
                    case 69:
                        i2 = i3;
                        upVar.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i2 = i3;
                        upVar.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i2 = i3;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = i3;
                        upVar.b(72, typedArrayObtainStyledAttributes.getInt(index, wpVar.f0));
                        break;
                    case 73:
                        i2 = i3;
                        upVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, wpVar.g0));
                        break;
                    case 74:
                        i2 = i3;
                        upVar.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i2 = i3;
                        upVar.d(75, typedArrayObtainStyledAttributes.getBoolean(index, wpVar.n0));
                        break;
                    case 76:
                        i2 = i3;
                        upVar.b(76, typedArrayObtainStyledAttributes.getInt(index, xpVar.c));
                        break;
                    case 77:
                        i2 = i3;
                        upVar.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i2 = i3;
                        upVar.b(78, typedArrayObtainStyledAttributes.getInt(index, ypVar.b));
                        break;
                    case 79:
                        i2 = i3;
                        upVar.a(79, typedArrayObtainStyledAttributes.getFloat(index, xpVar.d));
                        break;
                    case 80:
                        i2 = i3;
                        upVar.d(80, typedArrayObtainStyledAttributes.getBoolean(index, wpVar.l0));
                        break;
                    case 81:
                        i2 = i3;
                        upVar.d(81, typedArrayObtainStyledAttributes.getBoolean(index, wpVar.m0));
                        break;
                    case 82:
                        i2 = i3;
                        upVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, xpVar.b));
                        break;
                    case 83:
                        i2 = i3;
                        upVar.b(83, e(typedArrayObtainStyledAttributes, index, zpVar.h));
                        break;
                    case 84:
                        i2 = i3;
                        upVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, xpVar.g));
                        break;
                    case 85:
                        i2 = i3;
                        upVar.a(85, typedArrayObtainStyledAttributes.getFloat(index, xpVar.f));
                        break;
                    case 86:
                        i2 = i3;
                        int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            xpVar.i = resourceId2;
                            upVar.b(89, resourceId2);
                            if (xpVar.i != -1) {
                                upVar.b(88, -2);
                            }
                        } else if (i5 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            xpVar.h = string;
                            upVar.c(90, string);
                            if (xpVar.h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                xpVar.i = resourceId3;
                                upVar.b(89, resourceId3);
                                upVar.b(88, -2);
                            } else {
                                upVar.b(88, -1);
                            }
                        } else {
                            upVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, xpVar.i));
                        }
                        break;
                    case 87:
                        i2 = i3;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = i3;
                        upVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, wpVar.L));
                        break;
                    case 94:
                        i2 = i3;
                        upVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, wpVar.S));
                        break;
                    case 95:
                        i2 = i3;
                        f(upVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = i3;
                        f(upVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = i3;
                        upVar.b(97, typedArrayObtainStyledAttributes.getInt(index, wpVar.o0));
                        break;
                    case 98:
                        i2 = i3;
                        int i6 = gm0.s;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            vpVar.a = typedArrayObtainStyledAttributes.getResourceId(index, vpVar.a);
                        }
                        break;
                    case 99:
                        i2 = i3;
                        upVar.d(99, typedArrayObtainStyledAttributes.getBoolean(index, wpVar.g));
                        break;
                }
                i3 = i2 + 1;
                indexCount = i4;
            }
        } else {
            int i7 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        xpVar.getClass();
                        wpVar.getClass();
                        zpVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        wpVar.p = e(typedArrayObtainStyledAttributes, index2, wpVar.p);
                        continue;
                        i7++;
                        break;
                    case 2:
                        i = indexCount2;
                        wpVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, wpVar.I);
                        continue;
                        i7++;
                        break;
                    case 3:
                        i = indexCount2;
                        wpVar.o = e(typedArrayObtainStyledAttributes, index2, wpVar.o);
                        continue;
                        i7++;
                        break;
                    case 4:
                        i = indexCount2;
                        wpVar.n = e(typedArrayObtainStyledAttributes, index2, wpVar.n);
                        continue;
                        i7++;
                        break;
                    case 5:
                        i = indexCount2;
                        wpVar.y = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i7++;
                        break;
                    case 6:
                        i = indexCount2;
                        wpVar.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, wpVar.C);
                        continue;
                        i7++;
                        break;
                    case 7:
                        i = indexCount2;
                        wpVar.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, wpVar.D);
                        continue;
                        i7++;
                        break;
                    case 8:
                        i = indexCount2;
                        wpVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, wpVar.J);
                        continue;
                        i7++;
                        break;
                    case 9:
                        i = indexCount2;
                        wpVar.v = e(typedArrayObtainStyledAttributes, index2, wpVar.v);
                        continue;
                        i7++;
                        break;
                    case 10:
                        i = indexCount2;
                        wpVar.u = e(typedArrayObtainStyledAttributes, index2, wpVar.u);
                        continue;
                        i7++;
                        break;
                    case 11:
                        i = indexCount2;
                        wpVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, wpVar.P);
                        continue;
                        i7++;
                        break;
                    case 12:
                        i = indexCount2;
                        wpVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, wpVar.Q);
                        continue;
                        i7++;
                        break;
                    case 13:
                        i = indexCount2;
                        wpVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, wpVar.M);
                        continue;
                        i7++;
                        break;
                    case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                        i = indexCount2;
                        wpVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, wpVar.O);
                        continue;
                        i7++;
                        break;
                    case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                        i = indexCount2;
                        wpVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, wpVar.R);
                        continue;
                        i7++;
                        break;
                    case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                        i = indexCount2;
                        wpVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, wpVar.N);
                        continue;
                        i7++;
                        break;
                    case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                        i = indexCount2;
                        wpVar.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, wpVar.d);
                        continue;
                        i7++;
                        break;
                    case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                        i = indexCount2;
                        wpVar.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, wpVar.e);
                        continue;
                        i7++;
                        break;
                    case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                        i = indexCount2;
                        wpVar.f = typedArrayObtainStyledAttributes.getFloat(index2, wpVar.f);
                        continue;
                        i7++;
                        break;
                    case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                        i = indexCount2;
                        wpVar.w = typedArrayObtainStyledAttributes.getFloat(index2, wpVar.w);
                        continue;
                        i7++;
                        break;
                    case 21:
                        i = indexCount2;
                        wpVar.c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, wpVar.c);
                        continue;
                        i7++;
                        break;
                    case 22:
                        i = indexCount2;
                        int i8 = typedArrayObtainStyledAttributes.getInt(index2, ypVar.a);
                        ypVar.a = i8;
                        ypVar.a = iArr[i8];
                        continue;
                        i7++;
                        break;
                    case 23:
                        i = indexCount2;
                        wpVar.b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, wpVar.b);
                        continue;
                        i7++;
                        break;
                    case 24:
                        i = indexCount2;
                        wpVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, wpVar.F);
                        continue;
                        i7++;
                        break;
                    case 25:
                        i = indexCount2;
                        wpVar.h = e(typedArrayObtainStyledAttributes, index2, wpVar.h);
                        continue;
                        i7++;
                        break;
                    case 26:
                        i = indexCount2;
                        wpVar.i = e(typedArrayObtainStyledAttributes, index2, wpVar.i);
                        continue;
                        i7++;
                        break;
                    case 27:
                        i = indexCount2;
                        wpVar.E = typedArrayObtainStyledAttributes.getInt(index2, wpVar.E);
                        continue;
                        i7++;
                        break;
                    case 28:
                        i = indexCount2;
                        wpVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, wpVar.G);
                        continue;
                        i7++;
                        break;
                    case 29:
                        i = indexCount2;
                        wpVar.j = e(typedArrayObtainStyledAttributes, index2, wpVar.j);
                        continue;
                        i7++;
                        break;
                    case 30:
                        i = indexCount2;
                        wpVar.k = e(typedArrayObtainStyledAttributes, index2, wpVar.k);
                        continue;
                        i7++;
                        break;
                    case 31:
                        i = indexCount2;
                        wpVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, wpVar.K);
                        continue;
                        i7++;
                        break;
                    case 32:
                        i = indexCount2;
                        wpVar.s = e(typedArrayObtainStyledAttributes, index2, wpVar.s);
                        continue;
                        i7++;
                        break;
                    case 33:
                        i = indexCount2;
                        wpVar.t = e(typedArrayObtainStyledAttributes, index2, wpVar.t);
                        continue;
                        i7++;
                        break;
                    case 34:
                        i = indexCount2;
                        wpVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, wpVar.H);
                        continue;
                        i7++;
                        break;
                    case 35:
                        i = indexCount2;
                        wpVar.m = e(typedArrayObtainStyledAttributes, index2, wpVar.m);
                        continue;
                        i7++;
                        break;
                    case 36:
                        i = indexCount2;
                        wpVar.l = e(typedArrayObtainStyledAttributes, index2, wpVar.l);
                        continue;
                        i7++;
                        break;
                    case 37:
                        i = indexCount2;
                        wpVar.x = typedArrayObtainStyledAttributes.getFloat(index2, wpVar.x);
                        continue;
                        i7++;
                        break;
                    case 38:
                        i = indexCount2;
                        vpVar.a = typedArrayObtainStyledAttributes.getResourceId(index2, vpVar.a);
                        continue;
                        i7++;
                        break;
                    case 39:
                        i = indexCount2;
                        wpVar.U = typedArrayObtainStyledAttributes.getFloat(index2, wpVar.U);
                        continue;
                        i7++;
                        break;
                    case 40:
                        i = indexCount2;
                        wpVar.T = typedArrayObtainStyledAttributes.getFloat(index2, wpVar.T);
                        continue;
                        i7++;
                        break;
                    case 41:
                        i = indexCount2;
                        wpVar.V = typedArrayObtainStyledAttributes.getInt(index2, wpVar.V);
                        continue;
                        i7++;
                        break;
                    case 42:
                        i = indexCount2;
                        wpVar.W = typedArrayObtainStyledAttributes.getInt(index2, wpVar.W);
                        continue;
                        i7++;
                        break;
                    case 43:
                        i = indexCount2;
                        ypVar.c = typedArrayObtainStyledAttributes.getFloat(index2, ypVar.c);
                        continue;
                        i7++;
                        break;
                    case 44:
                        i = indexCount2;
                        zpVar.l = true;
                        zpVar.m = typedArrayObtainStyledAttributes.getDimension(index2, zpVar.m);
                        continue;
                        i7++;
                        break;
                    case 45:
                        i = indexCount2;
                        zpVar.b = typedArrayObtainStyledAttributes.getFloat(index2, zpVar.b);
                        continue;
                        i7++;
                        break;
                    case 46:
                        i = indexCount2;
                        zpVar.c = typedArrayObtainStyledAttributes.getFloat(index2, zpVar.c);
                        continue;
                        i7++;
                        break;
                    case 47:
                        i = indexCount2;
                        zpVar.d = typedArrayObtainStyledAttributes.getFloat(index2, zpVar.d);
                        continue;
                        i7++;
                        break;
                    case 48:
                        i = indexCount2;
                        zpVar.e = typedArrayObtainStyledAttributes.getFloat(index2, zpVar.e);
                        continue;
                        i7++;
                        break;
                    case 49:
                        i = indexCount2;
                        zpVar.f = typedArrayObtainStyledAttributes.getDimension(index2, zpVar.f);
                        continue;
                        i7++;
                        break;
                    case 50:
                        i = indexCount2;
                        zpVar.g = typedArrayObtainStyledAttributes.getDimension(index2, zpVar.g);
                        continue;
                        i7++;
                        break;
                    case 51:
                        i = indexCount2;
                        zpVar.i = typedArrayObtainStyledAttributes.getDimension(index2, zpVar.i);
                        continue;
                        i7++;
                        break;
                    case 52:
                        i = indexCount2;
                        zpVar.j = typedArrayObtainStyledAttributes.getDimension(index2, zpVar.j);
                        continue;
                        i7++;
                        break;
                    case 53:
                        i = indexCount2;
                        zpVar.k = typedArrayObtainStyledAttributes.getDimension(index2, zpVar.k);
                        continue;
                        i7++;
                        break;
                    case 54:
                        i = indexCount2;
                        wpVar.X = typedArrayObtainStyledAttributes.getInt(index2, wpVar.X);
                        continue;
                        i7++;
                        break;
                    case 55:
                        i = indexCount2;
                        wpVar.Y = typedArrayObtainStyledAttributes.getInt(index2, wpVar.Y);
                        continue;
                        i7++;
                        break;
                    case 56:
                        i = indexCount2;
                        wpVar.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, wpVar.Z);
                        continue;
                        i7++;
                        break;
                    case 57:
                        i = indexCount2;
                        wpVar.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, wpVar.a0);
                        continue;
                        i7++;
                        break;
                    case 58:
                        i = indexCount2;
                        wpVar.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, wpVar.b0);
                        continue;
                        i7++;
                        break;
                    case 59:
                        i = indexCount2;
                        wpVar.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, wpVar.c0);
                        continue;
                        i7++;
                        break;
                    case 60:
                        i = indexCount2;
                        zpVar.a = typedArrayObtainStyledAttributes.getFloat(index2, zpVar.a);
                        continue;
                        i7++;
                        break;
                    case 61:
                        i = indexCount2;
                        wpVar.z = e(typedArrayObtainStyledAttributes, index2, wpVar.z);
                        continue;
                        i7++;
                        break;
                    case 62:
                        i = indexCount2;
                        wpVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, wpVar.A);
                        continue;
                        i7++;
                        break;
                    case 63:
                        i = indexCount2;
                        wpVar.B = typedArrayObtainStyledAttributes.getFloat(index2, wpVar.B);
                        continue;
                        i7++;
                        break;
                    case Account.FLAGS_VIBRATE_WHEN_SILENT /* 64 */:
                        i = indexCount2;
                        xpVar.a = e(typedArrayObtainStyledAttributes, index2, xpVar.a);
                        continue;
                        i7++;
                        break;
                    case 65:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            xpVar.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            xpVar.getClass();
                        }
                        i7++;
                        break;
                    case 66:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        xpVar.getClass();
                        continue;
                        i7++;
                        break;
                    case 67:
                        i = indexCount2;
                        xpVar.e = typedArrayObtainStyledAttributes.getFloat(index2, xpVar.e);
                        break;
                    case 68:
                        i = indexCount2;
                        ypVar.d = typedArrayObtainStyledAttributes.getFloat(index2, ypVar.d);
                        break;
                    case 69:
                        i = indexCount2;
                        wpVar.d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        wpVar.e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        wpVar.f0 = typedArrayObtainStyledAttributes.getInt(index2, wpVar.f0);
                        break;
                    case 73:
                        i = indexCount2;
                        wpVar.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, wpVar.g0);
                        break;
                    case 74:
                        i = indexCount2;
                        wpVar.j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        wpVar.n0 = typedArrayObtainStyledAttributes.getBoolean(index2, wpVar.n0);
                        break;
                    case 76:
                        i = indexCount2;
                        xpVar.c = typedArrayObtainStyledAttributes.getInt(index2, xpVar.c);
                        break;
                    case 77:
                        i = indexCount2;
                        wpVar.k0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        ypVar.b = typedArrayObtainStyledAttributes.getInt(index2, ypVar.b);
                        break;
                    case 79:
                        i = indexCount2;
                        xpVar.d = typedArrayObtainStyledAttributes.getFloat(index2, xpVar.d);
                        break;
                    case 80:
                        i = indexCount2;
                        wpVar.l0 = typedArrayObtainStyledAttributes.getBoolean(index2, wpVar.l0);
                        break;
                    case 81:
                        i = indexCount2;
                        wpVar.m0 = typedArrayObtainStyledAttributes.getBoolean(index2, wpVar.m0);
                        break;
                    case 82:
                        i = indexCount2;
                        xpVar.b = typedArrayObtainStyledAttributes.getInteger(index2, xpVar.b);
                        break;
                    case 83:
                        i = indexCount2;
                        zpVar.h = e(typedArrayObtainStyledAttributes, index2, zpVar.h);
                        break;
                    case 84:
                        i = indexCount2;
                        xpVar.g = typedArrayObtainStyledAttributes.getInteger(index2, xpVar.g);
                        break;
                    case 85:
                        i = indexCount2;
                        xpVar.f = typedArrayObtainStyledAttributes.getFloat(index2, xpVar.f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            xpVar.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i9 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            xpVar.h = string2;
                            if (string2.indexOf("/") > 0) {
                                xpVar.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, xpVar.i);
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        wpVar.q = e(typedArrayObtainStyledAttributes, index2, wpVar.q);
                        break;
                    case 92:
                        i = indexCount2;
                        wpVar.r = e(typedArrayObtainStyledAttributes, index2, wpVar.r);
                        break;
                    case 93:
                        i = indexCount2;
                        wpVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, wpVar.L);
                        break;
                    case 94:
                        i = indexCount2;
                        wpVar.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, wpVar.S);
                        break;
                    case 95:
                        i = indexCount2;
                        f(wpVar, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i7++;
                        break;
                    case 96:
                        i = indexCount2;
                        f(wpVar, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        wpVar.o0 = typedArrayObtainStyledAttributes.getInt(index2, wpVar.o0);
                        break;
                }
                i7++;
            }
            if (wpVar.j0 != null) {
                wpVar.i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return vpVar;
    }

    public static int e(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0035  */
    /* JADX WARN: Code duplicated, block: B:22:0x0039  */
    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x004b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0055  */
    /* JADX WARN: Code duplicated, block: B:36:0x0059  */
    /* JADX WARN: Code duplicated, block: B:38:0x005d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0066  */
    public static void f(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        up upVar;
        wp wpVar;
        rp rpVar;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 != 3) {
            if (i3 != 5) {
                dimensionPixelSize = typedArray.getInt(i, 0);
                if (dimensionPixelSize != -4) {
                    if (dimensionPixelSize != -3 && (dimensionPixelSize == -2 || dimensionPixelSize == -1)) {
                    }
                    z = false;
                } else {
                    i4 = -2;
                }
                if (obj instanceof rp) {
                    rpVar = (rp) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) rpVar).width = i4;
                        rpVar.W = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) rpVar).height = i4;
                        rpVar.X = z;
                        return;
                    }
                }
                if (obj instanceof wp) {
                    wpVar = (wp) obj;
                    if (i2 == 0) {
                        wpVar.b = i4;
                        wpVar.l0 = z;
                        return;
                    } else {
                        wpVar.c = i4;
                        wpVar.m0 = z;
                        return;
                    }
                }
                if (obj instanceof up) {
                    upVar = (up) obj;
                    if (i2 == 0) {
                        upVar.b(23, i4);
                        upVar.d(80, z);
                        return;
                    } else {
                        upVar.b(21, i4);
                        upVar.d(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            i4 = dimensionPixelSize;
            z = false;
            if (obj instanceof rp) {
                rpVar = (rp) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) rpVar).width = i4;
                    rpVar.W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) rpVar).height = i4;
                    rpVar.X = z;
                    return;
                }
            }
            if (obj instanceof wp) {
                wpVar = (wp) obj;
                if (i2 == 0) {
                    wpVar.b = i4;
                    wpVar.l0 = z;
                    return;
                } else {
                    wpVar.c = i4;
                    wpVar.m0 = z;
                    return;
                }
            }
            if (obj instanceof up) {
                upVar = (up) obj;
                if (i2 == 0) {
                    upVar.b(23, i4);
                    upVar.d(80, z);
                    return;
                } else {
                    upVar.b(21, i4);
                    upVar.d(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof rp) {
                    rp rpVar2 = (rp) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) rpVar2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) rpVar2).height = 0;
                    }
                    g(rpVar2, strTrim2);
                    return;
                }
                if (obj instanceof wp) {
                    ((wp) obj).y = strTrim2;
                    return;
                } else {
                    if (obj instanceof up) {
                        ((up) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f2 = Float.parseFloat(strTrim2);
                    if (obj instanceof rp) {
                        rp rpVar3 = (rp) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) rpVar3).width = 0;
                            rpVar3.H = f2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) rpVar3).height = 0;
                            rpVar3.I = f2;
                            return;
                        }
                    }
                    if (obj instanceof wp) {
                        wp wpVar2 = (wp) obj;
                        if (i2 == 0) {
                            wpVar2.b = 0;
                            wpVar2.U = f2;
                            return;
                        } else {
                            wpVar2.c = 0;
                            wpVar2.T = f2;
                            return;
                        }
                    }
                    if (obj instanceof up) {
                        up upVar2 = (up) obj;
                        if (i2 == 0) {
                            upVar2.b(23, 0);
                            upVar2.a(39, f2);
                            return;
                        } else {
                            upVar2.b(21, 0);
                            upVar2.a(40, f2);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof rp) {
                        rp rpVar4 = (rp) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) rpVar4).width = 0;
                            rpVar4.R = fMax;
                            rpVar4.L = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) rpVar4).height = 0;
                            rpVar4.S = fMax;
                            rpVar4.M = 2;
                            return;
                        }
                    }
                    if (obj instanceof wp) {
                        wp wpVar3 = (wp) obj;
                        if (i2 == 0) {
                            wpVar3.b = 0;
                            wpVar3.d0 = fMax;
                            wpVar3.X = 2;
                            return;
                        } else {
                            wpVar3.c = 0;
                            wpVar3.e0 = fMax;
                            wpVar3.Y = 2;
                            return;
                        }
                    }
                    if (obj instanceof up) {
                        up upVar3 = (up) obj;
                        if (i2 == 0) {
                            upVar3.b(23, 0);
                            upVar3.b(54, 2);
                        } else {
                            upVar3.b(21, 0);
                            upVar3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void g(rp rpVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i2 = i;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f2 = Float.parseFloat(strSubstring3);
                        float f3 = Float.parseFloat(strSubstring4);
                        if (f2 > 0.0f && f3 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(f3 / f2);
                            } else {
                                Math.abs(f2 / f3);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        rpVar.G = str;
    }

    public final void a(Context context, int i) {
        ConstraintLayout constraintLayout;
        int i2;
        HashMap map;
        int i3;
        int i4;
        aq aqVar = this;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        int childCount = constraintLayout2.getChildCount();
        HashMap map2 = aqVar.c;
        map2.clear();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout2.getChildAt(i5);
            rp rpVar = (rp) childAt.getLayoutParams();
            int id = childAt.getId();
            if (aqVar.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map2.containsKey(Integer.valueOf(id))) {
                map2.put(Integer.valueOf(id), new vp());
            }
            vp vpVar = (vp) map2.get(Integer.valueOf(id));
            if (vpVar == null) {
                constraintLayout = constraintLayout2;
                i2 = childCount;
                map = map2;
                i3 = i5;
            } else {
                yp ypVar = vpVar.b;
                wp wpVar = vpVar.d;
                zp zpVar = vpVar.e;
                constraintLayout = constraintLayout2;
                HashMap map3 = new HashMap();
                i2 = childCount;
                Class<?> cls = childAt.getClass();
                map = map2;
                HashMap map4 = aqVar.a;
                for (String str : map4.keySet()) {
                    op opVar = (op) map4.get(str);
                    HashMap map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            i4 = i5;
                            try {
                                map3.put(str, new op(opVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                StringBuilder sbN = q51.n(" Custom Attribute \"", str, "\" not found on ");
                                sbN.append(cls.getName());
                                Log.e("TransitionLayout", sbN.toString(), e);
                            } catch (NoSuchMethodException e3) {
                                e = e3;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                            } catch (InvocationTargetException e4) {
                                e = e4;
                                StringBuilder sbN2 = q51.n(" Custom Attribute \"", str, "\" not found on ");
                                sbN2.append(cls.getName());
                                Log.e("TransitionLayout", sbN2.toString(), e);
                            }
                        } else {
                            i4 = i5;
                            map3.put(str, new op(opVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e5) {
                        e = e5;
                        i4 = i5;
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                        i4 = i5;
                    } catch (InvocationTargetException e7) {
                        e = e7;
                        i4 = i5;
                    }
                    map4 = map5;
                    i5 = i4;
                }
                i3 = i5;
                vpVar.f = map3;
                vpVar.a = id;
                wpVar.h = rpVar.e;
                wpVar.i = rpVar.f;
                wpVar.j = rpVar.g;
                wpVar.k = rpVar.h;
                wpVar.l = rpVar.i;
                wpVar.m = rpVar.j;
                wpVar.n = rpVar.k;
                wpVar.o = rpVar.l;
                wpVar.p = rpVar.m;
                wpVar.q = rpVar.n;
                wpVar.r = rpVar.o;
                wpVar.s = rpVar.s;
                wpVar.t = rpVar.t;
                wpVar.u = rpVar.u;
                wpVar.v = rpVar.v;
                wpVar.w = rpVar.E;
                wpVar.x = rpVar.F;
                wpVar.y = rpVar.G;
                wpVar.z = rpVar.p;
                wpVar.A = rpVar.q;
                wpVar.B = rpVar.r;
                wpVar.C = rpVar.T;
                wpVar.D = rpVar.U;
                wpVar.E = rpVar.V;
                wpVar.f = rpVar.c;
                wpVar.d = rpVar.a;
                wpVar.e = rpVar.b;
                wpVar.b = ((ViewGroup.MarginLayoutParams) rpVar).width;
                wpVar.c = ((ViewGroup.MarginLayoutParams) rpVar).height;
                wpVar.F = ((ViewGroup.MarginLayoutParams) rpVar).leftMargin;
                wpVar.G = ((ViewGroup.MarginLayoutParams) rpVar).rightMargin;
                wpVar.H = ((ViewGroup.MarginLayoutParams) rpVar).topMargin;
                wpVar.I = ((ViewGroup.MarginLayoutParams) rpVar).bottomMargin;
                wpVar.L = rpVar.D;
                wpVar.T = rpVar.I;
                wpVar.U = rpVar.H;
                wpVar.W = rpVar.K;
                wpVar.V = rpVar.J;
                wpVar.l0 = rpVar.W;
                wpVar.m0 = rpVar.X;
                wpVar.X = rpVar.L;
                wpVar.Y = rpVar.M;
                wpVar.Z = rpVar.P;
                wpVar.a0 = rpVar.Q;
                wpVar.b0 = rpVar.N;
                wpVar.c0 = rpVar.O;
                wpVar.d0 = rpVar.R;
                wpVar.e0 = rpVar.S;
                wpVar.k0 = rpVar.Y;
                wpVar.N = rpVar.x;
                wpVar.P = rpVar.z;
                wpVar.M = rpVar.w;
                wpVar.O = rpVar.y;
                wpVar.R = rpVar.A;
                wpVar.Q = rpVar.B;
                wpVar.S = rpVar.C;
                wpVar.o0 = rpVar.Z;
                wpVar.J = rpVar.getMarginEnd();
                wpVar.K = rpVar.getMarginStart();
                ypVar.a = childAt.getVisibility();
                ypVar.c = childAt.getAlpha();
                zpVar.a = childAt.getRotation();
                zpVar.b = childAt.getRotationX();
                zpVar.c = childAt.getRotationY();
                zpVar.d = childAt.getScaleX();
                zpVar.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    zpVar.f = pivotX;
                    zpVar.g = pivotY;
                }
                zpVar.i = childAt.getTranslationX();
                zpVar.j = childAt.getTranslationY();
                zpVar.k = childAt.getTranslationZ();
                if (zpVar.l) {
                    zpVar.m = childAt.getElevation();
                }
                if (childAt instanceof yf) {
                    yf yfVar = (yf) childAt;
                    wpVar.n0 = yfVar.getAllowsGoneWidget();
                    wpVar.i0 = yfVar.getReferencedIds();
                    wpVar.f0 = yfVar.getType();
                    wpVar.g0 = yfVar.getMargin();
                }
            }
            i5 = i3 + 1;
            aqVar = this;
            constraintLayout2 = constraintLayout;
            childCount = i2;
            map2 = map;
        }
    }

    public final void d(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    vp vpVarC = c(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        vpVarC.d.a = true;
                    }
                    this.c.put(Integer.valueOf(vpVarC.a), vpVarC);
                }
            }
        } catch (IOException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        } catch (XmlPullParserException e3) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e3);
        }
    }
}
