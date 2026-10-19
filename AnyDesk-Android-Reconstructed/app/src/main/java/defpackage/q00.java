package defpackage;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerProgressListFragment;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q00 extends iw0 {
    public Context d;
    public final ArrayList e;
    public FileManagerProgressListFragment f = null;

    public q00(Context context, ArrayList arrayList) {
        this.d = context;
        this.e = arrayList;
        h();
    }

    @Override // defpackage.iw0
    public final int a() {
        return this.e.size();
    }

    @Override // defpackage.iw0
    public final long b(int i) {
        return ((n00) this.e.get(i)).a;
    }

    @Override // defpackage.iw0
    public final void e(hx0 hx0Var, int i) {
        int i2;
        p00 p00Var = (p00) hx0Var;
        n00 n00Var = (n00) this.e.get(i);
        int i3 = n00Var.b;
        int i4 = n00Var.h;
        int i5 = n00Var.b;
        int i6 = (int) (((i3 == 6 || i3 == 5) ? 1.0f : n00Var.i) * 100.0f);
        boolean z = n00Var.g > 0;
        boolean z2 = n00Var.f > 1;
        ImageView imageView = p00Var.u;
        ImageView imageView2 = p00Var.A;
        LinearProgressIndicator linearProgressIndicator = p00Var.v;
        LinearProgressIndicator linearProgressIndicator2 = p00Var.w;
        int i7 = n00Var.c;
        if (i7 == 3) {
            if (z) {
                i2 = R.drawable.ic_filemanager_progress_delete_folder;
            } else {
                i2 = z2 ? R.drawable.ic_filemanager_progress_delete_files : R.drawable.ic_filemanager_progress_delete_file;
            }
        } else if (i7 == 1) {
            if (z) {
                i2 = R.drawable.ic_filemanager_progress_download_folder;
            } else {
                i2 = z2 ? R.drawable.ic_filemanager_progress_download_files : R.drawable.ic_filemanager_progress_download_file;
            }
        } else if (z) {
            i2 = R.drawable.ic_filemanager_progress_upload_folder;
        } else {
            i2 = z2 ? R.drawable.ic_filemanager_progress_upload_files : R.drawable.ic_filemanager_progress_upload_file;
        }
        imageView.setImageResource(i2);
        linearProgressIndicator.setProgress(i6);
        Context context = this.d;
        int i8 = ((i5 == 4 && i4 != 0) || i5 == 6 || i5 == 5) ? R.color.colorFileManagerProgressErrorIndicator : R.color.colorFileManagerProgressSuccessIndicator;
        Looper looper = t70.a;
        linearProgressIndicator.setIndicatorColor(uj.l(context, i8));
        linearProgressIndicator2.setIndicatorColor(uj.l(this.d, ((i5 == 4 && i4 != 0) || i5 == 6 || i5 == 5) ? R.color.colorFileManagerBackgroundProgressErrorIndicator : R.color.colorFileManagerBackgroundProgressSuccessIndicator));
        linearProgressIndicator2.setProgress(i6);
        linearProgressIndicator2.setVisibility(i6 < 100 ? 0 : 4);
        p00Var.x.setText(lg.c().e(n00Var.j));
        p00Var.y.setText(lg.c().e(n00Var.k));
        p00Var.z.setText(lg.c().e(n00Var.l));
        imageView2.setImageResource(n00Var.a() ? R.drawable.ic_filemanager_progress_discard : R.drawable.ic_filemanager_progress_terminate);
        imageView2.setOnClickListener(new o00(this, n00Var, p00Var, 0));
    }

    @Override // defpackage.iw0
    public final hx0 f(ViewGroup viewGroup, int i) {
        return new p00(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.filemanager_progress_item, viewGroup, false));
    }
}
