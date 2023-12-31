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
    /// This resource can manage the Access List Standard configuration.
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import iosxe:index/accessListStandard:AccessListStandard example "Cisco-IOS-XE-native:native/ip/access-list/Cisco-IOS-XE-acl:standard=SACL1"
    /// ```
    /// </summary>
    [IosxeResourceType("iosxe:index/accessListStandard:AccessListStandard")]
    public partial class AccessListStandard : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Output("device")]
        public Output<string?> Device { get; private set; } = null!;

        [Output("entries")]
        public Output<ImmutableArray<Outputs.AccessListStandardEntry>> Entries { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a AccessListStandard resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccessListStandard(string name, AccessListStandardArgs? args = null, CustomResourceOptions? options = null)
            : base("iosxe:index/accessListStandard:AccessListStandard", name, args ?? new AccessListStandardArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccessListStandard(string name, Input<string> id, AccessListStandardState? state = null, CustomResourceOptions? options = null)
            : base("iosxe:index/accessListStandard:AccessListStandard", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccessListStandard resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccessListStandard Get(string name, Input<string> id, AccessListStandardState? state = null, CustomResourceOptions? options = null)
        {
            return new AccessListStandard(name, id, state, options);
        }
    }

    public sealed class AccessListStandardArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("entries")]
        private InputList<Inputs.AccessListStandardEntryArgs>? _entries;
        public InputList<Inputs.AccessListStandardEntryArgs> Entries
        {
            get => _entries ?? (_entries = new InputList<Inputs.AccessListStandardEntryArgs>());
            set => _entries = value;
        }

        [Input("name")]
        public Input<string>? Name { get; set; }

        public AccessListStandardArgs()
        {
        }
        public static new AccessListStandardArgs Empty => new AccessListStandardArgs();
    }

    public sealed class AccessListStandardState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        [Input("entries")]
        private InputList<Inputs.AccessListStandardEntryGetArgs>? _entries;
        public InputList<Inputs.AccessListStandardEntryGetArgs> Entries
        {
            get => _entries ?? (_entries = new InputList<Inputs.AccessListStandardEntryGetArgs>());
            set => _entries = value;
        }

        [Input("name")]
        public Input<string>? Name { get; set; }

        public AccessListStandardState()
        {
        }
        public static new AccessListStandardState Empty => new AccessListStandardState();
    }
}
