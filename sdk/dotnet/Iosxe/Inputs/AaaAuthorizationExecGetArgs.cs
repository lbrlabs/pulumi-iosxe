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

    public sealed class AaaAuthorizationExecGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("a1Group")]
        public Input<string>? A1Group { get; set; }

        [Input("a1IfAuthenticated")]
        public Input<bool>? A1IfAuthenticated { get; set; }

        [Input("a1Local")]
        public Input<bool>? A1Local { get; set; }

        [Input("a2Local")]
        public Input<bool>? A2Local { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public AaaAuthorizationExecGetArgs()
        {
        }
        public static new AaaAuthorizationExecGetArgs Empty => new AaaAuthorizationExecGetArgs();
    }
}