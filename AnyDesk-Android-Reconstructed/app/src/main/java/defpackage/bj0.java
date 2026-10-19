package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.MainService;
import com.anydesk.anydeskandroid.PermissionProfile;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import com.samsung.android.knox.EnterpriseDeviceManager;

/* JADX INFO: loaded from: classes.dex */
public final class bj0 extends Binder implements IInterface {
    public final /* synthetic */ MainService d;

    public bj0(MainService mainService) {
        this.d = mainService;
        attachInterface(this, "com.anydesk.anydeskandroid.IMainService");
    }

    public final int a(char[] cArr) {
        MainService mainService = this.d;
        long jI = q51.i(mainService.getPackageManager());
        int iK3 = 0;
        if (cArr != null) {
            try {
                iK3 = JniAdExt.K3(t01.d(cArr));
            } catch (Throwable th) {
                try {
                    mainService.c.a("call failed: " + th.getMessage());
                    return 0;
                } finally {
                    Binder.restoreCallingIdentity(jI);
                }
            }
        }
        Binder.restoreCallingIdentity(jI);
        return iK3;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003f  */
    public final int b(char[] cArr) {
        int i;
        MainService mainService = this.d;
        long jI = q51.i(mainService.getPackageManager());
        int i2 = 2;
        try {
            Looper looper = t70.a;
            i = 1;
            boolean z = false;
            boolean z2 = cArr == null || cArr.length == 0;
            t01 t01VarD = z2 ? t01.e : t01.d(cArr);
            if (z2) {
                z = true;
            } else if (JniAdExt.K3(t01.a(t01VarD)) <= 0) {
                i2 = 3;
            } else if (JniAdExt.v3(t01.a(t01VarD))) {
                i2 = 4;
            } else {
                z = true;
            }
            if (z) {
                JniAdExt.p4(t01VarD);
                MainApplication.v().o();
                if (z2 != JniAdExt.k3()) {
                }
                Binder.restoreCallingIdentity(jI);
                return q51.r(i);
            }
            t01VarD.b();
            i = i2;
            Binder.restoreCallingIdentity(jI);
        } catch (Throwable th) {
            try {
                mainService.c.a("call failed: " + th.getMessage());
                Binder.restoreCallingIdentity(jI);
                i = 2;
            } catch (Throwable th2) {
                Binder.restoreCallingIdentity(jI);
                throw th2;
            }
        }
        return q51.r(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r8v13, types: [int] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        long jD2;
        Throwable th;
        MainService mainService = this.d;
        Logging logging = mainService.c;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("com.anydesk.anydeskandroid.IMainService");
        }
        io ioVar = io.KEY_INTERACTIVE_ACCESS;
        int iL3 = 2;
        long jD3 = 0;
        String string = null;
        int i3 = 0;
        ?? K3 = 0;
        ?? B2 = 0;
        int i4 = 0;
        i3 = 0;
        switch (i) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeInt(12);
                return true;
            case 2:
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    if (JniAdExt.l == 2) {
                        i3 = 1;
                    }
                } catch (Throwable th2) {
                    try {
                        logging.a("call failed: " + th2.getMessage());
                    } catch (Throwable th3) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th3;
                    }
                    break;
                }
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 3:
                long jClearCallingIdentity2 = Binder.clearCallingIdentity();
                try {
                    jD2 = JniAdExt.D2();
                    Binder.restoreCallingIdentity(jClearCallingIdentity2);
                } catch (Throwable th4) {
                    try {
                        logging.a("call failed: " + th4.getMessage());
                        Binder.restoreCallingIdentity(jClearCallingIdentity2);
                        jD2 = 0;
                    } catch (Throwable th5) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity2);
                        throw th5;
                    }
                }
                int i5 = jD2 == 0 ? (int) jD2 : 0;
                parcel2.writeNoException();
                parcel2.writeInt(i5);
                return true;
            case 4:
                long jClearCallingIdentity3 = Binder.clearCallingIdentity();
                try {
                    jD3 = JniAdExt.D2();
                    break;
                } catch (Throwable th6) {
                    try {
                        logging.a("call failed: " + th6.getMessage());
                    } catch (Throwable th7) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity3);
                        throw th7;
                    }
                    break;
                }
                Binder.restoreCallingIdentity(jClearCallingIdentity3);
                parcel2.writeNoException();
                parcel2.writeLong(jD3);
                return true;
            case 5:
                long jClearCallingIdentity4 = Binder.clearCallingIdentity();
                try {
                    String strC2 = JniAdExt.C2();
                    if (!strC2.isEmpty()) {
                        string = strC2;
                    }
                } catch (Throwable th8) {
                    try {
                        logging.a("call failed: " + th8.getMessage());
                    } catch (Throwable th9) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity4);
                        throw th9;
                    }
                    break;
                }
                Binder.restoreCallingIdentity(jClearCallingIdentity4);
                parcel2.writeNoException();
                parcel2.writeString(string);
                return true;
            case 6:
                long jI = q51.i(mainService.getPackageManager());
                try {
                    K3 = JniAdExt.k3();
                    break;
                } catch (Throwable th10) {
                    try {
                        logging.a("call failed: " + th10.getMessage());
                    } catch (Throwable th11) {
                        Binder.restoreCallingIdentity(jI);
                        throw th11;
                    }
                    break;
                }
                Binder.restoreCallingIdentity(jI);
                parcel2.writeNoException();
                parcel2.writeInt(K3);
                return true;
            case 7:
                int iA = a(parcel.readString().toCharArray());
                parcel2.writeNoException();
                parcel2.writeInt(iA);
                return true;
            case 8:
                int i6 = b(parcel.readString().toCharArray()) == 0 ? 1 : 0;
                parcel2.writeNoException();
                parcel2.writeInt(i6);
                return true;
            case 9:
                long jI2 = q51.i(mainService.getPackageManager());
                try {
                    int iR = q51.r(hq.p(JniAdExt.h2(ioVar)));
                    iL3 = iR != 0 ? iR != 1 ? iR != 2 ? -1 : 0 : 1 : 2;
                    try {
                        MainApplication.v().o();
                    } catch (Throwable th12) {
                        th = th12;
                        try {
                            logging.a("call failed: " + th.getMessage());
                        } catch (Throwable th13) {
                            Binder.restoreCallingIdentity(jI2);
                            throw th13;
                        }
                    }
                    break;
                } catch (Throwable th14) {
                    th = th14;
                    iL3 = -1;
                }
                Binder.restoreCallingIdentity(jI2);
                parcel2.writeNoException();
                parcel2.writeInt(iL3);
                return true;
            case 10:
                int i7 = parcel.readInt();
                long jI3 = q51.i(mainService.getPackageManager());
                try {
                    if (i7 == 0) {
                        JniAdExt.y4(ioVar, 2);
                    } else if (i7 == 1) {
                        JniAdExt.y4(ioVar, 1);
                    } else if (i7 != 2) {
                        logging.a("invalid mode " + i7);
                    } else {
                        JniAdExt.y4(ioVar, 0);
                    }
                    MainApplication.v().o();
                    break;
                } catch (Throwable th15) {
                    try {
                        logging.a("call failed: " + th15.getMessage());
                    } catch (Throwable th16) {
                        Binder.restoreCallingIdentity(jI3);
                        throw th16;
                    }
                    break;
                }
                Binder.restoreCallingIdentity(jI3);
                parcel2.writeNoException();
                return true;
            case 11:
                long jClearCallingIdentity5 = Binder.clearCallingIdentity();
                try {
                    i4 = !MainApplication.v().R.isEmpty() ? 1 : 0;
                } catch (Throwable th17) {
                    try {
                        logging.a("call failed: " + th17.getMessage());
                    } catch (Throwable th18) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity5);
                        throw th18;
                    }
                    break;
                }
                Binder.restoreCallingIdentity(jClearCallingIdentity5);
                parcel2.writeNoException();
                parcel2.writeInt(i4);
                return true;
            case 12:
                long j = parcel.readLong();
                long jI4 = q51.i(mainService.getPackageManager());
                try {
                    B2 = JniAdExt.b2(j);
                    break;
                } catch (Throwable th19) {
                    try {
                        logging.a("call failed: " + th19.getMessage());
                    } catch (Throwable th20) {
                        Binder.restoreCallingIdentity(jI4);
                        throw th20;
                    }
                    break;
                }
                Binder.restoreCallingIdentity(jI4);
                parcel2.writeNoException();
                parcel2.writeInt(B2);
                return true;
            case 13:
                parcel2.writeNoException();
                parcel2.writeString(null);
                return true;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                parcel.readString();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                parcel.createByteArray();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                parcel.readInt();
                logging.h("Support for enablePluginInstallDialog() was removed in AnyDesk 7.2.0, as this dialog is no longer shown during app start-up.");
                parcel2.writeNoException();
                return true;
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                parcel.readInt();
                logging.h("Support for enablePluginUpdateDialog() was removed in AnyDesk 7.2.0, as this dialog is no longer shown during app start-up.");
                parcel2.writeNoException();
                return true;
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                parcel.readInt();
                logging.h("Support for enablePluginActivationDialog() was removed in AnyDesk 7.2.0, as this dialog is no longer shown during app start-up.");
                parcel2.writeNoException();
                return true;
            case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                parcel.readInt();
                logging.h("Support for enableBatteryOptimizationDialog() was removed in AnyDesk 7.2.0, as this dialog is no longer shown during app start-up.");
                parcel2.writeNoException();
                return true;
            case 21:
                int i8 = parcel.readInt();
                long jI5 = q51.i(mainService.getPackageManager());
                try {
                    JniAdExt.y4(io.KEY_UI_ENABLE_DIALOG_OVERLAY_PERMISSION, i8);
                    break;
                } catch (Throwable th21) {
                    try {
                        logging.a("call failed: " + th21.getMessage());
                    } catch (Throwable th22) {
                        Binder.restoreCallingIdentity(jI5);
                        throw th22;
                    }
                    break;
                }
                Binder.restoreCallingIdentity(jI5);
                parcel2.writeNoException();
                return true;
            case 22:
                int i9 = parcel.readInt();
                long jI6 = q51.i(mainService.getPackageManager());
                try {
                    JniAdExt.y4(io.KEY_UI_ENABLE_DIALOG_LOCAL_SCAM_WARNING, i9);
                    break;
                } catch (Throwable th23) {
                    try {
                        logging.a("call failed: " + th23.getMessage());
                    } catch (Throwable th24) {
                        Binder.restoreCallingIdentity(jI6);
                        throw th24;
                    }
                    break;
                }
                Binder.restoreCallingIdentity(jI6);
                parcel2.writeNoException();
                return true;
            case 23:
                int i10 = parcel.readInt();
                long jI7 = q51.i(mainService.getPackageManager());
                try {
                    JniAdExt.y4(io.KEY_UI_ENABLE_TUTORIAL_AUTOSTART, i10);
                    break;
                } catch (Throwable th25) {
                    try {
                        logging.a("call failed: " + th25.getMessage());
                    } catch (Throwable th26) {
                        Binder.restoreCallingIdentity(jI7);
                        throw th26;
                    }
                    break;
                }
                Binder.restoreCallingIdentity(jI7);
                parcel2.writeNoException();
                return true;
            case 24:
                int i11 = parcel.readInt();
                long jI8 = q51.i(mainService.getPackageManager());
                try {
                    JniAdExt.y4(io.KEY_UI_ENABLE_DIALOG_PRIVACY_POLICY, i11);
                    break;
                } catch (Throwable th27) {
                    try {
                        logging.a("call failed: " + th27.getMessage());
                    } catch (Throwable th28) {
                        Binder.restoreCallingIdentity(jI8);
                        throw th28;
                    }
                    break;
                }
                Binder.restoreCallingIdentity(jI8);
                parcel2.writeNoException();
                return true;
            case 25:
                int i12 = parcel.readInt();
                long jI9 = q51.i(mainService.getPackageManager());
                try {
                    JniAdExt.y4(io.KEY_UI_ENABLE_DIALOG_SETUP_PROMPT, i12);
                    break;
                } catch (Throwable th29) {
                    try {
                        logging.a("call failed: " + th29.getMessage());
                    } catch (Throwable th30) {
                        Binder.restoreCallingIdentity(jI9);
                        throw th30;
                    }
                    break;
                }
                Binder.restoreCallingIdentity(jI9);
                parcel2.writeNoException();
                return true;
            case 26:
                int iA2 = a(parcel.createCharArray());
                parcel2.writeNoException();
                parcel2.writeInt(iA2);
                return true;
            case 27:
                int i13 = b(parcel.createCharArray()) == 0 ? 1 : 0;
                parcel2.writeNoException();
                parcel2.writeInt(i13);
                return true;
            case 28:
                int iB = b(parcel.createCharArray());
                parcel2.writeNoException();
                parcel2.writeInt(iB);
                return true;
            case 29:
                int i14 = parcel.readInt();
                long jI10 = q51.i(mainService.getPackageManager());
                try {
                    JniAdExt.y4(io.KEY_UI_ENABLE_DIALOG_QUERY_ALL_PACKAGES_CONSENT, i14);
                    break;
                } catch (Throwable th31) {
                    try {
                        logging.a("call failed: " + th31.getMessage());
                    } catch (Throwable th32) {
                        Binder.restoreCallingIdentity(jI10);
                        throw th32;
                    }
                    break;
                }
                Binder.restoreCallingIdentity(jI10);
                parcel2.writeNoException();
                return true;
            case 30:
                long jI11 = q51.i(mainService.getPackageManager());
                try {
                    PermissionProfile[] permissionProfileArrF2 = JniAdExt.F2();
                    if (permissionProfileArrF2 != null) {
                        StringBuilder sb = new StringBuilder();
                        for (PermissionProfile permissionProfile : permissionProfileArrF2) {
                            if (sb.length() > 0) {
                                sb.append(";");
                            }
                            sb.append(permissionProfile.a);
                        }
                        string = sb.toString();
                    }
                    break;
                } catch (Throwable th33) {
                    try {
                        logging.a("call failed: " + th33.getMessage());
                    } catch (Throwable th34) {
                        Binder.restoreCallingIdentity(jI11);
                        throw th34;
                    }
                    break;
                }
                Binder.restoreCallingIdentity(jI11);
                parcel2.writeNoException();
                parcel2.writeString(string);
                return true;
            case 31:
                String string2 = parcel.readString();
                long jI12 = q51.i(mainService.getPackageManager());
                try {
                    iL3 = JniAdExt.L3(string2);
                    break;
                } catch (Throwable th35) {
                    try {
                        logging.a("call failed: " + th35.getMessage());
                    } catch (Throwable th36) {
                        Binder.restoreCallingIdentity(jI12);
                        throw th36;
                    }
                    break;
                }
                Binder.restoreCallingIdentity(jI12);
                int iR2 = q51.r(iL3);
                parcel2.writeNoException();
                parcel2.writeInt(iR2);
                return true;
            case 32:
                String string3 = parcel.readString();
                long jI13 = q51.i(mainService.getPackageManager());
                try {
                    iL3 = JniAdExt.W1(string3);
                    break;
                } catch (Throwable th37) {
                    try {
                        logging.a("call failed: " + th37.getMessage());
                    } catch (Throwable th38) {
                        Binder.restoreCallingIdentity(jI13);
                        throw th38;
                    }
                    break;
                }
                Binder.restoreCallingIdentity(jI13);
                int iR3 = q51.r(iL3);
                parcel2.writeNoException();
                parcel2.writeInt(iR3);
                return true;
            case 33:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                long jI14 = q51.i(mainService.getPackageManager());
                try {
                    iL3 = JniAdExt.b4(string4, string5);
                    break;
                } catch (Throwable th39) {
                    try {
                        logging.a("call failed: " + th39.getMessage());
                    } catch (Throwable th40) {
                        Binder.restoreCallingIdentity(jI14);
                        throw th40;
                    }
                    break;
                }
                Binder.restoreCallingIdentity(jI14);
                int iR4 = q51.r(iL3);
                parcel2.writeNoException();
                parcel2.writeInt(iR4);
                return true;
            case 34:
                String string6 = parcel.readString();
                long jI15 = q51.i(mainService.getPackageManager());
                try {
                    string = JniAdExt.E2(string6);
                    break;
                } catch (Throwable th41) {
                    try {
                        logging.a("call failed: " + th41.getMessage());
                    } catch (Throwable th42) {
                        Binder.restoreCallingIdentity(jI15);
                        throw th42;
                    }
                    break;
                }
                Binder.restoreCallingIdentity(jI15);
                parcel2.writeNoException();
                parcel2.writeString(string);
                return true;
            case 35:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                long jI16 = q51.i(mainService.getPackageManager());
                try {
                    iL3 = JniAdExt.I4(string7, string8);
                    break;
                } catch (Throwable th43) {
                    try {
                        logging.a("call failed: " + th43.getMessage());
                    } catch (Throwable th44) {
                        Binder.restoreCallingIdentity(jI16);
                        throw th44;
                    }
                    break;
                }
                Binder.restoreCallingIdentity(jI16);
                int iR5 = q51.r(iL3);
                parcel2.writeNoException();
                parcel2.writeInt(iR5);
                return true;
            case 36:
                String string9 = parcel.readString();
                char[] cArrCreateCharArray = parcel.createCharArray();
                long jI17 = q51.i(mainService.getPackageManager());
                try {
                    iL3 = JniAdExt.q4(string9, t01.d(cArrCreateCharArray));
                    break;
                } catch (Throwable th45) {
                    try {
                        logging.a("call failed: " + th45.getMessage());
                    } catch (Throwable th46) {
                        Binder.restoreCallingIdentity(jI17);
                        throw th46;
                    }
                    break;
                }
                Binder.restoreCallingIdentity(jI17);
                int iR6 = q51.r(iL3);
                parcel2.writeNoException();
                parcel2.writeInt(iR6);
                return true;
            case 37:
                String string10 = parcel.readString();
                char[] cArrCreateCharArray2 = parcel.createCharArray();
                char[] cArrCreateCharArray3 = parcel.createCharArray();
                long jI18 = q51.i(mainService.getPackageManager());
                try {
                    iL3 = JniAdExt.r4(string10, t01.d(cArrCreateCharArray2), t01.d(cArrCreateCharArray3));
                    break;
                } catch (Throwable th47) {
                    try {
                        logging.a("call failed: " + th47.getMessage());
                    } catch (Throwable th48) {
                        Binder.restoreCallingIdentity(jI18);
                        throw th48;
                    }
                    break;
                }
                Binder.restoreCallingIdentity(jI18);
                int iR7 = q51.r(iL3);
                parcel2.writeNoException();
                parcel2.writeInt(iR7);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
