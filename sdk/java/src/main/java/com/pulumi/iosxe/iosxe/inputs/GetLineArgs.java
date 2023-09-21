// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLineArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLineArgs Empty = new GetLineArgs();

    @Import(name="device")
    private @Nullable Output<String> device;

    public Optional<Output<String>> device() {
        return Optional.ofNullable(this.device);
    }

    private GetLineArgs() {}

    private GetLineArgs(GetLineArgs $) {
        this.device = $.device;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLineArgs $;

        public Builder() {
            $ = new GetLineArgs();
        }

        public Builder(GetLineArgs defaults) {
            $ = new GetLineArgs(Objects.requireNonNull(defaults));
        }

        public Builder device(@Nullable Output<String> device) {
            $.device = device;
            return this;
        }

        public Builder device(String device) {
            return device(Output.of(device));
        }

        public GetLineArgs build() {
            return $;
        }
    }

}
