// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSnmpServerContext {
    private String name;

    private GetSnmpServerContext() {}
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnmpServerContext defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        public Builder() {}
        public Builder(GetSnmpServerContext defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetSnmpServerContext build() {
            final var o = new GetSnmpServerContext();
            o.name = name;
            return o;
        }
    }
}
