package com.anydesk.anydeskandroid.gui.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import defpackage.c40;
import defpackage.cb1;
import defpackage.m80;
import defpackage.nv0;
import defpackage.q00;
import defpackage.r3;
import defpackage.x00;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class FileManagerProgressListFragment extends c40 {
    public x00 a0;
    public q00 d0;
    public RecyclerView e0;
    public final Logging Z = new Logging("FileManagerProgressListFragment");
    public boolean b0 = false;
    public final ArrayList c0 = new ArrayList();

    @Override // defpackage.c40
    public final void A0() {
        this.F = true;
        JniAdExt.g0 = this;
        x00 x00Var = this.a0;
        if (x00Var == null) {
            return;
        }
        ArrayList arrayListP = x00Var.p();
        q00 q00Var = this.d0;
        if (q00Var == null) {
            return;
        }
        ArrayList arrayList = this.c0;
        arrayList.clear();
        arrayList.addAll(arrayListP);
        q00Var.d();
    }

    @Override // defpackage.c40
    public final void B0() {
        this.F = true;
        JniAdExt.g0 = null;
    }

    @Override // defpackage.c40
    public final void C0(View view, Bundle bundle) {
        CardView cardView = (CardView) view.findViewById(R.id.file_transfer_progress_card);
        TextView textView = (TextView) view.findViewById(R.id.file_transfer_card_progress_title);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.filemanager_progress);
        r3.a(recyclerView);
        this.e0 = recyclerView;
        r3.I(cardView, this.b0 ? 0 : 8);
        r3.F(textView, JniAdExt.n1("ad.file_browser.history"));
        q00 q00Var = new q00(a0(), this.c0);
        this.d0 = q00Var;
        q00Var.f = this;
        this.e0.setAdapter(q00Var);
        this.e0.setLayoutManager(new LinearLayoutManager(a0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c40
    public final void p0(Context context) {
        super.p0(context);
        if (context instanceof m80) {
        } else {
            cb1.d(context, " must implement IMainControl");
        }
    }

    @Override // defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.a0 = MainApplication.v().s;
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_filemanager_progresslist, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.a0 = null;
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        q00 q00Var = this.d0;
        q00Var.d = null;
        q00Var.f = null;
        this.e0.setAdapter(null);
        this.e0.setLayoutManager(null);
        this.d0 = null;
        this.e0 = null;
    }

    @Override // defpackage.c40
    public final void u0() {
        this.F = true;
    }

    @Override // defpackage.c40
    public final void w0(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.w0(context, attributeSet, bundle);
        try {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nv0.e);
            this.b0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            this.Z.d(th);
        }
    }
}
