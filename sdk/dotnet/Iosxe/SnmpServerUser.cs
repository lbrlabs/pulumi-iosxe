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
    /// This resource can manage the SNMP Server User configuration.
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
    ///     var example = new Iosxe.SnmpServerUser("example", new()
    ///     {
    ///         Grpname = "GROUP1",
    ///         Username = "USER1",
    ///         V3AuthAlgorithm = "sha",
    ///         V3AuthPassword = "Cisco123",
    ///         V3AuthPrivAesAccessAclName = "ACL123",
    ///         V3AuthPrivAesAccessIpv6Acl = "V6ACL1",
    ///         V3AuthPrivAesAlgorithm = "128",
    ///         V3AuthPrivAesPassword = "Cisco123",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import iosxe:index/snmpServerUser:SnmpServerUser example "Cisco-IOS-XE-native:native/snmp-server/Cisco-IOS-XE-snmp:user/names=USER1,GROUP1"
    /// ```
    /// </summary>
    [IosxeResourceType("iosxe:index/snmpServerUser:SnmpServerUser")]
    public partial class SnmpServerUser : global::Pulumi.CustomResource
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
        /// Group to which the user belongs
        /// </summary>
        [Output("grpname")]
        public Output<string> Grpname { get; private set; } = null!;

        /// <summary>
        /// Name of the user
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;

        /// <summary>
        /// Access-list name
        /// </summary>
        [Output("v3AuthAccessAclName")]
        public Output<string?> V3AuthAccessAclName { get; private set; } = null!;

        /// <summary>
        /// Specify IPv6 Named Access-List
        /// </summary>
        [Output("v3AuthAccessIpv6Acl")]
        public Output<string?> V3AuthAccessIpv6Acl { get; private set; } = null!;

        /// <summary>
        /// Standard IP Access-list allowing access with this community string - Range: `1`-`99`
        /// </summary>
        [Output("v3AuthAccessStandardAcl")]
        public Output<int?> V3AuthAccessStandardAcl { get; private set; } = null!;

        /// <summary>
        /// Use HMAC SHA/MD5 algorithm for authentication - Choices: `md5`, `sha`
        /// </summary>
        [Output("v3AuthAlgorithm")]
        public Output<string> V3AuthAlgorithm { get; private set; } = null!;

        /// <summary>
        /// Authentication password for user
        /// </summary>
        [Output("v3AuthPassword")]
        public Output<string> V3AuthPassword { get; private set; } = null!;

        /// <summary>
        /// Access-list name
        /// </summary>
        [Output("v3AuthPrivAesAccessAclName")]
        public Output<string?> V3AuthPrivAesAccessAclName { get; private set; } = null!;

        /// <summary>
        /// Specify IPv6 Named Access-List
        /// </summary>
        [Output("v3AuthPrivAesAccessIpv6Acl")]
        public Output<string?> V3AuthPrivAesAccessIpv6Acl { get; private set; } = null!;

        /// <summary>
        /// Standard IP Access-list allowing access with this community string - Range: `1`-`99`
        /// </summary>
        [Output("v3AuthPrivAesAccessStandardAcl")]
        public Output<int?> V3AuthPrivAesAccessStandardAcl { get; private set; } = null!;

        /// <summary>
        /// - Choices: `128`, `192`, `256`
        /// </summary>
        [Output("v3AuthPrivAesAlgorithm")]
        public Output<string?> V3AuthPrivAesAlgorithm { get; private set; } = null!;

        /// <summary>
        /// Authentication password for user
        /// </summary>
        [Output("v3AuthPrivAesPassword")]
        public Output<string?> V3AuthPrivAesPassword { get; private set; } = null!;

        /// <summary>
        /// Access-list name
        /// </summary>
        [Output("v3AuthPrivDes3AccessAclName")]
        public Output<string?> V3AuthPrivDes3AccessAclName { get; private set; } = null!;

        /// <summary>
        /// Specify IPv6 Named Access-List
        /// </summary>
        [Output("v3AuthPrivDes3AccessIpv6Acl")]
        public Output<string?> V3AuthPrivDes3AccessIpv6Acl { get; private set; } = null!;

        /// <summary>
        /// Standard IP Access-list allowing access with this community string - Range: `1`-`99`
        /// </summary>
        [Output("v3AuthPrivDes3AccessStandardAcl")]
        public Output<int?> V3AuthPrivDes3AccessStandardAcl { get; private set; } = null!;

        /// <summary>
        /// Authentication password for user
        /// </summary>
        [Output("v3AuthPrivDes3Password")]
        public Output<string?> V3AuthPrivDes3Password { get; private set; } = null!;

        /// <summary>
        /// Access-list name
        /// </summary>
        [Output("v3AuthPrivDesAccessAclName")]
        public Output<string?> V3AuthPrivDesAccessAclName { get; private set; } = null!;

        /// <summary>
        /// Specify IPv6 Named Access-List
        /// </summary>
        [Output("v3AuthPrivDesAccessIpv6Acl")]
        public Output<string?> V3AuthPrivDesAccessIpv6Acl { get; private set; } = null!;

        /// <summary>
        /// Standard IP Access-list allowing access with this community string - Range: `1`-`99`
        /// </summary>
        [Output("v3AuthPrivDesAccessStandardAcl")]
        public Output<int?> V3AuthPrivDesAccessStandardAcl { get; private set; } = null!;

        /// <summary>
        /// Authentication password for user
        /// </summary>
        [Output("v3AuthPrivDesPassword")]
        public Output<string?> V3AuthPrivDesPassword { get; private set; } = null!;


        /// <summary>
        /// Create a SnmpServerUser resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SnmpServerUser(string name, SnmpServerUserArgs args, CustomResourceOptions? options = null)
            : base("iosxe:index/snmpServerUser:SnmpServerUser", name, args ?? new SnmpServerUserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SnmpServerUser(string name, Input<string> id, SnmpServerUserState? state = null, CustomResourceOptions? options = null)
            : base("iosxe:index/snmpServerUser:SnmpServerUser", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SnmpServerUser resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SnmpServerUser Get(string name, Input<string> id, SnmpServerUserState? state = null, CustomResourceOptions? options = null)
        {
            return new SnmpServerUser(name, id, state, options);
        }
    }

    public sealed class SnmpServerUserArgs : global::Pulumi.ResourceArgs
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
        /// Group to which the user belongs
        /// </summary>
        [Input("grpname", required: true)]
        public Input<string> Grpname { get; set; } = null!;

        /// <summary>
        /// Name of the user
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        /// <summary>
        /// Access-list name
        /// </summary>
        [Input("v3AuthAccessAclName")]
        public Input<string>? V3AuthAccessAclName { get; set; }

        /// <summary>
        /// Specify IPv6 Named Access-List
        /// </summary>
        [Input("v3AuthAccessIpv6Acl")]
        public Input<string>? V3AuthAccessIpv6Acl { get; set; }

        /// <summary>
        /// Standard IP Access-list allowing access with this community string - Range: `1`-`99`
        /// </summary>
        [Input("v3AuthAccessStandardAcl")]
        public Input<int>? V3AuthAccessStandardAcl { get; set; }

        /// <summary>
        /// Use HMAC SHA/MD5 algorithm for authentication - Choices: `md5`, `sha`
        /// </summary>
        [Input("v3AuthAlgorithm", required: true)]
        public Input<string> V3AuthAlgorithm { get; set; } = null!;

        /// <summary>
        /// Authentication password for user
        /// </summary>
        [Input("v3AuthPassword", required: true)]
        public Input<string> V3AuthPassword { get; set; } = null!;

        /// <summary>
        /// Access-list name
        /// </summary>
        [Input("v3AuthPrivAesAccessAclName")]
        public Input<string>? V3AuthPrivAesAccessAclName { get; set; }

        /// <summary>
        /// Specify IPv6 Named Access-List
        /// </summary>
        [Input("v3AuthPrivAesAccessIpv6Acl")]
        public Input<string>? V3AuthPrivAesAccessIpv6Acl { get; set; }

        /// <summary>
        /// Standard IP Access-list allowing access with this community string - Range: `1`-`99`
        /// </summary>
        [Input("v3AuthPrivAesAccessStandardAcl")]
        public Input<int>? V3AuthPrivAesAccessStandardAcl { get; set; }

        /// <summary>
        /// - Choices: `128`, `192`, `256`
        /// </summary>
        [Input("v3AuthPrivAesAlgorithm")]
        public Input<string>? V3AuthPrivAesAlgorithm { get; set; }

        /// <summary>
        /// Authentication password for user
        /// </summary>
        [Input("v3AuthPrivAesPassword")]
        public Input<string>? V3AuthPrivAesPassword { get; set; }

        /// <summary>
        /// Access-list name
        /// </summary>
        [Input("v3AuthPrivDes3AccessAclName")]
        public Input<string>? V3AuthPrivDes3AccessAclName { get; set; }

        /// <summary>
        /// Specify IPv6 Named Access-List
        /// </summary>
        [Input("v3AuthPrivDes3AccessIpv6Acl")]
        public Input<string>? V3AuthPrivDes3AccessIpv6Acl { get; set; }

        /// <summary>
        /// Standard IP Access-list allowing access with this community string - Range: `1`-`99`
        /// </summary>
        [Input("v3AuthPrivDes3AccessStandardAcl")]
        public Input<int>? V3AuthPrivDes3AccessStandardAcl { get; set; }

        /// <summary>
        /// Authentication password for user
        /// </summary>
        [Input("v3AuthPrivDes3Password")]
        public Input<string>? V3AuthPrivDes3Password { get; set; }

        /// <summary>
        /// Access-list name
        /// </summary>
        [Input("v3AuthPrivDesAccessAclName")]
        public Input<string>? V3AuthPrivDesAccessAclName { get; set; }

        /// <summary>
        /// Specify IPv6 Named Access-List
        /// </summary>
        [Input("v3AuthPrivDesAccessIpv6Acl")]
        public Input<string>? V3AuthPrivDesAccessIpv6Acl { get; set; }

        /// <summary>
        /// Standard IP Access-list allowing access with this community string - Range: `1`-`99`
        /// </summary>
        [Input("v3AuthPrivDesAccessStandardAcl")]
        public Input<int>? V3AuthPrivDesAccessStandardAcl { get; set; }

        /// <summary>
        /// Authentication password for user
        /// </summary>
        [Input("v3AuthPrivDesPassword")]
        public Input<string>? V3AuthPrivDesPassword { get; set; }

        public SnmpServerUserArgs()
        {
        }
        public static new SnmpServerUserArgs Empty => new SnmpServerUserArgs();
    }

    public sealed class SnmpServerUserState : global::Pulumi.ResourceArgs
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
        /// Group to which the user belongs
        /// </summary>
        [Input("grpname")]
        public Input<string>? Grpname { get; set; }

        /// <summary>
        /// Name of the user
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        /// <summary>
        /// Access-list name
        /// </summary>
        [Input("v3AuthAccessAclName")]
        public Input<string>? V3AuthAccessAclName { get; set; }

        /// <summary>
        /// Specify IPv6 Named Access-List
        /// </summary>
        [Input("v3AuthAccessIpv6Acl")]
        public Input<string>? V3AuthAccessIpv6Acl { get; set; }

        /// <summary>
        /// Standard IP Access-list allowing access with this community string - Range: `1`-`99`
        /// </summary>
        [Input("v3AuthAccessStandardAcl")]
        public Input<int>? V3AuthAccessStandardAcl { get; set; }

        /// <summary>
        /// Use HMAC SHA/MD5 algorithm for authentication - Choices: `md5`, `sha`
        /// </summary>
        [Input("v3AuthAlgorithm")]
        public Input<string>? V3AuthAlgorithm { get; set; }

        /// <summary>
        /// Authentication password for user
        /// </summary>
        [Input("v3AuthPassword")]
        public Input<string>? V3AuthPassword { get; set; }

        /// <summary>
        /// Access-list name
        /// </summary>
        [Input("v3AuthPrivAesAccessAclName")]
        public Input<string>? V3AuthPrivAesAccessAclName { get; set; }

        /// <summary>
        /// Specify IPv6 Named Access-List
        /// </summary>
        [Input("v3AuthPrivAesAccessIpv6Acl")]
        public Input<string>? V3AuthPrivAesAccessIpv6Acl { get; set; }

        /// <summary>
        /// Standard IP Access-list allowing access with this community string - Range: `1`-`99`
        /// </summary>
        [Input("v3AuthPrivAesAccessStandardAcl")]
        public Input<int>? V3AuthPrivAesAccessStandardAcl { get; set; }

        /// <summary>
        /// - Choices: `128`, `192`, `256`
        /// </summary>
        [Input("v3AuthPrivAesAlgorithm")]
        public Input<string>? V3AuthPrivAesAlgorithm { get; set; }

        /// <summary>
        /// Authentication password for user
        /// </summary>
        [Input("v3AuthPrivAesPassword")]
        public Input<string>? V3AuthPrivAesPassword { get; set; }

        /// <summary>
        /// Access-list name
        /// </summary>
        [Input("v3AuthPrivDes3AccessAclName")]
        public Input<string>? V3AuthPrivDes3AccessAclName { get; set; }

        /// <summary>
        /// Specify IPv6 Named Access-List
        /// </summary>
        [Input("v3AuthPrivDes3AccessIpv6Acl")]
        public Input<string>? V3AuthPrivDes3AccessIpv6Acl { get; set; }

        /// <summary>
        /// Standard IP Access-list allowing access with this community string - Range: `1`-`99`
        /// </summary>
        [Input("v3AuthPrivDes3AccessStandardAcl")]
        public Input<int>? V3AuthPrivDes3AccessStandardAcl { get; set; }

        /// <summary>
        /// Authentication password for user
        /// </summary>
        [Input("v3AuthPrivDes3Password")]
        public Input<string>? V3AuthPrivDes3Password { get; set; }

        /// <summary>
        /// Access-list name
        /// </summary>
        [Input("v3AuthPrivDesAccessAclName")]
        public Input<string>? V3AuthPrivDesAccessAclName { get; set; }

        /// <summary>
        /// Specify IPv6 Named Access-List
        /// </summary>
        [Input("v3AuthPrivDesAccessIpv6Acl")]
        public Input<string>? V3AuthPrivDesAccessIpv6Acl { get; set; }

        /// <summary>
        /// Standard IP Access-list allowing access with this community string - Range: `1`-`99`
        /// </summary>
        [Input("v3AuthPrivDesAccessStandardAcl")]
        public Input<int>? V3AuthPrivDesAccessStandardAcl { get; set; }

        /// <summary>
        /// Authentication password for user
        /// </summary>
        [Input("v3AuthPrivDesPassword")]
        public Input<string>? V3AuthPrivDesPassword { get; set; }

        public SnmpServerUserState()
        {
        }
        public static new SnmpServerUserState Empty => new SnmpServerUserState();
    }
}
