// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OspfSummaryAddress {
    private String ip;
    private @Nullable String mask;

    private OspfSummaryAddress() {}
    public String ip() {
        return this.ip;
    }
    public Optional<String> mask() {
        return Optional.ofNullable(this.mask);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OspfSummaryAddress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ip;
        private @Nullable String mask;
        public Builder() {}
        public Builder(OspfSummaryAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
    	      this.mask = defaults.mask;
        }

        @CustomType.Setter
        public Builder ip(String ip) {
            this.ip = Objects.requireNonNull(ip);
            return this;
        }
        @CustomType.Setter
        public Builder mask(@Nullable String mask) {
            this.mask = mask;
            return this;
        }
        public OspfSummaryAddress build() {
            final var o = new OspfSummaryAddress();
            o.ip = ip;
            o.mask = mask;
            return o;
        }
    }
}