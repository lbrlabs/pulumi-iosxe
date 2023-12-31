// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Iosxe
{
    public static class GetBgpAddressFamilyL2vpn
    {
        /// <summary>
        /// This data source can read the BGP Address Family L2VPN configuration.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Iosxe = Pulumi.Iosxe;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Iosxe.GetBgpAddressFamilyL2vpn.Invoke(new()
        ///     {
        ///         AfName = "evpn",
        ///         Asn = "65000",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetBgpAddressFamilyL2vpnResult> InvokeAsync(GetBgpAddressFamilyL2vpnArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetBgpAddressFamilyL2vpnResult>("iosxe:index/getBgpAddressFamilyL2vpn:getBgpAddressFamilyL2vpn", args ?? new GetBgpAddressFamilyL2vpnArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the BGP Address Family L2VPN configuration.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Iosxe = Pulumi.Iosxe;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Iosxe.GetBgpAddressFamilyL2vpn.Invoke(new()
        ///     {
        ///         AfName = "evpn",
        ///         Asn = "65000",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetBgpAddressFamilyL2vpnResult> Invoke(GetBgpAddressFamilyL2vpnInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetBgpAddressFamilyL2vpnResult>("iosxe:index/getBgpAddressFamilyL2vpn:getBgpAddressFamilyL2vpn", args ?? new GetBgpAddressFamilyL2vpnInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetBgpAddressFamilyL2vpnArgs : global::Pulumi.InvokeArgs
    {
        [Input("afName", required: true)]
        public string AfName { get; set; } = null!;

        [Input("asn", required: true)]
        public string Asn { get; set; } = null!;

        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public string? Device { get; set; }

        public GetBgpAddressFamilyL2vpnArgs()
        {
        }
        public static new GetBgpAddressFamilyL2vpnArgs Empty => new GetBgpAddressFamilyL2vpnArgs();
    }

    public sealed class GetBgpAddressFamilyL2vpnInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("afName", required: true)]
        public Input<string> AfName { get; set; } = null!;

        [Input("asn", required: true)]
        public Input<string> Asn { get; set; } = null!;

        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        public GetBgpAddressFamilyL2vpnInvokeArgs()
        {
        }
        public static new GetBgpAddressFamilyL2vpnInvokeArgs Empty => new GetBgpAddressFamilyL2vpnInvokeArgs();
    }


    [OutputType]
    public sealed class GetBgpAddressFamilyL2vpnResult
    {
        public readonly string AfName;
        public readonly string Asn;
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        public readonly string? Device;
        /// <summary>
        /// The path of the retrieved object.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetBgpAddressFamilyL2vpnResult(
            string afName,

            string asn,

            string? device,

            string id)
        {
            AfName = afName;
            Asn = asn;
            Device = device;
            Id = id;
        }
    }
}
