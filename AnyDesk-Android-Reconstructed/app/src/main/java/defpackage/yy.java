package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class yy extends ConstraintLayout {
    public TextView s;
    public TextView t;

    public yy(Context context) {
        super(context);
        m();
    }

    public abstract int getLayoutId();

    public final void m() {
        View.inflate(getContext(), getLayoutId(), this);
        this.s = (TextView) findViewById(R.id.filemanager_attrs_dir);
        this.t = (TextView) findViewById(R.id.filemanager_attrs_badge);
    }

    public void setBadge(int i) {
        int iMax = Math.max(0, i);
        r3.F(this.t, iMax > 99 ? "99+" : String.valueOf(iMax));
        r3.I(this.t, iMax <= 0 ? 8 : 0);
    }

    public void setDir(String str) {
        r3.F(this.s, str);
    }

    public void setTextColor(int i) {
        r3.G(this.s, i);
    }

    public yy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m();
    }

    public yy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m();
    }
}
