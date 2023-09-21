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
    'GetSnmpServerGroupResult',
    'AwaitableGetSnmpServerGroupResult',
    'get_snmp_server_group',
    'get_snmp_server_group_output',
]

@pulumi.output_type
class GetSnmpServerGroupResult:
    """
    A collection of values returned by getSnmpServerGroup.
    """
    def __init__(__self__, device=None, id=None, name=None, v3_securities=None):
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if v3_securities and not isinstance(v3_securities, list):
            raise TypeError("Expected argument 'v3_securities' to be a list")
        pulumi.set(__self__, "v3_securities", v3_securities)

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
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="v3Securities")
    def v3_securities(self) -> Sequence['outputs.GetSnmpServerGroupV3SecurityResult']:
        """
        group using security Level
        """
        return pulumi.get(self, "v3_securities")


class AwaitableGetSnmpServerGroupResult(GetSnmpServerGroupResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSnmpServerGroupResult(
            device=self.device,
            id=self.id,
            name=self.name,
            v3_securities=self.v3_securities)


def get_snmp_server_group(device: Optional[str] = None,
                          name: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSnmpServerGroupResult:
    """
    This data source can read the SNMP Server Group configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.get_snmp_server_group(name="GROUP1")
    ```


    :param str device: A device name from the provider configuration.
    """
    __args__ = dict()
    __args__['device'] = device
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:index/getSnmpServerGroup:getSnmpServerGroup', __args__, opts=opts, typ=GetSnmpServerGroupResult).value

    return AwaitableGetSnmpServerGroupResult(
        device=pulumi.get(__ret__, 'device'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        v3_securities=pulumi.get(__ret__, 'v3_securities'))


@_utilities.lift_output_func(get_snmp_server_group)
def get_snmp_server_group_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                                 name: Optional[pulumi.Input[str]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSnmpServerGroupResult]:
    """
    This data source can read the SNMP Server Group configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.get_snmp_server_group(name="GROUP1")
    ```


    :param str device: A device name from the provider configuration.
    """
    ...
