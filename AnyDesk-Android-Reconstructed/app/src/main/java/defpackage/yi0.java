package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.anydeskandroid.gui.element.AutoResizeTextView;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.jni.JniAdExt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yi0 extends a5 {
    public final /* synthetic */ int g;
    public final /* synthetic */ MainFragment h;

    public /* synthetic */ yi0(int i, MainFragment mainFragment) {
        this.g = i;
        this.h = mainFragment;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x012f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0163  */
    @Override // defpackage.a5
    public final p81 b(int i) {
        Toolbar toolbar;
        View view;
        AdEditText adEditText;
        View view2;
        LinearLayout linearLayout;
        switch (this.g) {
            case 0:
                MainFragment mainFragment = this.h;
                m80 m80Var = mainFragment.a0;
                io ioVar = io.KEY_FEATURE_ADDRESS_BAR;
                io ioVar2 = io.KEY_FEATURE_CONNECT;
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    return null;
                                }
                            }
                            linearLayout = mainFragment.j1;
                            if (linearLayout != null || !JniAdExt.g2(ioVar2)) {
                                a5.j();
                                return null;
                            }
                            MainFragment.T0(mainFragment);
                            Rect rect = new Rect();
                            linearLayout.getGlobalVisibleRect(rect);
                            int i2 = rect.left;
                            int i3 = rect.top;
                            Rect rect2 = new Rect(i2, i3, rect.right, Math.min(i3 + 600, rect.bottom));
                            p81 p81VarB = p81.b(rect2, JniAdExt.n1("ad.tutorial.speed_dial.title"), JniAdExt.n1("ad.tutorial.speed_dial.desc"));
                            int iMin = Math.min(rect2.width(), rect2.height());
                            Looper looper = t70.a;
                            p81VarB.d = Math.max(((int) (iMin / (er0.b() / 160.0f))) / 2, 50);
                            return p81VarB;
                        }
                        view2 = mainFragment.U0;
                        if (view2 == null && JniAdExt.g2(ioVar2) && JniAdExt.g2(ioVar)) {
                            if (TextUtils.isEmpty(mainFragment.a1())) {
                                mainFragment.e1("demo");
                            }
                            return new hf1(view2, JniAdExt.n1("ad.tutorial.connect.title"), JniAdExt.n1("ad.tutorial.connect.desc"));
                        }
                        a5.j();
                        linearLayout = mainFragment.j1;
                        if (linearLayout != null) {
                        }
                        a5.j();
                        return null;
                    }
                    adEditText = mainFragment.W0;
                    if (adEditText == null && JniAdExt.g2(ioVar2) && JniAdExt.g2(ioVar)) {
                        return new hf1(adEditText, JniAdExt.n1("ad.tutorial.dst_addr.title"), JniAdExt.n1("ad.tutorial.dst_addr.desc"));
                    }
                    a5.j();
                    view2 = mainFragment.U0;
                    if (view2 == null) {
                    }
                    a5.j();
                    linearLayout = mainFragment.j1;
                    if (linearLayout != null) {
                    }
                    a5.j();
                    return null;
                }
                if (m80Var != null && (toolbar = ((MainActivity) m80Var).N) != null) {
                    String strN1 = JniAdExt.n1("ad.tutorial.start.title");
                    String strN2 = JniAdExt.n1("ad.tutorial.start.desc");
                    CharSequence navigationContentDescription = toolbar.getNavigationContentDescription();
                    boolean zIsEmpty = TextUtils.isEmpty(navigationContentDescription);
                    if (zIsEmpty) {
                        navigationContentDescription = "taptarget-findme";
                    }
                    toolbar.setNavigationContentDescription(navigationContentDescription);
                    ArrayList<View> arrayList = new ArrayList<>(1);
                    toolbar.findViewsWithText(arrayList, navigationContentDescription, 2);
                    if (zIsEmpty) {
                        toolbar.setNavigationContentDescription((CharSequence) null);
                    }
                    if (arrayList.size() <= 0) {
                        Drawable navigationIcon = toolbar.getNavigationIcon();
                        if (navigationIcon == null) {
                            nh0.j("Toolbar does not have a navigation view set!");
                            return null;
                        }
                        int childCount = toolbar.getChildCount();
                        for (int i4 = 0; i4 < childCount; i4++) {
                            View childAt = toolbar.getChildAt(i4);
                            if ((childAt instanceof ImageButton) && ((ImageButton) childAt).getDrawable() == navigationIcon) {
                                view = childAt;
                            }
                        }
                        nh0.j("Could not find navigation view for Toolbar!");
                        return null;
                    }
                    view = arrayList.get(0);
                    return new ta1(view, strN1, strN2);
                }
                a5.j();
                nr0 nr0Var = mainFragment.a1;
                AutoResizeTextView autoResizeTextView = nr0Var == null ? null : nr0Var.s ? nr0Var.e : nr0Var.f;
                if (autoResizeTextView != null && JniAdExt.L1()) {
                    hf1 hf1Var = new hf1(autoResizeTextView, i == 1 ? JniAdExt.n1("ad.tutorial.relay.title") : JniAdExt.n1("ad.tutorial.own_addr.title"), i == 1 ? JniAdExt.n1("ad.tutorial.relay.desc") : JniAdExt.n1("ad.tutorial.own_addr.desc"));
                    autoResizeTextView.getWidth();
                    int height = autoResizeTextView.getHeight();
                    Looper looper2 = t70.a;
                    hf1Var.d = Math.max((int) (height / (er0.b() / 160.0f)), 50);
                    return hf1Var;
                }
                a5.j();
                adEditText = mainFragment.W0;
                if (adEditText == null) {
                }
                a5.j();
                view2 = mainFragment.U0;
                if (view2 == null) {
                }
                a5.j();
                linearLayout = mainFragment.j1;
                if (linearLayout != null) {
                }
                a5.j();
                return null;
            default:
                String.format(JniAdExt.n1("ad.tutorial.news.title"), "9.0.2");
                return null;
        }
    }

    @Override // defpackage.a5
    public final void f(boolean z) {
        int i = this.g;
        int i2 = 0;
        MainFragment mainFragment = this.h;
        switch (i) {
            case 0:
                MainFragment.T0(mainFragment);
                t70.b0(MainApplication.v().T, "tutorial_main_finished", true);
                if (!z) {
                    try {
                        i2 = MainApplication.v().T.getInt("tutorial_main_news_version", 0);
                        break;
                    } catch (Throwable unused) {
                    }
                    if (i2 == 90002) {
                        mainFragment.Z0(true);
                    } else {
                        qa qaVarY = mainFragment.Y();
                        if (qaVarY != null) {
                            mainFragment.G1.g(qaVarY);
                        }
                    }
                } else {
                    t70.c0(MainApplication.v().T, "tutorial_main_news_version", 90002);
                    t70.b0(MainApplication.v().T, "tutorial_main_requested", false);
                }
                break;
            default:
                MainFragment.T0(mainFragment);
                t70.c0(MainApplication.v().T, "tutorial_main_news_version", 90002);
                t70.b0(MainApplication.v().T, "tutorial_main_requested", false);
                mainFragment.Z0(true);
                break;
        }
    }
}
