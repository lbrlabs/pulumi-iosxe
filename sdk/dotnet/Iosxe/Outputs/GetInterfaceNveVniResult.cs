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
    public sealed class GetInterfaceNveVniResult
    {
        /// <summary>
        /// Ingress Replication control-plane (BGP) signaling
        /// </summary>
        public readonly bool IngressReplication;
        /// <summary>
        /// Starting Multicast Group IPv4 Address
        /// </summary>
        public readonly string Ipv4MulticastGroup;
        /// <summary>
        /// VNI range or instance between 4096-16777215, example: 6010-6030 or 7115
        /// </summary>
        public readonly string VniRange;

        [OutputConstructor]
        private GetInterfaceNveVniResult(
            bool ingressReplication,

            string ipv4MulticastGroup,

            string vniRange)
        {
            IngressReplication = ingressReplication;
            Ipv4MulticastGroup = ipv4MulticastGroup;
            VniRange = vniRange;
        }
    }
}
