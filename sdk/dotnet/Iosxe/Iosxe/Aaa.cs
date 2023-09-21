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
    [IosxeResourceType("iosxe:iosxe/aaa:Aaa")]
    public partial class Aaa : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Output("device")]
        public Output<string?> Device { get; private set; } = null!;

        /// <summary>
        /// Radius server-group definition
        /// </summary>
        [Output("groupServerRadii")]
        public Output<ImmutableArray<Outputs.AaaGroupServerRadius>> GroupServerRadii { get; private set; } = null!;

        /// <summary>
        /// Tacacs+ server-group definition
        /// </summary>
        [Output("groupServerTacacspluses")]
        public Output<ImmutableArray<Outputs.AaaGroupServerTacacsplus>> GroupServerTacacspluses { get; private set; } = null!;

        /// <summary>
        /// Enable NEW access control commands and functions.(Disables OLD commands.)
        /// </summary>
        [Output("newModel")]
        public Output<bool?> NewModel { get; private set; } = null!;

        /// <summary>
        /// Local server profile for RFC 3576 support
        /// </summary>
        [Output("serverRadiusDynamicAuthor")]
        public Output<bool?> ServerRadiusDynamicAuthor { get; private set; } = null!;

        /// <summary>
        /// Specify a RADIUS client
        /// </summary>
        [Output("serverRadiusDynamicAuthorClients")]
        public Output<ImmutableArray<Outputs.AaaServerRadiusDynamicAuthorClient>> ServerRadiusDynamicAuthorClients { get; private set; } = null!;

        /// <summary>
        /// AAA Session ID - Choices: `common`, `unique`
        /// </summary>
        [Output("sessionId")]
        public Output<string?> SessionId { get; private set; } = null!;


        /// <summary>
        /// Create a Aaa resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Aaa(string name, AaaArgs? args = null, CustomResourceOptions? options = null)
            : base("iosxe:iosxe/aaa:Aaa", name, args ?? new AaaArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Aaa(string name, Input<string> id, AaaState? state = null, CustomResourceOptions? options = null)
            : base("iosxe:iosxe/aaa:Aaa", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Aaa resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Aaa Get(string name, Input<string> id, AaaState? state = null, CustomResourceOptions? options = null)
        {
            return new Aaa(name, id, state, options);
        }
    }

    public sealed class AaaArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("groupServerRadii")]
        private InputList<Inputs.AaaGroupServerRadiusArgs>? _groupServerRadii;

        /// <summary>
        /// Radius server-group definition
        /// </summary>
        public InputList<Inputs.AaaGroupServerRadiusArgs> GroupServerRadii
        {
            get => _groupServerRadii ?? (_groupServerRadii = new InputList<Inputs.AaaGroupServerRadiusArgs>());
            set => _groupServerRadii = value;
        }

        [Input("groupServerTacacspluses")]
        private InputList<Inputs.AaaGroupServerTacacsplusArgs>? _groupServerTacacspluses;

        /// <summary>
        /// Tacacs+ server-group definition
        /// </summary>
        public InputList<Inputs.AaaGroupServerTacacsplusArgs> GroupServerTacacspluses
        {
            get => _groupServerTacacspluses ?? (_groupServerTacacspluses = new InputList<Inputs.AaaGroupServerTacacsplusArgs>());
            set => _groupServerTacacspluses = value;
        }

        /// <summary>
        /// Enable NEW access control commands and functions.(Disables OLD commands.)
        /// </summary>
        [Input("newModel")]
        public Input<bool>? NewModel { get; set; }

        /// <summary>
        /// Local server profile for RFC 3576 support
        /// </summary>
        [Input("serverRadiusDynamicAuthor")]
        public Input<bool>? ServerRadiusDynamicAuthor { get; set; }

        [Input("serverRadiusDynamicAuthorClients")]
        private InputList<Inputs.AaaServerRadiusDynamicAuthorClientArgs>? _serverRadiusDynamicAuthorClients;

        /// <summary>
        /// Specify a RADIUS client
        /// </summary>
        public InputList<Inputs.AaaServerRadiusDynamicAuthorClientArgs> ServerRadiusDynamicAuthorClients
        {
            get => _serverRadiusDynamicAuthorClients ?? (_serverRadiusDynamicAuthorClients = new InputList<Inputs.AaaServerRadiusDynamicAuthorClientArgs>());
            set => _serverRadiusDynamicAuthorClients = value;
        }

        /// <summary>
        /// AAA Session ID - Choices: `common`, `unique`
        /// </summary>
        [Input("sessionId")]
        public Input<string>? SessionId { get; set; }

        public AaaArgs()
        {
        }
        public static new AaaArgs Empty => new AaaArgs();
    }

    public sealed class AaaState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("groupServerRadii")]
        private InputList<Inputs.AaaGroupServerRadiusGetArgs>? _groupServerRadii;

        /// <summary>
        /// Radius server-group definition
        /// </summary>
        public InputList<Inputs.AaaGroupServerRadiusGetArgs> GroupServerRadii
        {
            get => _groupServerRadii ?? (_groupServerRadii = new InputList<Inputs.AaaGroupServerRadiusGetArgs>());
            set => _groupServerRadii = value;
        }

        [Input("groupServerTacacspluses")]
        private InputList<Inputs.AaaGroupServerTacacsplusGetArgs>? _groupServerTacacspluses;

        /// <summary>
        /// Tacacs+ server-group definition
        /// </summary>
        public InputList<Inputs.AaaGroupServerTacacsplusGetArgs> GroupServerTacacspluses
        {
            get => _groupServerTacacspluses ?? (_groupServerTacacspluses = new InputList<Inputs.AaaGroupServerTacacsplusGetArgs>());
            set => _groupServerTacacspluses = value;
        }

        /// <summary>
        /// Enable NEW access control commands and functions.(Disables OLD commands.)
        /// </summary>
        [Input("newModel")]
        public Input<bool>? NewModel { get; set; }

        /// <summary>
        /// Local server profile for RFC 3576 support
        /// </summary>
        [Input("serverRadiusDynamicAuthor")]
        public Input<bool>? ServerRadiusDynamicAuthor { get; set; }

        [Input("serverRadiusDynamicAuthorClients")]
        private InputList<Inputs.AaaServerRadiusDynamicAuthorClientGetArgs>? _serverRadiusDynamicAuthorClients;

        /// <summary>
        /// Specify a RADIUS client
        /// </summary>
        public InputList<Inputs.AaaServerRadiusDynamicAuthorClientGetArgs> ServerRadiusDynamicAuthorClients
        {
            get => _serverRadiusDynamicAuthorClients ?? (_serverRadiusDynamicAuthorClients = new InputList<Inputs.AaaServerRadiusDynamicAuthorClientGetArgs>());
            set => _serverRadiusDynamicAuthorClients = value;
        }

        /// <summary>
        /// AAA Session ID - Choices: `common`, `unique`
        /// </summary>
        [Input("sessionId")]
        public Input<string>? SessionId { get; set; }

        public AaaState()
        {
        }
        public static new AaaState Empty => new AaaState();
    }
}
