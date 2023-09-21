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
    'GetPrefixListResult',
    'AwaitableGetPrefixListResult',
    'get_prefix_list',
    'get_prefix_list_output',
]

@pulumi.output_type
class GetPrefixListResult:
    """
    A collection of values returned by getPrefixList.
    """
    def __init__(__self__, device=None, id=None, prefixes=None):
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if prefixes and not isinstance(prefixes, list):
            raise TypeError("Expected argument 'prefixes' to be a list")
        pulumi.set(__self__, "prefixes", prefixes)

    @property
    @pulumi.getter
    def device(self) -> Optional[str]:
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def prefixes(self) -> Sequence['outputs.GetPrefixListPrefixResult']:
        return pulumi.get(self, "prefixes")


class AwaitableGetPrefixListResult(GetPrefixListResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPrefixListResult(
            device=self.device,
            id=self.id,
            prefixes=self.prefixes)


def get_prefix_list(device: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPrefixListResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['device'] = device
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:iosxe/getPrefixList:getPrefixList', __args__, opts=opts, typ=GetPrefixListResult).value

    return AwaitableGetPrefixListResult(
        device=pulumi.get(__ret__, 'device'),
        id=pulumi.get(__ret__, 'id'),
        prefixes=pulumi.get(__ret__, 'prefixes'))


@_utilities.lift_output_func(get_prefix_list)
def get_prefix_list_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPrefixListResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...
