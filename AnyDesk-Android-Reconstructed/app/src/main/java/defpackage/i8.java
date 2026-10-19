package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.anydesk.jnilib.Logging;

/* JADX INFO: loaded from: classes.dex */
public final class i8 implements z70, o80 {
    public final Logging c = new Logging("AndroidEventInjectorService");
    public final uq d;
    public final boolean e;
    public final String f;

    public i8(uq uqVar, boolean z) {
        this.d = uqVar;
        this.e = z;
        this.f = uqVar.c.a();
    }

    @Override // defpackage.z70
    public final boolean a(KeyEvent keyEvent) {
        c80 c80Var = this.d.e;
        if (c80Var != null) {
            try {
                Parcel parcelObtain = Parcel.obtain();
                if (parcelObtain != null) {
                    try {
                        keyEvent.writeToParcel(parcelObtain, 0);
                        return ((a80) c80Var).h(parcelObtain.marshall());
                    } finally {
                        parcelObtain.recycle();
                    }
                }
            } catch (RemoteException e) {
                m("cannot inject key input", e);
                return false;
            } catch (SecurityException e2) {
                m("not allowed to inject key input", e2);
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.o80
    public final boolean b(String str) {
        c80 c80Var = this.d.e;
        if (c80Var == null) {
            o("GPRES: ");
            return false;
        }
        try {
            a80 a80Var = (a80) c80Var;
            if (a80Var.c() >= 10202) {
                return a80Var.e(str);
            }
            n("GPRES: ");
            return false;
        } catch (RemoteException e) {
            m("GPRES failed", e);
            return false;
        } catch (SecurityException e2) {
            m("not allowed to GPRES", e2);
            return false;
        }
    }

    @Override // defpackage.z70
    public final boolean c(MotionEvent motionEvent) {
        c80 c80Var = this.d.e;
        boolean z = false;
        if (c80Var != null) {
            try {
                Parcel parcelObtain = Parcel.obtain();
                if (parcelObtain != null) {
                    try {
                        motionEvent.writeToParcel(parcelObtain, 0);
                        byte[] bArrMarshall = parcelObtain.marshall();
                        a80 a80Var = (a80) c80Var;
                        Parcel parcelObtain2 = Parcel.obtain();
                        Parcel parcelObtain3 = Parcel.obtain();
                        try {
                            parcelObtain2.writeInterfaceToken("com.anydesk.adcontrol.IControlService");
                            parcelObtain2.writeByteArray(bArrMarshall);
                            a80Var.d.transact(2, parcelObtain2, parcelObtain3, 0);
                            parcelObtain3.readException();
                            boolean z2 = parcelObtain3.readInt() != 0;
                            parcelObtain3.recycle();
                            parcelObtain2.recycle();
                            try {
                                parcelObtain.recycle();
                                return z2;
                            } catch (RemoteException e) {
                                e = e;
                                z = z2;
                                m("cannot inject touch input", e);
                                return z;
                            } catch (SecurityException e2) {
                                e = e2;
                                z = z2;
                                m("not allowed to inject touch input", e);
                                return z;
                            }
                        } catch (Throwable th) {
                            parcelObtain3.recycle();
                            parcelObtain2.recycle();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        parcelObtain.recycle();
                        throw th2;
                    }
                }
            } catch (RemoteException e3) {
                e = e3;
            } catch (SecurityException e4) {
                e = e4;
            }
        }
        return false;
    }

    @Override // defpackage.o80
    public final boolean d(String str) {
        c80 c80Var = this.d.e;
        if (c80Var == null) {
            o("AAOPM: ");
            return false;
        }
        try {
            a80 a80Var = (a80) c80Var;
            if (a80Var.c() >= 10200) {
                return a80Var.b(str);
            }
            n("AAOPM: ");
            return false;
        } catch (RemoteException e) {
            m("AAOPM failed", e);
            return false;
        } catch (SecurityException e2) {
            m("not allowed to AAOPM", e2);
            return false;
        }
    }

    @Override // defpackage.z70
    public final boolean e(String str) {
        if (!this.e) {
            int iCharCount = 0;
            while (iCharCount < str.length()) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (i(iCodePointAt)) {
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            return true;
        }
        c80 c80Var = this.d.e;
        if (c80Var != null) {
            try {
                return ((a80) c80Var).j(str);
            } catch (RemoteException e) {
                m("cannot inject string input", e);
            } catch (SecurityException e2) {
                m("not allowed to inject string input", e2);
            }
        }
        return false;
    }

    @Override // defpackage.z70
    public final boolean f(MotionEvent[] motionEventArr) {
        c80 c80Var = this.d.e;
        if (c80Var != null) {
            try {
                Parcel parcelObtain = Parcel.obtain();
                if (parcelObtain != null) {
                    try {
                        for (MotionEvent motionEvent : motionEventArr) {
                            motionEvent.writeToParcel(parcelObtain, 0);
                        }
                        return ((a80) c80Var).i(motionEventArr.length, parcelObtain.marshall());
                    } finally {
                        parcelObtain.recycle();
                    }
                }
            } catch (RemoteException e) {
                m("cannot inject touch input", e);
                return false;
            } catch (SecurityException e2) {
                m("not allowed to inject touch input", e2);
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.o80
    public final boolean g(String str) {
        c80 c80Var = this.d.e;
        if (c80Var == null) {
            o("GPWES: ");
            return false;
        }
        try {
            a80 a80Var = (a80) c80Var;
            if (a80Var.c() >= 10202) {
                return a80Var.g(str);
            }
            n("GPWES: ");
            return false;
        } catch (RemoteException e) {
            m("GPWES failed", e);
            return false;
        } catch (SecurityException e2) {
            m("not allowed to GPWES", e2);
            return false;
        }
    }

    @Override // defpackage.o80
    public final boolean h(String str) {
        c80 c80Var = this.d.e;
        if (c80Var == null) {
            o("GPMES: ");
            return false;
        }
        try {
            a80 a80Var = (a80) c80Var;
            if (a80Var.c() >= 10202) {
                return a80Var.d(str);
            }
            n("GPMES: ");
            return false;
        } catch (RemoteException e) {
            m("GPMES failed", e);
            return false;
        } catch (SecurityException e2) {
            m("not allowed to GPMES", e2);
            return false;
        }
    }

    @Override // defpackage.z70
    public final boolean i(int i) {
        c80 c80Var = this.d.e;
        if (c80Var == null) {
            return false;
        }
        try {
            return ((a80) c80Var).k(i);
        } catch (RemoteException e) {
            m("cannot inject unicode input", e);
            return false;
        } catch (SecurityException e2) {
            m("not allowed to inject unicode input", e2);
            return false;
        }
    }

    @Override // defpackage.o80
    public final boolean j(String str) {
        c80 c80Var = this.d.e;
        if (c80Var == null) {
            o("ABOWL: ");
            return false;
        }
        try {
            a80 a80Var = (a80) c80Var;
            if (a80Var.c() >= 10200) {
                return a80Var.a(str);
            }
            n("ABOWL: ");
            return false;
        } catch (RemoteException e) {
            m("ABOWL failed", e);
            return false;
        } catch (SecurityException e2) {
            m("not allowed to ABOWL", e2);
            return false;
        }
    }

    @Override // defpackage.o80
    public final boolean k(String str) {
        c80 c80Var = this.d.e;
        if (c80Var == null) {
            o("GPSAW: ");
            return false;
        }
        try {
            a80 a80Var = (a80) c80Var;
            if (a80Var.c() >= 10202) {
                return a80Var.f(str);
            }
            n("GPSAW: ");
            return false;
        } catch (RemoteException e) {
            m("GPSAW failed", e);
            return false;
        } catch (SecurityException e2) {
            m("not allowed to GPSAW", e2);
            return false;
        }
    }

    public final String l(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (");
        return q51.m(sb, this.f, ")");
    }

    public final void m(String str, Exception exc) {
        this.c.a(l(str) + ": " + exc.getMessage());
    }

    public final void n(String str) {
        this.c.e(l(str.concat("not available")));
    }

    public final void o(String str) {
        this.c.a(l(str.concat("not connected to control service")));
    }
}
