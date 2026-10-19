package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;
import com.anydesk.jni.JniAdExt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class xb implements wu0 {
    public int c;
    public Object d;
    public Object e;
    public Object f;

    public xb(DrawerLayout drawerLayout, int i) {
        this.f = drawerLayout;
        this.e = new c(17, this);
        this.c = i;
    }

    public void a() {
        ImageView imageView = (ImageView) this.d;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            av.a(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 && i == 21) {
                if (((fa1) this.f) == null) {
                    this.f = new fa1();
                }
                fa1 fa1Var = (fa1) this.f;
                fa1Var.a = null;
                fa1Var.d = false;
                fa1Var.b = null;
                fa1Var.c = false;
                ColorStateList imageTintList = imageView.getImageTintList();
                if (imageTintList != null) {
                    fa1Var.d = true;
                    fa1Var.a = imageTintList;
                }
                PorterDuff.Mode imageTintMode = imageView.getImageTintMode();
                if (imageTintMode != null) {
                    fa1Var.c = true;
                    fa1Var.b = imageTintMode;
                }
                if (fa1Var.d || fa1Var.c) {
                    tb.e(drawable, fa1Var, imageView.getDrawableState());
                    return;
                }
            }
            fa1 fa1Var2 = (fa1) this.e;
            if (fa1Var2 != null) {
                tb.e(drawable, fa1Var2, imageView.getDrawableState());
            }
        }
    }

    public int b(View view, int i) {
        DrawerLayout drawerLayout = (DrawerLayout) this.f;
        if (drawerLayout.b(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    public vn0 c(int i, vn0 vn0Var, vn0 vn0Var2, boolean z) {
        xn0 xn0Var = (xn0) this.d;
        x51 x51Var = (x51) this.e;
        vn0 vn0VarC = (vn0) x51Var.c(i);
        if (vn0Var2 != null) {
            if (y90.e(vn0VarC, vn0Var2) && y90.e(vn0VarC.e, vn0Var2.e)) {
                return vn0VarC;
            }
            vn0VarC = null;
        } else if (vn0VarC != null) {
            return vn0VarC;
        }
        if (z) {
            Iterator it = ((mp) h11.b0(new j2(2, x51Var))).iterator();
            do {
                if (!it.hasNext()) {
                    vn0VarC = null;
                    break;
                }
                vn0 vn0Var3 = (vn0) it.next();
                vn0VarC = (!(vn0Var3 instanceof xn0) || vn0Var3.equals(vn0Var)) ? null : ((xn0) vn0Var3).i.c(i, xn0Var, vn0Var2, true);
            } while (vn0VarC == null);
        }
        if (vn0VarC != null) {
            return vn0VarC;
        }
        xn0 xn0Var2 = xn0Var.e;
        if (xn0Var2 == null || xn0Var2.equals(vn0Var)) {
            return null;
        }
        xn0 xn0Var3 = xn0Var.e;
        xn0Var3.getClass();
        return xn0Var3.i.c(i, xn0Var, vn0Var2, z);
    }

    public void d(AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        int resourceId;
        ImageView imageView = (ImageView) this.d;
        Context context = imageView.getContext();
        int[] iArr = yv0.f;
        y6 y6VarC = y6.C(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) y6VarC.e;
        oe1.m(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) y6VarC.e, i);
        try {
            Drawable drawable3 = imageView.getDrawable();
            if (drawable3 == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable3 = ec1.r(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                av.a(drawable3);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(y6VarC.s(2));
                if (Build.VERSION.SDK_INT == 21 && (drawable2 = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(av.b(typedArray.getInt(3, -1), null));
                if (Build.VERSION.SDK_INT == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } finally {
            y6VarC.F();
        }
    }

    public un0 e(un0 un0Var, y6 y6Var, boolean z, vn0 vn0Var) {
        un0 un0VarI;
        xn0 xn0Var = (xn0) this.d;
        ArrayList arrayList = new ArrayList();
        Iterator it = xn0Var.iterator();
        while (true) {
            yn0 yn0Var = (yn0) it;
            un0VarI = null;
            if (!yn0Var.hasNext()) {
                break;
            }
            vn0 vn0Var2 = (vn0) yn0Var.next();
            un0VarI = y90.e(vn0Var2, vn0Var) ? null : vn0Var2.e(y6Var);
            if (un0VarI != null) {
                arrayList.add(un0VarI);
            }
        }
        un0 un0Var2 = (un0) tm.q0(arrayList);
        xn0 xn0Var2 = xn0Var.e;
        if (xn0Var2 != null && z && !xn0Var2.equals(vn0Var)) {
            un0VarI = xn0Var2.i(y6Var, xn0Var);
        }
        return (un0) tm.q0(ae.R(new un0[]{un0Var, un0Var2, un0VarI}));
    }

    public void f(View view, int i) {
        int width = view.getWidth();
        DrawerLayout drawerLayout = (DrawerLayout) this.f;
        float width2 = (drawerLayout.b(view, 3) ? i + width : drawerLayout.getWidth() - i) / width;
        drawerLayout.q(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    public void g(int i) {
        ImageView imageView = (ImageView) this.d;
        if (i != 0) {
            Drawable drawableR = ec1.r(imageView.getContext(), i);
            if (drawableR != null) {
                av.a(drawableR);
            }
            imageView.setImageDrawable(drawableR);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }

    @Override // defpackage.wu0
    public boolean onMenuItemClick(MenuItem menuItem) {
        FileManagerFileListFragment fileManagerFileListFragment = (FileManagerFileListFragment) this.f;
        mz mzVar = (mz) this.d;
        int i = 1;
        if (menuItem.getItemId() == R.id.menu_filemanager_roster_item_select) {
            fileManagerFileListFragment.Z0(mzVar, !mzVar.e(), false);
            uz uzVar = fileManagerFileListFragment.j0;
            if (uzVar != null) {
                uzVar.a.d(null, this.c, 1);
            }
            ((View) this.e).requestFocus();
            return true;
        }
        if (menuItem.getItemId() != R.id.menu_filemanager_roster_item_rename) {
            if (menuItem.getItemId() == R.id.menu_filemanager_roster_item_delete) {
                JniAdExt.I0.post(new fc0(fileManagerFileListFragment.c0, Collections.singletonList(mzVar.b), i));
                return true;
            }
            if (menuItem.getItemId() != R.id.menu_filemanager_roster_item_properties) {
                return false;
            }
            ((FileManagerFileListFragment) this.f).b1(Collections.singletonList(mzVar.b), mzVar.g, mzVar.i, mzVar.c());
            return true;
        }
        String str = mzVar.b;
        bc bcVar = fileManagerFileListFragment.e0;
        if (bcVar == null) {
            return true;
        }
        boolean z = fileManagerFileListFragment.c0;
        xz xzVar = new xz();
        Bundle bundle = new Bundle();
        bundle.putBoolean("skey_is_local", z);
        bundle.putString("skey_current_name", str);
        bundle.putString("skey_new_name", str);
        xzVar.N0(bundle);
        bcVar.p0(xzVar, "FileManagerFileItemRenameDialog", true);
        return true;
    }

    public xb(int i, oh ohVar, br brVar, t10 t10Var) {
        this.d = t10Var;
        this.c = i;
        this.e = ohVar;
        this.f = brVar;
    }

    public xb(ImageView imageView) {
        this.c = 0;
        this.d = imageView;
    }
}
