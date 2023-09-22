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
    /// This resource can manage the BGP Neighbor configuration.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Iosxe = Lbrlabs.PulumiPackage.Iosxe;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Iosxe.BgpNeighbor("example", new()
    ///     {
    ///         Asn = "65000",
    ///         ClusterId = "1234",
    ///         Description = "BGP Neighbor Description",
    ///         DisableConnectedCheck = false,
    ///         FallOverBfdCheckControlPlaneFailure = true,
    ///         FallOverBfdSingleHop = true,
    ///         FallOverBfdStrictMode = true,
    ///         FallOverDefaultEnable = false,
    ///         FallOverDefaultRouteMap = "RMAP",
    ///         FallOverMaximumMetricRouteMap = "RMAP",
    ///         Ip = "3.3.3.3",
    ///         LogNeighborChanges = true,
    ///         Password = "test1234",
    ///         PasswordType = 1,
    ///         RemoteAs = "65000",
    ///         Shutdown = false,
    ///         TimersHoldtime = 866,
    ///         TimersKeepaliveInterval = 655,
    ///         TimersMinimumNeighborHold = 222,
    ///         UpdateSourceLoopback = "100",
    ///         Version = 4,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import iosxe:index/bgpNeighbor:BgpNeighbor example "Cisco-IOS-XE-native:native/router/Cisco-IOS-XE-bgp:bgp=65000/neighbor=3.3.3.3"
    /// ```
    /// </summary>
    [IosxeResourceType("iosxe:index/bgpNeighbor:BgpNeighbor")]
    public partial class BgpNeighbor : global::Pulumi.CustomResource
    {
        [Output("asn")]
        public Output<string> Asn { get; private set; } = null!;

        [Output("clusterId")]
        public Output<string?> ClusterId { get; private set; } = null!;

        /// <summary>
        /// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
        /// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
        /// Default value is `all`. - Choices: `all`, `attributes`
        /// </summary>
        [Output("deleteMode")]
        public Output<string?> DeleteMode { get; private set; } = null!;

        /// <summary>
        /// Neighbor specific description
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Output("device")]
        public Output<string?> Device { get; private set; } = null!;

        /// <summary>
        /// one-hop away EBGP peer using loopback address
        /// </summary>
        [Output("disableConnectedCheck")]
        public Output<bool?> DisableConnectedCheck { get; private set; } = null!;

        /// <summary>
        /// Allow EBGP neighbors not on directly connected networks. For single-hop ebgp peers, delete ebgp-multihop directly.
        /// </summary>
        [Output("ebgpMultihop")]
        public Output<bool?> EbgpMultihop { get; private set; } = null!;

        /// <summary>
        /// - Range: `2`-`255`
        /// </summary>
        [Output("ebgpMultihopMaxHop")]
        public Output<int?> EbgpMultihopMaxHop { get; private set; } = null!;

        /// <summary>
        /// Retrieve control plane dependent failure info from BFD for BGP GR/NSR operation
        /// </summary>
        [Output("fallOverBfdCheckControlPlaneFailure")]
        public Output<bool?> FallOverBfdCheckControlPlaneFailure { get; private set; } = null!;

        /// <summary>
        /// Force BFD multi-hop to detect failure
        /// </summary>
        [Output("fallOverBfdMultiHop")]
        public Output<bool?> FallOverBfdMultiHop { get; private set; } = null!;

        /// <summary>
        /// Force BFD single-hop to detect failure
        /// </summary>
        [Output("fallOverBfdSingleHop")]
        public Output<bool?> FallOverBfdSingleHop { get; private set; } = null!;

        /// <summary>
        /// Enable BFD strict-mode
        /// </summary>
        [Output("fallOverBfdStrictMode")]
        public Output<bool?> FallOverBfdStrictMode { get; private set; } = null!;

        [Output("fallOverDefaultEnable")]
        public Output<bool?> FallOverDefaultEnable { get; private set; } = null!;

        [Output("fallOverDefaultRouteMap")]
        public Output<string?> FallOverDefaultRouteMap { get; private set; } = null!;

        [Output("fallOverMaximumMetricRouteMap")]
        public Output<string?> FallOverMaximumMetricRouteMap { get; private set; } = null!;

        [Output("ip")]
        public Output<string> Ip { get; private set; } = null!;

        [Output("localAs")]
        public Output<string?> LocalAs { get; private set; } = null!;

        /// <summary>
        /// Accept either real AS or local AS from the ebgp peer
        /// </summary>
        [Output("localAsDualAs")]
        public Output<bool?> LocalAsDualAs { get; private set; } = null!;

        /// <summary>
        /// Do not prepend local-as to updates from ebgp peers
        /// </summary>
        [Output("localAsNoPrepend")]
        public Output<bool?> LocalAsNoPrepend { get; private set; } = null!;

        /// <summary>
        /// Replace real AS with local AS in the EBGP updates
        /// </summary>
        [Output("localAsReplaceAs")]
        public Output<bool?> LocalAsReplaceAs { get; private set; } = null!;

        /// <summary>
        /// Log neighbor up/down and reset reason
        /// </summary>
        [Output("logNeighborChanges")]
        public Output<bool?> LogNeighborChanges { get; private set; } = null!;

        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// Encryption type (0 to disable encryption, 7 for proprietary) - Range: `0`-`7`
        /// </summary>
        [Output("passwordType")]
        public Output<int?> PasswordType { get; private set; } = null!;

        /// <summary>
        /// Specify a BGP peer-group remote-as
        /// </summary>
        [Output("remoteAs")]
        public Output<string?> RemoteAs { get; private set; } = null!;

        /// <summary>
        /// Administratively shut down this neighbor
        /// </summary>
        [Output("shutdown")]
        public Output<bool?> Shutdown { get; private set; } = null!;

        /// <summary>
        /// - Range: `0`-`65535`
        /// </summary>
        [Output("timersHoldtime")]
        public Output<int?> TimersHoldtime { get; private set; } = null!;

        /// <summary>
        /// - Range: `0`-`65535`
        /// </summary>
        [Output("timersKeepaliveInterval")]
        public Output<int?> TimersKeepaliveInterval { get; private set; } = null!;

        /// <summary>
        /// - Range: `0`-`65535`
        /// </summary>
        [Output("timersMinimumNeighborHold")]
        public Output<int?> TimersMinimumNeighborHold { get; private set; } = null!;

        /// <summary>
        /// IP hops - Range: `1`-`254`
        /// </summary>
        [Output("ttlSecurityHops")]
        public Output<int?> TtlSecurityHops { get; private set; } = null!;

        /// <summary>
        /// Loopback interface
        /// </summary>
        [Output("updateSourceLoopback")]
        public Output<string?> UpdateSourceLoopback { get; private set; } = null!;

        /// <summary>
        /// Set the BGP version to match a neighbor - Range: `4`-`4`
        /// </summary>
        [Output("version")]
        public Output<int?> Version { get; private set; } = null!;


        /// <summary>
        /// Create a BgpNeighbor resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BgpNeighbor(string name, BgpNeighborArgs args, CustomResourceOptions? options = null)
            : base("iosxe:index/bgpNeighbor:BgpNeighbor", name, args ?? new BgpNeighborArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BgpNeighbor(string name, Input<string> id, BgpNeighborState? state = null, CustomResourceOptions? options = null)
            : base("iosxe:index/bgpNeighbor:BgpNeighbor", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BgpNeighbor resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BgpNeighbor Get(string name, Input<string> id, BgpNeighborState? state = null, CustomResourceOptions? options = null)
        {
            return new BgpNeighbor(name, id, state, options);
        }
    }

    public sealed class BgpNeighborArgs : global::Pulumi.ResourceArgs
    {
        [Input("asn", required: true)]
        public Input<string> Asn { get; set; } = null!;

        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
        /// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
        /// Default value is `all`. - Choices: `all`, `attributes`
        /// </summary>
        [Input("deleteMode")]
        public Input<string>? DeleteMode { get; set; }

        /// <summary>
        /// Neighbor specific description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// one-hop away EBGP peer using loopback address
        /// </summary>
        [Input("disableConnectedCheck")]
        public Input<bool>? DisableConnectedCheck { get; set; }

        /// <summary>
        /// Allow EBGP neighbors not on directly connected networks. For single-hop ebgp peers, delete ebgp-multihop directly.
        /// </summary>
        [Input("ebgpMultihop")]
        public Input<bool>? EbgpMultihop { get; set; }

        /// <summary>
        /// - Range: `2`-`255`
        /// </summary>
        [Input("ebgpMultihopMaxHop")]
        public Input<int>? EbgpMultihopMaxHop { get; set; }

        /// <summary>
        /// Retrieve control plane dependent failure info from BFD for BGP GR/NSR operation
        /// </summary>
        [Input("fallOverBfdCheckControlPlaneFailure")]
        public Input<bool>? FallOverBfdCheckControlPlaneFailure { get; set; }

        /// <summary>
        /// Force BFD multi-hop to detect failure
        /// </summary>
        [Input("fallOverBfdMultiHop")]
        public Input<bool>? FallOverBfdMultiHop { get; set; }

        /// <summary>
        /// Force BFD single-hop to detect failure
        /// </summary>
        [Input("fallOverBfdSingleHop")]
        public Input<bool>? FallOverBfdSingleHop { get; set; }

        /// <summary>
        /// Enable BFD strict-mode
        /// </summary>
        [Input("fallOverBfdStrictMode")]
        public Input<bool>? FallOverBfdStrictMode { get; set; }

        [Input("fallOverDefaultEnable")]
        public Input<bool>? FallOverDefaultEnable { get; set; }

        [Input("fallOverDefaultRouteMap")]
        public Input<string>? FallOverDefaultRouteMap { get; set; }

        [Input("fallOverMaximumMetricRouteMap")]
        public Input<string>? FallOverMaximumMetricRouteMap { get; set; }

        [Input("ip", required: true)]
        public Input<string> Ip { get; set; } = null!;

        [Input("localAs")]
        public Input<string>? LocalAs { get; set; }

        /// <summary>
        /// Accept either real AS or local AS from the ebgp peer
        /// </summary>
        [Input("localAsDualAs")]
        public Input<bool>? LocalAsDualAs { get; set; }

        /// <summary>
        /// Do not prepend local-as to updates from ebgp peers
        /// </summary>
        [Input("localAsNoPrepend")]
        public Input<bool>? LocalAsNoPrepend { get; set; }

        /// <summary>
        /// Replace real AS with local AS in the EBGP updates
        /// </summary>
        [Input("localAsReplaceAs")]
        public Input<bool>? LocalAsReplaceAs { get; set; }

        /// <summary>
        /// Log neighbor up/down and reset reason
        /// </summary>
        [Input("logNeighborChanges")]
        public Input<bool>? LogNeighborChanges { get; set; }

        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// Encryption type (0 to disable encryption, 7 for proprietary) - Range: `0`-`7`
        /// </summary>
        [Input("passwordType")]
        public Input<int>? PasswordType { get; set; }

        /// <summary>
        /// Specify a BGP peer-group remote-as
        /// </summary>
        [Input("remoteAs")]
        public Input<string>? RemoteAs { get; set; }

        /// <summary>
        /// Administratively shut down this neighbor
        /// </summary>
        [Input("shutdown")]
        public Input<bool>? Shutdown { get; set; }

        /// <summary>
        /// - Range: `0`-`65535`
        /// </summary>
        [Input("timersHoldtime")]
        public Input<int>? TimersHoldtime { get; set; }

        /// <summary>
        /// - Range: `0`-`65535`
        /// </summary>
        [Input("timersKeepaliveInterval")]
        public Input<int>? TimersKeepaliveInterval { get; set; }

        /// <summary>
        /// - Range: `0`-`65535`
        /// </summary>
        [Input("timersMinimumNeighborHold")]
        public Input<int>? TimersMinimumNeighborHold { get; set; }

        /// <summary>
        /// IP hops - Range: `1`-`254`
        /// </summary>
        [Input("ttlSecurityHops")]
        public Input<int>? TtlSecurityHops { get; set; }

        /// <summary>
        /// Loopback interface
        /// </summary>
        [Input("updateSourceLoopback")]
        public Input<string>? UpdateSourceLoopback { get; set; }

        /// <summary>
        /// Set the BGP version to match a neighbor - Range: `4`-`4`
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public BgpNeighborArgs()
        {
        }
        public static new BgpNeighborArgs Empty => new BgpNeighborArgs();
    }

    public sealed class BgpNeighborState : global::Pulumi.ResourceArgs
    {
        [Input("asn")]
        public Input<string>? Asn { get; set; }

        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
        /// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
        /// Default value is `all`. - Choices: `all`, `attributes`
        /// </summary>
        [Input("deleteMode")]
        public Input<string>? DeleteMode { get; set; }

        /// <summary>
        /// Neighbor specific description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// one-hop away EBGP peer using loopback address
        /// </summary>
        [Input("disableConnectedCheck")]
        public Input<bool>? DisableConnectedCheck { get; set; }

        /// <summary>
        /// Allow EBGP neighbors not on directly connected networks. For single-hop ebgp peers, delete ebgp-multihop directly.
        /// </summary>
        [Input("ebgpMultihop")]
        public Input<bool>? EbgpMultihop { get; set; }

        /// <summary>
        /// - Range: `2`-`255`
        /// </summary>
        [Input("ebgpMultihopMaxHop")]
        public Input<int>? EbgpMultihopMaxHop { get; set; }

        /// <summary>
        /// Retrieve control plane dependent failure info from BFD for BGP GR/NSR operation
        /// </summary>
        [Input("fallOverBfdCheckControlPlaneFailure")]
        public Input<bool>? FallOverBfdCheckControlPlaneFailure { get; set; }

        /// <summary>
        /// Force BFD multi-hop to detect failure
        /// </summary>
        [Input("fallOverBfdMultiHop")]
        public Input<bool>? FallOverBfdMultiHop { get; set; }

        /// <summary>
        /// Force BFD single-hop to detect failure
        /// </summary>
        [Input("fallOverBfdSingleHop")]
        public Input<bool>? FallOverBfdSingleHop { get; set; }

        /// <summary>
        /// Enable BFD strict-mode
        /// </summary>
        [Input("fallOverBfdStrictMode")]
        public Input<bool>? FallOverBfdStrictMode { get; set; }

        [Input("fallOverDefaultEnable")]
        public Input<bool>? FallOverDefaultEnable { get; set; }

        [Input("fallOverDefaultRouteMap")]
        public Input<string>? FallOverDefaultRouteMap { get; set; }

        [Input("fallOverMaximumMetricRouteMap")]
        public Input<string>? FallOverMaximumMetricRouteMap { get; set; }

        [Input("ip")]
        public Input<string>? Ip { get; set; }

        [Input("localAs")]
        public Input<string>? LocalAs { get; set; }

        /// <summary>
        /// Accept either real AS or local AS from the ebgp peer
        /// </summary>
        [Input("localAsDualAs")]
        public Input<bool>? LocalAsDualAs { get; set; }

        /// <summary>
        /// Do not prepend local-as to updates from ebgp peers
        /// </summary>
        [Input("localAsNoPrepend")]
        public Input<bool>? LocalAsNoPrepend { get; set; }

        /// <summary>
        /// Replace real AS with local AS in the EBGP updates
        /// </summary>
        [Input("localAsReplaceAs")]
        public Input<bool>? LocalAsReplaceAs { get; set; }

        /// <summary>
        /// Log neighbor up/down and reset reason
        /// </summary>
        [Input("logNeighborChanges")]
        public Input<bool>? LogNeighborChanges { get; set; }

        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// Encryption type (0 to disable encryption, 7 for proprietary) - Range: `0`-`7`
        /// </summary>
        [Input("passwordType")]
        public Input<int>? PasswordType { get; set; }

        /// <summary>
        /// Specify a BGP peer-group remote-as
        /// </summary>
        [Input("remoteAs")]
        public Input<string>? RemoteAs { get; set; }

        /// <summary>
        /// Administratively shut down this neighbor
        /// </summary>
        [Input("shutdown")]
        public Input<bool>? Shutdown { get; set; }

        /// <summary>
        /// - Range: `0`-`65535`
        /// </summary>
        [Input("timersHoldtime")]
        public Input<int>? TimersHoldtime { get; set; }

        /// <summary>
        /// - Range: `0`-`65535`
        /// </summary>
        [Input("timersKeepaliveInterval")]
        public Input<int>? TimersKeepaliveInterval { get; set; }

        /// <summary>
        /// - Range: `0`-`65535`
        /// </summary>
        [Input("timersMinimumNeighborHold")]
        public Input<int>? TimersMinimumNeighborHold { get; set; }

        /// <summary>
        /// IP hops - Range: `1`-`254`
        /// </summary>
        [Input("ttlSecurityHops")]
        public Input<int>? TtlSecurityHops { get; set; }

        /// <summary>
        /// Loopback interface
        /// </summary>
        [Input("updateSourceLoopback")]
        public Input<string>? UpdateSourceLoopback { get; set; }

        /// <summary>
        /// Set the BGP version to match a neighbor - Range: `4`-`4`
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public BgpNeighborState()
        {
        }
        public static new BgpNeighborState Empty => new BgpNeighborState();
    }
}