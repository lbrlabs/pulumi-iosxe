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
    public static class GetVlan
    {
        public static Task<GetVlanResult> InvokeAsync(GetVlanArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVlanResult>("iosxe:iosxe/getVlan:getVlan", args ?? new GetVlanArgs(), options.WithDefaults());

        public static Output<GetVlanResult> Invoke(GetVlanInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVlanResult>("iosxe:iosxe/getVlan:getVlan", args ?? new GetVlanInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVlanArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public string? Device { get; set; }

        [Input("vlanId", required: true)]
        public int VlanId { get; set; }

        public GetVlanArgs()
        {
        }
        public static new GetVlanArgs Empty => new GetVlanArgs();
    }

    public sealed class GetVlanInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("vlanId", required: true)]
        public Input<int> VlanId { get; set; } = null!;

        public GetVlanInvokeArgs()
        {
        }
        public static new GetVlanInvokeArgs Empty => new GetVlanInvokeArgs();
    }


    [OutputType]
    public sealed class GetVlanResult
    {
        public readonly string? Device;
        public readonly string Id;
        public readonly string Name;
        public readonly string PrivateVlanAssociation;
        public readonly bool PrivateVlanCommunity;
        public readonly bool PrivateVlanIsolated;
        public readonly bool PrivateVlanPrimary;
        public readonly bool RemoteSpan;
        public readonly bool Shutdown;
        public readonly int VlanId;

        [OutputConstructor]
        private GetVlanResult(
            string? device,

            string id,

            string name,

            string privateVlanAssociation,

            bool privateVlanCommunity,

            bool privateVlanIsolated,

            bool privateVlanPrimary,

            bool remoteSpan,

            bool shutdown,

            int vlanId)
        {
            Device = device;
            Id = id;
            Name = name;
            PrivateVlanAssociation = privateVlanAssociation;
            PrivateVlanCommunity = privateVlanCommunity;
            PrivateVlanIsolated = privateVlanIsolated;
            PrivateVlanPrimary = privateVlanPrimary;
            RemoteSpan = remoteSpan;
            Shutdown = shutdown;
            VlanId = vlanId;
        }
    }
}
