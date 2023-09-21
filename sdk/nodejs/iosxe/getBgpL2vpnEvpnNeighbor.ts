// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export function getBgpL2vpnEvpnNeighbor(args: GetBgpL2vpnEvpnNeighborArgs, opts?: pulumi.InvokeOptions): Promise<GetBgpL2vpnEvpnNeighborResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:iosxe/getBgpL2vpnEvpnNeighbor:getBgpL2vpnEvpnNeighbor", {
        "asn": args.asn,
        "device": args.device,
        "ip": args.ip,
    }, opts);
}

/**
 * A collection of arguments for invoking getBgpL2vpnEvpnNeighbor.
 */
export interface GetBgpL2vpnEvpnNeighborArgs {
    asn: string;
    device?: string;
    ip: string;
}

/**
 * A collection of values returned by getBgpL2vpnEvpnNeighbor.
 */
export interface GetBgpL2vpnEvpnNeighborResult {
    readonly activate: boolean;
    readonly asn: string;
    readonly device?: string;
    readonly id: string;
    readonly ip: string;
    readonly routeReflectorClient: boolean;
    readonly sendCommunity: string;
}
export function getBgpL2vpnEvpnNeighborOutput(args: GetBgpL2vpnEvpnNeighborOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetBgpL2vpnEvpnNeighborResult> {
    return pulumi.output(args).apply((a: any) => getBgpL2vpnEvpnNeighbor(a, opts))
}

/**
 * A collection of arguments for invoking getBgpL2vpnEvpnNeighbor.
 */
export interface GetBgpL2vpnEvpnNeighborOutputArgs {
    asn: pulumi.Input<string>;
    device?: pulumi.Input<string>;
    ip: pulumi.Input<string>;
}
