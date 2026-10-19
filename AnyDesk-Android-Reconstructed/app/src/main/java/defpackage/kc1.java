package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import j$.util.Objects;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class kc1 extends ds {
    public static Font K(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iN = N(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iN2 = N(fontStyle, font2.getStyle());
            if (iN2 < iN) {
                font = font2;
                iN = iN2;
            }
        }
        return font;
    }

    public static int N(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily L(r30[] r30VarArr, ContentResolver contentResolver) {
        Font fontBuild;
        FontFamily.Builder builder = null;
        for (r30 r30Var : r30VarArr) {
            if (Objects.equals(r30Var.a.getScheme(), "systemfont")) {
                fontBuild = M(r30Var);
            } else {
                try {
                    Uri uri = r30Var.a;
                    String str = r30Var.e;
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        fontBuild = null;
                    } else {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(r30Var.c).setSlant(r30Var.d ? 1 : 0).setTtcIndex(r30Var.b);
                            if (!TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                    fontBuild = null;
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font M(r30 r30Var) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // defpackage.ds
    public final Typeface h(Context context, o30 o30Var, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (p30 p30Var : o30Var.a) {
                try {
                    Font fontBuild = new Font.Builder(resources, p30Var.f).setWeight(p30Var.b).setSlant(p30Var.c ? 1 : 0).setTtcIndex(p30Var.e).setFontVariationSettings(p30Var.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(K(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.ds
    public final Typeface i(Context context, r30[] r30VarArr, int i) {
        try {
            FontFamily fontFamilyL = L(r30VarArr, context.getContentResolver());
            if (fontFamilyL == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyL).setStyle(K(fontFamilyL, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.ds
    public final Typeface j(int i, Context context, List list) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyL = L((r30[]) list.get(0), contentResolver);
            if (fontFamilyL == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyL);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyL2 = L((r30[]) list.get(i2), contentResolver);
                if (fontFamilyL2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyL2);
                }
            }
            return customFallbackBuilder.setStyle(K(fontFamilyL, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.ds
    public final Typeface k(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }
}
