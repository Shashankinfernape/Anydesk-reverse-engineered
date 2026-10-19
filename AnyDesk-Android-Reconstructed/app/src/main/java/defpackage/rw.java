package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class rw {
    public static final Object j = new Object();
    public static volatile rw k;
    public final ReentrantReadWriteLock a;
    public final zd b;
    public volatile int c;
    public final Handler d;
    public final nw e;
    public final qw f;
    public final fw g;
    public final int h;
    public final is i;

    public rw(i30 i30Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        qw qwVar = (qw) i30Var.b;
        this.f = qwVar;
        int i = i30Var.a;
        this.h = i;
        this.i = (is) i30Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new zd(0);
        this.g = new fw(14);
        nw nwVar = new nw(this);
        this.e = nwVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                qwVar.a(new mw(nwVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static rw a() {
        rw rwVar;
        synchronized (j) {
            try {
                rwVar = k;
                if (!(rwVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rwVar;
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.h == 1)) {
            nh0.j("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (b() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                this.a.writeLock().unlock();
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            nw nwVar = this.e;
            rw rwVar = nwVar.a;
            try {
                rwVar.f.a(new mw(nwVar));
            } catch (Throwable th) {
                rwVar.d(th);
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new qi(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0097 A[Catch: all -> 0x0079, TryCatch #3 {all -> 0x0079, blocks: (B:35:0x0051, B:38:0x0056, B:40:0x005a, B:42:0x0067, B:49:0x0086, B:51:0x0090, B:53:0x0093, B:55:0x0097, B:57:0x00a7, B:58:0x00aa), top: B:109:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7 A[Catch: all -> 0x0079, TryCatch #3 {all -> 0x0079, blocks: (B:35:0x0051, B:38:0x0056, B:40:0x005a, B:42:0x0067, B:49:0x0086, B:51:0x0090, B:53:0x0093, B:55:0x0097, B:57:0x00a7, B:58:0x00aa), top: B:109:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    public final CharSequence e(CharSequence charSequence, int i, int i2) throws Throwable {
        CharSequence charSequence2;
        Throwable th;
        int i3;
        int i4;
        nc1[] nc1VarArr;
        int i5;
        int spanStart;
        boolean z = false;
        xc1 xc1Var = null;
        if (!(b() == 1)) {
            nh0.j("Not initialized yet");
            return null;
        }
        if (i < 0) {
            id.q("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            id.q("end cannot be negative");
            return null;
        }
        if (!(i <= i2)) {
            id.q("start should be <= than end");
            return null;
        }
        if (charSequence == null) {
            return null;
        }
        if (!(i <= charSequence.length())) {
            id.q("start should be < than charSequence length");
            return null;
        }
        if (!(i2 <= charSequence.length())) {
            id.q("end should be < than charSequence length");
            return null;
        }
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        y6 y6Var = this.e.b;
        y6Var.getClass();
        boolean z2 = charSequence instanceof w51;
        if (z2) {
            ((w51) charSequence).a();
        }
        if (z2) {
            xc1Var = new xc1((Spannable) charSequence);
            if (xc1Var != null) {
                for (nc1 nc1Var : nc1VarArr) {
                    spanStart = xc1Var.d.getSpanStart(nc1Var);
                    int spanEnd = xc1Var.d.getSpanEnd(nc1Var);
                    if (spanStart != i2) {
                        xc1Var.removeSpan(nc1Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd, i2);
                }
            }
            i3 = i;
            i4 = i2;
            if (i3 != i4) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            }
            ((w51) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    xc1Var = new xc1((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((w51) charSequence2).b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, nc1.class) <= i2) {
                xc1Var = new xc1();
                xc1Var.c = false;
                xc1Var.d = new SpannableString(charSequence);
            }
            if (xc1Var != null && (nc1VarArr = (nc1[]) xc1Var.d.getSpans(i, i2, nc1.class)) != null && nc1VarArr.length > 0) {
                while (i5 < r5) {
                    spanStart = xc1Var.d.getSpanStart(nc1Var);
                    int spanEnd2 = xc1Var.d.getSpanEnd(nc1Var);
                    if (spanStart != i2) {
                        xc1Var.removeSpan(nc1Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd2, i2);
                }
            }
            i3 = i;
            i4 = i2;
            if (i3 != i4 || i3 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                try {
                    charSequence2 = charSequence;
                    try {
                        xc1 xc1Var2 = (xc1) y6Var.E(charSequence2, i3, i4, Integer.MAX_VALUE, false, new bc(xc1Var, (fw) y6Var.d, 21, z));
                        if (xc1Var2 != null) {
                            Spannable spannable = xc1Var2.d;
                            if (z2) {
                                ((w51) charSequence2).b();
                            }
                            return spannable;
                        }
                        if (!z2) {
                            return charSequence2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        if (!z2) {
                            throw th;
                        }
                        ((w51) charSequence2).b();
                        throw th;
                    }
                } catch (Throwable th4) {
                    charSequence2 = charSequence;
                    th = th4;
                }
            }
            ((w51) charSequence2).b();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
        }
        if (!z2) {
            throw th;
        }
        ((w51) charSequence2).b();
        throw th;
    }

    public final void f(pw pwVar) {
        r71.i(pwVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new qi(Arrays.asList(pwVar), this.c, (Throwable) null));
            } else {
                this.b.add(pwVar);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
