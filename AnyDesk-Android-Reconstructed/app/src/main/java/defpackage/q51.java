package defpackage;

import android.content.pm.PackageManager;
import android.os.Binder;
import android.view.MenuItem;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import com.samsung.android.knox.EnterpriseDeviceManager;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class q51 {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126};

    public static final int a(int i, mz mzVar, mz mzVar2, int i2) {
        return mzVar.c.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").compareTo(mzVar2.c.toLowerCase().replaceAll("[^a-zA-Z0-9]", "")) * (i2 == 2 ? -1 : 1);
    }

    public static int b(int i) {
        for (int i2 : s(17)) {
            if (r(i2) == i) {
                return i2;
            }
        }
        return 9;
    }

    public static int c(n11 n11Var) {
        int i = n11Var.c;
        boolean z = (i & 128) == 128;
        boolean z2 = (i & 2) == 2;
        boolean z3 = (i & 1) == 1;
        if (!z2 || z3) {
            return (!z || z3) ? 2 : 4;
        }
        return 3;
    }

    public static final int d(int i) {
        return r(i) + 23600;
    }

    public static final boolean e(int i, du0 du0Var) {
        int iR = r(i);
        if (iR != 1) {
            if (iR != 2 && iR != 3) {
                return false;
            }
            if (du0Var != du0.pf_file_manager && du0Var != du0.pf_sysinfo && du0Var != du0.pf_vpn && du0Var != du0.pf_tcp_tunnel) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean f(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static /* synthetic */ String g(int i) {
        switch (i) {
            case 1:
                return "ad.license.feature.previous_session_profiles";
            case 2:
                return "ad.license.feature.no_lockdown";
            case 3:
                return "ad.license.feature.lockdown.link";
            case 4:
                return "ad.license.feature.lockdown.info_link";
            case 5:
                return "ad.license.feature.lockdown.title_str";
            case 6:
                return "ad.license.feature.lockdown.message_str";
            case 7:
                return "ad.license.feature.lockdown.action_str";
            case 8:
                return "ad.license.feature.privacy";
            case 9:
                return "ad.license.feature.remote_restart";
            case 10:
                return "ad.license.feature.alias";
            case 11:
                return "ad.license.feature.invitation";
            case 12:
                return "ad.license.feature.file_manager";
            case 13:
                return "ad.license.feature.chat";
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                return "ad.license.feature.individual_session_settings";
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                return "ad.license.feature.session_recording";
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                return "ad.license.feature.tcp_tun";
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                return "ad.license.info.tcp_tun.rules_limit";
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                return "ad.license.info.tcp_tun.reverse_rules_limit";
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                return "ad.license.feature.hide_session_banner";
            case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                return "ad.license.feature.hide_license_expire_tile";
            case 21:
                return "ad.license.feature.hide_watermark";
            case 22:
                return "ad.license.info.license_expire_tile.title";
            case 23:
                return "ad.license.info.license_expire_tile.message";
            case 24:
                return "ad.license.info.license_expire_tile.shown_link";
            case 25:
                return "ad.license.info.license_expire_tile.link";
            case 26:
                return "ad.license.info.license_expire_tile.color_one";
            case 27:
                return "ad.license.info.license_expire_tile.color_two";
            case 28:
                return "ad.license.info.auto_disconnect_timer";
            default:
                throw null;
        }
    }

    public static float h(float f, float f2) {
        return (er0.d() * f) / f2;
    }

    public static long i(PackageManager packageManager) {
        d51.a(packageManager, Binder.getCallingUid());
        return Binder.clearCallingIdentity();
    }

    public static MenuItem j(String str, MenuItem menuItem, rk0 rk0Var, int i) {
        menuItem.setTitle(JniAdExt.n1(str));
        return rk0Var.findItem(i);
    }

    public static String k(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String l(String str, c40 c40Var, String str2) {
        return str + c40Var + str2;
    }

    public static String m(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder n(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void o(Throwable th, StringBuilder sb, Logging logging) {
        sb.append(th.getMessage());
        logging.a(sb.toString());
    }

    public static /* synthetic */ boolean p(Object obj) {
        return obj != null;
    }

    public static /* synthetic */ String q(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ int r(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] s(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }
}
