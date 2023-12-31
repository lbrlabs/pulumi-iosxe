// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSystemMulticastRoutingVrf {
    /**
     * @return Distributed multicast switching
     * 
     */
    private Boolean distributed;
    private String vrf;

    private GetSystemMulticastRoutingVrf() {}
    /**
     * @return Distributed multicast switching
     * 
     */
    public Boolean distributed() {
        return this.distributed;
    }
    public String vrf() {
        return this.vrf;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSystemMulticastRoutingVrf defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean distributed;
        private String vrf;
        public Builder() {}
        public Builder(GetSystemMulticastRoutingVrf defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributed = defaults.distributed;
    	      this.vrf = defaults.vrf;
        }

        @CustomType.Setter
        public Builder distributed(Boolean distributed) {
            this.distributed = Objects.requireNonNull(distributed);
            return this;
        }
        @CustomType.Setter
        public Builder vrf(String vrf) {
            this.vrf = Objects.requireNonNull(vrf);
            return this;
        }
        public GetSystemMulticastRoutingVrf build() {
            final var o = new GetSystemMulticastRoutingVrf();
            o.distributed = distributed;
            o.vrf = vrf;
            return o;
        }
    }
}
