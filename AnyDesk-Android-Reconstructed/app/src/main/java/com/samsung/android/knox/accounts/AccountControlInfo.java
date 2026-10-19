package com.samsung.android.knox.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.knox.ControlInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AccountControlInfo extends ControlInfo {
    public static final Parcelable.Creator<AccountControlInfo> CREATOR = new Parcelable.Creator<AccountControlInfo>() { // from class: com.samsung.android.knox.accounts.AccountControlInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AccountControlInfo createFromParcel(Parcel parcel) {
            return new AccountControlInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AccountControlInfo[] newArray(int i) {
            return new AccountControlInfo[i];
        }
    };

    private AccountControlInfo(Parcel parcel) {
        readFromParcel(parcel);
    }

    public static AccountControlInfo convertToNew(android.app.enterprise.AccountControlInfo accountControlInfo) {
        if (accountControlInfo == null) {
            return null;
        }
        AccountControlInfo accountControlInfo2 = new AccountControlInfo();
        accountControlInfo2.adminPackageName = accountControlInfo.adminPackageName;
        accountControlInfo2.entries = new ArrayList(accountControlInfo.entries);
        return accountControlInfo2;
    }

    public static List<AccountControlInfo> convertToNewList(List<android.app.enterprise.AccountControlInfo> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<android.app.enterprise.AccountControlInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(convertToNew(it.next()));
        }
        return arrayList;
    }

    public AccountControlInfo() {
    }
}
