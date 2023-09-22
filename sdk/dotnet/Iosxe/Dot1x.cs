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
    /// This resource can manage the Dot1x configuration.
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import iosxe:index/dot1x:Dot1x example "Cisco-IOS-XE-native:native/dot1x"
    /// ```
    /// </summary>
    [IosxeResourceType("iosxe:index/dot1x:Dot1x")]
    public partial class Dot1x : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Send EAPOL-Success on successful auth-fail Authorization
        /// </summary>
        [Output("authFailEapol")]
        public Output<bool?> AuthFailEapol { get; private set; } = null!;

        /// <summary>
        /// Configure 802.1X credentials profiles
        /// </summary>
        [Output("credentials")]
        public Output<ImmutableArray<Outputs.Dot1xCredential>> Credentials { get; private set; } = null!;

        /// <summary>
        /// Block all EAPoL transaction on Critical Authentication
        /// </summary>
        [Output("criticalEapolConfigBlock")]
        public Output<bool?> CriticalEapolConfigBlock { get; private set; } = null!;

        /// <summary>
        /// Set 802.1x Critical Authentication Recovery Delay period - Range: `1`-`10000`
        /// </summary>
        [Output("criticalRecoveryDelay")]
        public Output<int?> CriticalRecoveryDelay { get; private set; } = null!;

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
        /// Show verbose messages in system logs
        /// </summary>
        [Output("loggingVerbose")]
        public Output<bool?> LoggingVerbose { get; private set; } = null!;

        /// <summary>
        /// Controlled access is only applied during authentication
        /// </summary>
        [Output("supplicantControlledTransient")]
        public Output<bool?> SupplicantControlledTransient { get; private set; } = null!;

        /// <summary>
        /// Force 802.1X supplicant to send multicast packets
        /// </summary>
        [Output("supplicantForceMulticast")]
        public Output<bool?> SupplicantForceMulticast { get; private set; } = null!;

        /// <summary>
        /// Enable or Disable SysAuthControl
        /// </summary>
        [Output("systemAuthControl")]
        public Output<bool?> SystemAuthControl { get; private set; } = null!;

        /// <summary>
        /// Timeout for device EAPOL capabilities test in seconds - Range: `1`-`65535`
        /// </summary>
        [Output("testTimeout")]
        public Output<int?> TestTimeout { get; private set; } = null!;


        /// <summary>
        /// Create a Dot1x resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Dot1x(string name, Dot1xArgs? args = null, CustomResourceOptions? options = null)
            : base("iosxe:index/dot1x:Dot1x", name, args ?? new Dot1xArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Dot1x(string name, Input<string> id, Dot1xState? state = null, CustomResourceOptions? options = null)
            : base("iosxe:index/dot1x:Dot1x", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Dot1x resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Dot1x Get(string name, Input<string> id, Dot1xState? state = null, CustomResourceOptions? options = null)
        {
            return new Dot1x(name, id, state, options);
        }
    }

    public sealed class Dot1xArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Send EAPOL-Success on successful auth-fail Authorization
        /// </summary>
        [Input("authFailEapol")]
        public Input<bool>? AuthFailEapol { get; set; }

        [Input("credentials")]
        private InputList<Inputs.Dot1xCredentialArgs>? _credentials;

        /// <summary>
        /// Configure 802.1X credentials profiles
        /// </summary>
        public InputList<Inputs.Dot1xCredentialArgs> Credentials
        {
            get => _credentials ?? (_credentials = new InputList<Inputs.Dot1xCredentialArgs>());
            set => _credentials = value;
        }

        /// <summary>
        /// Block all EAPoL transaction on Critical Authentication
        /// </summary>
        [Input("criticalEapolConfigBlock")]
        public Input<bool>? CriticalEapolConfigBlock { get; set; }

        /// <summary>
        /// Set 802.1x Critical Authentication Recovery Delay period - Range: `1`-`10000`
        /// </summary>
        [Input("criticalRecoveryDelay")]
        public Input<int>? CriticalRecoveryDelay { get; set; }

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
        /// Show verbose messages in system logs
        /// </summary>
        [Input("loggingVerbose")]
        public Input<bool>? LoggingVerbose { get; set; }

        /// <summary>
        /// Controlled access is only applied during authentication
        /// </summary>
        [Input("supplicantControlledTransient")]
        public Input<bool>? SupplicantControlledTransient { get; set; }

        /// <summary>
        /// Force 802.1X supplicant to send multicast packets
        /// </summary>
        [Input("supplicantForceMulticast")]
        public Input<bool>? SupplicantForceMulticast { get; set; }

        /// <summary>
        /// Enable or Disable SysAuthControl
        /// </summary>
        [Input("systemAuthControl")]
        public Input<bool>? SystemAuthControl { get; set; }

        /// <summary>
        /// Timeout for device EAPOL capabilities test in seconds - Range: `1`-`65535`
        /// </summary>
        [Input("testTimeout")]
        public Input<int>? TestTimeout { get; set; }

        public Dot1xArgs()
        {
        }
        public static new Dot1xArgs Empty => new Dot1xArgs();
    }

    public sealed class Dot1xState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Send EAPOL-Success on successful auth-fail Authorization
        /// </summary>
        [Input("authFailEapol")]
        public Input<bool>? AuthFailEapol { get; set; }

        [Input("credentials")]
        private InputList<Inputs.Dot1xCredentialGetArgs>? _credentials;

        /// <summary>
        /// Configure 802.1X credentials profiles
        /// </summary>
        public InputList<Inputs.Dot1xCredentialGetArgs> Credentials
        {
            get => _credentials ?? (_credentials = new InputList<Inputs.Dot1xCredentialGetArgs>());
            set => _credentials = value;
        }

        /// <summary>
        /// Block all EAPoL transaction on Critical Authentication
        /// </summary>
        [Input("criticalEapolConfigBlock")]
        public Input<bool>? CriticalEapolConfigBlock { get; set; }

        /// <summary>
        /// Set 802.1x Critical Authentication Recovery Delay period - Range: `1`-`10000`
        /// </summary>
        [Input("criticalRecoveryDelay")]
        public Input<int>? CriticalRecoveryDelay { get; set; }

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
        /// Show verbose messages in system logs
        /// </summary>
        [Input("loggingVerbose")]
        public Input<bool>? LoggingVerbose { get; set; }

        /// <summary>
        /// Controlled access is only applied during authentication
        /// </summary>
        [Input("supplicantControlledTransient")]
        public Input<bool>? SupplicantControlledTransient { get; set; }

        /// <summary>
        /// Force 802.1X supplicant to send multicast packets
        /// </summary>
        [Input("supplicantForceMulticast")]
        public Input<bool>? SupplicantForceMulticast { get; set; }

        /// <summary>
        /// Enable or Disable SysAuthControl
        /// </summary>
        [Input("systemAuthControl")]
        public Input<bool>? SystemAuthControl { get; set; }

        /// <summary>
        /// Timeout for device EAPOL capabilities test in seconds - Range: `1`-`65535`
        /// </summary>
        [Input("testTimeout")]
        public Input<int>? TestTimeout { get; set; }

        public Dot1xState()
        {
        }
        public static new Dot1xState Empty => new Dot1xState();
    }
}