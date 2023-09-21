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
    [IosxeResourceType("iosxe:iosxe/staticRoute:StaticRoute")]
    public partial class StaticRoute : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Output("device")]
        public Output<string?> Device { get; private set; } = null!;

        [Output("mask")]
        public Output<string> Mask { get; private set; } = null!;

        [Output("nextHops")]
        public Output<ImmutableArray<Outputs.StaticRouteNextHop>> NextHops { get; private set; } = null!;

        [Output("prefix")]
        public Output<string> Prefix { get; private set; } = null!;


        /// <summary>
        /// Create a StaticRoute resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public StaticRoute(string name, StaticRouteArgs args, CustomResourceOptions? options = null)
            : base("iosxe:iosxe/staticRoute:StaticRoute", name, args ?? new StaticRouteArgs(), MakeResourceOptions(options, ""))
        {
        }

        private StaticRoute(string name, Input<string> id, StaticRouteState? state = null, CustomResourceOptions? options = null)
            : base("iosxe:iosxe/staticRoute:StaticRoute", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing StaticRoute resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static StaticRoute Get(string name, Input<string> id, StaticRouteState? state = null, CustomResourceOptions? options = null)
        {
            return new StaticRoute(name, id, state, options);
        }
    }

    public sealed class StaticRouteArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("mask", required: true)]
        public Input<string> Mask { get; set; } = null!;

        [Input("nextHops")]
        private InputList<Inputs.StaticRouteNextHopArgs>? _nextHops;
        public InputList<Inputs.StaticRouteNextHopArgs> NextHops
        {
            get => _nextHops ?? (_nextHops = new InputList<Inputs.StaticRouteNextHopArgs>());
            set => _nextHops = value;
        }

        [Input("prefix", required: true)]
        public Input<string> Prefix { get; set; } = null!;

        public StaticRouteArgs()
        {
        }
        public static new StaticRouteArgs Empty => new StaticRouteArgs();
    }

    public sealed class StaticRouteState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("mask")]
        public Input<string>? Mask { get; set; }

        [Input("nextHops")]
        private InputList<Inputs.StaticRouteNextHopGetArgs>? _nextHops;
        public InputList<Inputs.StaticRouteNextHopGetArgs> NextHops
        {
            get => _nextHops ?? (_nextHops = new InputList<Inputs.StaticRouteNextHopGetArgs>());
            set => _nextHops = value;
        }

        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        public StaticRouteState()
        {
        }
        public static new StaticRouteState Empty => new StaticRouteState();
    }
}
