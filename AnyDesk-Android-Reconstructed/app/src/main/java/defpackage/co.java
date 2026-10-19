package defpackage;

import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import com.anydesk.anydeskandroid.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class co extends bo implements cf1, q70, g01 {
    public static final /* synthetic */ int v = 0;
    public final oq d = new oq();
    public final y6 e;
    public final ui0 f;
    public bf1 g;
    public final xn h;
    public final g81 i;
    public final AtomicInteger j;
    public final zn k;
    public final CopyOnWriteArrayList l;
    public final CopyOnWriteArrayList m;
    public final CopyOnWriteArrayList n;
    public final CopyOnWriteArrayList o;
    public final CopyOnWriteArrayList p;
    public final CopyOnWriteArrayList q;
    public boolean r;
    public boolean s;
    public final g81 t;
    public final g81 u;

    public co() {
        final qa qaVar = (qa) this;
        final int i = 0;
        this.e = new y6(new qn(qaVar, i));
        f01 f01Var = new f01(this, new y(8, this));
        ui0 ui0Var = new ui0(f01Var, 8);
        this.f = ui0Var;
        this.h = new xn(qaVar);
        this.i = new g81(new ao(qaVar, 2));
        this.j = new AtomicInteger();
        this.k = new zn(qaVar);
        this.l = new CopyOnWriteArrayList();
        this.m = new CopyOnWriteArrayList();
        this.n = new CopyOnWriteArrayList();
        this.o = new CopyOnWriteArrayList();
        this.p = new CopyOnWriteArrayList();
        this.q = new CopyOnWriteArrayList();
        if0 if0Var = this.c;
        if (if0Var == null) {
            nh0.j("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        if0Var.a(new ef0() { // from class: rn
            @Override // defpackage.ef0
            public final void i(gf0 gf0Var, ze0 ze0Var) {
                Window window;
                View viewPeekDecorView;
                switch (i) {
                    case 0:
                        qa qaVar2 = qaVar;
                        if (ze0Var == ze0.ON_STOP && (window = qaVar2.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        qa qaVar3 = qaVar;
                        if (ze0Var == ze0.ON_DESTROY) {
                            qaVar3.d.b = null;
                            if (!qaVar3.isChangingConfigurations()) {
                                qaVar3.K().a();
                            }
                            xn xnVar = qaVar3.h;
                            qa qaVar4 = xnVar.f;
                            qaVar4.getWindow().getDecorView().removeCallbacks(xnVar);
                            qaVar4.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(xnVar);
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        this.c.a(new ef0() { // from class: rn
            @Override // defpackage.ef0
            public final void i(gf0 gf0Var, ze0 ze0Var) {
                Window window;
                View viewPeekDecorView;
                switch (i2) {
                    case 0:
                        qa qaVar2 = qaVar;
                        if (ze0Var == ze0.ON_STOP && (window = qaVar2.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        qa qaVar3 = qaVar;
                        if (ze0Var == ze0.ON_DESTROY) {
                            qaVar3.d.b = null;
                            if (!qaVar3.isChangingConfigurations()) {
                                qaVar3.K().a();
                            }
                            xn xnVar = qaVar3.h;
                            qa qaVar4 = xnVar.f;
                            qaVar4.getWindow().getDecorView().removeCallbacks(xnVar);
                            qaVar4.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(xnVar);
                        }
                        break;
                }
            }
        });
        this.c.a(new ew0(i2, qaVar));
        f01Var.a();
        lk0.m(this);
        if (Build.VERSION.SDK_INT <= 23) {
            this.c.a(new v80(qaVar));
        }
        ((ui0) ui0Var.d).s("android:support:activity-result", new sn(qaVar, i));
        P(new tn(qaVar, i));
        this.t = new g81(new ao(qaVar, i));
        this.u = new g81(new ao(qaVar, 3));
    }

    @Override // defpackage.cf1
    public final bf1 K() {
        if (getApplication() == null) {
            nh0.j("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.g == null) {
            wn wnVar = (wn) getLastNonConfigurationInstance();
            if (wnVar != null) {
                this.g = wnVar.a;
            }
            if (this.g == null) {
                this.g = new bf1();
            }
        }
        bf1 bf1Var = this.g;
        bf1Var.getClass();
        return bf1Var;
    }

    public final void O(jl0 jl0Var, z6 z6Var) {
        y6 y6Var = this.e;
        y6Var.getClass();
        if0 if0Var = z6Var.Q;
        HashMap map = (HashMap) y6Var.f;
        tk0 tk0Var = (tk0) map.remove(jl0Var);
        if (tk0Var != null) {
            tk0Var.a.f(tk0Var.b);
            tk0Var.b = null;
        }
        map.put(jl0Var, new tk0(if0Var, new un(y6Var, jl0Var)));
    }

    public final void P(xq0 xq0Var) {
        oq oqVar = this.d;
        oqVar.getClass();
        co coVar = oqVar.b;
        if (coVar != null) {
            xq0Var.a(coVar);
        }
        oqVar.a.add(xq0Var);
    }

    @Override // defpackage.gf0
    public final if0 R() {
        return this.c;
    }

    public final ze1 S() {
        return (ze1) this.t.getValue();
    }

    public final wq0 T() {
        return (wq0) this.u.getValue();
    }

    public final void U() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final k6 V(j6 j6Var, hq hqVar) {
        zn znVar = this.k;
        znVar.getClass();
        return znVar.d("activity_rq#" + this.j.getAndIncrement(), this, hqVar, j6Var);
    }

    @Override // defpackage.g01
    public final ui0 b() {
        return (ui0) this.f.d;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.k.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        T().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((eq) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.bo, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f.p(bundle);
        oq oqVar = this.d;
        oqVar.getClass();
        oqVar.b = this;
        Iterator it = oqVar.a.iterator();
        while (it.hasNext()) {
            ((xq0) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = cy0.d;
        ay0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.e.e).iterator();
        while (it.hasNext()) {
            ((jl0) it.next()).v(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.e.e).iterator();
            while (it.hasNext()) {
                if (((jl0) it.next()).o(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.r = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.r = false;
            Iterator it = this.o.iterator();
            while (it.hasNext()) {
                ((eq) it.next()).accept(new qm0(z));
            }
        } catch (Throwable th) {
            this.r = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((eq) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.e.e).iterator();
        while (it.hasNext()) {
            ((jl0) it.next()).p(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.s = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.s = false;
            Iterator it = this.p.iterator();
            while (it.hasNext()) {
                ((eq) it.next()).accept(new ku0(z));
            }
        } catch (Throwable th) {
            this.s = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.e.e).iterator();
        while (it.hasNext()) {
            ((jl0) it.next()).y(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.k.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        wn wnVar;
        bf1 bf1Var = this.g;
        if (bf1Var == null && (wnVar = (wn) getLastNonConfigurationInstance()) != null) {
            bf1Var = wnVar.a;
        }
        if (bf1Var == null) {
            return null;
        }
        wn wnVar2 = new wn();
        wnVar2.a = bf1Var;
        return wnVar2;
    }

    @Override // defpackage.bo, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if0 if0Var = this.c;
        if (if0Var != null) {
            if0Var.getClass();
            if0Var.g(af0.e);
        }
        super.onSaveInstanceState(bundle);
        this.f.q(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((eq) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (ec1.v()) {
                ec1.h("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            n50 n50Var = (n50) this.i.getValue();
            synchronized (n50Var.a) {
                try {
                    n50Var.b = true;
                    ArrayList arrayList = n50Var.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((o50) obj).a();
                    }
                    n50Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        U();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        xn xnVar = this.h;
        xnVar.getClass();
        if (!xnVar.e) {
            xnVar.e = true;
            decorView.getViewTreeObserver().addOnDrawListener(xnVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // defpackage.q70
    public final um0 t() {
        um0 um0Var = new um0(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = um0Var.a;
        if (application != null) {
            Application application2 = getApplication();
            application2.getClass();
            linkedHashMap.put(ye1.e, application2);
        }
        linkedHashMap.put(lk0.h, this);
        linkedHashMap.put(lk0.i, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(lk0.j, extras);
        }
        return um0Var;
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.r) {
            return;
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((eq) it.next()).accept(new qm0(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.s) {
            return;
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((eq) it.next()).accept(new ku0(z));
        }
    }
}
