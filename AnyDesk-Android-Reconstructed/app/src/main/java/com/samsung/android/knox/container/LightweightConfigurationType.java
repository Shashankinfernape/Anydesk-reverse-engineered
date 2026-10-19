package com.samsung.android.knox.container;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.samsung.android.knox.SupportLibUtils;
import defpackage.id;

/* JADX INFO: loaded from: classes.dex */
public class LightweightConfigurationType extends KnoxConfigurationType {
    public static final Parcelable.Creator<LightweightConfigurationType> CREATOR = new Parcelable.Creator<LightweightConfigurationType>() { // from class: com.samsung.android.knox.container.LightweightConfigurationType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LightweightConfigurationType createFromParcel(Parcel parcel) {
            return new LightweightConfigurationType(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LightweightConfigurationType[] newArray(int i) {
            Log.d(LightweightConfigurationType.TAG, "LightweightConfigurationType[] array to be created");
            return new LightweightConfigurationType[i];
        }
    };
    private static final String TAG = "LightweightConfigurationType";
    private String mFolderDisabledChangeLayout;
    private String mFolderHeaderIcon;
    private String mFolderHeaderTitle;

    public LightweightConfigurationType(Parcel parcel) {
        super(parcel);
        String str = null;
        this.mFolderHeaderTitle = null;
        this.mFolderHeaderIcon = null;
        this.mFolderDisabledChangeLayout = null;
        String string = parcel.readString();
        this.mFolderHeaderIcon = (string == null || string.isEmpty()) ? null : string;
        String string2 = parcel.readString();
        this.mFolderHeaderTitle = (string2 == null || string2.isEmpty()) ? null : string2;
        String string3 = parcel.readString();
        if (string3 != null && !string3.isEmpty()) {
            str = string3;
        }
        this.mFolderDisabledChangeLayout = str;
    }

    public static LightweightConfigurationType convertToNew(com.sec.enterprise.knox.container.LightweightConfigurationType lightweightConfigurationType) {
        if (lightweightConfigurationType == null) {
            return null;
        }
        LightweightConfigurationType lightweightConfigurationType2 = new LightweightConfigurationType();
        KnoxConfigurationType.convertToNew(lightweightConfigurationType2, lightweightConfigurationType);
        lightweightConfigurationType2.setFolderHeaderTitle(lightweightConfigurationType.getFolderHeaderTitle());
        return lightweightConfigurationType2;
    }

    public static com.sec.enterprise.knox.container.LightweightConfigurationType convertToOld(LightweightConfigurationType lightweightConfigurationType) {
        if (lightweightConfigurationType == null) {
            return null;
        }
        try {
            com.sec.enterprise.knox.container.LightweightConfigurationType lightweightConfigurationType2 = new com.sec.enterprise.knox.container.LightweightConfigurationType();
            KnoxConfigurationType.convertToOld(lightweightConfigurationType, lightweightConfigurationType2);
            lightweightConfigurationType2.setFolderHeaderTitle(lightweightConfigurationType.getFolderHeaderTitle());
            return lightweightConfigurationType2;
        } catch (NoClassDefFoundError unused) {
            id.g(SupportLibUtils.buildClassErrorMsg(LightweightConfigurationType.class, 12));
            return null;
        }
    }

    private void setFolderDisabledChangeLayout(String str) {
        this.mFolderDisabledChangeLayout = str;
    }

    private void setFolderHeaderIcon(String str) {
        this.mFolderHeaderIcon = str;
    }

    @Override // com.samsung.android.knox.container.KnoxConfigurationType
    public LightweightConfigurationType clone(String str) {
        if (str == null || str.isEmpty()) {
            Log.d(TAG, "clone(): name is either null or empty, hence returning null");
            return null;
        }
        LightweightConfigurationType lightweightConfigurationType = new LightweightConfigurationType();
        cloneConfiguration(lightweightConfigurationType, str);
        lightweightConfigurationType.setFolderHeaderIcon(this.mFolderHeaderIcon);
        lightweightConfigurationType.setFolderHeaderTitle(this.mFolderHeaderTitle);
        lightweightConfigurationType.setFolderDisabledChangeLayout(this.mFolderDisabledChangeLayout);
        return lightweightConfigurationType;
    }

    @Override // com.samsung.android.knox.container.KnoxConfigurationType, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getFolderHeaderTitle() {
        return this.mFolderHeaderTitle;
    }

    public void setFolderHeaderTitle(String str) {
        this.mFolderHeaderTitle = str;
    }

    @Override // com.samsung.android.knox.container.KnoxConfigurationType, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        String str = this.mFolderHeaderIcon;
        if (str != null) {
            parcel.writeString(str);
        } else {
            parcel.writeString("");
        }
        String str2 = this.mFolderHeaderTitle;
        if (str2 != null) {
            parcel.writeString(str2);
        } else {
            parcel.writeString("");
        }
        String str3 = this.mFolderDisabledChangeLayout;
        if (str3 != null) {
            parcel.writeString(str3);
        } else {
            parcel.writeString("");
        }
    }

    private LightweightConfigurationType() {
        this.mFolderHeaderTitle = null;
        this.mFolderHeaderIcon = null;
        this.mFolderDisabledChangeLayout = null;
    }
}
