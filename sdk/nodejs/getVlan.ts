// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This data source can read the VLAN configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getVlan({
 *     vlanId: 123,
 * });
 * ```
 */
export function getVlan(args: GetVlanArgs, opts?: pulumi.InvokeOptions): Promise<GetVlanResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:index/getVlan:getVlan", {
        "device": args.device,
        "vlanId": args.vlanId,
    }, opts);
}

/**
 * A collection of arguments for invoking getVlan.
 */
export interface GetVlanArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: string;
    /**
     * a single VLAN id (allowed value range 1-4094)or Comma-separated VLAN id range.e.g. 99 or 1-30 or  1-20,30,40-50
     */
    vlanId: number;
}

/**
 * A collection of values returned by getVlan.
 */
export interface GetVlanResult {
    /**
     * A device name from the provider configuration.
     */
    readonly device?: string;
    /**
     * The path of the retrieved object.
     */
    readonly id: string;
    /**
     * Ascii name of the VLAN
     */
    readonly name: string;
    /**
     * Configure association between private VLANs
     */
    readonly privateVlanAssociation: string;
    /**
     * Configure the VLAN as a community private VLAN
     */
    readonly privateVlanCommunity: boolean;
    /**
     * Configure the VLAN as an isolated private VLAN
     */
    readonly privateVlanIsolated: boolean;
    /**
     * Configure the VLAN as a primary private VLAN
     */
    readonly privateVlanPrimary: boolean;
    /**
     * Configure as Remote SPAN VLAN
     */
    readonly remoteSpan: boolean;
    /**
     * Shutdown VLAN switching
     */
    readonly shutdown: boolean;
    /**
     * a single VLAN id (allowed value range 1-4094)or Comma-separated VLAN id range.e.g. 99 or 1-30 or  1-20,30,40-50
     */
    readonly vlanId: number;
}
/**
 * This data source can read the VLAN configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getVlan({
 *     vlanId: 123,
 * });
 * ```
 */
export function getVlanOutput(args: GetVlanOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVlanResult> {
    return pulumi.output(args).apply((a: any) => getVlan(a, opts))
}

/**
 * A collection of arguments for invoking getVlan.
 */
export interface GetVlanOutputArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    /**
     * a single VLAN id (allowed value range 1-4094)or Comma-separated VLAN id range.e.g. 99 or 1-30 or  1-20,30,40-50
     */
    vlanId: pulumi.Input<number>;
}
