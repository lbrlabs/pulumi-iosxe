// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the PIM VRF configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getPimVrf({
 *     vrf: "VRF1",
 * });
 * ```
 */
export function getPimVrf(args: GetPimVrfArgs, opts?: pulumi.InvokeOptions): Promise<GetPimVrfResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:index/getPimVrf:getPimVrf", {
        "device": args.device,
        "vrf": args.vrf,
    }, opts);
}

/**
 * A collection of arguments for invoking getPimVrf.
 */
export interface GetPimVrfArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: string;
    vrf: string;
}

/**
 * A collection of values returned by getPimVrf.
 */
export interface GetPimVrfResult {
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
     * Cache outgoing interface RPF info
     */
    readonly cacheRpfOif: boolean;
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
    readonly rpAddresses: outputs.GetPimVrfRpAddress[];
    /**
     * To be a PIM version 2 RP candidate
     */
    readonly rpCandidates: outputs.GetPimVrfRpCandidate[];
    /**
     * Use 232/8 group range for SSM
     */
    readonly ssmDefault: boolean;
    /**
     * ACL for group range to be used for SSM
     */
    readonly ssmRange: string;
    readonly vrf: string;
}
/**
 * This data source can read the PIM VRF configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getPimVrf({
 *     vrf: "VRF1",
 * });
 * ```
 */
export function getPimVrfOutput(args: GetPimVrfOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPimVrfResult> {
    return pulumi.output(args).apply((a: any) => getPimVrf(a, opts))
}

/**
 * A collection of arguments for invoking getPimVrf.
 */
export interface GetPimVrfOutputArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    vrf: pulumi.Input<string>;
}
