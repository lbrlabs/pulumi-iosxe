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

    public sealed class PolicyMapEventClassNumberArgs : global::Pulumi.ResourceArgs
    {
        [Input("actionNumbers")]
        private InputList<Inputs.PolicyMapEventClassNumberActionNumberArgs>? _actionNumbers;
        public InputList<Inputs.PolicyMapEventClassNumberActionNumberArgs> ActionNumbers
        {
            get => _actionNumbers ?? (_actionNumbers = new InputList<Inputs.PolicyMapEventClassNumberActionNumberArgs>());
            set => _actionNumbers = value;
        }

        [Input("class")]
        public Input<string>? Class { get; set; }

        [Input("executionType")]
        public Input<string>? ExecutionType { get; set; }

        [Input("number", required: true)]
        public Input<int> Number { get; set; } = null!;

        public PolicyMapEventClassNumberArgs()
        {
        }
        public static new PolicyMapEventClassNumberArgs Empty => new PolicyMapEventClassNumberArgs();
    }
}