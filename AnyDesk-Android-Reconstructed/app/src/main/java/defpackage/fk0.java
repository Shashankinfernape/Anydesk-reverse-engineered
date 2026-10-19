package defpackage;

import android.R;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.AppCompatRadioButton;

/* JADX INFO: loaded from: classes.dex */
public final class fk0 extends AppCompatRadioButton {
    public static final int[][] i = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList g;
    public boolean h;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.g == null) {
            int iU = r71.u(this, com.anydesk.anydeskandroid.R.attr.colorControlActivated);
            int iU2 = r71.u(this, com.anydesk.anydeskandroid.R.attr.colorOnSurface);
            int iU3 = r71.u(this, com.anydesk.anydeskandroid.R.attr.colorSurface);
            this.g = new ColorStateList(i, new int[]{r71.B(iU3, iU, 1.0f), r71.B(iU3, iU2, 0.54f), r71.B(iU3, iU2, 0.38f), r71.B(iU3, iU2, 0.38f)});
        }
        return this.g;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.h = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
