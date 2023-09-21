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
    [IosxeResourceType("iosxe:iosxe/dhcp:Dhcp")]
    public partial class Dhcp : global::Pulumi.CustomResource
    {
        /// <summary>
        /// - Choices: `cisco`, `standard`
        /// </summary>
        [Output("compatibilitySuboptionLinkSelection")]
        public Output<string?> CompatibilitySuboptionLinkSelection { get; private set; } = null!;

        /// <summary>
        /// - Choices: `cisco`, `standard`
        /// </summary>
        [Output("compatibilitySuboptionServerOverride")]
        public Output<string?> CompatibilitySuboptionServerOverride { get; private set; } = null!;

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
        /// Default option, no vpn
        /// </summary>
        [Output("relayInformationOptionDefault")]
        public Output<bool?> RelayInformationOptionDefault { get; private set; } = null!;

        /// <summary>
        /// Insert VPN sub-options and change the giaddr to the outgoing interface
        /// </summary>
        [Output("relayInformationOptionVpn")]
        public Output<bool?> RelayInformationOptionVpn { get; private set; } = null!;

        /// <summary>
        /// Received DHCP packets may contain relay info option with zero giaddr
        /// </summary>
        [Output("relayInformationTrustAll")]
        public Output<bool?> RelayInformationTrustAll { get; private set; } = null!;

        /// <summary>
        /// DHCP Snooping
        /// </summary>
        [Output("snooping")]
        public Output<bool?> Snooping { get; private set; } = null!;

        /// <summary>
        /// Use configured hostname for remote id
        /// </summary>
        [Output("snoopingInformationOptionFormatRemoteIdHostname")]
        public Output<bool?> SnoopingInformationOptionFormatRemoteIdHostname { get; private set; } = null!;

        /// <summary>
        /// DHCP Snooping vlan
        /// </summary>
        [Output("snoopingVlans")]
        public Output<ImmutableArray<Outputs.DhcpSnoopingVlan>> SnoopingVlans { get; private set; } = null!;


        /// <summary>
        /// Create a Dhcp resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Dhcp(string name, DhcpArgs? args = null, CustomResourceOptions? options = null)
            : base("iosxe:iosxe/dhcp:Dhcp", name, args ?? new DhcpArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Dhcp(string name, Input<string> id, DhcpState? state = null, CustomResourceOptions? options = null)
            : base("iosxe:iosxe/dhcp:Dhcp", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Dhcp resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Dhcp Get(string name, Input<string> id, DhcpState? state = null, CustomResourceOptions? options = null)
        {
            return new Dhcp(name, id, state, options);
        }
    }

    public sealed class DhcpArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// - Choices: `cisco`, `standard`
        /// </summary>
        [Input("compatibilitySuboptionLinkSelection")]
        public Input<string>? CompatibilitySuboptionLinkSelection { get; set; }

        /// <summary>
        /// - Choices: `cisco`, `standard`
        /// </summary>
        [Input("compatibilitySuboptionServerOverride")]
        public Input<string>? CompatibilitySuboptionServerOverride { get; set; }

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
        /// Default option, no vpn
        /// </summary>
        [Input("relayInformationOptionDefault")]
        public Input<bool>? RelayInformationOptionDefault { get; set; }

        /// <summary>
        /// Insert VPN sub-options and change the giaddr to the outgoing interface
        /// </summary>
        [Input("relayInformationOptionVpn")]
        public Input<bool>? RelayInformationOptionVpn { get; set; }

        /// <summary>
        /// Received DHCP packets may contain relay info option with zero giaddr
        /// </summary>
        [Input("relayInformationTrustAll")]
        public Input<bool>? RelayInformationTrustAll { get; set; }

        /// <summary>
        /// DHCP Snooping
        /// </summary>
        [Input("snooping")]
        public Input<bool>? Snooping { get; set; }

        /// <summary>
        /// Use configured hostname for remote id
        /// </summary>
        [Input("snoopingInformationOptionFormatRemoteIdHostname")]
        public Input<bool>? SnoopingInformationOptionFormatRemoteIdHostname { get; set; }

        [Input("snoopingVlans")]
        private InputList<Inputs.DhcpSnoopingVlanArgs>? _snoopingVlans;

        /// <summary>
        /// DHCP Snooping vlan
        /// </summary>
        public InputList<Inputs.DhcpSnoopingVlanArgs> SnoopingVlans
        {
            get => _snoopingVlans ?? (_snoopingVlans = new InputList<Inputs.DhcpSnoopingVlanArgs>());
            set => _snoopingVlans = value;
        }

        public DhcpArgs()
        {
        }
        public static new DhcpArgs Empty => new DhcpArgs();
    }

    public sealed class DhcpState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// - Choices: `cisco`, `standard`
        /// </summary>
        [Input("compatibilitySuboptionLinkSelection")]
        public Input<string>? CompatibilitySuboptionLinkSelection { get; set; }

        /// <summary>
        /// - Choices: `cisco`, `standard`
        /// </summary>
        [Input("compatibilitySuboptionServerOverride")]
        public Input<string>? CompatibilitySuboptionServerOverride { get; set; }

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
        /// Default option, no vpn
        /// </summary>
        [Input("relayInformationOptionDefault")]
        public Input<bool>? RelayInformationOptionDefault { get; set; }

        /// <summary>
        /// Insert VPN sub-options and change the giaddr to the outgoing interface
        /// </summary>
        [Input("relayInformationOptionVpn")]
        public Input<bool>? RelayInformationOptionVpn { get; set; }

        /// <summary>
        /// Received DHCP packets may contain relay info option with zero giaddr
        /// </summary>
        [Input("relayInformationTrustAll")]
        public Input<bool>? RelayInformationTrustAll { get; set; }

        /// <summary>
        /// DHCP Snooping
        /// </summary>
        [Input("snooping")]
        public Input<bool>? Snooping { get; set; }

        /// <summary>
        /// Use configured hostname for remote id
        /// </summary>
        [Input("snoopingInformationOptionFormatRemoteIdHostname")]
        public Input<bool>? SnoopingInformationOptionFormatRemoteIdHostname { get; set; }

        [Input("snoopingVlans")]
        private InputList<Inputs.DhcpSnoopingVlanGetArgs>? _snoopingVlans;

        /// <summary>
        /// DHCP Snooping vlan
        /// </summary>
        public InputList<Inputs.DhcpSnoopingVlanGetArgs> SnoopingVlans
        {
            get => _snoopingVlans ?? (_snoopingVlans = new InputList<Inputs.DhcpSnoopingVlanGetArgs>());
            set => _snoopingVlans = value;
        }

        public DhcpState()
        {
        }
        public static new DhcpState Empty => new DhcpState();
    }
}
