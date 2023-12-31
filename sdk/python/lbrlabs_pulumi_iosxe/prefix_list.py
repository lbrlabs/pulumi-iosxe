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

__all__ = ['PrefixListArgs', 'PrefixList']

@pulumi.input_type
class PrefixListArgs:
    def __init__(__self__, *,
                 device: Optional[pulumi.Input[str]] = None,
                 prefixes: Optional[pulumi.Input[Sequence[pulumi.Input['PrefixListPrefixArgs']]]] = None):
        """
        The set of arguments for constructing a PrefixList resource.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input['PrefixListPrefixArgs']]] prefixes: Build prefix-lists with name ans seq.no
        """
        if device is not None:
            pulumi.set(__self__, "device", device)
        if prefixes is not None:
            pulumi.set(__self__, "prefixes", prefixes)

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
    def prefixes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PrefixListPrefixArgs']]]]:
        """
        Build prefix-lists with name ans seq.no
        """
        return pulumi.get(self, "prefixes")

    @prefixes.setter
    def prefixes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PrefixListPrefixArgs']]]]):
        pulumi.set(self, "prefixes", value)


@pulumi.input_type
class _PrefixListState:
    def __init__(__self__, *,
                 device: Optional[pulumi.Input[str]] = None,
                 prefixes: Optional[pulumi.Input[Sequence[pulumi.Input['PrefixListPrefixArgs']]]] = None):
        """
        Input properties used for looking up and filtering PrefixList resources.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input['PrefixListPrefixArgs']]] prefixes: Build prefix-lists with name ans seq.no
        """
        if device is not None:
            pulumi.set(__self__, "device", device)
        if prefixes is not None:
            pulumi.set(__self__, "prefixes", prefixes)

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
    def prefixes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PrefixListPrefixArgs']]]]:
        """
        Build prefix-lists with name ans seq.no
        """
        return pulumi.get(self, "prefixes")

    @prefixes.setter
    def prefixes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PrefixListPrefixArgs']]]]):
        pulumi.set(self, "prefixes", value)


class PrefixList(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 prefixes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PrefixListPrefixArgs']]]]] = None,
                 __props__=None):
        """
        This resource can manage the Prefix List configuration.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_iosxe as iosxe

        example = iosxe.PrefixList("example", prefixes=[iosxe.PrefixListPrefixArgs(
            action="permit",
            ge=24,
            ip="10.0.0.0/8",
            le=32,
            name="PREFIX_LIST_1",
            seq=10,
        )])
        ```

        ## Import

        ```sh
         $ pulumi import iosxe:index/prefixList:PrefixList example "Cisco-IOS-XE-native:native/ip/prefix-lists"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PrefixListPrefixArgs']]]] prefixes: Build prefix-lists with name ans seq.no
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[PrefixListArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage the Prefix List configuration.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_iosxe as iosxe

        example = iosxe.PrefixList("example", prefixes=[iosxe.PrefixListPrefixArgs(
            action="permit",
            ge=24,
            ip="10.0.0.0/8",
            le=32,
            name="PREFIX_LIST_1",
            seq=10,
        )])
        ```

        ## Import

        ```sh
         $ pulumi import iosxe:index/prefixList:PrefixList example "Cisco-IOS-XE-native:native/ip/prefix-lists"
        ```

        :param str resource_name: The name of the resource.
        :param PrefixListArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PrefixListArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 prefixes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PrefixListPrefixArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PrefixListArgs.__new__(PrefixListArgs)

            __props__.__dict__["device"] = device
            __props__.__dict__["prefixes"] = prefixes
        super(PrefixList, __self__).__init__(
            'iosxe:index/prefixList:PrefixList',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            device: Optional[pulumi.Input[str]] = None,
            prefixes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PrefixListPrefixArgs']]]]] = None) -> 'PrefixList':
        """
        Get an existing PrefixList resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PrefixListPrefixArgs']]]] prefixes: Build prefix-lists with name ans seq.no
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PrefixListState.__new__(_PrefixListState)

        __props__.__dict__["device"] = device
        __props__.__dict__["prefixes"] = prefixes
        return PrefixList(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def device(self) -> pulumi.Output[Optional[str]]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def prefixes(self) -> pulumi.Output[Optional[Sequence['outputs.PrefixListPrefix']]]:
        """
        Build prefix-lists with name ans seq.no
        """
        return pulumi.get(self, "prefixes")

