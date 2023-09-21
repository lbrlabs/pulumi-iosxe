// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export class Bfd extends pulumi.CustomResource {
    /**
     * Get an existing Bfd resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BfdState, opts?: pulumi.CustomResourceOptions): Bfd {
        return new Bfd(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'iosxe:iosxe/bfd:Bfd';

    /**
     * Returns true if the given object is an instance of Bfd.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Bfd {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Bfd.__pulumiType;
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
     * IPv4 Address Family with vrf
     */
    public readonly ipv4BothVrfs!: pulumi.Output<outputs.iosxe.BfdIpv4BothVrf[] | undefined>;
    /**
     * IPv4 Address Family with vrf
     */
    public readonly ipv4WithDstVrfs!: pulumi.Output<outputs.iosxe.BfdIpv4WithDstVrf[] | undefined>;
    /**
     * IPv4 Address Family with vrf
     */
    public readonly ipv4WithSrcVrfs!: pulumi.Output<outputs.iosxe.BfdIpv4WithSrcVrf[] | undefined>;
    /**
     * IPv4 Address Family with vrf
     */
    public readonly ipv4WithoutVrfs!: pulumi.Output<outputs.iosxe.BfdIpv4WithoutVrf[] | undefined>;
    /**
     * IPv6 Address Family with vrf
     */
    public readonly ipv6WithBothVrfs!: pulumi.Output<outputs.iosxe.BfdIpv6WithBothVrf[] | undefined>;
    /**
     * IPv6 Address Family with vrf
     */
    public readonly ipv6WithDstVrfs!: pulumi.Output<outputs.iosxe.BfdIpv6WithDstVrf[] | undefined>;
    /**
     * IPv6 Address Family with vrf
     */
    public readonly ipv6WithSrcVrfs!: pulumi.Output<outputs.iosxe.BfdIpv6WithSrcVrf[] | undefined>;
    /**
     * IPv6 Address Family with vrf
     */
    public readonly ipv6WithoutVrfs!: pulumi.Output<outputs.iosxe.BfdIpv6WithoutVrf[] | undefined>;
    /**
     * Value in ms to use for slow timers - Range: `1000`-`30000`
     */
    public readonly slowTimers!: pulumi.Output<number | undefined>;

    /**
     * Create a Bfd resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: BfdArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BfdArgs | BfdState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BfdState | undefined;
            resourceInputs["deleteMode"] = state ? state.deleteMode : undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["ipv4BothVrfs"] = state ? state.ipv4BothVrfs : undefined;
            resourceInputs["ipv4WithDstVrfs"] = state ? state.ipv4WithDstVrfs : undefined;
            resourceInputs["ipv4WithSrcVrfs"] = state ? state.ipv4WithSrcVrfs : undefined;
            resourceInputs["ipv4WithoutVrfs"] = state ? state.ipv4WithoutVrfs : undefined;
            resourceInputs["ipv6WithBothVrfs"] = state ? state.ipv6WithBothVrfs : undefined;
            resourceInputs["ipv6WithDstVrfs"] = state ? state.ipv6WithDstVrfs : undefined;
            resourceInputs["ipv6WithSrcVrfs"] = state ? state.ipv6WithSrcVrfs : undefined;
            resourceInputs["ipv6WithoutVrfs"] = state ? state.ipv6WithoutVrfs : undefined;
            resourceInputs["slowTimers"] = state ? state.slowTimers : undefined;
        } else {
            const args = argsOrState as BfdArgs | undefined;
            resourceInputs["deleteMode"] = args ? args.deleteMode : undefined;
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["ipv4BothVrfs"] = args ? args.ipv4BothVrfs : undefined;
            resourceInputs["ipv4WithDstVrfs"] = args ? args.ipv4WithDstVrfs : undefined;
            resourceInputs["ipv4WithSrcVrfs"] = args ? args.ipv4WithSrcVrfs : undefined;
            resourceInputs["ipv4WithoutVrfs"] = args ? args.ipv4WithoutVrfs : undefined;
            resourceInputs["ipv6WithBothVrfs"] = args ? args.ipv6WithBothVrfs : undefined;
            resourceInputs["ipv6WithDstVrfs"] = args ? args.ipv6WithDstVrfs : undefined;
            resourceInputs["ipv6WithSrcVrfs"] = args ? args.ipv6WithSrcVrfs : undefined;
            resourceInputs["ipv6WithoutVrfs"] = args ? args.ipv6WithoutVrfs : undefined;
            resourceInputs["slowTimers"] = args ? args.slowTimers : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Bfd.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Bfd resources.
 */
export interface BfdState {
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
     * IPv4 Address Family with vrf
     */
    ipv4BothVrfs?: pulumi.Input<pulumi.Input<inputs.iosxe.BfdIpv4BothVrf>[]>;
    /**
     * IPv4 Address Family with vrf
     */
    ipv4WithDstVrfs?: pulumi.Input<pulumi.Input<inputs.iosxe.BfdIpv4WithDstVrf>[]>;
    /**
     * IPv4 Address Family with vrf
     */
    ipv4WithSrcVrfs?: pulumi.Input<pulumi.Input<inputs.iosxe.BfdIpv4WithSrcVrf>[]>;
    /**
     * IPv4 Address Family with vrf
     */
    ipv4WithoutVrfs?: pulumi.Input<pulumi.Input<inputs.iosxe.BfdIpv4WithoutVrf>[]>;
    /**
     * IPv6 Address Family with vrf
     */
    ipv6WithBothVrfs?: pulumi.Input<pulumi.Input<inputs.iosxe.BfdIpv6WithBothVrf>[]>;
    /**
     * IPv6 Address Family with vrf
     */
    ipv6WithDstVrfs?: pulumi.Input<pulumi.Input<inputs.iosxe.BfdIpv6WithDstVrf>[]>;
    /**
     * IPv6 Address Family with vrf
     */
    ipv6WithSrcVrfs?: pulumi.Input<pulumi.Input<inputs.iosxe.BfdIpv6WithSrcVrf>[]>;
    /**
     * IPv6 Address Family with vrf
     */
    ipv6WithoutVrfs?: pulumi.Input<pulumi.Input<inputs.iosxe.BfdIpv6WithoutVrf>[]>;
    /**
     * Value in ms to use for slow timers - Range: `1000`-`30000`
     */
    slowTimers?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Bfd resource.
 */
export interface BfdArgs {
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
     * IPv4 Address Family with vrf
     */
    ipv4BothVrfs?: pulumi.Input<pulumi.Input<inputs.iosxe.BfdIpv4BothVrf>[]>;
    /**
     * IPv4 Address Family with vrf
     */
    ipv4WithDstVrfs?: pulumi.Input<pulumi.Input<inputs.iosxe.BfdIpv4WithDstVrf>[]>;
    /**
     * IPv4 Address Family with vrf
     */
    ipv4WithSrcVrfs?: pulumi.Input<pulumi.Input<inputs.iosxe.BfdIpv4WithSrcVrf>[]>;
    /**
     * IPv4 Address Family with vrf
     */
    ipv4WithoutVrfs?: pulumi.Input<pulumi.Input<inputs.iosxe.BfdIpv4WithoutVrf>[]>;
    /**
     * IPv6 Address Family with vrf
     */
    ipv6WithBothVrfs?: pulumi.Input<pulumi.Input<inputs.iosxe.BfdIpv6WithBothVrf>[]>;
    /**
     * IPv6 Address Family with vrf
     */
    ipv6WithDstVrfs?: pulumi.Input<pulumi.Input<inputs.iosxe.BfdIpv6WithDstVrf>[]>;
    /**
     * IPv6 Address Family with vrf
     */
    ipv6WithSrcVrfs?: pulumi.Input<pulumi.Input<inputs.iosxe.BfdIpv6WithSrcVrf>[]>;
    /**
     * IPv6 Address Family with vrf
     */
    ipv6WithoutVrfs?: pulumi.Input<pulumi.Input<inputs.iosxe.BfdIpv6WithoutVrf>[]>;
    /**
     * Value in ms to use for slow timers - Range: `1000`-`30000`
     */
    slowTimers?: pulumi.Input<number>;
}