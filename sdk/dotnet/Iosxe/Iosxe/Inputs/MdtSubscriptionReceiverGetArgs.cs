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

    public sealed class MdtSubscriptionReceiverGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        [Input("port", required: true)]
        public Input<int> Port { get; set; } = null!;

        [Input("protocol", required: true)]
        public Input<string> Protocol { get; set; } = null!;

        public MdtSubscriptionReceiverGetArgs()
        {
        }
        public static new MdtSubscriptionReceiverGetArgs Empty => new MdtSubscriptionReceiverGetArgs();
    }
}
