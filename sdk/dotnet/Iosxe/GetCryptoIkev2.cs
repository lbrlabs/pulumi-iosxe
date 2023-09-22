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
    public static class GetCryptoIkev2
    {
        /// <summary>
        /// This data source can read the Crypto IKEv2 configuration.
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
        ///     var example = Iosxe.GetCryptoIkev2.Invoke();
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetCryptoIkev2Result> InvokeAsync(GetCryptoIkev2Args? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCryptoIkev2Result>("iosxe:index/getCryptoIkev2:getCryptoIkev2", args ?? new GetCryptoIkev2Args(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Crypto IKEv2 configuration.
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
        ///     var example = Iosxe.GetCryptoIkev2.Invoke();
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetCryptoIkev2Result> Invoke(GetCryptoIkev2InvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCryptoIkev2Result>("iosxe:index/getCryptoIkev2:getCryptoIkev2", args ?? new GetCryptoIkev2InvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCryptoIkev2Args : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public string? Device { get; set; }

        public GetCryptoIkev2Args()
        {
        }
        public static new GetCryptoIkev2Args Empty => new GetCryptoIkev2Args();
    }

    public sealed class GetCryptoIkev2InvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        public GetCryptoIkev2InvokeArgs()
        {
        }
        public static new GetCryptoIkev2InvokeArgs Empty => new GetCryptoIkev2InvokeArgs();
    }


    [OutputType]
    public sealed class GetCryptoIkev2Result
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        public readonly string? Device;
        /// <summary>
        /// Enable IKE liveness check for peers
        /// </summary>
        public readonly int Dpd;
        public readonly string DpdQuery;
        public readonly int DpdRetryInterval;
        /// <summary>
        /// The path of the retrieved object.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Set NAT keepalive interval
        /// </summary>
        public readonly int NatKeepalive;

        [OutputConstructor]
        private GetCryptoIkev2Result(
            string? device,

            int dpd,

            string dpdQuery,

            int dpdRetryInterval,

            string id,

            int natKeepalive)
        {
            Device = device;
            Dpd = dpd;
            DpdQuery = dpdQuery;
            DpdRetryInterval = dpdRetryInterval;
            Id = id;
            NatKeepalive = natKeepalive;
        }
    }
}