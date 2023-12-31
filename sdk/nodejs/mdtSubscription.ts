// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource can manage the MDT Subscription configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@lbrlabs/pulumi-iosxe";
 *
 * const example = new iosxe.MdtSubscription("example", {
 *     encoding: "encode-kvgpb",
 *     filterXpath: "/ios-events-ios-xe-oper:ospf-neighbor-state-change",
 *     receivers: [{
 *         address: "5.6.7.8",
 *         port: 57600,
 *         protocol: "grpc-tcp",
 *     }],
 *     sourceAddress: "1.2.3.4",
 *     sourceVrf: "Mgmt-vrf",
 *     stream: "yang-notif-native",
 *     subscriptionId: 101,
 *     updatePolicyOnChange: true,
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import iosxe:index/mdtSubscription:MdtSubscription example "Cisco-IOS-XE-mdt-cfg:mdt-config-data/mdt-subscription=101"
 * ```
 */
export class MdtSubscription extends pulumi.CustomResource {
    /**
     * Get an existing MdtSubscription resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MdtSubscriptionState, opts?: pulumi.CustomResourceOptions): MdtSubscription {
        return new MdtSubscription(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'iosxe:index/mdtSubscription:MdtSubscription';

    /**
     * Returns true if the given object is an instance of MdtSubscription.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MdtSubscription {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MdtSubscription.__pulumiType;
    }

    /**
     * A device name from the provider configuration.
     */
    public readonly device!: pulumi.Output<string | undefined>;
    /**
     * Update notification encoding
     */
    public readonly encoding!: pulumi.Output<string | undefined>;
    /**
     * XPath expression describing the set of objects wanted as part of the subscription
     */
    public readonly filterXpath!: pulumi.Output<string | undefined>;
    /**
     * Configuration of receivers of configured subscriptions. Use of this is deprecated. Use mdt-receiver-names instead.
     */
    public readonly receivers!: pulumi.Output<outputs.MdtSubscriptionReceiver[] | undefined>;
    /**
     * The source address for the notifications
     */
    public readonly sourceAddress!: pulumi.Output<string | undefined>;
    /**
     * Network instance name for the VRF
     */
    public readonly sourceVrf!: pulumi.Output<string | undefined>;
    /**
     * The name of the event stream being subscribed to
     */
    public readonly stream!: pulumi.Output<string | undefined>;
    /**
     * Unique subscription identifier. - Range: `0`-`2147483647`
     */
    public readonly subscriptionId!: pulumi.Output<number>;
    /**
     * If true, there is no initial update notification with the current value of all the data. NOT CURRENTLY SUPPORTED. If
     * specified, must be false
     */
    public readonly updatePolicyOnChange!: pulumi.Output<boolean | undefined>;
    /**
     * Period of update notifications in hundredths of a second - Range: `0`-`4294967295`
     */
    public readonly updatePolicyPeriodic!: pulumi.Output<number | undefined>;

    /**
     * Create a MdtSubscription resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MdtSubscriptionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MdtSubscriptionArgs | MdtSubscriptionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MdtSubscriptionState | undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["encoding"] = state ? state.encoding : undefined;
            resourceInputs["filterXpath"] = state ? state.filterXpath : undefined;
            resourceInputs["receivers"] = state ? state.receivers : undefined;
            resourceInputs["sourceAddress"] = state ? state.sourceAddress : undefined;
            resourceInputs["sourceVrf"] = state ? state.sourceVrf : undefined;
            resourceInputs["stream"] = state ? state.stream : undefined;
            resourceInputs["subscriptionId"] = state ? state.subscriptionId : undefined;
            resourceInputs["updatePolicyOnChange"] = state ? state.updatePolicyOnChange : undefined;
            resourceInputs["updatePolicyPeriodic"] = state ? state.updatePolicyPeriodic : undefined;
        } else {
            const args = argsOrState as MdtSubscriptionArgs | undefined;
            if ((!args || args.subscriptionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subscriptionId'");
            }
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["encoding"] = args ? args.encoding : undefined;
            resourceInputs["filterXpath"] = args ? args.filterXpath : undefined;
            resourceInputs["receivers"] = args ? args.receivers : undefined;
            resourceInputs["sourceAddress"] = args ? args.sourceAddress : undefined;
            resourceInputs["sourceVrf"] = args ? args.sourceVrf : undefined;
            resourceInputs["stream"] = args ? args.stream : undefined;
            resourceInputs["subscriptionId"] = args ? args.subscriptionId : undefined;
            resourceInputs["updatePolicyOnChange"] = args ? args.updatePolicyOnChange : undefined;
            resourceInputs["updatePolicyPeriodic"] = args ? args.updatePolicyPeriodic : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MdtSubscription.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MdtSubscription resources.
 */
export interface MdtSubscriptionState {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    /**
     * Update notification encoding
     */
    encoding?: pulumi.Input<string>;
    /**
     * XPath expression describing the set of objects wanted as part of the subscription
     */
    filterXpath?: pulumi.Input<string>;
    /**
     * Configuration of receivers of configured subscriptions. Use of this is deprecated. Use mdt-receiver-names instead.
     */
    receivers?: pulumi.Input<pulumi.Input<inputs.MdtSubscriptionReceiver>[]>;
    /**
     * The source address for the notifications
     */
    sourceAddress?: pulumi.Input<string>;
    /**
     * Network instance name for the VRF
     */
    sourceVrf?: pulumi.Input<string>;
    /**
     * The name of the event stream being subscribed to
     */
    stream?: pulumi.Input<string>;
    /**
     * Unique subscription identifier. - Range: `0`-`2147483647`
     */
    subscriptionId?: pulumi.Input<number>;
    /**
     * If true, there is no initial update notification with the current value of all the data. NOT CURRENTLY SUPPORTED. If
     * specified, must be false
     */
    updatePolicyOnChange?: pulumi.Input<boolean>;
    /**
     * Period of update notifications in hundredths of a second - Range: `0`-`4294967295`
     */
    updatePolicyPeriodic?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a MdtSubscription resource.
 */
export interface MdtSubscriptionArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    /**
     * Update notification encoding
     */
    encoding?: pulumi.Input<string>;
    /**
     * XPath expression describing the set of objects wanted as part of the subscription
     */
    filterXpath?: pulumi.Input<string>;
    /**
     * Configuration of receivers of configured subscriptions. Use of this is deprecated. Use mdt-receiver-names instead.
     */
    receivers?: pulumi.Input<pulumi.Input<inputs.MdtSubscriptionReceiver>[]>;
    /**
     * The source address for the notifications
     */
    sourceAddress?: pulumi.Input<string>;
    /**
     * Network instance name for the VRF
     */
    sourceVrf?: pulumi.Input<string>;
    /**
     * The name of the event stream being subscribed to
     */
    stream?: pulumi.Input<string>;
    /**
     * Unique subscription identifier. - Range: `0`-`2147483647`
     */
    subscriptionId: pulumi.Input<number>;
    /**
     * If true, there is no initial update notification with the current value of all the data. NOT CURRENTLY SUPPORTED. If
     * specified, must be false
     */
    updatePolicyOnChange?: pulumi.Input<boolean>;
    /**
     * Period of update notifications in hundredths of a second - Range: `0`-`4294967295`
     */
    updatePolicyPeriodic?: pulumi.Input<number>;
}
