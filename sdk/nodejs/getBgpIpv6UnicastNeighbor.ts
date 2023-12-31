// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the BGP IPv6 Unicast Neighbor configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getBgpIpv6UnicastNeighbor({
 *     asn: "65000",
 *     ip: "3.3.3.3",
 * });
 * ```
 */
export function getBgpIpv6UnicastNeighbor(args: GetBgpIpv6UnicastNeighborArgs, opts?: pulumi.InvokeOptions): Promise<GetBgpIpv6UnicastNeighborResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:index/getBgpIpv6UnicastNeighbor:getBgpIpv6UnicastNeighbor", {
        "asn": args.asn,
        "device": args.device,
        "ip": args.ip,
    }, opts);
}

/**
 * A collection of arguments for invoking getBgpIpv6UnicastNeighbor.
 */
export interface GetBgpIpv6UnicastNeighborArgs {
    asn: string;
    /**
     * A device name from the provider configuration.
     */
    device?: string;
    ip: string;
}

/**
 * A collection of values returned by getBgpIpv6UnicastNeighbor.
 */
export interface GetBgpIpv6UnicastNeighborResult {
    /**
     * Enable the address family for this neighbor
     */
    readonly activate: boolean;
    readonly asn: string;
    /**
     * A device name from the provider configuration.
     */
    readonly device?: string;
    /**
     * The path of the retrieved object.
     */
    readonly id: string;
    readonly ip: string;
    /**
     * Apply route map to neighbor
     */
    readonly routeMaps: outputs.GetBgpIpv6UnicastNeighborRouteMap[];
    /**
     * Configure a neighbor as Route Reflector client
     */
    readonly routeReflectorClient: boolean;
    readonly sendCommunity: string;
}
/**
 * This data source can read the BGP IPv6 Unicast Neighbor configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getBgpIpv6UnicastNeighbor({
 *     asn: "65000",
 *     ip: "3.3.3.3",
 * });
 * ```
 */
export function getBgpIpv6UnicastNeighborOutput(args: GetBgpIpv6UnicastNeighborOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetBgpIpv6UnicastNeighborResult> {
    return pulumi.output(args).apply((a: any) => getBgpIpv6UnicastNeighbor(a, opts))
}

/**
 * A collection of arguments for invoking getBgpIpv6UnicastNeighbor.
 */
export interface GetBgpIpv6UnicastNeighborOutputArgs {
    asn: pulumi.Input<string>;
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    ip: pulumi.Input<string>;
}
