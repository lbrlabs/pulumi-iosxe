// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.iosxe.iosxe.inputs.RouteMapEntryArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteMapArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteMapArgs Empty = new RouteMapArgs();

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

    @Import(name="entries")
    private @Nullable Output<List<RouteMapEntryArgs>> entries;

    public Optional<Output<List<RouteMapEntryArgs>>> entries() {
        return Optional.ofNullable(this.entries);
    }

    /**
     * WORD;;Route map tag
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return WORD;;Route map tag
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private RouteMapArgs() {}

    private RouteMapArgs(RouteMapArgs $) {
        this.device = $.device;
        this.entries = $.entries;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteMapArgs $;

        public Builder() {
            $ = new RouteMapArgs();
        }

        public Builder(RouteMapArgs defaults) {
            $ = new RouteMapArgs(Objects.requireNonNull(defaults));
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

        public Builder entries(@Nullable Output<List<RouteMapEntryArgs>> entries) {
            $.entries = entries;
            return this;
        }

        public Builder entries(List<RouteMapEntryArgs> entries) {
            return entries(Output.of(entries));
        }

        public Builder entries(RouteMapEntryArgs... entries) {
            return entries(List.of(entries));
        }

        /**
         * @param name WORD;;Route map tag
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name WORD;;Route map tag
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public RouteMapArgs build() {
            return $;
        }
    }

}