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
    public sealed class GetBfdIpv6WithDstVrfResult
    {
        public readonly string DestIpv6;
        public readonly string DstVrf;
        public readonly string SrcIpv6;
        public readonly string TemplateName;

        [OutputConstructor]
        private GetBfdIpv6WithDstVrfResult(
            string destIpv6,

            string dstVrf,

            string srcIpv6,

            string templateName)
        {
            DestIpv6 = destIpv6;
            DstVrf = dstVrf;
            SrcIpv6 = srcIpv6;
            TemplateName = templateName;
        }
    }
}
