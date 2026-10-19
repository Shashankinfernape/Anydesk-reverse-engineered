package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.id;
import defpackage.wd1;
import defpackage.xd1;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(wd1 wd1Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = -1;
        iconCompat.c = null;
        iconCompat.d = null;
        iconCompat.e = 0;
        iconCompat.f = 0;
        iconCompat.g = null;
        iconCompat.h = IconCompat.k;
        iconCompat.i = null;
        iconCompat.a = wd1Var.f(-1, 1);
        byte[] bArr = iconCompat.c;
        if (wd1Var.e(2)) {
            Parcel parcel = ((xd1) wd1Var).e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = wd1Var.g(iconCompat.d, 3);
        iconCompat.e = wd1Var.f(iconCompat.e, 4);
        iconCompat.f = wd1Var.f(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) wd1Var.g(iconCompat.g, 6);
        String string = iconCompat.i;
        if (wd1Var.e(7)) {
            string = ((xd1) wd1Var).e.readString();
        }
        iconCompat.i = string;
        String string2 = iconCompat.j;
        if (wd1Var.e(8)) {
            string2 = ((xd1) wd1Var).e.readString();
        }
        iconCompat.j = string2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                id.q("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.c;
                iconCompat.b = bArr3;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, wd1 wd1Var) {
        wd1Var.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            wd1Var.j(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            wd1Var.i(2);
            Parcel parcel = ((xd1) wd1Var).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            wd1Var.i(3);
            ((xd1) wd1Var).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            wd1Var.j(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            wd1Var.j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            wd1Var.i(6);
            ((xd1) wd1Var).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            wd1Var.i(7);
            ((xd1) wd1Var).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            wd1Var.i(8);
            ((xd1) wd1Var).e.writeString(str2);
        }
    }
}
