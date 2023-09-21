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
    /// The provider type for the iosxe package. By default, resources use package-wide configuration
    /// settings, however an explicit `Provider` instance may be created and passed during resource
    /// construction to achieve fine-grained programmatic control over provider settings. See the
    /// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
    /// </summary>
    [IosxeResourceType("pulumi:providers:iosxe")]
    public partial class Provider : global::Pulumi.ProviderResource
    {
        /// <summary>
        /// Password for the IOS-XE device. This can also be set as the IOSXE_PASSWORD environment variable.
        /// </summary>
        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// URL of the Cisco IOS-XE device. Optionally a port can be added with `:12345`. The default port is `443`. This can also
        /// be set as the IOSXE_URL environment variable.
        /// </summary>
        [Output("url")]
        public Output<string?> Url { get; private set; } = null!;

        /// <summary>
        /// Username for the IOS-XE device. This can also be set as the IOSXE_USERNAME environment variable.
        /// </summary>
        [Output("username")]
        public Output<string?> Username { get; private set; } = null!;


        /// <summary>
        /// Create a Provider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Provider(string name, ProviderArgs? args = null, CustomResourceOptions? options = null)
            : base("iosxe", name, args ?? new ProviderArgs(), MakeResourceOptions(options, ""))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
                AdditionalSecretOutputs =
                {
                    "password",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
    }

    public sealed class ProviderArgs : global::Pulumi.ResourceArgs
    {
        [Input("devices", json: true)]
        private InputList<Inputs.ProviderDeviceArgs>? _devices;

        /// <summary>
        /// This can be used to manage a list of devices from a single provider. All devices must use the same credentials. Each
        /// resource and data source has an optional attribute named `device`, which can then select a device by its name from this
        /// list.
        /// </summary>
        public InputList<Inputs.ProviderDeviceArgs> Devices
        {
            get => _devices ?? (_devices = new InputList<Inputs.ProviderDeviceArgs>());
            set => _devices = value;
        }

        /// <summary>
        /// Allow insecure HTTPS client. This can also be set as the IOSXE_INSECURE environment variable. Defaults to `true`.
        /// </summary>
        [Input("insecure", json: true)]
        public Input<bool>? Insecure { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// Password for the IOS-XE device. This can also be set as the IOSXE_PASSWORD environment variable.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Number of retries for REST API calls. This can also be set as the IOSXE_RETRIES environment variable. Defaults to `10`.
        /// </summary>
        [Input("retries", json: true)]
        public Input<int>? Retries { get; set; }

        /// <summary>
        /// URL of the Cisco IOS-XE device. Optionally a port can be added with `:12345`. The default port is `443`. This can also
        /// be set as the IOSXE_URL environment variable.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        /// <summary>
        /// Username for the IOS-XE device. This can also be set as the IOSXE_USERNAME environment variable.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public ProviderArgs()
        {
        }
        public static new ProviderArgs Empty => new ProviderArgs();
    }
}
