// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource can manage the BGP Address Family IPv4 VRF configuration.
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import iosxe:index/bgpAddressFamilyIpv4Vrf:BgpAddressFamilyIpv4Vrf example "Cisco-IOS-XE-native:native/router/Cisco-IOS-XE-bgp:bgp=65000/address-family/with-vrf/ipv4=unicast"
 * ```
 */
export class BgpAddressFamilyIpv4Vrf extends pulumi.CustomResource {
    /**
     * Get an existing BgpAddressFamilyIpv4Vrf resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BgpAddressFamilyIpv4VrfState, opts?: pulumi.CustomResourceOptions): BgpAddressFamilyIpv4Vrf {
        return new BgpAddressFamilyIpv4Vrf(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'iosxe:index/bgpAddressFamilyIpv4Vrf:BgpAddressFamilyIpv4Vrf';

    /**
     * Returns true if the given object is an instance of BgpAddressFamilyIpv4Vrf.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BgpAddressFamilyIpv4Vrf {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BgpAddressFamilyIpv4Vrf.__pulumiType;
    }

    /**
     * - Choices: `flowspec`, `labeled-unicast`, `mdt`, `multicast`, `mvpn`, `sr-policy`, `tunnel`, `unicast`
     */
    public readonly afName!: pulumi.Output<string>;
    public readonly asn!: pulumi.Output<string>;
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
    public readonly vrfs!: pulumi.Output<outputs.BgpAddressFamilyIpv4VrfVrf[] | undefined>;

    /**
     * Create a BgpAddressFamilyIpv4Vrf resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BgpAddressFamilyIpv4VrfArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BgpAddressFamilyIpv4VrfArgs | BgpAddressFamilyIpv4VrfState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BgpAddressFamilyIpv4VrfState | undefined;
            resourceInputs["afName"] = state ? state.afName : undefined;
            resourceInputs["asn"] = state ? state.asn : undefined;
            resourceInputs["deleteMode"] = state ? state.deleteMode : undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["vrfs"] = state ? state.vrfs : undefined;
        } else {
            const args = argsOrState as BgpAddressFamilyIpv4VrfArgs | undefined;
            if ((!args || args.afName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'afName'");
            }
            if ((!args || args.asn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'asn'");
            }
            resourceInputs["afName"] = args ? args.afName : undefined;
            resourceInputs["asn"] = args ? args.asn : undefined;
            resourceInputs["deleteMode"] = args ? args.deleteMode : undefined;
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["vrfs"] = args ? args.vrfs : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BgpAddressFamilyIpv4Vrf.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BgpAddressFamilyIpv4Vrf resources.
 */
export interface BgpAddressFamilyIpv4VrfState {
    /**
     * - Choices: `flowspec`, `labeled-unicast`, `mdt`, `multicast`, `mvpn`, `sr-policy`, `tunnel`, `unicast`
     */
    afName?: pulumi.Input<string>;
    asn?: pulumi.Input<string>;
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
    vrfs?: pulumi.Input<pulumi.Input<inputs.BgpAddressFamilyIpv4VrfVrf>[]>;
}

/**
 * The set of arguments for constructing a BgpAddressFamilyIpv4Vrf resource.
 */
export interface BgpAddressFamilyIpv4VrfArgs {
    /**
     * - Choices: `flowspec`, `labeled-unicast`, `mdt`, `multicast`, `mvpn`, `sr-policy`, `tunnel`, `unicast`
     */
    afName: pulumi.Input<string>;
    asn: pulumi.Input<string>;
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
    vrfs?: pulumi.Input<pulumi.Input<inputs.BgpAddressFamilyIpv4VrfVrf>[]>;
}
