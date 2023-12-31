// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource can manage the Policy Map Event configuration.
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import iosxe:index/policyMapEvent:PolicyMapEvent example "Cisco-IOS-XE-native:native/policy/Cisco-IOS-XE-policy:policy-map=dot1x_policy/event=authentication-success"
 * ```
 */
export class PolicyMapEvent extends pulumi.CustomResource {
    /**
     * Get an existing PolicyMapEvent resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PolicyMapEventState, opts?: pulumi.CustomResourceOptions): PolicyMapEvent {
        return new PolicyMapEvent(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'iosxe:index/policyMapEvent:PolicyMapEvent';

    /**
     * Returns true if the given object is an instance of PolicyMapEvent.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PolicyMapEvent {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PolicyMapEvent.__pulumiType;
    }

    /**
     * class number, 1 for 1st class, 2 for 2nd...
     */
    public readonly classNumbers!: pulumi.Output<outputs.PolicyMapEventClassNumber[] | undefined>;
    /**
     * A device name from the provider configuration.
     */
    public readonly device!: pulumi.Output<string | undefined>;
    /**
     * - Choices: `aaa-available`, `absolute-timeout`, `agent-found`, `authentication-failure`, `authentication-success`,
     * `authorization-failure`, `authorization-success`, `identity-update`, `inactivity-timeout`,
     * `remote-authentication-failure`, `remote-authentication-success`, `remote-update`, `session-disconnected`,
     * `session-started`, `tag-added`, `tag-removed`, `template-activated`, `template-activation-failed`,
     * `template-deactivated`, `template-deactivation-failed`, `timer-expiry`, `violation`
     */
    public readonly eventType!: pulumi.Output<string>;
    /**
     * - Choices: `match-all`, `match-first`
     */
    public readonly matchType!: pulumi.Output<string | undefined>;
    /**
     * Name of the policy map
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a PolicyMapEvent resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PolicyMapEventArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PolicyMapEventArgs | PolicyMapEventState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PolicyMapEventState | undefined;
            resourceInputs["classNumbers"] = state ? state.classNumbers : undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["eventType"] = state ? state.eventType : undefined;
            resourceInputs["matchType"] = state ? state.matchType : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as PolicyMapEventArgs | undefined;
            if ((!args || args.eventType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'eventType'");
            }
            resourceInputs["classNumbers"] = args ? args.classNumbers : undefined;
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["eventType"] = args ? args.eventType : undefined;
            resourceInputs["matchType"] = args ? args.matchType : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PolicyMapEvent.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PolicyMapEvent resources.
 */
export interface PolicyMapEventState {
    /**
     * class number, 1 for 1st class, 2 for 2nd...
     */
    classNumbers?: pulumi.Input<pulumi.Input<inputs.PolicyMapEventClassNumber>[]>;
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    /**
     * - Choices: `aaa-available`, `absolute-timeout`, `agent-found`, `authentication-failure`, `authentication-success`,
     * `authorization-failure`, `authorization-success`, `identity-update`, `inactivity-timeout`,
     * `remote-authentication-failure`, `remote-authentication-success`, `remote-update`, `session-disconnected`,
     * `session-started`, `tag-added`, `tag-removed`, `template-activated`, `template-activation-failed`,
     * `template-deactivated`, `template-deactivation-failed`, `timer-expiry`, `violation`
     */
    eventType?: pulumi.Input<string>;
    /**
     * - Choices: `match-all`, `match-first`
     */
    matchType?: pulumi.Input<string>;
    /**
     * Name of the policy map
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PolicyMapEvent resource.
 */
export interface PolicyMapEventArgs {
    /**
     * class number, 1 for 1st class, 2 for 2nd...
     */
    classNumbers?: pulumi.Input<pulumi.Input<inputs.PolicyMapEventClassNumber>[]>;
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    /**
     * - Choices: `aaa-available`, `absolute-timeout`, `agent-found`, `authentication-failure`, `authentication-success`,
     * `authorization-failure`, `authorization-success`, `identity-update`, `inactivity-timeout`,
     * `remote-authentication-failure`, `remote-authentication-success`, `remote-update`, `session-disconnected`,
     * `session-started`, `tag-added`, `tag-removed`, `template-activated`, `template-activation-failed`,
     * `template-deactivated`, `template-deactivation-failed`, `timer-expiry`, `violation`
     */
    eventType: pulumi.Input<string>;
    /**
     * - Choices: `match-all`, `match-first`
     */
    matchType?: pulumi.Input<string>;
    /**
     * Name of the policy map
     */
    name?: pulumi.Input<string>;
}
