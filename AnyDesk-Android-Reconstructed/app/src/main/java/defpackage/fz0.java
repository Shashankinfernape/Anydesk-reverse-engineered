package defpackage;

import com.anydesk.anydeskandroid.RosterItem;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fz0 {
    public final RosterItem a;
    public final ArrayList b;
    public final boolean c;

    public fz0(RosterItem rosterItem, ArrayList arrayList, boolean z) {
        this.a = rosterItem;
        this.b = arrayList;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz0)) {
            return false;
        }
        fz0 fz0Var = (fz0) obj;
        return this.a.equals(fz0Var.a) && this.b.equals(fz0Var.b) && this.c == fz0Var.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "RosterItemUiModel(details=" + this.a + ", tags=" + this.b + ", isSelected=" + this.c + ")";
    }
}
