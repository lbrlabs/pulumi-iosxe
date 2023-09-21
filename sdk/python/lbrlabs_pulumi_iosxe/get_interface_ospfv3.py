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
    'GetInterfaceOspfv3Result',
    'AwaitableGetInterfaceOspfv3Result',
    'get_interface_ospfv3',
    'get_interface_ospfv3_output',
]

@pulumi.output_type
class GetInterfaceOspfv3Result:
    """
    A collection of values returned by getInterfaceOspfv3.
    """
    def __init__(__self__, cost=None, device=None, id=None, name=None, network_type_broadcast=None, network_type_non_broadcast=None, network_type_point_to_multipoint=None, network_type_point_to_point=None, type=None):
        if cost and not isinstance(cost, int):
            raise TypeError("Expected argument 'cost' to be a int")
        pulumi.set(__self__, "cost", cost)
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if network_type_broadcast and not isinstance(network_type_broadcast, bool):
            raise TypeError("Expected argument 'network_type_broadcast' to be a bool")
        pulumi.set(__self__, "network_type_broadcast", network_type_broadcast)
        if network_type_non_broadcast and not isinstance(network_type_non_broadcast, bool):
            raise TypeError("Expected argument 'network_type_non_broadcast' to be a bool")
        pulumi.set(__self__, "network_type_non_broadcast", network_type_non_broadcast)
        if network_type_point_to_multipoint and not isinstance(network_type_point_to_multipoint, bool):
            raise TypeError("Expected argument 'network_type_point_to_multipoint' to be a bool")
        pulumi.set(__self__, "network_type_point_to_multipoint", network_type_point_to_multipoint)
        if network_type_point_to_point and not isinstance(network_type_point_to_point, bool):
            raise TypeError("Expected argument 'network_type_point_to_point' to be a bool")
        pulumi.set(__self__, "network_type_point_to_point", network_type_point_to_point)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def cost(self) -> int:
        """
        Static route cost value of the interface
        """
        return pulumi.get(self, "cost")

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
    @pulumi.getter(name="networkTypeBroadcast")
    def network_type_broadcast(self) -> bool:
        """
        Specify OSPF broadcast multi-access network
        """
        return pulumi.get(self, "network_type_broadcast")

    @property
    @pulumi.getter(name="networkTypeNonBroadcast")
    def network_type_non_broadcast(self) -> bool:
        """
        Specify OSPF NBMA network
        """
        return pulumi.get(self, "network_type_non_broadcast")

    @property
    @pulumi.getter(name="networkTypePointToMultipoint")
    def network_type_point_to_multipoint(self) -> bool:
        """
        Specify OSPF point-to-multipoint network
        """
        return pulumi.get(self, "network_type_point_to_multipoint")

    @property
    @pulumi.getter(name="networkTypePointToPoint")
    def network_type_point_to_point(self) -> bool:
        """
        Specify OSPF point-to-point network
        """
        return pulumi.get(self, "network_type_point_to_point")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Interface type
        """
        return pulumi.get(self, "type")


class AwaitableGetInterfaceOspfv3Result(GetInterfaceOspfv3Result):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInterfaceOspfv3Result(
            cost=self.cost,
            device=self.device,
            id=self.id,
            name=self.name,
            network_type_broadcast=self.network_type_broadcast,
            network_type_non_broadcast=self.network_type_non_broadcast,
            network_type_point_to_multipoint=self.network_type_point_to_multipoint,
            network_type_point_to_point=self.network_type_point_to_point,
            type=self.type)


def get_interface_ospfv3(device: Optional[str] = None,
                         name: Optional[str] = None,
                         type: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInterfaceOspfv3Result:
    """
    This data source can read the Interface OSPFv3 configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.get_interface_ospfv3(name="1",
        type="Loopback")
    ```


    :param str device: A device name from the provider configuration.
    :param str type: Interface type
    """
    __args__ = dict()
    __args__['device'] = device
    __args__['name'] = name
    __args__['type'] = type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:index/getInterfaceOspfv3:getInterfaceOspfv3', __args__, opts=opts, typ=GetInterfaceOspfv3Result).value

    return AwaitableGetInterfaceOspfv3Result(
        cost=pulumi.get(__ret__, 'cost'),
        device=pulumi.get(__ret__, 'device'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        network_type_broadcast=pulumi.get(__ret__, 'network_type_broadcast'),
        network_type_non_broadcast=pulumi.get(__ret__, 'network_type_non_broadcast'),
        network_type_point_to_multipoint=pulumi.get(__ret__, 'network_type_point_to_multipoint'),
        network_type_point_to_point=pulumi.get(__ret__, 'network_type_point_to_point'),
        type=pulumi.get(__ret__, 'type'))


@_utilities.lift_output_func(get_interface_ospfv3)
def get_interface_ospfv3_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                                name: Optional[pulumi.Input[str]] = None,
                                type: Optional[pulumi.Input[str]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetInterfaceOspfv3Result]:
    """
    This data source can read the Interface OSPFv3 configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.get_interface_ospfv3(name="1",
        type="Loopback")
    ```


    :param str device: A device name from the provider configuration.
    :param str type: Interface type
    """
    ...
