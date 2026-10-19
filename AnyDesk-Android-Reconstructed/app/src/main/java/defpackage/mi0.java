package defpackage;

import android.view.View;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.jni.JniAdExt;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mi0 implements mq0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ MainFragment d;

    public /* synthetic */ mi0(int i, MainFragment mainFragment) {
        this.c = i;
        this.d = mainFragment;
    }

    @Override // defpackage.mq0
    public final void b(Object obj) {
        int i = this.c;
        MainFragment mainFragment = this.d;
        switch (i) {
            case 0:
                List list = (List) obj;
                View view = mainFragment.H;
                if (view != null) {
                    MainFragment.h1(view.findViewById(R.id.addr_card_pending_files), JniAdExt.n1("ad.file_transfer.connection.info"), list);
                    View viewFindViewById = view.findViewById(R.id.disconnect_outgoing_card_pending_files);
                    AdEditText adEditText = mainFragment.W0;
                    MainFragment.h1(viewFindViewById, MainApplication.v().s.j ? JniAdExt.n1("ad.file_transfer.open.info") : String.format(JniAdExt.n1("ad.file_transfer.close.info"), adEditText == null ? null : adEditText.getText()), list);
                    break;
                }
                break;
            case 1:
                r3.J(mainFragment.H0, ((Integer) obj).intValue());
                break;
            default:
                r3.J(mainFragment.I0, ((Integer) obj).intValue());
                break;
        }
    }
}
