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
    public sealed class InterfaceTunnelHelperAddress
    {
        public readonly string Address;
        public readonly bool? Global;
        public readonly string? Vrf;

        [OutputConstructor]
        private InterfaceTunnelHelperAddress(
            string address,

            bool? global,

            string? vrf)
        {
            Address = address;
            Global = global;
            Vrf = vrf;
        }
    }
}
