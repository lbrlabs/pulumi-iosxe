// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.iosxe.Utilities;
import com.pulumi.iosxe.iosxe.InterfacePortChannelArgs;
import com.pulumi.iosxe.iosxe.inputs.InterfacePortChannelState;
import com.pulumi.iosxe.iosxe.outputs.InterfacePortChannelHelperAddress;
import com.pulumi.iosxe.iosxe.outputs.InterfacePortChannelIpv6Address;
import com.pulumi.iosxe.iosxe.outputs.InterfacePortChannelIpv6LinkLocalAddress;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="iosxe:iosxe/interfacePortChannel:InterfacePortChannel")
public class InterfacePortChannel extends com.pulumi.resources.CustomResource {
    /**
     * Set ARP cache timeout - Range: `0`-`2147483`
     * 
     */
    @Export(name="arpTimeout", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> arpTimeout;

    /**
     * @return Set ARP cache timeout - Range: `0`-`2147483`
     * 
     */
    public Output<Optional<Integer>> arpTimeout() {
        return Codegen.optional(this.arpTimeout);
    }
    /**
     * Configure classification for untrusted devices
     * 
     */
    @Export(name="autoQosClassify", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoQosClassify;

    /**
     * @return Configure classification for untrusted devices
     * 
     */
    public Output<Optional<Boolean>> autoQosClassify() {
        return Codegen.optional(this.autoQosClassify);
    }
    /**
     * Configure QoS policing for untrusted devices
     * 
     */
    @Export(name="autoQosClassifyPolice", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoQosClassifyPolice;

    /**
     * @return Configure QoS policing for untrusted devices
     * 
     */
    public Output<Optional<Boolean>> autoQosClassifyPolice() {
        return Codegen.optional(this.autoQosClassifyPolice);
    }
    /**
     * Trust the DSCP/CoS marking
     * 
     */
    @Export(name="autoQosTrust", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoQosTrust;

    /**
     * @return Trust the DSCP/CoS marking
     * 
     */
    public Output<Optional<Boolean>> autoQosTrust() {
        return Codegen.optional(this.autoQosTrust);
    }
    /**
     * Trust the CoS marking
     * 
     */
    @Export(name="autoQosTrustCos", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoQosTrustCos;

    /**
     * @return Trust the CoS marking
     * 
     */
    public Output<Optional<Boolean>> autoQosTrustCos() {
        return Codegen.optional(this.autoQosTrustCos);
    }
    /**
     * Trust the DSCP marking
     * 
     */
    @Export(name="autoQosTrustDscp", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoQosTrustDscp;

    /**
     * @return Trust the DSCP marking
     * 
     */
    public Output<Optional<Boolean>> autoQosTrustDscp() {
        return Codegen.optional(this.autoQosTrustDscp);
    }
    /**
     * Trust the QoS marking of the Cisco Telepresence System
     * 
     */
    @Export(name="autoQosVideoCts", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoQosVideoCts;

    /**
     * @return Trust the QoS marking of the Cisco Telepresence System
     * 
     */
    public Output<Optional<Boolean>> autoQosVideoCts() {
        return Codegen.optional(this.autoQosVideoCts);
    }
    /**
     * Trust the QoS marking of the Ip Video Surveillance camera
     * 
     */
    @Export(name="autoQosVideoIpCamera", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoQosVideoIpCamera;

    /**
     * @return Trust the QoS marking of the Ip Video Surveillance camera
     * 
     */
    public Output<Optional<Boolean>> autoQosVideoIpCamera() {
        return Codegen.optional(this.autoQosVideoIpCamera);
    }
    /**
     * Trust the Qos marking of the Cisco Media Player
     * 
     */
    @Export(name="autoQosVideoMediaPlayer", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoQosVideoMediaPlayer;

    /**
     * @return Trust the Qos marking of the Cisco Media Player
     * 
     */
    public Output<Optional<Boolean>> autoQosVideoMediaPlayer() {
        return Codegen.optional(this.autoQosVideoMediaPlayer);
    }
    /**
     * Configure AutoQoS for VoIP
     * 
     */
    @Export(name="autoQosVoip", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoQosVoip;

    /**
     * @return Configure AutoQoS for VoIP
     * 
     */
    public Output<Optional<Boolean>> autoQosVoip() {
        return Codegen.optional(this.autoQosVoip);
    }
    /**
     * Trust the QoS marking of Cisco IP Phone
     * 
     */
    @Export(name="autoQosVoipCiscoPhone", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoQosVoipCiscoPhone;

    /**
     * @return Trust the QoS marking of Cisco IP Phone
     * 
     */
    public Output<Optional<Boolean>> autoQosVoipCiscoPhone() {
        return Codegen.optional(this.autoQosVoipCiscoPhone);
    }
    /**
     * Trust the QoS marking of Cisco IP SoftPhone
     * 
     */
    @Export(name="autoQosVoipCiscoSoftphone", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoQosVoipCiscoSoftphone;

    /**
     * @return Trust the QoS marking of Cisco IP SoftPhone
     * 
     */
    public Output<Optional<Boolean>> autoQosVoipCiscoSoftphone() {
        return Codegen.optional(this.autoQosVoipCiscoSoftphone);
    }
    /**
     * Trust the DSCP/CoS marking
     * 
     */
    @Export(name="autoQosVoipTrust", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoQosVoipTrust;

    /**
     * @return Trust the DSCP/CoS marking
     * 
     */
    public Output<Optional<Boolean>> autoQosVoipTrust() {
        return Codegen.optional(this.autoQosVoipTrust);
    }
    /**
     * Use echo adjunct as bfd detection mechanism
     * 
     */
    @Export(name="bfdEcho", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> bfdEcho;

    /**
     * @return Use echo adjunct as bfd detection mechanism
     * 
     */
    public Output<Optional<Boolean>> bfdEcho() {
        return Codegen.optional(this.bfdEcho);
    }
    /**
     * Enable BFD under the interface
     * 
     */
    @Export(name="bfdEnable", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> bfdEnable;

    /**
     * @return Enable BFD under the interface
     * 
     */
    public Output<Optional<Boolean>> bfdEnable() {
        return Codegen.optional(this.bfdEnable);
    }
    /**
     * - Range: `50`-`9999`
     * 
     */
    @Export(name="bfdInterval", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> bfdInterval;

    /**
     * @return - Range: `50`-`9999`
     * 
     */
    public Output<Optional<Integer>> bfdInterval() {
        return Codegen.optional(this.bfdInterval);
    }
    /**
     * Minimum receive interval capability - Range: `50`-`9999`
     * 
     */
    @Export(name="bfdIntervalMinRx", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> bfdIntervalMinRx;

    /**
     * @return Minimum receive interval capability - Range: `50`-`9999`
     * 
     */
    public Output<Optional<Integer>> bfdIntervalMinRx() {
        return Codegen.optional(this.bfdIntervalMinRx);
    }
    /**
     * Multiplier value used to compute holddown - Range: `3`-`50`
     * 
     */
    @Export(name="bfdIntervalMultiplier", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> bfdIntervalMultiplier;

    /**
     * @return Multiplier value used to compute holddown - Range: `3`-`50`
     * 
     */
    public Output<Optional<Integer>> bfdIntervalMultiplier() {
        return Codegen.optional(this.bfdIntervalMultiplier);
    }
    /**
     * The Source IP address to be used for BFD sessions over this interface.
     * 
     */
    @Export(name="bfdLocalAddress", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> bfdLocalAddress;

    /**
     * @return The Source IP address to be used for BFD sessions over this interface.
     * 
     */
    public Output<Optional<String>> bfdLocalAddress() {
        return Codegen.optional(this.bfdLocalAddress);
    }
    /**
     * BFD template
     * 
     */
    @Export(name="bfdTemplate", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> bfdTemplate;

    /**
     * @return BFD template
     * 
     */
    public Output<Optional<String>> bfdTemplate() {
        return Codegen.optional(this.bfdTemplate);
    }
    /**
     * Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
     * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
     * Default value is `all`. - Choices: `all`, `attributes`
     * 
     */
    @Export(name="deleteMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deleteMode;

    /**
     * @return Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
     * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
     * Default value is `all`. - Choices: `all`, `attributes`
     * 
     */
    public Output<Optional<String>> deleteMode() {
        return Codegen.optional(this.deleteMode);
    }
    /**
     * Interface specific description
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Interface specific description
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A device name from the provider configuration.
     * 
     */
    @Export(name="device", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> device;

    /**
     * @return A device name from the provider configuration.
     * 
     */
    public Output<Optional<String>> device() {
        return Codegen.optional(this.device);
    }
    /**
     * Specify a destination address for UDP broadcasts
     * 
     */
    @Export(name="helperAddresses", refs={List.class,InterfacePortChannelHelperAddress.class}, tree="[0,1]")
    private Output</* @Nullable */ List<InterfacePortChannelHelperAddress>> helperAddresses;

    /**
     * @return Specify a destination address for UDP broadcasts
     * 
     */
    public Output<Optional<List<InterfacePortChannelHelperAddress>>> helperAddresses() {
        return Codegen.optional(this.helperAddresses);
    }
    @Export(name="ipAccessGroupIn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipAccessGroupIn;

    public Output<Optional<String>> ipAccessGroupIn() {
        return Codegen.optional(this.ipAccessGroupIn);
    }
    /**
     * inbound packets
     * 
     */
    @Export(name="ipAccessGroupInEnable", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ipAccessGroupInEnable;

    /**
     * @return inbound packets
     * 
     */
    public Output<Optional<Boolean>> ipAccessGroupInEnable() {
        return Codegen.optional(this.ipAccessGroupInEnable);
    }
    @Export(name="ipAccessGroupOut", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipAccessGroupOut;

    public Output<Optional<String>> ipAccessGroupOut() {
        return Codegen.optional(this.ipAccessGroupOut);
    }
    /**
     * outbound packets
     * 
     */
    @Export(name="ipAccessGroupOutEnable", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ipAccessGroupOutEnable;

    /**
     * @return outbound packets
     * 
     */
    public Output<Optional<Boolean>> ipAccessGroupOutEnable() {
        return Codegen.optional(this.ipAccessGroupOutEnable);
    }
    /**
     * Rate Limit - Range: `0`-`4294967295`
     * 
     */
    @Export(name="ipArpInspectionLimitRate", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> ipArpInspectionLimitRate;

    /**
     * @return Rate Limit - Range: `0`-`4294967295`
     * 
     */
    public Output<Optional<Integer>> ipArpInspectionLimitRate() {
        return Codegen.optional(this.ipArpInspectionLimitRate);
    }
    /**
     * Configure Trust state
     * 
     */
    @Export(name="ipArpInspectionTrust", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ipArpInspectionTrust;

    /**
     * @return Configure Trust state
     * 
     */
    public Output<Optional<Boolean>> ipArpInspectionTrust() {
        return Codegen.optional(this.ipArpInspectionTrust);
    }
    /**
     * Set source interface for relayed messages
     * 
     */
    @Export(name="ipDhcpRelaySourceInterface", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipDhcpRelaySourceInterface;

    /**
     * @return Set source interface for relayed messages
     * 
     */
    public Output<Optional<String>> ipDhcpRelaySourceInterface() {
        return Codegen.optional(this.ipDhcpRelaySourceInterface);
    }
    /**
     * DHCP Snooping trust config
     * 
     */
    @Export(name="ipDhcpSnoopingTrust", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ipDhcpSnoopingTrust;

    /**
     * @return DHCP Snooping trust config
     * 
     */
    public Output<Optional<Boolean>> ipDhcpSnoopingTrust() {
        return Codegen.optional(this.ipDhcpSnoopingTrust);
    }
    /**
     * Enable proxy ARP
     * 
     */
    @Export(name="ipProxyArp", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ipProxyArp;

    /**
     * @return Enable proxy ARP
     * 
     */
    public Output<Optional<Boolean>> ipProxyArp() {
        return Codegen.optional(this.ipProxyArp);
    }
    /**
     * Enable sending ICMP Redirect messages
     * 
     */
    @Export(name="ipRedirects", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ipRedirects;

    /**
     * @return Enable sending ICMP Redirect messages
     * 
     */
    public Output<Optional<Boolean>> ipRedirects() {
        return Codegen.optional(this.ipRedirects);
    }
    /**
     * Enable sending ICMP Unreachable messages
     * 
     */
    @Export(name="ipUnreachables", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ipUnreachables;

    /**
     * @return Enable sending ICMP Unreachable messages
     * 
     */
    public Output<Optional<Boolean>> ipUnreachables() {
        return Codegen.optional(this.ipUnreachables);
    }
    @Export(name="ipv4Address", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipv4Address;

    public Output<Optional<String>> ipv4Address() {
        return Codegen.optional(this.ipv4Address);
    }
    @Export(name="ipv4AddressMask", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipv4AddressMask;

    public Output<Optional<String>> ipv4AddressMask() {
        return Codegen.optional(this.ipv4AddressMask);
    }
    /**
     * Insert default route
     * 
     */
    @Export(name="ipv6AddressAutoconfigDefault", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ipv6AddressAutoconfigDefault;

    /**
     * @return Insert default route
     * 
     */
    public Output<Optional<Boolean>> ipv6AddressAutoconfigDefault() {
        return Codegen.optional(this.ipv6AddressAutoconfigDefault);
    }
    /**
     * Obtain IPv6 address from DHCP server
     * 
     */
    @Export(name="ipv6AddressDhcp", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ipv6AddressDhcp;

    /**
     * @return Obtain IPv6 address from DHCP server
     * 
     */
    public Output<Optional<Boolean>> ipv6AddressDhcp() {
        return Codegen.optional(this.ipv6AddressDhcp);
    }
    @Export(name="ipv6Addresses", refs={List.class,InterfacePortChannelIpv6Address.class}, tree="[0,1]")
    private Output</* @Nullable */ List<InterfacePortChannelIpv6Address>> ipv6Addresses;

    public Output<Optional<List<InterfacePortChannelIpv6Address>>> ipv6Addresses() {
        return Codegen.optional(this.ipv6Addresses);
    }
    /**
     * Enable IPv6 on interface
     * 
     */
    @Export(name="ipv6Enable", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ipv6Enable;

    /**
     * @return Enable IPv6 on interface
     * 
     */
    public Output<Optional<Boolean>> ipv6Enable() {
        return Codegen.optional(this.ipv6Enable);
    }
    @Export(name="ipv6LinkLocalAddresses", refs={List.class,InterfacePortChannelIpv6LinkLocalAddress.class}, tree="[0,1]")
    private Output</* @Nullable */ List<InterfacePortChannelIpv6LinkLocalAddress>> ipv6LinkLocalAddresses;

    public Output<Optional<List<InterfacePortChannelIpv6LinkLocalAddress>>> ipv6LinkLocalAddresses() {
        return Codegen.optional(this.ipv6LinkLocalAddresses);
    }
    /**
     * Set IPv6 Maximum Transmission Unit - Range: `1280`-`9976`
     * 
     */
    @Export(name="ipv6Mtu", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> ipv6Mtu;

    /**
     * @return Set IPv6 Maximum Transmission Unit - Range: `1280`-`9976`
     * 
     */
    public Output<Optional<Integer>> ipv6Mtu() {
        return Codegen.optional(this.ipv6Mtu);
    }
    /**
     * Suppress all IPv6 RA
     * 
     */
    @Export(name="ipv6NdRaSuppressAll", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ipv6NdRaSuppressAll;

    /**
     * @return Suppress all IPv6 RA
     * 
     */
    public Output<Optional<Boolean>> ipv6NdRaSuppressAll() {
        return Codegen.optional(this.ipv6NdRaSuppressAll);
    }
    /**
     * - Range: `1`-`512`
     * 
     */
    @Export(name="name", refs={Integer.class}, tree="[0]")
    private Output<Integer> name;

    /**
     * @return - Range: `1`-`512`
     * 
     */
    public Output<Integer> name() {
        return this.name;
    }
    /**
     * Shutdown the selected interface
     * 
     */
    @Export(name="shutdown", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> shutdown;

    /**
     * @return Shutdown the selected interface
     * 
     */
    public Output<Optional<Boolean>> shutdown() {
        return Codegen.optional(this.shutdown);
    }
    /**
     * Change an interface&#39;s spanning tree guard mode - Choices: `loop`, `none`, `root`
     * 
     */
    @Export(name="spanningTreeGuard", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> spanningTreeGuard;

    /**
     * @return Change an interface&#39;s spanning tree guard mode - Choices: `loop`, `none`, `root`
     * 
     */
    public Output<Optional<String>> spanningTreeGuard() {
        return Codegen.optional(this.spanningTreeGuard);
    }
    /**
     * Specify a link type for spanning tree tree protocol use - Choices: `point-to-point`, `shared`
     * 
     */
    @Export(name="spanningTreeLinkType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> spanningTreeLinkType;

    /**
     * @return Specify a link type for spanning tree tree protocol use - Choices: `point-to-point`, `shared`
     * 
     */
    public Output<Optional<String>> spanningTreeLinkType() {
        return Codegen.optional(this.spanningTreeLinkType);
    }
    @Export(name="switchport", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> switchport;

    public Output<Optional<Boolean>> switchport() {
        return Codegen.optional(this.switchport);
    }
    /**
     * trusted device class - Choices: `cisco-phone`, `cts`, `ip-camera`, `media-player`
     * 
     */
    @Export(name="trustDevice", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> trustDevice;

    /**
     * @return trusted device class - Choices: `cisco-phone`, `cts`, `ip-camera`, `media-player`
     * 
     */
    public Output<Optional<String>> trustDevice() {
        return Codegen.optional(this.trustDevice);
    }
    /**
     * Configure forwarding table
     * 
     */
    @Export(name="vrfForwarding", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vrfForwarding;

    /**
     * @return Configure forwarding table
     * 
     */
    public Output<Optional<String>> vrfForwarding() {
        return Codegen.optional(this.vrfForwarding);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InterfacePortChannel(String name) {
        this(name, InterfacePortChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InterfacePortChannel(String name, @Nullable InterfacePortChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InterfacePortChannel(String name, @Nullable InterfacePortChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/interfacePortChannel:InterfacePortChannel", name, args == null ? InterfacePortChannelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InterfacePortChannel(String name, Output<String> id, @Nullable InterfacePortChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/interfacePortChannel:InterfacePortChannel", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static InterfacePortChannel get(String name, Output<String> id, @Nullable InterfacePortChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InterfacePortChannel(name, id, state, options);
    }
}
