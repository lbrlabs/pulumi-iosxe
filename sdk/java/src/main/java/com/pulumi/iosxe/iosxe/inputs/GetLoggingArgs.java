// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLoggingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLoggingArgs Empty = new GetLoggingArgs();

    @Import(name="device")
    private @Nullable Output<String> device;

    public Optional<Output<String>> device() {
        return Optional.ofNullable(this.device);
    }

    private GetLoggingArgs() {}

    private GetLoggingArgs(GetLoggingArgs $) {
        this.device = $.device;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLoggingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoggingArgs $;

        public Builder() {
            $ = new GetLoggingArgs();
        }

        public Builder(GetLoggingArgs defaults) {
            $ = new GetLoggingArgs(Objects.requireNonNull(defaults));
        }

        public Builder device(@Nullable Output<String> device) {
            $.device = device;
            return this;
        }

        public Builder device(String device) {
            return device(Output.of(device));
        }

        public GetLoggingArgs build() {
            return $;
        }
    }

}
