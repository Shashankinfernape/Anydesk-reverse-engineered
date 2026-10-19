package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.media.Image;
import android.util.Xml;
import com.anydesk.jni.JniAdExt;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n9 implements h81 {
    public int a;
    public int b;
    public final Object c;

    public n9(Context context, XmlResourceParser xmlResourceParser) {
        this.c = new ArrayList();
        this.b = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), rv0.h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                this.b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new aq().a(context, resourceId);
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.h81
    public s11[] a() {
        return new s11[]{new s11(JniAdExt.n1("ad.sys_info.net.name"), (String) this.c), new s11(JniAdExt.n1("ad.cfg.priv.screen_frame.width"), Integer.toString(this.a)), new s11(JniAdExt.n1("ad.cfg.priv.screen_frame.height"), Integer.toString(this.b))};
    }

    public synchronized int b(Image image) {
        for (int i = 0; i < 5; i++) {
            Image[] imageArr = (Image[]) this.c;
            if (imageArr[i] == null) {
                imageArr[i] = image;
                this.a++;
                return i;
            }
        }
        return -1;
    }

    public synchronized void c(int i) {
        if (i >= 0 && i < 5) {
            Image image = ((Image[]) this.c)[i];
            if (image != null) {
                image.close();
                ((Image[]) this.c)[i] = null;
                this.b++;
            }
        }
    }

    public synchronized int d() {
        return 5;
    }

    public n9(String str, int i, int i2) {
        this.c = str;
        this.a = i;
        this.b = i2;
    }

    public n9() {
        this.c = new Image[5];
        synchronized (this) {
            this.a = 0;
            this.b = 0;
        }
    }

    public n9(int i, int i2, ByteBuffer byteBuffer) {
        this.a = i;
        this.c = byteBuffer;
        this.b = i2;
    }
}
