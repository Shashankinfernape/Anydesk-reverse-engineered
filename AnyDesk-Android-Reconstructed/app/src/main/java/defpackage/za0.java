package defpackage;

import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.jni.JniAdExt;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class za0 implements Runnable {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ long d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Serializable f;

    public za0(String str, long j, String str2) {
        this.d = j;
        this.e = str;
        this.f = str2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0037 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:6:0x0018, B:8:0x001c, B:10:0x0024, B:17:0x0037, B:19:0x003b, B:21:0x0041, B:23:0x0050, B:15:0x002d), top: B:44:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        String str;
        switch (this.c) {
            case 0:
                JniAdExt.jniRenameRosterItemTag(this.d, nd0.T((String) this.e), nd0.T((String) this.f));
                return;
            default:
                String strT = nd0.t((byte[]) this.e);
                String strT2 = nd0.t((byte[]) this.f);
                synchronized (JniAdExt.E0) {
                    try {
                        RosterItem rosterItem = JniAdExt.F0;
                        if (rosterItem != null) {
                            long j = this.d;
                            if (j != 0 && rosterItem.mCid == j) {
                                str = rosterItem.mThumbnailPath;
                                if (str == null) {
                                }
                                JniAdExt.F0 = rosterItem.a(rosterItem.mUserDefinedName, strT2, rosterItem.b, rosterItem.mOnlineState);
                                z = true;
                            } else if (rosterItem.getAddr().equals(strT)) {
                                str = rosterItem.mThumbnailPath;
                                if (str == null && str.equals(strT2)) {
                                    z = false;
                                } else {
                                    JniAdExt.F0 = rosterItem.a(rosterItem.mUserDefinedName, strT2, rosterItem.b, rosterItem.mOnlineState);
                                    z = true;
                                }
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                zd zdVar = JniAdExt.b0;
                synchronized (zdVar) {
                    try {
                        td tdVar = new td(zdVar);
                        while (tdVar.hasNext()) {
                            jd0 jd0Var = (jd0) tdVar.next();
                            if (jd0Var != null) {
                                jd0Var.c(z);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public za0(long j, byte[] bArr, byte[] bArr2) {
        this.e = bArr;
        this.f = bArr2;
        this.d = j;
    }
}
