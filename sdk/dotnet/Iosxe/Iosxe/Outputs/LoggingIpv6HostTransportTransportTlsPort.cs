// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Iosxe.Iosxe.Outputs
{

    [OutputType]
    public sealed class LoggingIpv6HostTransportTransportTlsPort
    {
        public readonly int PortNumber;
        public readonly string? Profile;

        [OutputConstructor]
        private LoggingIpv6HostTransportTransportTlsPort(
            int portNumber,

            string? profile)
        {
            PortNumber = portNumber;
            Profile = profile;
        }
    }
}
