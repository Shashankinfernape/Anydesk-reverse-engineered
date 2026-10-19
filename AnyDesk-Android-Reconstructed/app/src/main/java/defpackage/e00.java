package defpackage;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import com.anydesk.anydeskandroid.gui.fragment.FileManagerFileListFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class e00 implements View.OnDragListener {
    public final /* synthetic */ FileManagerFileListFragment a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FileManagerFileListFragment c;

    public e00(FileManagerFileListFragment fileManagerFileListFragment, int i) {
        this.b = i;
        this.c = fileManagerFileListFragment;
        this.a = fileManagerFileListFragment;
    }

    public boolean a(View view) {
        int i = this.b;
        FileManagerFileListFragment fileManagerFileListFragment = this.c;
        switch (i) {
            case 0:
                x00 x00Var = fileManagerFileListFragment.b0;
                return x00Var != null && x00Var.m(fileManagerFileListFragment.c0) == 1 && x00Var.u();
            default:
                x00 x00Var2 = fileManagerFileListFragment.b0;
                return view.isEnabled() && x00Var2 != null && x00Var2.m(fileManagerFileListFragment.c0 ^ true) == 1 && x00Var2.u();
        }
    }

    public final boolean b() {
        switch (this.b) {
            case 0:
                FileManagerFileListFragment fileManagerFileListFragment = this.c;
                x00 x00Var = fileManagerFileListFragment.b0;
                return x00Var != null && x00Var.m(fileManagerFileListFragment.c0) == 1;
            case 1:
            default:
                return false;
        }
    }

    public final boolean c(View view, f00 f00Var) {
        TextView textView;
        boolean zB = true;
        switch (this.b) {
            case 0:
                FileManagerFileListFragment fileManagerFileListFragment = this.c;
                if (f00Var == null || f00Var.a != fileManagerFileListFragment.c0) {
                    zB = f00Var == null ? b() : a(view);
                    if (zB && (textView = fileManagerFileListFragment.B0) != null) {
                        textView.bringToFront();
                    }
                } else {
                    r3.I(fileManagerFileListFragment.B0, 4);
                }
                return zB;
            case 1:
                boolean zA = a(view);
                if (zA) {
                    view.post(new qz(view, 1));
                }
                return zA;
            default:
                FileManagerFileListFragment fileManagerFileListFragment2 = this.c;
                x00 x00Var = fileManagerFileListFragment2.b0;
                boolean z = x00Var != null && x00Var.m(fileManagerFileListFragment2.c0 ^ true) == 1 && x00Var.u();
                if (z) {
                    r3.F(fileManagerFileListFragment2.J0, JniAdExt.n1("ad.file_browser.drop.msg.android.single_column"));
                    x00 x00Var2 = fileManagerFileListFragment2.b0;
                    if (x00Var2 != null) {
                        synchronized (x00Var2.b) {
                            x00Var2.i = true;
                        }
                    }
                    break;
                }
                return z;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0153  */
    /* JADX WARN: Code duplicated, block: B:102:0x0156  */
    /* JADX WARN: Code duplicated, block: B:103:0x0162  */
    /* JADX WARN: Code duplicated, block: B:105:0x0168  */
    /* JADX WARN: Code duplicated, block: B:106:0x0171  */
    /* JADX WARN: Code duplicated, block: B:114:0x0187  */
    /* JADX WARN: Code duplicated, block: B:116:0x018a  */
    /* JADX WARN: Code duplicated, block: B:118:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:23:0x0037  */
    /* JADX WARN: Code duplicated, block: B:25:0x003a  */
    /* JADX WARN: Code duplicated, block: B:27:0x003d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0042  */
    /* JADX WARN: Code duplicated, block: B:33:0x0048  */
    /* JADX WARN: Code duplicated, block: B:38:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0056  */
    /* JADX WARN: Code duplicated, block: B:40:0x005b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0061  */
    /* JADX WARN: Code duplicated, block: B:47:0x006a  */
    /* JADX WARN: Code duplicated, block: B:49:0x006f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:59:0x008d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0093  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:83:0x0113  */
    /* JADX WARN: Code duplicated, block: B:86:0x011d A[LOOP:0: B:84:0x0117->B:86:0x011d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x012f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0137  */
    /* JADX WARN: Code duplicated, block: B:93:0x013c  */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        boolean z;
        f00 f00Var;
        int action;
        boolean z2;
        FileManagerFileListFragment fileManagerFileListFragment;
        boolean zA;
        FileManagerFileListFragment fileManagerFileListFragment2;
        x00 x00Var;
        boolean z3;
        ClipData clipData;
        DragAndDropPermissions dragAndDropPermissionsK;
        FileManagerFileListFragment fileManagerFileListFragment3;
        TextView textView;
        x00 x00Var2;
        boolean zA2;
        TextView textView2;
        boolean z4;
        FileManagerFileListFragment fileManagerFileListFragment4 = this.a;
        Object localState = dragEvent.getLocalState();
        boolean z5 = true;
        boolean zA3 = false;
        af1 af1Var = null;
        if (localState instanceof f00) {
            switch (this.b) {
                case 0:
                    z4 = false;
                    break;
                case 1:
                default:
                    z4 = true;
                    break;
            }
            if (z4 == fileManagerFileListFragment4.d0) {
                f00Var = (f00) localState;
                action = dragEvent.getAction();
                if (action != 1) {
                    return c(view, f00Var);
                }
                if (action != 2) {
                    return view instanceof TextView;
                }
                if (action != 3) {
                    if (action != 4) {
                        switch (this.b) {
                            case 0:
                                fileManagerFileListFragment3 = this.c;
                                if (f00Var == null && f00Var.a != fileManagerFileListFragment3.c0) {
                                    return false;
                                }
                                fileManagerFileListFragment3.c1();
                                r3.I(fileManagerFileListFragment3.B0, 0);
                                textView = fileManagerFileListFragment3.B0;
                                if (textView != null) {
                                    return true;
                                }
                                textView.bringToFront();
                                return true;
                            case 1:
                                this.c.c1();
                                return true;
                            default:
                                FileManagerFileListFragment fileManagerFileListFragment5 = this.c;
                                fileManagerFileListFragment5.c1();
                                r3.F(fileManagerFileListFragment5.J0, JniAdExt.n1("ad.file_browser.select_destination"));
                                x00Var2 = fileManagerFileListFragment5.b0;
                                if (x00Var2 != null) {
                                    return true;
                                }
                                synchronized (x00Var2.b) {
                                    x00Var2.i = false;
                                    break;
                                }
                                return true;
                        }
                    }
                    if (action == 5) {
                        switch (this.b) {
                            case 0:
                                FileManagerFileListFragment fileManagerFileListFragment6 = this.c;
                                if (f00Var == null && f00Var.a == fileManagerFileListFragment6.c0) {
                                    z5 = false;
                                } else {
                                    if (f00Var == null) {
                                        zA2 = b();
                                    } else {
                                        zA2 = a(view);
                                    }
                                    if (zA2 && (textView2 = fileManagerFileListFragment6.B0) != null) {
                                        textView2.bringToFront();
                                    }
                                }
                                return z5;
                            case 1:
                            default:
                                return false;
                        }
                    }
                } else {
                    if (f00Var == null) {
                        switch (this.b) {
                            case 0:
                                z2 = f00Var.a;
                                fileManagerFileListFragment = this.c;
                                if (z2 != fileManagerFileListFragment.c0 && (zA3 = a(view))) {
                                    FileManagerFileListFragment.O0(fileManagerFileListFragment, f00Var, fileManagerFileListFragment.c0);
                                }
                                return zA3;
                            case 1:
                                zA = a(view);
                                if (zA) {
                                    return zA;
                                }
                                FileManagerFileListFragment fileManagerFileListFragment7 = this.c;
                                FileManagerFileListFragment.O0(fileManagerFileListFragment7, f00Var, !fileManagerFileListFragment7.c0);
                                return zA;
                            default:
                                fileManagerFileListFragment2 = this.c;
                                x00Var = fileManagerFileListFragment2.b0;
                                if (x00Var == null && x00Var.m(!fileManagerFileListFragment2.c0) == 1 && x00Var.u()) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    return z3;
                                }
                                FileManagerFileListFragment.O0(fileManagerFileListFragment2, f00Var, !fileManagerFileListFragment2.c0);
                                fileManagerFileListFragment2.a1(fileManagerFileListFragment2.c0, false);
                                return z3;
                        }
                    }
                    if (b()) {
                        qa qaVarG0 = fileManagerFileListFragment4.G0();
                        if (Build.VERSION.SDK_INT >= 24 && (dragAndDropPermissionsK = jf.k(qaVarG0, dragEvent)) != null) {
                            af1Var = new af1(29, dragAndDropPermissionsK);
                        }
                        if (af1Var != null) {
                            clipData = dragEvent.getClipData();
                            for (int i = 0; i < clipData.getItemCount(); i++) {
                                FileManagerFileListFragment.P0(fileManagerFileListFragment4, clipData.getItemAt(i).getUri());
                            }
                            if (Build.VERSION.SDK_INT >= 24) {
                                jf.j((DragAndDropPermissions) af1Var.d);
                            }
                            return true;
                        }
                        try {
                            Uri uri = dragEvent.getClipData().getItemAt(0).getUri();
                            Intent intent = new Intent("android.intent.action.GET_CONTENT");
                            intent.setType("*/*");
                            intent.addCategory("android.intent.category.OPENABLE");
                            intent.putExtra("android.provider.extra.INITIAL_URI", uri);
                            fileManagerFileListFragment4.O0.a(Intent.createChooser(intent, JniAdExt.n1("ad.status.select_files.chooser.download.msg")));
                            return true;
                        } catch (Throwable unused) {
                            fileManagerFileListFragment4.M0.u(fileManagerFileListFragment4.a0(), JniAdExt.n1("ad.status.select_files.no_filemanager.msg.android"));
                            return false;
                        }
                    }
                }
            }
        } else {
            switch (this.b) {
                case 0:
                    z = this.c.c0;
                    break;
                case 1:
                default:
                    z = false;
                    break;
            }
            if (z) {
                f00Var = null;
                action = dragEvent.getAction();
                if (action != 1) {
                    return c(view, f00Var);
                }
                if (action != 2) {
                    return view instanceof TextView;
                }
                if (action != 3) {
                    if (action != 4) {
                        switch (this.b) {
                            case 0:
                                fileManagerFileListFragment3 = this.c;
                                if (f00Var == null) {
                                    break;
                                }
                                fileManagerFileListFragment3.c1();
                                r3.I(fileManagerFileListFragment3.B0, 0);
                                textView = fileManagerFileListFragment3.B0;
                                if (textView != null) {
                                    return true;
                                }
                                textView.bringToFront();
                                return true;
                            case 1:
                                this.c.c1();
                                return true;
                            default:
                                FileManagerFileListFragment fileManagerFileListFragment8 = this.c;
                                fileManagerFileListFragment8.c1();
                                r3.F(fileManagerFileListFragment8.J0, JniAdExt.n1("ad.file_browser.select_destination"));
                                x00Var2 = fileManagerFileListFragment8.b0;
                                if (x00Var2 != null) {
                                    return true;
                                }
                                synchronized (x00Var2.b) {
                                    x00Var2.i = false;
                                    return true;
                                }
                        }
                    }
                    if (action == 5) {
                        switch (this.b) {
                            case 0:
                                FileManagerFileListFragment fileManagerFileListFragment9 = this.c;
                                if (f00Var == null) {
                                    if (f00Var == null) {
                                        zA2 = b();
                                    } else {
                                        zA2 = a(view);
                                    }
                                    if (zA2) {
                                        textView2.bringToFront();
                                    }
                                } else {
                                    if (f00Var == null) {
                                        zA2 = b();
                                    } else {
                                        zA2 = a(view);
                                    }
                                    if (zA2) {
                                        textView2.bringToFront();
                                    }
                                }
                                return z5;
                            case 1:
                            default:
                                return false;
                        }
                    }
                } else {
                    if (f00Var == null) {
                        switch (this.b) {
                            case 0:
                                z2 = f00Var.a;
                                fileManagerFileListFragment = this.c;
                                if (z2 != fileManagerFileListFragment.c0) {
                                    FileManagerFileListFragment.O0(fileManagerFileListFragment, f00Var, fileManagerFileListFragment.c0);
                                }
                                return zA3;
                            case 1:
                                zA = a(view);
                                if (zA) {
                                    return zA;
                                }
                                FileManagerFileListFragment fileManagerFileListFragment10 = this.c;
                                FileManagerFileListFragment.O0(fileManagerFileListFragment10, f00Var, !fileManagerFileListFragment10.c0);
                                return zA;
                            default:
                                fileManagerFileListFragment2 = this.c;
                                x00Var = fileManagerFileListFragment2.b0;
                                if (x00Var == null) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    return z3;
                                }
                                FileManagerFileListFragment.O0(fileManagerFileListFragment2, f00Var, !fileManagerFileListFragment2.c0);
                                fileManagerFileListFragment2.a1(fileManagerFileListFragment2.c0, false);
                                return z3;
                        }
                    }
                    if (b()) {
                        qa qaVarG1 = fileManagerFileListFragment4.G0();
                        if (Build.VERSION.SDK_INT >= 24) {
                            af1Var = new af1(29, dragAndDropPermissionsK);
                        }
                        if (af1Var != null) {
                            Uri uri2 = dragEvent.getClipData().getItemAt(0).getUri();
                            Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
                            intent2.setType("*/*");
                            intent2.addCategory("android.intent.category.OPENABLE");
                            intent2.putExtra("android.provider.extra.INITIAL_URI", uri2);
                            fileManagerFileListFragment4.O0.a(Intent.createChooser(intent2, JniAdExt.n1("ad.status.select_files.chooser.download.msg")));
                            return true;
                        }
                        clipData = dragEvent.getClipData();
                        while (i < clipData.getItemCount()) {
                            FileManagerFileListFragment.P0(fileManagerFileListFragment4, clipData.getItemAt(i).getUri());
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            jf.j((DragAndDropPermissions) af1Var.d);
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
