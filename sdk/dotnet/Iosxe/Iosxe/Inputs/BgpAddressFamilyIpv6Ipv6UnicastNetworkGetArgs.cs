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

    public sealed class BgpAddressFamilyIpv6Ipv6UnicastNetworkGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("backdoor")]
        public Input<bool>? Backdoor { get; set; }

        [Input("network", required: true)]
        public Input<string> Network { get; set; } = null!;

        [Input("routeMap")]
        public Input<string>? RouteMap { get; set; }

        public BgpAddressFamilyIpv6Ipv6UnicastNetworkGetArgs()
        {
        }
        public static new BgpAddressFamilyIpv6Ipv6UnicastNetworkGetArgs Empty => new BgpAddressFamilyIpv6Ipv6UnicastNetworkGetArgs();
    }
}
