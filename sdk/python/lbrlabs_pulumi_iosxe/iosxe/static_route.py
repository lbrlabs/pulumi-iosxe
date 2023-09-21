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
from ._inputs import *

__all__ = ['StaticRouteArgs', 'StaticRoute']

@pulumi.input_type
class StaticRouteArgs:
    def __init__(__self__, *,
                 mask: pulumi.Input[str],
                 prefix: pulumi.Input[str],
                 device: Optional[pulumi.Input[str]] = None,
                 next_hops: Optional[pulumi.Input[Sequence[pulumi.Input['StaticRouteNextHopArgs']]]] = None):
        """
        The set of arguments for constructing a StaticRoute resource.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        """
        pulumi.set(__self__, "mask", mask)
        pulumi.set(__self__, "prefix", prefix)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if next_hops is not None:
            pulumi.set(__self__, "next_hops", next_hops)

    @property
    @pulumi.getter
    def mask(self) -> pulumi.Input[str]:
        return pulumi.get(self, "mask")

    @mask.setter
    def mask(self, value: pulumi.Input[str]):
        pulumi.set(self, "mask", value)

    @property
    @pulumi.getter
    def prefix(self) -> pulumi.Input[str]:
        return pulumi.get(self, "prefix")

    @prefix.setter
    def prefix(self, value: pulumi.Input[str]):
        pulumi.set(self, "prefix", value)

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
    @pulumi.getter(name="nextHops")
    def next_hops(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['StaticRouteNextHopArgs']]]]:
        return pulumi.get(self, "next_hops")

    @next_hops.setter
    def next_hops(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['StaticRouteNextHopArgs']]]]):
        pulumi.set(self, "next_hops", value)


@pulumi.input_type
class _StaticRouteState:
    def __init__(__self__, *,
                 device: Optional[pulumi.Input[str]] = None,
                 mask: Optional[pulumi.Input[str]] = None,
                 next_hops: Optional[pulumi.Input[Sequence[pulumi.Input['StaticRouteNextHopArgs']]]] = None,
                 prefix: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering StaticRoute resources.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        """
        if device is not None:
            pulumi.set(__self__, "device", device)
        if mask is not None:
            pulumi.set(__self__, "mask", mask)
        if next_hops is not None:
            pulumi.set(__self__, "next_hops", next_hops)
        if prefix is not None:
            pulumi.set(__self__, "prefix", prefix)

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
    def mask(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "mask")

    @mask.setter
    def mask(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mask", value)

    @property
    @pulumi.getter(name="nextHops")
    def next_hops(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['StaticRouteNextHopArgs']]]]:
        return pulumi.get(self, "next_hops")

    @next_hops.setter
    def next_hops(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['StaticRouteNextHopArgs']]]]):
        pulumi.set(self, "next_hops", value)

    @property
    @pulumi.getter
    def prefix(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "prefix")

    @prefix.setter
    def prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "prefix", value)


class StaticRoute(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 mask: Optional[pulumi.Input[str]] = None,
                 next_hops: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StaticRouteNextHopArgs']]]]] = None,
                 prefix: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a StaticRoute resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: StaticRouteArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a StaticRoute resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param StaticRouteArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(StaticRouteArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 mask: Optional[pulumi.Input[str]] = None,
                 next_hops: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StaticRouteNextHopArgs']]]]] = None,
                 prefix: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = StaticRouteArgs.__new__(StaticRouteArgs)

            __props__.__dict__["device"] = device
            if mask is None and not opts.urn:
                raise TypeError("Missing required property 'mask'")
            __props__.__dict__["mask"] = mask
            __props__.__dict__["next_hops"] = next_hops
            if prefix is None and not opts.urn:
                raise TypeError("Missing required property 'prefix'")
            __props__.__dict__["prefix"] = prefix
        super(StaticRoute, __self__).__init__(
            'iosxe:iosxe/staticRoute:StaticRoute',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            device: Optional[pulumi.Input[str]] = None,
            mask: Optional[pulumi.Input[str]] = None,
            next_hops: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StaticRouteNextHopArgs']]]]] = None,
            prefix: Optional[pulumi.Input[str]] = None) -> 'StaticRoute':
        """
        Get an existing StaticRoute resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _StaticRouteState.__new__(_StaticRouteState)

        __props__.__dict__["device"] = device
        __props__.__dict__["mask"] = mask
        __props__.__dict__["next_hops"] = next_hops
        __props__.__dict__["prefix"] = prefix
        return StaticRoute(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def device(self) -> pulumi.Output[Optional[str]]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def mask(self) -> pulumi.Output[str]:
        return pulumi.get(self, "mask")

    @property
    @pulumi.getter(name="nextHops")
    def next_hops(self) -> pulumi.Output[Optional[Sequence['outputs.StaticRouteNextHop']]]:
        return pulumi.get(self, "next_hops")

    @property
    @pulumi.getter
    def prefix(self) -> pulumi.Output[str]:
        return pulumi.get(self, "prefix")

