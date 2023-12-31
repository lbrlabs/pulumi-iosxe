// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.GetInterfaceLoopbackIpv6Address;
import com.pulumi.iosxe.iosxe.outputs.GetInterfaceLoopbackIpv6LinkLocalAddress;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInterfaceLoopbackResult {
    /**
     * @return Set ARP cache timeout
     * 
     */
    private Integer arpTimeout;
    /**
     * @return Interface specific description
     * 
     */
    private String description;
    /**
     * @return A device name from the provider configuration.
     * 
     */
    private @Nullable String device;
    /**
     * @return The path of the retrieved object.
     * 
     */
    private String id;
    private String ipAccessGroupIn;
    /**
     * @return inbound packets
     * 
     */
    private Boolean ipAccessGroupInEnable;
    private String ipAccessGroupOut;
    /**
     * @return outbound packets
     * 
     */
    private Boolean ipAccessGroupOutEnable;
    /**
     * @return Enable proxy ARP
     * 
     */
    private Boolean ipProxyArp;
    /**
     * @return Enable sending ICMP Redirect messages
     * 
     */
    private Boolean ipRedirects;
    /**
     * @return Enable sending ICMP Unreachable messages
     * 
     */
    private Boolean ipUnreachables;
    private String ipv4Address;
    private String ipv4AddressMask;
    /**
     * @return Insert default route
     * 
     */
    private Boolean ipv6AddressAutoconfigDefault;
    /**
     * @return Obtain IPv6 address from DHCP server
     * 
     */
    private Boolean ipv6AddressDhcp;
    private List<GetInterfaceLoopbackIpv6Address> ipv6Addresses;
    /**
     * @return Enable IPv6 on interface
     * 
     */
    private Boolean ipv6Enable;
    private List<GetInterfaceLoopbackIpv6LinkLocalAddress> ipv6LinkLocalAddresses;
    /**
     * @return Set IPv6 Maximum Transmission Unit
     * 
     */
    private Integer ipv6Mtu;
    /**
     * @return Suppress all IPv6 RA
     * 
     */
    private Boolean ipv6NdRaSuppressAll;
    private Integer name;
    /**
     * @return Shutdown the selected interface
     * 
     */
    private Boolean shutdown;
    /**
     * @return Configure forwarding table
     * 
     */
    private String vrfForwarding;

    private GetInterfaceLoopbackResult() {}
    /**
     * @return Set ARP cache timeout
     * 
     */
    public Integer arpTimeout() {
        return this.arpTimeout;
    }
    /**
     * @return Interface specific description
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return A device name from the provider configuration.
     * 
     */
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }
    /**
     * @return The path of the retrieved object.
     * 
     */
    public String id() {
        return this.id;
    }
    public String ipAccessGroupIn() {
        return this.ipAccessGroupIn;
    }
    /**
     * @return inbound packets
     * 
     */
    public Boolean ipAccessGroupInEnable() {
        return this.ipAccessGroupInEnable;
    }
    public String ipAccessGroupOut() {
        return this.ipAccessGroupOut;
    }
    /**
     * @return outbound packets
     * 
     */
    public Boolean ipAccessGroupOutEnable() {
        return this.ipAccessGroupOutEnable;
    }
    /**
     * @return Enable proxy ARP
     * 
     */
    public Boolean ipProxyArp() {
        return this.ipProxyArp;
    }
    /**
     * @return Enable sending ICMP Redirect messages
     * 
     */
    public Boolean ipRedirects() {
        return this.ipRedirects;
    }
    /**
     * @return Enable sending ICMP Unreachable messages
     * 
     */
    public Boolean ipUnreachables() {
        return this.ipUnreachables;
    }
    public String ipv4Address() {
        return this.ipv4Address;
    }
    public String ipv4AddressMask() {
        return this.ipv4AddressMask;
    }
    /**
     * @return Insert default route
     * 
     */
    public Boolean ipv6AddressAutoconfigDefault() {
        return this.ipv6AddressAutoconfigDefault;
    }
    /**
     * @return Obtain IPv6 address from DHCP server
     * 
     */
    public Boolean ipv6AddressDhcp() {
        return this.ipv6AddressDhcp;
    }
    public List<GetInterfaceLoopbackIpv6Address> ipv6Addresses() {
        return this.ipv6Addresses;
    }
    /**
     * @return Enable IPv6 on interface
     * 
     */
    public Boolean ipv6Enable() {
        return this.ipv6Enable;
    }
    public List<GetInterfaceLoopbackIpv6LinkLocalAddress> ipv6LinkLocalAddresses() {
        return this.ipv6LinkLocalAddresses;
    }
    /**
     * @return Set IPv6 Maximum Transmission Unit
     * 
     */
    public Integer ipv6Mtu() {
        return this.ipv6Mtu;
    }
    /**
     * @return Suppress all IPv6 RA
     * 
     */
    public Boolean ipv6NdRaSuppressAll() {
        return this.ipv6NdRaSuppressAll;
    }
    public Integer name() {
        return this.name;
    }
    /**
     * @return Shutdown the selected interface
     * 
     */
    public Boolean shutdown() {
        return this.shutdown;
    }
    /**
     * @return Configure forwarding table
     * 
     */
    public String vrfForwarding() {
        return this.vrfForwarding;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInterfaceLoopbackResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer arpTimeout;
        private String description;
        private @Nullable String device;
        private String id;
        private String ipAccessGroupIn;
        private Boolean ipAccessGroupInEnable;
        private String ipAccessGroupOut;
        private Boolean ipAccessGroupOutEnable;
        private Boolean ipProxyArp;
        private Boolean ipRedirects;
        private Boolean ipUnreachables;
        private String ipv4Address;
        private String ipv4AddressMask;
        private Boolean ipv6AddressAutoconfigDefault;
        private Boolean ipv6AddressDhcp;
        private List<GetInterfaceLoopbackIpv6Address> ipv6Addresses;
        private Boolean ipv6Enable;
        private List<GetInterfaceLoopbackIpv6LinkLocalAddress> ipv6LinkLocalAddresses;
        private Integer ipv6Mtu;
        private Boolean ipv6NdRaSuppressAll;
        private Integer name;
        private Boolean shutdown;
        private String vrfForwarding;
        public Builder() {}
        public Builder(GetInterfaceLoopbackResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arpTimeout = defaults.arpTimeout;
    	      this.description = defaults.description;
    	      this.device = defaults.device;
    	      this.id = defaults.id;
    	      this.ipAccessGroupIn = defaults.ipAccessGroupIn;
    	      this.ipAccessGroupInEnable = defaults.ipAccessGroupInEnable;
    	      this.ipAccessGroupOut = defaults.ipAccessGroupOut;
    	      this.ipAccessGroupOutEnable = defaults.ipAccessGroupOutEnable;
    	      this.ipProxyArp = defaults.ipProxyArp;
    	      this.ipRedirects = defaults.ipRedirects;
    	      this.ipUnreachables = defaults.ipUnreachables;
    	      this.ipv4Address = defaults.ipv4Address;
    	      this.ipv4AddressMask = defaults.ipv4AddressMask;
    	      this.ipv6AddressAutoconfigDefault = defaults.ipv6AddressAutoconfigDefault;
    	      this.ipv6AddressDhcp = defaults.ipv6AddressDhcp;
    	      this.ipv6Addresses = defaults.ipv6Addresses;
    	      this.ipv6Enable = defaults.ipv6Enable;
    	      this.ipv6LinkLocalAddresses = defaults.ipv6LinkLocalAddresses;
    	      this.ipv6Mtu = defaults.ipv6Mtu;
    	      this.ipv6NdRaSuppressAll = defaults.ipv6NdRaSuppressAll;
    	      this.name = defaults.name;
    	      this.shutdown = defaults.shutdown;
    	      this.vrfForwarding = defaults.vrfForwarding;
        }

        @CustomType.Setter
        public Builder arpTimeout(Integer arpTimeout) {
            this.arpTimeout = Objects.requireNonNull(arpTimeout);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder device(@Nullable String device) {
            this.device = device;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipAccessGroupIn(String ipAccessGroupIn) {
            this.ipAccessGroupIn = Objects.requireNonNull(ipAccessGroupIn);
            return this;
        }
        @CustomType.Setter
        public Builder ipAccessGroupInEnable(Boolean ipAccessGroupInEnable) {
            this.ipAccessGroupInEnable = Objects.requireNonNull(ipAccessGroupInEnable);
            return this;
        }
        @CustomType.Setter
        public Builder ipAccessGroupOut(String ipAccessGroupOut) {
            this.ipAccessGroupOut = Objects.requireNonNull(ipAccessGroupOut);
            return this;
        }
        @CustomType.Setter
        public Builder ipAccessGroupOutEnable(Boolean ipAccessGroupOutEnable) {
            this.ipAccessGroupOutEnable = Objects.requireNonNull(ipAccessGroupOutEnable);
            return this;
        }
        @CustomType.Setter
        public Builder ipProxyArp(Boolean ipProxyArp) {
            this.ipProxyArp = Objects.requireNonNull(ipProxyArp);
            return this;
        }
        @CustomType.Setter
        public Builder ipRedirects(Boolean ipRedirects) {
            this.ipRedirects = Objects.requireNonNull(ipRedirects);
            return this;
        }
        @CustomType.Setter
        public Builder ipUnreachables(Boolean ipUnreachables) {
            this.ipUnreachables = Objects.requireNonNull(ipUnreachables);
            return this;
        }
        @CustomType.Setter
        public Builder ipv4Address(String ipv4Address) {
            this.ipv4Address = Objects.requireNonNull(ipv4Address);
            return this;
        }
        @CustomType.Setter
        public Builder ipv4AddressMask(String ipv4AddressMask) {
            this.ipv4AddressMask = Objects.requireNonNull(ipv4AddressMask);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6AddressAutoconfigDefault(Boolean ipv6AddressAutoconfigDefault) {
            this.ipv6AddressAutoconfigDefault = Objects.requireNonNull(ipv6AddressAutoconfigDefault);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6AddressDhcp(Boolean ipv6AddressDhcp) {
            this.ipv6AddressDhcp = Objects.requireNonNull(ipv6AddressDhcp);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6Addresses(List<GetInterfaceLoopbackIpv6Address> ipv6Addresses) {
            this.ipv6Addresses = Objects.requireNonNull(ipv6Addresses);
            return this;
        }
        public Builder ipv6Addresses(GetInterfaceLoopbackIpv6Address... ipv6Addresses) {
            return ipv6Addresses(List.of(ipv6Addresses));
        }
        @CustomType.Setter
        public Builder ipv6Enable(Boolean ipv6Enable) {
            this.ipv6Enable = Objects.requireNonNull(ipv6Enable);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6LinkLocalAddresses(List<GetInterfaceLoopbackIpv6LinkLocalAddress> ipv6LinkLocalAddresses) {
            this.ipv6LinkLocalAddresses = Objects.requireNonNull(ipv6LinkLocalAddresses);
            return this;
        }
        public Builder ipv6LinkLocalAddresses(GetInterfaceLoopbackIpv6LinkLocalAddress... ipv6LinkLocalAddresses) {
            return ipv6LinkLocalAddresses(List.of(ipv6LinkLocalAddresses));
        }
        @CustomType.Setter
        public Builder ipv6Mtu(Integer ipv6Mtu) {
            this.ipv6Mtu = Objects.requireNonNull(ipv6Mtu);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6NdRaSuppressAll(Boolean ipv6NdRaSuppressAll) {
            this.ipv6NdRaSuppressAll = Objects.requireNonNull(ipv6NdRaSuppressAll);
            return this;
        }
        @CustomType.Setter
        public Builder name(Integer name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder shutdown(Boolean shutdown) {
            this.shutdown = Objects.requireNonNull(shutdown);
            return this;
        }
        @CustomType.Setter
        public Builder vrfForwarding(String vrfForwarding) {
            this.vrfForwarding = Objects.requireNonNull(vrfForwarding);
            return this;
        }
        public GetInterfaceLoopbackResult build() {
            final var o = new GetInterfaceLoopbackResult();
            o.arpTimeout = arpTimeout;
            o.description = description;
            o.device = device;
            o.id = id;
            o.ipAccessGroupIn = ipAccessGroupIn;
            o.ipAccessGroupInEnable = ipAccessGroupInEnable;
            o.ipAccessGroupOut = ipAccessGroupOut;
            o.ipAccessGroupOutEnable = ipAccessGroupOutEnable;
            o.ipProxyArp = ipProxyArp;
            o.ipRedirects = ipRedirects;
            o.ipUnreachables = ipUnreachables;
            o.ipv4Address = ipv4Address;
            o.ipv4AddressMask = ipv4AddressMask;
            o.ipv6AddressAutoconfigDefault = ipv6AddressAutoconfigDefault;
            o.ipv6AddressDhcp = ipv6AddressDhcp;
            o.ipv6Addresses = ipv6Addresses;
            o.ipv6Enable = ipv6Enable;
            o.ipv6LinkLocalAddresses = ipv6LinkLocalAddresses;
            o.ipv6Mtu = ipv6Mtu;
            o.ipv6NdRaSuppressAll = ipv6NdRaSuppressAll;
            o.name = name;
            o.shutdown = shutdown;
            o.vrfForwarding = vrfForwarding;
            return o;
        }
    }
}
