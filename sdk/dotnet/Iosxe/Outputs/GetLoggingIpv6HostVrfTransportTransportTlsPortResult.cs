// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Iosxe.Outputs
{

    [OutputType]
    public sealed class GetLoggingIpv6HostVrfTransportTransportTlsPortResult
    {
        /// <summary>
        /// Specify the TLS port number (default=6514)
        /// </summary>
        public readonly int PortNumber;
        /// <summary>
        /// Specify the TLS profile
        /// </summary>
        public readonly string Profile;

        [OutputConstructor]
        private GetLoggingIpv6HostVrfTransportTransportTlsPortResult(
            int portNumber,

            string profile)
        {
            PortNumber = portNumber;
            Profile = profile;
        }
    }
}
