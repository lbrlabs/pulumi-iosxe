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

    public sealed class OspfVrfSummaryAddressArgs : global::Pulumi.ResourceArgs
    {
        [Input("ip", required: true)]
        public Input<string> Ip { get; set; } = null!;

        [Input("mask")]
        public Input<string>? Mask { get; set; }

        public OspfVrfSummaryAddressArgs()
        {
        }
        public static new OspfVrfSummaryAddressArgs Empty => new OspfVrfSummaryAddressArgs();
    }
}
