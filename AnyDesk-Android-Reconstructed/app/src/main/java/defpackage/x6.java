package defpackage;

import android.app.Dialog;
import android.os.Build;
import android.view.Window;
import android.widget.EditText;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import j$.util.function.Consumer$CC;
import java.util.WeakHashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x6 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void o(Object obj) {
        y90 ih1Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                AdEditText adEditText = (AdEditText) ((Supplier) ((y6) obj2).d).get();
                if (adEditText != null) {
                    adEditText.l(str, true);
                }
                break;
            default:
                xk xkVar = (xk) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    Dialog dialog = xkVar.k0;
                    if (dialog == null) {
                        nh0.o(xkVar, " does not have a Dialog.", "DialogFragment ");
                    } else {
                        Window window = dialog.getWindow();
                        if (window != null) {
                            xt0 xt0Var = new xt0(xkVar.s0);
                            int i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 35) {
                                ih1Var = new lh1(window, xt0Var);
                            } else if (i2 >= 30) {
                                ih1Var = new kh1(window, xt0Var);
                            } else if (i2 >= 26) {
                                ih1Var = new jh1(window, xt0Var);
                            } else {
                                ih1Var = i2 >= 23 ? new ih1(window, xt0Var) : new hh1(window, xt0Var);
                            }
                            ih1Var.D();
                        }
                    }
                } else {
                    EditText editText = xkVar.s0;
                    WeakHashMap weakHashMap = oe1.a;
                    if (Build.VERSION.SDK_INT < 26) {
                        editText.requestFocus();
                    } else {
                        ie1.b(editText);
                    }
                }
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.a;
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
