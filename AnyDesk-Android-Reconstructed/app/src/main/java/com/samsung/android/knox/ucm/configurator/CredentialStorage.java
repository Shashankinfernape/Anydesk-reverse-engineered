package com.samsung.android.knox.ucm.configurator;

import android.os.Bundle;
import com.samsung.android.knox.SupportLibUtils;
import com.samsung.android.knox.accounts.Account;
import defpackage.id;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class CredentialStorage {
    public Bundle bundle;
    public String manufacturer;
    public String name;
    public String packageName;
    public String signature;

    public static CredentialStorage convertToNew(com.sec.enterprise.knox.ucm.configurator.CredentialStorage credentialStorage) {
        CredentialStorage credentialStorage2 = new CredentialStorage();
        credentialStorage2.bundle = credentialStorage.bundle;
        credentialStorage2.manufacturer = credentialStorage.manufacturer;
        credentialStorage2.name = credentialStorage.name;
        credentialStorage2.packageName = credentialStorage.packageName;
        try {
            credentialStorage2.signature = credentialStorage.signature;
        } catch (NoSuchFieldError unused) {
        }
        return credentialStorage2;
    }

    public static CredentialStorage[] convertToNewArray(com.sec.enterprise.knox.ucm.configurator.CredentialStorage[] credentialStorageArr) {
        if (credentialStorageArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.sec.enterprise.knox.ucm.configurator.CredentialStorage credentialStorage : credentialStorageArr) {
            arrayList.add(convertToNew(credentialStorage));
        }
        CredentialStorage[] credentialStorageArr2 = new CredentialStorage[arrayList.size()];
        arrayList.toArray(credentialStorageArr2);
        return credentialStorageArr2;
    }

    public static com.sec.enterprise.knox.ucm.configurator.CredentialStorage convertToOld(CredentialStorage credentialStorage) {
        if (credentialStorage == null) {
            return null;
        }
        try {
            com.sec.enterprise.knox.ucm.configurator.CredentialStorage credentialStorage2 = new com.sec.enterprise.knox.ucm.configurator.CredentialStorage();
            credentialStorage2.bundle = credentialStorage.bundle;
            credentialStorage2.manufacturer = credentialStorage.manufacturer;
            credentialStorage2.name = credentialStorage.name;
            credentialStorage2.packageName = credentialStorage.packageName;
            try {
                credentialStorage2.signature = credentialStorage.signature;
                return credentialStorage2;
            } catch (NoSuchFieldError unused) {
                if (credentialStorage.signature == null) {
                    return credentialStorage2;
                }
                id.t(SupportLibUtils.buildFieldErrorMsg(CredentialStorage.class, Account.SIGNATURE, 20));
                return null;
            }
        } catch (NoClassDefFoundError unused2) {
            id.g(SupportLibUtils.buildClassErrorMsg(CredentialStorage.class, 19));
            return null;
        }
    }
}
