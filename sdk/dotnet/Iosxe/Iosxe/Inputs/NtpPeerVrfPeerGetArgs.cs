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

    public sealed class NtpPeerVrfPeerGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("ipAddress", required: true)]
        public Input<string> IpAddress { get; set; } = null!;

        [Input("key")]
        public Input<int>? Key { get; set; }

        [Input("prefer")]
        public Input<bool>? Prefer { get; set; }

        [Input("version")]
        public Input<int>? Version { get; set; }

        public NtpPeerVrfPeerGetArgs()
        {
        }
        public static new NtpPeerVrfPeerGetArgs Empty => new NtpPeerVrfPeerGetArgs();
    }
}
