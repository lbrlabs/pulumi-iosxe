// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource can manage the AAA configuration.
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import iosxe:index/aaa:Aaa example "Cisco-IOS-XE-native:native/aaa"
 * ```
 */
export class Aaa extends pulumi.CustomResource {
    /**
     * Get an existing Aaa resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AaaState, opts?: pulumi.CustomResourceOptions): Aaa {
        return new Aaa(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'iosxe:index/aaa:Aaa';

    /**
     * Returns true if the given object is an instance of Aaa.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Aaa {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Aaa.__pulumiType;
    }

    /**
     * A device name from the provider configuration.
     */
    public readonly device!: pulumi.Output<string | undefined>;
    /**
     * Radius server-group definition
     */
    public readonly groupServerRadii!: pulumi.Output<outputs.AaaGroupServerRadius[] | undefined>;
    /**
     * Tacacs+ server-group definition
     */
    public readonly groupServerTacacspluses!: pulumi.Output<outputs.AaaGroupServerTacacsplus[] | undefined>;
    /**
     * Enable NEW access control commands and functions.(Disables OLD commands.)
     */
    public readonly newModel!: pulumi.Output<boolean | undefined>;
    /**
     * Local server profile for RFC 3576 support
     */
    public readonly serverRadiusDynamicAuthor!: pulumi.Output<boolean | undefined>;
    /**
     * Specify a RADIUS client
     */
    public readonly serverRadiusDynamicAuthorClients!: pulumi.Output<outputs.AaaServerRadiusDynamicAuthorClient[] | undefined>;
    /**
     * AAA Session ID - Choices: `common`, `unique`
     */
    public readonly sessionId!: pulumi.Output<string | undefined>;

    /**
     * Create a Aaa resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AaaArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AaaArgs | AaaState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AaaState | undefined;
            resourceInputs["device"] = state ? state.device : undefined;
            resourceInputs["groupServerRadii"] = state ? state.groupServerRadii : undefined;
            resourceInputs["groupServerTacacspluses"] = state ? state.groupServerTacacspluses : undefined;
            resourceInputs["newModel"] = state ? state.newModel : undefined;
            resourceInputs["serverRadiusDynamicAuthor"] = state ? state.serverRadiusDynamicAuthor : undefined;
            resourceInputs["serverRadiusDynamicAuthorClients"] = state ? state.serverRadiusDynamicAuthorClients : undefined;
            resourceInputs["sessionId"] = state ? state.sessionId : undefined;
        } else {
            const args = argsOrState as AaaArgs | undefined;
            resourceInputs["device"] = args ? args.device : undefined;
            resourceInputs["groupServerRadii"] = args ? args.groupServerRadii : undefined;
            resourceInputs["groupServerTacacspluses"] = args ? args.groupServerTacacspluses : undefined;
            resourceInputs["newModel"] = args ? args.newModel : undefined;
            resourceInputs["serverRadiusDynamicAuthor"] = args ? args.serverRadiusDynamicAuthor : undefined;
            resourceInputs["serverRadiusDynamicAuthorClients"] = args ? args.serverRadiusDynamicAuthorClients : undefined;
            resourceInputs["sessionId"] = args ? args.sessionId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Aaa.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Aaa resources.
 */
export interface AaaState {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    /**
     * Radius server-group definition
     */
    groupServerRadii?: pulumi.Input<pulumi.Input<inputs.AaaGroupServerRadius>[]>;
    /**
     * Tacacs+ server-group definition
     */
    groupServerTacacspluses?: pulumi.Input<pulumi.Input<inputs.AaaGroupServerTacacsplus>[]>;
    /**
     * Enable NEW access control commands and functions.(Disables OLD commands.)
     */
    newModel?: pulumi.Input<boolean>;
    /**
     * Local server profile for RFC 3576 support
     */
    serverRadiusDynamicAuthor?: pulumi.Input<boolean>;
    /**
     * Specify a RADIUS client
     */
    serverRadiusDynamicAuthorClients?: pulumi.Input<pulumi.Input<inputs.AaaServerRadiusDynamicAuthorClient>[]>;
    /**
     * AAA Session ID - Choices: `common`, `unique`
     */
    sessionId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Aaa resource.
 */
export interface AaaArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    /**
     * Radius server-group definition
     */
    groupServerRadii?: pulumi.Input<pulumi.Input<inputs.AaaGroupServerRadius>[]>;
    /**
     * Tacacs+ server-group definition
     */
    groupServerTacacspluses?: pulumi.Input<pulumi.Input<inputs.AaaGroupServerTacacsplus>[]>;
    /**
     * Enable NEW access control commands and functions.(Disables OLD commands.)
     */
    newModel?: pulumi.Input<boolean>;
    /**
     * Local server profile for RFC 3576 support
     */
    serverRadiusDynamicAuthor?: pulumi.Input<boolean>;
    /**
     * Specify a RADIUS client
     */
    serverRadiusDynamicAuthorClients?: pulumi.Input<pulumi.Input<inputs.AaaServerRadiusDynamicAuthorClient>[]>;
    /**
     * AAA Session ID - Choices: `common`, `unique`
     */
    sessionId?: pulumi.Input<string>;
}
