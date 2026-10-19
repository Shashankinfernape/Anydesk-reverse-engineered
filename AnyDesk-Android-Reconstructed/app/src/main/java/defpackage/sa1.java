package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.anydesk.anydeskandroid.R;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class sa1 implements hn0 {
    public final Context c;
    public final bc d;
    public final WeakReference e;
    public dv f;
    public ObjectAnimator g;
    public final WeakReference h;

    public sa1(Toolbar toolbar, bc bcVar) {
        toolbar.getClass();
        Context context = toolbar.getContext();
        context.getClass();
        this.c = context;
        this.d = bcVar;
        cr0 cr0Var = (cr0) bcVar.e;
        this.e = cr0Var != null ? new WeakReference(cr0Var) : null;
        this.h = new WeakReference(toolbar);
    }

    public final void a(dv dvVar, int i) {
        Toolbar toolbar = (Toolbar) this.h.get();
        if (toolbar != null) {
            boolean z = dvVar == null && toolbar.getNavigationIcon() != null;
            toolbar.setNavigationIcon(dvVar);
            toolbar.setNavigationContentDescription(i);
            if (z) {
                ub1.a(toolbar, null);
            }
        }
    }

    @Override // defpackage.hn0
    public final void m(bo0 bo0Var, vn0 vn0Var, Bundle bundle) {
        String string;
        String strValueOf;
        st0 st0Var;
        Toolbar toolbar;
        mn0 mn0Var = bo0Var.b;
        vn0Var.getClass();
        WeakReference weakReference = this.h;
        if (((Toolbar) weakReference.get()) == null) {
            mn0Var.getClass();
            mn0Var.o.remove(this);
            return;
        }
        if (vn0Var instanceof au) {
            return;
        }
        WeakReference weakReference2 = this.e;
        cr0 cr0Var = weakReference2 != null ? (cr0) weakReference2.get() : null;
        if (weakReference2 != null && cr0Var == null) {
            mn0Var.getClass();
            mn0Var.o.remove(this);
            return;
        }
        Context context = this.c;
        context.getClass();
        CharSequence charSequence = vn0Var.f;
        if (charSequence == null) {
            string = null;
        } else {
            Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
            StringBuffer stringBuffer = new StringBuffer();
            Map mapL = bundle != null ? lk0.L(bundle) : nx.c;
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                if (strGroup == null || !mapL.containsKey(strGroup)) {
                    throw new IllegalArgumentException(("Could not find \"" + strGroup + "\" in " + bundle + " to fill label \"" + ((Object) charSequence) + '\"').toString());
                }
                matcher.appendReplacement(stringBuffer, "");
                zm0 zm0Var = (zm0) vn0Var.d().get(strGroup);
                lo0 lo0Var = zm0Var != null ? zm0Var.a : null;
                lh lhVar = lo0.c;
                if (y90.e(lo0Var, lhVar)) {
                    bundle.getClass();
                    strValueOf = context.getString(((Integer) lhVar.a(strGroup, bundle)).intValue());
                } else {
                    lo0Var.getClass();
                    bundle.getClass();
                    strValueOf = String.valueOf(lo0Var.a(strGroup, bundle));
                }
                strValueOf.getClass();
                stringBuffer.append(strValueOf);
            }
            matcher.appendTail(stringBuffer);
            string = stringBuffer.toString();
        }
        if (string != null && (toolbar = (Toolbar) weakReference.get()) != null) {
            toolbar.setTitle(string);
        }
        boolean zY = this.d.Y(vn0Var);
        if (cr0Var == null && zY) {
            a(null, 0);
            return;
        }
        boolean z = cr0Var != null && zY;
        dv dvVar = this.f;
        if (dvVar != null) {
            st0Var = new st0(dvVar, Boolean.TRUE);
        } else {
            dv dvVar2 = new dv(context);
            this.f = dvVar2;
            st0Var = new st0(dvVar2, Boolean.FALSE);
        }
        dv dvVar3 = (dv) st0Var.c;
        boolean zBooleanValue = ((Boolean) st0Var.d).booleanValue();
        a(dvVar3, z ? R.string.nav_app_bar_open_drawer_description : R.string.nav_app_bar_navigate_up_description);
        float f = z ? 0.0f : 1.0f;
        if (!zBooleanValue) {
            dvVar3.setProgress(f);
            return;
        }
        float f2 = dvVar3.i;
        ObjectAnimator objectAnimator = this.g;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(dvVar3, "progress", f2, f);
        this.g = objectAnimatorOfFloat;
        objectAnimatorOfFloat.getClass();
        objectAnimatorOfFloat.start();
    }
}
