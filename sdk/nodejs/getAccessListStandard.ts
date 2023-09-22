// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the Access List Standard configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getAccessListStandard({
 *     name: "SACL1",
 * });
 * ```
 */
export function getAccessListStandard(args: GetAccessListStandardArgs, opts?: pulumi.InvokeOptions): Promise<GetAccessListStandardResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:index/getAccessListStandard:getAccessListStandard", {
        "device": args.device,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccessListStandard.
 */
export interface GetAccessListStandardArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: string;
    name: string;
}

/**
 * A collection of values returned by getAccessListStandard.
 */
export interface GetAccessListStandardResult {
    /**
     * A device name from the provider configuration.
     */
    readonly device?: string;
    readonly entries: outputs.GetAccessListStandardEntry[];
    /**
     * The path of the retrieved object.
     */
    readonly id: string;
    readonly name: string;
}
/**
 * This data source can read the Access List Standard configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getAccessListStandard({
 *     name: "SACL1",
 * });
 * ```
 */
export function getAccessListStandardOutput(args: GetAccessListStandardOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAccessListStandardResult> {
    return pulumi.output(args).apply((a: any) => getAccessListStandard(a, opts))
}

/**
 * A collection of arguments for invoking getAccessListStandard.
 */
export interface GetAccessListStandardOutputArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    name: pulumi.Input<string>;
}