// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source can read the Service Template configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getServiceTemplate({
 *     name: "MY_TEMPLATE",
 * });
 * ```
 */
export function getServiceTemplate(args: GetServiceTemplateArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceTemplateResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:index/getServiceTemplate:getServiceTemplate", {
        "device": args.device,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceTemplate.
 */
export interface GetServiceTemplateArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: string;
    /**
     * Specify a template name (maximum 48 characters)
     */
    name: string;
}

/**
 * A collection of values returned by getServiceTemplate.
 */
export interface GetServiceTemplateResult {
    /**
     * Enter a value between 1 and 1073741823
     */
    readonly absoluteTimer: number;
    /**
     * Access list to be applied
     */
    readonly accessGroups: outputs.GetServiceTemplateAccessGroup[];
    /**
     * Enter a description
     */
    readonly description: string;
    /**
     * A device name from the provider configuration.
     */
    readonly device?: string;
    /**
     * pre-authentication
     */
    readonly dnsAclPreauth: string;
    /**
     * Enter a value between 1 and 65535
     */
    readonly ianctivityTimer: number;
    /**
     * The path of the retrieved object.
     */
    readonly id: string;
    /**
     * ARP probe
     */
    readonly inactivityTimerProbe: boolean;
    /**
     * Interface template to be applied
     */
    readonly interfaceTemplates: outputs.GetServiceTemplateInterfaceTemplate[];
    /**
     * Set the link security policy
     */
    readonly linksecPolicy: string;
    /**
     * mdns policy to be applied
     */
    readonly mdnsServicePolicy: string;
    /**
     * Specify a template name (maximum 48 characters)
     */
    readonly name: string;
    /**
     * Append client Mac Address in redirect URL
     */
    readonly redirectAppendClientMac: string;
    /**
     * Append switch Mac Address in redirect URL
     */
    readonly redirectAppendSwitchMac: string;
    /**
     * Specify a valid URL
     */
    readonly redirectUrl: string;
    /**
     * Specify the access list name
     */
    readonly redirectUrlMatchAcl: string;
    readonly redirectUrlMatchAction: string;
    /**
     * Configure input Qos policy
     */
    readonly servicePolicyQosInput: string;
    /**
     * Configure output Qos policy
     */
    readonly servicePolicyQosOutput: string;
    /**
     * SGT tag
     */
    readonly sgt: number;
    /**
     * tag name
     */
    readonly tags: outputs.GetServiceTemplateTag[];
    /**
     * tunnel profile name
     */
    readonly tunnelCapwapName: string;
    /**
     * Vlan to be applied
     */
    readonly vlan: number;
    /**
     * Vnid to be applied
     */
    readonly vnid: string;
    /**
     * Critical voice vlan
     */
    readonly voiceVlan: boolean;
}
/**
 * This data source can read the Service Template configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as iosxe from "@pulumi/iosxe";
 *
 * const example = iosxe.getServiceTemplate({
 *     name: "MY_TEMPLATE",
 * });
 * ```
 */
export function getServiceTemplateOutput(args: GetServiceTemplateOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServiceTemplateResult> {
    return pulumi.output(args).apply((a: any) => getServiceTemplate(a, opts))
}

/**
 * A collection of arguments for invoking getServiceTemplate.
 */
export interface GetServiceTemplateOutputArgs {
    /**
     * A device name from the provider configuration.
     */
    device?: pulumi.Input<string>;
    /**
     * Specify a template name (maximum 48 characters)
     */
    name: pulumi.Input<string>;
}