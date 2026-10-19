package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.view.View;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements z50 {
    public final /* synthetic */ int c;

    public /* synthetic */ a0(int i) {
        this.c = i;
    }

    @Override // defpackage.z50
    public final Object h(Object obj) {
        switch (this.c) {
            case 0:
                return ((jn) obj).a;
            case 1:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 2:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 3:
                Bitmap bitmap = JniAdExt.a;
                int iR = q51.r(((ir0) obj).a);
                return Boolean.valueOf(iR == 1 || iR == 2 || iR == 3 || iR == 4);
            case 4:
                return ((ir0) obj).b;
            case 5:
                zq zqVar = (zq) obj;
                if (zqVar instanceof dr) {
                    return (dr) zqVar;
                }
                return null;
            case 6:
                ((qr) obj).getClass();
                return new b50.a();
            case 7:
                qr qrVar = (qr) obj;
                qrVar.getClass();
                return new cn0(lk0.j(qrVar));
            case 8:
                Context context2 = (Context) obj;
                context2.getClass();
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 9:
                vn0 vn0Var = (vn0) obj;
                vn0Var.getClass();
                xn0 xn0Var = vn0Var.e;
                if (xn0Var == null || xn0Var.i.c != vn0Var.d.a) {
                    return null;
                }
                return xn0Var;
            case 10:
                vn0 vn0Var2 = (vn0) obj;
                vn0Var2.getClass();
                xn0 xn0Var2 = vn0Var2.e;
                if (xn0Var2 == null || xn0Var2.i.c != vn0Var2.d.a) {
                    return null;
                }
                return xn0Var2;
            case 11:
                vn0 vn0Var3 = (vn0) obj;
                vn0Var3.getClass();
                return Integer.valueOf(vn0Var3.d.a);
            case 12:
                ((qr) obj).getClass();
                return new nn0();
            case 13:
                Context context3 = (Context) obj;
                context3.getClass();
                ContextWrapper contextWrapper = context3 instanceof ContextWrapper ? (ContextWrapper) context3 : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                Context context4 = (Context) obj;
                context4.getClass();
                if (context4 instanceof Activity) {
                    return (Activity) context4;
                }
                return null;
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                vn0 vn0Var4 = (vn0) obj;
                vn0Var4.getClass();
                return vn0Var4.e;
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                vn0 vn0Var5 = (vn0) obj;
                vn0Var5.getClass();
                if (!(vn0Var5 instanceof xn0)) {
                    return null;
                }
                xn0 xn0Var3 = (xn0) vn0Var5;
                return xn0Var3.h(xn0Var3.i.c);
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                View view = (View) obj;
                view.getClass();
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                View view2 = (View) obj;
                view2.getClass();
                Object tag = view2.getTag(R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (bo0) ((WeakReference) tag).get();
                }
                if (tag instanceof bo0) {
                    return (bo0) tag;
                }
                return null;
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                obj.getClass();
                zv0 zv0Var = aw0.c;
                return Integer.valueOf(aw0.d.a().nextInt(2147418112) + 65536);
            default:
                return Boolean.valueOf(obj == null);
        }
    }
}
