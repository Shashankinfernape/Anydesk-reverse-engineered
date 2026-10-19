package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r10 extends p10 {
    public StateListAnimator B;

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
    @Override // defpackage.p10
    public final void b(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.o;
        if (i == 21) {
            floatingActionButton.refreshDrawableState();
        } else if (floatingActionButton.getStateListAnimator() == this.B) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(p10.v, f(f, f3));
            stateListAnimator.addState(p10.w, f(f, f2));
            stateListAnimator.addState(p10.x, f(f, f2));
            stateListAnimator.addState(p10.y, f(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L));
            if (i >= 22 && i <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(p10.u);
            stateListAnimator.addState(p10.z, animatorSet);
            stateListAnimator.addState(p10.A, f(0.0f, 0.0f));
            this.B = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (((FloatingActionButton) this.p.d).m || (this.f && floatingActionButton.getSizeDimension() < this.k)) {
            e();
        }
    }

    public final AnimatorSet f(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.o;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(p10.u);
        return animatorSet;
    }
}
