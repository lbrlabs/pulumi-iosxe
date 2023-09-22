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
    public static class GetBgpIpv4UnicastVrfNeighbor
    {
        /// <summary>
        /// This data source can read the BGP IPv4 Unicast VRF Neighbor configuration.
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
        ///     var example = Iosxe.GetBgpIpv4UnicastVrfNeighbor.Invoke(new()
        ///     {
        ///         Asn = "65000",
        ///         Ip = "3.3.3.3",
        ///         Vrf = "VRF1",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetBgpIpv4UnicastVrfNeighborResult> InvokeAsync(GetBgpIpv4UnicastVrfNeighborArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetBgpIpv4UnicastVrfNeighborResult>("iosxe:index/getBgpIpv4UnicastVrfNeighbor:getBgpIpv4UnicastVrfNeighbor", args ?? new GetBgpIpv4UnicastVrfNeighborArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the BGP IPv4 Unicast VRF Neighbor configuration.
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
        ///     var example = Iosxe.GetBgpIpv4UnicastVrfNeighbor.Invoke(new()
        ///     {
        ///         Asn = "65000",
        ///         Ip = "3.3.3.3",
        ///         Vrf = "VRF1",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetBgpIpv4UnicastVrfNeighborResult> Invoke(GetBgpIpv4UnicastVrfNeighborInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetBgpIpv4UnicastVrfNeighborResult>("iosxe:index/getBgpIpv4UnicastVrfNeighbor:getBgpIpv4UnicastVrfNeighbor", args ?? new GetBgpIpv4UnicastVrfNeighborInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetBgpIpv4UnicastVrfNeighborArgs : global::Pulumi.InvokeArgs
    {
        [Input("asn", required: true)]
        public string Asn { get; set; } = null!;

        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public string? Device { get; set; }

        [Input("ip", required: true)]
        public string Ip { get; set; } = null!;

        [Input("vrf", required: true)]
        public string Vrf { get; set; } = null!;

        public GetBgpIpv4UnicastVrfNeighborArgs()
        {
        }
        public static new GetBgpIpv4UnicastVrfNeighborArgs Empty => new GetBgpIpv4UnicastVrfNeighborArgs();
    }

    public sealed class GetBgpIpv4UnicastVrfNeighborInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("asn", required: true)]
        public Input<string> Asn { get; set; } = null!;

        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("ip", required: true)]
        public Input<string> Ip { get; set; } = null!;

        [Input("vrf", required: true)]
        public Input<string> Vrf { get; set; } = null!;

        public GetBgpIpv4UnicastVrfNeighborInvokeArgs()
        {
        }
        public static new GetBgpIpv4UnicastVrfNeighborInvokeArgs Empty => new GetBgpIpv4UnicastVrfNeighborInvokeArgs();
    }


    [OutputType]
    public sealed class GetBgpIpv4UnicastVrfNeighborResult
    {
        /// <summary>
        /// Enable the address family for this neighbor
        /// </summary>
        public readonly bool Activate;
        public readonly string Asn;
        public readonly string ClusterId;
        /// <summary>
        /// Neighbor specific description
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        public readonly string? Device;
        /// <summary>
        /// one-hop away EBGP peer using loopback address
        /// </summary>
        public readonly bool DisableConnectedCheck;
        /// <summary>
        /// Allow EBGP neighbors not on directly connected networks. For single-hop ebgp peers, delete ebgp-multihop directly.
        /// </summary>
        public readonly bool EbgpMultihop;
        public readonly int EbgpMultihopMaxHop;
        /// <summary>
        /// Retrieve control plane dependent failure info from BFD for BGP GR/NSR operation
        /// </summary>
        public readonly bool FallOverBfdCheckControlPlaneFailure;
        /// <summary>
        /// Force BFD multi-hop to detect failure
        /// </summary>
        public readonly bool FallOverBfdMultiHop;
        /// <summary>
        /// Force BFD single-hop to detect failure
        /// </summary>
        public readonly bool FallOverBfdSingleHop;
        /// <summary>
        /// Enable BFD strict-mode
        /// </summary>
        public readonly bool FallOverBfdStrictMode;
        public readonly string FallOverDefaultRouteMap;
        public readonly string FallOverMaximumMetricRouteMap;
        /// <summary>
        /// The path of the retrieved object.
        /// </summary>
        public readonly string Id;
        public readonly string Ip;
        public readonly string LocalAs;
        /// <summary>
        /// Accept either real AS or local AS from the ebgp peer
        /// </summary>
        public readonly bool LocalAsDualAs;
        /// <summary>
        /// Do not prepend local-as to updates from ebgp peers
        /// </summary>
        public readonly bool LocalAsNoPrepend;
        /// <summary>
        /// Replace real AS with local AS in the EBGP updates
        /// </summary>
        public readonly bool LocalAsReplaceAs;
        /// <summary>
        /// disable
        /// </summary>
        public readonly bool LogNeighborChangesDisable;
        public readonly string Password;
        /// <summary>
        /// Encryption type (0 to disable encryption, 7 for proprietary)
        /// </summary>
        public readonly int PasswordType;
        /// <summary>
        /// Specify a BGP peer-group remote-as
        /// </summary>
        public readonly string RemoteAs;
        /// <summary>
        /// Apply route map to neighbor
        /// </summary>
        public readonly ImmutableArray<Outputs.GetBgpIpv4UnicastVrfNeighborRouteMapResult> RouteMaps;
        /// <summary>
        /// Configure a neighbor as Route Reflector client
        /// </summary>
        public readonly bool RouteReflectorClient;
        public readonly string SendCommunity;
        /// <summary>
        /// Administratively shut down this neighbor
        /// </summary>
        public readonly bool Shutdown;
        public readonly int TimersHoldtime;
        public readonly int TimersKeepaliveInterval;
        public readonly int TimersMinimumNeighborHold;
        /// <summary>
        /// IP hops
        /// </summary>
        public readonly int TtlSecurityHops;
        /// <summary>
        /// Loopback interface
        /// </summary>
        public readonly string UpdateSourceLoopback;
        /// <summary>
        /// Set the BGP version to match a neighbor
        /// </summary>
        public readonly int Version;
        public readonly string Vrf;

        [OutputConstructor]
        private GetBgpIpv4UnicastVrfNeighborResult(
            bool activate,

            string asn,

            string clusterId,

            string description,

            string? device,

            bool disableConnectedCheck,

            bool ebgpMultihop,

            int ebgpMultihopMaxHop,

            bool fallOverBfdCheckControlPlaneFailure,

            bool fallOverBfdMultiHop,

            bool fallOverBfdSingleHop,

            bool fallOverBfdStrictMode,

            string fallOverDefaultRouteMap,

            string fallOverMaximumMetricRouteMap,

            string id,

            string ip,

            string localAs,

            bool localAsDualAs,

            bool localAsNoPrepend,

            bool localAsReplaceAs,

            bool logNeighborChangesDisable,

            string password,

            int passwordType,

            string remoteAs,

            ImmutableArray<Outputs.GetBgpIpv4UnicastVrfNeighborRouteMapResult> routeMaps,

            bool routeReflectorClient,

            string sendCommunity,

            bool shutdown,

            int timersHoldtime,

            int timersKeepaliveInterval,

            int timersMinimumNeighborHold,

            int ttlSecurityHops,

            string updateSourceLoopback,

            int version,

            string vrf)
        {
            Activate = activate;
            Asn = asn;
            ClusterId = clusterId;
            Description = description;
            Device = device;
            DisableConnectedCheck = disableConnectedCheck;
            EbgpMultihop = ebgpMultihop;
            EbgpMultihopMaxHop = ebgpMultihopMaxHop;
            FallOverBfdCheckControlPlaneFailure = fallOverBfdCheckControlPlaneFailure;
            FallOverBfdMultiHop = fallOverBfdMultiHop;
            FallOverBfdSingleHop = fallOverBfdSingleHop;
            FallOverBfdStrictMode = fallOverBfdStrictMode;
            FallOverDefaultRouteMap = fallOverDefaultRouteMap;
            FallOverMaximumMetricRouteMap = fallOverMaximumMetricRouteMap;
            Id = id;
            Ip = ip;
            LocalAs = localAs;
            LocalAsDualAs = localAsDualAs;
            LocalAsNoPrepend = localAsNoPrepend;
            LocalAsReplaceAs = localAsReplaceAs;
            LogNeighborChangesDisable = logNeighborChangesDisable;
            Password = password;
            PasswordType = passwordType;
            RemoteAs = remoteAs;
            RouteMaps = routeMaps;
            RouteReflectorClient = routeReflectorClient;
            SendCommunity = sendCommunity;
            Shutdown = shutdown;
            TimersHoldtime = timersHoldtime;
            TimersKeepaliveInterval = timersKeepaliveInterval;
            TimersMinimumNeighborHold = timersMinimumNeighborHold;
            TtlSecurityHops = ttlSecurityHops;
            UpdateSourceLoopback = updateSourceLoopback;
            Version = version;
            Vrf = vrf;
        }
    }
}