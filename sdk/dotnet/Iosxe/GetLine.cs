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
    public static class GetLine
    {
        /// <summary>
        /// This data source can read the Line configuration.
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
        ///     var example = Iosxe.GetLine.Invoke();
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetLineResult> InvokeAsync(GetLineArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLineResult>("iosxe:index/getLine:getLine", args ?? new GetLineArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Line configuration.
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
        ///     var example = Iosxe.GetLine.Invoke();
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetLineResult> Invoke(GetLineInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLineResult>("iosxe:index/getLine:getLine", args ?? new GetLineInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLineArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public string? Device { get; set; }

        public GetLineArgs()
        {
        }
        public static new GetLineArgs Empty => new GetLineArgs();
    }

    public sealed class GetLineInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        public GetLineInvokeArgs()
        {
        }
        public static new GetLineInvokeArgs Empty => new GetLineInvokeArgs();
    }


    [OutputType]
    public sealed class GetLineResult
    {
        /// <summary>
        /// Primary terminal line
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLineConsoleResult> Consoles;
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        public readonly string? Device;
        /// <summary>
        /// The path of the retrieved object.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Virtual terminal
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLineVtyResult> Vties;

        [OutputConstructor]
        private GetLineResult(
            ImmutableArray<Outputs.GetLineConsoleResult> consoles,

            string? device,

            string id,

            ImmutableArray<Outputs.GetLineVtyResult> vties)
        {
            Consoles = consoles;
            Device = device;
            Id = id;
            Vties = vties;
        }
    }
}