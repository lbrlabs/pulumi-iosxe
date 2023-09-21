// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export function getInterfaceOspfv3(args: GetInterfaceOspfv3Args, opts?: pulumi.InvokeOptions): Promise<GetInterfaceOspfv3Result> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:iosxe/getInterfaceOspfv3:getInterfaceOspfv3", {
        "device": args.device,
        "name": args.name,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getInterfaceOspfv3.
 */
export interface GetInterfaceOspfv3Args {
    device?: string;
    name: string;
    type: string;
}

/**
 * A collection of values returned by getInterfaceOspfv3.
 */
export interface GetInterfaceOspfv3Result {
    readonly cost: number;
    readonly device?: string;
    readonly id: string;
    readonly name: string;
    readonly networkTypeBroadcast: boolean;
    readonly networkTypeNonBroadcast: boolean;
    readonly networkTypePointToMultipoint: boolean;
    readonly networkTypePointToPoint: boolean;
    readonly type: string;
}
export function getInterfaceOspfv3Output(args: GetInterfaceOspfv3OutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetInterfaceOspfv3Result> {
    return pulumi.output(args).apply((a: any) => getInterfaceOspfv3(a, opts))
}

/**
 * A collection of arguments for invoking getInterfaceOspfv3.
 */
export interface GetInterfaceOspfv3OutputArgs {
    device?: pulumi.Input<string>;
    name: pulumi.Input<string>;
    type: pulumi.Input<string>;
}
