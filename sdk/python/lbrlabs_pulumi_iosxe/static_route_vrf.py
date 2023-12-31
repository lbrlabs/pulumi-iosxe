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
from ._inputs import *

__all__ = ['StaticRouteVrfArgs', 'StaticRouteVrf']

@pulumi.input_type
class StaticRouteVrfArgs:
    def __init__(__self__, *,
                 vrf: pulumi.Input[str],
                 device: Optional[pulumi.Input[str]] = None,
                 routes: Optional[pulumi.Input[Sequence[pulumi.Input['StaticRouteVrfRouteArgs']]]] = None):
        """
        The set of arguments for constructing a StaticRouteVrf resource.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        """
        pulumi.set(__self__, "vrf", vrf)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if routes is not None:
            pulumi.set(__self__, "routes", routes)

    @property
    @pulumi.getter
    def vrf(self) -> pulumi.Input[str]:
        return pulumi.get(self, "vrf")

    @vrf.setter
    def vrf(self, value: pulumi.Input[str]):
        pulumi.set(self, "vrf", value)

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
    def routes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['StaticRouteVrfRouteArgs']]]]:
        return pulumi.get(self, "routes")

    @routes.setter
    def routes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['StaticRouteVrfRouteArgs']]]]):
        pulumi.set(self, "routes", value)


@pulumi.input_type
class _StaticRouteVrfState:
    def __init__(__self__, *,
                 device: Optional[pulumi.Input[str]] = None,
                 routes: Optional[pulumi.Input[Sequence[pulumi.Input['StaticRouteVrfRouteArgs']]]] = None,
                 vrf: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering StaticRouteVrf resources.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        """
        if device is not None:
            pulumi.set(__self__, "device", device)
        if routes is not None:
            pulumi.set(__self__, "routes", routes)
        if vrf is not None:
            pulumi.set(__self__, "vrf", vrf)

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
    def routes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['StaticRouteVrfRouteArgs']]]]:
        return pulumi.get(self, "routes")

    @routes.setter
    def routes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['StaticRouteVrfRouteArgs']]]]):
        pulumi.set(self, "routes", value)

    @property
    @pulumi.getter
    def vrf(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "vrf")

    @vrf.setter
    def vrf(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vrf", value)


class StaticRouteVrf(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 routes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StaticRouteVrfRouteArgs']]]]] = None,
                 vrf: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource can manage the Static Route VRF configuration.

        ## Import

        ```sh
         $ pulumi import iosxe:index/staticRouteVrf:StaticRouteVrf example "Cisco-IOS-XE-native:native/ip/route/vrf=VRF1"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: StaticRouteVrfArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage the Static Route VRF configuration.

        ## Import

        ```sh
         $ pulumi import iosxe:index/staticRouteVrf:StaticRouteVrf example "Cisco-IOS-XE-native:native/ip/route/vrf=VRF1"
        ```

        :param str resource_name: The name of the resource.
        :param StaticRouteVrfArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(StaticRouteVrfArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 routes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StaticRouteVrfRouteArgs']]]]] = None,
                 vrf: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = StaticRouteVrfArgs.__new__(StaticRouteVrfArgs)

            __props__.__dict__["device"] = device
            __props__.__dict__["routes"] = routes
            if vrf is None and not opts.urn:
                raise TypeError("Missing required property 'vrf'")
            __props__.__dict__["vrf"] = vrf
        super(StaticRouteVrf, __self__).__init__(
            'iosxe:index/staticRouteVrf:StaticRouteVrf',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            device: Optional[pulumi.Input[str]] = None,
            routes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StaticRouteVrfRouteArgs']]]]] = None,
            vrf: Optional[pulumi.Input[str]] = None) -> 'StaticRouteVrf':
        """
        Get an existing StaticRouteVrf resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _StaticRouteVrfState.__new__(_StaticRouteVrfState)

        __props__.__dict__["device"] = device
        __props__.__dict__["routes"] = routes
        __props__.__dict__["vrf"] = vrf
        return StaticRouteVrf(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def device(self) -> pulumi.Output[Optional[str]]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def routes(self) -> pulumi.Output[Optional[Sequence['outputs.StaticRouteVrfRoute']]]:
        return pulumi.get(self, "routes")

    @property
    @pulumi.getter
    def vrf(self) -> pulumi.Output[str]:
        return pulumi.get(self, "vrf")

