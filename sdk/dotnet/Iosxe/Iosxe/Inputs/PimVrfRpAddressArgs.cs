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

    public sealed class PimVrfRpAddressArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessList", required: true)]
        public Input<string> AccessList { get; set; } = null!;

        [Input("bidir")]
        public Input<bool>? Bidir { get; set; }

        [Input("override")]
        public Input<bool>? Override { get; set; }

        [Input("rpAddress")]
        public Input<string>? RpAddress { get; set; }

        public PimVrfRpAddressArgs()
        {
        }
        public static new PimVrfRpAddressArgs Empty => new PimVrfRpAddressArgs();
    }
}