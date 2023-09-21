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
    public static class GetInterfaceOspf
    {
        public static Task<GetInterfaceOspfResult> InvokeAsync(GetInterfaceOspfArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInterfaceOspfResult>("iosxe:iosxe/getInterfaceOspf:getInterfaceOspf", args ?? new GetInterfaceOspfArgs(), options.WithDefaults());

        public static Output<GetInterfaceOspfResult> Invoke(GetInterfaceOspfInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInterfaceOspfResult>("iosxe:iosxe/getInterfaceOspf:getInterfaceOspf", args ?? new GetInterfaceOspfInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInterfaceOspfArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public string? Device { get; set; }

        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        public GetInterfaceOspfArgs()
        {
        }
        public static new GetInterfaceOspfArgs Empty => new GetInterfaceOspfArgs();
    }

    public sealed class GetInterfaceOspfInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public GetInterfaceOspfInvokeArgs()
        {
        }
        public static new GetInterfaceOspfInvokeArgs Empty => new GetInterfaceOspfInvokeArgs();
    }


    [OutputType]
    public sealed class GetInterfaceOspfResult
    {
        public readonly int Cost;
        public readonly int DeadInterval;
        public readonly string? Device;
        public readonly int HelloInterval;
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetInterfaceOspfMessageDigestKeyResult> MessageDigestKeys;
        public readonly bool MtuIgnore;
        public readonly string Name;
        public readonly bool NetworkTypeBroadcast;
        public readonly bool NetworkTypeNonBroadcast;
        public readonly bool NetworkTypePointToMultipoint;
        public readonly bool NetworkTypePointToPoint;
        public readonly int Priority;
        public readonly ImmutableArray<Outputs.GetInterfaceOspfProcessIdResult> ProcessIds;
        public readonly int TtlSecurityHops;
        public readonly string Type;

        [OutputConstructor]
        private GetInterfaceOspfResult(
            int cost,

            int deadInterval,

            string? device,

            int helloInterval,

            string id,

            ImmutableArray<Outputs.GetInterfaceOspfMessageDigestKeyResult> messageDigestKeys,

            bool mtuIgnore,

            string name,

            bool networkTypeBroadcast,

            bool networkTypeNonBroadcast,

            bool networkTypePointToMultipoint,

            bool networkTypePointToPoint,

            int priority,

            ImmutableArray<Outputs.GetInterfaceOspfProcessIdResult> processIds,

            int ttlSecurityHops,

            string type)
        {
            Cost = cost;
            DeadInterval = deadInterval;
            Device = device;
            HelloInterval = helloInterval;
            Id = id;
            MessageDigestKeys = messageDigestKeys;
            MtuIgnore = mtuIgnore;
            Name = name;
            NetworkTypeBroadcast = networkTypeBroadcast;
            NetworkTypeNonBroadcast = networkTypeNonBroadcast;
            NetworkTypePointToMultipoint = networkTypePointToMultipoint;
            NetworkTypePointToPoint = networkTypePointToPoint;
            Priority = priority;
            ProcessIds = processIds;
            TtlSecurityHops = ttlSecurityHops;
            Type = type;
        }
    }
}
