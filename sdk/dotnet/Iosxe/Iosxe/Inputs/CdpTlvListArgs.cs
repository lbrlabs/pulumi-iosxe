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

    public sealed class CdpTlvListArgs : global::Pulumi.ResourceArgs
    {
        [Input("cos")]
        public Input<bool>? Cos { get; set; }

        [Input("duplex")]
        public Input<bool>? Duplex { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("trust")]
        public Input<bool>? Trust { get; set; }

        [Input("version")]
        public Input<bool>? Version { get; set; }

        [Input("vtpMgmtDomain")]
        public Input<bool>? VtpMgmtDomain { get; set; }

        public CdpTlvListArgs()
        {
        }
        public static new CdpTlvListArgs Empty => new CdpTlvListArgs();
    }
}
