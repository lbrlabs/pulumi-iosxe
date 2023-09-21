// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetwork;
import com.pulumi.iosxe.iosxe.outputs.BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetworksMask;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BgpAddressFamilyIpv4VrfVrf {
    private @Nullable Boolean ipv4UnicastAdvertiseL2vpnEvpn;
    private @Nullable List<BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetwork> ipv4UnicastNetworks;
    private @Nullable List<BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetworksMask> ipv4UnicastNetworksMasks;
    private @Nullable Boolean ipv4UnicastRedistributeConnected;
    private @Nullable Boolean ipv4UnicastRedistributeStatic;
    private String name;

    private BgpAddressFamilyIpv4VrfVrf() {}
    public Optional<Boolean> ipv4UnicastAdvertiseL2vpnEvpn() {
        return Optional.ofNullable(this.ipv4UnicastAdvertiseL2vpnEvpn);
    }
    public List<BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetwork> ipv4UnicastNetworks() {
        return this.ipv4UnicastNetworks == null ? List.of() : this.ipv4UnicastNetworks;
    }
    public List<BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetworksMask> ipv4UnicastNetworksMasks() {
        return this.ipv4UnicastNetworksMasks == null ? List.of() : this.ipv4UnicastNetworksMasks;
    }
    public Optional<Boolean> ipv4UnicastRedistributeConnected() {
        return Optional.ofNullable(this.ipv4UnicastRedistributeConnected);
    }
    public Optional<Boolean> ipv4UnicastRedistributeStatic() {
        return Optional.ofNullable(this.ipv4UnicastRedistributeStatic);
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BgpAddressFamilyIpv4VrfVrf defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean ipv4UnicastAdvertiseL2vpnEvpn;
        private @Nullable List<BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetwork> ipv4UnicastNetworks;
        private @Nullable List<BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetworksMask> ipv4UnicastNetworksMasks;
        private @Nullable Boolean ipv4UnicastRedistributeConnected;
        private @Nullable Boolean ipv4UnicastRedistributeStatic;
        private String name;
        public Builder() {}
        public Builder(BgpAddressFamilyIpv4VrfVrf defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv4UnicastAdvertiseL2vpnEvpn = defaults.ipv4UnicastAdvertiseL2vpnEvpn;
    	      this.ipv4UnicastNetworks = defaults.ipv4UnicastNetworks;
    	      this.ipv4UnicastNetworksMasks = defaults.ipv4UnicastNetworksMasks;
    	      this.ipv4UnicastRedistributeConnected = defaults.ipv4UnicastRedistributeConnected;
    	      this.ipv4UnicastRedistributeStatic = defaults.ipv4UnicastRedistributeStatic;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder ipv4UnicastAdvertiseL2vpnEvpn(@Nullable Boolean ipv4UnicastAdvertiseL2vpnEvpn) {
            this.ipv4UnicastAdvertiseL2vpnEvpn = ipv4UnicastAdvertiseL2vpnEvpn;
            return this;
        }
        @CustomType.Setter
        public Builder ipv4UnicastNetworks(@Nullable List<BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetwork> ipv4UnicastNetworks) {
            this.ipv4UnicastNetworks = ipv4UnicastNetworks;
            return this;
        }
        public Builder ipv4UnicastNetworks(BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetwork... ipv4UnicastNetworks) {
            return ipv4UnicastNetworks(List.of(ipv4UnicastNetworks));
        }
        @CustomType.Setter
        public Builder ipv4UnicastNetworksMasks(@Nullable List<BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetworksMask> ipv4UnicastNetworksMasks) {
            this.ipv4UnicastNetworksMasks = ipv4UnicastNetworksMasks;
            return this;
        }
        public Builder ipv4UnicastNetworksMasks(BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetworksMask... ipv4UnicastNetworksMasks) {
            return ipv4UnicastNetworksMasks(List.of(ipv4UnicastNetworksMasks));
        }
        @CustomType.Setter
        public Builder ipv4UnicastRedistributeConnected(@Nullable Boolean ipv4UnicastRedistributeConnected) {
            this.ipv4UnicastRedistributeConnected = ipv4UnicastRedistributeConnected;
            return this;
        }
        @CustomType.Setter
        public Builder ipv4UnicastRedistributeStatic(@Nullable Boolean ipv4UnicastRedistributeStatic) {
            this.ipv4UnicastRedistributeStatic = ipv4UnicastRedistributeStatic;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public BgpAddressFamilyIpv4VrfVrf build() {
            final var o = new BgpAddressFamilyIpv4VrfVrf();
            o.ipv4UnicastAdvertiseL2vpnEvpn = ipv4UnicastAdvertiseL2vpnEvpn;
            o.ipv4UnicastNetworks = ipv4UnicastNetworks;
            o.ipv4UnicastNetworksMasks = ipv4UnicastNetworksMasks;
            o.ipv4UnicastRedistributeConnected = ipv4UnicastRedistributeConnected;
            o.ipv4UnicastRedistributeStatic = ipv4UnicastRedistributeStatic;
            o.name = name;
            return o;
        }
    }
}