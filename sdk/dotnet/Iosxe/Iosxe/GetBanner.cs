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
    public static class GetBanner
    {
        public static Task<GetBannerResult> InvokeAsync(GetBannerArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetBannerResult>("iosxe:iosxe/getBanner:getBanner", args ?? new GetBannerArgs(), options.WithDefaults());

        public static Output<GetBannerResult> Invoke(GetBannerInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetBannerResult>("iosxe:iosxe/getBanner:getBanner", args ?? new GetBannerInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetBannerArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public string? Device { get; set; }

        public GetBannerArgs()
        {
        }
        public static new GetBannerArgs Empty => new GetBannerArgs();
    }

    public sealed class GetBannerInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public Input<string>? Device { get; set; }

        public GetBannerInvokeArgs()
        {
        }
        public static new GetBannerInvokeArgs Empty => new GetBannerInvokeArgs();
    }


    [OutputType]
    public sealed class GetBannerResult
    {
        public readonly string? Device;
        public readonly string ExecBanner;
        public readonly string Id;
        public readonly string LoginBanner;
        public readonly string MotdBanner;
        public readonly string PromptTimeoutBanner;

        [OutputConstructor]
        private GetBannerResult(
            string? device,

            string execBanner,

            string id,

            string loginBanner,

            string motdBanner,

            string promptTimeoutBanner)
        {
            Device = device;
            ExecBanner = execBanner;
            Id = id;
            LoginBanner = loginBanner;
            MotdBanner = motdBanner;
            PromptTimeoutBanner = promptTimeoutBanner;
        }
    }
}
