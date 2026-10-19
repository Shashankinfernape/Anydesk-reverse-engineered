package defpackage;

import android.content.ClipData;
import android.graphics.fonts.Font;
import android.view.ContentInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class iq {
    public static /* synthetic */ Font.Builder a(Font font) {
        return new Font.Builder(font);
    }

    public static /* synthetic */ ContentInfo.Builder b(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }
}
