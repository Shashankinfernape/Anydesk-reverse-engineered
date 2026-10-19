package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.view.View;
import android.webkit.SslErrorHandler;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.PermissionProfile;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.anydeskandroid.gui.activity.GlowActivity;
import com.anydesk.anydeskandroid.gui.activity.HubActivity;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterFragment;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterItemDetailsFragment;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jni.JniImeConnection;
import com.anydesk.jnilib.Logging;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c0(ArrayList arrayList, a61 a61Var, ct ctVar) {
        this.c = 6;
        this.e = arrayList;
        this.d = a61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object value;
        RosterItem rosterItem;
        br0 br0Var;
        l3 l3Var;
        z80 z80Var;
        PermissionProfile permissionProfile;
        int i = this.c;
        io ioVar = io.KEY_ONLINE_STATUS_RECEIVE;
        int i2 = 0;
        Object obj = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                u1 u1Var = ((AbookRosterFragment) obj2).a0;
                u1Var.getClass();
                map.getClass();
                if (JniAdExt.h2(ioVar) != 0) {
                    e71 e71Var = u1Var.d;
                    do {
                        value = e71Var.getValue();
                    } while (!e71Var.g(value, v1.a((v1) value, null, false, null, null, null, false, false, false, null, map, 511)));
                    return;
                }
                return;
            case 1:
                AbookRosterItemDetailsFragment abookRosterItemDetailsFragment = (AbookRosterItemDetailsFragment) obj2;
                Map map2 = (Map) obj;
                if (JniAdExt.h2(ioVar) == 0 || (rosterItem = abookRosterItemDetailsFragment.p0) == null || (br0Var = (br0) map2.get(Long.valueOf(rosterItem.mCid))) == null) {
                    return;
                }
                RosterItem rosterItem2 = abookRosterItemDetailsFragment.p0;
                if (br0Var != rosterItem2.mOnlineState) {
                    abookRosterItemDetailsFragment.p0 = rosterItem2.a(rosterItem2.mUserDefinedName, rosterItem2.mThumbnailPath, rosterItem2.b, br0Var);
                    abookRosterItemDetailsFragment.Q0();
                    return;
                }
                return;
            case 2:
                k3 k3Var = (k3) obj2;
                ((View) obj).findViewById(R.id.dialog_accept_permissions_ctrl_icon);
                MainApplication mainApplicationV = MainApplication.v();
                mainApplicationV.getClass();
                t70.V(new c0(mainApplicationV, 13, (Object) null));
                if (k3Var.I0 || (l3Var = k3Var.u0) == null || (z80Var = l3Var.b) == null || (permissionProfile = z80Var.l) == null) {
                    return;
                }
                Hashtable hashtable = z80Var.n;
                du0 du0Var = du0.pf_input;
                if (permissionProfile.a(du0Var, hashtable)) {
                    z80 z80Var2 = k3Var.u0.b;
                    JniAdExt.D4(z80Var2.a, du0Var, !z80Var2.l.m.contains(du0Var));
                    return;
                }
                return;
            case 3:
                y6 y6Var = (y6) obj2;
                AdEditText adEditText = (AdEditText) obj;
                tl0 tl0Var = (tl0) y6Var.e;
                tl0Var.getClass();
                try {
                    tl0Var.a.a(new Intent("android.speech.action.RECOGNIZE_SPEECH"));
                    return;
                } catch (ActivityNotFoundException unused) {
                    ((xt0) y6Var.f).u(adEditText.getContext(), JniAdExt.n1("ad.msg.microphone_failed.android"));
                    return;
                }
            case 4:
                za zaVar = (za) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } finally {
                    zaVar.a();
                }
            case 5:
                qa qaVar = (qa) obj2;
                int i3 = co.v;
                qaVar.c.a(new un((wq0) obj, i2, qaVar));
                return;
            case 6:
                ArrayList arrayList = (ArrayList) obj2;
                a61 a61Var = (a61) obj;
                if (arrayList.contains(a61Var)) {
                    arrayList.remove(a61Var);
                    View view = a61Var.c.H;
                    int i4 = a61Var.a;
                    view.getClass();
                    gr0.a(view, i4);
                    return;
                }
                return;
            case 7:
                ((xi) obj2).F((o70) obj);
                return;
            case 8:
                JniAdExt.o0.A(nd0.t((byte[]) obj2), nd0.t((byte[]) obj));
                return;
            case 9:
                Bitmap bitmap = JniAdExt.a;
                ((HubActivity) obj2).getClass();
                MainApplication mainApplicationV2 = MainApplication.v();
                mainApplicationV2.N();
                c0 c0Var = new c0(mainApplicationV2, 12, (String[]) obj);
                mainApplicationV2.d.e("waiting for service termination...");
                new fi0(mainApplicationV2, c0Var).start();
                return;
            case 10:
                byte[] bArr = (byte[]) obj;
                Bitmap bitmap2 = JniAdExt.a;
                JniImeConnection jniImeConnection = ((GlowActivity) obj2).h;
                if (jniImeConnection == null || bArr == null) {
                    return;
                }
                jniImeConnection.f(bArr);
                return;
            case 11:
                JniImeConnection.a((JniImeConnection) ((d00) obj2).l, (String) obj);
                return;
            case 12:
                MainApplication mainApplication = (MainApplication) obj2;
                String[] strArr = (String[]) obj;
                Logging logging = mainApplication.d;
                logging.e("restarting...");
                try {
                    Context applicationContext = mainApplication.getApplicationContext();
                    Intent intentMakeRestartActivityTask = Intent.makeRestartActivityTask(new ComponentName(applicationContext, (Class<?>) HubActivity.class));
                    if (strArr != null) {
                        intentMakeRestartActivityTask.putExtra("args", strArr);
                    }
                    applicationContext.startActivity(intentMakeRestartActivityTask);
                    System.exit(0);
                    return;
                } catch (Throwable th) {
                    q51.o(th, new StringBuilder("unable to restart application: "), logging);
                    return;
                }
            case 13:
                ((MainApplication) obj2).h.k((Boolean) obj);
                return;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                ((uj) obj2).A((Typeface) obj);
                return;
            default:
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) obj2;
                SslErrorHandler sslErrorHandler = (SslErrorHandler) obj;
                Logging logging2 = y90.h;
                try {
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode != 200 && responseCode != 404) {
                        logging2.h("web response code = " + responseCode);
                    }
                    sslErrorHandler.proceed();
                    return;
                } catch (Throwable th2) {
                    logging2.b("failed to get web response", th2);
                    sslErrorHandler.cancel();
                    return;
                }
        }
    }

    public /* synthetic */ c0(Object obj, int i, Object obj2) {
        this.c = i;
        this.e = obj;
        this.d = obj2;
    }
}
