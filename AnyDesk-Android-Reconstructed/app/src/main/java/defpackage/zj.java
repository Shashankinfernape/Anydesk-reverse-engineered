package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zj extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zj(Class cls, String str, int i) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((cm) obj).h);
            case 6:
                return Float.valueOf(((cm) obj).i);
            case 7:
                return Float.valueOf(((cv) obj).b());
            case 8:
                return Float.valueOf(((mf0) obj).h);
            case 9:
                return Float.valueOf(((of0) obj).i);
            case 10:
                return Float.valueOf(jf1.a.o((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ck ckVar = (ck) obj;
                PointF pointF = (PointF) obj2;
                ckVar.getClass();
                ckVar.a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                ckVar.b = iRound;
                int i = ckVar.f + 1;
                ckVar.f = i;
                if (i == ckVar.g) {
                    jf1.a(ckVar.e, ckVar.a, iRound, ckVar.c, ckVar.d);
                    ckVar.f = 0;
                    ckVar.g = 0;
                }
                break;
            case 1:
                ck ckVar2 = (ck) obj;
                PointF pointF2 = (PointF) obj2;
                ckVar2.getClass();
                ckVar2.c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                ckVar2.d = iRound2;
                int i2 = ckVar2.g + 1;
                ckVar2.g = i2;
                if (ckVar2.f == i2) {
                    jf1.a(ckVar2.e, ckVar2.a, ckVar2.b, ckVar2.c, iRound2);
                    ckVar2.f = 0;
                    ckVar2.g = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                jf1.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                jf1.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                jf1.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                cm cmVar = (cm) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                cmVar.h = fFloatValue;
                int i3 = (int) (fFloatValue * 5400.0f);
                qy qyVar = cmVar.e;
                ArrayList arrayList = (ArrayList) cmVar.b;
                nv nvVar = (nv) arrayList.get(0);
                float f = cmVar.h * 1520.0f;
                nvVar.a = (-20.0f) + f;
                nvVar.b = f;
                for (int i4 = 0; i4 < 4; i4++) {
                    nvVar.b = (qyVar.getInterpolation(nb.h(i3, cm.k[i4], 667)) * 250.0f) + nvVar.b;
                    nvVar.a = (qyVar.getInterpolation(nb.h(i3, cm.l[i4], 667)) * 250.0f) + nvVar.a;
                }
                float f2 = nvVar.a;
                float f3 = nvVar.b;
                nvVar.a = (((f3 - f2) * cmVar.i) + f2) / 360.0f;
                nvVar.b = f3 / 360.0f;
                for (int i5 = 0; i5 < 4; i5++) {
                    float fH = nb.h(i3, cm.m[i5], 333);
                    if (fH >= 0.0f && fH <= 1.0f) {
                        int i6 = i5 + cmVar.g;
                        int[] iArr = cmVar.f.c;
                        int length = i6 % iArr.length;
                        int length2 = (length + 1) % iArr.length;
                        int i7 = iArr[length];
                        int i8 = iArr[length2];
                        float interpolation = qyVar.getInterpolation(fH);
                        nv nvVar2 = (nv) arrayList.get(0);
                        Integer numValueOf = Integer.valueOf(i7);
                        Integer numValueOf2 = Integer.valueOf(i8);
                        int iIntValue = numValueOf.intValue();
                        float f4 = ((iIntValue >> 24) & 255) / 255.0f;
                        int iIntValue2 = numValueOf2.intValue();
                        float f5 = ((iIntValue2 >> 24) & 255) / 255.0f;
                        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
                        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
                        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
                        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
                        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
                        float fPow6 = ((((float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d)) - fPow3) * interpolation) + fPow3;
                        float fPow7 = ((float) Math.pow(((fPow4 - fPow) * interpolation) + fPow, 0.45454545454545453d)) * 255.0f;
                        nvVar2.c = Integer.valueOf((Math.round(fPow7) << 16) | (Math.round((((f5 - f4) * interpolation) + f4) * 255.0f) << 24) | (Math.round(((float) Math.pow(((fPow5 - fPow2) * interpolation) + fPow2, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f)).intValue();
                        ((c90) cmVar.a).invalidateSelf();
                    }
                    break;
                }
                ((c90) cmVar.a).invalidateSelf();
                break;
            case 6:
                ((cm) obj).i = ((Float) obj2).floatValue();
                break;
            case 7:
                cv cvVar = (cv) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                if (cvVar.j != fFloatValue2) {
                    cvVar.j = fFloatValue2;
                    cvVar.invalidateSelf();
                }
                break;
            case 8:
                mf0 mf0Var = (mf0) obj;
                float fFloatValue3 = ((Float) obj2).floatValue();
                mf0Var.h = fFloatValue3;
                ArrayList arrayList2 = (ArrayList) mf0Var.b;
                ((nv) arrayList2.get(0)).a = 0.0f;
                float fH2 = nb.h((int) (fFloatValue3 * 333.0f), 0, 667);
                nv nvVar3 = (nv) arrayList2.get(0);
                nv nvVar4 = (nv) arrayList2.get(1);
                qy qyVar2 = mf0Var.d;
                float interpolation2 = qyVar2.getInterpolation(fH2);
                nvVar4.a = interpolation2;
                nvVar3.b = interpolation2;
                nv nvVar5 = (nv) arrayList2.get(1);
                nv nvVar6 = (nv) arrayList2.get(2);
                float interpolation3 = qyVar2.getInterpolation(fH2 + 0.49925038f);
                nvVar6.a = interpolation3;
                nvVar5.b = interpolation3;
                ((nv) arrayList2.get(2)).b = 1.0f;
                if (mf0Var.g && ((nv) arrayList2.get(1)).b < 1.0f) {
                    ((nv) arrayList2.get(2)).c = ((nv) arrayList2.get(1)).c;
                    ((nv) arrayList2.get(1)).c = ((nv) arrayList2.get(0)).c;
                    ((nv) arrayList2.get(0)).c = mf0Var.e.c[mf0Var.f];
                    mf0Var.g = false;
                }
                ((c90) mf0Var.a).invalidateSelf();
                break;
            case 9:
                of0 of0Var = (of0) obj;
                float fFloatValue4 = ((Float) obj2).floatValue();
                of0Var.i = fFloatValue4;
                int i9 = (int) (fFloatValue4 * 1800.0f);
                Interpolator[] interpolatorArr = of0Var.e;
                ArrayList arrayList3 = (ArrayList) of0Var.b;
                for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                    nv nvVar7 = (nv) arrayList3.get(i10);
                    int[] iArr2 = of0.l;
                    int i11 = i10 * 2;
                    int i12 = iArr2[i11];
                    int[] iArr3 = of0.k;
                    nvVar7.a = uj.e(interpolatorArr[i11].getInterpolation(nb.h(i9, i12, iArr3[i11])), 0.0f, 1.0f);
                    int i13 = i11 + 1;
                    nvVar7.b = uj.e(interpolatorArr[i13].getInterpolation(nb.h(i9, iArr2[i13], iArr3[i13])), 0.0f, 1.0f);
                }
                if (of0Var.h) {
                    int size = arrayList3.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList3.get(i14);
                        i14++;
                        ((nv) obj3).c = of0Var.f.c[of0Var.g];
                    }
                    of0Var.h = false;
                }
                ((c90) of0Var.a).invalidateSelf();
                break;
            case 10:
                jf1.a.t((View) obj, ((Float) obj2).floatValue());
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
