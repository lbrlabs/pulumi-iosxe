# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetVlanAccessMapResult',
    'AwaitableGetVlanAccessMapResult',
    'get_vlan_access_map',
    'get_vlan_access_map_output',
]

@pulumi.output_type
class GetVlanAccessMapResult:
    """
    A collection of values returned by getVlanAccessMap.
    """
    def __init__(__self__, action=None, device=None, id=None, match_ip_addresses=None, match_ipv6_addresses=None, name=None, sequence=None):
        if action and not isinstance(action, str):
            raise TypeError("Expected argument 'action' to be a str")
        pulumi.set(__self__, "action", action)
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if match_ip_addresses and not isinstance(match_ip_addresses, list):
            raise TypeError("Expected argument 'match_ip_addresses' to be a list")
        pulumi.set(__self__, "match_ip_addresses", match_ip_addresses)
        if match_ipv6_addresses and not isinstance(match_ipv6_addresses, list):
            raise TypeError("Expected argument 'match_ipv6_addresses' to be a list")
        pulumi.set(__self__, "match_ipv6_addresses", match_ipv6_addresses)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if sequence and not isinstance(sequence, int):
            raise TypeError("Expected argument 'sequence' to be a int")
        pulumi.set(__self__, "sequence", sequence)

    @property
    @pulumi.getter
    def action(self) -> str:
        """
        Take the action
        """
        return pulumi.get(self, "action")

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
    @pulumi.getter(name="matchIpAddresses")
    def match_ip_addresses(self) -> Sequence[str]:
        return pulumi.get(self, "match_ip_addresses")

    @property
    @pulumi.getter(name="matchIpv6Addresses")
    def match_ipv6_addresses(self) -> Sequence[str]:
        """
        Match IPv6 address to access control.
        """
        return pulumi.get(self, "match_ipv6_addresses")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Vlan access map tag
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def sequence(self) -> int:
        """
        Sequence to insert to/delete from existing vlan access-map entry
        """
        return pulumi.get(self, "sequence")


class AwaitableGetVlanAccessMapResult(GetVlanAccessMapResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVlanAccessMapResult(
            action=self.action,
            device=self.device,
            id=self.id,
            match_ip_addresses=self.match_ip_addresses,
            match_ipv6_addresses=self.match_ipv6_addresses,
            name=self.name,
            sequence=self.sequence)


def get_vlan_access_map(device: Optional[str] = None,
                        name: Optional[str] = None,
                        sequence: Optional[int] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVlanAccessMapResult:
    """
    This data source can read the VLAN Access Map configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_vlan_access_map(name="VAM1",
        sequence=10)
    ```


    :param str device: A device name from the provider configuration.
    :param str name: Vlan access map tag
    :param int sequence: Sequence to insert to/delete from existing vlan access-map entry
    """
    __args__ = dict()
    __args__['device'] = device
    __args__['name'] = name
    __args__['sequence'] = sequence
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:iosxe/getVlanAccessMap:getVlanAccessMap', __args__, opts=opts, typ=GetVlanAccessMapResult).value

    return AwaitableGetVlanAccessMapResult(
        action=pulumi.get(__ret__, 'action'),
        device=pulumi.get(__ret__, 'device'),
        id=pulumi.get(__ret__, 'id'),
        match_ip_addresses=pulumi.get(__ret__, 'match_ip_addresses'),
        match_ipv6_addresses=pulumi.get(__ret__, 'match_ipv6_addresses'),
        name=pulumi.get(__ret__, 'name'),
        sequence=pulumi.get(__ret__, 'sequence'))


@_utilities.lift_output_func(get_vlan_access_map)
def get_vlan_access_map_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                               name: Optional[pulumi.Input[str]] = None,
                               sequence: Optional[pulumi.Input[int]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetVlanAccessMapResult]:
    """
    This data source can read the VLAN Access Map configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_vlan_access_map(name="VAM1",
        sequence=10)
    ```


    :param str device: A device name from the provider configuration.
    :param str name: Vlan access map tag
    :param int sequence: Sequence to insert to/delete from existing vlan access-map entry
    """
    ...
