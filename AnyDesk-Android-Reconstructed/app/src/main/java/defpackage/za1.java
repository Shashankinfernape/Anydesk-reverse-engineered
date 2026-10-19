package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class za1 implements h81 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Serializable f;
    public final Serializable g;

    /* JADX WARN: Type inference failed for: r1v2, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int[], java.io.Serializable] */
    public za1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.d = layoutParams;
        this.e = new Rect();
        this.f = new int[2];
        this.g = new int[2];
        this.a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.b = viewInflate;
        this.c = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(za1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    @Override // defpackage.h81
    public s11[] a() {
        return new s11[]{new s11(JniAdExt.n1("ad.sys_info.net.name"), (String) this.a), new s11(JniAdExt.n1("ad.sys_info.net.mac"), (String) this.b), new s11(JniAdExt.n1("ad.sys_info.net.ip"), (String) this.c), new s11(JniAdExt.n1("ad.sys_info.net.netmask"), (String) this.d), new s11(JniAdExt.n1("ad.sys_info.net.gateway"), (String) this.e), new s11(JniAdExt.n1("ad.sys_info.net.dhcp"), (String) this.f), new s11(JniAdExt.n1("ad.sys_info.net.dns"), (String) this.g)};
    }

    public za1(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }
}
