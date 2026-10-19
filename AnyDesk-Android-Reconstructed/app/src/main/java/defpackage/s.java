package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.anydesk.anydeskandroid.PermissionProfile;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.Roster;
import com.anydesk.jni.JniAdExt;
import java.util.ArrayList;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class s extends iw0 {
    public final /* synthetic */ int d;
    public final Object e;
    public Object f;

    public s() {
        this.d = 2;
        k0 k0Var = new k0(1);
        zf0 zf0Var = new zf0(this);
        af1 af1Var = new af1(16, this);
        synchronized (ec1.a) {
            try {
                if (ec1.b == null) {
                    ec1.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        te teVar = new te(af1Var, new bc(ec1.b, k0Var, 10, false));
        this.e = teVar;
        teVar.d.add(zf0Var);
        this.f = null;
        this.c = 2;
        this.a.g();
    }

    @Override // defpackage.iw0
    public final int a() {
        switch (this.d) {
            case 0:
                return ((ArrayList) this.e).size();
            case 1:
                return ((ArrayList) this.e).size();
            case 2:
                return ((te) this.e).f.size();
            case 3:
                return ((ArrayList) this.e).size();
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override // defpackage.iw0
    public long b(int i) {
        switch (this.d) {
            case 0:
                return ((Roster) ((ArrayList) this.e).get(i)).mId;
            case 1:
                return ((String) ((ArrayList) this.e).get(i)).hashCode();
            case 2:
            case 3:
            default:
                return super.b(i);
            case 4:
                return ((PermissionProfile) ((ArrayList) this.e).get(i)).hashCode();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.iw0
    public final void e(hx0 hx0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = this.d;
        char c = 1;
        Object obj = this.e;
        int i6 = 0;
        switch (i5) {
            case 0:
                r rVar = (r) hx0Var;
                Roster roster = (Roster) ((ArrayList) obj).get(i);
                View view = rVar.u;
                view.setOnClickListener(new p(this, i6, roster));
                view.setOnLongClickListener(new q(this, roster, i6));
                rVar.w.setText(roster.mName);
                rVar.v.setChecked(roster.mId == JniAdExt.P2());
                break;
            case 1:
                String str = (String) ((ArrayList) obj).get(i);
                TextView textView = ((i5) hx0Var).u;
                textView.setOnLongClickListener(new t0(this, i, c == true ? 1 : 0));
                textView.setText(str);
                break;
            case 2:
                gl glVar = (gl) hx0Var;
                fl flVar = (fl) ((te) obj).f.get(i);
                boolean z = flVar.e;
                Bitmap bitmap = flVar.f;
                if (z) {
                    i2 = R.color.colorChatOtherSide;
                    i3 = 8;
                    i4 = 0;
                } else {
                    i2 = R.color.colorChatOwnSide;
                    i3 = 0;
                    i4 = 8;
                }
                View view2 = glVar.a;
                ImageView imageView = glVar.A;
                Context context = view2.getContext();
                Looper looper = t70.a;
                glVar.w.setBackgroundTintList(uj.m(context, i2));
                glVar.u.setVisibility(i3);
                glVar.v.setVisibility(i4);
                glVar.x.setText(flVar.d);
                glVar.y.setText(flVar.c);
                glVar.z.setText(flVar.b);
                if (bitmap != null) {
                    imageView.setVisibility(0);
                    imageView.setImageBitmap(bitmap);
                    imageView.setColorFilter(flVar.g);
                } else {
                    imageView.setVisibility(8);
                }
                break;
            case 3:
                jz jzVar = (jz) hx0Var;
                ArrayList arrayList = (ArrayList) obj;
                boolean z2 = i != 0 || (arrayList.size() == 1 && ((String) arrayList.get(0)).isEmpty());
                String str2 = (String) arrayList.get(i);
                TextView textView2 = jzVar.u;
                TextView textView3 = jzVar.v;
                textView2.setVisibility(z2 ? 0 : 8);
                textView3.setText(lg.c().e(str2.substring(str2.lastIndexOf("/") + 1)));
                textView3.setOnClickListener(new p(this, 5, str2));
                break;
            default:
                hu0 hu0Var = (hu0) hx0Var;
                PermissionProfile permissionProfile = (PermissionProfile) ((ArrayList) obj).get(i);
                View view3 = hu0Var.u;
                view3.setOnClickListener(new p(this, 9, permissionProfile));
                view3.setOnLongClickListener(new q(this, permissionProfile, 2));
                TextView textView4 = hu0Var.w;
                textView4.setText(permissionProfile.b);
                if (permissionProfile.c) {
                    textView4.setTypeface(Typeface.DEFAULT);
                } else {
                    textView4.setTypeface(Typeface.DEFAULT_BOLD);
                }
                hu0Var.v.setVisibility(permissionProfile.e ? 0 : 4);
                break;
        }
    }

    @Override // defpackage.iw0
    public final hx0 f(ViewGroup viewGroup, int i) {
        switch (this.d) {
            case 0:
                return new r(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.abook_roster, viewGroup, false));
            case 1:
                return new i5(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.acl_item, viewGroup, false));
            case 2:
                return new gl(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.chat_message, viewGroup, false));
            case 3:
                return new jz(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.filemanager_dirpath_item, viewGroup, false));
            default:
                return new hu0(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.permission_profile_item, viewGroup, false));
        }
    }

    public void i(String str) {
        ArrayList arrayList = (ArrayList) this.e;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strReplaceAll = str.replaceAll("(/)\\1+", "$1");
        for (int iIndexOf = strReplaceAll.indexOf("/"); iIndexOf >= 0; iIndexOf = strReplaceAll.indexOf("/", iIndexOf + 1)) {
            arrayList.add(strReplaceAll.substring(0, iIndexOf));
        }
        if (str.endsWith("/")) {
            return;
        }
        arrayList.add(strReplaceAll);
    }

    public s(int i, ArrayList arrayList) {
        this.d = i;
        switch (i) {
            case 1:
                this.f = null;
                this.e = arrayList;
                h();
                break;
            case 2:
            default:
                this.f = null;
                this.e = arrayList;
                h();
                break;
            case 3:
                this.f = null;
                this.e = arrayList;
                break;
            case 4:
                this.f = null;
                this.e = arrayList;
                h();
                break;
        }
    }
}
