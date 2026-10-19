package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l9 implements Runnable {
    public final /* synthetic */ int c = 1;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public l9(o9 o9Var, ArrayList arrayList) {
        this.d = o9Var;
        this.e = arrayList;
        this.f = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                ((ArrayList) this.f).add(MessageDigest.getInstance(((m9) obj).a.d));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
        this.g = new ev(23, (MessageDigest[]) ((ArrayList) this.f).toArray(new MessageDigest[0]));
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        Object obj = this.f;
        Object obj2 = this.d;
        Object obj3 = this.e;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                ev evVar = (ev) obj4;
                o9 o9Var = (o9) obj2;
                byte[] bArr = new byte[5];
                bArr[0] = -91;
                try {
                    for (n9 n9Var = o9Var.get(); n9Var != null; n9Var = o9Var.get()) {
                        int i2 = n9Var.b;
                        if (i2 > 1048576) {
                            throw new RuntimeException("Chunk size greater than expected: " + i2);
                        }
                        ds.a(i2, bArr);
                        evVar.d(0, 5, bArr);
                        evVar.a((ByteBuffer) n9Var.c);
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            m9 m9Var = (m9) arrayList.get(i3);
                            MessageDigest messageDigest = (MessageDigest) ((ArrayList) obj).get(i3);
                            byte[] bArr2 = m9Var.c;
                            int i4 = m9Var.b;
                            int iDigest = messageDigest.digest(bArr2, (n9Var.a * i4) + 5, i4);
                            if (iDigest != i4) {
                                throw new RuntimeException("Unexpected output size of " + m9Var.a + " digest: " + iDigest);
                            }
                        }
                    }
                    return;
                } catch (IOException e) {
                    e = e;
                    throw new RuntimeException(e);
                } catch (DigestException e2) {
                    e = e2;
                    throw new RuntimeException(e);
                }
            default:
                sj sjVar = (sj) ((af1) obj4).d;
                vk0 vk0Var = (vk0) obj3;
                rj rjVar = (rj) obj2;
                if (rjVar != null) {
                    sjVar.B = true;
                    rjVar.b.c(false);
                    sjVar.B = false;
                }
                if (vk0Var.isEnabled() && vk0Var.hasSubMenu()) {
                    ((rk0) obj).q(vk0Var, null, 4);
                    return;
                }
                return;
        }
    }

    public l9(af1 af1Var, rj rjVar, vk0 vk0Var, rk0 rk0Var) {
        this.g = af1Var;
        this.d = rjVar;
        this.e = vk0Var;
        this.f = rk0Var;
    }
}
