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
    public sealed class PimRpCandidate
    {
        public readonly bool? Bidir;
        public readonly string? GroupList;
        public readonly string Interface;
        public readonly int? Interval;
        public readonly int? Priority;

        [OutputConstructor]
        private PimRpCandidate(
            bool? bidir,

            string? groupList,

            string @interface,

            int? interval,

            int? priority)
        {
            Bidir = bidir;
            GroupList = groupList;
            Interface = @interface;
            Interval = interval;
            Priority = priority;
        }
    }
}
