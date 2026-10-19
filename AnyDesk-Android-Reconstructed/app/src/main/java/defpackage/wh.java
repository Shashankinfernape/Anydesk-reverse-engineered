package defpackage;

import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcelable;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionSettingsFragmentVpn;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class wh implements Runnable {
    public final /* synthetic */ int c;
    public Object d;
    public Object e;
    public Object f;

    public /* synthetic */ wh(Object obj, Object obj2, Object obj3, int i) {
        this.c = i;
        this.f = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        boolean z = true;
        Object objCall = null;
        boolean z2 = false;
        switch (this.c) {
            case 0:
                yh yhVar = ((xh) this.f).a;
                yhVar.e = false;
                if (y6.j(yhVar.b, ((ComponentName) this.d).getPackageName())) {
                    yhVar.a = new Messenger((IBinder) this.e);
                    ArrayDeque arrayDeque = yhVar.h;
                    while (!arrayDeque.isEmpty()) {
                        yhVar.a((d11) arrayDeque.poll());
                    }
                } else {
                    ArrayDeque arrayDeque2 = yhVar.h;
                    while (!arrayDeque2.isEmpty()) {
                        le0 le0Var = ((d11) arrayDeque2.poll()).b;
                        if (le0Var != null) {
                            le0Var.u(0, null);
                        }
                    }
                    yhVar.f = true;
                }
                break;
            case 1:
                Context context = (Context) this.d;
                mj mjVar = (mj) this.f;
                mjVar.d = er0.b();
                JniAdExt.F = mjVar;
                Point pointA = mjVar.b;
                if (pointA == null) {
                    pointA = er0.a();
                }
                int i = pointA.x;
                mjVar.e = i;
                int i2 = pointA.y;
                mjVar.f = i2;
                mjVar.b(i, i2, mjVar.d);
                gj gjVar = new gj(this, context);
                mjVar.q = gjVar;
                boolean zCanDetectOrientation = gjVar.canDetectOrientation();
                Logging logging = mjVar.a;
                if (zCanDetectOrientation) {
                    logging.e("setup orientation detection");
                    mjVar.q.enable();
                } else {
                    logging.e("orientation detection not supported");
                }
                mjVar.r = new hj(this);
                DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                mjVar.s = displayManager;
                if (displayManager != null) {
                    displayManager.registerDisplayListener(mjVar.r, (Handler) this.e);
                }
                break;
            case 2:
                ((ConnectionSettingsFragmentVpn) this.f).Q0((String) this.d, (String) this.e);
                break;
            case 3:
                af1 af1Var = (af1) this.e;
                y6 y6Var = (y6) this.f;
                HashSet<qf> hashSet = (HashSet) this.d;
                if (hashSet.isEmpty()) {
                    af1Var.u(0, null);
                } else {
                    HashMap map = (HashMap) y6Var.e;
                    HashMap map2 = (HashMap) y6Var.e;
                    Context context2 = (Context) y6Var.d;
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String str = (String) entry.getKey();
                        if ((Build.VERSION.SDK_INT < 26 && ((yh) map.get(str)).e) || ((yh) map.get(str)).f || !y6.j(context2, str)) {
                            yh yhVar2 = (yh) entry.getValue();
                            if (!yhVar2.g) {
                                nh0.j("bindService must be called before unbind");
                            } else {
                                yhVar2.f = true;
                                yhVar2.b.unbindService(yhVar2.j);
                                it.remove();
                            }
                            break;
                        }
                    }
                    DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context2.getSystemService("device_policy");
                    List<ComponentName> activeAdmins = devicePolicyManager.getActiveAdmins();
                    if (activeAdmins == null) {
                        arrayList = new ArrayList();
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        for (ComponentName componentName : activeAdmins) {
                            if (devicePolicyManager.isDeviceOwnerApp(componentName.getPackageName()) || devicePolicyManager.isProfileOwnerApp(componentName.getPackageName())) {
                                arrayList2.add(componentName.getPackageName());
                            }
                        }
                        arrayList = arrayList2;
                    }
                    arrayList.add("com.android.vending");
                    HashSet hashSet2 = new HashSet();
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        String str2 = (String) obj;
                        if (!map2.containsKey(str2)) {
                            hashSet2.add(str2);
                        }
                    }
                    if (!hashSet2.isEmpty()) {
                        List<ResolveInfo> listQueryIntentServices = context2.getPackageManager().queryIntentServices(new Intent("androidx.enterprise.feedback.action.APP_STATES"), 0);
                        ArrayList arrayList3 = new ArrayList();
                        for (ResolveInfo resolveInfo : listQueryIntentServices) {
                            if (hashSet2.contains(resolveInfo.serviceInfo.packageName)) {
                                arrayList3.add(resolveInfo.serviceInfo);
                            }
                        }
                        int size2 = arrayList3.size();
                        int i4 = 0;
                        while (i4 < size2) {
                            Object obj2 = arrayList3.get(i4);
                            i4++;
                            ServiceInfo serviceInfo = (ServiceInfo) obj2;
                            Intent intent = new Intent();
                            intent.setComponent(new ComponentName(serviceInfo.packageName, serviceInfo.name));
                            yh yhVar3 = new yh((ThreadPoolExecutor) y6Var.f, context2, intent);
                            if (yhVar3.g) {
                                nh0.j("Each BufferedServiceConnection can only be bound once.");
                            } else {
                                yhVar3.g = z;
                                yhVar3.b.bindService(yhVar3.c, yhVar3.j, yhVar3.d);
                                map2.put(serviceInfo.packageName, yhVar3);
                                z = true;
                            }
                        }
                    }
                    Bundle bundle = new Bundle();
                    ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                    for (qf qfVar : hashSet) {
                        qfVar.getClass();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("androidx.enterprise.feedback.APP_STATE_KEY", "ad.client_id");
                        bundle2.putInt("androidx.enterprise.feedback.APP_STATE_SEVERITY", qfVar.a);
                        bundle2.putString("androidx.enterprise.feedback.APP_STATE_MESSAGE", "AnyDesk Client ID");
                        String str3 = qfVar.b;
                        if (str3 != null) {
                            bundle2.putString("androidx.enterprise.feedback.APP_STATE_DATA", str3);
                        }
                        arrayList4.add(bundle2);
                    }
                    bundle.putParcelableArrayList("androidx.enterprise.feedback.APP_STATES", arrayList4);
                    me0 me0Var = new me0(map2.size(), af1Var);
                    for (yh yhVar4 : map2.values()) {
                        d11 d11Var = new d11(bundle, me0Var);
                        ArrayDeque arrayDeque3 = yhVar4.h;
                        if (yhVar4.f) {
                            me0Var.u(0, null);
                        } else if (yhVar4.a == null) {
                            while (arrayDeque3.size() >= 100) {
                                ((d11) arrayDeque3.poll()).a(3, null);
                            }
                            arrayDeque3.add(d11Var);
                        } else {
                            yhVar4.a(d11Var);
                        }
                    }
                }
                break;
            case 4:
                bo0 bo0VarP = uj.p((Activity) this.d);
                MainActivity mainActivity = (MainActivity) this.f;
                mainActivity.v0((Toolbar) this.e, bo0VarP, mainActivity.L);
                break;
            case 5:
                try {
                    objCall = ((j30) this.d).call();
                    break;
                } catch (Exception unused) {
                }
                ((Handler) this.f).post(new d3((k30) this.e, objCall, 25, z2));
                break;
            default:
                xt0 xt0Var = (xt0) this.f;
                xt0Var.d = t70.f0((Context) this.d, (String) this.e, 0, (Toast) xt0Var.d);
                break;
        }
    }

    public /* synthetic */ wh() {
        this.c = 5;
    }
}
