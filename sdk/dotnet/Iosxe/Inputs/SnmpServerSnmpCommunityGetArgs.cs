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

    public sealed class SnmpServerSnmpCommunityGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessListName")]
        public Input<string>? AccessListName { get; set; }

        [Input("ipv6")]
        public Input<string>? Ipv6 { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("permission")]
        public Input<string>? Permission { get; set; }

        [Input("view")]
        public Input<string>? View { get; set; }

        public SnmpServerSnmpCommunityGetArgs()
        {
        }
        public static new SnmpServerSnmpCommunityGetArgs Empty => new SnmpServerSnmpCommunityGetArgs();
    }
}
