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

    public sealed class LoggingIpv4VrfHostArgs : global::Pulumi.ResourceArgs
    {
        [Input("ipv4Host", required: true)]
        public Input<string> Ipv4Host { get; set; } = null!;

        [Input("vrf", required: true)]
        public Input<string> Vrf { get; set; } = null!;

        public LoggingIpv4VrfHostArgs()
        {
        }
        public static new LoggingIpv4VrfHostArgs Empty => new LoggingIpv4VrfHostArgs();
    }
}
