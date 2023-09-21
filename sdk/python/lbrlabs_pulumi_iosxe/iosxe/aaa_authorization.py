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

__all__ = ['AaaAuthorizationArgs', 'AaaAuthorization']

@pulumi.input_type
class AaaAuthorizationArgs:
    def __init__(__self__, *,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 execs: Optional[pulumi.Input[Sequence[pulumi.Input['AaaAuthorizationExecArgs']]]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input['AaaAuthorizationNetworkArgs']]]] = None):
        """
        The set of arguments for constructing a AaaAuthorization resource.
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input['AaaAuthorizationExecArgs']]] execs: For starting an exec (shell).
        :param pulumi.Input[Sequence[pulumi.Input['AaaAuthorizationNetworkArgs']]] networks: For network services. (PPP, SLIP, ARAP)
        """
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if execs is not None:
            pulumi.set(__self__, "execs", execs)
        if networks is not None:
            pulumi.set(__self__, "networks", networks)

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
    def execs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AaaAuthorizationExecArgs']]]]:
        """
        For starting an exec (shell).
        """
        return pulumi.get(self, "execs")

    @execs.setter
    def execs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AaaAuthorizationExecArgs']]]]):
        pulumi.set(self, "execs", value)

    @property
    @pulumi.getter
    def networks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AaaAuthorizationNetworkArgs']]]]:
        """
        For network services. (PPP, SLIP, ARAP)
        """
        return pulumi.get(self, "networks")

    @networks.setter
    def networks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AaaAuthorizationNetworkArgs']]]]):
        pulumi.set(self, "networks", value)


@pulumi.input_type
class _AaaAuthorizationState:
    def __init__(__self__, *,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 execs: Optional[pulumi.Input[Sequence[pulumi.Input['AaaAuthorizationExecArgs']]]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input['AaaAuthorizationNetworkArgs']]]] = None):
        """
        Input properties used for looking up and filtering AaaAuthorization resources.
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input['AaaAuthorizationExecArgs']]] execs: For starting an exec (shell).
        :param pulumi.Input[Sequence[pulumi.Input['AaaAuthorizationNetworkArgs']]] networks: For network services. (PPP, SLIP, ARAP)
        """
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if execs is not None:
            pulumi.set(__self__, "execs", execs)
        if networks is not None:
            pulumi.set(__self__, "networks", networks)

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
    def execs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AaaAuthorizationExecArgs']]]]:
        """
        For starting an exec (shell).
        """
        return pulumi.get(self, "execs")

    @execs.setter
    def execs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AaaAuthorizationExecArgs']]]]):
        pulumi.set(self, "execs", value)

    @property
    @pulumi.getter
    def networks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AaaAuthorizationNetworkArgs']]]]:
        """
        For network services. (PPP, SLIP, ARAP)
        """
        return pulumi.get(self, "networks")

    @networks.setter
    def networks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AaaAuthorizationNetworkArgs']]]]):
        pulumi.set(self, "networks", value)


class AaaAuthorization(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 execs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AaaAuthorizationExecArgs']]]]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AaaAuthorizationNetworkArgs']]]]] = None,
                 __props__=None):
        """
        This resource can manage the AAA Authorization configuration.

        ## Import

        ```sh
         $ pulumi import iosxe:iosxe/aaaAuthorization:AaaAuthorization example "Cisco-IOS-XE-native:native/aaa/Cisco-IOS-XE-aaa:authorization"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AaaAuthorizationExecArgs']]]] execs: For starting an exec (shell).
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AaaAuthorizationNetworkArgs']]]] networks: For network services. (PPP, SLIP, ARAP)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[AaaAuthorizationArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage the AAA Authorization configuration.

        ## Import

        ```sh
         $ pulumi import iosxe:iosxe/aaaAuthorization:AaaAuthorization example "Cisco-IOS-XE-native:native/aaa/Cisco-IOS-XE-aaa:authorization"
        ```

        :param str resource_name: The name of the resource.
        :param AaaAuthorizationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AaaAuthorizationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 execs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AaaAuthorizationExecArgs']]]]] = None,
                 networks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AaaAuthorizationNetworkArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AaaAuthorizationArgs.__new__(AaaAuthorizationArgs)

            __props__.__dict__["delete_mode"] = delete_mode
            __props__.__dict__["device"] = device
            __props__.__dict__["execs"] = execs
            __props__.__dict__["networks"] = networks
        super(AaaAuthorization, __self__).__init__(
            'iosxe:iosxe/aaaAuthorization:AaaAuthorization',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            delete_mode: Optional[pulumi.Input[str]] = None,
            device: Optional[pulumi.Input[str]] = None,
            execs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AaaAuthorizationExecArgs']]]]] = None,
            networks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AaaAuthorizationNetworkArgs']]]]] = None) -> 'AaaAuthorization':
        """
        Get an existing AaaAuthorization resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AaaAuthorizationExecArgs']]]] execs: For starting an exec (shell).
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AaaAuthorizationNetworkArgs']]]] networks: For network services. (PPP, SLIP, ARAP)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AaaAuthorizationState.__new__(_AaaAuthorizationState)

        __props__.__dict__["delete_mode"] = delete_mode
        __props__.__dict__["device"] = device
        __props__.__dict__["execs"] = execs
        __props__.__dict__["networks"] = networks
        return AaaAuthorization(resource_name, opts=opts, __props__=__props__)

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
    def execs(self) -> pulumi.Output[Optional[Sequence['outputs.AaaAuthorizationExec']]]:
        """
        For starting an exec (shell).
        """
        return pulumi.get(self, "execs")

    @property
    @pulumi.getter
    def networks(self) -> pulumi.Output[Optional[Sequence['outputs.AaaAuthorizationNetwork']]]:
        """
        For network services. (PPP, SLIP, ARAP)
        """
        return pulumi.get(self, "networks")

