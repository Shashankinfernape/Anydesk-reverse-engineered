package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class dc {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        kq jqVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                jqVar = new jq(clipData, 3);
            } else {
                lq lqVar = new lq();
                lqVar.b = clipData;
                lqVar.c = 3;
                jqVar = lqVar;
            }
            oe1.k(textView, jqVar.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        kq jqVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            jqVar = new jq(clipData, 3);
        } else {
            lq lqVar = new lq();
            lqVar.b = clipData;
            lqVar.c = 3;
            jqVar = lqVar;
        }
        oe1.k(view, jqVar.build());
        return true;
    }
}
