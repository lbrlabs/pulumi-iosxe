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
    public sealed class GetBgpIpv4UnicastNeighborRouteMapResult
    {
        public readonly string InOut;
        public readonly string RouteMapName;

        [OutputConstructor]
        private GetBgpIpv4UnicastNeighborRouteMapResult(
            string inOut,

            string routeMapName)
        {
            InOut = inOut;
            RouteMapName = routeMapName;
        }
    }
}
