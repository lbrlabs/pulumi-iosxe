// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the Logging configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getLogging({});
 * ```
 */
export function getLogging(args?: GetLoggingArgs, opts?: pulumi.InvokeOptions): Promise<GetLoggingResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:index/getLogging:getLogging", {
        "device": args.device,
    }, opts);
}

/**
 * A collection of arguments for invoking getLogging.
 */
export interface GetLoggingArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: string;
}

/**
 * A collection of values returned by getLogging.
 */
export interface GetLoggingResult {
    /**
     * Logging severity level
     */
    readonly bufferedSeverity: string;
    /**
     * Logging buffer size
     */
    readonly bufferedSize: number;
    readonly consoleSeverity: string;
    /**
     * A device name from the provider configuration.
     */
    readonly device?: string;
    /**
     * Facility parameter for syslog messages
     */
    readonly facility: string;
    readonly fileMaxSize: number;
    readonly fileMinSize: number;
    readonly fileName: string;
    readonly fileSeverity: string;
    readonly historySeverity: string;
    /**
     * Set history table size
     */
    readonly historySize: number;
    /**
     * The path of the retrieved object.
     */
    readonly id: string;
    readonly ipv4Hosts: outputs.GetLoggingIpv4Host[];
    readonly ipv4VrfHosts: outputs.GetLoggingIpv4VrfHost[];
    readonly ipv6Hosts: outputs.GetLoggingIpv6Host[];
    readonly ipv6VrfHosts: outputs.GetLoggingIpv6VrfHost[];
    readonly monitorSeverity: string;
    /**
     * Define a unique text string as ID
     */
    readonly originIdName: string;
    /**
     * Use origin hostname/ip/ipv6 as ID
     */
    readonly originIdType: string;
    readonly sourceInterface: string;
    /**
     * Specify interface and vrf for source address in logging transactions
     */
    readonly sourceInterfacesVrves: outputs.GetLoggingSourceInterfacesVrf[];
    /**
     * Set trap server logging level
     */
    readonly trap: boolean;
    readonly trapSeverity: string;
}
/**
 * This data source can read the Logging configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getLogging({});
 * ```
 */
export function getLoggingOutput(args?: GetLoggingOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLoggingResult> {
    return pulumi.output(args).apply((a: any) => getLogging(a, opts))
}

/**
 * A collection of arguments for invoking getLogging.
 */
export interface GetLoggingOutputArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
}
