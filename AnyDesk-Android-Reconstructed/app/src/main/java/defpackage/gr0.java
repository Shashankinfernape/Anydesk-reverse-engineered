package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class gr0 {
    public static final void a(View view, int i) {
        view.getClass();
        int iR = q51.r(i);
        if (iR == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (t40.H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iR == 1) {
            if (t40.H(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (iR == 2) {
            if (t40.H(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iR != 3) {
            return;
        }
        if (t40.H(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static boolean b(ArrayList arrayList, int i, int i2) {
        if (i != 1) {
            return i2 >= 0 && i2 <= arrayList.size() - 1;
        }
        return i2 >= 0;
    }

    public static /* synthetic */ int c(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                return 14;
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                return 15;
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                return 16;
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                return 17;
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                return 18;
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                return 19;
            case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                return 20;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int d(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 0;
        }
        throw null;
    }

    public static String e(int i, String str) {
        return str + i;
    }

    public static String f(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static /* synthetic */ void g(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            d30.a((ExecutorService) autoCloseable);
            return;
        }
        if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
        } else if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else {
            if (!(autoCloseable instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) autoCloseable).release();
        }
    }

    public static /* synthetic */ String h(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i != 2) {
            return i != 3 ? "null" : "REMOVING";
        }
        return "ADDING";
    }

    public static /* synthetic */ String i(int i) {
        if (i == 1) {
            return "REMOVED";
        }
        if (i == 2) {
            return "VISIBLE";
        }
        if (i != 3) {
            return i != 4 ? "null" : "INVISIBLE";
        }
        return "GONE";
    }
}
