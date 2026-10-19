package defpackage;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import j$.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class xk extends yt {
    public al q0;
    public View r0;
    public EditText s0;
    public View t0;
    public View u0;
    public ViewGroup v0;
    public RecyclerView w0;
    public final s x0 = new s();
    public final xt0 y0 = new xt0(this);

    @Override // defpackage.xt, defpackage.c40
    public final void A0() {
        super.A0();
        al alVar = this.q0;
        alVar.getClass();
        MainApplication mainApplicationV = MainApplication.v();
        gq0 gq0Var = new gq0(mainApplicationV);
        int i = alVar.b;
        gq0Var.a(i);
        cj0 cj0Var = mainApplicationV.u;
        cj0Var.q(i);
        cj0Var.a(i);
        if (i != 0) {
            alVar.h.l(Boolean.valueOf(((z80) JniAdExt.C0.get(Integer.valueOf(i))) != null));
            JniAdExt.v1(alVar.c);
        }
        alVar.e = 0;
        zk zkVar = alVar.d;
        xd xdVar = JniAdExt.V;
        if (zkVar == null) {
            xdVar.remove(Integer.valueOf(i));
        } else {
            xdVar.put(Integer.valueOf(i), zkVar);
            JniAdExt.I0.post(new cp(i, 23));
        }
    }

    @Override // defpackage.xt, defpackage.c40
    public final void B0() {
        al alVar = this.q0;
        alVar.j.b(this.s0.getText().toString(), "unsent_message");
        al alVar2 = this.q0;
        JniAdExt.V.remove(Integer.valueOf(alVar2.b));
        if (alVar2.b != 0) {
            yk ykVar = alVar2.c;
            zd zdVar = JniAdExt.D;
            synchronized (zdVar) {
                zdVar.remove(ykVar);
            }
        }
        super.B0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        this.r0 = c0().inflate(R.layout.fragment_dialog_chat, (ViewGroup) null);
        bf1 bf1VarK = K();
        ze1 ze1VarB0 = b0();
        um0 um0VarT = t();
        ze1VarB0.getClass();
        ah ahVar = new ah(bf1VarK, ze1VarB0, um0VarT);
        fm fmVarA = nx0.a(al.class);
        String strU = y90.u(fmVarA);
        if (strU == null) {
            id.q("Local and anonymous classes can not be ViewModels");
            return null;
        }
        this.q0 = (al) ahVar.i(fmVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strU));
        ((TextView) this.r0.findViewById(R.id.chat_title)).setText(JniAdExt.n1("ad.accept.context.chat"));
        View viewFindViewById = this.r0.findViewById(R.id.chat_log_btn);
        this.u0 = viewFindViewById;
        final Object[] objArr = 0 == true ? 1 : 0;
        viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: vk
            public final /* synthetic */ xk d;

            {
                this.d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = objArr;
                xk xkVar = this.d;
                switch (i) {
                    case 0:
                        if (r71.q(JniAdExt.h2(io.KEY_CHAT_PATH_CFG)) != 1) {
                            final int i2 = xkVar.q0.b;
                            JniAdExt.I0.post(new Runnable() { // from class: qa0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    JniAdExt.jniOpenChatLog(i2);
                                }
                            });
                        } else {
                            xkVar.y0.u(view.getContext(), JniAdExt.n1("ad.cfg.priv.chat.none"));
                        }
                        break;
                    case 1:
                        xkVar.O0(false, false);
                        break;
                    case 2:
                        xkVar.y0.u(xkVar.a0(), JniAdExt.n1("ad.status.chat.session.closed"));
                        break;
                    default:
                        al alVar = xkVar.q0;
                        String string = xkVar.s0.getText().toString();
                        JniAdExt.I0.post(new cb0(alVar.b, string.trim(), 1));
                        xkVar.s0.setText("");
                        xkVar.s0.requestFocus();
                        break;
                }
            }
        });
        r3.H(this.u0, JniAdExt.n1("ad.chat.open_log"));
        View viewFindViewById2 = this.r0.findViewById(R.id.chat_close_btn);
        final int i = 1;
        viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: vk
            public final /* synthetic */ xk d;

            {
                this.d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                xk xkVar = this.d;
                switch (i2) {
                    case 0:
                        if (r71.q(JniAdExt.h2(io.KEY_CHAT_PATH_CFG)) != 1) {
                            final int i3 = xkVar.q0.b;
                            JniAdExt.I0.post(new Runnable() { // from class: qa0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    JniAdExt.jniOpenChatLog(i3);
                                }
                            });
                        } else {
                            xkVar.y0.u(view.getContext(), JniAdExt.n1("ad.cfg.priv.chat.none"));
                        }
                        break;
                    case 1:
                        xkVar.O0(false, false);
                        break;
                    case 2:
                        xkVar.y0.u(xkVar.a0(), JniAdExt.n1("ad.status.chat.session.closed"));
                        break;
                    default:
                        al alVar = xkVar.q0;
                        String string = xkVar.s0.getText().toString();
                        JniAdExt.I0.post(new cb0(alVar.b, string.trim(), 1));
                        xkVar.s0.setText("");
                        xkVar.s0.requestFocus();
                        break;
                }
            }
        });
        bu0.D(viewFindViewById2, JniAdExt.n1("ad.cfg.close"));
        RecyclerView recyclerView = (RecyclerView) this.r0.findViewById(R.id.chat_history_container);
        this.w0 = recyclerView;
        recyclerView.setItemAnimator(null);
        RecyclerView recyclerView2 = this.w0;
        s sVar = this.x0;
        recyclerView2.setAdapter(sVar);
        sVar.f = new wk(this);
        EditText editText = (EditText) this.r0.findViewById(R.id.chat_editor);
        this.s0 = editText;
        editText.setText((String) Objects.requireNonNullElse((String) this.q0.j.a("unsent_message"), ""));
        EditText editText2 = this.s0;
        WeakHashMap weakHashMap = oe1.a;
        if (Build.VERSION.SDK_INT >= 26) {
            ie1.c(editText2, true);
        }
        ViewGroup viewGroup = (ViewGroup) this.r0.findViewById(R.id.chat_disable_overlay);
        this.v0 = viewGroup;
        final int i2 = 2;
        viewGroup.setOnClickListener(new View.OnClickListener(this) { // from class: vk
            public final /* synthetic */ xk d;

            {
                this.d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                xk xkVar = this.d;
                switch (i3) {
                    case 0:
                        if (r71.q(JniAdExt.h2(io.KEY_CHAT_PATH_CFG)) != 1) {
                            final int i4 = xkVar.q0.b;
                            JniAdExt.I0.post(new Runnable() { // from class: qa0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    JniAdExt.jniOpenChatLog(i4);
                                }
                            });
                        } else {
                            xkVar.y0.u(view.getContext(), JniAdExt.n1("ad.cfg.priv.chat.none"));
                        }
                        break;
                    case 1:
                        xkVar.O0(false, false);
                        break;
                    case 2:
                        xkVar.y0.u(xkVar.a0(), JniAdExt.n1("ad.status.chat.session.closed"));
                        break;
                    default:
                        al alVar = xkVar.q0;
                        String string = xkVar.s0.getText().toString();
                        JniAdExt.I0.post(new cb0(alVar.b, string.trim(), 1));
                        xkVar.s0.setText("");
                        xkVar.s0.requestFocus();
                        break;
                }
            }
        });
        View viewFindViewById3 = this.r0.findViewById(R.id.chat_send_button);
        this.t0 = viewFindViewById3;
        final int i3 = 3;
        viewFindViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: vk
            public final /* synthetic */ xk d;

            {
                this.d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                xk xkVar = this.d;
                switch (i4) {
                    case 0:
                        if (r71.q(JniAdExt.h2(io.KEY_CHAT_PATH_CFG)) != 1) {
                            final int i5 = xkVar.q0.b;
                            JniAdExt.I0.post(new Runnable() { // from class: qa0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    JniAdExt.jniOpenChatLog(i5);
                                }
                            });
                        } else {
                            xkVar.y0.u(view.getContext(), JniAdExt.n1("ad.cfg.priv.chat.none"));
                        }
                        break;
                    case 1:
                        xkVar.O0(false, false);
                        break;
                    case 2:
                        xkVar.y0.u(xkVar.a0(), JniAdExt.n1("ad.status.chat.session.closed"));
                        break;
                    default:
                        al alVar = xkVar.q0;
                        String string = xkVar.s0.getText().toString();
                        JniAdExt.I0.post(new cb0(alVar.b, string.trim(), 1));
                        xkVar.s0.setText("");
                        xkVar.s0.requestFocus();
                        break;
                }
            }
        });
        r3.H(this.t0, JniAdExt.n1("ad.chat.send"));
        this.q0.i.e(this, new y2(i, this));
        this.q0.g.e(this, new y2(i2, sVar));
        View view = this.u0;
        boolean z = r71.q(JniAdExt.h2(io.KEY_CHAT_PATH_CFG)) != 1;
        if (view != null) {
            view.setActivated(z);
        }
        uk ukVar = new uk(I0(), new x6(i, this));
        ukVar.setView(this.r0);
        ukVar.setCanceledOnTouchOutside(true);
        return ukVar;
    }

    @Override // defpackage.yt, defpackage.xt, defpackage.c40
    public final void t0() {
        this.x0.f = null;
        super.t0();
    }

    @Override // defpackage.c40
    public final void y0() {
        this.F = true;
        View view = this.u0;
        boolean z = r71.q(JniAdExt.h2(io.KEY_CHAT_PATH_CFG)) != 1;
        if (view != null) {
            view.setActivated(z);
        }
    }
}
