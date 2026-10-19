package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class uz extends iw0 {
    public Context d;
    public final ArrayList e;
    public FileManagerFileListFragment f = null;
    public boolean g = true;
    public sz h = null;
    public sz i = null;

    public uz(Context context, ArrayList arrayList) {
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
        boolean z;
        mz mzVar = (mz) this.e.get(i);
        synchronized (mzVar) {
            z = mzVar.l;
        }
        if (z) {
            return mzVar.a();
        }
        throw new RuntimeException(q51.m(new StringBuilder(), mzVar.b, "does not have id set"));
    }

    @Override // defpackage.iw0
    public final void e(hx0 hx0Var, int i) {
        int i2;
        tz tzVar = (tz) hx0Var;
        mz mzVar = (mz) this.e.get(i);
        View view = tzVar.u;
        TextView textView = tzVar.A;
        TextView textView2 = tzVar.z;
        view.setOnClickListener(new p(this, 6, mzVar));
        view.setOnLongClickListener(new nz(this, mzVar, tzVar));
        CheckBox checkBox = tzVar.B;
        checkBox.setOnClickListener(new p(this, mzVar, tzVar));
        checkBox.setOnCheckedChangeListener(new oz(this, mzVar, i));
        sz szVar = new sz(this, new GestureDetector(this.d, new pz(this, tzVar)));
        this.h = szVar;
        tzVar.w.setOnTouchListener(szVar);
        tzVar.y.setOnTouchListener(this.h);
        sz szVar2 = new sz(this, new GestureDetector(this.d, new rz(this)));
        this.i = szVar2;
        view.setOnTouchListener(szVar2);
        ImageView imageView = tzVar.v;
        boolean zC = mzVar.c();
        xy xyVar = mzVar.e;
        imageView.setImageResource(zC ? R.drawable.ic_filemanager_folder : R.drawable.ic_filemanager_file);
        imageView.setAlpha((mzVar.f.c & 16) == 16 ? 0.5f : 1.0f);
        tzVar.x.setText(lg.c().e(mzVar.c));
        textView2.setText((xyVar.c & 64) == 64 ? lg.c().e(x00.k(mzVar.i)) : "");
        textView2.setVisibility(mzVar.d() ? 8 : 0);
        textView.setText((xyVar.c & 128) == 128 ? lg.c().e(mzVar.h) : "");
        textView.setVisibility(mzVar.c() ? 8 : 0);
        if (this.g) {
            i2 = mzVar.d() ? 4 : 0;
        } else {
            i2 = 8;
        }
        checkBox.setVisibility(i2);
        checkBox.setChecked(mzVar.e());
        tzVar.C.setVisibility(checkBox.getVisibility() != 8 ? 8 : 0);
    }

    @Override // defpackage.iw0
    public final hx0 f(ViewGroup viewGroup, int i) {
        return new tz(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.filemanager_roster_item, viewGroup, false));
    }
}
