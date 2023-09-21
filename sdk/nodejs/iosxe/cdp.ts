// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export class Cdp extends pulumi.CustomResource {
    /**
     * Get an existing Cdp resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CdpState, opts?: pulumi.CustomResourceOptions): Cdp {
        return new Cdp(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'iosxe:iosxe/cdp:Cdp';

    /**
     * Returns true if the given object is an instance of Cdp.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Cdp {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Cdp.__pulumiType;
    }

    /**
     * A device name from the provider configuration.
     */
    public readonly device!: pulumi.Output<string | undefined>;
    /**
     * Apply tlv-list globally
     */
    public readonly filterTlvList!: pulumi.Output<string | undefined>;
    /**
     * Specify the holdtime (in sec) to be sent in packets - Range: `10`-`255`
     */
    public readonly holdtime!: pulumi.Output<number | undefined>;
    /**
     * Enable CDP
     */
    public readonly run!: pulumi.Output<boolean | undefined>;
    /**
     * Specify the rate at which CDP packets are sent (in sec) - Range: `5`-`254`
     */
    public readonly timer!: pulumi.Output<number | undefined>;
    /**
     * Configure tlv-list
     */
    public readonly tlvLists!: pulumi.Output<outputs.iosxe.CdpTlvList[] | undefined>;

    /**
     * Create a Cdp resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: CdpArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CdpArgs | CdpState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CdpState | undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["filterTlvList"] = state ? state.filterTlvList : undefined;
            resourceInputs["holdtime"] = state ? state.holdtime : undefined;
            resourceInputs["run"] = state ? state.run : undefined;
            resourceInputs["timer"] = state ? state.timer : undefined;
            resourceInputs["tlvLists"] = state ? state.tlvLists : undefined;
        } else {
            const args = argsOrState as CdpArgs | undefined;
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["filterTlvList"] = args ? args.filterTlvList : undefined;
            resourceInputs["holdtime"] = args ? args.holdtime : undefined;
            resourceInputs["run"] = args ? args.run : undefined;
            resourceInputs["timer"] = args ? args.timer : undefined;
            resourceInputs["tlvLists"] = args ? args.tlvLists : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Cdp.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Cdp resources.
 */
export interface CdpState {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    /**
     * Apply tlv-list globally
     */
    filterTlvList?: pulumi.Input<string>;
    /**
     * Specify the holdtime (in sec) to be sent in packets - Range: `10`-`255`
     */
    holdtime?: pulumi.Input<number>;
    /**
     * Enable CDP
     */
    run?: pulumi.Input<boolean>;
    /**
     * Specify the rate at which CDP packets are sent (in sec) - Range: `5`-`254`
     */
    timer?: pulumi.Input<number>;
    /**
     * Configure tlv-list
     */
    tlvLists?: pulumi.Input<pulumi.Input<inputs.iosxe.CdpTlvList>[]>;
}

/**
 * The set of arguments for constructing a Cdp resource.
 */
export interface CdpArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    /**
     * Apply tlv-list globally
     */
    filterTlvList?: pulumi.Input<string>;
    /**
     * Specify the holdtime (in sec) to be sent in packets - Range: `10`-`255`
     */
    holdtime?: pulumi.Input<number>;
    /**
     * Enable CDP
     */
    run?: pulumi.Input<boolean>;
    /**
     * Specify the rate at which CDP packets are sent (in sec) - Range: `5`-`254`
     */
    timer?: pulumi.Input<number>;
    /**
     * Configure tlv-list
     */
    tlvLists?: pulumi.Input<pulumi.Input<inputs.iosxe.CdpTlvList>[]>;
}
