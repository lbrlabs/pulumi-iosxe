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

    public sealed class ArpInspectionFilterVlanArgs : global::Pulumi.ResourceArgs
    {
        [Input("static")]
        public Input<bool>? Static { get; set; }

        [Input("vlanRange", required: true)]
        public Input<string> VlanRange { get; set; } = null!;

        public ArpInspectionFilterVlanArgs()
        {
        }
        public static new ArpInspectionFilterVlanArgs Empty => new ArpInspectionFilterVlanArgs();
    }
}