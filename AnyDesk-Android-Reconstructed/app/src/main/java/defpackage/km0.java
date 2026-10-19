package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum km0 {
    msrcc_none(1, 0),
    /* JADX INFO: Fake field, exist only in values array */
    msrcc_button(2, 1),
    msrcc_pointer(3, 2),
    /* JADX INFO: Fake field, exist only in values array */
    msrcc_trackball(4, 4),
    /* JADX INFO: Fake field, exist only in values array */
    msrcc_position(5, 8),
    /* JADX INFO: Fake field, exist only in values array */
    msrcc_joystick(6, 16);

    public final byte c;
    public final int d;

    km0(int i, int i2) {
        this.c = (byte) q51.r(i);
        this.d = i2;
    }
}
