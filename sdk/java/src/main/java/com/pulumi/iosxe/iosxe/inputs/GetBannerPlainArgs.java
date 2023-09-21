// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBannerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBannerPlainArgs Empty = new GetBannerPlainArgs();

    @Import(name="device")
    private @Nullable String device;

    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }

    private GetBannerPlainArgs() {}

    private GetBannerPlainArgs(GetBannerPlainArgs $) {
        this.device = $.device;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBannerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBannerPlainArgs $;

        public Builder() {
            $ = new GetBannerPlainArgs();
        }

        public Builder(GetBannerPlainArgs defaults) {
            $ = new GetBannerPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder device(@Nullable String device) {
            $.device = device;
            return this;
        }

        public GetBannerPlainArgs build() {
            return $;
        }
    }

}
