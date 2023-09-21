// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export function getSnmpServer(args?: GetSnmpServerArgs, opts?: pulumi.InvokeOptions): Promise<GetSnmpServerResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("iosxe:iosxe/getSnmpServer:getSnmpServer", {
        "device": args.device,
    }, opts);
}

/**
 * A collection of arguments for invoking getSnmpServer.
 */
export interface GetSnmpServerArgs {
    device?: string;
}

/**
 * A collection of values returned by getSnmpServer.
 */
export interface GetSnmpServerResult {
    readonly chassisId: string;
    readonly contact: string;
    readonly contexts: outputs.iosxe.GetSnmpServerContext[];
    readonly device?: string;
    readonly enableInforms: boolean;
    readonly enableLoggingGetop: boolean;
    readonly enableLoggingSetop: boolean;
    readonly enableTraps: boolean;
    readonly enableTrapsAuthFrameworkSecViolation: boolean;
    readonly enableTrapsBfd: boolean;
    readonly enableTrapsBgpCbgp2: boolean;
    readonly enableTrapsBridgeNewroot: boolean;
    readonly enableTrapsBridgeTopologychange: boolean;
    readonly enableTrapsBulkstatCollection: boolean;
    readonly enableTrapsBulkstatTransfer: boolean;
    readonly enableTrapsCallHomeMessageSendFail: boolean;
    readonly enableTrapsCallHomeServerFail: boolean;
    readonly enableTrapsCefInconsistency: boolean;
    readonly enableTrapsCefPeerFibStateChange: boolean;
    readonly enableTrapsCefPeerStateChange: boolean;
    readonly enableTrapsCefResourceFailure: boolean;
    readonly enableTrapsConfig: boolean;
    readonly enableTrapsConfigCopy: boolean;
    readonly enableTrapsConfigCtid: boolean;
    readonly enableTrapsCpuThreshold: boolean;
    readonly enableTrapsDhcp: boolean;
    readonly enableTrapsEigrp: boolean;
    readonly enableTrapsEnergywise: boolean;
    readonly enableTrapsEntity: boolean;
    readonly enableTrapsEntityDiagBootUpFail: boolean;
    readonly enableTrapsEntityDiagHmTestRecover: boolean;
    readonly enableTrapsEntityDiagHmThreshReached: boolean;
    readonly enableTrapsEntityDiagScheduledTestFail: boolean;
    readonly enableTrapsEntityPerfThroughputNotif: boolean;
    readonly enableTrapsEnvmon: boolean;
    readonly enableTrapsErrdisable: boolean;
    readonly enableTrapsEventManager: boolean;
    readonly enableTrapsFastRerouteProtected: boolean;
    readonly enableTrapsFlashInsertion: boolean;
    readonly enableTrapsFlashLowspace: boolean;
    readonly enableTrapsFlashRemoval: boolean;
    readonly enableTrapsFlowmon: boolean;
    readonly enableTrapsFruCtrl: boolean;
    readonly enableTrapsHsrp: boolean;
    readonly enableTrapsIkePolicyAdd: boolean;
    readonly enableTrapsIkePolicyDelete: boolean;
    readonly enableTrapsIkeTunnelStart: boolean;
    readonly enableTrapsIkeTunnelStop: boolean;
    readonly enableTrapsIpmulticast: boolean;
    readonly enableTrapsIpsecCryptomapAdd: boolean;
    readonly enableTrapsIpsecCryptomapAttach: boolean;
    readonly enableTrapsIpsecCryptomapDelete: boolean;
    readonly enableTrapsIpsecCryptomapDetach: boolean;
    readonly enableTrapsIpsecTooManySas: boolean;
    readonly enableTrapsIpsecTunnelStart: boolean;
    readonly enableTrapsIpsecTunnelStop: boolean;
    readonly enableTrapsIpsla: boolean;
    readonly enableTrapsIsis: boolean;
    readonly enableTrapsLicense: boolean;
    readonly enableTrapsLocalAuth: boolean;
    readonly enableTrapsMacNotificationChange: boolean;
    readonly enableTrapsMacNotificationMove: boolean;
    readonly enableTrapsMacNotificationThreshold: boolean;
    readonly enableTrapsMemoryBufferpeak: boolean;
    readonly enableTrapsMplsLdp: boolean;
    readonly enableTrapsMplsRfcLdp: boolean;
    readonly enableTrapsMplsTrafficEng: boolean;
    readonly enableTrapsMplsVpn: boolean;
    readonly enableTrapsMsdp: boolean;
    readonly enableTrapsNhrpNhc: boolean;
    readonly enableTrapsNhrpNhp: boolean;
    readonly enableTrapsNhrpNhs: boolean;
    readonly enableTrapsNhrpQuotaExceeded: boolean;
    readonly enableTrapsOspfConfigErrors: boolean;
    readonly enableTrapsOspfConfigLsa: boolean;
    readonly enableTrapsOspfConfigRetransmit: boolean;
    readonly enableTrapsOspfConfigStateChange: boolean;
    readonly enableTrapsOspfErrorsEnable: boolean;
    readonly enableTrapsOspfLsaEnable: boolean;
    readonly enableTrapsOspfNssaTransChange: boolean;
    readonly enableTrapsOspfRetransmitEnable: boolean;
    readonly enableTrapsOspfShamlinkInterface: boolean;
    readonly enableTrapsOspfShamlinkNeighbor: boolean;
    readonly enableTrapsOspfv3ConfigErrors: boolean;
    readonly enableTrapsOspfv3ConfigStateChange: boolean;
    readonly enableTrapsPimInvalidPimMessage: boolean;
    readonly enableTrapsPimNeighborChange: boolean;
    readonly enableTrapsPimRpMappingChange: boolean;
    readonly enableTrapsPortSecurity: boolean;
    readonly enableTrapsPowerEthernetGroup: string;
    readonly enableTrapsPowerEthernetPolice: boolean;
    readonly enableTrapsPwVc: boolean;
    readonly enableTrapsRep: boolean;
    readonly enableTrapsRf: boolean;
    readonly enableTrapsSmartLicense: boolean;
    readonly enableTrapsSnmpAuthentication: boolean;
    readonly enableTrapsSnmpColdstart: boolean;
    readonly enableTrapsSnmpLinkdown: boolean;
    readonly enableTrapsSnmpLinkup: boolean;
    readonly enableTrapsSnmpWarmstart: boolean;
    readonly enableTrapsStackwise: boolean;
    readonly enableTrapsStpxInconsistency: boolean;
    readonly enableTrapsStpxLoopInconsistency: boolean;
    readonly enableTrapsStpxRootInconsistency: boolean;
    readonly enableTrapsSyslog: boolean;
    readonly enableTrapsTransceiverAll: boolean;
    readonly enableTrapsTty: boolean;
    readonly enableTrapsUdldLinkFailRpt: boolean;
    readonly enableTrapsUdldStatusChange: boolean;
    readonly enableTrapsVlanMembership: boolean;
    readonly enableTrapsVlancreate: boolean;
    readonly enableTrapsVlandelete: boolean;
    readonly enableTrapsVrfmibVnetTrunkDown: boolean;
    readonly enableTrapsVrfmibVnetTrunkUp: boolean;
    readonly enableTrapsVrfmibVrfDown: boolean;
    readonly enableTrapsVrfmibVrfUp: boolean;
    readonly enableTrapsVtp: boolean;
    readonly hosts: outputs.iosxe.GetSnmpServerHost[];
    readonly id: string;
    readonly ifindexPersist: boolean;
    readonly location: string;
    readonly packetsize: number;
    readonly queueLength: number;
    readonly snmpCommunities: outputs.iosxe.GetSnmpServerSnmpCommunity[];
    readonly sourceInterfaceInformsFortyGigabitEthernet: string;
    readonly sourceInterfaceInformsGigabitEthernet: string;
    readonly sourceInterfaceInformsHundredGigE: string;
    readonly sourceInterfaceInformsLoopback: number;
    readonly sourceInterfaceInformsPortChannel: number;
    readonly sourceInterfaceInformsPortChannelSubinterface: string;
    readonly sourceInterfaceInformsTenGigabitEthernet: string;
    readonly sourceInterfaceInformsVlan: number;
    readonly sourceInterfaceTrapsFortyGigabitEthernet: string;
    readonly sourceInterfaceTrapsGigabitEthernet: string;
    readonly sourceInterfaceTrapsHundredGigE: string;
    readonly sourceInterfaceTrapsLoopback: number;
    readonly sourceInterfaceTrapsPortChannel: number;
    readonly sourceInterfaceTrapsPortChannelSubinterface: string;
    readonly sourceInterfaceTrapsTenGigabitEthernet: string;
    readonly sourceInterfaceTrapsVlan: number;
    readonly systemShutdown: boolean;
    readonly trapSourceFortyGigabitEthernet: string;
    readonly trapSourceGigabitEthernet: string;
    readonly trapSourceHundredGigE: string;
    readonly trapSourceLoopback: number;
    readonly trapSourcePortChannel: number;
    readonly trapSourcePortChannelSubinterface: string;
    readonly trapSourceTenGigabitEthernet: string;
    readonly trapSourceVlan: number;
    readonly views: outputs.iosxe.GetSnmpServerView[];
}
export function getSnmpServerOutput(args?: GetSnmpServerOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSnmpServerResult> {
    return pulumi.output(args).apply((a: any) => getSnmpServer(a, opts))
}

/**
 * A collection of arguments for invoking getSnmpServer.
 */
export interface GetSnmpServerOutputArgs {
    device?: pulumi.Input<string>;
}