package defpackage;

import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;
import com.anydesk.jni.JniAdExt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yz implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ FileManagerFileListFragment d;

    public /* synthetic */ yz(FileManagerFileListFragment fileManagerFileListFragment, int i) {
        this.c = i;
        this.d = fileManagerFileListFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        int i = 0;
        switch (this.c) {
            case 0:
                FileManagerFileListFragment fileManagerFileListFragment = this.d;
                fileManagerFileListFragment.X0();
                fileManagerFileListFragment.g1();
                return;
            case 1:
                FileManagerFileListFragment fileManagerFileListFragment2 = this.d;
                fileManagerFileListFragment2.X0();
                fileManagerFileListFragment2.U0(fileManagerFileListFragment2.c0);
                return;
            case 2:
                FileManagerFileListFragment fileManagerFileListFragment3 = this.d;
                fileManagerFileListFragment3.X0();
                fileManagerFileListFragment3.U0(!fileManagerFileListFragment3.c0);
                return;
            case 3:
                FileManagerFileListFragment fileManagerFileListFragment4 = this.d;
                fileManagerFileListFragment4.X0();
                gi giVar = new gi(fileManagerFileListFragment4.I0(), view);
                fileManagerFileListFragment4.t0 = giVar;
                giVar.d = new ev(7, this);
                giVar.f(R.menu.menu_filemanager_overflow);
                rk0 rk0Var = (rk0) fileManagerFileListFragment4.t0.b;
                if (q51.p(rk0Var)) {
                    rk0Var.setGroupDividerEnabled(true);
                } else if (Build.VERSION.SDK_INT >= 28) {
                    d6.C(rk0Var);
                }
                MenuItem menuItemFindItem = ((rk0) fileManagerFileListFragment4.t0.b).findItem(R.id.menu_filemanager_overflow_search);
                menuItemFindItem.setTitle(JniAdExt.n1("ad.file_browser.search"));
                LinearLayout linearLayout = fileManagerFileListFragment4.D0;
                if (linearLayout != null) {
                    menuItemFindItem.setVisible(linearLayout.getVisibility() != 0);
                }
                ((rk0) fileManagerFileListFragment4.t0.b).findItem(R.id.menu_filemanager_overflow_refresh).setTitle(JniAdExt.n1("ad.file_browser.refresh"));
                MenuItem menuItemFindItem2 = ((rk0) fileManagerFileListFragment4.t0.b).findItem(R.id.menu_filemanager_overflow_sort);
                menuItemFindItem2.setTitle(JniAdExt.n1("ad.file_browser.sort"));
                x00 x00Var = fileManagerFileListFragment4.b0;
                if (x00Var != null) {
                    menuItemFindItem2.setIcon(x00Var.o(fileManagerFileListFragment4.c0) == 2 ? R.drawable.ic_filemanager_sort_descending : R.drawable.ic_filemanager_sort_ascending);
                }
                MenuItem menuItemFindItem3 = ((rk0) fileManagerFileListFragment4.t0.b).findItem(R.id.menu_filemanager_overflow_dir_create);
                menuItemFindItem3.setTitle(JniAdExt.n1("ad.file_browser.menu.new_folder"));
                if (x00Var != null) {
                    menuItemFindItem3.setVisible(x00Var.m(fileManagerFileListFragment4.c0) == 1);
                }
                ((rk0) fileManagerFileListFragment4.t0.b).findItem(R.id.menu_filemanager_overflow_dir_goto).setTitle(JniAdExt.n1("ad.file_browser.goto.title.android"));
                MenuItem menuItemFindItem4 = ((rk0) fileManagerFileListFragment4.t0.b).findItem(R.id.menu_filemanager_overflow_delete);
                fileManagerFileListFragment4.u0 = menuItemFindItem4;
                menuItemFindItem4.setTitle(JniAdExt.n1("ad.file_browser.menu.delete"));
                MenuItem menuItemFindItem5 = ((rk0) fileManagerFileListFragment4.t0.b).findItem(R.id.menu_filemanager_overflow_properties);
                fileManagerFileListFragment4.v0 = menuItemFindItem5;
                menuItemFindItem5.setTitle(JniAdExt.n1("ad.file_browser.menu.properties"));
                if (x00Var != null) {
                    v00 v00Var = (v00) (fileManagerFileListFragment4.c0 ? x00Var.G : x00Var.E).d();
                    if (v00Var == null) {
                        return;
                    } else {
                        FileManagerFileListFragment.S0(fileManagerFileListFragment4, v00Var.a);
                    }
                }
                cl0 cl0Var = (cl0) fileManagerFileListFragment4.t0.c;
                cl0Var.g = true;
                al0 al0Var = cl0Var.i;
                if (al0Var != null) {
                    al0Var.q(true);
                }
                fileManagerFileListFragment4.t0.k();
                return;
            case 4:
                this.d.X0();
                FileManagerFileListFragment fileManagerFileListFragment5 = this.d;
                x00 x00Var2 = fileManagerFileListFragment5.b0;
                if (x00Var2 != null) {
                    boolean z2 = fileManagerFileListFragment5.c0;
                    synchronized (x00Var2.c) {
                        try {
                            z = z2 ? x00Var2.r : x00Var2.s;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (z) {
                        return;
                    }
                    x00Var2.I(this.d.c0, true);
                    JniAdExt.I0.post(new fb0(6, this.d.c0));
                    return;
                }
                return;
            case 5:
                MainApplication.v().n();
                this.d.h1();
                return;
            case 6:
                FileManagerFileListFragment fileManagerFileListFragment6 = this.d;
                fileManagerFileListFragment6.X0();
                FileManagerFileListFragment.Q0(fileManagerFileListFragment6);
                return;
            case 7:
                FileManagerFileListFragment fileManagerFileListFragment7 = this.d;
                fileManagerFileListFragment7.X0();
                fileManagerFileListFragment7.y0.requestFocus();
                x00 x00Var3 = fileManagerFileListFragment7.b0;
                if (x00Var3 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = fileManagerFileListFragment7.Q0.c;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    mz mzVar = (mz) obj;
                    if (mzVar != null && !mzVar.d()) {
                        arrayList.add(Long.valueOf(mzVar.a()));
                    }
                }
                x00Var3.x(fileManagerFileListFragment7.c0, arrayList, ((CheckBox) view).isChecked());
                fileManagerFileListFragment7.l1();
                uz uzVar = fileManagerFileListFragment7.j0;
                if (uzVar == null) {
                    return;
                }
                uzVar.d();
                return;
            case 8:
                FileManagerFileListFragment fileManagerFileListFragment8 = this.d;
                fileManagerFileListFragment8.X0();
                fileManagerFileListFragment8.g1();
                return;
            case 9:
                FileManagerFileListFragment fileManagerFileListFragment9 = this.d;
                fileManagerFileListFragment9.X0();
                fileManagerFileListFragment9.g1();
                return;
            default:
                FileManagerFileListFragment fileManagerFileListFragment10 = this.d;
                fileManagerFileListFragment10.X0();
                fileManagerFileListFragment10.g1();
                return;
        }
    }
}
