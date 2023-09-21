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

    public sealed class NtpPeerGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("ipAddress", required: true)]
        public Input<string> IpAddress { get; set; } = null!;

        [Input("key")]
        public Input<int>? Key { get; set; }

        [Input("prefer")]
        public Input<bool>? Prefer { get; set; }

        [Input("source")]
        public Input<string>? Source { get; set; }

        [Input("version")]
        public Input<int>? Version { get; set; }

        public NtpPeerGetArgs()
        {
        }
        public static new NtpPeerGetArgs Empty => new NtpPeerGetArgs();
    }
}
