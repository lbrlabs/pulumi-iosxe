# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetVlanResult',
    'AwaitableGetVlanResult',
    'get_vlan',
    'get_vlan_output',
]

@pulumi.output_type
class GetVlanResult:
    """
    A collection of values returned by getVlan.
    """
    def __init__(__self__, device=None, id=None, name=None, private_vlan_association=None, private_vlan_community=None, private_vlan_isolated=None, private_vlan_primary=None, remote_span=None, shutdown=None, vlan_id=None):
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if private_vlan_association and not isinstance(private_vlan_association, str):
            raise TypeError("Expected argument 'private_vlan_association' to be a str")
        pulumi.set(__self__, "private_vlan_association", private_vlan_association)
        if private_vlan_community and not isinstance(private_vlan_community, bool):
            raise TypeError("Expected argument 'private_vlan_community' to be a bool")
        pulumi.set(__self__, "private_vlan_community", private_vlan_community)
        if private_vlan_isolated and not isinstance(private_vlan_isolated, bool):
            raise TypeError("Expected argument 'private_vlan_isolated' to be a bool")
        pulumi.set(__self__, "private_vlan_isolated", private_vlan_isolated)
        if private_vlan_primary and not isinstance(private_vlan_primary, bool):
            raise TypeError("Expected argument 'private_vlan_primary' to be a bool")
        pulumi.set(__self__, "private_vlan_primary", private_vlan_primary)
        if remote_span and not isinstance(remote_span, bool):
            raise TypeError("Expected argument 'remote_span' to be a bool")
        pulumi.set(__self__, "remote_span", remote_span)
        if shutdown and not isinstance(shutdown, bool):
            raise TypeError("Expected argument 'shutdown' to be a bool")
        pulumi.set(__self__, "shutdown", shutdown)
        if vlan_id and not isinstance(vlan_id, int):
            raise TypeError("Expected argument 'vlan_id' to be a int")
        pulumi.set(__self__, "vlan_id", vlan_id)

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
    def name(self) -> str:
        """
        Ascii name of the VLAN
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="privateVlanAssociation")
    def private_vlan_association(self) -> str:
        """
        Configure association between private VLANs
        """
        return pulumi.get(self, "private_vlan_association")

    @property
    @pulumi.getter(name="privateVlanCommunity")
    def private_vlan_community(self) -> bool:
        """
        Configure the VLAN as a community private VLAN
        """
        return pulumi.get(self, "private_vlan_community")

    @property
    @pulumi.getter(name="privateVlanIsolated")
    def private_vlan_isolated(self) -> bool:
        """
        Configure the VLAN as an isolated private VLAN
        """
        return pulumi.get(self, "private_vlan_isolated")

    @property
    @pulumi.getter(name="privateVlanPrimary")
    def private_vlan_primary(self) -> bool:
        """
        Configure the VLAN as a primary private VLAN
        """
        return pulumi.get(self, "private_vlan_primary")

    @property
    @pulumi.getter(name="remoteSpan")
    def remote_span(self) -> bool:
        """
        Configure as Remote SPAN VLAN
        """
        return pulumi.get(self, "remote_span")

    @property
    @pulumi.getter
    def shutdown(self) -> bool:
        """
        Shutdown VLAN switching
        """
        return pulumi.get(self, "shutdown")

    @property
    @pulumi.getter(name="vlanId")
    def vlan_id(self) -> int:
        """
        a single VLAN id (allowed value range 1-4094)or Comma-separated VLAN id range.e.g. 99 or 1-30 or  1-20,30,40-50
        """
        return pulumi.get(self, "vlan_id")


class AwaitableGetVlanResult(GetVlanResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVlanResult(
            device=self.device,
            id=self.id,
            name=self.name,
            private_vlan_association=self.private_vlan_association,
            private_vlan_community=self.private_vlan_community,
            private_vlan_isolated=self.private_vlan_isolated,
            private_vlan_primary=self.private_vlan_primary,
            remote_span=self.remote_span,
            shutdown=self.shutdown,
            vlan_id=self.vlan_id)


def get_vlan(device: Optional[str] = None,
             vlan_id: Optional[int] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVlanResult:
    """
    This data source can read the VLAN configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.get_vlan(vlan_id=123)
    ```


    :param str device: A device name from the provider configuration.
    :param int vlan_id: a single VLAN id (allowed value range 1-4094)or Comma-separated VLAN id range.e.g. 99 or 1-30 or  1-20,30,40-50
    """
    __args__ = dict()
    __args__['device'] = device
    __args__['vlanId'] = vlan_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:index/getVlan:getVlan', __args__, opts=opts, typ=GetVlanResult).value

    return AwaitableGetVlanResult(
        device=pulumi.get(__ret__, 'device'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        private_vlan_association=pulumi.get(__ret__, 'private_vlan_association'),
        private_vlan_community=pulumi.get(__ret__, 'private_vlan_community'),
        private_vlan_isolated=pulumi.get(__ret__, 'private_vlan_isolated'),
        private_vlan_primary=pulumi.get(__ret__, 'private_vlan_primary'),
        remote_span=pulumi.get(__ret__, 'remote_span'),
        shutdown=pulumi.get(__ret__, 'shutdown'),
        vlan_id=pulumi.get(__ret__, 'vlan_id'))


@_utilities.lift_output_func(get_vlan)
def get_vlan_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                    vlan_id: Optional[pulumi.Input[int]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetVlanResult]:
    """
    This data source can read the VLAN configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.get_vlan(vlan_id=123)
    ```


    :param str device: A device name from the provider configuration.
    :param int vlan_id: a single VLAN id (allowed value range 1-4094)or Comma-separated VLAN id range.e.g. 99 or 1-30 or  1-20,30,40-50
    """
    ...
