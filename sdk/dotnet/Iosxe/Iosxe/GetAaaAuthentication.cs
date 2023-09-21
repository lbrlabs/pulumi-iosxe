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
    public static class GetAaaAuthentication
    {
        public static Task<GetAaaAuthenticationResult> InvokeAsync(GetAaaAuthenticationArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAaaAuthenticationResult>("iosxe:iosxe/getAaaAuthentication:getAaaAuthentication", args ?? new GetAaaAuthenticationArgs(), options.WithDefaults());

        public static Output<GetAaaAuthenticationResult> Invoke(GetAaaAuthenticationInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAaaAuthenticationResult>("iosxe:iosxe/getAaaAuthentication:getAaaAuthentication", args ?? new GetAaaAuthenticationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAaaAuthenticationArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public string? Device { get; set; }

        public GetAaaAuthenticationArgs()
        {
        }
        public static new GetAaaAuthenticationArgs Empty => new GetAaaAuthenticationArgs();
    }

    public sealed class GetAaaAuthenticationInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public Input<string>? Device { get; set; }

        public GetAaaAuthenticationInvokeArgs()
        {
        }
        public static new GetAaaAuthenticationInvokeArgs Empty => new GetAaaAuthenticationInvokeArgs();
    }


    [OutputType]
    public sealed class GetAaaAuthenticationResult
    {
        public readonly string? Device;
        public readonly string Dot1xDefaultA1Group;
        public readonly bool Dot1xDefaultA1Local;
        public readonly string Dot1xDefaultA2Group;
        public readonly bool Dot1xDefaultA2Local;
        public readonly string Dot1xDefaultA3Group;
        public readonly bool Dot1xDefaultA3Local;
        public readonly string Dot1xDefaultA4Group;
        public readonly bool Dot1xDefaultA4Local;
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetAaaAuthenticationLoginResult> Logins;

        [OutputConstructor]
        private GetAaaAuthenticationResult(
            string? device,

            string dot1xDefaultA1Group,

            bool dot1xDefaultA1Local,

            string dot1xDefaultA2Group,

            bool dot1xDefaultA2Local,

            string dot1xDefaultA3Group,

            bool dot1xDefaultA3Local,

            string dot1xDefaultA4Group,

            bool dot1xDefaultA4Local,

            string id,

            ImmutableArray<Outputs.GetAaaAuthenticationLoginResult> logins)
        {
            Device = device;
            Dot1xDefaultA1Group = dot1xDefaultA1Group;
            Dot1xDefaultA1Local = dot1xDefaultA1Local;
            Dot1xDefaultA2Group = dot1xDefaultA2Group;
            Dot1xDefaultA2Local = dot1xDefaultA2Local;
            Dot1xDefaultA3Group = dot1xDefaultA3Group;
            Dot1xDefaultA3Local = dot1xDefaultA3Local;
            Dot1xDefaultA4Group = dot1xDefaultA4Group;
            Dot1xDefaultA4Local = dot1xDefaultA4Local;
            Id = id;
            Logins = logins;
        }
    }
}