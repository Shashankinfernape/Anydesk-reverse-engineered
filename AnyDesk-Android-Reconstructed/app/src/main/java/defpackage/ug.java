package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ug implements Runnable {
    public final /* synthetic */ int c;
    public final WeakReference d;

    public ug(gh ghVar, int i) {
        this.c = i;
        switch (i) {
            case 2:
                this.d = new WeakReference(ghVar);
                break;
            default:
                this.d = new WeakReference(ghVar);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        WeakReference weakReference = this.d;
        switch (i) {
            case 0:
                if (weakReference.get() != null) {
                    ((vg) weakReference.get()).Y0();
                }
                break;
            case 1:
                if (weakReference.get() != null) {
                    ((gh) weakReference.get()).n = false;
                }
                break;
            default:
                if (weakReference.get() != null) {
                    ((gh) weakReference.get()).o = false;
                }
                break;
        }
    }

    public ug(vg vgVar) {
        this.c = 0;
        this.d = new WeakReference(vgVar);
    }
}
