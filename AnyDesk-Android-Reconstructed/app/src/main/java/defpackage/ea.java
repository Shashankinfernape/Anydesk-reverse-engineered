package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum ea {
    d("No JAR signatures"),
    e("APK Signature Scheme v1 only supports a maximum of %1$d signers, found %2$d"),
    f("No JAR entries covered by JAR signatures"),
    g("Duplicate entry: %1$s"),
    h("Duplicate section in META-INF/MANIFEST.MF: %1$s"),
    i("Malformed META-INF/MANIFEST.MF: invidual section #%1$d does not have a name"),
    j("Malformed %1$s: invidual section #%2$d does not have a name"),
    k("Missing META-INF/MANIFEST.MF"),
    l("%1$s entry referenced by META-INF/MANIFEST.MF not found in the APK"),
    m("No digest for %1$s in META-INF/MANIFEST.MF"),
    n("No digest for %1$s in %2$s"),
    o("%1$s entry not signed"),
    p("Entries %1$s and %3$s are signed with different sets of signers : <%2$s> vs <%4$s>"),
    q("%2$s digest of %1$s does not match the digest specified in %3$s. Expected: <%5$s>, actual: <%4$s>"),
    r("%1$s digest of META-INF/MANIFEST.MF main section does not match the digest specified in %2$s. Expected: <%4$s>, actual: <%3$s>"),
    s("%2$s digest of META-INF/MANIFEST.MF section for %1$s does not match the digest specified in %3$s. Expected: <%5$s>, actual: <%4$s>"),
    t("%1$s does not specify digest of META-INF/MANIFEST.MF. This slows down verification."),
    u("APK is signed using APK Signature Scheme v2 but these signatures may be stripped without being detected because %1$s does not contain anti-stripping protections."),
    v("Partial JAR signature. Found: %1$s, missing: %2$s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Failed to verify JAR signature %1$s against %2$s: %3$s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("JAR signature %1$s uses digest algorithm %5$s and signature algorithm %6$s which is not supported on API Level(s) %4$s for which this APK is being verified"),
    w("Failed to parse JAR signature %1$s: %2$s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("Malformed certificate in JAR signature %1$s: %2$s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("JAR signature %1$s did not verify against %2$s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("JAR signature %1$s contains no signers"),
    x("Duplicate section in %1$s: %2$s"),
    y("Malformed %1$s: missing Signature-Version attribute"),
    z("JAR signature %1$s references unknown APK signature scheme ID: %2$d"),
    A("JAR signature %1$s indicates the APK is signed using %3$s but no such signature was found. Signature stripped?"),
    B("%1$s not protected by signature. Unauthorized modifications to this JAR entry will not be detected. Delete or move the entry outside of META-INF/."),
    C("No JAR signature from this signer"),
    D("Missing APK Signature Scheme v2 signature required for target sandbox version %1$d"),
    E("Target SDK version %1$d requires a minimum of signature scheme v%2$d; the APK is not signed with this or a later signature scheme"),
    F("No APK Signature Scheme v2 signature from this signer"),
    G("Malformed list of signers"),
    H("Malformed signer block"),
    I("Malformed public key: %1$s"),
    J("Malformed certificate #%2$d: %3$s"),
    K("Malformed APK Signature Scheme v2 signature record #%1$d"),
    L("Malformed APK Signature Scheme v2 digest record #%1$d"),
    M("Malformed additional attribute #%1$d"),
    N("APK Signature Scheme v2 signer: %1$s references unknown APK signature scheme ID: %2$d"),
    O("APK Signature Scheme v2 signature %1$s indicates the APK is signed using %2$s but no such signature was found. Signature stripped?"),
    P("APK Signature Scheme V2 only supports a maximum of %1$d signers, found %2$d"),
    Q("No signers in APK Signature Scheme v2 signature"),
    R("Unknown signature algorithm: %1$#x"),
    S("Unknown additional attribute: ID %1$#x"),
    T("Failed to verify %1$s signature: %2$s"),
    U("%1$s signature over signed-data did not verify"),
    V("No signatures"),
    W("No supported signatures: %1$s"),
    X("No certificates"),
    Y("Public key mismatch between certificate and signature record: <%1$s> vs <%2$s>"),
    Z("Signature algorithms mismatch between signatures and digests records: %1$s vs %2$s"),
    a0("APK integrity check failed. %1$s digest mismatch. Expected: <%2$s>, actual: <%3$s>"),
    b0("Malformed list of signers"),
    c0("Malformed signer block"),
    d0("Malformed public key: %1$s"),
    e0("Malformed certificate #%2$d: %3$s"),
    f0("Malformed APK Signature Scheme v3 signature record #%1$d"),
    g0("Malformed APK Signature Scheme v3 digest record #%1$d"),
    h0("Malformed additional attribute #%1$d"),
    i0("No signers in APK Signature Scheme v3 signature"),
    j0("Multiple APK Signature Scheme v3 signatures found for a single  platform version."),
    k0("Multiple signatures found for pre-v3 signing with an APK  Signature Scheme v3 signer.  Only one allowed."),
    l0("v3 signer differs from v1/v2 signer without proper signing certificate lineage."),
    m0("Unknown signature algorithm: %1$#x"),
    n0("Unknown additional attribute: ID %1$#x"),
    o0("Failed to verify %1$s signature: %2$s"),
    p0("Invalid SDK Version parameter(s) encountered in APK Signature scheme v3 signature: minSdkVersion %1$s maxSdkVersion: %2$s"),
    q0("%1$s signature over signed-data did not verify"),
    r0("No signatures"),
    s0("No supported signatures"),
    t0("No certificates"),
    u0("minSdkVersion mismatch between signed data and signature record: <%1$s> vs <%2$s>"),
    v0("maxSdkVersion mismatch between signed data and signature record: <%1$s> vs <%2$s>"),
    w0("Public key mismatch between certificate and signature record: <%1$s> vs <%2$s>"),
    x0("Signature algorithms mismatch between signatures and digests records: %1$s vs %2$s"),
    y0("APK integrity check failed. %1$s digest mismatch. Expected: <%2$s>, actual: <%3$s>"),
    z0("SigningCertificateLineage attribute containd a proof-of-rotation record with signature(s) that did not verify."),
    A0("Failed to parse the SigningCertificateLineage structure in the APK Signature Scheme v3 signature's additional attributes section."),
    B0("APK signing certificate differs from the associated certificate found in the signer's SigningCertificateLineage."),
    C0("APK Signature Scheme v3 signers supported min/max SDK versions are not continuous."),
    D0("APK Signature Scheme v3 signers supported min/max SDK versions do not cover the entire desired range.  Found min:  %1$s max %2$s"),
    E0("SigningCertificateLineages targeting different platform versions using APK Signature Scheme v3 are not all a part of the same overall lineage."),
    F0("The v3 signer indicates key rotation should be supported starting from SDK version %1$s, but a v3.1 block was not found"),
    G0("The v3 signer indicates key rotation should be supported starting from SDK version %1$s, but the v3.1 block targets %2$s for rotation"),
    H0("APK supports key rotation starting from SDK version %1$s, but the v3 signer does not contain the attribute to detect if this signature is stripped"),
    I0("The APK contains a v3.1 signing block without a v3.0 base block"),
    J0("The rotation-targets-dev-release attribute is only supported on v3.1 signers; this attribute will be ignored by the platform in a v3.0 signer"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("APK Signing Block contains unknown entry: ID %1$#x"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("V4 signature has malformed signer block"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("V4 signature has unknown signing algorithm: %1$#x"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("V4 signature has no signature found"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("V4 signature has no supported signature"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("%1$s signature over signed-data did not verify"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("Failed to verify %1$s signature: %2$s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("Malformed public key: %1$s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("V4 signature has malformed certificate"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("V4 signature has no certificate"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("V4 signature has mismatched certificate and signature: <%1$s> vs <%2$s>"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("V4 signature's hash tree root (content digest) did not verity"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("V4 signature's hash tree did not verity"),
    K0("V4 signature only supports one signer"),
    L0("V4 signature and V2/V3 signature have mismatched certificates"),
    M0("V4 signature and V2/V3 signature have mismatched digests"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("V4 signature format version %1$d is different from the tool's current version %2$d"),
    N0("Neither the source stamp certificate digest file nor the signature block are present in the APK"),
    O0("No SourceStamp signature"),
    P0("Malformed certificate: %1$s"),
    Q0("Malformed SourceStamp signature"),
    R0("Unknown signature algorithm: %1$#x"),
    S0("Failed to verify %1$s signature: %2$s"),
    T0("%1$s signature over signed-data did not verify"),
    U0("No signature"),
    V0("Signature(s) {%1$s} not supported: %2$s"),
    W0("Certificate mismatch between SourceStamp block in APK signing block and SourceStamp file in APK: <%1$s> vs <%2$s>"),
    X0("A source stamp signature block was found without a corresponding certificate digest in the APK"),
    Y0("The source stamp certificate digest in the APK, %1$s, does not match the expected digest, %2$s"),
    Z0("Malformed stamp attribute #%1$d"),
    a1("Unknown stamp attribute: ID %1$#x"),
    b1("Failed to parse the SigningCertificateLineage structure in the source stamp attributes section."),
    c1("APK signing certificate differs from the associated certificate found in the signer's SigningCertificateLineage."),
    d1("Source stamp SigningCertificateLineage attribute contains a proof-of-rotation record with signature(s) that did not verify."),
    e1("The source stamp timestamp attribute has an invalid value: %1$d"),
    f1("Malformed APK; the following exception was caught when attempting to parse the APK: %1$s"),
    g1("An unexpected exception was caught when verifying the signature: %1$s");

    public final String c;

    ea(String str) {
        this.c = str;
    }
}
