package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ToggleButton;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;

/* JADX INFO: loaded from: classes.dex */
public final class je0 {
    public qa b;
    public ro c;
    public final Logging a = new Logging("KeyboardTool");
    public de0 d = de0.d;
    public int e = 0;
    public int f = 0;
    public final he0 i = new he0();
    public ie0 g = new ie0(this, 0);
    public ie0 h = new ie0(this, 1);

    public je0(qa qaVar, ro roVar) {
        this.b = qaVar;
        this.c = roVar;
    }

    public final void a(int i) {
        View viewFindViewById;
        qa qaVar = this.b;
        if (qaVar == null || (viewFindViewById = qaVar.findViewById(i)) == null) {
            return;
        }
        viewFindViewById.setOnGenericMotionListener(null);
        viewFindViewById.setOnTouchListener(null);
        viewFindViewById.setOnClickListener(null);
    }

    public final void b(int i, int i2, int i3) {
        try {
            ro roVar = this.c;
            if (roVar != null) {
                String strI = ec1.i(i);
                if (strI.isEmpty()) {
                    return;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    de0 de0Var = this.d;
                    roVar.d.v1(0);
                    JniAdExt.I0.post(new c6(i2, 5, strI, de0Var));
                }
            }
        } catch (IllegalArgumentException e) {
            this.a.i("cannot inject codepoint=" + i, e);
        }
    }

    public final void c(int i, int i2, int i3) {
        qa qaVar = this.b;
        if (qaVar == null) {
            return;
        }
        View viewFindViewById = qaVar.findViewById(i);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i3;
        viewFindViewById.setLayoutParams(layoutParams);
    }

    public final void d(int i, int i2) {
        View viewFindViewById;
        ee0 ee0Var = new ee0(this, i2);
        fe0 fe0Var = new fe0(this, i2, 0);
        qa qaVar = this.b;
        if (qaVar == null || (viewFindViewById = qaVar.findViewById(i)) == null) {
            return;
        }
        viewFindViewById.setOnGenericMotionListener(this.i);
        viewFindViewById.setOnTouchListener(ee0Var);
        viewFindViewById.setOnClickListener(fe0Var);
    }

    public final void e(int i, ge0 ge0Var) {
        ToggleButton toggleButton;
        qa qaVar = this.b;
        if (qaVar == null || (toggleButton = (ToggleButton) qaVar.findViewById(i)) == null) {
            return;
        }
        toggleButton.setOnCheckedChangeListener(ge0Var);
    }
}
