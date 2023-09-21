# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['VlanAccessMapArgs', 'VlanAccessMap']

@pulumi.input_type
class VlanAccessMapArgs:
    def __init__(__self__, *,
                 sequence: pulumi.Input[int],
                 action: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 match_ip_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 match_ipv6_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a VlanAccessMap resource.
        :param pulumi.Input[int] sequence: Sequence to insert to/delete from existing vlan access-map entry - Range: `0`-`65535`
        :param pulumi.Input[str] action: Take the action - Choices: `drop`, `forward`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] match_ipv6_addresses: Match IPv6 address to access control.
        :param pulumi.Input[str] name: Vlan access map tag
        """
        pulumi.set(__self__, "sequence", sequence)
        if action is not None:
            pulumi.set(__self__, "action", action)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if match_ip_addresses is not None:
            pulumi.set(__self__, "match_ip_addresses", match_ip_addresses)
        if match_ipv6_addresses is not None:
            pulumi.set(__self__, "match_ipv6_addresses", match_ipv6_addresses)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def sequence(self) -> pulumi.Input[int]:
        """
        Sequence to insert to/delete from existing vlan access-map entry - Range: `0`-`65535`
        """
        return pulumi.get(self, "sequence")

    @sequence.setter
    def sequence(self, value: pulumi.Input[int]):
        pulumi.set(self, "sequence", value)

    @property
    @pulumi.getter
    def action(self) -> Optional[pulumi.Input[str]]:
        """
        Take the action - Choices: `drop`, `forward`
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "action", value)

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
    @pulumi.getter(name="matchIpAddresses")
    def match_ip_addresses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "match_ip_addresses")

    @match_ip_addresses.setter
    def match_ip_addresses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "match_ip_addresses", value)

    @property
    @pulumi.getter(name="matchIpv6Addresses")
    def match_ipv6_addresses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Match IPv6 address to access control.
        """
        return pulumi.get(self, "match_ipv6_addresses")

    @match_ipv6_addresses.setter
    def match_ipv6_addresses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "match_ipv6_addresses", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Vlan access map tag
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _VlanAccessMapState:
    def __init__(__self__, *,
                 action: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 match_ip_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 match_ipv6_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 sequence: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering VlanAccessMap resources.
        :param pulumi.Input[str] action: Take the action - Choices: `drop`, `forward`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] match_ipv6_addresses: Match IPv6 address to access control.
        :param pulumi.Input[str] name: Vlan access map tag
        :param pulumi.Input[int] sequence: Sequence to insert to/delete from existing vlan access-map entry - Range: `0`-`65535`
        """
        if action is not None:
            pulumi.set(__self__, "action", action)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if match_ip_addresses is not None:
            pulumi.set(__self__, "match_ip_addresses", match_ip_addresses)
        if match_ipv6_addresses is not None:
            pulumi.set(__self__, "match_ipv6_addresses", match_ipv6_addresses)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if sequence is not None:
            pulumi.set(__self__, "sequence", sequence)

    @property
    @pulumi.getter
    def action(self) -> Optional[pulumi.Input[str]]:
        """
        Take the action - Choices: `drop`, `forward`
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "action", value)

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
    @pulumi.getter(name="matchIpAddresses")
    def match_ip_addresses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "match_ip_addresses")

    @match_ip_addresses.setter
    def match_ip_addresses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "match_ip_addresses", value)

    @property
    @pulumi.getter(name="matchIpv6Addresses")
    def match_ipv6_addresses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Match IPv6 address to access control.
        """
        return pulumi.get(self, "match_ipv6_addresses")

    @match_ipv6_addresses.setter
    def match_ipv6_addresses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "match_ipv6_addresses", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Vlan access map tag
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def sequence(self) -> Optional[pulumi.Input[int]]:
        """
        Sequence to insert to/delete from existing vlan access-map entry - Range: `0`-`65535`
        """
        return pulumi.get(self, "sequence")

    @sequence.setter
    def sequence(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "sequence", value)


class VlanAccessMap(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 match_ip_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 match_ipv6_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 sequence: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Create a VlanAccessMap resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] action: Take the action - Choices: `drop`, `forward`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] match_ipv6_addresses: Match IPv6 address to access control.
        :param pulumi.Input[str] name: Vlan access map tag
        :param pulumi.Input[int] sequence: Sequence to insert to/delete from existing vlan access-map entry - Range: `0`-`65535`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VlanAccessMapArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a VlanAccessMap resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param VlanAccessMapArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VlanAccessMapArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 match_ip_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 match_ipv6_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 sequence: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VlanAccessMapArgs.__new__(VlanAccessMapArgs)

            __props__.__dict__["action"] = action
            __props__.__dict__["device"] = device
            __props__.__dict__["match_ip_addresses"] = match_ip_addresses
            __props__.__dict__["match_ipv6_addresses"] = match_ipv6_addresses
            __props__.__dict__["name"] = name
            if sequence is None and not opts.urn:
                raise TypeError("Missing required property 'sequence'")
            __props__.__dict__["sequence"] = sequence
        super(VlanAccessMap, __self__).__init__(
            'iosxe:iosxe/vlanAccessMap:VlanAccessMap',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            action: Optional[pulumi.Input[str]] = None,
            device: Optional[pulumi.Input[str]] = None,
            match_ip_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            match_ipv6_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            sequence: Optional[pulumi.Input[int]] = None) -> 'VlanAccessMap':
        """
        Get an existing VlanAccessMap resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] action: Take the action - Choices: `drop`, `forward`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] match_ipv6_addresses: Match IPv6 address to access control.
        :param pulumi.Input[str] name: Vlan access map tag
        :param pulumi.Input[int] sequence: Sequence to insert to/delete from existing vlan access-map entry - Range: `0`-`65535`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VlanAccessMapState.__new__(_VlanAccessMapState)

        __props__.__dict__["action"] = action
        __props__.__dict__["device"] = device
        __props__.__dict__["match_ip_addresses"] = match_ip_addresses
        __props__.__dict__["match_ipv6_addresses"] = match_ipv6_addresses
        __props__.__dict__["name"] = name
        __props__.__dict__["sequence"] = sequence
        return VlanAccessMap(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def action(self) -> pulumi.Output[Optional[str]]:
        """
        Take the action - Choices: `drop`, `forward`
        """
        return pulumi.get(self, "action")

    @property
    @pulumi.getter
    def device(self) -> pulumi.Output[Optional[str]]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter(name="matchIpAddresses")
    def match_ip_addresses(self) -> pulumi.Output[Optional[Sequence[str]]]:
        return pulumi.get(self, "match_ip_addresses")

    @property
    @pulumi.getter(name="matchIpv6Addresses")
    def match_ipv6_addresses(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Match IPv6 address to access control.
        """
        return pulumi.get(self, "match_ipv6_addresses")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Vlan access map tag
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def sequence(self) -> pulumi.Output[int]:
        """
        Sequence to insert to/delete from existing vlan access-map entry - Range: `0`-`65535`
        """
        return pulumi.get(self, "sequence")

