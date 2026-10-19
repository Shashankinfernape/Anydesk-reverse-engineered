package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class be0 {
    public static final g70 a = new g70(1);
    public static final g70 b = new g70(1);
    public static final ArrayList c = new ArrayList();

    static {
        a(1, 1, true);
        b(3, 116, false);
        b(4, 115, false);
        a(7, 28, true);
        a(8, 19, true);
        a(9, 20, true);
        a(10, 21, true);
        a(11, 22, true);
        a(12, 23, true);
        a(13, 24, true);
        a(14, 25, true);
        a(15, 26, true);
        a(16, 27, true);
        a(17, 91, true);
        b(19, 85, true);
        b(20, 87, true);
        b(21, 86, true);
        b(22, 88, true);
        b(23, 121, false);
        b(24, 119, false);
        b(25, 120, false);
        b(26, 118, false);
        a(29, 47, true);
        a(30, 64, true);
        a(31, 62, true);
        a(32, 49, true);
        a(33, 35, true);
        a(34, 50, true);
        a(35, 51, true);
        a(36, 52, true);
        a(37, 40, true);
        a(38, 53, true);
        a(39, 54, true);
        a(40, 55, true);
        a(41, 66, true);
        a(42, 65, true);
        a(43, 41, true);
        a(44, 42, true);
        a(45, 33, true);
        a(46, 36, true);
        a(47, 48, true);
        a(48, 37, true);
        a(49, 39, true);
        a(50, 63, true);
        a(51, 34, true);
        a(52, 61, true);
        a(53, 38, true);
        a(54, 60, true);
        a(55, 67, true);
        a(56, 68, true);
        a(57, 73, true);
        a(58, 75, true);
        a(59, 59, true);
        a(60, 70, true);
        a(61, 32, true);
        a(62, 74, true);
        b(66, 58, false);
        b(67, 31, false);
        a(68, 18, true);
        a(69, 29, true);
        a(70, 30, true);
        a(71, 43, true);
        a(72, 44, true);
        a(73, 45, true);
        a(74, 56, true);
        a(75, 57, true);
        a(76, 69, true);
        b(81, 96, true);
        b(82, 117, false);
        b(92, 81, true);
        b(93, 84, true);
        b(111, 2, false);
        b(112, 82, false);
        a(113, 71, true);
        a(114, 78, true);
        a(115, 46, true);
        a(116, 16, true);
        a(117, 72, true);
        a(118, 76, true);
        b(120, 15, true);
        b(121, 17, true);
        b(122, 80, true);
        b(123, 83, true);
        b(124, 79, true);
        b(131, 3, true);
        b(132, 4, true);
        b(133, 5, true);
        b(134, 6, true);
        b(135, 7, true);
        b(136, 8, true);
        b(137, 9, true);
        b(138, 10, true);
        b(139, 11, true);
        b(140, 12, true);
        b(141, 13, true);
        b(142, 14, true);
        a(143, 89, true);
        a(144, 104, true);
        a(145, 100, true);
        a(146, 101, true);
        a(147, 102, true);
        a(148, 97, true);
        a(149, 98, true);
        a(150, 99, true);
        a(151, 93, true);
        a(152, 94, true);
        a(153, 95, true);
        a(154, 90, true);
        a(155, 91, true);
        a(156, 92, true);
        a(157, 96, true);
        a(158, 105, true);
        b(160, 103, false);
        b(187, 123, false);
        b(211, 18, true);
        b(212, 114, true);
        b(213, 107, true);
        b(214, 108, true);
        b(215, 109, true);
        b(216, 110, true);
        b(217, 111, true);
        b(218, 113, true);
    }

    public static void a(int i, int i2, boolean z) {
        g70 g70Var = a;
        g70Var.a.put(i, i2);
        g70Var.b.put(i2, i);
        if (z) {
            c.add(Integer.valueOf(i));
        }
    }

    public static void b(int i, int i2, boolean z) {
        a(i, i2, z);
        g70 g70Var = b;
        g70Var.a.put(i, i2);
        g70Var.b.put(i2, i);
    }
}
