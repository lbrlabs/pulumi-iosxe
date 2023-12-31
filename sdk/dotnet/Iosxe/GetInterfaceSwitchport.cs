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
    public static class GetInterfaceSwitchport
    {
        /// <summary>
        /// This data source can read the Interface Switchport configuration.
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
        ///     var example = Iosxe.GetInterfaceSwitchport.Invoke(new()
        ///     {
        ///         Name = "1/0/3",
        ///         Type = "GigabitEthernet",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetInterfaceSwitchportResult> InvokeAsync(GetInterfaceSwitchportArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInterfaceSwitchportResult>("iosxe:index/getInterfaceSwitchport:getInterfaceSwitchport", args ?? new GetInterfaceSwitchportArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can read the Interface Switchport configuration.
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
        ///     var example = Iosxe.GetInterfaceSwitchport.Invoke(new()
        ///     {
        ///         Name = "1/0/3",
        ///         Type = "GigabitEthernet",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetInterfaceSwitchportResult> Invoke(GetInterfaceSwitchportInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInterfaceSwitchportResult>("iosxe:index/getInterfaceSwitchport:getInterfaceSwitchport", args ?? new GetInterfaceSwitchportInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInterfaceSwitchportArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public string? Device { get; set; }

        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// Interface type
        /// </summary>
        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        public GetInterfaceSwitchportArgs()
        {
        }
        public static new GetInterfaceSwitchportArgs Empty => new GetInterfaceSwitchportArgs();
    }

    public sealed class GetInterfaceSwitchportInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Interface type
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public GetInterfaceSwitchportInvokeArgs()
        {
        }
        public static new GetInterfaceSwitchportInvokeArgs Empty => new GetInterfaceSwitchportInvokeArgs();
    }


    [OutputType]
    public sealed class GetInterfaceSwitchportResult
    {
        public readonly string AccessVlan;
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        public readonly string? Device;
        /// <summary>
        /// Set port host
        /// </summary>
        public readonly bool Host;
        /// <summary>
        /// The path of the retrieved object.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Set trunking mode to ACCESS unconditionally
        /// </summary>
        public readonly bool ModeAccess;
        /// <summary>
        /// set trunking mode to TUNNEL unconditionally
        /// </summary>
        public readonly bool ModeDot1qTunnel;
        /// <summary>
        /// Set the mode to private-vlan host
        /// </summary>
        public readonly bool ModePrivateVlanHost;
        /// <summary>
        /// Set the mode to private-vlan promiscuous
        /// </summary>
        public readonly bool ModePrivateVlanPromiscuous;
        /// <summary>
        /// Set the mode to private-vlan trunk
        /// </summary>
        public readonly bool ModePrivateVlanTrunk;
        /// <summary>
        /// Set trunking mode to TRUNK unconditionally
        /// </summary>
        public readonly bool ModeTrunk;
        public readonly string Name;
        /// <summary>
        /// Device will not engage in negotiation protocol on this interface
        /// </summary>
        public readonly bool Nonegotiate;
        public readonly string TrunkAllowedVlans;
        /// <summary>
        /// no VLANs
        /// </summary>
        public readonly bool TrunkAllowedVlansNone;
        public readonly int TrunkNativeVlan;
        public readonly bool TrunkNativeVlanTag;
        /// <summary>
        /// Interface type
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetInterfaceSwitchportResult(
            string accessVlan,

            string? device,

            bool host,

            string id,

            bool modeAccess,

            bool modeDot1qTunnel,

            bool modePrivateVlanHost,

            bool modePrivateVlanPromiscuous,

            bool modePrivateVlanTrunk,

            bool modeTrunk,

            string name,

            bool nonegotiate,

            string trunkAllowedVlans,

            bool trunkAllowedVlansNone,

            int trunkNativeVlan,

            bool trunkNativeVlanTag,

            string type)
        {
            AccessVlan = accessVlan;
            Device = device;
            Host = host;
            Id = id;
            ModeAccess = modeAccess;
            ModeDot1qTunnel = modeDot1qTunnel;
            ModePrivateVlanHost = modePrivateVlanHost;
            ModePrivateVlanPromiscuous = modePrivateVlanPromiscuous;
            ModePrivateVlanTrunk = modePrivateVlanTrunk;
            ModeTrunk = modeTrunk;
            Name = name;
            Nonegotiate = nonegotiate;
            TrunkAllowedVlans = trunkAllowedVlans;
            TrunkAllowedVlansNone = trunkAllowedVlansNone;
            TrunkNativeVlan = trunkNativeVlan;
            TrunkNativeVlanTag = trunkNativeVlanTag;
            Type = type;
        }
    }
}
