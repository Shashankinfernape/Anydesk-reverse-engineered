package com.anydesk.anydeskandroid.adcontrol;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.jnilib.Logging;
import com.samsung.android.knox.license.EnterpriseLicenseManager;
import com.samsung.android.knox.license.KnoxEnterpriseLicenseManager;
import defpackage.gr0;

/* JADX INFO: loaded from: classes.dex */
public class SamsungLicenseReceiver extends BroadcastReceiver {
    public final Logging a = new Logging("SamsungLicenseReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String strConcat;
        boolean z = false;
        if (intent == null) {
            strConcat = "no intent available";
        } else {
            String action = intent.getAction();
            if (action == null) {
                strConcat = "no action available";
            } else {
                if (action.equals(KnoxEnterpriseLicenseManager.ACTION_LICENSE_STATUS)) {
                    int intExtra = intent.getIntExtra(KnoxEnterpriseLicenseManager.EXTRA_LICENSE_ERROR_CODE, 102);
                    String stringExtra = intent.getStringExtra(KnoxEnterpriseLicenseManager.EXTRA_LICENSE_STATUS);
                    int intExtra2 = intent.getIntExtra(KnoxEnterpriseLicenseManager.EXTRA_LICENSE_RESULT_TYPE, 0);
                    strConcat = (intExtra == 0 ? "license operation successful" : gr0.e(intExtra, "license operation failed error=")) + " status=" + stringExtra + " result=" + intExtra2;
                } else if (action.equals(EnterpriseLicenseManager.ACTION_LICENSE_STATUS)) {
                    int intExtra3 = intent.getIntExtra(EnterpriseLicenseManager.EXTRA_LICENSE_ERROR_CODE, 102);
                    String stringExtra2 = intent.getStringExtra(EnterpriseLicenseManager.EXTRA_LICENSE_STATUS);
                    int intExtra4 = intent.getIntExtra(EnterpriseLicenseManager.EXTRA_LICENSE_RESULT_TYPE, 0);
                    int intExtra5 = intent.getIntExtra(EnterpriseLicenseManager.EXTRA_LICENSE_ATTESTATION_STATUS, 3);
                    strConcat = (intExtra3 == 0 ? "support license operation successful" : gr0.e(intExtra3, "support license operation failed error=")) + " status=" + stringExtra2 + " result=" + intExtra4 + " attestation=" + intExtra5;
                } else if (action.equals("edm.intent.action.knox_license.status")) {
                    int intExtra6 = intent.getIntExtra("edm.intent.extra.knox_license.errorcode", 102);
                    String stringExtra3 = intent.getStringExtra("edm.intent.extra.knox_license.status");
                    int intExtra7 = intent.getIntExtra("edm.intent.extra.license.result_type", 0);
                    int intExtra8 = intent.getIntExtra("edm.intent.extra.knox_license.activaton_initiator", 0);
                    strConcat = (intExtra6 == 0 ? "ud license operation successful" : gr0.e(intExtra6, "ud license operation failed error=")) + " status=" + stringExtra3 + " result=" + intExtra7 + " initiator=" + intExtra8;
                } else if (action.equals("edm.intent.action.license.status")) {
                    int intExtra9 = intent.getIntExtra("edm.intent.extra.license.errorcode", 102);
                    String stringExtra4 = intent.getStringExtra("edm.intent.extra.license.status");
                    int intExtra10 = intent.getIntExtra("edm.intent.extra.license.result_type", 0);
                    int intExtra11 = intent.getIntExtra("com.sec.enterprise.intent.extra.LICENSE_ATTESTATION_STATUS", 3);
                    strConcat = (intExtra9 == 0 ? "ud support license operation successful" : gr0.e(intExtra9, "ud support license operation failed error=")) + " status=" + stringExtra4 + " result=" + intExtra10 + " attestation=" + intExtra11;
                } else {
                    strConcat = "unknown action: ".concat(action);
                }
                z = true;
            }
        }
        this.a.e(strConcat);
        if (z) {
            MainApplication.v().U.b();
        }
    }
}
