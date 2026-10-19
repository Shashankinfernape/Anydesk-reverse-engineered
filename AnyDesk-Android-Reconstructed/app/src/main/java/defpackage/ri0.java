package defpackage;

import android.content.Intent;
import androidx.core.widget.NestedScrollView;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.jni.JniAdExt;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ri0 implements j6, r6, ip0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ MainFragment d;

    public /* synthetic */ ri0(int i, MainFragment mainFragment) {
        this.c = i;
        this.d = mainFragment;
    }

    @Override // defpackage.j6
    public void c(Object obj) {
        int i = this.c;
        MainFragment mainFragment = this.d;
        switch (i) {
            case 0:
                i6 i6Var = (i6) obj;
                if (i6Var != null && i6Var.c == -1) {
                    Intent intent = i6Var.d;
                    t70.b(mainFragment.a0(), intent != null ? intent.getData() : null, true, "contentb.tmp", mainFragment.e0, JniAdExt.n1("ad.status.select_files.upload.title"), new oo(1));
                }
                break;
            case 1:
                MainFragment.U0(mainFragment);
                JniAdExt.M4();
                break;
            default:
                Map map = (Map) obj;
                if (map != null && r3.b(map.values())) {
                    MainFragment.R0(mainFragment);
                    JniAdExt.M4();
                }
                break;
        }
    }

    @Override // defpackage.r6
    public void h(String str) {
        MainFragment mainFragment = this.d;
        mainFragment.H1.e(str);
        r3.I(mainFragment.T0, str.isEmpty() ? 8 : 0);
    }

    @Override // defpackage.r6
    public boolean k() {
        MainFragment mainFragment = this.d;
        MainFragment.X0(mainFragment, mainFragment.a1());
        return true;
    }

    @Override // defpackage.ip0
    public void m(NestedScrollView nestedScrollView, int i) {
        r3.I(this.d.f0, i > 0 ? 0 : 4);
    }
}
