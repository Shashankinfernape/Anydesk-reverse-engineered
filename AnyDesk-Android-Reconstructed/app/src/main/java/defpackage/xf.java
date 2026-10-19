package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.anydesk.anydeskandroid.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class xf {
    public final wf a;
    public final wf b = new wf();
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;

    public xf(Context context) {
        AttributeSet attributeSetAsAttributeSet;
        int styleAttribute;
        int next;
        wf wfVar = new wf();
        int i = wfVar.c;
        if (i != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSetAsAttributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayE = th1.E(context, attributeSetAsAttributeSet, ov0.c, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.c = typedArrayE.getDimensionPixelSize(4, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = typedArrayE.getDimensionPixelSize(14, -1);
        this.e = typedArrayE.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.g = typedArrayE.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f = typedArrayE.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.h = typedArrayE.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.k = typedArrayE.getInt(24, 1);
        wf wfVar2 = this.b;
        int i2 = wfVar.k;
        wfVar2.k = i2 == -2 ? 255 : i2;
        int i3 = wfVar.m;
        if (i3 != -2) {
            wfVar2.m = i3;
        } else {
            boolean zHasValue = typedArrayE.hasValue(23);
            wf wfVar3 = this.b;
            if (zHasValue) {
                wfVar3.m = typedArrayE.getInt(23, 0);
            } else {
                wfVar3.m = -1;
            }
        }
        String str = wfVar.l;
        if (str != null) {
            this.b.l = str;
        } else if (typedArrayE.hasValue(7)) {
            this.b.l = typedArrayE.getString(7);
        }
        wf wfVar4 = this.b;
        wfVar4.q = wfVar.q;
        CharSequence charSequence = wfVar.r;
        wfVar4.r = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        wf wfVar5 = this.b;
        int i4 = wfVar.s;
        wfVar5.s = i4 == 0 ? R.plurals.mtrl_badge_content_description : i4;
        int i5 = wfVar.t;
        wfVar5.t = i5 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i5;
        Boolean bool = wfVar.v;
        wfVar5.v = Boolean.valueOf(bool == null || bool.booleanValue());
        wf wfVar6 = this.b;
        int i6 = wfVar.n;
        wfVar6.n = i6 == -2 ? typedArrayE.getInt(21, -2) : i6;
        wf wfVar7 = this.b;
        int i7 = wfVar.o;
        wfVar7.o = i7 == -2 ? typedArrayE.getInt(22, -2) : i7;
        wf wfVar8 = this.b;
        Integer num = wfVar.g;
        wfVar8.g = Integer.valueOf(num == null ? typedArrayE.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        wf wfVar9 = this.b;
        Integer num2 = wfVar.h;
        wfVar9.h = Integer.valueOf(num2 == null ? typedArrayE.getResourceId(6, 0) : num2.intValue());
        wf wfVar10 = this.b;
        Integer num3 = wfVar.i;
        wfVar10.i = Integer.valueOf(num3 == null ? typedArrayE.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        wf wfVar11 = this.b;
        Integer num4 = wfVar.j;
        wfVar11.j = Integer.valueOf(num4 == null ? typedArrayE.getResourceId(16, 0) : num4.intValue());
        wf wfVar12 = this.b;
        Integer num5 = wfVar.d;
        wfVar12.d = Integer.valueOf(num5 == null ? ec1.n(context, typedArrayE, 1).getDefaultColor() : num5.intValue());
        wf wfVar13 = this.b;
        Integer num6 = wfVar.f;
        wfVar13.f = Integer.valueOf(num6 == null ? typedArrayE.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = wfVar.e;
        if (num7 != null) {
            this.b.e = num7;
        } else {
            boolean zHasValue2 = typedArrayE.hasValue(9);
            wf wfVar14 = this.b;
            if (zHasValue2) {
                wfVar14.e = Integer.valueOf(ec1.n(context, typedArrayE, 9).getDefaultColor());
            } else {
                this.b.e = Integer.valueOf(new l91(context, wfVar14.f.intValue()).j.getDefaultColor());
            }
        }
        wf wfVar15 = this.b;
        Integer num8 = wfVar.u;
        wfVar15.u = Integer.valueOf(num8 == null ? typedArrayE.getInt(2, 8388661) : num8.intValue());
        wf wfVar16 = this.b;
        Integer num9 = wfVar.w;
        wfVar16.w = Integer.valueOf(num9 == null ? typedArrayE.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        wf wfVar17 = this.b;
        Integer num10 = wfVar.x;
        wfVar17.x = Integer.valueOf(num10 == null ? typedArrayE.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        wf wfVar18 = this.b;
        Integer num11 = wfVar.y;
        wfVar18.y = Integer.valueOf(num11 == null ? typedArrayE.getDimensionPixelOffset(18, 0) : num11.intValue());
        wf wfVar19 = this.b;
        Integer num12 = wfVar.z;
        wfVar19.z = Integer.valueOf(num12 == null ? typedArrayE.getDimensionPixelOffset(25, 0) : num12.intValue());
        wf wfVar20 = this.b;
        Integer num13 = wfVar.A;
        wfVar20.A = Integer.valueOf(num13 == null ? typedArrayE.getDimensionPixelOffset(19, wfVar20.y.intValue()) : num13.intValue());
        wf wfVar21 = this.b;
        Integer num14 = wfVar.B;
        wfVar21.B = Integer.valueOf(num14 == null ? typedArrayE.getDimensionPixelOffset(26, wfVar21.z.intValue()) : num14.intValue());
        wf wfVar22 = this.b;
        Integer num15 = wfVar.E;
        wfVar22.E = Integer.valueOf(num15 == null ? typedArrayE.getDimensionPixelOffset(20, 0) : num15.intValue());
        wf wfVar23 = this.b;
        Integer num16 = wfVar.C;
        wfVar23.C = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        wf wfVar24 = this.b;
        Integer num17 = wfVar.D;
        wfVar24.D = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        wf wfVar25 = this.b;
        Boolean bool2 = wfVar.F;
        wfVar25.F = Boolean.valueOf(bool2 == null ? typedArrayE.getBoolean(0, false) : bool2.booleanValue());
        typedArrayE.recycle();
        Locale locale = wfVar.p;
        wf wfVar26 = this.b;
        if (locale == null) {
            wfVar26.p = Build.VERSION.SDK_INT >= 24 ? Locale.getDefault(Locale.Category.FORMAT) : Locale.getDefault();
        } else {
            wfVar26.p = locale;
        }
        this.a = wfVar;
    }
}
