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
    public static class GetPrefixList
    {
        public static Task<GetPrefixListResult> InvokeAsync(GetPrefixListArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPrefixListResult>("iosxe:iosxe/getPrefixList:getPrefixList", args ?? new GetPrefixListArgs(), options.WithDefaults());

        public static Output<GetPrefixListResult> Invoke(GetPrefixListInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPrefixListResult>("iosxe:iosxe/getPrefixList:getPrefixList", args ?? new GetPrefixListInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPrefixListArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public string? Device { get; set; }

        public GetPrefixListArgs()
        {
        }
        public static new GetPrefixListArgs Empty => new GetPrefixListArgs();
    }

    public sealed class GetPrefixListInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public Input<string>? Device { get; set; }

        public GetPrefixListInvokeArgs()
        {
        }
        public static new GetPrefixListInvokeArgs Empty => new GetPrefixListInvokeArgs();
    }


    [OutputType]
    public sealed class GetPrefixListResult
    {
        public readonly string? Device;
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetPrefixListPrefixResult> Prefixes;

        [OutputConstructor]
        private GetPrefixListResult(
            string? device,

            string id,

            ImmutableArray<Outputs.GetPrefixListPrefixResult> prefixes)
        {
            Device = device;
            Id = id;
            Prefixes = prefixes;
        }
    }
}