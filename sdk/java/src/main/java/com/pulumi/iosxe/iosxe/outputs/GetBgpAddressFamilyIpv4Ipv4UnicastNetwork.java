// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBgpAddressFamilyIpv4Ipv4UnicastNetwork {
    /**
     * @return Specify a BGP backdoor route
     * 
     */
    private Boolean backdoor;
    private String network;
    /**
     * @return Route-map to modify the attributes
     * 
     */
    private String routeMap;

    private GetBgpAddressFamilyIpv4Ipv4UnicastNetwork() {}
    /**
     * @return Specify a BGP backdoor route
     * 
     */
    public Boolean backdoor() {
        return this.backdoor;
    }
    public String network() {
        return this.network;
    }
    /**
     * @return Route-map to modify the attributes
     * 
     */
    public String routeMap() {
        return this.routeMap;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBgpAddressFamilyIpv4Ipv4UnicastNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean backdoor;
        private String network;
        private String routeMap;
        public Builder() {}
        public Builder(GetBgpAddressFamilyIpv4Ipv4UnicastNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backdoor = defaults.backdoor;
    	      this.network = defaults.network;
    	      this.routeMap = defaults.routeMap;
        }

        @CustomType.Setter
        public Builder backdoor(Boolean backdoor) {
            this.backdoor = Objects.requireNonNull(backdoor);
            return this;
        }
        @CustomType.Setter
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        @CustomType.Setter
        public Builder routeMap(String routeMap) {
            this.routeMap = Objects.requireNonNull(routeMap);
            return this;
        }
        public GetBgpAddressFamilyIpv4Ipv4UnicastNetwork build() {
            final var o = new GetBgpAddressFamilyIpv4Ipv4UnicastNetwork();
            o.backdoor = backdoor;
            o.network = network;
            o.routeMap = routeMap;
            return o;
        }
    }
}
