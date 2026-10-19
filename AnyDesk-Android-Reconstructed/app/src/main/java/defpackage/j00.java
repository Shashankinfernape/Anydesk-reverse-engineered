package defpackage;

import android.view.View;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class j00 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ FileManagerFragment d;

    public /* synthetic */ j00(FileManagerFragment fileManagerFragment, int i) {
        this.c = i;
        this.d = fileManagerFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        FileManagerFragment fileManagerFragment = this.d;
        switch (i) {
            case 0:
                uj.v(fileManagerFragment.Y(), R.id.fileManagerProgressListFragmentWrapper);
                break;
            case 1:
                uj.v(fileManagerFragment.Y(), R.id.fileManagerProgressListFragmentWrapper);
                break;
            default:
                JniAdExt.hideDialog();
                JniAdExt.V1();
                fileManagerFragment.S0();
                break;
        }
    }
}
