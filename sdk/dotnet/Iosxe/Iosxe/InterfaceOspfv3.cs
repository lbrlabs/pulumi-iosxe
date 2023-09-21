// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Iosxe.Iosxe
{
    [IosxeResourceType("iosxe:iosxe/interfaceOspfv3:InterfaceOspfv3")]
    public partial class InterfaceOspfv3 : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Static route cost value of the interface - Range: `1`-`65535`
        /// </summary>
        [Output("cost")]
        public Output<int?> Cost { get; private set; } = null!;

        /// <summary>
        /// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
        /// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
        /// Default value is `all`. - Choices: `all`, `attributes`
        /// </summary>
        [Output("deleteMode")]
        public Output<string?> DeleteMode { get; private set; } = null!;

        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Output("device")]
        public Output<string?> Device { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specify OSPF broadcast multi-access network
        /// </summary>
        [Output("networkTypeBroadcast")]
        public Output<bool?> NetworkTypeBroadcast { get; private set; } = null!;

        /// <summary>
        /// Specify OSPF NBMA network
        /// </summary>
        [Output("networkTypeNonBroadcast")]
        public Output<bool?> NetworkTypeNonBroadcast { get; private set; } = null!;

        /// <summary>
        /// Specify OSPF point-to-multipoint network
        /// </summary>
        [Output("networkTypePointToMultipoint")]
        public Output<bool?> NetworkTypePointToMultipoint { get; private set; } = null!;

        /// <summary>
        /// Specify OSPF point-to-point network
        /// </summary>
        [Output("networkTypePointToPoint")]
        public Output<bool?> NetworkTypePointToPoint { get; private set; } = null!;

        /// <summary>
        /// Interface type - Choices: `GigabitEthernet`, `TwoGigabitEthernet`, `FiveGigabitEthernet`, `TenGigabitEthernet`,
        /// `TwentyFiveGigE`, `FortyGigabitEthernet`, `HundredGigE`, `TwoHundredGigE`, `FourHundredGigE`, `Loopback`, `Vlan`,
        /// `Port-channel`
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a InterfaceOspfv3 resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InterfaceOspfv3(string name, InterfaceOspfv3Args args, CustomResourceOptions? options = null)
            : base("iosxe:iosxe/interfaceOspfv3:InterfaceOspfv3", name, args ?? new InterfaceOspfv3Args(), MakeResourceOptions(options, ""))
        {
        }

        private InterfaceOspfv3(string name, Input<string> id, InterfaceOspfv3State? state = null, CustomResourceOptions? options = null)
            : base("iosxe:iosxe/interfaceOspfv3:InterfaceOspfv3", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing InterfaceOspfv3 resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static InterfaceOspfv3 Get(string name, Input<string> id, InterfaceOspfv3State? state = null, CustomResourceOptions? options = null)
        {
            return new InterfaceOspfv3(name, id, state, options);
        }
    }

    public sealed class InterfaceOspfv3Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Static route cost value of the interface - Range: `1`-`65535`
        /// </summary>
        [Input("cost")]
        public Input<int>? Cost { get; set; }

        /// <summary>
        /// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
        /// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
        /// Default value is `all`. - Choices: `all`, `attributes`
        /// </summary>
        [Input("deleteMode")]
        public Input<string>? DeleteMode { get; set; }

        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specify OSPF broadcast multi-access network
        /// </summary>
        [Input("networkTypeBroadcast")]
        public Input<bool>? NetworkTypeBroadcast { get; set; }

        /// <summary>
        /// Specify OSPF NBMA network
        /// </summary>
        [Input("networkTypeNonBroadcast")]
        public Input<bool>? NetworkTypeNonBroadcast { get; set; }

        /// <summary>
        /// Specify OSPF point-to-multipoint network
        /// </summary>
        [Input("networkTypePointToMultipoint")]
        public Input<bool>? NetworkTypePointToMultipoint { get; set; }

        /// <summary>
        /// Specify OSPF point-to-point network
        /// </summary>
        [Input("networkTypePointToPoint")]
        public Input<bool>? NetworkTypePointToPoint { get; set; }

        /// <summary>
        /// Interface type - Choices: `GigabitEthernet`, `TwoGigabitEthernet`, `FiveGigabitEthernet`, `TenGigabitEthernet`,
        /// `TwentyFiveGigE`, `FortyGigabitEthernet`, `HundredGigE`, `TwoHundredGigE`, `FourHundredGigE`, `Loopback`, `Vlan`,
        /// `Port-channel`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public InterfaceOspfv3Args()
        {
        }
        public static new InterfaceOspfv3Args Empty => new InterfaceOspfv3Args();
    }

    public sealed class InterfaceOspfv3State : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Static route cost value of the interface - Range: `1`-`65535`
        /// </summary>
        [Input("cost")]
        public Input<int>? Cost { get; set; }

        /// <summary>
        /// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
        /// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
        /// Default value is `all`. - Choices: `all`, `attributes`
        /// </summary>
        [Input("deleteMode")]
        public Input<string>? DeleteMode { get; set; }

        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specify OSPF broadcast multi-access network
        /// </summary>
        [Input("networkTypeBroadcast")]
        public Input<bool>? NetworkTypeBroadcast { get; set; }

        /// <summary>
        /// Specify OSPF NBMA network
        /// </summary>
        [Input("networkTypeNonBroadcast")]
        public Input<bool>? NetworkTypeNonBroadcast { get; set; }

        /// <summary>
        /// Specify OSPF point-to-multipoint network
        /// </summary>
        [Input("networkTypePointToMultipoint")]
        public Input<bool>? NetworkTypePointToMultipoint { get; set; }

        /// <summary>
        /// Specify OSPF point-to-point network
        /// </summary>
        [Input("networkTypePointToPoint")]
        public Input<bool>? NetworkTypePointToPoint { get; set; }

        /// <summary>
        /// Interface type - Choices: `GigabitEthernet`, `TwoGigabitEthernet`, `FiveGigabitEthernet`, `TenGigabitEthernet`,
        /// `TwentyFiveGigE`, `FortyGigabitEthernet`, `HundredGigE`, `TwoHundredGigE`, `FourHundredGigE`, `Loopback`, `Vlan`,
        /// `Port-channel`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public InterfaceOspfv3State()
        {
        }
        public static new InterfaceOspfv3State Empty => new InterfaceOspfv3State();
    }
}
