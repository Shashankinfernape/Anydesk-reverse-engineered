package defpackage;

import android.content.Context;
import android.os.Looper;
import android.text.format.Formatter;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.jni.JniAdExt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class s70 implements Runnable {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Serializable g;

    public s70(gq0 gq0Var, long j, long j2, String str) {
        this.f = gq0Var;
        this.d = j;
        this.e = j2;
        this.g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                String str = (String) obj;
                gq0 gq0Var = (gq0) obj2;
                if (gq0Var != null) {
                    long j = this.d;
                    long j2 = this.e;
                    if (j <= 0) {
                        Context context = gq0Var.b;
                        if (context != null && gq0Var.c != null) {
                            dq0 dq0Var = new dq0(context, "anydesk");
                            dq0Var.o = "anydesk";
                            dq0Var.w.icon = R.drawable.ic_notify_copy;
                            Looper looper = t70.a;
                            dq0Var.q = uj.l(context, R.color.colorPrimary);
                            dq0Var.f(str);
                            dq0Var.e(JniAdExt.n1("ad.status.select_files.progress.msg") + " (" + Formatter.formatFileSize(context, j2) + ")");
                            dq0Var.j(true);
                            dq0Var.r = 1;
                            gq0Var.c.notify(102, dq0Var.b());
                            break;
                        }
                    } else {
                        int i2 = (int) ((j2 * 100) / j);
                        Context context2 = gq0Var.b;
                        if (context2 != null && gq0Var.c != null) {
                            dq0 dq0Var2 = new dq0(context2, "anydesk");
                            dq0Var2.o = "anydesk";
                            dq0Var2.w.icon = R.drawable.ic_notify_copy;
                            Looper looper2 = t70.a;
                            dq0Var2.q = uj.l(context2, R.color.colorPrimary);
                            dq0Var2.f(str);
                            dq0Var2.e(JniAdExt.n1("ad.status.select_files.progress.msg"));
                            dq0Var2.m = 100;
                            dq0Var2.n = i2;
                            dq0Var2.j(true);
                            dq0Var2.r = 1;
                            gq0Var.c.notify(102, dq0Var2.b());
                            break;
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                RosterItem rosterItem = (RosterItem) obj2;
                Collections.addAll(hashSet, rosterItem.b);
                String[] strArr = (String[]) obj;
                Collections.addAll(hashSet2, strArr);
                for (String str2 : rosterItem.b) {
                    if (!hashSet2.contains(str2)) {
                        arrayList.add(str2);
                    }
                }
                for (String str3 : strArr) {
                    if (!hashSet.contains(str3)) {
                        arrayList2.add(str3);
                    }
                }
                JniAdExt.jniUpdateRosterItemTags(this.d, this.e, nd0.T(nd0.f(arrayList)), nd0.T(nd0.f(arrayList2)));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s70(RosterItem rosterItem, String[] strArr, long j, long j2) {
        this.f = rosterItem;
        this.g = strArr;
        this.d = j;
        this.e = j2;
    }
}
