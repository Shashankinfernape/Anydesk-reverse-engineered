package j$.util;

import defpackage.a20;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-2d11e660b4125e7c821dd99bbff3c2c419ca6963952da88e0d208bb83bfde625 */
/* JADX INFO: loaded from: classes2.dex */
public final class Optional<T> {
    public static final Optional b = new Optional();
    public final Object a;

    public Optional(Object obj) {
        this.a = Objects.requireNonNull(obj);
    }

    public static <T> Optional<T> empty() {
        return b;
    }

    public static <T> Optional<T> of(T t) {
        return new Optional<>(t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.a, ((Optional) obj).a);
        }
        return false;
    }

    public <U> Optional<U> flatMap(Function<? super T, ? extends Optional<? extends U>> function) {
        Objects.requireNonNull(function);
        a20 a20Var = (Object) this.a;
        return a20Var != null ? (Optional) Objects.requireNonNull(function.apply(a20Var)) : empty();
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public Optional<T> or(Supplier<? extends Optional<? extends T>> supplier) {
        Objects.requireNonNull(supplier);
        return this.a != null ? this : (Optional) Objects.requireNonNull(supplier.get());
    }

    public T orElse(T t) {
        T t2 = (T) this.a;
        return t2 != null ? t2 : t;
    }

    public final String toString() {
        Object obj = this.a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }

    public Optional() {
        this.a = null;
    }
}
