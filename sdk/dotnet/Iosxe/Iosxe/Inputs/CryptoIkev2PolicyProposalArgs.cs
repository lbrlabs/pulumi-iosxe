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

    public sealed class CryptoIkev2PolicyProposalArgs : global::Pulumi.ResourceArgs
    {
        [Input("proposals", required: true)]
        public Input<string> Proposals { get; set; } = null!;

        public CryptoIkev2PolicyProposalArgs()
        {
        }
        public static new CryptoIkev2PolicyProposalArgs Empty => new CryptoIkev2PolicyProposalArgs();
    }
}
