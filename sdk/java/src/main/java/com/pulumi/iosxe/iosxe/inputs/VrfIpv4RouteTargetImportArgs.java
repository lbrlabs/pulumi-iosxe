// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VrfIpv4RouteTargetImportArgs extends com.pulumi.resources.ResourceArgs {

    public static final VrfIpv4RouteTargetImportArgs Empty = new VrfIpv4RouteTargetImportArgs();

    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private VrfIpv4RouteTargetImportArgs() {}

    private VrfIpv4RouteTargetImportArgs(VrfIpv4RouteTargetImportArgs $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VrfIpv4RouteTargetImportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VrfIpv4RouteTargetImportArgs $;

        public Builder() {
            $ = new VrfIpv4RouteTargetImportArgs();
        }

        public Builder(VrfIpv4RouteTargetImportArgs defaults) {
            $ = new VrfIpv4RouteTargetImportArgs(Objects.requireNonNull(defaults));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public VrfIpv4RouteTargetImportArgs build() {
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}