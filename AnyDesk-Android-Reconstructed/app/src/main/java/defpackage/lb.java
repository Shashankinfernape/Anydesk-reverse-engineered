package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class lb extends nb {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ qb d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(qb qbVar, Context context) {
        super(qbVar);
        this.d = qbVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.nb
    public final IntentFilter f() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // defpackage.nb
    public final int g() {
        Location location;
        boolean z;
        long j;
        Location lastKnownLocation;
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                return fb.a((PowerManager) obj) ? 2 : 1;
            default:
                y6 y6Var = (y6) obj;
                ac1 ac1Var = (ac1) y6Var.f;
                LocationManager locationManager = (LocationManager) y6Var.e;
                if (ac1Var.b <= System.currentTimeMillis()) {
                    Context context = (Context) y6Var.d;
                    Location lastKnownLocation2 = null;
                    if (hq.j(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (hq.j(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (zb1.d == null) {
                            zb1.d = new zb1();
                        }
                        zb1 zb1Var = zb1.d;
                        zb1Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        zb1Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z = zb1Var.c == 1;
                        long j2 = zb1Var.b;
                        long j3 = zb1Var.a;
                        zb1Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j4 = zb1Var.b;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j3) {
                                j2 = j4;
                            } else if (jCurrentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        ac1Var.a = z;
                        ac1Var.b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z = true;
                        }
                    }
                    break;
                } else {
                    z = ac1Var.a;
                }
                return z ? 2 : 1;
        }
    }

    @Override // defpackage.nb
    public final void l() throws IllegalAccessException {
        int i = this.c;
        qb qbVar = this.d;
        switch (i) {
            case 0:
                qbVar.m(true, true);
                break;
            default:
                qbVar.m(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(qb qbVar, y6 y6Var) {
        super(qbVar);
        this.d = qbVar;
        this.e = y6Var;
    }
}
