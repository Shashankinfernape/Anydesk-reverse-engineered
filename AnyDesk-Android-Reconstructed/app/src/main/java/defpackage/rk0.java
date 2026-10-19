package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class rk0 implements Menu {
    public static final int[] y = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public pk0 e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public CharSequence m;
    public Drawable n;
    public View o;
    public vk0 v;
    public boolean x;
    public int l = 0;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public final ArrayList t = new ArrayList();
    public final CopyOnWriteArrayList u = new CopyOnWriteArrayList();
    public boolean w = false;

    public rk0(Context context) {
        boolean zE;
        boolean z = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = pe1.a;
            if (Build.VERSION.SDK_INT >= 28) {
                zE = d6.E(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zE = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zE) {
                z = true;
            }
        }
        this.d = z;
    }

    public final vk0 a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            id.q("order does not contain a valid category.");
            return null;
        }
        int i6 = (y[i5] << 16) | (65535 & i3);
        vk0 vk0Var = new vk0(this, i, i2, i3, i6, charSequence, this.l);
        ArrayList arrayList = this.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((vk0) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                arrayList.add(i4, vk0Var);
                p(true);
                return vk0Var;
            }
        }
        i4 = 0;
        arrayList.add(i4, vk0Var);
        p(true);
        return vk0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            vk0 vk0VarA = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            vk0VarA.setIcon(resolveInfo.loadIcon(packageManager));
            vk0VarA.g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = vk0VarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        vk0 vk0VarA = a(i, i2, i3, charSequence);
        q71 q71Var = new q71(this.a, this, vk0VarA);
        vk0VarA.o = q71Var;
        q71Var.setHeaderTitle(vk0VarA.e);
        return q71Var;
    }

    public final void b(il0 il0Var, Context context) {
        this.u.add(new WeakReference(il0Var));
        il0Var.j(context, this);
        this.k = true;
    }

    public final void c(boolean z) {
        if (this.s) {
            return;
        }
        this.s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            il0 il0Var = (il0) weakReference.get();
            if (il0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                il0Var.a(this, z);
            }
        }
        this.s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        vk0 vk0Var = this.v;
        if (vk0Var != null) {
            d(vk0Var);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(vk0 vk0Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zC = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == vk0Var) {
            w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                il0 il0Var = (il0) weakReference.get();
                if (il0Var != null) {
                    zC = il0Var.c(vk0Var);
                    if (zC) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zC) {
                this.v = null;
            }
        }
        return zC;
    }

    public boolean e(rk0 rk0Var, MenuItem menuItem) {
        pk0 pk0Var = this.e;
        return pk0Var != null && pk0Var.f(rk0Var, menuItem);
    }

    public boolean f(vk0 vk0Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zG = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            il0 il0Var = (il0) weakReference.get();
            if (il0Var != null) {
                zG = il0Var.g(vk0Var);
                if (zG) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zG) {
            this.v = vk0Var;
        }
        return zG;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            vk0 vk0Var = (vk0) arrayList.get(i2);
            if (vk0Var.a == i) {
                return vk0Var;
            }
            if (vk0Var.hasSubMenu() && (menuItemFindItem = vk0Var.o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final vk0 g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (vk0) arrayList.get(0);
        }
        boolean zN = n();
        for (int i2 = 0; i2 < size; i2++) {
            vk0 vk0Var = (vk0) arrayList.get(i2);
            char c = zN ? vk0Var.j : vk0Var.h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zN && c == '\b' && i == 67))) {
                return vk0Var;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f.get(i);
    }

    public final void h(List list, int i, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                vk0 vk0Var = (vk0) arrayList.get(i2);
                if (vk0Var.hasSubMenu()) {
                    vk0Var.o.h(list, i, keyEvent);
                }
                char c = zN ? vk0Var.j : vk0Var.h;
                if ((modifiers & 69647) == ((zN ? vk0Var.k : vk0Var.i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zN && c == '\b' && i == 67)) && vk0Var.isEnabled()) {
                        list.add(vk0Var);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((vk0) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
            boolean zL = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                il0 il0Var = (il0) weakReference.get();
                if (il0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zL |= il0Var.l();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.j;
            if (zL) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i = 0; i < size; i++) {
                    vk0 vk0Var = (vk0) arrayListL.get(i);
                    if ((vk0Var.x & 32) == 32) {
                        arrayList.add(vk0Var);
                    } else {
                        arrayList2.add(vk0Var);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z = this.h;
        ArrayList arrayList = this.g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            vk0 vk0Var = (vk0) arrayList2.get(i);
            if (vk0Var.isVisible()) {
                arrayList.add(vk0Var);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.d;
    }

    public void p(boolean z) {
        if (this.p) {
            this.q = true;
            if (z) {
                this.r = true;
                return;
            }
            return;
        }
        if (z) {
            this.h = true;
            this.k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            il0 il0Var = (il0) weakReference.get();
            if (il0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                il0Var.h();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        vk0 vk0VarG = g(i, keyEvent);
        boolean zQ = vk0VarG != null ? q(vk0VarG, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ac A[SYNTHETIC] */
    public final boolean q(MenuItem menuItem, il0 il0Var, int i) {
        wk0 wk0Var;
        boolean zExpandActionView;
        wk0 wk0Var2;
        boolean z;
        q71 q71Var;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        il0 il0Var2;
        vk0 vk0Var = (vk0) menuItem;
        boolean zK = false;
        if (vk0Var == null || !vk0Var.isEnabled()) {
            return false;
        }
        rk0 rk0Var = vk0Var.n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = vk0Var.p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(vk0Var)) && !rk0Var.e(rk0Var, vk0Var)) {
            Intent intent = vk0Var.g;
            if (intent != null) {
                try {
                    rk0Var.a.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    wk0Var = vk0Var.A;
                    if (wk0Var == null) {
                    }
                    zExpandActionView = false;
                    wk0Var2 = vk0Var.A;
                    if (wk0Var2 == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (vk0Var.e()) {
                        zExpandActionView |= vk0Var.expandActionView();
                        if (zExpandActionView) {
                            c(true);
                        }
                    } else if (vk0Var.hasSubMenu()) {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!vk0Var.hasSubMenu()) {
                            q71 q71Var2 = new q71(this.a, this, vk0Var);
                            vk0Var.o = q71Var2;
                            q71Var2.setHeaderTitle(vk0Var.e);
                        }
                        q71Var = vk0Var.o;
                        if (z) {
                            wk0Var2.b.onPrepareSubMenu(q71Var);
                        }
                        copyOnWriteArrayList = this.u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (il0Var != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                il0Var2 = (il0) weakReference.get();
                                if (il0Var2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zK) {
                                    zK = il0Var2.k(q71Var);
                                }
                            }
                        }
                        zExpandActionView |= zK;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    } else {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!vk0Var.hasSubMenu()) {
                            q71 q71Var3 = new q71(this.a, this, vk0Var);
                            vk0Var.o = q71Var3;
                            q71Var3.setHeaderTitle(vk0Var.e);
                        }
                        q71Var = vk0Var.o;
                        if (z) {
                            wk0Var2.b.onPrepareSubMenu(q71Var);
                        }
                        copyOnWriteArrayList = this.u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zK = il0Var != null ? il0Var.k(q71Var) : false;
                            while (r8.hasNext()) {
                                il0Var2 = (il0) weakReference.get();
                                if (il0Var2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zK) {
                                    zK = il0Var2.k(q71Var);
                                }
                            }
                        }
                        zExpandActionView |= zK;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                wk0Var = vk0Var.A;
                if (wk0Var == null && wk0Var.b.onPerformDefaultAction()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        wk0Var2 = vk0Var.A;
        if (wk0Var2 == null && wk0Var2.b.hasSubMenu()) {
            z = true;
        } else {
            z = false;
        }
        if (vk0Var.e()) {
            zExpandActionView |= vk0Var.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (vk0Var.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                c(false);
            }
            if (!vk0Var.hasSubMenu()) {
                q71 q71Var4 = new q71(this.a, this, vk0Var);
                vk0Var.o = q71Var4;
                q71Var4.setHeaderTitle(vk0Var.e);
            }
            q71Var = vk0Var.o;
            if (z) {
                wk0Var2.b.onPrepareSubMenu(q71Var);
            }
            copyOnWriteArrayList = this.u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (il0Var != null) {
                }
                while (r8.hasNext()) {
                    il0Var2 = (il0) weakReference.get();
                    if (il0Var2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zK) {
                        zK = il0Var2.k(q71Var);
                    }
                }
            }
            zExpandActionView |= zK;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(il0 il0Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            il0 il0Var2 = (il0) weakReference.get();
            if (il0Var2 == null || il0Var2 == il0Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((vk0) arrayList.get(i3)).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((vk0) arrayList.get(i3)).b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((vk0) arrayList.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((q71) item.getSubMenu()).s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            vk0 vk0Var = (vk0) arrayList.get(i2);
            if (vk0Var.b == i) {
                vk0Var.f(z2);
                vk0Var.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            vk0 vk0Var = (vk0) arrayList.get(i2);
            if (vk0Var.b == i) {
                vk0Var.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            vk0 vk0Var = (vk0) arrayList.get(i2);
            if (vk0Var.b == i) {
                int i3 = vk0Var.x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                vk0Var.x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((q71) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.m = this.b.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                this.n = this.a.getDrawable(i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        p(false);
    }

    public final void v() {
        this.p = false;
        if (this.q) {
            this.q = false;
            p(this.r);
        }
    }

    public final void w() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.q = false;
        this.r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }

    public rk0 k() {
        return this;
    }
}
