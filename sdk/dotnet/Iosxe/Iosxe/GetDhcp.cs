// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Iosxe.Iosxe
{
    public static class GetDhcp
    {
        public static Task<GetDhcpResult> InvokeAsync(GetDhcpArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDhcpResult>("iosxe:iosxe/getDhcp:getDhcp", args ?? new GetDhcpArgs(), options.WithDefaults());

        public static Output<GetDhcpResult> Invoke(GetDhcpInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDhcpResult>("iosxe:iosxe/getDhcp:getDhcp", args ?? new GetDhcpInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDhcpArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public string? Device { get; set; }

        public GetDhcpArgs()
        {
        }
        public static new GetDhcpArgs Empty => new GetDhcpArgs();
    }

    public sealed class GetDhcpInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public Input<string>? Device { get; set; }

        public GetDhcpInvokeArgs()
        {
        }
        public static new GetDhcpInvokeArgs Empty => new GetDhcpInvokeArgs();
    }


    [OutputType]
    public sealed class GetDhcpResult
    {
        public readonly string CompatibilitySuboptionLinkSelection;
        public readonly string CompatibilitySuboptionServerOverride;
        public readonly string? Device;
        public readonly string Id;
        public readonly bool RelayInformationOptionDefault;
        public readonly bool RelayInformationOptionVpn;
        public readonly bool RelayInformationTrustAll;
        public readonly bool Snooping;
        public readonly bool SnoopingInformationOptionFormatRemoteIdHostname;
        public readonly ImmutableArray<Outputs.GetDhcpSnoopingVlanResult> SnoopingVlans;

        [OutputConstructor]
        private GetDhcpResult(
            string compatibilitySuboptionLinkSelection,

            string compatibilitySuboptionServerOverride,

            string? device,

            string id,

            bool relayInformationOptionDefault,

            bool relayInformationOptionVpn,

            bool relayInformationTrustAll,

            bool snooping,

            bool snoopingInformationOptionFormatRemoteIdHostname,

            ImmutableArray<Outputs.GetDhcpSnoopingVlanResult> snoopingVlans)
        {
            CompatibilitySuboptionLinkSelection = compatibilitySuboptionLinkSelection;
            CompatibilitySuboptionServerOverride = compatibilitySuboptionServerOverride;
            Device = device;
            Id = id;
            RelayInformationOptionDefault = relayInformationOptionDefault;
            RelayInformationOptionVpn = relayInformationOptionVpn;
            RelayInformationTrustAll = relayInformationTrustAll;
            Snooping = snooping;
            SnoopingInformationOptionFormatRemoteIdHostname = snoopingInformationOptionFormatRemoteIdHostname;
            SnoopingVlans = snoopingVlans;
        }
    }
}
