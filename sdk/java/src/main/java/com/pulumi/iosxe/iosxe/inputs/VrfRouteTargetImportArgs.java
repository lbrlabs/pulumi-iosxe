// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VrfRouteTargetImportArgs extends com.pulumi.resources.ResourceArgs {

    public static final VrfRouteTargetImportArgs Empty = new VrfRouteTargetImportArgs();

    @Import(name="stitching")
    private @Nullable Output<Boolean> stitching;

    public Optional<Output<Boolean>> stitching() {
        return Optional.ofNullable(this.stitching);
    }

    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private VrfRouteTargetImportArgs() {}

    private VrfRouteTargetImportArgs(VrfRouteTargetImportArgs $) {
        this.stitching = $.stitching;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VrfRouteTargetImportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VrfRouteTargetImportArgs $;

        public Builder() {
            $ = new VrfRouteTargetImportArgs();
        }

        public Builder(VrfRouteTargetImportArgs defaults) {
            $ = new VrfRouteTargetImportArgs(Objects.requireNonNull(defaults));
        }

        public Builder stitching(@Nullable Output<Boolean> stitching) {
            $.stitching = stitching;
            return this;
        }

        public Builder stitching(Boolean stitching) {
            return stitching(Output.of(stitching));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public VrfRouteTargetImportArgs build() {
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}