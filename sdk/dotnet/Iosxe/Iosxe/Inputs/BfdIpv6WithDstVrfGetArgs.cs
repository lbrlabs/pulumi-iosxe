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

    public sealed class BfdIpv6WithDstVrfGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("destIpv6", required: true)]
        public Input<string> DestIpv6 { get; set; } = null!;

        [Input("dstVrf", required: true)]
        public Input<string> DstVrf { get; set; } = null!;

        [Input("srcIpv6", required: true)]
        public Input<string> SrcIpv6 { get; set; } = null!;

        [Input("templateName", required: true)]
        public Input<string> TemplateName { get; set; } = null!;

        public BfdIpv6WithDstVrfGetArgs()
        {
        }
        public static new BfdIpv6WithDstVrfGetArgs Empty => new BfdIpv6WithDstVrfGetArgs();
    }
}
