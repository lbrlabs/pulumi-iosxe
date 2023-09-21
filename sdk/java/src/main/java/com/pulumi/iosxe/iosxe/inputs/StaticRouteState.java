// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.iosxe.iosxe.inputs.StaticRouteNextHopArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StaticRouteState extends com.pulumi.resources.ResourceArgs {

    public static final StaticRouteState Empty = new StaticRouteState();

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

    @Import(name="mask")
    private @Nullable Output<String> mask;

    public Optional<Output<String>> mask() {
        return Optional.ofNullable(this.mask);
    }

    @Import(name="nextHops")
    private @Nullable Output<List<StaticRouteNextHopArgs>> nextHops;

    public Optional<Output<List<StaticRouteNextHopArgs>>> nextHops() {
        return Optional.ofNullable(this.nextHops);
    }

    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    private StaticRouteState() {}

    private StaticRouteState(StaticRouteState $) {
        this.device = $.device;
        this.mask = $.mask;
        this.nextHops = $.nextHops;
        this.prefix = $.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StaticRouteState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StaticRouteState $;

        public Builder() {
            $ = new StaticRouteState();
        }

        public Builder(StaticRouteState defaults) {
            $ = new StaticRouteState(Objects.requireNonNull(defaults));
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

        public Builder mask(@Nullable Output<String> mask) {
            $.mask = mask;
            return this;
        }

        public Builder mask(String mask) {
            return mask(Output.of(mask));
        }

        public Builder nextHops(@Nullable Output<List<StaticRouteNextHopArgs>> nextHops) {
            $.nextHops = nextHops;
            return this;
        }

        public Builder nextHops(List<StaticRouteNextHopArgs> nextHops) {
            return nextHops(Output.of(nextHops));
        }

        public Builder nextHops(StaticRouteNextHopArgs... nextHops) {
            return nextHops(List.of(nextHops));
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public StaticRouteState build() {
            return $;
        }
    }

}
