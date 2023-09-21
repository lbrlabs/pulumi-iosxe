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
    public static class GetLoggingIpv4HostTransport
    {
        public static Task<GetLoggingIpv4HostTransportResult> InvokeAsync(GetLoggingIpv4HostTransportArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLoggingIpv4HostTransportResult>("iosxe:iosxe/getLoggingIpv4HostTransport:getLoggingIpv4HostTransport", args ?? new GetLoggingIpv4HostTransportArgs(), options.WithDefaults());

        public static Output<GetLoggingIpv4HostTransportResult> Invoke(GetLoggingIpv4HostTransportInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLoggingIpv4HostTransportResult>("iosxe:iosxe/getLoggingIpv4HostTransport:getLoggingIpv4HostTransport", args ?? new GetLoggingIpv4HostTransportInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLoggingIpv4HostTransportArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public string? Device { get; set; }

        [Input("ipv4Host", required: true)]
        public string Ipv4Host { get; set; } = null!;

        public GetLoggingIpv4HostTransportArgs()
        {
        }
        public static new GetLoggingIpv4HostTransportArgs Empty => new GetLoggingIpv4HostTransportArgs();
    }

    public sealed class GetLoggingIpv4HostTransportInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("ipv4Host", required: true)]
        public Input<string> Ipv4Host { get; set; } = null!;

        public GetLoggingIpv4HostTransportInvokeArgs()
        {
        }
        public static new GetLoggingIpv4HostTransportInvokeArgs Empty => new GetLoggingIpv4HostTransportInvokeArgs();
    }


    [OutputType]
    public sealed class GetLoggingIpv4HostTransportResult
    {
        public readonly string? Device;
        public readonly string Id;
        public readonly string Ipv4Host;
        public readonly ImmutableArray<Outputs.GetLoggingIpv4HostTransportTransportTcpPortResult> TransportTcpPorts;
        public readonly ImmutableArray<Outputs.GetLoggingIpv4HostTransportTransportTlsPortResult> TransportTlsPorts;
        public readonly ImmutableArray<Outputs.GetLoggingIpv4HostTransportTransportUdpPortResult> TransportUdpPorts;

        [OutputConstructor]
        private GetLoggingIpv4HostTransportResult(
            string? device,

            string id,

            string ipv4Host,

            ImmutableArray<Outputs.GetLoggingIpv4HostTransportTransportTcpPortResult> transportTcpPorts,

            ImmutableArray<Outputs.GetLoggingIpv4HostTransportTransportTlsPortResult> transportTlsPorts,

            ImmutableArray<Outputs.GetLoggingIpv4HostTransportTransportUdpPortResult> transportUdpPorts)
        {
            Device = device;
            Id = id;
            Ipv4Host = ipv4Host;
            TransportTcpPorts = transportTcpPorts;
            TransportTlsPorts = transportTlsPorts;
            TransportUdpPorts = transportUdpPorts;
        }
    }
}