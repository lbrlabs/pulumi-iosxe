// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the PIM configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getPim({});
 * ```
 */
export function getPim(args?: GetPimArgs, opts?: pulumi.InvokeOptions): Promise<GetPimResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:index/getPim:getPim", {
        "device": args.device,
    }, opts);
}

/**
 * A collection of arguments for invoking getPim.
 */
export interface GetPimArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: string;
}

/**
 * A collection of values returned by getPim.
 */
export interface GetPimResult {
    /**
     * Configure AutoRP global operations
     */
    readonly autorp: boolean;
    /**
     * Allow AutoRP packets across sparse mode interface
     */
    readonly autorpListener: boolean;
    /**
     * BSR RP candidate filter
     */
    readonly bsrCandidateAcceptRpCandidate: string;
    /**
     * Loopback interface
     */
    readonly bsrCandidateLoopback: number;
    /**
     * Hash Mask length for RP selection
     */
    readonly bsrCandidateMask: number;
    /**
     * Priority value for candidate bootstrap router
     */
    readonly bsrCandidatePriority: number;
    /**
     * A device name from the provider configuration.
     */
    readonly device?: string;
    /**
     * The path of the retrieved object.
     */
    readonly id: string;
    /**
     * IP address of Rendezvous-point for group
     */
    readonly rpAddress: string;
    /**
     * Group range treated in bidirectional shared-tree mode
     */
    readonly rpAddressBidir: boolean;
    /**
     * Overrides dynamically learnt RP mappings
     */
    readonly rpAddressOverride: boolean;
    /**
     * PIM RP-address (Rendezvous Point)
     */
    readonly rpAddresses: outputs.GetPimRpAddress[];
    /**
     * To be a PIM version 2 RP candidate
     */
    readonly rpCandidates: outputs.GetPimRpCandidate[];
    /**
     * Use 232/8 group range for SSM
     */
    readonly ssmDefault: boolean;
    /**
     * ACL for group range to be used for SSM
     */
    readonly ssmRange: string;
}
/**
 * This data source can read the PIM configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getPim({});
 * ```
 */
export function getPimOutput(args?: GetPimOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPimResult> {
    return pulumi.output(args).apply((a: any) => getPim(a, opts))
}

/**
 * A collection of arguments for invoking getPim.
 */
export interface GetPimOutputArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
}
