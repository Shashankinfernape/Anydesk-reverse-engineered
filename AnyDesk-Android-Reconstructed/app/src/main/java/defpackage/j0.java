package defpackage;

import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import com.anydesk.anydeskandroid.SpeedDialItem;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ j0(int i) {
        this.a = i;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i = this.a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((n81) obj).a;
            case 1:
                return ((ResolveInfo) obj).activityInfo.packageName;
            case 2:
                return Boolean.valueOf(((SpeedDialItem) obj).mIsFavorite);
            case 3:
                return ((ShortcutInfo) obj).getId();
            default:
                return ((String) obj).toString();
        }
    }

    public /* synthetic */ Function compose(Function function) {
        int i = this.a;
        return Function$CC.$default$compose(this, function);
    }
}
