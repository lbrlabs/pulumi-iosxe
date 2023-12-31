// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BgpL2vpnEvpnNeighborArgs extends com.pulumi.resources.ResourceArgs {

    public static final BgpL2vpnEvpnNeighborArgs Empty = new BgpL2vpnEvpnNeighborArgs();

    /**
     * Enable the address family for this neighbor - Default value: `true`
     * 
     */
    @Import(name="activate")
    private @Nullable Output<Boolean> activate;

    /**
     * @return Enable the address family for this neighbor - Default value: `true`
     * 
     */
    public Optional<Output<Boolean>> activate() {
        return Optional.ofNullable(this.activate);
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

    @Import(name="ip", required=true)
    private Output<String> ip;

    public Output<String> ip() {
        return this.ip;
    }

    /**
     * Configure a neighbor as Route Reflector client
     * 
     */
    @Import(name="routeReflectorClient")
    private @Nullable Output<Boolean> routeReflectorClient;

    /**
     * @return Configure a neighbor as Route Reflector client
     * 
     */
    public Optional<Output<Boolean>> routeReflectorClient() {
        return Optional.ofNullable(this.routeReflectorClient);
    }

    /**
     * - Choices: `both`, `extended`, `standard`
     * 
     */
    @Import(name="sendCommunity")
    private @Nullable Output<String> sendCommunity;

    /**
     * @return - Choices: `both`, `extended`, `standard`
     * 
     */
    public Optional<Output<String>> sendCommunity() {
        return Optional.ofNullable(this.sendCommunity);
    }

    private BgpL2vpnEvpnNeighborArgs() {}

    private BgpL2vpnEvpnNeighborArgs(BgpL2vpnEvpnNeighborArgs $) {
        this.activate = $.activate;
        this.asn = $.asn;
        this.deleteMode = $.deleteMode;
        this.device = $.device;
        this.ip = $.ip;
        this.routeReflectorClient = $.routeReflectorClient;
        this.sendCommunity = $.sendCommunity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BgpL2vpnEvpnNeighborArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BgpL2vpnEvpnNeighborArgs $;

        public Builder() {
            $ = new BgpL2vpnEvpnNeighborArgs();
        }

        public Builder(BgpL2vpnEvpnNeighborArgs defaults) {
            $ = new BgpL2vpnEvpnNeighborArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activate Enable the address family for this neighbor - Default value: `true`
         * 
         * @return builder
         * 
         */
        public Builder activate(@Nullable Output<Boolean> activate) {
            $.activate = activate;
            return this;
        }

        /**
         * @param activate Enable the address family for this neighbor - Default value: `true`
         * 
         * @return builder
         * 
         */
        public Builder activate(Boolean activate) {
            return activate(Output.of(activate));
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

        public Builder ip(Output<String> ip) {
            $.ip = ip;
            return this;
        }

        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        /**
         * @param routeReflectorClient Configure a neighbor as Route Reflector client
         * 
         * @return builder
         * 
         */
        public Builder routeReflectorClient(@Nullable Output<Boolean> routeReflectorClient) {
            $.routeReflectorClient = routeReflectorClient;
            return this;
        }

        /**
         * @param routeReflectorClient Configure a neighbor as Route Reflector client
         * 
         * @return builder
         * 
         */
        public Builder routeReflectorClient(Boolean routeReflectorClient) {
            return routeReflectorClient(Output.of(routeReflectorClient));
        }

        /**
         * @param sendCommunity - Choices: `both`, `extended`, `standard`
         * 
         * @return builder
         * 
         */
        public Builder sendCommunity(@Nullable Output<String> sendCommunity) {
            $.sendCommunity = sendCommunity;
            return this;
        }

        /**
         * @param sendCommunity - Choices: `both`, `extended`, `standard`
         * 
         * @return builder
         * 
         */
        public Builder sendCommunity(String sendCommunity) {
            return sendCommunity(Output.of(sendCommunity));
        }

        public BgpL2vpnEvpnNeighborArgs build() {
            $.asn = Objects.requireNonNull($.asn, "expected parameter 'asn' to be non-null");
            $.ip = Objects.requireNonNull($.ip, "expected parameter 'ip' to be non-null");
            return $;
        }
    }

}
