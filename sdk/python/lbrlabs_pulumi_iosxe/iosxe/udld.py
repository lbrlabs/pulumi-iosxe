# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['UdldArgs', 'Udld']

@pulumi.input_type
class UdldArgs:
    def __init__(__self__, *,
                 aggressive: Optional[pulumi.Input[bool]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 enable: Optional[pulumi.Input[bool]] = None,
                 message_time: Optional[pulumi.Input[int]] = None,
                 recovery_interval: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a Udld resource.
        :param pulumi.Input[bool] aggressive: Enable UDLD protocol in aggressive mode on fiber ports exceptwhere locally configured
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[bool] enable: Enable UDLD protocol on fiber ports except where locally configured
        :param pulumi.Input[int] message_time: Set UDLD message time period - Range: `1`-`90`
        :param pulumi.Input[int] recovery_interval: timer-interval(sec) - Range: `30`-`86400`
        """
        if aggressive is not None:
            pulumi.set(__self__, "aggressive", aggressive)
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if enable is not None:
            pulumi.set(__self__, "enable", enable)
        if message_time is not None:
            pulumi.set(__self__, "message_time", message_time)
        if recovery_interval is not None:
            pulumi.set(__self__, "recovery_interval", recovery_interval)

    @property
    @pulumi.getter
    def aggressive(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable UDLD protocol in aggressive mode on fiber ports exceptwhere locally configured
        """
        return pulumi.get(self, "aggressive")

    @aggressive.setter
    def aggressive(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "aggressive", value)

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
    def enable(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable UDLD protocol on fiber ports except where locally configured
        """
        return pulumi.get(self, "enable")

    @enable.setter
    def enable(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable", value)

    @property
    @pulumi.getter(name="messageTime")
    def message_time(self) -> Optional[pulumi.Input[int]]:
        """
        Set UDLD message time period - Range: `1`-`90`
        """
        return pulumi.get(self, "message_time")

    @message_time.setter
    def message_time(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "message_time", value)

    @property
    @pulumi.getter(name="recoveryInterval")
    def recovery_interval(self) -> Optional[pulumi.Input[int]]:
        """
        timer-interval(sec) - Range: `30`-`86400`
        """
        return pulumi.get(self, "recovery_interval")

    @recovery_interval.setter
    def recovery_interval(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "recovery_interval", value)


@pulumi.input_type
class _UdldState:
    def __init__(__self__, *,
                 aggressive: Optional[pulumi.Input[bool]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 enable: Optional[pulumi.Input[bool]] = None,
                 message_time: Optional[pulumi.Input[int]] = None,
                 recovery_interval: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering Udld resources.
        :param pulumi.Input[bool] aggressive: Enable UDLD protocol in aggressive mode on fiber ports exceptwhere locally configured
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[bool] enable: Enable UDLD protocol on fiber ports except where locally configured
        :param pulumi.Input[int] message_time: Set UDLD message time period - Range: `1`-`90`
        :param pulumi.Input[int] recovery_interval: timer-interval(sec) - Range: `30`-`86400`
        """
        if aggressive is not None:
            pulumi.set(__self__, "aggressive", aggressive)
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if enable is not None:
            pulumi.set(__self__, "enable", enable)
        if message_time is not None:
            pulumi.set(__self__, "message_time", message_time)
        if recovery_interval is not None:
            pulumi.set(__self__, "recovery_interval", recovery_interval)

    @property
    @pulumi.getter
    def aggressive(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable UDLD protocol in aggressive mode on fiber ports exceptwhere locally configured
        """
        return pulumi.get(self, "aggressive")

    @aggressive.setter
    def aggressive(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "aggressive", value)

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
    def enable(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable UDLD protocol on fiber ports except where locally configured
        """
        return pulumi.get(self, "enable")

    @enable.setter
    def enable(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable", value)

    @property
    @pulumi.getter(name="messageTime")
    def message_time(self) -> Optional[pulumi.Input[int]]:
        """
        Set UDLD message time period - Range: `1`-`90`
        """
        return pulumi.get(self, "message_time")

    @message_time.setter
    def message_time(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "message_time", value)

    @property
    @pulumi.getter(name="recoveryInterval")
    def recovery_interval(self) -> Optional[pulumi.Input[int]]:
        """
        timer-interval(sec) - Range: `30`-`86400`
        """
        return pulumi.get(self, "recovery_interval")

    @recovery_interval.setter
    def recovery_interval(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "recovery_interval", value)


class Udld(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aggressive: Optional[pulumi.Input[bool]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 enable: Optional[pulumi.Input[bool]] = None,
                 message_time: Optional[pulumi.Input[int]] = None,
                 recovery_interval: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Create a Udld resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] aggressive: Enable UDLD protocol in aggressive mode on fiber ports exceptwhere locally configured
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[bool] enable: Enable UDLD protocol on fiber ports except where locally configured
        :param pulumi.Input[int] message_time: Set UDLD message time period - Range: `1`-`90`
        :param pulumi.Input[int] recovery_interval: timer-interval(sec) - Range: `30`-`86400`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[UdldArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a Udld resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param UdldArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UdldArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aggressive: Optional[pulumi.Input[bool]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 enable: Optional[pulumi.Input[bool]] = None,
                 message_time: Optional[pulumi.Input[int]] = None,
                 recovery_interval: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UdldArgs.__new__(UdldArgs)

            __props__.__dict__["aggressive"] = aggressive
            __props__.__dict__["delete_mode"] = delete_mode
            __props__.__dict__["device"] = device
            __props__.__dict__["enable"] = enable
            __props__.__dict__["message_time"] = message_time
            __props__.__dict__["recovery_interval"] = recovery_interval
        super(Udld, __self__).__init__(
            'iosxe:iosxe/udld:Udld',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aggressive: Optional[pulumi.Input[bool]] = None,
            delete_mode: Optional[pulumi.Input[str]] = None,
            device: Optional[pulumi.Input[str]] = None,
            enable: Optional[pulumi.Input[bool]] = None,
            message_time: Optional[pulumi.Input[int]] = None,
            recovery_interval: Optional[pulumi.Input[int]] = None) -> 'Udld':
        """
        Get an existing Udld resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] aggressive: Enable UDLD protocol in aggressive mode on fiber ports exceptwhere locally configured
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[bool] enable: Enable UDLD protocol on fiber ports except where locally configured
        :param pulumi.Input[int] message_time: Set UDLD message time period - Range: `1`-`90`
        :param pulumi.Input[int] recovery_interval: timer-interval(sec) - Range: `30`-`86400`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UdldState.__new__(_UdldState)

        __props__.__dict__["aggressive"] = aggressive
        __props__.__dict__["delete_mode"] = delete_mode
        __props__.__dict__["device"] = device
        __props__.__dict__["enable"] = enable
        __props__.__dict__["message_time"] = message_time
        __props__.__dict__["recovery_interval"] = recovery_interval
        return Udld(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def aggressive(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable UDLD protocol in aggressive mode on fiber ports exceptwhere locally configured
        """
        return pulumi.get(self, "aggressive")

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
    def enable(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable UDLD protocol on fiber ports except where locally configured
        """
        return pulumi.get(self, "enable")

    @property
    @pulumi.getter(name="messageTime")
    def message_time(self) -> pulumi.Output[Optional[int]]:
        """
        Set UDLD message time period - Range: `1`-`90`
        """
        return pulumi.get(self, "message_time")

    @property
    @pulumi.getter(name="recoveryInterval")
    def recovery_interval(self) -> pulumi.Output[Optional[int]]:
        """
        timer-interval(sec) - Range: `30`-`86400`
        """
        return pulumi.get(self, "recovery_interval")
