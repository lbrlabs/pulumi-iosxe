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
    public sealed class GetBfdIpv4WithoutVrfResult
    {
        /// <summary>
        /// Destination IP prefix/len
        /// </summary>
        public readonly string DestIp;
        /// <summary>
        /// Source IP prefix/len
        /// </summary>
        public readonly string SrcIp;
        /// <summary>
        /// BFD template name
        /// </summary>
        public readonly string TemplateName;

        [OutputConstructor]
        private GetBfdIpv4WithoutVrfResult(
            string destIp,

            string srcIp,

            string templateName)
        {
            DestIp = destIp;
            SrcIp = srcIp;
            TemplateName = templateName;
        }
    }
}
