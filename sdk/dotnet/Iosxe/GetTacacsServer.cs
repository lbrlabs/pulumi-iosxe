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
    public static class GetTacacsServer
    {
        /// <summary>
        /// This data source can read the TACACS Server configuration.
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
        ///     var example = Iosxe.GetTacacsServer.Invoke(new()
        ///     {
        ///         Name = "tacacs_10.10.15.13",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetTacacsServerResult> InvokeAsync(GetTacacsServerArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTacacsServerResult>("iosxe:index/getTacacsServer:getTacacsServer", args ?? new GetTacacsServerArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the TACACS Server configuration.
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
        ///     var example = Iosxe.GetTacacsServer.Invoke(new()
        ///     {
        ///         Name = "tacacs_10.10.15.13",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetTacacsServerResult> Invoke(GetTacacsServerInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTacacsServerResult>("iosxe:index/getTacacsServer:getTacacsServer", args ?? new GetTacacsServerInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTacacsServerArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public string? Device { get; set; }

        /// <summary>
        /// Name for the tacacs server configuration
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetTacacsServerArgs()
        {
        }
        public static new GetTacacsServerArgs Empty => new GetTacacsServerArgs();
    }

    public sealed class GetTacacsServerInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// Name for the tacacs server configuration
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetTacacsServerInvokeArgs()
        {
        }
        public static new GetTacacsServerInvokeArgs Empty => new GetTacacsServerInvokeArgs();
    }


    [OutputType]
    public sealed class GetTacacsServerResult
    {
        /// <summary>
        /// IPv4 address or Hostname for tacacs server
        /// </summary>
        public readonly string AddressIpv4;
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        public readonly string? Device;
        /// <summary>
        /// The path of the retrieved object.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The UNENCRYPTED (cleartext) server key
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// Name for the tacacs server configuration
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Time to wait for this TACACS server to reply (overrides default)
        /// </summary>
        public readonly int Timeout;

        [OutputConstructor]
        private GetTacacsServerResult(
            string addressIpv4,

            string? device,

            string id,

            string key,

            string name,

            int timeout)
        {
            AddressIpv4 = addressIpv4;
            Device = device;
            Id = id;
            Key = key;
            Name = name;
            Timeout = timeout;
        }
    }
}
