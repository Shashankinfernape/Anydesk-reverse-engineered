package defpackage;

import android.view.MenuItem;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class vi0 implements wu0, vu0 {
    public final /* synthetic */ dj c;

    public /* synthetic */ vi0(dj djVar) {
        this.c = djVar;
    }

    @Override // defpackage.vu0
    public void onDismiss() {
        this.c.c = false;
    }

    @Override // defpackage.wu0
    public boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.telemetry_open) {
            MainApplication.v().B(R.id.settingsFragmentGeneralWrapper, v11.d);
            return true;
        }
        if (itemId != R.id.telemetry_remove) {
            return false;
        }
        JniAdExt.x4(io.KEY_UI_SHOW_TILE_TELEMETRY, false);
        ((MainFragment) this.c.d).d1();
        return true;
    }
}
