package defpackage;

import android.R;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class lk0 implements z70 {
    public static final rt0[] c = {new rt0('C', 2), new rt0('D', 3), new rt0('E', 4), new rt0('F', 7), new rt0('G', 8), new rt0('H', 10), new rt0('I', 13), new rt0('J', 15), new rt0('K', 18), new rt0('L', 20), new rt0('M', 22), new rt0('N', 23), new rt0('O', 25)};
    public static final he d = new he(2);
    public static final he e = new he(4);
    public static final int[] f = {R.attr.theme, com.anydesk.anydeskandroid.R.attr.theme};
    public static final int[] g = {com.anydesk.anydeskandroid.R.attr.materialThemeOverlay};
    public static final us0 h = new us0(7);
    public static final us0 i = new us0(8);
    public static final us0 j = new us0(9);

    public static boolean A(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static final boolean B(String str, Bundle bundle) {
        str.getClass();
        return bundle.containsKey(str) && bundle.get(str) == null;
    }

    public static void C(Context context, String str) {
        t70.Y(new d3(str, context, 16, false));
    }

    public static final Object F(Object obj) {
        return obj instanceof on ? y90.m(((on) obj).a) : obj;
    }

    public static int G(Context context, int i2, int i3) {
        TypedValue typedValueY = bu0.y(context, i2);
        return (typedValueY == null || typedValueY.type != 16) ? i3 : typedValueY.data;
    }

    public static TimeInterpolator H(Context context, int i2, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            id.q("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!A(strValueOf, "cubic-bezier") && !A(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (A(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return new PathInterpolator(u(strArrSplit, 0), u(strArrSplit, 1), u(strArrSplit, 2), u(strArrSplit, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!A(strValueOf, "path")) {
            id.q("Invalid motion easing type: ".concat(strValueOf));
            return null;
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        try {
            au0.b(uj.i(strSubstring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(strSubstring), e2);
        }
    }

    public static void I(bc bcVar, float f2) {
        gz0 gz0Var = (gz0) bcVar.d;
        CardView cardView = (CardView) bcVar.e;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f2 != gz0Var.e || gz0Var.f != useCompatPadding || gz0Var.g != preventCornerOverlap) {
            gz0Var.e = f2;
            gz0Var.f = useCompatPadding;
            gz0Var.g = preventCornerOverlap;
            gz0Var.b(null);
            gz0Var.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            bcVar.i0(0, 0, 0, 0);
            return;
        }
        gz0 gz0Var2 = (gz0) bcVar.d;
        float f3 = gz0Var2.e;
        float f4 = gz0Var2.a;
        int iCeil = (int) Math.ceil(hz0.a(f3, f4, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(hz0.b(f3, f4, cardView.getPreventCornerOverlap()));
        bcVar.i0(iCeil, iCeil2, iCeil, iCeil2);
    }

    public static final t10 J(d60 d60Var) {
        return y90.h(new ji(5, new ih(d60Var, (rq) null, 13)), -2);
    }

    public static int K(Context context, String str) {
        Resources.Theme theme = context.getTheme();
        if (theme == null) {
            return -1;
        }
        TypedValue typedValue = new TypedValue();
        int identifier = context.getResources().getIdentifier(str, "attr", context.getPackageName());
        if (identifier == 0) {
            return -1;
        }
        theme.resolveAttribute(identifier, typedValue, true);
        return typedValue.data;
    }

    public static final jj0 L(Bundle bundle) {
        jj0 jj0Var = new jj0(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            jj0Var.put(str, bundle.get(str));
        }
        jj0Var.b();
        jj0Var.o = true;
        if (jj0Var.k > 0) {
            return jj0Var;
        }
        jj0 jj0Var2 = jj0.p;
        jj0Var2.getClass();
        return jj0Var2;
    }

    public static final Object M(long j2, o1 o1Var, p1 p1Var) {
        long jM = bu0.M(j2);
        if (jM <= 0) {
            throw new ba1("Timed out immediately", null);
        }
        ca1 ca1Var = new ca1(jM, p1Var);
        y90.E(ca1Var, true, new vu(bu0.p(ca1Var.h.e()).c(ca1Var.i, ca1Var, ca1Var.g)));
        return bu0.L(ca1Var, false, ca1Var, o1Var);
    }

    public static Context N(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof qq) && ((qq) context).a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        qq qqVar = new qq(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            qqVar.getTheme().applyStyle(resourceId2, true);
        }
        return qqVar;
    }

    public static final Object O(sq sqVar) {
        Object obj;
        br brVarE = sqVar.e();
        y90.n(brVarE);
        rq rqVarU = ds.u(sqVar);
        pu puVar = rqVarU instanceof pu ? (pu) rqVarU : null;
        lr lrVar = lr.c;
        uc1 uc1Var = uc1.a;
        if (puVar == null) {
            obj = uc1Var;
        } else {
            dr drVar = puVar.f;
            if (r71.M(drVar, brVarE)) {
                puVar.h = uc1Var;
                puVar.e = 1;
                drVar.f(brVarE, puVar);
            } else {
                br brVarJ = brVarE.j(new rh1(rh1.d));
                puVar.h = uc1Var;
                puVar.e = 1;
                drVar.f(brVarJ, puVar);
            }
            obj = lrVar;
        }
        return obj == lrVar ? obj : uc1Var;
    }

    public static void b(vf vfVar, View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        vfVar.setBounds(rect);
        vfVar.o(view, null);
        WeakReference weakReference = vfVar.o;
        if ((weakReference != null ? (FrameLayout) weakReference.get() : null) == null) {
            view.getOverlay().add(vfVar);
        } else {
            WeakReference weakReference2 = vfVar.o;
            (weakReference2 != null ? (FrameLayout) weakReference2.get() : null).setForeground(vfVar);
        }
    }

    public static h7 d(r71 r71Var) {
        int i2;
        iu iuVar;
        fu fuVar;
        int i3;
        iu iuVar2;
        iu iuVar3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        int iY = r71Var.y();
        int iX = r71Var.x();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        hu huVar = new hu();
        huVar.a = 0;
        huVar.b = iY;
        huVar.c = 0;
        huVar.d = iX;
        arrayList2.add(huVar);
        int i10 = iY + iX;
        int i11 = 1;
        int i12 = (((i10 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i12];
        int i13 = i12 / 2;
        int[] iArr2 = new int[i12];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            hu huVar2 = (hu) arrayList2.remove(arrayList2.size() - i11);
            if (huVar2.b() >= i11 && huVar2.a() >= i11) {
                int iA = ((huVar2.a() + huVar2.b()) + i11) / 2;
                int i14 = i11 + i13;
                iArr[i14] = huVar2.a;
                iArr2[i14] = huVar2.b;
                int i15 = 0;
                while (true) {
                    if (i15 >= iA) {
                        i2 = i13;
                        iuVar = null;
                        break;
                    }
                    boolean z2 = Math.abs(huVar2.b() - huVar2.a()) % 2 == i11;
                    int iB = huVar2.b() - huVar2.a();
                    int i16 = -i15;
                    int i17 = i16;
                    while (true) {
                        if (i17 > i15) {
                            i2 = i13;
                            i3 = iA;
                            iuVar2 = null;
                            break;
                        }
                        if (i17 == i16 || (i17 != i15 && iArr[i17 + 1 + i13] > iArr[(i17 - 1) + i13])) {
                            i8 = iArr[i17 + 1 + i13];
                            i9 = i8;
                        } else {
                            i8 = iArr[(i17 - 1) + i13];
                            i9 = i8 + 1;
                        }
                        i2 = i13;
                        int i18 = ((i9 - huVar2.a) + huVar2.c) - i17;
                        int i19 = (i15 == 0 || i9 != i8) ? i18 : i18 - 1;
                        int i20 = i17;
                        int i21 = i18;
                        int i22 = i9;
                        i3 = iA;
                        while (i22 < huVar2.b && i21 < huVar2.d && r71Var.d(i22, i21)) {
                            i22++;
                            i21++;
                        }
                        iArr[i20 + i2] = i22;
                        if (z2) {
                            int i23 = iB - i20;
                            z = z2;
                            if (i23 >= i16 + 1 && i23 <= i15 - 1 && iArr2[i23 + i2] <= i22) {
                                iuVar2 = new iu();
                                iuVar2.a = i8;
                                iuVar2.b = i19;
                                iuVar2.c = i22;
                                iuVar2.d = i21;
                                iuVar2.e = false;
                                break;
                            }
                        } else {
                            z = z2;
                        }
                        i17 = i20 + 2;
                        i13 = i2;
                        iA = i3;
                        z2 = z;
                    }
                    if (iuVar2 != null) {
                        iuVar = iuVar2;
                        break;
                    }
                    boolean z3 = (huVar2.b() - huVar2.a()) % 2 == 0;
                    int iB2 = huVar2.b() - huVar2.a();
                    int i24 = i16;
                    while (true) {
                        if (i24 > i15) {
                            iuVar3 = null;
                            break;
                        }
                        if (i24 == i16 || (i24 != i15 && iArr2[i24 + 1 + i2] < iArr2[(i24 - 1) + i2])) {
                            i4 = iArr2[i24 + 1 + i2];
                            i5 = i4;
                        } else {
                            i4 = iArr2[(i24 - 1) + i2];
                            i5 = i4 - 1;
                        }
                        int i25 = huVar2.d - ((huVar2.b - i5) - i24);
                        int i26 = (i15 == 0 || i5 != i4) ? i25 : i25 + 1;
                        boolean z4 = z3;
                        while (true) {
                            if (i5 > huVar2.a && i25 > huVar2.c) {
                                i6 = iB2;
                                if (!r71Var.d(i5 - 1, i25 - 1)) {
                                    break;
                                }
                                i5--;
                                i25--;
                                iB2 = i6;
                            } else {
                                i6 = iB2;
                                break;
                            }
                        }
                        iArr2[i24 + i2] = i5;
                        if (z4 && (i7 = i6 - i24) >= i16 && i7 <= i15 && iArr[i7 + i2] >= i5) {
                            iuVar3 = new iu();
                            iuVar3.a = i5;
                            iuVar3.b = i25;
                            iuVar3.c = i4;
                            iuVar3.d = i26;
                            iuVar3.e = true;
                            break;
                        }
                        i24 += 2;
                        z3 = z4;
                        iB2 = i6;
                    }
                    if (iuVar3 != null) {
                        iuVar = iuVar3;
                        break;
                    }
                    i15++;
                    i13 = i2;
                    iA = i3;
                    i11 = 1;
                }
            } else {
                i2 = i13;
                iuVar = null;
                break;
            }
            if (iuVar != null) {
                if (iuVar.a() > 0) {
                    int i27 = iuVar.d;
                    int i28 = iuVar.b;
                    int i29 = i27 - i28;
                    int i30 = iuVar.c;
                    int i31 = iuVar.a;
                    int i32 = i30 - i31;
                    if (i29 == i32) {
                        fuVar = new fu(i31, i28, i32);
                    } else if (iuVar.e) {
                        fuVar = new fu(i31, i28, iuVar.a());
                    } else {
                        fuVar = i29 > i32 ? new fu(i31, i28 + 1, iuVar.a()) : new fu(i31 + 1, i28, iuVar.a());
                    }
                    arrayList.add(fuVar);
                }
                hu huVar3 = arrayList3.isEmpty() ? new hu() : (hu) arrayList3.remove(arrayList3.size() - 1);
                huVar3.a = huVar2.a;
                huVar3.c = huVar2.c;
                huVar3.b = iuVar.a;
                huVar3.d = iuVar.b;
                arrayList2.add(huVar3);
                huVar2.b = huVar2.b;
                huVar2.d = huVar2.d;
                huVar2.a = iuVar.c;
                huVar2.c = iuVar.d;
                arrayList2.add(huVar2);
            } else {
                arrayList3.add(huVar2);
            }
            i13 = i2;
            i11 = 1;
        }
        Collections.sort(arrayList, e);
        return new h7(r71Var, arrayList, iArr, iArr2);
    }

    public static final void g(View view) {
        view.getClass();
        g11 g11Var = new g11();
        ue1 ue1Var = new ue1(view, g11Var);
        ue1Var.f = g11Var;
        g11Var.f = ue1Var;
        while (g11Var.hasNext()) {
            View view2 = (View) g11Var.next();
            tu0 tu0Var = (tu0) view2.getTag(com.anydesk.anydeskandroid.R.id.pooling_container_listener_holder_tag);
            if (tu0Var == null) {
                tu0Var = new tu0();
                view2.setTag(com.anydesk.anydeskandroid.R.id.pooling_container_listener_holder_tag, tu0Var);
            }
            ArrayList arrayList = tu0Var.a;
            int iZ = um.Z(arrayList);
            if (-1 < iZ) {
                arrayList.get(iZ).getClass();
                id.c();
                return;
            }
        }
    }

    public static i30 h(Context context) {
        ProviderInfo providerInfo;
        g30 g30Var;
        ApplicationInfo applicationInfo;
        int i2 = 12;
        fw fsVar = Build.VERSION.SDK_INT >= 28 ? new fs(i2) : new fw(i2);
        PackageManager packageManager = context.getPackageManager();
        r71.i(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            g30Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrE = fsVar.e(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrE) {
                    arrayList.add(signature.toByteArray());
                }
                g30Var = new g30(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
                g30Var = null;
            }
        }
        if (g30Var == null) {
            return null;
        }
        return new i30(new h30(context, g30Var));
    }

    public static final yz0 j(qr qrVar) {
        yz0 yz0Var;
        qrVar.getClass();
        g01 g01Var = (g01) qrVar.a(h);
        Bundle bundle = null;
        if (g01Var == null) {
            id.q("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        cf1 cf1Var = (cf1) qrVar.a(i);
        if (cf1Var == null) {
            id.q("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) qrVar.a(j);
        String str = (String) qrVar.a(af1.e);
        if (str == null) {
            id.q("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        e01 e01VarJ = g01Var.b().j();
        b01 b01Var = e01VarJ instanceof b01 ? (b01) e01VarJ : null;
        if (b01Var == null) {
            nh0.j("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap = x(cf1Var).b;
        yz0 yz0Var2 = (yz0) linkedHashMap.get(str);
        if (yz0Var2 != null) {
            return yz0Var2;
        }
        b01Var.b();
        Bundle bundle3 = b01Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                b01Var.c = null;
            }
            bundle = bundle4;
        }
        if (bundle != null) {
            bundle2 = bundle;
        }
        if (bundle2 == null) {
            yz0Var = new yz0();
        } else {
            ClassLoader classLoader = yz0.class.getClassLoader();
            classLoader.getClass();
            bundle2.setClassLoader(classLoader);
            yz0Var = new yz0(L(bundle2));
        }
        linkedHashMap.put(str, yz0Var);
        return yz0Var;
    }

    public static int k(Context context, int i2) {
        return (int) TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0054, B:29:0x0069, B:31:0x0071, B:20:0x0045, B:24:0x0050), top: B:50:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r1.i(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object l(defpackage.v10 r7, defpackage.fk r8, boolean r9, defpackage.rq r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.d20
            if (r0 == 0) goto L13
            r0 = r10
            d20 r0 = (defpackage.d20) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            d20 r0 = new d20
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.j
            int r1 = r0.k
            r2 = 0
            r3 = 2
            r4 = 1
            lr r5 = defpackage.lr.c
            if (r1 == 0) goto L49
            if (r1 == r4) goto L3d
            if (r1 != r3) goto L37
            boolean r9 = r0.i
            ph r7 = r0.h
            fk r8 = r0.g
            v10 r1 = r0.f
            defpackage.y90.V(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L54
        L35:
            r7 = move-exception
            goto L8e
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.nh0.j(r7)
            return r2
        L3d:
            boolean r9 = r0.i
            ph r7 = r0.h
            fk r8 = r0.g
            v10 r1 = r0.f
            defpackage.y90.V(r10)     // Catch: java.lang.Throwable -> L35
            goto L69
        L49:
            defpackage.y90.V(r10)
            boolean r10 = r7 instanceof defpackage.aa1
            if (r10 != 0) goto La9
            ph r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L54:
            r0.f = r7     // Catch: java.lang.Throwable -> L35
            r0.g = r8     // Catch: java.lang.Throwable -> L35
            r0.h = r10     // Catch: java.lang.Throwable -> L35
            r0.i = r9     // Catch: java.lang.Throwable -> L35
            r0.k = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L65
            goto L85
        L65:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L69:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L86
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.f = r1     // Catch: java.lang.Throwable -> L35
            r0.g = r8     // Catch: java.lang.Throwable -> L35
            r0.h = r7     // Catch: java.lang.Throwable -> L35
            r0.i = r9     // Catch: java.lang.Throwable -> L35
            r0.k = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.i(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L85:
            return r5
        L86:
            if (r9 == 0) goto L8b
            r8.b(r2)
        L8b:
            uc1 r7 = defpackage.uc1.a
            return r7
        L8e:
            throw r7     // Catch: java.lang.Throwable -> L8f
        L8f:
            r10 = move-exception
            if (r9 == 0) goto La8
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L99
            r2 = r7
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L99:
            if (r2 != 0) goto La5
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r2.<init>(r9)
            r2.initCause(r7)
        La5:
            r8.b(r2)
        La8:
            throw r10
        La9:
            aa1 r7 = (defpackage.aa1) r7
            java.lang.Throwable r7 = r7.c
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk0.l(v10, fk, boolean, rq):java.lang.Object");
    }

    public static final void m(g01 g01Var) {
        af0 af0Var = g01Var.R().d;
        if (af0Var != af0.d && af0Var != af0.e) {
            id.q("Failed requirement.");
        } else if (g01Var.b().j() == null) {
            b01 b01Var = new b01(g01Var.b(), (cf1) g01Var);
            g01Var.b().s("androidx.lifecycle.internal.SavedStateHandlesProvider", b01Var);
            g01Var.R().a(new ew0(5, b01Var));
        }
    }

    public static final bo0 n(Activity activity) {
        View viewFindViewById;
        activity.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            viewFindViewById = d6.A(activity);
        } else {
            viewFindViewById = activity.findViewById(com.anydesk.anydeskandroid.R.id.nav_host_fragment);
            if (viewFindViewById == null) {
                id.q("ID does not reference a View inside this Activity");
                return null;
            }
        }
        viewFindViewById.getClass();
        a10 a10Var = new a10(new b10(new o81(h11.c0(viewFindViewById, new a0(17)), new a0(18), 1), new a0(20), 0));
        bo0 bo0Var = (bo0) (a10Var.hasNext() ? a10Var.next() : null);
        if (bo0Var != null) {
            return bo0Var;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + com.anydesk.anydeskandroid.R.id.nav_host_fragment);
    }

    public static final bo0 o(View view) {
        view.getClass();
        a10 a10Var = new a10(new b10(new o81(h11.c0(view, new a0(17)), new a0(18), 1), new a0(20), 0));
        bo0 bo0Var = (bo0) (!a10Var.hasNext() ? null : a10Var.next());
        if (bo0Var != null) {
            return bo0Var;
        }
        nh0.o(view, " does not have a NavController set", "View ");
        return null;
    }

    public static z9 p(vy vyVar) throws sh1 {
        rt0 rt0VarL;
        if (vyVar.size() < 22) {
            rt0VarL = null;
        } else {
            rt0 rt0VarL2 = bu0.l(vyVar, 0);
            rt0VarL = rt0VarL2 != null ? rt0VarL2 : bu0.l(vyVar, 65535);
        }
        if (rt0VarL == null) {
            throw new sh1("ZIP End of Central Directory record not found");
        }
        ByteBuffer byteBuffer = (ByteBuffer) rt0VarL.a;
        long jLongValue = ((Long) rt0VarL.b).longValue();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        bu0.e(byteBuffer);
        long j2 = ((long) byteBuffer.getInt(byteBuffer.position() + 16)) & 4294967295L;
        if (j2 > jLongValue) {
            throw new sh1("ZIP Central Directory start offset out of range: " + j2 + ". ZIP End of Central Directory offset: " + jLongValue);
        }
        bu0.e(byteBuffer);
        long j3 = ((long) byteBuffer.getInt(byteBuffer.position() + 12)) & 4294967295L;
        long j4 = j2 + j3;
        if (j4 <= jLongValue) {
            bu0.e(byteBuffer);
            return new z9(j2, j3, byteBuffer.getShort(byteBuffer.position() + 10) & 65535, jLongValue, byteBuffer);
        }
        throw new sh1("ZIP Central Directory overlaps with End of Central Directory. CD end: " + j4 + ", EoCD start: " + jLongValue);
    }

    public static int q(ByteBuffer byteBuffer, String str, int i2) throws i9 {
        try {
            b8 b8Var = new b8(byteBuffer);
            for (int iE = b8Var.e; iE != 2; iE = b8Var.e()) {
                int i3 = 3;
                if (iE == 3) {
                    int i4 = b8Var.e;
                    if (str.equals((i4 == 3 || i4 == 4) ? b8Var.f : null)) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= (b8Var.e != 3 ? -1 : b8Var.h)) {
                                break;
                            }
                            if (b8Var.c(i5) == i2) {
                                int i6 = b8Var.a(i5).b;
                                if (i6 != 1) {
                                    if (i6 != 3) {
                                        switch (i6) {
                                            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                                            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                                                i3 = 2;
                                                break;
                                            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                                                i3 = 4;
                                                break;
                                            default:
                                                i3 = 0;
                                                break;
                                        }
                                    } else {
                                        i3 = 1;
                                    }
                                }
                                if (i3 != 1 && i3 != 2) {
                                    throw new i9("Unsupported value type, " + i3 + ", for attribute " + String.format("0x%08X", Integer.valueOf(i2)) + " under element " + str);
                                }
                                return b8Var.b(i5);
                            }
                            i5++;
                        }
                    } else {
                        continue;
                    }
                }
            }
            throw new i9("Failed to determine APK's " + str + " attribute " + String.format("0x%08X", Integer.valueOf(i2)) + " value");
        } catch (a8 e2) {
            throw new i9("Unable to determine value for attribute " + String.format("0x%08X", Integer.valueOf(i2)) + " under element " + str + "; malformed binary resource: AndroidManifest.xml", e2);
        }
    }

    public static Set r() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final int s(String str, Bundle bundle) {
        str.getClass();
        int i2 = bundle.getInt(str, Integer.MIN_VALUE);
        if (i2 != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i2;
        }
        bu0.u(str);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class t(fm fmVar) {
        fmVar.getClass();
        Class cls = fmVar.a;
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return cls;
    }

    public static float u(String[] strArr, int i2) {
        float f2 = Float.parseFloat(strArr[i2]);
        if (f2 >= 0.0f && f2 <= 1.0f) {
            return f2;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f2);
    }

    public static int v(String str) throws qm {
        char cCharAt = str.isEmpty() ? ' ' : str.charAt(0);
        if (cCharAt < 'A' || cCharAt > 'Z') {
            throw new qm(gr0.f("Unable to determine APK's minimum supported Android platform version : Unsupported codename in AndroidManifest.xml's minSdkVersion: \"", str, "\""));
        }
        rt0 rt0Var = new rt0(Character.valueOf(cCharAt), null);
        he heVar = d;
        rt0[] rt0VarArr = c;
        int iBinarySearch = Arrays.binarySearch(rt0VarArr, rt0Var, heVar);
        if (iBinarySearch >= 0) {
            return ((Integer) rt0VarArr[iBinarySearch].b).intValue();
        }
        if ((-1) - iBinarySearch == 0) {
            return 1;
        }
        rt0 rt0Var2 = rt0VarArr[(-2) - iBinarySearch];
        return (cCharAt - ((Character) rt0Var2.a).charValue()) + ((Integer) rt0Var2.b).intValue();
    }

    public static int w(ByteBuffer byteBuffer) throws ul0 {
        int iV;
        try {
            b8 b8Var = new b8(byteBuffer);
            int iMax = 1;
            for (int iE = b8Var.e; iE != 2; iE = b8Var.e()) {
                char c2 = 3;
                if (iE == 3 && b8Var.d == 2) {
                    int i2 = b8Var.e;
                    String str = null;
                    if ("uses-sdk".equals((i2 == 3 || i2 == 4) ? b8Var.f : null)) {
                        int i3 = b8Var.e;
                        if (i3 == 3 || i3 == 4) {
                            str = b8Var.g;
                        }
                        if (str.isEmpty()) {
                            int i4 = 0;
                            while (true) {
                                if (i4 >= (b8Var.e != 3 ? -1 : b8Var.h)) {
                                    iV = 1;
                                } else if (b8Var.c(i4) == 16843276) {
                                    int i5 = b8Var.a(i4).b;
                                    if (i5 != 1) {
                                        if (i5 != 3) {
                                            switch (i5) {
                                                case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                                                case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                                                    c2 = 2;
                                                    break;
                                                case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                                                    c2 = 4;
                                                    break;
                                                default:
                                                    c2 = 0;
                                                    break;
                                            }
                                        } else {
                                            c2 = 1;
                                        }
                                    }
                                    if (c2 == 1) {
                                        iV = v(b8Var.d(i4));
                                    } else {
                                        if (c2 != 2) {
                                            throw new ul0("Unable to determine APK's minimum supported Android: unsupported value type in AndroidManifest.xml's minSdkVersion. Only integer values supported.");
                                        }
                                        iV = b8Var.b(i4);
                                    }
                                } else {
                                    i4++;
                                }
                            }
                            iMax = Math.max(iMax, iV);
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return iMax;
        } catch (a8 e2) {
            throw new ul0("Unable to determine APK's minimum supported Android platform version: malformed binary resource: AndroidManifest.xml", e2);
        }
    }

    public static final c01 x(cf1 cf1Var) {
        af1 af1VarM = us0.m(cf1Var, new v40(2));
        return (c01) ((ah) af1VarM.d).i(nx0.a(c01.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final ArrayList y(String str, Bundle bundle) {
        Class cls = nx0.a(Bundle.class).a;
        cls.getClass();
        ArrayList arrayListC = Build.VERSION.SDK_INT >= 34 ? s3.c(bundle, str, cls) : bundle.getParcelableArrayList(str);
        if (arrayListC != null) {
            return arrayListC;
        }
        bu0.u(str);
        throw null;
    }

    public abstract void D(String str, boolean z);

    public String E(String str) {
        return t70.N(str);
    }

    @Override // defpackage.z70
    public boolean f(MotionEvent[] motionEventArr) {
        boolean zC = true;
        for (MotionEvent motionEvent : motionEventArr) {
            zC &= c(motionEvent);
        }
        return zC;
    }

    @Override // defpackage.z70
    public boolean i(int i2) {
        KeyCharacterMap keyCharacterMapLoad;
        KeyEvent[] events;
        String strI = ec1.i(i2);
        if (!strI.isEmpty()) {
            Method method = vx.g;
            try {
                keyCharacterMapLoad = KeyCharacterMap.load(-1);
            } catch (Throwable unused) {
                keyCharacterMapLoad = null;
            }
            if (keyCharacterMapLoad != null) {
                KeyEvent[] events2 = keyCharacterMapLoad.getEvents(strI.toCharArray());
                if (events2 != null) {
                    return z(events2);
                }
                String strI2 = ec1.i(61184);
                if (!strI2.isEmpty() && (events = keyCharacterMapLoad.getEvents(strI2.toCharArray())) != null && events.length > 0) {
                    ArrayList arrayList = new ArrayList();
                    KeyEvent[] events3 = keyCharacterMapLoad.getEvents(String.format("%04X", Integer.valueOf(i2 & 65535)).toCharArray());
                    if (events3 != null && events3.length > 0) {
                        for (KeyEvent keyEvent : events3) {
                            arrayList.add(keyEvent);
                        }
                        for (KeyEvent keyEvent2 : events) {
                            arrayList.add(keyEvent2);
                        }
                        KeyEvent[] keyEventArr = new KeyEvent[arrayList.size()];
                        arrayList.toArray(keyEventArr);
                        return z(keyEventArr);
                    }
                }
            }
            e(strI);
        }
        return false;
    }

    public boolean z(KeyEvent[] keyEventArr) {
        boolean zA = true;
        for (KeyEvent keyEvent : keyEventArr) {
            zA &= a(keyEvent);
        }
        return zA;
    }
}
