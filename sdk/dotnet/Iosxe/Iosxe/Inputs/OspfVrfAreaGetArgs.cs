// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Iosxe.Iosxe.Inputs
{

    public sealed class OspfVrfAreaGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("areaId", required: true)]
        public Input<string> AreaId { get; set; } = null!;

        [Input("authenticationMessageDigest")]
        public Input<bool>? AuthenticationMessageDigest { get; set; }

        [Input("nssa")]
        public Input<bool>? Nssa { get; set; }

        [Input("nssaDefaultInformationOriginate")]
        public Input<bool>? NssaDefaultInformationOriginate { get; set; }

        [Input("nssaDefaultInformationOriginateMetric")]
        public Input<int>? NssaDefaultInformationOriginateMetric { get; set; }

        [Input("nssaDefaultInformationOriginateMetricType")]
        public Input<int>? NssaDefaultInformationOriginateMetricType { get; set; }

        [Input("nssaNoRedistribution")]
        public Input<bool>? NssaNoRedistribution { get; set; }

        [Input("nssaNoSummary")]
        public Input<bool>? NssaNoSummary { get; set; }

        public OspfVrfAreaGetArgs()
        {
        }
        public static new OspfVrfAreaGetArgs Empty => new OspfVrfAreaGetArgs();
    }
}