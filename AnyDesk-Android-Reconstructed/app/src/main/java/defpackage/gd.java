package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class gd implements View.OnClickListener {
    public final View c;
    public final String d;
    public Method e;
    public Context f;

    public gd(View view, String str) {
        this.c = view;
        this.d = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.e != null) {
            break;
        }
        View view2 = this.c;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.d;
            if (context == null) {
                int id = view2.getId();
                if (id == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                }
                StringBuilder sbN = q51.n("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbN.append(view2.getClass());
                sbN.append(str);
                throw new IllegalStateException(sbN.toString());
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.e = method;
                    this.f = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.e.invoke(this.f, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
