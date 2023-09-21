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
    'GetAccessListExtendedResult',
    'AwaitableGetAccessListExtendedResult',
    'get_access_list_extended',
    'get_access_list_extended_output',
]

@pulumi.output_type
class GetAccessListExtendedResult:
    """
    A collection of values returned by getAccessListExtended.
    """
    def __init__(__self__, device=None, entries=None, id=None, name=None):
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if entries and not isinstance(entries, list):
            raise TypeError("Expected argument 'entries' to be a list")
        pulumi.set(__self__, "entries", entries)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def device(self) -> Optional[str]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def entries(self) -> Sequence['outputs.GetAccessListExtendedEntryResult']:
        return pulumi.get(self, "entries")

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
        return pulumi.get(self, "name")


class AwaitableGetAccessListExtendedResult(GetAccessListExtendedResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccessListExtendedResult(
            device=self.device,
            entries=self.entries,
            id=self.id,
            name=self.name)


def get_access_list_extended(device: Optional[str] = None,
                             name: Optional[str] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccessListExtendedResult:
    """
    This data source can read the Access List Extended configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_access_list_extended(name="EACL1")
    ```


    :param str device: A device name from the provider configuration.
    """
    __args__ = dict()
    __args__['device'] = device
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:iosxe/getAccessListExtended:getAccessListExtended', __args__, opts=opts, typ=GetAccessListExtendedResult).value

    return AwaitableGetAccessListExtendedResult(
        device=pulumi.get(__ret__, 'device'),
        entries=pulumi.get(__ret__, 'entries'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'))


@_utilities.lift_output_func(get_access_list_extended)
def get_access_list_extended_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                                    name: Optional[pulumi.Input[str]] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAccessListExtendedResult]:
    """
    This data source can read the Access List Extended configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_access_list_extended(name="EACL1")
    ```


    :param str device: A device name from the provider configuration.
    """
    ...
