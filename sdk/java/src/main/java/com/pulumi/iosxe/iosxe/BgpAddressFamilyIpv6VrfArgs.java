// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.iosxe.iosxe.inputs.BgpAddressFamilyIpv6VrfVrfArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BgpAddressFamilyIpv6VrfArgs extends com.pulumi.resources.ResourceArgs {

    public static final BgpAddressFamilyIpv6VrfArgs Empty = new BgpAddressFamilyIpv6VrfArgs();

    /**
     * - Choices: `flowspec`, `mdt`, `multicast`, `mvpn`, `unicast`
     * 
     */
    @Import(name="afName", required=true)
    private Output<String> afName;

    /**
     * @return - Choices: `flowspec`, `mdt`, `multicast`, `mvpn`, `unicast`
     * 
     */
    public Output<String> afName() {
        return this.afName;
    }

    @Import(name="asn", required=true)
    private Output<String> asn;

    public Output<String> asn() {
        return this.asn;
    }

    /**
     * Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
     * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
     * Default value is `all`. - Choices: `all`, `attributes`
     * 
     */
    @Import(name="deleteMode")
    private @Nullable Output<String> deleteMode;

    /**
     * @return Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
     * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
     * Default value is `all`. - Choices: `all`, `attributes`
     * 
     */
    public Optional<Output<String>> deleteMode() {
        return Optional.ofNullable(this.deleteMode);
    }

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

    @Import(name="vrfs")
    private @Nullable Output<List<BgpAddressFamilyIpv6VrfVrfArgs>> vrfs;

    public Optional<Output<List<BgpAddressFamilyIpv6VrfVrfArgs>>> vrfs() {
        return Optional.ofNullable(this.vrfs);
    }

    private BgpAddressFamilyIpv6VrfArgs() {}

    private BgpAddressFamilyIpv6VrfArgs(BgpAddressFamilyIpv6VrfArgs $) {
        this.afName = $.afName;
        this.asn = $.asn;
        this.deleteMode = $.deleteMode;
        this.device = $.device;
        this.vrfs = $.vrfs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BgpAddressFamilyIpv6VrfArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BgpAddressFamilyIpv6VrfArgs $;

        public Builder() {
            $ = new BgpAddressFamilyIpv6VrfArgs();
        }

        public Builder(BgpAddressFamilyIpv6VrfArgs defaults) {
            $ = new BgpAddressFamilyIpv6VrfArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param afName - Choices: `flowspec`, `mdt`, `multicast`, `mvpn`, `unicast`
         * 
         * @return builder
         * 
         */
        public Builder afName(Output<String> afName) {
            $.afName = afName;
            return this;
        }

        /**
         * @param afName - Choices: `flowspec`, `mdt`, `multicast`, `mvpn`, `unicast`
         * 
         * @return builder
         * 
         */
        public Builder afName(String afName) {
            return afName(Output.of(afName));
        }

        public Builder asn(Output<String> asn) {
            $.asn = asn;
            return this;
        }

        public Builder asn(String asn) {
            return asn(Output.of(asn));
        }

        /**
         * @param deleteMode Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
         * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
         * Default value is `all`. - Choices: `all`, `attributes`
         * 
         * @return builder
         * 
         */
        public Builder deleteMode(@Nullable Output<String> deleteMode) {
            $.deleteMode = deleteMode;
            return this;
        }

        /**
         * @param deleteMode Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
         * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
         * Default value is `all`. - Choices: `all`, `attributes`
         * 
         * @return builder
         * 
         */
        public Builder deleteMode(String deleteMode) {
            return deleteMode(Output.of(deleteMode));
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

        public Builder vrfs(@Nullable Output<List<BgpAddressFamilyIpv6VrfVrfArgs>> vrfs) {
            $.vrfs = vrfs;
            return this;
        }

        public Builder vrfs(List<BgpAddressFamilyIpv6VrfVrfArgs> vrfs) {
            return vrfs(Output.of(vrfs));
        }

        public Builder vrfs(BgpAddressFamilyIpv6VrfVrfArgs... vrfs) {
            return vrfs(List.of(vrfs));
        }

        public BgpAddressFamilyIpv6VrfArgs build() {
            $.afName = Objects.requireNonNull($.afName, "expected parameter 'afName' to be non-null");
            $.asn = Objects.requireNonNull($.asn, "expected parameter 'asn' to be non-null");
            return $;
        }
    }

}
