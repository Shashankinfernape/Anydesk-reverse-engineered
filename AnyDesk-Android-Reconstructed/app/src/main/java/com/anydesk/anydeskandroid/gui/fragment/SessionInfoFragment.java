package com.anydesk.anydeskandroid.gui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.SessionInfoIconItem;
import com.anydesk.anydeskandroid.gui.fragment.SessionInfoFragment;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import com.samsung.android.knox.EnterpriseDeviceManager;
import defpackage.ac0;
import defpackage.cd0;
import defpackage.cu0;
import defpackage.d3;
import defpackage.du0;
import defpackage.h81;
import defpackage.i81;
import defpackage.id0;
import defpackage.jl0;
import defpackage.lg;
import defpackage.lp;
import defpackage.m50;
import defpackage.mq0;
import defpackage.o11;
import defpackage.p11;
import defpackage.qa;
import defpackage.s11;
import defpackage.t70;
import defpackage.uj;
import defpackage.z6;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class SessionInfoFragment extends z6 implements jl0, cd0, id0 {
    public static final Map m0;
    public final Logging b0 = new Logging("SessionInfoFragment");
    public boolean c0;
    public o11 d0;
    public o11 e0;
    public SessionInfoIconItem f0;
    public SessionInfoIconItem g0;
    public SessionInfoIconItem h0;
    public o11 i0;
    public o11 j0;
    public o11 k0;
    public o11 l0;

    static {
        ac0 ac0Var = new ac0();
        ac0Var.put(du0.pf_audio, JniAdExt.n1("ad.status.sess.remote.perm.audio"));
        ac0Var.put(du0.pf_input, JniAdExt.n1("ad.status.sess.remote.perm.input"));
        ac0Var.put(du0.pf_mouse_pointer, JniAdExt.n1("ad.status.sess.remote.perm.mouse_pointer"));
        ac0Var.put(du0.pf_clipboard, JniAdExt.n1("ad.status.sess.remote.perm.clipboard"));
        ac0Var.put(du0.pf_clipboard_files, JniAdExt.n1("ad.status.sess.remote.perm.clipboard_files"));
        ac0Var.put(du0.pf_file_manager, JniAdExt.n1("ad.status.sess.remote.perm.file_manager"));
        ac0Var.put(du0.pf_sysinfo, JniAdExt.n1("ad.status.sess.remote.perm.sysinfo"));
        ac0Var.put(du0.pf_tcp_tunnel, JniAdExt.n1("ad.status.sess.remote.perm.tcp"));
        ac0Var.put(du0.pf_vpn, JniAdExt.n1("ad.status.sess.remote.perm.vpn"));
        ac0Var.put(du0.pf_record_session, JniAdExt.n1("ad.status.sess.remote.perm.record_session"));
        ac0Var.put(du0.pf_lock_account, JniAdExt.n1("ad.status.sess.remote.perm.lock_account"));
        ac0Var.put(du0.pf_privacy_feature, JniAdExt.n1("ad.status.sess.remote.perm.privacy"));
        ac0Var.put(du0.pf_modify_forbidden_windows, JniAdExt.n1("ad.status.sess.remote.perm.modify_forbidden_windows"));
        m0 = DesugarCollections.unmodifiableMap(ac0Var);
    }

    public static void R0(s11[] s11VarArr, int i, String str, Context context, ViewGroup viewGroup) {
        p11 p11Var = new p11(context);
        View viewInflate = View.inflate(context, R.layout.session_info_block, p11Var);
        ((ImageView) viewInflate.findViewById(R.id.session_info_block_icon)).setImageResource(i);
        ((TextView) viewInflate.findViewById(R.id.session_info_block_title)).setText(lg.c().e(str));
        viewGroup.addView(p11Var);
        for (s11 s11Var : s11VarArr) {
            viewGroup.addView(new o11(context, s11Var, null));
        }
    }

    public static void S0(h81[] h81VarArr, int i, String str, Context context, ViewGroup viewGroup) {
        for (int i2 = 0; i2 != h81VarArr.length; i2++) {
            R0(h81VarArr[i2].a(), i, h81VarArr.length != 1 ? String.format(Locale.getDefault(), "%s #%d", str, Integer.valueOf(i2 + 1)) : str, context, viewGroup);
        }
    }

    public static void T0(StringBuilder sb, h81[] h81VarArr, String str) {
        for (int i = 0; i != h81VarArr.length; i++) {
            String str2 = h81VarArr.length != 1 ? String.format(Locale.getDefault(), "%s #%d", str, Integer.valueOf(i + 1)) : str;
            sb.append("\n\n");
            sb.append(str2);
            sb.append("\n\n");
            for (s11 s11Var : h81VarArr[i].a()) {
                sb.append(s11Var);
                sb.append('\n');
            }
        }
    }

    public static boolean U0(du0 du0Var) {
        cu0 cu0Var;
        if (!m0.containsKey(du0Var)) {
            return false;
        }
        lp lpVar = MainApplication.v().r;
        synchronized (lpVar) {
            cu0Var = (cu0) lpVar.H.get(du0Var);
        }
        return cu0Var != null && cu0Var.c() && cu0Var.a();
    }

    public static s11[] V0(i81 i81Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new s11(JniAdExt.n1("ad.sys_info.ram_total"), i81Var.m));
        arrayList.add(new s11(JniAdExt.n1("ad.sys_info.mainboard"), i81Var.h));
        String[] strArr = i81Var.d;
        if (strArr.length == 0) {
            arrayList.add(new s11(JniAdExt.n1("ad.sys_info.cpu"), ""));
        }
        for (String str : strArr) {
            arrayList.add(new s11(JniAdExt.n1("ad.sys_info.cpu"), str));
        }
        String[] strArr2 = i81Var.f;
        if (strArr2.length == 0) {
            arrayList.add(new s11(JniAdExt.n1("ad.sys_info.ram"), ""));
        }
        for (String str2 : strArr2) {
            arrayList.add(new s11(JniAdExt.n1("ad.sys_info.ram"), str2));
        }
        String[] strArr3 = i81Var.g;
        if (strArr3.length == 0) {
            arrayList.add(new s11(JniAdExt.n1("ad.sys_info.graphics_card"), ""));
        }
        for (String str3 : strArr3) {
            arrayList.add(new s11(JniAdExt.n1("ad.sys_info.graphics_card"), str3));
        }
        String[] strArr4 = i81Var.e;
        if (strArr4.length == 0) {
            arrayList.add(new s11(JniAdExt.n1("ad.sys_info.hdd"), ""));
        }
        for (String str4 : strArr4) {
            arrayList.add(new s11(JniAdExt.n1("ad.sys_info.hdd"), str4));
        }
        return (s11[]) arrayList.toArray(new s11[0]);
    }

    public static s11[] W0(i81 i81Var) {
        return new s11[]{new s11(JniAdExt.n1("ad.sys_info.os"), i81Var.l), new s11(JniAdExt.n1("ad.sys_info.comp_name"), i81Var.i), new s11(JniAdExt.n1("ad.sys_info.user_name"), i81Var.j), new s11(JniAdExt.n1("ad.sys_info.domain"), i81Var.k)};
    }

    public static s11[] X0(i81 i81Var) {
        MainApplication mainApplicationV = MainApplication.v();
        return new s11[]{new s11(JniAdExt.n1("ad.sys_info.alias"), mainApplicationV.n), new s11(JniAdExt.n1("ad.sys_info.anydesk_id"), t70.g(mainApplicationV.m)), new s11(JniAdExt.n1("ad.sys_info.version"), i81Var != null ? i81Var.n : "", "ad.sys_info.version"), new s11(JniAdExt.n1("ad.sys_info.license"), i81Var != null ? i81Var.o : "", "ad.sys_info.license")};
    }

    @Override // defpackage.c40
    public final void D0(Bundle bundle) {
        final int i = 1;
        this.F = true;
        JniAdExt.s1(this);
        JniAdExt.A1(this);
        if (bundle == null) {
            bundle = H0();
        }
        this.c0 = bundle.getBoolean("SYSINFO_SUPPORTED");
        qa qaVarY = Y();
        if (qaVarY == null) {
            return;
        }
        qaVarY.setTitle(JniAdExt.n1("ad.sys_info.short_title"));
        qaVarY.O(this, this);
        View view = this.H;
        if (view == null) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.session_info_perms);
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.session_info_block_icon);
        TextView textView = (TextView) linearLayout.findViewById(R.id.session_info_block_title);
        imageView.setImageResource(R.drawable.ic_sessinfo_permissions);
        textView.setText(JniAdExt.n1("ad.cfg.sec.perm.permissions"));
        Context contextA0 = a0();
        if (contextA0 != null) {
            Iterator it = m0.entrySet().iterator();
            while (it.hasNext()) {
                Z0((du0) ((Map.Entry) it.next()).getKey());
            }
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.session_info_fixed_blocks);
            R0(X0(null), R.drawable.ic_dialog_connected, JniAdExt.n1("ad.sys_info.user"), contextA0, viewGroup);
            boolean z = MainApplication.v().l;
            int i2 = z ? R.color.colorAliasStateGreen : R.color.colorAliasStateRed;
            if (!z) {
                o11 o11Var = new o11(contextA0, new s11("", JniAdExt.n1("ad.status.sess.remote.identity_not_verified")), Integer.valueOf(i2));
                this.d0 = o11Var;
                viewGroup.addView(o11Var);
            }
            m50 m50VarH0 = h0();
            lp lpVar = MainApplication.v().r;
            this.e0 = new o11(contextA0, new s11(JniAdExt.n1("ad.status.sess.remote.time"), " "), Integer.valueOf(i2));
            lpVar.v.e(m50VarH0, new mq0(this) { // from class: r11
                public final /* synthetic */ SessionInfoFragment d;

                {
                    this.d = this;
                }

                @Override // defpackage.mq0
                public final void b(Object obj) {
                    Context contextA1;
                    int iOrdinal;
                    int i3 = i;
                    SessionInfoFragment sessionInfoFragment = this.d;
                    switch (i3) {
                        case 0:
                            i81 i81Var = (i81) obj;
                            Map map = SessionInfoFragment.m0;
                            View view2 = sessionInfoFragment.H;
                            if (view2 != null) {
                                if (i81Var == null) {
                                    sessionInfoFragment.Y0(view2);
                                } else {
                                    int i4 = i81Var.a.c;
                                    TextView textView2 = (TextView) view2.findViewById(R.id.session_info_sysinfo_status);
                                    if ((i4 & 1) != 1) {
                                        textView2.setVisibility(8);
                                        if ((i4 & 2) != 2 && (contextA1 = sessionInfoFragment.a0()) != null) {
                                            ((o11) view2.findViewWithTag("ad.sys_info.version")).a(contextA1, i81Var.n);
                                            ((o11) view2.findViewWithTag("ad.sys_info.license")).a(contextA1, i81Var.o);
                                            ViewGroup viewGroup2 = (ViewGroup) view2.findViewById(R.id.session_info_sysinfo_blocks);
                                            viewGroup2.removeAllViews();
                                            SessionInfoFragment.R0(SessionInfoFragment.W0(i81Var), R.drawable.ic_nav_settings, JniAdExt.n1("ad.sys_info.os"), contextA1, viewGroup2);
                                            SessionInfoFragment.R0(SessionInfoFragment.V0(i81Var), R.drawable.ic_sysinfo_hardware, JniAdExt.n1("ad.sys_info.hardware"), contextA1, viewGroup2);
                                            SessionInfoFragment.S0(i81Var.b, R.drawable.ic_nav_settings_monitor, JniAdExt.n1("ad.tutorial.monitor.title"), contextA1, viewGroup2);
                                            SessionInfoFragment.S0(i81Var.c, R.drawable.ic_sysinfo_network, JniAdExt.n1("ad.sys_info.net.nic"), contextA1, viewGroup2);
                                        }
                                    } else {
                                        textView2.setVisibility(0);
                                        textView2.setText(JniAdExt.n1("ad.sys_info.error.text"));
                                    }
                                }
                                break;
                            }
                            break;
                        case 1:
                            String str = (String) obj;
                            o11 o11Var2 = sessionInfoFragment.e0;
                            if (o11Var2 != null) {
                                o11Var2.setValueUnfiltered(str);
                            }
                            break;
                        case 2:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            SessionInfoIconItem sessionInfoIconItem = sessionInfoFragment.f0;
                            if (sessionInfoIconItem != null) {
                                sessionInfoIconItem.setActive(zBooleanValue);
                                sessionInfoFragment.f0.setText(zBooleanValue ? JniAdExt.n1("ad.status.tooltip.privacy") : JniAdExt.n1("ad.status.tooltip.privacy_disabled"));
                            }
                            break;
                        case 3:
                            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                            SessionInfoIconItem sessionInfoIconItem2 = sessionInfoFragment.g0;
                            if (sessionInfoIconItem2 != null) {
                                sessionInfoIconItem2.setActive(zBooleanValue2);
                            }
                            break;
                        case 4:
                            boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                            SessionInfoIconItem sessionInfoIconItem3 = sessionInfoFragment.h0;
                            if (sessionInfoIconItem3 != null) {
                                sessionInfoIconItem3.setActive(zBooleanValue3);
                            }
                            break;
                        case 5:
                            kp kpVar = (kp) obj;
                            Map map2 = SessionInfoFragment.m0;
                            Context contextA2 = sessionInfoFragment.a0();
                            if (contextA2 != null && sessionInfoFragment.i0 != null && (iOrdinal = kpVar.ordinal()) != 0) {
                                sessionInfoFragment.i0.a(contextA2, iOrdinal != 1 ? iOrdinal != 2 ? null : JniAdExt.n1("ad.status.tooltip.tunnel_conn") : JniAdExt.n1("ad.status.tooltip.direct_conn"));
                            }
                            break;
                        default:
                            zl zlVar = (zl) obj;
                            Map map3 = SessionInfoFragment.m0;
                            Context contextA3 = sessionInfoFragment.a0();
                            if (contextA3 != null) {
                                o11 o11Var3 = sessionInfoFragment.k0;
                                if (o11Var3 != null) {
                                    o11Var3.a(contextA3, zlVar.a);
                                }
                                o11 o11Var4 = sessionInfoFragment.l0;
                                if (o11Var4 != null) {
                                    o11Var4.a(contextA3, zlVar.b);
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            viewGroup.addView(this.e0);
            SessionInfoIconItem sessionInfoIconItem = new SessionInfoIconItem(contextA0);
            this.f0 = sessionInfoIconItem;
            sessionInfoIconItem.setImage(contextA0.getDrawable(R.drawable.ic_pie_privacy));
            final int i3 = 2;
            lpVar.z.e(m50VarH0, new mq0(this) { // from class: r11
                public final /* synthetic */ SessionInfoFragment d;

                {
                    this.d = this;
                }

                @Override // defpackage.mq0
                public final void b(Object obj) {
                    Context contextA1;
                    int iOrdinal;
                    int i4 = i3;
                    SessionInfoFragment sessionInfoFragment = this.d;
                    switch (i4) {
                        case 0:
                            i81 i81Var = (i81) obj;
                            Map map = SessionInfoFragment.m0;
                            View view2 = sessionInfoFragment.H;
                            if (view2 != null) {
                                if (i81Var == null) {
                                    sessionInfoFragment.Y0(view2);
                                } else {
                                    int i5 = i81Var.a.c;
                                    TextView textView2 = (TextView) view2.findViewById(R.id.session_info_sysinfo_status);
                                    if ((i5 & 1) != 1) {
                                        textView2.setVisibility(8);
                                        if ((i5 & 2) != 2 && (contextA1 = sessionInfoFragment.a0()) != null) {
                                            ((o11) view2.findViewWithTag("ad.sys_info.version")).a(contextA1, i81Var.n);
                                            ((o11) view2.findViewWithTag("ad.sys_info.license")).a(contextA1, i81Var.o);
                                            ViewGroup viewGroup2 = (ViewGroup) view2.findViewById(R.id.session_info_sysinfo_blocks);
                                            viewGroup2.removeAllViews();
                                            SessionInfoFragment.R0(SessionInfoFragment.W0(i81Var), R.drawable.ic_nav_settings, JniAdExt.n1("ad.sys_info.os"), contextA1, viewGroup2);
                                            SessionInfoFragment.R0(SessionInfoFragment.V0(i81Var), R.drawable.ic_sysinfo_hardware, JniAdExt.n1("ad.sys_info.hardware"), contextA1, viewGroup2);
                                            SessionInfoFragment.S0(i81Var.b, R.drawable.ic_nav_settings_monitor, JniAdExt.n1("ad.tutorial.monitor.title"), contextA1, viewGroup2);
                                            SessionInfoFragment.S0(i81Var.c, R.drawable.ic_sysinfo_network, JniAdExt.n1("ad.sys_info.net.nic"), contextA1, viewGroup2);
                                        }
                                    } else {
                                        textView2.setVisibility(0);
                                        textView2.setText(JniAdExt.n1("ad.sys_info.error.text"));
                                    }
                                }
                                break;
                            }
                            break;
                        case 1:
                            String str = (String) obj;
                            o11 o11Var2 = sessionInfoFragment.e0;
                            if (o11Var2 != null) {
                                o11Var2.setValueUnfiltered(str);
                            }
                            break;
                        case 2:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            SessionInfoIconItem sessionInfoIconItem2 = sessionInfoFragment.f0;
                            if (sessionInfoIconItem2 != null) {
                                sessionInfoIconItem2.setActive(zBooleanValue);
                                sessionInfoFragment.f0.setText(zBooleanValue ? JniAdExt.n1("ad.status.tooltip.privacy") : JniAdExt.n1("ad.status.tooltip.privacy_disabled"));
                            }
                            break;
                        case 3:
                            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                            SessionInfoIconItem sessionInfoIconItem3 = sessionInfoFragment.g0;
                            if (sessionInfoIconItem3 != null) {
                                sessionInfoIconItem3.setActive(zBooleanValue2);
                            }
                            break;
                        case 4:
                            boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                            SessionInfoIconItem sessionInfoIconItem4 = sessionInfoFragment.h0;
                            if (sessionInfoIconItem4 != null) {
                                sessionInfoIconItem4.setActive(zBooleanValue3);
                            }
                            break;
                        case 5:
                            kp kpVar = (kp) obj;
                            Map map2 = SessionInfoFragment.m0;
                            Context contextA2 = sessionInfoFragment.a0();
                            if (contextA2 != null && sessionInfoFragment.i0 != null && (iOrdinal = kpVar.ordinal()) != 0) {
                                sessionInfoFragment.i0.a(contextA2, iOrdinal != 1 ? iOrdinal != 2 ? null : JniAdExt.n1("ad.status.tooltip.tunnel_conn") : JniAdExt.n1("ad.status.tooltip.direct_conn"));
                            }
                            break;
                        default:
                            zl zlVar = (zl) obj;
                            Map map3 = SessionInfoFragment.m0;
                            Context contextA3 = sessionInfoFragment.a0();
                            if (contextA3 != null) {
                                o11 o11Var3 = sessionInfoFragment.k0;
                                if (o11Var3 != null) {
                                    o11Var3.a(contextA3, zlVar.a);
                                }
                                o11 o11Var4 = sessionInfoFragment.l0;
                                if (o11Var4 != null) {
                                    o11Var4.a(contextA3, zlVar.b);
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            viewGroup.addView(this.f0);
            SessionInfoIconItem sessionInfoIconItem2 = new SessionInfoIconItem(contextA0);
            this.g0 = sessionInfoIconItem2;
            sessionInfoIconItem2.setText(JniAdExt.n1("ad.status.tooltip.busy"));
            this.g0.setImage(contextA0.getDrawable(R.drawable.ic_sysinfo_network));
            final int i4 = 3;
            lpVar.A.e(m50VarH0, new mq0(this) { // from class: r11
                public final /* synthetic */ SessionInfoFragment d;

                {
                    this.d = this;
                }

                @Override // defpackage.mq0
                public final void b(Object obj) {
                    Context contextA1;
                    int iOrdinal;
                    int i5 = i4;
                    SessionInfoFragment sessionInfoFragment = this.d;
                    switch (i5) {
                        case 0:
                            i81 i81Var = (i81) obj;
                            Map map = SessionInfoFragment.m0;
                            View view2 = sessionInfoFragment.H;
                            if (view2 != null) {
                                if (i81Var == null) {
                                    sessionInfoFragment.Y0(view2);
                                } else {
                                    int i6 = i81Var.a.c;
                                    TextView textView2 = (TextView) view2.findViewById(R.id.session_info_sysinfo_status);
                                    if ((i6 & 1) != 1) {
                                        textView2.setVisibility(8);
                                        if ((i6 & 2) != 2 && (contextA1 = sessionInfoFragment.a0()) != null) {
                                            ((o11) view2.findViewWithTag("ad.sys_info.version")).a(contextA1, i81Var.n);
                                            ((o11) view2.findViewWithTag("ad.sys_info.license")).a(contextA1, i81Var.o);
                                            ViewGroup viewGroup2 = (ViewGroup) view2.findViewById(R.id.session_info_sysinfo_blocks);
                                            viewGroup2.removeAllViews();
                                            SessionInfoFragment.R0(SessionInfoFragment.W0(i81Var), R.drawable.ic_nav_settings, JniAdExt.n1("ad.sys_info.os"), contextA1, viewGroup2);
                                            SessionInfoFragment.R0(SessionInfoFragment.V0(i81Var), R.drawable.ic_sysinfo_hardware, JniAdExt.n1("ad.sys_info.hardware"), contextA1, viewGroup2);
                                            SessionInfoFragment.S0(i81Var.b, R.drawable.ic_nav_settings_monitor, JniAdExt.n1("ad.tutorial.monitor.title"), contextA1, viewGroup2);
                                            SessionInfoFragment.S0(i81Var.c, R.drawable.ic_sysinfo_network, JniAdExt.n1("ad.sys_info.net.nic"), contextA1, viewGroup2);
                                        }
                                    } else {
                                        textView2.setVisibility(0);
                                        textView2.setText(JniAdExt.n1("ad.sys_info.error.text"));
                                    }
                                }
                                break;
                            }
                            break;
                        case 1:
                            String str = (String) obj;
                            o11 o11Var2 = sessionInfoFragment.e0;
                            if (o11Var2 != null) {
                                o11Var2.setValueUnfiltered(str);
                            }
                            break;
                        case 2:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            SessionInfoIconItem sessionInfoIconItem3 = sessionInfoFragment.f0;
                            if (sessionInfoIconItem3 != null) {
                                sessionInfoIconItem3.setActive(zBooleanValue);
                                sessionInfoFragment.f0.setText(zBooleanValue ? JniAdExt.n1("ad.status.tooltip.privacy") : JniAdExt.n1("ad.status.tooltip.privacy_disabled"));
                            }
                            break;
                        case 3:
                            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                            SessionInfoIconItem sessionInfoIconItem4 = sessionInfoFragment.g0;
                            if (sessionInfoIconItem4 != null) {
                                sessionInfoIconItem4.setActive(zBooleanValue2);
                            }
                            break;
                        case 4:
                            boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                            SessionInfoIconItem sessionInfoIconItem5 = sessionInfoFragment.h0;
                            if (sessionInfoIconItem5 != null) {
                                sessionInfoIconItem5.setActive(zBooleanValue3);
                            }
                            break;
                        case 5:
                            kp kpVar = (kp) obj;
                            Map map2 = SessionInfoFragment.m0;
                            Context contextA2 = sessionInfoFragment.a0();
                            if (contextA2 != null && sessionInfoFragment.i0 != null && (iOrdinal = kpVar.ordinal()) != 0) {
                                sessionInfoFragment.i0.a(contextA2, iOrdinal != 1 ? iOrdinal != 2 ? null : JniAdExt.n1("ad.status.tooltip.tunnel_conn") : JniAdExt.n1("ad.status.tooltip.direct_conn"));
                            }
                            break;
                        default:
                            zl zlVar = (zl) obj;
                            Map map3 = SessionInfoFragment.m0;
                            Context contextA3 = sessionInfoFragment.a0();
                            if (contextA3 != null) {
                                o11 o11Var3 = sessionInfoFragment.k0;
                                if (o11Var3 != null) {
                                    o11Var3.a(contextA3, zlVar.a);
                                }
                                o11 o11Var4 = sessionInfoFragment.l0;
                                if (o11Var4 != null) {
                                    o11Var4.a(contextA3, zlVar.b);
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            viewGroup.addView(this.g0);
            SessionInfoIconItem sessionInfoIconItem3 = new SessionInfoIconItem(contextA0);
            this.h0 = sessionInfoIconItem3;
            sessionInfoIconItem3.setText(JniAdExt.n1("ad.status.tooltip.hdd"));
            this.h0.setImage(contextA0.getDrawable(R.drawable.ic_sysinfo_storage));
            final int i5 = 4;
            lpVar.B.e(m50VarH0, new mq0(this) { // from class: r11
                public final /* synthetic */ SessionInfoFragment d;

                {
                    this.d = this;
                }

                @Override // defpackage.mq0
                public final void b(Object obj) {
                    Context contextA1;
                    int iOrdinal;
                    int i6 = i5;
                    SessionInfoFragment sessionInfoFragment = this.d;
                    switch (i6) {
                        case 0:
                            i81 i81Var = (i81) obj;
                            Map map = SessionInfoFragment.m0;
                            View view2 = sessionInfoFragment.H;
                            if (view2 != null) {
                                if (i81Var == null) {
                                    sessionInfoFragment.Y0(view2);
                                } else {
                                    int i7 = i81Var.a.c;
                                    TextView textView2 = (TextView) view2.findViewById(R.id.session_info_sysinfo_status);
                                    if ((i7 & 1) != 1) {
                                        textView2.setVisibility(8);
                                        if ((i7 & 2) != 2 && (contextA1 = sessionInfoFragment.a0()) != null) {
                                            ((o11) view2.findViewWithTag("ad.sys_info.version")).a(contextA1, i81Var.n);
                                            ((o11) view2.findViewWithTag("ad.sys_info.license")).a(contextA1, i81Var.o);
                                            ViewGroup viewGroup2 = (ViewGroup) view2.findViewById(R.id.session_info_sysinfo_blocks);
                                            viewGroup2.removeAllViews();
                                            SessionInfoFragment.R0(SessionInfoFragment.W0(i81Var), R.drawable.ic_nav_settings, JniAdExt.n1("ad.sys_info.os"), contextA1, viewGroup2);
                                            SessionInfoFragment.R0(SessionInfoFragment.V0(i81Var), R.drawable.ic_sysinfo_hardware, JniAdExt.n1("ad.sys_info.hardware"), contextA1, viewGroup2);
                                            SessionInfoFragment.S0(i81Var.b, R.drawable.ic_nav_settings_monitor, JniAdExt.n1("ad.tutorial.monitor.title"), contextA1, viewGroup2);
                                            SessionInfoFragment.S0(i81Var.c, R.drawable.ic_sysinfo_network, JniAdExt.n1("ad.sys_info.net.nic"), contextA1, viewGroup2);
                                        }
                                    } else {
                                        textView2.setVisibility(0);
                                        textView2.setText(JniAdExt.n1("ad.sys_info.error.text"));
                                    }
                                }
                                break;
                            }
                            break;
                        case 1:
                            String str = (String) obj;
                            o11 o11Var2 = sessionInfoFragment.e0;
                            if (o11Var2 != null) {
                                o11Var2.setValueUnfiltered(str);
                            }
                            break;
                        case 2:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            SessionInfoIconItem sessionInfoIconItem4 = sessionInfoFragment.f0;
                            if (sessionInfoIconItem4 != null) {
                                sessionInfoIconItem4.setActive(zBooleanValue);
                                sessionInfoFragment.f0.setText(zBooleanValue ? JniAdExt.n1("ad.status.tooltip.privacy") : JniAdExt.n1("ad.status.tooltip.privacy_disabled"));
                            }
                            break;
                        case 3:
                            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                            SessionInfoIconItem sessionInfoIconItem5 = sessionInfoFragment.g0;
                            if (sessionInfoIconItem5 != null) {
                                sessionInfoIconItem5.setActive(zBooleanValue2);
                            }
                            break;
                        case 4:
                            boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                            SessionInfoIconItem sessionInfoIconItem6 = sessionInfoFragment.h0;
                            if (sessionInfoIconItem6 != null) {
                                sessionInfoIconItem6.setActive(zBooleanValue3);
                            }
                            break;
                        case 5:
                            kp kpVar = (kp) obj;
                            Map map2 = SessionInfoFragment.m0;
                            Context contextA2 = sessionInfoFragment.a0();
                            if (contextA2 != null && sessionInfoFragment.i0 != null && (iOrdinal = kpVar.ordinal()) != 0) {
                                sessionInfoFragment.i0.a(contextA2, iOrdinal != 1 ? iOrdinal != 2 ? null : JniAdExt.n1("ad.status.tooltip.tunnel_conn") : JniAdExt.n1("ad.status.tooltip.direct_conn"));
                            }
                            break;
                        default:
                            zl zlVar = (zl) obj;
                            Map map3 = SessionInfoFragment.m0;
                            Context contextA3 = sessionInfoFragment.a0();
                            if (contextA3 != null) {
                                o11 o11Var3 = sessionInfoFragment.k0;
                                if (o11Var3 != null) {
                                    o11Var3.a(contextA3, zlVar.a);
                                }
                                o11 o11Var4 = sessionInfoFragment.l0;
                                if (o11Var4 != null) {
                                    o11Var4.a(contextA3, zlVar.b);
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            viewGroup.addView(this.h0);
            o11 o11Var2 = new o11(contextA0, new s11("", ""), null);
            this.i0 = o11Var2;
            viewGroup.addView(o11Var2);
            final int i6 = 5;
            lpVar.y.e(m50VarH0, new mq0(this) { // from class: r11
                public final /* synthetic */ SessionInfoFragment d;

                {
                    this.d = this;
                }

                @Override // defpackage.mq0
                public final void b(Object obj) {
                    Context contextA1;
                    int iOrdinal;
                    int i7 = i6;
                    SessionInfoFragment sessionInfoFragment = this.d;
                    switch (i7) {
                        case 0:
                            i81 i81Var = (i81) obj;
                            Map map = SessionInfoFragment.m0;
                            View view2 = sessionInfoFragment.H;
                            if (view2 != null) {
                                if (i81Var == null) {
                                    sessionInfoFragment.Y0(view2);
                                } else {
                                    int i8 = i81Var.a.c;
                                    TextView textView2 = (TextView) view2.findViewById(R.id.session_info_sysinfo_status);
                                    if ((i8 & 1) != 1) {
                                        textView2.setVisibility(8);
                                        if ((i8 & 2) != 2 && (contextA1 = sessionInfoFragment.a0()) != null) {
                                            ((o11) view2.findViewWithTag("ad.sys_info.version")).a(contextA1, i81Var.n);
                                            ((o11) view2.findViewWithTag("ad.sys_info.license")).a(contextA1, i81Var.o);
                                            ViewGroup viewGroup2 = (ViewGroup) view2.findViewById(R.id.session_info_sysinfo_blocks);
                                            viewGroup2.removeAllViews();
                                            SessionInfoFragment.R0(SessionInfoFragment.W0(i81Var), R.drawable.ic_nav_settings, JniAdExt.n1("ad.sys_info.os"), contextA1, viewGroup2);
                                            SessionInfoFragment.R0(SessionInfoFragment.V0(i81Var), R.drawable.ic_sysinfo_hardware, JniAdExt.n1("ad.sys_info.hardware"), contextA1, viewGroup2);
                                            SessionInfoFragment.S0(i81Var.b, R.drawable.ic_nav_settings_monitor, JniAdExt.n1("ad.tutorial.monitor.title"), contextA1, viewGroup2);
                                            SessionInfoFragment.S0(i81Var.c, R.drawable.ic_sysinfo_network, JniAdExt.n1("ad.sys_info.net.nic"), contextA1, viewGroup2);
                                        }
                                    } else {
                                        textView2.setVisibility(0);
                                        textView2.setText(JniAdExt.n1("ad.sys_info.error.text"));
                                    }
                                }
                                break;
                            }
                            break;
                        case 1:
                            String str = (String) obj;
                            o11 o11Var3 = sessionInfoFragment.e0;
                            if (o11Var3 != null) {
                                o11Var3.setValueUnfiltered(str);
                            }
                            break;
                        case 2:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            SessionInfoIconItem sessionInfoIconItem4 = sessionInfoFragment.f0;
                            if (sessionInfoIconItem4 != null) {
                                sessionInfoIconItem4.setActive(zBooleanValue);
                                sessionInfoFragment.f0.setText(zBooleanValue ? JniAdExt.n1("ad.status.tooltip.privacy") : JniAdExt.n1("ad.status.tooltip.privacy_disabled"));
                            }
                            break;
                        case 3:
                            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                            SessionInfoIconItem sessionInfoIconItem5 = sessionInfoFragment.g0;
                            if (sessionInfoIconItem5 != null) {
                                sessionInfoIconItem5.setActive(zBooleanValue2);
                            }
                            break;
                        case 4:
                            boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                            SessionInfoIconItem sessionInfoIconItem6 = sessionInfoFragment.h0;
                            if (sessionInfoIconItem6 != null) {
                                sessionInfoIconItem6.setActive(zBooleanValue3);
                            }
                            break;
                        case 5:
                            kp kpVar = (kp) obj;
                            Map map2 = SessionInfoFragment.m0;
                            Context contextA2 = sessionInfoFragment.a0();
                            if (contextA2 != null && sessionInfoFragment.i0 != null && (iOrdinal = kpVar.ordinal()) != 0) {
                                sessionInfoFragment.i0.a(contextA2, iOrdinal != 1 ? iOrdinal != 2 ? null : JniAdExt.n1("ad.status.tooltip.tunnel_conn") : JniAdExt.n1("ad.status.tooltip.direct_conn"));
                            }
                            break;
                        default:
                            zl zlVar = (zl) obj;
                            Map map3 = SessionInfoFragment.m0;
                            Context contextA3 = sessionInfoFragment.a0();
                            if (contextA3 != null) {
                                o11 o11Var4 = sessionInfoFragment.k0;
                                if (o11Var4 != null) {
                                    o11Var4.a(contextA3, zlVar.a);
                                }
                                o11 o11Var5 = sessionInfoFragment.l0;
                                if (o11Var5 != null) {
                                    o11Var5.a(contextA3, zlVar.b);
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            o11 o11Var3 = new o11(contextA0, new s11("", JniAdExt.n1("ad.status.tooltip.cipher.secure")), null);
            this.j0 = o11Var3;
            viewGroup.addView(o11Var3);
            o11 o11Var4 = new o11(contextA0, new s11(JniAdExt.n1("ad.status.tooltip.cipher.encryption"), ""), null);
            this.k0 = o11Var4;
            viewGroup.addView(o11Var4);
            o11 o11Var5 = new o11(contextA0, new s11(JniAdExt.n1("ad.status.tooltip.cipher.fingerprint"), ""), null);
            this.l0 = o11Var5;
            viewGroup.addView(o11Var5);
            final int i7 = 6;
            lpVar.w.e(m50VarH0, new mq0(this) { // from class: r11
                public final /* synthetic */ SessionInfoFragment d;

                {
                    this.d = this;
                }

                @Override // defpackage.mq0
                public final void b(Object obj) {
                    Context contextA1;
                    int iOrdinal;
                    int i8 = i7;
                    SessionInfoFragment sessionInfoFragment = this.d;
                    switch (i8) {
                        case 0:
                            i81 i81Var = (i81) obj;
                            Map map = SessionInfoFragment.m0;
                            View view2 = sessionInfoFragment.H;
                            if (view2 != null) {
                                if (i81Var == null) {
                                    sessionInfoFragment.Y0(view2);
                                } else {
                                    int i9 = i81Var.a.c;
                                    TextView textView2 = (TextView) view2.findViewById(R.id.session_info_sysinfo_status);
                                    if ((i9 & 1) != 1) {
                                        textView2.setVisibility(8);
                                        if ((i9 & 2) != 2 && (contextA1 = sessionInfoFragment.a0()) != null) {
                                            ((o11) view2.findViewWithTag("ad.sys_info.version")).a(contextA1, i81Var.n);
                                            ((o11) view2.findViewWithTag("ad.sys_info.license")).a(contextA1, i81Var.o);
                                            ViewGroup viewGroup2 = (ViewGroup) view2.findViewById(R.id.session_info_sysinfo_blocks);
                                            viewGroup2.removeAllViews();
                                            SessionInfoFragment.R0(SessionInfoFragment.W0(i81Var), R.drawable.ic_nav_settings, JniAdExt.n1("ad.sys_info.os"), contextA1, viewGroup2);
                                            SessionInfoFragment.R0(SessionInfoFragment.V0(i81Var), R.drawable.ic_sysinfo_hardware, JniAdExt.n1("ad.sys_info.hardware"), contextA1, viewGroup2);
                                            SessionInfoFragment.S0(i81Var.b, R.drawable.ic_nav_settings_monitor, JniAdExt.n1("ad.tutorial.monitor.title"), contextA1, viewGroup2);
                                            SessionInfoFragment.S0(i81Var.c, R.drawable.ic_sysinfo_network, JniAdExt.n1("ad.sys_info.net.nic"), contextA1, viewGroup2);
                                        }
                                    } else {
                                        textView2.setVisibility(0);
                                        textView2.setText(JniAdExt.n1("ad.sys_info.error.text"));
                                    }
                                }
                                break;
                            }
                            break;
                        case 1:
                            String str = (String) obj;
                            o11 o11Var6 = sessionInfoFragment.e0;
                            if (o11Var6 != null) {
                                o11Var6.setValueUnfiltered(str);
                            }
                            break;
                        case 2:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            SessionInfoIconItem sessionInfoIconItem4 = sessionInfoFragment.f0;
                            if (sessionInfoIconItem4 != null) {
                                sessionInfoIconItem4.setActive(zBooleanValue);
                                sessionInfoFragment.f0.setText(zBooleanValue ? JniAdExt.n1("ad.status.tooltip.privacy") : JniAdExt.n1("ad.status.tooltip.privacy_disabled"));
                            }
                            break;
                        case 3:
                            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                            SessionInfoIconItem sessionInfoIconItem5 = sessionInfoFragment.g0;
                            if (sessionInfoIconItem5 != null) {
                                sessionInfoIconItem5.setActive(zBooleanValue2);
                            }
                            break;
                        case 4:
                            boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                            SessionInfoIconItem sessionInfoIconItem6 = sessionInfoFragment.h0;
                            if (sessionInfoIconItem6 != null) {
                                sessionInfoIconItem6.setActive(zBooleanValue3);
                            }
                            break;
                        case 5:
                            kp kpVar = (kp) obj;
                            Map map2 = SessionInfoFragment.m0;
                            Context contextA2 = sessionInfoFragment.a0();
                            if (contextA2 != null && sessionInfoFragment.i0 != null && (iOrdinal = kpVar.ordinal()) != 0) {
                                sessionInfoFragment.i0.a(contextA2, iOrdinal != 1 ? iOrdinal != 2 ? null : JniAdExt.n1("ad.status.tooltip.tunnel_conn") : JniAdExt.n1("ad.status.tooltip.direct_conn"));
                            }
                            break;
                        default:
                            zl zlVar = (zl) obj;
                            Map map3 = SessionInfoFragment.m0;
                            Context contextA3 = sessionInfoFragment.a0();
                            if (contextA3 != null) {
                                o11 o11Var7 = sessionInfoFragment.k0;
                                if (o11Var7 != null) {
                                    o11Var7.a(contextA3, zlVar.a);
                                }
                                o11 o11Var8 = sessionInfoFragment.l0;
                                if (o11Var8 != null) {
                                    o11Var8.a(contextA3, zlVar.b);
                                }
                                break;
                            }
                            break;
                    }
                }
            });
        }
        final int i8 = 0;
        MainApplication.v().r.G.e(h0(), new mq0(this) { // from class: r11
            public final /* synthetic */ SessionInfoFragment d;

            {
                this.d = this;
            }

            @Override // defpackage.mq0
            public final void b(Object obj) {
                Context contextA1;
                int iOrdinal;
                int i9 = i8;
                SessionInfoFragment sessionInfoFragment = this.d;
                switch (i9) {
                    case 0:
                        i81 i81Var = (i81) obj;
                        Map map = SessionInfoFragment.m0;
                        View view2 = sessionInfoFragment.H;
                        if (view2 != null) {
                            if (i81Var == null) {
                                sessionInfoFragment.Y0(view2);
                            } else {
                                int i10 = i81Var.a.c;
                                TextView textView2 = (TextView) view2.findViewById(R.id.session_info_sysinfo_status);
                                if ((i10 & 1) != 1) {
                                    textView2.setVisibility(8);
                                    if ((i10 & 2) != 2 && (contextA1 = sessionInfoFragment.a0()) != null) {
                                        ((o11) view2.findViewWithTag("ad.sys_info.version")).a(contextA1, i81Var.n);
                                        ((o11) view2.findViewWithTag("ad.sys_info.license")).a(contextA1, i81Var.o);
                                        ViewGroup viewGroup2 = (ViewGroup) view2.findViewById(R.id.session_info_sysinfo_blocks);
                                        viewGroup2.removeAllViews();
                                        SessionInfoFragment.R0(SessionInfoFragment.W0(i81Var), R.drawable.ic_nav_settings, JniAdExt.n1("ad.sys_info.os"), contextA1, viewGroup2);
                                        SessionInfoFragment.R0(SessionInfoFragment.V0(i81Var), R.drawable.ic_sysinfo_hardware, JniAdExt.n1("ad.sys_info.hardware"), contextA1, viewGroup2);
                                        SessionInfoFragment.S0(i81Var.b, R.drawable.ic_nav_settings_monitor, JniAdExt.n1("ad.tutorial.monitor.title"), contextA1, viewGroup2);
                                        SessionInfoFragment.S0(i81Var.c, R.drawable.ic_sysinfo_network, JniAdExt.n1("ad.sys_info.net.nic"), contextA1, viewGroup2);
                                    }
                                } else {
                                    textView2.setVisibility(0);
                                    textView2.setText(JniAdExt.n1("ad.sys_info.error.text"));
                                }
                            }
                            break;
                        }
                        break;
                    case 1:
                        String str = (String) obj;
                        o11 o11Var6 = sessionInfoFragment.e0;
                        if (o11Var6 != null) {
                            o11Var6.setValueUnfiltered(str);
                        }
                        break;
                    case 2:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        SessionInfoIconItem sessionInfoIconItem4 = sessionInfoFragment.f0;
                        if (sessionInfoIconItem4 != null) {
                            sessionInfoIconItem4.setActive(zBooleanValue);
                            sessionInfoFragment.f0.setText(zBooleanValue ? JniAdExt.n1("ad.status.tooltip.privacy") : JniAdExt.n1("ad.status.tooltip.privacy_disabled"));
                        }
                        break;
                    case 3:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        SessionInfoIconItem sessionInfoIconItem5 = sessionInfoFragment.g0;
                        if (sessionInfoIconItem5 != null) {
                            sessionInfoIconItem5.setActive(zBooleanValue2);
                        }
                        break;
                    case 4:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        SessionInfoIconItem sessionInfoIconItem6 = sessionInfoFragment.h0;
                        if (sessionInfoIconItem6 != null) {
                            sessionInfoIconItem6.setActive(zBooleanValue3);
                        }
                        break;
                    case 5:
                        kp kpVar = (kp) obj;
                        Map map2 = SessionInfoFragment.m0;
                        Context contextA2 = sessionInfoFragment.a0();
                        if (contextA2 != null && sessionInfoFragment.i0 != null && (iOrdinal = kpVar.ordinal()) != 0) {
                            sessionInfoFragment.i0.a(contextA2, iOrdinal != 1 ? iOrdinal != 2 ? null : JniAdExt.n1("ad.status.tooltip.tunnel_conn") : JniAdExt.n1("ad.status.tooltip.direct_conn"));
                        }
                        break;
                    default:
                        zl zlVar = (zl) obj;
                        Map map3 = SessionInfoFragment.m0;
                        Context contextA3 = sessionInfoFragment.a0();
                        if (contextA3 != null) {
                            o11 o11Var7 = sessionInfoFragment.k0;
                            if (o11Var7 != null) {
                                o11Var7.a(contextA3, zlVar.a);
                            }
                            o11 o11Var8 = sessionInfoFragment.l0;
                            if (o11Var8 != null) {
                                o11Var8.a(contextA3, zlVar.b);
                            }
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // defpackage.cd0
    public final void I(boolean z) {
        if (z) {
            uj.v(Y(), R.id.mainFragment);
        }
    }

    @Override // defpackage.z6
    public final boolean P0() {
        return true;
    }

    @Override // defpackage.z6
    public final boolean Q0() {
        return !(JniAdExt.s2(19) != 0);
    }

    public final void Y0(View view) {
        TextView textView = (TextView) view.findViewById(R.id.session_info_sysinfo_status);
        if (this.c0) {
            textView.setVisibility(0);
            textView.setText(JniAdExt.n1("ad.sys_info.updating"));
            return;
        }
        textView.setVisibility(8);
        ((ViewGroup) view.findViewById(R.id.session_info_sysinfo_blocks)).removeAllViews();
        Context contextA0 = a0();
        if (contextA0 != null) {
            ((o11) view.findViewWithTag("ad.sys_info.version")).a(contextA0, "");
            ((o11) view.findViewWithTag("ad.sys_info.license")).a(contextA0, "");
        }
    }

    public final void Z0(du0 du0Var) {
        View view;
        SessionInfoIconItem sessionInfoIconItem;
        Map map = m0;
        if (map.containsKey(du0Var) && (view = this.H) != null) {
            switch (du0Var.ordinal()) {
                case 0:
                    sessionInfoIconItem = (SessionInfoIconItem) view.findViewById(R.id.session_info_perm_input);
                    break;
                case 1:
                    sessionInfoIconItem = (SessionInfoIconItem) view.findViewById(R.id.session_info_perm_audio);
                    break;
                case 2:
                    sessionInfoIconItem = (SessionInfoIconItem) view.findViewById(R.id.session_info_perm_clipboard);
                    break;
                case 3:
                case 4:
                case 8:
                case 13:
                default:
                    sessionInfoIconItem = null;
                    break;
                case 5:
                    sessionInfoIconItem = (SessionInfoIconItem) view.findViewById(R.id.session_info_perm_file_manager);
                    break;
                case 6:
                    sessionInfoIconItem = (SessionInfoIconItem) view.findViewById(R.id.session_info_perm_lock_account);
                    break;
                case 7:
                    sessionInfoIconItem = (SessionInfoIconItem) view.findViewById(R.id.session_info_perm_record_session);
                    break;
                case 9:
                    sessionInfoIconItem = (SessionInfoIconItem) view.findViewById(R.id.session_info_perm_tcp_tunnel);
                    break;
                case 10:
                    sessionInfoIconItem = (SessionInfoIconItem) view.findViewById(R.id.session_info_perm_vpn);
                    break;
                case 11:
                    sessionInfoIconItem = (SessionInfoIconItem) view.findViewById(R.id.session_info_perm_privacy);
                    break;
                case 12:
                    sessionInfoIconItem = (SessionInfoIconItem) view.findViewById(R.id.session_info_perm_clipboard_files);
                    break;
                case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                    sessionInfoIconItem = (SessionInfoIconItem) view.findViewById(R.id.session_info_perm_sysinfo);
                    break;
                case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                    sessionInfoIconItem = (SessionInfoIconItem) view.findViewById(R.id.session_info_perm_mouse_pointer);
                    break;
                case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                    sessionInfoIconItem = (SessionInfoIconItem) view.findViewById(R.id.session_info_perm_modify_forbidden_windows);
                    break;
            }
            if (sessionInfoIconItem == null) {
                return;
            }
            boolean zU0 = U0(du0Var);
            sessionInfoIconItem.setText(String.format(zU0 ? JniAdExt.n1("ad.status.sess.remote.perm.is_allowed") : JniAdExt.n1("ad.status.sess.remote.perm.is_not_allowed"), map.get(du0Var)));
            sessionInfoIconItem.setActive(zU0);
        }
    }

    @Override // defpackage.z6, defpackage.l80
    public final boolean h(KeyEvent keyEvent) {
        View view;
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 20 && keyCode != 19) {
            return super.h(keyEvent);
        }
        if (keyEvent.getAction() == 1 || (view = this.H) == null) {
            return true;
        }
        ((ScrollView) view.findViewById(R.id.session_info_scroll_view)).arrowScroll(keyCode == 20 ? 130 : 33);
        return true;
    }

    @Override // defpackage.jl0
    public final boolean o(MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.jl0
    public final /* synthetic */ void p(Menu menu) {
    }

    @Override // defpackage.id0
    public final void q(du0 du0Var) {
        t70.Y(new d3(this, 26, du0Var));
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_session_info, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        JniAdExt.U3(this);
        JniAdExt.Y3(this);
    }

    @Override // defpackage.jl0
    public final void v(Menu menu, MenuInflater menuInflater) {
        menu.add(JniAdExt.n1("ad.sys_info.copy_to_clipboard")).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: q11
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                i81 i81Var;
                SessionInfoFragment sessionInfoFragment = this.a;
                Map map = SessionInfoFragment.m0;
                Context contextA0 = sessionInfoFragment.a0();
                if (contextA0 == null) {
                    return false;
                }
                lp lpVar = MainApplication.v().r;
                synchronized (lpVar) {
                    i81Var = (i81) lpVar.G.d();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(JniAdExt.n1("ad.cfg.sec.perm.permissions"));
                sb.append("\n\n");
                for (Map.Entry entry : SessionInfoFragment.m0.entrySet()) {
                    sb.append(String.format(SessionInfoFragment.U0((du0) entry.getKey()) ? JniAdExt.n1("ad.status.sess.remote.perm.is_allowed") : JniAdExt.n1("ad.status.sess.remote.perm.is_not_allowed"), entry.getValue()));
                    sb.append('\n');
                }
                sb.append("\n\n");
                sb.append(JniAdExt.n1("ad.sys_info.user"));
                sb.append("\n\n");
                s11[] s11VarArrX0 = SessionInfoFragment.X0(i81Var);
                for (int i = 0; i < 4; i++) {
                    sb.append(s11VarArrX0[i]);
                    sb.append('\n');
                }
                o11 o11Var = sessionInfoFragment.d0;
                if (o11Var != null) {
                    sb.append(o11Var.getValueText());
                    sb.append('\n');
                }
                sb.append(sessionInfoFragment.e0.getKeyText());
                sb.append(": ");
                sb.append(sessionInfoFragment.e0.getValueText());
                sb.append('\n');
                sb.append(sessionInfoFragment.f0.getText());
                sb.append('\n');
                sb.append(sessionInfoFragment.i0.getValueText());
                sb.append('\n');
                sb.append(sessionInfoFragment.j0.getValueText());
                sb.append('\n');
                sb.append(sessionInfoFragment.k0.getKeyText());
                sb.append(": ");
                sb.append(sessionInfoFragment.k0.getValueText());
                sb.append('\n');
                sb.append(sessionInfoFragment.l0.getKeyText());
                sb.append(": ");
                sb.append(sessionInfoFragment.l0.getValueText());
                sb.append('\n');
                if (i81Var != null && i81Var.a.equals(j81.d)) {
                    sb.append("\n\n");
                    sb.append(JniAdExt.n1("ad.sys_info.os"));
                    sb.append("\n\n");
                    s11[] s11VarArrW0 = SessionInfoFragment.W0(i81Var);
                    for (int i2 = 0; i2 < 4; i2++) {
                        sb.append(s11VarArrW0[i2]);
                        sb.append('\n');
                    }
                    sb.append("\n\n");
                    sb.append(JniAdExt.n1("ad.sys_info.hardware"));
                    sb.append("\n\n");
                    for (s11 s11Var : SessionInfoFragment.V0(i81Var)) {
                        sb.append(s11Var);
                        sb.append('\n');
                    }
                    SessionInfoFragment.T0(sb, i81Var.b, JniAdExt.n1("ad.tutorial.monitor.title"));
                    SessionInfoFragment.T0(sb, i81Var.c, JniAdExt.n1("ad.sys_info.net.nic"));
                }
                if (t70.d0(contextA0, JniAdExt.n1("ad.sys_info.short_title"), sb.toString(), sessionInfoFragment.b0)) {
                    t70.f0(contextA0, JniAdExt.n1("ad.status.tooltip.clipboard_text.android"), 0, null);
                }
                return true;
            }
        });
    }

    @Override // defpackage.jl0
    public final /* synthetic */ void y(Menu menu) {
    }

    @Override // defpackage.c40
    public final void z0(Bundle bundle) {
        bundle.putBoolean("SYSINFO_SUPPORTED", this.c0);
    }
}
