package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class xs extends nb {
    public final boolean c;
    public boolean d;
    public bc e;

    public xs(a61 a61Var, aj ajVar, boolean z) {
        super(a61Var, ajVar);
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f7 A[Catch: RuntimeException -> 0x00fd, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x00fd, blocks: (B:78:0x00f1, B:80:0x00f7), top: B:91:0x00f1 }] */
    public final bc r(Context context) {
        int i;
        bc bcVar;
        Animator animatorLoadAnimator;
        int I;
        if (this.d) {
            return this.e;
        }
        a61 a61Var = (a61) this.a;
        c40 c40Var = a61Var.c;
        boolean z = a61Var.a == 2;
        a40 a40Var = c40Var.K;
        int i2 = a40Var == null ? 0 : a40Var.f;
        if (this.c) {
            if (z) {
                if (a40Var == null) {
                    i = 0;
                } else {
                    i = a40Var.d;
                }
            } else if (a40Var == null) {
                i = 0;
            } else {
                i = a40Var.e;
            }
        } else if (z) {
            if (a40Var == null) {
                i = 0;
            } else {
                i = a40Var.b;
            }
        } else if (a40Var == null) {
            i = 0;
        } else {
            i = a40Var.c;
        }
        c40Var.M0(0, 0, 0, 0);
        ViewGroup viewGroup = c40Var.G;
        bc bcVar2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            c40Var.G.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = c40Var.G;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (i == 0 && i2 != 0) {
                if (i2 == 4097) {
                    i = z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                } else if (i2 != 8194) {
                    if (i2 == 8197) {
                        I = z ? uj.I(context, android.R.attr.activityCloseEnterAnimation) : uj.I(context, android.R.attr.activityCloseExitAnimation);
                    } else if (i2 == 4099) {
                        i = z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                    } else if (i2 != 4100) {
                        i = -1;
                    } else {
                        I = z ? uj.I(context, android.R.attr.activityOpenEnterAnimation) : uj.I(context, android.R.attr.activityOpenExitAnimation);
                    }
                    i = I;
                } else {
                    i = z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                }
            }
            if (i != 0) {
                boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(i));
                if (zEquals) {
                    try {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, i);
                        if (animationLoadAnimation != null) {
                            bcVar = new bc(animationLoadAnimation);
                            bcVar2 = bcVar;
                        }
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                        try {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                            if (animatorLoadAnimator != null) {
                                bcVar = new bc(animatorLoadAnimator);
                                bcVar2 = bcVar;
                            }
                        } catch (RuntimeException e2) {
                            if (zEquals) {
                                throw e2;
                            }
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, i);
                            if (animationLoadAnimation2 != null) {
                                bcVar2 = new bc(animationLoadAnimation2);
                            }
                        }
                    }
                } else {
                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                    if (animatorLoadAnimator != null) {
                        bcVar = new bc(animatorLoadAnimator);
                        bcVar2 = bcVar;
                    }
                }
            }
        }
        this.e = bcVar2;
        this.d = true;
        return bcVar2;
    }
}
