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
    public sealed class GetInterfacePortChannelSubinterfaceIpv6AddressResult
    {
        public readonly bool Eui64;
        public readonly string Prefix;

        [OutputConstructor]
        private GetInterfacePortChannelSubinterfaceIpv6AddressResult(
            bool eui64,

            string prefix)
        {
            Eui64 = eui64;
            Prefix = prefix;
        }
    }
}
