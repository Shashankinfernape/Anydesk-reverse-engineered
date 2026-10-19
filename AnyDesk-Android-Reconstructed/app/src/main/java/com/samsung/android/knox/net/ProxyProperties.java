package com.samsung.android.knox.net;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.samsung.android.knox.SupportLibUtils;
import defpackage.id;
import defpackage.nh0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ProxyProperties implements Parcelable {
    public static final Parcelable.Creator<ProxyProperties> CREATOR = new Parcelable.Creator<ProxyProperties>() { // from class: com.samsung.android.knox.net.ProxyProperties.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProxyProperties createFromParcel(Parcel parcel) {
            return new ProxyProperties(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProxyProperties[] newArray(int i) {
            return new ProxyProperties[i];
        }
    };
    private List<AuthConfig> mAuthConfigList;
    private List<String> mExclusionList;
    private String mHostname;
    private String mPacFileUrl;
    private int mPortNumber;

    private ProxyProperties(Parcel parcel) {
        this.mPortNumber = -1;
        this.mExclusionList = new ArrayList();
        this.mAuthConfigList = new ArrayList();
        readFromParcel(parcel);
    }

    public static ProxyProperties convertToNew(android.app.enterprise.devicesettings.ProxyProperties proxyProperties) {
        if (proxyProperties == null) {
            return null;
        }
        ProxyProperties proxyProperties2 = new ProxyProperties();
        proxyProperties2.setHostname(proxyProperties.getHostname());
        proxyProperties2.setPortNumber(proxyProperties.getPortNumber());
        proxyProperties2.setExclusionList(proxyProperties.getExclusionList());
        try {
            proxyProperties2.setPacFileUrl(proxyProperties.getPacFileUrl());
        } catch (NoSuchMethodError unused) {
        }
        try {
            proxyProperties2.setAuthConfigList(AuthConfig.convertToNewList(proxyProperties.getAuthConfigList()));
        } catch (NoSuchMethodError unused2) {
        }
        return proxyProperties2;
    }

    public static android.app.enterprise.devicesettings.ProxyProperties convertToOld(ProxyProperties proxyProperties) {
        if (proxyProperties == null) {
            return null;
        }
        try {
            android.app.enterprise.devicesettings.ProxyProperties proxyProperties2 = new android.app.enterprise.devicesettings.ProxyProperties();
            proxyProperties2.setHostname(proxyProperties.getHostname());
            proxyProperties2.setPortNumber(proxyProperties.getPortNumber());
            proxyProperties2.setExclusionList(proxyProperties.getExclusionList());
            try {
                proxyProperties2.setPacFileUrl(proxyProperties.getPacFileUrl());
            } catch (NoSuchMethodError unused) {
                if (proxyProperties.getPacFileUrl() != null) {
                    nh0.q(SupportLibUtils.buildMethodErrorMsg(ProxyProperties.class, "setPacFileUrl", new Class[]{String.class}, 20));
                    return null;
                }
            }
            List<com.sec.enterprise.network.AuthConfig> listConvertToOldList = AuthConfig.convertToOldList(proxyProperties.getAuthConfigList());
            try {
                proxyProperties2.setAuthConfigList(listConvertToOldList);
            } catch (NoSuchMethodError unused2) {
                if (listConvertToOldList == null || !listConvertToOldList.isEmpty()) {
                    nh0.q(SupportLibUtils.buildMethodErrorMsg(ProxyProperties.class, "setAuthConfigList", new Class[]{List.class}, 20));
                    return null;
                }
            }
            return proxyProperties2;
        } catch (NoClassDefFoundError unused3) {
            id.g(SupportLibUtils.buildClassErrorMsg(ProxyProperties.class, 17));
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<AuthConfig> getAuthConfigList() {
        return this.mAuthConfigList;
    }

    public List<String> getExclusionList() {
        return this.mExclusionList;
    }

    public String getHostname() {
        return this.mHostname;
    }

    public String getPacFileUrl() {
        return this.mPacFileUrl;
    }

    public int getPortNumber() {
        return this.mPortNumber;
    }

    public boolean isAuthenticationConfigured() {
        List<AuthConfig> list = this.mAuthConfigList;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isValid() {
        boolean zIsEmpty = TextUtils.isEmpty(this.mPacFileUrl);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.mHostname);
        if (!zIsEmpty && !zIsEmpty2) {
            return false;
        }
        if (!isAuthenticationConfigured()) {
            return true;
        }
        for (AuthConfig authConfig : this.mAuthConfigList) {
            if (authConfig == null || !authConfig.isValid()) {
                return false;
            }
        }
        return true;
    }

    public void readFromParcel(Parcel parcel) {
        this.mHostname = parcel.readString();
        this.mPortNumber = parcel.readInt();
        parcel.readStringList(this.mExclusionList);
        this.mPacFileUrl = parcel.readString();
        parcel.readList(this.mAuthConfigList, AuthConfig.class.getClassLoader());
    }

    public void setAuthConfigList(List<AuthConfig> list) {
        this.mAuthConfigList = list;
    }

    public void setExclusionList(List<String> list) {
        this.mExclusionList = list;
    }

    public void setHostname(String str) {
        this.mHostname = str;
    }

    public void setPacFileUrl(String str) {
        this.mPacFileUrl = str;
    }

    public void setPortNumber(int i) {
        this.mPortNumber = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mHostname);
        parcel.writeInt(this.mPortNumber);
        parcel.writeStringList(this.mExclusionList);
        parcel.writeString(this.mPacFileUrl);
        parcel.writeList(this.mAuthConfigList);
    }

    public ProxyProperties() {
        this.mPortNumber = -1;
        this.mExclusionList = new ArrayList();
        this.mAuthConfigList = new ArrayList();
    }
}
