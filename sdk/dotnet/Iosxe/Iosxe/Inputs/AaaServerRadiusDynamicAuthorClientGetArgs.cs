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

    public sealed class AaaServerRadiusDynamicAuthorClientGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("ip", required: true)]
        public Input<string> Ip { get; set; } = null!;

        [Input("serverKey")]
        public Input<string>? ServerKey { get; set; }

        [Input("serverKeyType")]
        public Input<string>? ServerKeyType { get; set; }

        public AaaServerRadiusDynamicAuthorClientGetArgs()
        {
        }
        public static new AaaServerRadiusDynamicAuthorClientGetArgs Empty => new AaaServerRadiusDynamicAuthorClientGetArgs();
    }
}
