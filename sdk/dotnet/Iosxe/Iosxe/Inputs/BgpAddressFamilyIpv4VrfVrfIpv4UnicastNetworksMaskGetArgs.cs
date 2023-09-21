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

    public sealed class BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetworksMaskGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("backdoor")]
        public Input<bool>? Backdoor { get; set; }

        [Input("evpn")]
        public Input<bool>? Evpn { get; set; }

        [Input("mask", required: true)]
        public Input<string> Mask { get; set; } = null!;

        [Input("network", required: true)]
        public Input<string> Network { get; set; } = null!;

        [Input("routeMap")]
        public Input<string>? RouteMap { get; set; }

        public BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetworksMaskGetArgs()
        {
        }
        public static new BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetworksMaskGetArgs Empty => new BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetworksMaskGetArgs();
    }
}
