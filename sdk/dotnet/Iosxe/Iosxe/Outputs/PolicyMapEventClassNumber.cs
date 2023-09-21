// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Iosxe.Iosxe.Outputs
{

    [OutputType]
    public sealed class PolicyMapEventClassNumber
    {
        public readonly ImmutableArray<Outputs.PolicyMapEventClassNumberActionNumber> ActionNumbers;
        public readonly string? Class;
        public readonly string? ExecutionType;
        public readonly int Number;

        [OutputConstructor]
        private PolicyMapEventClassNumber(
            ImmutableArray<Outputs.PolicyMapEventClassNumberActionNumber> actionNumbers,

            string? @class,

            string? executionType,

            int number)
        {
            ActionNumbers = actionNumbers;
            Class = @class;
            ExecutionType = executionType;
            Number = number;
        }
    }
}