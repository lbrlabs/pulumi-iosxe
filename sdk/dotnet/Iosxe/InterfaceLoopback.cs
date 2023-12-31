// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Iosxe
{
    /// <summary>
    /// This resource can manage the Interface Loopback configuration.
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import iosxe:index/interfaceLoopback:InterfaceLoopback example "Cisco-IOS-XE-native:native/interface/Loopback=100"
    /// ```
    /// </summary>
    [IosxeResourceType("iosxe:index/interfaceLoopback:InterfaceLoopback")]
    public partial class InterfaceLoopback : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Set ARP cache timeout - Range: `0`-`2147483`
        /// </summary>
        [Output("arpTimeout")]
        public Output<int?> ArpTimeout { get; private set; } = null!;

        /// <summary>
        /// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
        /// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
        /// Default value is `all`. - Choices: `all`, `attributes`
        /// </summary>
        [Output("deleteMode")]
        public Output<string?> DeleteMode { get; private set; } = null!;

        /// <summary>
        /// Interface specific description
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Output("device")]
        public Output<string?> Device { get; private set; } = null!;

        [Output("ipAccessGroupIn")]
        public Output<string?> IpAccessGroupIn { get; private set; } = null!;

        /// <summary>
        /// inbound packets
        /// </summary>
        [Output("ipAccessGroupInEnable")]
        public Output<bool?> IpAccessGroupInEnable { get; private set; } = null!;

        [Output("ipAccessGroupOut")]
        public Output<string?> IpAccessGroupOut { get; private set; } = null!;

        /// <summary>
        /// outbound packets
        /// </summary>
        [Output("ipAccessGroupOutEnable")]
        public Output<bool?> IpAccessGroupOutEnable { get; private set; } = null!;

        /// <summary>
        /// Enable proxy ARP
        /// </summary>
        [Output("ipProxyArp")]
        public Output<bool?> IpProxyArp { get; private set; } = null!;

        /// <summary>
        /// Enable sending ICMP Redirect messages
        /// </summary>
        [Output("ipRedirects")]
        public Output<bool?> IpRedirects { get; private set; } = null!;

        /// <summary>
        /// Enable sending ICMP Unreachable messages
        /// </summary>
        [Output("ipUnreachables")]
        public Output<bool?> IpUnreachables { get; private set; } = null!;

        [Output("ipv4Address")]
        public Output<string?> Ipv4Address { get; private set; } = null!;

        [Output("ipv4AddressMask")]
        public Output<string?> Ipv4AddressMask { get; private set; } = null!;

        /// <summary>
        /// Insert default route
        /// </summary>
        [Output("ipv6AddressAutoconfigDefault")]
        public Output<bool?> Ipv6AddressAutoconfigDefault { get; private set; } = null!;

        /// <summary>
        /// Obtain IPv6 address from DHCP server
        /// </summary>
        [Output("ipv6AddressDhcp")]
        public Output<bool?> Ipv6AddressDhcp { get; private set; } = null!;

        [Output("ipv6Addresses")]
        public Output<ImmutableArray<Outputs.InterfaceLoopbackIpv6Address>> Ipv6Addresses { get; private set; } = null!;

        /// <summary>
        /// Enable IPv6 on interface
        /// </summary>
        [Output("ipv6Enable")]
        public Output<bool?> Ipv6Enable { get; private set; } = null!;

        [Output("ipv6LinkLocalAddresses")]
        public Output<ImmutableArray<Outputs.InterfaceLoopbackIpv6LinkLocalAddress>> Ipv6LinkLocalAddresses { get; private set; } = null!;

        /// <summary>
        /// Set IPv6 Maximum Transmission Unit - Range: `1280`-`9976`
        /// </summary>
        [Output("ipv6Mtu")]
        public Output<int?> Ipv6Mtu { get; private set; } = null!;

        /// <summary>
        /// Suppress all IPv6 RA
        /// </summary>
        [Output("ipv6NdRaSuppressAll")]
        public Output<bool?> Ipv6NdRaSuppressAll { get; private set; } = null!;

        /// <summary>
        /// - Range: `0`-`2147483647`
        /// </summary>
        [Output("name")]
        public Output<int> Name { get; private set; } = null!;

        /// <summary>
        /// Shutdown the selected interface
        /// </summary>
        [Output("shutdown")]
        public Output<bool?> Shutdown { get; private set; } = null!;

        /// <summary>
        /// Configure forwarding table
        /// </summary>
        [Output("vrfForwarding")]
        public Output<string?> VrfForwarding { get; private set; } = null!;


        /// <summary>
        /// Create a InterfaceLoopback resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InterfaceLoopback(string name, InterfaceLoopbackArgs? args = null, CustomResourceOptions? options = null)
            : base("iosxe:index/interfaceLoopback:InterfaceLoopback", name, args ?? new InterfaceLoopbackArgs(), MakeResourceOptions(options, ""))
        {
        }

        private InterfaceLoopback(string name, Input<string> id, InterfaceLoopbackState? state = null, CustomResourceOptions? options = null)
            : base("iosxe:index/interfaceLoopback:InterfaceLoopback", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing InterfaceLoopback resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static InterfaceLoopback Get(string name, Input<string> id, InterfaceLoopbackState? state = null, CustomResourceOptions? options = null)
        {
            return new InterfaceLoopback(name, id, state, options);
        }
    }

    public sealed class InterfaceLoopbackArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set ARP cache timeout - Range: `0`-`2147483`
        /// </summary>
        [Input("arpTimeout")]
        public Input<int>? ArpTimeout { get; set; }

        /// <summary>
        /// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
        /// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
        /// Default value is `all`. - Choices: `all`, `attributes`
        /// </summary>
        [Input("deleteMode")]
        public Input<string>? DeleteMode { get; set; }

        /// <summary>
        /// Interface specific description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("ipAccessGroupIn")]
        public Input<string>? IpAccessGroupIn { get; set; }

        /// <summary>
        /// inbound packets
        /// </summary>
        [Input("ipAccessGroupInEnable")]
        public Input<bool>? IpAccessGroupInEnable { get; set; }

        [Input("ipAccessGroupOut")]
        public Input<string>? IpAccessGroupOut { get; set; }

        /// <summary>
        /// outbound packets
        /// </summary>
        [Input("ipAccessGroupOutEnable")]
        public Input<bool>? IpAccessGroupOutEnable { get; set; }

        /// <summary>
        /// Enable proxy ARP
        /// </summary>
        [Input("ipProxyArp")]
        public Input<bool>? IpProxyArp { get; set; }

        /// <summary>
        /// Enable sending ICMP Redirect messages
        /// </summary>
        [Input("ipRedirects")]
        public Input<bool>? IpRedirects { get; set; }

        /// <summary>
        /// Enable sending ICMP Unreachable messages
        /// </summary>
        [Input("ipUnreachables")]
        public Input<bool>? IpUnreachables { get; set; }

        [Input("ipv4Address")]
        public Input<string>? Ipv4Address { get; set; }

        [Input("ipv4AddressMask")]
        public Input<string>? Ipv4AddressMask { get; set; }

        /// <summary>
        /// Insert default route
        /// </summary>
        [Input("ipv6AddressAutoconfigDefault")]
        public Input<bool>? Ipv6AddressAutoconfigDefault { get; set; }

        /// <summary>
        /// Obtain IPv6 address from DHCP server
        /// </summary>
        [Input("ipv6AddressDhcp")]
        public Input<bool>? Ipv6AddressDhcp { get; set; }

        [Input("ipv6Addresses")]
        private InputList<Inputs.InterfaceLoopbackIpv6AddressArgs>? _ipv6Addresses;
        public InputList<Inputs.InterfaceLoopbackIpv6AddressArgs> Ipv6Addresses
        {
            get => _ipv6Addresses ?? (_ipv6Addresses = new InputList<Inputs.InterfaceLoopbackIpv6AddressArgs>());
            set => _ipv6Addresses = value;
        }

        /// <summary>
        /// Enable IPv6 on interface
        /// </summary>
        [Input("ipv6Enable")]
        public Input<bool>? Ipv6Enable { get; set; }

        [Input("ipv6LinkLocalAddresses")]
        private InputList<Inputs.InterfaceLoopbackIpv6LinkLocalAddressArgs>? _ipv6LinkLocalAddresses;
        public InputList<Inputs.InterfaceLoopbackIpv6LinkLocalAddressArgs> Ipv6LinkLocalAddresses
        {
            get => _ipv6LinkLocalAddresses ?? (_ipv6LinkLocalAddresses = new InputList<Inputs.InterfaceLoopbackIpv6LinkLocalAddressArgs>());
            set => _ipv6LinkLocalAddresses = value;
        }

        /// <summary>
        /// Set IPv6 Maximum Transmission Unit - Range: `1280`-`9976`
        /// </summary>
        [Input("ipv6Mtu")]
        public Input<int>? Ipv6Mtu { get; set; }

        /// <summary>
        /// Suppress all IPv6 RA
        /// </summary>
        [Input("ipv6NdRaSuppressAll")]
        public Input<bool>? Ipv6NdRaSuppressAll { get; set; }

        /// <summary>
        /// - Range: `0`-`2147483647`
        /// </summary>
        [Input("name")]
        public Input<int>? Name { get; set; }

        /// <summary>
        /// Shutdown the selected interface
        /// </summary>
        [Input("shutdown")]
        public Input<bool>? Shutdown { get; set; }

        /// <summary>
        /// Configure forwarding table
        /// </summary>
        [Input("vrfForwarding")]
        public Input<string>? VrfForwarding { get; set; }

        public InterfaceLoopbackArgs()
        {
        }
        public static new InterfaceLoopbackArgs Empty => new InterfaceLoopbackArgs();
    }

    public sealed class InterfaceLoopbackState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set ARP cache timeout - Range: `0`-`2147483`
        /// </summary>
        [Input("arpTimeout")]
        public Input<int>? ArpTimeout { get; set; }

        /// <summary>
        /// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
        /// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
        /// Default value is `all`. - Choices: `all`, `attributes`
        /// </summary>
        [Input("deleteMode")]
        public Input<string>? DeleteMode { get; set; }

        /// <summary>
        /// Interface specific description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("ipAccessGroupIn")]
        public Input<string>? IpAccessGroupIn { get; set; }

        /// <summary>
        /// inbound packets
        /// </summary>
        [Input("ipAccessGroupInEnable")]
        public Input<bool>? IpAccessGroupInEnable { get; set; }

        [Input("ipAccessGroupOut")]
        public Input<string>? IpAccessGroupOut { get; set; }

        /// <summary>
        /// outbound packets
        /// </summary>
        [Input("ipAccessGroupOutEnable")]
        public Input<bool>? IpAccessGroupOutEnable { get; set; }

        /// <summary>
        /// Enable proxy ARP
        /// </summary>
        [Input("ipProxyArp")]
        public Input<bool>? IpProxyArp { get; set; }

        /// <summary>
        /// Enable sending ICMP Redirect messages
        /// </summary>
        [Input("ipRedirects")]
        public Input<bool>? IpRedirects { get; set; }

        /// <summary>
        /// Enable sending ICMP Unreachable messages
        /// </summary>
        [Input("ipUnreachables")]
        public Input<bool>? IpUnreachables { get; set; }

        [Input("ipv4Address")]
        public Input<string>? Ipv4Address { get; set; }

        [Input("ipv4AddressMask")]
        public Input<string>? Ipv4AddressMask { get; set; }

        /// <summary>
        /// Insert default route
        /// </summary>
        [Input("ipv6AddressAutoconfigDefault")]
        public Input<bool>? Ipv6AddressAutoconfigDefault { get; set; }

        /// <summary>
        /// Obtain IPv6 address from DHCP server
        /// </summary>
        [Input("ipv6AddressDhcp")]
        public Input<bool>? Ipv6AddressDhcp { get; set; }

        [Input("ipv6Addresses")]
        private InputList<Inputs.InterfaceLoopbackIpv6AddressGetArgs>? _ipv6Addresses;
        public InputList<Inputs.InterfaceLoopbackIpv6AddressGetArgs> Ipv6Addresses
        {
            get => _ipv6Addresses ?? (_ipv6Addresses = new InputList<Inputs.InterfaceLoopbackIpv6AddressGetArgs>());
            set => _ipv6Addresses = value;
        }

        /// <summary>
        /// Enable IPv6 on interface
        /// </summary>
        [Input("ipv6Enable")]
        public Input<bool>? Ipv6Enable { get; set; }

        [Input("ipv6LinkLocalAddresses")]
        private InputList<Inputs.InterfaceLoopbackIpv6LinkLocalAddressGetArgs>? _ipv6LinkLocalAddresses;
        public InputList<Inputs.InterfaceLoopbackIpv6LinkLocalAddressGetArgs> Ipv6LinkLocalAddresses
        {
            get => _ipv6LinkLocalAddresses ?? (_ipv6LinkLocalAddresses = new InputList<Inputs.InterfaceLoopbackIpv6LinkLocalAddressGetArgs>());
            set => _ipv6LinkLocalAddresses = value;
        }

        /// <summary>
        /// Set IPv6 Maximum Transmission Unit - Range: `1280`-`9976`
        /// </summary>
        [Input("ipv6Mtu")]
        public Input<int>? Ipv6Mtu { get; set; }

        /// <summary>
        /// Suppress all IPv6 RA
        /// </summary>
        [Input("ipv6NdRaSuppressAll")]
        public Input<bool>? Ipv6NdRaSuppressAll { get; set; }

        /// <summary>
        /// - Range: `0`-`2147483647`
        /// </summary>
        [Input("name")]
        public Input<int>? Name { get; set; }

        /// <summary>
        /// Shutdown the selected interface
        /// </summary>
        [Input("shutdown")]
        public Input<bool>? Shutdown { get; set; }

        /// <summary>
        /// Configure forwarding table
        /// </summary>
        [Input("vrfForwarding")]
        public Input<string>? VrfForwarding { get; set; }

        public InterfaceLoopbackState()
        {
        }
        public static new InterfaceLoopbackState Empty => new InterfaceLoopbackState();
    }
}
