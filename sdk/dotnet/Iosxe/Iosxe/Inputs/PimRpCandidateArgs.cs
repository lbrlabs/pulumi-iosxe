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

    public sealed class PimRpCandidateArgs : global::Pulumi.ResourceArgs
    {
        [Input("bidir")]
        public Input<bool>? Bidir { get; set; }

        [Input("groupList")]
        public Input<string>? GroupList { get; set; }

        [Input("interface", required: true)]
        public Input<string> Interface { get; set; } = null!;

        [Input("interval")]
        public Input<int>? Interval { get; set; }

        [Input("priority")]
        public Input<int>? Priority { get; set; }

        public PimRpCandidateArgs()
        {
        }
        public static new PimRpCandidateArgs Empty => new PimRpCandidateArgs();
    }
}
