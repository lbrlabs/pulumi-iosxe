// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAaaAuthorizationNetwork {
    private String a1Group;
    private String id;

    private GetAaaAuthorizationNetwork() {}
    public String a1Group() {
        return this.a1Group;
    }
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAaaAuthorizationNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String a1Group;
        private String id;
        public Builder() {}
        public Builder(GetAaaAuthorizationNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.a1Group = defaults.a1Group;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder a1Group(String a1Group) {
            this.a1Group = Objects.requireNonNull(a1Group);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetAaaAuthorizationNetwork build() {
            final var o = new GetAaaAuthorizationNetwork();
            o.a1Group = a1Group;
            o.id = id;
            return o;
        }
    }
}
