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

    public sealed class LoggingIpv6VrfHostArgs : global::Pulumi.ResourceArgs
    {
        [Input("ipv6Host", required: true)]
        public Input<string> Ipv6Host { get; set; } = null!;

        [Input("vrf", required: true)]
        public Input<string> Vrf { get; set; } = null!;

        public LoggingIpv6VrfHostArgs()
        {
        }
        public static new LoggingIpv6VrfHostArgs Empty => new LoggingIpv6VrfHostArgs();
    }
}
