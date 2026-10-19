package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class c81 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public c81(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        b81 b81Var = new b81(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Menu menu2 = b81Var.a;
            if (eventType != i) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z2 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            b81Var.b = 0;
                            b81Var.c = 0;
                            b81Var.d = 0;
                            b81Var.e = 0;
                            b81Var.f = true;
                            b81Var.g = true;
                        } else if (name2.equals("item")) {
                            if (!b81Var.h) {
                                wk0 wk0Var = b81Var.z;
                                if (wk0Var == null || !wk0Var.b.hasSubMenu()) {
                                    b81Var.h = true;
                                    b81Var.b(menu2.add(b81Var.b, b81Var.i, b81Var.j, b81Var.k));
                                } else {
                                    b81Var.h = true;
                                    b81Var.b(menu2.addSubMenu(b81Var.b, b81Var.i, b81Var.j, b81Var.k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                    }
                }
            } else if (z2) {
                xmlPullParser2 = xmlPullParser;
            } else {
                String name3 = xmlPullParser.getName();
                boolean zEquals = name3.equals("group");
                Context context = this.c;
                if (zEquals) {
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yv0.q);
                    b81Var.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                    b81Var.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                    b81Var.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                    b81Var.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                    b81Var.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                    b81Var.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                    typedArrayObtainStyledAttributes.recycle();
                    xmlPullParser2 = xmlPullParser;
                } else if (name3.equals("item")) {
                    TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, yv0.r);
                    b81Var.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                    b81Var.j = (typedArrayObtainStyledAttributes2.getInt(5, b81Var.c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, b81Var.d) & 65535);
                    b81Var.k = typedArrayObtainStyledAttributes2.getText(7);
                    b81Var.l = typedArrayObtainStyledAttributes2.getText(8);
                    b81Var.m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                    String string = typedArrayObtainStyledAttributes2.getString(9);
                    b81Var.n = string == null ? (char) 0 : string.charAt(0);
                    b81Var.o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                    String string2 = typedArrayObtainStyledAttributes2.getString(10);
                    b81Var.p = string2 == null ? (char) 0 : string2.charAt(0);
                    b81Var.q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                    if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                        b81Var.r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                    } else {
                        b81Var.r = b81Var.e;
                    }
                    b81Var.s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                    b81Var.t = typedArrayObtainStyledAttributes2.getBoolean(4, b81Var.f);
                    b81Var.u = typedArrayObtainStyledAttributes2.getBoolean(1, b81Var.g);
                    b81Var.v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                    b81Var.y = typedArrayObtainStyledAttributes2.getString(12);
                    b81Var.w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                    b81Var.x = typedArrayObtainStyledAttributes2.getString(15);
                    String string3 = typedArrayObtainStyledAttributes2.getString(14);
                    boolean z3 = string3 != null;
                    if (z3 && b81Var.w == 0 && b81Var.x == null) {
                        b81Var.z = (wk0) b81Var.a(string3, f, this.b);
                    } else {
                        if (z3) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        b81Var.z = null;
                    }
                    b81Var.A = typedArrayObtainStyledAttributes2.getText(17);
                    b81Var.B = typedArrayObtainStyledAttributes2.getText(22);
                    if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                        b81Var.D = av.b(typedArrayObtainStyledAttributes2.getInt(19, -1), b81Var.D);
                    } else {
                        b81Var.D = null;
                    }
                    if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                        if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = uj.m(context, resourceId)) == null) {
                            colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                        }
                        b81Var.C = colorStateList;
                    } else {
                        b81Var.C = null;
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                    b81Var.h = false;
                    xmlPullParser2 = xmlPullParser;
                } else if (name3.equals("menu")) {
                    b81Var.h = true;
                    SubMenu subMenuAddSubMenu = menu2.addSubMenu(b81Var.b, b81Var.i, b81Var.j, b81Var.k);
                    b81Var.b(subMenuAddSubMenu.getItem());
                    xmlPullParser2 = xmlPullParser;
                    b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                } else {
                    xmlPullParser2 = xmlPullParser;
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlPullParser2.next();
            i = 2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof rk0)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof rk0) {
                    rk0 rk0Var = (rk0) menu;
                    if (!rk0Var.p) {
                        rk0Var.w();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((rk0) menu).v();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((rk0) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
