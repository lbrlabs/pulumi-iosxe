// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export function getAccessListExtended(args: GetAccessListExtendedArgs, opts?: pulumi.InvokeOptions): Promise<GetAccessListExtendedResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:iosxe/getAccessListExtended:getAccessListExtended", {
        "device": args.device,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccessListExtended.
 */
export interface GetAccessListExtendedArgs {
    device?: string;
    name: string;
}

/**
 * A collection of values returned by getAccessListExtended.
 */
export interface GetAccessListExtendedResult {
    readonly device?: string;
    readonly entries: outputs.iosxe.GetAccessListExtendedEntry[];
    readonly id: string;
    readonly name: string;
}
export function getAccessListExtendedOutput(args: GetAccessListExtendedOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAccessListExtendedResult> {
    return pulumi.output(args).apply((a: any) => getAccessListExtended(a, opts))
}

/**
 * A collection of arguments for invoking getAccessListExtended.
 */
export interface GetAccessListExtendedOutputArgs {
    device?: pulumi.Input<string>;
    name: pulumi.Input<string>;
}