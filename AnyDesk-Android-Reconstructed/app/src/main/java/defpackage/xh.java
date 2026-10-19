package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class xh implements ServiceConnection {
    public final /* synthetic */ yh a;

    public xh(yh yhVar) {
        this.a = yhVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        this.a.i.execute(new vh(this, 0));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.i.execute(new wh(this, componentName, iBinder, 0));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.i.execute(new vh(this, 1));
    }
}
