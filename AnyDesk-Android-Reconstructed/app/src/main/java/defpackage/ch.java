package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ch implements ff0 {
    public final WeakReference c;

    public ch(gh ghVar) {
        this.c = new WeakReference(ghVar);
    }

    @yq0(ze0.ON_DESTROY)
    public void resetCallback() {
        WeakReference weakReference = this.c;
        if (weakReference.get() != null) {
            ((gh) weakReference.get()).c = null;
        }
    }
}
