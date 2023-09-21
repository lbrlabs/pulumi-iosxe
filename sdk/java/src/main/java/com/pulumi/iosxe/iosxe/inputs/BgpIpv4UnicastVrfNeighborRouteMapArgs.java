// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BgpIpv4UnicastVrfNeighborRouteMapArgs extends com.pulumi.resources.ResourceArgs {

    public static final BgpIpv4UnicastVrfNeighborRouteMapArgs Empty = new BgpIpv4UnicastVrfNeighborRouteMapArgs();

    @Import(name="inOut", required=true)
    private Output<String> inOut;

    public Output<String> inOut() {
        return this.inOut;
    }

    @Import(name="routeMapName", required=true)
    private Output<String> routeMapName;

    public Output<String> routeMapName() {
        return this.routeMapName;
    }

    private BgpIpv4UnicastVrfNeighborRouteMapArgs() {}

    private BgpIpv4UnicastVrfNeighborRouteMapArgs(BgpIpv4UnicastVrfNeighborRouteMapArgs $) {
        this.inOut = $.inOut;
        this.routeMapName = $.routeMapName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BgpIpv4UnicastVrfNeighborRouteMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BgpIpv4UnicastVrfNeighborRouteMapArgs $;

        public Builder() {
            $ = new BgpIpv4UnicastVrfNeighborRouteMapArgs();
        }

        public Builder(BgpIpv4UnicastVrfNeighborRouteMapArgs defaults) {
            $ = new BgpIpv4UnicastVrfNeighborRouteMapArgs(Objects.requireNonNull(defaults));
        }

        public Builder inOut(Output<String> inOut) {
            $.inOut = inOut;
            return this;
        }

        public Builder inOut(String inOut) {
            return inOut(Output.of(inOut));
        }

        public Builder routeMapName(Output<String> routeMapName) {
            $.routeMapName = routeMapName;
            return this;
        }

        public Builder routeMapName(String routeMapName) {
            return routeMapName(Output.of(routeMapName));
        }

        public BgpIpv4UnicastVrfNeighborRouteMapArgs build() {
            $.inOut = Objects.requireNonNull($.inOut, "expected parameter 'inOut' to be non-null");
            $.routeMapName = Objects.requireNonNull($.routeMapName, "expected parameter 'routeMapName' to be non-null");
            return $;
        }
    }

}
