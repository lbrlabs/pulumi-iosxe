// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAaaAccountingNetwork {
    private String id;
    private String startStopGroup1;
    private String startStopGroup2;

    private GetAaaAccountingNetwork() {}
    public String id() {
        return this.id;
    }
    public String startStopGroup1() {
        return this.startStopGroup1;
    }
    public String startStopGroup2() {
        return this.startStopGroup2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAaaAccountingNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String startStopGroup1;
        private String startStopGroup2;
        public Builder() {}
        public Builder(GetAaaAccountingNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.startStopGroup1 = defaults.startStopGroup1;
    	      this.startStopGroup2 = defaults.startStopGroup2;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder startStopGroup1(String startStopGroup1) {
            this.startStopGroup1 = Objects.requireNonNull(startStopGroup1);
            return this;
        }
        @CustomType.Setter
        public Builder startStopGroup2(String startStopGroup2) {
            this.startStopGroup2 = Objects.requireNonNull(startStopGroup2);
            return this;
        }
        public GetAaaAccountingNetwork build() {
            final var o = new GetAaaAccountingNetwork();
            o.id = id;
            o.startStopGroup1 = startStopGroup1;
            o.startStopGroup2 = startStopGroup2;
            return o;
        }
    }
}
