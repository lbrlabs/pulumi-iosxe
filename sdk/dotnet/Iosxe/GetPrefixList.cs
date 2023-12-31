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
    public static class GetPrefixList
    {
        /// <summary>
        /// This data source can read the Prefix List configuration.
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
        ///     var example = Iosxe.GetPrefixList.Invoke();
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetPrefixListResult> InvokeAsync(GetPrefixListArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPrefixListResult>("iosxe:index/getPrefixList:getPrefixList", args ?? new GetPrefixListArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Prefix List configuration.
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
        ///     var example = Iosxe.GetPrefixList.Invoke();
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetPrefixListResult> Invoke(GetPrefixListInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPrefixListResult>("iosxe:index/getPrefixList:getPrefixList", args ?? new GetPrefixListInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPrefixListArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public string? Device { get; set; }

        public GetPrefixListArgs()
        {
        }
        public static new GetPrefixListArgs Empty => new GetPrefixListArgs();
    }

    public sealed class GetPrefixListInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
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
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        public readonly string? Device;
        /// <summary>
        /// The path of the retrieved object.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Build prefix-lists with name ans seq.no
        /// </summary>
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
