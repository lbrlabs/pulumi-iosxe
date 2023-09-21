// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the MSDP configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getMsdp({});
 * ```
 */
export function getMsdp(args?: GetMsdpArgs, opts?: pulumi.InvokeOptions): Promise<GetMsdpResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:index/getMsdp:getMsdp", {
        "device": args.device,
    }, opts);
}

/**
 * A collection of arguments for invoking getMsdp.
 */
export interface GetMsdpArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: string;
}

/**
 * A collection of values returned by getMsdp.
 */
export interface GetMsdpResult {
    /**
     * A device name from the provider configuration.
     */
    readonly device?: string;
    /**
     * The path of the retrieved object.
     */
    readonly id: string;
    /**
     * Configure MSDP Originator ID
     */
    readonly originatorId: string;
    /**
     * MSDP peer on which the password is to be set
     */
    readonly passwords: outputs.GetMsdpPassword[];
    /**
     * Configure an MSDP peer
     */
    readonly peers: outputs.GetMsdpPeer[];
}
/**
 * This data source can read the MSDP configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getMsdp({});
 * ```
 */
export function getMsdpOutput(args?: GetMsdpOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetMsdpResult> {
    return pulumi.output(args).apply((a: any) => getMsdp(a, opts))
}

/**
 * A collection of arguments for invoking getMsdp.
 */
export interface GetMsdpOutputArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
}
