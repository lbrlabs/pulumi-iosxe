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
    public static class GetAaa
    {
        /// <summary>
        /// This data source can read the AAA configuration.
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
        ///     var example = Iosxe.GetAaa.Invoke();
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAaaResult> InvokeAsync(GetAaaArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAaaResult>("iosxe:index/getAaa:getAaa", args ?? new GetAaaArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the AAA configuration.
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
        ///     var example = Iosxe.GetAaa.Invoke();
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetAaaResult> Invoke(GetAaaInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAaaResult>("iosxe:index/getAaa:getAaa", args ?? new GetAaaInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAaaArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public string? Device { get; set; }

        public GetAaaArgs()
        {
        }
        public static new GetAaaArgs Empty => new GetAaaArgs();
    }

    public sealed class GetAaaInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        public GetAaaInvokeArgs()
        {
        }
        public static new GetAaaInvokeArgs Empty => new GetAaaInvokeArgs();
    }


    [OutputType]
    public sealed class GetAaaResult
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        public readonly string? Device;
        /// <summary>
        /// Radius server-group definition
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAaaGroupServerRadiusResult> GroupServerRadii;
        /// <summary>
        /// Tacacs+ server-group definition
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAaaGroupServerTacacsplusResult> GroupServerTacacspluses;
        /// <summary>
        /// The path of the retrieved object.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Enable NEW access control commands and functions.(Disables OLD commands.)
        /// </summary>
        public readonly bool NewModel;
        /// <summary>
        /// Local server profile for RFC 3576 support
        /// </summary>
        public readonly bool ServerRadiusDynamicAuthor;
        /// <summary>
        /// Specify a RADIUS client
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAaaServerRadiusDynamicAuthorClientResult> ServerRadiusDynamicAuthorClients;
        /// <summary>
        /// AAA Session ID
        /// </summary>
        public readonly string SessionId;

        [OutputConstructor]
        private GetAaaResult(
            string? device,

            ImmutableArray<Outputs.GetAaaGroupServerRadiusResult> groupServerRadii,

            ImmutableArray<Outputs.GetAaaGroupServerTacacsplusResult> groupServerTacacspluses,

            string id,

            bool newModel,

            bool serverRadiusDynamicAuthor,

            ImmutableArray<Outputs.GetAaaServerRadiusDynamicAuthorClientResult> serverRadiusDynamicAuthorClients,

            string sessionId)
        {
            Device = device;
            GroupServerRadii = groupServerRadii;
            GroupServerTacacspluses = groupServerTacacspluses;
            Id = id;
            NewModel = newModel;
            ServerRadiusDynamicAuthor = serverRadiusDynamicAuthor;
            ServerRadiusDynamicAuthorClients = serverRadiusDynamicAuthorClients;
            SessionId = sessionId;
        }
    }
}