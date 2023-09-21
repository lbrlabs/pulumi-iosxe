// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.GetDot1xCredential;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDot1xResult {
    /**
     * @return Send EAPOL-Success on successful auth-fail Authorization
     * 
     */
    private Boolean authFailEapol;
    /**
     * @return Configure 802.1X credentials profiles
     * 
     */
    private List<GetDot1xCredential> credentials;
    /**
     * @return Block all EAPoL transaction on Critical Authentication
     * 
     */
    private Boolean criticalEapolConfigBlock;
    /**
     * @return Set 802.1x Critical Authentication Recovery Delay period
     * 
     */
    private Integer criticalRecoveryDelay;
    /**
     * @return A device name from the provider configuration.
     * 
     */
    private @Nullable String device;
    /**
     * @return The path of the retrieved object.
     * 
     */
    private String id;
    /**
     * @return Show verbose messages in system logs
     * 
     */
    private Boolean loggingVerbose;
    /**
     * @return Controlled access is only applied during authentication
     * 
     */
    private Boolean supplicantControlledTransient;
    /**
     * @return Force 802.1X supplicant to send multicast packets
     * 
     */
    private Boolean supplicantForceMulticast;
    /**
     * @return Enable or Disable SysAuthControl
     * 
     */
    private Boolean systemAuthControl;
    /**
     * @return Timeout for device EAPOL capabilities test in seconds
     * 
     */
    private Integer testTimeout;

    private GetDot1xResult() {}
    /**
     * @return Send EAPOL-Success on successful auth-fail Authorization
     * 
     */
    public Boolean authFailEapol() {
        return this.authFailEapol;
    }
    /**
     * @return Configure 802.1X credentials profiles
     * 
     */
    public List<GetDot1xCredential> credentials() {
        return this.credentials;
    }
    /**
     * @return Block all EAPoL transaction on Critical Authentication
     * 
     */
    public Boolean criticalEapolConfigBlock() {
        return this.criticalEapolConfigBlock;
    }
    /**
     * @return Set 802.1x Critical Authentication Recovery Delay period
     * 
     */
    public Integer criticalRecoveryDelay() {
        return this.criticalRecoveryDelay;
    }
    /**
     * @return A device name from the provider configuration.
     * 
     */
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }
    /**
     * @return The path of the retrieved object.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Show verbose messages in system logs
     * 
     */
    public Boolean loggingVerbose() {
        return this.loggingVerbose;
    }
    /**
     * @return Controlled access is only applied during authentication
     * 
     */
    public Boolean supplicantControlledTransient() {
        return this.supplicantControlledTransient;
    }
    /**
     * @return Force 802.1X supplicant to send multicast packets
     * 
     */
    public Boolean supplicantForceMulticast() {
        return this.supplicantForceMulticast;
    }
    /**
     * @return Enable or Disable SysAuthControl
     * 
     */
    public Boolean systemAuthControl() {
        return this.systemAuthControl;
    }
    /**
     * @return Timeout for device EAPOL capabilities test in seconds
     * 
     */
    public Integer testTimeout() {
        return this.testTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDot1xResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean authFailEapol;
        private List<GetDot1xCredential> credentials;
        private Boolean criticalEapolConfigBlock;
        private Integer criticalRecoveryDelay;
        private @Nullable String device;
        private String id;
        private Boolean loggingVerbose;
        private Boolean supplicantControlledTransient;
        private Boolean supplicantForceMulticast;
        private Boolean systemAuthControl;
        private Integer testTimeout;
        public Builder() {}
        public Builder(GetDot1xResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authFailEapol = defaults.authFailEapol;
    	      this.credentials = defaults.credentials;
    	      this.criticalEapolConfigBlock = defaults.criticalEapolConfigBlock;
    	      this.criticalRecoveryDelay = defaults.criticalRecoveryDelay;
    	      this.device = defaults.device;
    	      this.id = defaults.id;
    	      this.loggingVerbose = defaults.loggingVerbose;
    	      this.supplicantControlledTransient = defaults.supplicantControlledTransient;
    	      this.supplicantForceMulticast = defaults.supplicantForceMulticast;
    	      this.systemAuthControl = defaults.systemAuthControl;
    	      this.testTimeout = defaults.testTimeout;
        }

        @CustomType.Setter
        public Builder authFailEapol(Boolean authFailEapol) {
            this.authFailEapol = Objects.requireNonNull(authFailEapol);
            return this;
        }
        @CustomType.Setter
        public Builder credentials(List<GetDot1xCredential> credentials) {
            this.credentials = Objects.requireNonNull(credentials);
            return this;
        }
        public Builder credentials(GetDot1xCredential... credentials) {
            return credentials(List.of(credentials));
        }
        @CustomType.Setter
        public Builder criticalEapolConfigBlock(Boolean criticalEapolConfigBlock) {
            this.criticalEapolConfigBlock = Objects.requireNonNull(criticalEapolConfigBlock);
            return this;
        }
        @CustomType.Setter
        public Builder criticalRecoveryDelay(Integer criticalRecoveryDelay) {
            this.criticalRecoveryDelay = Objects.requireNonNull(criticalRecoveryDelay);
            return this;
        }
        @CustomType.Setter
        public Builder device(@Nullable String device) {
            this.device = device;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder loggingVerbose(Boolean loggingVerbose) {
            this.loggingVerbose = Objects.requireNonNull(loggingVerbose);
            return this;
        }
        @CustomType.Setter
        public Builder supplicantControlledTransient(Boolean supplicantControlledTransient) {
            this.supplicantControlledTransient = Objects.requireNonNull(supplicantControlledTransient);
            return this;
        }
        @CustomType.Setter
        public Builder supplicantForceMulticast(Boolean supplicantForceMulticast) {
            this.supplicantForceMulticast = Objects.requireNonNull(supplicantForceMulticast);
            return this;
        }
        @CustomType.Setter
        public Builder systemAuthControl(Boolean systemAuthControl) {
            this.systemAuthControl = Objects.requireNonNull(systemAuthControl);
            return this;
        }
        @CustomType.Setter
        public Builder testTimeout(Integer testTimeout) {
            this.testTimeout = Objects.requireNonNull(testTimeout);
            return this;
        }
        public GetDot1xResult build() {
            final var o = new GetDot1xResult();
            o.authFailEapol = authFailEapol;
            o.credentials = credentials;
            o.criticalEapolConfigBlock = criticalEapolConfigBlock;
            o.criticalRecoveryDelay = criticalRecoveryDelay;
            o.device = device;
            o.id = id;
            o.loggingVerbose = loggingVerbose;
            o.supplicantControlledTransient = supplicantControlledTransient;
            o.supplicantForceMulticast = supplicantForceMulticast;
            o.systemAuthControl = systemAuthControl;
            o.testTimeout = testTimeout;
            return o;
        }
    }
}
