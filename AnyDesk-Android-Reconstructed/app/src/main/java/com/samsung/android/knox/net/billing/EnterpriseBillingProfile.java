package com.samsung.android.knox.net.billing;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.knox.SupportLibUtils;
import defpackage.id;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EnterpriseBillingProfile implements Parcelable {
    public static Parcelable.Creator<EnterpriseBillingProfile> CREATOR = new Parcelable.Creator<EnterpriseBillingProfile>() { // from class: com.samsung.android.knox.net.billing.EnterpriseBillingProfile.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EnterpriseBillingProfile createFromParcel(Parcel parcel) {
            EnterpriseBillingProfile enterpriseBillingProfile = new EnterpriseBillingProfile(parcel.readString());
            enterpriseBillingProfile.addApnsToProfile(parcel.readArrayList(EnterpriseBillingProfile.class.getClassLoader()));
            return enterpriseBillingProfile;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EnterpriseBillingProfile[] newArray(int i) {
            return new EnterpriseBillingProfile[i];
        }
    };
    private final List<EnterpriseApn> apns;
    private final String profileName;

    public EnterpriseBillingProfile(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException();
        }
        this.profileName = str;
        this.apns = new ArrayList();
    }

    public static EnterpriseBillingProfile convertToNew(com.sec.enterprise.knox.billing.EnterpriseBillingProfile enterpriseBillingProfile) {
        if (enterpriseBillingProfile == null) {
            return null;
        }
        EnterpriseBillingProfile enterpriseBillingProfile2 = new EnterpriseBillingProfile(enterpriseBillingProfile.getProfileName());
        enterpriseBillingProfile2.addApnsToProfile(EnterpriseApn.convertToNewList(enterpriseBillingProfile.getApnsFromProfile()));
        return enterpriseBillingProfile2;
    }

    public static com.sec.enterprise.knox.billing.EnterpriseBillingProfile convertToOld(EnterpriseBillingProfile enterpriseBillingProfile) {
        if (enterpriseBillingProfile == null) {
            return null;
        }
        try {
            com.sec.enterprise.knox.billing.EnterpriseBillingProfile enterpriseBillingProfile2 = new com.sec.enterprise.knox.billing.EnterpriseBillingProfile(enterpriseBillingProfile.getProfileName());
            enterpriseBillingProfile2.addApnsToProfile(EnterpriseApn.convertToOldList(enterpriseBillingProfile.getApnsFromProfile()));
            return enterpriseBillingProfile2;
        } catch (NoClassDefFoundError unused) {
            id.g(SupportLibUtils.buildClassErrorMsg(EnterpriseBillingProfile.class, 13));
            return null;
        }
    }

    public void addApnToProfile(EnterpriseApn enterpriseApn) {
        if (enterpriseApn != null) {
            this.apns.add(enterpriseApn);
        }
    }

    public void addApnsToProfile(List<EnterpriseApn> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.apns.addAll(list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<EnterpriseApn> getApnsFromProfile() {
        return this.apns;
    }

    public String getProfileName() {
        return this.profileName;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.profileName);
        parcel.writeList(this.apns);
    }
}
