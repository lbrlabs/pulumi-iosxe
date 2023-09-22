// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource can manage the DHCP configuration.
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import iosxe:index/dhcp:Dhcp example "Cisco-IOS-XE-native:native/ip/dhcp"
 * ```
 */
export class Dhcp extends pulumi.CustomResource {
    /**
     * Get an existing Dhcp resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DhcpState, opts?: pulumi.CustomResourceOptions): Dhcp {
        return new Dhcp(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'iosxe:index/dhcp:Dhcp';

    /**
     * Returns true if the given object is an instance of Dhcp.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Dhcp {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Dhcp.__pulumiType;
    }

    /**
     * - Choices: `cisco`, `standard`
     */
    public readonly compatibilitySuboptionLinkSelection!: pulumi.Output<string | undefined>;
    /**
     * - Choices: `cisco`, `standard`
     */
    public readonly compatibilitySuboptionServerOverride!: pulumi.Output<string | undefined>;
    /**
     * Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
     * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
     * Default value is `all`. - Choices: `all`, `attributes`
     */
    public readonly deleteMode!: pulumi.Output<string | undefined>;
    /**
     * A device name from the provider configuration.
     */
    public readonly device!: pulumi.Output<string | undefined>;
    /**
     * Default option, no vpn
     */
    public readonly relayInformationOptionDefault!: pulumi.Output<boolean | undefined>;
    /**
     * Insert VPN sub-options and change the giaddr to the outgoing interface
     */
    public readonly relayInformationOptionVpn!: pulumi.Output<boolean | undefined>;
    /**
     * Received DHCP packets may contain relay info option with zero giaddr
     */
    public readonly relayInformationTrustAll!: pulumi.Output<boolean | undefined>;
    /**
     * DHCP Snooping
     */
    public readonly snooping!: pulumi.Output<boolean | undefined>;
    /**
     * Use configured hostname for remote id
     */
    public readonly snoopingInformationOptionFormatRemoteIdHostname!: pulumi.Output<boolean | undefined>;
    /**
     * DHCP Snooping vlan
     */
    public readonly snoopingVlans!: pulumi.Output<outputs.DhcpSnoopingVlan[] | undefined>;

    /**
     * Create a Dhcp resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: DhcpArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DhcpArgs | DhcpState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DhcpState | undefined;
            resourceInputs["compatibilitySuboptionLinkSelection"] = state ? state.compatibilitySuboptionLinkSelection : undefined;
            resourceInputs["compatibilitySuboptionServerOverride"] = state ? state.compatibilitySuboptionServerOverride : undefined;
            resourceInputs["deleteMode"] = state ? state.deleteMode : undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["relayInformationOptionDefault"] = state ? state.relayInformationOptionDefault : undefined;
            resourceInputs["relayInformationOptionVpn"] = state ? state.relayInformationOptionVpn : undefined;
            resourceInputs["relayInformationTrustAll"] = state ? state.relayInformationTrustAll : undefined;
            resourceInputs["snooping"] = state ? state.snooping : undefined;
            resourceInputs["snoopingInformationOptionFormatRemoteIdHostname"] = state ? state.snoopingInformationOptionFormatRemoteIdHostname : undefined;
            resourceInputs["snoopingVlans"] = state ? state.snoopingVlans : undefined;
        } else {
            const args = argsOrState as DhcpArgs | undefined;
            resourceInputs["compatibilitySuboptionLinkSelection"] = args ? args.compatibilitySuboptionLinkSelection : undefined;
            resourceInputs["compatibilitySuboptionServerOverride"] = args ? args.compatibilitySuboptionServerOverride : undefined;
            resourceInputs["deleteMode"] = args ? args.deleteMode : undefined;
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["relayInformationOptionDefault"] = args ? args.relayInformationOptionDefault : undefined;
            resourceInputs["relayInformationOptionVpn"] = args ? args.relayInformationOptionVpn : undefined;
            resourceInputs["relayInformationTrustAll"] = args ? args.relayInformationTrustAll : undefined;
            resourceInputs["snooping"] = args ? args.snooping : undefined;
            resourceInputs["snoopingInformationOptionFormatRemoteIdHostname"] = args ? args.snoopingInformationOptionFormatRemoteIdHostname : undefined;
            resourceInputs["snoopingVlans"] = args ? args.snoopingVlans : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Dhcp.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Dhcp resources.
 */
export interface DhcpState {
    /**
     * - Choices: `cisco`, `standard`
     */
    compatibilitySuboptionLinkSelection?: pulumi.Input<string>;
    /**
     * - Choices: `cisco`, `standard`
     */
    compatibilitySuboptionServerOverride?: pulumi.Input<string>;
    /**
     * Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
     * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
     * Default value is `all`. - Choices: `all`, `attributes`
     */
    deleteMode?: pulumi.Input<string>;
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    /**
     * Default option, no vpn
     */
    relayInformationOptionDefault?: pulumi.Input<boolean>;
    /**
     * Insert VPN sub-options and change the giaddr to the outgoing interface
     */
    relayInformationOptionVpn?: pulumi.Input<boolean>;
    /**
     * Received DHCP packets may contain relay info option with zero giaddr
     */
    relayInformationTrustAll?: pulumi.Input<boolean>;
    /**
     * DHCP Snooping
     */
    snooping?: pulumi.Input<boolean>;
    /**
     * Use configured hostname for remote id
     */
    snoopingInformationOptionFormatRemoteIdHostname?: pulumi.Input<boolean>;
    /**
     * DHCP Snooping vlan
     */
    snoopingVlans?: pulumi.Input<pulumi.Input<inputs.DhcpSnoopingVlan>[]>;
}

/**
 * The set of arguments for constructing a Dhcp resource.
 */
export interface DhcpArgs {
    /**
     * - Choices: `cisco`, `standard`
     */
    compatibilitySuboptionLinkSelection?: pulumi.Input<string>;
    /**
     * - Choices: `cisco`, `standard`
     */
    compatibilitySuboptionServerOverride?: pulumi.Input<string>;
    /**
     * Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
     * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
     * Default value is `all`. - Choices: `all`, `attributes`
     */
    deleteMode?: pulumi.Input<string>;
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    /**
     * Default option, no vpn
     */
    relayInformationOptionDefault?: pulumi.Input<boolean>;
    /**
     * Insert VPN sub-options and change the giaddr to the outgoing interface
     */
    relayInformationOptionVpn?: pulumi.Input<boolean>;
    /**
     * Received DHCP packets may contain relay info option with zero giaddr
     */
    relayInformationTrustAll?: pulumi.Input<boolean>;
    /**
     * DHCP Snooping
     */
    snooping?: pulumi.Input<boolean>;
    /**
     * Use configured hostname for remote id
     */
    snoopingInformationOptionFormatRemoteIdHostname?: pulumi.Input<boolean>;
    /**
     * DHCP Snooping vlan
     */
    snoopingVlans?: pulumi.Input<pulumi.Input<inputs.DhcpSnoopingVlan>[]>;
}