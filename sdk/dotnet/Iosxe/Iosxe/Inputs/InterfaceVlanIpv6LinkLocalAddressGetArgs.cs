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

    public sealed class InterfaceVlanIpv6LinkLocalAddressGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        [Input("linkLocal")]
        public Input<bool>? LinkLocal { get; set; }

        public InterfaceVlanIpv6LinkLocalAddressGetArgs()
        {
        }
        public static new InterfaceVlanIpv6LinkLocalAddressGetArgs Empty => new InterfaceVlanIpv6LinkLocalAddressGetArgs();
    }
}
