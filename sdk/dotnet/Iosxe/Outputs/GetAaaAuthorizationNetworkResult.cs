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
    public sealed class GetAaaAuthorizationNetworkResult
    {
        /// <summary>
        /// Use Server-group
        /// </summary>
        public readonly string A1Group;
        /// <summary>
        /// The path of the retrieved object.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetAaaAuthorizationNetworkResult(
            string a1Group,

            string id)
        {
            A1Group = a1Group;
            Id = id;
        }
    }
}
