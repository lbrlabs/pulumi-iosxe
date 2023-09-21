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
    [IosxeResourceType("iosxe:iosxe/radius:Radius")]
    public partial class Radius : global::Pulumi.CustomResource
    {
        /// <summary>
        /// UDP port for RADIUS accounting server (default is 1813) - Range: `0`-`65534`
        /// </summary>
        [Output("accountingPort")]
        public Output<int?> AccountingPort { get; private set; } = null!;

        /// <summary>
        /// UDP port for RADIUS authentication server (default is 1812) - Range: `0`-`65534`
        /// </summary>
        [Output("authenticationPort")]
        public Output<int?> AuthenticationPort { get; private set; } = null!;

        /// <summary>
        /// Do not test accounting ports of the servers.
        /// </summary>
        [Output("automateTesterIgnoreAcctPort")]
        public Output<bool?> AutomateTesterIgnoreAcctPort { get; private set; } = null!;

        /// <summary>
        /// Send a packet to verify the server status
        /// </summary>
        [Output("automateTesterProbeOnConfig")]
        public Output<bool?> AutomateTesterProbeOnConfig { get; private set; } = null!;

        [Output("automateTesterUsername")]
        public Output<string?> AutomateTesterUsername { get; private set; } = null!;

        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Output("device")]
        public Output<string?> Device { get; private set; } = null!;

        /// <summary>
        /// IPv4 address or Hostname for radius server
        /// </summary>
        [Output("ipv4Address")]
        public Output<string?> Ipv4Address { get; private set; } = null!;

        [Output("key")]
        public Output<string?> Key { get; private set; } = null!;

        /// <summary>
        /// Name for the radius server configuration
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The UNENCRYPTED (cleartext) server key
        /// </summary>
        [Output("pacKey")]
        public Output<string?> PacKey { get; private set; } = null!;

        /// <summary>
        /// 0 - Specifies an UNENCRYPTED key will follow 6 - Specifies an ENCRYPTED key will follow 7 - Specifies HIDDEN key will
        /// follow - Choices: `0`, `6`, `7`
        /// </summary>
        [Output("pacKeyEncryption")]
        public Output<string?> PacKeyEncryption { get; private set; } = null!;

        /// <summary>
        /// Number of retries to active server (overrides default) - Range: `0`-`100`
        /// </summary>
        [Output("retransmit")]
        public Output<int?> Retransmit { get; private set; } = null!;

        /// <summary>
        /// Time to wait for a RADIUS server to reply (overrides default) - Range: `1`-`1000`
        /// </summary>
        [Output("timeout")]
        public Output<int?> Timeout { get; private set; } = null!;


        /// <summary>
        /// Create a Radius resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Radius(string name, RadiusArgs? args = null, CustomResourceOptions? options = null)
            : base("iosxe:iosxe/radius:Radius", name, args ?? new RadiusArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Radius(string name, Input<string> id, RadiusState? state = null, CustomResourceOptions? options = null)
            : base("iosxe:iosxe/radius:Radius", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Radius resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Radius Get(string name, Input<string> id, RadiusState? state = null, CustomResourceOptions? options = null)
        {
            return new Radius(name, id, state, options);
        }
    }

    public sealed class RadiusArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// UDP port for RADIUS accounting server (default is 1813) - Range: `0`-`65534`
        /// </summary>
        [Input("accountingPort")]
        public Input<int>? AccountingPort { get; set; }

        /// <summary>
        /// UDP port for RADIUS authentication server (default is 1812) - Range: `0`-`65534`
        /// </summary>
        [Input("authenticationPort")]
        public Input<int>? AuthenticationPort { get; set; }

        /// <summary>
        /// Do not test accounting ports of the servers.
        /// </summary>
        [Input("automateTesterIgnoreAcctPort")]
        public Input<bool>? AutomateTesterIgnoreAcctPort { get; set; }

        /// <summary>
        /// Send a packet to verify the server status
        /// </summary>
        [Input("automateTesterProbeOnConfig")]
        public Input<bool>? AutomateTesterProbeOnConfig { get; set; }

        [Input("automateTesterUsername")]
        public Input<string>? AutomateTesterUsername { get; set; }

        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// IPv4 address or Hostname for radius server
        /// </summary>
        [Input("ipv4Address")]
        public Input<string>? Ipv4Address { get; set; }

        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// Name for the radius server configuration
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The UNENCRYPTED (cleartext) server key
        /// </summary>
        [Input("pacKey")]
        public Input<string>? PacKey { get; set; }

        /// <summary>
        /// 0 - Specifies an UNENCRYPTED key will follow 6 - Specifies an ENCRYPTED key will follow 7 - Specifies HIDDEN key will
        /// follow - Choices: `0`, `6`, `7`
        /// </summary>
        [Input("pacKeyEncryption")]
        public Input<string>? PacKeyEncryption { get; set; }

        /// <summary>
        /// Number of retries to active server (overrides default) - Range: `0`-`100`
        /// </summary>
        [Input("retransmit")]
        public Input<int>? Retransmit { get; set; }

        /// <summary>
        /// Time to wait for a RADIUS server to reply (overrides default) - Range: `1`-`1000`
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        public RadiusArgs()
        {
        }
        public static new RadiusArgs Empty => new RadiusArgs();
    }

    public sealed class RadiusState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// UDP port for RADIUS accounting server (default is 1813) - Range: `0`-`65534`
        /// </summary>
        [Input("accountingPort")]
        public Input<int>? AccountingPort { get; set; }

        /// <summary>
        /// UDP port for RADIUS authentication server (default is 1812) - Range: `0`-`65534`
        /// </summary>
        [Input("authenticationPort")]
        public Input<int>? AuthenticationPort { get; set; }

        /// <summary>
        /// Do not test accounting ports of the servers.
        /// </summary>
        [Input("automateTesterIgnoreAcctPort")]
        public Input<bool>? AutomateTesterIgnoreAcctPort { get; set; }

        /// <summary>
        /// Send a packet to verify the server status
        /// </summary>
        [Input("automateTesterProbeOnConfig")]
        public Input<bool>? AutomateTesterProbeOnConfig { get; set; }

        [Input("automateTesterUsername")]
        public Input<string>? AutomateTesterUsername { get; set; }

        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// IPv4 address or Hostname for radius server
        /// </summary>
        [Input("ipv4Address")]
        public Input<string>? Ipv4Address { get; set; }

        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// Name for the radius server configuration
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The UNENCRYPTED (cleartext) server key
        /// </summary>
        [Input("pacKey")]
        public Input<string>? PacKey { get; set; }

        /// <summary>
        /// 0 - Specifies an UNENCRYPTED key will follow 6 - Specifies an ENCRYPTED key will follow 7 - Specifies HIDDEN key will
        /// follow - Choices: `0`, `6`, `7`
        /// </summary>
        [Input("pacKeyEncryption")]
        public Input<string>? PacKeyEncryption { get; set; }

        /// <summary>
        /// Number of retries to active server (overrides default) - Range: `0`-`100`
        /// </summary>
        [Input("retransmit")]
        public Input<int>? Retransmit { get; set; }

        /// <summary>
        /// Time to wait for a RADIUS server to reply (overrides default) - Range: `1`-`1000`
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        public RadiusState()
        {
        }
        public static new RadiusState Empty => new RadiusState();
    }
}