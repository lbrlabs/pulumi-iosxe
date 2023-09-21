// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface ProviderDevice {
    name: pulumi.Input<string>;
    url: pulumi.Input<string>;
}
export namespace config {
}

export namespace iosxe {
    export interface AaaAccountingExec {
        name: pulumi.Input<string>;
        startStopGroup1?: pulumi.Input<string>;
    }

    export interface AaaAccountingNetwork {
        id: pulumi.Input<string>;
        startStopGroup1?: pulumi.Input<string>;
        startStopGroup2?: pulumi.Input<string>;
    }

    export interface AaaAuthenticationLogin {
        a1Enable?: pulumi.Input<boolean>;
        a1Group?: pulumi.Input<string>;
        a1Line?: pulumi.Input<boolean>;
        a1Local?: pulumi.Input<boolean>;
        a1None?: pulumi.Input<boolean>;
        a2Enable?: pulumi.Input<boolean>;
        a2Group?: pulumi.Input<string>;
        a2Line?: pulumi.Input<boolean>;
        a2Local?: pulumi.Input<boolean>;
        a2None?: pulumi.Input<boolean>;
        a3Enable?: pulumi.Input<boolean>;
        a3Group?: pulumi.Input<string>;
        a3Line?: pulumi.Input<boolean>;
        a3Local?: pulumi.Input<boolean>;
        a3None?: pulumi.Input<boolean>;
        a4Enable?: pulumi.Input<boolean>;
        a4Group?: pulumi.Input<string>;
        a4Line?: pulumi.Input<boolean>;
        a4Local?: pulumi.Input<boolean>;
        a4None?: pulumi.Input<boolean>;
        name: pulumi.Input<string>;
    }

    export interface AaaAuthorizationExec {
        a1Group?: pulumi.Input<string>;
        a1IfAuthenticated?: pulumi.Input<boolean>;
        a1Local?: pulumi.Input<boolean>;
        a2Local?: pulumi.Input<boolean>;
        name: pulumi.Input<string>;
    }

    export interface AaaAuthorizationNetwork {
        a1Group?: pulumi.Input<string>;
        id: pulumi.Input<string>;
    }

    export interface AaaGroupServerRadius {
        ipRadiusSourceInterfaceLoopback?: pulumi.Input<number>;
        name: pulumi.Input<string>;
        serverNames?: pulumi.Input<pulumi.Input<inputs.iosxe.AaaGroupServerRadiusServerName>[]>;
    }

    export interface AaaGroupServerRadiusServerName {
        name: pulumi.Input<string>;
    }

    export interface AaaGroupServerTacacsplus {
        name: pulumi.Input<string>;
        serverNames?: pulumi.Input<pulumi.Input<inputs.iosxe.AaaGroupServerTacacsplusServerName>[]>;
    }

    export interface AaaGroupServerTacacsplusServerName {
        name: pulumi.Input<string>;
    }

    export interface AaaServerRadiusDynamicAuthorClient {
        ip: pulumi.Input<string>;
        serverKey?: pulumi.Input<string>;
        serverKeyType?: pulumi.Input<string>;
    }

    export interface AccessListExtendedEntry {
        aceRuleAction?: pulumi.Input<string>;
        aceRuleProtocol?: pulumi.Input<string>;
        ack?: pulumi.Input<boolean>;
        destinationAny?: pulumi.Input<boolean>;
        destinationHost?: pulumi.Input<string>;
        destinationObjectGroup?: pulumi.Input<string>;
        destinationPortEqual?: pulumi.Input<string>;
        destinationPortGreaterThan?: pulumi.Input<string>;
        destinationPortLesserThan?: pulumi.Input<string>;
        destinationPortRangeFrom?: pulumi.Input<string>;
        destinationPortRangeTo?: pulumi.Input<string>;
        destinationPrefix?: pulumi.Input<string>;
        destinationPrefixMask?: pulumi.Input<string>;
        dscp?: pulumi.Input<string>;
        established?: pulumi.Input<boolean>;
        fin?: pulumi.Input<boolean>;
        fragments?: pulumi.Input<boolean>;
        log?: pulumi.Input<boolean>;
        logInput?: pulumi.Input<boolean>;
        precedence?: pulumi.Input<string>;
        psh?: pulumi.Input<boolean>;
        remark?: pulumi.Input<string>;
        rst?: pulumi.Input<boolean>;
        sequence: pulumi.Input<number>;
        serviceObjectGroup?: pulumi.Input<string>;
        sourceAny?: pulumi.Input<boolean>;
        sourceHost?: pulumi.Input<string>;
        sourceObjectGroup?: pulumi.Input<string>;
        sourcePortEqual?: pulumi.Input<string>;
        sourcePortGreaterThan?: pulumi.Input<string>;
        sourcePortLesserThan?: pulumi.Input<string>;
        sourcePortRangeFrom?: pulumi.Input<string>;
        sourcePortRangeTo?: pulumi.Input<string>;
        sourcePrefix?: pulumi.Input<string>;
        sourcePrefixMask?: pulumi.Input<string>;
        syn?: pulumi.Input<boolean>;
        tos?: pulumi.Input<string>;
        urg?: pulumi.Input<boolean>;
    }

    export interface AccessListStandardEntry {
        denyAny?: pulumi.Input<boolean>;
        denyHost?: pulumi.Input<string>;
        denyLog?: pulumi.Input<boolean>;
        denyPrefix?: pulumi.Input<string>;
        denyPrefixMask?: pulumi.Input<string>;
        permitAny?: pulumi.Input<boolean>;
        permitHost?: pulumi.Input<string>;
        permitLog?: pulumi.Input<boolean>;
        permitPrefix?: pulumi.Input<string>;
        permitPrefixMask?: pulumi.Input<string>;
        remark?: pulumi.Input<string>;
        sequence: pulumi.Input<number>;
    }

    export interface ArpInspectionFilter {
        name: pulumi.Input<string>;
        vlans?: pulumi.Input<pulumi.Input<inputs.iosxe.ArpInspectionFilterVlan>[]>;
    }

    export interface ArpInspectionFilterVlan {
        static?: pulumi.Input<boolean>;
        vlanRange: pulumi.Input<string>;
    }

    export interface BfdIpv4BothVrf {
        destIp: pulumi.Input<string>;
        dstVrf: pulumi.Input<string>;
        srcIp: pulumi.Input<string>;
        srcVrf: pulumi.Input<string>;
        templateName: pulumi.Input<string>;
    }

    export interface BfdIpv4WithDstVrf {
        destIp: pulumi.Input<string>;
        dstVrf: pulumi.Input<string>;
        srcIp: pulumi.Input<string>;
        templateName: pulumi.Input<string>;
    }

    export interface BfdIpv4WithSrcVrf {
        destIp: pulumi.Input<string>;
        srcIp: pulumi.Input<string>;
        srcVrf: pulumi.Input<string>;
        templateName: pulumi.Input<string>;
    }

    export interface BfdIpv4WithoutVrf {
        destIp: pulumi.Input<string>;
        srcIp: pulumi.Input<string>;
        templateName: pulumi.Input<string>;
    }

    export interface BfdIpv6WithBothVrf {
        destIpv6: pulumi.Input<string>;
        dstVrf: pulumi.Input<string>;
        srcIpv6: pulumi.Input<string>;
        srcVrf: pulumi.Input<string>;
        templateName: pulumi.Input<string>;
    }

    export interface BfdIpv6WithDstVrf {
        destIpv6: pulumi.Input<string>;
        dstVrf: pulumi.Input<string>;
        srcIpv6: pulumi.Input<string>;
        templateName: pulumi.Input<string>;
    }

    export interface BfdIpv6WithSrcVrf {
        destIpv6: pulumi.Input<string>;
        srcIpv6: pulumi.Input<string>;
        srcVrf: pulumi.Input<string>;
        templateName: pulumi.Input<string>;
    }

    export interface BfdIpv6WithoutVrf {
        destIpv6: pulumi.Input<string>;
        srcIpv6: pulumi.Input<string>;
        templateName: pulumi.Input<string>;
    }

    export interface BgpAddressFamilyIpv4Ipv4UnicastNetwork {
        backdoor?: pulumi.Input<boolean>;
        network: pulumi.Input<string>;
        routeMap?: pulumi.Input<string>;
    }

    export interface BgpAddressFamilyIpv4Ipv4UnicastNetworksMask {
        backdoor?: pulumi.Input<boolean>;
        mask: pulumi.Input<string>;
        network: pulumi.Input<string>;
        routeMap?: pulumi.Input<string>;
    }

    export interface BgpAddressFamilyIpv4VrfVrf {
        ipv4UnicastAdvertiseL2vpnEvpn?: pulumi.Input<boolean>;
        ipv4UnicastNetworks?: pulumi.Input<pulumi.Input<inputs.iosxe.BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetwork>[]>;
        ipv4UnicastNetworksMasks?: pulumi.Input<pulumi.Input<inputs.iosxe.BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetworksMask>[]>;
        ipv4UnicastRedistributeConnected?: pulumi.Input<boolean>;
        ipv4UnicastRedistributeStatic?: pulumi.Input<boolean>;
        name: pulumi.Input<string>;
    }

    export interface BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetwork {
        backdoor?: pulumi.Input<boolean>;
        evpn?: pulumi.Input<boolean>;
        network: pulumi.Input<string>;
        routeMap?: pulumi.Input<string>;
    }

    export interface BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetworksMask {
        backdoor?: pulumi.Input<boolean>;
        evpn?: pulumi.Input<boolean>;
        mask: pulumi.Input<string>;
        network: pulumi.Input<string>;
        routeMap?: pulumi.Input<string>;
    }

    export interface BgpAddressFamilyIpv6Ipv6UnicastNetwork {
        backdoor?: pulumi.Input<boolean>;
        network: pulumi.Input<string>;
        routeMap?: pulumi.Input<string>;
    }

    export interface BgpAddressFamilyIpv6VrfVrf {
        ipv6UnicastAdvertiseL2vpnEvpn?: pulumi.Input<boolean>;
        ipv6UnicastNetworks?: pulumi.Input<pulumi.Input<inputs.iosxe.BgpAddressFamilyIpv6VrfVrfIpv6UnicastNetwork>[]>;
        ipv6UnicastRedistributeConnected?: pulumi.Input<boolean>;
        ipv6UnicastRedistributeStatic?: pulumi.Input<boolean>;
        name: pulumi.Input<string>;
    }

    export interface BgpAddressFamilyIpv6VrfVrfIpv6UnicastNetwork {
        backdoor?: pulumi.Input<boolean>;
        evpn?: pulumi.Input<boolean>;
        network: pulumi.Input<string>;
        routeMap?: pulumi.Input<string>;
    }

    export interface BgpIpv4UnicastNeighborRouteMap {
        inOut: pulumi.Input<string>;
        routeMapName: pulumi.Input<string>;
    }

    export interface BgpIpv4UnicastVrfNeighborRouteMap {
        inOut: pulumi.Input<string>;
        routeMapName: pulumi.Input<string>;
    }

    export interface BgpIpv6UnicastNeighborRouteMap {
        inOut: pulumi.Input<string>;
        routeMapName: pulumi.Input<string>;
    }

    export interface CdpTlvList {
        cos?: pulumi.Input<boolean>;
        duplex?: pulumi.Input<boolean>;
        name: pulumi.Input<string>;
        trust?: pulumi.Input<boolean>;
        version?: pulumi.Input<boolean>;
        vtpMgmtDomain?: pulumi.Input<boolean>;
    }

    export interface ClassMapMatchActivatedServiceTemplate {
        serviceName: pulumi.Input<string>;
    }

    export interface CryptoIkev2KeyringPeer {
        description?: pulumi.Input<string>;
        hostname?: pulumi.Input<string>;
        identityAddress?: pulumi.Input<string>;
        identityEmailDomain?: pulumi.Input<string>;
        identityEmailName?: pulumi.Input<string>;
        identityFqdnDomain?: pulumi.Input<string>;
        identityFqdnName?: pulumi.Input<string>;
        identityKeyId?: pulumi.Input<string>;
        ipv4Address?: pulumi.Input<string>;
        ipv4Mask?: pulumi.Input<string>;
        ipv6Prefix?: pulumi.Input<string>;
        name: pulumi.Input<string>;
        preSharedKey?: pulumi.Input<string>;
        preSharedKeyEncryption?: pulumi.Input<string>;
        preSharedKeyLocal?: pulumi.Input<string>;
        preSharedKeyLocalEncryption?: pulumi.Input<string>;
        preSharedKeyRemote?: pulumi.Input<string>;
        preSharedKeyRemoteEncryption?: pulumi.Input<string>;
    }

    export interface CryptoIkev2PolicyProposal {
        proposals: pulumi.Input<string>;
    }

    export interface CryptoIkev2ProfileMatchIdentityRemoteIpv4Address {
        address: pulumi.Input<string>;
        mask?: pulumi.Input<string>;
    }

    export interface DhcpSnoopingVlan {
        vlanId: pulumi.Input<string>;
    }

    export interface Dot1xCredential {
        anonymousId?: pulumi.Input<string>;
        description?: pulumi.Input<string>;
        password?: pulumi.Input<string>;
        passwordType?: pulumi.Input<string>;
        pkiTrustpoint?: pulumi.Input<string>;
        profileName: pulumi.Input<string>;
        username?: pulumi.Input<string>;
    }

    export interface InterfaceEthernetHelperAddress {
        address: pulumi.Input<string>;
        global?: pulumi.Input<boolean>;
        vrf?: pulumi.Input<string>;
    }

    export interface InterfaceEthernetIpv6Address {
        eui64?: pulumi.Input<boolean>;
        prefix: pulumi.Input<string>;
    }

    export interface InterfaceEthernetIpv6LinkLocalAddress {
        address: pulumi.Input<string>;
        linkLocal?: pulumi.Input<boolean>;
    }

    export interface InterfaceEthernetSourceTemplate {
        merge?: pulumi.Input<boolean>;
        templateName: pulumi.Input<string>;
    }

    export interface InterfaceLoopbackIpv6Address {
        eui64?: pulumi.Input<boolean>;
        prefix: pulumi.Input<string>;
    }

    export interface InterfaceLoopbackIpv6LinkLocalAddress {
        address: pulumi.Input<string>;
        linkLocal?: pulumi.Input<boolean>;
    }

    export interface InterfaceNveVni {
        ingressReplication?: pulumi.Input<boolean>;
        ipv4MulticastGroup?: pulumi.Input<string>;
        vniRange: pulumi.Input<string>;
    }

    export interface InterfaceNveVniVrf {
        vniRange: pulumi.Input<string>;
        vrf?: pulumi.Input<string>;
    }

    export interface InterfaceOspfMessageDigestKey {
        id: pulumi.Input<number>;
        md5AuthKey?: pulumi.Input<string>;
        md5AuthType?: pulumi.Input<number>;
    }

    export interface InterfaceOspfProcessId {
        areas?: pulumi.Input<pulumi.Input<inputs.iosxe.InterfaceOspfProcessIdArea>[]>;
        id: pulumi.Input<number>;
    }

    export interface InterfaceOspfProcessIdArea {
        areaId: pulumi.Input<string>;
    }

    export interface InterfacePortChannelHelperAddress {
        address: pulumi.Input<string>;
        global?: pulumi.Input<boolean>;
        vrf?: pulumi.Input<string>;
    }

    export interface InterfacePortChannelIpv6Address {
        eui64?: pulumi.Input<boolean>;
        prefix: pulumi.Input<string>;
    }

    export interface InterfacePortChannelIpv6LinkLocalAddress {
        address: pulumi.Input<string>;
        linkLocal?: pulumi.Input<boolean>;
    }

    export interface InterfacePortChannelSubinterfaceHelperAddress {
        address: pulumi.Input<string>;
        global?: pulumi.Input<boolean>;
        vrf?: pulumi.Input<string>;
    }

    export interface InterfacePortChannelSubinterfaceIpv6Address {
        eui64?: pulumi.Input<boolean>;
        prefix: pulumi.Input<string>;
    }

    export interface InterfacePortChannelSubinterfaceIpv6LinkLocalAddress {
        address: pulumi.Input<string>;
        linkLocal?: pulumi.Input<boolean>;
    }

    export interface InterfaceTunnelHelperAddress {
        address: pulumi.Input<string>;
        global?: pulumi.Input<boolean>;
        vrf?: pulumi.Input<string>;
    }

    export interface InterfaceTunnelIpv6Address {
        eui64?: pulumi.Input<boolean>;
        prefix: pulumi.Input<string>;
    }

    export interface InterfaceTunnelIpv6LinkLocalAddress {
        address: pulumi.Input<string>;
        linkLocal?: pulumi.Input<boolean>;
    }

    export interface InterfaceVlanHelperAddress {
        address: pulumi.Input<string>;
        global?: pulumi.Input<boolean>;
        vrf?: pulumi.Input<string>;
    }

    export interface InterfaceVlanIpv6Address {
        eui64?: pulumi.Input<boolean>;
        prefix: pulumi.Input<string>;
    }

    export interface InterfaceVlanIpv6LinkLocalAddress {
        address: pulumi.Input<string>;
        linkLocal?: pulumi.Input<boolean>;
    }

    export interface LineConsole {
        execTimeoutMinutes?: pulumi.Input<number>;
        execTimeoutSeconds?: pulumi.Input<number>;
        first: pulumi.Input<string>;
        loginAuthentication?: pulumi.Input<string>;
        loginLocal?: pulumi.Input<boolean>;
        password?: pulumi.Input<string>;
        passwordLevel?: pulumi.Input<number>;
        passwordType?: pulumi.Input<string>;
        privilegeLevel?: pulumi.Input<number>;
        stopbits?: pulumi.Input<string>;
    }

    export interface LineVty {
        accessClasses?: pulumi.Input<pulumi.Input<inputs.iosxe.LineVtyAccessClass>[]>;
        escapeCharacter?: pulumi.Input<string>;
        execTimeoutMinutes?: pulumi.Input<number>;
        execTimeoutSeconds?: pulumi.Input<number>;
        first: pulumi.Input<number>;
        last?: pulumi.Input<number>;
        loginAuthentication?: pulumi.Input<string>;
        password?: pulumi.Input<string>;
        passwordLevel?: pulumi.Input<number>;
        passwordType?: pulumi.Input<string>;
        transportPreferredProtocol?: pulumi.Input<string>;
    }

    export interface LineVtyAccessClass {
        accessList: pulumi.Input<string>;
        direction: pulumi.Input<string>;
        vrfAlso?: pulumi.Input<boolean>;
    }

    export interface LoggingIpv4Host {
        ipv4Host: pulumi.Input<string>;
    }

    export interface LoggingIpv4HostTransportTransportTcpPort {
        portNumber: pulumi.Input<number>;
    }

    export interface LoggingIpv4HostTransportTransportTlsPort {
        portNumber: pulumi.Input<number>;
        profile?: pulumi.Input<string>;
    }

    export interface LoggingIpv4HostTransportTransportUdpPort {
        portNumber: pulumi.Input<number>;
    }

    export interface LoggingIpv4HostVrfTransportTransportTcpPort {
        portNumber: pulumi.Input<number>;
    }

    export interface LoggingIpv4HostVrfTransportTransportTlsPort {
        portNumber: pulumi.Input<number>;
        profile?: pulumi.Input<string>;
    }

    export interface LoggingIpv4HostVrfTransportTransportUdpPort {
        portNumber: pulumi.Input<number>;
    }

    export interface LoggingIpv4VrfHost {
        ipv4Host: pulumi.Input<string>;
        vrf: pulumi.Input<string>;
    }

    export interface LoggingIpv6Host {
        ipv6Host: pulumi.Input<string>;
    }

    export interface LoggingIpv6HostTransportTransportTcpPort {
        portNumber: pulumi.Input<number>;
    }

    export interface LoggingIpv6HostTransportTransportTlsPort {
        portNumber: pulumi.Input<number>;
        profile?: pulumi.Input<string>;
    }

    export interface LoggingIpv6HostTransportTransportUdpPort {
        portNumber: pulumi.Input<number>;
    }

    export interface LoggingIpv6HostVrfTransportTransportTcpPort {
        portNumber: pulumi.Input<number>;
    }

    export interface LoggingIpv6HostVrfTransportTransportTlsPort {
        portNumber: pulumi.Input<number>;
        profile?: pulumi.Input<string>;
    }

    export interface LoggingIpv6HostVrfTransportTransportUdpPort {
        portNumber: pulumi.Input<number>;
    }

    export interface LoggingIpv6VrfHost {
        ipv6Host: pulumi.Input<string>;
        vrf: pulumi.Input<string>;
    }

    export interface LoggingSourceInterfacesVrf {
        interfaceName: pulumi.Input<string>;
        vrf: pulumi.Input<string>;
    }

    export interface MdtSubscriptionReceiver {
        address: pulumi.Input<string>;
        port: pulumi.Input<number>;
        protocol: pulumi.Input<string>;
    }

    export interface MsdpPassword {
        addr: pulumi.Input<string>;
        encryption?: pulumi.Input<number>;
        password: pulumi.Input<string>;
    }

    export interface MsdpPeer {
        addr: pulumi.Input<string>;
        connectSourceLoopback?: pulumi.Input<number>;
        remoteAs?: pulumi.Input<number>;
    }

    export interface MsdpVrfPassword {
        addr: pulumi.Input<string>;
        encryption?: pulumi.Input<number>;
        password: pulumi.Input<string>;
    }

    export interface MsdpVrfPeer {
        addr: pulumi.Input<string>;
        connectSourceLoopback?: pulumi.Input<number>;
        remoteAs?: pulumi.Input<number>;
    }

    export interface NtpAuthenticationKey {
        cmacAes128?: pulumi.Input<string>;
        encryptionType?: pulumi.Input<number>;
        hmacSha1?: pulumi.Input<string>;
        hmacSha2256?: pulumi.Input<string>;
        md5?: pulumi.Input<string>;
        number: pulumi.Input<number>;
        sha1?: pulumi.Input<string>;
        sha2?: pulumi.Input<string>;
    }

    export interface NtpPeer {
        ipAddress: pulumi.Input<string>;
        key?: pulumi.Input<number>;
        prefer?: pulumi.Input<boolean>;
        source?: pulumi.Input<string>;
        version?: pulumi.Input<number>;
    }

    export interface NtpPeerVrf {
        name: pulumi.Input<string>;
        peers?: pulumi.Input<pulumi.Input<inputs.iosxe.NtpPeerVrfPeer>[]>;
    }

    export interface NtpPeerVrfPeer {
        ipAddress: pulumi.Input<string>;
        key?: pulumi.Input<number>;
        prefer?: pulumi.Input<boolean>;
        version?: pulumi.Input<number>;
    }

    export interface NtpServer {
        ipAddress: pulumi.Input<string>;
        key?: pulumi.Input<number>;
        prefer?: pulumi.Input<boolean>;
        source?: pulumi.Input<string>;
        version?: pulumi.Input<number>;
    }

    export interface NtpServerVrf {
        name: pulumi.Input<string>;
        servers?: pulumi.Input<pulumi.Input<inputs.iosxe.NtpServerVrfServer>[]>;
    }

    export interface NtpServerVrfServer {
        ipAddress: pulumi.Input<string>;
        key?: pulumi.Input<number>;
        prefer?: pulumi.Input<boolean>;
        version?: pulumi.Input<number>;
    }

    export interface OspfArea {
        areaId: pulumi.Input<string>;
        authenticationMessageDigest?: pulumi.Input<boolean>;
        nssa?: pulumi.Input<boolean>;
        nssaDefaultInformationOriginate?: pulumi.Input<boolean>;
        nssaDefaultInformationOriginateMetric?: pulumi.Input<number>;
        nssaDefaultInformationOriginateMetricType?: pulumi.Input<number>;
        nssaNoRedistribution?: pulumi.Input<boolean>;
        nssaNoSummary?: pulumi.Input<boolean>;
    }

    export interface OspfNeighbor {
        cost?: pulumi.Input<number>;
        ip: pulumi.Input<string>;
        priority?: pulumi.Input<number>;
    }

    export interface OspfNetwork {
        area?: pulumi.Input<string>;
        ip: pulumi.Input<string>;
        wildcard?: pulumi.Input<string>;
    }

    export interface OspfSummaryAddress {
        ip: pulumi.Input<string>;
        mask?: pulumi.Input<string>;
    }

    export interface OspfVrfArea {
        areaId: pulumi.Input<string>;
        authenticationMessageDigest?: pulumi.Input<boolean>;
        nssa?: pulumi.Input<boolean>;
        nssaDefaultInformationOriginate?: pulumi.Input<boolean>;
        nssaDefaultInformationOriginateMetric?: pulumi.Input<number>;
        nssaDefaultInformationOriginateMetricType?: pulumi.Input<number>;
        nssaNoRedistribution?: pulumi.Input<boolean>;
        nssaNoSummary?: pulumi.Input<boolean>;
    }

    export interface OspfVrfNeighbor {
        cost?: pulumi.Input<number>;
        ip: pulumi.Input<string>;
        priority?: pulumi.Input<number>;
    }

    export interface OspfVrfNetwork {
        area?: pulumi.Input<string>;
        ip: pulumi.Input<string>;
        wildcard?: pulumi.Input<string>;
    }

    export interface OspfVrfSummaryAddress {
        ip: pulumi.Input<string>;
        mask?: pulumi.Input<string>;
    }

    export interface PimRpAddress {
        accessList: pulumi.Input<string>;
        bidir?: pulumi.Input<boolean>;
        override?: pulumi.Input<boolean>;
        rpAddress?: pulumi.Input<string>;
    }

    export interface PimRpCandidate {
        bidir?: pulumi.Input<boolean>;
        groupList?: pulumi.Input<string>;
        interface: pulumi.Input<string>;
        interval?: pulumi.Input<number>;
        priority?: pulumi.Input<number>;
    }

    export interface PimVrfRpAddress {
        accessList: pulumi.Input<string>;
        bidir?: pulumi.Input<boolean>;
        override?: pulumi.Input<boolean>;
        rpAddress?: pulumi.Input<string>;
    }

    export interface PimVrfRpCandidate {
        bidir?: pulumi.Input<boolean>;
        groupList?: pulumi.Input<string>;
        interface: pulumi.Input<string>;
        interval?: pulumi.Input<number>;
        priority?: pulumi.Input<number>;
    }

    export interface PolicyMapEventClassNumber {
        actionNumbers?: pulumi.Input<pulumi.Input<inputs.iosxe.PolicyMapEventClassNumberActionNumber>[]>;
        class?: pulumi.Input<string>;
        executionType?: pulumi.Input<string>;
        number: pulumi.Input<number>;
    }

    export interface PolicyMapEventClassNumberActionNumber {
        activateServiceTemplateConfigServiceTemplate?: pulumi.Input<string>;
        authenticateUsingMethod?: pulumi.Input<string>;
        authenticateUsingPriority?: pulumi.Input<number>;
        authenticateUsingRetries?: pulumi.Input<number>;
        authenticateUsingRetryTime?: pulumi.Input<number>;
        authorize?: pulumi.Input<boolean>;
        number: pulumi.Input<number>;
        pauseReauthentication?: pulumi.Input<boolean>;
        terminateConfig?: pulumi.Input<string>;
    }

    export interface PrefixListPrefix {
        action?: pulumi.Input<string>;
        ge?: pulumi.Input<number>;
        ip?: pulumi.Input<string>;
        le?: pulumi.Input<number>;
        name: pulumi.Input<string>;
        seq: pulumi.Input<number>;
    }

    export interface RadiusServerAttribute {
        accessRequestInclude?: pulumi.Input<boolean>;
        attribute31Parameters?: pulumi.Input<pulumi.Input<inputs.iosxe.RadiusServerAttributeAttribute31Parameter>[]>;
        number: pulumi.Input<string>;
        sendAttributes?: pulumi.Input<pulumi.Input<string>[]>;
    }

    export interface RadiusServerAttributeAttribute31Parameter {
        callingStationId: pulumi.Input<string>;
        idMacFormat?: pulumi.Input<string>;
        idMacLuCase?: pulumi.Input<string>;
        idSendMacOnly?: pulumi.Input<boolean>;
        idSendNasPortDetail?: pulumi.Input<boolean>;
    }

    export interface RestconfList {
        items?: pulumi.Input<pulumi.Input<{[key: string]: pulumi.Input<string>}>[]>;
        key: pulumi.Input<string>;
        name: pulumi.Input<string>;
        values?: pulumi.Input<pulumi.Input<string>[]>;
    }

    export interface RouteMapEntry {
        continue?: pulumi.Input<boolean>;
        continueSequenceNumber?: pulumi.Input<number>;
        description?: pulumi.Input<string>;
        matchAsPaths?: pulumi.Input<pulumi.Input<number>[]>;
        matchAsPathsLegacies?: pulumi.Input<pulumi.Input<number>[]>;
        matchCommunityListExactMatch?: pulumi.Input<boolean>;
        matchCommunityLists?: pulumi.Input<pulumi.Input<string>[]>;
        matchCommunityListsLegacies?: pulumi.Input<pulumi.Input<string>[]>;
        matchExtcommunityLists?: pulumi.Input<pulumi.Input<string>[]>;
        matchExtcommunityListsLegacies?: pulumi.Input<pulumi.Input<string>[]>;
        matchInterfaces?: pulumi.Input<pulumi.Input<string>[]>;
        matchIpAddressAccessLists?: pulumi.Input<pulumi.Input<string>[]>;
        matchIpAddressPrefixLists?: pulumi.Input<pulumi.Input<string>[]>;
        matchIpNextHopAccessLists?: pulumi.Input<pulumi.Input<string>[]>;
        matchIpNextHopPrefixLists?: pulumi.Input<pulumi.Input<string>[]>;
        matchIpv6AddressAccessLists?: pulumi.Input<string>;
        matchIpv6AddressPrefixLists?: pulumi.Input<string>;
        matchIpv6NextHopAccessLists?: pulumi.Input<string>;
        matchIpv6NextHopPrefixLists?: pulumi.Input<string>;
        matchLocalPreferences?: pulumi.Input<pulumi.Input<number>[]>;
        matchLocalPreferencesLegacies?: pulumi.Input<pulumi.Input<number>[]>;
        matchRouteTypeExternal?: pulumi.Input<boolean>;
        matchRouteTypeExternalType1?: pulumi.Input<boolean>;
        matchRouteTypeExternalType2?: pulumi.Input<boolean>;
        matchRouteTypeInternal?: pulumi.Input<boolean>;
        matchRouteTypeLevel1?: pulumi.Input<boolean>;
        matchRouteTypeLevel2?: pulumi.Input<boolean>;
        matchRouteTypeLocal?: pulumi.Input<boolean>;
        matchSourceProtocolBgps?: pulumi.Input<pulumi.Input<string>[]>;
        matchSourceProtocolConnected?: pulumi.Input<boolean>;
        matchSourceProtocolEigrps?: pulumi.Input<pulumi.Input<string>[]>;
        matchSourceProtocolIsis?: pulumi.Input<boolean>;
        matchSourceProtocolLisp?: pulumi.Input<boolean>;
        matchSourceProtocolOspfs?: pulumi.Input<pulumi.Input<string>[]>;
        matchSourceProtocolOspfv3s?: pulumi.Input<pulumi.Input<string>[]>;
        matchSourceProtocolRip?: pulumi.Input<boolean>;
        matchSourceProtocolStatic?: pulumi.Input<boolean>;
        matchTags?: pulumi.Input<pulumi.Input<number>[]>;
        matchTrack?: pulumi.Input<number>;
        operation?: pulumi.Input<string>;
        seq: pulumi.Input<number>;
        setAsPathPrependAs?: pulumi.Input<string>;
        setAsPathPrependAsLegacy?: pulumi.Input<string>;
        setAsPathPrependLastAs?: pulumi.Input<number>;
        setAsPathPrependLastAsLegacy?: pulumi.Input<number>;
        setAsPathTag?: pulumi.Input<boolean>;
        setAsPathTagLegacy?: pulumi.Input<boolean>;
        setCommunities?: pulumi.Input<pulumi.Input<string>[]>;
        setCommunitiesAdditive?: pulumi.Input<boolean>;
        setCommunitiesAdditiveLegacy?: pulumi.Input<boolean>;
        setCommunitiesLegacies?: pulumi.Input<pulumi.Input<string>[]>;
        setCommunityListDelete?: pulumi.Input<boolean>;
        setCommunityListDeleteLegacy?: pulumi.Input<boolean>;
        setCommunityListExpanded?: pulumi.Input<number>;
        setCommunityListExpandedLegacy?: pulumi.Input<number>;
        setCommunityListName?: pulumi.Input<string>;
        setCommunityListNameLegacy?: pulumi.Input<string>;
        setCommunityListStandard?: pulumi.Input<number>;
        setCommunityListStandardLegacy?: pulumi.Input<number>;
        setCommunityNone?: pulumi.Input<boolean>;
        setCommunityNoneLegacy?: pulumi.Input<boolean>;
        setDefaultInterfaces?: pulumi.Input<pulumi.Input<string>[]>;
        setExtcomunityRtLegacies?: pulumi.Input<pulumi.Input<string>[]>;
        setExtcomunityRts?: pulumi.Input<pulumi.Input<string>[]>;
        setExtcomunitySoo?: pulumi.Input<string>;
        setExtcomunitySooLegacy?: pulumi.Input<string>;
        setExtcomunityVpnDistinguisher?: pulumi.Input<string>;
        setExtcomunityVpnDistinguisherAdditive?: pulumi.Input<boolean>;
        setExtcomunityVpnDistinguisherLegacy?: pulumi.Input<string>;
        setGlobal?: pulumi.Input<boolean>;
        setInterfaces?: pulumi.Input<pulumi.Input<string>[]>;
        setIpAddress?: pulumi.Input<string>;
        setIpDefaultGlobalNextHopAddresses?: pulumi.Input<pulumi.Input<string>[]>;
        setIpDefaultNextHopAddresses?: pulumi.Input<pulumi.Input<string>[]>;
        setIpGlobalNextHopAddresses?: pulumi.Input<pulumi.Input<string>[]>;
        setIpNextHopAddresses?: pulumi.Input<pulumi.Input<string>[]>;
        setIpNextHopSelf?: pulumi.Input<boolean>;
        setIpQosGroup?: pulumi.Input<number>;
        setIpv6Addresses?: pulumi.Input<pulumi.Input<string>[]>;
        setIpv6DefaultGlobalNextHop?: pulumi.Input<string>;
        setIpv6DefaultNextHops?: pulumi.Input<pulumi.Input<string>[]>;
        setIpv6NextHops?: pulumi.Input<pulumi.Input<string>[]>;
        setLevel1?: pulumi.Input<boolean>;
        setLevel12?: pulumi.Input<boolean>;
        setLevel2?: pulumi.Input<boolean>;
        setLocalPreference?: pulumi.Input<number>;
        setLocalPreferenceLegacy?: pulumi.Input<number>;
        setMetricChange?: pulumi.Input<string>;
        setMetricDelay?: pulumi.Input<string>;
        setMetricLoading?: pulumi.Input<number>;
        setMetricMtu?: pulumi.Input<number>;
        setMetricReliability?: pulumi.Input<number>;
        setMetricType?: pulumi.Input<string>;
        setMetricValue?: pulumi.Input<number>;
        setTag?: pulumi.Input<number>;
        setVrf?: pulumi.Input<string>;
        setWeight?: pulumi.Input<number>;
        setWeightLegacy?: pulumi.Input<number>;
    }

    export interface ServiceTemplateAccessGroup {
        name: pulumi.Input<string>;
    }

    export interface ServiceTemplateInterfaceTemplate {
        name: pulumi.Input<string>;
    }

    export interface ServiceTemplateTag {
        name: pulumi.Input<string>;
    }

    export interface SnmpServerContext {
        name: pulumi.Input<string>;
    }

    export interface SnmpServerGroupV3Security {
        accessAclName?: pulumi.Input<string>;
        accessIpv6Acl?: pulumi.Input<string>;
        accessStandardAcl?: pulumi.Input<number>;
        contextNode?: pulumi.Input<string>;
        matchNode?: pulumi.Input<string>;
        notifyNode?: pulumi.Input<string>;
        readNode?: pulumi.Input<string>;
        securityLevel: pulumi.Input<string>;
        writeNode?: pulumi.Input<string>;
    }

    export interface SnmpServerHost {
        communityOrUser?: pulumi.Input<string>;
        encryption?: pulumi.Input<string>;
        ipAddress: pulumi.Input<string>;
        version?: pulumi.Input<string>;
    }

    export interface SnmpServerSnmpCommunity {
        accessListName?: pulumi.Input<string>;
        ipv6?: pulumi.Input<string>;
        name: pulumi.Input<string>;
        permission?: pulumi.Input<string>;
        view?: pulumi.Input<string>;
    }

    export interface SnmpServerView {
        incExl?: pulumi.Input<string>;
        mib: pulumi.Input<string>;
        name: pulumi.Input<string>;
    }

    export interface StaticRouteNextHop {
        global?: pulumi.Input<boolean>;
        metric?: pulumi.Input<number>;
        name?: pulumi.Input<string>;
        nextHop: pulumi.Input<string>;
        permanent?: pulumi.Input<boolean>;
        tag?: pulumi.Input<number>;
    }

    export interface StaticRouteVrfRoute {
        mask: pulumi.Input<string>;
        nextHops?: pulumi.Input<pulumi.Input<inputs.iosxe.StaticRouteVrfRouteNextHop>[]>;
        prefix: pulumi.Input<string>;
    }

    export interface StaticRouteVrfRouteNextHop {
        global?: pulumi.Input<boolean>;
        metric?: pulumi.Input<number>;
        name?: pulumi.Input<string>;
        nextHop: pulumi.Input<string>;
        permanent?: pulumi.Input<boolean>;
        tag?: pulumi.Input<number>;
    }

    export interface SystemMulticastRoutingVrf {
        distributed?: pulumi.Input<boolean>;
        vrf: pulumi.Input<string>;
    }

    export interface TemplateDeviceTrackingAttachPolicy {
        policyName: pulumi.Input<string>;
        vlanRange?: pulumi.Input<string>;
    }

    export interface TemplateIpAccessGroup {
        accessList?: pulumi.Input<string>;
        direction: pulumi.Input<string>;
    }

    export interface TemplateSwitchportPortSecurityMaximumRange {
        range: pulumi.Input<number>;
        vlan?: pulumi.Input<boolean>;
        vlanAccess?: pulumi.Input<boolean>;
    }

    export interface VrfIpv4RouteTargetExport {
        value: pulumi.Input<string>;
    }

    export interface VrfIpv4RouteTargetExportStitching {
        stitching?: pulumi.Input<boolean>;
        value: pulumi.Input<string>;
    }

    export interface VrfIpv4RouteTargetImport {
        value: pulumi.Input<string>;
    }

    export interface VrfIpv4RouteTargetImportStitching {
        stitching?: pulumi.Input<boolean>;
        value: pulumi.Input<string>;
    }

    export interface VrfIpv6RouteTargetExport {
        value: pulumi.Input<string>;
    }

    export interface VrfIpv6RouteTargetExportStitching {
        stitching?: pulumi.Input<boolean>;
        value: pulumi.Input<string>;
    }

    export interface VrfIpv6RouteTargetImport {
        value: pulumi.Input<string>;
    }

    export interface VrfIpv6RouteTargetImportStitching {
        stitching?: pulumi.Input<boolean>;
        value: pulumi.Input<string>;
    }

    export interface VrfRouteTargetExport {
        stitching?: pulumi.Input<boolean>;
        value: pulumi.Input<string>;
    }

    export interface VrfRouteTargetImport {
        stitching?: pulumi.Input<boolean>;
        value: pulumi.Input<string>;
    }
}