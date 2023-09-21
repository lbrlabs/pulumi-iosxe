// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EvpnInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final EvpnInstanceArgs Empty = new EvpnInstanceArgs();

    /**
     * A device name from the provider configuration.
     * 
     */
    @Import(name="device")
    private @Nullable Output<String> device;

    /**
     * @return A device name from the provider configuration.
     * 
     */
    public Optional<Output<String>> device() {
        return Optional.ofNullable(this.device);
    }

    /**
     * evpn instance number - Range: `1`-`65535`
     * 
     */
    @Import(name="evpnInstanceNum", required=true)
    private Output<Integer> evpnInstanceNum;

    /**
     * @return evpn instance number - Range: `1`-`65535`
     * 
     */
    public Output<Integer> evpnInstanceNum() {
        return this.evpnInstanceNum;
    }

    /**
     * Automatically set a route-target
     * 
     */
    @Import(name="vlanBasedAutoRouteTarget")
    private @Nullable Output<Boolean> vlanBasedAutoRouteTarget;

    /**
     * @return Automatically set a route-target
     * 
     */
    public Optional<Output<Boolean>> vlanBasedAutoRouteTarget() {
        return Optional.ofNullable(this.vlanBasedAutoRouteTarget);
    }

    /**
     * Advertise Default Gateway MAC/IP routes - Choices: `disable`, `enable`
     * 
     */
    @Import(name="vlanBasedDefaultGatewayAdvertise")
    private @Nullable Output<String> vlanBasedDefaultGatewayAdvertise;

    /**
     * @return Advertise Default Gateway MAC/IP routes - Choices: `disable`, `enable`
     * 
     */
    public Optional<Output<String>> vlanBasedDefaultGatewayAdvertise() {
        return Optional.ofNullable(this.vlanBasedDefaultGatewayAdvertise);
    }

    /**
     * Data encapsulation method - Choices: `mpls`, `vxlan`
     * 
     */
    @Import(name="vlanBasedEncapsulation")
    private @Nullable Output<String> vlanBasedEncapsulation;

    /**
     * @return Data encapsulation method - Choices: `mpls`, `vxlan`
     * 
     */
    public Optional<Output<String>> vlanBasedEncapsulation() {
        return Optional.ofNullable(this.vlanBasedEncapsulation);
    }

    /**
     * Disable IP local learning from dataplane
     * 
     */
    @Import(name="vlanBasedIpLocalLearningDisable")
    private @Nullable Output<Boolean> vlanBasedIpLocalLearningDisable;

    /**
     * @return Disable IP local learning from dataplane
     * 
     */
    public Optional<Output<Boolean>> vlanBasedIpLocalLearningDisable() {
        return Optional.ofNullable(this.vlanBasedIpLocalLearningDisable);
    }

    /**
     * Enable IP local learning from dataplane
     * 
     */
    @Import(name="vlanBasedIpLocalLearningEnable")
    private @Nullable Output<Boolean> vlanBasedIpLocalLearningEnable;

    /**
     * @return Enable IP local learning from dataplane
     * 
     */
    public Optional<Output<Boolean>> vlanBasedIpLocalLearningEnable() {
        return Optional.ofNullable(this.vlanBasedIpLocalLearningEnable);
    }

    /**
     * ASN:nn or IP-address:nn
     * 
     */
    @Import(name="vlanBasedRd")
    private @Nullable Output<String> vlanBasedRd;

    /**
     * @return ASN:nn or IP-address:nn
     * 
     */
    public Optional<Output<String>> vlanBasedRd() {
        return Optional.ofNullable(this.vlanBasedRd);
    }

    /**
     * Re-originate route-type 5
     * 
     */
    @Import(name="vlanBasedReOriginateRouteType5")
    private @Nullable Output<Boolean> vlanBasedReOriginateRouteType5;

    /**
     * @return Re-originate route-type 5
     * 
     */
    public Optional<Output<Boolean>> vlanBasedReOriginateRouteType5() {
        return Optional.ofNullable(this.vlanBasedReOriginateRouteType5);
    }

    /**
     * Ingress replication
     * 
     */
    @Import(name="vlanBasedReplicationTypeIngress")
    private @Nullable Output<Boolean> vlanBasedReplicationTypeIngress;

    /**
     * @return Ingress replication
     * 
     */
    public Optional<Output<Boolean>> vlanBasedReplicationTypeIngress() {
        return Optional.ofNullable(this.vlanBasedReplicationTypeIngress);
    }

    /**
     * mp2mp replication
     * 
     */
    @Import(name="vlanBasedReplicationTypeMp2mp")
    private @Nullable Output<Boolean> vlanBasedReplicationTypeMp2mp;

    /**
     * @return mp2mp replication
     * 
     */
    public Optional<Output<Boolean>> vlanBasedReplicationTypeMp2mp() {
        return Optional.ofNullable(this.vlanBasedReplicationTypeMp2mp);
    }

    /**
     * p2mp replication
     * 
     */
    @Import(name="vlanBasedReplicationTypeP2mp")
    private @Nullable Output<Boolean> vlanBasedReplicationTypeP2mp;

    /**
     * @return p2mp replication
     * 
     */
    public Optional<Output<Boolean>> vlanBasedReplicationTypeP2mp() {
        return Optional.ofNullable(this.vlanBasedReplicationTypeP2mp);
    }

    /**
     * Static replication
     * 
     */
    @Import(name="vlanBasedReplicationTypeStatic")
    private @Nullable Output<Boolean> vlanBasedReplicationTypeStatic;

    /**
     * @return Static replication
     * 
     */
    public Optional<Output<Boolean>> vlanBasedReplicationTypeStatic() {
        return Optional.ofNullable(this.vlanBasedReplicationTypeStatic);
    }

    /**
     * ASN:nn or IP-address:nn
     * 
     */
    @Import(name="vlanBasedRouteTarget")
    private @Nullable Output<String> vlanBasedRouteTarget;

    /**
     * @return ASN:nn or IP-address:nn
     * 
     */
    public Optional<Output<String>> vlanBasedRouteTarget() {
        return Optional.ofNullable(this.vlanBasedRouteTarget);
    }

    /**
     * ASN:nn or IP-address:nn
     * 
     */
    @Import(name="vlanBasedRouteTargetBoth")
    private @Nullable Output<String> vlanBasedRouteTargetBoth;

    /**
     * @return ASN:nn or IP-address:nn
     * 
     */
    public Optional<Output<String>> vlanBasedRouteTargetBoth() {
        return Optional.ofNullable(this.vlanBasedRouteTargetBoth);
    }

    /**
     * ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
     * 
     */
    @Import(name="vlanBasedRouteTargetExport")
    private @Nullable Output<String> vlanBasedRouteTargetExport;

    /**
     * @return ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
     * 
     */
    public Optional<Output<String>> vlanBasedRouteTargetExport() {
        return Optional.ofNullable(this.vlanBasedRouteTargetExport);
    }

    /**
     * ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
     * 
     */
    @Import(name="vlanBasedRouteTargetImport")
    private @Nullable Output<String> vlanBasedRouteTargetImport;

    /**
     * @return ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
     * 
     */
    public Optional<Output<String>> vlanBasedRouteTargetImport() {
        return Optional.ofNullable(this.vlanBasedRouteTargetImport);
    }

    private EvpnInstanceArgs() {}

    private EvpnInstanceArgs(EvpnInstanceArgs $) {
        this.device = $.device;
        this.evpnInstanceNum = $.evpnInstanceNum;
        this.vlanBasedAutoRouteTarget = $.vlanBasedAutoRouteTarget;
        this.vlanBasedDefaultGatewayAdvertise = $.vlanBasedDefaultGatewayAdvertise;
        this.vlanBasedEncapsulation = $.vlanBasedEncapsulation;
        this.vlanBasedIpLocalLearningDisable = $.vlanBasedIpLocalLearningDisable;
        this.vlanBasedIpLocalLearningEnable = $.vlanBasedIpLocalLearningEnable;
        this.vlanBasedRd = $.vlanBasedRd;
        this.vlanBasedReOriginateRouteType5 = $.vlanBasedReOriginateRouteType5;
        this.vlanBasedReplicationTypeIngress = $.vlanBasedReplicationTypeIngress;
        this.vlanBasedReplicationTypeMp2mp = $.vlanBasedReplicationTypeMp2mp;
        this.vlanBasedReplicationTypeP2mp = $.vlanBasedReplicationTypeP2mp;
        this.vlanBasedReplicationTypeStatic = $.vlanBasedReplicationTypeStatic;
        this.vlanBasedRouteTarget = $.vlanBasedRouteTarget;
        this.vlanBasedRouteTargetBoth = $.vlanBasedRouteTargetBoth;
        this.vlanBasedRouteTargetExport = $.vlanBasedRouteTargetExport;
        this.vlanBasedRouteTargetImport = $.vlanBasedRouteTargetImport;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EvpnInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EvpnInstanceArgs $;

        public Builder() {
            $ = new EvpnInstanceArgs();
        }

        public Builder(EvpnInstanceArgs defaults) {
            $ = new EvpnInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param device A device name from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder device(@Nullable Output<String> device) {
            $.device = device;
            return this;
        }

        /**
         * @param device A device name from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder device(String device) {
            return device(Output.of(device));
        }

        /**
         * @param evpnInstanceNum evpn instance number - Range: `1`-`65535`
         * 
         * @return builder
         * 
         */
        public Builder evpnInstanceNum(Output<Integer> evpnInstanceNum) {
            $.evpnInstanceNum = evpnInstanceNum;
            return this;
        }

        /**
         * @param evpnInstanceNum evpn instance number - Range: `1`-`65535`
         * 
         * @return builder
         * 
         */
        public Builder evpnInstanceNum(Integer evpnInstanceNum) {
            return evpnInstanceNum(Output.of(evpnInstanceNum));
        }

        /**
         * @param vlanBasedAutoRouteTarget Automatically set a route-target
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedAutoRouteTarget(@Nullable Output<Boolean> vlanBasedAutoRouteTarget) {
            $.vlanBasedAutoRouteTarget = vlanBasedAutoRouteTarget;
            return this;
        }

        /**
         * @param vlanBasedAutoRouteTarget Automatically set a route-target
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedAutoRouteTarget(Boolean vlanBasedAutoRouteTarget) {
            return vlanBasedAutoRouteTarget(Output.of(vlanBasedAutoRouteTarget));
        }

        /**
         * @param vlanBasedDefaultGatewayAdvertise Advertise Default Gateway MAC/IP routes - Choices: `disable`, `enable`
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedDefaultGatewayAdvertise(@Nullable Output<String> vlanBasedDefaultGatewayAdvertise) {
            $.vlanBasedDefaultGatewayAdvertise = vlanBasedDefaultGatewayAdvertise;
            return this;
        }

        /**
         * @param vlanBasedDefaultGatewayAdvertise Advertise Default Gateway MAC/IP routes - Choices: `disable`, `enable`
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedDefaultGatewayAdvertise(String vlanBasedDefaultGatewayAdvertise) {
            return vlanBasedDefaultGatewayAdvertise(Output.of(vlanBasedDefaultGatewayAdvertise));
        }

        /**
         * @param vlanBasedEncapsulation Data encapsulation method - Choices: `mpls`, `vxlan`
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedEncapsulation(@Nullable Output<String> vlanBasedEncapsulation) {
            $.vlanBasedEncapsulation = vlanBasedEncapsulation;
            return this;
        }

        /**
         * @param vlanBasedEncapsulation Data encapsulation method - Choices: `mpls`, `vxlan`
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedEncapsulation(String vlanBasedEncapsulation) {
            return vlanBasedEncapsulation(Output.of(vlanBasedEncapsulation));
        }

        /**
         * @param vlanBasedIpLocalLearningDisable Disable IP local learning from dataplane
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedIpLocalLearningDisable(@Nullable Output<Boolean> vlanBasedIpLocalLearningDisable) {
            $.vlanBasedIpLocalLearningDisable = vlanBasedIpLocalLearningDisable;
            return this;
        }

        /**
         * @param vlanBasedIpLocalLearningDisable Disable IP local learning from dataplane
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedIpLocalLearningDisable(Boolean vlanBasedIpLocalLearningDisable) {
            return vlanBasedIpLocalLearningDisable(Output.of(vlanBasedIpLocalLearningDisable));
        }

        /**
         * @param vlanBasedIpLocalLearningEnable Enable IP local learning from dataplane
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedIpLocalLearningEnable(@Nullable Output<Boolean> vlanBasedIpLocalLearningEnable) {
            $.vlanBasedIpLocalLearningEnable = vlanBasedIpLocalLearningEnable;
            return this;
        }

        /**
         * @param vlanBasedIpLocalLearningEnable Enable IP local learning from dataplane
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedIpLocalLearningEnable(Boolean vlanBasedIpLocalLearningEnable) {
            return vlanBasedIpLocalLearningEnable(Output.of(vlanBasedIpLocalLearningEnable));
        }

        /**
         * @param vlanBasedRd ASN:nn or IP-address:nn
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedRd(@Nullable Output<String> vlanBasedRd) {
            $.vlanBasedRd = vlanBasedRd;
            return this;
        }

        /**
         * @param vlanBasedRd ASN:nn or IP-address:nn
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedRd(String vlanBasedRd) {
            return vlanBasedRd(Output.of(vlanBasedRd));
        }

        /**
         * @param vlanBasedReOriginateRouteType5 Re-originate route-type 5
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedReOriginateRouteType5(@Nullable Output<Boolean> vlanBasedReOriginateRouteType5) {
            $.vlanBasedReOriginateRouteType5 = vlanBasedReOriginateRouteType5;
            return this;
        }

        /**
         * @param vlanBasedReOriginateRouteType5 Re-originate route-type 5
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedReOriginateRouteType5(Boolean vlanBasedReOriginateRouteType5) {
            return vlanBasedReOriginateRouteType5(Output.of(vlanBasedReOriginateRouteType5));
        }

        /**
         * @param vlanBasedReplicationTypeIngress Ingress replication
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedReplicationTypeIngress(@Nullable Output<Boolean> vlanBasedReplicationTypeIngress) {
            $.vlanBasedReplicationTypeIngress = vlanBasedReplicationTypeIngress;
            return this;
        }

        /**
         * @param vlanBasedReplicationTypeIngress Ingress replication
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedReplicationTypeIngress(Boolean vlanBasedReplicationTypeIngress) {
            return vlanBasedReplicationTypeIngress(Output.of(vlanBasedReplicationTypeIngress));
        }

        /**
         * @param vlanBasedReplicationTypeMp2mp mp2mp replication
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedReplicationTypeMp2mp(@Nullable Output<Boolean> vlanBasedReplicationTypeMp2mp) {
            $.vlanBasedReplicationTypeMp2mp = vlanBasedReplicationTypeMp2mp;
            return this;
        }

        /**
         * @param vlanBasedReplicationTypeMp2mp mp2mp replication
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedReplicationTypeMp2mp(Boolean vlanBasedReplicationTypeMp2mp) {
            return vlanBasedReplicationTypeMp2mp(Output.of(vlanBasedReplicationTypeMp2mp));
        }

        /**
         * @param vlanBasedReplicationTypeP2mp p2mp replication
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedReplicationTypeP2mp(@Nullable Output<Boolean> vlanBasedReplicationTypeP2mp) {
            $.vlanBasedReplicationTypeP2mp = vlanBasedReplicationTypeP2mp;
            return this;
        }

        /**
         * @param vlanBasedReplicationTypeP2mp p2mp replication
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedReplicationTypeP2mp(Boolean vlanBasedReplicationTypeP2mp) {
            return vlanBasedReplicationTypeP2mp(Output.of(vlanBasedReplicationTypeP2mp));
        }

        /**
         * @param vlanBasedReplicationTypeStatic Static replication
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedReplicationTypeStatic(@Nullable Output<Boolean> vlanBasedReplicationTypeStatic) {
            $.vlanBasedReplicationTypeStatic = vlanBasedReplicationTypeStatic;
            return this;
        }

        /**
         * @param vlanBasedReplicationTypeStatic Static replication
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedReplicationTypeStatic(Boolean vlanBasedReplicationTypeStatic) {
            return vlanBasedReplicationTypeStatic(Output.of(vlanBasedReplicationTypeStatic));
        }

        /**
         * @param vlanBasedRouteTarget ASN:nn or IP-address:nn
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedRouteTarget(@Nullable Output<String> vlanBasedRouteTarget) {
            $.vlanBasedRouteTarget = vlanBasedRouteTarget;
            return this;
        }

        /**
         * @param vlanBasedRouteTarget ASN:nn or IP-address:nn
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedRouteTarget(String vlanBasedRouteTarget) {
            return vlanBasedRouteTarget(Output.of(vlanBasedRouteTarget));
        }

        /**
         * @param vlanBasedRouteTargetBoth ASN:nn or IP-address:nn
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedRouteTargetBoth(@Nullable Output<String> vlanBasedRouteTargetBoth) {
            $.vlanBasedRouteTargetBoth = vlanBasedRouteTargetBoth;
            return this;
        }

        /**
         * @param vlanBasedRouteTargetBoth ASN:nn or IP-address:nn
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedRouteTargetBoth(String vlanBasedRouteTargetBoth) {
            return vlanBasedRouteTargetBoth(Output.of(vlanBasedRouteTargetBoth));
        }

        /**
         * @param vlanBasedRouteTargetExport ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedRouteTargetExport(@Nullable Output<String> vlanBasedRouteTargetExport) {
            $.vlanBasedRouteTargetExport = vlanBasedRouteTargetExport;
            return this;
        }

        /**
         * @param vlanBasedRouteTargetExport ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedRouteTargetExport(String vlanBasedRouteTargetExport) {
            return vlanBasedRouteTargetExport(Output.of(vlanBasedRouteTargetExport));
        }

        /**
         * @param vlanBasedRouteTargetImport ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedRouteTargetImport(@Nullable Output<String> vlanBasedRouteTargetImport) {
            $.vlanBasedRouteTargetImport = vlanBasedRouteTargetImport;
            return this;
        }

        /**
         * @param vlanBasedRouteTargetImport ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
         * 
         * @return builder
         * 
         */
        public Builder vlanBasedRouteTargetImport(String vlanBasedRouteTargetImport) {
            return vlanBasedRouteTargetImport(Output.of(vlanBasedRouteTargetImport));
        }

        public EvpnInstanceArgs build() {
            $.evpnInstanceNum = Objects.requireNonNull($.evpnInstanceNum, "expected parameter 'evpnInstanceNum' to be non-null");
            return $;
        }
    }

}
