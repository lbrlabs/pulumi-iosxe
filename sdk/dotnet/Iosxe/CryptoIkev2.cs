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
    /// This resource can manage the Crypto IKEv2 configuration.
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
    ///     var example = new Iosxe.CryptoIkev2("example", new()
    ///     {
    ///         Dpd = 10,
    ///         DpdQuery = "periodic",
    ///         DpdRetryInterval = 5,
    ///         NatKeepalive = 20,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import iosxe:index/cryptoIkev2:CryptoIkev2 example "Cisco-IOS-XE-native:native/crypto/Cisco-IOS-XE-crypto:ikev2"
    /// ```
    /// </summary>
    [IosxeResourceType("iosxe:index/cryptoIkev2:CryptoIkev2")]
    public partial class CryptoIkev2 : global::Pulumi.CustomResource
    {
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
        /// Enable IKE liveness check for peers - Range: `10`-`3600`
        /// </summary>
        [Output("dpd")]
        public Output<int?> Dpd { get; private set; } = null!;

        /// <summary>
        /// - Choices: `on-demand`, `periodic`
        /// </summary>
        [Output("dpdQuery")]
        public Output<string?> DpdQuery { get; private set; } = null!;

        /// <summary>
        /// - Range: `2`-`60`
        /// </summary>
        [Output("dpdRetryInterval")]
        public Output<int?> DpdRetryInterval { get; private set; } = null!;

        /// <summary>
        /// Set NAT keepalive interval - Range: `5`-`3600`
        /// </summary>
        [Output("natKeepalive")]
        public Output<int?> NatKeepalive { get; private set; } = null!;


        /// <summary>
        /// Create a CryptoIkev2 resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CryptoIkev2(string name, CryptoIkev2Args? args = null, CustomResourceOptions? options = null)
            : base("iosxe:index/cryptoIkev2:CryptoIkev2", name, args ?? new CryptoIkev2Args(), MakeResourceOptions(options, ""))
        {
        }

        private CryptoIkev2(string name, Input<string> id, CryptoIkev2State? state = null, CustomResourceOptions? options = null)
            : base("iosxe:index/cryptoIkev2:CryptoIkev2", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CryptoIkev2 resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CryptoIkev2 Get(string name, Input<string> id, CryptoIkev2State? state = null, CustomResourceOptions? options = null)
        {
            return new CryptoIkev2(name, id, state, options);
        }
    }

    public sealed class CryptoIkev2Args : global::Pulumi.ResourceArgs
    {
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
        /// Enable IKE liveness check for peers - Range: `10`-`3600`
        /// </summary>
        [Input("dpd")]
        public Input<int>? Dpd { get; set; }

        /// <summary>
        /// - Choices: `on-demand`, `periodic`
        /// </summary>
        [Input("dpdQuery")]
        public Input<string>? DpdQuery { get; set; }

        /// <summary>
        /// - Range: `2`-`60`
        /// </summary>
        [Input("dpdRetryInterval")]
        public Input<int>? DpdRetryInterval { get; set; }

        /// <summary>
        /// Set NAT keepalive interval - Range: `5`-`3600`
        /// </summary>
        [Input("natKeepalive")]
        public Input<int>? NatKeepalive { get; set; }

        public CryptoIkev2Args()
        {
        }
        public static new CryptoIkev2Args Empty => new CryptoIkev2Args();
    }

    public sealed class CryptoIkev2State : global::Pulumi.ResourceArgs
    {
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
        /// Enable IKE liveness check for peers - Range: `10`-`3600`
        /// </summary>
        [Input("dpd")]
        public Input<int>? Dpd { get; set; }

        /// <summary>
        /// - Choices: `on-demand`, `periodic`
        /// </summary>
        [Input("dpdQuery")]
        public Input<string>? DpdQuery { get; set; }

        /// <summary>
        /// - Range: `2`-`60`
        /// </summary>
        [Input("dpdRetryInterval")]
        public Input<int>? DpdRetryInterval { get; set; }

        /// <summary>
        /// Set NAT keepalive interval - Range: `5`-`3600`
        /// </summary>
        [Input("natKeepalive")]
        public Input<int>? NatKeepalive { get; set; }

        public CryptoIkev2State()
        {
        }
        public static new CryptoIkev2State Empty => new CryptoIkev2State();
    }
}
