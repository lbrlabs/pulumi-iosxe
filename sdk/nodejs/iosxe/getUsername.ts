// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export function getUsername(args: GetUsernameArgs, opts?: pulumi.InvokeOptions): Promise<GetUsernameResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:iosxe/getUsername:getUsername", {
        "device": args.device,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getUsername.
 */
export interface GetUsernameArgs {
    device?: string;
    name: string;
}

/**
 * A collection of values returned by getUsername.
 */
export interface GetUsernameResult {
    readonly description: string;
    readonly device?: string;
    readonly id: string;
    readonly name: string;
    readonly password: string;
    readonly passwordEncryption: string;
    readonly privilege: number;
    readonly secret: string;
    readonly secretEncryption: string;
}
export function getUsernameOutput(args: GetUsernameOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetUsernameResult> {
    return pulumi.output(args).apply((a: any) => getUsername(a, opts))
}

/**
 * A collection of arguments for invoking getUsername.
 */
export interface GetUsernameOutputArgs {
    device?: pulumi.Input<string>;
    name: pulumi.Input<string>;
}