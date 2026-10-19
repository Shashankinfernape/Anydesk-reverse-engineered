package com.samsung.android.knox.net.firewall;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.knox.SupportLibUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class FirewallResponse implements Parcelable {
    public static final Parcelable.Creator<FirewallResponse> CREATOR = new Parcelable.Creator<FirewallResponse>() { // from class: com.samsung.android.knox.net.firewall.FirewallResponse.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FirewallResponse createFromParcel(Parcel parcel) {
            return new FirewallResponse(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FirewallResponse[] newArray(int i) {
            return new FirewallResponse[i];
        }
    };
    private ErrorCode mErrorCode;
    private String mMessage;
    private Result mResult;

    public enum ErrorCode {
        NO_ERROR,
        DATABASE_ERROR,
        INVALID_PARAMETER_ERROR,
        OPERATION_NOT_PERMITTED_ERROR,
        NOT_AUTHORIZED_ERROR,
        IPV6_NOT_SUPPORTED_ERROR,
        UNEXPECTED_ERROR
    }

    public enum Result {
        SUCCESS,
        NO_CHANGES,
        FAILED,
        PARTIAL
    }

    private FirewallResponse(Parcel parcel) {
        this.mResult = (Result) parcel.readSerializable();
        this.mMessage = parcel.readString();
        this.mErrorCode = (ErrorCode) parcel.readSerializable();
    }

    public static FirewallResponse addFail() {
        return new FirewallResponse(Result.FAILED, ErrorCode.UNEXPECTED_ERROR, "Failed to add/update rule in the database.");
    }

    public static FirewallResponse addSuccess() {
        return new FirewallResponse(Result.SUCCESS, ErrorCode.NO_ERROR, "The rule(s) was successfully added/updated.");
    }

    public static FirewallResponse clearFail() {
        return new FirewallResponse(Result.FAILED, ErrorCode.UNEXPECTED_ERROR, "Failed to clear rules from database.");
    }

    public static FirewallResponse clearNoChanges() {
        return new FirewallResponse(Result.NO_CHANGES, ErrorCode.NO_ERROR, "Clear was not requested for this RuleType.");
    }

    public static FirewallResponse clearSuccess() {
        return new FirewallResponse(Result.SUCCESS, ErrorCode.NO_ERROR, "Rules successfully cleared.");
    }

    public static FirewallResponse convertToNew(com.sec.enterprise.firewall.FirewallResponse firewallResponse) {
        ErrorCode errorCode;
        Result result = (Result) SupportLibUtils.convertEnumToEnum(firewallResponse.getResult(), Result.class);
        try {
            errorCode = (ErrorCode) SupportLibUtils.convertEnumToEnum(firewallResponse.getErrorCode(), ErrorCode.class);
        } catch (NoSuchMethodError unused) {
            errorCode = null;
        }
        return new FirewallResponse(result, errorCode, firewallResponse.getMessage());
    }

    public static FirewallResponse[] convertToNewArray(com.sec.enterprise.firewall.FirewallResponse[] firewallResponseArr) {
        if (firewallResponseArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.sec.enterprise.firewall.FirewallResponse firewallResponse : firewallResponseArr) {
            arrayList.add(convertToNew(firewallResponse));
        }
        FirewallResponse[] firewallResponseArr2 = new FirewallResponse[arrayList.size()];
        arrayList.toArray(firewallResponseArr2);
        return firewallResponseArr2;
    }

    public static FirewallResponse removeFail() {
        return new FirewallResponse(Result.FAILED, ErrorCode.UNEXPECTED_ERROR, "Failed to remove/update rule from the database.");
    }

    public static FirewallResponse removeSuccess() {
        return new FirewallResponse(Result.SUCCESS, ErrorCode.NO_ERROR, "The rule was successfuly removed/updated.");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ErrorCode getErrorCode() {
        return this.mErrorCode;
    }

    public String getMessage() {
        return this.mMessage;
    }

    public Result getResult() {
        return this.mResult;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.mErrorCode = errorCode;
    }

    public void setMessage(String str) {
        this.mMessage = str;
    }

    public void setResult(Result result) {
        this.mResult = result;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.mResult);
        parcel.writeString(this.mMessage);
        parcel.writeSerializable(this.mErrorCode);
    }

    public FirewallResponse(Result result, ErrorCode errorCode, String str) {
        this.mResult = result;
        this.mMessage = str;
        this.mErrorCode = errorCode;
    }
}
