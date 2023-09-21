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
    public static class GetVlanConfiguration
    {
        public static Task<GetVlanConfigurationResult> InvokeAsync(GetVlanConfigurationArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVlanConfigurationResult>("iosxe:iosxe/getVlanConfiguration:getVlanConfiguration", args ?? new GetVlanConfigurationArgs(), options.WithDefaults());

        public static Output<GetVlanConfigurationResult> Invoke(GetVlanConfigurationInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVlanConfigurationResult>("iosxe:iosxe/getVlanConfiguration:getVlanConfiguration", args ?? new GetVlanConfigurationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVlanConfigurationArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public string? Device { get; set; }

        [Input("vlanId", required: true)]
        public int VlanId { get; set; }

        public GetVlanConfigurationArgs()
        {
        }
        public static new GetVlanConfigurationArgs Empty => new GetVlanConfigurationArgs();
    }

    public sealed class GetVlanConfigurationInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("vlanId", required: true)]
        public Input<int> VlanId { get; set; } = null!;

        public GetVlanConfigurationInvokeArgs()
        {
        }
        public static new GetVlanConfigurationInvokeArgs Empty => new GetVlanConfigurationInvokeArgs();
    }


    [OutputType]
    public sealed class GetVlanConfigurationResult
    {
        public readonly string AccessVfi;
        public readonly string? Device;
        public readonly int EvpnInstance;
        public readonly int EvpnInstanceVni;
        public readonly string Id;
        public readonly int VlanId;
        public readonly int Vni;

        [OutputConstructor]
        private GetVlanConfigurationResult(
            string accessVfi,

            string? device,

            int evpnInstance,

            int evpnInstanceVni,

            string id,

            int vlanId,

            int vni)
        {
            AccessVfi = accessVfi;
            Device = device;
            EvpnInstance = evpnInstance;
            EvpnInstanceVni = evpnInstanceVni;
            Id = id;
            VlanId = vlanId;
            Vni = vni;
        }
    }
}
