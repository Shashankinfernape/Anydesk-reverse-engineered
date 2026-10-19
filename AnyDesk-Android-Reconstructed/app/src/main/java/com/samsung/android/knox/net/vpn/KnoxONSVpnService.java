package com.samsung.android.knox.net.vpn;

import android.app.Service;
import android.app.enterprise.CertificateInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.samsung.android.knox.net.vpn.serviceprovider.IKnoxVpnService;
import defpackage.q51;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class KnoxONSVpnService extends Service {
    private static final int BIND_VENDOR_APPLICATION_TIMEOUT = 5000;
    private static final String TAG = "KnoxONSVpnService";
    public static final String VENDOR_BIND_ACTION = ".BIND_SERVICE_NEW";
    private Context mContext;
    private String mVendorName;
    private IKnoxVpnService mVpnInterface;
    private final Object mVendorLock = new Object();
    private final int VPN_RETURN_INT_ERROR = -1;
    private final int KNOX_VPN_STATE_FAILED = 5;
    private final com.sec.enterprise.mdm.services.vpn.knoxvpn.IKnoxVpnService.Stub mIKnoxVpnService = new com.sec.enterprise.mdm.services.vpn.knoxvpn.IKnoxVpnService.Stub() { // from class: com.samsung.android.knox.net.vpn.KnoxONSVpnService.1
        @Override // com.sec.enterprise.mdm.services.vpn.knoxvpn.IKnoxVpnService
        public int createConnection(String str) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.createConnection(str);
            }
            return -1;
        }

        @Override // com.sec.enterprise.mdm.services.vpn.knoxvpn.IKnoxVpnService
        public List<String> getAllConnections() {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.getAllConnections();
            }
            return null;
        }

        @Override // com.sec.enterprise.mdm.services.vpn.knoxvpn.IKnoxVpnService
        public CertificateInfo getCACertificate(String str) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.convertToOldCertificateInfo(KnoxONSVpnService.this.mVpnInterface.getCACertificate(str));
            }
            return null;
        }

        @Override // com.sec.enterprise.mdm.services.vpn.knoxvpn.IKnoxVpnService
        public String getConnection(String str) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.getConnection(str);
            }
            return null;
        }

        @Override // com.sec.enterprise.mdm.services.vpn.knoxvpn.IKnoxVpnService
        public String getErrorString(String str) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.getErrorString(str);
            }
            return null;
        }

        @Override // com.sec.enterprise.mdm.services.vpn.knoxvpn.IKnoxVpnService
        public int getState(String str) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.getState(str);
            }
            return 5;
        }

        @Override // com.sec.enterprise.mdm.services.vpn.knoxvpn.IKnoxVpnService
        public CertificateInfo getUserCertificate(String str) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.convertToOldCertificateInfo(KnoxONSVpnService.this.mVpnInterface.getUserCertificate(str));
            }
            return null;
        }

        @Override // com.sec.enterprise.mdm.services.vpn.knoxvpn.IKnoxVpnService
        public int getVpnModeOfOperation(String str) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.getVpnModeOfOperation(str);
            }
            return -1;
        }

        @Override // com.sec.enterprise.mdm.services.vpn.knoxvpn.IKnoxVpnService
        public int removeConnection(String str) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.removeConnection(str);
            }
            return -1;
        }

        @Override // com.sec.enterprise.mdm.services.vpn.knoxvpn.IKnoxVpnService
        public boolean setAutoRetryOnConnectionError(String str, boolean z) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.setAutoRetryOnConnectionError(str, z);
            }
            return false;
        }

        @Override // com.sec.enterprise.mdm.services.vpn.knoxvpn.IKnoxVpnService
        public boolean setCACertificate(String str, byte[] bArr) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.setCACertificate(str, bArr);
            }
            return false;
        }

        @Override // com.sec.enterprise.mdm.services.vpn.knoxvpn.IKnoxVpnService
        public boolean setServerCertValidationUserAcceptanceCriteria(String str, boolean z, List list, int i) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.setServerCertValidationUserAcceptanceCriteria(str, z, list, i);
            }
            return false;
        }

        @Override // com.sec.enterprise.mdm.services.vpn.knoxvpn.IKnoxVpnService
        public boolean setUserCertificate(String str, byte[] bArr, String str2) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.setUserCertificate(str, bArr, str2);
            }
            return false;
        }

        @Override // com.sec.enterprise.mdm.services.vpn.knoxvpn.IKnoxVpnService
        public int setVpnModeOfOperation(String str, int i) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.setVpnModeOfOperation(str, i);
            }
            return -1;
        }

        @Override // com.sec.enterprise.mdm.services.vpn.knoxvpn.IKnoxVpnService
        public int startConnection(String str) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.startConnection(str);
            }
            return -1;
        }

        @Override // com.sec.enterprise.mdm.services.vpn.knoxvpn.IKnoxVpnService
        public int stopConnection(String str) {
            if (KnoxONSVpnService.this.getService() != null) {
                return KnoxONSVpnService.this.mVpnInterface.stopConnection(str);
            }
            return -1;
        }
    };

    public class VpnServiceConnection implements ServiceConnection {
        public VpnServiceConnection() {
        }

        @Override // android.content.ServiceConnection
        public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            KnoxONSVpnService.this.mVpnInterface = IKnoxVpnService.Stub.asInterface(iBinder);
            Log.d(KnoxONSVpnService.TAG, "Vendor VPN service connected: pkgName = " + componentName.getPackageName() + "interface = " + KnoxONSVpnService.this.mVpnInterface);
            synchronized (KnoxONSVpnService.this.mVendorLock) {
                KnoxONSVpnService.this.mVendorLock.notifyAll();
            }
        }

        @Override // android.content.ServiceConnection
        public synchronized void onServiceDisconnected(ComponentName componentName) {
            KnoxONSVpnService.this.mVpnInterface = null;
            Log.d(KnoxONSVpnService.TAG, "Vendor VPN service disconnected : vendorName = " + componentName.getPackageName());
        }
    }

    private boolean bindKnoxVpnInterface() {
        if (TextUtils.isEmpty(this.mVendorName)) {
            return false;
        }
        Intent intent = new Intent();
        String strM = q51.m(new StringBuilder(), this.mVendorName, VENDOR_BIND_ACTION);
        Log.d(TAG, "Bind to Vpn Vendor Service : vendorAction = ".concat(strM));
        VpnServiceConnection vpnServiceConnection = new VpnServiceConnection();
        intent.setAction(strM);
        List<ResolveInfo> listQueryIntentServices = this.mContext.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() > 0) {
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (resolveInfo.serviceInfo.packageName.equalsIgnoreCase(this.mVendorName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    intent.setComponent(new ComponentName(serviceInfo.packageName, serviceInfo.name));
                }
            }
        }
        return this.mContext.bindService(intent, vpnServiceConnection, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CertificateInfo convertToOldCertificateInfo(com.samsung.android.knox.keystore.CertificateInfo certificateInfo) {
        if (certificateInfo == null) {
            return null;
        }
        CertificateInfo certificateInfo2 = new CertificateInfo();
        certificateInfo2.setCertificate(certificateInfo.getCertificate());
        certificateInfo2.setAlias(certificateInfo.getAlias());
        certificateInfo2.setEnabled(certificateInfo.getEnabled());
        certificateInfo2.setHasPrivateKey(certificateInfo.getHasPrivateKey());
        certificateInfo2.setKeystore(certificateInfo.getKeystore());
        certificateInfo2.setSystemPreloaded(certificateInfo.getSystemPreloaded());
        return certificateInfo2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IKnoxVpnService getService() {
        if (this.mVpnInterface == null) {
            synchronized (this.mVendorLock) {
                try {
                    bindKnoxVpnInterface();
                    this.mVendorLock.wait(5000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return this.mVpnInterface;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "onBind()");
        if (intent.getComponent() != null) {
            this.mVendorName = intent.getComponent().getPackageName();
        }
        return this.mIKnoxVpnService;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mContext = getApplicationContext();
    }
}
