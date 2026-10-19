package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.wd1;
import defpackage.xd1;
import defpackage.yd1;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(wd1 wd1Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        yd1 yd1VarH = remoteActionCompat.a;
        boolean z = true;
        if (wd1Var.e(1)) {
            yd1VarH = wd1Var.h();
        }
        remoteActionCompat.a = (IconCompat) yd1VarH;
        CharSequence charSequence = remoteActionCompat.b;
        if (wd1Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((xd1) wd1Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (wd1Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((xd1) wd1Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) wd1Var.g(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (wd1Var.e(5)) {
            z2 = ((xd1) wd1Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!wd1Var.e(6)) {
            z = z3;
        } else if (((xd1) wd1Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, wd1 wd1Var) {
        wd1Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        wd1Var.i(1);
        wd1Var.k(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        wd1Var.i(2);
        Parcel parcel = ((xd1) wd1Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        wd1Var.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        wd1Var.i(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        wd1Var.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        wd1Var.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
