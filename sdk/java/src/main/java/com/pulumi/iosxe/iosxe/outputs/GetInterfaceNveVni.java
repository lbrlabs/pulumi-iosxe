// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInterfaceNveVni {
    private Boolean ingressReplication;
    private String ipv4MulticastGroup;
    private String vniRange;

    private GetInterfaceNveVni() {}
    public Boolean ingressReplication() {
        return this.ingressReplication;
    }
    public String ipv4MulticastGroup() {
        return this.ipv4MulticastGroup;
    }
    public String vniRange() {
        return this.vniRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInterfaceNveVni defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean ingressReplication;
        private String ipv4MulticastGroup;
        private String vniRange;
        public Builder() {}
        public Builder(GetInterfaceNveVni defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingressReplication = defaults.ingressReplication;
    	      this.ipv4MulticastGroup = defaults.ipv4MulticastGroup;
    	      this.vniRange = defaults.vniRange;
        }

        @CustomType.Setter
        public Builder ingressReplication(Boolean ingressReplication) {
            this.ingressReplication = Objects.requireNonNull(ingressReplication);
            return this;
        }
        @CustomType.Setter
        public Builder ipv4MulticastGroup(String ipv4MulticastGroup) {
            this.ipv4MulticastGroup = Objects.requireNonNull(ipv4MulticastGroup);
            return this;
        }
        @CustomType.Setter
        public Builder vniRange(String vniRange) {
            this.vniRange = Objects.requireNonNull(vniRange);
            return this;
        }
        public GetInterfaceNveVni build() {
            final var o = new GetInterfaceNveVni();
            o.ingressReplication = ingressReplication;
            o.ipv4MulticastGroup = ipv4MulticastGroup;
            o.vniRange = vniRange;
            return o;
        }
    }
}
