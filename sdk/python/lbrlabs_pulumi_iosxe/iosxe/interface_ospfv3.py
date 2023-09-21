# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['InterfaceOspfv3Args', 'InterfaceOspfv3']

@pulumi.input_type
class InterfaceOspfv3Args:
    def __init__(__self__, *,
                 type: pulumi.Input[str],
                 cost: Optional[pulumi.Input[int]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network_type_broadcast: Optional[pulumi.Input[bool]] = None,
                 network_type_non_broadcast: Optional[pulumi.Input[bool]] = None,
                 network_type_point_to_multipoint: Optional[pulumi.Input[bool]] = None,
                 network_type_point_to_point: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a InterfaceOspfv3 resource.
        :param pulumi.Input[str] type: Interface type - Choices: `GigabitEthernet`, `TwoGigabitEthernet`, `FiveGigabitEthernet`, `TenGigabitEthernet`,
               `TwentyFiveGigE`, `FortyGigabitEthernet`, `HundredGigE`, `TwoHundredGigE`, `FourHundredGigE`, `Loopback`, `Vlan`,
               `Port-channel`
        :param pulumi.Input[int] cost: Static route cost value of the interface - Range: `1`-`65535`
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[bool] network_type_broadcast: Specify OSPF broadcast multi-access network
        :param pulumi.Input[bool] network_type_non_broadcast: Specify OSPF NBMA network
        :param pulumi.Input[bool] network_type_point_to_multipoint: Specify OSPF point-to-multipoint network
        :param pulumi.Input[bool] network_type_point_to_point: Specify OSPF point-to-point network
        """
        pulumi.set(__self__, "type", type)
        if cost is not None:
            pulumi.set(__self__, "cost", cost)
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if network_type_broadcast is not None:
            pulumi.set(__self__, "network_type_broadcast", network_type_broadcast)
        if network_type_non_broadcast is not None:
            pulumi.set(__self__, "network_type_non_broadcast", network_type_non_broadcast)
        if network_type_point_to_multipoint is not None:
            pulumi.set(__self__, "network_type_point_to_multipoint", network_type_point_to_multipoint)
        if network_type_point_to_point is not None:
            pulumi.set(__self__, "network_type_point_to_point", network_type_point_to_point)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Interface type - Choices: `GigabitEthernet`, `TwoGigabitEthernet`, `FiveGigabitEthernet`, `TenGigabitEthernet`,
        `TwentyFiveGigE`, `FortyGigabitEthernet`, `HundredGigE`, `TwoHundredGigE`, `FourHundredGigE`, `Loopback`, `Vlan`,
        `Port-channel`
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def cost(self) -> Optional[pulumi.Input[int]]:
        """
        Static route cost value of the interface - Range: `1`-`65535`
        """
        return pulumi.get(self, "cost")

    @cost.setter
    def cost(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "cost", value)

    @property
    @pulumi.getter(name="deleteMode")
    def delete_mode(self) -> Optional[pulumi.Input[str]]:
        """
        Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
        managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
        Default value is `all`. - Choices: `all`, `attributes`
        """
        return pulumi.get(self, "delete_mode")

    @delete_mode.setter
    def delete_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delete_mode", value)

    @property
    @pulumi.getter
    def device(self) -> Optional[pulumi.Input[str]]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @device.setter
    def device(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="networkTypeBroadcast")
    def network_type_broadcast(self) -> Optional[pulumi.Input[bool]]:
        """
        Specify OSPF broadcast multi-access network
        """
        return pulumi.get(self, "network_type_broadcast")

    @network_type_broadcast.setter
    def network_type_broadcast(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "network_type_broadcast", value)

    @property
    @pulumi.getter(name="networkTypeNonBroadcast")
    def network_type_non_broadcast(self) -> Optional[pulumi.Input[bool]]:
        """
        Specify OSPF NBMA network
        """
        return pulumi.get(self, "network_type_non_broadcast")

    @network_type_non_broadcast.setter
    def network_type_non_broadcast(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "network_type_non_broadcast", value)

    @property
    @pulumi.getter(name="networkTypePointToMultipoint")
    def network_type_point_to_multipoint(self) -> Optional[pulumi.Input[bool]]:
        """
        Specify OSPF point-to-multipoint network
        """
        return pulumi.get(self, "network_type_point_to_multipoint")

    @network_type_point_to_multipoint.setter
    def network_type_point_to_multipoint(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "network_type_point_to_multipoint", value)

    @property
    @pulumi.getter(name="networkTypePointToPoint")
    def network_type_point_to_point(self) -> Optional[pulumi.Input[bool]]:
        """
        Specify OSPF point-to-point network
        """
        return pulumi.get(self, "network_type_point_to_point")

    @network_type_point_to_point.setter
    def network_type_point_to_point(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "network_type_point_to_point", value)


@pulumi.input_type
class _InterfaceOspfv3State:
    def __init__(__self__, *,
                 cost: Optional[pulumi.Input[int]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network_type_broadcast: Optional[pulumi.Input[bool]] = None,
                 network_type_non_broadcast: Optional[pulumi.Input[bool]] = None,
                 network_type_point_to_multipoint: Optional[pulumi.Input[bool]] = None,
                 network_type_point_to_point: Optional[pulumi.Input[bool]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering InterfaceOspfv3 resources.
        :param pulumi.Input[int] cost: Static route cost value of the interface - Range: `1`-`65535`
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[bool] network_type_broadcast: Specify OSPF broadcast multi-access network
        :param pulumi.Input[bool] network_type_non_broadcast: Specify OSPF NBMA network
        :param pulumi.Input[bool] network_type_point_to_multipoint: Specify OSPF point-to-multipoint network
        :param pulumi.Input[bool] network_type_point_to_point: Specify OSPF point-to-point network
        :param pulumi.Input[str] type: Interface type - Choices: `GigabitEthernet`, `TwoGigabitEthernet`, `FiveGigabitEthernet`, `TenGigabitEthernet`,
               `TwentyFiveGigE`, `FortyGigabitEthernet`, `HundredGigE`, `TwoHundredGigE`, `FourHundredGigE`, `Loopback`, `Vlan`,
               `Port-channel`
        """
        if cost is not None:
            pulumi.set(__self__, "cost", cost)
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if network_type_broadcast is not None:
            pulumi.set(__self__, "network_type_broadcast", network_type_broadcast)
        if network_type_non_broadcast is not None:
            pulumi.set(__self__, "network_type_non_broadcast", network_type_non_broadcast)
        if network_type_point_to_multipoint is not None:
            pulumi.set(__self__, "network_type_point_to_multipoint", network_type_point_to_multipoint)
        if network_type_point_to_point is not None:
            pulumi.set(__self__, "network_type_point_to_point", network_type_point_to_point)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def cost(self) -> Optional[pulumi.Input[int]]:
        """
        Static route cost value of the interface - Range: `1`-`65535`
        """
        return pulumi.get(self, "cost")

    @cost.setter
    def cost(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "cost", value)

    @property
    @pulumi.getter(name="deleteMode")
    def delete_mode(self) -> Optional[pulumi.Input[str]]:
        """
        Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
        managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
        Default value is `all`. - Choices: `all`, `attributes`
        """
        return pulumi.get(self, "delete_mode")

    @delete_mode.setter
    def delete_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delete_mode", value)

    @property
    @pulumi.getter
    def device(self) -> Optional[pulumi.Input[str]]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @device.setter
    def device(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="networkTypeBroadcast")
    def network_type_broadcast(self) -> Optional[pulumi.Input[bool]]:
        """
        Specify OSPF broadcast multi-access network
        """
        return pulumi.get(self, "network_type_broadcast")

    @network_type_broadcast.setter
    def network_type_broadcast(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "network_type_broadcast", value)

    @property
    @pulumi.getter(name="networkTypeNonBroadcast")
    def network_type_non_broadcast(self) -> Optional[pulumi.Input[bool]]:
        """
        Specify OSPF NBMA network
        """
        return pulumi.get(self, "network_type_non_broadcast")

    @network_type_non_broadcast.setter
    def network_type_non_broadcast(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "network_type_non_broadcast", value)

    @property
    @pulumi.getter(name="networkTypePointToMultipoint")
    def network_type_point_to_multipoint(self) -> Optional[pulumi.Input[bool]]:
        """
        Specify OSPF point-to-multipoint network
        """
        return pulumi.get(self, "network_type_point_to_multipoint")

    @network_type_point_to_multipoint.setter
    def network_type_point_to_multipoint(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "network_type_point_to_multipoint", value)

    @property
    @pulumi.getter(name="networkTypePointToPoint")
    def network_type_point_to_point(self) -> Optional[pulumi.Input[bool]]:
        """
        Specify OSPF point-to-point network
        """
        return pulumi.get(self, "network_type_point_to_point")

    @network_type_point_to_point.setter
    def network_type_point_to_point(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "network_type_point_to_point", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Interface type - Choices: `GigabitEthernet`, `TwoGigabitEthernet`, `FiveGigabitEthernet`, `TenGigabitEthernet`,
        `TwentyFiveGigE`, `FortyGigabitEthernet`, `HundredGigE`, `TwoHundredGigE`, `FourHundredGigE`, `Loopback`, `Vlan`,
        `Port-channel`
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class InterfaceOspfv3(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cost: Optional[pulumi.Input[int]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network_type_broadcast: Optional[pulumi.Input[bool]] = None,
                 network_type_non_broadcast: Optional[pulumi.Input[bool]] = None,
                 network_type_point_to_multipoint: Optional[pulumi.Input[bool]] = None,
                 network_type_point_to_point: Optional[pulumi.Input[bool]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a InterfaceOspfv3 resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] cost: Static route cost value of the interface - Range: `1`-`65535`
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[bool] network_type_broadcast: Specify OSPF broadcast multi-access network
        :param pulumi.Input[bool] network_type_non_broadcast: Specify OSPF NBMA network
        :param pulumi.Input[bool] network_type_point_to_multipoint: Specify OSPF point-to-multipoint network
        :param pulumi.Input[bool] network_type_point_to_point: Specify OSPF point-to-point network
        :param pulumi.Input[str] type: Interface type - Choices: `GigabitEthernet`, `TwoGigabitEthernet`, `FiveGigabitEthernet`, `TenGigabitEthernet`,
               `TwentyFiveGigE`, `FortyGigabitEthernet`, `HundredGigE`, `TwoHundredGigE`, `FourHundredGigE`, `Loopback`, `Vlan`,
               `Port-channel`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: InterfaceOspfv3Args,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a InterfaceOspfv3 resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param InterfaceOspfv3Args args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(InterfaceOspfv3Args, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cost: Optional[pulumi.Input[int]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network_type_broadcast: Optional[pulumi.Input[bool]] = None,
                 network_type_non_broadcast: Optional[pulumi.Input[bool]] = None,
                 network_type_point_to_multipoint: Optional[pulumi.Input[bool]] = None,
                 network_type_point_to_point: Optional[pulumi.Input[bool]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = InterfaceOspfv3Args.__new__(InterfaceOspfv3Args)

            __props__.__dict__["cost"] = cost
            __props__.__dict__["delete_mode"] = delete_mode
            __props__.__dict__["device"] = device
            __props__.__dict__["name"] = name
            __props__.__dict__["network_type_broadcast"] = network_type_broadcast
            __props__.__dict__["network_type_non_broadcast"] = network_type_non_broadcast
            __props__.__dict__["network_type_point_to_multipoint"] = network_type_point_to_multipoint
            __props__.__dict__["network_type_point_to_point"] = network_type_point_to_point
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
        super(InterfaceOspfv3, __self__).__init__(
            'iosxe:iosxe/interfaceOspfv3:InterfaceOspfv3',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cost: Optional[pulumi.Input[int]] = None,
            delete_mode: Optional[pulumi.Input[str]] = None,
            device: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            network_type_broadcast: Optional[pulumi.Input[bool]] = None,
            network_type_non_broadcast: Optional[pulumi.Input[bool]] = None,
            network_type_point_to_multipoint: Optional[pulumi.Input[bool]] = None,
            network_type_point_to_point: Optional[pulumi.Input[bool]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'InterfaceOspfv3':
        """
        Get an existing InterfaceOspfv3 resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] cost: Static route cost value of the interface - Range: `1`-`65535`
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[bool] network_type_broadcast: Specify OSPF broadcast multi-access network
        :param pulumi.Input[bool] network_type_non_broadcast: Specify OSPF NBMA network
        :param pulumi.Input[bool] network_type_point_to_multipoint: Specify OSPF point-to-multipoint network
        :param pulumi.Input[bool] network_type_point_to_point: Specify OSPF point-to-point network
        :param pulumi.Input[str] type: Interface type - Choices: `GigabitEthernet`, `TwoGigabitEthernet`, `FiveGigabitEthernet`, `TenGigabitEthernet`,
               `TwentyFiveGigE`, `FortyGigabitEthernet`, `HundredGigE`, `TwoHundredGigE`, `FourHundredGigE`, `Loopback`, `Vlan`,
               `Port-channel`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _InterfaceOspfv3State.__new__(_InterfaceOspfv3State)

        __props__.__dict__["cost"] = cost
        __props__.__dict__["delete_mode"] = delete_mode
        __props__.__dict__["device"] = device
        __props__.__dict__["name"] = name
        __props__.__dict__["network_type_broadcast"] = network_type_broadcast
        __props__.__dict__["network_type_non_broadcast"] = network_type_non_broadcast
        __props__.__dict__["network_type_point_to_multipoint"] = network_type_point_to_multipoint
        __props__.__dict__["network_type_point_to_point"] = network_type_point_to_point
        __props__.__dict__["type"] = type
        return InterfaceOspfv3(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def cost(self) -> pulumi.Output[Optional[int]]:
        """
        Static route cost value of the interface - Range: `1`-`65535`
        """
        return pulumi.get(self, "cost")

    @property
    @pulumi.getter(name="deleteMode")
    def delete_mode(self) -> pulumi.Output[Optional[str]]:
        """
        Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
        managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
        Default value is `all`. - Choices: `all`, `attributes`
        """
        return pulumi.get(self, "delete_mode")

    @property
    @pulumi.getter
    def device(self) -> pulumi.Output[Optional[str]]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="networkTypeBroadcast")
    def network_type_broadcast(self) -> pulumi.Output[Optional[bool]]:
        """
        Specify OSPF broadcast multi-access network
        """
        return pulumi.get(self, "network_type_broadcast")

    @property
    @pulumi.getter(name="networkTypeNonBroadcast")
    def network_type_non_broadcast(self) -> pulumi.Output[Optional[bool]]:
        """
        Specify OSPF NBMA network
        """
        return pulumi.get(self, "network_type_non_broadcast")

    @property
    @pulumi.getter(name="networkTypePointToMultipoint")
    def network_type_point_to_multipoint(self) -> pulumi.Output[Optional[bool]]:
        """
        Specify OSPF point-to-multipoint network
        """
        return pulumi.get(self, "network_type_point_to_multipoint")

    @property
    @pulumi.getter(name="networkTypePointToPoint")
    def network_type_point_to_point(self) -> pulumi.Output[Optional[bool]]:
        """
        Specify OSPF point-to-point network
        """
        return pulumi.get(self, "network_type_point_to_point")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Interface type - Choices: `GigabitEthernet`, `TwoGigabitEthernet`, `FiveGigabitEthernet`, `TenGigabitEthernet`,
        `TwentyFiveGigE`, `FortyGigabitEthernet`, `HundredGigE`, `TwoHundredGigE`, `FourHundredGigE`, `Loopback`, `Vlan`,
        `Port-channel`
        """
        return pulumi.get(self, "type")
