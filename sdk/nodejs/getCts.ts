// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This data source can read the CTS configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getCts({});
 * ```
 */
export function getCts(args?: GetCtsArgs, opts?: pulumi.InvokeOptions): Promise<GetCtsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:index/getCts:getCts", {
        "device": args.device,
    }, opts);
}

/**
 * A collection of arguments for invoking getCts.
 */
export interface GetCtsArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: string;
}

/**
 * A collection of values returned by getCts.
 */
export interface GetCtsResult {
    /**
     * Local authorization list to use for CTS
     */
    readonly authorizationList: string;
    /**
     * A device name from the provider configuration.
     */
    readonly device?: string;
    /**
     * The path of the retrieved object.
     */
    readonly id: string;
}
/**
 * This data source can read the CTS configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getCts({});
 * ```
 */
export function getCtsOutput(args?: GetCtsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCtsResult> {
    return pulumi.output(args).apply((a: any) => getCts(a, opts))
}

/**
 * A collection of arguments for invoking getCts.
 */
export interface GetCtsOutputArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
}