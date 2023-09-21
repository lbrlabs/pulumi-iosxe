// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBgpIpv4UnicastNeighborRouteMap {
    private String inOut;
    private String routeMapName;

    private GetBgpIpv4UnicastNeighborRouteMap() {}
    public String inOut() {
        return this.inOut;
    }
    public String routeMapName() {
        return this.routeMapName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBgpIpv4UnicastNeighborRouteMap defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String inOut;
        private String routeMapName;
        public Builder() {}
        public Builder(GetBgpIpv4UnicastNeighborRouteMap defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inOut = defaults.inOut;
    	      this.routeMapName = defaults.routeMapName;
        }

        @CustomType.Setter
        public Builder inOut(String inOut) {
            this.inOut = Objects.requireNonNull(inOut);
            return this;
        }
        @CustomType.Setter
        public Builder routeMapName(String routeMapName) {
            this.routeMapName = Objects.requireNonNull(routeMapName);
            return this;
        }
        public GetBgpIpv4UnicastNeighborRouteMap build() {
            final var o = new GetBgpIpv4UnicastNeighborRouteMap();
            o.inOut = inOut;
            o.routeMapName = routeMapName;
            return o;
        }
    }
}
