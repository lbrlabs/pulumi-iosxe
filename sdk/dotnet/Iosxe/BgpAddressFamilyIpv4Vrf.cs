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
    /// This resource can manage the BGP Address Family IPv4 VRF configuration.
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import iosxe:index/bgpAddressFamilyIpv4Vrf:BgpAddressFamilyIpv4Vrf example "Cisco-IOS-XE-native:native/router/Cisco-IOS-XE-bgp:bgp=65000/address-family/with-vrf/ipv4=unicast"
    /// ```
    /// </summary>
    [IosxeResourceType("iosxe:index/bgpAddressFamilyIpv4Vrf:BgpAddressFamilyIpv4Vrf")]
    public partial class BgpAddressFamilyIpv4Vrf : global::Pulumi.CustomResource
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

        [Output("vrfs")]
        public Output<ImmutableArray<Outputs.BgpAddressFamilyIpv4VrfVrf>> Vrfs { get; private set; } = null!;


        /// <summary>
        /// Create a BgpAddressFamilyIpv4Vrf resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BgpAddressFamilyIpv4Vrf(string name, BgpAddressFamilyIpv4VrfArgs args, CustomResourceOptions? options = null)
            : base("iosxe:index/bgpAddressFamilyIpv4Vrf:BgpAddressFamilyIpv4Vrf", name, args ?? new BgpAddressFamilyIpv4VrfArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BgpAddressFamilyIpv4Vrf(string name, Input<string> id, BgpAddressFamilyIpv4VrfState? state = null, CustomResourceOptions? options = null)
            : base("iosxe:index/bgpAddressFamilyIpv4Vrf:BgpAddressFamilyIpv4Vrf", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BgpAddressFamilyIpv4Vrf resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BgpAddressFamilyIpv4Vrf Get(string name, Input<string> id, BgpAddressFamilyIpv4VrfState? state = null, CustomResourceOptions? options = null)
        {
            return new BgpAddressFamilyIpv4Vrf(name, id, state, options);
        }
    }

    public sealed class BgpAddressFamilyIpv4VrfArgs : global::Pulumi.ResourceArgs
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

        [Input("vrfs")]
        private InputList<Inputs.BgpAddressFamilyIpv4VrfVrfArgs>? _vrfs;
        public InputList<Inputs.BgpAddressFamilyIpv4VrfVrfArgs> Vrfs
        {
            get => _vrfs ?? (_vrfs = new InputList<Inputs.BgpAddressFamilyIpv4VrfVrfArgs>());
            set => _vrfs = value;
        }

        public BgpAddressFamilyIpv4VrfArgs()
        {
        }
        public static new BgpAddressFamilyIpv4VrfArgs Empty => new BgpAddressFamilyIpv4VrfArgs();
    }

    public sealed class BgpAddressFamilyIpv4VrfState : global::Pulumi.ResourceArgs
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

        [Input("vrfs")]
        private InputList<Inputs.BgpAddressFamilyIpv4VrfVrfGetArgs>? _vrfs;
        public InputList<Inputs.BgpAddressFamilyIpv4VrfVrfGetArgs> Vrfs
        {
            get => _vrfs ?? (_vrfs = new InputList<Inputs.BgpAddressFamilyIpv4VrfVrfGetArgs>());
            set => _vrfs = value;
        }

        public BgpAddressFamilyIpv4VrfState()
        {
        }
        public static new BgpAddressFamilyIpv4VrfState Empty => new BgpAddressFamilyIpv4VrfState();
    }
}