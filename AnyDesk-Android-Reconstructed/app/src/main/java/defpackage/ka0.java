package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.net.Uri;
import com.anydesk.anydeskandroid.gui.activity.GlowActivity;
import com.anydesk.anydeskandroid.gui.activity.HubActivity;
import com.anydesk.jni.JniAdExt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ka0 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ka0(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                Bitmap bitmap = JniAdExt.a;
                ((GlowActivity) obj).moveTaskToBack(true);
                break;
            case 1:
                Bitmap bitmap2 = JniAdExt.a;
                ((HubActivity) obj).m();
                break;
            case 2:
                Bitmap bitmap3 = JniAdExt.a;
                ((GlowActivity) obj).k(null);
                break;
            case 3:
                Bitmap bitmap4 = JniAdExt.a;
                ((HubActivity) obj).n();
                break;
            default:
                Bitmap bitmap5 = JniAdExt.a;
                GlowActivity glowActivity = (GlowActivity) obj;
                if (glowActivity.h != null) {
                    ArrayList arrayList = new ArrayList();
                    ClipData primaryClip = ((ClipboardManager) glowActivity.getSystemService("clipboard")).getPrimaryClip();
                    int i2 = 0;
                    if (primaryClip != null) {
                        int itemCount = primaryClip.getItemCount();
                        for (int i3 = 0; i3 < itemCount; i3++) {
                            Uri uri = primaryClip.getItemAt(i3).getUri();
                            if (uri != null) {
                                arrayList.add(uri);
                            }
                        }
                    }
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        glowActivity.h.b((Uri) obj2);
                    }
                    break;
                }
                break;
        }
    }
}
