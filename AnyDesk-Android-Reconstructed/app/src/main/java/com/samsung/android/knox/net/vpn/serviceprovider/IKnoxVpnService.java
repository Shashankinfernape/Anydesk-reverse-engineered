package com.samsung.android.knox.net.vpn.serviceprovider;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.samsung.android.knox.keystore.CertificateInfo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface IKnoxVpnService extends IInterface {

    public static abstract class Stub extends Binder implements IKnoxVpnService {
        private static final String DESCRIPTOR = "com.samsung.android.knox.net.vpn.serviceprovider.IKnoxVpnService";
        static final int TRANSACTION_createConnection = 1;
        static final int TRANSACTION_getAllConnections = 3;
        static final int TRANSACTION_getCACertificate = 8;
        static final int TRANSACTION_getConnection = 4;
        static final int TRANSACTION_getErrorString = 12;
        static final int TRANSACTION_getState = 11;
        static final int TRANSACTION_getUserCertificate = 7;
        static final int TRANSACTION_getVpnModeOfOperation = 14;
        static final int TRANSACTION_removeConnection = 2;
        static final int TRANSACTION_setAutoRetryOnConnectionError = 16;
        static final int TRANSACTION_setCACertificate = 6;
        static final int TRANSACTION_setServerCertValidationUserAcceptanceCriteria = 15;
        static final int TRANSACTION_setUserCertificate = 5;
        static final int TRANSACTION_setVpnModeOfOperation = 13;
        static final int TRANSACTION_startConnection = 9;
        static final int TRANSACTION_stopConnection = 10;

        public static class Proxy implements IKnoxVpnService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.samsung.android.knox.net.vpn.serviceprovider.IKnoxVpnService
            public int createConnection(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.samsung.android.knox.net.vpn.serviceprovider.IKnoxVpnService
            public List<String> getAllConnections() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createStringArrayList();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.samsung.android.knox.net.vpn.serviceprovider.IKnoxVpnService
            public CertificateInfo getCACertificate(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? CertificateInfo.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.samsung.android.knox.net.vpn.serviceprovider.IKnoxVpnService
            public String getConnection(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.samsung.android.knox.net.vpn.serviceprovider.IKnoxVpnService
            public String getErrorString(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.samsung.android.knox.net.vpn.serviceprovider.IKnoxVpnService
            public int getState(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.samsung.android.knox.net.vpn.serviceprovider.IKnoxVpnService
            public CertificateInfo getUserCertificate(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? CertificateInfo.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.samsung.android.knox.net.vpn.serviceprovider.IKnoxVpnService
            public int getVpnModeOfOperation(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.samsung.android.knox.net.vpn.serviceprovider.IKnoxVpnService
            public int removeConnection(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.samsung.android.knox.net.vpn.serviceprovider.IKnoxVpnService
            public boolean setAutoRetryOnConnectionError(String str, boolean z) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.samsung.android.knox.net.vpn.serviceprovider.IKnoxVpnService
            public boolean setCACertificate(String str, byte[] bArr) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.samsung.android.knox.net.vpn.serviceprovider.IKnoxVpnService
            public boolean setServerCertValidationUserAcceptanceCriteria(String str, boolean z, List list, int i) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeList(list);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.samsung.android.knox.net.vpn.serviceprovider.IKnoxVpnService
            public boolean setUserCertificate(String str, byte[] bArr, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.samsung.android.knox.net.vpn.serviceprovider.IKnoxVpnService
            public int setVpnModeOfOperation(String str, int i) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.samsung.android.knox.net.vpn.serviceprovider.IKnoxVpnService
            public int startConnection(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.samsung.android.knox.net.vpn.serviceprovider.IKnoxVpnService
            public int stopConnection(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IKnoxVpnService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IKnoxVpnService)) ? new Proxy(iBinder) : (IKnoxVpnService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iCreateConnection = createConnection(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iCreateConnection);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iRemoveConnection = removeConnection(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iRemoveConnection);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<String> allConnections = getAllConnections();
                    parcel2.writeNoException();
                    parcel2.writeStringList(allConnections);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    String connection = getConnection(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(connection);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean userCertificate = setUserCertificate(parcel.readString(), parcel.createByteArray(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(userCertificate ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean cACertificate = setCACertificate(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(cACertificate ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    CertificateInfo userCertificate2 = getUserCertificate(parcel.readString());
                    parcel2.writeNoException();
                    if (userCertificate2 != null) {
                        parcel2.writeInt(1);
                        userCertificate2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    CertificateInfo cACertificate2 = getCACertificate(parcel.readString());
                    parcel2.writeNoException();
                    if (cACertificate2 != null) {
                        parcel2.writeInt(1);
                        cACertificate2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iStartConnection = startConnection(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iStartConnection);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iStopConnection = stopConnection(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iStopConnection);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    int state = getState(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(state);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    String errorString = getErrorString(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(errorString);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    int vpnModeOfOperation = setVpnModeOfOperation(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(vpnModeOfOperation);
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    int vpnModeOfOperation2 = getVpnModeOfOperation(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(vpnModeOfOperation2);
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean serverCertValidationUserAcceptanceCriteria = setServerCertValidationUserAcceptanceCriteria(parcel.readString(), parcel.readInt() != 0, parcel.readArrayList(getClass().getClassLoader()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(serverCertValidationUserAcceptanceCriteria ? 1 : 0);
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean autoRetryOnConnectionError = setAutoRetryOnConnectionError(parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(autoRetryOnConnectionError ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    int createConnection(String str);

    List<String> getAllConnections();

    CertificateInfo getCACertificate(String str);

    String getConnection(String str);

    String getErrorString(String str);

    int getState(String str);

    CertificateInfo getUserCertificate(String str);

    int getVpnModeOfOperation(String str);

    int removeConnection(String str);

    boolean setAutoRetryOnConnectionError(String str, boolean z);

    boolean setCACertificate(String str, byte[] bArr);

    boolean setServerCertValidationUserAcceptanceCriteria(String str, boolean z, List list, int i);

    boolean setUserCertificate(String str, byte[] bArr, String str2);

    int setVpnModeOfOperation(String str, int i);

    int startConnection(String str);

    int stopConnection(String str);
}
