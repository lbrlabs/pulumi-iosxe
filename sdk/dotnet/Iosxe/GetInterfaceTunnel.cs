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
    public static class GetInterfaceTunnel
    {
        /// <summary>
        /// This data source can read the Interface Tunnel configuration.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Iosxe = Pulumi.Iosxe;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Iosxe.GetInterfaceTunnel.Invoke(new()
        ///     {
        ///         Name = 90,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetInterfaceTunnelResult> InvokeAsync(GetInterfaceTunnelArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInterfaceTunnelResult>("iosxe:index/getInterfaceTunnel:getInterfaceTunnel", args ?? new GetInterfaceTunnelArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Interface Tunnel configuration.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Iosxe = Pulumi.Iosxe;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Iosxe.GetInterfaceTunnel.Invoke(new()
        ///     {
        ///         Name = 90,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetInterfaceTunnelResult> Invoke(GetInterfaceTunnelInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInterfaceTunnelResult>("iosxe:index/getInterfaceTunnel:getInterfaceTunnel", args ?? new GetInterfaceTunnelInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInterfaceTunnelArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public string? Device { get; set; }

        [Input("name", required: true)]
        public int Name { get; set; }

        public GetInterfaceTunnelArgs()
        {
        }
        public static new GetInterfaceTunnelArgs Empty => new GetInterfaceTunnelArgs();
    }

    public sealed class GetInterfaceTunnelInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("name", required: true)]
        public Input<int> Name { get; set; } = null!;

        public GetInterfaceTunnelInvokeArgs()
        {
        }
        public static new GetInterfaceTunnelInvokeArgs Empty => new GetInterfaceTunnelInvokeArgs();
    }


    [OutputType]
    public sealed class GetInterfaceTunnelResult
    {
        /// <summary>
        /// Set ARP cache timeout
        /// </summary>
        public readonly int ArpTimeout;
        /// <summary>
        /// Use echo adjunct as bfd detection mechanism
        /// </summary>
        public readonly bool BfdEcho;
        /// <summary>
        /// Enable BFD under the interface
        /// </summary>
        public readonly bool BfdEnable;
        public readonly int BfdInterval;
        /// <summary>
        /// Minimum receive interval capability
        /// </summary>
        public readonly int BfdIntervalMinRx;
        /// <summary>
        /// Multiplier value used to compute holddown
        /// </summary>
        public readonly int BfdIntervalMultiplier;
        /// <summary>
        /// The Source IP address to be used for BFD sessions over this interface.
        /// </summary>
        public readonly string BfdLocalAddress;
        /// <summary>
        /// BFD template
        /// </summary>
        public readonly string BfdTemplate;
        /// <summary>
        /// Handling of encapsulated DF bit.
        /// </summary>
        public readonly string CryptoIpsecDfBit;
        /// <summary>
        /// Interface specific description
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        public readonly string? Device;
        /// <summary>
        /// Specify a destination address for UDP broadcasts
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInterfaceTunnelHelperAddressResult> HelperAddresses;
        /// <summary>
        /// The path of the retrieved object.
        /// </summary>
        public readonly string Id;
        public readonly string IpAccessGroupIn;
        /// <summary>
        /// inbound packets
        /// </summary>
        public readonly bool IpAccessGroupInEnable;
        public readonly string IpAccessGroupOut;
        /// <summary>
        /// outbound packets
        /// </summary>
        public readonly bool IpAccessGroupOutEnable;
        /// <summary>
        /// Set source interface for relayed messages
        /// </summary>
        public readonly string IpDhcpRelaySourceInterface;
        /// <summary>
        /// Enable proxy ARP
        /// </summary>
        public readonly bool IpProxyArp;
        /// <summary>
        /// Enable sending ICMP Redirect messages
        /// </summary>
        public readonly bool IpRedirects;
        /// <summary>
        /// Enable sending ICMP Unreachable messages
        /// </summary>
        public readonly bool IpUnreachables;
        public readonly string Ipv4Address;
        public readonly string Ipv4AddressMask;
        /// <summary>
        /// Insert default route
        /// </summary>
        public readonly bool Ipv6AddressAutoconfigDefault;
        /// <summary>
        /// Obtain IPv6 address from DHCP server
        /// </summary>
        public readonly bool Ipv6AddressDhcp;
        public readonly ImmutableArray<Outputs.GetInterfaceTunnelIpv6AddressResult> Ipv6Addresses;
        /// <summary>
        /// Enable IPv6 on interface
        /// </summary>
        public readonly bool Ipv6Enable;
        public readonly ImmutableArray<Outputs.GetInterfaceTunnelIpv6LinkLocalAddressResult> Ipv6LinkLocalAddresses;
        /// <summary>
        /// Set IPv6 Maximum Transmission Unit
        /// </summary>
        public readonly int Ipv6Mtu;
        /// <summary>
        /// Suppress all IPv6 RA
        /// </summary>
        public readonly bool Ipv6NdRaSuppressAll;
        public readonly int Name;
        /// <summary>
        /// Shutdown the selected interface
        /// </summary>
        public readonly bool Shutdown;
        /// <summary>
        /// ip address or host name
        /// </summary>
        public readonly string TunnelDestinationIpv4;
        /// <summary>
        /// over IPv4
        /// </summary>
        public readonly bool TunnelModeIpsecIpv4;
        /// <summary>
        /// Determine the ipsec policy profile to use.
        /// </summary>
        public readonly string TunnelProtectionIpsecProfile;
        /// <summary>
        /// source of tunnel packets
        /// </summary>
        public readonly string TunnelSource;
        /// <summary>
        /// Enable IP processing without an explicit address
        /// </summary>
        public readonly string Unnumbered;
        /// <summary>
        /// Configure forwarding table
        /// </summary>
        public readonly string VrfForwarding;

        [OutputConstructor]
        private GetInterfaceTunnelResult(
            int arpTimeout,

            bool bfdEcho,

            bool bfdEnable,

            int bfdInterval,

            int bfdIntervalMinRx,

            int bfdIntervalMultiplier,

            string bfdLocalAddress,

            string bfdTemplate,

            string cryptoIpsecDfBit,

            string description,

            string? device,

            ImmutableArray<Outputs.GetInterfaceTunnelHelperAddressResult> helperAddresses,

            string id,

            string ipAccessGroupIn,

            bool ipAccessGroupInEnable,

            string ipAccessGroupOut,

            bool ipAccessGroupOutEnable,

            string ipDhcpRelaySourceInterface,

            bool ipProxyArp,

            bool ipRedirects,

            bool ipUnreachables,

            string ipv4Address,

            string ipv4AddressMask,

            bool ipv6AddressAutoconfigDefault,

            bool ipv6AddressDhcp,

            ImmutableArray<Outputs.GetInterfaceTunnelIpv6AddressResult> ipv6Addresses,

            bool ipv6Enable,

            ImmutableArray<Outputs.GetInterfaceTunnelIpv6LinkLocalAddressResult> ipv6LinkLocalAddresses,

            int ipv6Mtu,

            bool ipv6NdRaSuppressAll,

            int name,

            bool shutdown,

            string tunnelDestinationIpv4,

            bool tunnelModeIpsecIpv4,

            string tunnelProtectionIpsecProfile,

            string tunnelSource,

            string unnumbered,

            string vrfForwarding)
        {
            ArpTimeout = arpTimeout;
            BfdEcho = bfdEcho;
            BfdEnable = bfdEnable;
            BfdInterval = bfdInterval;
            BfdIntervalMinRx = bfdIntervalMinRx;
            BfdIntervalMultiplier = bfdIntervalMultiplier;
            BfdLocalAddress = bfdLocalAddress;
            BfdTemplate = bfdTemplate;
            CryptoIpsecDfBit = cryptoIpsecDfBit;
            Description = description;
            Device = device;
            HelperAddresses = helperAddresses;
            Id = id;
            IpAccessGroupIn = ipAccessGroupIn;
            IpAccessGroupInEnable = ipAccessGroupInEnable;
            IpAccessGroupOut = ipAccessGroupOut;
            IpAccessGroupOutEnable = ipAccessGroupOutEnable;
            IpDhcpRelaySourceInterface = ipDhcpRelaySourceInterface;
            IpProxyArp = ipProxyArp;
            IpRedirects = ipRedirects;
            IpUnreachables = ipUnreachables;
            Ipv4Address = ipv4Address;
            Ipv4AddressMask = ipv4AddressMask;
            Ipv6AddressAutoconfigDefault = ipv6AddressAutoconfigDefault;
            Ipv6AddressDhcp = ipv6AddressDhcp;
            Ipv6Addresses = ipv6Addresses;
            Ipv6Enable = ipv6Enable;
            Ipv6LinkLocalAddresses = ipv6LinkLocalAddresses;
            Ipv6Mtu = ipv6Mtu;
            Ipv6NdRaSuppressAll = ipv6NdRaSuppressAll;
            Name = name;
            Shutdown = shutdown;
            TunnelDestinationIpv4 = tunnelDestinationIpv4;
            TunnelModeIpsecIpv4 = tunnelModeIpsecIpv4;
            TunnelProtectionIpsecProfile = tunnelProtectionIpsecProfile;
            TunnelSource = tunnelSource;
            Unnumbered = unnumbered;
            VrfForwarding = vrfForwarding;
        }
    }
}