package com.anydesk.anydeskandroid.gui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import defpackage.qa;
import defpackage.z6;

/* JADX INFO: loaded from: classes.dex */
public class AboutFossFragment extends z6 {
    @Override // defpackage.z6, defpackage.c40
    public final void C0(View view, Bundle bundle) {
        super.C0(view, bundle);
        ((TextView) view.findViewById(R.id.about_foss_text)).setText(JniAdExt.L2());
    }

    @Override // defpackage.z6
    public final boolean P0() {
        return true;
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        qa qaVarY = Y();
        if (qaVarY != null) {
            qaVarY.setTitle(JniAdExt.n1("ad.foss.title"));
        }
        return layoutInflater.inflate(R.layout.fragment_about_foss, viewGroup, false);
    }
}
