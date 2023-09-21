# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetLineResult',
    'AwaitableGetLineResult',
    'get_line',
    'get_line_output',
]

@pulumi.output_type
class GetLineResult:
    """
    A collection of values returned by getLine.
    """
    def __init__(__self__, consoles=None, device=None, id=None, vties=None):
        if consoles and not isinstance(consoles, list):
            raise TypeError("Expected argument 'consoles' to be a list")
        pulumi.set(__self__, "consoles", consoles)
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if vties and not isinstance(vties, list):
            raise TypeError("Expected argument 'vties' to be a list")
        pulumi.set(__self__, "vties", vties)

    @property
    @pulumi.getter
    def consoles(self) -> Sequence['outputs.GetLineConsoleResult']:
        """
        Primary terminal line
        """
        return pulumi.get(self, "consoles")

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
    def vties(self) -> Sequence['outputs.GetLineVtyResult']:
        """
        Virtual terminal
        """
        return pulumi.get(self, "vties")


class AwaitableGetLineResult(GetLineResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLineResult(
            consoles=self.consoles,
            device=self.device,
            id=self.id,
            vties=self.vties)


def get_line(device: Optional[str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetLineResult:
    """
    This data source can read the Line configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.get_line()
    ```


    :param str device: A device name from the provider configuration.
    """
    __args__ = dict()
    __args__['device'] = device
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:index/getLine:getLine', __args__, opts=opts, typ=GetLineResult).value

    return AwaitableGetLineResult(
        consoles=pulumi.get(__ret__, 'consoles'),
        device=pulumi.get(__ret__, 'device'),
        id=pulumi.get(__ret__, 'id'),
        vties=pulumi.get(__ret__, 'vties'))


@_utilities.lift_output_func(get_line)
def get_line_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetLineResult]:
    """
    This data source can read the Line configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.get_line()
    ```


    :param str device: A device name from the provider configuration.
    """
    ...
