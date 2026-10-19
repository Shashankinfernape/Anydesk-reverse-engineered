package defpackage;

import android.content.Intent;
import android.view.View;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;
import com.anydesk.jni.JniAdExt;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class po implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ ConnectionFragment d;

    public /* synthetic */ po(ConnectionFragment connectionFragment, int i) {
        this.c = i;
        this.d = connectionFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.c) {
            case 0:
                ConnectionFragment connectionFragment = this.d;
                lp lpVar = connectionFragment.d0;
                if (lpVar == null) {
                    return;
                }
                lpVar.B(false);
                JniAdExt.I0.post(new tb0(11));
                connectionFragment.x1();
                connectionFragment.n1(0);
                return;
            case 1:
                ConnectionFragment connectionFragment2 = this.d;
                lp lpVar2 = connectionFragment2.d0;
                if (lpVar2 == null) {
                    return;
                }
                if (lpVar2.q()) {
                    connectionFragment2.i1();
                    return;
                }
                lp lpVar3 = connectionFragment2.d0;
                if (lpVar3 == null) {
                    return;
                }
                lpVar3.B(true);
                JniAdExt.I0.post(new fb0(10, true));
                connectionFragment2.x1();
                connectionFragment2.n1(0);
                return;
            case 2:
                this.d.h1();
                return;
            case 3:
                ConnectionFragment connectionFragment3 = this.d;
                lp lpVar4 = connectionFragment3.d0;
                if (lpVar4 != null) {
                    connectionFragment3.a1();
                    lpVar4.w(ke0.c);
                    return;
                }
                return;
            case 4:
                ConnectionFragment connectionFragment4 = this.d;
                lp lpVar5 = connectionFragment4.d0;
                if (lpVar5 != null) {
                    int iOrdinal = lpVar5.d().ordinal() + 1;
                    ke0[] ke0VarArr = ke0.g;
                    int length = iOrdinal % ke0VarArr.length;
                    if (length == 0) {
                        length++;
                    }
                    lpVar5.w(ke0VarArr[length]);
                    connectionFragment4.p1();
                    return;
                }
                return;
            case 5:
                this.d.k1();
                return;
            case 6:
                this.d.k1();
                return;
            case 7:
                lp lpVar6 = this.d.d0;
                if (lpVar6 == null) {
                    return;
                }
                boolean zR = lpVar6.r();
                ConnectionFragment connectionFragment5 = this.d;
                if (zR) {
                    r3.I(connectionFragment5.g1, 8);
                    r3.I(this.d.f1, 0);
                } else {
                    r3.I(connectionFragment5.f1, 8);
                    r3.I(this.d.g1, 0);
                }
                boolean zR2 = true ^ lpVar6.r();
                synchronized (lpVar6) {
                    lpVar6.m = zR2;
                }
                ConnectionFragment connectionFragment6 = this.d;
                lp lpVar7 = connectionFragment6.d0;
                FloatingActionButton floatingActionButton = connectionFragment6.s1;
                if (lpVar7 == null || floatingActionButton == null) {
                    return;
                }
                floatingActionButton.setImageResource(lpVar7.r() ? R.drawable.ic_key_extend : R.drawable.ic_key_shrink);
                return;
            case 8:
                ConnectionFragment connectionFragment7 = this.d;
                connectionFragment7.i1.getText().clear();
                connectionFragment7.n1.getText().clear();
                return;
            case 9:
                ConnectionFragment connectionFragment8 = this.d;
                try {
                    connectionFragment8.E1.a(new Intent("android.speech.action.RECOGNIZE_SPEECH"));
                    return;
                } catch (Throwable unused) {
                    connectionFragment8.C1.u(connectionFragment8.a0(), JniAdExt.n1("ad.msg.microphone_failed.android"));
                    return;
                }
            default:
                JniAdExt.V1();
                this.d.V0();
                return;
        }
    }
}
