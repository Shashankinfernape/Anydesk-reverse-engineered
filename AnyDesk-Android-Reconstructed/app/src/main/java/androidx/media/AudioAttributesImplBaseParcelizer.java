package androidx.media;

import defpackage.wd1;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(wd1 wd1Var) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = 0;
        audioAttributesImplBase.b = 0;
        audioAttributesImplBase.c = 0;
        audioAttributesImplBase.d = -1;
        audioAttributesImplBase.a = wd1Var.f(0, 1);
        audioAttributesImplBase.b = wd1Var.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = wd1Var.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = wd1Var.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, wd1 wd1Var) {
        wd1Var.getClass();
        wd1Var.j(audioAttributesImplBase.a, 1);
        wd1Var.j(audioAttributesImplBase.b, 2);
        wd1Var.j(audioAttributesImplBase.c, 3);
        wd1Var.j(audioAttributesImplBase.d, 4);
    }
}
