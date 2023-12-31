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
    /// This resource can manage the Access List Extended configuration.
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import iosxe:index/accessListExtended:AccessListExtended example "Cisco-IOS-XE-native:native/ip/access-list/Cisco-IOS-XE-acl:extended=EACL1"
    /// ```
    /// </summary>
    [IosxeResourceType("iosxe:index/accessListExtended:AccessListExtended")]
    public partial class AccessListExtended : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Output("device")]
        public Output<string?> Device { get; private set; } = null!;

        [Output("entries")]
        public Output<ImmutableArray<Outputs.AccessListExtendedEntry>> Entries { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a AccessListExtended resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccessListExtended(string name, AccessListExtendedArgs? args = null, CustomResourceOptions? options = null)
            : base("iosxe:index/accessListExtended:AccessListExtended", name, args ?? new AccessListExtendedArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccessListExtended(string name, Input<string> id, AccessListExtendedState? state = null, CustomResourceOptions? options = null)
            : base("iosxe:index/accessListExtended:AccessListExtended", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccessListExtended resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccessListExtended Get(string name, Input<string> id, AccessListExtendedState? state = null, CustomResourceOptions? options = null)
        {
            return new AccessListExtended(name, id, state, options);
        }
    }

    public sealed class AccessListExtendedArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("entries")]
        private InputList<Inputs.AccessListExtendedEntryArgs>? _entries;
        public InputList<Inputs.AccessListExtendedEntryArgs> Entries
        {
            get => _entries ?? (_entries = new InputList<Inputs.AccessListExtendedEntryArgs>());
            set => _entries = value;
        }

        [Input("name")]
        public Input<string>? Name { get; set; }

        public AccessListExtendedArgs()
        {
        }
        public static new AccessListExtendedArgs Empty => new AccessListExtendedArgs();
    }

    public sealed class AccessListExtendedState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("entries")]
        private InputList<Inputs.AccessListExtendedEntryGetArgs>? _entries;
        public InputList<Inputs.AccessListExtendedEntryGetArgs> Entries
        {
            get => _entries ?? (_entries = new InputList<Inputs.AccessListExtendedEntryGetArgs>());
            set => _entries = value;
        }

        [Input("name")]
        public Input<string>? Name { get; set; }

        public AccessListExtendedState()
        {
        }
        public static new AccessListExtendedState Empty => new AccessListExtendedState();
    }
}
