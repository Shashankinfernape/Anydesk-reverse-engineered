package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;
import com.anydesk.jnilib.Logging;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g00 implements View.OnGenericMotionListener, View.OnTouchListener {
    public boolean d;
    public Context f;
    public vz h;
    public mz i;
    public View j;
    public v00 k;
    public int l;
    public float m;
    public float n;
    public final double o;
    public final double p;
    public FileManagerFileListFragment q;
    public final Logging c = new Logging("FileManagerFileListGestureDetector");
    public boolean e = false;
    public int g = 1;

    public g00(Context context, boolean z, vz vzVar, double d, double d2) {
        this.f = context;
        this.d = z;
        this.h = vzVar;
        this.o = d;
        this.p = d2;
    }

    public static void a(g00 g00Var) {
        View view;
        if (Build.VERSION.SDK_INT >= 24 && (view = g00Var.j) != null) {
            view.cancelDragAndDrop();
        }
        vz vzVar = g00Var.h;
        if (vzVar != null) {
            ImageView imageView = vzVar.c;
            if (imageView != null) {
                imageView.setImageDrawable(null);
            }
            vzVar.setBadge(0);
        }
        g00Var.i = null;
        g00Var.j = null;
        g00Var.k = null;
        g00Var.g = 1;
        g00Var.l = 0;
        g00Var.m = 0.0f;
        g00Var.n = 0.0f;
    }

    public final View.DragShadowBuilder b() {
        vz vzVar = this.h;
        v00 v00Var = this.k;
        if (vzVar == null || v00Var == null) {
            return null;
        }
        View.DragShadowBuilder dragShadowBuilder = new View.DragShadowBuilder(vzVar);
        vzVar.setIcon(v00Var.e ? R.drawable.ic_filemanager_folder : R.drawable.ic_filemanager_file);
        vzVar.setBadge(v00Var.a.size());
        vzVar.measure(0, 0);
        vzVar.layout(0, 0, vzVar.getMeasuredWidth(), vzVar.getMeasuredHeight());
        return dragShadowBuilder;
    }

    public final void c(MotionEvent motionEvent) {
        v00 v00Var;
        View.DragShadowBuilder dragShadowBuilderB;
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int actionIndex = motionEvent.getActionIndex();
                int pointerId = motionEvent.getPointerId(actionIndex);
                float x = motionEvent.getX(actionIndex);
                float y = motionEvent.getY(actionIndex);
                if (this.l == pointerId) {
                    double d = ((double) (x - this.m)) / this.o;
                    double d2 = ((double) (y - this.n)) / this.p;
                    if (Math.sqrt((d2 * d2) + (d * d)) <= 0.1d || !this.e) {
                        return;
                    }
                    this.e = false;
                    int i2 = 512;
                    ClipData clipDataNewRawUri = null;
                    if (this.d) {
                        try {
                            mz mzVar = this.i;
                            if (mzVar != null) {
                                if (!mzVar.e() || (v00Var = this.k) == null) {
                                    Context context = this.f;
                                    mz mzVar2 = this.i;
                                    clipDataNewRawUri = ClipData.newRawUri("", t70.D(context, new File(mzVar2.b(mzVar2.b))));
                                } else {
                                    ArrayList arrayList = v00Var.a;
                                    int size = arrayList.size();
                                    while (i < size) {
                                        Object obj = arrayList.get(i);
                                        i++;
                                        Uri uriD = t70.D(this.f, new File(this.i.b((String) obj)));
                                        if (clipDataNewRawUri == null) {
                                            clipDataNewRawUri = ClipData.newRawUri("", uriD);
                                        } else {
                                            clipDataNewRawUri.addItem(new ClipData.Item(uriD));
                                        }
                                    }
                                }
                                i2 = 769;
                            }
                        } catch (IllegalArgumentException e) {
                            this.c.e("cannot attach dragged file to local external app: " + e.getMessage());
                        }
                    }
                    boolean z = this.d;
                    mz mzVar3 = this.i;
                    f00 f00Var = new f00(z, mzVar3);
                    View view = this.j;
                    if (view == null || this.h == null || this.k == null || mzVar3 == null || (dragShadowBuilderB = b()) == null) {
                        return;
                    }
                    FileManagerFileListFragment fileManagerFileListFragment = this.q;
                    if (fileManagerFileListFragment != null) {
                        fileManagerFileListFragment.V0();
                    }
                    if (Build.VERSION.SDK_INT < 24) {
                        view.startDrag(clipDataNewRawUri, dragShadowBuilderB, f00Var, i2);
                        return;
                    } else {
                        view.startDragAndDrop(clipDataNewRawUri, dragShadowBuilderB, f00Var, i2);
                        return;
                    }
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
        }
        this.e = false;
        t70.V(new c(22, this));
    }

    public final void d() {
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        View view = this.j;
        View.DragShadowBuilder dragShadowBuilderB = b();
        if (view == null || dragShadowBuilderB == null) {
            return;
        }
        view.updateDragShadow(dragShadowBuilderB);
    }

    @Override // android.view.View.OnGenericMotionListener
    public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
        c(motionEvent);
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        c(motionEvent);
        return false;
    }
}
