// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Iosxe.Outputs
{

    [OutputType]
    public sealed class GetAaaAccountingExecResult
    {
        public readonly string Name;
        /// <summary>
        /// Use Server-group
        /// </summary>
        public readonly string StartStopGroup1;

        [OutputConstructor]
        private GetAaaAccountingExecResult(
            string name,

            string startStopGroup1)
        {
            Name = name;
            StartStopGroup1 = startStopGroup1;
        }
    }
}