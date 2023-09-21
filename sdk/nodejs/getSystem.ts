// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the System configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getSystem({});
 * ```
 */
export function getSystem(args?: GetSystemArgs, opts?: pulumi.InvokeOptions): Promise<GetSystemResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:index/getSystem:getSystem", {
        "device": args.device,
    }, opts);
}

/**
 * A collection of arguments for invoking getSystem.
 */
export interface GetSystemArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: string;
}

/**
 * A collection of values returned by getSystem.
 */
export interface GetSystemResult {
    /**
     * A device name from the provider configuration.
     */
    readonly device?: string;
    /**
     * Set system's network name
     */
    readonly hostname: string;
    /**
     * The path of the retrieved object.
     */
    readonly id: string;
    /**
     * Enable IP Domain Name System hostname translation
     */
    readonly ipDomainLookup: boolean;
    /**
     * Define the default domain name
     */
    readonly ipDomainName: string;
    /**
     * Enable IP multicast forwarding
     */
    readonly ipMulticastRouting: boolean;
    /**
     * Distributed multicast switching
     */
    readonly ipMulticastRoutingDistributed: boolean;
    /**
     * Enable or disable IP routing
     */
    readonly ipRouting: boolean;
    /**
     * Process packets with source routing header options
     */
    readonly ipSourceRoute: boolean;
    /**
     * Enable unicast routing
     */
    readonly ipv6UnicastRouting: boolean;
    /**
     * Set delay between successive fail login
     */
    readonly loginDelay: number;
    /**
     * Set options for failed login attempt
     */
    readonly loginOnFailure: boolean;
    /**
     * Generate syslogs on failure logins
     */
    readonly loginOnFailureLog: boolean;
    /**
     * Set options for successful login attempt
     */
    readonly loginOnSuccess: boolean;
    /**
     * Generate syslogs on successful logins
     */
    readonly loginOnSuccessLog: boolean;
    readonly mtu: number;
    /**
     * Enable IP multicast forwarding, some XE devices use this option instead of `multicastRouting`.
     */
    readonly multicastRoutingSwitch: boolean;
    /**
     * Select VPN Routing/Forwarding instance
     */
    readonly multicastRoutingVrfs: outputs.GetSystemMulticastRoutingVrf[];
}
/**
 * This data source can read the System configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getSystem({});
 * ```
 */
export function getSystemOutput(args?: GetSystemOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSystemResult> {
    return pulumi.output(args).apply((a: any) => getSystem(a, opts))
}

/**
 * A collection of arguments for invoking getSystem.
 */
export interface GetSystemOutputArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
}
