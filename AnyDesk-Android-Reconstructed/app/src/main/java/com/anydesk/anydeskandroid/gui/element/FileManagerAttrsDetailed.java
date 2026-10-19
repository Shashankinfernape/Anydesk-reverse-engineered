package com.anydesk.anydeskandroid.gui.element;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import defpackage.r3;
import defpackage.yy;

/* JADX INFO: loaded from: classes.dex */
public class FileManagerAttrsDetailed extends yy {
    public TextView u;

    public FileManagerAttrsDetailed(Context context) {
        super(context);
        this.u = (TextView) findViewById(R.id.filemanager_attrs_addr);
    }

    @Override // defpackage.yy
    public int getLayoutId() {
        return R.layout.filemanager_attrs_detailed;
    }

    public void setAddr(String str) {
        r3.F(this.u, str);
    }

    public FileManagerAttrsDetailed(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.u = (TextView) findViewById(R.id.filemanager_attrs_addr);
    }

    public FileManagerAttrsDetailed(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = (TextView) findViewById(R.id.filemanager_attrs_addr);
    }
}
