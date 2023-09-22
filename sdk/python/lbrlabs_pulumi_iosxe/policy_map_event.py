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

__all__ = ['PolicyMapEventArgs', 'PolicyMapEvent']

@pulumi.input_type
class PolicyMapEventArgs:
    def __init__(__self__, *,
                 event_type: pulumi.Input[str],
                 class_numbers: Optional[pulumi.Input[Sequence[pulumi.Input['PolicyMapEventClassNumberArgs']]]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 match_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a PolicyMapEvent resource.
        :param pulumi.Input[str] event_type: - Choices: `aaa-available`, `absolute-timeout`, `agent-found`, `authentication-failure`, `authentication-success`,
               `authorization-failure`, `authorization-success`, `identity-update`, `inactivity-timeout`,
               `remote-authentication-failure`, `remote-authentication-success`, `remote-update`, `session-disconnected`,
               `session-started`, `tag-added`, `tag-removed`, `template-activated`, `template-activation-failed`,
               `template-deactivated`, `template-deactivation-failed`, `timer-expiry`, `violation`
        :param pulumi.Input[Sequence[pulumi.Input['PolicyMapEventClassNumberArgs']]] class_numbers: class number, 1 for 1st class, 2 for 2nd...
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] match_type: - Choices: `match-all`, `match-first`
        :param pulumi.Input[str] name: Name of the policy map
        """
        pulumi.set(__self__, "event_type", event_type)
        if class_numbers is not None:
            pulumi.set(__self__, "class_numbers", class_numbers)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if match_type is not None:
            pulumi.set(__self__, "match_type", match_type)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="eventType")
    def event_type(self) -> pulumi.Input[str]:
        """
        - Choices: `aaa-available`, `absolute-timeout`, `agent-found`, `authentication-failure`, `authentication-success`,
        `authorization-failure`, `authorization-success`, `identity-update`, `inactivity-timeout`,
        `remote-authentication-failure`, `remote-authentication-success`, `remote-update`, `session-disconnected`,
        `session-started`, `tag-added`, `tag-removed`, `template-activated`, `template-activation-failed`,
        `template-deactivated`, `template-deactivation-failed`, `timer-expiry`, `violation`
        """
        return pulumi.get(self, "event_type")

    @event_type.setter
    def event_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "event_type", value)

    @property
    @pulumi.getter(name="classNumbers")
    def class_numbers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PolicyMapEventClassNumberArgs']]]]:
        """
        class number, 1 for 1st class, 2 for 2nd...
        """
        return pulumi.get(self, "class_numbers")

    @class_numbers.setter
    def class_numbers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PolicyMapEventClassNumberArgs']]]]):
        pulumi.set(self, "class_numbers", value)

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
    @pulumi.getter(name="matchType")
    def match_type(self) -> Optional[pulumi.Input[str]]:
        """
        - Choices: `match-all`, `match-first`
        """
        return pulumi.get(self, "match_type")

    @match_type.setter
    def match_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "match_type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the policy map
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _PolicyMapEventState:
    def __init__(__self__, *,
                 class_numbers: Optional[pulumi.Input[Sequence[pulumi.Input['PolicyMapEventClassNumberArgs']]]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 event_type: Optional[pulumi.Input[str]] = None,
                 match_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering PolicyMapEvent resources.
        :param pulumi.Input[Sequence[pulumi.Input['PolicyMapEventClassNumberArgs']]] class_numbers: class number, 1 for 1st class, 2 for 2nd...
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] event_type: - Choices: `aaa-available`, `absolute-timeout`, `agent-found`, `authentication-failure`, `authentication-success`,
               `authorization-failure`, `authorization-success`, `identity-update`, `inactivity-timeout`,
               `remote-authentication-failure`, `remote-authentication-success`, `remote-update`, `session-disconnected`,
               `session-started`, `tag-added`, `tag-removed`, `template-activated`, `template-activation-failed`,
               `template-deactivated`, `template-deactivation-failed`, `timer-expiry`, `violation`
        :param pulumi.Input[str] match_type: - Choices: `match-all`, `match-first`
        :param pulumi.Input[str] name: Name of the policy map
        """
        if class_numbers is not None:
            pulumi.set(__self__, "class_numbers", class_numbers)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if event_type is not None:
            pulumi.set(__self__, "event_type", event_type)
        if match_type is not None:
            pulumi.set(__self__, "match_type", match_type)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="classNumbers")
    def class_numbers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PolicyMapEventClassNumberArgs']]]]:
        """
        class number, 1 for 1st class, 2 for 2nd...
        """
        return pulumi.get(self, "class_numbers")

    @class_numbers.setter
    def class_numbers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PolicyMapEventClassNumberArgs']]]]):
        pulumi.set(self, "class_numbers", value)

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
    @pulumi.getter(name="eventType")
    def event_type(self) -> Optional[pulumi.Input[str]]:
        """
        - Choices: `aaa-available`, `absolute-timeout`, `agent-found`, `authentication-failure`, `authentication-success`,
        `authorization-failure`, `authorization-success`, `identity-update`, `inactivity-timeout`,
        `remote-authentication-failure`, `remote-authentication-success`, `remote-update`, `session-disconnected`,
        `session-started`, `tag-added`, `tag-removed`, `template-activated`, `template-activation-failed`,
        `template-deactivated`, `template-deactivation-failed`, `timer-expiry`, `violation`
        """
        return pulumi.get(self, "event_type")

    @event_type.setter
    def event_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "event_type", value)

    @property
    @pulumi.getter(name="matchType")
    def match_type(self) -> Optional[pulumi.Input[str]]:
        """
        - Choices: `match-all`, `match-first`
        """
        return pulumi.get(self, "match_type")

    @match_type.setter
    def match_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "match_type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the policy map
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class PolicyMapEvent(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 class_numbers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PolicyMapEventClassNumberArgs']]]]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 event_type: Optional[pulumi.Input[str]] = None,
                 match_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource can manage the Policy Map Event configuration.

        ## Import

        ```sh
         $ pulumi import iosxe:index/policyMapEvent:PolicyMapEvent example "Cisco-IOS-XE-native:native/policy/Cisco-IOS-XE-policy:policy-map=dot1x_policy/event=authentication-success"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PolicyMapEventClassNumberArgs']]]] class_numbers: class number, 1 for 1st class, 2 for 2nd...
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] event_type: - Choices: `aaa-available`, `absolute-timeout`, `agent-found`, `authentication-failure`, `authentication-success`,
               `authorization-failure`, `authorization-success`, `identity-update`, `inactivity-timeout`,
               `remote-authentication-failure`, `remote-authentication-success`, `remote-update`, `session-disconnected`,
               `session-started`, `tag-added`, `tag-removed`, `template-activated`, `template-activation-failed`,
               `template-deactivated`, `template-deactivation-failed`, `timer-expiry`, `violation`
        :param pulumi.Input[str] match_type: - Choices: `match-all`, `match-first`
        :param pulumi.Input[str] name: Name of the policy map
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PolicyMapEventArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage the Policy Map Event configuration.

        ## Import

        ```sh
         $ pulumi import iosxe:index/policyMapEvent:PolicyMapEvent example "Cisco-IOS-XE-native:native/policy/Cisco-IOS-XE-policy:policy-map=dot1x_policy/event=authentication-success"
        ```

        :param str resource_name: The name of the resource.
        :param PolicyMapEventArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PolicyMapEventArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 class_numbers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PolicyMapEventClassNumberArgs']]]]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 event_type: Optional[pulumi.Input[str]] = None,
                 match_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PolicyMapEventArgs.__new__(PolicyMapEventArgs)

            __props__.__dict__["class_numbers"] = class_numbers
            __props__.__dict__["device"] = device
            if event_type is None and not opts.urn:
                raise TypeError("Missing required property 'event_type'")
            __props__.__dict__["event_type"] = event_type
            __props__.__dict__["match_type"] = match_type
            __props__.__dict__["name"] = name
        super(PolicyMapEvent, __self__).__init__(
            'iosxe:index/policyMapEvent:PolicyMapEvent',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            class_numbers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PolicyMapEventClassNumberArgs']]]]] = None,
            device: Optional[pulumi.Input[str]] = None,
            event_type: Optional[pulumi.Input[str]] = None,
            match_type: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'PolicyMapEvent':
        """
        Get an existing PolicyMapEvent resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PolicyMapEventClassNumberArgs']]]] class_numbers: class number, 1 for 1st class, 2 for 2nd...
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] event_type: - Choices: `aaa-available`, `absolute-timeout`, `agent-found`, `authentication-failure`, `authentication-success`,
               `authorization-failure`, `authorization-success`, `identity-update`, `inactivity-timeout`,
               `remote-authentication-failure`, `remote-authentication-success`, `remote-update`, `session-disconnected`,
               `session-started`, `tag-added`, `tag-removed`, `template-activated`, `template-activation-failed`,
               `template-deactivated`, `template-deactivation-failed`, `timer-expiry`, `violation`
        :param pulumi.Input[str] match_type: - Choices: `match-all`, `match-first`
        :param pulumi.Input[str] name: Name of the policy map
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PolicyMapEventState.__new__(_PolicyMapEventState)

        __props__.__dict__["class_numbers"] = class_numbers
        __props__.__dict__["device"] = device
        __props__.__dict__["event_type"] = event_type
        __props__.__dict__["match_type"] = match_type
        __props__.__dict__["name"] = name
        return PolicyMapEvent(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="classNumbers")
    def class_numbers(self) -> pulumi.Output[Optional[Sequence['outputs.PolicyMapEventClassNumber']]]:
        """
        class number, 1 for 1st class, 2 for 2nd...
        """
        return pulumi.get(self, "class_numbers")

    @property
    @pulumi.getter
    def device(self) -> pulumi.Output[Optional[str]]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter(name="eventType")
    def event_type(self) -> pulumi.Output[str]:
        """
        - Choices: `aaa-available`, `absolute-timeout`, `agent-found`, `authentication-failure`, `authentication-success`,
        `authorization-failure`, `authorization-success`, `identity-update`, `inactivity-timeout`,
        `remote-authentication-failure`, `remote-authentication-success`, `remote-update`, `session-disconnected`,
        `session-started`, `tag-added`, `tag-removed`, `template-activated`, `template-activation-failed`,
        `template-deactivated`, `template-deactivation-failed`, `timer-expiry`, `violation`
        """
        return pulumi.get(self, "event_type")

    @property
    @pulumi.getter(name="matchType")
    def match_type(self) -> pulumi.Output[Optional[str]]:
        """
        - Choices: `match-all`, `match-first`
        """
        return pulumi.get(self, "match_type")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the policy map
        """
        return pulumi.get(self, "name")
