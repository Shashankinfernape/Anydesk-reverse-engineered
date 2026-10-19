package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.print.PrintManager;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.webkit.URLUtil;
import android.webkit.WebView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.activity.WebViewActivity;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;
import com.anydesk.jni.JniAdExt;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    private final void a() {
        ArrayList arrayList = (ArrayList) this.d;
        synchronized (JniAdExt.t0) {
            try {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Long l = (Long) obj;
                    if (l.longValue() != 0 && JniAdExt.w0.add(l)) {
                        JniAdExt.i = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        JniAdExt.U1();
    }

    @Override // java.lang.Runnable
    public final void run() {
        Dialog dialog;
        Object obj;
        Window window;
        String url;
        int i = 1;
        boolean z = false;
        switch (this.c) {
            case 0:
                Dialog dialog2 = ((o) this.d).k0;
                if (dialog2 != null) {
                    dialog2.dismiss();
                    return;
                }
                return;
            case 1:
                s4 s4Var = (s4) this.d;
                if ((JniAdExt.q3() || JniAdExt.Y1()) && (dialog = s4Var.k0) != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 2:
                Activity activity = (Activity) this.d;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = h6.g;
                Method method = h6.f;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i2 != 26 && i2 != 27) || method != null) && (h6.e != null || h6.d != null)) {
                    Object obj2 = h6.c.get(activity);
                    if (obj2 != null && (obj = h6.b.get(activity)) != null) {
                        Application application = activity.getApplication();
                        g6 g6Var = new g6(activity);
                        application.registerActivityLifecycleCallbacks(g6Var);
                        handler.post(new d3(g6Var, obj2, 3, z));
                        boolean z2 = i2 == 26 || i2 == 27;
                        int i3 = 4;
                        try {
                            if (z2) {
                                Boolean bool = Boolean.FALSE;
                                method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                            } else {
                                activity.recreate();
                            }
                            handler.post(new d3(application, g6Var, i3, z));
                            return;
                        } catch (Throwable th) {
                            handler.post(new d3(application, g6Var, i3, z));
                            throw th;
                        }
                    }
                }
                activity.recreate();
                return;
            case 3:
                ff ffVar = (ff) this.d;
                AudioRecord audioRecord = ffVar.j;
                if (audioRecord == null || ffVar.k == null) {
                    return;
                }
                audioRecord.startRecording();
                while (ffVar.g.get()) {
                    ffVar.k.clear();
                    AudioRecord audioRecord2 = ffVar.j;
                    ByteBuffer byteBuffer = ffVar.k;
                    int i4 = audioRecord2.read(byteBuffer, byteBuffer.limit());
                    if (i4 > 0) {
                        JniAdExt.Q1(i4, ffVar.k);
                    } else if (i4 < 0) {
                        ffVar.a.a(String.format("error during audio record read: code %d", Integer.valueOf(i4)));
                        ffVar.j.stop();
                        return;
                    }
                }
                ffVar.j.stop();
                return;
            case 4:
                ((CarouselLayoutManager) this.d).o0();
                return;
            case 5:
                ((mm) this.d).s(true);
                return;
            case 6:
                xn xnVar = (xn) this.d;
                Runnable runnable = xnVar.d;
                if (runnable != null) {
                    runnable.run();
                    xnVar.d = null;
                    return;
                }
                return;
            case 7:
                eo.a((eo) this.d);
                return;
            case 8:
                xv xvVar = (xv) this.d;
                boolean zIsPopupShowing = xvVar.h.isPopupShowing();
                xvVar.s(zIsPopupShowing);
                xvVar.m = zIsPopupShowing;
                return;
            case 9:
                ((FileManagerFileListFragment) this.d).g1();
                return;
            case 10:
                h30 h30Var = (h30) this.d;
                synchronized (h30Var.d) {
                    try {
                        if (h30Var.h == null) {
                            return;
                        }
                        try {
                            r30 r30VarD = h30Var.d();
                            int i5 = r30VarD.f;
                            if (i5 == 2) {
                                synchronized (h30Var.d) {
                                }
                            }
                            if (i5 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i5 + ")");
                            }
                            try {
                                Method method2 = bb1.b;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                fw fwVar = h30Var.c;
                                Context context = h30Var.a;
                                fwVar.getClass();
                                r30[] r30VarArr = {r30VarD};
                                ds dsVar = fc1.a;
                                ec1.h("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceI = fc1.a.i(context, r30VarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferL = y90.L(h30Var.a, r30VarD.a);
                                    if (mappedByteBufferL == null || typefaceI == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        ah ahVar = new ah(typefaceI, ds.A(mappedByteBufferL));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (h30Var.d) {
                                            try {
                                                y90 y90Var = h30Var.h;
                                                if (y90Var != null) {
                                                    y90Var.P(ahVar);
                                                }
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                            break;
                                        }
                                        h30Var.b();
                                        return;
                                    } catch (Throwable th3) {
                                        Method method3 = bb1.b;
                                        Trace.endSection();
                                        throw th3;
                                    }
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            } catch (Throwable th5) {
                                Method method4 = bb1.b;
                                Trace.endSection();
                                throw th5;
                            }
                            break;
                        } catch (Throwable th6) {
                            synchronized (h30Var.d) {
                                try {
                                    y90 y90Var2 = h30Var.h;
                                    if (y90Var2 != null) {
                                        y90Var2.M(th6);
                                    }
                                    h30Var.b();
                                    return;
                                } catch (Throwable th7) {
                                    throw th7;
                                }
                            }
                        }
                    } catch (Throwable th8) {
                        throw th8;
                    }
                }
            case 11:
                c40 c40Var = (c40) this.d;
                c40Var.R.g.p(c40Var.f);
                c40Var.f = null;
                return;
            case 12:
                a();
                return;
            case 13:
                MainActivity mainActivity = (MainActivity) this.d;
                zd zdVar = MainActivity.j0;
                InputMethodManager inputMethodManager = (InputMethodManager) mainActivity.getSystemService("input_method");
                if (inputMethodManager == null || (window = mainActivity.getWindow()) == null) {
                    return;
                }
                inputMethodManager.hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                return;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                MainApplication mainApplication = (MainApplication) this.d;
                if (mainApplication.o0 == 2) {
                    MainActivity mainActivity2 = mainApplication.e;
                    if (mainActivity2 != null) {
                        t70.Y(new bi0(mainActivity2, i));
                        return;
                    } else {
                        if (JniAdExt.i3()) {
                            mainApplication.T(8);
                            return;
                        }
                        return;
                    }
                }
                return;
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                y6 y6Var = (y6) this.d;
                sj0 sj0Var = (sj0) y6Var.d;
                if (sj0Var != null) {
                    sj0Var.b((NavigationView) y6Var.e, (NavigationView) y6Var.f, true);
                    return;
                }
                return;
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                dv0 dv0Var = (dv0) this.d;
                if0 if0Var = dv0Var.h;
                if (dv0Var.d == 0) {
                    dv0Var.e = true;
                    if0Var.d(ze0.ON_PAUSE);
                }
                if (dv0Var.c == 0 && dv0Var.e) {
                    if0Var.d(ze0.ON_STOP);
                    dv0Var.f = true;
                    return;
                }
                return;
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                z31 z31Var = (z31) this.d;
                y31 y31Var = z31Var.q0;
                if (y31Var != null) {
                    y31Var.i(z31Var.r0);
                    return;
                }
                return;
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) ((xt0) this.d).d;
                int i6 = sideSheetBehavior.f;
                if (i6 != 2 || i6 == 0) {
                    return;
                }
                sideSheetBehavior.f = 0;
                return;
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                ((TextInputLayout) this.d).f.requestLayout();
                return;
            default:
                WebViewActivity webViewActivity = ((eg1) this.d).a;
                WebView webView = webViewActivity.D;
                if (webView == null || (url = webView.getUrl()) == null) {
                    return;
                }
                PrintManager printManager = (PrintManager) webViewActivity.getSystemService("print");
                if (printManager == null) {
                    webViewActivity.E.u(webViewActivity, JniAdExt.n1("ad.menu.unsupported"));
                    return;
                }
                String strGuessFileName = URLUtil.guessFileName(url, null, null);
                int iLastIndexOf = strGuessFileName.lastIndexOf(46);
                if (iLastIndexOf != -1) {
                    strGuessFileName = strGuessFileName.substring(0, iLastIndexOf);
                }
                printManager.print(strGuessFileName, webView.createPrintDocumentAdapter(strGuessFileName), null);
                return;
        }
    }
}
