// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Iosxe.Iosxe.Outputs
{

    [OutputType]
    public sealed class BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetwork
    {
        public readonly bool? Backdoor;
        public readonly bool? Evpn;
        public readonly string Network;
        public readonly string? RouteMap;

        [OutputConstructor]
        private BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetwork(
            bool? backdoor,

            bool? evpn,

            string network,

            string? routeMap)
        {
            Backdoor = backdoor;
            Evpn = evpn;
            Network = network;
            RouteMap = routeMap;
        }
    }
}
