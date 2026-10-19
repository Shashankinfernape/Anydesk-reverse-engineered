package defpackage;

import android.view.MenuItem;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.SetupFragment;

/* JADX INFO: loaded from: classes.dex */
public final class u31 implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ SetupFragment a;

    public u31(SetupFragment setupFragment) {
        this.a = setupFragment;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        uj.v(this.a.Y(), R.id.traceFragment);
        return true;
    }
}
