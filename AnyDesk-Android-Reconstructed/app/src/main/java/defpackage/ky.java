package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ky extends af1 {
    public final /* synthetic */ rl f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky(rl rlVar) {
        super(8);
        this.f = rlVar;
    }

    @Override // defpackage.af1
    public final boolean C(int i, int i2, Bundle bundle) {
        int i3;
        rl rlVar = this.f;
        Chip chip = rlVar.i;
        if (i == -1) {
            WeakHashMap weakHashMap = oe1.a;
            return chip.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return rlVar.o(i);
        }
        if (i2 == 2) {
            return rlVar.j(i);
        }
        boolean z = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = rlVar.h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = rlVar.k) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                rlVar.k = Integer.MIN_VALUE;
                chip.invalidate();
                rlVar.p(i3, 65536);
            }
            rlVar.k = i;
            chip.invalidate();
            rlVar.p(i, 32768);
            return true;
        }
        if (i2 == 128) {
            if (rlVar.k != i) {
                return false;
            }
            rlVar.k = Integer.MIN_VALUE;
            chip.invalidate();
            rlVar.p(i, 65536);
            return true;
        }
        Chip chip2 = rlVar.n;
        if (i2 == 16) {
            if (i == 0) {
                return chip2.performClick();
            }
            if (i == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.j;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z = true;
                }
                if (chip2.v) {
                    chip2.u.p(1, 1);
                }
            }
        }
        return z;
    }

    @Override // defpackage.af1
    public final w3 w(int i) {
        return new w3(AccessibilityNodeInfo.obtain(this.f.n(i).a));
    }

    @Override // defpackage.af1
    public final w3 x(int i) {
        rl rlVar = this.f;
        int i2 = i == 2 ? rlVar.k : rlVar.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return w(i2);
    }
}
