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
    public static class GetStaticRouteVrf
    {
        public static Task<GetStaticRouteVrfResult> InvokeAsync(GetStaticRouteVrfArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetStaticRouteVrfResult>("iosxe:iosxe/getStaticRouteVrf:getStaticRouteVrf", args ?? new GetStaticRouteVrfArgs(), options.WithDefaults());

        public static Output<GetStaticRouteVrfResult> Invoke(GetStaticRouteVrfInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetStaticRouteVrfResult>("iosxe:iosxe/getStaticRouteVrf:getStaticRouteVrf", args ?? new GetStaticRouteVrfInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetStaticRouteVrfArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public string? Device { get; set; }

        [Input("vrf", required: true)]
        public string Vrf { get; set; } = null!;

        public GetStaticRouteVrfArgs()
        {
        }
        public static new GetStaticRouteVrfArgs Empty => new GetStaticRouteVrfArgs();
    }

    public sealed class GetStaticRouteVrfInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("vrf", required: true)]
        public Input<string> Vrf { get; set; } = null!;

        public GetStaticRouteVrfInvokeArgs()
        {
        }
        public static new GetStaticRouteVrfInvokeArgs Empty => new GetStaticRouteVrfInvokeArgs();
    }


    [OutputType]
    public sealed class GetStaticRouteVrfResult
    {
        public readonly string? Device;
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetStaticRouteVrfRouteResult> Routes;
        public readonly string Vrf;

        [OutputConstructor]
        private GetStaticRouteVrfResult(
            string? device,

            string id,

            ImmutableArray<Outputs.GetStaticRouteVrfRouteResult> routes,

            string vrf)
        {
            Device = device;
            Id = id;
            Routes = routes;
            Vrf = vrf;
        }
    }
}
