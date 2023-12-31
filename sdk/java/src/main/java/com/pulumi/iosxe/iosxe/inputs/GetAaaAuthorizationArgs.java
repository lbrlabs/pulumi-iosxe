// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAaaAuthorizationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAaaAuthorizationArgs Empty = new GetAaaAuthorizationArgs();

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

    private GetAaaAuthorizationArgs() {}

    private GetAaaAuthorizationArgs(GetAaaAuthorizationArgs $) {
        this.device = $.device;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAaaAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAaaAuthorizationArgs $;

        public Builder() {
            $ = new GetAaaAuthorizationArgs();
        }

        public Builder(GetAaaAuthorizationArgs defaults) {
            $ = new GetAaaAuthorizationArgs(Objects.requireNonNull(defaults));
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

        public GetAaaAuthorizationArgs build() {
            return $;
        }
    }

}
