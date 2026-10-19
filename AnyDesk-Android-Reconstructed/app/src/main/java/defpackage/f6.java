package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
@ep0("activity")
public class f6 extends fp0 {
    public final Context c;
    public final Activity d;

    public f6(Context context) {
        this.c = context;
        for (Object obj : h11.c0(context, new a0(1))) {
            if (((Context) obj) instanceof Activity) {
                this.d = (Activity) obj;
            }
        }
        obj = null;
        this.d = (Activity) obj;
    }

    @Override // defpackage.fp0
    public final vn0 a() {
        return new e6(this);
    }

    @Override // defpackage.fp0
    public final vn0 c(vn0 vn0Var, Bundle bundle, eo0 eo0Var) {
        Intent intent;
        int intExtra;
        e6 e6Var = (e6) vn0Var;
        m7 m7Var = e6Var.d;
        if (e6Var.i == null) {
            throw new IllegalStateException(("Destination " + m7Var.a + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(e6Var.i);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = e6Var.j;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException(("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + str).toString());
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    zm0 zm0Var = (zm0) e6Var.d().get(strGroup);
                    lo0 lo0Var = zm0Var != null ? zm0Var.a : null;
                    stringBuffer.append(lo0Var != null ? lo0Var.f(lo0Var.a(strGroup, bundle)) : Uri.encode(String.valueOf(bundle.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.d;
        if (activity == null) {
            intent2.addFlags(268435456);
        }
        if (eo0Var != null && eo0Var.a) {
            intent2.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", m7Var.a);
        Context context = this.c;
        Resources resources = context.getResources();
        if (eo0Var != null) {
            int i = eo0Var.h;
            int i2 = eo0Var.i;
            if ((i <= 0 || !y90.e(resources.getResourceTypeName(i), "animator")) && (i2 <= 0 || !y90.e(resources.getResourceTypeName(i2), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i2).getClass();
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i) + " and popExit resource " + resources.getResourceName(i2) + " when launching " + e6Var);
            }
        }
        context.startActivity(intent2);
        if (eo0Var != null && activity != null) {
            int i3 = eo0Var.f;
            int i4 = eo0Var.g;
            if ((i3 > 0 && y90.e(resources.getResourceTypeName(i3), "animator")) || (i4 > 0 && y90.e(resources.getResourceTypeName(i4), "animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i3) + " and exit resource " + resources.getResourceName(i4) + "when launching " + e6Var);
                return null;
            }
            if (i3 >= 0 || i4 >= 0) {
                if (i3 < 0) {
                    i3 = 0;
                }
                activity.overridePendingTransition(i3, i4 >= 0 ? i4 : 0);
            }
        }
        return null;
    }

    @Override // defpackage.fp0
    public final boolean j() {
        Activity activity = this.d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
