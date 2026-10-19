package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class lh extends lo0 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lh(int i, boolean z) {
        super(z);
        this.r = i;
    }

    @Override // defpackage.lo0
    public final Object a(String str, Bundle bundle) {
        switch (this.r) {
            case 0:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || lk0.B(str, bundle)) {
                    return null;
                }
                boolean z = bundle.getBoolean(str, false);
                if (z || !bundle.getBoolean(str, true)) {
                    return Boolean.valueOf(z);
                }
                bu0.u(str);
                throw null;
            case 1:
                bundle.getClass();
                str.getClass();
                float f = bundle.getFloat(str, Float.MIN_VALUE);
                if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
                    return Float.valueOf(f);
                }
                bu0.u(str);
                throw null;
            case 2:
                bundle.getClass();
                str.getClass();
                return Integer.valueOf(lk0.s(str, bundle));
            case 3:
                bundle.getClass();
                str.getClass();
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return Long.valueOf(j);
                }
                bu0.u(str);
                throw null;
            case 4:
                bundle.getClass();
                str.getClass();
                return Integer.valueOf(lk0.s(str, bundle));
            default:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || lk0.B(str, bundle)) {
                    return null;
                }
                String string = bundle.getString(str);
                if (string != null) {
                    return string;
                }
                bu0.u(str);
                throw null;
        }
    }

    @Override // defpackage.lo0
    public final String b() {
        switch (this.r) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            case 4:
                return "reference";
            default:
                return "string";
        }
    }

    @Override // defpackage.lo0
    public final Object d(String str) {
        int i;
        long j;
        int i2;
        boolean z = true;
        switch (this.r) {
            case 0:
                str.getClass();
                if (!str.equals("true")) {
                    if (!str.equals("false")) {
                        id.q("A boolean NavType only accepts \"true\" or \"false\" values.");
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                str.getClass();
                return Float.valueOf(Float.parseFloat(str));
            case 2:
                str.getClass();
                if (str.startsWith("0x")) {
                    String strSubstring = str.substring(2);
                    th1.d(16);
                    i = Integer.parseInt(strSubstring, 16);
                } else {
                    i = Integer.parseInt(str);
                }
                return Integer.valueOf(i);
            case 3:
                str.getClass();
                String strSubstring2 = str.endsWith("L") ? str.substring(0, str.length() - 1) : str;
                if (str.startsWith("0x")) {
                    String strSubstring3 = strSubstring2.substring(2);
                    th1.d(16);
                    j = Long.parseLong(strSubstring3, 16);
                } else {
                    j = Long.parseLong(strSubstring2);
                }
                return Long.valueOf(j);
            case 4:
                str.getClass();
                if (str.startsWith("0x")) {
                    String strSubstring4 = str.substring(2);
                    th1.d(16);
                    i2 = Integer.parseInt(strSubstring4, 16);
                } else {
                    i2 = Integer.parseInt(str);
                }
                return Integer.valueOf(i2);
            default:
                str.getClass();
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // defpackage.lo0
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.r) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                str.getClass();
                bundle.putBoolean(str, zBooleanValue);
                break;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                str.getClass();
                bundle.putFloat(str, fFloatValue);
                break;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, iIntValue);
                break;
            case 3:
                long jLongValue = ((Number) obj).longValue();
                str.getClass();
                bundle.putLong(str, jLongValue);
                break;
            case 4:
                int iIntValue2 = ((Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, iIntValue2);
                break;
            default:
                String str2 = (String) obj;
                str.getClass();
                if (str2 == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putString(str, str2);
                }
                break;
        }
    }

    @Override // defpackage.lo0
    public String f(Object obj) {
        switch (this.r) {
            case 5:
                String str = (String) obj;
                if (str == null) {
                    return "null";
                }
                String strEncode = Uri.encode(str, null);
                strEncode.getClass();
                return strEncode;
            default:
                return super.f(obj);
        }
    }
}
