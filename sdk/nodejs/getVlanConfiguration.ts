// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This data source can read the VLAN Configuration configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getVlanConfiguration({
 *     vlanId: 123,
 * });
 * ```
 */
export function getVlanConfiguration(args: GetVlanConfigurationArgs, opts?: pulumi.InvokeOptions): Promise<GetVlanConfigurationResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:index/getVlanConfiguration:getVlanConfiguration", {
        "device": args.device,
        "vlanId": args.vlanId,
    }, opts);
}

/**
 * A collection of arguments for invoking getVlanConfiguration.
 */
export interface GetVlanConfigurationArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: string;
    /**
     * VLAN ID List Eg. 1-10,15
     */
    vlanId: number;
}

/**
 * A collection of values returned by getVlanConfiguration.
 */
export interface GetVlanConfigurationResult {
    /**
     * Enter VFI name
     */
    readonly accessVfi: string;
    /**
     * A device name from the provider configuration.
     */
    readonly device?: string;
    readonly evpnInstance: number;
    /**
     * VxLAN VNI value
     */
    readonly evpnInstanceVni: number;
    /**
     * The path of the retrieved object.
     */
    readonly id: string;
    /**
     * VLAN ID List Eg. 1-10,15
     */
    readonly vlanId: number;
    /**
     * VxLAN VNI value
     */
    readonly vni: number;
}
/**
 * This data source can read the VLAN Configuration configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getVlanConfiguration({
 *     vlanId: 123,
 * });
 * ```
 */
export function getVlanConfigurationOutput(args: GetVlanConfigurationOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVlanConfigurationResult> {
    return pulumi.output(args).apply((a: any) => getVlanConfiguration(a, opts))
}

/**
 * A collection of arguments for invoking getVlanConfiguration.
 */
export interface GetVlanConfigurationOutputArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    /**
     * VLAN ID List Eg. 1-10,15
     */
    vlanId: pulumi.Input<number>;
}