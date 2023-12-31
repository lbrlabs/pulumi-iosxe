// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAaaAuthenticationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAaaAuthenticationPlainArgs Empty = new GetAaaAuthenticationPlainArgs();

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

    private GetAaaAuthenticationPlainArgs() {}

    private GetAaaAuthenticationPlainArgs(GetAaaAuthenticationPlainArgs $) {
        this.device = $.device;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAaaAuthenticationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAaaAuthenticationPlainArgs $;

        public Builder() {
            $ = new GetAaaAuthenticationPlainArgs();
        }

        public Builder(GetAaaAuthenticationPlainArgs defaults) {
            $ = new GetAaaAuthenticationPlainArgs(Objects.requireNonNull(defaults));
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

        public GetAaaAuthenticationPlainArgs build() {
            return $;
        }
    }

}
