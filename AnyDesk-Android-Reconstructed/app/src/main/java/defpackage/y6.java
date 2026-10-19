package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.app.admin.DevicePolicyManager;
import android.content.ClipDescription;
import android.content.Context;
import android.content.RestrictionsManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.MenuItem;
import androidx.core.graphics.drawable.IconCompat;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterItemDetailsFragment;
import com.anydesk.anydeskandroid.gui.fragment.TcpTunnelFragment;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import com.google.android.material.navigation.NavigationView;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.Signature;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class y6 implements wu0, o90 {
    public static volatile y6 h;
    public static y6 j;
    public final /* synthetic */ int c;
    public Object d;
    public Object e;
    public Object f;
    public static final Logging g = new Logging("SpeechRecognitionLauncher");
    public static final Object i = new Object();

    /* JADX WARN: Code duplicated, block: B:25:0x00d5  */
    public y6(dq0 dq0Var) {
        String str;
        String str2;
        Bundle[] bundleArr;
        int i2;
        ArrayList arrayList;
        int i3;
        int i4;
        Bitmap bitmapA;
        this.c = 23;
        new ArrayList();
        this.f = new Bundle();
        this.e = dq0Var;
        Context context = dq0Var.a;
        ArrayList arrayList2 = dq0Var.x;
        ArrayList arrayList3 = dq0Var.c;
        String str3 = dq0Var.t;
        ArrayList arrayList4 = dq0Var.d;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            this.d = hb.a(context, str3);
        } else {
            this.d = new Notification.Builder(context);
        }
        Notification notification = dq0Var.w;
        Resources resources = null;
        ((Notification.Builder) this.d).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dq0Var.e).setContentText(dq0Var.f).setContentInfo(null).setContentIntent(dq0Var.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(dq0Var.m, dq0Var.n, false);
        Notification.Builder builder = (Notification.Builder) this.d;
        IconCompat iconCompat = dq0Var.h;
        if (i5 < 23) {
            if (iconCompat != null) {
                int i6 = iconCompat.a;
                if (i6 == -1 && i5 >= 23) {
                    Object obj = iconCompat.b;
                    if (obj instanceof Bitmap) {
                        bitmapA = (Bitmap) obj;
                    } else {
                        bitmapA = null;
                    }
                } else if (i6 == 1) {
                    bitmapA = (Bitmap) iconCompat.b;
                } else {
                    if (i6 != 5) {
                        id.l(iconCompat, "called getBitmap() on ");
                        throw null;
                    }
                    bitmapA = IconCompat.a((Bitmap) iconCompat.b, true);
                }
            } else {
                bitmapA = null;
            }
            builder.setLargeIcon(bitmapA);
        } else {
            nd0.I(builder, iconCompat == null ? null : iconCompat.f(context));
        }
        ((Notification.Builder) this.d).setSubText(null).setUsesChronometer(false).setPriority(dq0Var.i);
        ArrayList arrayList5 = dq0Var.b;
        int size = arrayList5.size();
        int i7 = 0;
        while (true) {
            str = "android.support.allowGeneratedReplies";
            str2 = "";
            if (i7 >= size) {
                break;
            }
            Object obj2 = arrayList5.get(i7);
            int i8 = i7 + 1;
            bq0 bq0Var = (bq0) obj2;
            if (bq0Var.b == null && (i4 = bq0Var.f) != 0) {
                bq0Var.b = IconCompat.c(resources, "", i4);
            }
            IconCompat iconCompat2 = bq0Var.b;
            boolean z = bq0Var.d;
            Bundle bundle = bq0Var.a;
            ArrayList arrayList6 = arrayList5;
            PendingIntent pendingIntent = bq0Var.h;
            ArrayList arrayList7 = arrayList3;
            CharSequence charSequence = bq0Var.g;
            String str4 = str3;
            int i9 = size;
            Notification.Action.Builder builderD = Build.VERSION.SDK_INT >= 23 ? nd0.d(iconCompat2 != null ? iconCompat2.f(null) : null, charSequence, pendingIntent) : new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.d() : 0, charSequence, pendingIntent);
            tx0[] tx0VarArr = bq0Var.c;
            if (tx0VarArr != null) {
                int length = tx0VarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                int i10 = 0;
                while (i10 < tx0VarArr.length) {
                    tx0 tx0Var = tx0VarArr[i10];
                    tx0[] tx0VarArr2 = tx0VarArr;
                    tx0Var.getClass();
                    int i11 = i10;
                    RemoteInput.Builder builderAddExtras = new RemoteInput.Builder("anydesk_chat_direct_reply").setLabel(tx0Var.a).setChoices(null).setAllowFreeFormInput(true).addExtras(tx0Var.b);
                    int i12 = i8;
                    if (Build.VERSION.SDK_INT >= 26) {
                        Iterator it = tx0Var.c.iterator();
                        while (it.hasNext()) {
                            hb.f(builderAddExtras, (String) it.next());
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        ld.o(builderAddExtras);
                    }
                    remoteInputArr[i11] = builderAddExtras.build();
                    i10 = i11 + 1;
                    tx0VarArr = tx0VarArr2;
                    i8 = i12;
                }
                i3 = i8;
                for (int i13 = 0; i13 < length; i13++) {
                    builderD.addRemoteInput(remoteInputArr[i13]);
                }
            } else {
                i3 = i8;
            }
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 24) {
                jf.l(builderD, z);
            }
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i14 >= 28) {
                d6.D(builderD);
            }
            if (i14 >= 29) {
                ld.n(builderD);
            }
            if (i14 >= 31) {
                eq0.b(builderD);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", bq0Var.e);
            builderD.addExtras(bundle2);
            ((Notification.Builder) this.d).addAction(builderD.build());
            arrayList5 = arrayList6;
            arrayList3 = arrayList7;
            str3 = str4;
            size = i9;
            i7 = i3;
            resources = null;
        }
        ArrayList arrayList8 = arrayList3;
        String str5 = str3;
        Bundle bundle3 = dq0Var.p;
        if (bundle3 != null) {
            ((Bundle) this.f).putAll(bundle3);
        }
        ((Notification.Builder) this.d).setShowWhen(dq0Var.j);
        ((Notification.Builder) this.d).setLocalOnly(false);
        ((Notification.Builder) this.d).setGroup(dq0Var.o);
        ((Notification.Builder) this.d).setSortKey(null);
        ((Notification.Builder) this.d).setGroupSummary(false);
        ((Notification.Builder) this.d).setCategory(null);
        ((Notification.Builder) this.d).setColor(dq0Var.q);
        ((Notification.Builder) this.d).setVisibility(dq0Var.r);
        ((Notification.Builder) this.d).setPublicVersion(dq0Var.s);
        ((Notification.Builder) this.d).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList8 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList8.size());
                Iterator it2 = arrayList8.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    id.c();
                    throw null;
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    zd zdVar = new zd(arrayList2.size() + arrayList.size());
                    zdVar.addAll(arrayList);
                    zdVar.addAll(arrayList2);
                    arrayList2 = new ArrayList(zdVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj3 = arrayList2.get(i15);
                i15++;
                ((Notification.Builder) this.d).addPerson((String) obj3);
            }
        }
        if (arrayList4.size() > 0) {
            if (dq0Var.p == null) {
                dq0Var.p = new Bundle();
            }
            Bundle bundle4 = dq0Var.p.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i16 = 0;
            while (i16 < arrayList4.size()) {
                String string = Integer.toString(i16);
                bq0 bq0Var2 = (bq0) arrayList4.get(i16);
                Bundle bundle7 = new Bundle();
                if (bq0Var2.b == null && (i2 = bq0Var2.f) != 0) {
                    bq0Var2.b = IconCompat.c(null, str2, i2);
                }
                IconCompat iconCompat3 = bq0Var2.b;
                Bundle bundle8 = bq0Var2.a;
                ArrayList arrayList9 = arrayList4;
                bundle7.putInt("icon", iconCompat3 != null ? iconCompat3.d() : 0);
                bundle7.putCharSequence("title", bq0Var2.g);
                bundle7.putParcelable("actionIntent", bq0Var2.h);
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean(str, bq0Var2.d);
                bundle7.putBundle("extras", bundle9);
                tx0[] tx0VarArr3 = bq0Var2.c;
                if (tx0VarArr3 == null) {
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[tx0VarArr3.length];
                    int i17 = 0;
                    while (i17 < tx0VarArr3.length) {
                        tx0 tx0Var2 = tx0VarArr3[i17];
                        tx0[] tx0VarArr4 = tx0VarArr3;
                        Bundle bundle10 = new Bundle();
                        tx0Var2.getClass();
                        int i18 = i17;
                        bundle10.putString("resultKey", "anydesk_chat_direct_reply");
                        String str6 = str;
                        bundle10.putCharSequence("label", tx0Var2.a);
                        bundle10.putCharSequenceArray("choices", null);
                        bundle10.putBoolean("allowFreeFormInput", true);
                        bundle10.putBundle("extras", tx0Var2.b);
                        HashSet hashSet = tx0Var2.c;
                        if (!hashSet.isEmpty()) {
                            ArrayList<String> arrayList10 = new ArrayList<>(hashSet.size());
                            Iterator it3 = hashSet.iterator();
                            while (it3.hasNext()) {
                                arrayList10.add((String) it3.next());
                            }
                            bundle10.putStringArrayList("allowedDataTypes", arrayList10);
                        }
                        bundleArr[i18] = bundle10;
                        i17 = i18 + 1;
                        tx0VarArr3 = tx0VarArr4;
                        str = str6;
                    }
                }
                String str7 = str;
                bundle7.putParcelableArray("remoteInputs", bundleArr);
                bundle7.putBoolean("showsUserInterface", bq0Var2.e);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(string, bundle7);
                i16++;
                arrayList4 = arrayList9;
                str2 = str2;
                str = str7;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (dq0Var.p == null) {
                dq0Var.p = new Bundle();
            }
            dq0Var.p.putBundle("android.car.EXTENSIONS", bundle4);
            ((Bundle) this.f).putBundle("android.car.EXTENSIONS", bundle5);
        }
        int i19 = Build.VERSION.SDK_INT;
        if (i19 >= 24) {
            ((Notification.Builder) this.d).setExtras(dq0Var.p);
            jf.m((Notification.Builder) this.d, dq0Var.l);
        }
        if (i19 >= 26) {
            hb.h((Notification.Builder) this.d);
            hb.n((Notification.Builder) this.d);
            hb.o((Notification.Builder) this.d);
            hb.p((Notification.Builder) this.d, dq0Var.u);
            hb.j((Notification.Builder) this.d);
            if (!TextUtils.isEmpty(str5)) {
                ((Notification.Builder) this.d).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i19 >= 28) {
            Iterator it4 = arrayList8.iterator();
            if (it4.hasNext()) {
                it4.next().getClass();
                id.c();
                throw null;
            }
        }
        if (i19 >= 29) {
            ld.l((Notification.Builder) this.d, dq0Var.v);
            ld.m((Notification.Builder) this.d);
        }
        if (i19 >= 36) {
            u3.f((Notification.Builder) this.d);
        }
    }

    public static y6 C(Context context, AttributeSet attributeSet, int[] iArr, int i2) {
        return new y6(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    public static final jn f(y6 y6Var, jn jnVar, wg0 wg0Var, wg0 wg0Var2) {
        vg0 vg0Var;
        vg0 vg0Var2;
        vg0 vg0Var3;
        y6Var.getClass();
        vg0 vg0Var4 = ug0.c;
        if (jnVar == null || (vg0Var = jnVar.a) == null) {
            vg0Var = vg0Var4;
        }
        vg0 vg0Var5 = wg0Var.a;
        vg0 vg0VarK = k(vg0Var, vg0Var5, vg0Var5, wg0Var2 != null ? wg0Var2.a : null);
        if (jnVar == null || (vg0Var2 = jnVar.b) == null) {
            vg0Var2 = vg0Var4;
        }
        vg0 vg0VarK2 = k(vg0Var2, vg0Var5, wg0Var.b, wg0Var2 != null ? wg0Var2.b : null);
        if (jnVar != null && (vg0Var3 = jnVar.c) != null) {
            vg0Var4 = vg0Var3;
        }
        return new jn(vg0VarK, vg0VarK2, k(vg0Var4, vg0Var5, wg0Var.c, wg0Var2 != null ? wg0Var2.c : null), wg0Var, wg0Var2);
    }

    public static boolean j(Context context, String str) {
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
        return str.equals("com.android.vending") || devicePolicyManager.isDeviceOwnerApp(str) || devicePolicyManager.isProfileOwnerApp(str);
    }

    public static vg0 k(vg0 vg0Var, vg0 vg0Var2, vg0 vg0Var3, vg0 vg0Var4) {
        if (vg0Var4 == null) {
            return vg0Var3;
        }
        if (vg0Var instanceof tg0) {
            return (((vg0Var2 instanceof ug0) && (vg0Var4 instanceof ug0)) || (vg0Var4 instanceof sg0)) ? vg0Var4 : vg0Var;
        }
        return vg0Var4;
    }

    public static boolean l(Editable editable, KeyEvent keyEvent, boolean z) {
        nc1[] nc1VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (nc1VarArr = (nc1[]) editable.getSpans(selectionStart, selectionEnd, nc1.class)) != null && nc1VarArr.length > 0) {
                for (nc1 nc1Var : nc1VarArr) {
                    int spanStart = editable.getSpanStart(nc1Var);
                    int spanEnd = editable.getSpanEnd(nc1Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static y6 w(Context context) {
        if (h == null) {
            synchronized (i) {
                try {
                    if (h == null) {
                        h = new y6(context, 1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    public boolean A(int i2, sp spVar, bq bqVar) {
        hg hgVar = (hg) this.e;
        int[] iArr = bqVar.p0;
        int[] iArr2 = bqVar.t;
        hgVar.a = iArr[0];
        hgVar.b = iArr[1];
        hgVar.c = bqVar.q();
        hgVar.d = bqVar.k();
        hgVar.i = false;
        hgVar.j = i2;
        boolean z = hgVar.a == 3;
        boolean z2 = hgVar.b == 3;
        boolean z3 = z && bqVar.W > 0.0f;
        boolean z4 = z2 && bqVar.W > 0.0f;
        if (z3 && iArr2[0] == 4) {
            hgVar.a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            hgVar.b = 1;
        }
        spVar.b(bqVar, hgVar);
        bqVar.O(hgVar.e);
        bqVar.L(hgVar.f);
        bqVar.E = hgVar.h;
        bqVar.I(hgVar.g);
        hgVar.j = 0;
        return hgVar.i;
    }

    public y6 B() {
        CharSequence charSequence = (CharSequence) this.e;
        Matcher matcher = (Matcher) this.d;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        if (matcher2.find(iEnd)) {
            return new y6(matcher2, charSequence);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object D(pd0 pd0Var, sq sqVar) {
        l51 l51Var;
        xm0 xm0Var;
        y6 y6Var;
        if (sqVar instanceof l51) {
            l51Var = (l51) sqVar;
            int i2 = l51Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l51Var.k = i2 - Integer.MIN_VALUE;
            } else {
                l51Var = new l51(this, sqVar);
            }
        } else {
            l51Var = new l51(this, sqVar);
        }
        Object obj = l51Var.i;
        int i3 = l51Var.k;
        if (i3 == 0) {
            y90.V(obj);
            xm0Var = (xm0) this.e;
            l51Var.f = this;
            l51Var.g = pd0Var;
            l51Var.h = xm0Var;
            l51Var.k = 1;
            Object objD = xm0Var.d(l51Var);
            lr lrVar = lr.c;
            if (objD == lrVar) {
                return lrVar;
            }
            y6Var = this;
        } else {
            if (i3 != 1) {
                nh0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xm0 xm0Var2 = l51Var.h;
            pd0 pd0Var2 = l51Var.g;
            y6Var = l51Var.f;
            y90.V(obj);
            xm0Var = xm0Var2;
            pd0Var = pd0Var2;
        }
        try {
            if (pd0Var == ((pd0) y6Var.f)) {
                y6Var.f = null;
            }
            return uc1.a;
        } finally {
            xm0Var.f(null);
        }
    }

    public Object E(CharSequence charSequence, int i2, int i3, int i4, boolean z, ax axVar) {
        char c;
        cx cxVar = new cx((rl0) ((ah) this.e).c);
        int i5 = i2;
        int iCodePointAt = Character.codePointAt(charSequence, i2);
        int i6 = 0;
        boolean zW = true;
        int iCharCount = i5;
        while (iCharCount < i3 && i6 < i4 && zW) {
            SparseArray sparseArray = cxVar.c.a;
            rl0 rl0Var = sparseArray == null ? null : (rl0) sparseArray.get(iCodePointAt);
            if (cxVar.a == 2) {
                if (rl0Var != null) {
                    cxVar.c = rl0Var;
                    cxVar.f++;
                } else {
                    if (iCodePointAt == 65038) {
                        cxVar.a();
                    } else if (iCodePointAt != 65039) {
                        rl0 rl0Var2 = cxVar.c;
                        if (rl0Var2.b != null) {
                            if (cxVar.f != 1) {
                                cxVar.d = rl0Var2;
                                cxVar.a();
                            } else if (cxVar.b()) {
                                cxVar.d = cxVar.c;
                                cxVar.a();
                            } else {
                                cxVar.a();
                            }
                            c = 3;
                        } else {
                            cxVar.a();
                        }
                    }
                    c = 1;
                }
                c = 2;
            } else if (rl0Var == null) {
                cxVar.a();
                c = 1;
            } else {
                cxVar.a = 2;
                cxVar.c = rl0Var;
                cxVar.f = 1;
                c = 2;
            }
            cxVar.e = iCodePointAt;
            if (c == 1) {
                iCharCount = Character.charCount(Character.codePointAt(charSequence, i5)) + i5;
                if (iCharCount < i3) {
                    iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                }
            } else if (c == 2) {
                int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                if (iCharCount2 < i3) {
                    iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                }
                iCharCount = iCharCount2;
            } else if (c == 3) {
                if (z || !z(charSequence, i5, iCharCount, cxVar.d.b)) {
                    zW = axVar.w(charSequence, i5, iCharCount, cxVar.d.b);
                    i6++;
                }
            }
            i5 = iCharCount;
        }
        if (cxVar.a == 2 && cxVar.c.b != null && ((cxVar.f > 1 || cxVar.b()) && i6 < i4 && zW && (z || !z(charSequence, i5, iCharCount, cxVar.c.b)))) {
            axVar.w(charSequence, i5, iCharCount, cxVar.c.b);
        }
        return axVar.a();
    }

    public void F() {
        ((TypedArray) this.e).recycle();
    }

    public synchronized void G() {
        ((HashMap) this.e).clear();
        p();
        o();
    }

    public void H(jl0 jl0Var) {
        ((CopyOnWriteArrayList) this.e).remove(jl0Var);
        tk0 tk0Var = (tk0) ((HashMap) this.f).remove(jl0Var);
        if (tk0Var != null) {
            tk0Var.a.f(tk0Var.b);
            tk0Var.b = null;
        }
        ((Runnable) this.d).run();
    }

    public void I() {
        long jD2 = JniAdExt.D2();
        if (jD2 <= 0) {
            return;
        }
        HashSet hashSet = new HashSet();
        String string = Long.toString(jD2);
        qf qfVar = new qf(1, string);
        if (string != null && string.length() > 1000) {
            nh0.j("Data length can be at most 1000");
            return;
        }
        hashSet.add(qfVar);
        ((Logging) this.d).e("reporting cid=" + jD2);
        y6 y6Var = (y6) this.e;
        ((ThreadPoolExecutor) y6Var.f).execute(new wh(y6Var, hashSet, (af1) this.f, 3));
    }

    public void J(wg0 wg0Var) {
        wg0Var.getClass();
        this.d = wg0Var.a;
        this.f = wg0Var.c;
        this.e = wg0Var.b;
    }

    public void K(wg0 wg0Var, wg0 wg0Var2) {
        Object value;
        jn jnVarF;
        wg0Var.getClass();
        e71 e71Var = (e71) this.e;
        do {
            value = e71Var.getValue();
            jn jnVar = (jn) value;
            jnVarF = f(this, jnVar, wg0Var, wg0Var2);
            if (y90.e(jnVar, jnVarF)) {
                return;
            }
        } while (!e71Var.g(value, jnVarF));
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ((z50) it.next()).h(jnVarF);
        }
    }

    public void L(xg0 xg0Var, vg0 vg0Var) {
        xg0Var.getClass();
        int iOrdinal = xg0Var.ordinal();
        if (iOrdinal == 0) {
            this.d = vg0Var;
        } else if (iOrdinal == 1) {
            this.e = vg0Var;
        } else {
            if (iOrdinal != 2) {
                throw new pn();
            }
            this.f = vg0Var;
        }
    }

    public wg0 M() {
        return new wg0((vg0) this.d, (vg0) this.e, (vg0) this.f);
    }

    public void N(cq cqVar, int i2, int i3, int i4) {
        cqVar.getClass();
        int i5 = cqVar.b0;
        int i6 = cqVar.c0;
        cqVar.b0 = 0;
        cqVar.c0 = 0;
        cqVar.O(i3);
        cqVar.L(i4);
        if (i5 < 0) {
            cqVar.b0 = 0;
        } else {
            cqVar.b0 = i5;
        }
        if (i6 < 0) {
            cqVar.c0 = 0;
        } else {
            cqVar.c0 = i6;
        }
        cq cqVar2 = (cq) this.f;
        cqVar2.t0 = i2;
        cqVar2.U();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [pd0] */
    /* JADX WARN: Type inference failed for: r10v1, types: [xm0] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [xm0] */
    /* JADX WARN: Type inference failed for: r10v4, types: [xm0] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [pd0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public Object O(pd0 pd0Var, sq sqVar) {
        m51 m51Var;
        y6 y6Var;
        ?? r1;
        y6 y6Var2;
        if (sqVar instanceof m51) {
            m51Var = (m51) sqVar;
            int i2 = m51Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m51Var.k = i2 - Integer.MIN_VALUE;
            } else {
                m51Var = new m51(this, sqVar);
            }
        } else {
            m51Var = new m51(this, sqVar);
        }
        Object obj = m51Var.i;
        int i3 = m51Var.k;
        lr lrVar = lr.c;
        try {
            if (i3 == 0) {
                y90.V(obj);
                xm0 xm0Var = (xm0) this.e;
                m51Var.f = this;
                m51Var.g = pd0Var;
                m51Var.h = xm0Var;
                m51Var.k = 1;
                if (xm0Var.d(m51Var) != lrVar) {
                    y6Var = this;
                    r1 = pd0Var;
                    pd0Var = xm0Var;
                }
                return lrVar;
            }
            if (i3 == 1) {
                xm0 xm0Var2 = m51Var.h;
                pd0 pd0Var2 = m51Var.g;
                y6Var = m51Var.f;
                y90.V(obj);
                r1 = pd0Var2;
                pd0Var = xm0Var2;
            } else {
                if (i3 != 2) {
                    nh0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xm0 xm0Var3 = m51Var.h;
                pd0 pd0Var3 = m51Var.g;
                y6Var2 = m51Var.f;
                y90.V(obj);
                r1 = pd0Var3;
                pd0Var = xm0Var3;
            }
            y6Var = y6Var2;
            y6Var.f = r1;
            pd0Var.f(null);
            return true;
            pd0 pd0Var4 = (pd0) y6Var.f;
            if (pd0Var4 != null) {
                pd0Var4.a();
            }
            if (pd0Var4 != null) {
                pd0Var4.b(new k51((xt0) y6Var.d));
            }
            if (pd0Var4 != null) {
                m51Var.f = y6Var;
                m51Var.g = r1;
                m51Var.h = pd0Var;
                m51Var.k = 2;
                if (pd0Var4.s(m51Var) != lrVar) {
                    y6Var2 = y6Var;
                    r1 = r1;
                    pd0Var = pd0Var;
                    y6Var = y6Var2;
                }
                return lrVar;
            }
            y6Var.f = r1;
            pd0Var.f(null);
            return true;
        } catch (Throwable th) {
            pd0Var.f(null);
            throw th;
        }
    }

    public void P(cq cqVar) {
        ArrayList arrayList = (ArrayList) this.d;
        arrayList.clear();
        int size = cqVar.q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            bq bqVar = (bq) cqVar.q0.get(i2);
            int[] iArr = bqVar.p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(bqVar);
            }
        }
        cqVar.s0.b = true;
    }

    @Override // defpackage.o90
    public ClipDescription a() {
        return (ClipDescription) this.e;
    }

    @Override // defpackage.o90
    public Object b() {
        return null;
    }

    @Override // defpackage.o90
    public Uri c() {
        return (Uri) this.d;
    }

    @Override // defpackage.o90
    public Uri e() {
        return (Uri) this.f;
    }

    public void g() {
        AdEditText adEditText = (AdEditText) ((Supplier) this.d).get();
        if (adEditText == null) {
            g.a("No view available to bind speech recognition launcher to");
        } else {
            adEditText.setOnSpeakListener(new c0(this, 3, adEditText));
        }
    }

    public int h(int i2) {
        BiometricPrompt.CryptoObject cryptoObjectI;
        yg ygVar = (yg) this.d;
        int i3 = Build.VERSION.SDK_INT;
        int iA = 1;
        if (i3 >= 30) {
            BiometricManager biometricManager = (BiometricManager) this.e;
            if (biometricManager != null) {
                return xg.a(biometricManager, i2);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        if (!y90.I(i2)) {
            return -2;
        }
        if (i2 != 0) {
            Context context = ygVar.a;
            if (th1.s(context) != null) {
                int i4 = 0;
                if (y90.G(i2)) {
                    return th1.A(context) ? 0 : 11;
                }
                if (i3 != 29) {
                    if (i3 != 28) {
                        return i();
                    }
                    if (i3 < 23 || context == null || context.getPackageManager() == null || !pr0.a(context.getPackageManager())) {
                        return 12;
                    }
                    if (th1.A(ygVar.a)) {
                        return i() == 0 ? 0 : -1;
                    }
                    return i();
                }
                if ((i2 & 255) == 255) {
                    BiometricManager biometricManager2 = (BiometricManager) this.e;
                    if (biometricManager2 != null) {
                        return wg.a(biometricManager2);
                    }
                    Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                    return 1;
                }
                Method methodC = wg.c();
                if (methodC != null && (cryptoObjectI = ds.I(ds.g())) != null) {
                    try {
                        Object objInvoke = methodC.invoke((BiometricManager) this.e, cryptoObjectI);
                        if (objInvoke instanceof Integer) {
                            return ((Integer) objInvoke).intValue();
                        }
                        Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
                    } catch (IllegalAccessException e) {
                        e = e;
                        Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                        Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                    } catch (InvocationTargetException e3) {
                        e = e3;
                        Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                    }
                }
                BiometricManager biometricManager3 = (BiometricManager) this.e;
                if (biometricManager3 == null) {
                    Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                } else {
                    iA = wg.a(biometricManager3);
                }
                String str = Build.MODEL;
                if (Build.VERSION.SDK_INT < 30 && str != null) {
                    for (String str2 : context.getResources().getStringArray(R.array.assume_strong_biometrics_models)) {
                        if (str.equals(str2)) {
                            return iA;
                        }
                    }
                }
                if (iA != 0) {
                    return iA;
                }
                if (!th1.A(ygVar.a)) {
                    i4 = i();
                } else if (i() != 0) {
                    i4 = -1;
                }
                return i4;
            }
        }
        return 12;
    }

    public int i() {
        FingerprintManager fingerprintManagerB;
        FingerprintManager fingerprintManagerB2;
        yg ygVar = (yg) this.f;
        if (ygVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = ygVar.a;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23 || (fingerprintManagerB = h10.b(context)) == null || !h10.d(fingerprintManagerB)) {
            return 12;
        }
        return (i2 < 23 || (fingerprintManagerB2 = h10.b(context)) == null || !h10.c(fingerprintManagerB2)) ? 11 : 0;
    }

    public void m(Bundle bundle) {
        HashSet hashSet = (HashSet) this.e;
        String string = ((Context) this.f).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (h90.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    n((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new pn(e);
            }
        }
    }

    public Object n(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = (HashMap) this.d;
        if (ec1.v()) {
            try {
                ec1.h(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                h90 h90Var = (h90) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = h90Var.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            n(cls2, hashSet);
                        }
                    }
                }
                objB = h90Var.b((Context) this.f);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new pn(th2);
            }
        }
        Trace.endSection();
        return objB;
    }

    public synchronized void o() {
        BufferedReader bufferedReader;
        Throwable th;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/net/arp"));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    String[] strArrSplit = line.split(" +");
                    if (strArrSplit.length >= 4) {
                        String str = strArrSplit[0];
                        String str2 = strArrSplit[3];
                        if (str.matches("([0-9]{1,3}\\.){3}[0-9]{1,3}") && str2.matches("..:..:..:..:..:..") && !str2.equals("00:00:00:00:00:00") && !((HashMap) this.e).containsKey(str)) {
                            ((HashMap) this.e).put(str, str2);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        ((Logging) this.d).e("failed to cache net id info (proc): " + th.getMessage());
                    } catch (Throwable th3) {
                        ds.e(bufferedReader);
                        throw th3;
                    }
                }
            }
        } catch (Throwable th4) {
            bufferedReader = null;
            th = th4;
        }
        ds.e(bufferedReader);
    }

    @Override // defpackage.wu0
    public boolean onMenuItemClick(MenuItem menuItem) {
        AbookRosterItemDetailsFragment abookRosterItemDetailsFragment = (AbookRosterItemDetailsFragment) this.f;
        RosterItem rosterItem = (RosterItem) this.d;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_abook_roster_item_details_install_shortcut) {
            int i2 = rosterItem.mColor1;
            int i3 = rosterItem.mColor2;
            String prettyAddr = rosterItem.getPrettyAddr();
            String str = rosterItem.mThumbnailPath;
            String str2 = (String) this.e;
            m80 m80Var = abookRosterItemDetailsFragment.Z;
            if (m80Var != null) {
                MainActivity mainActivity = (MainActivity) m80Var;
                mainActivity.F.e(mainActivity, i2, i3, prettyAddr, str, str2);
                return true;
            }
        } else {
            if (itemId == R.id.menu_abook_roster_item_details_connect) {
                AbookRosterItemDetailsFragment.O0(abookRosterItemDetailsFragment, rosterItem.getAddr());
                return true;
            }
            if (itemId == R.id.menu_abook_roster_item_details_browse_files) {
                String addr = rosterItem.getAddr();
                if (JniAdExt.s2(12) == 0) {
                    abookRosterItemDetailsFragment.s0.u(abookRosterItemDetailsFragment.a0(), JniAdExt.r2(5));
                    return true;
                }
                m80 m80Var2 = abookRosterItemDetailsFragment.Z;
                if (m80Var2 != null) {
                    ((MainActivity) m80Var2).i0(addr);
                    return true;
                }
            } else if (itemId == R.id.menu_abook_roster_item_details_vpn) {
                String addr2 = rosterItem.getAddr();
                m80 m80Var3 = abookRosterItemDetailsFragment.Z;
                if (m80Var3 != null) {
                    ((MainActivity) m80Var3).l0(addr2);
                    return true;
                }
            } else {
                if (itemId != R.id.menu_abook_roster_item_details_tcp_tunneling) {
                    if (itemId != R.id.menu_abook_roster_item_details_chat_history) {
                        return false;
                    }
                    JniAdExt.I0.post(new ra0(rosterItem.mCid));
                    return true;
                }
                m80 m80Var4 = abookRosterItemDetailsFragment.Z;
                if (m80Var4 != null) {
                    TcpTunnelFragment.T0((MainActivity) m80Var4, false, rosterItem.mCid, rosterItem.mAlias, rosterItem.getPrettyAddr());
                }
            }
        }
        return true;
    }

    public synchronized void p() {
        InputStreamReader inputStreamReader;
        Throwable th;
        BufferedReader bufferedReader;
        try {
            Process processExec = Runtime.getRuntime().exec("ip neigh show");
            processExec.waitFor();
            processExec.exitValue();
            inputStreamReader = new InputStreamReader(processExec.getInputStream());
            try {
                bufferedReader = new BufferedReader(inputStreamReader);
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        String[] strArrSplit = line.split(" ");
                        if (strArrSplit.length >= 4) {
                            String str = strArrSplit[0];
                            String str2 = strArrSplit[4];
                            if (str.matches("([0-9]{1,3}\\.){3}[0-9]{1,3}") && str2.matches("..:..:..:..:..:..") && !str2.equals("00:00:00:00:00:00")) {
                                ((HashMap) this.e).put(str, str2);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            ((Logging) this.d).e("failed to cache net id info (neigh): " + th.getMessage());
                            if (bufferedReader != null) {
                                break;
                            } else if (inputStreamReader != null) {
                                ds.e(inputStreamReader);
                            }
                        } catch (Throwable th3) {
                            if (bufferedReader != null) {
                                ds.e(bufferedReader);
                            } else if (inputStreamReader != null) {
                                ds.e(inputStreamReader);
                            }
                            throw th3;
                        }
                    }
                }
            } catch (Throwable th4) {
                bufferedReader = null;
                th = th4;
            }
        } catch (Throwable th5) {
            inputStreamReader = null;
            th = th5;
            bufferedReader = null;
        }
        ds.e(bufferedReader);
    }

    public vg0 q(xg0 xg0Var) {
        xg0Var.getClass();
        int iOrdinal = xg0Var.ordinal();
        if (iOrdinal == 0) {
            return (vg0) this.d;
        }
        if (iOrdinal == 1) {
            return (vg0) this.e;
        }
        if (iOrdinal == 2) {
            return (vg0) this.f;
        }
        throw new pn();
    }

    public void r(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        Logging logging = (Logging) this.d;
        Bundle applicationRestrictions = ((RestrictionsManager) ((Context) this.e).getSystemService("restrictions")).getApplicationRestrictions();
        for (String str : applicationRestrictions.keySet()) {
            String string = applicationRestrictions.getString(str);
            if (string == null) {
                boolean z = applicationRestrictions.getBoolean(str, false);
                if (z == applicationRestrictions.getBoolean(str, true)) {
                    string = Boolean.toString(z);
                } else {
                    int i2 = applicationRestrictions.getInt(str, 0);
                    if (i2 == applicationRestrictions.getInt(str, 1)) {
                        string = Integer.toString(i2);
                    } else {
                        logging.h("restriction with " + str + " has unimplemented class");
                        string = null;
                    }
                }
            }
            if (string != null) {
                if (str.startsWith("ac.defaults.")) {
                    arrayList.add(str.substring(12));
                    arrayList2.add(string);
                } else if (str.startsWith("ac.overrides.")) {
                    arrayList3.add(str.substring(13));
                    arrayList4.add(string);
                } else {
                    logging.a("invalid restriction: '" + str + "'");
                }
            }
        }
    }

    public ColorStateList s(int i2) {
        int resourceId;
        ColorStateList colorStateListM;
        TypedArray typedArray = (TypedArray) this.e;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListM = uj.m((Context) this.d, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateListM;
    }

    public Drawable t(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.e;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getDrawable(i2) : ec1.r((Context) this.d, resourceId);
    }

    public String toString() {
        switch (this.c) {
            case 21:
                String str = (String) this.f;
                String str2 = (String) this.e;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.d;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public Drawable u(int i2) {
        int resourceId;
        Drawable drawableG;
        if (!((TypedArray) this.e).hasValue(i2) || (resourceId = ((TypedArray) this.e).getResourceId(i2, 0)) == 0) {
            return null;
        }
        tb tbVarA = tb.a();
        Context context = (Context) this.d;
        synchronized (tbVarA) {
            drawableG = tbVarA.a.g(context, resourceId, true);
        }
        return drawableG;
    }

    public Typeface v(int i2, int i3, rc rcVar) {
        int resourceId = ((TypedArray) this.e).getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f) == null) {
            this.f = new TypedValue();
        }
        Context context = (Context) this.d;
        TypedValue typedValue = (TypedValue) this.f;
        ThreadLocal threadLocal = my0.a;
        if (context.isRestricted()) {
            return null;
        }
        return my0.c(context, resourceId, typedValue, i3, rcVar, true, false);
    }

    public synchronized String x(String str) {
        return (String) ((HashMap) this.e).get(str);
    }

    public w90 y() {
        Matcher matcher = (Matcher) this.d;
        return th1.Y(matcher.start(), matcher.end());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    public boolean z(CharSequence charSequence, int i2, int i3, mc1 mc1Var) {
        boolean zP;
        if ((mc1Var.c & 3) == 0) {
            is isVar = (is) this.f;
            pl0 pl0VarB = mc1Var.b();
            int iA = pl0VarB.a(8);
            short s = iA != 0 ? ((ByteBuffer) pl0VarB.f).getShort(iA + pl0VarB.c) : (short) 0;
            isVar.getClass();
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 23 || s <= i4) {
                ThreadLocal threadLocal = is.b;
                if (threadLocal.get() == null) {
                    threadLocal.set(new StringBuilder());
                }
                StringBuilder sb = (StringBuilder) threadLocal.get();
                sb.setLength(0);
                while (i2 < i3) {
                    sb.append(charSequence.charAt(i2));
                    i2++;
                }
                TextPaint textPaint = isVar.a;
                String string = sb.toString();
                ThreadLocal threadLocal2 = qt0.a;
                if (Build.VERSION.SDK_INT >= 23) {
                    zP = nd0.p(textPaint, string);
                } else {
                    int length = string.length();
                    if (length == 1 && Character.isWhitespace(string.charAt(0))) {
                        zP = true;
                    } else {
                        float fMeasureText = textPaint.measureText("\udfffd");
                        float fMeasureText2 = textPaint.measureText("m");
                        float fMeasureText3 = textPaint.measureText(string);
                        float fMeasureText4 = 0.0f;
                        if (fMeasureText3 != 0.0f) {
                            if (string.codePointCount(0, string.length()) > 1) {
                                if (fMeasureText3 <= fMeasureText2 * 2.0f) {
                                    int i5 = 0;
                                    while (i5 < length) {
                                        int iCharCount = Character.charCount(string.codePointAt(i5)) + i5;
                                        fMeasureText4 += textPaint.measureText(string, i5, iCharCount);
                                        i5 = iCharCount;
                                    }
                                    if (fMeasureText3 >= fMeasureText4) {
                                    }
                                }
                                zP = false;
                            }
                            if (fMeasureText3 != fMeasureText) {
                                zP = true;
                            } else {
                                ThreadLocal threadLocal3 = qt0.a;
                                tt0 tt0Var = (tt0) threadLocal3.get();
                                if (tt0Var == null) {
                                    tt0Var = new tt0(new Rect(), new Rect());
                                    threadLocal3.set(tt0Var);
                                } else {
                                    ((Rect) tt0Var.a).setEmpty();
                                    ((Rect) tt0Var.b).setEmpty();
                                }
                                Object obj = tt0Var.b;
                                Rect rect = (Rect) tt0Var.a;
                                textPaint.getTextBounds("\udfffd", 0, 2, rect);
                                textPaint.getTextBounds(string, 0, length, (Rect) obj);
                                zP = !rect.equals(obj);
                            }
                        } else {
                            zP = false;
                        }
                    }
                }
            } else {
                zP = false;
            }
            int i6 = mc1Var.c & 4;
            mc1Var.c = zP ? i6 | 2 : i6 | 1;
        }
        return (mc1Var.c & 3) == 2;
    }

    @Override // defpackage.o90
    public void d() {
    }

    public y6(int[] iArr) {
        this.c = 27;
        this.d = new z81(iArr[0]);
        this.e = new ArrayList();
        this.f = new ArrayList();
        for (int i2 = 1; i2 != iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 < 0) {
                ((ArrayList) this.f).add(Integer.valueOf(~i3));
            } else {
                ((ArrayList) this.e).add(Integer.valueOf(i3));
            }
        }
    }

    public y6(Logging logging, IInterface iInterface) {
        Method method;
        this.c = 10;
        this.d = logging;
        this.e = iInterface;
        try {
            method = iInterface.getClass().getMethod("getDisplayInfo", Integer.TYPE);
        } catch (Throwable unused) {
            ((Logging) this.d).h("cannot get method getDisplayInfo");
            method = null;
        }
        this.f = method;
    }

    public y6(Logging logging) {
        Method declaredMethod;
        this.c = 25;
        this.d = logging;
        try {
            declaredMethod = Class.forName("android.os.ServiceManager").getDeclaredMethod("getService", String.class);
        } catch (Throwable unused) {
            ((Logging) this.d).h("cannot find method getService");
            declaredMethod = null;
        }
        this.e = declaredMethod;
    }

    public y6(int i2) {
        this.c = i2;
        switch (i2) {
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                this.d = new CopyOnWriteArrayList();
                e71 e71VarB = ec1.b(null);
                this.e = e71VarB;
                this.f = new cw0(e71VarB);
                break;
            case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                ug0 ug0Var = ug0.c;
                this.d = ug0Var;
                this.e = ug0Var;
                this.f = ug0Var;
                break;
        }
    }

    public y6(c40 c40Var, Supplier supplier) {
        this.c = 0;
        this.d = supplier;
        this.e = new tl0(c40Var, new x6(0, this));
        this.f = new xt0(c40Var);
    }

    public y6(NavigationView navigationView) {
        Object sj0Var;
        this.c = 15;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            sj0Var = new uj0();
        } else {
            sj0Var = i2 >= 33 ? new sj0() : null;
        }
        this.d = sj0Var;
        this.e = navigationView;
        this.f = navigationView;
    }

    public y6(Context context, TypedArray typedArray) {
        this.c = 28;
        this.d = context;
        this.e = typedArray;
    }

    public y6(Runnable runnable) {
        this.c = 16;
        this.e = new CopyOnWriteArrayList();
        this.f = new HashMap();
        this.d = runnable;
    }

    public y6(Context context, LocationManager locationManager) {
        this.c = 29;
        this.f = new ac1();
        this.d = context;
        this.e = locationManager;
    }

    public /* synthetic */ y6(Object obj, Object obj2, Object obj3, int i2) {
        this.c = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    public y6(Context context, int i2) {
        this.c = i2;
        switch (i2) {
            case 4:
                this.d = new Logging("AppFeedbackReporter");
                this.f = new af1(21, this);
                this.e = new y6(context, 9);
                break;
            case 9:
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                this.e = new HashMap();
                this.d = context.getApplicationContext();
                this.f = threadPoolExecutor;
                break;
            case 22:
                this.d = new Logging("NetTools");
                this.e = new HashMap();
                this.f = new ArrayList();
                G();
                if (context != null) {
                    ((ConnectivityManager) context.getSystemService("connectivity")).registerNetworkCallback(new NetworkRequest.Builder().build(), new np0(this));
                    break;
                }
                break;
            case 24:
                this.d = new Logging("RestrictionsHandler");
                this.e = context;
                break;
            default:
                this.f = context.getApplicationContext();
                this.e = new HashSet();
                this.d = new HashMap();
                break;
        }
    }

    public y6(cq cqVar) {
        this.c = 6;
        this.d = new ArrayList();
        this.e = new hg();
        this.f = cqVar;
    }

    public y6(xt0 xt0Var) {
        this.c = 26;
        this.d = xt0Var;
        this.e = new xm0();
    }

    public y6(fh fhVar) {
        this.c = 5;
        this.f = fhVar;
    }

    public y6(ah ahVar, fw fwVar, is isVar, Set set) {
        this.c = 11;
        this.d = fwVar;
        this.e = ahVar;
        this.f = isVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            E(str, 0, str.length(), 1, true, new bx(str, 0));
        }
    }

    public y6(Signature signature) {
        this.c = 12;
        this.d = signature;
        this.e = null;
        this.f = null;
    }

    public y6(Cipher cipher) {
        this.c = 12;
        this.e = cipher;
        this.d = null;
        this.f = null;
    }

    public y6(Mac mac) {
        this.c = 12;
        this.f = mac;
        this.e = null;
        this.d = null;
    }

    public y6(af1 af1Var) {
        this.c = 3;
        this.d = af1Var;
        this.e = Choreographer.getInstance();
        this.f = new v8(this);
    }

    public y6(AbookRosterItemDetailsFragment abookRosterItemDetailsFragment, RosterItem rosterItem, String str) {
        this.c = 2;
        this.f = abookRosterItemDetailsFragment;
        this.d = rosterItem;
        this.e = str;
    }

    public y6(yg ygVar) {
        this.c = 7;
        Context context = ygVar.a;
        this.d = ygVar;
        int i2 = Build.VERSION.SDK_INT;
        this.e = i2 >= 29 ? wg.b(context) : null;
        this.f = i2 <= 29 ? new yg(context, false) : null;
    }

    public y6(Matcher matcher, CharSequence charSequence) {
        this.c = 14;
        charSequence.getClass();
        this.d = matcher;
        this.e = charSequence;
        this.f = new oj0(this);
    }
}
