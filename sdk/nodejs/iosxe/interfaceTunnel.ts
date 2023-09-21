// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export class InterfaceTunnel extends pulumi.CustomResource {
    /**
     * Get an existing InterfaceTunnel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InterfaceTunnelState, opts?: pulumi.CustomResourceOptions): InterfaceTunnel {
        return new InterfaceTunnel(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'iosxe:iosxe/interfaceTunnel:InterfaceTunnel';

    /**
     * Returns true if the given object is an instance of InterfaceTunnel.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InterfaceTunnel {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InterfaceTunnel.__pulumiType;
    }

    /**
     * Set ARP cache timeout - Range: `0`-`2147483`
     */
    public readonly arpTimeout!: pulumi.Output<number | undefined>;
    /**
     * Use echo adjunct as bfd detection mechanism
     */
    public readonly bfdEcho!: pulumi.Output<boolean | undefined>;
    /**
     * Enable BFD under the interface
     */
    public readonly bfdEnable!: pulumi.Output<boolean | undefined>;
    /**
     * - Range: `50`-`9999`
     */
    public readonly bfdInterval!: pulumi.Output<number | undefined>;
    /**
     * Minimum receive interval capability - Range: `50`-`9999`
     */
    public readonly bfdIntervalMinRx!: pulumi.Output<number | undefined>;
    /**
     * Multiplier value used to compute holddown - Range: `3`-`50`
     */
    public readonly bfdIntervalMultiplier!: pulumi.Output<number | undefined>;
    /**
     * The Source IP address to be used for BFD sessions over this interface.
     */
    public readonly bfdLocalAddress!: pulumi.Output<string | undefined>;
    /**
     * BFD template
     */
    public readonly bfdTemplate!: pulumi.Output<string | undefined>;
    /**
     * Handling of encapsulated DF bit. - Choices: `clear`, `copy`, `set`
     */
    public readonly cryptoIpsecDfBit!: pulumi.Output<string | undefined>;
    /**
     * Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
     * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
     * Default value is `all`. - Choices: `all`, `attributes`
     */
    public readonly deleteMode!: pulumi.Output<string | undefined>;
    /**
     * Interface specific description
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * A device name from the provider configuration.
     */
    public readonly device!: pulumi.Output<string | undefined>;
    /**
     * Specify a destination address for UDP broadcasts
     */
    public readonly helperAddresses!: pulumi.Output<outputs.iosxe.InterfaceTunnelHelperAddress[] | undefined>;
    public readonly ipAccessGroupIn!: pulumi.Output<string | undefined>;
    /**
     * inbound packets
     */
    public readonly ipAccessGroupInEnable!: pulumi.Output<boolean | undefined>;
    public readonly ipAccessGroupOut!: pulumi.Output<string | undefined>;
    /**
     * outbound packets
     */
    public readonly ipAccessGroupOutEnable!: pulumi.Output<boolean | undefined>;
    /**
     * Set source interface for relayed messages
     */
    public readonly ipDhcpRelaySourceInterface!: pulumi.Output<string | undefined>;
    /**
     * Enable proxy ARP
     */
    public readonly ipProxyArp!: pulumi.Output<boolean | undefined>;
    /**
     * Enable sending ICMP Redirect messages
     */
    public readonly ipRedirects!: pulumi.Output<boolean | undefined>;
    /**
     * Enable sending ICMP Unreachable messages
     */
    public readonly ipUnreachables!: pulumi.Output<boolean | undefined>;
    public readonly ipv4Address!: pulumi.Output<string | undefined>;
    public readonly ipv4AddressMask!: pulumi.Output<string | undefined>;
    /**
     * Insert default route
     */
    public readonly ipv6AddressAutoconfigDefault!: pulumi.Output<boolean | undefined>;
    /**
     * Obtain IPv6 address from DHCP server
     */
    public readonly ipv6AddressDhcp!: pulumi.Output<boolean | undefined>;
    public readonly ipv6Addresses!: pulumi.Output<outputs.iosxe.InterfaceTunnelIpv6Address[] | undefined>;
    /**
     * Enable IPv6 on interface
     */
    public readonly ipv6Enable!: pulumi.Output<boolean | undefined>;
    public readonly ipv6LinkLocalAddresses!: pulumi.Output<outputs.iosxe.InterfaceTunnelIpv6LinkLocalAddress[] | undefined>;
    /**
     * Set IPv6 Maximum Transmission Unit - Range: `1280`-`9976`
     */
    public readonly ipv6Mtu!: pulumi.Output<number | undefined>;
    /**
     * Suppress all IPv6 RA
     */
    public readonly ipv6NdRaSuppressAll!: pulumi.Output<boolean | undefined>;
    /**
     * - Range: `0`-`4294967295`
     */
    public readonly name!: pulumi.Output<number>;
    /**
     * Shutdown the selected interface
     */
    public readonly shutdown!: pulumi.Output<boolean | undefined>;
    /**
     * ip address or host name
     */
    public readonly tunnelDestinationIpv4!: pulumi.Output<string | undefined>;
    /**
     * over IPv4
     */
    public readonly tunnelModeIpsecIpv4!: pulumi.Output<boolean | undefined>;
    /**
     * Determine the ipsec policy profile to use.
     */
    public readonly tunnelProtectionIpsecProfile!: pulumi.Output<string | undefined>;
    /**
     * source of tunnel packets
     */
    public readonly tunnelSource!: pulumi.Output<string | undefined>;
    /**
     * Enable IP processing without an explicit address
     */
    public readonly unnumbered!: pulumi.Output<string | undefined>;
    /**
     * Configure forwarding table
     */
    public readonly vrfForwarding!: pulumi.Output<string | undefined>;

    /**
     * Create a InterfaceTunnel resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: InterfaceTunnelArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InterfaceTunnelArgs | InterfaceTunnelState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InterfaceTunnelState | undefined;
            resourceInputs["arpTimeout"] = state ? state.arpTimeout : undefined;
            resourceInputs["bfdEcho"] = state ? state.bfdEcho : undefined;
            resourceInputs["bfdEnable"] = state ? state.bfdEnable : undefined;
            resourceInputs["bfdInterval"] = state ? state.bfdInterval : undefined;
            resourceInputs["bfdIntervalMinRx"] = state ? state.bfdIntervalMinRx : undefined;
            resourceInputs["bfdIntervalMultiplier"] = state ? state.bfdIntervalMultiplier : undefined;
            resourceInputs["bfdLocalAddress"] = state ? state.bfdLocalAddress : undefined;
            resourceInputs["bfdTemplate"] = state ? state.bfdTemplate : undefined;
            resourceInputs["cryptoIpsecDfBit"] = state ? state.cryptoIpsecDfBit : undefined;
            resourceInputs["deleteMode"] = state ? state.deleteMode : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["helperAddresses"] = state ? state.helperAddresses : undefined;
            resourceInputs["ipAccessGroupIn"] = state ? state.ipAccessGroupIn : undefined;
            resourceInputs["ipAccessGroupInEnable"] = state ? state.ipAccessGroupInEnable : undefined;
            resourceInputs["ipAccessGroupOut"] = state ? state.ipAccessGroupOut : undefined;
            resourceInputs["ipAccessGroupOutEnable"] = state ? state.ipAccessGroupOutEnable : undefined;
            resourceInputs["ipDhcpRelaySourceInterface"] = state ? state.ipDhcpRelaySourceInterface : undefined;
            resourceInputs["ipProxyArp"] = state ? state.ipProxyArp : undefined;
            resourceInputs["ipRedirects"] = state ? state.ipRedirects : undefined;
            resourceInputs["ipUnreachables"] = state ? state.ipUnreachables : undefined;
            resourceInputs["ipv4Address"] = state ? state.ipv4Address : undefined;
            resourceInputs["ipv4AddressMask"] = state ? state.ipv4AddressMask : undefined;
            resourceInputs["ipv6AddressAutoconfigDefault"] = state ? state.ipv6AddressAutoconfigDefault : undefined;
            resourceInputs["ipv6AddressDhcp"] = state ? state.ipv6AddressDhcp : undefined;
            resourceInputs["ipv6Addresses"] = state ? state.ipv6Addresses : undefined;
            resourceInputs["ipv6Enable"] = state ? state.ipv6Enable : undefined;
            resourceInputs["ipv6LinkLocalAddresses"] = state ? state.ipv6LinkLocalAddresses : undefined;
            resourceInputs["ipv6Mtu"] = state ? state.ipv6Mtu : undefined;
            resourceInputs["ipv6NdRaSuppressAll"] = state ? state.ipv6NdRaSuppressAll : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["shutdown"] = state ? state.shutdown : undefined;
            resourceInputs["tunnelDestinationIpv4"] = state ? state.tunnelDestinationIpv4 : undefined;
            resourceInputs["tunnelModeIpsecIpv4"] = state ? state.tunnelModeIpsecIpv4 : undefined;
            resourceInputs["tunnelProtectionIpsecProfile"] = state ? state.tunnelProtectionIpsecProfile : undefined;
            resourceInputs["tunnelSource"] = state ? state.tunnelSource : undefined;
            resourceInputs["unnumbered"] = state ? state.unnumbered : undefined;
            resourceInputs["vrfForwarding"] = state ? state.vrfForwarding : undefined;
        } else {
            const args = argsOrState as InterfaceTunnelArgs | undefined;
            resourceInputs["arpTimeout"] = args ? args.arpTimeout : undefined;
            resourceInputs["bfdEcho"] = args ? args.bfdEcho : undefined;
            resourceInputs["bfdEnable"] = args ? args.bfdEnable : undefined;
            resourceInputs["bfdInterval"] = args ? args.bfdInterval : undefined;
            resourceInputs["bfdIntervalMinRx"] = args ? args.bfdIntervalMinRx : undefined;
            resourceInputs["bfdIntervalMultiplier"] = args ? args.bfdIntervalMultiplier : undefined;
            resourceInputs["bfdLocalAddress"] = args ? args.bfdLocalAddress : undefined;
            resourceInputs["bfdTemplate"] = args ? args.bfdTemplate : undefined;
            resourceInputs["cryptoIpsecDfBit"] = args ? args.cryptoIpsecDfBit : undefined;
            resourceInputs["deleteMode"] = args ? args.deleteMode : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["helperAddresses"] = args ? args.helperAddresses : undefined;
            resourceInputs["ipAccessGroupIn"] = args ? args.ipAccessGroupIn : undefined;
            resourceInputs["ipAccessGroupInEnable"] = args ? args.ipAccessGroupInEnable : undefined;
            resourceInputs["ipAccessGroupOut"] = args ? args.ipAccessGroupOut : undefined;
            resourceInputs["ipAccessGroupOutEnable"] = args ? args.ipAccessGroupOutEnable : undefined;
            resourceInputs["ipDhcpRelaySourceInterface"] = args ? args.ipDhcpRelaySourceInterface : undefined;
            resourceInputs["ipProxyArp"] = args ? args.ipProxyArp : undefined;
            resourceInputs["ipRedirects"] = args ? args.ipRedirects : undefined;
            resourceInputs["ipUnreachables"] = args ? args.ipUnreachables : undefined;
            resourceInputs["ipv4Address"] = args ? args.ipv4Address : undefined;
            resourceInputs["ipv4AddressMask"] = args ? args.ipv4AddressMask : undefined;
            resourceInputs["ipv6AddressAutoconfigDefault"] = args ? args.ipv6AddressAutoconfigDefault : undefined;
            resourceInputs["ipv6AddressDhcp"] = args ? args.ipv6AddressDhcp : undefined;
            resourceInputs["ipv6Addresses"] = args ? args.ipv6Addresses : undefined;
            resourceInputs["ipv6Enable"] = args ? args.ipv6Enable : undefined;
            resourceInputs["ipv6LinkLocalAddresses"] = args ? args.ipv6LinkLocalAddresses : undefined;
            resourceInputs["ipv6Mtu"] = args ? args.ipv6Mtu : undefined;
            resourceInputs["ipv6NdRaSuppressAll"] = args ? args.ipv6NdRaSuppressAll : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["shutdown"] = args ? args.shutdown : undefined;
            resourceInputs["tunnelDestinationIpv4"] = args ? args.tunnelDestinationIpv4 : undefined;
            resourceInputs["tunnelModeIpsecIpv4"] = args ? args.tunnelModeIpsecIpv4 : undefined;
            resourceInputs["tunnelProtectionIpsecProfile"] = args ? args.tunnelProtectionIpsecProfile : undefined;
            resourceInputs["tunnelSource"] = args ? args.tunnelSource : undefined;
            resourceInputs["unnumbered"] = args ? args.unnumbered : undefined;
            resourceInputs["vrfForwarding"] = args ? args.vrfForwarding : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(InterfaceTunnel.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InterfaceTunnel resources.
 */
export interface InterfaceTunnelState {
    /**
     * Set ARP cache timeout - Range: `0`-`2147483`
     */
    arpTimeout?: pulumi.Input<number>;
    /**
     * Use echo adjunct as bfd detection mechanism
     */
    bfdEcho?: pulumi.Input<boolean>;
    /**
     * Enable BFD under the interface
     */
    bfdEnable?: pulumi.Input<boolean>;
    /**
     * - Range: `50`-`9999`
     */
    bfdInterval?: pulumi.Input<number>;
    /**
     * Minimum receive interval capability - Range: `50`-`9999`
     */
    bfdIntervalMinRx?: pulumi.Input<number>;
    /**
     * Multiplier value used to compute holddown - Range: `3`-`50`
     */
    bfdIntervalMultiplier?: pulumi.Input<number>;
    /**
     * The Source IP address to be used for BFD sessions over this interface.
     */
    bfdLocalAddress?: pulumi.Input<string>;
    /**
     * BFD template
     */
    bfdTemplate?: pulumi.Input<string>;
    /**
     * Handling of encapsulated DF bit. - Choices: `clear`, `copy`, `set`
     */
    cryptoIpsecDfBit?: pulumi.Input<string>;
    /**
     * Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
     * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
     * Default value is `all`. - Choices: `all`, `attributes`
     */
    deleteMode?: pulumi.Input<string>;
    /**
     * Interface specific description
     */
    description?: pulumi.Input<string>;
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    /**
     * Specify a destination address for UDP broadcasts
     */
    helperAddresses?: pulumi.Input<pulumi.Input<inputs.iosxe.InterfaceTunnelHelperAddress>[]>;
    ipAccessGroupIn?: pulumi.Input<string>;
    /**
     * inbound packets
     */
    ipAccessGroupInEnable?: pulumi.Input<boolean>;
    ipAccessGroupOut?: pulumi.Input<string>;
    /**
     * outbound packets
     */
    ipAccessGroupOutEnable?: pulumi.Input<boolean>;
    /**
     * Set source interface for relayed messages
     */
    ipDhcpRelaySourceInterface?: pulumi.Input<string>;
    /**
     * Enable proxy ARP
     */
    ipProxyArp?: pulumi.Input<boolean>;
    /**
     * Enable sending ICMP Redirect messages
     */
    ipRedirects?: pulumi.Input<boolean>;
    /**
     * Enable sending ICMP Unreachable messages
     */
    ipUnreachables?: pulumi.Input<boolean>;
    ipv4Address?: pulumi.Input<string>;
    ipv4AddressMask?: pulumi.Input<string>;
    /**
     * Insert default route
     */
    ipv6AddressAutoconfigDefault?: pulumi.Input<boolean>;
    /**
     * Obtain IPv6 address from DHCP server
     */
    ipv6AddressDhcp?: pulumi.Input<boolean>;
    ipv6Addresses?: pulumi.Input<pulumi.Input<inputs.iosxe.InterfaceTunnelIpv6Address>[]>;
    /**
     * Enable IPv6 on interface
     */
    ipv6Enable?: pulumi.Input<boolean>;
    ipv6LinkLocalAddresses?: pulumi.Input<pulumi.Input<inputs.iosxe.InterfaceTunnelIpv6LinkLocalAddress>[]>;
    /**
     * Set IPv6 Maximum Transmission Unit - Range: `1280`-`9976`
     */
    ipv6Mtu?: pulumi.Input<number>;
    /**
     * Suppress all IPv6 RA
     */
    ipv6NdRaSuppressAll?: pulumi.Input<boolean>;
    /**
     * - Range: `0`-`4294967295`
     */
    name?: pulumi.Input<number>;
    /**
     * Shutdown the selected interface
     */
    shutdown?: pulumi.Input<boolean>;
    /**
     * ip address or host name
     */
    tunnelDestinationIpv4?: pulumi.Input<string>;
    /**
     * over IPv4
     */
    tunnelModeIpsecIpv4?: pulumi.Input<boolean>;
    /**
     * Determine the ipsec policy profile to use.
     */
    tunnelProtectionIpsecProfile?: pulumi.Input<string>;
    /**
     * source of tunnel packets
     */
    tunnelSource?: pulumi.Input<string>;
    /**
     * Enable IP processing without an explicit address
     */
    unnumbered?: pulumi.Input<string>;
    /**
     * Configure forwarding table
     */
    vrfForwarding?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a InterfaceTunnel resource.
 */
export interface InterfaceTunnelArgs {
    /**
     * Set ARP cache timeout - Range: `0`-`2147483`
     */
    arpTimeout?: pulumi.Input<number>;
    /**
     * Use echo adjunct as bfd detection mechanism
     */
    bfdEcho?: pulumi.Input<boolean>;
    /**
     * Enable BFD under the interface
     */
    bfdEnable?: pulumi.Input<boolean>;
    /**
     * - Range: `50`-`9999`
     */
    bfdInterval?: pulumi.Input<number>;
    /**
     * Minimum receive interval capability - Range: `50`-`9999`
     */
    bfdIntervalMinRx?: pulumi.Input<number>;
    /**
     * Multiplier value used to compute holddown - Range: `3`-`50`
     */
    bfdIntervalMultiplier?: pulumi.Input<number>;
    /**
     * The Source IP address to be used for BFD sessions over this interface.
     */
    bfdLocalAddress?: pulumi.Input<string>;
    /**
     * BFD template
     */
    bfdTemplate?: pulumi.Input<string>;
    /**
     * Handling of encapsulated DF bit. - Choices: `clear`, `copy`, `set`
     */
    cryptoIpsecDfBit?: pulumi.Input<string>;
    /**
     * Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
     * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
     * Default value is `all`. - Choices: `all`, `attributes`
     */
    deleteMode?: pulumi.Input<string>;
    /**
     * Interface specific description
     */
    description?: pulumi.Input<string>;
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    /**
     * Specify a destination address for UDP broadcasts
     */
    helperAddresses?: pulumi.Input<pulumi.Input<inputs.iosxe.InterfaceTunnelHelperAddress>[]>;
    ipAccessGroupIn?: pulumi.Input<string>;
    /**
     * inbound packets
     */
    ipAccessGroupInEnable?: pulumi.Input<boolean>;
    ipAccessGroupOut?: pulumi.Input<string>;
    /**
     * outbound packets
     */
    ipAccessGroupOutEnable?: pulumi.Input<boolean>;
    /**
     * Set source interface for relayed messages
     */
    ipDhcpRelaySourceInterface?: pulumi.Input<string>;
    /**
     * Enable proxy ARP
     */
    ipProxyArp?: pulumi.Input<boolean>;
    /**
     * Enable sending ICMP Redirect messages
     */
    ipRedirects?: pulumi.Input<boolean>;
    /**
     * Enable sending ICMP Unreachable messages
     */
    ipUnreachables?: pulumi.Input<boolean>;
    ipv4Address?: pulumi.Input<string>;
    ipv4AddressMask?: pulumi.Input<string>;
    /**
     * Insert default route
     */
    ipv6AddressAutoconfigDefault?: pulumi.Input<boolean>;
    /**
     * Obtain IPv6 address from DHCP server
     */
    ipv6AddressDhcp?: pulumi.Input<boolean>;
    ipv6Addresses?: pulumi.Input<pulumi.Input<inputs.iosxe.InterfaceTunnelIpv6Address>[]>;
    /**
     * Enable IPv6 on interface
     */
    ipv6Enable?: pulumi.Input<boolean>;
    ipv6LinkLocalAddresses?: pulumi.Input<pulumi.Input<inputs.iosxe.InterfaceTunnelIpv6LinkLocalAddress>[]>;
    /**
     * Set IPv6 Maximum Transmission Unit - Range: `1280`-`9976`
     */
    ipv6Mtu?: pulumi.Input<number>;
    /**
     * Suppress all IPv6 RA
     */
    ipv6NdRaSuppressAll?: pulumi.Input<boolean>;
    /**
     * - Range: `0`-`4294967295`
     */
    name?: pulumi.Input<number>;
    /**
     * Shutdown the selected interface
     */
    shutdown?: pulumi.Input<boolean>;
    /**
     * ip address or host name
     */
    tunnelDestinationIpv4?: pulumi.Input<string>;
    /**
     * over IPv4
     */
    tunnelModeIpsecIpv4?: pulumi.Input<boolean>;
    /**
     * Determine the ipsec policy profile to use.
     */
    tunnelProtectionIpsecProfile?: pulumi.Input<string>;
    /**
     * source of tunnel packets
     */
    tunnelSource?: pulumi.Input<string>;
    /**
     * Enable IP processing without an explicit address
     */
    unnumbered?: pulumi.Input<string>;
    /**
     * Configure forwarding table
     */
    vrfForwarding?: pulumi.Input<string>;
}
