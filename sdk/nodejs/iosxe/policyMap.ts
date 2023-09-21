// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export class PolicyMap extends pulumi.CustomResource {
    /**
     * Get an existing PolicyMap resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PolicyMapState, opts?: pulumi.CustomResourceOptions): PolicyMap {
        return new PolicyMap(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'iosxe:iosxe/policyMap:PolicyMap';

    /**
     * Returns true if the given object is an instance of PolicyMap.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PolicyMap {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PolicyMap.__pulumiType;
    }

    /**
     * A device name from the provider configuration.
     */
    public readonly device!: pulumi.Output<string | undefined>;
    /**
     * Name of the policy map
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Domain name of the policy map
     */
    public readonly subscriber!: pulumi.Output<boolean | undefined>;
    /**
     * type of the policy-map - Choices: `access-control`, `appnav`, `control`, `epbr`, `inspect`, `packet-service`,
     * `performance-monitor`, `queueing`, `service`, `service-chain`, `umbrella`
     */
    public readonly type!: pulumi.Output<string | undefined>;

    /**
     * Create a PolicyMap resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: PolicyMapArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PolicyMapArgs | PolicyMapState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PolicyMapState | undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["subscriber"] = state ? state.subscriber : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as PolicyMapArgs | undefined;
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["subscriber"] = args ? args.subscriber : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PolicyMap.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PolicyMap resources.
 */
export interface PolicyMapState {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    /**
     * Name of the policy map
     */
    name?: pulumi.Input<string>;
    /**
     * Domain name of the policy map
     */
    subscriber?: pulumi.Input<boolean>;
    /**
     * type of the policy-map - Choices: `access-control`, `appnav`, `control`, `epbr`, `inspect`, `packet-service`,
     * `performance-monitor`, `queueing`, `service`, `service-chain`, `umbrella`
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PolicyMap resource.
 */
export interface PolicyMapArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    /**
     * Name of the policy map
     */
    name?: pulumi.Input<string>;
    /**
     * Domain name of the policy map
     */
    subscriber?: pulumi.Input<boolean>;
    /**
     * type of the policy-map - Choices: `access-control`, `appnav`, `control`, `epbr`, `inspect`, `packet-service`,
     * `performance-monitor`, `queueing`, `service`, `service-chain`, `umbrella`
     */
    type?: pulumi.Input<string>;
}
