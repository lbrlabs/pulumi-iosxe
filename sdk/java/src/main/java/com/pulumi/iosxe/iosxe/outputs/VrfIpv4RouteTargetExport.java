// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VrfIpv4RouteTargetExport {
    private String value;

    private VrfIpv4RouteTargetExport() {}
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VrfIpv4RouteTargetExport defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String value;
        public Builder() {}
        public Builder(VrfIpv4RouteTargetExport defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public VrfIpv4RouteTargetExport build() {
            final var o = new VrfIpv4RouteTargetExport();
            o.value = value;
            return o;
        }
    }
}
