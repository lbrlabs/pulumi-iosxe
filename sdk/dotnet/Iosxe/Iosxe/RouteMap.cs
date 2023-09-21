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
    [IosxeResourceType("iosxe:iosxe/routeMap:RouteMap")]
    public partial class RouteMap : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Output("device")]
        public Output<string?> Device { get; private set; } = null!;

        [Output("entries")]
        public Output<ImmutableArray<Outputs.RouteMapEntry>> Entries { get; private set; } = null!;

        /// <summary>
        /// WORD;;Route map tag
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a RouteMap resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RouteMap(string name, RouteMapArgs? args = null, CustomResourceOptions? options = null)
            : base("iosxe:iosxe/routeMap:RouteMap", name, args ?? new RouteMapArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RouteMap(string name, Input<string> id, RouteMapState? state = null, CustomResourceOptions? options = null)
            : base("iosxe:iosxe/routeMap:RouteMap", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RouteMap resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RouteMap Get(string name, Input<string> id, RouteMapState? state = null, CustomResourceOptions? options = null)
        {
            return new RouteMap(name, id, state, options);
        }
    }

    public sealed class RouteMapArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("entries")]
        private InputList<Inputs.RouteMapEntryArgs>? _entries;
        public InputList<Inputs.RouteMapEntryArgs> Entries
        {
            get => _entries ?? (_entries = new InputList<Inputs.RouteMapEntryArgs>());
            set => _entries = value;
        }

        /// <summary>
        /// WORD;;Route map tag
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public RouteMapArgs()
        {
        }
        public static new RouteMapArgs Empty => new RouteMapArgs();
    }

    public sealed class RouteMapState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("entries")]
        private InputList<Inputs.RouteMapEntryGetArgs>? _entries;
        public InputList<Inputs.RouteMapEntryGetArgs> Entries
        {
            get => _entries ?? (_entries = new InputList<Inputs.RouteMapEntryGetArgs>());
            set => _entries = value;
        }

        /// <summary>
        /// WORD;;Route map tag
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public RouteMapState()
        {
        }
        public static new RouteMapState Empty => new RouteMapState();
    }
}
