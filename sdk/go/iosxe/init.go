// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package iosxe

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/lbrlabs/pulumi-iosxe/sdk/go/iosxe/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "iosxe:index/aaa:Aaa":
		r = &Aaa{}
	case "iosxe:index/aaaAccounting:AaaAccounting":
		r = &AaaAccounting{}
	case "iosxe:index/aaaAuthentication:AaaAuthentication":
		r = &AaaAuthentication{}
	case "iosxe:index/aaaAuthorization:AaaAuthorization":
		r = &AaaAuthorization{}
	case "iosxe:index/accessListExtended:AccessListExtended":
		r = &AccessListExtended{}
	case "iosxe:index/accessListStandard:AccessListStandard":
		r = &AccessListStandard{}
	case "iosxe:index/arp:Arp":
		r = &Arp{}
	case "iosxe:index/banner:Banner":
		r = &Banner{}
	case "iosxe:index/bfd:Bfd":
		r = &Bfd{}
	case "iosxe:index/bfdTemplateMultiHop:BfdTemplateMultiHop":
		r = &BfdTemplateMultiHop{}
	case "iosxe:index/bfdTemplateSingleHop:BfdTemplateSingleHop":
		r = &BfdTemplateSingleHop{}
	case "iosxe:index/bgp:Bgp":
		r = &Bgp{}
	case "iosxe:index/bgpAddressFamilyIpv4:BgpAddressFamilyIpv4":
		r = &BgpAddressFamilyIpv4{}
	case "iosxe:index/bgpAddressFamilyIpv4Vrf:BgpAddressFamilyIpv4Vrf":
		r = &BgpAddressFamilyIpv4Vrf{}
	case "iosxe:index/bgpAddressFamilyIpv6:BgpAddressFamilyIpv6":
		r = &BgpAddressFamilyIpv6{}
	case "iosxe:index/bgpAddressFamilyIpv6Vrf:BgpAddressFamilyIpv6Vrf":
		r = &BgpAddressFamilyIpv6Vrf{}
	case "iosxe:index/bgpAddressFamilyL2vpn:BgpAddressFamilyL2vpn":
		r = &BgpAddressFamilyL2vpn{}
	case "iosxe:index/bgpIpv4UnicastNeighbor:BgpIpv4UnicastNeighbor":
		r = &BgpIpv4UnicastNeighbor{}
	case "iosxe:index/bgpIpv4UnicastVrfNeighbor:BgpIpv4UnicastVrfNeighbor":
		r = &BgpIpv4UnicastVrfNeighbor{}
	case "iosxe:index/bgpIpv6UnicastNeighbor:BgpIpv6UnicastNeighbor":
		r = &BgpIpv6UnicastNeighbor{}
	case "iosxe:index/bgpL2vpnEvpnNeighbor:BgpL2vpnEvpnNeighbor":
		r = &BgpL2vpnEvpnNeighbor{}
	case "iosxe:index/bgpNeighbor:BgpNeighbor":
		r = &BgpNeighbor{}
	case "iosxe:index/cdp:Cdp":
		r = &Cdp{}
	case "iosxe:index/classMap:ClassMap":
		r = &ClassMap{}
	case "iosxe:index/clock:Clock":
		r = &Clock{}
	case "iosxe:index/cryptoIkev2:CryptoIkev2":
		r = &CryptoIkev2{}
	case "iosxe:index/cryptoIkev2Keyring:CryptoIkev2Keyring":
		r = &CryptoIkev2Keyring{}
	case "iosxe:index/cryptoIkev2Policy:CryptoIkev2Policy":
		r = &CryptoIkev2Policy{}
	case "iosxe:index/cryptoIkev2Profile:CryptoIkev2Profile":
		r = &CryptoIkev2Profile{}
	case "iosxe:index/cryptoIkev2Proposal:CryptoIkev2Proposal":
		r = &CryptoIkev2Proposal{}
	case "iosxe:index/cryptoIpsecProfile:CryptoIpsecProfile":
		r = &CryptoIpsecProfile{}
	case "iosxe:index/cryptoIpsecTransformSet:CryptoIpsecTransformSet":
		r = &CryptoIpsecTransformSet{}
	case "iosxe:index/cts:Cts":
		r = &Cts{}
	case "iosxe:index/dhcp:Dhcp":
		r = &Dhcp{}
	case "iosxe:index/dot1x:Dot1x":
		r = &Dot1x{}
	case "iosxe:index/errdisable:Errdisable":
		r = &Errdisable{}
	case "iosxe:index/evpn:Evpn":
		r = &Evpn{}
	case "iosxe:index/evpnInstance:EvpnInstance":
		r = &EvpnInstance{}
	case "iosxe:index/interfaceEthernet:InterfaceEthernet":
		r = &InterfaceEthernet{}
	case "iosxe:index/interfaceLoopback:InterfaceLoopback":
		r = &InterfaceLoopback{}
	case "iosxe:index/interfaceMpls:InterfaceMpls":
		r = &InterfaceMpls{}
	case "iosxe:index/interfaceNve:InterfaceNve":
		r = &InterfaceNve{}
	case "iosxe:index/interfaceOspf:InterfaceOspf":
		r = &InterfaceOspf{}
	case "iosxe:index/interfaceOspfv3:InterfaceOspfv3":
		r = &InterfaceOspfv3{}
	case "iosxe:index/interfacePim:InterfacePim":
		r = &InterfacePim{}
	case "iosxe:index/interfacePortChannel:InterfacePortChannel":
		r = &InterfacePortChannel{}
	case "iosxe:index/interfacePortChannelSubinterface:InterfacePortChannelSubinterface":
		r = &InterfacePortChannelSubinterface{}
	case "iosxe:index/interfaceSwitchport:InterfaceSwitchport":
		r = &InterfaceSwitchport{}
	case "iosxe:index/interfaceTunnel:InterfaceTunnel":
		r = &InterfaceTunnel{}
	case "iosxe:index/interfaceVlan:InterfaceVlan":
		r = &InterfaceVlan{}
	case "iosxe:index/line:Line":
		r = &Line{}
	case "iosxe:index/logging:Logging":
		r = &Logging{}
	case "iosxe:index/loggingIpv4HostTransport:LoggingIpv4HostTransport":
		r = &LoggingIpv4HostTransport{}
	case "iosxe:index/loggingIpv4HostVrfTransport:LoggingIpv4HostVrfTransport":
		r = &LoggingIpv4HostVrfTransport{}
	case "iosxe:index/loggingIpv6HostTransport:LoggingIpv6HostTransport":
		r = &LoggingIpv6HostTransport{}
	case "iosxe:index/loggingIpv6HostVrfTransport:LoggingIpv6HostVrfTransport":
		r = &LoggingIpv6HostVrfTransport{}
	case "iosxe:index/mdtSubscription:MdtSubscription":
		r = &MdtSubscription{}
	case "iosxe:index/msdp:Msdp":
		r = &Msdp{}
	case "iosxe:index/msdpVrf:MsdpVrf":
		r = &MsdpVrf{}
	case "iosxe:index/ntp:Ntp":
		r = &Ntp{}
	case "iosxe:index/ospf:Ospf":
		r = &Ospf{}
	case "iosxe:index/ospfVrf:OspfVrf":
		r = &OspfVrf{}
	case "iosxe:index/pim:Pim":
		r = &Pim{}
	case "iosxe:index/pimVrf:PimVrf":
		r = &PimVrf{}
	case "iosxe:index/policyMap:PolicyMap":
		r = &PolicyMap{}
	case "iosxe:index/policyMapEvent:PolicyMapEvent":
		r = &PolicyMapEvent{}
	case "iosxe:index/prefixList:PrefixList":
		r = &PrefixList{}
	case "iosxe:index/radius:Radius":
		r = &Radius{}
	case "iosxe:index/radiusServer:RadiusServer":
		r = &RadiusServer{}
	case "iosxe:index/restconf:Restconf":
		r = &Restconf{}
	case "iosxe:index/routeMap:RouteMap":
		r = &RouteMap{}
	case "iosxe:index/service:Service":
		r = &Service{}
	case "iosxe:index/serviceTemplate:ServiceTemplate":
		r = &ServiceTemplate{}
	case "iosxe:index/snmpServer:SnmpServer":
		r = &SnmpServer{}
	case "iosxe:index/snmpServerGroup:SnmpServerGroup":
		r = &SnmpServerGroup{}
	case "iosxe:index/snmpServerUser:SnmpServerUser":
		r = &SnmpServerUser{}
	case "iosxe:index/staticRoute:StaticRoute":
		r = &StaticRoute{}
	case "iosxe:index/staticRouteVrf:StaticRouteVrf":
		r = &StaticRouteVrf{}
	case "iosxe:index/system:System":
		r = &System{}
	case "iosxe:index/tacacsServer:TacacsServer":
		r = &TacacsServer{}
	case "iosxe:index/template:Template":
		r = &Template{}
	case "iosxe:index/udld:Udld":
		r = &Udld{}
	case "iosxe:index/username:Username":
		r = &Username{}
	case "iosxe:index/vlan:Vlan":
		r = &Vlan{}
	case "iosxe:index/vlanAccessMap:VlanAccessMap":
		r = &VlanAccessMap{}
	case "iosxe:index/vlanConfiguration:VlanConfiguration":
		r = &VlanConfiguration{}
	case "iosxe:index/vrf:Vrf":
		r = &Vrf{}
	case "iosxe:index/vtp:Vtp":
		r = &Vtp{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:iosxe" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/aaa",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/aaaAccounting",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/aaaAuthentication",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/aaaAuthorization",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/accessListExtended",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/accessListStandard",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/arp",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/banner",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/bfd",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/bfdTemplateMultiHop",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/bfdTemplateSingleHop",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/bgp",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/bgpAddressFamilyIpv4",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/bgpAddressFamilyIpv4Vrf",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/bgpAddressFamilyIpv6",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/bgpAddressFamilyIpv6Vrf",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/bgpAddressFamilyL2vpn",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/bgpIpv4UnicastNeighbor",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/bgpIpv4UnicastVrfNeighbor",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/bgpIpv6UnicastNeighbor",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/bgpL2vpnEvpnNeighbor",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/bgpNeighbor",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/cdp",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/classMap",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/clock",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/cryptoIkev2",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/cryptoIkev2Keyring",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/cryptoIkev2Policy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/cryptoIkev2Profile",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/cryptoIkev2Proposal",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/cryptoIpsecProfile",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/cryptoIpsecTransformSet",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/cts",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/dhcp",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/dot1x",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/errdisable",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/evpn",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/evpnInstance",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/interfaceEthernet",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/interfaceLoopback",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/interfaceMpls",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/interfaceNve",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/interfaceOspf",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/interfaceOspfv3",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/interfacePim",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/interfacePortChannel",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/interfacePortChannelSubinterface",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/interfaceSwitchport",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/interfaceTunnel",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/interfaceVlan",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/line",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/logging",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/loggingIpv4HostTransport",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/loggingIpv4HostVrfTransport",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/loggingIpv6HostTransport",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/loggingIpv6HostVrfTransport",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/mdtSubscription",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/msdp",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/msdpVrf",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/ntp",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/ospf",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/ospfVrf",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/pim",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/pimVrf",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/policyMap",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/policyMapEvent",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/prefixList",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/radius",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/radiusServer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/restconf",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/routeMap",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/service",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/serviceTemplate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/snmpServer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/snmpServerGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/snmpServerUser",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/staticRoute",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/staticRouteVrf",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/system",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/tacacsServer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/template",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/udld",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/username",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/vlan",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/vlanAccessMap",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/vlanConfiguration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/vrf",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"iosxe",
		"index/vtp",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"iosxe",
		&pkg{version},
	)
}
