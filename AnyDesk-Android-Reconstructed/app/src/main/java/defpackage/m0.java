package defpackage;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterFragment;
import j$.util.Collection$EL;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends ys0 {
    public final int f;
    public final int g;
    public TextView h;
    public RecyclerView i;
    public AbookRosterFragment j;
    public boolean k;
    public final Comparator l;
    public final g0 m;
    public final y n;

    public m0(int i, int i2) {
        super(new k0(0));
        this.k = false;
        this.l = Comparator$EL.thenComparing(Comparator$CC.comparingInt(new i0(0)), new j0(0), String.CASE_INSENSITIVE_ORDER);
        this.m = new g0(1, this);
        this.n = new y(1, this);
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.iw0
    public final void e(hx0 hx0Var, int i) {
        fz0 fz0Var;
        l0 l0Var = (l0) hx0Var;
        RecyclerView recyclerView = l0Var.A;
        View view = l0Var.z;
        TextView textView = l0Var.y;
        View view2 = l0Var.v;
        TextView textView2 = l0Var.u;
        TextView textView3 = l0Var.x;
        ImageView imageView = l0Var.w;
        fz0 fz0Var2 = (fz0) j(i);
        if (fz0Var2 == null) {
            textView3.setText("");
            if (textView != null) {
                textView.setText("");
            }
            imageView.setImageDrawable(null);
            imageView.setBackground(null);
            view2.setSelected(false);
            view2.setOnClickListener(null);
            view2.setOnLongClickListener(null);
            view.setVisibility(4);
            recyclerView.setVisibility(8);
            textView2.setVisibility(4);
            textView2.setText("");
            return;
        }
        ArrayList arrayList = fz0Var2.b;
        RosterItem rosterItem = fz0Var2.a;
        String str = rosterItem.mThumbnailPath;
        String str2 = rosterItem.c;
        if (new File(str).exists()) {
            imageView.setImageResource(R.drawable.unknown_desktop);
            imageView.setImageURI(Uri.parse(rosterItem.mThumbnailPath));
        } else {
            imageView.setImageDrawable(null);
            imageView.setBackground(t70.M(rosterItem.mColor1, rosterItem.mColor2));
        }
        m81 m81Var = l0Var.B;
        view2.setSelected(fz0Var2.c);
        view2.setOnClickListener(new p(this, 1, fz0Var2));
        view2.setOnLongClickListener(new q(this, fz0Var2, 1));
        String displayName = rosterItem.getDisplayName();
        textView3.setText(displayName);
        if (textView != null) {
            if (rosterItem.getAltDisplayName().equals(displayName)) {
                textView.setText("");
            } else {
                textView.setText(rosterItem.getAltDisplayName());
            }
        }
        if (rosterItem.mOnlineState.ordinal() != 2) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        textView2.setVisibility((i <= 0 || (fz0Var = (fz0) j(i + (-1))) == null || !fz0Var.a.c.equals(str2)) ? 0 : 4);
        textView2.setText(str2);
        if (arrayList.isEmpty()) {
            recyclerView.setVisibility(8);
            return;
        }
        m81Var.d = Collection$EL.stream(arrayList).sorted(this.l).toList();
        m81Var.d();
        m81Var.e = new af1(this, fz0Var2);
        recyclerView.setVisibility(0);
    }

    @Override // defpackage.iw0
    public final hx0 f(ViewGroup viewGroup, int i) {
        return new l0(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.abook_roster_item, viewGroup, false), this.f, this.g);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Code duplicated, block: B:38:0x008e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    /* JADX WARN: Code duplicated, block: B:42:0x0096  */
    public final void m() {
        TextView textView;
        View childAt;
        int i;
        int i2;
        RecyclerView recyclerView = this.i;
        if (recyclerView == null || (textView = this.h) == null) {
            return;
        }
        textView.setVisibility(4);
        int iA = a();
        int childCount = recyclerView.getChildCount();
        if (childCount == 0 || (childAt = recyclerView.getChildAt(0)) == null) {
            return;
        }
        hx0 hx0VarL = recyclerView.L(childAt);
        if (hx0VarL instanceof l0) {
            l0 l0Var = (l0) hx0VarL;
            TextView textView2 = l0Var.u;
            textView2.setVisibility(0);
            if (1 < childCount) {
                View childAt2 = recyclerView.getChildAt(1);
                if (childAt2 == null) {
                    return;
                }
                hx0 hx0VarL2 = recyclerView.L(childAt2);
                if (!(hx0VarL2 instanceof l0)) {
                    return;
                }
                l0 l0Var2 = (l0) hx0VarL2;
                TextView textView3 = l0Var2.u;
                int iB = l0Var.b();
                int iB2 = l0Var2.b();
                fz0 fz0Var = (iB == -1 || iB >= iA) ? null : (fz0) j(iB);
                fz0 fz0Var2 = (iB2 == -1 || iB2 >= iA) ? null : (fz0) j(iB2);
                if (fz0Var == null || fz0Var2 == null) {
                    if (fz0Var == null) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    textView2.setVisibility(i);
                    if (fz0Var2 == null) {
                        i2 = 4;
                    } else {
                        i2 = 0;
                    }
                    textView3.setVisibility(i2);
                    textView.setVisibility(4);
                } else {
                    String str = fz0Var2.a.c;
                    if (fz0Var.a.c.equals(str)) {
                        textView2.setVisibility(4);
                        textView3.setVisibility(4);
                        textView.setVisibility(0);
                        textView.setText(str);
                    } else {
                        if (fz0Var == null) {
                            i = 4;
                        } else {
                            i = 0;
                        }
                        textView2.setVisibility(i);
                        if (fz0Var2 == null) {
                            i2 = 4;
                        } else {
                            i2 = 0;
                        }
                        textView3.setVisibility(i2);
                        textView.setVisibility(4);
                    }
                }
                int i3 = 1;
                while (true) {
                    int i4 = i3 + 1;
                    if (i4 >= childCount) {
                        break;
                    }
                    View childAt3 = recyclerView.getChildAt(i4);
                    if (childAt3 == null) {
                        return;
                    }
                    hx0 hx0VarL3 = recyclerView.L(childAt3);
                    if (hx0VarL3 instanceof l0) {
                        l0 l0Var3 = (l0) hx0VarL3;
                        TextView textView4 = l0Var3.u;
                        int iB3 = l0Var3.b();
                        fz0 fz0Var3 = (iB3 == -1 || iB3 >= iA) ? null : (fz0) j(iB3);
                        if (fz0Var2 == null || fz0Var3 == null || !fz0Var2.a.c.equals(fz0Var3.a.c)) {
                            textView4.setVisibility(fz0Var3 != null ? 0 : 4);
                        } else {
                            textView4.setVisibility(4);
                        }
                        i3 = i4;
                        fz0Var2 = fz0Var3;
                    }
                }
            }
            if (this.k) {
                textView.setVisibility(4);
            }
        }
    }
}
