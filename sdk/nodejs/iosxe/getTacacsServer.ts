// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export function getTacacsServer(args: GetTacacsServerArgs, opts?: pulumi.InvokeOptions): Promise<GetTacacsServerResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:iosxe/getTacacsServer:getTacacsServer", {
        "device": args.device,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getTacacsServer.
 */
export interface GetTacacsServerArgs {
    device?: string;
    name: string;
}

/**
 * A collection of values returned by getTacacsServer.
 */
export interface GetTacacsServerResult {
    readonly addressIpv4: string;
    readonly device?: string;
    readonly id: string;
    readonly key: string;
    readonly name: string;
    readonly timeout: number;
}
export function getTacacsServerOutput(args: GetTacacsServerOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTacacsServerResult> {
    return pulumi.output(args).apply((a: any) => getTacacsServer(a, opts))
}

/**
 * A collection of arguments for invoking getTacacsServer.
 */
export interface GetTacacsServerOutputArgs {
    device?: pulumi.Input<string>;
    name: pulumi.Input<string>;
}
