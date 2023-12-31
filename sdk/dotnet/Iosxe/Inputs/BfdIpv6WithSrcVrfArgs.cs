// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Iosxe.Inputs
{

    public sealed class BfdIpv6WithSrcVrfArgs : global::Pulumi.ResourceArgs
    {
        [Input("destIpv6", required: true)]
        public Input<string> DestIpv6 { get; set; } = null!;

        [Input("srcIpv6", required: true)]
        public Input<string> SrcIpv6 { get; set; } = null!;

        [Input("srcVrf", required: true)]
        public Input<string> SrcVrf { get; set; } = null!;

        [Input("templateName", required: true)]
        public Input<string> TemplateName { get; set; } = null!;

        public BfdIpv6WithSrcVrfArgs()
        {
        }
        public static new BfdIpv6WithSrcVrfArgs Empty => new BfdIpv6WithSrcVrfArgs();
    }
}
