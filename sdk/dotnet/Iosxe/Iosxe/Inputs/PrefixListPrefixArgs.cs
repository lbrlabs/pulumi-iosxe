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

    public sealed class PrefixListPrefixArgs : global::Pulumi.ResourceArgs
    {
        [Input("action")]
        public Input<string>? Action { get; set; }

        [Input("ge")]
        public Input<int>? Ge { get; set; }

        [Input("ip")]
        public Input<string>? Ip { get; set; }

        [Input("le")]
        public Input<int>? Le { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("seq", required: true)]
        public Input<int> Seq { get; set; } = null!;

        public PrefixListPrefixArgs()
        {
        }
        public static new PrefixListPrefixArgs Empty => new PrefixListPrefixArgs();
    }
}
