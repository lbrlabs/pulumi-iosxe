// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Iosxe.Outputs
{

    [OutputType]
    public sealed class BgpAddressFamilyIpv4Ipv4UnicastNetworksMask
    {
        public readonly bool? Backdoor;
        public readonly string Mask;
        public readonly string Network;
        public readonly string? RouteMap;

        [OutputConstructor]
        private BgpAddressFamilyIpv4Ipv4UnicastNetworksMask(
            bool? backdoor,

            string mask,

            string network,

            string? routeMap)
        {
            Backdoor = backdoor;
            Mask = mask;
            Network = network;
            RouteMap = routeMap;
        }
    }
}
