// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the AAA configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getAaa({});
 * ```
 */
export function getAaa(args?: GetAaaArgs, opts?: pulumi.InvokeOptions): Promise<GetAaaResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:index/getAaa:getAaa", {
        "device": args.device,
    }, opts);
}

/**
 * A collection of arguments for invoking getAaa.
 */
export interface GetAaaArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: string;
}

/**
 * A collection of values returned by getAaa.
 */
export interface GetAaaResult {
    /**
     * A device name from the provider configuration.
     */
    readonly device?: string;
    /**
     * Radius server-group definition
     */
    readonly groupServerRadii: outputs.GetAaaGroupServerRadius[];
    /**
     * Tacacs+ server-group definition
     */
    readonly groupServerTacacspluses: outputs.GetAaaGroupServerTacacsplus[];
    /**
     * The path of the retrieved object.
     */
    readonly id: string;
    /**
     * Enable NEW access control commands and functions.(Disables OLD commands.)
     */
    readonly newModel: boolean;
    /**
     * Local server profile for RFC 3576 support
     */
    readonly serverRadiusDynamicAuthor: boolean;
    /**
     * Specify a RADIUS client
     */
    readonly serverRadiusDynamicAuthorClients: outputs.GetAaaServerRadiusDynamicAuthorClient[];
    /**
     * AAA Session ID
     */
    readonly sessionId: string;
}
/**
 * This data source can read the AAA configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getAaa({});
 * ```
 */
export function getAaaOutput(args?: GetAaaOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAaaResult> {
    return pulumi.output(args).apply((a: any) => getAaa(a, opts))
}

/**
 * A collection of arguments for invoking getAaa.
 */
export interface GetAaaOutputArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
}
