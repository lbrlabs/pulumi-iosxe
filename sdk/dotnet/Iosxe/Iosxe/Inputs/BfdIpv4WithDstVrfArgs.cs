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

    public sealed class BfdIpv4WithDstVrfArgs : global::Pulumi.ResourceArgs
    {
        [Input("destIp", required: true)]
        public Input<string> DestIp { get; set; } = null!;

        [Input("dstVrf", required: true)]
        public Input<string> DstVrf { get; set; } = null!;

        [Input("srcIp", required: true)]
        public Input<string> SrcIp { get; set; } = null!;

        [Input("templateName", required: true)]
        public Input<string> TemplateName { get; set; } = null!;

        public BfdIpv4WithDstVrfArgs()
        {
        }
        public static new BfdIpv4WithDstVrfArgs Empty => new BfdIpv4WithDstVrfArgs();
    }
}
