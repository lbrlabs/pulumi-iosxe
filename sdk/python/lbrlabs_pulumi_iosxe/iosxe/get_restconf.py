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
    'GetRestconfResult',
    'AwaitableGetRestconfResult',
    'get_restconf',
    'get_restconf_output',
]

@pulumi.output_type
class GetRestconfResult:
    """
    A collection of values returned by getRestconf.
    """
    def __init__(__self__, attributes=None, device=None, id=None, path=None):
        if attributes and not isinstance(attributes, dict):
            raise TypeError("Expected argument 'attributes' to be a dict")
        pulumi.set(__self__, "attributes", attributes)
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if path and not isinstance(path, str):
            raise TypeError("Expected argument 'path' to be a str")
        pulumi.set(__self__, "path", path)

    @property
    @pulumi.getter
    def attributes(self) -> Mapping[str, str]:
        """
        Map of key-value pairs which represents the attributes and its values.
        """
        return pulumi.get(self, "attributes")

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
    def path(self) -> str:
        """
        A RESTCONF path, e.g. `openconfig-interfaces:interfaces`.
        """
        return pulumi.get(self, "path")


class AwaitableGetRestconfResult(GetRestconfResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRestconfResult(
            attributes=self.attributes,
            device=self.device,
            id=self.id,
            path=self.path)


def get_restconf(device: Optional[str] = None,
                 path: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRestconfResult:
    """
    This data source can retrieve one or more attributes via RESTCONF.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_restconf(path="Cisco-IOS-XE-native:native/banner/login")
    ```


    :param str device: A device name from the provider configuration.
    :param str path: A RESTCONF path, e.g. `openconfig-interfaces:interfaces`.
    """
    __args__ = dict()
    __args__['device'] = device
    __args__['path'] = path
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:iosxe/getRestconf:getRestconf', __args__, opts=opts, typ=GetRestconfResult).value

    return AwaitableGetRestconfResult(
        attributes=pulumi.get(__ret__, 'attributes'),
        device=pulumi.get(__ret__, 'device'),
        id=pulumi.get(__ret__, 'id'),
        path=pulumi.get(__ret__, 'path'))


@_utilities.lift_output_func(get_restconf)
def get_restconf_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                        path: Optional[pulumi.Input[str]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRestconfResult]:
    """
    This data source can retrieve one or more attributes via RESTCONF.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_restconf(path="Cisco-IOS-XE-native:native/banner/login")
    ```


    :param str device: A device name from the provider configuration.
    :param str path: A RESTCONF path, e.g. `openconfig-interfaces:interfaces`.
    """
    ...
