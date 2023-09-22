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
    public static class GetMsdpVrf
    {
        /// <summary>
        /// This data source can read the MSDP VRF configuration.
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
        ///     var example = Iosxe.GetMsdpVrf.Invoke(new()
        ///     {
        ///         Vrf = "VRF1",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetMsdpVrfResult> InvokeAsync(GetMsdpVrfArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMsdpVrfResult>("iosxe:index/getMsdpVrf:getMsdpVrf", args ?? new GetMsdpVrfArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the MSDP VRF configuration.
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
        ///     var example = Iosxe.GetMsdpVrf.Invoke(new()
        ///     {
        ///         Vrf = "VRF1",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetMsdpVrfResult> Invoke(GetMsdpVrfInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMsdpVrfResult>("iosxe:index/getMsdpVrf:getMsdpVrf", args ?? new GetMsdpVrfInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMsdpVrfArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public string? Device { get; set; }

        [Input("vrf", required: true)]
        public string Vrf { get; set; } = null!;

        public GetMsdpVrfArgs()
        {
        }
        public static new GetMsdpVrfArgs Empty => new GetMsdpVrfArgs();
    }

    public sealed class GetMsdpVrfInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("vrf", required: true)]
        public Input<string> Vrf { get; set; } = null!;

        public GetMsdpVrfInvokeArgs()
        {
        }
        public static new GetMsdpVrfInvokeArgs Empty => new GetMsdpVrfInvokeArgs();
    }


    [OutputType]
    public sealed class GetMsdpVrfResult
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        public readonly string? Device;
        /// <summary>
        /// The path of the retrieved object.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Configure MSDP Originator ID
        /// </summary>
        public readonly string OriginatorId;
        /// <summary>
        /// MSDP peer on which the password is to be set
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMsdpVrfPasswordResult> Passwords;
        /// <summary>
        /// Configure an MSDP peer
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMsdpVrfPeerResult> Peers;
        public readonly string Vrf;

        [OutputConstructor]
        private GetMsdpVrfResult(
            string? device,

            string id,

            string originatorId,

            ImmutableArray<Outputs.GetMsdpVrfPasswordResult> passwords,

            ImmutableArray<Outputs.GetMsdpVrfPeerResult> peers,

            string vrf)
        {
            Device = device;
            Id = id;
            OriginatorId = originatorId;
            Passwords = passwords;
            Peers = peers;
            Vrf = vrf;
        }
    }
}