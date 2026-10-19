package com.anydesk.anydeskandroid.gui.element;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jnilib.Logging;
import defpackage.nv0;
import defpackage.r3;
import defpackage.t70;
import defpackage.uj;

/* JADX INFO: loaded from: classes.dex */
public class SessionInfoIconItem extends LinearLayout {
    public final Logging c;
    public ImageView d;
    public TextView e;

    public SessionInfoIconItem(Context context) {
        super(context);
        this.c = new Logging("SessionInfoIconItem");
        a(null, 0);
    }

    public final void a(AttributeSet attributeSet, int i) {
        Logging logging = this.c;
        View.inflate(getContext(), R.layout.session_info_icon_item, this);
        this.d = (ImageView) findViewById(R.id.session_info_icon_item_icon);
        this.e = (TextView) findViewById(R.id.session_info_icon_item_text);
        if (attributeSet != null) {
            try {
                TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, nv0.f, i, 0);
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
                if (drawable != null) {
                    ImageView imageView = this.d;
                    if (imageView != null) {
                        imageView.setImageDrawable(drawable);
                    }
                } else {
                    logging.h("no icon set");
                }
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                logging.d(th);
            }
        }
    }

    public CharSequence getText() {
        return this.e.getText();
    }

    public void setActive(boolean z) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        int i = z ? R.color.colorSessionInfoIcon : R.color.colorSessionInfoIconDisabled;
        Looper looper = t70.a;
        int iL = uj.l(context, i);
        r3.u(this.d, iL);
        r3.G(this.e, iL);
    }

    public void setImage(Drawable drawable) {
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public void setText(CharSequence charSequence) {
        r3.F(this.e, charSequence);
    }

    public SessionInfoIconItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Logging("SessionInfoIconItem");
        a(attributeSet, 0);
    }

    public SessionInfoIconItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Logging("SessionInfoIconItem");
        a(attributeSet, i);
    }
}
