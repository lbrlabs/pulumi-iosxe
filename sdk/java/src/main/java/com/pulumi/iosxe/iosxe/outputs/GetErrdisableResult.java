// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetErrdisableResult {
    private Boolean detectCauseAll;
    private Boolean detectCauseArpInspection;
    private Boolean detectCauseBpduguard;
    private Boolean detectCauseDhcpRateLimit;
    private Boolean detectCauseDtpFlap;
    private Boolean detectCauseGbicInvalid;
    private Boolean detectCauseInlinePower;
    private Boolean detectCauseL2ptguard;
    private Boolean detectCauseLinkFlap;
    private Boolean detectCauseLoopback;
    private Boolean detectCauseLoopdetect;
    private Boolean detectCauseMlacpMinlink;
    private Boolean detectCausePagpFlap;
    private Boolean detectCausePppoeIaRateLimit;
    private Boolean detectCauseSecurityViolationShutdownVlan;
    private Boolean detectCauseSfpConfigMismatch;
    private Boolean detectCauseSmallFrame;
    private @Nullable String device;
    private Integer flapSettingCauseDtpFlapMaxFlaps;
    private Integer flapSettingCauseDtpFlapTime;
    private Integer flapSettingCauseLinkFlapMaxFlaps;
    private Integer flapSettingCauseLinkFlapTime;
    private Integer flapSettingCausePagpFlapMaxFlaps;
    private Integer flapSettingCausePagpFlapTime;
    private String id;
    private Boolean recoveryCauseAll;
    private Boolean recoveryCauseArpInspection;
    private Boolean recoveryCauseBpduguard;
    private Boolean recoveryCauseChannelMisconfig;
    private Boolean recoveryCauseDhcpRateLimit;
    private Boolean recoveryCauseDtpFlap;
    private Boolean recoveryCauseGbicInvalid;
    private Boolean recoveryCauseInlinePower;
    private Boolean recoveryCauseL2ptguard;
    private Boolean recoveryCauseLinkFlap;
    private Boolean recoveryCauseLinkMonitorFailure;
    private Boolean recoveryCauseLoopback;
    private Boolean recoveryCauseLoopdetect;
    private Boolean recoveryCauseMacLimit;
    private Boolean recoveryCauseMlacpMinlink;
    private Boolean recoveryCausePagpFlap;
    private Boolean recoveryCausePortModeFailure;
    private Boolean recoveryCausePppoeIaRateLimit;
    private Boolean recoveryCausePsecureViolation;
    private Boolean recoveryCausePsp;
    private Boolean recoveryCauseSecurityViolation;
    private Boolean recoveryCauseSfpConfigMismatch;
    private Boolean recoveryCauseSmallFrame;
    private Boolean recoveryCauseStormControl;
    private Boolean recoveryCauseUdld;
    private Boolean recoveryCauseUnicastFlood;
    private Boolean recoveryCauseVmps;
    private Integer recoveryInterval;

    private GetErrdisableResult() {}
    public Boolean detectCauseAll() {
        return this.detectCauseAll;
    }
    public Boolean detectCauseArpInspection() {
        return this.detectCauseArpInspection;
    }
    public Boolean detectCauseBpduguard() {
        return this.detectCauseBpduguard;
    }
    public Boolean detectCauseDhcpRateLimit() {
        return this.detectCauseDhcpRateLimit;
    }
    public Boolean detectCauseDtpFlap() {
        return this.detectCauseDtpFlap;
    }
    public Boolean detectCauseGbicInvalid() {
        return this.detectCauseGbicInvalid;
    }
    public Boolean detectCauseInlinePower() {
        return this.detectCauseInlinePower;
    }
    public Boolean detectCauseL2ptguard() {
        return this.detectCauseL2ptguard;
    }
    public Boolean detectCauseLinkFlap() {
        return this.detectCauseLinkFlap;
    }
    public Boolean detectCauseLoopback() {
        return this.detectCauseLoopback;
    }
    public Boolean detectCauseLoopdetect() {
        return this.detectCauseLoopdetect;
    }
    public Boolean detectCauseMlacpMinlink() {
        return this.detectCauseMlacpMinlink;
    }
    public Boolean detectCausePagpFlap() {
        return this.detectCausePagpFlap;
    }
    public Boolean detectCausePppoeIaRateLimit() {
        return this.detectCausePppoeIaRateLimit;
    }
    public Boolean detectCauseSecurityViolationShutdownVlan() {
        return this.detectCauseSecurityViolationShutdownVlan;
    }
    public Boolean detectCauseSfpConfigMismatch() {
        return this.detectCauseSfpConfigMismatch;
    }
    public Boolean detectCauseSmallFrame() {
        return this.detectCauseSmallFrame;
    }
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }
    public Integer flapSettingCauseDtpFlapMaxFlaps() {
        return this.flapSettingCauseDtpFlapMaxFlaps;
    }
    public Integer flapSettingCauseDtpFlapTime() {
        return this.flapSettingCauseDtpFlapTime;
    }
    public Integer flapSettingCauseLinkFlapMaxFlaps() {
        return this.flapSettingCauseLinkFlapMaxFlaps;
    }
    public Integer flapSettingCauseLinkFlapTime() {
        return this.flapSettingCauseLinkFlapTime;
    }
    public Integer flapSettingCausePagpFlapMaxFlaps() {
        return this.flapSettingCausePagpFlapMaxFlaps;
    }
    public Integer flapSettingCausePagpFlapTime() {
        return this.flapSettingCausePagpFlapTime;
    }
    public String id() {
        return this.id;
    }
    public Boolean recoveryCauseAll() {
        return this.recoveryCauseAll;
    }
    public Boolean recoveryCauseArpInspection() {
        return this.recoveryCauseArpInspection;
    }
    public Boolean recoveryCauseBpduguard() {
        return this.recoveryCauseBpduguard;
    }
    public Boolean recoveryCauseChannelMisconfig() {
        return this.recoveryCauseChannelMisconfig;
    }
    public Boolean recoveryCauseDhcpRateLimit() {
        return this.recoveryCauseDhcpRateLimit;
    }
    public Boolean recoveryCauseDtpFlap() {
        return this.recoveryCauseDtpFlap;
    }
    public Boolean recoveryCauseGbicInvalid() {
        return this.recoveryCauseGbicInvalid;
    }
    public Boolean recoveryCauseInlinePower() {
        return this.recoveryCauseInlinePower;
    }
    public Boolean recoveryCauseL2ptguard() {
        return this.recoveryCauseL2ptguard;
    }
    public Boolean recoveryCauseLinkFlap() {
        return this.recoveryCauseLinkFlap;
    }
    public Boolean recoveryCauseLinkMonitorFailure() {
        return this.recoveryCauseLinkMonitorFailure;
    }
    public Boolean recoveryCauseLoopback() {
        return this.recoveryCauseLoopback;
    }
    public Boolean recoveryCauseLoopdetect() {
        return this.recoveryCauseLoopdetect;
    }
    public Boolean recoveryCauseMacLimit() {
        return this.recoveryCauseMacLimit;
    }
    public Boolean recoveryCauseMlacpMinlink() {
        return this.recoveryCauseMlacpMinlink;
    }
    public Boolean recoveryCausePagpFlap() {
        return this.recoveryCausePagpFlap;
    }
    public Boolean recoveryCausePortModeFailure() {
        return this.recoveryCausePortModeFailure;
    }
    public Boolean recoveryCausePppoeIaRateLimit() {
        return this.recoveryCausePppoeIaRateLimit;
    }
    public Boolean recoveryCausePsecureViolation() {
        return this.recoveryCausePsecureViolation;
    }
    public Boolean recoveryCausePsp() {
        return this.recoveryCausePsp;
    }
    public Boolean recoveryCauseSecurityViolation() {
        return this.recoveryCauseSecurityViolation;
    }
    public Boolean recoveryCauseSfpConfigMismatch() {
        return this.recoveryCauseSfpConfigMismatch;
    }
    public Boolean recoveryCauseSmallFrame() {
        return this.recoveryCauseSmallFrame;
    }
    public Boolean recoveryCauseStormControl() {
        return this.recoveryCauseStormControl;
    }
    public Boolean recoveryCauseUdld() {
        return this.recoveryCauseUdld;
    }
    public Boolean recoveryCauseUnicastFlood() {
        return this.recoveryCauseUnicastFlood;
    }
    public Boolean recoveryCauseVmps() {
        return this.recoveryCauseVmps;
    }
    public Integer recoveryInterval() {
        return this.recoveryInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetErrdisableResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean detectCauseAll;
        private Boolean detectCauseArpInspection;
        private Boolean detectCauseBpduguard;
        private Boolean detectCauseDhcpRateLimit;
        private Boolean detectCauseDtpFlap;
        private Boolean detectCauseGbicInvalid;
        private Boolean detectCauseInlinePower;
        private Boolean detectCauseL2ptguard;
        private Boolean detectCauseLinkFlap;
        private Boolean detectCauseLoopback;
        private Boolean detectCauseLoopdetect;
        private Boolean detectCauseMlacpMinlink;
        private Boolean detectCausePagpFlap;
        private Boolean detectCausePppoeIaRateLimit;
        private Boolean detectCauseSecurityViolationShutdownVlan;
        private Boolean detectCauseSfpConfigMismatch;
        private Boolean detectCauseSmallFrame;
        private @Nullable String device;
        private Integer flapSettingCauseDtpFlapMaxFlaps;
        private Integer flapSettingCauseDtpFlapTime;
        private Integer flapSettingCauseLinkFlapMaxFlaps;
        private Integer flapSettingCauseLinkFlapTime;
        private Integer flapSettingCausePagpFlapMaxFlaps;
        private Integer flapSettingCausePagpFlapTime;
        private String id;
        private Boolean recoveryCauseAll;
        private Boolean recoveryCauseArpInspection;
        private Boolean recoveryCauseBpduguard;
        private Boolean recoveryCauseChannelMisconfig;
        private Boolean recoveryCauseDhcpRateLimit;
        private Boolean recoveryCauseDtpFlap;
        private Boolean recoveryCauseGbicInvalid;
        private Boolean recoveryCauseInlinePower;
        private Boolean recoveryCauseL2ptguard;
        private Boolean recoveryCauseLinkFlap;
        private Boolean recoveryCauseLinkMonitorFailure;
        private Boolean recoveryCauseLoopback;
        private Boolean recoveryCauseLoopdetect;
        private Boolean recoveryCauseMacLimit;
        private Boolean recoveryCauseMlacpMinlink;
        private Boolean recoveryCausePagpFlap;
        private Boolean recoveryCausePortModeFailure;
        private Boolean recoveryCausePppoeIaRateLimit;
        private Boolean recoveryCausePsecureViolation;
        private Boolean recoveryCausePsp;
        private Boolean recoveryCauseSecurityViolation;
        private Boolean recoveryCauseSfpConfigMismatch;
        private Boolean recoveryCauseSmallFrame;
        private Boolean recoveryCauseStormControl;
        private Boolean recoveryCauseUdld;
        private Boolean recoveryCauseUnicastFlood;
        private Boolean recoveryCauseVmps;
        private Integer recoveryInterval;
        public Builder() {}
        public Builder(GetErrdisableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.detectCauseAll = defaults.detectCauseAll;
    	      this.detectCauseArpInspection = defaults.detectCauseArpInspection;
    	      this.detectCauseBpduguard = defaults.detectCauseBpduguard;
    	      this.detectCauseDhcpRateLimit = defaults.detectCauseDhcpRateLimit;
    	      this.detectCauseDtpFlap = defaults.detectCauseDtpFlap;
    	      this.detectCauseGbicInvalid = defaults.detectCauseGbicInvalid;
    	      this.detectCauseInlinePower = defaults.detectCauseInlinePower;
    	      this.detectCauseL2ptguard = defaults.detectCauseL2ptguard;
    	      this.detectCauseLinkFlap = defaults.detectCauseLinkFlap;
    	      this.detectCauseLoopback = defaults.detectCauseLoopback;
    	      this.detectCauseLoopdetect = defaults.detectCauseLoopdetect;
    	      this.detectCauseMlacpMinlink = defaults.detectCauseMlacpMinlink;
    	      this.detectCausePagpFlap = defaults.detectCausePagpFlap;
    	      this.detectCausePppoeIaRateLimit = defaults.detectCausePppoeIaRateLimit;
    	      this.detectCauseSecurityViolationShutdownVlan = defaults.detectCauseSecurityViolationShutdownVlan;
    	      this.detectCauseSfpConfigMismatch = defaults.detectCauseSfpConfigMismatch;
    	      this.detectCauseSmallFrame = defaults.detectCauseSmallFrame;
    	      this.device = defaults.device;
    	      this.flapSettingCauseDtpFlapMaxFlaps = defaults.flapSettingCauseDtpFlapMaxFlaps;
    	      this.flapSettingCauseDtpFlapTime = defaults.flapSettingCauseDtpFlapTime;
    	      this.flapSettingCauseLinkFlapMaxFlaps = defaults.flapSettingCauseLinkFlapMaxFlaps;
    	      this.flapSettingCauseLinkFlapTime = defaults.flapSettingCauseLinkFlapTime;
    	      this.flapSettingCausePagpFlapMaxFlaps = defaults.flapSettingCausePagpFlapMaxFlaps;
    	      this.flapSettingCausePagpFlapTime = defaults.flapSettingCausePagpFlapTime;
    	      this.id = defaults.id;
    	      this.recoveryCauseAll = defaults.recoveryCauseAll;
    	      this.recoveryCauseArpInspection = defaults.recoveryCauseArpInspection;
    	      this.recoveryCauseBpduguard = defaults.recoveryCauseBpduguard;
    	      this.recoveryCauseChannelMisconfig = defaults.recoveryCauseChannelMisconfig;
    	      this.recoveryCauseDhcpRateLimit = defaults.recoveryCauseDhcpRateLimit;
    	      this.recoveryCauseDtpFlap = defaults.recoveryCauseDtpFlap;
    	      this.recoveryCauseGbicInvalid = defaults.recoveryCauseGbicInvalid;
    	      this.recoveryCauseInlinePower = defaults.recoveryCauseInlinePower;
    	      this.recoveryCauseL2ptguard = defaults.recoveryCauseL2ptguard;
    	      this.recoveryCauseLinkFlap = defaults.recoveryCauseLinkFlap;
    	      this.recoveryCauseLinkMonitorFailure = defaults.recoveryCauseLinkMonitorFailure;
    	      this.recoveryCauseLoopback = defaults.recoveryCauseLoopback;
    	      this.recoveryCauseLoopdetect = defaults.recoveryCauseLoopdetect;
    	      this.recoveryCauseMacLimit = defaults.recoveryCauseMacLimit;
    	      this.recoveryCauseMlacpMinlink = defaults.recoveryCauseMlacpMinlink;
    	      this.recoveryCausePagpFlap = defaults.recoveryCausePagpFlap;
    	      this.recoveryCausePortModeFailure = defaults.recoveryCausePortModeFailure;
    	      this.recoveryCausePppoeIaRateLimit = defaults.recoveryCausePppoeIaRateLimit;
    	      this.recoveryCausePsecureViolation = defaults.recoveryCausePsecureViolation;
    	      this.recoveryCausePsp = defaults.recoveryCausePsp;
    	      this.recoveryCauseSecurityViolation = defaults.recoveryCauseSecurityViolation;
    	      this.recoveryCauseSfpConfigMismatch = defaults.recoveryCauseSfpConfigMismatch;
    	      this.recoveryCauseSmallFrame = defaults.recoveryCauseSmallFrame;
    	      this.recoveryCauseStormControl = defaults.recoveryCauseStormControl;
    	      this.recoveryCauseUdld = defaults.recoveryCauseUdld;
    	      this.recoveryCauseUnicastFlood = defaults.recoveryCauseUnicastFlood;
    	      this.recoveryCauseVmps = defaults.recoveryCauseVmps;
    	      this.recoveryInterval = defaults.recoveryInterval;
        }

        @CustomType.Setter
        public Builder detectCauseAll(Boolean detectCauseAll) {
            this.detectCauseAll = Objects.requireNonNull(detectCauseAll);
            return this;
        }
        @CustomType.Setter
        public Builder detectCauseArpInspection(Boolean detectCauseArpInspection) {
            this.detectCauseArpInspection = Objects.requireNonNull(detectCauseArpInspection);
            return this;
        }
        @CustomType.Setter
        public Builder detectCauseBpduguard(Boolean detectCauseBpduguard) {
            this.detectCauseBpduguard = Objects.requireNonNull(detectCauseBpduguard);
            return this;
        }
        @CustomType.Setter
        public Builder detectCauseDhcpRateLimit(Boolean detectCauseDhcpRateLimit) {
            this.detectCauseDhcpRateLimit = Objects.requireNonNull(detectCauseDhcpRateLimit);
            return this;
        }
        @CustomType.Setter
        public Builder detectCauseDtpFlap(Boolean detectCauseDtpFlap) {
            this.detectCauseDtpFlap = Objects.requireNonNull(detectCauseDtpFlap);
            return this;
        }
        @CustomType.Setter
        public Builder detectCauseGbicInvalid(Boolean detectCauseGbicInvalid) {
            this.detectCauseGbicInvalid = Objects.requireNonNull(detectCauseGbicInvalid);
            return this;
        }
        @CustomType.Setter
        public Builder detectCauseInlinePower(Boolean detectCauseInlinePower) {
            this.detectCauseInlinePower = Objects.requireNonNull(detectCauseInlinePower);
            return this;
        }
        @CustomType.Setter
        public Builder detectCauseL2ptguard(Boolean detectCauseL2ptguard) {
            this.detectCauseL2ptguard = Objects.requireNonNull(detectCauseL2ptguard);
            return this;
        }
        @CustomType.Setter
        public Builder detectCauseLinkFlap(Boolean detectCauseLinkFlap) {
            this.detectCauseLinkFlap = Objects.requireNonNull(detectCauseLinkFlap);
            return this;
        }
        @CustomType.Setter
        public Builder detectCauseLoopback(Boolean detectCauseLoopback) {
            this.detectCauseLoopback = Objects.requireNonNull(detectCauseLoopback);
            return this;
        }
        @CustomType.Setter
        public Builder detectCauseLoopdetect(Boolean detectCauseLoopdetect) {
            this.detectCauseLoopdetect = Objects.requireNonNull(detectCauseLoopdetect);
            return this;
        }
        @CustomType.Setter
        public Builder detectCauseMlacpMinlink(Boolean detectCauseMlacpMinlink) {
            this.detectCauseMlacpMinlink = Objects.requireNonNull(detectCauseMlacpMinlink);
            return this;
        }
        @CustomType.Setter
        public Builder detectCausePagpFlap(Boolean detectCausePagpFlap) {
            this.detectCausePagpFlap = Objects.requireNonNull(detectCausePagpFlap);
            return this;
        }
        @CustomType.Setter
        public Builder detectCausePppoeIaRateLimit(Boolean detectCausePppoeIaRateLimit) {
            this.detectCausePppoeIaRateLimit = Objects.requireNonNull(detectCausePppoeIaRateLimit);
            return this;
        }
        @CustomType.Setter
        public Builder detectCauseSecurityViolationShutdownVlan(Boolean detectCauseSecurityViolationShutdownVlan) {
            this.detectCauseSecurityViolationShutdownVlan = Objects.requireNonNull(detectCauseSecurityViolationShutdownVlan);
            return this;
        }
        @CustomType.Setter
        public Builder detectCauseSfpConfigMismatch(Boolean detectCauseSfpConfigMismatch) {
            this.detectCauseSfpConfigMismatch = Objects.requireNonNull(detectCauseSfpConfigMismatch);
            return this;
        }
        @CustomType.Setter
        public Builder detectCauseSmallFrame(Boolean detectCauseSmallFrame) {
            this.detectCauseSmallFrame = Objects.requireNonNull(detectCauseSmallFrame);
            return this;
        }
        @CustomType.Setter
        public Builder device(@Nullable String device) {
            this.device = device;
            return this;
        }
        @CustomType.Setter
        public Builder flapSettingCauseDtpFlapMaxFlaps(Integer flapSettingCauseDtpFlapMaxFlaps) {
            this.flapSettingCauseDtpFlapMaxFlaps = Objects.requireNonNull(flapSettingCauseDtpFlapMaxFlaps);
            return this;
        }
        @CustomType.Setter
        public Builder flapSettingCauseDtpFlapTime(Integer flapSettingCauseDtpFlapTime) {
            this.flapSettingCauseDtpFlapTime = Objects.requireNonNull(flapSettingCauseDtpFlapTime);
            return this;
        }
        @CustomType.Setter
        public Builder flapSettingCauseLinkFlapMaxFlaps(Integer flapSettingCauseLinkFlapMaxFlaps) {
            this.flapSettingCauseLinkFlapMaxFlaps = Objects.requireNonNull(flapSettingCauseLinkFlapMaxFlaps);
            return this;
        }
        @CustomType.Setter
        public Builder flapSettingCauseLinkFlapTime(Integer flapSettingCauseLinkFlapTime) {
            this.flapSettingCauseLinkFlapTime = Objects.requireNonNull(flapSettingCauseLinkFlapTime);
            return this;
        }
        @CustomType.Setter
        public Builder flapSettingCausePagpFlapMaxFlaps(Integer flapSettingCausePagpFlapMaxFlaps) {
            this.flapSettingCausePagpFlapMaxFlaps = Objects.requireNonNull(flapSettingCausePagpFlapMaxFlaps);
            return this;
        }
        @CustomType.Setter
        public Builder flapSettingCausePagpFlapTime(Integer flapSettingCausePagpFlapTime) {
            this.flapSettingCausePagpFlapTime = Objects.requireNonNull(flapSettingCausePagpFlapTime);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCauseAll(Boolean recoveryCauseAll) {
            this.recoveryCauseAll = Objects.requireNonNull(recoveryCauseAll);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCauseArpInspection(Boolean recoveryCauseArpInspection) {
            this.recoveryCauseArpInspection = Objects.requireNonNull(recoveryCauseArpInspection);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCauseBpduguard(Boolean recoveryCauseBpduguard) {
            this.recoveryCauseBpduguard = Objects.requireNonNull(recoveryCauseBpduguard);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCauseChannelMisconfig(Boolean recoveryCauseChannelMisconfig) {
            this.recoveryCauseChannelMisconfig = Objects.requireNonNull(recoveryCauseChannelMisconfig);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCauseDhcpRateLimit(Boolean recoveryCauseDhcpRateLimit) {
            this.recoveryCauseDhcpRateLimit = Objects.requireNonNull(recoveryCauseDhcpRateLimit);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCauseDtpFlap(Boolean recoveryCauseDtpFlap) {
            this.recoveryCauseDtpFlap = Objects.requireNonNull(recoveryCauseDtpFlap);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCauseGbicInvalid(Boolean recoveryCauseGbicInvalid) {
            this.recoveryCauseGbicInvalid = Objects.requireNonNull(recoveryCauseGbicInvalid);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCauseInlinePower(Boolean recoveryCauseInlinePower) {
            this.recoveryCauseInlinePower = Objects.requireNonNull(recoveryCauseInlinePower);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCauseL2ptguard(Boolean recoveryCauseL2ptguard) {
            this.recoveryCauseL2ptguard = Objects.requireNonNull(recoveryCauseL2ptguard);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCauseLinkFlap(Boolean recoveryCauseLinkFlap) {
            this.recoveryCauseLinkFlap = Objects.requireNonNull(recoveryCauseLinkFlap);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCauseLinkMonitorFailure(Boolean recoveryCauseLinkMonitorFailure) {
            this.recoveryCauseLinkMonitorFailure = Objects.requireNonNull(recoveryCauseLinkMonitorFailure);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCauseLoopback(Boolean recoveryCauseLoopback) {
            this.recoveryCauseLoopback = Objects.requireNonNull(recoveryCauseLoopback);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCauseLoopdetect(Boolean recoveryCauseLoopdetect) {
            this.recoveryCauseLoopdetect = Objects.requireNonNull(recoveryCauseLoopdetect);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCauseMacLimit(Boolean recoveryCauseMacLimit) {
            this.recoveryCauseMacLimit = Objects.requireNonNull(recoveryCauseMacLimit);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCauseMlacpMinlink(Boolean recoveryCauseMlacpMinlink) {
            this.recoveryCauseMlacpMinlink = Objects.requireNonNull(recoveryCauseMlacpMinlink);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCausePagpFlap(Boolean recoveryCausePagpFlap) {
            this.recoveryCausePagpFlap = Objects.requireNonNull(recoveryCausePagpFlap);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCausePortModeFailure(Boolean recoveryCausePortModeFailure) {
            this.recoveryCausePortModeFailure = Objects.requireNonNull(recoveryCausePortModeFailure);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCausePppoeIaRateLimit(Boolean recoveryCausePppoeIaRateLimit) {
            this.recoveryCausePppoeIaRateLimit = Objects.requireNonNull(recoveryCausePppoeIaRateLimit);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCausePsecureViolation(Boolean recoveryCausePsecureViolation) {
            this.recoveryCausePsecureViolation = Objects.requireNonNull(recoveryCausePsecureViolation);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCausePsp(Boolean recoveryCausePsp) {
            this.recoveryCausePsp = Objects.requireNonNull(recoveryCausePsp);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCauseSecurityViolation(Boolean recoveryCauseSecurityViolation) {
            this.recoveryCauseSecurityViolation = Objects.requireNonNull(recoveryCauseSecurityViolation);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCauseSfpConfigMismatch(Boolean recoveryCauseSfpConfigMismatch) {
            this.recoveryCauseSfpConfigMismatch = Objects.requireNonNull(recoveryCauseSfpConfigMismatch);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCauseSmallFrame(Boolean recoveryCauseSmallFrame) {
            this.recoveryCauseSmallFrame = Objects.requireNonNull(recoveryCauseSmallFrame);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCauseStormControl(Boolean recoveryCauseStormControl) {
            this.recoveryCauseStormControl = Objects.requireNonNull(recoveryCauseStormControl);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCauseUdld(Boolean recoveryCauseUdld) {
            this.recoveryCauseUdld = Objects.requireNonNull(recoveryCauseUdld);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCauseUnicastFlood(Boolean recoveryCauseUnicastFlood) {
            this.recoveryCauseUnicastFlood = Objects.requireNonNull(recoveryCauseUnicastFlood);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryCauseVmps(Boolean recoveryCauseVmps) {
            this.recoveryCauseVmps = Objects.requireNonNull(recoveryCauseVmps);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryInterval(Integer recoveryInterval) {
            this.recoveryInterval = Objects.requireNonNull(recoveryInterval);
            return this;
        }
        public GetErrdisableResult build() {
            final var o = new GetErrdisableResult();
            o.detectCauseAll = detectCauseAll;
            o.detectCauseArpInspection = detectCauseArpInspection;
            o.detectCauseBpduguard = detectCauseBpduguard;
            o.detectCauseDhcpRateLimit = detectCauseDhcpRateLimit;
            o.detectCauseDtpFlap = detectCauseDtpFlap;
            o.detectCauseGbicInvalid = detectCauseGbicInvalid;
            o.detectCauseInlinePower = detectCauseInlinePower;
            o.detectCauseL2ptguard = detectCauseL2ptguard;
            o.detectCauseLinkFlap = detectCauseLinkFlap;
            o.detectCauseLoopback = detectCauseLoopback;
            o.detectCauseLoopdetect = detectCauseLoopdetect;
            o.detectCauseMlacpMinlink = detectCauseMlacpMinlink;
            o.detectCausePagpFlap = detectCausePagpFlap;
            o.detectCausePppoeIaRateLimit = detectCausePppoeIaRateLimit;
            o.detectCauseSecurityViolationShutdownVlan = detectCauseSecurityViolationShutdownVlan;
            o.detectCauseSfpConfigMismatch = detectCauseSfpConfigMismatch;
            o.detectCauseSmallFrame = detectCauseSmallFrame;
            o.device = device;
            o.flapSettingCauseDtpFlapMaxFlaps = flapSettingCauseDtpFlapMaxFlaps;
            o.flapSettingCauseDtpFlapTime = flapSettingCauseDtpFlapTime;
            o.flapSettingCauseLinkFlapMaxFlaps = flapSettingCauseLinkFlapMaxFlaps;
            o.flapSettingCauseLinkFlapTime = flapSettingCauseLinkFlapTime;
            o.flapSettingCausePagpFlapMaxFlaps = flapSettingCausePagpFlapMaxFlaps;
            o.flapSettingCausePagpFlapTime = flapSettingCausePagpFlapTime;
            o.id = id;
            o.recoveryCauseAll = recoveryCauseAll;
            o.recoveryCauseArpInspection = recoveryCauseArpInspection;
            o.recoveryCauseBpduguard = recoveryCauseBpduguard;
            o.recoveryCauseChannelMisconfig = recoveryCauseChannelMisconfig;
            o.recoveryCauseDhcpRateLimit = recoveryCauseDhcpRateLimit;
            o.recoveryCauseDtpFlap = recoveryCauseDtpFlap;
            o.recoveryCauseGbicInvalid = recoveryCauseGbicInvalid;
            o.recoveryCauseInlinePower = recoveryCauseInlinePower;
            o.recoveryCauseL2ptguard = recoveryCauseL2ptguard;
            o.recoveryCauseLinkFlap = recoveryCauseLinkFlap;
            o.recoveryCauseLinkMonitorFailure = recoveryCauseLinkMonitorFailure;
            o.recoveryCauseLoopback = recoveryCauseLoopback;
            o.recoveryCauseLoopdetect = recoveryCauseLoopdetect;
            o.recoveryCauseMacLimit = recoveryCauseMacLimit;
            o.recoveryCauseMlacpMinlink = recoveryCauseMlacpMinlink;
            o.recoveryCausePagpFlap = recoveryCausePagpFlap;
            o.recoveryCausePortModeFailure = recoveryCausePortModeFailure;
            o.recoveryCausePppoeIaRateLimit = recoveryCausePppoeIaRateLimit;
            o.recoveryCausePsecureViolation = recoveryCausePsecureViolation;
            o.recoveryCausePsp = recoveryCausePsp;
            o.recoveryCauseSecurityViolation = recoveryCauseSecurityViolation;
            o.recoveryCauseSfpConfigMismatch = recoveryCauseSfpConfigMismatch;
            o.recoveryCauseSmallFrame = recoveryCauseSmallFrame;
            o.recoveryCauseStormControl = recoveryCauseStormControl;
            o.recoveryCauseUdld = recoveryCauseUdld;
            o.recoveryCauseUnicastFlood = recoveryCauseUnicastFlood;
            o.recoveryCauseVmps = recoveryCauseVmps;
            o.recoveryInterval = recoveryInterval;
            return o;
        }
    }
}