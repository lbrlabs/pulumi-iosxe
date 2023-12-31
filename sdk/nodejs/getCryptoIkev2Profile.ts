// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the Crypto IKEv2 Profile configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getCryptoIkev2Profile({
 *     name: "profile1",
 * });
 * ```
 */
export function getCryptoIkev2Profile(args: GetCryptoIkev2ProfileArgs, opts?: pulumi.InvokeOptions): Promise<GetCryptoIkev2ProfileResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:index/getCryptoIkev2Profile:getCryptoIkev2Profile", {
        "device": args.device,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getCryptoIkev2Profile.
 */
export interface GetCryptoIkev2ProfileArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: string;
    name: string;
}

/**
 * A collection of values returned by getCryptoIkev2Profile.
 */
export interface GetCryptoIkev2ProfileResult {
    /**
     * Pre-Shared Key
     */
    readonly authenticationLocalPreShare: boolean;
    /**
     * Pre-Shared Key
     */
    readonly authenticationRemotePreShare: boolean;
    /**
     * enable config-exchange request
     */
    readonly configExchangeRequest: boolean;
    /**
     * Specify a description of this profile
     */
    readonly description: string;
    /**
     * A device name from the provider configuration.
     */
    readonly device?: string;
    readonly dpdInterval: number;
    readonly dpdQuery: string;
    readonly dpdRetry: number;
    /**
     * The path of the retrieved object.
     */
    readonly id: string;
    /**
     * address
     */
    readonly identityLocalAddress: string;
    /**
     * key-id opaque string - proprietary types of identification key-id string
     */
    readonly identityLocalKeyId: string;
    /**
     * Keyring name
     */
    readonly keyringLocal: string;
    readonly matchAddressLocalIp: string;
    readonly matchFvrf: string;
    /**
     * Any fvrf
     */
    readonly matchFvrfAny: boolean;
    readonly matchIdentityRemoteIpv4Addresses: outputs.GetCryptoIkev2ProfileMatchIdentityRemoteIpv4Address[];
    readonly matchIdentityRemoteIpv6Prefixes: string[];
    /**
     * key-id opaque string
     */
    readonly matchIdentityRemoteKeys: string[];
    /**
     * Match the profile for incoming connections only
     */
    readonly matchInboundOnly: boolean;
    readonly name: string;
}
/**
 * This data source can read the Crypto IKEv2 Profile configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getCryptoIkev2Profile({
 *     name: "profile1",
 * });
 * ```
 */
export function getCryptoIkev2ProfileOutput(args: GetCryptoIkev2ProfileOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCryptoIkev2ProfileResult> {
    return pulumi.output(args).apply((a: any) => getCryptoIkev2Profile(a, opts))
}

/**
 * A collection of arguments for invoking getCryptoIkev2Profile.
 */
export interface GetCryptoIkev2ProfileOutputArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    name: pulumi.Input<string>;
}
