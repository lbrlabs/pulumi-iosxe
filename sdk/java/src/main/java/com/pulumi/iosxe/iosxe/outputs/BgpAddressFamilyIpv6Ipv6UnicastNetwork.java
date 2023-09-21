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
public final class BgpAddressFamilyIpv6Ipv6UnicastNetwork {
    private @Nullable Boolean backdoor;
    private String network;
    private @Nullable String routeMap;

    private BgpAddressFamilyIpv6Ipv6UnicastNetwork() {}
    public Optional<Boolean> backdoor() {
        return Optional.ofNullable(this.backdoor);
    }
    public String network() {
        return this.network;
    }
    public Optional<String> routeMap() {
        return Optional.ofNullable(this.routeMap);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BgpAddressFamilyIpv6Ipv6UnicastNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean backdoor;
        private String network;
        private @Nullable String routeMap;
        public Builder() {}
        public Builder(BgpAddressFamilyIpv6Ipv6UnicastNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backdoor = defaults.backdoor;
    	      this.network = defaults.network;
    	      this.routeMap = defaults.routeMap;
        }

        @CustomType.Setter
        public Builder backdoor(@Nullable Boolean backdoor) {
            this.backdoor = backdoor;
            return this;
        }
        @CustomType.Setter
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        @CustomType.Setter
        public Builder routeMap(@Nullable String routeMap) {
            this.routeMap = routeMap;
            return this;
        }
        public BgpAddressFamilyIpv6Ipv6UnicastNetwork build() {
            final var o = new BgpAddressFamilyIpv6Ipv6UnicastNetwork();
            o.backdoor = backdoor;
            o.network = network;
            o.routeMap = routeMap;
            return o;
        }
    }
}
