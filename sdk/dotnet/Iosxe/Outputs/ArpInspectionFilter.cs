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
    public sealed class ArpInspectionFilter
    {
        public readonly string Name;
        public readonly ImmutableArray<Outputs.ArpInspectionFilterVlan> Vlans;

        [OutputConstructor]
        private ArpInspectionFilter(
            string name,

            ImmutableArray<Outputs.ArpInspectionFilterVlan> vlans)
        {
            Name = name;
            Vlans = vlans;
        }
    }
}
