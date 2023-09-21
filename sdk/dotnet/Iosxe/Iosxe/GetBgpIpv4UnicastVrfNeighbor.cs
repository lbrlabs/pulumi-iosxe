// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Iosxe.Iosxe
{
    public static class GetBgpIpv4UnicastVrfNeighbor
    {
        public static Task<GetBgpIpv4UnicastVrfNeighborResult> InvokeAsync(GetBgpIpv4UnicastVrfNeighborArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetBgpIpv4UnicastVrfNeighborResult>("iosxe:iosxe/getBgpIpv4UnicastVrfNeighbor:getBgpIpv4UnicastVrfNeighbor", args ?? new GetBgpIpv4UnicastVrfNeighborArgs(), options.WithDefaults());

        public static Output<GetBgpIpv4UnicastVrfNeighborResult> Invoke(GetBgpIpv4UnicastVrfNeighborInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetBgpIpv4UnicastVrfNeighborResult>("iosxe:iosxe/getBgpIpv4UnicastVrfNeighbor:getBgpIpv4UnicastVrfNeighbor", args ?? new GetBgpIpv4UnicastVrfNeighborInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetBgpIpv4UnicastVrfNeighborArgs : global::Pulumi.InvokeArgs
    {
        [Input("asn", required: true)]
        public string Asn { get; set; } = null!;

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
        public readonly bool Activate;
        public readonly string Asn;
        public readonly string ClusterId;
        public readonly string Description;
        public readonly string? Device;
        public readonly bool DisableConnectedCheck;
        public readonly bool EbgpMultihop;
        public readonly int EbgpMultihopMaxHop;
        public readonly bool FallOverBfdCheckControlPlaneFailure;
        public readonly bool FallOverBfdMultiHop;
        public readonly bool FallOverBfdSingleHop;
        public readonly bool FallOverBfdStrictMode;
        public readonly string FallOverDefaultRouteMap;
        public readonly string FallOverMaximumMetricRouteMap;
        public readonly string Id;
        public readonly string Ip;
        public readonly string LocalAs;
        public readonly bool LocalAsDualAs;
        public readonly bool LocalAsNoPrepend;
        public readonly bool LocalAsReplaceAs;
        public readonly bool LogNeighborChangesDisable;
        public readonly string Password;
        public readonly int PasswordType;
        public readonly string RemoteAs;
        public readonly ImmutableArray<Outputs.GetBgpIpv4UnicastVrfNeighborRouteMapResult> RouteMaps;
        public readonly bool RouteReflectorClient;
        public readonly string SendCommunity;
        public readonly bool Shutdown;
        public readonly int TimersHoldtime;
        public readonly int TimersKeepaliveInterval;
        public readonly int TimersMinimumNeighborHold;
        public readonly int TtlSecurityHops;
        public readonly string UpdateSourceLoopback;
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