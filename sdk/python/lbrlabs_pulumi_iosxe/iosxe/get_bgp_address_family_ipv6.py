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
    'GetBgpAddressFamilyIpv6Result',
    'AwaitableGetBgpAddressFamilyIpv6Result',
    'get_bgp_address_family_ipv6',
    'get_bgp_address_family_ipv6_output',
]

@pulumi.output_type
class GetBgpAddressFamilyIpv6Result:
    """
    A collection of values returned by getBgpAddressFamilyIpv6.
    """
    def __init__(__self__, af_name=None, asn=None, device=None, id=None, ipv6_unicast_networks=None, ipv6_unicast_redistribute_connected=None, ipv6_unicast_redistribute_static=None):
        if af_name and not isinstance(af_name, str):
            raise TypeError("Expected argument 'af_name' to be a str")
        pulumi.set(__self__, "af_name", af_name)
        if asn and not isinstance(asn, str):
            raise TypeError("Expected argument 'asn' to be a str")
        pulumi.set(__self__, "asn", asn)
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ipv6_unicast_networks and not isinstance(ipv6_unicast_networks, list):
            raise TypeError("Expected argument 'ipv6_unicast_networks' to be a list")
        pulumi.set(__self__, "ipv6_unicast_networks", ipv6_unicast_networks)
        if ipv6_unicast_redistribute_connected and not isinstance(ipv6_unicast_redistribute_connected, bool):
            raise TypeError("Expected argument 'ipv6_unicast_redistribute_connected' to be a bool")
        pulumi.set(__self__, "ipv6_unicast_redistribute_connected", ipv6_unicast_redistribute_connected)
        if ipv6_unicast_redistribute_static and not isinstance(ipv6_unicast_redistribute_static, bool):
            raise TypeError("Expected argument 'ipv6_unicast_redistribute_static' to be a bool")
        pulumi.set(__self__, "ipv6_unicast_redistribute_static", ipv6_unicast_redistribute_static)

    @property
    @pulumi.getter(name="afName")
    def af_name(self) -> str:
        return pulumi.get(self, "af_name")

    @property
    @pulumi.getter
    def asn(self) -> str:
        return pulumi.get(self, "asn")

    @property
    @pulumi.getter
    def device(self) -> Optional[str]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The path of the retrieved object.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipv6UnicastNetworks")
    def ipv6_unicast_networks(self) -> Sequence['outputs.GetBgpAddressFamilyIpv6Ipv6UnicastNetworkResult']:
        """
        Specify a network to announce via BGP
        """
        return pulumi.get(self, "ipv6_unicast_networks")

    @property
    @pulumi.getter(name="ipv6UnicastRedistributeConnected")
    def ipv6_unicast_redistribute_connected(self) -> bool:
        """
        Connected
        """
        return pulumi.get(self, "ipv6_unicast_redistribute_connected")

    @property
    @pulumi.getter(name="ipv6UnicastRedistributeStatic")
    def ipv6_unicast_redistribute_static(self) -> bool:
        """
        Static routes
        """
        return pulumi.get(self, "ipv6_unicast_redistribute_static")


class AwaitableGetBgpAddressFamilyIpv6Result(GetBgpAddressFamilyIpv6Result):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBgpAddressFamilyIpv6Result(
            af_name=self.af_name,
            asn=self.asn,
            device=self.device,
            id=self.id,
            ipv6_unicast_networks=self.ipv6_unicast_networks,
            ipv6_unicast_redistribute_connected=self.ipv6_unicast_redistribute_connected,
            ipv6_unicast_redistribute_static=self.ipv6_unicast_redistribute_static)


def get_bgp_address_family_ipv6(af_name: Optional[str] = None,
                                asn: Optional[str] = None,
                                device: Optional[str] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBgpAddressFamilyIpv6Result:
    """
    This data source can read the BGP Address Family IPv6 configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_bgp_address_family_ipv6(af_name="unicast",
        asn="65000")
    ```


    :param str device: A device name from the provider configuration.
    """
    __args__ = dict()
    __args__['afName'] = af_name
    __args__['asn'] = asn
    __args__['device'] = device
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:iosxe/getBgpAddressFamilyIpv6:getBgpAddressFamilyIpv6', __args__, opts=opts, typ=GetBgpAddressFamilyIpv6Result).value

    return AwaitableGetBgpAddressFamilyIpv6Result(
        af_name=pulumi.get(__ret__, 'af_name'),
        asn=pulumi.get(__ret__, 'asn'),
        device=pulumi.get(__ret__, 'device'),
        id=pulumi.get(__ret__, 'id'),
        ipv6_unicast_networks=pulumi.get(__ret__, 'ipv6_unicast_networks'),
        ipv6_unicast_redistribute_connected=pulumi.get(__ret__, 'ipv6_unicast_redistribute_connected'),
        ipv6_unicast_redistribute_static=pulumi.get(__ret__, 'ipv6_unicast_redistribute_static'))


@_utilities.lift_output_func(get_bgp_address_family_ipv6)
def get_bgp_address_family_ipv6_output(af_name: Optional[pulumi.Input[str]] = None,
                                       asn: Optional[pulumi.Input[str]] = None,
                                       device: Optional[pulumi.Input[Optional[str]]] = None,
                                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetBgpAddressFamilyIpv6Result]:
    """
    This data source can read the BGP Address Family IPv6 configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_bgp_address_family_ipv6(af_name="unicast",
        asn="65000")
    ```


    :param str device: A device name from the provider configuration.
    """
    ...
