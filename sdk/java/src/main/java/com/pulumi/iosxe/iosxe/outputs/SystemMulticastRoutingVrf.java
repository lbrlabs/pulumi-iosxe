// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SystemMulticastRoutingVrf {
    private @Nullable Boolean distributed;
    private String vrf;

    private SystemMulticastRoutingVrf() {}
    public Optional<Boolean> distributed() {
        return Optional.ofNullable(this.distributed);
    }
    public String vrf() {
        return this.vrf;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SystemMulticastRoutingVrf defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean distributed;
        private String vrf;
        public Builder() {}
        public Builder(SystemMulticastRoutingVrf defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributed = defaults.distributed;
    	      this.vrf = defaults.vrf;
        }

        @CustomType.Setter
        public Builder distributed(@Nullable Boolean distributed) {
            this.distributed = distributed;
            return this;
        }
        @CustomType.Setter
        public Builder vrf(String vrf) {
            this.vrf = Objects.requireNonNull(vrf);
            return this;
        }
        public SystemMulticastRoutingVrf build() {
            final var o = new SystemMulticastRoutingVrf();
            o.distributed = distributed;
            o.vrf = vrf;
            return o;
        }
    }
}
