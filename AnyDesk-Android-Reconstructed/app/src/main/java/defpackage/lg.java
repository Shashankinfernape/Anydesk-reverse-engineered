package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class lg {
    public static final String b;
    public static final String c;
    public static final lg d;
    public static final lg e;
    public final boolean a;

    static {
        dj djVar = m91.c;
        b = Character.toString((char) 8206);
        c = Character.toString((char) 8207);
        d = new lg(false);
        e = new lg(true);
    }

    public lg(boolean z) {
        dj djVar = m91.a;
        this.a = z;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        kg kgVar = new kg(charSequence);
        kgVar.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = kgVar.c;
            if (i4 < kgVar.b && i == 0) {
                CharSequence charSequence2 = kgVar.a;
                char cCharAt = charSequence2.charAt(i4);
                kgVar.d = cCharAt;
                boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt);
                int i5 = kgVar.c;
                if (zIsHighSurrogate) {
                    int iCodePointAt = Character.codePointAt(charSequence2, i5);
                    kgVar.c = Character.charCount(iCodePointAt) + kgVar.c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    kgVar.c = i5 + 1;
                    char c2 = kgVar.d;
                    directionality = c2 < 1792 ? kg.e[c2] : Character.getDirectionality(c2);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                            case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                                i3++;
                                i2 = -1;
                                continue;
                            case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                            case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                                i3++;
                                i2 = 1;
                                continue;
                            case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i != 0) {
            if (i2 == 0) {
                while (kgVar.c > 0) {
                    switch (kgVar.a()) {
                        case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                        case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                            if (i == i3) {
                                return -1;
                            }
                            i3--;
                            break;
                        case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                        case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                            if (i == i3) {
                                return 1;
                            }
                            i3--;
                            break;
                        case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                            i3++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i2;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        kg kgVar = new kg(charSequence);
        kgVar.c = kgVar.b;
        int i = 0;
        int i2 = 0;
        while (kgVar.c > 0) {
            byte bA = kgVar.a();
            if (bA == 0) {
                if (i == 0) {
                    return -1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            } else if (bA == 1 || bA == 2) {
                if (i == 0) {
                    return 1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            } else if (bA != 9) {
                switch (bA) {
                    case EnterpriseDeviceManager.KNOX_2_3 /* 14 */:
                    case EnterpriseDeviceManager.KNOX_2_4 /* 15 */:
                        if (i2 == i) {
                            return -1;
                        }
                        i--;
                        break;
                    case EnterpriseDeviceManager.KNOX_2_4_1 /* 16 */:
                    case EnterpriseDeviceManager.KNOX_2_5 /* 17 */:
                        if (i2 == i) {
                            return 1;
                        }
                        i--;
                        break;
                    case EnterpriseDeviceManager.KNOX_2_5_1 /* 18 */:
                        i++;
                        break;
                    default:
                        if (i2 == 0) {
                            i2 = i;
                        }
                        break;
                }
            } else {
                continue;
            }
        }
        return 0;
    }

    public static lg c() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? e : d;
    }

    public final SpannableStringBuilder d(CharSequence charSequence) {
        String str;
        dj djVar = m91.c;
        if (charSequence == null) {
            return null;
        }
        boolean zG = djVar.g(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zG2 = (zG ? m91.b : m91.a).g(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = c;
        String str4 = b;
        boolean z = this.a;
        if (z || !(zG2 || a(charSequence) == 1)) {
            str = (!z || (zG2 && a(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zG != z) {
            spannableStringBuilder.append(zG ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zG3 = (zG ? m91.b : m91.a).g(charSequence.length(), charSequence);
        if (!z && (zG3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z && (!zG3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }

    public final String e(String str) {
        dj djVar = m91.a;
        if (str == null) {
            return null;
        }
        return d(str).toString();
    }
}
