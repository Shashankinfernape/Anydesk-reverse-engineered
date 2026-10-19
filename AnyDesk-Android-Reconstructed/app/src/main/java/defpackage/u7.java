package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.anydesk.anydeskandroid.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class u7 {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final boolean E;
    public final s7 F;
    public final Context a;
    public final w7 b;
    public final Window c;
    public CharSequence d;
    public CharSequence e;
    public AlertController$RecycleListView f;
    public View g;
    public Button i;
    public CharSequence j;
    public Message k;
    public Button l;
    public CharSequence m;
    public Message n;
    public Button o;
    public CharSequence p;
    public Message q;
    public NestedScrollView r;
    public Drawable t;
    public ImageView u;
    public TextView v;
    public TextView w;
    public View x;
    public ListAdapter y;
    public boolean h = false;
    public int s = 0;
    public int z = -1;
    public final b G = new b(9, this);

    public u7(Context context, w7 w7Var, Window window) {
        this.a = context;
        this.b = w7Var;
        this.c = window;
        s7 s7Var = new s7();
        s7Var.b = new WeakReference(w7Var);
        this.F = s7Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, yv0.e, R.attr.alertDialogStyle, 0);
        this.A = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.B = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.C = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.D = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.E = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        w7Var.e().h(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void b(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public static ViewGroup c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void d(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.F.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.p = charSequence;
            this.q = messageObtainMessage;
        } else if (i == -2) {
            this.m = charSequence;
            this.n = messageObtainMessage;
        } else if (i != -1) {
            id.q("Button does not exist");
        } else {
            this.j = charSequence;
            this.k = messageObtainMessage;
        }
    }
}
