// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export function getLoggingIpv6HostVrfTransport(args: GetLoggingIpv6HostVrfTransportArgs, opts?: pulumi.InvokeOptions): Promise<GetLoggingIpv6HostVrfTransportResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:iosxe/getLoggingIpv6HostVrfTransport:getLoggingIpv6HostVrfTransport", {
        "device": args.device,
        "ipv6Host": args.ipv6Host,
        "vrf": args.vrf,
    }, opts);
}

/**
 * A collection of arguments for invoking getLoggingIpv6HostVrfTransport.
 */
export interface GetLoggingIpv6HostVrfTransportArgs {
    device?: string;
    ipv6Host: string;
    vrf: string;
}

/**
 * A collection of values returned by getLoggingIpv6HostVrfTransport.
 */
export interface GetLoggingIpv6HostVrfTransportResult {
    readonly device?: string;
    readonly id: string;
    readonly ipv6Host: string;
    readonly transportTcpPorts: outputs.iosxe.GetLoggingIpv6HostVrfTransportTransportTcpPort[];
    readonly transportTlsPorts: outputs.iosxe.GetLoggingIpv6HostVrfTransportTransportTlsPort[];
    readonly transportUdpPorts: outputs.iosxe.GetLoggingIpv6HostVrfTransportTransportUdpPort[];
    readonly vrf: string;
}
export function getLoggingIpv6HostVrfTransportOutput(args: GetLoggingIpv6HostVrfTransportOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLoggingIpv6HostVrfTransportResult> {
    return pulumi.output(args).apply((a: any) => getLoggingIpv6HostVrfTransport(a, opts))
}

/**
 * A collection of arguments for invoking getLoggingIpv6HostVrfTransport.
 */
export interface GetLoggingIpv6HostVrfTransportOutputArgs {
    device?: pulumi.Input<string>;
    ipv6Host: pulumi.Input<string>;
    vrf: pulumi.Input<string>;
}
