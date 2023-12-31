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
    public sealed class GetBfdIpv6WithoutVrfResult
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
        /// BFD template name
        /// </summary>
        public readonly string TemplateName;

        [OutputConstructor]
        private GetBfdIpv6WithoutVrfResult(
            string destIpv6,

            string srcIpv6,

            string templateName)
        {
            DestIpv6 = destIpv6;
            SrcIpv6 = srcIpv6;
            TemplateName = templateName;
        }
    }
}
