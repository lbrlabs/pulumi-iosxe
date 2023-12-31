// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRouteMapPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRouteMapPlainArgs Empty = new GetRouteMapPlainArgs();

    /**
     * A device name from the provider configuration.
     * 
     */
    @Import(name="device")
    private @Nullable String device;

    /**
     * @return A device name from the provider configuration.
     * 
     */
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }

    /**
     * WORD;;Route map tag
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return WORD;;Route map tag
     * 
     */
    public String name() {
        return this.name;
    }

    private GetRouteMapPlainArgs() {}

    private GetRouteMapPlainArgs(GetRouteMapPlainArgs $) {
        this.device = $.device;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRouteMapPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRouteMapPlainArgs $;

        public Builder() {
            $ = new GetRouteMapPlainArgs();
        }

        public Builder(GetRouteMapPlainArgs defaults) {
            $ = new GetRouteMapPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param device A device name from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder device(@Nullable String device) {
            $.device = device;
            return this;
        }

        /**
         * @param name WORD;;Route map tag
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetRouteMapPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
