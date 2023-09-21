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
    [IosxeResourceType("iosxe:iosxe/serviceTemplate:ServiceTemplate")]
    public partial class ServiceTemplate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Enter a value between 1 and 1073741823 - Range: `1`-`1073741823`
        /// </summary>
        [Output("absoluteTimer")]
        public Output<int?> AbsoluteTimer { get; private set; } = null!;

        /// <summary>
        /// Access list to be applied
        /// </summary>
        [Output("accessGroups")]
        public Output<ImmutableArray<Outputs.ServiceTemplateAccessGroup>> AccessGroups { get; private set; } = null!;

        /// <summary>
        /// Enter a description
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Output("device")]
        public Output<string?> Device { get; private set; } = null!;

        /// <summary>
        /// pre-authentication
        /// </summary>
        [Output("dnsAclPreauth")]
        public Output<string?> DnsAclPreauth { get; private set; } = null!;

        /// <summary>
        /// Enter a value between 1 and 65535 - Range: `1`-`65535`
        /// </summary>
        [Output("ianctivityTimer")]
        public Output<int?> IanctivityTimer { get; private set; } = null!;

        /// <summary>
        /// ARP probe
        /// </summary>
        [Output("inactivityTimerProbe")]
        public Output<bool?> InactivityTimerProbe { get; private set; } = null!;

        /// <summary>
        /// Interface template to be applied
        /// </summary>
        [Output("interfaceTemplates")]
        public Output<ImmutableArray<Outputs.ServiceTemplateInterfaceTemplate>> InterfaceTemplates { get; private set; } = null!;

        /// <summary>
        /// Set the link security policy - Choices: `must-not-secure`, `must-secure`, `should-secure`
        /// </summary>
        [Output("linksecPolicy")]
        public Output<string?> LinksecPolicy { get; private set; } = null!;

        /// <summary>
        /// mdns policy to be applied
        /// </summary>
        [Output("mdnsServicePolicy")]
        public Output<string?> MdnsServicePolicy { get; private set; } = null!;

        /// <summary>
        /// Specify a template name (maximum 48 characters)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Append client Mac Address in redirect URL
        /// </summary>
        [Output("redirectAppendClientMac")]
        public Output<string?> RedirectAppendClientMac { get; private set; } = null!;

        /// <summary>
        /// Append switch Mac Address in redirect URL
        /// </summary>
        [Output("redirectAppendSwitchMac")]
        public Output<string?> RedirectAppendSwitchMac { get; private set; } = null!;

        /// <summary>
        /// Specify a valid URL
        /// </summary>
        [Output("redirectUrl")]
        public Output<string?> RedirectUrl { get; private set; } = null!;

        /// <summary>
        /// Specify the access list name
        /// </summary>
        [Output("redirectUrlMatchAcl")]
        public Output<string?> RedirectUrlMatchAcl { get; private set; } = null!;

        /// <summary>
        /// - Choices: `one-time-redirect`, `redirect-on-no-match`
        /// </summary>
        [Output("redirectUrlMatchAction")]
        public Output<string?> RedirectUrlMatchAction { get; private set; } = null!;

        /// <summary>
        /// Configure input Qos policy
        /// </summary>
        [Output("servicePolicyQosInput")]
        public Output<string?> ServicePolicyQosInput { get; private set; } = null!;

        /// <summary>
        /// Configure output Qos policy
        /// </summary>
        [Output("servicePolicyQosOutput")]
        public Output<string?> ServicePolicyQosOutput { get; private set; } = null!;

        /// <summary>
        /// SGT tag - Range: `2`-`65519`
        /// </summary>
        [Output("sgt")]
        public Output<int?> Sgt { get; private set; } = null!;

        /// <summary>
        /// tag name
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.ServiceTemplateTag>> Tags { get; private set; } = null!;

        /// <summary>
        /// tunnel profile name
        /// </summary>
        [Output("tunnelCapwapName")]
        public Output<string?> TunnelCapwapName { get; private set; } = null!;

        /// <summary>
        /// Vlan to be applied - Range: `1`-`4094`
        /// </summary>
        [Output("vlan")]
        public Output<int?> Vlan { get; private set; } = null!;

        /// <summary>
        /// Vnid to be applied
        /// </summary>
        [Output("vnid")]
        public Output<string?> Vnid { get; private set; } = null!;

        /// <summary>
        /// Critical voice vlan
        /// </summary>
        [Output("voiceVlan")]
        public Output<bool?> VoiceVlan { get; private set; } = null!;


        /// <summary>
        /// Create a ServiceTemplate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServiceTemplate(string name, ServiceTemplateArgs? args = null, CustomResourceOptions? options = null)
            : base("iosxe:iosxe/serviceTemplate:ServiceTemplate", name, args ?? new ServiceTemplateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServiceTemplate(string name, Input<string> id, ServiceTemplateState? state = null, CustomResourceOptions? options = null)
            : base("iosxe:iosxe/serviceTemplate:ServiceTemplate", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServiceTemplate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServiceTemplate Get(string name, Input<string> id, ServiceTemplateState? state = null, CustomResourceOptions? options = null)
        {
            return new ServiceTemplate(name, id, state, options);
        }
    }

    public sealed class ServiceTemplateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enter a value between 1 and 1073741823 - Range: `1`-`1073741823`
        /// </summary>
        [Input("absoluteTimer")]
        public Input<int>? AbsoluteTimer { get; set; }

        [Input("accessGroups")]
        private InputList<Inputs.ServiceTemplateAccessGroupArgs>? _accessGroups;

        /// <summary>
        /// Access list to be applied
        /// </summary>
        public InputList<Inputs.ServiceTemplateAccessGroupArgs> AccessGroups
        {
            get => _accessGroups ?? (_accessGroups = new InputList<Inputs.ServiceTemplateAccessGroupArgs>());
            set => _accessGroups = value;
        }

        /// <summary>
        /// Enter a description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// pre-authentication
        /// </summary>
        [Input("dnsAclPreauth")]
        public Input<string>? DnsAclPreauth { get; set; }

        /// <summary>
        /// Enter a value between 1 and 65535 - Range: `1`-`65535`
        /// </summary>
        [Input("ianctivityTimer")]
        public Input<int>? IanctivityTimer { get; set; }

        /// <summary>
        /// ARP probe
        /// </summary>
        [Input("inactivityTimerProbe")]
        public Input<bool>? InactivityTimerProbe { get; set; }

        [Input("interfaceTemplates")]
        private InputList<Inputs.ServiceTemplateInterfaceTemplateArgs>? _interfaceTemplates;

        /// <summary>
        /// Interface template to be applied
        /// </summary>
        public InputList<Inputs.ServiceTemplateInterfaceTemplateArgs> InterfaceTemplates
        {
            get => _interfaceTemplates ?? (_interfaceTemplates = new InputList<Inputs.ServiceTemplateInterfaceTemplateArgs>());
            set => _interfaceTemplates = value;
        }

        /// <summary>
        /// Set the link security policy - Choices: `must-not-secure`, `must-secure`, `should-secure`
        /// </summary>
        [Input("linksecPolicy")]
        public Input<string>? LinksecPolicy { get; set; }

        /// <summary>
        /// mdns policy to be applied
        /// </summary>
        [Input("mdnsServicePolicy")]
        public Input<string>? MdnsServicePolicy { get; set; }

        /// <summary>
        /// Specify a template name (maximum 48 characters)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Append client Mac Address in redirect URL
        /// </summary>
        [Input("redirectAppendClientMac")]
        public Input<string>? RedirectAppendClientMac { get; set; }

        /// <summary>
        /// Append switch Mac Address in redirect URL
        /// </summary>
        [Input("redirectAppendSwitchMac")]
        public Input<string>? RedirectAppendSwitchMac { get; set; }

        /// <summary>
        /// Specify a valid URL
        /// </summary>
        [Input("redirectUrl")]
        public Input<string>? RedirectUrl { get; set; }

        /// <summary>
        /// Specify the access list name
        /// </summary>
        [Input("redirectUrlMatchAcl")]
        public Input<string>? RedirectUrlMatchAcl { get; set; }

        /// <summary>
        /// - Choices: `one-time-redirect`, `redirect-on-no-match`
        /// </summary>
        [Input("redirectUrlMatchAction")]
        public Input<string>? RedirectUrlMatchAction { get; set; }

        /// <summary>
        /// Configure input Qos policy
        /// </summary>
        [Input("servicePolicyQosInput")]
        public Input<string>? ServicePolicyQosInput { get; set; }

        /// <summary>
        /// Configure output Qos policy
        /// </summary>
        [Input("servicePolicyQosOutput")]
        public Input<string>? ServicePolicyQosOutput { get; set; }

        /// <summary>
        /// SGT tag - Range: `2`-`65519`
        /// </summary>
        [Input("sgt")]
        public Input<int>? Sgt { get; set; }

        [Input("tags")]
        private InputList<Inputs.ServiceTemplateTagArgs>? _tags;

        /// <summary>
        /// tag name
        /// </summary>
        public InputList<Inputs.ServiceTemplateTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.ServiceTemplateTagArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// tunnel profile name
        /// </summary>
        [Input("tunnelCapwapName")]
        public Input<string>? TunnelCapwapName { get; set; }

        /// <summary>
        /// Vlan to be applied - Range: `1`-`4094`
        /// </summary>
        [Input("vlan")]
        public Input<int>? Vlan { get; set; }

        /// <summary>
        /// Vnid to be applied
        /// </summary>
        [Input("vnid")]
        public Input<string>? Vnid { get; set; }

        /// <summary>
        /// Critical voice vlan
        /// </summary>
        [Input("voiceVlan")]
        public Input<bool>? VoiceVlan { get; set; }

        public ServiceTemplateArgs()
        {
        }
        public static new ServiceTemplateArgs Empty => new ServiceTemplateArgs();
    }

    public sealed class ServiceTemplateState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enter a value between 1 and 1073741823 - Range: `1`-`1073741823`
        /// </summary>
        [Input("absoluteTimer")]
        public Input<int>? AbsoluteTimer { get; set; }

        [Input("accessGroups")]
        private InputList<Inputs.ServiceTemplateAccessGroupGetArgs>? _accessGroups;

        /// <summary>
        /// Access list to be applied
        /// </summary>
        public InputList<Inputs.ServiceTemplateAccessGroupGetArgs> AccessGroups
        {
            get => _accessGroups ?? (_accessGroups = new InputList<Inputs.ServiceTemplateAccessGroupGetArgs>());
            set => _accessGroups = value;
        }

        /// <summary>
        /// Enter a description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A device name from the provider configuration.
        /// </summary>
        [Input("device")]
        public Input<string>? Device { get; set; }

        /// <summary>
        /// pre-authentication
        /// </summary>
        [Input("dnsAclPreauth")]
        public Input<string>? DnsAclPreauth { get; set; }

        /// <summary>
        /// Enter a value between 1 and 65535 - Range: `1`-`65535`
        /// </summary>
        [Input("ianctivityTimer")]
        public Input<int>? IanctivityTimer { get; set; }

        /// <summary>
        /// ARP probe
        /// </summary>
        [Input("inactivityTimerProbe")]
        public Input<bool>? InactivityTimerProbe { get; set; }

        [Input("interfaceTemplates")]
        private InputList<Inputs.ServiceTemplateInterfaceTemplateGetArgs>? _interfaceTemplates;

        /// <summary>
        /// Interface template to be applied
        /// </summary>
        public InputList<Inputs.ServiceTemplateInterfaceTemplateGetArgs> InterfaceTemplates
        {
            get => _interfaceTemplates ?? (_interfaceTemplates = new InputList<Inputs.ServiceTemplateInterfaceTemplateGetArgs>());
            set => _interfaceTemplates = value;
        }

        /// <summary>
        /// Set the link security policy - Choices: `must-not-secure`, `must-secure`, `should-secure`
        /// </summary>
        [Input("linksecPolicy")]
        public Input<string>? LinksecPolicy { get; set; }

        /// <summary>
        /// mdns policy to be applied
        /// </summary>
        [Input("mdnsServicePolicy")]
        public Input<string>? MdnsServicePolicy { get; set; }

        /// <summary>
        /// Specify a template name (maximum 48 characters)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Append client Mac Address in redirect URL
        /// </summary>
        [Input("redirectAppendClientMac")]
        public Input<string>? RedirectAppendClientMac { get; set; }

        /// <summary>
        /// Append switch Mac Address in redirect URL
        /// </summary>
        [Input("redirectAppendSwitchMac")]
        public Input<string>? RedirectAppendSwitchMac { get; set; }

        /// <summary>
        /// Specify a valid URL
        /// </summary>
        [Input("redirectUrl")]
        public Input<string>? RedirectUrl { get; set; }

        /// <summary>
        /// Specify the access list name
        /// </summary>
        [Input("redirectUrlMatchAcl")]
        public Input<string>? RedirectUrlMatchAcl { get; set; }

        /// <summary>
        /// - Choices: `one-time-redirect`, `redirect-on-no-match`
        /// </summary>
        [Input("redirectUrlMatchAction")]
        public Input<string>? RedirectUrlMatchAction { get; set; }

        /// <summary>
        /// Configure input Qos policy
        /// </summary>
        [Input("servicePolicyQosInput")]
        public Input<string>? ServicePolicyQosInput { get; set; }

        /// <summary>
        /// Configure output Qos policy
        /// </summary>
        [Input("servicePolicyQosOutput")]
        public Input<string>? ServicePolicyQosOutput { get; set; }

        /// <summary>
        /// SGT tag - Range: `2`-`65519`
        /// </summary>
        [Input("sgt")]
        public Input<int>? Sgt { get; set; }

        [Input("tags")]
        private InputList<Inputs.ServiceTemplateTagGetArgs>? _tags;

        /// <summary>
        /// tag name
        /// </summary>
        public InputList<Inputs.ServiceTemplateTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.ServiceTemplateTagGetArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// tunnel profile name
        /// </summary>
        [Input("tunnelCapwapName")]
        public Input<string>? TunnelCapwapName { get; set; }

        /// <summary>
        /// Vlan to be applied - Range: `1`-`4094`
        /// </summary>
        [Input("vlan")]
        public Input<int>? Vlan { get; set; }

        /// <summary>
        /// Vnid to be applied
        /// </summary>
        [Input("vnid")]
        public Input<string>? Vnid { get; set; }

        /// <summary>
        /// Critical voice vlan
        /// </summary>
        [Input("voiceVlan")]
        public Input<bool>? VoiceVlan { get; set; }

        public ServiceTemplateState()
        {
        }
        public static new ServiceTemplateState Empty => new ServiceTemplateState();
    }
}
