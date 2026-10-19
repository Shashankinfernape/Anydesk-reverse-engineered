package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.anydesk.jni.JniAdExt;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class v7 implements wu0 {
    public final int c;
    public final Object d;

    public v7(y7 y7Var) {
        ByteBuffer byteBufferSlice = y7Var.d().slice();
        this.d = byteBufferSlice;
        byteBufferSlice.order(y7Var.d().order());
        this.c = byteBufferSlice.remaining() / 4;
    }

    public w7 a() {
        r7 r7Var = (r7) this.d;
        w7 w7Var = new w7(r7Var.a, this.c);
        View view = r7Var.f;
        Object[] objArr = null;
        u7 u7Var = w7Var.h;
        if (view != null) {
            u7Var.x = view;
        } else {
            CharSequence charSequence = r7Var.e;
            if (charSequence != null) {
                u7Var.d = charSequence;
                TextView textView = u7Var.v;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = r7Var.d;
            if (drawable != null) {
                u7Var.t = drawable;
                u7Var.s = 0;
                ImageView imageView = u7Var.u;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    u7Var.u.setImageDrawable(drawable);
                }
            }
            int i = r7Var.c;
            if (i != 0) {
                u7Var.t = null;
                u7Var.s = i;
                ImageView imageView2 = u7Var.u;
                if (imageView2 != null) {
                    if (i != 0) {
                        imageView2.setVisibility(0);
                        u7Var.u.setImageResource(u7Var.s);
                    } else {
                        imageView2.setVisibility(8);
                    }
                }
            }
        }
        CharSequence charSequence2 = r7Var.g;
        if (charSequence2 != null) {
            u7Var.e = charSequence2;
            TextView textView2 = u7Var.w;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = r7Var.h;
        if (charSequence3 != null) {
            u7Var.d(-1, charSequence3, r7Var.i);
        }
        CharSequence charSequence4 = r7Var.j;
        if (charSequence4 != null) {
            u7Var.d(-2, charSequence4, r7Var.k);
        }
        String str = r7Var.l;
        if (str != null) {
            u7Var.d(-3, str, r7Var.m);
        }
        if (r7Var.o != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) r7Var.b.inflate(u7Var.B, (ViewGroup) null);
            int i2 = r7Var.r ? u7Var.C : u7Var.D;
            ListAdapter t7Var = r7Var.o;
            if (t7Var == null) {
                t7Var = new t7(r7Var.a, i2, R.id.text1, objArr);
            }
            u7Var.y = t7Var;
            u7Var.z = r7Var.s;
            if (r7Var.p != null) {
                alertController$RecycleListView.setOnItemClickListener(new q7(r7Var, u7Var));
            }
            if (r7Var.r) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            u7Var.f = alertController$RecycleListView;
        }
        View view2 = r7Var.q;
        if (view2 != null) {
            u7Var.g = view2;
            u7Var.h = false;
        }
        w7Var.setCancelable(true);
        w7Var.setCanceledOnTouchOutside(true);
        w7Var.setOnCancelListener(null);
        w7Var.setOnDismissListener(null);
        sk0 sk0Var = r7Var.n;
        if (sk0Var != null) {
            w7Var.setOnKeyListener(sk0Var);
        }
        return w7Var;
    }

    public void b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        r7 r7Var = (r7) this.d;
        r7Var.j = charSequence;
        r7Var.k = onClickListener;
    }

    public void c(String str, DialogInterface.OnClickListener onClickListener) {
        r7 r7Var = (r7) this.d;
        r7Var.l = str;
        r7Var.m = onClickListener;
    }

    public void d(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        r7 r7Var = (r7) this.d;
        r7Var.h = charSequence;
        r7Var.i = onClickListener;
    }

    @Override // defpackage.wu0
    public boolean onMenuItemClick(MenuItem menuItem) {
        ArrayList arrayList;
        z11 z11Var = (z11) this.d;
        y11 y11Var = z11Var.z0;
        int itemId = menuItem.getItemId();
        int i = this.c;
        if (itemId == com.anydesk.anydeskandroid.R.id.acl_action_edit) {
            ArrayList arrayList2 = y11Var.c;
            if (arrayList2 != null) {
                String str = (String) arrayList2.get(i);
                bc bcVar = z11Var.r0;
                if (bcVar != null) {
                    bcVar.x0(1, JniAdExt.n1("ad.cfg.sec.acl.edit"), Integer.toString(i), str, "[\r\n\t,;: ]");
                    return true;
                }
            }
        } else {
            if (itemId != com.anydesk.anydeskandroid.R.id.acl_action_remove) {
                return false;
            }
            ArrayList arrayList3 = y11Var.c;
            if (arrayList3 != null && (arrayList = z11Var.v0) != null) {
                arrayList.remove(arrayList3.get(i));
                y11Var.d();
                return true;
            }
        }
        return true;
    }

    public v7(Context context) {
        this(context, w7.g(context, 0));
    }

    public v7(Context context, int i) {
        this.d = new r7(new ContextThemeWrapper(context, w7.g(context, i)));
        this.c = i;
    }

    public v7() {
        this.c = 1;
        this.d = Collections.singletonList(null);
    }

    public v7(ArrayList arrayList) {
        this.c = 0;
        this.d = arrayList;
    }

    public v7(z11 z11Var, int i) {
        this.d = z11Var;
        this.c = i;
    }
}
