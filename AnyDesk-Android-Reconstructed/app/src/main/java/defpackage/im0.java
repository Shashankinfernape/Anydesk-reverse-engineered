package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class im0 {
    public final i51 a = new i51(0);
    public final i51 b = new i51(0);

    public static im0 a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static im0 b(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return c(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    public static im0 c(ArrayList arrayList) {
        im0 im0Var = new im0();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                id.p(animator, "Animator must be an ObjectAnimator: ");
                return null;
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            im0Var.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = x8.b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = x8.c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = x8.d;
            }
            mm0 mm0Var = new mm0();
            mm0Var.d = 0;
            mm0Var.e = 1;
            mm0Var.a = startDelay;
            mm0Var.b = duration;
            mm0Var.c = interpolator;
            mm0Var.d = objectAnimator.getRepeatCount();
            mm0Var.e = objectAnimator.getRepeatMode();
            im0Var.a.put(propertyName, mm0Var);
        }
        return im0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof im0) {
            return this.a.equals(((im0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "\n" + im0.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
