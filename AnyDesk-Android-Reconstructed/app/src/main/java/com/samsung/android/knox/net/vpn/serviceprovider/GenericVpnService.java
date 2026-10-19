package com.samsung.android.knox.net.vpn.serviceprovider;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
public class GenericVpnService extends com.sec.vpn.knox.GenericVpnService {
    public static Intent prepare(Context context, String str, boolean z, boolean z2) {
        return com.sec.vpn.knox.GenericVpnService.prepare(context, str, z, z2);
    }

    public IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    public void onRevoke() {
        super.onRevoke();
    }

    public boolean protect(int i) {
        return super.protect(i);
    }

    public class Builder extends com.sec.vpn.knox.GenericVpnService.Builder {
        public Builder() {
            super(GenericVpnService.this);
        }

        public ParcelFileDescriptor establish() {
            return super.establish();
        }

        /* JADX INFO: renamed from: addSearchDomain, reason: merged with bridge method [inline-methods] */
        public Builder m6addSearchDomain(String str) {
            super.addSearchDomain(str);
            return this;
        }

        /* JADX INFO: renamed from: setConfigureIntent, reason: merged with bridge method [inline-methods] */
        public Builder m7setConfigureIntent(PendingIntent pendingIntent) {
            super.setConfigureIntent(pendingIntent);
            return this;
        }

        /* JADX INFO: renamed from: setMtu, reason: merged with bridge method [inline-methods] */
        public Builder m8setMtu(int i) {
            super.setMtu(i);
            return this;
        }

        /* JADX INFO: renamed from: setSession, reason: merged with bridge method [inline-methods] */
        public Builder m9setSession(String str) {
            super.setSession(str);
            return this;
        }

        /* JADX INFO: renamed from: addAddress, reason: merged with bridge method [inline-methods] */
        public Builder m1addAddress(InetAddress inetAddress, int i) {
            super.addAddress(inetAddress, i);
            return this;
        }

        /* JADX INFO: renamed from: addDnsServer, reason: merged with bridge method [inline-methods] */
        public Builder m3addDnsServer(InetAddress inetAddress) {
            super.addDnsServer(inetAddress);
            return this;
        }

        /* JADX INFO: renamed from: addRoute, reason: merged with bridge method [inline-methods] */
        public Builder m5addRoute(InetAddress inetAddress, int i) {
            super.addRoute(inetAddress, i);
            return this;
        }

        /* JADX INFO: renamed from: addAddress, reason: merged with bridge method [inline-methods] */
        public Builder m0addAddress(String str, int i) {
            super.addAddress(str, i);
            return this;
        }

        /* JADX INFO: renamed from: addDnsServer, reason: merged with bridge method [inline-methods] */
        public Builder m2addDnsServer(String str) {
            super.addDnsServer(str);
            return this;
        }

        /* JADX INFO: renamed from: addRoute, reason: merged with bridge method [inline-methods] */
        public Builder m4addRoute(String str, int i) {
            super.addRoute(str, i);
            return this;
        }
    }

    public boolean protect(Socket socket) {
        return super.protect(socket);
    }

    public boolean protect(DatagramSocket datagramSocket) {
        return super.protect(datagramSocket);
    }
}
