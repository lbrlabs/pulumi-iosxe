// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource can manage the Route Map configuration.
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import iosxe:index/routeMap:RouteMap example "Cisco-IOS-XE-native:native/route-map=RM1"
 * ```
 */
export class RouteMap extends pulumi.CustomResource {
    /**
     * Get an existing RouteMap resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RouteMapState, opts?: pulumi.CustomResourceOptions): RouteMap {
        return new RouteMap(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'iosxe:index/routeMap:RouteMap';

    /**
     * Returns true if the given object is an instance of RouteMap.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RouteMap {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RouteMap.__pulumiType;
    }

    /**
     * A device name from the provider configuration.
     */
    public readonly device!: pulumi.Output<string | undefined>;
    public readonly entries!: pulumi.Output<outputs.RouteMapEntry[] | undefined>;
    /**
     * WORD;;Route map tag
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a RouteMap resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: RouteMapArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RouteMapArgs | RouteMapState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RouteMapState | undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["entries"] = state ? state.entries : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as RouteMapArgs | undefined;
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["entries"] = args ? args.entries : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RouteMap.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RouteMap resources.
 */
export interface RouteMapState {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    entries?: pulumi.Input<pulumi.Input<inputs.RouteMapEntry>[]>;
    /**
     * WORD;;Route map tag
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RouteMap resource.
 */
export interface RouteMapArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    entries?: pulumi.Input<pulumi.Input<inputs.RouteMapEntry>[]>;
    /**
     * WORD;;Route map tag
     */
    name?: pulumi.Input<string>;
}