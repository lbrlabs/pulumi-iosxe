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

    public sealed class InterfaceOspfProcessIdArgs : global::Pulumi.ResourceArgs
    {
        [Input("areas")]
        private InputList<Inputs.InterfaceOspfProcessIdAreaArgs>? _areas;
        public InputList<Inputs.InterfaceOspfProcessIdAreaArgs> Areas
        {
            get => _areas ?? (_areas = new InputList<Inputs.InterfaceOspfProcessIdAreaArgs>());
            set => _areas = value;
        }

        [Input("id", required: true)]
        public Input<int> Id { get; set; } = null!;

        public InterfaceOspfProcessIdArgs()
        {
        }
        public static new InterfaceOspfProcessIdArgs Empty => new InterfaceOspfProcessIdArgs();
    }
}