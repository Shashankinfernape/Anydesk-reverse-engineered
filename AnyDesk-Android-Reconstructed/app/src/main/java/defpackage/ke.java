package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface ke {
    me cls() default me.e;

    oe elementType() default oe.c;

    int index() default 0;

    boolean optional() default false;

    int tagNumber() default -1;

    ne tagging() default ne.c;

    oe type();
}
