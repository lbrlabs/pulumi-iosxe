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

    public sealed class BfdIpv4WithoutVrfGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("destIp", required: true)]
        public Input<string> DestIp { get; set; } = null!;

        [Input("srcIp", required: true)]
        public Input<string> SrcIp { get; set; } = null!;

        [Input("templateName", required: true)]
        public Input<string> TemplateName { get; set; } = null!;

        public BfdIpv4WithoutVrfGetArgs()
        {
        }
        public static new BfdIpv4WithoutVrfGetArgs Empty => new BfdIpv4WithoutVrfGetArgs();
    }
}
