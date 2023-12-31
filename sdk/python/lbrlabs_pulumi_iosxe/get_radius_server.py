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
    'GetRadiusServerResult',
    'AwaitableGetRadiusServerResult',
    'get_radius_server',
    'get_radius_server_output',
]

@pulumi.output_type
class GetRadiusServerResult:
    """
    A collection of values returned by getRadiusServer.
    """
    def __init__(__self__, attributes=None, dead_criteria_time=None, dead_criteria_tries=None, deadtime=None, device=None, id=None):
        if attributes and not isinstance(attributes, list):
            raise TypeError("Expected argument 'attributes' to be a list")
        pulumi.set(__self__, "attributes", attributes)
        if dead_criteria_time and not isinstance(dead_criteria_time, int):
            raise TypeError("Expected argument 'dead_criteria_time' to be a int")
        pulumi.set(__self__, "dead_criteria_time", dead_criteria_time)
        if dead_criteria_tries and not isinstance(dead_criteria_tries, int):
            raise TypeError("Expected argument 'dead_criteria_tries' to be a int")
        pulumi.set(__self__, "dead_criteria_tries", dead_criteria_tries)
        if deadtime and not isinstance(deadtime, int):
            raise TypeError("Expected argument 'deadtime' to be a int")
        pulumi.set(__self__, "deadtime", deadtime)
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter
    def attributes(self) -> Sequence['outputs.GetRadiusServerAttributeResult']:
        """
        Customize selected radius attributes
        """
        return pulumi.get(self, "attributes")

    @property
    @pulumi.getter(name="deadCriteriaTime")
    def dead_criteria_time(self) -> int:
        """
        The time during which no properly formed response must be received from the RADIUS server
        """
        return pulumi.get(self, "dead_criteria_time")

    @property
    @pulumi.getter(name="deadCriteriaTries")
    def dead_criteria_tries(self) -> int:
        """
        The number of times the router must fail to receive a response from the radius server to mark it as dead
        """
        return pulumi.get(self, "dead_criteria_tries")

    @property
    @pulumi.getter
    def deadtime(self) -> int:
        """
        Time to stop using a server that does not respond
        """
        return pulumi.get(self, "deadtime")

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


class AwaitableGetRadiusServerResult(GetRadiusServerResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRadiusServerResult(
            attributes=self.attributes,
            dead_criteria_time=self.dead_criteria_time,
            dead_criteria_tries=self.dead_criteria_tries,
            deadtime=self.deadtime,
            device=self.device,
            id=self.id)


def get_radius_server(device: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRadiusServerResult:
    """
    This data source can read the Radius Server configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.get_radius_server()
    ```


    :param str device: A device name from the provider configuration.
    """
    __args__ = dict()
    __args__['device'] = device
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:index/getRadiusServer:getRadiusServer', __args__, opts=opts, typ=GetRadiusServerResult).value

    return AwaitableGetRadiusServerResult(
        attributes=pulumi.get(__ret__, 'attributes'),
        dead_criteria_time=pulumi.get(__ret__, 'dead_criteria_time'),
        dead_criteria_tries=pulumi.get(__ret__, 'dead_criteria_tries'),
        deadtime=pulumi.get(__ret__, 'deadtime'),
        device=pulumi.get(__ret__, 'device'),
        id=pulumi.get(__ret__, 'id'))


@_utilities.lift_output_func(get_radius_server)
def get_radius_server_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRadiusServerResult]:
    """
    This data source can read the Radius Server configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.get_radius_server()
    ```


    :param str device: A device name from the provider configuration.
    """
    ...
