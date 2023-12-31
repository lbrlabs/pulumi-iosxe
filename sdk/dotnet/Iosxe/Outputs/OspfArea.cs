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
    public sealed class OspfArea
    {
        public readonly string AreaId;
        public readonly bool? AuthenticationMessageDigest;
        public readonly bool? Nssa;
        public readonly bool? NssaDefaultInformationOriginate;
        public readonly int? NssaDefaultInformationOriginateMetric;
        public readonly int? NssaDefaultInformationOriginateMetricType;
        public readonly bool? NssaNoRedistribution;
        public readonly bool? NssaNoSummary;

        [OutputConstructor]
        private OspfArea(
            string areaId,

            bool? authenticationMessageDigest,

            bool? nssa,

            bool? nssaDefaultInformationOriginate,

            int? nssaDefaultInformationOriginateMetric,

            int? nssaDefaultInformationOriginateMetricType,

            bool? nssaNoRedistribution,

            bool? nssaNoSummary)
        {
            AreaId = areaId;
            AuthenticationMessageDigest = authenticationMessageDigest;
            Nssa = nssa;
            NssaDefaultInformationOriginate = nssaDefaultInformationOriginate;
            NssaDefaultInformationOriginateMetric = nssaDefaultInformationOriginateMetric;
            NssaDefaultInformationOriginateMetricType = nssaDefaultInformationOriginateMetricType;
            NssaNoRedistribution = nssaNoRedistribution;
            NssaNoSummary = nssaNoSummary;
        }
    }
}
