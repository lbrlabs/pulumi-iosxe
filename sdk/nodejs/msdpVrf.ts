// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource can manage the MSDP VRF configuration.
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import iosxe:index/msdpVrf:MsdpVrf example "Cisco-IOS-XE-native:native/ip/Cisco-IOS-XE-multicast:msdp/vrf=VRF1"
 * ```
 */
export class MsdpVrf extends pulumi.CustomResource {
    /**
     * Get an existing MsdpVrf resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MsdpVrfState, opts?: pulumi.CustomResourceOptions): MsdpVrf {
        return new MsdpVrf(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'iosxe:index/msdpVrf:MsdpVrf';

    /**
     * Returns true if the given object is an instance of MsdpVrf.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MsdpVrf {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MsdpVrf.__pulumiType;
    }

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
     * Configure MSDP Originator ID
     */
    public readonly originatorId!: pulumi.Output<string | undefined>;
    /**
     * MSDP peer on which the password is to be set
     */
    public readonly passwords!: pulumi.Output<outputs.MsdpVrfPassword[] | undefined>;
    /**
     * Configure an MSDP peer
     */
    public readonly peers!: pulumi.Output<outputs.MsdpVrfPeer[] | undefined>;
    public readonly vrf!: pulumi.Output<string>;

    /**
     * Create a MsdpVrf resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MsdpVrfArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MsdpVrfArgs | MsdpVrfState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MsdpVrfState | undefined;
            resourceInputs["deleteMode"] = state ? state.deleteMode : undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["originatorId"] = state ? state.originatorId : undefined;
            resourceInputs["passwords"] = state ? state.passwords : undefined;
            resourceInputs["peers"] = state ? state.peers : undefined;
            resourceInputs["vrf"] = state ? state.vrf : undefined;
        } else {
            const args = argsOrState as MsdpVrfArgs | undefined;
            if ((!args || args.vrf === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vrf'");
            }
            resourceInputs["deleteMode"] = args ? args.deleteMode : undefined;
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["originatorId"] = args ? args.originatorId : undefined;
            resourceInputs["passwords"] = args ? args.passwords : undefined;
            resourceInputs["peers"] = args ? args.peers : undefined;
            resourceInputs["vrf"] = args ? args.vrf : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MsdpVrf.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MsdpVrf resources.
 */
export interface MsdpVrfState {
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
     * Configure MSDP Originator ID
     */
    originatorId?: pulumi.Input<string>;
    /**
     * MSDP peer on which the password is to be set
     */
    passwords?: pulumi.Input<pulumi.Input<inputs.MsdpVrfPassword>[]>;
    /**
     * Configure an MSDP peer
     */
    peers?: pulumi.Input<pulumi.Input<inputs.MsdpVrfPeer>[]>;
    vrf?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MsdpVrf resource.
 */
export interface MsdpVrfArgs {
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
     * Configure MSDP Originator ID
     */
    originatorId?: pulumi.Input<string>;
    /**
     * MSDP peer on which the password is to be set
     */
    passwords?: pulumi.Input<pulumi.Input<inputs.MsdpVrfPassword>[]>;
    /**
     * Configure an MSDP peer
     */
    peers?: pulumi.Input<pulumi.Input<inputs.MsdpVrfPeer>[]>;
    vrf: pulumi.Input<string>;
}
