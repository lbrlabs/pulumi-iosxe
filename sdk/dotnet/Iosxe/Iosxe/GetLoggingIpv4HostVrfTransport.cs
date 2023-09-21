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
    public static class GetLoggingIpv4HostVrfTransport
    {
        public static Task<GetLoggingIpv4HostVrfTransportResult> InvokeAsync(GetLoggingIpv4HostVrfTransportArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLoggingIpv4HostVrfTransportResult>("iosxe:iosxe/getLoggingIpv4HostVrfTransport:getLoggingIpv4HostVrfTransport", args ?? new GetLoggingIpv4HostVrfTransportArgs(), options.WithDefaults());

        public static Output<GetLoggingIpv4HostVrfTransportResult> Invoke(GetLoggingIpv4HostVrfTransportInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLoggingIpv4HostVrfTransportResult>("iosxe:iosxe/getLoggingIpv4HostVrfTransport:getLoggingIpv4HostVrfTransport", args ?? new GetLoggingIpv4HostVrfTransportInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLoggingIpv4HostVrfTransportArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public string? Device { get; set; }

        [Input("ipv4Host", required: true)]
        public string Ipv4Host { get; set; } = null!;

        [Input("vrf", required: true)]
        public string Vrf { get; set; } = null!;

        public GetLoggingIpv4HostVrfTransportArgs()
        {
        }
        public static new GetLoggingIpv4HostVrfTransportArgs Empty => new GetLoggingIpv4HostVrfTransportArgs();
    }

    public sealed class GetLoggingIpv4HostVrfTransportInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("ipv4Host", required: true)]
        public Input<string> Ipv4Host { get; set; } = null!;

        [Input("vrf", required: true)]
        public Input<string> Vrf { get; set; } = null!;

        public GetLoggingIpv4HostVrfTransportInvokeArgs()
        {
        }
        public static new GetLoggingIpv4HostVrfTransportInvokeArgs Empty => new GetLoggingIpv4HostVrfTransportInvokeArgs();
    }


    [OutputType]
    public sealed class GetLoggingIpv4HostVrfTransportResult
    {
        public readonly string? Device;
        public readonly string Id;
        public readonly string Ipv4Host;
        public readonly ImmutableArray<Outputs.GetLoggingIpv4HostVrfTransportTransportTcpPortResult> TransportTcpPorts;
        public readonly ImmutableArray<Outputs.GetLoggingIpv4HostVrfTransportTransportTlsPortResult> TransportTlsPorts;
        public readonly ImmutableArray<Outputs.GetLoggingIpv4HostVrfTransportTransportUdpPortResult> TransportUdpPorts;
        public readonly string Vrf;

        [OutputConstructor]
        private GetLoggingIpv4HostVrfTransportResult(
            string? device,

            string id,

            string ipv4Host,

            ImmutableArray<Outputs.GetLoggingIpv4HostVrfTransportTransportTcpPortResult> transportTcpPorts,

            ImmutableArray<Outputs.GetLoggingIpv4HostVrfTransportTransportTlsPortResult> transportTlsPorts,

            ImmutableArray<Outputs.GetLoggingIpv4HostVrfTransportTransportUdpPortResult> transportUdpPorts,

            string vrf)
        {
            Device = device;
            Id = id;
            Ipv4Host = ipv4Host;
            TransportTcpPorts = transportTcpPorts;
            TransportTlsPorts = transportTlsPorts;
            TransportUdpPorts = transportUdpPorts;
            Vrf = vrf;
        }
    }
}