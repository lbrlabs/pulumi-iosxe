// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AaaAccountingNetwork {
    private String id;
    private @Nullable String startStopGroup1;
    private @Nullable String startStopGroup2;

    private AaaAccountingNetwork() {}
    public String id() {
        return this.id;
    }
    public Optional<String> startStopGroup1() {
        return Optional.ofNullable(this.startStopGroup1);
    }
    public Optional<String> startStopGroup2() {
        return Optional.ofNullable(this.startStopGroup2);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AaaAccountingNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable String startStopGroup1;
        private @Nullable String startStopGroup2;
        public Builder() {}
        public Builder(AaaAccountingNetwork defaults) {
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
        public Builder startStopGroup1(@Nullable String startStopGroup1) {
            this.startStopGroup1 = startStopGroup1;
            return this;
        }
        @CustomType.Setter
        public Builder startStopGroup2(@Nullable String startStopGroup2) {
            this.startStopGroup2 = startStopGroup2;
            return this;
        }
        public AaaAccountingNetwork build() {
            final var o = new AaaAccountingNetwork();
            o.id = id;
            o.startStopGroup1 = startStopGroup1;
            o.startStopGroup2 = startStopGroup2;
            return o;
        }
    }
}