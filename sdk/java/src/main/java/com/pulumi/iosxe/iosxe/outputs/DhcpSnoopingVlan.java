// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DhcpSnoopingVlan {
    private String vlanId;

    private DhcpSnoopingVlan() {}
    public String vlanId() {
        return this.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DhcpSnoopingVlan defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String vlanId;
        public Builder() {}
        public Builder(DhcpSnoopingVlan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vlanId = defaults.vlanId;
        }

        @CustomType.Setter
        public Builder vlanId(String vlanId) {
            this.vlanId = Objects.requireNonNull(vlanId);
            return this;
        }
        public DhcpSnoopingVlan build() {
            final var o = new DhcpSnoopingVlan();
            o.vlanId = vlanId;
            return o;
        }
    }
}
