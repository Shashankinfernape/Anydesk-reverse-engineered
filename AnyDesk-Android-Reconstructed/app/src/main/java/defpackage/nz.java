package defpackage;

import android.view.MenuItem;
import android.view.View;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;
import com.anydesk.jni.JniAdExt;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class nz implements View.OnLongClickListener {
    public final /* synthetic */ mz c;
    public final /* synthetic */ tz d;
    public final /* synthetic */ uz e;

    public nz(uz uzVar, mz mzVar, tz tzVar) {
        this.e = uzVar;
        this.c = mzVar;
        this.d = tzVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        v00 v00Var;
        FileManagerFileListFragment fileManagerFileListFragment = this.e.f;
        if (fileManagerFileListFragment == null) {
            return false;
        }
        int iB = this.d.b();
        fileManagerFileListFragment.X0();
        mz mzVar = this.c;
        if (mzVar != null && !mzVar.d()) {
            gi giVar = new gi(fileManagerFileListFragment.I0(), view);
            fileManagerFileListFragment.s0 = giVar;
            xb xbVar = new xb();
            xbVar.f = fileManagerFileListFragment;
            xbVar.d = mzVar;
            xbVar.c = iB;
            xbVar.e = view;
            giVar.d = xbVar;
            giVar.f(R.menu.menu_filemanager_roster_item);
            MenuItem menuItemFindItem = ((rk0) fileManagerFileListFragment.s0.b).findItem(R.id.menu_filemanager_roster_item_select);
            menuItemFindItem.setTitle(JniAdExt.n1("ad.file_browser.menu.select"));
            MenuItem menuItemFindItem2 = ((rk0) fileManagerFileListFragment.s0.b).findItem(R.id.menu_filemanager_roster_item_rename);
            menuItemFindItem2.setTitle(JniAdExt.n1("ad.file_browser.menu.rename"));
            MenuItem menuItemFindItem3 = ((rk0) fileManagerFileListFragment.s0.b).findItem(R.id.menu_filemanager_roster_item_delete);
            menuItemFindItem3.setTitle(JniAdExt.n1("ad.file_browser.menu.delete"));
            ((rk0) fileManagerFileListFragment.s0.b).findItem(R.id.menu_filemanager_roster_item_properties).setTitle(JniAdExt.n1("ad.file_browser.menu.properties"));
            x00 x00Var = fileManagerFileListFragment.b0;
            if (!er0.g) {
                menuItemFindItem.setVisible(false);
            } else if (x00Var != null) {
                v00 v00Var2 = (v00) (fileManagerFileListFragment.c0 ? x00Var.E : x00Var.G).d();
                if (v00Var2 != null) {
                    menuItemFindItem.setVisible(v00Var2.a.isEmpty());
                }
            }
            if (mzVar.a && x00Var != null && x00Var.k) {
                menuItemFindItem2.setVisible(false);
                menuItemFindItem3.setVisible(false);
            }
            gi giVar2 = fileManagerFileListFragment.s0;
            giVar2.e = new a00(fileManagerFileListFragment);
            cl0 cl0Var = (cl0) giVar2.c;
            cl0Var.g = true;
            al0 al0Var = cl0Var.i;
            if (al0Var != null) {
                al0Var.q(true);
            }
            fileManagerFileListFragment.s0.k();
            if (view != null) {
                x00 x00Var2 = fileManagerFileListFragment.b0;
                g00 g00Var = fileManagerFileListFragment.m0;
                if (x00Var2 != null && g00Var != null) {
                    g00Var.i = mzVar;
                    g00Var.j = view;
                    if (mzVar.e()) {
                        v00Var = (v00) (fileManagerFileListFragment.c0 ? x00Var2.G : x00Var2.E).d();
                    } else {
                        v00Var = new v00(new ArrayList(Collections.singleton(mzVar.b)), new ArrayList(Collections.singleton(Long.valueOf(mzVar.a()))), mzVar.g, mzVar.i, mzVar.c());
                    }
                    g00Var.k = v00Var;
                    g00Var.e = true;
                }
            }
        }
        return true;
    }
}
