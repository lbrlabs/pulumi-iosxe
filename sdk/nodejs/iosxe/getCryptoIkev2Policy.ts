// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export function getCryptoIkev2Policy(args: GetCryptoIkev2PolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetCryptoIkev2PolicyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:iosxe/getCryptoIkev2Policy:getCryptoIkev2Policy", {
        "device": args.device,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getCryptoIkev2Policy.
 */
export interface GetCryptoIkev2PolicyArgs {
    device?: string;
    name: string;
}

/**
 * A collection of values returned by getCryptoIkev2Policy.
 */
export interface GetCryptoIkev2PolicyResult {
    readonly device?: string;
    readonly id: string;
    readonly matchAddressLocalIps: string[];
    readonly matchFvrf: string;
    readonly matchFvrfAny: boolean;
    readonly matchInboundOnly: boolean;
    readonly name: string;
    readonly proposals: outputs.iosxe.GetCryptoIkev2PolicyProposal[];
}
export function getCryptoIkev2PolicyOutput(args: GetCryptoIkev2PolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCryptoIkev2PolicyResult> {
    return pulumi.output(args).apply((a: any) => getCryptoIkev2Policy(a, opts))
}

/**
 * A collection of arguments for invoking getCryptoIkev2Policy.
 */
export interface GetCryptoIkev2PolicyOutputArgs {
    device?: pulumi.Input<string>;
    name: pulumi.Input<string>;
}