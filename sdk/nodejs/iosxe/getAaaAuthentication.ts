// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export function getAaaAuthentication(args?: GetAaaAuthenticationArgs, opts?: pulumi.InvokeOptions): Promise<GetAaaAuthenticationResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:iosxe/getAaaAuthentication:getAaaAuthentication", {
        "device": args.device,
    }, opts);
}

/**
 * A collection of arguments for invoking getAaaAuthentication.
 */
export interface GetAaaAuthenticationArgs {
    device?: string;
}

/**
 * A collection of values returned by getAaaAuthentication.
 */
export interface GetAaaAuthenticationResult {
    readonly device?: string;
    readonly dot1xDefaultA1Group: string;
    readonly dot1xDefaultA1Local: boolean;
    readonly dot1xDefaultA2Group: string;
    readonly dot1xDefaultA2Local: boolean;
    readonly dot1xDefaultA3Group: string;
    readonly dot1xDefaultA3Local: boolean;
    readonly dot1xDefaultA4Group: string;
    readonly dot1xDefaultA4Local: boolean;
    readonly id: string;
    readonly logins: outputs.iosxe.GetAaaAuthenticationLogin[];
}
export function getAaaAuthenticationOutput(args?: GetAaaAuthenticationOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAaaAuthenticationResult> {
    return pulumi.output(args).apply((a: any) => getAaaAuthentication(a, opts))
}

/**
 * A collection of arguments for invoking getAaaAuthentication.
 */
export interface GetAaaAuthenticationOutputArgs {
    device?: pulumi.Input<string>;
}