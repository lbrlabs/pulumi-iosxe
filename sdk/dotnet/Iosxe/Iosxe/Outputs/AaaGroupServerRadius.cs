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
    public sealed class AaaGroupServerRadius
    {
        public readonly int? IpRadiusSourceInterfaceLoopback;
        public readonly string Name;
        public readonly ImmutableArray<Outputs.AaaGroupServerRadiusServerName> ServerNames;

        [OutputConstructor]
        private AaaGroupServerRadius(
            int? ipRadiusSourceInterfaceLoopback,

            string name,

            ImmutableArray<Outputs.AaaGroupServerRadiusServerName> serverNames)
        {
            IpRadiusSourceInterfaceLoopback = ipRadiusSourceInterfaceLoopback;
            Name = name;
            ServerNames = serverNames;
        }
    }
}