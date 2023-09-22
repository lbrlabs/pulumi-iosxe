// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the Dot1x configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getDot1x({});
 * ```
 */
export function getDot1x(args?: GetDot1xArgs, opts?: pulumi.InvokeOptions): Promise<GetDot1xResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:index/getDot1x:getDot1x", {
        "device": args.device,
    }, opts);
}

/**
 * A collection of arguments for invoking getDot1x.
 */
export interface GetDot1xArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: string;
}

/**
 * A collection of values returned by getDot1x.
 */
export interface GetDot1xResult {
    /**
     * Send EAPOL-Success on successful auth-fail Authorization
     */
    readonly authFailEapol: boolean;
    /**
     * Configure 802.1X credentials profiles
     */
    readonly credentials: outputs.GetDot1xCredential[];
    /**
     * Block all EAPoL transaction on Critical Authentication
     */
    readonly criticalEapolConfigBlock: boolean;
    /**
     * Set 802.1x Critical Authentication Recovery Delay period
     */
    readonly criticalRecoveryDelay: number;
    /**
     * A device name from the provider configuration.
     */
    readonly device?: string;
    /**
     * The path of the retrieved object.
     */
    readonly id: string;
    /**
     * Show verbose messages in system logs
     */
    readonly loggingVerbose: boolean;
    /**
     * Controlled access is only applied during authentication
     */
    readonly supplicantControlledTransient: boolean;
    /**
     * Force 802.1X supplicant to send multicast packets
     */
    readonly supplicantForceMulticast: boolean;
    /**
     * Enable or Disable SysAuthControl
     */
    readonly systemAuthControl: boolean;
    /**
     * Timeout for device EAPOL capabilities test in seconds
     */
    readonly testTimeout: number;
}
/**
 * This data source can read the Dot1x configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getDot1x({});
 * ```
 */
export function getDot1xOutput(args?: GetDot1xOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDot1xResult> {
    return pulumi.output(args).apply((a: any) => getDot1x(a, opts))
}

/**
 * A collection of arguments for invoking getDot1x.
 */
export interface GetDot1xOutputArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
}