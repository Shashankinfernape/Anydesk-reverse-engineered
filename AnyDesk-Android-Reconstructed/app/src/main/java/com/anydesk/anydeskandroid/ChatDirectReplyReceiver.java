package com.anydesk.anydeskandroid;

import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.anydesk.jni.JniAdExt;
import defpackage.cb0;
import defpackage.cj0;
import defpackage.dq0;
import defpackage.el;
import defpackage.gq0;
import defpackage.gr0;

/* JADX INFO: loaded from: classes.dex */
public class ChatDirectReplyReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        CharSequence charSequence;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        int i = extras.getInt("session_idx", 0);
        String strTrim = "";
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        int i2 = 1;
        if (resultsFromIntent != null && (charSequence = resultsFromIntent.getCharSequence("anydesk_chat_direct_reply")) != null) {
            strTrim = charSequence.toString().trim();
            if (!strTrim.isEmpty()) {
                JniAdExt.I0.post(new cb0(i, strTrim, i2));
            }
        }
        Bitmap bitmap = JniAdExt.a;
        MainApplication mainApplicationV = MainApplication.v();
        cj0 cj0Var = mainApplicationV.u;
        if (strTrim.isEmpty()) {
            gq0 gq0Var = new gq0(JniAdExt.d);
            if (gq0Var.c != null && gq0Var.b != null) {
                dq0 dq0VarC = gq0Var.c(i, gq0Var.j(i));
                dq0VarC.f(strTrim.isEmpty() ? JniAdExt.n1("ad.status.chat.send") : JniAdExt.n1("ad.chat.sent"));
                if (!strTrim.isEmpty()) {
                    dq0VarC.e(strTrim);
                }
                dq0VarC.u = 2000L;
                dq0VarC.r = 1;
                gq0Var.c.notify(gr0.e(i, ""), 800, dq0VarC.b());
            }
        } else if (i != 0 ? mainApplicationV.o0 == 1 : mainApplicationV.n0 == 1) {
            gq0 gq0Var2 = new gq0(JniAdExt.d);
            if (gq0Var2.c != null && gq0Var2.b != null) {
                dq0 dq0VarC2 = gq0Var2.c(i, gq0Var2.j(i));
                dq0VarC2.f(JniAdExt.n1("ad.status.chat.session.closed"));
                dq0VarC2.u = 2000L;
                dq0VarC2.r = 1;
                gq0Var2.c.notify(gr0.e(i, ""), 800, dq0VarC2.b());
            }
        } else {
            synchronized (cj0Var) {
                try {
                    if (!strTrim.isEmpty()) {
                        el elVar = (el) cj0Var.j.get(Integer.valueOf(i));
                        if (elVar == null) {
                            el elVar2 = new el(cj0Var.f(i));
                            elVar2.a(strTrim);
                            cj0Var.j.put(Integer.valueOf(i), elVar2);
                        } else {
                            elVar.a(strTrim);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            mainApplicationV.Y(i, 0);
        }
        cj0Var.q(i);
    }
}
