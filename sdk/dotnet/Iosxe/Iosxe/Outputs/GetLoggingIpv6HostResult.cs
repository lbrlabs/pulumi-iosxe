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
    public sealed class GetLoggingIpv6HostResult
    {
        public readonly string Ipv6Host;

        [OutputConstructor]
        private GetLoggingIpv6HostResult(string ipv6Host)
        {
            Ipv6Host = ipv6Host;
        }
    }
}