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
    'GetPolicyMapResult',
    'AwaitableGetPolicyMapResult',
    'get_policy_map',
    'get_policy_map_output',
]

@pulumi.output_type
class GetPolicyMapResult:
    """
    A collection of values returned by getPolicyMap.
    """
    def __init__(__self__, device=None, id=None, name=None, subscriber=None, type=None):
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if subscriber and not isinstance(subscriber, bool):
            raise TypeError("Expected argument 'subscriber' to be a bool")
        pulumi.set(__self__, "subscriber", subscriber)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

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
        Name of the policy map
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def subscriber(self) -> bool:
        """
        Domain name of the policy map
        """
        return pulumi.get(self, "subscriber")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        type of the policy-map
        """
        return pulumi.get(self, "type")


class AwaitableGetPolicyMapResult(GetPolicyMapResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPolicyMapResult(
            device=self.device,
            id=self.id,
            name=self.name,
            subscriber=self.subscriber,
            type=self.type)


def get_policy_map(device: Optional[str] = None,
                   name: Optional[str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPolicyMapResult:
    """
    This data source can read the Policy Map configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_policy_map(name="dot1x_policy")
    ```


    :param str device: A device name from the provider configuration.
    :param str name: Name of the policy map
    """
    __args__ = dict()
    __args__['device'] = device
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:iosxe/getPolicyMap:getPolicyMap', __args__, opts=opts, typ=GetPolicyMapResult).value

    return AwaitableGetPolicyMapResult(
        device=pulumi.get(__ret__, 'device'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        subscriber=pulumi.get(__ret__, 'subscriber'),
        type=pulumi.get(__ret__, 'type'))


@_utilities.lift_output_func(get_policy_map)
def get_policy_map_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                          name: Optional[pulumi.Input[str]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPolicyMapResult]:
    """
    This data source can read the Policy Map configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_policy_map(name="dot1x_policy")
    ```


    :param str device: A device name from the provider configuration.
    :param str name: Name of the policy map
    """
    ...
