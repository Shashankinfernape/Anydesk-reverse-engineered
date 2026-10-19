package com.samsung.android.knox.sdp;

/* JADX INFO: loaded from: classes.dex */
public class SdpErrno {
    public static final int ERROR_CHAMBER_EXISTS = -16;
    public static final int ERROR_COMPROMISED = -17;
    public static final int ERROR_ENGINE_ACCESS_DENIED = -7;
    public static final int ERROR_ENGINE_ALREADY_EXISTS = -4;
    public static final int ERROR_ENGINE_LOCKED = -6;
    public static final int ERROR_ENGINE_NOT_EXISTS = -5;
    public static final int ERROR_FAILED = -99;
    public static final int ERROR_FILE_IO = -14;
    public static final int ERROR_INVALID_PARAMETER = -3;
    public static final int ERROR_INVALID_PASSWORD = -1;
    public static final int ERROR_INVALID_RESET_TOKEN = -2;
    public static final int ERROR_LICENSE_REQUIRED = -8;
    public static final int ERROR_NATIVE = -12;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_NOT_SUPPORTED_DEVICE = -9;
    public static final int ERROR_PASSWORD_REQUIRED = -13;
    public static final int ERROR_SERVICE_NOT_FOUND = -15;
    public static final int ERROR_UNKNOWN_ENGINE_TYPE = -11;
    public static final int ERROR_VERSION_MISMATCH = -10;
    public static final int SUCCESS = 0;

    public static String toString(int i) {
        if (i == -99) {
            return "Internal error occurred";
        }
        switch (i) {
            case ERROR_COMPROMISED /* -17 */:
            case ERROR_CHAMBER_EXISTS /* -16 */:
            case ERROR_SERVICE_NOT_FOUND /* -15 */:
            case ERROR_FILE_IO /* -14 */:
            case ERROR_PASSWORD_REQUIRED /* -13 */:
            case ERROR_NATIVE /* -12 */:
            case ERROR_UNKNOWN_ENGINE_TYPE /* -11 */:
            case ERROR_VERSION_MISMATCH /* -10 */:
                return "Internal error occurred";
            case ERROR_NOT_SUPPORTED_DEVICE /* -9 */:
                return "SDP not supported device";
            case ERROR_LICENSE_REQUIRED /* -8 */:
                return "License required";
            case ERROR_ENGINE_ACCESS_DENIED /* -7 */:
                return "SDP engine access denied";
            case ERROR_ENGINE_LOCKED /* -6 */:
                return "SDP engine is locked";
            case ERROR_ENGINE_NOT_EXISTS /* -5 */:
                return "SDP engine does not exist";
            case ERROR_ENGINE_ALREADY_EXISTS /* -4 */:
                return "SDP engine already exists";
            case ERROR_INVALID_PARAMETER /* -3 */:
                return "Invalid parameter";
            case ERROR_INVALID_RESET_TOKEN /* -2 */:
                return "Invalid reset token";
            case -1:
                return "Invalid password";
            case 0:
                return "No error";
            default:
                return "Unknown error";
        }
    }
}
