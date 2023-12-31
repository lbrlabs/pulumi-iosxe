// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This data source can read the Interface OSPFv3 configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getInterfaceOspfv3({
 *     name: "1",
 *     type: "Loopback",
 * });
 * ```
 */
export function getInterfaceOspfv3(args: GetInterfaceOspfv3Args, opts?: pulumi.InvokeOptions): Promise<GetInterfaceOspfv3Result> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:index/getInterfaceOspfv3:getInterfaceOspfv3", {
        "device": args.device,
        "name": args.name,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getInterfaceOspfv3.
 */
export interface GetInterfaceOspfv3Args {
    /**
     * A device name from the provider configuration.
     */
    device?: string;
    name: string;
    /**
     * Interface type
     */
    type: string;
}

/**
 * A collection of values returned by getInterfaceOspfv3.
 */
export interface GetInterfaceOspfv3Result {
    /**
     * Static route cost value of the interface
     */
    readonly cost: number;
    /**
     * A device name from the provider configuration.
     */
    readonly device?: string;
    /**
     * The path of the retrieved object.
     */
    readonly id: string;
    readonly name: string;
    /**
     * Specify OSPF broadcast multi-access network
     */
    readonly networkTypeBroadcast: boolean;
    /**
     * Specify OSPF NBMA network
     */
    readonly networkTypeNonBroadcast: boolean;
    /**
     * Specify OSPF point-to-multipoint network
     */
    readonly networkTypePointToMultipoint: boolean;
    /**
     * Specify OSPF point-to-point network
     */
    readonly networkTypePointToPoint: boolean;
    /**
     * Interface type
     */
    readonly type: string;
}
/**
 * This data source can read the Interface OSPFv3 configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getInterfaceOspfv3({
 *     name: "1",
 *     type: "Loopback",
 * });
 * ```
 */
export function getInterfaceOspfv3Output(args: GetInterfaceOspfv3OutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetInterfaceOspfv3Result> {
    return pulumi.output(args).apply((a: any) => getInterfaceOspfv3(a, opts))
}

/**
 * A collection of arguments for invoking getInterfaceOspfv3.
 */
export interface GetInterfaceOspfv3OutputArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    name: pulumi.Input<string>;
    /**
     * Interface type
     */
    type: pulumi.Input<string>;
}
