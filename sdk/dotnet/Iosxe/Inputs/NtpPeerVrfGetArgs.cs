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

    public sealed class NtpPeerVrfGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("peers")]
        private InputList<Inputs.NtpPeerVrfPeerGetArgs>? _peers;
        public InputList<Inputs.NtpPeerVrfPeerGetArgs> Peers
        {
            get => _peers ?? (_peers = new InputList<Inputs.NtpPeerVrfPeerGetArgs>());
            set => _peers = value;
        }

        public NtpPeerVrfGetArgs()
        {
        }
        public static new NtpPeerVrfGetArgs Empty => new NtpPeerVrfGetArgs();
    }
}
