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
    public sealed class RadiusServerAttributeAttribute31Parameter
    {
        public readonly string CallingStationId;
        public readonly string? IdMacFormat;
        public readonly string? IdMacLuCase;
        public readonly bool? IdSendMacOnly;
        public readonly bool? IdSendNasPortDetail;

        [OutputConstructor]
        private RadiusServerAttributeAttribute31Parameter(
            string callingStationId,

            string? idMacFormat,

            string? idMacLuCase,

            bool? idSendMacOnly,

            bool? idSendNasPortDetail)
        {
            CallingStationId = callingStationId;
            IdMacFormat = idMacFormat;
            IdMacLuCase = idMacLuCase;
            IdSendMacOnly = idSendMacOnly;
            IdSendNasPortDetail = idSendNasPortDetail;
        }
    }
}
