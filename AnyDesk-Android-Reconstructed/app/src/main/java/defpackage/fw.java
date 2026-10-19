package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class fw implements ar, hl0, j6 {
    public static final /* synthetic */ fw d = new fw(1);
    public static final /* synthetic */ fw e = new fw(2);
    public static final /* synthetic */ fw f = new fw(3);
    public static final fw g = new fw(4);
    public static final fw h = new fw(5);
    public static final fw i = new fw(6);
    public static fw j;
    public static fw k;
    public final /* synthetic */ int c;

    public /* synthetic */ fw(int i2) {
        this.c = i2;
    }

    public static an0 d(yg ygVar, vn0 vn0Var, Bundle bundle, af0 af0Var, nn0 nn0Var) {
        String string = UUID.randomUUID().toString();
        string.getClass();
        vn0Var.getClass();
        af0Var.getClass();
        return new an0(ygVar, vn0Var, bundle, af0Var, nn0Var, string, null);
    }

    public static boolean f(ww wwVar, Editable editable, int i2, int i3, boolean z) {
        int iMin;
        if (editable != null && i2 >= 0 && i3 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i2, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z2) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z2) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z2 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i3, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z3) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i2, 0);
                    iMin = Math.min(selectionEnd + i3, editable.length());
                }
                nc1[] nc1VarArr = (nc1[]) editable.getSpans(selectionStart, iMin, nc1.class);
                if (nc1VarArr != null && nc1VarArr.length > 0) {
                    for (nc1 nc1Var : nc1VarArr) {
                        int spanStart = editable.getSpanStart(nc1Var);
                        int spanEnd = editable.getSpanEnd(nc1Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    wwVar.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    wwVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public Object b() {
        switch (this.c) {
            case 21:
                return new a70();
            default:
                k90 k90Var = new k90();
                k90Var.a = 1;
                return k90Var;
        }
    }

    @Override // defpackage.j6
    public void c(Object obj) {
        MainApplication mainApplicationV;
        switch (this.c) {
            case 25:
                i6 i6Var = (i6) obj;
                if (i6Var != null && (mainApplicationV = MainApplication.v()) != null && mainApplicationV.o0 != 1) {
                    int i2 = i6Var.c;
                    mainApplicationV.K = i2;
                    mainApplicationV.L = i6Var.d;
                    if (i2 == -1) {
                        mainApplicationV.V();
                    } else if (i2 == 0) {
                        t70.V(new ei0(mainApplicationV, 7));
                    }
                }
                break;
            default:
                MainApplication.v().L();
                JniAdExt.M4();
                break;
        }
    }

    public Signature[] e(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public CharSequence g(Preference preference) {
        switch (this.c) {
            case 13:
                EditTextPreference editTextPreference = (EditTextPreference) preference;
                if (TextUtils.isEmpty(null)) {
                    return editTextPreference.c.getString(R.string.not_set);
                }
                return null;
            default:
                ListPreference listPreference = (ListPreference) preference;
                if (TextUtils.isEmpty(null)) {
                    return listPreference.c.getString(R.string.not_set);
                }
                return null;
        }
    }

    @Override // defpackage.hl0
    public boolean v(rk0 rk0Var) {
        return false;
    }

    @Override // defpackage.hl0
    public void a(rk0 rk0Var, boolean z) {
    }
}
