package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class sn0 {
    public static final px0 q = new px0("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final px0 r = new px0("\\{(.+?)\\}");
    public static final px0 s = new px0("http[s]?://");
    public static final px0 t = new px0(".*");
    public static final px0 u = new px0("([^/]*?|)");
    public static final px0 v = new px0("^[^?#]+\\?([^#]*).*");
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final String e;
    public final g81 f;
    public final g81 g;
    public final se0 h;
    public boolean i;
    public final se0 j;
    public final se0 k;
    public final se0 l;
    public final g81 m;
    public final String n;
    public final g81 o;
    public final boolean p;

    /* JADX WARN: Code duplicated, block: B:18:0x00f1  */
    public sn0(String str, String str2, String str3) {
        List listJ;
        boolean z;
        this.a = str;
        this.b = str2;
        this.c = str3;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        final int i = 0;
        this.f = new g81(new o50(this) { // from class: pn0
            public final /* synthetic */ sn0 d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:62:0x01a5  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v1, types: [oj0] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v14 */
            /* JADX WARN: Type inference failed for: r2v23 */
            /* JADX WARN: Type inference failed for: r2v31 */
            /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v9, types: [int] */
            @Override // defpackage.o50
            public final Object a() {
                boolean z2;
                List list;
                int i2 = i;
                ?? r2 = 1;
                sn0 sn0Var = this.d;
                switch (i2) {
                    case 0:
                        String str4 = sn0Var.e;
                        if (str4 != null) {
                            return new px0(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = sn0Var.a;
                        if (str5 != null) {
                            px0 px0Var = sn0.v;
                            px0Var.getClass();
                            if (px0Var.c.matcher(str5).matches()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 2:
                        String str6 = sn0Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) sn0Var.g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > r2) {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str8 = (String) tm.j0(queryParameters);
                                if (str8 == null) {
                                    sn0Var.i = r2;
                                    str8 = str7;
                                }
                                px0 px0Var2 = sn0.r;
                                px0Var2.getClass();
                                str8.getClass();
                                Matcher matcher = px0Var2.c.matcher(str8);
                                matcher.getClass();
                                y6 y6Var = !matcher.find(0) ? null : new y6(matcher, str8);
                                rn0 rn0Var = new rn0();
                                int i3 = 0;
                                ?? r3 = r2;
                                while (y6Var != null) {
                                    nj0 nj0VarB = ((oj0) y6Var.f).b(r3);
                                    nj0VarB.getClass();
                                    rn0Var.b.add(nj0VarB.a);
                                    if (y6Var.y().c > i3) {
                                        String strQuote = Pattern.quote(str8.substring(i3, y6Var.y().c));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = y6Var.y().d + 1;
                                    y6Var = y6Var.B();
                                    r3 = 1;
                                }
                                if (i3 < str8.length()) {
                                    String strQuote2 = Pattern.quote(str8.substring(i3));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                rn0Var.a = sn0.f(sb.toString());
                                linkedHashMap.put(str7, rn0Var);
                                r2 = 1;
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = sn0Var.a;
                        if (str9 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        sn0.a(fragment, arrayList2, sb2);
                        return new st0(arrayList2, sb2.toString());
                    case 4:
                        st0 st0Var = (st0) sn0Var.j.getValue();
                        return (st0Var == null || (list = (List) st0Var.c) == null) ? new ArrayList() : list;
                    case 5:
                        st0 st0Var2 = (st0) sn0Var.j.getValue();
                        if (st0Var2 != null) {
                            return (String) st0Var2.d;
                        }
                        return null;
                    case 6:
                        String str10 = (String) sn0Var.l.getValue();
                        if (str10 != null) {
                            return new px0(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = sn0Var.n;
                        if (str11 != null) {
                            return new px0(str11);
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.g = new g81(new o50(this) { // from class: pn0
            public final /* synthetic */ sn0 d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:62:0x01a5  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v1, types: [oj0] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v14 */
            /* JADX WARN: Type inference failed for: r2v23 */
            /* JADX WARN: Type inference failed for: r2v31 */
            /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v9, types: [int] */
            @Override // defpackage.o50
            public final Object a() {
                boolean z2;
                List list;
                int i3 = i2;
                ?? r2 = 1;
                sn0 sn0Var = this.d;
                switch (i3) {
                    case 0:
                        String str4 = sn0Var.e;
                        if (str4 != null) {
                            return new px0(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = sn0Var.a;
                        if (str5 != null) {
                            px0 px0Var = sn0.v;
                            px0Var.getClass();
                            if (px0Var.c.matcher(str5).matches()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 2:
                        String str6 = sn0Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) sn0Var.g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > r2) {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str8 = (String) tm.j0(queryParameters);
                                if (str8 == null) {
                                    sn0Var.i = r2;
                                    str8 = str7;
                                }
                                px0 px0Var2 = sn0.r;
                                px0Var2.getClass();
                                str8.getClass();
                                Matcher matcher = px0Var2.c.matcher(str8);
                                matcher.getClass();
                                y6 y6Var = !matcher.find(0) ? null : new y6(matcher, str8);
                                rn0 rn0Var = new rn0();
                                int i4 = 0;
                                ?? r3 = r2;
                                while (y6Var != null) {
                                    nj0 nj0VarB = ((oj0) y6Var.f).b(r3);
                                    nj0VarB.getClass();
                                    rn0Var.b.add(nj0VarB.a);
                                    if (y6Var.y().c > i4) {
                                        String strQuote = Pattern.quote(str8.substring(i4, y6Var.y().c));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i4 = y6Var.y().d + 1;
                                    y6Var = y6Var.B();
                                    r3 = 1;
                                }
                                if (i4 < str8.length()) {
                                    String strQuote2 = Pattern.quote(str8.substring(i4));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                rn0Var.a = sn0.f(sb.toString());
                                linkedHashMap.put(str7, rn0Var);
                                r2 = 1;
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = sn0Var.a;
                        if (str9 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        sn0.a(fragment, arrayList2, sb2);
                        return new st0(arrayList2, sb2.toString());
                    case 4:
                        st0 st0Var = (st0) sn0Var.j.getValue();
                        return (st0Var == null || (list = (List) st0Var.c) == null) ? new ArrayList() : list;
                    case 5:
                        st0 st0Var2 = (st0) sn0Var.j.getValue();
                        if (st0Var2 != null) {
                            return (String) st0Var2.d;
                        }
                        return null;
                    case 6:
                        String str10 = (String) sn0Var.l.getValue();
                        if (str10 != null) {
                            return new px0(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = sn0Var.n;
                        if (str11 != null) {
                            return new px0(str11);
                        }
                        return null;
                }
            }
        });
        final int i3 = 2;
        o50 o50Var = new o50(this) { // from class: pn0
            public final /* synthetic */ sn0 d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:62:0x01a5  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v1, types: [oj0] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v14 */
            /* JADX WARN: Type inference failed for: r2v23 */
            /* JADX WARN: Type inference failed for: r2v31 */
            /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v9, types: [int] */
            @Override // defpackage.o50
            public final Object a() {
                boolean z2;
                List list;
                int i4 = i3;
                ?? r2 = 1;
                sn0 sn0Var = this.d;
                switch (i4) {
                    case 0:
                        String str4 = sn0Var.e;
                        if (str4 != null) {
                            return new px0(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = sn0Var.a;
                        if (str5 != null) {
                            px0 px0Var = sn0.v;
                            px0Var.getClass();
                            if (px0Var.c.matcher(str5).matches()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 2:
                        String str6 = sn0Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) sn0Var.g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > r2) {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str8 = (String) tm.j0(queryParameters);
                                if (str8 == null) {
                                    sn0Var.i = r2;
                                    str8 = str7;
                                }
                                px0 px0Var2 = sn0.r;
                                px0Var2.getClass();
                                str8.getClass();
                                Matcher matcher = px0Var2.c.matcher(str8);
                                matcher.getClass();
                                y6 y6Var = !matcher.find(0) ? null : new y6(matcher, str8);
                                rn0 rn0Var = new rn0();
                                int i5 = 0;
                                ?? r3 = r2;
                                while (y6Var != null) {
                                    nj0 nj0VarB = ((oj0) y6Var.f).b(r3);
                                    nj0VarB.getClass();
                                    rn0Var.b.add(nj0VarB.a);
                                    if (y6Var.y().c > i5) {
                                        String strQuote = Pattern.quote(str8.substring(i5, y6Var.y().c));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i5 = y6Var.y().d + 1;
                                    y6Var = y6Var.B();
                                    r3 = 1;
                                }
                                if (i5 < str8.length()) {
                                    String strQuote2 = Pattern.quote(str8.substring(i5));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                rn0Var.a = sn0.f(sb.toString());
                                linkedHashMap.put(str7, rn0Var);
                                r2 = 1;
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = sn0Var.a;
                        if (str9 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        sn0.a(fragment, arrayList2, sb2);
                        return new st0(arrayList2, sb2.toString());
                    case 4:
                        st0 st0Var = (st0) sn0Var.j.getValue();
                        return (st0Var == null || (list = (List) st0Var.c) == null) ? new ArrayList() : list;
                    case 5:
                        st0 st0Var2 = (st0) sn0Var.j.getValue();
                        if (st0Var2 != null) {
                            return (String) st0Var2.d;
                        }
                        return null;
                    case 6:
                        String str10 = (String) sn0Var.l.getValue();
                        if (str10 != null) {
                            return new px0(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = sn0Var.n;
                        if (str11 != null) {
                            return new px0(str11);
                        }
                        return null;
                }
            }
        };
        ue0 ue0Var = ue0.c;
        this.h = uj.u(ue0Var, o50Var);
        final int i4 = 3;
        this.j = uj.u(ue0Var, new o50(this) { // from class: pn0
            public final /* synthetic */ sn0 d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:62:0x01a5  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v1, types: [oj0] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v14 */
            /* JADX WARN: Type inference failed for: r2v23 */
            /* JADX WARN: Type inference failed for: r2v31 */
            /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v9, types: [int] */
            @Override // defpackage.o50
            public final Object a() {
                boolean z2;
                List list;
                int i5 = i4;
                ?? r2 = 1;
                sn0 sn0Var = this.d;
                switch (i5) {
                    case 0:
                        String str4 = sn0Var.e;
                        if (str4 != null) {
                            return new px0(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = sn0Var.a;
                        if (str5 != null) {
                            px0 px0Var = sn0.v;
                            px0Var.getClass();
                            if (px0Var.c.matcher(str5).matches()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 2:
                        String str6 = sn0Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) sn0Var.g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > r2) {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str8 = (String) tm.j0(queryParameters);
                                if (str8 == null) {
                                    sn0Var.i = r2;
                                    str8 = str7;
                                }
                                px0 px0Var2 = sn0.r;
                                px0Var2.getClass();
                                str8.getClass();
                                Matcher matcher = px0Var2.c.matcher(str8);
                                matcher.getClass();
                                y6 y6Var = !matcher.find(0) ? null : new y6(matcher, str8);
                                rn0 rn0Var = new rn0();
                                int i6 = 0;
                                ?? r3 = r2;
                                while (y6Var != null) {
                                    nj0 nj0VarB = ((oj0) y6Var.f).b(r3);
                                    nj0VarB.getClass();
                                    rn0Var.b.add(nj0VarB.a);
                                    if (y6Var.y().c > i6) {
                                        String strQuote = Pattern.quote(str8.substring(i6, y6Var.y().c));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i6 = y6Var.y().d + 1;
                                    y6Var = y6Var.B();
                                    r3 = 1;
                                }
                                if (i6 < str8.length()) {
                                    String strQuote2 = Pattern.quote(str8.substring(i6));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                rn0Var.a = sn0.f(sb.toString());
                                linkedHashMap.put(str7, rn0Var);
                                r2 = 1;
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = sn0Var.a;
                        if (str9 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        sn0.a(fragment, arrayList2, sb2);
                        return new st0(arrayList2, sb2.toString());
                    case 4:
                        st0 st0Var = (st0) sn0Var.j.getValue();
                        return (st0Var == null || (list = (List) st0Var.c) == null) ? new ArrayList() : list;
                    case 5:
                        st0 st0Var2 = (st0) sn0Var.j.getValue();
                        if (st0Var2 != null) {
                            return (String) st0Var2.d;
                        }
                        return null;
                    case 6:
                        String str10 = (String) sn0Var.l.getValue();
                        if (str10 != null) {
                            return new px0(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = sn0Var.n;
                        if (str11 != null) {
                            return new px0(str11);
                        }
                        return null;
                }
            }
        });
        final int i5 = 4;
        this.k = uj.u(ue0Var, new o50(this) { // from class: pn0
            public final /* synthetic */ sn0 d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:62:0x01a5  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v1, types: [oj0] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v14 */
            /* JADX WARN: Type inference failed for: r2v23 */
            /* JADX WARN: Type inference failed for: r2v31 */
            /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v9, types: [int] */
            @Override // defpackage.o50
            public final Object a() {
                boolean z2;
                List list;
                int i6 = i5;
                ?? r2 = 1;
                sn0 sn0Var = this.d;
                switch (i6) {
                    case 0:
                        String str4 = sn0Var.e;
                        if (str4 != null) {
                            return new px0(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = sn0Var.a;
                        if (str5 != null) {
                            px0 px0Var = sn0.v;
                            px0Var.getClass();
                            if (px0Var.c.matcher(str5).matches()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 2:
                        String str6 = sn0Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) sn0Var.g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > r2) {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str8 = (String) tm.j0(queryParameters);
                                if (str8 == null) {
                                    sn0Var.i = r2;
                                    str8 = str7;
                                }
                                px0 px0Var2 = sn0.r;
                                px0Var2.getClass();
                                str8.getClass();
                                Matcher matcher = px0Var2.c.matcher(str8);
                                matcher.getClass();
                                y6 y6Var = !matcher.find(0) ? null : new y6(matcher, str8);
                                rn0 rn0Var = new rn0();
                                int i7 = 0;
                                ?? r3 = r2;
                                while (y6Var != null) {
                                    nj0 nj0VarB = ((oj0) y6Var.f).b(r3);
                                    nj0VarB.getClass();
                                    rn0Var.b.add(nj0VarB.a);
                                    if (y6Var.y().c > i7) {
                                        String strQuote = Pattern.quote(str8.substring(i7, y6Var.y().c));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i7 = y6Var.y().d + 1;
                                    y6Var = y6Var.B();
                                    r3 = 1;
                                }
                                if (i7 < str8.length()) {
                                    String strQuote2 = Pattern.quote(str8.substring(i7));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                rn0Var.a = sn0.f(sb.toString());
                                linkedHashMap.put(str7, rn0Var);
                                r2 = 1;
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = sn0Var.a;
                        if (str9 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        sn0.a(fragment, arrayList2, sb2);
                        return new st0(arrayList2, sb2.toString());
                    case 4:
                        st0 st0Var = (st0) sn0Var.j.getValue();
                        return (st0Var == null || (list = (List) st0Var.c) == null) ? new ArrayList() : list;
                    case 5:
                        st0 st0Var2 = (st0) sn0Var.j.getValue();
                        if (st0Var2 != null) {
                            return (String) st0Var2.d;
                        }
                        return null;
                    case 6:
                        String str10 = (String) sn0Var.l.getValue();
                        if (str10 != null) {
                            return new px0(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = sn0Var.n;
                        if (str11 != null) {
                            return new px0(str11);
                        }
                        return null;
                }
            }
        });
        final int i6 = 5;
        this.l = uj.u(ue0Var, new o50(this) { // from class: pn0
            public final /* synthetic */ sn0 d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:62:0x01a5  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v1, types: [oj0] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v14 */
            /* JADX WARN: Type inference failed for: r2v23 */
            /* JADX WARN: Type inference failed for: r2v31 */
            /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v9, types: [int] */
            @Override // defpackage.o50
            public final Object a() {
                boolean z2;
                List list;
                int i7 = i6;
                ?? r2 = 1;
                sn0 sn0Var = this.d;
                switch (i7) {
                    case 0:
                        String str4 = sn0Var.e;
                        if (str4 != null) {
                            return new px0(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = sn0Var.a;
                        if (str5 != null) {
                            px0 px0Var = sn0.v;
                            px0Var.getClass();
                            if (px0Var.c.matcher(str5).matches()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 2:
                        String str6 = sn0Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) sn0Var.g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > r2) {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str8 = (String) tm.j0(queryParameters);
                                if (str8 == null) {
                                    sn0Var.i = r2;
                                    str8 = str7;
                                }
                                px0 px0Var2 = sn0.r;
                                px0Var2.getClass();
                                str8.getClass();
                                Matcher matcher = px0Var2.c.matcher(str8);
                                matcher.getClass();
                                y6 y6Var = !matcher.find(0) ? null : new y6(matcher, str8);
                                rn0 rn0Var = new rn0();
                                int i8 = 0;
                                ?? r3 = r2;
                                while (y6Var != null) {
                                    nj0 nj0VarB = ((oj0) y6Var.f).b(r3);
                                    nj0VarB.getClass();
                                    rn0Var.b.add(nj0VarB.a);
                                    if (y6Var.y().c > i8) {
                                        String strQuote = Pattern.quote(str8.substring(i8, y6Var.y().c));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i8 = y6Var.y().d + 1;
                                    y6Var = y6Var.B();
                                    r3 = 1;
                                }
                                if (i8 < str8.length()) {
                                    String strQuote2 = Pattern.quote(str8.substring(i8));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                rn0Var.a = sn0.f(sb.toString());
                                linkedHashMap.put(str7, rn0Var);
                                r2 = 1;
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = sn0Var.a;
                        if (str9 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        sn0.a(fragment, arrayList2, sb2);
                        return new st0(arrayList2, sb2.toString());
                    case 4:
                        st0 st0Var = (st0) sn0Var.j.getValue();
                        return (st0Var == null || (list = (List) st0Var.c) == null) ? new ArrayList() : list;
                    case 5:
                        st0 st0Var2 = (st0) sn0Var.j.getValue();
                        if (st0Var2 != null) {
                            return (String) st0Var2.d;
                        }
                        return null;
                    case 6:
                        String str10 = (String) sn0Var.l.getValue();
                        if (str10 != null) {
                            return new px0(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = sn0Var.n;
                        if (str11 != null) {
                            return new px0(str11);
                        }
                        return null;
                }
            }
        });
        final int i7 = 6;
        this.m = new g81(new o50(this) { // from class: pn0
            public final /* synthetic */ sn0 d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:62:0x01a5  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v1, types: [oj0] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v14 */
            /* JADX WARN: Type inference failed for: r2v23 */
            /* JADX WARN: Type inference failed for: r2v31 */
            /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v9, types: [int] */
            @Override // defpackage.o50
            public final Object a() {
                boolean z2;
                List list;
                int i8 = i7;
                ?? r2 = 1;
                sn0 sn0Var = this.d;
                switch (i8) {
                    case 0:
                        String str4 = sn0Var.e;
                        if (str4 != null) {
                            return new px0(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = sn0Var.a;
                        if (str5 != null) {
                            px0 px0Var = sn0.v;
                            px0Var.getClass();
                            if (px0Var.c.matcher(str5).matches()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 2:
                        String str6 = sn0Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) sn0Var.g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > r2) {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str8 = (String) tm.j0(queryParameters);
                                if (str8 == null) {
                                    sn0Var.i = r2;
                                    str8 = str7;
                                }
                                px0 px0Var2 = sn0.r;
                                px0Var2.getClass();
                                str8.getClass();
                                Matcher matcher = px0Var2.c.matcher(str8);
                                matcher.getClass();
                                y6 y6Var = !matcher.find(0) ? null : new y6(matcher, str8);
                                rn0 rn0Var = new rn0();
                                int i9 = 0;
                                ?? r3 = r2;
                                while (y6Var != null) {
                                    nj0 nj0VarB = ((oj0) y6Var.f).b(r3);
                                    nj0VarB.getClass();
                                    rn0Var.b.add(nj0VarB.a);
                                    if (y6Var.y().c > i9) {
                                        String strQuote = Pattern.quote(str8.substring(i9, y6Var.y().c));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i9 = y6Var.y().d + 1;
                                    y6Var = y6Var.B();
                                    r3 = 1;
                                }
                                if (i9 < str8.length()) {
                                    String strQuote2 = Pattern.quote(str8.substring(i9));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                rn0Var.a = sn0.f(sb.toString());
                                linkedHashMap.put(str7, rn0Var);
                                r2 = 1;
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = sn0Var.a;
                        if (str9 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        sn0.a(fragment, arrayList2, sb2);
                        return new st0(arrayList2, sb2.toString());
                    case 4:
                        st0 st0Var = (st0) sn0Var.j.getValue();
                        return (st0Var == null || (list = (List) st0Var.c) == null) ? new ArrayList() : list;
                    case 5:
                        st0 st0Var2 = (st0) sn0Var.j.getValue();
                        if (st0Var2 != null) {
                            return (String) st0Var2.d;
                        }
                        return null;
                    case 6:
                        String str10 = (String) sn0Var.l.getValue();
                        if (str10 != null) {
                            return new px0(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = sn0Var.n;
                        if (str11 != null) {
                            return new px0(str11);
                        }
                        return null;
                }
            }
        });
        final int i8 = 7;
        this.o = new g81(new o50(this) { // from class: pn0
            public final /* synthetic */ sn0 d;

            {
                this.d = this;
            }

            /* JADX WARN: Code duplicated, block: B:62:0x01a5  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v1, types: [oj0] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v14 */
            /* JADX WARN: Type inference failed for: r2v23 */
            /* JADX WARN: Type inference failed for: r2v31 */
            /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v9, types: [int] */
            @Override // defpackage.o50
            public final Object a() {
                boolean z2;
                List list;
                int i9 = i8;
                ?? r2 = 1;
                sn0 sn0Var = this.d;
                switch (i9) {
                    case 0:
                        String str4 = sn0Var.e;
                        if (str4 != null) {
                            return new px0(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = sn0Var.a;
                        if (str5 != null) {
                            px0 px0Var = sn0.v;
                            px0Var.getClass();
                            if (px0Var.c.matcher(str5).matches()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    case 2:
                        String str6 = sn0Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) sn0Var.g.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri uri = Uri.parse(str6);
                            uri.getClass();
                            for (String str7 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str7);
                                if (queryParameters.size() > r2) {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str8 = (String) tm.j0(queryParameters);
                                if (str8 == null) {
                                    sn0Var.i = r2;
                                    str8 = str7;
                                }
                                px0 px0Var2 = sn0.r;
                                px0Var2.getClass();
                                str8.getClass();
                                Matcher matcher = px0Var2.c.matcher(str8);
                                matcher.getClass();
                                y6 y6Var = !matcher.find(0) ? null : new y6(matcher, str8);
                                rn0 rn0Var = new rn0();
                                int i10 = 0;
                                ?? r3 = r2;
                                while (y6Var != null) {
                                    nj0 nj0VarB = ((oj0) y6Var.f).b(r3);
                                    nj0VarB.getClass();
                                    rn0Var.b.add(nj0VarB.a);
                                    if (y6Var.y().c > i10) {
                                        String strQuote = Pattern.quote(str8.substring(i10, y6Var.y().c));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i10 = y6Var.y().d + 1;
                                    y6Var = y6Var.B();
                                    r3 = 1;
                                }
                                if (i10 < str8.length()) {
                                    String strQuote2 = Pattern.quote(str8.substring(i10));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                rn0Var.a = sn0.f(sb.toString());
                                linkedHashMap.put(str7, rn0Var);
                                r2 = 1;
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = sn0Var.a;
                        if (str9 == null) {
                            return null;
                        }
                        Uri uri2 = Uri.parse(str9);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str9);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        sn0.a(fragment, arrayList2, sb2);
                        return new st0(arrayList2, sb2.toString());
                    case 4:
                        st0 st0Var = (st0) sn0Var.j.getValue();
                        return (st0Var == null || (list = (List) st0Var.c) == null) ? new ArrayList() : list;
                    case 5:
                        st0 st0Var2 = (st0) sn0Var.j.getValue();
                        if (st0Var2 != null) {
                            return (String) st0Var2.d;
                        }
                        return null;
                    case 6:
                        String str10 = (String) sn0Var.l.getValue();
                        if (str10 != null) {
                            return new px0(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = sn0Var.n;
                        if (str11 != null) {
                            return new px0(str11);
                        }
                        return null;
                }
            }
        });
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            px0 px0Var = q;
            px0Var.getClass();
            if (!px0Var.c.matcher(str).find()) {
                String strPattern = s.c.pattern();
                strPattern.getClass();
                sb.append(strPattern);
            }
            Pattern patternCompile = Pattern.compile("(\\?|#|$)");
            patternCompile.getClass();
            Matcher matcher = patternCompile.matcher(str);
            matcher.getClass();
            y6 y6Var = !matcher.find(0) ? null : new y6(matcher, str);
            if (y6Var != null) {
                a(str.substring(0, y6Var.y().c), arrayList, sb);
                px0 px0Var2 = t;
                px0Var2.getClass();
                if (px0Var2.c.matcher(sb).find()) {
                    z = false;
                } else {
                    px0 px0Var3 = u;
                    px0Var3.getClass();
                    if (px0Var3.c.matcher(sb).find()) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                this.p = z;
                sb.append("($|(\\?(.)*)|(#(.)*))");
            }
            this.e = f(sb.toString());
        }
        if (str3 == null) {
            return;
        }
        Pattern patternCompile2 = Pattern.compile("^[\\s\\S]+/[\\s\\S]+$");
        patternCompile2.getClass();
        if (!patternCompile2.matcher(str3).matches()) {
            nh0.e(gr0.f("The given mimeType ", str3, " does not match to required \"type/subtype\" format"));
            throw null;
        }
        Pattern patternCompile3 = Pattern.compile("/");
        patternCompile3.getClass();
        Matcher matcher2 = patternCompile3.matcher(str3);
        if (matcher2.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList2.add(str3.subSequence(iEnd, matcher2.start()).toString());
                iEnd = matcher2.end();
            } while (matcher2.find());
            arrayList2.add(str3.subSequence(iEnd, str3.length()).toString());
            listJ = arrayList2;
        } else {
            listJ = y90.J(str3.toString());
        }
        boolean zIsEmpty = listJ.isEmpty();
        List listA0 = mx.c;
        if (!zIsEmpty) {
            ListIterator listIterator = listJ.listIterator(listJ.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    int iNextIndex = listIterator.nextIndex() + 1;
                    if (iNextIndex < 0) {
                        nh0.e(q51.k(iNextIndex, "Requested element count ", " is less than zero."));
                        throw null;
                    }
                    if (iNextIndex == 0) {
                        break;
                    }
                    if (iNextIndex < listJ.size()) {
                        if (iNextIndex != 1) {
                            ArrayList arrayList3 = new ArrayList(iNextIndex);
                            Iterator it = listJ.iterator();
                            int i9 = 0;
                            while (it.hasNext()) {
                                arrayList3.add(it.next());
                                i9++;
                                if (i9 == iNextIndex) {
                                    break;
                                }
                            }
                            listA0 = um.a0(arrayList3);
                            break;
                        }
                        listA0 = y90.J(tm.i0(listJ));
                        break;
                    }
                    listA0 = tm.w0(listJ);
                    break;
                }
            }
        }
        this.n = p71.R("^(" + ((String) listA0.get(0)) + "|[*]+)/(" + ((String) listA0.get(1)) + "|[*]+)$", "*|[*]", "[\\s\\S]");
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        px0 px0Var = r;
        px0Var.getClass();
        Matcher matcher = px0Var.c.matcher(str);
        matcher.getClass();
        int i = 0;
        for (y6 y6Var = !matcher.find(0) ? null : new y6(matcher, str); y6Var != null; y6Var = y6Var.B()) {
            nj0 nj0VarB = ((oj0) y6Var.f).b(1);
            nj0VarB.getClass();
            arrayList.add(nj0VarB.a);
            if (y6Var.y().c > i) {
                String strQuote = Pattern.quote(str.substring(i, y6Var.y().c));
                strQuote.getClass();
                sb.append(strQuote);
            }
            String strPattern = u.c.pattern();
            strPattern.getClass();
            sb.append(strPattern);
            i = y6Var.y().d + 1;
        }
        if (i < str.length()) {
            String strQuote2 = Pattern.quote(str.substring(i));
            strQuote2.getClass();
            sb.append(strQuote2);
        }
    }

    public static void e(Bundle bundle, String str, String str2, zm0 zm0Var) {
        if (zm0Var == null) {
            str.getClass();
            bundle.putString(str, str2);
        } else {
            lo0 lo0Var = zm0Var.a;
            str.getClass();
            lo0Var.e(bundle, str, lo0Var.d(str2));
        }
    }

    public static String f(String str) {
        if (p71.N(str, "\\Q") && p71.N(str, "\\E")) {
            return p71.R(str, ".*", "\\E.*\\Q");
        }
        return p71.N(str, "\\.\\*") ? p71.R(str, "\\.\\*", ".*") : str;
    }

    public final ArrayList b() {
        Collection collectionValues = ((Map) this.h.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            zm.d0(((rn0) it.next()).b, arrayList);
        }
        return tm.r0(tm.r0(this.d, arrayList), (List) this.k.getValue());
    }

    public final boolean c(y6 y6Var, Bundle bundle, Map map) {
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList(vm.c0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            String strDecode = null;
            if (i < 0) {
                um.b0();
                throw null;
            }
            String str = (String) obj;
            nj0 nj0VarB = ((oj0) y6Var.f).b(i3);
            if (nj0VarB != null) {
                strDecode = Uri.decode(nj0VarB.a);
                strDecode.getClass();
            }
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                e(bundle, str, strDecode, (zm0) map.get(str));
                arrayList2.add(uc1.a);
                i = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d1  */
    public final boolean d(Uri uri, Bundle bundle, Map map) {
        y6 y6Var;
        Object objValueOf;
        boolean z;
        String query;
        sn0 sn0Var = this;
        for (Map.Entry entry : ((Map) sn0Var.h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            rn0 rn0Var = (rn0) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (sn0Var.i && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = y90.J(query);
            }
            uc1 uc1Var = uc1.a;
            boolean z2 = false;
            Bundle bundleG = hq.g((st0[]) Arrays.copyOf(new st0[0], 0));
            ArrayList arrayList = rn0Var.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str2 = (String) obj;
                zm0 zm0Var = (zm0) map.get(str2);
                lo0 lo0Var = zm0Var != null ? zm0Var.a : null;
                if ((lo0Var instanceof kh) && !zm0Var.c) {
                    kh khVar = (kh) lo0Var;
                    int i2 = khVar.r;
                    Object obj2 = mx.c;
                    switch (i2) {
                        case 0:
                            obj2 = new boolean[0];
                            break;
                        case 2:
                            obj2 = new float[0];
                            break;
                        case 4:
                            obj2 = new int[0];
                            break;
                        case 6:
                            obj2 = new long[0];
                            break;
                        case 8:
                            obj2 = new String[0];
                            break;
                    }
                    khVar.e(bundleG, str2, obj2);
                }
            }
            for (String str3 : queryParameters) {
                String str4 = rn0Var.a;
                if (str4 != null) {
                    Pattern patternCompile = Pattern.compile(str4);
                    patternCompile.getClass();
                    str3.getClass();
                    Matcher matcher = patternCompile.matcher(str3);
                    matcher.getClass();
                    if (matcher.matches()) {
                        y6Var = new y6(matcher, str3);
                    } else {
                        y6Var = null;
                    }
                } else {
                    y6Var = null;
                }
                if (y6Var == null) {
                    return z2;
                }
                ArrayList arrayList2 = rn0Var.b;
                ArrayList arrayList3 = new ArrayList(vm.c0(arrayList2, 10));
                int size2 = arrayList2.size();
                int i3 = 0;
                int i4 = 0;
                while (i4 < size2) {
                    Object obj3 = arrayList2.get(i4);
                    i4++;
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        um.b0();
                        throw null;
                    }
                    String str5 = (String) obj3;
                    nj0 nj0VarB = ((oj0) y6Var.f).b(i5);
                    String str6 = nj0VarB != null ? nj0VarB.a : null;
                    if (str6 == null) {
                        str6 = "";
                    }
                    zm0 zm0Var2 = (zm0) map.get(str5);
                    try {
                        str5.getClass();
                        if (bundleG.containsKey(str5)) {
                            if (bundleG.containsKey(str5)) {
                                if (zm0Var2 != null) {
                                    lo0 lo0Var2 = zm0Var2.a;
                                    Object objA = lo0Var2.a(str5, bundleG);
                                    if (!bundleG.containsKey(str5)) {
                                        throw new IllegalArgumentException("There is no previous value in this savedState.");
                                    }
                                    lo0Var2.e(bundleG, str5, lo0Var2.c(objA, str6));
                                    objValueOf = uc1Var;
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            objValueOf = Boolean.valueOf(z);
                        } else {
                            e(bundleG, str5, str6, zm0Var2);
                            objValueOf = uc1Var;
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                    arrayList3.add(objValueOf);
                    map = map;
                    i3 = i5;
                    z2 = false;
                }
                map = map;
            }
            bundle.putAll(bundleG);
            sn0Var = this;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof sn0)) {
            sn0 sn0Var = (sn0) obj;
            if (y90.e(this.a, sn0Var.a) && y90.e(this.b, sn0Var.b) && y90.e(this.c, sn0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
