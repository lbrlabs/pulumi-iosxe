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
    public sealed class VrfIpv4RouteTargetImportStitching
    {
        public readonly bool? Stitching;
        public readonly string Value;

        [OutputConstructor]
        private VrfIpv4RouteTargetImportStitching(
            bool? stitching,

            string value)
        {
            Stitching = stitching;
            Value = value;
        }
    }
}
