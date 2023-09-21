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

__all__ = ['LineArgs', 'Line']

@pulumi.input_type
class LineArgs:
    def __init__(__self__, *,
                 consoles: Optional[pulumi.Input[Sequence[pulumi.Input['LineConsoleArgs']]]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 vties: Optional[pulumi.Input[Sequence[pulumi.Input['LineVtyArgs']]]] = None):
        """
        The set of arguments for constructing a Line resource.
        :param pulumi.Input[Sequence[pulumi.Input['LineConsoleArgs']]] consoles: Primary terminal line
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input['LineVtyArgs']]] vties: Virtual terminal
        """
        if consoles is not None:
            pulumi.set(__self__, "consoles", consoles)
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if vties is not None:
            pulumi.set(__self__, "vties", vties)

    @property
    @pulumi.getter
    def consoles(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['LineConsoleArgs']]]]:
        """
        Primary terminal line
        """
        return pulumi.get(self, "consoles")

    @consoles.setter
    def consoles(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['LineConsoleArgs']]]]):
        pulumi.set(self, "consoles", value)

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
    def vties(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['LineVtyArgs']]]]:
        """
        Virtual terminal
        """
        return pulumi.get(self, "vties")

    @vties.setter
    def vties(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['LineVtyArgs']]]]):
        pulumi.set(self, "vties", value)


@pulumi.input_type
class _LineState:
    def __init__(__self__, *,
                 consoles: Optional[pulumi.Input[Sequence[pulumi.Input['LineConsoleArgs']]]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 vties: Optional[pulumi.Input[Sequence[pulumi.Input['LineVtyArgs']]]] = None):
        """
        Input properties used for looking up and filtering Line resources.
        :param pulumi.Input[Sequence[pulumi.Input['LineConsoleArgs']]] consoles: Primary terminal line
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input['LineVtyArgs']]] vties: Virtual terminal
        """
        if consoles is not None:
            pulumi.set(__self__, "consoles", consoles)
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if vties is not None:
            pulumi.set(__self__, "vties", vties)

    @property
    @pulumi.getter
    def consoles(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['LineConsoleArgs']]]]:
        """
        Primary terminal line
        """
        return pulumi.get(self, "consoles")

    @consoles.setter
    def consoles(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['LineConsoleArgs']]]]):
        pulumi.set(self, "consoles", value)

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
    def vties(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['LineVtyArgs']]]]:
        """
        Virtual terminal
        """
        return pulumi.get(self, "vties")

    @vties.setter
    def vties(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['LineVtyArgs']]]]):
        pulumi.set(self, "vties", value)


class Line(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 consoles: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LineConsoleArgs']]]]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 vties: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LineVtyArgs']]]]] = None,
                 __props__=None):
        """
        This resource can manage the Line configuration.

        ## Import

        ```sh
         $ pulumi import iosxe:index/line:Line example "Cisco-IOS-XE-native:native/line"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LineConsoleArgs']]]] consoles: Primary terminal line
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LineVtyArgs']]]] vties: Virtual terminal
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[LineArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage the Line configuration.

        ## Import

        ```sh
         $ pulumi import iosxe:index/line:Line example "Cisco-IOS-XE-native:native/line"
        ```

        :param str resource_name: The name of the resource.
        :param LineArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LineArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 consoles: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LineConsoleArgs']]]]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 vties: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LineVtyArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LineArgs.__new__(LineArgs)

            __props__.__dict__["consoles"] = consoles
            __props__.__dict__["delete_mode"] = delete_mode
            __props__.__dict__["device"] = device
            __props__.__dict__["vties"] = vties
        super(Line, __self__).__init__(
            'iosxe:index/line:Line',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            consoles: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LineConsoleArgs']]]]] = None,
            delete_mode: Optional[pulumi.Input[str]] = None,
            device: Optional[pulumi.Input[str]] = None,
            vties: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LineVtyArgs']]]]] = None) -> 'Line':
        """
        Get an existing Line resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LineConsoleArgs']]]] consoles: Primary terminal line
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LineVtyArgs']]]] vties: Virtual terminal
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LineState.__new__(_LineState)

        __props__.__dict__["consoles"] = consoles
        __props__.__dict__["delete_mode"] = delete_mode
        __props__.__dict__["device"] = device
        __props__.__dict__["vties"] = vties
        return Line(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def consoles(self) -> pulumi.Output[Optional[Sequence['outputs.LineConsole']]]:
        """
        Primary terminal line
        """
        return pulumi.get(self, "consoles")

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
    def vties(self) -> pulumi.Output[Optional[Sequence['outputs.LineVty']]]:
        """
        Virtual terminal
        """
        return pulumi.get(self, "vties")

