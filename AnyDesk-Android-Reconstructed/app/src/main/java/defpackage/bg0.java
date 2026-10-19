package defpackage;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class bg0 extends c40 {
    public final Handler Z = new Handler();
    public final bc0 a0 = new bc0(5, this);
    public final kc b0 = new kc(1, this);
    public ListAdapter c0;
    public ListView d0;
    public View e0;
    public View f0;
    public View g0;
    public boolean h0;

    @Override // defpackage.c40
    public void C0(View view, Bundle bundle) {
        O0();
    }

    public final void O0() {
        if (this.d0 != null) {
            return;
        }
        View view = this.H;
        if (view == null) {
            nh0.j("Content view not yet created");
            return;
        }
        if (view instanceof ListView) {
            this.d0 = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(16711681);
            if (textView == null) {
                this.e0 = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f0 = view.findViewById(16711682);
            this.g0 = view.findViewById(16711683);
            View viewFindViewById = view.findViewById(R.id.list);
            if (!(viewFindViewById instanceof ListView)) {
                if (viewFindViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) viewFindViewById;
            this.d0 = listView;
            View view2 = this.e0;
            if (view2 != null) {
                listView.setEmptyView(view2);
            }
        }
        this.h0 = true;
        this.d0.setOnItemClickListener(this.b0);
        ListAdapter listAdapter = this.c0;
        if (listAdapter != null) {
            this.c0 = null;
            Q0(listAdapter);
        } else if (this.f0 != null) {
            R0(false, false);
        }
        this.Z.post(this.a0);
    }

    public final void Q0(ListAdapter listAdapter) {
        boolean z = this.c0 != null;
        this.c0 = listAdapter;
        ListView listView = this.d0;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.h0 || z) {
                return;
            }
            R0(true, K0().getWindowToken() != null);
        }
    }

    public final void R0(boolean z, boolean z2) {
        O0();
        View view = this.f0;
        if (view == null) {
            nh0.j("Can't be used with a custom content view");
            return;
        }
        if (this.h0 == z) {
            return;
        }
        this.h0 = z;
        if (z) {
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(a0(), R.anim.fade_out));
                this.g0.startAnimation(AnimationUtils.loadAnimation(a0(), R.anim.fade_in));
            } else {
                view.clearAnimation();
                this.g0.clearAnimation();
            }
            this.f0.setVisibility(8);
            this.g0.setVisibility(0);
            return;
        }
        if (z2) {
            view.startAnimation(AnimationUtils.loadAnimation(a0(), R.anim.fade_in));
            this.g0.startAnimation(AnimationUtils.loadAnimation(a0(), R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.g0.clearAnimation();
        }
        this.f0.setVisibility(0);
        this.g0.setVisibility(8);
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context contextI0 = I0();
        FrameLayout frameLayout = new FrameLayout(contextI0);
        LinearLayout linearLayout = new LinearLayout(contextI0);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(contextI0, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(contextI0);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(contextI0);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(contextI0);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // defpackage.c40
    public void t0() {
        this.Z.removeCallbacks(this.a0);
        this.d0 = null;
        this.h0 = false;
        this.g0 = null;
        this.f0 = null;
        this.e0 = null;
        this.F = true;
    }

    public void P0(ListView listView, int i) {
    }
}
