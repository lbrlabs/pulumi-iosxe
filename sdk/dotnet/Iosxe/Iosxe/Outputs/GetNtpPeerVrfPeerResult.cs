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
    public sealed class GetNtpPeerVrfPeerResult
    {
        public readonly string IpAddress;
        public readonly int Key;
        public readonly bool Prefer;
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
