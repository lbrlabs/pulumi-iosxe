// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export function getAaa(args?: GetAaaArgs, opts?: pulumi.InvokeOptions): Promise<GetAaaResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:iosxe/getAaa:getAaa", {
        "device": args.device,
    }, opts);
}

/**
 * A collection of arguments for invoking getAaa.
 */
export interface GetAaaArgs {
    device?: string;
}

/**
 * A collection of values returned by getAaa.
 */
export interface GetAaaResult {
    readonly device?: string;
    readonly groupServerRadii: outputs.iosxe.GetAaaGroupServerRadius[];
    readonly groupServerTacacspluses: outputs.iosxe.GetAaaGroupServerTacacsplus[];
    readonly id: string;
    readonly newModel: boolean;
    readonly serverRadiusDynamicAuthor: boolean;
    readonly serverRadiusDynamicAuthorClients: outputs.iosxe.GetAaaServerRadiusDynamicAuthorClient[];
    readonly sessionId: string;
}
export function getAaaOutput(args?: GetAaaOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAaaResult> {
    return pulumi.output(args).apply((a: any) => getAaa(a, opts))
}

/**
 * A collection of arguments for invoking getAaa.
 */
export interface GetAaaOutputArgs {
    device?: pulumi.Input<string>;
}