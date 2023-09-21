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
    public static class GetBgpL2vpnEvpnNeighbor
    {
        public static Task<GetBgpL2vpnEvpnNeighborResult> InvokeAsync(GetBgpL2vpnEvpnNeighborArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetBgpL2vpnEvpnNeighborResult>("iosxe:iosxe/getBgpL2vpnEvpnNeighbor:getBgpL2vpnEvpnNeighbor", args ?? new GetBgpL2vpnEvpnNeighborArgs(), options.WithDefaults());

        public static Output<GetBgpL2vpnEvpnNeighborResult> Invoke(GetBgpL2vpnEvpnNeighborInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetBgpL2vpnEvpnNeighborResult>("iosxe:iosxe/getBgpL2vpnEvpnNeighbor:getBgpL2vpnEvpnNeighbor", args ?? new GetBgpL2vpnEvpnNeighborInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetBgpL2vpnEvpnNeighborArgs : global::Pulumi.InvokeArgs
    {
        [Input("asn", required: true)]
        public string Asn { get; set; } = null!;

        [Input("device")]
        public string? Device { get; set; }

        [Input("ip", required: true)]
        public string Ip { get; set; } = null!;

        public GetBgpL2vpnEvpnNeighborArgs()
        {
        }
        public static new GetBgpL2vpnEvpnNeighborArgs Empty => new GetBgpL2vpnEvpnNeighborArgs();
    }

    public sealed class GetBgpL2vpnEvpnNeighborInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("asn", required: true)]
        public Input<string> Asn { get; set; } = null!;

        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("ip", required: true)]
        public Input<string> Ip { get; set; } = null!;

        public GetBgpL2vpnEvpnNeighborInvokeArgs()
        {
        }
        public static new GetBgpL2vpnEvpnNeighborInvokeArgs Empty => new GetBgpL2vpnEvpnNeighborInvokeArgs();
    }


    [OutputType]
    public sealed class GetBgpL2vpnEvpnNeighborResult
    {
        public readonly bool Activate;
        public readonly string Asn;
        public readonly string? Device;
        public readonly string Id;
        public readonly string Ip;
        public readonly bool RouteReflectorClient;
        public readonly string SendCommunity;

        [OutputConstructor]
        private GetBgpL2vpnEvpnNeighborResult(
            bool activate,

            string asn,

            string? device,

            string id,

            string ip,

            bool routeReflectorClient,

            string sendCommunity)
        {
            Activate = activate;
            Asn = asn;
            Device = device;
            Id = id;
            Ip = ip;
            RouteReflectorClient = routeReflectorClient;
            SendCommunity = sendCommunity;
        }
    }
}
