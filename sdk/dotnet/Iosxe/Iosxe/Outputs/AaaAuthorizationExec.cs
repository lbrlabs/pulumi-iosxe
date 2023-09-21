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
    public sealed class AaaAuthorizationExec
    {
        public readonly string? A1Group;
        public readonly bool? A1IfAuthenticated;
        public readonly bool? A1Local;
        public readonly bool? A2Local;
        public readonly string Name;

        [OutputConstructor]
        private AaaAuthorizationExec(
            string? a1Group,

            bool? a1IfAuthenticated,

            bool? a1Local,

            bool? a2Local,

            string name)
        {
            A1Group = a1Group;
            A1IfAuthenticated = a1IfAuthenticated;
            A1Local = a1Local;
            A2Local = a2Local;
            Name = name;
        }
    }
}
