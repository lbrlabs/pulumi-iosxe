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
    public sealed class GetAaaServerRadiusDynamicAuthorClientResult
    {
        public readonly string Ip;
        public readonly string ServerKey;
        public readonly string ServerKeyType;

        [OutputConstructor]
        private GetAaaServerRadiusDynamicAuthorClientResult(
            string ip,

            string serverKey,

            string serverKeyType)
        {
            Ip = ip;
            ServerKey = serverKey;
            ServerKeyType = serverKeyType;
        }
    }
}
