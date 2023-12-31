# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['BannerArgs', 'Banner']

@pulumi.input_type
class BannerArgs:
    def __init__(__self__, *,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 exec_banner: Optional[pulumi.Input[str]] = None,
                 login_banner: Optional[pulumi.Input[str]] = None,
                 motd_banner: Optional[pulumi.Input[str]] = None,
                 prompt_timeout_banner: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Banner resource.
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] exec_banner: Banner message
        :param pulumi.Input[str] login_banner: Banner message
        :param pulumi.Input[str] motd_banner: Banner message
        :param pulumi.Input[str] prompt_timeout_banner: Banner message
        """
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if exec_banner is not None:
            pulumi.set(__self__, "exec_banner", exec_banner)
        if login_banner is not None:
            pulumi.set(__self__, "login_banner", login_banner)
        if motd_banner is not None:
            pulumi.set(__self__, "motd_banner", motd_banner)
        if prompt_timeout_banner is not None:
            pulumi.set(__self__, "prompt_timeout_banner", prompt_timeout_banner)

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
    @pulumi.getter(name="execBanner")
    def exec_banner(self) -> Optional[pulumi.Input[str]]:
        """
        Banner message
        """
        return pulumi.get(self, "exec_banner")

    @exec_banner.setter
    def exec_banner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "exec_banner", value)

    @property
    @pulumi.getter(name="loginBanner")
    def login_banner(self) -> Optional[pulumi.Input[str]]:
        """
        Banner message
        """
        return pulumi.get(self, "login_banner")

    @login_banner.setter
    def login_banner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "login_banner", value)

    @property
    @pulumi.getter(name="motdBanner")
    def motd_banner(self) -> Optional[pulumi.Input[str]]:
        """
        Banner message
        """
        return pulumi.get(self, "motd_banner")

    @motd_banner.setter
    def motd_banner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "motd_banner", value)

    @property
    @pulumi.getter(name="promptTimeoutBanner")
    def prompt_timeout_banner(self) -> Optional[pulumi.Input[str]]:
        """
        Banner message
        """
        return pulumi.get(self, "prompt_timeout_banner")

    @prompt_timeout_banner.setter
    def prompt_timeout_banner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "prompt_timeout_banner", value)


@pulumi.input_type
class _BannerState:
    def __init__(__self__, *,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 exec_banner: Optional[pulumi.Input[str]] = None,
                 login_banner: Optional[pulumi.Input[str]] = None,
                 motd_banner: Optional[pulumi.Input[str]] = None,
                 prompt_timeout_banner: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Banner resources.
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] exec_banner: Banner message
        :param pulumi.Input[str] login_banner: Banner message
        :param pulumi.Input[str] motd_banner: Banner message
        :param pulumi.Input[str] prompt_timeout_banner: Banner message
        """
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if exec_banner is not None:
            pulumi.set(__self__, "exec_banner", exec_banner)
        if login_banner is not None:
            pulumi.set(__self__, "login_banner", login_banner)
        if motd_banner is not None:
            pulumi.set(__self__, "motd_banner", motd_banner)
        if prompt_timeout_banner is not None:
            pulumi.set(__self__, "prompt_timeout_banner", prompt_timeout_banner)

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
    @pulumi.getter(name="execBanner")
    def exec_banner(self) -> Optional[pulumi.Input[str]]:
        """
        Banner message
        """
        return pulumi.get(self, "exec_banner")

    @exec_banner.setter
    def exec_banner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "exec_banner", value)

    @property
    @pulumi.getter(name="loginBanner")
    def login_banner(self) -> Optional[pulumi.Input[str]]:
        """
        Banner message
        """
        return pulumi.get(self, "login_banner")

    @login_banner.setter
    def login_banner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "login_banner", value)

    @property
    @pulumi.getter(name="motdBanner")
    def motd_banner(self) -> Optional[pulumi.Input[str]]:
        """
        Banner message
        """
        return pulumi.get(self, "motd_banner")

    @motd_banner.setter
    def motd_banner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "motd_banner", value)

    @property
    @pulumi.getter(name="promptTimeoutBanner")
    def prompt_timeout_banner(self) -> Optional[pulumi.Input[str]]:
        """
        Banner message
        """
        return pulumi.get(self, "prompt_timeout_banner")

    @prompt_timeout_banner.setter
    def prompt_timeout_banner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "prompt_timeout_banner", value)


class Banner(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 exec_banner: Optional[pulumi.Input[str]] = None,
                 login_banner: Optional[pulumi.Input[str]] = None,
                 motd_banner: Optional[pulumi.Input[str]] = None,
                 prompt_timeout_banner: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource can manage the Banner configuration.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_iosxe as iosxe

        example = iosxe.Banner("example",
            exec_banner="My Exec Banner",
            login_banner="My Login Banner",
            motd_banner="My MOTD Banner",
            prompt_timeout_banner="My Prompt-Timeout Banner")
        ```

        ## Import

        ```sh
         $ pulumi import iosxe:index/banner:Banner example "Cisco-IOS-XE-native:native/banner"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] exec_banner: Banner message
        :param pulumi.Input[str] login_banner: Banner message
        :param pulumi.Input[str] motd_banner: Banner message
        :param pulumi.Input[str] prompt_timeout_banner: Banner message
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[BannerArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage the Banner configuration.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_iosxe as iosxe

        example = iosxe.Banner("example",
            exec_banner="My Exec Banner",
            login_banner="My Login Banner",
            motd_banner="My MOTD Banner",
            prompt_timeout_banner="My Prompt-Timeout Banner")
        ```

        ## Import

        ```sh
         $ pulumi import iosxe:index/banner:Banner example "Cisco-IOS-XE-native:native/banner"
        ```

        :param str resource_name: The name of the resource.
        :param BannerArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BannerArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 exec_banner: Optional[pulumi.Input[str]] = None,
                 login_banner: Optional[pulumi.Input[str]] = None,
                 motd_banner: Optional[pulumi.Input[str]] = None,
                 prompt_timeout_banner: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BannerArgs.__new__(BannerArgs)

            __props__.__dict__["delete_mode"] = delete_mode
            __props__.__dict__["device"] = device
            __props__.__dict__["exec_banner"] = exec_banner
            __props__.__dict__["login_banner"] = login_banner
            __props__.__dict__["motd_banner"] = motd_banner
            __props__.__dict__["prompt_timeout_banner"] = prompt_timeout_banner
        super(Banner, __self__).__init__(
            'iosxe:index/banner:Banner',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            delete_mode: Optional[pulumi.Input[str]] = None,
            device: Optional[pulumi.Input[str]] = None,
            exec_banner: Optional[pulumi.Input[str]] = None,
            login_banner: Optional[pulumi.Input[str]] = None,
            motd_banner: Optional[pulumi.Input[str]] = None,
            prompt_timeout_banner: Optional[pulumi.Input[str]] = None) -> 'Banner':
        """
        Get an existing Banner resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] exec_banner: Banner message
        :param pulumi.Input[str] login_banner: Banner message
        :param pulumi.Input[str] motd_banner: Banner message
        :param pulumi.Input[str] prompt_timeout_banner: Banner message
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BannerState.__new__(_BannerState)

        __props__.__dict__["delete_mode"] = delete_mode
        __props__.__dict__["device"] = device
        __props__.__dict__["exec_banner"] = exec_banner
        __props__.__dict__["login_banner"] = login_banner
        __props__.__dict__["motd_banner"] = motd_banner
        __props__.__dict__["prompt_timeout_banner"] = prompt_timeout_banner
        return Banner(resource_name, opts=opts, __props__=__props__)

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
    @pulumi.getter(name="execBanner")
    def exec_banner(self) -> pulumi.Output[Optional[str]]:
        """
        Banner message
        """
        return pulumi.get(self, "exec_banner")

    @property
    @pulumi.getter(name="loginBanner")
    def login_banner(self) -> pulumi.Output[Optional[str]]:
        """
        Banner message
        """
        return pulumi.get(self, "login_banner")

    @property
    @pulumi.getter(name="motdBanner")
    def motd_banner(self) -> pulumi.Output[Optional[str]]:
        """
        Banner message
        """
        return pulumi.get(self, "motd_banner")

    @property
    @pulumi.getter(name="promptTimeoutBanner")
    def prompt_timeout_banner(self) -> pulumi.Output[Optional[str]]:
        """
        Banner message
        """
        return pulumi.get(self, "prompt_timeout_banner")

