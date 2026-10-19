package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes.dex */
public abstract class er {
    public static final List a;

    static {
        try {
            a = h11.d0(h11.b0(Arrays.asList(new j8()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
