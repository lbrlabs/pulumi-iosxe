# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetInterfacePortChannelResult',
    'AwaitableGetInterfacePortChannelResult',
    'get_interface_port_channel',
    'get_interface_port_channel_output',
]

@pulumi.output_type
class GetInterfacePortChannelResult:
    """
    A collection of values returned by getInterfacePortChannel.
    """
    def __init__(__self__, arp_timeout=None, auto_qos_classify=None, auto_qos_classify_police=None, auto_qos_trust=None, auto_qos_trust_cos=None, auto_qos_trust_dscp=None, auto_qos_video_cts=None, auto_qos_video_ip_camera=None, auto_qos_video_media_player=None, auto_qos_voip=None, auto_qos_voip_cisco_phone=None, auto_qos_voip_cisco_softphone=None, auto_qos_voip_trust=None, bfd_echo=None, bfd_enable=None, bfd_interval=None, bfd_interval_min_rx=None, bfd_interval_multiplier=None, bfd_local_address=None, bfd_template=None, description=None, device=None, helper_addresses=None, id=None, ip_access_group_in=None, ip_access_group_in_enable=None, ip_access_group_out=None, ip_access_group_out_enable=None, ip_arp_inspection_limit_rate=None, ip_arp_inspection_trust=None, ip_dhcp_relay_source_interface=None, ip_dhcp_snooping_trust=None, ip_proxy_arp=None, ip_redirects=None, ip_unreachables=None, ipv4_address=None, ipv4_address_mask=None, ipv6_address_autoconfig_default=None, ipv6_address_dhcp=None, ipv6_addresses=None, ipv6_enable=None, ipv6_link_local_addresses=None, ipv6_mtu=None, ipv6_nd_ra_suppress_all=None, name=None, shutdown=None, spanning_tree_guard=None, spanning_tree_link_type=None, switchport=None, trust_device=None, vrf_forwarding=None):
        if arp_timeout and not isinstance(arp_timeout, int):
            raise TypeError("Expected argument 'arp_timeout' to be a int")
        pulumi.set(__self__, "arp_timeout", arp_timeout)
        if auto_qos_classify and not isinstance(auto_qos_classify, bool):
            raise TypeError("Expected argument 'auto_qos_classify' to be a bool")
        pulumi.set(__self__, "auto_qos_classify", auto_qos_classify)
        if auto_qos_classify_police and not isinstance(auto_qos_classify_police, bool):
            raise TypeError("Expected argument 'auto_qos_classify_police' to be a bool")
        pulumi.set(__self__, "auto_qos_classify_police", auto_qos_classify_police)
        if auto_qos_trust and not isinstance(auto_qos_trust, bool):
            raise TypeError("Expected argument 'auto_qos_trust' to be a bool")
        pulumi.set(__self__, "auto_qos_trust", auto_qos_trust)
        if auto_qos_trust_cos and not isinstance(auto_qos_trust_cos, bool):
            raise TypeError("Expected argument 'auto_qos_trust_cos' to be a bool")
        pulumi.set(__self__, "auto_qos_trust_cos", auto_qos_trust_cos)
        if auto_qos_trust_dscp and not isinstance(auto_qos_trust_dscp, bool):
            raise TypeError("Expected argument 'auto_qos_trust_dscp' to be a bool")
        pulumi.set(__self__, "auto_qos_trust_dscp", auto_qos_trust_dscp)
        if auto_qos_video_cts and not isinstance(auto_qos_video_cts, bool):
            raise TypeError("Expected argument 'auto_qos_video_cts' to be a bool")
        pulumi.set(__self__, "auto_qos_video_cts", auto_qos_video_cts)
        if auto_qos_video_ip_camera and not isinstance(auto_qos_video_ip_camera, bool):
            raise TypeError("Expected argument 'auto_qos_video_ip_camera' to be a bool")
        pulumi.set(__self__, "auto_qos_video_ip_camera", auto_qos_video_ip_camera)
        if auto_qos_video_media_player and not isinstance(auto_qos_video_media_player, bool):
            raise TypeError("Expected argument 'auto_qos_video_media_player' to be a bool")
        pulumi.set(__self__, "auto_qos_video_media_player", auto_qos_video_media_player)
        if auto_qos_voip and not isinstance(auto_qos_voip, bool):
            raise TypeError("Expected argument 'auto_qos_voip' to be a bool")
        pulumi.set(__self__, "auto_qos_voip", auto_qos_voip)
        if auto_qos_voip_cisco_phone and not isinstance(auto_qos_voip_cisco_phone, bool):
            raise TypeError("Expected argument 'auto_qos_voip_cisco_phone' to be a bool")
        pulumi.set(__self__, "auto_qos_voip_cisco_phone", auto_qos_voip_cisco_phone)
        if auto_qos_voip_cisco_softphone and not isinstance(auto_qos_voip_cisco_softphone, bool):
            raise TypeError("Expected argument 'auto_qos_voip_cisco_softphone' to be a bool")
        pulumi.set(__self__, "auto_qos_voip_cisco_softphone", auto_qos_voip_cisco_softphone)
        if auto_qos_voip_trust and not isinstance(auto_qos_voip_trust, bool):
            raise TypeError("Expected argument 'auto_qos_voip_trust' to be a bool")
        pulumi.set(__self__, "auto_qos_voip_trust", auto_qos_voip_trust)
        if bfd_echo and not isinstance(bfd_echo, bool):
            raise TypeError("Expected argument 'bfd_echo' to be a bool")
        pulumi.set(__self__, "bfd_echo", bfd_echo)
        if bfd_enable and not isinstance(bfd_enable, bool):
            raise TypeError("Expected argument 'bfd_enable' to be a bool")
        pulumi.set(__self__, "bfd_enable", bfd_enable)
        if bfd_interval and not isinstance(bfd_interval, int):
            raise TypeError("Expected argument 'bfd_interval' to be a int")
        pulumi.set(__self__, "bfd_interval", bfd_interval)
        if bfd_interval_min_rx and not isinstance(bfd_interval_min_rx, int):
            raise TypeError("Expected argument 'bfd_interval_min_rx' to be a int")
        pulumi.set(__self__, "bfd_interval_min_rx", bfd_interval_min_rx)
        if bfd_interval_multiplier and not isinstance(bfd_interval_multiplier, int):
            raise TypeError("Expected argument 'bfd_interval_multiplier' to be a int")
        pulumi.set(__self__, "bfd_interval_multiplier", bfd_interval_multiplier)
        if bfd_local_address and not isinstance(bfd_local_address, str):
            raise TypeError("Expected argument 'bfd_local_address' to be a str")
        pulumi.set(__self__, "bfd_local_address", bfd_local_address)
        if bfd_template and not isinstance(bfd_template, str):
            raise TypeError("Expected argument 'bfd_template' to be a str")
        pulumi.set(__self__, "bfd_template", bfd_template)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if helper_addresses and not isinstance(helper_addresses, list):
            raise TypeError("Expected argument 'helper_addresses' to be a list")
        pulumi.set(__self__, "helper_addresses", helper_addresses)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ip_access_group_in and not isinstance(ip_access_group_in, str):
            raise TypeError("Expected argument 'ip_access_group_in' to be a str")
        pulumi.set(__self__, "ip_access_group_in", ip_access_group_in)
        if ip_access_group_in_enable and not isinstance(ip_access_group_in_enable, bool):
            raise TypeError("Expected argument 'ip_access_group_in_enable' to be a bool")
        pulumi.set(__self__, "ip_access_group_in_enable", ip_access_group_in_enable)
        if ip_access_group_out and not isinstance(ip_access_group_out, str):
            raise TypeError("Expected argument 'ip_access_group_out' to be a str")
        pulumi.set(__self__, "ip_access_group_out", ip_access_group_out)
        if ip_access_group_out_enable and not isinstance(ip_access_group_out_enable, bool):
            raise TypeError("Expected argument 'ip_access_group_out_enable' to be a bool")
        pulumi.set(__self__, "ip_access_group_out_enable", ip_access_group_out_enable)
        if ip_arp_inspection_limit_rate and not isinstance(ip_arp_inspection_limit_rate, int):
            raise TypeError("Expected argument 'ip_arp_inspection_limit_rate' to be a int")
        pulumi.set(__self__, "ip_arp_inspection_limit_rate", ip_arp_inspection_limit_rate)
        if ip_arp_inspection_trust and not isinstance(ip_arp_inspection_trust, bool):
            raise TypeError("Expected argument 'ip_arp_inspection_trust' to be a bool")
        pulumi.set(__self__, "ip_arp_inspection_trust", ip_arp_inspection_trust)
        if ip_dhcp_relay_source_interface and not isinstance(ip_dhcp_relay_source_interface, str):
            raise TypeError("Expected argument 'ip_dhcp_relay_source_interface' to be a str")
        pulumi.set(__self__, "ip_dhcp_relay_source_interface", ip_dhcp_relay_source_interface)
        if ip_dhcp_snooping_trust and not isinstance(ip_dhcp_snooping_trust, bool):
            raise TypeError("Expected argument 'ip_dhcp_snooping_trust' to be a bool")
        pulumi.set(__self__, "ip_dhcp_snooping_trust", ip_dhcp_snooping_trust)
        if ip_proxy_arp and not isinstance(ip_proxy_arp, bool):
            raise TypeError("Expected argument 'ip_proxy_arp' to be a bool")
        pulumi.set(__self__, "ip_proxy_arp", ip_proxy_arp)
        if ip_redirects and not isinstance(ip_redirects, bool):
            raise TypeError("Expected argument 'ip_redirects' to be a bool")
        pulumi.set(__self__, "ip_redirects", ip_redirects)
        if ip_unreachables and not isinstance(ip_unreachables, bool):
            raise TypeError("Expected argument 'ip_unreachables' to be a bool")
        pulumi.set(__self__, "ip_unreachables", ip_unreachables)
        if ipv4_address and not isinstance(ipv4_address, str):
            raise TypeError("Expected argument 'ipv4_address' to be a str")
        pulumi.set(__self__, "ipv4_address", ipv4_address)
        if ipv4_address_mask and not isinstance(ipv4_address_mask, str):
            raise TypeError("Expected argument 'ipv4_address_mask' to be a str")
        pulumi.set(__self__, "ipv4_address_mask", ipv4_address_mask)
        if ipv6_address_autoconfig_default and not isinstance(ipv6_address_autoconfig_default, bool):
            raise TypeError("Expected argument 'ipv6_address_autoconfig_default' to be a bool")
        pulumi.set(__self__, "ipv6_address_autoconfig_default", ipv6_address_autoconfig_default)
        if ipv6_address_dhcp and not isinstance(ipv6_address_dhcp, bool):
            raise TypeError("Expected argument 'ipv6_address_dhcp' to be a bool")
        pulumi.set(__self__, "ipv6_address_dhcp", ipv6_address_dhcp)
        if ipv6_addresses and not isinstance(ipv6_addresses, list):
            raise TypeError("Expected argument 'ipv6_addresses' to be a list")
        pulumi.set(__self__, "ipv6_addresses", ipv6_addresses)
        if ipv6_enable and not isinstance(ipv6_enable, bool):
            raise TypeError("Expected argument 'ipv6_enable' to be a bool")
        pulumi.set(__self__, "ipv6_enable", ipv6_enable)
        if ipv6_link_local_addresses and not isinstance(ipv6_link_local_addresses, list):
            raise TypeError("Expected argument 'ipv6_link_local_addresses' to be a list")
        pulumi.set(__self__, "ipv6_link_local_addresses", ipv6_link_local_addresses)
        if ipv6_mtu and not isinstance(ipv6_mtu, int):
            raise TypeError("Expected argument 'ipv6_mtu' to be a int")
        pulumi.set(__self__, "ipv6_mtu", ipv6_mtu)
        if ipv6_nd_ra_suppress_all and not isinstance(ipv6_nd_ra_suppress_all, bool):
            raise TypeError("Expected argument 'ipv6_nd_ra_suppress_all' to be a bool")
        pulumi.set(__self__, "ipv6_nd_ra_suppress_all", ipv6_nd_ra_suppress_all)
        if name and not isinstance(name, int):
            raise TypeError("Expected argument 'name' to be a int")
        pulumi.set(__self__, "name", name)
        if shutdown and not isinstance(shutdown, bool):
            raise TypeError("Expected argument 'shutdown' to be a bool")
        pulumi.set(__self__, "shutdown", shutdown)
        if spanning_tree_guard and not isinstance(spanning_tree_guard, str):
            raise TypeError("Expected argument 'spanning_tree_guard' to be a str")
        pulumi.set(__self__, "spanning_tree_guard", spanning_tree_guard)
        if spanning_tree_link_type and not isinstance(spanning_tree_link_type, str):
            raise TypeError("Expected argument 'spanning_tree_link_type' to be a str")
        pulumi.set(__self__, "spanning_tree_link_type", spanning_tree_link_type)
        if switchport and not isinstance(switchport, bool):
            raise TypeError("Expected argument 'switchport' to be a bool")
        pulumi.set(__self__, "switchport", switchport)
        if trust_device and not isinstance(trust_device, str):
            raise TypeError("Expected argument 'trust_device' to be a str")
        pulumi.set(__self__, "trust_device", trust_device)
        if vrf_forwarding and not isinstance(vrf_forwarding, str):
            raise TypeError("Expected argument 'vrf_forwarding' to be a str")
        pulumi.set(__self__, "vrf_forwarding", vrf_forwarding)

    @property
    @pulumi.getter(name="arpTimeout")
    def arp_timeout(self) -> int:
        """
        Set ARP cache timeout
        """
        return pulumi.get(self, "arp_timeout")

    @property
    @pulumi.getter(name="autoQosClassify")
    def auto_qos_classify(self) -> bool:
        """
        Configure classification for untrusted devices
        """
        return pulumi.get(self, "auto_qos_classify")

    @property
    @pulumi.getter(name="autoQosClassifyPolice")
    def auto_qos_classify_police(self) -> bool:
        """
        Configure QoS policing for untrusted devices
        """
        return pulumi.get(self, "auto_qos_classify_police")

    @property
    @pulumi.getter(name="autoQosTrust")
    def auto_qos_trust(self) -> bool:
        """
        Trust the DSCP/CoS marking
        """
        return pulumi.get(self, "auto_qos_trust")

    @property
    @pulumi.getter(name="autoQosTrustCos")
    def auto_qos_trust_cos(self) -> bool:
        """
        Trust the CoS marking
        """
        return pulumi.get(self, "auto_qos_trust_cos")

    @property
    @pulumi.getter(name="autoQosTrustDscp")
    def auto_qos_trust_dscp(self) -> bool:
        """
        Trust the DSCP marking
        """
        return pulumi.get(self, "auto_qos_trust_dscp")

    @property
    @pulumi.getter(name="autoQosVideoCts")
    def auto_qos_video_cts(self) -> bool:
        """
        Trust the QoS marking of the Cisco Telepresence System
        """
        return pulumi.get(self, "auto_qos_video_cts")

    @property
    @pulumi.getter(name="autoQosVideoIpCamera")
    def auto_qos_video_ip_camera(self) -> bool:
        """
        Trust the QoS marking of the Ip Video Surveillance camera
        """
        return pulumi.get(self, "auto_qos_video_ip_camera")

    @property
    @pulumi.getter(name="autoQosVideoMediaPlayer")
    def auto_qos_video_media_player(self) -> bool:
        """
        Trust the Qos marking of the Cisco Media Player
        """
        return pulumi.get(self, "auto_qos_video_media_player")

    @property
    @pulumi.getter(name="autoQosVoip")
    def auto_qos_voip(self) -> bool:
        """
        Configure AutoQoS for VoIP
        """
        return pulumi.get(self, "auto_qos_voip")

    @property
    @pulumi.getter(name="autoQosVoipCiscoPhone")
    def auto_qos_voip_cisco_phone(self) -> bool:
        """
        Trust the QoS marking of Cisco IP Phone
        """
        return pulumi.get(self, "auto_qos_voip_cisco_phone")

    @property
    @pulumi.getter(name="autoQosVoipCiscoSoftphone")
    def auto_qos_voip_cisco_softphone(self) -> bool:
        """
        Trust the QoS marking of Cisco IP SoftPhone
        """
        return pulumi.get(self, "auto_qos_voip_cisco_softphone")

    @property
    @pulumi.getter(name="autoQosVoipTrust")
    def auto_qos_voip_trust(self) -> bool:
        """
        Trust the DSCP/CoS marking
        """
        return pulumi.get(self, "auto_qos_voip_trust")

    @property
    @pulumi.getter(name="bfdEcho")
    def bfd_echo(self) -> bool:
        """
        Use echo adjunct as bfd detection mechanism
        """
        return pulumi.get(self, "bfd_echo")

    @property
    @pulumi.getter(name="bfdEnable")
    def bfd_enable(self) -> bool:
        """
        Enable BFD under the interface
        """
        return pulumi.get(self, "bfd_enable")

    @property
    @pulumi.getter(name="bfdInterval")
    def bfd_interval(self) -> int:
        return pulumi.get(self, "bfd_interval")

    @property
    @pulumi.getter(name="bfdIntervalMinRx")
    def bfd_interval_min_rx(self) -> int:
        """
        Minimum receive interval capability
        """
        return pulumi.get(self, "bfd_interval_min_rx")

    @property
    @pulumi.getter(name="bfdIntervalMultiplier")
    def bfd_interval_multiplier(self) -> int:
        """
        Multiplier value used to compute holddown
        """
        return pulumi.get(self, "bfd_interval_multiplier")

    @property
    @pulumi.getter(name="bfdLocalAddress")
    def bfd_local_address(self) -> str:
        """
        The Source IP address to be used for BFD sessions over this interface.
        """
        return pulumi.get(self, "bfd_local_address")

    @property
    @pulumi.getter(name="bfdTemplate")
    def bfd_template(self) -> str:
        """
        BFD template
        """
        return pulumi.get(self, "bfd_template")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Interface specific description
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def device(self) -> Optional[str]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter(name="helperAddresses")
    def helper_addresses(self) -> Sequence['outputs.GetInterfacePortChannelHelperAddressResult']:
        """
        Specify a destination address for UDP broadcasts
        """
        return pulumi.get(self, "helper_addresses")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The path of the retrieved object.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipAccessGroupIn")
    def ip_access_group_in(self) -> str:
        return pulumi.get(self, "ip_access_group_in")

    @property
    @pulumi.getter(name="ipAccessGroupInEnable")
    def ip_access_group_in_enable(self) -> bool:
        """
        inbound packets
        """
        return pulumi.get(self, "ip_access_group_in_enable")

    @property
    @pulumi.getter(name="ipAccessGroupOut")
    def ip_access_group_out(self) -> str:
        return pulumi.get(self, "ip_access_group_out")

    @property
    @pulumi.getter(name="ipAccessGroupOutEnable")
    def ip_access_group_out_enable(self) -> bool:
        """
        outbound packets
        """
        return pulumi.get(self, "ip_access_group_out_enable")

    @property
    @pulumi.getter(name="ipArpInspectionLimitRate")
    def ip_arp_inspection_limit_rate(self) -> int:
        """
        Rate Limit
        """
        return pulumi.get(self, "ip_arp_inspection_limit_rate")

    @property
    @pulumi.getter(name="ipArpInspectionTrust")
    def ip_arp_inspection_trust(self) -> bool:
        """
        Configure Trust state
        """
        return pulumi.get(self, "ip_arp_inspection_trust")

    @property
    @pulumi.getter(name="ipDhcpRelaySourceInterface")
    def ip_dhcp_relay_source_interface(self) -> str:
        """
        Set source interface for relayed messages
        """
        return pulumi.get(self, "ip_dhcp_relay_source_interface")

    @property
    @pulumi.getter(name="ipDhcpSnoopingTrust")
    def ip_dhcp_snooping_trust(self) -> bool:
        """
        DHCP Snooping trust config
        """
        return pulumi.get(self, "ip_dhcp_snooping_trust")

    @property
    @pulumi.getter(name="ipProxyArp")
    def ip_proxy_arp(self) -> bool:
        """
        Enable proxy ARP
        """
        return pulumi.get(self, "ip_proxy_arp")

    @property
    @pulumi.getter(name="ipRedirects")
    def ip_redirects(self) -> bool:
        """
        Enable sending ICMP Redirect messages
        """
        return pulumi.get(self, "ip_redirects")

    @property
    @pulumi.getter(name="ipUnreachables")
    def ip_unreachables(self) -> bool:
        """
        Enable sending ICMP Unreachable messages
        """
        return pulumi.get(self, "ip_unreachables")

    @property
    @pulumi.getter(name="ipv4Address")
    def ipv4_address(self) -> str:
        return pulumi.get(self, "ipv4_address")

    @property
    @pulumi.getter(name="ipv4AddressMask")
    def ipv4_address_mask(self) -> str:
        return pulumi.get(self, "ipv4_address_mask")

    @property
    @pulumi.getter(name="ipv6AddressAutoconfigDefault")
    def ipv6_address_autoconfig_default(self) -> bool:
        """
        Insert default route
        """
        return pulumi.get(self, "ipv6_address_autoconfig_default")

    @property
    @pulumi.getter(name="ipv6AddressDhcp")
    def ipv6_address_dhcp(self) -> bool:
        """
        Obtain IPv6 address from DHCP server
        """
        return pulumi.get(self, "ipv6_address_dhcp")

    @property
    @pulumi.getter(name="ipv6Addresses")
    def ipv6_addresses(self) -> Sequence['outputs.GetInterfacePortChannelIpv6AddressResult']:
        return pulumi.get(self, "ipv6_addresses")

    @property
    @pulumi.getter(name="ipv6Enable")
    def ipv6_enable(self) -> bool:
        """
        Enable IPv6 on interface
        """
        return pulumi.get(self, "ipv6_enable")

    @property
    @pulumi.getter(name="ipv6LinkLocalAddresses")
    def ipv6_link_local_addresses(self) -> Sequence['outputs.GetInterfacePortChannelIpv6LinkLocalAddressResult']:
        return pulumi.get(self, "ipv6_link_local_addresses")

    @property
    @pulumi.getter(name="ipv6Mtu")
    def ipv6_mtu(self) -> int:
        """
        Set IPv6 Maximum Transmission Unit
        """
        return pulumi.get(self, "ipv6_mtu")

    @property
    @pulumi.getter(name="ipv6NdRaSuppressAll")
    def ipv6_nd_ra_suppress_all(self) -> bool:
        """
        Suppress all IPv6 RA
        """
        return pulumi.get(self, "ipv6_nd_ra_suppress_all")

    @property
    @pulumi.getter
    def name(self) -> int:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def shutdown(self) -> bool:
        """
        Shutdown the selected interface
        """
        return pulumi.get(self, "shutdown")

    @property
    @pulumi.getter(name="spanningTreeGuard")
    def spanning_tree_guard(self) -> str:
        """
        Change an interface's spanning tree guard mode
        """
        return pulumi.get(self, "spanning_tree_guard")

    @property
    @pulumi.getter(name="spanningTreeLinkType")
    def spanning_tree_link_type(self) -> str:
        """
        Specify a link type for spanning tree tree protocol use
        """
        return pulumi.get(self, "spanning_tree_link_type")

    @property
    @pulumi.getter
    def switchport(self) -> bool:
        return pulumi.get(self, "switchport")

    @property
    @pulumi.getter(name="trustDevice")
    def trust_device(self) -> str:
        """
        trusted device class
        """
        return pulumi.get(self, "trust_device")

    @property
    @pulumi.getter(name="vrfForwarding")
    def vrf_forwarding(self) -> str:
        """
        Configure forwarding table
        """
        return pulumi.get(self, "vrf_forwarding")


class AwaitableGetInterfacePortChannelResult(GetInterfacePortChannelResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInterfacePortChannelResult(
            arp_timeout=self.arp_timeout,
            auto_qos_classify=self.auto_qos_classify,
            auto_qos_classify_police=self.auto_qos_classify_police,
            auto_qos_trust=self.auto_qos_trust,
            auto_qos_trust_cos=self.auto_qos_trust_cos,
            auto_qos_trust_dscp=self.auto_qos_trust_dscp,
            auto_qos_video_cts=self.auto_qos_video_cts,
            auto_qos_video_ip_camera=self.auto_qos_video_ip_camera,
            auto_qos_video_media_player=self.auto_qos_video_media_player,
            auto_qos_voip=self.auto_qos_voip,
            auto_qos_voip_cisco_phone=self.auto_qos_voip_cisco_phone,
            auto_qos_voip_cisco_softphone=self.auto_qos_voip_cisco_softphone,
            auto_qos_voip_trust=self.auto_qos_voip_trust,
            bfd_echo=self.bfd_echo,
            bfd_enable=self.bfd_enable,
            bfd_interval=self.bfd_interval,
            bfd_interval_min_rx=self.bfd_interval_min_rx,
            bfd_interval_multiplier=self.bfd_interval_multiplier,
            bfd_local_address=self.bfd_local_address,
            bfd_template=self.bfd_template,
            description=self.description,
            device=self.device,
            helper_addresses=self.helper_addresses,
            id=self.id,
            ip_access_group_in=self.ip_access_group_in,
            ip_access_group_in_enable=self.ip_access_group_in_enable,
            ip_access_group_out=self.ip_access_group_out,
            ip_access_group_out_enable=self.ip_access_group_out_enable,
            ip_arp_inspection_limit_rate=self.ip_arp_inspection_limit_rate,
            ip_arp_inspection_trust=self.ip_arp_inspection_trust,
            ip_dhcp_relay_source_interface=self.ip_dhcp_relay_source_interface,
            ip_dhcp_snooping_trust=self.ip_dhcp_snooping_trust,
            ip_proxy_arp=self.ip_proxy_arp,
            ip_redirects=self.ip_redirects,
            ip_unreachables=self.ip_unreachables,
            ipv4_address=self.ipv4_address,
            ipv4_address_mask=self.ipv4_address_mask,
            ipv6_address_autoconfig_default=self.ipv6_address_autoconfig_default,
            ipv6_address_dhcp=self.ipv6_address_dhcp,
            ipv6_addresses=self.ipv6_addresses,
            ipv6_enable=self.ipv6_enable,
            ipv6_link_local_addresses=self.ipv6_link_local_addresses,
            ipv6_mtu=self.ipv6_mtu,
            ipv6_nd_ra_suppress_all=self.ipv6_nd_ra_suppress_all,
            name=self.name,
            shutdown=self.shutdown,
            spanning_tree_guard=self.spanning_tree_guard,
            spanning_tree_link_type=self.spanning_tree_link_type,
            switchport=self.switchport,
            trust_device=self.trust_device,
            vrf_forwarding=self.vrf_forwarding)


def get_interface_port_channel(device: Optional[str] = None,
                               name: Optional[int] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInterfacePortChannelResult:
    """
    This data source can read the Interface Port Channel configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_interface_port_channel(name=10)
    ```


    :param str device: A device name from the provider configuration.
    """
    __args__ = dict()
    __args__['device'] = device
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:iosxe/getInterfacePortChannel:getInterfacePortChannel', __args__, opts=opts, typ=GetInterfacePortChannelResult).value

    return AwaitableGetInterfacePortChannelResult(
        arp_timeout=pulumi.get(__ret__, 'arp_timeout'),
        auto_qos_classify=pulumi.get(__ret__, 'auto_qos_classify'),
        auto_qos_classify_police=pulumi.get(__ret__, 'auto_qos_classify_police'),
        auto_qos_trust=pulumi.get(__ret__, 'auto_qos_trust'),
        auto_qos_trust_cos=pulumi.get(__ret__, 'auto_qos_trust_cos'),
        auto_qos_trust_dscp=pulumi.get(__ret__, 'auto_qos_trust_dscp'),
        auto_qos_video_cts=pulumi.get(__ret__, 'auto_qos_video_cts'),
        auto_qos_video_ip_camera=pulumi.get(__ret__, 'auto_qos_video_ip_camera'),
        auto_qos_video_media_player=pulumi.get(__ret__, 'auto_qos_video_media_player'),
        auto_qos_voip=pulumi.get(__ret__, 'auto_qos_voip'),
        auto_qos_voip_cisco_phone=pulumi.get(__ret__, 'auto_qos_voip_cisco_phone'),
        auto_qos_voip_cisco_softphone=pulumi.get(__ret__, 'auto_qos_voip_cisco_softphone'),
        auto_qos_voip_trust=pulumi.get(__ret__, 'auto_qos_voip_trust'),
        bfd_echo=pulumi.get(__ret__, 'bfd_echo'),
        bfd_enable=pulumi.get(__ret__, 'bfd_enable'),
        bfd_interval=pulumi.get(__ret__, 'bfd_interval'),
        bfd_interval_min_rx=pulumi.get(__ret__, 'bfd_interval_min_rx'),
        bfd_interval_multiplier=pulumi.get(__ret__, 'bfd_interval_multiplier'),
        bfd_local_address=pulumi.get(__ret__, 'bfd_local_address'),
        bfd_template=pulumi.get(__ret__, 'bfd_template'),
        description=pulumi.get(__ret__, 'description'),
        device=pulumi.get(__ret__, 'device'),
        helper_addresses=pulumi.get(__ret__, 'helper_addresses'),
        id=pulumi.get(__ret__, 'id'),
        ip_access_group_in=pulumi.get(__ret__, 'ip_access_group_in'),
        ip_access_group_in_enable=pulumi.get(__ret__, 'ip_access_group_in_enable'),
        ip_access_group_out=pulumi.get(__ret__, 'ip_access_group_out'),
        ip_access_group_out_enable=pulumi.get(__ret__, 'ip_access_group_out_enable'),
        ip_arp_inspection_limit_rate=pulumi.get(__ret__, 'ip_arp_inspection_limit_rate'),
        ip_arp_inspection_trust=pulumi.get(__ret__, 'ip_arp_inspection_trust'),
        ip_dhcp_relay_source_interface=pulumi.get(__ret__, 'ip_dhcp_relay_source_interface'),
        ip_dhcp_snooping_trust=pulumi.get(__ret__, 'ip_dhcp_snooping_trust'),
        ip_proxy_arp=pulumi.get(__ret__, 'ip_proxy_arp'),
        ip_redirects=pulumi.get(__ret__, 'ip_redirects'),
        ip_unreachables=pulumi.get(__ret__, 'ip_unreachables'),
        ipv4_address=pulumi.get(__ret__, 'ipv4_address'),
        ipv4_address_mask=pulumi.get(__ret__, 'ipv4_address_mask'),
        ipv6_address_autoconfig_default=pulumi.get(__ret__, 'ipv6_address_autoconfig_default'),
        ipv6_address_dhcp=pulumi.get(__ret__, 'ipv6_address_dhcp'),
        ipv6_addresses=pulumi.get(__ret__, 'ipv6_addresses'),
        ipv6_enable=pulumi.get(__ret__, 'ipv6_enable'),
        ipv6_link_local_addresses=pulumi.get(__ret__, 'ipv6_link_local_addresses'),
        ipv6_mtu=pulumi.get(__ret__, 'ipv6_mtu'),
        ipv6_nd_ra_suppress_all=pulumi.get(__ret__, 'ipv6_nd_ra_suppress_all'),
        name=pulumi.get(__ret__, 'name'),
        shutdown=pulumi.get(__ret__, 'shutdown'),
        spanning_tree_guard=pulumi.get(__ret__, 'spanning_tree_guard'),
        spanning_tree_link_type=pulumi.get(__ret__, 'spanning_tree_link_type'),
        switchport=pulumi.get(__ret__, 'switchport'),
        trust_device=pulumi.get(__ret__, 'trust_device'),
        vrf_forwarding=pulumi.get(__ret__, 'vrf_forwarding'))


@_utilities.lift_output_func(get_interface_port_channel)
def get_interface_port_channel_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                                      name: Optional[pulumi.Input[int]] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetInterfacePortChannelResult]:
    """
    This data source can read the Interface Port Channel configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_interface_port_channel(name=10)
    ```


    :param str device: A device name from the provider configuration.
    """
    ...
