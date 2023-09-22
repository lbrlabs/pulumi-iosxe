// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This data source can read the Crypto IPSec Profile configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getCryptoIpsecProfile({
 *     name: "vpn200",
 * });
 * ```
 */
export function getCryptoIpsecProfile(args: GetCryptoIpsecProfileArgs, opts?: pulumi.InvokeOptions): Promise<GetCryptoIpsecProfileResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:index/getCryptoIpsecProfile:getCryptoIpsecProfile", {
        "device": args.device,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getCryptoIpsecProfile.
 */
export interface GetCryptoIpsecProfileArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: string;
    name: string;
}

/**
 * A collection of values returned by getCryptoIpsecProfile.
 */
export interface GetCryptoIpsecProfileResult {
    /**
     * A device name from the provider configuration.
     */
    readonly device?: string;
    /**
     * The path of the retrieved object.
     */
    readonly id: string;
    readonly name: string;
    /**
     * Specify ikev2 Profile
     */
    readonly setIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile: string;
    /**
     * Specify isakmp Profile
     */
    readonly setIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile: string;
    /**
     * Specify list of transform sets in priority order
     */
    readonly setTransformSets: string[];
}
/**
 * This data source can read the Crypto IPSec Profile configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getCryptoIpsecProfile({
 *     name: "vpn200",
 * });
 * ```
 */
export function getCryptoIpsecProfileOutput(args: GetCryptoIpsecProfileOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCryptoIpsecProfileResult> {
    return pulumi.output(args).apply((a: any) => getCryptoIpsecProfile(a, opts))
}

/**
 * A collection of arguments for invoking getCryptoIpsecProfile.
 */
export interface GetCryptoIpsecProfileOutputArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    name: pulumi.Input<string>;
}