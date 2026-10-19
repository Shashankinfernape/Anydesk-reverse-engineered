package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.storage.StorageVolume;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.anydeskandroid.gui.element.ListenerScrollView;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class iz extends yt implements ng0 {
    public x00 A0;
    public int B0;
    public ListenerScrollView C0;
    public LinearLayout D0;
    public RadioButton F0;
    public RadioButton G0;
    public AdEditText H0;
    public Spinner I0;
    public View J0;
    public View K0;
    public Button L0;
    public FileManagerFileListFragment r0;
    public boolean s0;
    public String t0;
    public String u0;
    public String v0;
    public int w0;
    public String x0;
    public int y0;
    public int z0;
    public final Logging q0 = new Logging("FileManagerDirGotoDialogFragment");
    public final ArrayList E0 = new ArrayList();
    public final y6 M0 = new y6(this, new f(8, this));
    public final ev N0 = new ev(5, this);
    public final q4 O0 = new q4(this, 7);

    public static void S0(iz izVar, String str) {
        if (izVar.s0) {
            boolean z = (TextUtils.isEmpty(str) || str.equalsIgnoreCase(izVar.t0)) ? false : true;
            if (!z) {
                str = null;
            }
            izVar.W0(str, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public static void T0(iz izVar, String str) {
        int i;
        String strReplaceAll;
        x00 x00Var = izVar.A0;
        if (x00Var == null) {
            izVar.W0(null, false);
            return;
        }
        synchronized (x00Var.b) {
            i = x00Var.P;
        }
        boolean z = izVar.s0;
        String str2 = izVar.t0;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim == null) {
                strReplaceAll = null;
            } else {
                strReplaceAll = strTrim.replaceAll("(/)\\1+", "$1");
                if (!strReplaceAll.isEmpty() && strReplaceAll.charAt(strReplaceAll.length() - 1) == '/') {
                    strReplaceAll = strReplaceAll.substring(0, strReplaceAll.length() - 1);
                }
            }
            if (strReplaceAll == null || ((strReplaceAll.isEmpty() && "/".equals(str2) && (str.isEmpty() || str.matches("(/)\\1*"))) || (!z && i == 2 && strReplaceAll.matches(".*[. ]$") && ((str2.isEmpty() && (".".equals(strReplaceAll) || "..".equals(strReplaceAll))) || (!str2.isEmpty() && !strReplaceAll.matches("(.)\\1*")))))) {
                strReplaceAll = null;
            }
        } else {
            strReplaceAll = null;
        }
        if (strReplaceAll == null) {
            izVar.W0(null, false);
        } else {
            izVar.W0(strReplaceAll, !uj.a(i, strReplaceAll, izVar.t0, izVar.s0));
        }
    }

    public static void U0(iz izVar, String str) {
        int i;
        x00 x00Var = izVar.A0;
        if (str == null || x00Var == null) {
            izVar.W0(null, false);
            return;
        }
        boolean z = izVar.s0;
        String str2 = izVar.t0;
        synchronized (x00Var.b) {
            i = x00Var.P;
        }
        izVar.W0(str, !uj.a(i, str, str2, z));
    }

    @Override // defpackage.xt, defpackage.c40
    public final void A0() {
        super.A0();
        JniAdExt.k0 = this;
        X0();
    }

    @Override // defpackage.xt, defpackage.c40
    public final void B0() {
        super.B0();
        JniAdExt.k0 = null;
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        String str;
        v7 v7Var = new v7(G0());
        ((r7) v7Var.d).e = JniAdExt.n1("ad.file_browser.goto.title.android");
        this.B0 = (int) q51.h(25.0f, 160.0f);
        View viewInflate = G0().getLayoutInflater().inflate(R.layout.fragment_dialog_filemanager_goto_dir, (ViewGroup) null);
        int i = 6;
        int i2 = 0;
        int i3 = 1;
        if (viewInflate != null) {
            this.C0 = (ListenerScrollView) viewInflate.findViewById(R.id.dialog_filemanager_goto_dir_scroll_view);
            this.D0 = (LinearLayout) viewInflate.findViewById(R.id.dialog_filemanager_goto_dir_radio_group);
            this.F0 = (RadioButton) viewInflate.findViewById(R.id.dialog_filemanager_goto_dir_radio_button_manual_input);
            this.G0 = (RadioButton) viewInflate.findViewById(R.id.dialog_filemanager_goto_dir_radio_button_recents);
            this.H0 = (AdEditText) viewInflate.findViewById(R.id.dialog_filemanager_goto_dir_manual_input);
            this.I0 = (Spinner) viewInflate.findViewById(R.id.dialog_filemanager_goto_dir_recents_spinner);
            this.J0 = viewInflate.findViewById(R.id.dialog_filemanager_goto_dir_scroll_hint_top);
            this.K0 = viewInflate.findViewById(R.id.dialog_filemanager_goto_dir_scroll_hint_bottom);
            x00 x00Var = this.A0;
            if (x00Var != null) {
                AdEditText adEditText = this.H0;
                boolean z = this.s0;
                synchronized (x00Var.b) {
                    try {
                        if (z) {
                            str = "[\\\\:*?\"<>|\r\n\t\b\u0000]";
                        } else {
                            int iR = q51.r(x00Var.P);
                            if (iR == 1) {
                                str = "[\\\\*?\"<>|\r\n\t\b\u0000]";
                            } else if (iR == 2 || iR == 3) {
                                str = "[\\\\\r\n\t\b\u0000]";
                            } else if (iR != 4) {
                                str = iR != 6 ? "[\\\\\r\n\t\b\u0000]" : "[\\\\:*?\"<>|\r\n\t\b\u0000]";
                            } else {
                                str = "[\\\\:\r\n\t\b\u0000]";
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                adEditText.setFilter(str);
            }
            this.H0.setTextListener(this.N0);
            this.H0.l(this.u0, true);
            this.M0.g();
            if (x00Var != null) {
                ArrayList arrayListQ = x00Var.q(this.s0);
                this.I0.setAdapter((SpinnerAdapter) new t7(0, I0(), arrayListQ));
                this.I0.setSelection(this.w0);
                this.I0.setOnItemSelectedListener(new fz(this, arrayListQ));
            }
            this.F0.setText(JniAdExt.n1("ad.file_browser.goto.options.manual.android"));
            this.F0.setOnCheckedChangeListener(new gz(this, 0));
            this.G0.setText(JniAdExt.n1("ad.file_browser.goto.options.recents.android"));
            this.G0.setOnCheckedChangeListener(new gz(this, 1));
            X0();
            this.C0.setListener(this);
            this.D0.addOnLayoutChangeListener(this.O0);
        }
        ((r7) v7Var.d).q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.dlg.ok"), new hz(this, i2));
        v7Var.b(JniAdExt.n1("ad.dlg.cancel"), new hz(this, i3));
        if (this.s0 && Build.VERSION.SDK_INT >= 24) {
            v7Var.c(JniAdExt.n1("ad.dlg.refresh"), null);
        }
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        w7VarA.setOnShowListener(new n4(this, i));
        return w7VarA;
    }

    public final void V0(ListenerScrollView listenerScrollView) {
        if (listenerScrollView == null) {
            return;
        }
        int scrollY = listenerScrollView.getScrollY();
        View childAt = listenerScrollView.getChildAt(listenerScrollView.getChildCount() - 1);
        if (childAt == null) {
            return;
        }
        int bottom = childAt.getBottom() - (listenerScrollView.getHeight() + scrollY);
        r3.I(this.J0, scrollY < this.B0 ? 4 : 0);
        r3.I(this.K0, bottom < this.B0 ? 4 : 0);
    }

    public final void W0(String str, boolean z) {
        if (!z) {
            str = "";
        }
        this.x0 = str;
        r3.C(this.L0, z);
    }

    public final void X0() {
        int i;
        LinearLayout linearLayout = this.D0;
        if (linearLayout == null) {
            return;
        }
        int i2 = 0;
        if (this.s0 && Build.VERSION.SDK_INT >= 24) {
            ArrayList arrayList = this.E0;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                linearLayout.removeView((RadioButton) obj);
            }
            arrayList.clear();
            ArrayList arrayListX = MainApplication.x(G0().getApplicationContext());
            this.q0.e("StorageVolume list = " + arrayListX);
            int size2 = arrayListX.size();
            int i4 = 0;
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayListX.get(i5);
                i5++;
                StorageVolume storageVolumeB = id.b(obj2);
                File fileS = MainApplication.s(storageVolumeB);
                if (fileS != null) {
                    String absolutePath = fileS.getAbsolutePath();
                    Context contextA0 = a0();
                    StringBuilder sb = new StringBuilder();
                    if (storageVolumeB != null && contextA0 != null) {
                        sb.append(storageVolumeB.getDescription(contextA0));
                        String uuid = storageVolumeB.getUuid();
                        if (uuid != null) {
                            sb.append(" (");
                            sb.append(lg.c().e(uuid));
                            sb.append(")");
                        }
                    }
                    String string = sb.toString();
                    if (!TextUtils.isEmpty(absolutePath) && !TextUtils.isEmpty(string)) {
                        RadioButton radioButton = new RadioButton(new ContextThemeWrapper(a0(), R.style.FileManagerRadioButtonStyle), null, 0);
                        radioButton.setText(string);
                        Context contextA1 = a0();
                        Looper looper = t70.a;
                        radioButton.setTextColor(uj.l(contextA1, R.color.colorDialogText));
                        radioButton.setOnCheckedChangeListener(new gp(this, linearLayout, absolutePath));
                        linearLayout.addView(radioButton, i4);
                        arrayList.add(radioButton);
                        i4++;
                    }
                }
            }
        }
        int childCount = linearLayout.getChildCount();
        if (childCount > 0) {
            int i6 = this.z0;
            if (childCount == i6 && (i = this.y0) >= 0 && i < i6) {
                i2 = i;
            }
            View childAt = linearLayout.getChildAt(i2);
            if (childAt instanceof RadioButton) {
                ((RadioButton) childAt).setChecked(true);
            }
        }
        this.z0 = childCount;
    }

    @Override // defpackage.ng0
    public final void a(ListenerScrollView listenerScrollView) {
        V0(listenerScrollView);
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.r0 = (FileManagerFileListFragment) J0();
        if (bundle == null) {
            bundle = H0();
        }
        this.s0 = bundle.getBoolean("skey_is_local");
        this.w0 = bundle.getInt("skey_new_path_recents_sel_idx", 0);
        this.y0 = bundle.getInt("skey_radio_group_sel_idx", 0);
        this.z0 = bundle.getInt("skey_radio_group_child_count", 0);
        this.t0 = bundle.getString("skey_current_path");
        String string = bundle.getString("skey_new_path_manual_disp");
        this.u0 = string;
        if (this.t0 == null) {
            this.t0 = "";
        }
        if (string == null) {
            this.u0 = this.t0;
        }
        x00 x00Var = MainApplication.v().s;
        this.A0 = x00Var;
        if (x00Var == null) {
            this.q0.c("no view model");
        }
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        ListenerScrollView listenerScrollView = this.C0;
        if (listenerScrollView != null) {
            listenerScrollView.setListener(null);
        }
        LinearLayout linearLayout = this.D0;
        if (linearLayout != null) {
            linearLayout.removeOnLayoutChangeListener(this.O0);
        }
        AdEditText adEditText = this.H0;
        if (adEditText != null) {
            adEditText.b();
        }
        this.E0.clear();
        this.C0 = null;
        this.D0 = null;
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
        this.L0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = null;
        this.A0 = null;
        this.r0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putBoolean("skey_is_local", this.s0);
        if (this.t0 == null) {
            this.t0 = "";
        }
        bundle.putString("skey_current_path", this.t0);
        String text = this.H0.getText();
        if (text == null) {
            text = this.t0;
        }
        bundle.putString("skey_new_path_manual_disp", text);
        bundle.putInt("skey_new_path_recents_sel_idx", this.w0);
        bundle.putInt("skey_radio_group_sel_idx", this.y0);
        bundle.putInt("skey_radio_group_child_count", this.z0);
    }
}
