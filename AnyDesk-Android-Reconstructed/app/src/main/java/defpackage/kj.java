package defpackage;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public final class kj extends HandlerThread {
    public final /* synthetic */ mj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj(mj mjVar) {
        super("CaptureHandlerThread");
        this.c = mjVar;
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        this.c.m = new s7(this, getLooper(), 2);
    }
}
