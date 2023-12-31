// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource can manage the AAA Accounting configuration.
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import iosxe:index/aaaAccounting:AaaAccounting example "Cisco-IOS-XE-native:native/aaa/Cisco-IOS-XE-aaa:accounting"
 * ```
 */
export class AaaAccounting extends pulumi.CustomResource {
    /**
     * Get an existing AaaAccounting resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AaaAccountingState, opts?: pulumi.CustomResourceOptions): AaaAccounting {
        return new AaaAccounting(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'iosxe:index/aaaAccounting:AaaAccounting';

    /**
     * Returns true if the given object is an instance of AaaAccounting.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AaaAccounting {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AaaAccounting.__pulumiType;
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
     * For starting an exec (shell).
     */
    public readonly execs!: pulumi.Output<outputs.AaaAccountingExec[] | undefined>;
    /**
     * Use Server-group
     */
    public readonly identityDefaultStartStopGroup1!: pulumi.Output<string | undefined>;
    /**
     * Use Server-group
     */
    public readonly identityDefaultStartStopGroup2!: pulumi.Output<string | undefined>;
    /**
     * Use Server-group
     */
    public readonly identityDefaultStartStopGroup3!: pulumi.Output<string | undefined>;
    /**
     * Use Server-group
     */
    public readonly identityDefaultStartStopGroup4!: pulumi.Output<string | undefined>;
    /**
     * For network services. (PPP, SLIP, ARAP)
     */
    public readonly networks!: pulumi.Output<outputs.AaaAccountingNetwork[] | undefined>;
    /**
     * Guarantee system accounting as first record.
     */
    public readonly systemGuaranteeFirst!: pulumi.Output<boolean | undefined>;
    /**
     * Periodic intervals to send accounting update records(in minutes) - Range: `1`-`71582`
     */
    public readonly updateNewinfoPeriodic!: pulumi.Output<number | undefined>;

    /**
     * Create a AaaAccounting resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AaaAccountingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AaaAccountingArgs | AaaAccountingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AaaAccountingState | undefined;
            resourceInputs["deleteMode"] = state ? state.deleteMode : undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["execs"] = state ? state.execs : undefined;
            resourceInputs["identityDefaultStartStopGroup1"] = state ? state.identityDefaultStartStopGroup1 : undefined;
            resourceInputs["identityDefaultStartStopGroup2"] = state ? state.identityDefaultStartStopGroup2 : undefined;
            resourceInputs["identityDefaultStartStopGroup3"] = state ? state.identityDefaultStartStopGroup3 : undefined;
            resourceInputs["identityDefaultStartStopGroup4"] = state ? state.identityDefaultStartStopGroup4 : undefined;
            resourceInputs["networks"] = state ? state.networks : undefined;
            resourceInputs["systemGuaranteeFirst"] = state ? state.systemGuaranteeFirst : undefined;
            resourceInputs["updateNewinfoPeriodic"] = state ? state.updateNewinfoPeriodic : undefined;
        } else {
            const args = argsOrState as AaaAccountingArgs | undefined;
            resourceInputs["deleteMode"] = args ? args.deleteMode : undefined;
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["execs"] = args ? args.execs : undefined;
            resourceInputs["identityDefaultStartStopGroup1"] = args ? args.identityDefaultStartStopGroup1 : undefined;
            resourceInputs["identityDefaultStartStopGroup2"] = args ? args.identityDefaultStartStopGroup2 : undefined;
            resourceInputs["identityDefaultStartStopGroup3"] = args ? args.identityDefaultStartStopGroup3 : undefined;
            resourceInputs["identityDefaultStartStopGroup4"] = args ? args.identityDefaultStartStopGroup4 : undefined;
            resourceInputs["networks"] = args ? args.networks : undefined;
            resourceInputs["systemGuaranteeFirst"] = args ? args.systemGuaranteeFirst : undefined;
            resourceInputs["updateNewinfoPeriodic"] = args ? args.updateNewinfoPeriodic : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AaaAccounting.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AaaAccounting resources.
 */
export interface AaaAccountingState {
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
     * For starting an exec (shell).
     */
    execs?: pulumi.Input<pulumi.Input<inputs.AaaAccountingExec>[]>;
    /**
     * Use Server-group
     */
    identityDefaultStartStopGroup1?: pulumi.Input<string>;
    /**
     * Use Server-group
     */
    identityDefaultStartStopGroup2?: pulumi.Input<string>;
    /**
     * Use Server-group
     */
    identityDefaultStartStopGroup3?: pulumi.Input<string>;
    /**
     * Use Server-group
     */
    identityDefaultStartStopGroup4?: pulumi.Input<string>;
    /**
     * For network services. (PPP, SLIP, ARAP)
     */
    networks?: pulumi.Input<pulumi.Input<inputs.AaaAccountingNetwork>[]>;
    /**
     * Guarantee system accounting as first record.
     */
    systemGuaranteeFirst?: pulumi.Input<boolean>;
    /**
     * Periodic intervals to send accounting update records(in minutes) - Range: `1`-`71582`
     */
    updateNewinfoPeriodic?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a AaaAccounting resource.
 */
export interface AaaAccountingArgs {
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
     * For starting an exec (shell).
     */
    execs?: pulumi.Input<pulumi.Input<inputs.AaaAccountingExec>[]>;
    /**
     * Use Server-group
     */
    identityDefaultStartStopGroup1?: pulumi.Input<string>;
    /**
     * Use Server-group
     */
    identityDefaultStartStopGroup2?: pulumi.Input<string>;
    /**
     * Use Server-group
     */
    identityDefaultStartStopGroup3?: pulumi.Input<string>;
    /**
     * Use Server-group
     */
    identityDefaultStartStopGroup4?: pulumi.Input<string>;
    /**
     * For network services. (PPP, SLIP, ARAP)
     */
    networks?: pulumi.Input<pulumi.Input<inputs.AaaAccountingNetwork>[]>;
    /**
     * Guarantee system accounting as first record.
     */
    systemGuaranteeFirst?: pulumi.Input<boolean>;
    /**
     * Periodic intervals to send accounting update records(in minutes) - Range: `1`-`71582`
     */
    updateNewinfoPeriodic?: pulumi.Input<number>;
}
