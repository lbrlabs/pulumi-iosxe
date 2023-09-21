// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export class TacacsServer extends pulumi.CustomResource {
    /**
     * Get an existing TacacsServer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TacacsServerState, opts?: pulumi.CustomResourceOptions): TacacsServer {
        return new TacacsServer(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'iosxe:iosxe/tacacsServer:TacacsServer';

    /**
     * Returns true if the given object is an instance of TacacsServer.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TacacsServer {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TacacsServer.__pulumiType;
    }

    /**
     * IPv4 address or Hostname for tacacs server
     */
    public readonly addressIpv4!: pulumi.Output<string | undefined>;
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
     * The UNENCRYPTED (cleartext) server key
     */
    public readonly key!: pulumi.Output<string | undefined>;
    /**
     * Name for the tacacs server configuration
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Time to wait for this TACACS server to reply (overrides default) - Range: `1`-`1000`
     */
    public readonly timeout!: pulumi.Output<number | undefined>;

    /**
     * Create a TacacsServer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: TacacsServerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TacacsServerArgs | TacacsServerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TacacsServerState | undefined;
            resourceInputs["addressIpv4"] = state ? state.addressIpv4 : undefined;
            resourceInputs["deleteMode"] = state ? state.deleteMode : undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["key"] = state ? state.key : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["timeout"] = state ? state.timeout : undefined;
        } else {
            const args = argsOrState as TacacsServerArgs | undefined;
            resourceInputs["addressIpv4"] = args ? args.addressIpv4 : undefined;
            resourceInputs["deleteMode"] = args ? args.deleteMode : undefined;
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["key"] = args ? args.key : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["timeout"] = args ? args.timeout : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TacacsServer.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TacacsServer resources.
 */
export interface TacacsServerState {
    /**
     * IPv4 address or Hostname for tacacs server
     */
    addressIpv4?: pulumi.Input<string>;
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
     * The UNENCRYPTED (cleartext) server key
     */
    key?: pulumi.Input<string>;
    /**
     * Name for the tacacs server configuration
     */
    name?: pulumi.Input<string>;
    /**
     * Time to wait for this TACACS server to reply (overrides default) - Range: `1`-`1000`
     */
    timeout?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a TacacsServer resource.
 */
export interface TacacsServerArgs {
    /**
     * IPv4 address or Hostname for tacacs server
     */
    addressIpv4?: pulumi.Input<string>;
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
     * The UNENCRYPTED (cleartext) server key
     */
    key?: pulumi.Input<string>;
    /**
     * Name for the tacacs server configuration
     */
    name?: pulumi.Input<string>;
    /**
     * Time to wait for this TACACS server to reply (overrides default) - Range: `1`-`1000`
     */
    timeout?: pulumi.Input<number>;
}
