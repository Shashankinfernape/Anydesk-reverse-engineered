package com.anydesk.jnilib;

import android.util.Log;
import defpackage.nd0;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes.dex */
public class Logging {
    public static boolean b = false;
    public final String a;

    public Logging(String str) {
        this.a = str;
    }

    public static void f(int i, String str, String str2) {
        int i2 = 5;
        if (!b) {
            Log.println(5, "anydesk", "NoLog! java:" + str + " - " + str2);
            return;
        }
        switch (i) {
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 4;
                break;
            case 5:
                break;
            case 6:
                i2 = 6;
                break;
            case 7:
                i2 = 7;
                break;
            default:
                throw null;
        }
        jniLog(i2, nd0.T("java:" + str), nd0.T(str2));
    }

    public static void g(int i, String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(": ");
        sb.append(th.getMessage());
        sb.append("\n");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        sb.append(stringWriter.toString());
        f(i, str, sb.toString());
    }

    private static native void jniLog(int i, byte[] bArr, byte[] bArr2);

    public final void a(String str) {
        f(4, this.a, str);
    }

    public final void b(String str, Throwable th) {
        g(4, this.a, str, th);
    }

    public final void c(String str) {
        f(1, this.a, str);
    }

    public final void d(Throwable th) {
        g(1, this.a, "exception while processing attrs", th);
    }

    public final void e(String str) {
        f(6, this.a, str);
    }

    public final void h(String str) {
        f(5, this.a, str);
    }

    public final void i(String str, Throwable th) {
        g(5, this.a, str, th);
    }
}
