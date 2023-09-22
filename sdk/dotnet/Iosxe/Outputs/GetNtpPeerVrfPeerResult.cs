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
    public sealed class GetNtpPeerVrfPeerResult
    {
        public readonly string IpAddress;
        /// <summary>
        /// Configure peer authentication key
        /// </summary>
        public readonly int Key;
        /// <summary>
        /// Prefer this peer when possible
        /// </summary>
        public readonly bool Prefer;
        /// <summary>
        /// Configure NTP version
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetNtpPeerVrfPeerResult(
            string ipAddress,

            int key,

            bool prefer,

            int version)
        {
            IpAddress = ipAddress;
            Key = key;
            Prefer = prefer;
            Version = version;
        }
    }
}