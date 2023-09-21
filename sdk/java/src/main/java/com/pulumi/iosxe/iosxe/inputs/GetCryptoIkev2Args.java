// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCryptoIkev2Args extends com.pulumi.resources.InvokeArgs {

    public static final GetCryptoIkev2Args Empty = new GetCryptoIkev2Args();

    @Import(name="device")
    private @Nullable Output<String> device;

    public Optional<Output<String>> device() {
        return Optional.ofNullable(this.device);
    }

    private GetCryptoIkev2Args() {}

    private GetCryptoIkev2Args(GetCryptoIkev2Args $) {
        this.device = $.device;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCryptoIkev2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCryptoIkev2Args $;

        public Builder() {
            $ = new GetCryptoIkev2Args();
        }

        public Builder(GetCryptoIkev2Args defaults) {
            $ = new GetCryptoIkev2Args(Objects.requireNonNull(defaults));
        }

        public Builder device(@Nullable Output<String> device) {
            $.device = device;
            return this;
        }

        public Builder device(String device) {
            return device(Output.of(device));
        }

        public GetCryptoIkev2Args build() {
            return $;
        }
    }

}
