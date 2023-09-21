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
    public sealed class GetCdpTlvListResult
    {
        public readonly bool Cos;
        public readonly bool Duplex;
        public readonly string Name;
        public readonly bool Trust;
        public readonly bool Version;
        public readonly bool VtpMgmtDomain;

        [OutputConstructor]
        private GetCdpTlvListResult(
            bool cos,

            bool duplex,

            string name,

            bool trust,

            bool version,

            bool vtpMgmtDomain)
        {
            Cos = cos;
            Duplex = duplex;
            Name = name;
            Trust = trust;
            Version = version;
            VtpMgmtDomain = vtpMgmtDomain;
        }
    }
}
