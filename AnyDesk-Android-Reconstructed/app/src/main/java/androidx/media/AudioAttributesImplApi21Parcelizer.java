package androidx.media;

import android.media.AudioAttributes;
import defpackage.wd1;
import defpackage.xd1;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(wd1 wd1Var) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.b = -1;
        audioAttributesImplApi21.a = (AudioAttributes) wd1Var.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = wd1Var.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, wd1 wd1Var) {
        wd1Var.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.a;
        wd1Var.i(1);
        ((xd1) wd1Var).e.writeParcelable(audioAttributes, 0);
        wd1Var.j(audioAttributesImplApi21.b, 2);
    }
}
