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

    public sealed class InterfaceNveVniVrfArgs : global::Pulumi.ResourceArgs
    {
        [Input("vniRange", required: true)]
        public Input<string> VniRange { get; set; } = null!;

        [Input("vrf")]
        public Input<string>? Vrf { get; set; }

        public InterfaceNveVniVrfArgs()
        {
        }
        public static new InterfaceNveVniVrfArgs Empty => new InterfaceNveVniVrfArgs();
    }
}
