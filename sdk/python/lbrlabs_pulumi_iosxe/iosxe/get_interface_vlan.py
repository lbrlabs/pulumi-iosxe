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
    'GetInterfaceVlanResult',
    'AwaitableGetInterfaceVlanResult',
    'get_interface_vlan',
    'get_interface_vlan_output',
]

@pulumi.output_type
class GetInterfaceVlanResult:
    """
    A collection of values returned by getInterfaceVlan.
    """
    def __init__(__self__, autostate=None, bfd_echo=None, bfd_enable=None, bfd_interval=None, bfd_interval_min_rx=None, bfd_interval_multiplier=None, bfd_local_address=None, bfd_template=None, description=None, device=None, helper_addresses=None, id=None, ip_access_group_in=None, ip_access_group_in_enable=None, ip_access_group_out=None, ip_access_group_out_enable=None, ip_dhcp_relay_source_interface=None, ip_proxy_arp=None, ip_redirects=None, ip_unreachables=None, ipv4_address=None, ipv4_address_mask=None, ipv6_address_autoconfig_default=None, ipv6_address_dhcp=None, ipv6_addresses=None, ipv6_enable=None, ipv6_link_local_addresses=None, ipv6_mtu=None, ipv6_nd_ra_suppress_all=None, name=None, shutdown=None, unnumbered=None, vrf_forwarding=None):
        if autostate and not isinstance(autostate, bool):
            raise TypeError("Expected argument 'autostate' to be a bool")
        pulumi.set(__self__, "autostate", autostate)
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
        if ip_dhcp_relay_source_interface and not isinstance(ip_dhcp_relay_source_interface, str):
            raise TypeError("Expected argument 'ip_dhcp_relay_source_interface' to be a str")
        pulumi.set(__self__, "ip_dhcp_relay_source_interface", ip_dhcp_relay_source_interface)
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
        if unnumbered and not isinstance(unnumbered, str):
            raise TypeError("Expected argument 'unnumbered' to be a str")
        pulumi.set(__self__, "unnumbered", unnumbered)
        if vrf_forwarding and not isinstance(vrf_forwarding, str):
            raise TypeError("Expected argument 'vrf_forwarding' to be a str")
        pulumi.set(__self__, "vrf_forwarding", vrf_forwarding)

    @property
    @pulumi.getter
    def autostate(self) -> bool:
        return pulumi.get(self, "autostate")

    @property
    @pulumi.getter(name="bfdEcho")
    def bfd_echo(self) -> bool:
        return pulumi.get(self, "bfd_echo")

    @property
    @pulumi.getter(name="bfdEnable")
    def bfd_enable(self) -> bool:
        return pulumi.get(self, "bfd_enable")

    @property
    @pulumi.getter(name="bfdInterval")
    def bfd_interval(self) -> int:
        return pulumi.get(self, "bfd_interval")

    @property
    @pulumi.getter(name="bfdIntervalMinRx")
    def bfd_interval_min_rx(self) -> int:
        return pulumi.get(self, "bfd_interval_min_rx")

    @property
    @pulumi.getter(name="bfdIntervalMultiplier")
    def bfd_interval_multiplier(self) -> int:
        return pulumi.get(self, "bfd_interval_multiplier")

    @property
    @pulumi.getter(name="bfdLocalAddress")
    def bfd_local_address(self) -> str:
        return pulumi.get(self, "bfd_local_address")

    @property
    @pulumi.getter(name="bfdTemplate")
    def bfd_template(self) -> str:
        return pulumi.get(self, "bfd_template")

    @property
    @pulumi.getter
    def description(self) -> str:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def device(self) -> Optional[str]:
        return pulumi.get(self, "device")

    @property
    @pulumi.getter(name="helperAddresses")
    def helper_addresses(self) -> Sequence['outputs.GetInterfaceVlanHelperAddressResult']:
        return pulumi.get(self, "helper_addresses")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipAccessGroupIn")
    def ip_access_group_in(self) -> str:
        return pulumi.get(self, "ip_access_group_in")

    @property
    @pulumi.getter(name="ipAccessGroupInEnable")
    def ip_access_group_in_enable(self) -> bool:
        return pulumi.get(self, "ip_access_group_in_enable")

    @property
    @pulumi.getter(name="ipAccessGroupOut")
    def ip_access_group_out(self) -> str:
        return pulumi.get(self, "ip_access_group_out")

    @property
    @pulumi.getter(name="ipAccessGroupOutEnable")
    def ip_access_group_out_enable(self) -> bool:
        return pulumi.get(self, "ip_access_group_out_enable")

    @property
    @pulumi.getter(name="ipDhcpRelaySourceInterface")
    def ip_dhcp_relay_source_interface(self) -> str:
        return pulumi.get(self, "ip_dhcp_relay_source_interface")

    @property
    @pulumi.getter(name="ipProxyArp")
    def ip_proxy_arp(self) -> bool:
        return pulumi.get(self, "ip_proxy_arp")

    @property
    @pulumi.getter(name="ipRedirects")
    def ip_redirects(self) -> bool:
        return pulumi.get(self, "ip_redirects")

    @property
    @pulumi.getter(name="ipUnreachables")
    def ip_unreachables(self) -> bool:
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
        return pulumi.get(self, "ipv6_address_autoconfig_default")

    @property
    @pulumi.getter(name="ipv6AddressDhcp")
    def ipv6_address_dhcp(self) -> bool:
        return pulumi.get(self, "ipv6_address_dhcp")

    @property
    @pulumi.getter(name="ipv6Addresses")
    def ipv6_addresses(self) -> Sequence['outputs.GetInterfaceVlanIpv6AddressResult']:
        return pulumi.get(self, "ipv6_addresses")

    @property
    @pulumi.getter(name="ipv6Enable")
    def ipv6_enable(self) -> bool:
        return pulumi.get(self, "ipv6_enable")

    @property
    @pulumi.getter(name="ipv6LinkLocalAddresses")
    def ipv6_link_local_addresses(self) -> Sequence['outputs.GetInterfaceVlanIpv6LinkLocalAddressResult']:
        return pulumi.get(self, "ipv6_link_local_addresses")

    @property
    @pulumi.getter(name="ipv6Mtu")
    def ipv6_mtu(self) -> int:
        return pulumi.get(self, "ipv6_mtu")

    @property
    @pulumi.getter(name="ipv6NdRaSuppressAll")
    def ipv6_nd_ra_suppress_all(self) -> bool:
        return pulumi.get(self, "ipv6_nd_ra_suppress_all")

    @property
    @pulumi.getter
    def name(self) -> int:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def shutdown(self) -> bool:
        return pulumi.get(self, "shutdown")

    @property
    @pulumi.getter
    def unnumbered(self) -> str:
        return pulumi.get(self, "unnumbered")

    @property
    @pulumi.getter(name="vrfForwarding")
    def vrf_forwarding(self) -> str:
        return pulumi.get(self, "vrf_forwarding")


class AwaitableGetInterfaceVlanResult(GetInterfaceVlanResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInterfaceVlanResult(
            autostate=self.autostate,
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
            ip_dhcp_relay_source_interface=self.ip_dhcp_relay_source_interface,
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
            unnumbered=self.unnumbered,
            vrf_forwarding=self.vrf_forwarding)


def get_interface_vlan(device: Optional[str] = None,
                       name: Optional[int] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInterfaceVlanResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['device'] = device
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:iosxe/getInterfaceVlan:getInterfaceVlan', __args__, opts=opts, typ=GetInterfaceVlanResult).value

    return AwaitableGetInterfaceVlanResult(
        autostate=pulumi.get(__ret__, 'autostate'),
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
        ip_dhcp_relay_source_interface=pulumi.get(__ret__, 'ip_dhcp_relay_source_interface'),
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
        unnumbered=pulumi.get(__ret__, 'unnumbered'),
        vrf_forwarding=pulumi.get(__ret__, 'vrf_forwarding'))


@_utilities.lift_output_func(get_interface_vlan)
def get_interface_vlan_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                              name: Optional[pulumi.Input[int]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetInterfaceVlanResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...