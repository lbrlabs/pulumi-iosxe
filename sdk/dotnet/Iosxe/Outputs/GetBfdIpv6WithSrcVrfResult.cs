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
    public sealed class GetBfdIpv6WithSrcVrfResult
    {
        /// <summary>
        /// Destination IPv6 prefix/len
        /// </summary>
        public readonly string DestIpv6;
        /// <summary>
        /// Source IPv6 prefix/len
        /// </summary>
        public readonly string SrcIpv6;
        /// <summary>
        /// source VRF instance name
        /// </summary>
        public readonly string SrcVrf;
        /// <summary>
        /// BFD template name
        /// </summary>
        public readonly string TemplateName;

        [OutputConstructor]
        private GetBfdIpv6WithSrcVrfResult(
            string destIpv6,

            string srcIpv6,

            string srcVrf,

            string templateName)
        {
            DestIpv6 = destIpv6;
            SrcIpv6 = srcIpv6;
            SrcVrf = srcVrf;
            TemplateName = templateName;
        }
    }
}