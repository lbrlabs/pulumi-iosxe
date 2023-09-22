// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the Crypto IKEv2 Policy configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getCryptoIkev2Policy({
 *     name: "policy1",
 * });
 * ```
 */
export function getCryptoIkev2Policy(args: GetCryptoIkev2PolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetCryptoIkev2PolicyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:index/getCryptoIkev2Policy:getCryptoIkev2Policy", {
        "device": args.device,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getCryptoIkev2Policy.
 */
export interface GetCryptoIkev2PolicyArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: string;
    name: string;
}

/**
 * A collection of values returned by getCryptoIkev2Policy.
 */
export interface GetCryptoIkev2PolicyResult {
    /**
     * A device name from the provider configuration.
     */
    readonly device?: string;
    /**
     * The path of the retrieved object.
     */
    readonly id: string;
    /**
     * Local address
     */
    readonly matchAddressLocalIps: string[];
    readonly matchFvrf: string;
    /**
     * Any fvrf
     */
    readonly matchFvrfAny: boolean;
    /**
     * inbound only for controller
     */
    readonly matchInboundOnly: boolean;
    readonly name: string;
    /**
     * Specify Proposal
     */
    readonly proposals: outputs.GetCryptoIkev2PolicyProposal[];
}
/**
 * This data source can read the Crypto IKEv2 Policy configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getCryptoIkev2Policy({
 *     name: "policy1",
 * });
 * ```
 */
export function getCryptoIkev2PolicyOutput(args: GetCryptoIkev2PolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCryptoIkev2PolicyResult> {
    return pulumi.output(args).apply((a: any) => getCryptoIkev2Policy(a, opts))
}

/**
 * A collection of arguments for invoking getCryptoIkev2Policy.
 */
export interface GetCryptoIkev2PolicyOutputArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    name: pulumi.Input<string>;
}