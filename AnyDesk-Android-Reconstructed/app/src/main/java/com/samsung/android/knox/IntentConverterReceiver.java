package com.samsung.android.knox;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.samsung.android.knox.accounts.EmailAccountPolicy;
import com.samsung.android.knox.accounts.ExchangeAccountPolicy;
import com.samsung.android.knox.accounts.HostAuth;
import com.samsung.android.knox.accounts.LDAPAccountPolicy;
import com.samsung.android.knox.application.ApplicationPolicy;
import com.samsung.android.knox.container.KnoxContainerManager;
import com.samsung.android.knox.custom.SystemManager;
import com.samsung.android.knox.datetime.DateTimePolicy;
import com.samsung.android.knox.deviceinfo.DeviceInventory;
import com.samsung.android.knox.deviceinfo.SimChangeInfo;
import com.samsung.android.knox.integrity.AttestationPolicy;
import com.samsung.android.knox.keystore.CEPConstants;
import com.samsung.android.knox.keystore.CertificatePolicy;
import com.samsung.android.knox.kiosk.KioskMode;
import com.samsung.android.knox.license.EnterpriseLicenseManager;
import com.samsung.android.knox.license.KnoxEnterpriseLicenseManager;
import com.samsung.android.knox.location.Geofencing;
import com.samsung.android.knox.log.AuditLog;
import com.samsung.android.knox.net.firewall.Firewall;
import com.samsung.android.knox.net.vpn.GenericVpnPolicy;
import com.samsung.android.knox.restriction.RestrictionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class IntentConverterReceiver extends BroadcastReceiver {
    private static final String ACTION_CBA_INSTALL_STATUS_OLDEST = "android.intent.action.sec.CBA_INSTALL_STATUS";
    private static final String ACTION_SIM_CARD_CHANGED_OLDEST = "android.intent.action.sec.SIM_CARD_CHANGED";
    private static final int DEFAULT_CBA_INSTALL_STATUS = 1;
    private static final int DEFAULT_EXCHANGE_ACCOUNT_RESULT = 8;
    private static final int DEFAULT_VALUE = -1;

    private Intent convertActionApplicationFocusChangeIntent(Intent intent) {
        Intent intent2 = new Intent(ApplicationPolicy.ACTION_APPLICATION_FOCUS_CHANGE);
        intent2.putExtra(ApplicationPolicy.EXTRA_APPLICATION_FOCUS_COMPONENT_NAME, intent.getStringExtra("application_focus_component_name"));
        intent2.putExtra(ApplicationPolicy.EXTRA_APPLICATION_FOCUS_STATUS, intent.getStringExtra("application_focus_status"));
        intent2.putExtra("com.samsung.android.knox.intent.extra.USER_ID", intent.getIntExtra("user_id", -1));
        return intent2;
    }

    private Intent convertActionAuditFullSize() {
        return new Intent(AuditLog.ACTION_AUDIT_FULL_SIZE);
    }

    private Intent convertActionAuditMaximumSize() {
        return new Intent(AuditLog.ACTION_AUDIT_MAXIMUM_SIZE);
    }

    private Intent convertActionBindResult(Intent intent) {
        Intent intent2 = new Intent(GenericVpnPolicy.ACTION_BIND_RESULT);
        intent2.putExtra(GenericVpnPolicy.EXTRA_BIND_VENDOR, intent.getStringExtra(GenericVpnPolicy.EXTRA_BIND_VENDOR_OLD));
        intent2.putExtra(GenericVpnPolicy.EXTRA_BIND_CID, intent.getIntExtra(GenericVpnPolicy.EXTRA_BIND_CID_OLD, -1));
        intent2.putExtra(GenericVpnPolicy.EXTRA_BIND_STATUS, intent.getBooleanExtra(GenericVpnPolicy.EXTRA_BIND_STATUS_OLD, false));
        return intent2;
    }

    private Intent convertActionBlockedDomainIntent(Intent intent) {
        Intent intent2 = new Intent(Firewall.ACTION_BLOCKED_DOMAIN);
        intent2.putExtra(Firewall.EXTRA_BLOCKED_DOMAIN_PACKAGENAME, intent.getStringExtra("com.sec.enterprise.intent.extra.BLOCKED_DOMAIN_PACKAGENAME"));
        intent2.putExtra(Firewall.EXTRA_BLOCKED_DOMAIN_TIMESTAMP, intent.getStringExtra("com.sec.enterprise.intent.extra.BLOCKED_DOMAIN_TIMESTAMP"));
        intent2.putExtra(Firewall.EXTRA_BLOCKED_DOMAIN_UID, intent.getStringExtra("com.sec.enterprise.intent.extra.BLOCKED_DOMAIN_UID"));
        intent2.putExtra(Firewall.EXTRA_BLOCKED_DOMAIN_URL, intent.getStringExtra("com.sec.enterprise.intent.extra.BLOCKED_DOMAIN_URL"));
        intent2.putExtra(Firewall.EXTRA_BLOCKED_DOMAIN_ISFOREGROUND, intent.getBooleanExtra("com.sec.enterprise.intent.extra.BLOCKED_DOMAIN_ISFOREGROUND", false));
        return intent2;
    }

    private Intent convertActionCertEnrollStatus(Intent intent) {
        Intent intent2 = new Intent(CEPConstants.CEP_ACTION_CERT_ENROLL_STATUS);
        intent2.putExtra(CEPConstants.EXTRA_ENROLL_STATUS, intent.getIntExtra(CEPConstants.EXTRA_ENROLL_STATUS, -3));
        intent2.putExtra(CEPConstants.EXTRA_ENROLL_ALIAS, intent.getStringExtra(CEPConstants.EXTRA_ENROLL_ALIAS));
        intent2.putExtra(CEPConstants.EXTRA_ENROLL_TRANSACTION_ID, intent.getStringExtra(CEPConstants.EXTRA_ENROLL_TRANSACTION_ID));
        intent2.putExtra(CEPConstants.EXTRA_ENROLL_REFERENCE_NUMBER, intent.getStringExtra(CEPConstants.EXTRA_ENROLL_REFERENCE_NUMBER));
        intent2.putExtra(CEPConstants.EXTRA_ENROLL_CERT_HASH, intent.getStringExtra(CEPConstants.EXTRA_ENROLL_CERT_HASH));
        intent2.putExtra(CEPConstants.EXTRA_SERVICE_USERID, intent.getIntExtra(CEPConstants.EXTRA_SERVICE_USERID, -1));
        intent2.putExtra(CEPConstants.EXTRA_SERVICE_PROTOCOL, intent.getStringExtra(CEPConstants.EXTRA_SERVICE_PROTOCOL));
        return intent2;
    }

    private Intent convertActionCertificateRemovedIntent(Intent intent) {
        Intent intent2 = new Intent(CertificatePolicy.ACTION_CERTIFICATE_REMOVED);
        intent2.putExtra(CertificatePolicy.EXTRA_CERTIFICATE_REMOVED_SUBJECT, intent.getStringExtra("com.samsung.edm.intent.extra.CERTIFICATE_REMOVED_SUBJECT"));
        intent2.putExtra("com.samsung.android.knox.intent.extra.USER_ID", intent.getIntExtra("com.samsung.edm.intent.extra.USER_ID", -1));
        return intent2;
    }

    private Intent convertActionCriticalSize() {
        return new Intent(AuditLog.ACTION_AUDIT_CRITICAL_SIZE);
    }

    private Intent convertActionDumpLogResult(Intent intent) {
        Intent intent2 = new Intent(AuditLog.ACTION_DUMP_LOG_RESULT);
        intent2.putExtra(AuditLog.EXTRA_AUDIT_RESULT, intent.getIntExtra("mdm.intent.extra.audit.log.result", -1));
        return intent2;
    }

    private Intent convertActionEmailAccountAddResultIntent(Intent intent) {
        Intent intent2 = new Intent(EmailAccountPolicy.ACTION_EMAIL_ACCOUNT_ADD_RESULT);
        intent2.putExtra("com.samsung.android.knox.intent.extra.RESULT", intent.getIntExtra("result", -1));
        intent2.putExtra(EmailAccountPolicy.EXTRA_INCOMING_PROTOCOL, intent.getStringExtra(HostAuth.PROTOCOL));
        intent2.putExtra("com.samsung.android.knox.intent.extra.EMAIL_ADDRESS", intent.getStringExtra("email_id"));
        intent2.putExtra(EmailAccountPolicy.EXTRA_INCOMING_SERVER_ADDRESS, intent.getStringExtra("receive_host"));
        intent2.putExtra("com.samsung.android.knox.intent.extra.ACCOUNT_ID", intent.getLongExtra("account_id", -1L));
        return intent2;
    }

    private Intent convertActionEmailAccountDeleteResultIntent(Intent intent) {
        Intent intent2 = new Intent(EmailAccountPolicy.ACTION_EMAIL_ACCOUNT_DELETE_RESULT);
        intent2.putExtra("com.samsung.android.knox.intent.extra.RESULT", intent.getIntExtra("result", -1));
        intent2.putExtra(EmailAccountPolicy.EXTRA_INCOMING_PROTOCOL, intent.getStringExtra(HostAuth.PROTOCOL));
        intent2.putExtra("com.samsung.android.knox.intent.extra.EMAIL_ADDRESS", intent.getStringExtra("email_id"));
        intent2.putExtra(EmailAccountPolicy.EXTRA_INCOMING_SERVER_ADDRESS, intent.getStringExtra("receive_host"));
        intent2.putExtra("com.samsung.android.knox.intent.extra.ACCOUNT_ID", intent.getLongExtra("account_id", -1L));
        return intent2;
    }

    private Intent convertActionKnoxAttestationResult(Intent intent) {
        Intent intent2 = new Intent(AttestationPolicy.ACTION_KNOX_ATTESTATION_RESULT);
        intent2.putExtra("com.samsung.android.knox.intent.extra.RESULT", intent.getIntExtra("com.sec.enterprise.knox.intent.extra.RESULT", -4));
        intent2.putExtra(AttestationPolicy.EXTRA_ATTESTATION_DATA, intent.getByteArrayExtra("com.sec.enterprise.knox.intent.extra.ATTESTATION_DATA"));
        intent2.putExtra(AttestationPolicy.EXTRA_ERROR_MSG, intent.getStringExtra("com.sec.enterprise.knox.intent.extra.ERROR_MSG"));
        return intent2;
    }

    private Intent convertActionLogException(Intent intent) {
        Intent intent2 = new Intent(AuditLog.ACTION_LOG_EXCEPTION);
        intent2.putExtra(AuditLog.EXTRA_AUDIT_RESULT, intent.getStringExtra("mdm.intent.extra.audit.log.result"));
        return intent2;
    }

    private Intent convertActionNoUserActivity(Intent intent) {
        return new Intent(SystemManager.ACTION_NO_USER_ACTIVITY);
    }

    private Intent convertActionServiceDisconnected(Intent intent) {
        Intent intent2 = new Intent(CEPConstants.CEP_ACTION_SERVICE_DISCONNECTED);
        intent2.putExtra(CEPConstants.EXTRA_SERVICE_USERID, intent.getIntExtra(CEPConstants.EXTRA_SERVICE_USERID, -1));
        intent2.putExtra(CEPConstants.EXTRA_SERVICE_PROTOCOL, intent.getStringExtra(CEPConstants.EXTRA_SERVICE_PROTOCOL));
        return intent2;
    }

    private Intent convertActionUpdateFotaVersionIntent(Intent intent) {
        Intent intent2 = new Intent(RestrictionPolicy.ACTION_UPDATE_FOTA_VERSION_RESULT);
        intent2.putExtra(RestrictionPolicy.EXTRA_UPDATE_FOTA_VERSION_STATUS, intent.getIntExtra("com.sec.enterprise.intent.extra.UPDATE_FOTA_VERSION_STATUS", -1));
        return intent2;
    }

    private Intent convertActionUserActivity(Intent intent) {
        return new Intent(SystemManager.ACTION_USER_ACTIVITY);
    }

    private Intent convertCbaInstallStatusIntent(Intent intent) {
        Intent intent2 = new Intent(ExchangeAccountPolicy.ACTION_CBA_INSTALL_STATUS);
        intent2.putExtra(ExchangeAccountPolicy.EXTRA_STATUS, intent.getIntExtra("status", 1));
        return intent2;
    }

    private Intent convertCertificateFailureIntent(Intent intent) {
        Intent intent2 = new Intent(CertificatePolicy.ACTION_CERTIFICATE_FAILURE);
        intent2.putExtra(CertificatePolicy.EXTRA_CERTIFICATE_FAILURE_MODULE, intent.getStringExtra("certificate_failure_module"));
        intent2.putExtra(CertificatePolicy.EXTRA_CERTIFICATE_FAILURE_MESSAGE, intent.getStringExtra("certificate_failure_message"));
        if (EnterpriseDeviceManager.getAPILevel() >= 19) {
            intent2.putExtra("com.samsung.android.knox.intent.extra.USER_ID", intent.getIntExtra("com.samsung.edm.intent.extra.USER_ID", -1));
        }
        return intent2;
    }

    private Intent convertContainerAdminLockIntent(Intent intent) {
        Intent intent2 = new Intent(KnoxContainerManager.ACTION_CONTAINER_ADMIN_LOCK);
        Bundle bundleExtra = intent.getBundleExtra(KnoxContainerManager.INTENT_BUNDLE);
        Bundle bundle = new Bundle();
        bundle.putInt(KnoxContainerManager.CONTAINER_ID, bundleExtra.getInt(KnoxContainerManager.CONTAINER_ID));
        intent2.putExtra(KnoxContainerManager.INTENT_BUNDLE, bundle);
        return intent2;
    }

    private Intent convertContainerCreationStatusIntent(Intent intent) {
        Intent intent2 = new Intent(KnoxContainerManager.ACTION_CONTAINER_CREATION_STATUS);
        Bundle extras = intent.getExtras();
        Bundle bundle = new Bundle();
        bundle.putInt(KnoxContainerManager.CONTAINER_CREATION_STATUS_CODE, extras.getInt(KnoxContainerManager.CONTAINER_CREATION_STATUS_CODE));
        bundle.putInt(KnoxContainerManager.CONTAINER_CREATION_REQUEST_ID, extras.getInt(KnoxContainerManager.CONTAINER_CREATION_REQUEST_ID));
        intent2.putExtra(KnoxContainerManager.INTENT_BUNDLE, bundle);
        return intent2;
    }

    private Intent convertContainerRemovedIntent(Intent intent) {
        Intent intent2 = new Intent(KnoxContainerManager.ACTION_CONTAINER_REMOVED);
        Bundle bundleExtra = intent.getBundleExtra(KnoxContainerManager.INTENT_BUNDLE);
        Bundle bundle = new Bundle();
        bundle.putInt(KnoxContainerManager.CONTAINER_ID, bundleExtra.getInt(KnoxContainerManager.CONTAINER_ID));
        intent2.putExtra(KnoxContainerManager.INTENT_BUNDLE, bundle);
        return intent2;
    }

    private Intent convertContainerStateChangedIntent(Intent intent) {
        Intent intent2 = new Intent(KnoxContainerManager.ACTION_CONTAINER_STATE_CHANGED);
        Bundle bundleExtra = intent.getBundleExtra(KnoxContainerManager.INTENT_BUNDLE);
        Bundle bundle = new Bundle();
        bundle.putInt(KnoxContainerManager.CONTAINER_ID, bundleExtra.getInt(KnoxContainerManager.CONTAINER_ID));
        bundle.putInt(KnoxContainerManager.CONTAINER_OLD_STATE, bundleExtra.getInt(KnoxContainerManager.CONTAINER_OLD_STATE));
        bundle.putInt(KnoxContainerManager.CONTAINER_NEW_STATE, bundleExtra.getInt(KnoxContainerManager.CONTAINER_NEW_STATE));
        intent2.putExtra(KnoxContainerManager.INTENT_BUNDLE, bundle);
        return intent2;
    }

    private Intent convertCreateLDAPAccountResultIntent(Intent intent) {
        Intent intent2 = new Intent(LDAPAccountPolicy.ACTION_LDAP_CREATE_ACCT_RESULT);
        intent2.putExtra(LDAPAccountPolicy.EXTRA_LDAP_RESULT, intent.getIntExtra("edm.intent.extra.ldap.result", -1));
        intent2.putExtra(LDAPAccountPolicy.EXTRA_LDAP_ACCT_ID, intent.getLongExtra("edm.intent.extra.ldap.acct.id", -1L));
        if (EnterpriseDeviceManager.getAPILevel() >= 12) {
            intent2.putExtra(LDAPAccountPolicy.EXTRA_LDAP_USER_ID, intent.getIntExtra("edm.intent.extra.ldap.user.id", -1));
        }
        return intent2;
    }

    private Intent convertDeviceInsideGeofenceIntent(Intent intent) {
        Intent intent2 = new Intent(Geofencing.ACTION_DEVICE_INSIDE_GEOFENCE);
        intent2.putExtra(Geofencing.EXTRA_ID, intent.getIntArrayExtra("edm.intent.extra.geofence.id"));
        if (EnterpriseDeviceManager.getAPILevel() >= 12) {
            intent2.putExtra("com.samsung.android.knox.intent.extra.USER_ID", intent.getIntExtra("edm.intent.extra.geofence.user.id", -1));
        }
        return intent2;
    }

    private Intent convertDeviceLocationUnavailableIntent(Intent intent) {
        Intent intent2 = new Intent(Geofencing.ACTION_DEVICE_LOCATION_UNAVAILABLE);
        if (EnterpriseDeviceManager.getAPILevel() >= 12) {
            intent2.putExtra("com.samsung.android.knox.intent.extra.USER_ID", intent.getIntExtra("edm.intent.extra.geofence.user.id", -1));
        }
        return intent2;
    }

    private Intent convertDeviceOutsideGeofenceIntent(Intent intent) {
        Intent intent2 = new Intent(Geofencing.ACTION_DEVICE_OUTSIDE_GEOFENCE);
        if (EnterpriseDeviceManager.getAPILevel() >= 12) {
            intent2.putExtra("com.samsung.android.knox.intent.extra.USER_ID", intent.getIntExtra("edm.intent.extra.geofence.user.id", -1));
        }
        return intent2;
    }

    private Intent convertDisableKioskModeResultIntent(Intent intent) {
        Intent intent2 = new Intent(KioskMode.ACTION_DISABLE_KIOSK_MODE_RESULT);
        intent2.putExtra(KioskMode.EXTRA_KIOSK_RESULT, intent.getIntExtra("edm.intent.extra.kiosk.mode.result", -2000));
        return intent2;
    }

    private Intent convertEnableKioskModeResultIntent(Intent intent) {
        Intent intent2 = new Intent(KioskMode.ACTION_ENABLE_KIOSK_MODE_RESULT);
        intent2.putExtra(KioskMode.EXTRA_KIOSK_RESULT, intent.getIntExtra("edm.intent.extra.kiosk.mode.result", -1));
        return intent2;
    }

    private Intent convertEnforceSmimeAliasResultIntent(Intent intent) {
        Intent intent2 = new Intent(ExchangeAccountPolicy.ACTION_ENFORCE_SMIME_ALIAS_RESULT);
        intent2.putExtra(ExchangeAccountPolicy.EXTRA_ENFORCE_SMIME_ALIAS_TYPE, intent.getIntExtra("com.samsung.edm.intent.extra.ENFORCE_SMIME_ALIAS_TYPE", -1));
        intent2.putExtra("com.samsung.android.knox.intent.extra.ACCOUNT_ID", intent.getLongExtra("account_id", -1L));
        intent2.putExtra(ExchangeAccountPolicy.EXTRA_SMIME_RESULT, intent.getIntExtra("result", 0));
        return intent2;
    }

    private Intent convertExchangeAccountAddResultIntent(Intent intent) {
        Intent intent2 = new Intent(ExchangeAccountPolicy.ACTION_EXCHANGE_ACCOUNT_ADD_RESULT);
        intent2.putExtra("com.samsung.android.knox.intent.extra.RESULT", intent.getIntExtra("result", 8));
        intent2.putExtra("com.samsung.android.knox.intent.extra.EMAIL_ADDRESS", intent.getStringExtra("email_id"));
        intent2.putExtra(ExchangeAccountPolicy.EXTRA_SERVER_ADDRESS, intent.getStringExtra("server_host"));
        intent2.putExtra("com.samsung.android.knox.intent.extra.ACCOUNT_ID", intent.getLongExtra("account_id", -1L));
        return intent2;
    }

    private Intent convertExchangeAccountDeleteResultIntent(Intent intent) {
        Intent intent2 = new Intent(ExchangeAccountPolicy.ACTION_EXCHANGE_ACCOUNT_DELETE_RESULT);
        intent2.putExtra("com.samsung.android.knox.intent.extra.RESULT", intent.getIntExtra("result", 8));
        intent2.putExtra("com.samsung.android.knox.intent.extra.EMAIL_ADDRESS", intent.getStringExtra("email_id"));
        intent2.putExtra(ExchangeAccountPolicy.EXTRA_SERVER_ADDRESS, intent.getStringExtra("server_host"));
        intent2.putExtra("com.samsung.android.knox.intent.extra.ACCOUNT_ID", intent.getLongExtra("account_id", -1L));
        return intent2;
    }

    private Intent convertKnoxLicenseStatusIntent(Intent intent) {
        Intent intent2 = new Intent(KnoxEnterpriseLicenseManager.ACTION_LICENSE_STATUS);
        intent2.putExtra(KnoxEnterpriseLicenseManager.EXTRA_LICENSE_STATUS, intent.getStringExtra("edm.intent.extra.knox_license.status"));
        intent2.putExtra(KnoxEnterpriseLicenseManager.EXTRA_LICENSE_ERROR_CODE, intent.getIntExtra("edm.intent.extra.knox_license.errorcode", 102));
        intent2.putExtra(KnoxEnterpriseLicenseManager.EXTRA_LICENSE_ACTIVATION_INITIATOR, intent.getIntExtra("edm.intent.extra.knox_license.activaton_initiator", -1));
        intent2.putExtra(KnoxEnterpriseLicenseManager.EXTRA_LICENSE_RESULT_TYPE, intent.getIntExtra("edm.intent.extra.knox_license.result_type", -1));
        return intent2;
    }

    private Intent convertLicenseStatusIntent(Intent intent) {
        Intent intent2 = new Intent(EnterpriseLicenseManager.ACTION_LICENSE_STATUS);
        intent2.putExtra(EnterpriseLicenseManager.EXTRA_LICENSE_STATUS, intent.getStringExtra("edm.intent.extra.license.status"));
        intent2.putExtra(EnterpriseLicenseManager.EXTRA_LICENSE_ERROR_CODE, intent.getIntExtra("edm.intent.extra.license.errorcode", 102));
        intent2.putExtra(EnterpriseLicenseManager.EXTRA_LICENSE_RESULT_TYPE, intent.getIntExtra("edm.intent.extra.license.result_type", -1));
        intent2.putExtra(EnterpriseLicenseManager.EXTRA_LICENSE_PERM_GROUP, intent.getStringExtra("edm.intent.extra.license.perm_group"));
        if (EnterpriseDeviceManager.getAPILevel() >= 20) {
            intent2.putExtra(EnterpriseLicenseManager.EXTRA_LICENSE_ATTESTATION_STATUS, intent.getIntExtra("com.sec.enterprise.intent.extra.LICENSE_ATTESTATION_STATUS", 3));
        }
        return intent2;
    }

    private Intent convertNtpServerUnreachableIntent(Intent intent) {
        return new Intent(DateTimePolicy.ACTION_EVENT_NTP_SERVER_UNREACHABLE);
    }

    private Intent convertPreventApplicationStartIntent(Intent intent) {
        Intent intent2 = new Intent(ApplicationPolicy.ACTION_PREVENT_APPLICATION_START);
        intent2.putExtra(ApplicationPolicy.EXTRA_APPLICATION_PACKAGE_NAME, intent.getStringExtra("application_package_name"));
        intent2.putExtra("com.samsung.android.knox.intent.extra.USER_ID", intent.getIntExtra("user_id", -1));
        return intent2;
    }

    private Intent convertPreventApplicationStopIntent(Intent intent) {
        Intent intent2 = new Intent(ApplicationPolicy.ACTION_PREVENT_APPLICATION_STOP);
        intent2.putExtra(ApplicationPolicy.EXTRA_APPLICATION_PACKAGE_NAME, intent.getStringExtra("application_package_name"));
        intent2.putExtra("com.samsung.android.knox.intent.extra.USER_ID", intent.getIntExtra("user_id", -1));
        intent2.putExtra(ApplicationPolicy.EXTRA_ERROR_TYPE, intent.getStringExtra("error_type"));
        intent2.putExtra(ApplicationPolicy.EXTRA_ERROR_REASON, intent.getStringExtra("error_reason"));
        intent2.putExtra(ApplicationPolicy.EXTRA_ERROR_CLASS, intent.getStringExtra("error_class"));
        return intent2;
    }

    private Intent convertSimCardChangedIntent(Intent intent) {
        Intent intent2 = new Intent(DeviceInventory.ACTION_SIM_CARD_CHANGED);
        intent2.putExtra(DeviceInventory.EXTRA_SIM_CHANGE_INFO, SimChangeInfo.convertToNew(intent.getParcelableExtra("simChangeInfo")));
        return intent2;
    }

    private Intent convertUnexpectedKioskBehaviorIntent(Intent intent) {
        return new Intent(KioskMode.ACTION_UNEXPECTED_KIOSK_BEHAVIOR);
    }

    /* JADX WARN: Code duplicated, block: B:159:0x02ad  */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intent intentConvertActionLogException;
        String action = intent.getAction();
        if (EnterpriseDeviceManager.getAPILevel() <= -1 || EnterpriseDeviceManager.getAPILevel() > 20) {
            intentConvertActionLogException = null;
        } else if ("com.samsung.enterprise.container_state_changed".equals(action)) {
            intentConvertActionLogException = convertContainerStateChangedIntent(intent);
        } else if ("com.samsung.knox.container.creation.status".equals(action)) {
            intentConvertActionLogException = convertContainerCreationStatusIntent(intent);
        } else if ("com.samsung.knox.container.admin.locked".equals(action)) {
            intentConvertActionLogException = convertContainerAdminLockIntent(intent);
        } else if ("com.samsung.knox.container.removed".equals(action)) {
            intentConvertActionLogException = convertContainerRemovedIntent(intent);
        } else if ("edm.intent.application.action.prevent.start".equals(action)) {
            intentConvertActionLogException = convertPreventApplicationStartIntent(intent);
        } else if ("edm.intent.application.action.prevent.stop".equals(action)) {
            if (EnterpriseDeviceManager.getAPILevel() >= 14) {
                intentConvertActionLogException = convertPreventApplicationStopIntent(intent);
            } else {
                intentConvertActionLogException = null;
            }
        } else if ("edm.intent.action.ldap.createacct.result".equals(action)) {
            intentConvertActionLogException = convertCreateLDAPAccountResultIntent(intent);
        } else if ("edm.intent.action.device.inside".equals(action)) {
            intentConvertActionLogException = convertDeviceInsideGeofenceIntent(intent);
        } else if ("edm.intent.action.device.outside".equals(action)) {
            intentConvertActionLogException = convertDeviceOutsideGeofenceIntent(intent);
        } else if ("edm.intent.action.device.location.unavailable".equals(action)) {
            intentConvertActionLogException = convertDeviceLocationUnavailableIntent(intent);
        } else if ("com.samsung.edm.intent.action.CERTIFICATE_REMOVED".equals(action)) {
            if (EnterpriseDeviceManager.getAPILevel() >= 19) {
                intentConvertActionLogException = convertActionCertificateRemovedIntent(intent);
            } else {
                intentConvertActionLogException = null;
            }
        } else if ("edm.intent.certificate.action.certificate.failure".equals(action)) {
            intentConvertActionLogException = convertCertificateFailureIntent(intent);
        } else if ("com.samsung.edm.intent.action.APPLICATION_FOCUS_CHANGE".equals(action)) {
            if (EnterpriseDeviceManager.getAPILevel() >= 15) {
                intentConvertActionLogException = convertActionApplicationFocusChangeIntent(intent);
            } else {
                intentConvertActionLogException = null;
            }
        } else if ("edm.intent.action.EMAIL_ACCOUNT_ADD_RESULT".equals(action)) {
            intentConvertActionLogException = convertActionEmailAccountAddResultIntent(intent);
        } else if ("edm.intent.action.EMAIL_ACCOUNT_DELETE_RESULT".equals(action)) {
            intentConvertActionLogException = convertActionEmailAccountDeleteResultIntent(intent);
        } else if ("com.sec.enterprise.intent.action.BLOCKED_DOMAIN".equals(action)) {
            if (EnterpriseDeviceManager.getAPILevel() >= 20) {
                intentConvertActionLogException = convertActionBlockedDomainIntent(intent);
            } else {
                intentConvertActionLogException = null;
            }
        } else if ("com.sec.enterprise.intent.action.UPDATE_FOTA_VERSION_RESULT".equals(action)) {
            if (EnterpriseDeviceManager.getAPILevel() >= 20) {
                intentConvertActionLogException = convertActionUpdateFotaVersionIntent(intent);
            } else {
                intentConvertActionLogException = null;
            }
        } else if (ACTION_CBA_INSTALL_STATUS_OLDEST.equals(action)) {
            if (EnterpriseDeviceManager.getAPILevel() <= -1 || EnterpriseDeviceManager.getAPILevel() >= 15) {
                intentConvertActionLogException = null;
            } else {
                intentConvertActionLogException = convertCbaInstallStatusIntent(intent);
            }
        } else if ("com.samsung.edm.intent.action.EXCHANGE_CBA_INSTALL_STATUS".equals(action)) {
            if (EnterpriseDeviceManager.getAPILevel() >= 15) {
                intentConvertActionLogException = convertCbaInstallStatusIntent(intent);
            } else {
                intentConvertActionLogException = null;
            }
        } else if ("edm.intent.action.EXCHANGE_ACCOUNT_ADD_RESULT".equals(action)) {
            intentConvertActionLogException = convertExchangeAccountAddResultIntent(intent);
        } else if ("edm.intent.action.EXCHANGE_ACCOUNT_DELETE_RESULT".equals(action)) {
            intentConvertActionLogException = convertExchangeAccountDeleteResultIntent(intent);
        } else if ("com.samsung.edm.intent.action.ENFORCE_SMIME_ALIAS_RESULT".equals(action)) {
            if (EnterpriseDeviceManager.getAPILevel() >= 15) {
                intentConvertActionLogException = convertEnforceSmimeAliasResultIntent(intent);
            } else {
                intentConvertActionLogException = null;
            }
        } else if ("edm.intent.action.knox_license.status".equals(action)) {
            intentConvertActionLogException = convertKnoxLicenseStatusIntent(intent);
        } else if ("edm.intent.action.license.status".equals(action)) {
            intentConvertActionLogException = convertLicenseStatusIntent(intent);
        } else if ("com.samsung.edm.intent.event.NTP_SERVER_UNREACHABLE".equals(action)) {
            if (EnterpriseDeviceManager.getAPILevel() >= 17) {
                intentConvertActionLogException = convertNtpServerUnreachableIntent(intent);
            } else {
                intentConvertActionLogException = null;
            }
        } else if ("edm.intent.action.enable.kiosk.mode.result".equals(action)) {
            intentConvertActionLogException = convertEnableKioskModeResultIntent(intent);
        } else if ("edm.intent.action.disable.kiosk.mode.result".equals(action)) {
            intentConvertActionLogException = convertDisableKioskModeResultIntent(intent);
        } else if ("edm.intent.action.unexpected.kiosk.behavior".equals(action)) {
            intentConvertActionLogException = convertUnexpectedKioskBehaviorIntent(intent);
        } else if (ACTION_SIM_CARD_CHANGED_OLDEST.equals(action)) {
            if (EnterpriseDeviceManager.getAPILevel() <= -1 || EnterpriseDeviceManager.getAPILevel() >= 15) {
                intentConvertActionLogException = null;
            } else {
                intentConvertActionLogException = convertSimCardChangedIntent(intent);
            }
        } else if ("com.samsung.edm.intent.action.SIM_CARD_CHANGED".equals(action)) {
            if (EnterpriseDeviceManager.getAPILevel() >= 15) {
                intentConvertActionLogException = convertSimCardChangedIntent(intent);
            } else {
                intentConvertActionLogException = null;
            }
        } else if ("com.samsung.action.knox.certenroll.CEP_CERT_ENROLL_STATUS".equals(action)) {
            if (EnterpriseDeviceManager.getAPILevel() >= 12) {
                intentConvertActionLogException = convertActionCertEnrollStatus(intent);
            } else {
                intentConvertActionLogException = null;
            }
        } else if ("com.samsung.action.knox.certenroll.CEP_SERVICE_DISCONNECTED".equals(action)) {
            if (EnterpriseDeviceManager.getAPILevel() >= 12) {
                intentConvertActionLogException = convertActionServiceDisconnected(intent);
            } else {
                intentConvertActionLogException = null;
            }
        } else if ("com.sec.enterprise.knox.intent.action.KNOX_ATTESTATION_RESULT".equals(action)) {
            intentConvertActionLogException = convertActionKnoxAttestationResult(intent);
        } else if (SystemManager.ACTION_NO_USER_ACTIVITY_OLD.equals(action)) {
            intentConvertActionLogException = convertActionNoUserActivity(intent);
        } else if (SystemManager.ACTION_USER_ACTIVITY_OLD.equals(action)) {
            intentConvertActionLogException = convertActionUserActivity(intent);
        } else if (GenericVpnPolicy.ACTION_BIND_RESULT_OLD.equals(action)) {
            intentConvertActionLogException = convertActionBindResult(intent);
        } else if ("mdm.intent.action.audit.log.critical.size".equals(action)) {
            intentConvertActionLogException = convertActionCriticalSize();
        } else if ("mdm.intent.action.audit.log.full.size".equals(action)) {
            intentConvertActionLogException = convertActionAuditFullSize();
        } else if ("mdm.intent.action.audit.log.maximum.size".equals(action)) {
            intentConvertActionLogException = convertActionAuditMaximumSize();
        } else if ("mdm.intent.action.dump.audit.log.result".equals(action)) {
            intentConvertActionLogException = convertActionDumpLogResult(intent);
        } else if ("mdm.intent.action.audit.log.exception".equals(action)) {
            intentConvertActionLogException = convertActionLogException(intent);
        } else {
            intentConvertActionLogException = null;
        }
        if (intentConvertActionLogException != null) {
            intentConvertActionLogException.setPackage(context.getPackageName());
            context.sendBroadcast(intentConvertActionLogException);
        }
    }
}
