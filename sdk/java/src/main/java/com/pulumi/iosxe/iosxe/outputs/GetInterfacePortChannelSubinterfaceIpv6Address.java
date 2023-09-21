// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInterfacePortChannelSubinterfaceIpv6Address {
    private Boolean eui64;
    private String prefix;

    private GetInterfacePortChannelSubinterfaceIpv6Address() {}
    public Boolean eui64() {
        return this.eui64;
    }
    public String prefix() {
        return this.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInterfacePortChannelSubinterfaceIpv6Address defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean eui64;
        private String prefix;
        public Builder() {}
        public Builder(GetInterfacePortChannelSubinterfaceIpv6Address defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eui64 = defaults.eui64;
    	      this.prefix = defaults.prefix;
        }

        @CustomType.Setter
        public Builder eui64(Boolean eui64) {
            this.eui64 = Objects.requireNonNull(eui64);
            return this;
        }
        @CustomType.Setter
        public Builder prefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }
        public GetInterfacePortChannelSubinterfaceIpv6Address build() {
            final var o = new GetInterfacePortChannelSubinterfaceIpv6Address();
            o.eui64 = eui64;
            o.prefix = prefix;
            return o;
        }
    }
}
