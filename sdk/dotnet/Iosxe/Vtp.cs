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
    /// This resource can manage the VTP configuration.
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
    ///     var example = new Iosxe.Vtp("example", new()
    ///     {
    ///         Domain = "TESTDOMAIN",
    ///         File = "TEST",
    ///         Interface = "Gi1/0/1",
    ///         ModeClientMst = true,
    ///         ModeClientUnknown = true,
    ///         ModeClientVlan = true,
    ///         ModeOffMst = true,
    ///         ModeOffVlan = true,
    ///         ModeServerMst = true,
    ///         ModeServerUnknown = true,
    ///         ModeServerVlan = true,
    ///         ModeTransparentMst = true,
    ///         ModeTransparentUnknown = true,
    ///         ModeTransparentVlan = true,
    ///         Password = "test123",
    ///         PasswordHidden = true,
    ///         Version = 3,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import iosxe:index/vtp:Vtp example "Cisco-IOS-XE-native:native/vtp"
    /// ```
    /// </summary>
    [IosxeResourceType("iosxe:index/vtp:Vtp")]
    public partial class Vtp : global::Pulumi.CustomResource
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
        /// Set the name of the VTP administrative domain.
        /// </summary>
        [Output("domain")]
        public Output<string?> Domain { get; private set; } = null!;

        /// <summary>
        /// Configure IFS filesystem file where VTP configuration is stored.
        /// </summary>
        [Output("file")]
        public Output<string?> File { get; private set; } = null!;

        /// <summary>
        /// The name of the interface providing the VTP updater ID for this device
        /// </summary>
        [Output("interface")]
        public Output<string?> Interface { get; private set; } = null!;

        /// <summary>
        /// Use only this interface's IP address as the VTP IP updater address
        /// </summary>
        [Output("interfaceOnly")]
        public Output<bool?> InterfaceOnly { get; private set; } = null!;

        /// <summary>
        /// Set the mode for MST VTP instance
        /// </summary>
        [Output("modeClientMst")]
        public Output<bool?> ModeClientMst { get; private set; } = null!;

        /// <summary>
        /// Set the mode for unknown VTP instances
        /// </summary>
        [Output("modeClientUnknown")]
        public Output<bool?> ModeClientUnknown { get; private set; } = null!;

        /// <summary>
        /// Set the mode for VLAN VTP instance
        /// </summary>
        [Output("modeClientVlan")]
        public Output<bool?> ModeClientVlan { get; private set; } = null!;

        /// <summary>
        /// Set the mode for MST VTP instance
        /// </summary>
        [Output("modeOffMst")]
        public Output<bool?> ModeOffMst { get; private set; } = null!;

        /// <summary>
        /// Set the mode for unknown VTP instances
        /// </summary>
        [Output("modeOffUnknown")]
        public Output<bool?> ModeOffUnknown { get; private set; } = null!;

        /// <summary>
        /// Set the mode for VLAN VTP instance
        /// </summary>
        [Output("modeOffVlan")]
        public Output<bool?> ModeOffVlan { get; private set; } = null!;

        /// <summary>
        /// Set the mode for MST VTP instance
        /// </summary>
        [Output("modeServerMst")]
        public Output<bool?> ModeServerMst { get; private set; } = null!;

        /// <summary>
        /// Set the mode for unknown VTP instances
        /// </summary>
        [Output("modeServerUnknown")]
        public Output<bool?> ModeServerUnknown { get; private set; } = null!;

        /// <summary>
        /// Set the mode for VLAN VTP instance
        /// </summary>
        [Output("modeServerVlan")]
        public Output<bool?> ModeServerVlan { get; private set; } = null!;

        /// <summary>
        /// Set the mode for MST VTP instance
        /// </summary>
        [Output("modeTransparentMst")]
        public Output<bool?> ModeTransparentMst { get; private set; } = null!;

        /// <summary>
        /// Set the mode for unknown VTP instances
        /// </summary>
        [Output("modeTransparentUnknown")]
        public Output<bool?> ModeTransparentUnknown { get; private set; } = null!;

        /// <summary>
        /// Set the mode for VLAN VTP instance
        /// </summary>
        [Output("modeTransparentVlan")]
        public Output<bool?> ModeTransparentVlan { get; private set; } = null!;

        /// <summary>
        /// The ascii password for the VTP administrative domain
        /// </summary>
        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// Set the VTP password hidden option
        /// </summary>
        [Output("passwordHidden")]
        public Output<bool?> PasswordHidden { get; private set; } = null!;

        /// <summary>
        /// Specify the vtp password in encrypted form
        /// </summary>
        [Output("passwordSecret")]
        public Output<bool?> PasswordSecret { get; private set; } = null!;

        /// <summary>
        /// Set the administrative domain to permit pruning
        /// </summary>
        [Output("pruning")]
        public Output<bool?> Pruning { get; private set; } = null!;

        /// <summary>
        /// Set the administrative domain to VTP version - Range: `1`-`3`
        /// </summary>
        [Output("version")]
        public Output<int?> Version { get; private set; } = null!;


        /// <summary>
        /// Create a Vtp resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Vtp(string name, VtpArgs? args = null, CustomResourceOptions? options = null)
            : base("iosxe:index/vtp:Vtp", name, args ?? new VtpArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Vtp(string name, Input<string> id, VtpState? state = null, CustomResourceOptions? options = null)
            : base("iosxe:index/vtp:Vtp", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Vtp resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Vtp Get(string name, Input<string> id, VtpState? state = null, CustomResourceOptions? options = null)
        {
            return new Vtp(name, id, state, options);
        }
    }

    public sealed class VtpArgs : global::Pulumi.ResourceArgs
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
        /// Set the name of the VTP administrative domain.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// Configure IFS filesystem file where VTP configuration is stored.
        /// </summary>
        [Input("file")]
        public Input<string>? File { get; set; }

        /// <summary>
        /// The name of the interface providing the VTP updater ID for this device
        /// </summary>
        [Input("interface")]
        public Input<string>? Interface { get; set; }

        /// <summary>
        /// Use only this interface's IP address as the VTP IP updater address
        /// </summary>
        [Input("interfaceOnly")]
        public Input<bool>? InterfaceOnly { get; set; }

        /// <summary>
        /// Set the mode for MST VTP instance
        /// </summary>
        [Input("modeClientMst")]
        public Input<bool>? ModeClientMst { get; set; }

        /// <summary>
        /// Set the mode for unknown VTP instances
        /// </summary>
        [Input("modeClientUnknown")]
        public Input<bool>? ModeClientUnknown { get; set; }

        /// <summary>
        /// Set the mode for VLAN VTP instance
        /// </summary>
        [Input("modeClientVlan")]
        public Input<bool>? ModeClientVlan { get; set; }

        /// <summary>
        /// Set the mode for MST VTP instance
        /// </summary>
        [Input("modeOffMst")]
        public Input<bool>? ModeOffMst { get; set; }

        /// <summary>
        /// Set the mode for unknown VTP instances
        /// </summary>
        [Input("modeOffUnknown")]
        public Input<bool>? ModeOffUnknown { get; set; }

        /// <summary>
        /// Set the mode for VLAN VTP instance
        /// </summary>
        [Input("modeOffVlan")]
        public Input<bool>? ModeOffVlan { get; set; }

        /// <summary>
        /// Set the mode for MST VTP instance
        /// </summary>
        [Input("modeServerMst")]
        public Input<bool>? ModeServerMst { get; set; }

        /// <summary>
        /// Set the mode for unknown VTP instances
        /// </summary>
        [Input("modeServerUnknown")]
        public Input<bool>? ModeServerUnknown { get; set; }

        /// <summary>
        /// Set the mode for VLAN VTP instance
        /// </summary>
        [Input("modeServerVlan")]
        public Input<bool>? ModeServerVlan { get; set; }

        /// <summary>
        /// Set the mode for MST VTP instance
        /// </summary>
        [Input("modeTransparentMst")]
        public Input<bool>? ModeTransparentMst { get; set; }

        /// <summary>
        /// Set the mode for unknown VTP instances
        /// </summary>
        [Input("modeTransparentUnknown")]
        public Input<bool>? ModeTransparentUnknown { get; set; }

        /// <summary>
        /// Set the mode for VLAN VTP instance
        /// </summary>
        [Input("modeTransparentVlan")]
        public Input<bool>? ModeTransparentVlan { get; set; }

        /// <summary>
        /// The ascii password for the VTP administrative domain
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// Set the VTP password hidden option
        /// </summary>
        [Input("passwordHidden")]
        public Input<bool>? PasswordHidden { get; set; }

        /// <summary>
        /// Specify the vtp password in encrypted form
        /// </summary>
        [Input("passwordSecret")]
        public Input<bool>? PasswordSecret { get; set; }

        /// <summary>
        /// Set the administrative domain to permit pruning
        /// </summary>
        [Input("pruning")]
        public Input<bool>? Pruning { get; set; }

        /// <summary>
        /// Set the administrative domain to VTP version - Range: `1`-`3`
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public VtpArgs()
        {
        }
        public static new VtpArgs Empty => new VtpArgs();
    }

    public sealed class VtpState : global::Pulumi.ResourceArgs
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
        /// Set the name of the VTP administrative domain.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// Configure IFS filesystem file where VTP configuration is stored.
        /// </summary>
        [Input("file")]
        public Input<string>? File { get; set; }

        /// <summary>
        /// The name of the interface providing the VTP updater ID for this device
        /// </summary>
        [Input("interface")]
        public Input<string>? Interface { get; set; }

        /// <summary>
        /// Use only this interface's IP address as the VTP IP updater address
        /// </summary>
        [Input("interfaceOnly")]
        public Input<bool>? InterfaceOnly { get; set; }

        /// <summary>
        /// Set the mode for MST VTP instance
        /// </summary>
        [Input("modeClientMst")]
        public Input<bool>? ModeClientMst { get; set; }

        /// <summary>
        /// Set the mode for unknown VTP instances
        /// </summary>
        [Input("modeClientUnknown")]
        public Input<bool>? ModeClientUnknown { get; set; }

        /// <summary>
        /// Set the mode for VLAN VTP instance
        /// </summary>
        [Input("modeClientVlan")]
        public Input<bool>? ModeClientVlan { get; set; }

        /// <summary>
        /// Set the mode for MST VTP instance
        /// </summary>
        [Input("modeOffMst")]
        public Input<bool>? ModeOffMst { get; set; }

        /// <summary>
        /// Set the mode for unknown VTP instances
        /// </summary>
        [Input("modeOffUnknown")]
        public Input<bool>? ModeOffUnknown { get; set; }

        /// <summary>
        /// Set the mode for VLAN VTP instance
        /// </summary>
        [Input("modeOffVlan")]
        public Input<bool>? ModeOffVlan { get; set; }

        /// <summary>
        /// Set the mode for MST VTP instance
        /// </summary>
        [Input("modeServerMst")]
        public Input<bool>? ModeServerMst { get; set; }

        /// <summary>
        /// Set the mode for unknown VTP instances
        /// </summary>
        [Input("modeServerUnknown")]
        public Input<bool>? ModeServerUnknown { get; set; }

        /// <summary>
        /// Set the mode for VLAN VTP instance
        /// </summary>
        [Input("modeServerVlan")]
        public Input<bool>? ModeServerVlan { get; set; }

        /// <summary>
        /// Set the mode for MST VTP instance
        /// </summary>
        [Input("modeTransparentMst")]
        public Input<bool>? ModeTransparentMst { get; set; }

        /// <summary>
        /// Set the mode for unknown VTP instances
        /// </summary>
        [Input("modeTransparentUnknown")]
        public Input<bool>? ModeTransparentUnknown { get; set; }

        /// <summary>
        /// Set the mode for VLAN VTP instance
        /// </summary>
        [Input("modeTransparentVlan")]
        public Input<bool>? ModeTransparentVlan { get; set; }

        /// <summary>
        /// The ascii password for the VTP administrative domain
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// Set the VTP password hidden option
        /// </summary>
        [Input("passwordHidden")]
        public Input<bool>? PasswordHidden { get; set; }

        /// <summary>
        /// Specify the vtp password in encrypted form
        /// </summary>
        [Input("passwordSecret")]
        public Input<bool>? PasswordSecret { get; set; }

        /// <summary>
        /// Set the administrative domain to permit pruning
        /// </summary>
        [Input("pruning")]
        public Input<bool>? Pruning { get; set; }

        /// <summary>
        /// Set the administrative domain to VTP version - Range: `1`-`3`
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public VtpState()
        {
        }
        public static new VtpState Empty => new VtpState();
    }
}
