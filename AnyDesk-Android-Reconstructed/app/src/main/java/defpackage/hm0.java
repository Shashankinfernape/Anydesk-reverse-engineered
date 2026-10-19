package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum hm0 {
    mop_none(1, 3),
    mop_start(2, 0),
    mop_finish(3, 1),
    /* JADX INFO: Fake field, exist only in values array */
    mop_cancel(4, 3),
    mop_move(5, 2),
    /* JADX INFO: Fake field, exist only in values array */
    mop_pointer_down(6, 5),
    /* JADX INFO: Fake field, exist only in values array */
    mop_pointer_up(7, 6),
    mop_hover_enter(8, 9),
    mop_hover_exit(9, 10),
    mop_hover_move(10, 7),
    mop_scroll(11, 8),
    mop_btn_press(12, 11),
    mop_btn_release(13, 12);

    public final byte c;
    public final int d;

    hm0(int i, int i2) {
        this.c = (byte) q51.r(i);
        this.d = i2;
    }
}
