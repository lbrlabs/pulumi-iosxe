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
    public sealed class GetNtpServerResult
    {
        public readonly string IpAddress;
        /// <summary>
        /// Configure peer authentication key
        /// </summary>
        public readonly int Key;
        /// <summary>
        /// Prefer this peer when possible
        /// </summary>
        public readonly bool Prefer;
        /// <summary>
        /// Interface for source address
        /// </summary>
        public readonly string Source;
        /// <summary>
        /// Configure NTP version
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetNtpServerResult(
            string ipAddress,

            int key,

            bool prefer,

            string source,

            int version)
        {
            IpAddress = ipAddress;
            Key = key;
            Prefer = prefer;
            Source = source;
            Version = version;
        }
    }
}