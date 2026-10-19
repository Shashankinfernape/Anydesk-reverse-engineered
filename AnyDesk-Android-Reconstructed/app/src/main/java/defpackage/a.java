package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterFragment;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentAccess;
import com.anydesk.jni.JniAdExt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final Object d;

    public a(gh ghVar) {
        this.c = 4;
        this.d = new WeakReference(ghVar);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        v1 v1Var;
        Set set;
        v1 v1VarA;
        ArrayList arrayList;
        int i2 = this.c;
        int i3 = 0;
        Object obj = this.d;
        switch (i2) {
            case 0:
                d dVar = (d) obj;
                AbookRosterFragment abookRosterFragment = dVar.t0;
                if (abookRosterFragment != null) {
                    Collection collection = dVar.q0;
                    u1 u1Var = abookRosterFragment.a0;
                    u1Var.getClass();
                    collection.getClass();
                    e71 e71Var = u1Var.d;
                    do {
                        v1Var = (v1) e71Var.getValue();
                        if (v1Var.f) {
                            set = v1Var.d;
                        } else {
                            int size = collection.size();
                            if (size == 0) {
                                set = px.c;
                            } else if (size != 1) {
                                LinkedHashSet linkedHashSet = new LinkedHashSet(mj0.P(collection.size()));
                                tm.u0(collection, linkedHashSet);
                                set = linkedHashSet;
                            } else {
                                Set setSingleton = Collections.singleton(collection instanceof List ? ((List) collection).get(0) : collection.iterator().next());
                                setSingleton.getClass();
                                set = setSingleton;
                            }
                        }
                        v1VarA = v1.a(v1Var, null, false, null, set, null, false, false, false, null, null, 1015);
                    } while (!e71Var.g(v1Var, v1VarA));
                    if (!v1VarA.f) {
                        long j = u1.j;
                        z61 z61Var = u1Var.c;
                        if (z61Var != null) {
                            z61Var.b(null);
                        }
                        u1Var.c = th1.B(hq.w(u1Var), null, null, new r1(j, u1Var, false, null), 3);
                    }
                }
                Dialog dialog = dVar.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
            case 1:
                Dialog dialog2 = ((w1) obj).k0;
                if (dialog2 != null) {
                    dialog2.cancel();
                }
                break;
            case 2:
                Dialog dialog3 = ((c5) obj).k0;
                if (dialog3 != null) {
                    dialog3.cancel();
                }
                break;
            case 3:
                uj.v(((d5) obj).Y(), R.id.accountLoginFragment);
                break;
            case 4:
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference.get() != null) {
                    ((gh) weakReference.get()).i(true);
                }
                break;
            case 5:
                Dialog dialog4 = ((lz) obj).k0;
                if (dialog4 != null) {
                    dialog4.cancel();
                }
                break;
            case 6:
                JniAdExt.I0.post(new fb0(9, ((i00) obj).r0));
                break;
            case 7:
                ((f10) obj).r0.i(true);
                break;
            case 8:
                if (((bv0) obj).k0 != null) {
                    t70.b0(MainApplication.v().T, "privacy_statement_shown", false);
                    System.exit(0);
                }
                break;
            case 9:
                Dialog dialog5 = ((l01) obj).k0;
                if (dialog5 != null) {
                    dialog5.cancel();
                }
                break;
            default:
                z11 z11Var = (z11) obj;
                SettingsFragmentAccess settingsFragmentAccess = z11Var.q0;
                if (settingsFragmentAccess != null && (arrayList = z11Var.v0) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(arrayList);
                    JniAdExt.A4(arrayList2);
                    io ioVar = io.KEY_ACL_TRIGGER;
                    JniAdExt.x4(ioVar, true ^ JniAdExt.g2(ioVar));
                    t70.Y(new b31(settingsFragmentAccess, i3));
                }
                break;
        }
    }

    public /* synthetic */ a(xt xtVar, int i) {
        this.c = i;
        this.d = xtVar;
    }
}
