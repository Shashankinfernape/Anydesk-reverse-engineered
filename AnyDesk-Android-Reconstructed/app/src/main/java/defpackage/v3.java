package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public final class v3 {
    public final Object a;

    public /* synthetic */ v3(Object obj) {
        this.a = obj;
    }

    public static v3 a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        return new v3(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
    }
}
