// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Iosxe.Iosxe.Inputs
{

    public sealed class LoggingIpv6HostVrfTransportTransportTcpPortArgs : global::Pulumi.ResourceArgs
    {
        [Input("portNumber", required: true)]
        public Input<int> PortNumber { get; set; } = null!;

        public LoggingIpv6HostVrfTransportTransportTcpPortArgs()
        {
        }
        public static new LoggingIpv6HostVrfTransportTransportTcpPortArgs Empty => new LoggingIpv6HostVrfTransportTransportTcpPortArgs();
    }
}
