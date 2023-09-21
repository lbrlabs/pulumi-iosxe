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
    public static class GetAccessListExtended
    {
        public static Task<GetAccessListExtendedResult> InvokeAsync(GetAccessListExtendedArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAccessListExtendedResult>("iosxe:iosxe/getAccessListExtended:getAccessListExtended", args ?? new GetAccessListExtendedArgs(), options.WithDefaults());

        public static Output<GetAccessListExtendedResult> Invoke(GetAccessListExtendedInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccessListExtendedResult>("iosxe:iosxe/getAccessListExtended:getAccessListExtended", args ?? new GetAccessListExtendedInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAccessListExtendedArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public string? Device { get; set; }

        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetAccessListExtendedArgs()
        {
        }
        public static new GetAccessListExtendedArgs Empty => new GetAccessListExtendedArgs();
    }

    public sealed class GetAccessListExtendedInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetAccessListExtendedInvokeArgs()
        {
        }
        public static new GetAccessListExtendedInvokeArgs Empty => new GetAccessListExtendedInvokeArgs();
    }


    [OutputType]
    public sealed class GetAccessListExtendedResult
    {
        public readonly string? Device;
        public readonly ImmutableArray<Outputs.GetAccessListExtendedEntryResult> Entries;
        public readonly string Id;
        public readonly string Name;

        [OutputConstructor]
        private GetAccessListExtendedResult(
            string? device,

            ImmutableArray<Outputs.GetAccessListExtendedEntryResult> entries,

            string id,

            string name)
        {
            Device = device;
            Entries = entries;
            Id = id;
            Name = name;
        }
    }
}