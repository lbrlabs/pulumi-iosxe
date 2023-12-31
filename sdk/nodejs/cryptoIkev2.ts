// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource can manage the Crypto IKEv2 configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@lbrlabs/pulumi-iosxe";
 *
 * const example = new iosxe.CryptoIkev2("example", {
 *     dpd: 10,
 *     dpdQuery: "periodic",
 *     dpdRetryInterval: 5,
 *     natKeepalive: 20,
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import iosxe:index/cryptoIkev2:CryptoIkev2 example "Cisco-IOS-XE-native:native/crypto/Cisco-IOS-XE-crypto:ikev2"
 * ```
 */
export class CryptoIkev2 extends pulumi.CustomResource {
    /**
     * Get an existing CryptoIkev2 resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CryptoIkev2State, opts?: pulumi.CustomResourceOptions): CryptoIkev2 {
        return new CryptoIkev2(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'iosxe:index/cryptoIkev2:CryptoIkev2';

    /**
     * Returns true if the given object is an instance of CryptoIkev2.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CryptoIkev2 {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CryptoIkev2.__pulumiType;
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
     * Enable IKE liveness check for peers - Range: `10`-`3600`
     */
    public readonly dpd!: pulumi.Output<number | undefined>;
    /**
     * - Choices: `on-demand`, `periodic`
     */
    public readonly dpdQuery!: pulumi.Output<string | undefined>;
    /**
     * - Range: `2`-`60`
     */
    public readonly dpdRetryInterval!: pulumi.Output<number | undefined>;
    /**
     * Set NAT keepalive interval - Range: `5`-`3600`
     */
    public readonly natKeepalive!: pulumi.Output<number | undefined>;

    /**
     * Create a CryptoIkev2 resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: CryptoIkev2Args, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CryptoIkev2Args | CryptoIkev2State, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CryptoIkev2State | undefined;
            resourceInputs["deleteMode"] = state ? state.deleteMode : undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["dpd"] = state ? state.dpd : undefined;
            resourceInputs["dpdQuery"] = state ? state.dpdQuery : undefined;
            resourceInputs["dpdRetryInterval"] = state ? state.dpdRetryInterval : undefined;
            resourceInputs["natKeepalive"] = state ? state.natKeepalive : undefined;
        } else {
            const args = argsOrState as CryptoIkev2Args | undefined;
            resourceInputs["deleteMode"] = args ? args.deleteMode : undefined;
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["dpd"] = args ? args.dpd : undefined;
            resourceInputs["dpdQuery"] = args ? args.dpdQuery : undefined;
            resourceInputs["dpdRetryInterval"] = args ? args.dpdRetryInterval : undefined;
            resourceInputs["natKeepalive"] = args ? args.natKeepalive : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CryptoIkev2.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CryptoIkev2 resources.
 */
export interface CryptoIkev2State {
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
     * Enable IKE liveness check for peers - Range: `10`-`3600`
     */
    dpd?: pulumi.Input<number>;
    /**
     * - Choices: `on-demand`, `periodic`
     */
    dpdQuery?: pulumi.Input<string>;
    /**
     * - Range: `2`-`60`
     */
    dpdRetryInterval?: pulumi.Input<number>;
    /**
     * Set NAT keepalive interval - Range: `5`-`3600`
     */
    natKeepalive?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a CryptoIkev2 resource.
 */
export interface CryptoIkev2Args {
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
     * Enable IKE liveness check for peers - Range: `10`-`3600`
     */
    dpd?: pulumi.Input<number>;
    /**
     * - Choices: `on-demand`, `periodic`
     */
    dpdQuery?: pulumi.Input<string>;
    /**
     * - Range: `2`-`60`
     */
    dpdRetryInterval?: pulumi.Input<number>;
    /**
     * Set NAT keepalive interval - Range: `5`-`3600`
     */
    natKeepalive?: pulumi.Input<number>;
}
