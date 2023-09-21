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
    public sealed class GetStaticRouteVrfRouteNextHopResult
    {
        public readonly bool Global;
        public readonly int Metric;
        public readonly string Name;
        public readonly string NextHop;
        public readonly bool Permanent;
        public readonly int Tag;

        [OutputConstructor]
        private GetStaticRouteVrfRouteNextHopResult(
            bool global,

            int metric,

            string name,

            string nextHop,

            bool permanent,

            int tag)
        {
            Global = global;
            Metric = metric;
            Name = name;
            NextHop = nextHop;
            Permanent = permanent;
            Tag = tag;
        }
    }
}
