// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BgpIpv4UnicastNeighborRouteMapArgs extends com.pulumi.resources.ResourceArgs {

    public static final BgpIpv4UnicastNeighborRouteMapArgs Empty = new BgpIpv4UnicastNeighborRouteMapArgs();

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

    private BgpIpv4UnicastNeighborRouteMapArgs() {}

    private BgpIpv4UnicastNeighborRouteMapArgs(BgpIpv4UnicastNeighborRouteMapArgs $) {
        this.inOut = $.inOut;
        this.routeMapName = $.routeMapName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BgpIpv4UnicastNeighborRouteMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BgpIpv4UnicastNeighborRouteMapArgs $;

        public Builder() {
            $ = new BgpIpv4UnicastNeighborRouteMapArgs();
        }

        public Builder(BgpIpv4UnicastNeighborRouteMapArgs defaults) {
            $ = new BgpIpv4UnicastNeighborRouteMapArgs(Objects.requireNonNull(defaults));
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

        public BgpIpv4UnicastNeighborRouteMapArgs build() {
            $.inOut = Objects.requireNonNull($.inOut, "expected parameter 'inOut' to be non-null");
            $.routeMapName = Objects.requireNonNull($.routeMapName, "expected parameter 'routeMapName' to be non-null");
            return $;
        }
    }

}