package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public final class f40 extends AnimationSet implements Runnable {
    public final ViewGroup c;
    public final View d;
    public boolean e;
    public boolean f;
    public boolean g;

    public f40(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.g = true;
        this.c = viewGroup;
        this.d = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.g = true;
        if (this.e) {
            return !this.f;
        }
        if (!super.getTransformation(j, transformation)) {
            this.e = true;
            ar0.a(this.c, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.e;
        ViewGroup viewGroup = this.c;
        if (z || !this.g) {
            viewGroup.endViewTransition(this.d);
            this.f = true;
        } else {
            this.g = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.g = true;
        if (this.e) {
            return !this.f;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.e = true;
            ar0.a(this.c, this);
        }
        return true;
    }
}
