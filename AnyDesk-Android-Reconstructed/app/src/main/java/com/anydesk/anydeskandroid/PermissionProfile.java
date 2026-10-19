package com.anydesk.anydeskandroid;

import com.anydesk.jni.JniAdExt;
import defpackage.du0;
import defpackage.io;
import defpackage.j80;
import defpackage.nd0;
import defpackage.s30;
import defpackage.t70;
import java.util.HashSet;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
public class PermissionProfile implements j80 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final HashSet k;
    public final HashSet l;
    public final HashSet m;

    public PermissionProfile(byte[] bArr, byte[] bArr2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, int i2, int i3) {
        String strT = nd0.t(bArr);
        String strT2 = nd0.t(bArr2);
        HashSet hashSetC = c(i);
        HashSet hashSetC2 = c(i2);
        HashSet hashSetC3 = c(i3);
        this.a = strT;
        this.c = z;
        this.d = z2;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.b = strT2;
        this.k = hashSetC;
        this.l = hashSetC2;
        this.m = hashSetC3;
    }

    public static HashSet c(int i) {
        HashSet hashSet = new HashSet();
        for (du0 du0Var : du0.values()) {
            if (du0Var != du0.pf_feature_count && t70.e(i, 1 << du0Var.c)) {
                hashSet.add(du0Var);
            }
        }
        return hashSet;
    }

    public static boolean d(du0 du0Var) {
        boolean zG2;
        if (du0Var == du0.pf_file_manager) {
            zG2 = JniAdExt.g2(io.KEY_FEATURE_FILEMANAGER);
        } else if (du0Var == du0.pf_tcp_tunnel) {
            zG2 = JniAdExt.g2(io.KEY_FEATURE_TCP_TUNNELING);
        } else if (du0Var == du0.pf_vpn) {
            zG2 = JniAdExt.g2(io.KEY_FEATURE_VPN);
        } else {
            if (du0Var != du0.pf_record_session) {
                return false;
            }
            zG2 = JniAdExt.g2(io.KEY_FEATURE_SESSION_RECORDING);
        }
        return !zG2;
    }

    public final boolean a(du0 du0Var, Hashtable hashtable) {
        s30 s30Var;
        if (d(du0Var)) {
            return false;
        }
        if (hashtable == null || (s30Var = (s30) hashtable.get(du0Var)) == null || s30Var == s30.fp_user_setting || s30Var == s30.fp_admin_setting) {
            return this.k.contains(du0Var);
        }
        return false;
    }

    public final boolean b(du0 du0Var) {
        if (d(du0Var)) {
            return false;
        }
        return !this.l.contains(du0Var);
    }

    @Override // defpackage.j80
    public final boolean matchesFilter(String[] strArr) {
        if (strArr == null) {
            return true;
        }
        for (String str : strArr) {
            if (!this.a.toLowerCase().contains(str) && !this.b.toLowerCase().contains(str)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return this.b;
    }
}
