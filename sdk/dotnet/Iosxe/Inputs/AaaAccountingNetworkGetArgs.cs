// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Iosxe.Inputs
{

    public sealed class AaaAccountingNetworkGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        [Input("startStopGroup1")]
        public Input<string>? StartStopGroup1 { get; set; }

        [Input("startStopGroup2")]
        public Input<string>? StartStopGroup2 { get; set; }

        public AaaAccountingNetworkGetArgs()
        {
        }
        public static new AaaAccountingNetworkGetArgs Empty => new AaaAccountingNetworkGetArgs();
    }
}
