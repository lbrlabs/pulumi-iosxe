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
    public sealed class GetSnmpServerViewResult
    {
        public readonly string IncExl;
        public readonly string Mib;
        public readonly string Name;

        [OutputConstructor]
        private GetSnmpServerViewResult(
            string incExl,

            string mib,

            string name)
        {
            IncExl = incExl;
            Mib = mib;
            Name = name;
        }
    }
}
