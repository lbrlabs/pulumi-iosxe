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
    public static class GetInterfaceMpls
    {
        public static Task<GetInterfaceMplsResult> InvokeAsync(GetInterfaceMplsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInterfaceMplsResult>("iosxe:iosxe/getInterfaceMpls:getInterfaceMpls", args ?? new GetInterfaceMplsArgs(), options.WithDefaults());

        public static Output<GetInterfaceMplsResult> Invoke(GetInterfaceMplsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInterfaceMplsResult>("iosxe:iosxe/getInterfaceMpls:getInterfaceMpls", args ?? new GetInterfaceMplsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInterfaceMplsArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public string? Device { get; set; }

        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        public GetInterfaceMplsArgs()
        {
        }
        public static new GetInterfaceMplsArgs Empty => new GetInterfaceMplsArgs();
    }

    public sealed class GetInterfaceMplsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public GetInterfaceMplsInvokeArgs()
        {
        }
        public static new GetInterfaceMplsInvokeArgs Empty => new GetInterfaceMplsInvokeArgs();
    }


    [OutputType]
    public sealed class GetInterfaceMplsResult
    {
        public readonly string? Device;
        public readonly string Id;
        public readonly bool Ip;
        public readonly string Mtu;
        public readonly string Name;
        public readonly string Type;

        [OutputConstructor]
        private GetInterfaceMplsResult(
            string? device,

            string id,

            bool ip,

            string mtu,

            string name,

            string type)
        {
            Device = device;
            Id = id;
            Ip = ip;
            Mtu = mtu;
            Name = name;
            Type = type;
        }
    }
}