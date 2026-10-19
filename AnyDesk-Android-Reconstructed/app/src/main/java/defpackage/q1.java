package defpackage;

import com.anydesk.anydeskandroid.RosterItemFilter;
import com.anydesk.jnilib.Logging;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends h1 {
    public static final long i;
    public final int b;
    public final long c;
    public final String d;
    public final List e;
    public boolean f;
    public final Logging g;
    public final boolean h;

    static {
        int i2 = yv.e;
        i = hq.U(10, aw.SECONDS);
    }

    public q1(long j, String str, Set set, boolean z) {
        set.getClass();
        List listW0 = tm.w0(set);
        this.b = 100;
        this.c = j;
        this.d = str;
        this.e = listW0;
        this.f = z;
        this.g = new Logging(nx0.a(q1.class).a());
        this.h = true;
    }

    @Override // defpackage.h1
    public final boolean a() {
        return this.h;
    }

    @Override // defpackage.h1
    public final Object b(pt0 pt0Var) {
        Integer num;
        int iRound;
        Integer numValueOf = null;
        if (!this.f && (num = pt0Var.b) != null) {
            int iIntValue = num.intValue();
            int i2 = this.b;
            int i3 = iIntValue - i2;
            if (i3 < 0) {
                i3 = 0;
            }
            double d = ((double) i3) / ((double) i2);
            if (Double.isNaN(d)) {
                id.q("Cannot round NaN value.");
                return null;
            }
            if (d > 2.147483647E9d) {
                iRound = Integer.MAX_VALUE;
            } else {
                iRound = d < -2.147483648E9d ? Integer.MIN_VALUE : (int) Math.round(d);
            }
            numValueOf = Integer.valueOf(iRound * i2);
        }
        this.f = false;
        return numValueOf;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007f A[Catch: Exception -> 0x0032, TryCatch #1 {Exception -> 0x0032, blocks: (B:12:0x002d, B:28:0x0079, B:30:0x007f, B:37:0x00a1, B:41:0x00b1, B:45:0x00c5, B:40:0x00ab, B:33:0x0094, B:36:0x009b, B:47:0x00c9, B:49:0x00cd, B:51:0x00f1, B:52:0x00f6), top: B:64:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[Catch: Exception -> 0x0032, TryCatch #1 {Exception -> 0x0032, blocks: (B:12:0x002d, B:28:0x0079, B:30:0x007f, B:37:0x00a1, B:41:0x00b1, B:45:0x00c5, B:40:0x00ab, B:33:0x0094, B:36:0x009b, B:47:0x00c9, B:49:0x00cd, B:51:0x00f1, B:52:0x00f6), top: B:64:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ab A[Catch: Exception -> 0x0032, TryCatch #1 {Exception -> 0x0032, blocks: (B:12:0x002d, B:28:0x0079, B:30:0x007f, B:37:0x00a1, B:41:0x00b1, B:45:0x00c5, B:40:0x00ab, B:33:0x0094, B:36:0x009b, B:47:0x00c9, B:49:0x00cd, B:51:0x00f1, B:52:0x00f6), top: B:64:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c9 A[Catch: Exception -> 0x0032, TryCatch #1 {Exception -> 0x0032, blocks: (B:12:0x002d, B:28:0x0079, B:30:0x007f, B:37:0x00a1, B:41:0x00b1, B:45:0x00c5, B:40:0x00ab, B:33:0x0094, B:36:0x009b, B:47:0x00c9, B:49:0x00cd, B:51:0x00f1, B:52:0x00f6), top: B:64:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cd A[Catch: Exception -> 0x0032, TryCatch #1 {Exception -> 0x0032, blocks: (B:12:0x002d, B:28:0x0079, B:30:0x007f, B:37:0x00a1, B:41:0x00b1, B:45:0x00c5, B:40:0x00ab, B:33:0x0094, B:36:0x009b, B:47:0x00c9, B:49:0x00cd, B:51:0x00f1, B:52:0x00f6), top: B:64:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f1 A[Catch: Exception -> 0x0032, TryCatch #1 {Exception -> 0x0032, blocks: (B:12:0x002d, B:28:0x0079, B:30:0x007f, B:37:0x00a1, B:41:0x00b1, B:45:0x00c5, B:40:0x00ab, B:33:0x0094, B:36:0x009b, B:47:0x00c9, B:49:0x00cd, B:51:0x00f1, B:52:0x00f6), top: B:64:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0100  */
    /* JADX WARN: Code duplicated, block: B:59:0x0124  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x00cd, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:58:0x0100, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x0124, please report this as an issue */
    @Override // defpackage.h1
    public final Object d(lt0 lt0Var, sq sqVar) throws Throwable {
        l1 l1Var;
        int iIntValue;
        int i2;
        Exception exc;
        RosterItemFilter rosterItemFilter;
        int i3;
        k1 k1Var;
        int i4;
        Integer num;
        int size;
        int i5;
        if (sqVar instanceof l1) {
            l1Var = (l1) sqVar;
            int i6 = l1Var.k;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                l1Var.k = i6 - Integer.MIN_VALUE;
            } else {
                l1Var = new l1(this, sqVar);
            }
        } else {
            l1Var = new l1(this, sqVar);
        }
        Object objC0 = l1Var.i;
        int i7 = l1Var.k;
        Logging logging = this.g;
        if (i7 != 0) {
            if (i7 != 1) {
                nh0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = l1Var.h;
            iIntValue = l1Var.g;
            rosterItemFilter = l1Var.f;
            try {
                y90.V(objC0);
                i3 = iIntValue;
                k1Var = (k1) objC0;
                if (k1Var instanceof j1) {
                    if (k1Var instanceof i1) {
                        throw new pn();
                    }
                    logging.a("Roster items request timed out (" + yv.e(i) + ")");
                    return new mt0(((i1) k1Var).a);
                }
                new Integer(((j1) k1Var).b);
                List list = ((j1) k1Var).a;
                if (i3 == 0) {
                    num = null;
                } else {
                    i4 = i3 - this.b;
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    num = new Integer(i4);
                }
                int i8 = i2 + i3;
                Integer num2 = ((j1) k1Var).b > i8 ? new Integer(i8) : null;
                size = ((j1) k1Var).b - (((j1) k1Var).a.size() + i3);
                if (size < 0) {
                    i5 = 0;
                } else {
                    i5 = size;
                }
                return new nt0(list, num, num2, i3, i5);
            } catch (Exception e) {
                exc = e;
                if (exc instanceof CancellationException) {
                    Logging.f(7, logging.a, "REQ roster " + this.c + " filter " + rosterItemFilter + " cancelled");
                } else {
                    logging.a("Error getting roster items: " + exc);
                }
                return new mt0(exc);
            }
        }
        y90.V(objC0);
        Integer num3 = (Integer) lt0Var.a();
        iIntValue = num3 != null ? num3.intValue() : 0;
        i2 = lt0Var.a;
        RosterItemFilter rosterItemFilter2 = new RosterItemFilter(this.d, this.e, iIntValue, i2);
        try {
            long j = this.c;
            l1Var.f = rosterItemFilter2;
            l1Var.g = iIntValue;
            l1Var.h = i2;
            l1Var.k = 1;
            us usVar = su.a;
            objC0 = th1.c0(js.e, new p1(this, j, rosterItemFilter2, null), l1Var);
            lr lrVar = lr.c;
            if (objC0 == lrVar) {
                return lrVar;
            }
            i3 = iIntValue;
            k1Var = (k1) objC0;
            if (k1Var instanceof j1) {
                if (k1Var instanceof i1) {
                    throw new pn();
                }
                logging.a("Roster items request timed out (" + yv.e(i) + ")");
                return new mt0(((i1) k1Var).a);
            }
            new Integer(((j1) k1Var).b);
            List list2 = ((j1) k1Var).a;
            if (i3 == 0) {
                num = null;
            } else {
                i4 = i3 - this.b;
                if (i4 < 0) {
                    i4 = 0;
                }
                num = new Integer(i4);
            }
            int i9 = i2 + i3;
            Integer num4 = ((j1) k1Var).b > i9 ? new Integer(i9) : null;
            size = ((j1) k1Var).b - (((j1) k1Var).a.size() + i3);
            if (size < 0) {
                i5 = 0;
            } else {
                i5 = size;
            }
            return new nt0(list2, num, num4, i3, i5);
        } catch (Exception e2) {
            exc = e2;
            rosterItemFilter = rosterItemFilter2;
            if (exc instanceof CancellationException) {
                Logging.f(7, logging.a, "REQ roster " + this.c + " filter " + rosterItemFilter + " cancelled");
            } else {
                logging.a("Error getting roster items: " + exc);
            }
            return new mt0(exc);
        }
    }
}
