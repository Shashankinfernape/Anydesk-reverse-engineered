package defpackage;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import com.anydesk.anydeskandroid.Roster;
import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterFragment;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterItemDetailsFragment;
import com.anydesk.anydeskandroid.gui.fragment.MainFragment;
import com.anydesk.anydeskandroid.gui.fragment.TcpTunnelFragment;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class bc implements wu0, ip0, yc0, ax, zc0, ad0 {
    public static final int[] f = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final /* synthetic */ int c;
    public Object d;
    public Object e;

    public bc(EditText editText, int i) {
        this.c = i;
        switch (i) {
            case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                this.d = editText;
                gx gxVar = new gx(editText);
                this.e = gxVar;
                editText.addTextChangedListener(gxVar);
                if (uw.b == null) {
                    synchronized (uw.a) {
                        try {
                            if (uw.b == null) {
                                uw uwVar = new uw();
                                try {
                                    uw.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, uw.class.getClassLoader());
                                    break;
                                } catch (Throwable unused) {
                                }
                                uw.b = uwVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                editText.setEditableFactory(uw.b);
                return;
            default:
                this.d = editText;
                this.e = new ev(editText);
                return;
        }
    }

    @Override // defpackage.yc0
    public void A(String str, String str2) {
        yc0 yc0Var = (yc0) this.d;
        if (yc0Var != null) {
            yc0Var.A(str, str2);
            return;
        }
        ArrayList arrayList = (ArrayList) this.e;
        du duVar = new du();
        duVar.a = 7;
        duVar.o = str;
        duVar.p = str2;
        arrayList.add(duVar);
    }

    @Override // defpackage.yc0
    public void B() {
        yc0 yc0Var = (yc0) this.d;
        if (yc0Var != null) {
            yc0Var.B();
            return;
        }
        ArrayList arrayList = (ArrayList) this.e;
        du duVar = new du();
        duVar.a = 11;
        arrayList.add(duVar);
    }

    public ValueAnimator C() {
        ValueAnimator valueAnimator = (ValueAnimator) this.d;
        if (((s81) this.e) != null) {
            valueAnimator.addListener(new h0(4, this));
        }
        return valueAnimator;
    }

    @Override // defpackage.yc0
    public void D() {
        yc0 yc0Var = (yc0) this.d;
        if (yc0Var != null) {
            yc0Var.D();
            return;
        }
        ArrayList arrayList = (ArrayList) this.e;
        du duVar = new du();
        duVar.a = 20;
        arrayList.add(duVar);
    }

    @Override // defpackage.yc0
    public void E() {
        yc0 yc0Var = (yc0) this.d;
        if (yc0Var != null) {
            yc0Var.E();
            return;
        }
        ArrayList arrayList = (ArrayList) this.e;
        du duVar = new du();
        duVar.a = 18;
        arrayList.add(duVar);
    }

    public void F(String str) {
        t40 t40Var = (t40) this.e;
        if (t40Var != null) {
            t70.Y(new d3(t40Var, str, 14, false));
        } else {
            ((Logging) this.d).a("cannot close dialog: fragmentManager is null");
        }
    }

    public void G(int i) {
        F("GenericMsg_" + i);
    }

    public void H(boolean z) {
        c40 c40Var = ((t40) this.e).w;
        if (c40Var != null) {
            c40Var.e0().m.H(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                id.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void I(boolean z) {
        t40 t40Var = (t40) this.e;
        t40Var.u.getClass();
        c40 c40Var = t40Var.w;
        if (c40Var != null) {
            c40Var.e0().m.I(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                id.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.yc0
    public void J() {
        yc0 yc0Var = (yc0) this.d;
        if (yc0Var != null) {
            yc0Var.J();
            return;
        }
        ArrayList arrayList = (ArrayList) this.e;
        du duVar = new du();
        duVar.a = 15;
        arrayList.add(duVar);
    }

    public void K(boolean z) {
        c40 c40Var = ((t40) this.e).w;
        if (c40Var != null) {
            c40Var.e0().m.K(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                id.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void L(boolean z) {
        c40 c40Var = ((t40) this.e).w;
        if (c40Var != null) {
            c40Var.e0().m.L(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                id.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.yc0
    public void M() {
        yc0 yc0Var = (yc0) this.d;
        if (yc0Var != null) {
            yc0Var.M();
            return;
        }
        ArrayList arrayList = (ArrayList) this.e;
        du duVar = new du();
        duVar.a = 16;
        arrayList.add(duVar);
    }

    public void N(boolean z) {
        c40 c40Var = ((t40) this.e).w;
        if (c40Var != null) {
            c40Var.e0().m.N(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                id.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void O(boolean z) {
        c40 c40Var = ((t40) this.e).w;
        if (c40Var != null) {
            c40Var.e0().m.O(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                id.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void P(boolean z) {
        t40 t40Var = (t40) this.e;
        t40Var.u.getClass();
        c40 c40Var = t40Var.w;
        if (c40Var != null) {
            c40Var.e0().m.P(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                id.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void Q(boolean z) {
        c40 c40Var = ((t40) this.e).w;
        if (c40Var != null) {
            c40Var.e0().m.Q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                id.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void R(boolean z) {
        c40 c40Var = ((t40) this.e).w;
        if (c40Var != null) {
            c40Var.e0().m.R(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                id.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void S(boolean z) {
        c40 c40Var = ((t40) this.e).w;
        if (c40Var != null) {
            c40Var.e0().m.S(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                id.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void T(boolean z) {
        c40 c40Var = ((t40) this.e).w;
        if (c40Var != null) {
            c40Var.e0().m.T(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                id.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void U(boolean z) {
        c40 c40Var = ((t40) this.e).w;
        if (c40Var != null) {
            c40Var.e0().m.U(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                id.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void V(boolean z) {
        c40 c40Var = ((t40) this.e).w;
        if (c40Var != null) {
            c40Var.e0().m.V(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                id.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void W(boolean z) {
        c40 c40Var = ((t40) this.e).w;
        if (c40Var != null) {
            c40Var.e0().m.W(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                id.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public KeyListener X(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((bc) ((ev) this.e).d).getClass();
        if (keyListener instanceof zw) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new zw(keyListener);
    }

    public boolean Y(vn0 vn0Var) {
        vn0Var.getClass();
        int i = vn0.h;
        for (vn0 vn0Var2 : h11.c0(vn0Var, new a0(15))) {
            if (((HashSet) this.d).contains(Integer.valueOf(vn0Var2.d.a))) {
                if (vn0Var2 instanceof xn0) {
                    int i2 = vn0Var.d.a;
                    int i3 = xn0.j;
                    if (i2 == th1.q((xn0) vn0Var2).d.a) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void Z(AttributeSet attributeSet, int i) {
        boolean z = true;
        switch (this.c) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.d;
                y6 y6VarC = y6.C(absSeekBar.getContext(), attributeSet, f, i);
                Drawable drawableU = y6VarC.u(0);
                if (drawableU != null) {
                    if (drawableU instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableU;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable drawableY0 = y0(animationDrawable.getFrame(i2), true);
                            drawableY0.setLevel(10000);
                            animationDrawable2.addFrame(drawableY0, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableU = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableU);
                }
                Drawable drawableU2 = y6VarC.u(1);
                if (drawableU2 != null) {
                    absSeekBar.setProgressDrawable(y0(drawableU2, false));
                }
                y6VarC.F();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.d).getContext().obtainStyledAttributes(attributeSet, yv0.i, i, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    h0(z);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    @Override // defpackage.ax
    public Object a() {
        return (xc1) this.d;
    }

    public ww a0(InputConnection inputConnection, EditorInfo editorInfo) {
        ev evVar = (ev) this.e;
        if (inputConnection == null) {
            evVar.getClass();
            inputConnection = null;
        } else {
            bc bcVar = (bc) evVar.d;
            bcVar.getClass();
            if (!(inputConnection instanceof ww)) {
                inputConnection = new ww((EditText) bcVar.d, inputConnection, editorInfo);
            }
        }
        return (ww) inputConnection;
    }

    @Override // defpackage.ad0
    public boolean b(int i, int i2, nm0 nm0Var, int i3) {
        if (nm0Var.c == 0 && i3 == 0) {
            synchronized (((h7) this.e)) {
                try {
                    k90 k90Var = (k90) ((h7) this.e).e();
                    if (k90Var != null && k90Var.a == 2 && k90Var.d.c == 0 && k90Var.e == 0) {
                        k90Var.b = i;
                        k90Var.c = i2;
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (((h7) this.e)) {
            try {
                k90 k90Var2 = (k90) ((h7) this.e).g();
                if (k90Var2 == null) {
                    return false;
                }
                k90Var2.a = 2;
                k90Var2.b = i;
                k90Var2.c = i2;
                k90Var2.d = nm0Var;
                k90Var2.e = i3;
                ((h7) this.e).b();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b0(a6 a6Var) {
        ah ahVar = (ah) this.d;
        ((ActionMode.Callback) ahVar.a).onDestroyActionMode(ahVar.e(a6Var));
        qb qbVar = (qb) this.e;
        if (qbVar.x != null) {
            qbVar.n.getDecorView().removeCallbacks(qbVar.y);
        }
        if (qbVar.w != null) {
            df1 df1Var = qbVar.z;
            if (df1Var != null) {
                df1Var.b();
            }
            df1 df1VarA = oe1.a(qbVar.w);
            df1VarA.a(0.0f);
            qbVar.z = df1VarA;
            df1VarA.d(new eb(2, this));
        }
        qbVar.v = null;
        ViewGroup viewGroup = qbVar.B;
        WeakHashMap weakHashMap = oe1.a;
        ee1.c(viewGroup);
        qbVar.J();
    }

    @Override // defpackage.ad0
    public boolean c(String str) {
        synchronized (((h7) this.e)) {
            try {
                k90 k90Var = (k90) ((h7) this.e).g();
                if (k90Var == null) {
                    return false;
                }
                k90Var.a = 7;
                k90Var.j = str;
                ((h7) this.e).b();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c0(a6 a6Var, Menu menu) {
        ViewGroup viewGroup = ((qb) this.e).B;
        WeakHashMap weakHashMap = oe1.a;
        ee1.c(viewGroup);
        ah ahVar = (ah) this.d;
        ActionMode.Callback callback = (ActionMode.Callback) ahVar.a;
        z71 z71VarE = ahVar.e(a6Var);
        i51 i51Var = (i51) ahVar.d;
        Menu ml0Var = (Menu) i51Var.get(menu);
        if (ml0Var == null) {
            ml0Var = new ml0((Context) ahVar.b, (rk0) menu);
            i51Var.put(menu, ml0Var);
        }
        return callback.onPrepareActionMode(z71VarE, ml0Var);
    }

    @Override // defpackage.zc0
    public void d(int i) {
        zc0 zc0Var = (zc0) this.d;
        if (zc0Var != null) {
            zc0Var.d(i);
            return;
        }
        f0(i);
        ArrayList arrayList = (ArrayList) this.e;
        y80 y80Var = new y80();
        y80Var.a = 3;
        y80Var.c = i;
        arrayList.add(y80Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d0(l30 l30Var) {
        se seVar = (se) this.e;
        xt0 xt0Var = (xt0) this.d;
        int i = l30Var.b;
        boolean z = false;
        Object[] objArr = 0;
        if (i == 0) {
            seVar.execute(new d3(xt0Var, l30Var.a, 8, z));
        } else {
            seVar.execute(new qi((Object) xt0Var, i, (int) (objArr == true ? 1 : 0)));
        }
    }

    @Override // defpackage.zc0
    public void e(z80 z80Var) {
        zc0 zc0Var = (zc0) this.d;
        if (zc0Var != null) {
            zc0Var.e(z80Var);
            return;
        }
        f0(z80Var.a);
        ArrayList arrayList = (ArrayList) this.e;
        y80 y80Var = new y80();
        y80Var.a = 1;
        y80Var.b = z80Var;
        y80Var.c = z80Var.a;
        arrayList.add(y80Var);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:20:0x0062, B:97:0x0209, B:28:0x0074, B:29:0x0082, B:31:0x0087, B:38:0x0097, B:46:0x00b1, B:41:0x00a0, B:44:0x00a9, B:47:0x00bf, B:51:0x00ce, B:53:0x00d6, B:54:0x00e0, B:63:0x0109, B:64:0x0110, B:65:0x0128, B:57:0x00e9, B:59:0x00f1, B:60:0x00ff, B:66:0x0129, B:68:0x0131, B:69:0x013f, B:72:0x0149, B:73:0x0154, B:74:0x016c, B:75:0x016d, B:78:0x0177, B:79:0x0182, B:80:0x019a, B:81:0x019b, B:83:0x01a3, B:84:0x01ac, B:87:0x01b6, B:88:0x01c0, B:89:0x01d8, B:90:0x01d9, B:93:0x01e3, B:94:0x01ed, B:95:0x0205, B:96:0x0206), top: B:105:0x0062 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void e0(Context context, XmlResourceParser xmlResourceParser) {
        aq aqVar = new aq();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    int eventType = xmlResourceParser.getEventType();
                    vp vpVarC = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        if (vpVarC == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        vpVarC.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        if (vpVarC == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        vpVarC.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        vpVarC = aq.c(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        if (vpVarC == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        vpVarC.b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        if (vpVarC == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        vpVarC.e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        vpVarC = aq.c(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        vpVarC.d.a = true;
                                    }
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        if (vpVarC != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        op.a(context, xmlResourceParser, vpVarC.f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        vpVarC = aq.c(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        vpVarC.d.h0 = 1;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        if (vpVarC != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        op.a(context, xmlResourceParser, vpVarC.f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        vpVarC = aq.c(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    }
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        aqVar.c.put(Integer.valueOf(vpVarC.a), vpVarC);
                                        vpVarC = null;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        aqVar.c.put(Integer.valueOf(vpVarC.a), vpVarC);
                                        vpVarC = null;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        aqVar.c.put(Integer.valueOf(vpVarC.a), vpVarC);
                                        vpVarC = null;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        ((SparseArray) this.e).put(identifier, aqVar);
                                        return;
                                    }
                                    break;
                                    break;
                                default:
                                    break;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException e) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e);
                } catch (XmlPullParserException e2) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e2);
                }
                ((SparseArray) this.e).put(identifier, aqVar);
                return;
            }
        }
    }

    @Override // defpackage.yc0
    public void f() {
        yc0 yc0Var = (yc0) this.d;
        if (yc0Var != null) {
            yc0Var.f();
            return;
        }
        ArrayList arrayList = (ArrayList) this.e;
        du duVar = new du();
        duVar.a = 1;
        arrayList.add(duVar);
    }

    public void f0(int i) {
        Iterator it = ((ArrayList) this.e).iterator();
        while (it.hasNext()) {
            y80 y80Var = (y80) it.next();
            if (y80Var != null && y80Var.c == i) {
                it.remove();
            }
        }
    }

    @Override // defpackage.yc0
    public void g(int i, int i2, boolean z) {
        yc0 yc0Var = (yc0) this.d;
        if (yc0Var != null) {
            yc0Var.g(i, i2, z);
            return;
        }
        ArrayList arrayList = (ArrayList) this.e;
        du duVar = new du();
        duVar.a = 19;
        duVar.r = i;
        duVar.s = i2;
        duVar.t = z;
        arrayList.add(duVar);
    }

    public void g0(Object obj) {
        e71 e71Var = (e71) this.d;
        e71Var.j(null, new st0(Integer.valueOf(((Number) ((st0) e71Var.getValue()).c).intValue() + 1), obj));
    }

    @Override // defpackage.yc0
    public void h() {
        yc0 yc0Var = (yc0) this.d;
        if (yc0Var != null) {
            yc0Var.h();
            return;
        }
        ArrayList arrayList = (ArrayList) this.e;
        du duVar = new du();
        duVar.a = 13;
        arrayList.add(duVar);
    }

    public void h0(boolean z) {
        gx gxVar = (gx) ((bc) ((ev) this.e).d).e;
        if (gxVar.e != z) {
            if (gxVar.d != null) {
                rw rwVarA = rw.a();
                fx fxVar = gxVar.d;
                rwVarA.getClass();
                r71.i(fxVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = rwVarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    rwVarA.b.remove(fxVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            gxVar.e = z;
            if (z) {
                gx.a(gxVar.c, rw.a().b());
            }
        }
    }

    @Override // defpackage.yc0
    public void i() {
        yc0 yc0Var = (yc0) this.d;
        if (yc0Var != null) {
            yc0Var.i();
            return;
        }
        ArrayList arrayList = (ArrayList) this.e;
        du duVar = new du();
        duVar.a = 14;
        arrayList.add(duVar);
    }

    public void i0(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.e;
        cardView.f.set(i, i2, i3, i4);
        Rect rect = cardView.e;
        super/*android.widget.FrameLayout*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    @Override // defpackage.yc0
    public void j() {
        yc0 yc0Var = (yc0) this.d;
        if (yc0Var != null) {
            yc0Var.j();
            return;
        }
        ArrayList arrayList = (ArrayList) this.e;
        du duVar = new du();
        duVar.a = 17;
        arrayList.add(duVar);
    }

    public void j0(vf1 vf1Var) {
        this.d = vf1Var;
        if (vf1Var != null) {
            ((v41) this.e).p(vf1Var);
        }
    }

    @Override // defpackage.yc0
    public void k() {
        yc0 yc0Var = (yc0) this.d;
        if (yc0Var != null) {
            yc0Var.k();
            return;
        }
        ArrayList arrayList = (ArrayList) this.e;
        du duVar = new du();
        duVar.a = 12;
        arrayList.add(duVar);
    }

    public void k0(RosterItem rosterItem) {
        long j = rosterItem.mId;
        String str = rosterItem.mUserDefinedName;
        long j2 = rosterItem.mCid;
        String str2 = rosterItem.mAlias;
        String str3 = rosterItem.mHostname;
        String str4 = rosterItem.a;
        w0 w0Var = new w0();
        Bundle bundle = new Bundle();
        bundle.putLong("skey_edit_roster_item_id", j);
        bundle.putString("skey_edit_roster_item_name", str);
        bundle.putLong("skey_edit_roster_item_cid", j2);
        bundle.putString("skey_edit_roster_item_alias", str2);
        bundle.putString("skey_edit_roster_item_hostname", str3);
        bundle.putString("skey_edit_roster_item_comment", str4);
        w0Var.N0(bundle);
        p0(w0Var, "AbookRosterItemEditDialog", true);
    }

    @Override // defpackage.yc0
    public void l(int i, int i2, long j, String str, long j2, String str2, long j3, long j4, String str3) {
        yc0 yc0Var = (yc0) this.d;
        if (yc0Var != null) {
            yc0Var.l(i, i2, j, str, j2, str2, j3, j4, str3);
            return;
        }
        ArrayList arrayList = (ArrayList) this.e;
        du duVar = new du();
        duVar.a = 5;
        duVar.b = i;
        duVar.c = i2;
        duVar.d = j;
        duVar.f = str;
        duVar.g = j2;
        duVar.h = str2;
        duVar.i = j3;
        duVar.k = j4;
        duVar.l = str3;
        arrayList.add(duVar);
    }

    public void l0(int i, boolean z) {
        k3 k3Var = new k3();
        Bundle bundle = new Bundle();
        bundle.putInt("skey_accept_session_idx", i);
        bundle.putBoolean("skey_accept_is_req", z);
        k3Var.N0(bundle);
        p0(k3Var, "AcceptDialog_" + i, false);
    }

    @Override // defpackage.ip0
    public void m(NestedScrollView nestedScrollView, int i) {
        u7.b(nestedScrollView, (View) this.d, (View) this.e);
    }

    public void m0(zl0 zl0Var, String str) {
        e9 e9VarT0 = e9.T0(zl0Var);
        Bundle bundle = e9VarT0.h;
        if (bundle != null) {
            bundle.putString("skey_motd_CONNECT_ADDR", str);
        }
        p0(e9VarT0, "AnyMessageDialog", false);
    }

    @Override // defpackage.zc0
    public void n(int i) {
        zc0 zc0Var = (zc0) this.d;
        if (zc0Var != null) {
            zc0Var.n(i);
            return;
        }
        ArrayList arrayList = (ArrayList) this.e;
        y80 y80Var = new y80();
        y80Var.a = 2;
        y80Var.c = i;
        arrayList.add(y80Var);
    }

    public void n0(int i, String str, String str2, boolean z) {
        s0(ol0.S0(i, str, str2, null, JniAdExt.n1("ad.dlg.cancel"), null, null, j7.ACTION_CLOSE_PANEL, null, z));
    }

    @Override // defpackage.ad0
    public boolean o(byte b, int i, de0 de0Var, int i2) {
        synchronized (((h7) this.e)) {
            try {
                k90 k90Var = (k90) ((h7) this.e).g();
                if (k90Var == null) {
                    return false;
                }
                k90Var.a = 3;
                k90Var.f = b;
                k90Var.g = i;
                k90Var.h = de0Var;
                k90Var.i = i2;
                ((h7) this.e).b();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o0(int i) {
        xk xkVar = new xk();
        Bundle bundle = new Bundle();
        bundle.putInt("session_idx", i);
        xkVar.N0(bundle);
        p0(xkVar, "ChatDialog", true);
    }

    @Override // defpackage.wu0
    public boolean onMenuItemClick(MenuItem menuItem) {
        int i = 0;
        int i2 = 1;
        switch (this.c) {
            case 1:
                Roster roster = (Roster) this.d;
                int itemId = menuItem.getItemId();
                if (itemId == com.anydesk.anydeskandroid.R.id.menu_abook_roster_rename) {
                    bc bcVar = ((g) this.e).c.v0;
                    if (bcVar != null) {
                        bcVar.v0(roster.mName, roster.mId);
                    }
                } else {
                    if (itemId != com.anydesk.anydeskandroid.R.id.menu_abook_roster_delete) {
                        return false;
                    }
                    JniAdExt.I0.post(new va0(i, roster.mId));
                }
                return true;
            case 2:
                AbookRosterFragment abookRosterFragment = (AbookRosterFragment) this.e;
                RosterItem rosterItem = (RosterItem) this.d;
                int itemId2 = menuItem.getItemId();
                if (itemId2 == com.anydesk.anydeskandroid.R.id.menu_abook_roster_item_install_shortcut) {
                    int i3 = rosterItem.mColor1;
                    int i4 = rosterItem.mColor2;
                    String prettyAddr = rosterItem.getPrettyAddr();
                    String str = rosterItem.mThumbnailPath;
                    String displayName = rosterItem.getDisplayName();
                    m80 m80Var = abookRosterFragment.b0;
                    if (m80Var != null) {
                        MainActivity mainActivity = (MainActivity) m80Var;
                        mainActivity.F.e(mainActivity, i3, i4, prettyAddr, str, displayName);
                    }
                } else if (itemId2 == com.anydesk.anydeskandroid.R.id.menu_abook_roster_item_connect) {
                    String addr = rosterItem.getAddr();
                    ArrayList arrayListY2 = JniAdExt.y2();
                    bc bcVar2 = abookRosterFragment.c0;
                    if (arrayListY2.isEmpty() || bcVar2 == null) {
                        m80 m80Var2 = abookRosterFragment.b0;
                        if (m80Var2 != null) {
                            ((MainActivity) m80Var2).k0(addr);
                        }
                    } else {
                        bcVar2.m0((zl0) arrayListY2.get(0), addr);
                    }
                } else if (itemId2 == com.anydesk.anydeskandroid.R.id.menu_abook_roster_item_browse_files) {
                    String addr2 = rosterItem.getAddr();
                    if (JniAdExt.s2(12) != 0) {
                        m80 m80Var3 = abookRosterFragment.b0;
                        if (m80Var3 != null) {
                            ((MainActivity) m80Var3).i0(addr2);
                        }
                    } else {
                        abookRosterFragment.n0.u(abookRosterFragment.a0(), JniAdExt.r2(5));
                    }
                } else if (itemId2 == com.anydesk.anydeskandroid.R.id.menu_abook_roster_item_vpn) {
                    String addr3 = rosterItem.getAddr();
                    m80 m80Var4 = abookRosterFragment.b0;
                    if (m80Var4 != null) {
                        ((MainActivity) m80Var4).l0(addr3);
                    }
                } else if (itemId2 == com.anydesk.anydeskandroid.R.id.menu_abook_roster_item_tcp_tunneling) {
                    m80 m80Var5 = abookRosterFragment.b0;
                    if (m80Var5 != null) {
                        TcpTunnelFragment.T0((MainActivity) m80Var5, false, rosterItem.mCid, rosterItem.mAlias, rosterItem.getPrettyAddr());
                    }
                } else if (itemId2 == com.anydesk.anydeskandroid.R.id.menu_abook_roster_item_chat_history) {
                    JniAdExt.I0.post(new ra0(rosterItem.mCid));
                } else if (itemId2 == com.anydesk.anydeskandroid.R.id.menu_abook_roster_item_delete) {
                    JniAdExt.I0.post(new ya0(JniAdExt.P2(), rosterItem.mId));
                } else {
                    if (itemId2 != com.anydesk.anydeskandroid.R.id.menu_abook_roster_item_edit) {
                        return false;
                    }
                    bc bcVar3 = abookRosterFragment.c0;
                    if (bcVar3 != null) {
                        bcVar3.k0(rosterItem);
                    }
                }
                return true;
            case 3:
                if (menuItem.getItemId() != com.anydesk.anydeskandroid.R.id.menu_abook_roster_item_tags_edit) {
                    return false;
                }
                bc bcVar4 = ((AbookRosterItemDetailsFragment) this.e).a0;
                if (bcVar4 != null) {
                    RosterItem rosterItem2 = (RosterItem) this.d;
                    String[] strArr = rosterItem2.b;
                    ArrayList<String> arrayList = new ArrayList<>();
                    arrayList.ensureCapacity(strArr.length);
                    for (String str2 : strArr) {
                        arrayList.add(str2);
                    }
                    long j = rosterItem2.mId;
                    String displayName2 = rosterItem2.getDisplayName();
                    f1 f1Var = new f1();
                    Bundle bundle = new Bundle();
                    bundle.putLong("skey_tag_roster_item_id", j);
                    bundle.putString("skey_tag_roster_item_addr", displayName2);
                    bundle.putStringArrayList("skey_tag_roster_item_new_tags", arrayList);
                    HashSet hashSet = new HashSet(arrayList);
                    String[] strArrN2 = JniAdExt.N2();
                    HashSet hashSet2 = new HashSet();
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    int length = strArrN2.length;
                    while (i < length) {
                        String str3 = strArrN2[i];
                        if (!hashSet.contains(str3) && hashSet2.add(str3)) {
                            arrayList2.add(str3);
                        }
                        i++;
                    }
                    bundle.putStringArrayList("skey_tag_roster_item_available_tags", arrayList2);
                    f1Var.N0(bundle);
                    bcVar4.p0(f1Var, "AbookRosterItemTagsEditDialog", true);
                }
                return true;
            case 4:
                String str4 = (String) this.d;
                w1 w1Var = (w1) this.e;
                int itemId3 = menuItem.getItemId();
                if (itemId3 == com.anydesk.anydeskandroid.R.id.menu_abook_roster_tag_rename) {
                    bc bcVar5 = w1Var.r0;
                    if (bcVar5 != null) {
                        long jP2 = JniAdExt.P2();
                        z0 z0Var = new z0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("skey_rename_roster_id", jP2);
                        bundle2.putString("skey_rename_tag", str4);
                        bundle2.putString("skey_rename_new_name", str4);
                        z0Var.N0(bundle2);
                        bcVar5.p0(z0Var, "AbookRosterItemTagRenameDialog", false);
                    }
                } else {
                    if (itemId3 != com.anydesk.anydeskandroid.R.id.menu_abook_roster_tag_delete) {
                        return false;
                    }
                    JniAdExt.I0.post(new wa0(JniAdExt.P2(), str4, i2));
                }
                return true;
            default:
                MainFragment mainFragment = (MainFragment) ((dj) this.e).d;
                RosterItem rosterItem3 = (RosterItem) this.d;
                int itemId4 = menuItem.getItemId();
                if (itemId4 == com.anydesk.anydeskandroid.R.id.dial_alias) {
                    mainFragment.e1(rosterItem3.getAddr());
                } else if (itemId4 == com.anydesk.anydeskandroid.R.id.dial_id) {
                    mainFragment.e1(t70.f(rosterItem3.mCid));
                } else if (itemId4 == com.anydesk.anydeskandroid.R.id.dial_install_shortcut) {
                    int i5 = rosterItem3.mColor1;
                    int i6 = rosterItem3.mColor2;
                    String prettyAddr2 = rosterItem3.getPrettyAddr();
                    String str5 = rosterItem3.mThumbnailPath;
                    String displayName3 = rosterItem3.getDisplayName();
                    m80 m80Var6 = mainFragment.a0;
                    if (m80Var6 != null) {
                        MainActivity mainActivity2 = (MainActivity) m80Var6;
                        mainActivity2.F.e(mainActivity2, i5, i6, prettyAddr2, str5, displayName3);
                    }
                } else if (itemId4 == com.anydesk.anydeskandroid.R.id.dial_browse_files) {
                    MainFragment.S0(mainFragment, rosterItem3.getAddr());
                } else if (itemId4 == com.anydesk.anydeskandroid.R.id.dial_vpn) {
                    String addr4 = rosterItem3.getAddr();
                    m80 m80Var7 = mainFragment.a0;
                    if (m80Var7 != null) {
                        ((MainActivity) m80Var7).l0(addr4);
                    }
                } else if (itemId4 == com.anydesk.anydeskandroid.R.id.dial_tcp_tunneling) {
                    long j2 = rosterItem3.mCid;
                    String str6 = rosterItem3.mAlias;
                    String prettyAddr3 = rosterItem3.getPrettyAddr();
                    m80 m80Var8 = mainFragment.a0;
                    if (m80Var8 != null) {
                        TcpTunnelFragment.T0((MainActivity) m80Var8, false, j2, str6, prettyAddr3);
                    }
                } else {
                    if (itemId4 != com.anydesk.anydeskandroid.R.id.dial_chat_history) {
                        return false;
                    }
                    JniAdExt.I0.post(new ra0(rosterItem3.mCid));
                }
                return true;
        }
    }

    @Override // defpackage.yc0
    public void p() {
        yc0 yc0Var = (yc0) this.d;
        if (yc0Var != null) {
            yc0Var.p();
            return;
        }
        ArrayList arrayList = (ArrayList) this.e;
        du duVar = new du();
        duVar.a = 2;
        arrayList.add(duVar);
    }

    public void p0(yt ytVar, String str, boolean z) {
        t40 t40Var = (t40) this.e;
        if (t40Var != null) {
            t70.Y(new eu(t40Var, z, str, ytVar));
        } else {
            ((Logging) this.d).a("cannot show dialog: fragmentManager is null");
        }
    }

    @Override // defpackage.yc0
    public void q(String str) {
        yc0 yc0Var = (yc0) this.d;
        if (yc0Var != null) {
            yc0Var.q(str);
            return;
        }
        ArrayList arrayList = (ArrayList) this.e;
        du duVar = new du();
        duVar.a = 9;
        duVar.q = str;
        arrayList.add(duVar);
    }

    public void q0(int i, String str, String str2, String str3, boolean z, String str4, String str5) {
        p0(x60.S0(false, i, str, str2, str3, z, str4, str5), "GenericMsg_" + i, true);
    }

    @Override // defpackage.yc0
    public void r() {
        yc0 yc0Var = (yc0) this.d;
        if (yc0Var != null) {
            yc0Var.r();
            return;
        }
        ArrayList arrayList = (ArrayList) this.e;
        du duVar = new du();
        duVar.a = 6;
        arrayList.add(duVar);
    }

    public void r0(int i, String str, String str2, j7 j7Var, boolean z) {
        s0(ol0.S0(i, str, str2, JniAdExt.n1("ad.dlg.ok"), null, null, j7Var, null, null, z));
    }

    @Override // defpackage.yc0
    public void s(int i, int i2, long j, String str, long j2, String str2) {
        yc0 yc0Var = (yc0) this.d;
        if (yc0Var != null) {
            yc0Var.s(i, i2, j, str, j2, str2);
            return;
        }
        ArrayList arrayList = (ArrayList) this.e;
        du duVar = new du();
        duVar.a = 4;
        duVar.b = i;
        duVar.c = i2;
        duVar.d = j;
        duVar.e = str;
        duVar.i = j2;
        duVar.j = str2;
        arrayList.add(duVar);
    }

    public void s0(yt ytVar) {
        p0(ytVar, "OutgoingDialog", true);
    }

    @Override // defpackage.ad0
    public void t() {
        synchronized (((h7) this.e)) {
            try {
                k90 k90Var = (k90) ((h7) this.e).g();
                if (k90Var == null) {
                    return;
                }
                k90Var.a = 4;
                ((h7) this.e).b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void t0(int i, String str) {
        p0(x60.S0(true, i, str, JniAdExt.n1("ad.setup.dlg.msg.permission.declined"), null, true, JniAdExt.n1("ad.menu.settings"), JniAdExt.n1("ad.cfg.close")), "GenericMsg_" + i, true);
    }

    @Override // defpackage.ad0
    public boolean u(e7 e7Var) {
        synchronized (((h7) this.e)) {
            try {
                k90 k90Var = (k90) ((h7) this.e).g();
                if (k90Var == null) {
                    return false;
                }
                k90Var.a = 6;
                k90Var.k = e7Var;
                ((h7) this.e).b();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void u0(String str, String str2) {
        ju0 ju0Var = new ju0();
        Bundle bundle = new Bundle();
        bundle.putString("skey_pp_id", str);
        bundle.putString("skey_pp_name", str2);
        ju0Var.N0(bundle);
        p0(ju0Var, "PermissionProfileRenameDialog", false);
    }

    @Override // defpackage.yc0
    public void v() {
        yc0 yc0Var = (yc0) this.d;
        if (yc0Var != null) {
            yc0Var.v();
            return;
        }
        ArrayList arrayList = (ArrayList) this.e;
        du duVar = new du();
        duVar.a = 8;
        arrayList.add(duVar);
    }

    public void v0(String str, long j) {
        dz0 dz0Var = new dz0();
        Bundle bundle = new Bundle();
        bundle.putLong("skey_rename_roster_id", j);
        bundle.putString("skey_rename_name", str);
        dz0Var.N0(bundle);
        p0(dz0Var, "SpeedDialItemRenameDialog", false);
    }

    @Override // defpackage.ax
    public boolean w(CharSequence charSequence, int i, int i2, mc1 mc1Var) {
        if ((mc1Var.c & 4) > 0) {
            return true;
        }
        if (((xc1) this.d) == null) {
            this.d = new xc1(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((fw) this.e).getClass();
        ((xc1) this.d).setSpan(new nc1(mc1Var), i, i2, 33);
        return true;
    }

    public void w0() {
        h21 h21Var = new h21();
        Bundle bundle = new Bundle();
        t01 t01Var = t01.e;
        bundle.putSerializable("skey_settings_passwd", t01Var);
        bundle.putSerializable("skey_settings_passwd_confirm", t01Var);
        h21Var.N0(bundle);
        p0(h21Var, "PasswdSettingsDialog", false);
    }

    @Override // defpackage.ad0
    public void x() {
        synchronized (((h7) this.e)) {
            try {
                k90 k90Var = (k90) ((h7) this.e).g();
                if (k90Var == null) {
                    return;
                }
                k90Var.a = 5;
                ((h7) this.e).b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x0(int i, String str, String str2, String str3, String str4) {
        t21 t21Var = new t21();
        Bundle bundle = new Bundle();
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        bundle.putString("skey_title", str);
        bundle.putString("skey_text", str3);
        bundle.putString("skey_key", str2);
        bundle.putInt("skey_input_type", i);
        bundle.putString("skey_regex_filter", str4);
        t21Var.N0(bundle);
        p0(t21Var, "TextSettingsDialog", false);
    }

    @Override // defpackage.yc0
    public void y(String str, int i, int i2, int i3) {
        yc0 yc0Var = (yc0) this.d;
        if (yc0Var != null) {
            yc0Var.y(str, i, i2, i3);
            return;
        }
        ArrayList arrayList = (ArrayList) this.e;
        du duVar = new du();
        duVar.a = 3;
        duVar.b = i;
        duVar.m = i2;
        duVar.n = i3;
        duVar.e = str;
        arrayList.add(duVar);
    }

    public Drawable y0(Drawable drawable, boolean z) {
        if (drawable instanceof nh1) {
            nh1 nh1Var = (nh1) drawable;
            Drawable drawable2 = nh1Var.h;
            if (drawable2 != null) {
                nh1Var.h(y0(drawable2, z));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = y0(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    if (Build.VERSION.SDK_INT >= 23) {
                        nd0.V(layerDrawable, layerDrawable2, i2);
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.e) == null) {
                    this.e = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    @Override // defpackage.yc0
    public void z() {
        yc0 yc0Var = (yc0) this.d;
        if (yc0Var != null) {
            yc0Var.z();
            return;
        }
        ArrayList arrayList = (ArrayList) this.e;
        du duVar = new du();
        duVar.a = 10;
        arrayList.add(duVar);
    }

    public /* synthetic */ bc(Object obj, int i, Object obj2) {
        this.c = i;
        this.e = obj;
        this.d = obj2;
    }

    public /* synthetic */ bc(Object obj, Object obj2, int i, boolean z) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
    }

    public bc(ad0 ad0Var) {
        this.c = 28;
        ev evVar = new ev(15, this);
        this.d = ad0Var;
        this.e = new h7(20, k90.l, evVar, "AsyncInjector");
    }

    public bc(int i) {
        this.c = i;
        int i2 = 1;
        switch (i) {
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                this.e = new ArrayList();
                break;
            case 26:
                this.e = bu0.a(1, 0, oh.d);
                break;
            case 27:
                this.e = new ArrayList();
                break;
            default:
                e71 e71VarB = ec1.b(new st0(Integer.MIN_VALUE, null));
                this.d = e71VarB;
                this.e = new ji(i2, e71VarB);
                break;
        }
    }

    public bc(boolean z) {
        this.c = 22;
        if (z) {
            this.d = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            this.d = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
    }

    public bc(AbsSeekBar absSeekBar) {
        this.c = 0;
        this.d = absSeekBar;
    }

    public /* synthetic */ bc(int i, boolean z) {
        this.c = i;
    }

    public bc(t40 t40Var, int i) {
        this.c = i;
        switch (i) {
            case 24:
                this.d = new CopyOnWriteArrayList();
                this.e = t40Var;
                break;
            default:
                this.d = new Logging("DialogTool");
                this.e = t40Var;
                break;
        }
    }

    public bc(Animation animation) {
        this.c = 23;
        this.d = animation;
        this.e = null;
    }

    public bc(Animator animator) {
        this.c = 23;
        this.d = null;
        this.e = animator;
    }

    public bc(ArrayList arrayList, ArrayList arrayList2) {
        this.c = 25;
        int size = arrayList.size();
        this.d = new int[size];
        this.e = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.d)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.e)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public bc(int i, int i2) {
        this.c = 25;
        this.d = new int[]{i, i2};
        this.e = new float[]{0.0f, 1.0f};
    }

    public bc(int i, int i2, int i3) {
        this.c = 25;
        this.d = new int[]{i, i2, i3};
        this.e = new float[]{0.0f, 0.5f, 1.0f};
    }

    public bc(CardView cardView) {
        this.c = 13;
        this.e = cardView;
    }
}
