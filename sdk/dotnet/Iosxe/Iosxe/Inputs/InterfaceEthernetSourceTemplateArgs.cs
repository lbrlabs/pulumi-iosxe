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

    public sealed class InterfaceEthernetSourceTemplateArgs : global::Pulumi.ResourceArgs
    {
        [Input("merge")]
        public Input<bool>? Merge { get; set; }

        [Input("templateName", required: true)]
        public Input<string> TemplateName { get; set; } = null!;

        public InterfaceEthernetSourceTemplateArgs()
        {
        }
        public static new InterfaceEthernetSourceTemplateArgs Empty => new InterfaceEthernetSourceTemplateArgs();
    }
}
