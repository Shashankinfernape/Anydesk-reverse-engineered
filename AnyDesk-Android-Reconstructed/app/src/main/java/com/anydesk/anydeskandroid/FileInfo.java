package com.anydesk.anydeskandroid;

import defpackage.nd0;
import defpackage.wy;
import defpackage.xy;

/* JADX INFO: loaded from: classes.dex */
public class FileInfo {
    public final long accessTime;
    public final wy attributes;
    public final long creationTime;
    public final String directory;
    public final xy flags;
    public final String name;
    public final String path;
    public final long size;
    public final long writeTime;

    public FileInfo(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, long j, long j2, long j3, long j4) {
        this.path = nd0.t(bArr);
        this.name = nd0.t(bArr2);
        this.directory = nd0.t(bArr3);
        this.flags = new xy(i);
        this.attributes = new wy(i2);
        this.size = j;
        this.creationTime = j2;
        this.accessTime = j3;
        this.writeTime = j4;
    }
}
