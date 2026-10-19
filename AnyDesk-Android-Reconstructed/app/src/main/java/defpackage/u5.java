package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.versionedparcelable.ParcelImpl;
import com.samsung.android.knox.EnterpriseDeviceManager;
import defpackage.u5;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class u5 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ u5(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Uri uri;
        Bundle bundle;
        Uri uriK;
        q80 q80Var = null;
        switch (this.a) {
            case 0:
                v5 v5Var = new v5();
                v5Var.c = parcel.readInt();
                return v5Var;
            case 1:
                parcel.getClass();
                return new i6(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 2:
                nc ncVar = new nc(parcel);
                ncVar.c = parcel.readByte() != 0;
                return ncVar;
            case 3:
                return new tf(parcel);
            case 4:
                return new uf(parcel);
            case 5:
                wf wfVar = new wf();
                wfVar.k = 255;
                wfVar.m = -2;
                wfVar.n = -2;
                wfVar.o = -2;
                wfVar.v = Boolean.TRUE;
                wfVar.c = parcel.readInt();
                wfVar.d = (Integer) parcel.readSerializable();
                wfVar.e = (Integer) parcel.readSerializable();
                wfVar.f = (Integer) parcel.readSerializable();
                wfVar.g = (Integer) parcel.readSerializable();
                wfVar.h = (Integer) parcel.readSerializable();
                wfVar.i = (Integer) parcel.readSerializable();
                wfVar.j = (Integer) parcel.readSerializable();
                wfVar.k = parcel.readInt();
                wfVar.l = parcel.readString();
                wfVar.m = parcel.readInt();
                wfVar.n = parcel.readInt();
                wfVar.o = parcel.readInt();
                wfVar.q = parcel.readString();
                wfVar.r = parcel.readString();
                wfVar.s = parcel.readInt();
                wfVar.u = (Integer) parcel.readSerializable();
                wfVar.w = (Integer) parcel.readSerializable();
                wfVar.x = (Integer) parcel.readSerializable();
                wfVar.y = (Integer) parcel.readSerializable();
                wfVar.z = (Integer) parcel.readSerializable();
                wfVar.A = (Integer) parcel.readSerializable();
                wfVar.B = (Integer) parcel.readSerializable();
                wfVar.E = (Integer) parcel.readSerializable();
                wfVar.C = (Integer) parcel.readSerializable();
                wfVar.D = (Integer) parcel.readSerializable();
                wfVar.v = (Boolean) parcel.readSerializable();
                wfVar.p = (Locale) parcel.readSerializable();
                wfVar.F = (Boolean) parcel.readSerializable();
                return wfVar;
            case 6:
                p40 p40Var = new p40();
                p40Var.c = parcel.readString();
                p40Var.d = parcel.readInt();
                return p40Var;
            case 7:
                u40 u40Var = new u40();
                u40Var.g = null;
                u40Var.h = new ArrayList();
                u40Var.i = new ArrayList();
                u40Var.c = parcel.createStringArrayList();
                u40Var.d = parcel.createStringArrayList();
                u40Var.e = (tf[]) parcel.createTypedArray(tf.CREATOR);
                u40Var.f = parcel.readInt();
                u40Var.g = parcel.readString();
                u40Var.h = parcel.createStringArrayList();
                u40Var.i = parcel.createTypedArrayList(uf.CREATOR);
                u40Var.j = parcel.createTypedArrayList(p40.CREATOR);
                return u40Var;
            case 8:
                return new h50(parcel);
            case 9:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new x90((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 10:
                uf0 uf0Var = new uf0();
                uf0Var.c = parcel.readInt();
                uf0Var.d = parcel.readInt();
                uf0Var.e = parcel.readInt() == 1;
                return uf0Var;
            case 11:
                bk0 bk0Var = new bk0(parcel);
                bk0Var.c = ((Integer) parcel.readValue(bk0.class.getClassLoader())).intValue();
                return bk0Var;
            case 12:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new u5(12);
                    public final int c;
                    public final MediaDescriptionCompat d;

                    {
                        this.c = parcel.readInt();
                        this.d = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.c + ", mDescription=" + this.d + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeInt(this.c);
                        this.d.writeToParcel(parcel2, i);
                    }
                };
            case 13:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle extras = mediaDescription.getExtras();
                if (extras != null) {
                    extras.setClassLoader(lk0.class.getClassLoader());
                    uri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
                } else {
                    uri = null;
                }
                if (uri == null) {
                    bundle = extras;
                } else if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                    bundle = null;
                } else {
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = extras;
                }
                if (uri != null) {
                    uriK = uri;
                } else {
                    uriK = Build.VERSION.SDK_INT >= 23 ? nd0.k(objCreateFromParcel) : null;
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, uriK);
                mediaDescriptionCompat.k = objCreateFromParcel;
                return mediaDescriptionCompat;
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                return new MediaMetadataCompat(parcel);
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new u5(15);
                    public final MediaDescriptionCompat c;
                    public final long d;

                    {
                        this.c = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.d = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaSession.QueueItem {Description=" + this.c + ", Id=" + this.d + " }";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        this.c.writeToParcel(parcel2, i);
                        parcel2.writeLong(this.d);
                    }
                };
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.c = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                final Parcelable parcelable2 = parcel.readParcelable(null);
                return new Parcelable(parcelable2) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new u5(17);
                    public final Object c;

                    {
                        this.c = parcelable2;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        Object obj2 = ((MediaSessionCompat$Token) obj).c;
                        Object obj3 = this.c;
                        if (obj3 == null) {
                            return obj2 == null;
                        }
                        if (obj2 == null) {
                            return false;
                        }
                        return obj3.equals(obj2);
                    }

                    public final int hashCode() {
                        Object obj = this.c;
                        if (obj == null) {
                            return 0;
                        }
                        return obj.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeParcelable((Parcelable) this.c, i);
                    }
                };
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                jp0 jp0Var = new jp0(parcel);
                jp0Var.c = parcel.readInt();
                return jp0Var;
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                return new ParcelImpl(parcel);
            case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.c = parcel.readInt();
                parcelableVolumeInfo.e = parcel.readInt();
                parcelableVolumeInfo.f = parcel.readInt();
                parcelableVolumeInfo.g = parcel.readInt();
                parcelableVolumeInfo.d = parcel.readInt();
                return parcelableVolumeInfo;
            case 21:
                return new PlaybackStateCompat(parcel);
            case 22:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 23:
                sy0 sy0Var = new sy0();
                IBinder strongBinder = parcel.readStrongBinder();
                int i = ry0.e;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(q80.c);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof q80)) {
                        p80 p80Var = new p80();
                        p80Var.d = strongBinder;
                        q80Var = p80Var;
                    } else {
                        q80Var = (q80) iInterfaceQueryLocalInterface;
                    }
                }
                sy0Var.c = q80Var;
                return sy0Var;
            case 24:
                w61 w61Var = new w61();
                w61Var.c = parcel.readInt();
                w61Var.d = parcel.readInt();
                w61Var.f = parcel.readInt() == 1;
                int i2 = parcel.readInt();
                if (i2 > 0) {
                    int[] iArr = new int[i2];
                    w61Var.e = iArr;
                    parcel.readIntArray(iArr);
                }
                return w61Var;
            default:
                x61 x61Var = new x61();
                x61Var.c = parcel.readInt();
                x61Var.d = parcel.readInt();
                int i3 = parcel.readInt();
                x61Var.e = i3;
                if (i3 > 0) {
                    int[] iArr2 = new int[i3];
                    x61Var.f = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i4 = parcel.readInt();
                x61Var.g = i4;
                if (i4 > 0) {
                    int[] iArr3 = new int[i4];
                    x61Var.h = iArr3;
                    parcel.readIntArray(iArr3);
                }
                x61Var.j = parcel.readInt() == 1;
                x61Var.k = parcel.readInt() == 1;
                x61Var.l = parcel.readInt() == 1;
                x61Var.i = parcel.readArrayList(w61.class.getClassLoader());
                return x61Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new v5[i];
            case 1:
                return new i6[i];
            case 2:
                return new nc[i];
            case 3:
                return new tf[i];
            case 4:
                return new uf[i];
            case 5:
                return new wf[i];
            case 6:
                return new p40[i];
            case 7:
                return new u40[i];
            case 8:
                return new h50[i];
            case 9:
                return new x90[i];
            case 10:
                return new uf0[i];
            case 11:
                return new bk0[i];
            case 12:
                return new MediaBrowserCompat$MediaItem[i];
            case 13:
                return new MediaDescriptionCompat[i];
            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                return new MediaMetadataCompat[i];
            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                return new MediaSessionCompat$QueueItem[i];
            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                return new MediaSessionCompat$Token[i];
            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                return new jp0[i];
            case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                return new ParcelImpl[i];
            case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                return new ParcelableVolumeInfo[i];
            case 21:
                return new PlaybackStateCompat[i];
            case 22:
                return new RatingCompat[i];
            case 23:
                return new sy0[i];
            case 24:
                return new w61[i];
            default:
                return new x61[i];
        }
    }
}
