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
    /// <summary>
    /// This resource can manage the OSPF VRF configuration.
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import iosxe:index/ospfVrf:OspfVrf example "Cisco-IOS-XE-native:native/router/Cisco-IOS-XE-ospf:router-ospf/ospf/process-id-vrf=2,VRF1"
    /// ```
    /// </summary>
    [IosxeResourceType("iosxe:index/ospfVrf:OspfVrf")]
    public partial class OspfVrf : global::Pulumi.CustomResource
    {
        /// <summary>
        /// OSPF area parameters
        /// </summary>
        [Output("areas")]
        public Output<ImmutableArray<Outputs.OspfVrfArea>> Areas { get; private set; } = null!;

        /// <summary>
        /// Enable BFD on all interfaces
        /// </summary>
        [Output("bfdAllInterfaces")]
        public Output<bool?> BfdAllInterfaces { get; private set; } = null!;

        /// <summary>
        /// Distribute a default route
        /// </summary>
        [Output("defaultInformationOriginate")]
        public Output<bool?> DefaultInformationOriginate { get; private set; } = null!;

        /// <summary>
        /// Always advertise default route
        /// </summary>
        [Output("defaultInformationOriginateAlways")]
        public Output<bool?> DefaultInformationOriginateAlways { get; private set; } = null!;

        /// <summary>
        /// Set metric of redistributed routes - Range: `1`-`16777214`
        /// </summary>
        [Output("defaultMetric")]
        public Output<int?> DefaultMetric { get; private set; } = null!;

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

        /// <summary>
        /// Administrative distance - Range: `1`-`255`
        /// </summary>
        [Output("distance")]
        public Output<int?> Distance { get; private set; } = null!;

        /// <summary>
        /// OSPF domain-tag - Range: `1`-`4294967295`
        /// </summary>
        [Output("domainTag")]
        public Output<int?> DomainTag { get; private set; } = null!;

        /// <summary>
        /// Configure LDP automatic configuration
        /// </summary>
        [Output("mplsLdpAutoconfig")]
        public Output<bool?> MplsLdpAutoconfig { get; private set; } = null!;

        /// <summary>
        /// Configure LDP-IGP Synchronization
        /// </summary>
        [Output("mplsLdpSync")]
        public Output<bool?> MplsLdpSync { get; private set; } = null!;

        /// <summary>
        /// Specify a neighbor router
        /// </summary>
        [Output("neighbors")]
        public Output<ImmutableArray<Outputs.OspfVrfNeighbor>> Neighbors { get; private set; } = null!;

        /// <summary>
        /// Enable routing on an IP network
        /// </summary>
        [Output("networks")]
        public Output<ImmutableArray<Outputs.OspfVrfNetwork>> Networks { get; private set; } = null!;

        /// <summary>
        /// Suppress routing updates on all interfaces
        /// </summary>
        [Output("passiveInterfaceDefault")]
        public Output<bool?> PassiveInterfaceDefault { get; private set; } = null!;

        /// <summary>
        /// OSPF topology priority - Range: `0`-`127`
        /// </summary>
        [Output("priority")]
        public Output<int?> Priority { get; private set; } = null!;

        /// <summary>
        /// Process ID - Range: `1`-`65535`
        /// </summary>
        [Output("processId")]
        public Output<int> ProcessId { get; private set; } = null!;

        /// <summary>
        /// Override configured router identifier (peers will reset)
        /// </summary>
        [Output("routerId")]
        public Output<string?> RouterId { get; private set; } = null!;

        /// <summary>
        /// Shutdown the OSPF protocol under the current instance
        /// </summary>
        [Output("shutdown")]
        public Output<bool?> Shutdown { get; private set; } = null!;

        /// <summary>
        /// Configure IP address summaries
        /// </summary>
        [Output("summaryAddresses")]
        public Output<ImmutableArray<Outputs.OspfVrfSummaryAddress>> SummaryAddresses { get; private set; } = null!;

        /// <summary>
        /// VPN Routing/Forwarding Instance
        /// </summary>
        [Output("vrf")]
        public Output<string> Vrf { get; private set; } = null!;


        /// <summary>
        /// Create a OspfVrf resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OspfVrf(string name, OspfVrfArgs args, CustomResourceOptions? options = null)
            : base("iosxe:index/ospfVrf:OspfVrf", name, args ?? new OspfVrfArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OspfVrf(string name, Input<string> id, OspfVrfState? state = null, CustomResourceOptions? options = null)
            : base("iosxe:index/ospfVrf:OspfVrf", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OspfVrf resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OspfVrf Get(string name, Input<string> id, OspfVrfState? state = null, CustomResourceOptions? options = null)
        {
            return new OspfVrf(name, id, state, options);
        }
    }

    public sealed class OspfVrfArgs : global::Pulumi.ResourceArgs
    {
        [Input("areas")]
        private InputList<Inputs.OspfVrfAreaArgs>? _areas;

        /// <summary>
        /// OSPF area parameters
        /// </summary>
        public InputList<Inputs.OspfVrfAreaArgs> Areas
        {
            get => _areas ?? (_areas = new InputList<Inputs.OspfVrfAreaArgs>());
            set => _areas = value;
        }

        /// <summary>
        /// Enable BFD on all interfaces
        /// </summary>
        [Input("bfdAllInterfaces")]
        public Input<bool>? BfdAllInterfaces { get; set; }

        /// <summary>
        /// Distribute a default route
        /// </summary>
        [Input("defaultInformationOriginate")]
        public Input<bool>? DefaultInformationOriginate { get; set; }

        /// <summary>
        /// Always advertise default route
        /// </summary>
        [Input("defaultInformationOriginateAlways")]
        public Input<bool>? DefaultInformationOriginateAlways { get; set; }

        /// <summary>
        /// Set metric of redistributed routes - Range: `1`-`16777214`
        /// </summary>
        [Input("defaultMetric")]
        public Input<int>? DefaultMetric { get; set; }

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

        /// <summary>
        /// Administrative distance - Range: `1`-`255`
        /// </summary>
        [Input("distance")]
        public Input<int>? Distance { get; set; }

        /// <summary>
        /// OSPF domain-tag - Range: `1`-`4294967295`
        /// </summary>
        [Input("domainTag")]
        public Input<int>? DomainTag { get; set; }

        /// <summary>
        /// Configure LDP automatic configuration
        /// </summary>
        [Input("mplsLdpAutoconfig")]
        public Input<bool>? MplsLdpAutoconfig { get; set; }

        /// <summary>
        /// Configure LDP-IGP Synchronization
        /// </summary>
        [Input("mplsLdpSync")]
        public Input<bool>? MplsLdpSync { get; set; }

        [Input("neighbors")]
        private InputList<Inputs.OspfVrfNeighborArgs>? _neighbors;

        /// <summary>
        /// Specify a neighbor router
        /// </summary>
        public InputList<Inputs.OspfVrfNeighborArgs> Neighbors
        {
            get => _neighbors ?? (_neighbors = new InputList<Inputs.OspfVrfNeighborArgs>());
            set => _neighbors = value;
        }

        [Input("networks")]
        private InputList<Inputs.OspfVrfNetworkArgs>? _networks;

        /// <summary>
        /// Enable routing on an IP network
        /// </summary>
        public InputList<Inputs.OspfVrfNetworkArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.OspfVrfNetworkArgs>());
            set => _networks = value;
        }

        /// <summary>
        /// Suppress routing updates on all interfaces
        /// </summary>
        [Input("passiveInterfaceDefault")]
        public Input<bool>? PassiveInterfaceDefault { get; set; }

        /// <summary>
        /// OSPF topology priority - Range: `0`-`127`
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// Process ID - Range: `1`-`65535`
        /// </summary>
        [Input("processId", required: true)]
        public Input<int> ProcessId { get; set; } = null!;

        /// <summary>
        /// Override configured router identifier (peers will reset)
        /// </summary>
        [Input("routerId")]
        public Input<string>? RouterId { get; set; }

        /// <summary>
        /// Shutdown the OSPF protocol under the current instance
        /// </summary>
        [Input("shutdown")]
        public Input<bool>? Shutdown { get; set; }

        [Input("summaryAddresses")]
        private InputList<Inputs.OspfVrfSummaryAddressArgs>? _summaryAddresses;

        /// <summary>
        /// Configure IP address summaries
        /// </summary>
        public InputList<Inputs.OspfVrfSummaryAddressArgs> SummaryAddresses
        {
            get => _summaryAddresses ?? (_summaryAddresses = new InputList<Inputs.OspfVrfSummaryAddressArgs>());
            set => _summaryAddresses = value;
        }

        /// <summary>
        /// VPN Routing/Forwarding Instance
        /// </summary>
        [Input("vrf", required: true)]
        public Input<string> Vrf { get; set; } = null!;

        public OspfVrfArgs()
        {
        }
        public static new OspfVrfArgs Empty => new OspfVrfArgs();
    }

    public sealed class OspfVrfState : global::Pulumi.ResourceArgs
    {
        [Input("areas")]
        private InputList<Inputs.OspfVrfAreaGetArgs>? _areas;

        /// <summary>
        /// OSPF area parameters
        /// </summary>
        public InputList<Inputs.OspfVrfAreaGetArgs> Areas
        {
            get => _areas ?? (_areas = new InputList<Inputs.OspfVrfAreaGetArgs>());
            set => _areas = value;
        }

        /// <summary>
        /// Enable BFD on all interfaces
        /// </summary>
        [Input("bfdAllInterfaces")]
        public Input<bool>? BfdAllInterfaces { get; set; }

        /// <summary>
        /// Distribute a default route
        /// </summary>
        [Input("defaultInformationOriginate")]
        public Input<bool>? DefaultInformationOriginate { get; set; }

        /// <summary>
        /// Always advertise default route
        /// </summary>
        [Input("defaultInformationOriginateAlways")]
        public Input<bool>? DefaultInformationOriginateAlways { get; set; }

        /// <summary>
        /// Set metric of redistributed routes - Range: `1`-`16777214`
        /// </summary>
        [Input("defaultMetric")]
        public Input<int>? DefaultMetric { get; set; }

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

        /// <summary>
        /// Administrative distance - Range: `1`-`255`
        /// </summary>
        [Input("distance")]
        public Input<int>? Distance { get; set; }

        /// <summary>
        /// OSPF domain-tag - Range: `1`-`4294967295`
        /// </summary>
        [Input("domainTag")]
        public Input<int>? DomainTag { get; set; }

        /// <summary>
        /// Configure LDP automatic configuration
        /// </summary>
        [Input("mplsLdpAutoconfig")]
        public Input<bool>? MplsLdpAutoconfig { get; set; }

        /// <summary>
        /// Configure LDP-IGP Synchronization
        /// </summary>
        [Input("mplsLdpSync")]
        public Input<bool>? MplsLdpSync { get; set; }

        [Input("neighbors")]
        private InputList<Inputs.OspfVrfNeighborGetArgs>? _neighbors;

        /// <summary>
        /// Specify a neighbor router
        /// </summary>
        public InputList<Inputs.OspfVrfNeighborGetArgs> Neighbors
        {
            get => _neighbors ?? (_neighbors = new InputList<Inputs.OspfVrfNeighborGetArgs>());
            set => _neighbors = value;
        }

        [Input("networks")]
        private InputList<Inputs.OspfVrfNetworkGetArgs>? _networks;

        /// <summary>
        /// Enable routing on an IP network
        /// </summary>
        public InputList<Inputs.OspfVrfNetworkGetArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.OspfVrfNetworkGetArgs>());
            set => _networks = value;
        }

        /// <summary>
        /// Suppress routing updates on all interfaces
        /// </summary>
        [Input("passiveInterfaceDefault")]
        public Input<bool>? PassiveInterfaceDefault { get; set; }

        /// <summary>
        /// OSPF topology priority - Range: `0`-`127`
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// Process ID - Range: `1`-`65535`
        /// </summary>
        [Input("processId")]
        public Input<int>? ProcessId { get; set; }

        /// <summary>
        /// Override configured router identifier (peers will reset)
        /// </summary>
        [Input("routerId")]
        public Input<string>? RouterId { get; set; }

        /// <summary>
        /// Shutdown the OSPF protocol under the current instance
        /// </summary>
        [Input("shutdown")]
        public Input<bool>? Shutdown { get; set; }

        [Input("summaryAddresses")]
        private InputList<Inputs.OspfVrfSummaryAddressGetArgs>? _summaryAddresses;

        /// <summary>
        /// Configure IP address summaries
        /// </summary>
        public InputList<Inputs.OspfVrfSummaryAddressGetArgs> SummaryAddresses
        {
            get => _summaryAddresses ?? (_summaryAddresses = new InputList<Inputs.OspfVrfSummaryAddressGetArgs>());
            set => _summaryAddresses = value;
        }

        /// <summary>
        /// VPN Routing/Forwarding Instance
        /// </summary>
        [Input("vrf")]
        public Input<string>? Vrf { get; set; }

        public OspfVrfState()
        {
        }
        public static new OspfVrfState Empty => new OspfVrfState();
    }
}