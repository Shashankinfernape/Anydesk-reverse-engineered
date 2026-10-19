package defpackage;

import android.widget.CompoundButton;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;

/* JADX INFO: loaded from: classes.dex */
public final class oz implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ mz a;
    public final /* synthetic */ int b;
    public final /* synthetic */ uz c;

    public oz(uz uzVar, mz mzVar, int i) {
        this.c = uzVar;
        this.a = mzVar;
        this.b = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        uz uzVar = this.c;
        FileManagerFileListFragment fileManagerFileListFragment = uzVar.f;
        if (fileManagerFileListFragment != null) {
            fileManagerFileListFragment.Z0(this.a, z, this.b == uzVar.e.size() - 1);
        }
    }
}
