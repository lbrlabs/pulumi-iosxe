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

    public sealed class AaaAccountingExecGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("startStopGroup1")]
        public Input<string>? StartStopGroup1 { get; set; }

        public AaaAccountingExecGetArgs()
        {
        }
        public static new AaaAccountingExecGetArgs Empty => new AaaAccountingExecGetArgs();
    }
}