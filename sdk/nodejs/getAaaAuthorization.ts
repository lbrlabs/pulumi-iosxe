// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the AAA Authorization configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getAaaAuthorization({});
 * ```
 */
export function getAaaAuthorization(args?: GetAaaAuthorizationArgs, opts?: pulumi.InvokeOptions): Promise<GetAaaAuthorizationResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:index/getAaaAuthorization:getAaaAuthorization", {
        "device": args.device,
    }, opts);
}

/**
 * A collection of arguments for invoking getAaaAuthorization.
 */
export interface GetAaaAuthorizationArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: string;
}

/**
 * A collection of values returned by getAaaAuthorization.
 */
export interface GetAaaAuthorizationResult {
    /**
     * A device name from the provider configuration.
     */
    readonly device?: string;
    /**
     * For starting an exec (shell).
     */
    readonly execs: outputs.GetAaaAuthorizationExec[];
    /**
     * The path of the retrieved object.
     */
    readonly id: string;
    /**
     * For network services. (PPP, SLIP, ARAP)
     */
    readonly networks: outputs.GetAaaAuthorizationNetwork[];
}
/**
 * This data source can read the AAA Authorization configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getAaaAuthorization({});
 * ```
 */
export function getAaaAuthorizationOutput(args?: GetAaaAuthorizationOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAaaAuthorizationResult> {
    return pulumi.output(args).apply((a: any) => getAaaAuthorization(a, opts))
}

/**
 * A collection of arguments for invoking getAaaAuthorization.
 */
export interface GetAaaAuthorizationOutputArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
}
