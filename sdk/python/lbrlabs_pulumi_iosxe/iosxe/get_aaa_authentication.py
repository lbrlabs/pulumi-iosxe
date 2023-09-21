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
    'GetAaaAuthenticationResult',
    'AwaitableGetAaaAuthenticationResult',
    'get_aaa_authentication',
    'get_aaa_authentication_output',
]

@pulumi.output_type
class GetAaaAuthenticationResult:
    """
    A collection of values returned by getAaaAuthentication.
    """
    def __init__(__self__, device=None, dot1x_default_a1_group=None, dot1x_default_a1_local=None, dot1x_default_a2_group=None, dot1x_default_a2_local=None, dot1x_default_a3_group=None, dot1x_default_a3_local=None, dot1x_default_a4_group=None, dot1x_default_a4_local=None, id=None, logins=None):
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if dot1x_default_a1_group and not isinstance(dot1x_default_a1_group, str):
            raise TypeError("Expected argument 'dot1x_default_a1_group' to be a str")
        pulumi.set(__self__, "dot1x_default_a1_group", dot1x_default_a1_group)
        if dot1x_default_a1_local and not isinstance(dot1x_default_a1_local, bool):
            raise TypeError("Expected argument 'dot1x_default_a1_local' to be a bool")
        pulumi.set(__self__, "dot1x_default_a1_local", dot1x_default_a1_local)
        if dot1x_default_a2_group and not isinstance(dot1x_default_a2_group, str):
            raise TypeError("Expected argument 'dot1x_default_a2_group' to be a str")
        pulumi.set(__self__, "dot1x_default_a2_group", dot1x_default_a2_group)
        if dot1x_default_a2_local and not isinstance(dot1x_default_a2_local, bool):
            raise TypeError("Expected argument 'dot1x_default_a2_local' to be a bool")
        pulumi.set(__self__, "dot1x_default_a2_local", dot1x_default_a2_local)
        if dot1x_default_a3_group and not isinstance(dot1x_default_a3_group, str):
            raise TypeError("Expected argument 'dot1x_default_a3_group' to be a str")
        pulumi.set(__self__, "dot1x_default_a3_group", dot1x_default_a3_group)
        if dot1x_default_a3_local and not isinstance(dot1x_default_a3_local, bool):
            raise TypeError("Expected argument 'dot1x_default_a3_local' to be a bool")
        pulumi.set(__self__, "dot1x_default_a3_local", dot1x_default_a3_local)
        if dot1x_default_a4_group and not isinstance(dot1x_default_a4_group, str):
            raise TypeError("Expected argument 'dot1x_default_a4_group' to be a str")
        pulumi.set(__self__, "dot1x_default_a4_group", dot1x_default_a4_group)
        if dot1x_default_a4_local and not isinstance(dot1x_default_a4_local, bool):
            raise TypeError("Expected argument 'dot1x_default_a4_local' to be a bool")
        pulumi.set(__self__, "dot1x_default_a4_local", dot1x_default_a4_local)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if logins and not isinstance(logins, list):
            raise TypeError("Expected argument 'logins' to be a list")
        pulumi.set(__self__, "logins", logins)

    @property
    @pulumi.getter
    def device(self) -> Optional[str]:
        return pulumi.get(self, "device")

    @property
    @pulumi.getter(name="dot1xDefaultA1Group")
    def dot1x_default_a1_group(self) -> str:
        return pulumi.get(self, "dot1x_default_a1_group")

    @property
    @pulumi.getter(name="dot1xDefaultA1Local")
    def dot1x_default_a1_local(self) -> bool:
        return pulumi.get(self, "dot1x_default_a1_local")

    @property
    @pulumi.getter(name="dot1xDefaultA2Group")
    def dot1x_default_a2_group(self) -> str:
        return pulumi.get(self, "dot1x_default_a2_group")

    @property
    @pulumi.getter(name="dot1xDefaultA2Local")
    def dot1x_default_a2_local(self) -> bool:
        return pulumi.get(self, "dot1x_default_a2_local")

    @property
    @pulumi.getter(name="dot1xDefaultA3Group")
    def dot1x_default_a3_group(self) -> str:
        return pulumi.get(self, "dot1x_default_a3_group")

    @property
    @pulumi.getter(name="dot1xDefaultA3Local")
    def dot1x_default_a3_local(self) -> bool:
        return pulumi.get(self, "dot1x_default_a3_local")

    @property
    @pulumi.getter(name="dot1xDefaultA4Group")
    def dot1x_default_a4_group(self) -> str:
        return pulumi.get(self, "dot1x_default_a4_group")

    @property
    @pulumi.getter(name="dot1xDefaultA4Local")
    def dot1x_default_a4_local(self) -> bool:
        return pulumi.get(self, "dot1x_default_a4_local")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def logins(self) -> Sequence['outputs.GetAaaAuthenticationLoginResult']:
        return pulumi.get(self, "logins")


class AwaitableGetAaaAuthenticationResult(GetAaaAuthenticationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAaaAuthenticationResult(
            device=self.device,
            dot1x_default_a1_group=self.dot1x_default_a1_group,
            dot1x_default_a1_local=self.dot1x_default_a1_local,
            dot1x_default_a2_group=self.dot1x_default_a2_group,
            dot1x_default_a2_local=self.dot1x_default_a2_local,
            dot1x_default_a3_group=self.dot1x_default_a3_group,
            dot1x_default_a3_local=self.dot1x_default_a3_local,
            dot1x_default_a4_group=self.dot1x_default_a4_group,
            dot1x_default_a4_local=self.dot1x_default_a4_local,
            id=self.id,
            logins=self.logins)


def get_aaa_authentication(device: Optional[str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAaaAuthenticationResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['device'] = device
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:iosxe/getAaaAuthentication:getAaaAuthentication', __args__, opts=opts, typ=GetAaaAuthenticationResult).value

    return AwaitableGetAaaAuthenticationResult(
        device=pulumi.get(__ret__, 'device'),
        dot1x_default_a1_group=pulumi.get(__ret__, 'dot1x_default_a1_group'),
        dot1x_default_a1_local=pulumi.get(__ret__, 'dot1x_default_a1_local'),
        dot1x_default_a2_group=pulumi.get(__ret__, 'dot1x_default_a2_group'),
        dot1x_default_a2_local=pulumi.get(__ret__, 'dot1x_default_a2_local'),
        dot1x_default_a3_group=pulumi.get(__ret__, 'dot1x_default_a3_group'),
        dot1x_default_a3_local=pulumi.get(__ret__, 'dot1x_default_a3_local'),
        dot1x_default_a4_group=pulumi.get(__ret__, 'dot1x_default_a4_group'),
        dot1x_default_a4_local=pulumi.get(__ret__, 'dot1x_default_a4_local'),
        id=pulumi.get(__ret__, 'id'),
        logins=pulumi.get(__ret__, 'logins'))


@_utilities.lift_output_func(get_aaa_authentication)
def get_aaa_authentication_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAaaAuthenticationResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...