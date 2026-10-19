package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class ao extends qe0 implements o50 {
    public final /* synthetic */ int d;
    public final /* synthetic */ qa e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ao(qa qaVar, int i) {
        super(0);
        this.d = i;
        this.e = qaVar;
    }

    @Override // defpackage.o50
    public final Object a() {
        int i = this.d;
        int i2 = 1;
        qa qaVar = this.e;
        switch (i) {
            case 0:
                return new h01(qaVar.getApplication(), qaVar, qaVar.getIntent() != null ? qaVar.getIntent().getExtras() : null);
            case 1:
                qaVar.reportFullyDrawn();
                return uc1.a;
            case 2:
                return new n50(qaVar.h, new ao(qaVar, i2));
            default:
                wq0 wq0Var = new wq0(new qn(qaVar, i2));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (y90.e(Looper.myLooper(), Looper.getMainLooper())) {
                        qaVar.c.a(new un(wq0Var, 0, qaVar));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new c0(qaVar, 5, wq0Var));
                    }
                }
                return wq0Var;
        }
    }
}
