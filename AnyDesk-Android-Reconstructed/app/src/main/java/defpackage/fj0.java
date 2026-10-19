package defpackage;

import android.content.res.TypedArray;
import android.text.TextPaint;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class fj0 {
    public static final byte[] e = new byte[0];
    public int a;
    public final int b;
    public final Object c;
    public Object d;

    public fj0(TextPaint textPaint, boolean z) {
        String str = z ? "99" : "99.";
        String str2 = z ? "  " : " ";
        this.a = (int) Math.ceil(textPaint.measureText((CharSequence) str, 0, str.length()));
        this.b = (int) Math.ceil(textPaint.measureText((CharSequence) str2, 0, str2.length()));
        if (z) {
            this.c = "%d";
        } else {
            this.c = "%d.";
        }
        this.d = z ? lg.e : lg.d;
    }

    public static dj0 a(String str) {
        int iIndexOf = str.indexOf(": ");
        return iIndexOf == -1 ? new dj0(str, "") : new dj0(str.substring(0, iIndexOf), str.substring(iIndexOf + 2));
    }

    public String b() {
        byte[] bArr = (byte[]) this.d;
        byte[] bArr2 = e;
        if (bArr == null || bArr.length != 0) {
            byte[] bArrC = c();
            byte[] bArr3 = (byte[]) this.d;
            if (bArrC == null) {
                if (bArr3 != null) {
                    this.d = null;
                    bArr2 = bArr3;
                } else {
                    bArr2 = null;
                }
            } else if (bArrC.length != 0) {
                if (bArr3 != null) {
                    if (bArrC.length == 0 || bArrC[0] != 32) {
                        this.d = bArrC;
                        bArr2 = bArr3;
                    } else {
                        this.d = null;
                        int length = bArrC.length - 1;
                        byte[] bArr4 = new byte[bArr3.length + length];
                        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                        System.arraycopy(bArrC, 1, bArr4, bArr3.length, length);
                        bArrC = bArr4;
                    }
                }
                while (true) {
                    byte[] bArrC2 = c();
                    if (bArrC2 == null) {
                        break;
                    }
                    if (bArrC2.length != 0) {
                        if (bArrC2[0] != 32) {
                            this.d = bArrC2;
                            break;
                        }
                        int length2 = bArrC2.length - 1;
                        byte[] bArr5 = new byte[bArrC.length + length2];
                        System.arraycopy(bArrC, 0, bArr5, 0, bArrC.length);
                        System.arraycopy(bArrC2, 1, bArr5, bArrC.length, length2);
                        bArrC = bArr5;
                    } else {
                        this.d = bArr2;
                        break;
                    }
                }
                bArr2 = bArrC;
            } else if (bArr3 != null) {
                this.d = bArr2;
                bArr2 = bArr3;
            }
        } else {
            this.d = null;
        }
        if (bArr2 == null) {
            return null;
        }
        return bArr2.length == 0 ? "" : new String(bArr2, StandardCharsets.UTF_8);
    }

    public byte[] c() {
        int i;
        byte[] bArr = (byte[]) this.c;
        int i2 = this.a;
        int i3 = this.b;
        if (i2 >= i3) {
            return null;
        }
        int i4 = i2;
        while (true) {
            if (i4 >= i3) {
                i4 = -1;
                i = -1;
                break;
            }
            byte b = bArr[i4];
            if (b == 13) {
                i = i4 + 1;
                if (i >= i3 || bArr[i] != 10) {
                    break;
                    break;
                }
                i = i4 + 2;
                break;
            }
            if (b == 10) {
                i = i4 + 1;
                break;
            }
            i4++;
        }
        if (i4 == -1) {
            i4 = i3;
        } else {
            i3 = i;
        }
        this.a = i3;
        return i4 == i2 ? e : Arrays.copyOfRange(bArr, i2, i4);
    }

    public ej0 d() {
        int i;
        String strB;
        do {
            i = this.a;
            strB = b();
            if (strB == null) {
                return null;
            }
        } while (strB.length() == 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(strB));
        while (true) {
            String strB2 = b();
            if (strB2 == null || strB2.length() == 0) {
                break;
            }
            arrayList.add(a(strB2));
        }
        return new ej0(arrayList, i, this.a - i);
    }

    public fj0(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2) {
        this.c = byteBuffer;
        this.d = byteBuffer2;
        this.a = i;
        this.b = i2;
    }

    public fj0(byte[] bArr) {
        int length = bArr.length;
        this.c = bArr;
        this.a = 0;
        this.b = length;
    }

    public fj0(rx rxVar, y6 y6Var) {
        this.c = new SparseArray();
        this.d = rxVar;
        TypedArray typedArray = (TypedArray) y6Var.e;
        this.a = typedArray.getResourceId(28, 0);
        this.b = typedArray.getResourceId(52, 0);
    }
}
