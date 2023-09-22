// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This data source can retrieve one or more attributes via RESTCONF.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getRestconf({
 *     path: "Cisco-IOS-XE-native:native/banner/login",
 * });
 * ```
 */
export function getRestconf(args: GetRestconfArgs, opts?: pulumi.InvokeOptions): Promise<GetRestconfResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:index/getRestconf:getRestconf", {
        "device": args.device,
        "path": args.path,
    }, opts);
}

/**
 * A collection of arguments for invoking getRestconf.
 */
export interface GetRestconfArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: string;
    /**
     * A RESTCONF path, e.g. `openconfig-interfaces:interfaces`.
     */
    path: string;
}

/**
 * A collection of values returned by getRestconf.
 */
export interface GetRestconfResult {
    /**
     * Map of key-value pairs which represents the attributes and its values.
     */
    readonly attributes: {[key: string]: string};
    /**
     * A device name from the provider configuration.
     */
    readonly device?: string;
    /**
     * The path of the retrieved object.
     */
    readonly id: string;
    /**
     * A RESTCONF path, e.g. `openconfig-interfaces:interfaces`.
     */
    readonly path: string;
}
/**
 * This data source can retrieve one or more attributes via RESTCONF.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getRestconf({
 *     path: "Cisco-IOS-XE-native:native/banner/login",
 * });
 * ```
 */
export function getRestconfOutput(args: GetRestconfOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRestconfResult> {
    return pulumi.output(args).apply((a: any) => getRestconf(a, opts))
}

/**
 * A collection of arguments for invoking getRestconf.
 */
export interface GetRestconfOutputArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    /**
     * A RESTCONF path, e.g. `openconfig-interfaces:interfaces`.
     */
    path: pulumi.Input<string>;
}