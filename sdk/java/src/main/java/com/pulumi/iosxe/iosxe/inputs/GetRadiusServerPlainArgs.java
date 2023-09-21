// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRadiusServerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRadiusServerPlainArgs Empty = new GetRadiusServerPlainArgs();

    @Import(name="device")
    private @Nullable String device;

    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }

    private GetRadiusServerPlainArgs() {}

    private GetRadiusServerPlainArgs(GetRadiusServerPlainArgs $) {
        this.device = $.device;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRadiusServerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRadiusServerPlainArgs $;

        public Builder() {
            $ = new GetRadiusServerPlainArgs();
        }

        public Builder(GetRadiusServerPlainArgs defaults) {
            $ = new GetRadiusServerPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder device(@Nullable String device) {
            $.device = device;
            return this;
        }

        public GetRadiusServerPlainArgs build() {
            return $;
        }
    }

}