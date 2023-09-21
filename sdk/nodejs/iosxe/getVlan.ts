// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export function getVlan(args: GetVlanArgs, opts?: pulumi.InvokeOptions): Promise<GetVlanResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:iosxe/getVlan:getVlan", {
        "device": args.device,
        "vlanId": args.vlanId,
    }, opts);
}

/**
 * A collection of arguments for invoking getVlan.
 */
export interface GetVlanArgs {
    device?: string;
    vlanId: number;
}

/**
 * A collection of values returned by getVlan.
 */
export interface GetVlanResult {
    readonly device?: string;
    readonly id: string;
    readonly name: string;
    readonly privateVlanAssociation: string;
    readonly privateVlanCommunity: boolean;
    readonly privateVlanIsolated: boolean;
    readonly privateVlanPrimary: boolean;
    readonly remoteSpan: boolean;
    readonly shutdown: boolean;
    readonly vlanId: number;
}
export function getVlanOutput(args: GetVlanOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVlanResult> {
    return pulumi.output(args).apply((a: any) => getVlan(a, opts))
}

/**
 * A collection of arguments for invoking getVlan.
 */
export interface GetVlanOutputArgs {
    device?: pulumi.Input<string>;
    vlanId: pulumi.Input<number>;
}
