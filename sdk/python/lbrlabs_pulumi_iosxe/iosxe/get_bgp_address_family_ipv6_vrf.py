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
    'GetBgpAddressFamilyIpv6VrfResult',
    'AwaitableGetBgpAddressFamilyIpv6VrfResult',
    'get_bgp_address_family_ipv6_vrf',
    'get_bgp_address_family_ipv6_vrf_output',
]

@pulumi.output_type
class GetBgpAddressFamilyIpv6VrfResult:
    """
    A collection of values returned by getBgpAddressFamilyIpv6Vrf.
    """
    def __init__(__self__, af_name=None, asn=None, device=None, id=None, vrfs=None):
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
        if vrfs and not isinstance(vrfs, list):
            raise TypeError("Expected argument 'vrfs' to be a list")
        pulumi.set(__self__, "vrfs", vrfs)

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
    @pulumi.getter
    def vrfs(self) -> Sequence['outputs.GetBgpAddressFamilyIpv6VrfVrfResult']:
        return pulumi.get(self, "vrfs")


class AwaitableGetBgpAddressFamilyIpv6VrfResult(GetBgpAddressFamilyIpv6VrfResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBgpAddressFamilyIpv6VrfResult(
            af_name=self.af_name,
            asn=self.asn,
            device=self.device,
            id=self.id,
            vrfs=self.vrfs)


def get_bgp_address_family_ipv6_vrf(af_name: Optional[str] = None,
                                    asn: Optional[str] = None,
                                    device: Optional[str] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBgpAddressFamilyIpv6VrfResult:
    """
    This data source can read the BGP Address Family IPv6 VRF configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_bgp_address_family_ipv6_vrf(af_name="unicast",
        asn="65000")
    ```


    :param str device: A device name from the provider configuration.
    """
    __args__ = dict()
    __args__['afName'] = af_name
    __args__['asn'] = asn
    __args__['device'] = device
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:iosxe/getBgpAddressFamilyIpv6Vrf:getBgpAddressFamilyIpv6Vrf', __args__, opts=opts, typ=GetBgpAddressFamilyIpv6VrfResult).value

    return AwaitableGetBgpAddressFamilyIpv6VrfResult(
        af_name=pulumi.get(__ret__, 'af_name'),
        asn=pulumi.get(__ret__, 'asn'),
        device=pulumi.get(__ret__, 'device'),
        id=pulumi.get(__ret__, 'id'),
        vrfs=pulumi.get(__ret__, 'vrfs'))


@_utilities.lift_output_func(get_bgp_address_family_ipv6_vrf)
def get_bgp_address_family_ipv6_vrf_output(af_name: Optional[pulumi.Input[str]] = None,
                                           asn: Optional[pulumi.Input[str]] = None,
                                           device: Optional[pulumi.Input[Optional[str]]] = None,
                                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetBgpAddressFamilyIpv6VrfResult]:
    """
    This data source can read the BGP Address Family IPv6 VRF configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_bgp_address_family_ipv6_vrf(af_name="unicast",
        asn="65000")
    ```


    :param str device: A device name from the provider configuration.
    """
    ...
