# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['CtsArgs', 'Cts']

@pulumi.input_type
class CtsArgs:
    def __init__(__self__, *,
                 authorization_list: Optional[pulumi.Input[str]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Cts resource.
        :param pulumi.Input[str] authorization_list: Local authorization list to use for CTS
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        """
        if authorization_list is not None:
            pulumi.set(__self__, "authorization_list", authorization_list)
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)

    @property
    @pulumi.getter(name="authorizationList")
    def authorization_list(self) -> Optional[pulumi.Input[str]]:
        """
        Local authorization list to use for CTS
        """
        return pulumi.get(self, "authorization_list")

    @authorization_list.setter
    def authorization_list(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "authorization_list", value)

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


@pulumi.input_type
class _CtsState:
    def __init__(__self__, *,
                 authorization_list: Optional[pulumi.Input[str]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Cts resources.
        :param pulumi.Input[str] authorization_list: Local authorization list to use for CTS
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        """
        if authorization_list is not None:
            pulumi.set(__self__, "authorization_list", authorization_list)
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)

    @property
    @pulumi.getter(name="authorizationList")
    def authorization_list(self) -> Optional[pulumi.Input[str]]:
        """
        Local authorization list to use for CTS
        """
        return pulumi.get(self, "authorization_list")

    @authorization_list.setter
    def authorization_list(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "authorization_list", value)

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


class Cts(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authorization_list: Optional[pulumi.Input[str]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource can manage the CTS configuration.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_iosxe as iosxe

        example = iosxe.Cts("example", authorization_list="Tacacs-GROUP")
        ```

        ## Import

        ```sh
         $ pulumi import iosxe:index/cts:Cts example "Cisco-IOS-XE-native:native/cts"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] authorization_list: Local authorization list to use for CTS
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[CtsArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage the CTS configuration.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_iosxe as iosxe

        example = iosxe.Cts("example", authorization_list="Tacacs-GROUP")
        ```

        ## Import

        ```sh
         $ pulumi import iosxe:index/cts:Cts example "Cisco-IOS-XE-native:native/cts"
        ```

        :param str resource_name: The name of the resource.
        :param CtsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CtsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authorization_list: Optional[pulumi.Input[str]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CtsArgs.__new__(CtsArgs)

            __props__.__dict__["authorization_list"] = authorization_list
            __props__.__dict__["delete_mode"] = delete_mode
            __props__.__dict__["device"] = device
        super(Cts, __self__).__init__(
            'iosxe:index/cts:Cts',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            authorization_list: Optional[pulumi.Input[str]] = None,
            delete_mode: Optional[pulumi.Input[str]] = None,
            device: Optional[pulumi.Input[str]] = None) -> 'Cts':
        """
        Get an existing Cts resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] authorization_list: Local authorization list to use for CTS
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CtsState.__new__(_CtsState)

        __props__.__dict__["authorization_list"] = authorization_list
        __props__.__dict__["delete_mode"] = delete_mode
        __props__.__dict__["device"] = device
        return Cts(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="authorizationList")
    def authorization_list(self) -> pulumi.Output[Optional[str]]:
        """
        Local authorization list to use for CTS
        """
        return pulumi.get(self, "authorization_list")

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

