// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.iosxe.iosxe.inputs.StaticRouteVrfRouteArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StaticRouteVrfArgs extends com.pulumi.resources.ResourceArgs {

    public static final StaticRouteVrfArgs Empty = new StaticRouteVrfArgs();

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

    @Import(name="routes")
    private @Nullable Output<List<StaticRouteVrfRouteArgs>> routes;

    public Optional<Output<List<StaticRouteVrfRouteArgs>>> routes() {
        return Optional.ofNullable(this.routes);
    }

    @Import(name="vrf", required=true)
    private Output<String> vrf;

    public Output<String> vrf() {
        return this.vrf;
    }

    private StaticRouteVrfArgs() {}

    private StaticRouteVrfArgs(StaticRouteVrfArgs $) {
        this.device = $.device;
        this.routes = $.routes;
        this.vrf = $.vrf;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StaticRouteVrfArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StaticRouteVrfArgs $;

        public Builder() {
            $ = new StaticRouteVrfArgs();
        }

        public Builder(StaticRouteVrfArgs defaults) {
            $ = new StaticRouteVrfArgs(Objects.requireNonNull(defaults));
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

        public Builder routes(@Nullable Output<List<StaticRouteVrfRouteArgs>> routes) {
            $.routes = routes;
            return this;
        }

        public Builder routes(List<StaticRouteVrfRouteArgs> routes) {
            return routes(Output.of(routes));
        }

        public Builder routes(StaticRouteVrfRouteArgs... routes) {
            return routes(List.of(routes));
        }

        public Builder vrf(Output<String> vrf) {
            $.vrf = vrf;
            return this;
        }

        public Builder vrf(String vrf) {
            return vrf(Output.of(vrf));
        }

        public StaticRouteVrfArgs build() {
            $.vrf = Objects.requireNonNull($.vrf, "expected parameter 'vrf' to be non-null");
            return $;
        }
    }

}
