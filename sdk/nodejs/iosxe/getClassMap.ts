// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export function getClassMap(args: GetClassMapArgs, opts?: pulumi.InvokeOptions): Promise<GetClassMapResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:iosxe/getClassMap:getClassMap", {
        "device": args.device,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getClassMap.
 */
export interface GetClassMapArgs {
    device?: string;
    name: string;
}

/**
 * A collection of values returned by getClassMap.
 */
export interface GetClassMapResult {
    readonly description: string;
    readonly device?: string;
    readonly id: string;
    readonly matchActivatedServiceTemplates: outputs.iosxe.GetClassMapMatchActivatedServiceTemplate[];
    readonly matchAuthorizationStatusAuthorized: boolean;
    readonly matchAuthorizationStatusUnauthorized: boolean;
    readonly matchAuthorizingMethodPriorityGreaterThans: number[];
    readonly matchMethodDot1x: boolean;
    readonly matchMethodMab: boolean;
    readonly matchResultTypeAaaTimeout: boolean;
    readonly matchResultTypeMethodDot1xAgentNotFound: boolean;
    readonly matchResultTypeMethodDot1xAuthoritative: boolean;
    readonly matchResultTypeMethodDot1xMethodTimeout: boolean;
    readonly matchResultTypeMethodMabAuthoritative: boolean;
    readonly name: string;
    readonly prematch: string;
    readonly subscriber: boolean;
    readonly type: string;
}
export function getClassMapOutput(args: GetClassMapOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetClassMapResult> {
    return pulumi.output(args).apply((a: any) => getClassMap(a, opts))
}

/**
 * A collection of arguments for invoking getClassMap.
 */
export interface GetClassMapOutputArgs {
    device?: pulumi.Input<string>;
    name: pulumi.Input<string>;
}