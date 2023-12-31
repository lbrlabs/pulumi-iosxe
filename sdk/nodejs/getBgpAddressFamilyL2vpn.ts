// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This data source can read the BGP Address Family L2VPN configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getBgpAddressFamilyL2vpn({
 *     afName: "evpn",
 *     asn: "65000",
 * });
 * ```
 */
export function getBgpAddressFamilyL2vpn(args: GetBgpAddressFamilyL2vpnArgs, opts?: pulumi.InvokeOptions): Promise<GetBgpAddressFamilyL2vpnResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:index/getBgpAddressFamilyL2vpn:getBgpAddressFamilyL2vpn", {
        "afName": args.afName,
        "asn": args.asn,
        "device": args.device,
    }, opts);
}

/**
 * A collection of arguments for invoking getBgpAddressFamilyL2vpn.
 */
export interface GetBgpAddressFamilyL2vpnArgs {
    afName: string;
    asn: string;
    /**
     * A device name from the provider configuration.
     */
    device?: string;
}

/**
 * A collection of values returned by getBgpAddressFamilyL2vpn.
 */
export interface GetBgpAddressFamilyL2vpnResult {
    readonly afName: string;
    readonly asn: string;
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
 * This data source can read the BGP Address Family L2VPN configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getBgpAddressFamilyL2vpn({
 *     afName: "evpn",
 *     asn: "65000",
 * });
 * ```
 */
export function getBgpAddressFamilyL2vpnOutput(args: GetBgpAddressFamilyL2vpnOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetBgpAddressFamilyL2vpnResult> {
    return pulumi.output(args).apply((a: any) => getBgpAddressFamilyL2vpn(a, opts))
}

/**
 * A collection of arguments for invoking getBgpAddressFamilyL2vpn.
 */
export interface GetBgpAddressFamilyL2vpnOutputArgs {
    afName: pulumi.Input<string>;
    asn: pulumi.Input<string>;
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
}
