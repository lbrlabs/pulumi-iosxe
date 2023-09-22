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
    public static class GetVlanConfiguration
    {
        /// <summary>
        /// This data source can read the VLAN Configuration configuration.
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
        ///     var example = Iosxe.GetVlanConfiguration.Invoke(new()
        ///     {
        ///         VlanId = 123,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetVlanConfigurationResult> InvokeAsync(GetVlanConfigurationArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVlanConfigurationResult>("iosxe:index/getVlanConfiguration:getVlanConfiguration", args ?? new GetVlanConfigurationArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the VLAN Configuration configuration.
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
        ///     var example = Iosxe.GetVlanConfiguration.Invoke(new()
        ///     {
        ///         VlanId = 123,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetVlanConfigurationResult> Invoke(GetVlanConfigurationInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVlanConfigurationResult>("iosxe:index/getVlanConfiguration:getVlanConfiguration", args ?? new GetVlanConfigurationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVlanConfigurationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public string? Device { get; set; }

        /// <summary>
        /// VLAN ID List Eg. 1-10,15
        /// </summary>
        [Input("vlanId", required: true)]
        public int VlanId { get; set; }

        public GetVlanConfigurationArgs()
        {
        }
        public static new GetVlanConfigurationArgs Empty => new GetVlanConfigurationArgs();
    }

    public sealed class GetVlanConfigurationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// VLAN ID List Eg. 1-10,15
        /// </summary>
        [Input("vlanId", required: true)]
        public Input<int> VlanId { get; set; } = null!;

        public GetVlanConfigurationInvokeArgs()
        {
        }
        public static new GetVlanConfigurationInvokeArgs Empty => new GetVlanConfigurationInvokeArgs();
    }


    [OutputType]
    public sealed class GetVlanConfigurationResult
    {
        /// <summary>
        /// Enter VFI name
        /// </summary>
        public readonly string AccessVfi;
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        public readonly string? Device;
        public readonly int EvpnInstance;
        /// <summary>
        /// VxLAN VNI value
        /// </summary>
        public readonly int EvpnInstanceVni;
        /// <summary>
        /// The path of the retrieved object.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// VLAN ID List Eg. 1-10,15
        /// </summary>
        public readonly int VlanId;
        /// <summary>
        /// VxLAN VNI value
        /// </summary>
        public readonly int Vni;

        [OutputConstructor]
        private GetVlanConfigurationResult(
            string accessVfi,

            string? device,

            int evpnInstance,

            int evpnInstanceVni,

            string id,

            int vlanId,

            int vni)
        {
            AccessVfi = accessVfi;
            Device = device;
            EvpnInstance = evpnInstance;
            EvpnInstanceVni = evpnInstanceVni;
            Id = id;
            VlanId = vlanId;
            Vni = vni;
        }
    }
}