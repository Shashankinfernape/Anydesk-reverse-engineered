package androidx.media;

import defpackage.wd1;
import defpackage.yd1;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(wd1 wd1Var) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        yd1 yd1VarH = audioAttributesCompat.a;
        if (wd1Var.e(1)) {
            yd1VarH = wd1Var.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) yd1VarH;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, wd1 wd1Var) {
        wd1Var.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        wd1Var.i(1);
        wd1Var.k(audioAttributesImpl);
    }
}
