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
    /// This resource can manage the BGP Address Family IPv4 configuration.
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import iosxe:index/bgpAddressFamilyIpv4:BgpAddressFamilyIpv4 example "Cisco-IOS-XE-native:native/router/Cisco-IOS-XE-bgp:bgp=65000/address-family/no-vrf/ipv4=unicast"
    /// ```
    /// </summary>
    [IosxeResourceType("iosxe:index/bgpAddressFamilyIpv4:BgpAddressFamilyIpv4")]
    public partial class BgpAddressFamilyIpv4 : global::Pulumi.CustomResource
    {
        /// <summary>
        /// - Choices: `flowspec`, `labeled-unicast`, `mdt`, `multicast`, `mvpn`, `sr-policy`, `tunnel`, `unicast`
        /// </summary>
        [Output("afName")]
        public Output<string> AfName { get; private set; } = null!;

        [Output("asn")]
        public Output<string> Asn { get; private set; } = null!;

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
        /// Specify a network to announce via BGP
        /// </summary>
        [Output("ipv4UnicastNetworks")]
        public Output<ImmutableArray<Outputs.BgpAddressFamilyIpv4Ipv4UnicastNetwork>> Ipv4UnicastNetworks { get; private set; } = null!;

        /// <summary>
        /// Specify a network to announce via BGP
        /// </summary>
        [Output("ipv4UnicastNetworksMasks")]
        public Output<ImmutableArray<Outputs.BgpAddressFamilyIpv4Ipv4UnicastNetworksMask>> Ipv4UnicastNetworksMasks { get; private set; } = null!;

        /// <summary>
        /// Connected
        /// </summary>
        [Output("ipv4UnicastRedistributeConnected")]
        public Output<bool?> Ipv4UnicastRedistributeConnected { get; private set; } = null!;

        /// <summary>
        /// Static routes
        /// </summary>
        [Output("ipv4UnicastRedistributeStatic")]
        public Output<bool?> Ipv4UnicastRedistributeStatic { get; private set; } = null!;


        /// <summary>
        /// Create a BgpAddressFamilyIpv4 resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BgpAddressFamilyIpv4(string name, BgpAddressFamilyIpv4Args args, CustomResourceOptions? options = null)
            : base("iosxe:index/bgpAddressFamilyIpv4:BgpAddressFamilyIpv4", name, args ?? new BgpAddressFamilyIpv4Args(), MakeResourceOptions(options, ""))
        {
        }

        private BgpAddressFamilyIpv4(string name, Input<string> id, BgpAddressFamilyIpv4State? state = null, CustomResourceOptions? options = null)
            : base("iosxe:index/bgpAddressFamilyIpv4:BgpAddressFamilyIpv4", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BgpAddressFamilyIpv4 resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BgpAddressFamilyIpv4 Get(string name, Input<string> id, BgpAddressFamilyIpv4State? state = null, CustomResourceOptions? options = null)
        {
            return new BgpAddressFamilyIpv4(name, id, state, options);
        }
    }

    public sealed class BgpAddressFamilyIpv4Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// - Choices: `flowspec`, `labeled-unicast`, `mdt`, `multicast`, `mvpn`, `sr-policy`, `tunnel`, `unicast`
        /// </summary>
        [Input("afName", required: true)]
        public Input<string> AfName { get; set; } = null!;

        [Input("asn", required: true)]
        public Input<string> Asn { get; set; } = null!;

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

        [Input("ipv4UnicastNetworks")]
        private InputList<Inputs.BgpAddressFamilyIpv4Ipv4UnicastNetworkArgs>? _ipv4UnicastNetworks;

        /// <summary>
        /// Specify a network to announce via BGP
        /// </summary>
        public InputList<Inputs.BgpAddressFamilyIpv4Ipv4UnicastNetworkArgs> Ipv4UnicastNetworks
        {
            get => _ipv4UnicastNetworks ?? (_ipv4UnicastNetworks = new InputList<Inputs.BgpAddressFamilyIpv4Ipv4UnicastNetworkArgs>());
            set => _ipv4UnicastNetworks = value;
        }

        [Input("ipv4UnicastNetworksMasks")]
        private InputList<Inputs.BgpAddressFamilyIpv4Ipv4UnicastNetworksMaskArgs>? _ipv4UnicastNetworksMasks;

        /// <summary>
        /// Specify a network to announce via BGP
        /// </summary>
        public InputList<Inputs.BgpAddressFamilyIpv4Ipv4UnicastNetworksMaskArgs> Ipv4UnicastNetworksMasks
        {
            get => _ipv4UnicastNetworksMasks ?? (_ipv4UnicastNetworksMasks = new InputList<Inputs.BgpAddressFamilyIpv4Ipv4UnicastNetworksMaskArgs>());
            set => _ipv4UnicastNetworksMasks = value;
        }

        /// <summary>
        /// Connected
        /// </summary>
        [Input("ipv4UnicastRedistributeConnected")]
        public Input<bool>? Ipv4UnicastRedistributeConnected { get; set; }

        /// <summary>
        /// Static routes
        /// </summary>
        [Input("ipv4UnicastRedistributeStatic")]
        public Input<bool>? Ipv4UnicastRedistributeStatic { get; set; }

        public BgpAddressFamilyIpv4Args()
        {
        }
        public static new BgpAddressFamilyIpv4Args Empty => new BgpAddressFamilyIpv4Args();
    }

    public sealed class BgpAddressFamilyIpv4State : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// - Choices: `flowspec`, `labeled-unicast`, `mdt`, `multicast`, `mvpn`, `sr-policy`, `tunnel`, `unicast`
        /// </summary>
        [Input("afName")]
        public Input<string>? AfName { get; set; }

        [Input("asn")]
        public Input<string>? Asn { get; set; }

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

        [Input("ipv4UnicastNetworks")]
        private InputList<Inputs.BgpAddressFamilyIpv4Ipv4UnicastNetworkGetArgs>? _ipv4UnicastNetworks;

        /// <summary>
        /// Specify a network to announce via BGP
        /// </summary>
        public InputList<Inputs.BgpAddressFamilyIpv4Ipv4UnicastNetworkGetArgs> Ipv4UnicastNetworks
        {
            get => _ipv4UnicastNetworks ?? (_ipv4UnicastNetworks = new InputList<Inputs.BgpAddressFamilyIpv4Ipv4UnicastNetworkGetArgs>());
            set => _ipv4UnicastNetworks = value;
        }

        [Input("ipv4UnicastNetworksMasks")]
        private InputList<Inputs.BgpAddressFamilyIpv4Ipv4UnicastNetworksMaskGetArgs>? _ipv4UnicastNetworksMasks;

        /// <summary>
        /// Specify a network to announce via BGP
        /// </summary>
        public InputList<Inputs.BgpAddressFamilyIpv4Ipv4UnicastNetworksMaskGetArgs> Ipv4UnicastNetworksMasks
        {
            get => _ipv4UnicastNetworksMasks ?? (_ipv4UnicastNetworksMasks = new InputList<Inputs.BgpAddressFamilyIpv4Ipv4UnicastNetworksMaskGetArgs>());
            set => _ipv4UnicastNetworksMasks = value;
        }

        /// <summary>
        /// Connected
        /// </summary>
        [Input("ipv4UnicastRedistributeConnected")]
        public Input<bool>? Ipv4UnicastRedistributeConnected { get; set; }

        /// <summary>
        /// Static routes
        /// </summary>
        [Input("ipv4UnicastRedistributeStatic")]
        public Input<bool>? Ipv4UnicastRedistributeStatic { get; set; }

        public BgpAddressFamilyIpv4State()
        {
        }
        public static new BgpAddressFamilyIpv4State Empty => new BgpAddressFamilyIpv4State();
    }
}
