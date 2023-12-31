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
    public sealed class GetStaticRouteNextHopResult
    {
        /// <summary>
        /// Next hop address is global
        /// </summary>
        public readonly bool Global;
        public readonly int Metric;
        /// <summary>
        /// Specify name of the next hop
        /// </summary>
        public readonly string Name;
        public readonly string NextHop;
        /// <summary>
        /// permanent route
        /// </summary>
        public readonly bool Permanent;
        /// <summary>
        /// Set tag for this route
        /// </summary>
        public readonly int Tag;

        [OutputConstructor]
        private GetStaticRouteNextHopResult(
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
