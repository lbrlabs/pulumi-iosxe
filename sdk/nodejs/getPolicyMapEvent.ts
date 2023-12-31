// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the Policy Map Event configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getPolicyMapEvent({
 *     eventType: "authentication-success",
 *     name: "dot1x_policy",
 * });
 * ```
 */
export function getPolicyMapEvent(args: GetPolicyMapEventArgs, opts?: pulumi.InvokeOptions): Promise<GetPolicyMapEventResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:index/getPolicyMapEvent:getPolicyMapEvent", {
        "device": args.device,
        "eventType": args.eventType,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getPolicyMapEvent.
 */
export interface GetPolicyMapEventArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: string;
    eventType: string;
    /**
     * Name of the policy map
     */
    name: string;
}

/**
 * A collection of values returned by getPolicyMapEvent.
 */
export interface GetPolicyMapEventResult {
    /**
     * class number, 1 for 1st class, 2 for 2nd...
     */
    readonly classNumbers: outputs.GetPolicyMapEventClassNumber[];
    /**
     * A device name from the provider configuration.
     */
    readonly device?: string;
    readonly eventType: string;
    /**
     * The path of the retrieved object.
     */
    readonly id: string;
    readonly matchType: string;
    /**
     * Name of the policy map
     */
    readonly name: string;
}
/**
 * This data source can read the Policy Map Event configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getPolicyMapEvent({
 *     eventType: "authentication-success",
 *     name: "dot1x_policy",
 * });
 * ```
 */
export function getPolicyMapEventOutput(args: GetPolicyMapEventOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPolicyMapEventResult> {
    return pulumi.output(args).apply((a: any) => getPolicyMapEvent(a, opts))
}

/**
 * A collection of arguments for invoking getPolicyMapEvent.
 */
export interface GetPolicyMapEventOutputArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    eventType: pulumi.Input<string>;
    /**
     * Name of the policy map
     */
    name: pulumi.Input<string>;
}
