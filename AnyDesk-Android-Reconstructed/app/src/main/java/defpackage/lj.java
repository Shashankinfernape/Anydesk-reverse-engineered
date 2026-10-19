package defpackage;

import android.media.Image;
import android.media.ImageReader;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jni.DeskRTCaptureBridge;  // DeskRT frame interception bridge
import com.anydesk.jnilib.Logging;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class lj implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ mj a;

    public lj(mj mjVar) {
        this.a = mjVar;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:68:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0113  */
    /* JADX WARN: Code duplicated, block: B:70:0x0117  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Image imageAcquireLatestImage;
        int rowStride;
        int pixelStride;
        int width;
        ByteBuffer byteBuffer;
        int height;
        mj mjVar;
        int iB;
        mj mjVar2;
        int i;
        int i2;
        if (this.a.c() != 3) {
            return;
        }
        mj mjVar3 = this.a;
        mjVar3.j++;
        n9 n9Var = mjVar3.l;
        if (n9Var == null) {
            return;
        }
        Image image = null;
        ByteBuffer byteBuffer2 = null;
        int i3 = 0;
        try {
            imageAcquireLatestImage = imageReader.acquireLatestImage();
            try {
                if (imageAcquireLatestImage != null) {
                    Image.Plane[] planes = imageAcquireLatestImage.getPlanes();
                    if (planes == null || planes.length != 1) {
                        this.a.a.e("cannot get image data");
                    } else {
                        ByteBuffer buffer = planes[0].getBuffer();
                        pixelStride = planes[0].getPixelStride();
                        try {
                            rowStride = planes[0].getRowStride();
                            try {
                                width = imageAcquireLatestImage.getWidth();
                                try {
                                    byteBuffer2 = buffer;
                                    height = imageAcquireLatestImage.getHeight();
                                    i3 = pixelStride;
                                } catch (Exception e) {
                                    e = e;
                                    this.a.a.a("processing captured image failed: " + e.getMessage());
                                    if (imageAcquireLatestImage != null) {
                                        imageAcquireLatestImage.close();
                                    }
                                    byteBuffer = null;
                                    i3 = pixelStride;
                                    height = 0;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                width = 0;
                                this.a.a.a("processing captured image failed: " + e.getMessage());
                                if (imageAcquireLatestImage != null) {
                                    imageAcquireLatestImage.close();
                                }
                                byteBuffer = null;
                                i3 = pixelStride;
                                height = 0;
                                if (image != null) {
                                    if (byteBuffer != null) {
                                        mjVar = this.a;
                                        if (width == mjVar.h) {
                                            iB = n9Var.b(image);
                                            if (iB < 0) {
                                                image.close();
                                                return;
                                            }
                                            mjVar2 = this.a;
                                            if (!JniAdExt.R1(iB, byteBuffer, mjVar2.h, mjVar2.i, rowStride)) {
                                            // DeskRT bridge: intercept frame before native compressor
                                            DeskRTCaptureBridge.getInstance().captureFrame(
                                                iB, byteBuffer, mjVar2.h, mjVar2.i, rowStride, 4 /*BGRA*/, true);
                                                n9Var.c(iB);
                                                return;
                                            } else {
                                                this.a.k++;
                                                return;
                                            }
                                        }
                                    }
                                    this.a.a.e("invalid image");
                                    image.close();
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            rowStride = 0;
                        }
                    }
                    ByteBuffer byteBuffer3 = byteBuffer2;
                    image = imageAcquireLatestImage;
                    byteBuffer = byteBuffer3;
                    if (image != null) {
                        if (byteBuffer != null && i3 > 0 && rowStride > 0 && width > 0 && height > 0) {
                            mjVar = this.a;
                            if (width == mjVar.h && height == mjVar.i && i3 == 4 && i3 * width <= rowStride && byteBuffer.capacity() >= this.a.i * rowStride) {
                                iB = n9Var.b(image);
                                if (iB < 0) {
                                    image.close();
                                    return;
                                }
                                mjVar2 = this.a;
                                if (!JniAdExt.R1(iB, byteBuffer, mjVar2.h, mjVar2.i, rowStride)) {
                                    n9Var.c(iB);
                                    return;
                                } else {
                                    this.a.k++;
                                    return;
                                }
                            }
                        }
                        this.a.a.e("invalid image");
                        image.close();
                    }
                }
                try {
                    synchronized (n9Var) {
                        i = n9Var.a;
                        i2 = n9Var.b;
                    }
                    Logging logging = this.a.a;
                    n9Var.d();
                    logging.e("image is null (" + i + "/" + i2 + "/" + this.a.k + ", " + (i - i2) + "/5)");
                } catch (Exception e4) {
                    e = e4;
                    rowStride = 0;
                    pixelStride = 0;
                    width = 0;
                    this.a.a.a("processing captured image failed: " + e.getMessage());
                    if (imageAcquireLatestImage != null) {
                        imageAcquireLatestImage.close();
                    }
                    byteBuffer = null;
                    i3 = pixelStride;
                    height = 0;
                }
                rowStride = 0;
                height = 0;
                width = 0;
                ByteBuffer byteBuffer4 = byteBuffer2;
                image = imageAcquireLatestImage;
                byteBuffer = byteBuffer4;
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Exception e6) {
            e = e6;
            imageAcquireLatestImage = null;
        }
        if (image != null) {
            if (byteBuffer != null) {
                mjVar = this.a;
                if (width == mjVar.h) {
                    iB = n9Var.b(image);
                    if (iB < 0) {
                        image.close();
                        return;
                    }
                    mjVar2 = this.a;
                    if (!JniAdExt.R1(iB, byteBuffer, mjVar2.h, mjVar2.i, rowStride)) {
                        n9Var.c(iB);
                        return;
                    } else {
                        this.a.k++;
                        return;
                    }
                }
            }
            this.a.a.e("invalid image");
            image.close();
        }
    }
}
