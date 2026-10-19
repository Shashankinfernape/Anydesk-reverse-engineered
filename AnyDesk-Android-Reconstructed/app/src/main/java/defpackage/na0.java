package defpackage;

import android.graphics.Bitmap;
import android.util.ArrayMap;
import android.widget.FrameLayout;
import com.anydesk.anydeskandroid.gui.activity.GlowActivity;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class na0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ na0(Object obj, int i, int i2, int i3, int i4, int i5, int i6) {
        this.c = i6;
        this.d = obj;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
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
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        int i2 = this.i;
        int i3 = this.h;
        int i4 = this.g;
        int i5 = this.f;
        int i6 = this.e;
        Object obj = this.d;
        switch (i) {
            case 0:
                Bitmap bitmap = JniAdExt.a;
                GlowActivity glowActivity = (GlowActivity) obj;
                glowActivity.getClass();
                e70 e70Var = new e70(glowActivity, glowActivity, i6);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i2);
                layoutParams.leftMargin = i5;
                layoutParams.topMargin = i4;
                e70Var.setLayoutParams(layoutParams);
                e70Var.getHolder().addCallback(glowActivity);
                ArrayMap arrayMap = glowActivity.f;
                if (!arrayMap.isEmpty()) {
                    e70Var.setZOrderOnTop(true);
                }
                arrayMap.put(Integer.valueOf(i6), e70Var);
                glowActivity.c.addView(e70Var);
                break;
            default:
                Bitmap bitmap2 = JniAdExt.a;
                e70 e70Var2 = (e70) ((GlowActivity) obj).f.get(Integer.valueOf(i6));
                if (e70Var2 != null) {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i3, i2);
                    layoutParams2.leftMargin = i5;
                    layoutParams2.topMargin = i4;
                    e70Var2.setLayoutParams(layoutParams2);
                }
                break;
        }
    }
}
