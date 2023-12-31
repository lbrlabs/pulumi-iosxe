// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.iosxe.iosxe.inputs.InterfaceLoopbackIpv6AddressArgs;
import com.pulumi.iosxe.iosxe.inputs.InterfaceLoopbackIpv6LinkLocalAddressArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InterfaceLoopbackState extends com.pulumi.resources.ResourceArgs {

    public static final InterfaceLoopbackState Empty = new InterfaceLoopbackState();

    /**
     * Set ARP cache timeout - Range: `0`-`2147483`
     * 
     */
    @Import(name="arpTimeout")
    private @Nullable Output<Integer> arpTimeout;

    /**
     * @return Set ARP cache timeout - Range: `0`-`2147483`
     * 
     */
    public Optional<Output<Integer>> arpTimeout() {
        return Optional.ofNullable(this.arpTimeout);
    }

    /**
     * Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
     * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
     * Default value is `all`. - Choices: `all`, `attributes`
     * 
     */
    @Import(name="deleteMode")
    private @Nullable Output<String> deleteMode;

    /**
     * @return Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
     * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
     * Default value is `all`. - Choices: `all`, `attributes`
     * 
     */
    public Optional<Output<String>> deleteMode() {
        return Optional.ofNullable(this.deleteMode);
    }

    /**
     * Interface specific description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Interface specific description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A device name from the provider configuration.
     * 
     */
    @Import(name="device")
    private @Nullable Output<String> device;

    /**
     * @return A device name from the provider configuration.
     * 
     */
    public Optional<Output<String>> device() {
        return Optional.ofNullable(this.device);
    }

    @Import(name="ipAccessGroupIn")
    private @Nullable Output<String> ipAccessGroupIn;

    public Optional<Output<String>> ipAccessGroupIn() {
        return Optional.ofNullable(this.ipAccessGroupIn);
    }

    /**
     * inbound packets
     * 
     */
    @Import(name="ipAccessGroupInEnable")
    private @Nullable Output<Boolean> ipAccessGroupInEnable;

    /**
     * @return inbound packets
     * 
     */
    public Optional<Output<Boolean>> ipAccessGroupInEnable() {
        return Optional.ofNullable(this.ipAccessGroupInEnable);
    }

    @Import(name="ipAccessGroupOut")
    private @Nullable Output<String> ipAccessGroupOut;

    public Optional<Output<String>> ipAccessGroupOut() {
        return Optional.ofNullable(this.ipAccessGroupOut);
    }

    /**
     * outbound packets
     * 
     */
    @Import(name="ipAccessGroupOutEnable")
    private @Nullable Output<Boolean> ipAccessGroupOutEnable;

    /**
     * @return outbound packets
     * 
     */
    public Optional<Output<Boolean>> ipAccessGroupOutEnable() {
        return Optional.ofNullable(this.ipAccessGroupOutEnable);
    }

    /**
     * Enable proxy ARP
     * 
     */
    @Import(name="ipProxyArp")
    private @Nullable Output<Boolean> ipProxyArp;

    /**
     * @return Enable proxy ARP
     * 
     */
    public Optional<Output<Boolean>> ipProxyArp() {
        return Optional.ofNullable(this.ipProxyArp);
    }

    /**
     * Enable sending ICMP Redirect messages
     * 
     */
    @Import(name="ipRedirects")
    private @Nullable Output<Boolean> ipRedirects;

    /**
     * @return Enable sending ICMP Redirect messages
     * 
     */
    public Optional<Output<Boolean>> ipRedirects() {
        return Optional.ofNullable(this.ipRedirects);
    }

    /**
     * Enable sending ICMP Unreachable messages
     * 
     */
    @Import(name="ipUnreachables")
    private @Nullable Output<Boolean> ipUnreachables;

    /**
     * @return Enable sending ICMP Unreachable messages
     * 
     */
    public Optional<Output<Boolean>> ipUnreachables() {
        return Optional.ofNullable(this.ipUnreachables);
    }

    @Import(name="ipv4Address")
    private @Nullable Output<String> ipv4Address;

    public Optional<Output<String>> ipv4Address() {
        return Optional.ofNullable(this.ipv4Address);
    }

    @Import(name="ipv4AddressMask")
    private @Nullable Output<String> ipv4AddressMask;

    public Optional<Output<String>> ipv4AddressMask() {
        return Optional.ofNullable(this.ipv4AddressMask);
    }

    /**
     * Insert default route
     * 
     */
    @Import(name="ipv6AddressAutoconfigDefault")
    private @Nullable Output<Boolean> ipv6AddressAutoconfigDefault;

    /**
     * @return Insert default route
     * 
     */
    public Optional<Output<Boolean>> ipv6AddressAutoconfigDefault() {
        return Optional.ofNullable(this.ipv6AddressAutoconfigDefault);
    }

    /**
     * Obtain IPv6 address from DHCP server
     * 
     */
    @Import(name="ipv6AddressDhcp")
    private @Nullable Output<Boolean> ipv6AddressDhcp;

    /**
     * @return Obtain IPv6 address from DHCP server
     * 
     */
    public Optional<Output<Boolean>> ipv6AddressDhcp() {
        return Optional.ofNullable(this.ipv6AddressDhcp);
    }

    @Import(name="ipv6Addresses")
    private @Nullable Output<List<InterfaceLoopbackIpv6AddressArgs>> ipv6Addresses;

    public Optional<Output<List<InterfaceLoopbackIpv6AddressArgs>>> ipv6Addresses() {
        return Optional.ofNullable(this.ipv6Addresses);
    }

    /**
     * Enable IPv6 on interface
     * 
     */
    @Import(name="ipv6Enable")
    private @Nullable Output<Boolean> ipv6Enable;

    /**
     * @return Enable IPv6 on interface
     * 
     */
    public Optional<Output<Boolean>> ipv6Enable() {
        return Optional.ofNullable(this.ipv6Enable);
    }

    @Import(name="ipv6LinkLocalAddresses")
    private @Nullable Output<List<InterfaceLoopbackIpv6LinkLocalAddressArgs>> ipv6LinkLocalAddresses;

    public Optional<Output<List<InterfaceLoopbackIpv6LinkLocalAddressArgs>>> ipv6LinkLocalAddresses() {
        return Optional.ofNullable(this.ipv6LinkLocalAddresses);
    }

    /**
     * Set IPv6 Maximum Transmission Unit - Range: `1280`-`9976`
     * 
     */
    @Import(name="ipv6Mtu")
    private @Nullable Output<Integer> ipv6Mtu;

    /**
     * @return Set IPv6 Maximum Transmission Unit - Range: `1280`-`9976`
     * 
     */
    public Optional<Output<Integer>> ipv6Mtu() {
        return Optional.ofNullable(this.ipv6Mtu);
    }

    /**
     * Suppress all IPv6 RA
     * 
     */
    @Import(name="ipv6NdRaSuppressAll")
    private @Nullable Output<Boolean> ipv6NdRaSuppressAll;

    /**
     * @return Suppress all IPv6 RA
     * 
     */
    public Optional<Output<Boolean>> ipv6NdRaSuppressAll() {
        return Optional.ofNullable(this.ipv6NdRaSuppressAll);
    }

    /**
     * - Range: `0`-`2147483647`
     * 
     */
    @Import(name="name")
    private @Nullable Output<Integer> name;

    /**
     * @return - Range: `0`-`2147483647`
     * 
     */
    public Optional<Output<Integer>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Shutdown the selected interface
     * 
     */
    @Import(name="shutdown")
    private @Nullable Output<Boolean> shutdown;

    /**
     * @return Shutdown the selected interface
     * 
     */
    public Optional<Output<Boolean>> shutdown() {
        return Optional.ofNullable(this.shutdown);
    }

    /**
     * Configure forwarding table
     * 
     */
    @Import(name="vrfForwarding")
    private @Nullable Output<String> vrfForwarding;

    /**
     * @return Configure forwarding table
     * 
     */
    public Optional<Output<String>> vrfForwarding() {
        return Optional.ofNullable(this.vrfForwarding);
    }

    private InterfaceLoopbackState() {}

    private InterfaceLoopbackState(InterfaceLoopbackState $) {
        this.arpTimeout = $.arpTimeout;
        this.deleteMode = $.deleteMode;
        this.description = $.description;
        this.device = $.device;
        this.ipAccessGroupIn = $.ipAccessGroupIn;
        this.ipAccessGroupInEnable = $.ipAccessGroupInEnable;
        this.ipAccessGroupOut = $.ipAccessGroupOut;
        this.ipAccessGroupOutEnable = $.ipAccessGroupOutEnable;
        this.ipProxyArp = $.ipProxyArp;
        this.ipRedirects = $.ipRedirects;
        this.ipUnreachables = $.ipUnreachables;
        this.ipv4Address = $.ipv4Address;
        this.ipv4AddressMask = $.ipv4AddressMask;
        this.ipv6AddressAutoconfigDefault = $.ipv6AddressAutoconfigDefault;
        this.ipv6AddressDhcp = $.ipv6AddressDhcp;
        this.ipv6Addresses = $.ipv6Addresses;
        this.ipv6Enable = $.ipv6Enable;
        this.ipv6LinkLocalAddresses = $.ipv6LinkLocalAddresses;
        this.ipv6Mtu = $.ipv6Mtu;
        this.ipv6NdRaSuppressAll = $.ipv6NdRaSuppressAll;
        this.name = $.name;
        this.shutdown = $.shutdown;
        this.vrfForwarding = $.vrfForwarding;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InterfaceLoopbackState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InterfaceLoopbackState $;

        public Builder() {
            $ = new InterfaceLoopbackState();
        }

        public Builder(InterfaceLoopbackState defaults) {
            $ = new InterfaceLoopbackState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arpTimeout Set ARP cache timeout - Range: `0`-`2147483`
         * 
         * @return builder
         * 
         */
        public Builder arpTimeout(@Nullable Output<Integer> arpTimeout) {
            $.arpTimeout = arpTimeout;
            return this;
        }

        /**
         * @param arpTimeout Set ARP cache timeout - Range: `0`-`2147483`
         * 
         * @return builder
         * 
         */
        public Builder arpTimeout(Integer arpTimeout) {
            return arpTimeout(Output.of(arpTimeout));
        }

        /**
         * @param deleteMode Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
         * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
         * Default value is `all`. - Choices: `all`, `attributes`
         * 
         * @return builder
         * 
         */
        public Builder deleteMode(@Nullable Output<String> deleteMode) {
            $.deleteMode = deleteMode;
            return this;
        }

        /**
         * @param deleteMode Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
         * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
         * Default value is `all`. - Choices: `all`, `attributes`
         * 
         * @return builder
         * 
         */
        public Builder deleteMode(String deleteMode) {
            return deleteMode(Output.of(deleteMode));
        }

        /**
         * @param description Interface specific description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Interface specific description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param device A device name from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder device(@Nullable Output<String> device) {
            $.device = device;
            return this;
        }

        /**
         * @param device A device name from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder device(String device) {
            return device(Output.of(device));
        }

        public Builder ipAccessGroupIn(@Nullable Output<String> ipAccessGroupIn) {
            $.ipAccessGroupIn = ipAccessGroupIn;
            return this;
        }

        public Builder ipAccessGroupIn(String ipAccessGroupIn) {
            return ipAccessGroupIn(Output.of(ipAccessGroupIn));
        }

        /**
         * @param ipAccessGroupInEnable inbound packets
         * 
         * @return builder
         * 
         */
        public Builder ipAccessGroupInEnable(@Nullable Output<Boolean> ipAccessGroupInEnable) {
            $.ipAccessGroupInEnable = ipAccessGroupInEnable;
            return this;
        }

        /**
         * @param ipAccessGroupInEnable inbound packets
         * 
         * @return builder
         * 
         */
        public Builder ipAccessGroupInEnable(Boolean ipAccessGroupInEnable) {
            return ipAccessGroupInEnable(Output.of(ipAccessGroupInEnable));
        }

        public Builder ipAccessGroupOut(@Nullable Output<String> ipAccessGroupOut) {
            $.ipAccessGroupOut = ipAccessGroupOut;
            return this;
        }

        public Builder ipAccessGroupOut(String ipAccessGroupOut) {
            return ipAccessGroupOut(Output.of(ipAccessGroupOut));
        }

        /**
         * @param ipAccessGroupOutEnable outbound packets
         * 
         * @return builder
         * 
         */
        public Builder ipAccessGroupOutEnable(@Nullable Output<Boolean> ipAccessGroupOutEnable) {
            $.ipAccessGroupOutEnable = ipAccessGroupOutEnable;
            return this;
        }

        /**
         * @param ipAccessGroupOutEnable outbound packets
         * 
         * @return builder
         * 
         */
        public Builder ipAccessGroupOutEnable(Boolean ipAccessGroupOutEnable) {
            return ipAccessGroupOutEnable(Output.of(ipAccessGroupOutEnable));
        }

        /**
         * @param ipProxyArp Enable proxy ARP
         * 
         * @return builder
         * 
         */
        public Builder ipProxyArp(@Nullable Output<Boolean> ipProxyArp) {
            $.ipProxyArp = ipProxyArp;
            return this;
        }

        /**
         * @param ipProxyArp Enable proxy ARP
         * 
         * @return builder
         * 
         */
        public Builder ipProxyArp(Boolean ipProxyArp) {
            return ipProxyArp(Output.of(ipProxyArp));
        }

        /**
         * @param ipRedirects Enable sending ICMP Redirect messages
         * 
         * @return builder
         * 
         */
        public Builder ipRedirects(@Nullable Output<Boolean> ipRedirects) {
            $.ipRedirects = ipRedirects;
            return this;
        }

        /**
         * @param ipRedirects Enable sending ICMP Redirect messages
         * 
         * @return builder
         * 
         */
        public Builder ipRedirects(Boolean ipRedirects) {
            return ipRedirects(Output.of(ipRedirects));
        }

        /**
         * @param ipUnreachables Enable sending ICMP Unreachable messages
         * 
         * @return builder
         * 
         */
        public Builder ipUnreachables(@Nullable Output<Boolean> ipUnreachables) {
            $.ipUnreachables = ipUnreachables;
            return this;
        }

        /**
         * @param ipUnreachables Enable sending ICMP Unreachable messages
         * 
         * @return builder
         * 
         */
        public Builder ipUnreachables(Boolean ipUnreachables) {
            return ipUnreachables(Output.of(ipUnreachables));
        }

        public Builder ipv4Address(@Nullable Output<String> ipv4Address) {
            $.ipv4Address = ipv4Address;
            return this;
        }

        public Builder ipv4Address(String ipv4Address) {
            return ipv4Address(Output.of(ipv4Address));
        }

        public Builder ipv4AddressMask(@Nullable Output<String> ipv4AddressMask) {
            $.ipv4AddressMask = ipv4AddressMask;
            return this;
        }

        public Builder ipv4AddressMask(String ipv4AddressMask) {
            return ipv4AddressMask(Output.of(ipv4AddressMask));
        }

        /**
         * @param ipv6AddressAutoconfigDefault Insert default route
         * 
         * @return builder
         * 
         */
        public Builder ipv6AddressAutoconfigDefault(@Nullable Output<Boolean> ipv6AddressAutoconfigDefault) {
            $.ipv6AddressAutoconfigDefault = ipv6AddressAutoconfigDefault;
            return this;
        }

        /**
         * @param ipv6AddressAutoconfigDefault Insert default route
         * 
         * @return builder
         * 
         */
        public Builder ipv6AddressAutoconfigDefault(Boolean ipv6AddressAutoconfigDefault) {
            return ipv6AddressAutoconfigDefault(Output.of(ipv6AddressAutoconfigDefault));
        }

        /**
         * @param ipv6AddressDhcp Obtain IPv6 address from DHCP server
         * 
         * @return builder
         * 
         */
        public Builder ipv6AddressDhcp(@Nullable Output<Boolean> ipv6AddressDhcp) {
            $.ipv6AddressDhcp = ipv6AddressDhcp;
            return this;
        }

        /**
         * @param ipv6AddressDhcp Obtain IPv6 address from DHCP server
         * 
         * @return builder
         * 
         */
        public Builder ipv6AddressDhcp(Boolean ipv6AddressDhcp) {
            return ipv6AddressDhcp(Output.of(ipv6AddressDhcp));
        }

        public Builder ipv6Addresses(@Nullable Output<List<InterfaceLoopbackIpv6AddressArgs>> ipv6Addresses) {
            $.ipv6Addresses = ipv6Addresses;
            return this;
        }

        public Builder ipv6Addresses(List<InterfaceLoopbackIpv6AddressArgs> ipv6Addresses) {
            return ipv6Addresses(Output.of(ipv6Addresses));
        }

        public Builder ipv6Addresses(InterfaceLoopbackIpv6AddressArgs... ipv6Addresses) {
            return ipv6Addresses(List.of(ipv6Addresses));
        }

        /**
         * @param ipv6Enable Enable IPv6 on interface
         * 
         * @return builder
         * 
         */
        public Builder ipv6Enable(@Nullable Output<Boolean> ipv6Enable) {
            $.ipv6Enable = ipv6Enable;
            return this;
        }

        /**
         * @param ipv6Enable Enable IPv6 on interface
         * 
         * @return builder
         * 
         */
        public Builder ipv6Enable(Boolean ipv6Enable) {
            return ipv6Enable(Output.of(ipv6Enable));
        }

        public Builder ipv6LinkLocalAddresses(@Nullable Output<List<InterfaceLoopbackIpv6LinkLocalAddressArgs>> ipv6LinkLocalAddresses) {
            $.ipv6LinkLocalAddresses = ipv6LinkLocalAddresses;
            return this;
        }

        public Builder ipv6LinkLocalAddresses(List<InterfaceLoopbackIpv6LinkLocalAddressArgs> ipv6LinkLocalAddresses) {
            return ipv6LinkLocalAddresses(Output.of(ipv6LinkLocalAddresses));
        }

        public Builder ipv6LinkLocalAddresses(InterfaceLoopbackIpv6LinkLocalAddressArgs... ipv6LinkLocalAddresses) {
            return ipv6LinkLocalAddresses(List.of(ipv6LinkLocalAddresses));
        }

        /**
         * @param ipv6Mtu Set IPv6 Maximum Transmission Unit - Range: `1280`-`9976`
         * 
         * @return builder
         * 
         */
        public Builder ipv6Mtu(@Nullable Output<Integer> ipv6Mtu) {
            $.ipv6Mtu = ipv6Mtu;
            return this;
        }

        /**
         * @param ipv6Mtu Set IPv6 Maximum Transmission Unit - Range: `1280`-`9976`
         * 
         * @return builder
         * 
         */
        public Builder ipv6Mtu(Integer ipv6Mtu) {
            return ipv6Mtu(Output.of(ipv6Mtu));
        }

        /**
         * @param ipv6NdRaSuppressAll Suppress all IPv6 RA
         * 
         * @return builder
         * 
         */
        public Builder ipv6NdRaSuppressAll(@Nullable Output<Boolean> ipv6NdRaSuppressAll) {
            $.ipv6NdRaSuppressAll = ipv6NdRaSuppressAll;
            return this;
        }

        /**
         * @param ipv6NdRaSuppressAll Suppress all IPv6 RA
         * 
         * @return builder
         * 
         */
        public Builder ipv6NdRaSuppressAll(Boolean ipv6NdRaSuppressAll) {
            return ipv6NdRaSuppressAll(Output.of(ipv6NdRaSuppressAll));
        }

        /**
         * @param name - Range: `0`-`2147483647`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<Integer> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name - Range: `0`-`2147483647`
         * 
         * @return builder
         * 
         */
        public Builder name(Integer name) {
            return name(Output.of(name));
        }

        /**
         * @param shutdown Shutdown the selected interface
         * 
         * @return builder
         * 
         */
        public Builder shutdown(@Nullable Output<Boolean> shutdown) {
            $.shutdown = shutdown;
            return this;
        }

        /**
         * @param shutdown Shutdown the selected interface
         * 
         * @return builder
         * 
         */
        public Builder shutdown(Boolean shutdown) {
            return shutdown(Output.of(shutdown));
        }

        /**
         * @param vrfForwarding Configure forwarding table
         * 
         * @return builder
         * 
         */
        public Builder vrfForwarding(@Nullable Output<String> vrfForwarding) {
            $.vrfForwarding = vrfForwarding;
            return this;
        }

        /**
         * @param vrfForwarding Configure forwarding table
         * 
         * @return builder
         * 
         */
        public Builder vrfForwarding(String vrfForwarding) {
            return vrfForwarding(Output.of(vrfForwarding));
        }

        public InterfaceLoopbackState build() {
            return $;
        }
    }

}
