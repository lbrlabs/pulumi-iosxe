// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.BgpAddressFamilyIpv6VrfVrfIpv6UnicastNetwork;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BgpAddressFamilyIpv6VrfVrf {
    private @Nullable Boolean ipv6UnicastAdvertiseL2vpnEvpn;
    private @Nullable List<BgpAddressFamilyIpv6VrfVrfIpv6UnicastNetwork> ipv6UnicastNetworks;
    private @Nullable Boolean ipv6UnicastRedistributeConnected;
    private @Nullable Boolean ipv6UnicastRedistributeStatic;
    private String name;

    private BgpAddressFamilyIpv6VrfVrf() {}
    public Optional<Boolean> ipv6UnicastAdvertiseL2vpnEvpn() {
        return Optional.ofNullable(this.ipv6UnicastAdvertiseL2vpnEvpn);
    }
    public List<BgpAddressFamilyIpv6VrfVrfIpv6UnicastNetwork> ipv6UnicastNetworks() {
        return this.ipv6UnicastNetworks == null ? List.of() : this.ipv6UnicastNetworks;
    }
    public Optional<Boolean> ipv6UnicastRedistributeConnected() {
        return Optional.ofNullable(this.ipv6UnicastRedistributeConnected);
    }
    public Optional<Boolean> ipv6UnicastRedistributeStatic() {
        return Optional.ofNullable(this.ipv6UnicastRedistributeStatic);
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BgpAddressFamilyIpv6VrfVrf defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean ipv6UnicastAdvertiseL2vpnEvpn;
        private @Nullable List<BgpAddressFamilyIpv6VrfVrfIpv6UnicastNetwork> ipv6UnicastNetworks;
        private @Nullable Boolean ipv6UnicastRedistributeConnected;
        private @Nullable Boolean ipv6UnicastRedistributeStatic;
        private String name;
        public Builder() {}
        public Builder(BgpAddressFamilyIpv6VrfVrf defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv6UnicastAdvertiseL2vpnEvpn = defaults.ipv6UnicastAdvertiseL2vpnEvpn;
    	      this.ipv6UnicastNetworks = defaults.ipv6UnicastNetworks;
    	      this.ipv6UnicastRedistributeConnected = defaults.ipv6UnicastRedistributeConnected;
    	      this.ipv6UnicastRedistributeStatic = defaults.ipv6UnicastRedistributeStatic;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder ipv6UnicastAdvertiseL2vpnEvpn(@Nullable Boolean ipv6UnicastAdvertiseL2vpnEvpn) {
            this.ipv6UnicastAdvertiseL2vpnEvpn = ipv6UnicastAdvertiseL2vpnEvpn;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6UnicastNetworks(@Nullable List<BgpAddressFamilyIpv6VrfVrfIpv6UnicastNetwork> ipv6UnicastNetworks) {
            this.ipv6UnicastNetworks = ipv6UnicastNetworks;
            return this;
        }
        public Builder ipv6UnicastNetworks(BgpAddressFamilyIpv6VrfVrfIpv6UnicastNetwork... ipv6UnicastNetworks) {
            return ipv6UnicastNetworks(List.of(ipv6UnicastNetworks));
        }
        @CustomType.Setter
        public Builder ipv6UnicastRedistributeConnected(@Nullable Boolean ipv6UnicastRedistributeConnected) {
            this.ipv6UnicastRedistributeConnected = ipv6UnicastRedistributeConnected;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6UnicastRedistributeStatic(@Nullable Boolean ipv6UnicastRedistributeStatic) {
            this.ipv6UnicastRedistributeStatic = ipv6UnicastRedistributeStatic;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public BgpAddressFamilyIpv6VrfVrf build() {
            final var o = new BgpAddressFamilyIpv6VrfVrf();
            o.ipv6UnicastAdvertiseL2vpnEvpn = ipv6UnicastAdvertiseL2vpnEvpn;
            o.ipv6UnicastNetworks = ipv6UnicastNetworks;
            o.ipv6UnicastRedistributeConnected = ipv6UnicastRedistributeConnected;
            o.ipv6UnicastRedistributeStatic = ipv6UnicastRedistributeStatic;
            o.name = name;
            return o;
        }
    }
}
