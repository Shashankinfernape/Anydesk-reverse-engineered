package defpackage;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q61 {
    public static final bw n = new bw();
    public static final bw o = new bw();
    public static final bw p = new bw();
    public static final bw q = new bw();
    public static final bw r = new bw();
    public static final bw s = new bw();
    public float a;
    public float b;
    public boolean c;
    public final nt d;
    public final mt e;
    public boolean f;
    public long g;
    public final float h;
    public final ArrayList i;
    public final ArrayList j;
    public r61 k;
    public float l;
    public boolean m;

    public q61(nt ntVar) {
        mt mtVar = nt.s;
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = 0L;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.d = ntVar;
        this.e = mtVar;
        if (mtVar == p || mtVar == q || mtVar == r) {
            this.h = 0.1f;
        } else if (mtVar == s || mtVar == n || mtVar == o) {
            this.h = 0.00390625f;
        } else {
            this.h = 1.0f;
        }
        this.k = null;
        this.l = Float.MAX_VALUE;
        this.m = false;
    }

    public final void a(float f) {
        this.e.getClass();
        nt ntVar = this.d;
        ntVar.q.b = f / 10000.0f;
        ntVar.invalidateSelf();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                arrayList.get(i).getClass();
                id.c();
                return;
            }
            i++;
        }
    }

    public final void b() {
        if (this.k.b <= 0.0d) {
            id.m("Spring animations can only come to an end when there is damping");
        } else {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new AndroidRuntimeException("Animations may only be started on the main thread");
            }
            if (this.f) {
                this.m = true;
            }
        }
    }
}
