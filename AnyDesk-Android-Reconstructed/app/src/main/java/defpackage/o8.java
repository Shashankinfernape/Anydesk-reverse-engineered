package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class o8 extends ds {
    public final boolean A;
    public final ObjectAnimator z;

    public o8(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        p8 p8Var = new p8();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        p8Var.b = numberOfFrames2;
        int[] iArr = p8Var.a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            p8Var.a = new int[numberOfFrames2];
        }
        int[] iArr2 = p8Var.a;
        int i3 = 0;
        for (int i4 = 0; i4 < numberOfFrames2; i4++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames2 - i4) - 1 : i4);
            iArr2[i4] = duration;
            i3 += duration;
        }
        p8Var.c = i3;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(p8Var.c);
        objectAnimatorOfInt.setInterpolator(p8Var);
        this.A = z2;
        this.z = objectAnimatorOfInt;
    }

    @Override // defpackage.ds
    public final void B() {
        this.z.reverse();
    }

    @Override // defpackage.ds
    public final void D() {
        this.z.start();
    }

    @Override // defpackage.ds
    public final void E() {
        this.z.cancel();
    }

    @Override // defpackage.ds
    public final boolean c() {
        return this.A;
    }
}
