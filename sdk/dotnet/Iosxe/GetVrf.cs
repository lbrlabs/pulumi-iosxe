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
    public static class GetVrf
    {
        /// <summary>
        /// This data source can read the VRF configuration.
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
        ///     var example = Iosxe.GetVrf.Invoke(new()
        ///     {
        ///         Name = "VRF22",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetVrfResult> InvokeAsync(GetVrfArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVrfResult>("iosxe:index/getVrf:getVrf", args ?? new GetVrfArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the VRF configuration.
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
        ///     var example = Iosxe.GetVrf.Invoke(new()
        ///     {
        ///         Name = "VRF22",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetVrfResult> Invoke(GetVrfInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVrfResult>("iosxe:index/getVrf:getVrf", args ?? new GetVrfInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVrfArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public string? Device { get; set; }

        /// <summary>
        /// WORD;;VRF name
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetVrfArgs()
        {
        }
        public static new GetVrfArgs Empty => new GetVrfArgs();
    }

    public sealed class GetVrfInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// WORD;;VRF name
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetVrfInvokeArgs()
        {
        }
        public static new GetVrfInvokeArgs Empty => new GetVrfInvokeArgs();
    }


    [OutputType]
    public sealed class GetVrfResult
    {
        /// <summary>
        /// Address family
        /// </summary>
        public readonly bool AddressFamilyIpv4;
        /// <summary>
        /// Address family
        /// </summary>
        public readonly bool AddressFamilyIpv6;
        /// <summary>
        /// VRF specific description
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        public readonly string? Device;
        /// <summary>
        /// The path of the retrieved object.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Export Target-VPN community
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVrfIpv4RouteTargetExportStitchingResult> Ipv4RouteTargetExportStitchings;
        /// <summary>
        /// Export Target-VPN community
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVrfIpv4RouteTargetExportResult> Ipv4RouteTargetExports;
        /// <summary>
        /// Import Target-VPN community
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVrfIpv4RouteTargetImportStitchingResult> Ipv4RouteTargetImportStitchings;
        /// <summary>
        /// Import Target-VPN community
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVrfIpv4RouteTargetImportResult> Ipv4RouteTargetImports;
        /// <summary>
        /// Export Target-VPN community
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVrfIpv6RouteTargetExportStitchingResult> Ipv6RouteTargetExportStitchings;
        /// <summary>
        /// Export Target-VPN community
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVrfIpv6RouteTargetExportResult> Ipv6RouteTargetExports;
        /// <summary>
        /// Import Target-VPN community
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVrfIpv6RouteTargetImportStitchingResult> Ipv6RouteTargetImportStitchings;
        /// <summary>
        /// Import Target-VPN community
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVrfIpv6RouteTargetImportResult> Ipv6RouteTargetImports;
        /// <summary>
        /// WORD;;VRF name
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Specify Route Distinguisher
        /// </summary>
        public readonly string Rd;
        /// <summary>
        /// Export Target-VPN community
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVrfRouteTargetExportResult> RouteTargetExports;
        /// <summary>
        /// Import Target-VPN community
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVrfRouteTargetImportResult> RouteTargetImports;
        /// <summary>
        /// Configure VPN ID in rfc2685 format
        /// </summary>
        public readonly string VpnId;

        [OutputConstructor]
        private GetVrfResult(
            bool addressFamilyIpv4,

            bool addressFamilyIpv6,

            string description,

            string? device,

            string id,

            ImmutableArray<Outputs.GetVrfIpv4RouteTargetExportStitchingResult> ipv4RouteTargetExportStitchings,

            ImmutableArray<Outputs.GetVrfIpv4RouteTargetExportResult> ipv4RouteTargetExports,

            ImmutableArray<Outputs.GetVrfIpv4RouteTargetImportStitchingResult> ipv4RouteTargetImportStitchings,

            ImmutableArray<Outputs.GetVrfIpv4RouteTargetImportResult> ipv4RouteTargetImports,

            ImmutableArray<Outputs.GetVrfIpv6RouteTargetExportStitchingResult> ipv6RouteTargetExportStitchings,

            ImmutableArray<Outputs.GetVrfIpv6RouteTargetExportResult> ipv6RouteTargetExports,

            ImmutableArray<Outputs.GetVrfIpv6RouteTargetImportStitchingResult> ipv6RouteTargetImportStitchings,

            ImmutableArray<Outputs.GetVrfIpv6RouteTargetImportResult> ipv6RouteTargetImports,

            string name,

            string rd,

            ImmutableArray<Outputs.GetVrfRouteTargetExportResult> routeTargetExports,

            ImmutableArray<Outputs.GetVrfRouteTargetImportResult> routeTargetImports,

            string vpnId)
        {
            AddressFamilyIpv4 = addressFamilyIpv4;
            AddressFamilyIpv6 = addressFamilyIpv6;
            Description = description;
            Device = device;
            Id = id;
            Ipv4RouteTargetExportStitchings = ipv4RouteTargetExportStitchings;
            Ipv4RouteTargetExports = ipv4RouteTargetExports;
            Ipv4RouteTargetImportStitchings = ipv4RouteTargetImportStitchings;
            Ipv4RouteTargetImports = ipv4RouteTargetImports;
            Ipv6RouteTargetExportStitchings = ipv6RouteTargetExportStitchings;
            Ipv6RouteTargetExports = ipv6RouteTargetExports;
            Ipv6RouteTargetImportStitchings = ipv6RouteTargetImportStitchings;
            Ipv6RouteTargetImports = ipv6RouteTargetImports;
            Name = name;
            Rd = rd;
            RouteTargetExports = routeTargetExports;
            RouteTargetImports = routeTargetImports;
            VpnId = vpnId;
        }
    }
}