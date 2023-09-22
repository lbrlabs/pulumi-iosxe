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
    /// This resource can manage the Service configuration.
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
    ///     var example = new Iosxe.Service("example", new()
    ///     {
    ///         CallHome = true,
    ///         CompressConfig = true,
    ///         Dhcp = true,
    ///         Pad = true,
    ///         PasswordEncryption = true,
    ///         PasswordRecovery = true,
    ///         SequenceNumbers = true,
    ///         TcpKeepalivesIn = true,
    ///         TcpKeepalivesOut = true,
    ///         Timestamps = true,
    ///         TimestampsDebug = true,
    ///         TimestampsDebugDatetime = true,
    ///         TimestampsDebugDatetimeLocaltime = true,
    ///         TimestampsDebugDatetimeMsec = true,
    ///         TimestampsDebugDatetimeShowTimezone = true,
    ///         TimestampsDebugDatetimeYear = true,
    ///         TimestampsDebugUptime = true,
    ///         TimestampsLog = true,
    ///         TimestampsLogDatetime = true,
    ///         TimestampsLogDatetimeLocaltime = true,
    ///         TimestampsLogDatetimeMsec = true,
    ///         TimestampsLogDatetimeShowTimezone = true,
    ///         TimestampsLogDatetimeYear = true,
    ///         TimestampsLogUptime = true,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import iosxe:index/service:Service example "Cisco-IOS-XE-native:native/service"
    /// ```
    /// </summary>
    [IosxeResourceType("iosxe:index/service:Service")]
    public partial class Service : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Enable call-home service
        /// </summary>
        [Output("callHome")]
        public Output<bool?> CallHome { get; private set; } = null!;

        /// <summary>
        /// Compress the configuration file
        /// </summary>
        [Output("compressConfig")]
        public Output<bool?> CompressConfig { get; private set; } = null!;

        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Output("device")]
        public Output<string?> Device { get; private set; } = null!;

        /// <summary>
        /// Enable DHCP server and relay agent
        /// </summary>
        [Output("dhcp")]
        public Output<bool?> Dhcp { get; private set; } = null!;

        /// <summary>
        /// Enable PAD commands
        /// </summary>
        [Output("pad")]
        public Output<bool?> Pad { get; private set; } = null!;

        /// <summary>
        /// Encrypt system passwords
        /// </summary>
        [Output("passwordEncryption")]
        public Output<bool?> PasswordEncryption { get; private set; } = null!;

        /// <summary>
        /// Enable password recovery
        /// </summary>
        [Output("passwordRecovery")]
        public Output<bool?> PasswordRecovery { get; private set; } = null!;

        /// <summary>
        /// Stamp logger messages with a sequence number
        /// </summary>
        [Output("sequenceNumbers")]
        public Output<bool?> SequenceNumbers { get; private set; } = null!;

        /// <summary>
        /// Generate keepalives on idle incoming network connections
        /// </summary>
        [Output("tcpKeepalivesIn")]
        public Output<bool?> TcpKeepalivesIn { get; private set; } = null!;

        /// <summary>
        /// Generate keepalives on idle outgoing network connections
        /// </summary>
        [Output("tcpKeepalivesOut")]
        public Output<bool?> TcpKeepalivesOut { get; private set; } = null!;

        /// <summary>
        /// Timestamp debug/log messages
        /// </summary>
        [Output("timestamps")]
        public Output<bool?> Timestamps { get; private set; } = null!;

        /// <summary>
        /// Timestamp debug messages
        /// </summary>
        [Output("timestampsDebug")]
        public Output<bool?> TimestampsDebug { get; private set; } = null!;

        /// <summary>
        /// Timestamp with date and time
        /// </summary>
        [Output("timestampsDebugDatetime")]
        public Output<bool?> TimestampsDebugDatetime { get; private set; } = null!;

        /// <summary>
        /// Use local time zone for timestamps
        /// </summary>
        [Output("timestampsDebugDatetimeLocaltime")]
        public Output<bool?> TimestampsDebugDatetimeLocaltime { get; private set; } = null!;

        /// <summary>
        /// Include milliseconds in timestamp
        /// </summary>
        [Output("timestampsDebugDatetimeMsec")]
        public Output<bool?> TimestampsDebugDatetimeMsec { get; private set; } = null!;

        /// <summary>
        /// Add time zone information to timestamp
        /// </summary>
        [Output("timestampsDebugDatetimeShowTimezone")]
        public Output<bool?> TimestampsDebugDatetimeShowTimezone { get; private set; } = null!;

        /// <summary>
        /// Include year in timestamp
        /// </summary>
        [Output("timestampsDebugDatetimeYear")]
        public Output<bool?> TimestampsDebugDatetimeYear { get; private set; } = null!;

        /// <summary>
        /// Timestamp with system uptime
        /// </summary>
        [Output("timestampsDebugUptime")]
        public Output<bool?> TimestampsDebugUptime { get; private set; } = null!;

        /// <summary>
        /// Timestamp log messages
        /// </summary>
        [Output("timestampsLog")]
        public Output<bool?> TimestampsLog { get; private set; } = null!;

        /// <summary>
        /// Timestamp with date and time
        /// </summary>
        [Output("timestampsLogDatetime")]
        public Output<bool?> TimestampsLogDatetime { get; private set; } = null!;

        /// <summary>
        /// Use local time zone for timestamps
        /// </summary>
        [Output("timestampsLogDatetimeLocaltime")]
        public Output<bool?> TimestampsLogDatetimeLocaltime { get; private set; } = null!;

        /// <summary>
        /// Include milliseconds in timestamp
        /// </summary>
        [Output("timestampsLogDatetimeMsec")]
        public Output<bool?> TimestampsLogDatetimeMsec { get; private set; } = null!;

        /// <summary>
        /// Add time zone information to timestamp
        /// </summary>
        [Output("timestampsLogDatetimeShowTimezone")]
        public Output<bool?> TimestampsLogDatetimeShowTimezone { get; private set; } = null!;

        /// <summary>
        /// Include year in timestamp
        /// </summary>
        [Output("timestampsLogDatetimeYear")]
        public Output<bool?> TimestampsLogDatetimeYear { get; private set; } = null!;

        /// <summary>
        /// Timestamp with system uptime
        /// </summary>
        [Output("timestampsLogUptime")]
        public Output<bool?> TimestampsLogUptime { get; private set; } = null!;


        /// <summary>
        /// Create a Service resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Service(string name, ServiceArgs? args = null, CustomResourceOptions? options = null)
            : base("iosxe:index/service:Service", name, args ?? new ServiceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Service(string name, Input<string> id, ServiceState? state = null, CustomResourceOptions? options = null)
            : base("iosxe:index/service:Service", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Service resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Service Get(string name, Input<string> id, ServiceState? state = null, CustomResourceOptions? options = null)
        {
            return new Service(name, id, state, options);
        }
    }

    public sealed class ServiceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable call-home service
        /// </summary>
        [Input("callHome")]
        public Input<bool>? CallHome { get; set; }

        /// <summary>
        /// Compress the configuration file
        /// </summary>
        [Input("compressConfig")]
        public Input<bool>? CompressConfig { get; set; }

        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// Enable DHCP server and relay agent
        /// </summary>
        [Input("dhcp")]
        public Input<bool>? Dhcp { get; set; }

        /// <summary>
        /// Enable PAD commands
        /// </summary>
        [Input("pad")]
        public Input<bool>? Pad { get; set; }

        /// <summary>
        /// Encrypt system passwords
        /// </summary>
        [Input("passwordEncryption")]
        public Input<bool>? PasswordEncryption { get; set; }

        /// <summary>
        /// Enable password recovery
        /// </summary>
        [Input("passwordRecovery")]
        public Input<bool>? PasswordRecovery { get; set; }

        /// <summary>
        /// Stamp logger messages with a sequence number
        /// </summary>
        [Input("sequenceNumbers")]
        public Input<bool>? SequenceNumbers { get; set; }

        /// <summary>
        /// Generate keepalives on idle incoming network connections
        /// </summary>
        [Input("tcpKeepalivesIn")]
        public Input<bool>? TcpKeepalivesIn { get; set; }

        /// <summary>
        /// Generate keepalives on idle outgoing network connections
        /// </summary>
        [Input("tcpKeepalivesOut")]
        public Input<bool>? TcpKeepalivesOut { get; set; }

        /// <summary>
        /// Timestamp debug/log messages
        /// </summary>
        [Input("timestamps")]
        public Input<bool>? Timestamps { get; set; }

        /// <summary>
        /// Timestamp debug messages
        /// </summary>
        [Input("timestampsDebug")]
        public Input<bool>? TimestampsDebug { get; set; }

        /// <summary>
        /// Timestamp with date and time
        /// </summary>
        [Input("timestampsDebugDatetime")]
        public Input<bool>? TimestampsDebugDatetime { get; set; }

        /// <summary>
        /// Use local time zone for timestamps
        /// </summary>
        [Input("timestampsDebugDatetimeLocaltime")]
        public Input<bool>? TimestampsDebugDatetimeLocaltime { get; set; }

        /// <summary>
        /// Include milliseconds in timestamp
        /// </summary>
        [Input("timestampsDebugDatetimeMsec")]
        public Input<bool>? TimestampsDebugDatetimeMsec { get; set; }

        /// <summary>
        /// Add time zone information to timestamp
        /// </summary>
        [Input("timestampsDebugDatetimeShowTimezone")]
        public Input<bool>? TimestampsDebugDatetimeShowTimezone { get; set; }

        /// <summary>
        /// Include year in timestamp
        /// </summary>
        [Input("timestampsDebugDatetimeYear")]
        public Input<bool>? TimestampsDebugDatetimeYear { get; set; }

        /// <summary>
        /// Timestamp with system uptime
        /// </summary>
        [Input("timestampsDebugUptime")]
        public Input<bool>? TimestampsDebugUptime { get; set; }

        /// <summary>
        /// Timestamp log messages
        /// </summary>
        [Input("timestampsLog")]
        public Input<bool>? TimestampsLog { get; set; }

        /// <summary>
        /// Timestamp with date and time
        /// </summary>
        [Input("timestampsLogDatetime")]
        public Input<bool>? TimestampsLogDatetime { get; set; }

        /// <summary>
        /// Use local time zone for timestamps
        /// </summary>
        [Input("timestampsLogDatetimeLocaltime")]
        public Input<bool>? TimestampsLogDatetimeLocaltime { get; set; }

        /// <summary>
        /// Include milliseconds in timestamp
        /// </summary>
        [Input("timestampsLogDatetimeMsec")]
        public Input<bool>? TimestampsLogDatetimeMsec { get; set; }

        /// <summary>
        /// Add time zone information to timestamp
        /// </summary>
        [Input("timestampsLogDatetimeShowTimezone")]
        public Input<bool>? TimestampsLogDatetimeShowTimezone { get; set; }

        /// <summary>
        /// Include year in timestamp
        /// </summary>
        [Input("timestampsLogDatetimeYear")]
        public Input<bool>? TimestampsLogDatetimeYear { get; set; }

        /// <summary>
        /// Timestamp with system uptime
        /// </summary>
        [Input("timestampsLogUptime")]
        public Input<bool>? TimestampsLogUptime { get; set; }

        public ServiceArgs()
        {
        }
        public static new ServiceArgs Empty => new ServiceArgs();
    }

    public sealed class ServiceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable call-home service
        /// </summary>
        [Input("callHome")]
        public Input<bool>? CallHome { get; set; }

        /// <summary>
        /// Compress the configuration file
        /// </summary>
        [Input("compressConfig")]
        public Input<bool>? CompressConfig { get; set; }

        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// Enable DHCP server and relay agent
        /// </summary>
        [Input("dhcp")]
        public Input<bool>? Dhcp { get; set; }

        /// <summary>
        /// Enable PAD commands
        /// </summary>
        [Input("pad")]
        public Input<bool>? Pad { get; set; }

        /// <summary>
        /// Encrypt system passwords
        /// </summary>
        [Input("passwordEncryption")]
        public Input<bool>? PasswordEncryption { get; set; }

        /// <summary>
        /// Enable password recovery
        /// </summary>
        [Input("passwordRecovery")]
        public Input<bool>? PasswordRecovery { get; set; }

        /// <summary>
        /// Stamp logger messages with a sequence number
        /// </summary>
        [Input("sequenceNumbers")]
        public Input<bool>? SequenceNumbers { get; set; }

        /// <summary>
        /// Generate keepalives on idle incoming network connections
        /// </summary>
        [Input("tcpKeepalivesIn")]
        public Input<bool>? TcpKeepalivesIn { get; set; }

        /// <summary>
        /// Generate keepalives on idle outgoing network connections
        /// </summary>
        [Input("tcpKeepalivesOut")]
        public Input<bool>? TcpKeepalivesOut { get; set; }

        /// <summary>
        /// Timestamp debug/log messages
        /// </summary>
        [Input("timestamps")]
        public Input<bool>? Timestamps { get; set; }

        /// <summary>
        /// Timestamp debug messages
        /// </summary>
        [Input("timestampsDebug")]
        public Input<bool>? TimestampsDebug { get; set; }

        /// <summary>
        /// Timestamp with date and time
        /// </summary>
        [Input("timestampsDebugDatetime")]
        public Input<bool>? TimestampsDebugDatetime { get; set; }

        /// <summary>
        /// Use local time zone for timestamps
        /// </summary>
        [Input("timestampsDebugDatetimeLocaltime")]
        public Input<bool>? TimestampsDebugDatetimeLocaltime { get; set; }

        /// <summary>
        /// Include milliseconds in timestamp
        /// </summary>
        [Input("timestampsDebugDatetimeMsec")]
        public Input<bool>? TimestampsDebugDatetimeMsec { get; set; }

        /// <summary>
        /// Add time zone information to timestamp
        /// </summary>
        [Input("timestampsDebugDatetimeShowTimezone")]
        public Input<bool>? TimestampsDebugDatetimeShowTimezone { get; set; }

        /// <summary>
        /// Include year in timestamp
        /// </summary>
        [Input("timestampsDebugDatetimeYear")]
        public Input<bool>? TimestampsDebugDatetimeYear { get; set; }

        /// <summary>
        /// Timestamp with system uptime
        /// </summary>
        [Input("timestampsDebugUptime")]
        public Input<bool>? TimestampsDebugUptime { get; set; }

        /// <summary>
        /// Timestamp log messages
        /// </summary>
        [Input("timestampsLog")]
        public Input<bool>? TimestampsLog { get; set; }

        /// <summary>
        /// Timestamp with date and time
        /// </summary>
        [Input("timestampsLogDatetime")]
        public Input<bool>? TimestampsLogDatetime { get; set; }

        /// <summary>
        /// Use local time zone for timestamps
        /// </summary>
        [Input("timestampsLogDatetimeLocaltime")]
        public Input<bool>? TimestampsLogDatetimeLocaltime { get; set; }

        /// <summary>
        /// Include milliseconds in timestamp
        /// </summary>
        [Input("timestampsLogDatetimeMsec")]
        public Input<bool>? TimestampsLogDatetimeMsec { get; set; }

        /// <summary>
        /// Add time zone information to timestamp
        /// </summary>
        [Input("timestampsLogDatetimeShowTimezone")]
        public Input<bool>? TimestampsLogDatetimeShowTimezone { get; set; }

        /// <summary>
        /// Include year in timestamp
        /// </summary>
        [Input("timestampsLogDatetimeYear")]
        public Input<bool>? TimestampsLogDatetimeYear { get; set; }

        /// <summary>
        /// Timestamp with system uptime
        /// </summary>
        [Input("timestampsLogUptime")]
        public Input<bool>? TimestampsLogUptime { get; set; }

        public ServiceState()
        {
        }
        public static new ServiceState Empty => new ServiceState();
    }
}