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

__all__ = ['MdtSubscriptionArgs', 'MdtSubscription']

@pulumi.input_type
class MdtSubscriptionArgs:
    def __init__(__self__, *,
                 subscription_id: pulumi.Input[int],
                 device: Optional[pulumi.Input[str]] = None,
                 encoding: Optional[pulumi.Input[str]] = None,
                 filter_xpath: Optional[pulumi.Input[str]] = None,
                 receivers: Optional[pulumi.Input[Sequence[pulumi.Input['MdtSubscriptionReceiverArgs']]]] = None,
                 source_address: Optional[pulumi.Input[str]] = None,
                 source_vrf: Optional[pulumi.Input[str]] = None,
                 stream: Optional[pulumi.Input[str]] = None,
                 update_policy_on_change: Optional[pulumi.Input[bool]] = None,
                 update_policy_periodic: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a MdtSubscription resource.
        :param pulumi.Input[int] subscription_id: Unique subscription identifier. - Range: `0`-`2147483647`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] encoding: Update notification encoding
        :param pulumi.Input[str] filter_xpath: XPath expression describing the set of objects wanted as part of the subscription
        :param pulumi.Input[Sequence[pulumi.Input['MdtSubscriptionReceiverArgs']]] receivers: Configuration of receivers of configured subscriptions. Use of this is deprecated. Use mdt-receiver-names instead.
        :param pulumi.Input[str] source_address: The source address for the notifications
        :param pulumi.Input[str] source_vrf: Network instance name for the VRF
        :param pulumi.Input[str] stream: The name of the event stream being subscribed to
        :param pulumi.Input[bool] update_policy_on_change: If true, there is no initial update notification with the current value of all the data. NOT CURRENTLY SUPPORTED. If
               specified, must be false
        :param pulumi.Input[int] update_policy_periodic: Period of update notifications in hundredths of a second - Range: `0`-`4294967295`
        """
        pulumi.set(__self__, "subscription_id", subscription_id)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if encoding is not None:
            pulumi.set(__self__, "encoding", encoding)
        if filter_xpath is not None:
            pulumi.set(__self__, "filter_xpath", filter_xpath)
        if receivers is not None:
            pulumi.set(__self__, "receivers", receivers)
        if source_address is not None:
            pulumi.set(__self__, "source_address", source_address)
        if source_vrf is not None:
            pulumi.set(__self__, "source_vrf", source_vrf)
        if stream is not None:
            pulumi.set(__self__, "stream", stream)
        if update_policy_on_change is not None:
            pulumi.set(__self__, "update_policy_on_change", update_policy_on_change)
        if update_policy_periodic is not None:
            pulumi.set(__self__, "update_policy_periodic", update_policy_periodic)

    @property
    @pulumi.getter(name="subscriptionId")
    def subscription_id(self) -> pulumi.Input[int]:
        """
        Unique subscription identifier. - Range: `0`-`2147483647`
        """
        return pulumi.get(self, "subscription_id")

    @subscription_id.setter
    def subscription_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "subscription_id", value)

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
    def encoding(self) -> Optional[pulumi.Input[str]]:
        """
        Update notification encoding
        """
        return pulumi.get(self, "encoding")

    @encoding.setter
    def encoding(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "encoding", value)

    @property
    @pulumi.getter(name="filterXpath")
    def filter_xpath(self) -> Optional[pulumi.Input[str]]:
        """
        XPath expression describing the set of objects wanted as part of the subscription
        """
        return pulumi.get(self, "filter_xpath")

    @filter_xpath.setter
    def filter_xpath(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "filter_xpath", value)

    @property
    @pulumi.getter
    def receivers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['MdtSubscriptionReceiverArgs']]]]:
        """
        Configuration of receivers of configured subscriptions. Use of this is deprecated. Use mdt-receiver-names instead.
        """
        return pulumi.get(self, "receivers")

    @receivers.setter
    def receivers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['MdtSubscriptionReceiverArgs']]]]):
        pulumi.set(self, "receivers", value)

    @property
    @pulumi.getter(name="sourceAddress")
    def source_address(self) -> Optional[pulumi.Input[str]]:
        """
        The source address for the notifications
        """
        return pulumi.get(self, "source_address")

    @source_address.setter
    def source_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_address", value)

    @property
    @pulumi.getter(name="sourceVrf")
    def source_vrf(self) -> Optional[pulumi.Input[str]]:
        """
        Network instance name for the VRF
        """
        return pulumi.get(self, "source_vrf")

    @source_vrf.setter
    def source_vrf(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_vrf", value)

    @property
    @pulumi.getter
    def stream(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the event stream being subscribed to
        """
        return pulumi.get(self, "stream")

    @stream.setter
    def stream(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "stream", value)

    @property
    @pulumi.getter(name="updatePolicyOnChange")
    def update_policy_on_change(self) -> Optional[pulumi.Input[bool]]:
        """
        If true, there is no initial update notification with the current value of all the data. NOT CURRENTLY SUPPORTED. If
        specified, must be false
        """
        return pulumi.get(self, "update_policy_on_change")

    @update_policy_on_change.setter
    def update_policy_on_change(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "update_policy_on_change", value)

    @property
    @pulumi.getter(name="updatePolicyPeriodic")
    def update_policy_periodic(self) -> Optional[pulumi.Input[int]]:
        """
        Period of update notifications in hundredths of a second - Range: `0`-`4294967295`
        """
        return pulumi.get(self, "update_policy_periodic")

    @update_policy_periodic.setter
    def update_policy_periodic(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "update_policy_periodic", value)


@pulumi.input_type
class _MdtSubscriptionState:
    def __init__(__self__, *,
                 device: Optional[pulumi.Input[str]] = None,
                 encoding: Optional[pulumi.Input[str]] = None,
                 filter_xpath: Optional[pulumi.Input[str]] = None,
                 receivers: Optional[pulumi.Input[Sequence[pulumi.Input['MdtSubscriptionReceiverArgs']]]] = None,
                 source_address: Optional[pulumi.Input[str]] = None,
                 source_vrf: Optional[pulumi.Input[str]] = None,
                 stream: Optional[pulumi.Input[str]] = None,
                 subscription_id: Optional[pulumi.Input[int]] = None,
                 update_policy_on_change: Optional[pulumi.Input[bool]] = None,
                 update_policy_periodic: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering MdtSubscription resources.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] encoding: Update notification encoding
        :param pulumi.Input[str] filter_xpath: XPath expression describing the set of objects wanted as part of the subscription
        :param pulumi.Input[Sequence[pulumi.Input['MdtSubscriptionReceiverArgs']]] receivers: Configuration of receivers of configured subscriptions. Use of this is deprecated. Use mdt-receiver-names instead.
        :param pulumi.Input[str] source_address: The source address for the notifications
        :param pulumi.Input[str] source_vrf: Network instance name for the VRF
        :param pulumi.Input[str] stream: The name of the event stream being subscribed to
        :param pulumi.Input[int] subscription_id: Unique subscription identifier. - Range: `0`-`2147483647`
        :param pulumi.Input[bool] update_policy_on_change: If true, there is no initial update notification with the current value of all the data. NOT CURRENTLY SUPPORTED. If
               specified, must be false
        :param pulumi.Input[int] update_policy_periodic: Period of update notifications in hundredths of a second - Range: `0`-`4294967295`
        """
        if device is not None:
            pulumi.set(__self__, "device", device)
        if encoding is not None:
            pulumi.set(__self__, "encoding", encoding)
        if filter_xpath is not None:
            pulumi.set(__self__, "filter_xpath", filter_xpath)
        if receivers is not None:
            pulumi.set(__self__, "receivers", receivers)
        if source_address is not None:
            pulumi.set(__self__, "source_address", source_address)
        if source_vrf is not None:
            pulumi.set(__self__, "source_vrf", source_vrf)
        if stream is not None:
            pulumi.set(__self__, "stream", stream)
        if subscription_id is not None:
            pulumi.set(__self__, "subscription_id", subscription_id)
        if update_policy_on_change is not None:
            pulumi.set(__self__, "update_policy_on_change", update_policy_on_change)
        if update_policy_periodic is not None:
            pulumi.set(__self__, "update_policy_periodic", update_policy_periodic)

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
    def encoding(self) -> Optional[pulumi.Input[str]]:
        """
        Update notification encoding
        """
        return pulumi.get(self, "encoding")

    @encoding.setter
    def encoding(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "encoding", value)

    @property
    @pulumi.getter(name="filterXpath")
    def filter_xpath(self) -> Optional[pulumi.Input[str]]:
        """
        XPath expression describing the set of objects wanted as part of the subscription
        """
        return pulumi.get(self, "filter_xpath")

    @filter_xpath.setter
    def filter_xpath(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "filter_xpath", value)

    @property
    @pulumi.getter
    def receivers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['MdtSubscriptionReceiverArgs']]]]:
        """
        Configuration of receivers of configured subscriptions. Use of this is deprecated. Use mdt-receiver-names instead.
        """
        return pulumi.get(self, "receivers")

    @receivers.setter
    def receivers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['MdtSubscriptionReceiverArgs']]]]):
        pulumi.set(self, "receivers", value)

    @property
    @pulumi.getter(name="sourceAddress")
    def source_address(self) -> Optional[pulumi.Input[str]]:
        """
        The source address for the notifications
        """
        return pulumi.get(self, "source_address")

    @source_address.setter
    def source_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_address", value)

    @property
    @pulumi.getter(name="sourceVrf")
    def source_vrf(self) -> Optional[pulumi.Input[str]]:
        """
        Network instance name for the VRF
        """
        return pulumi.get(self, "source_vrf")

    @source_vrf.setter
    def source_vrf(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_vrf", value)

    @property
    @pulumi.getter
    def stream(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the event stream being subscribed to
        """
        return pulumi.get(self, "stream")

    @stream.setter
    def stream(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "stream", value)

    @property
    @pulumi.getter(name="subscriptionId")
    def subscription_id(self) -> Optional[pulumi.Input[int]]:
        """
        Unique subscription identifier. - Range: `0`-`2147483647`
        """
        return pulumi.get(self, "subscription_id")

    @subscription_id.setter
    def subscription_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "subscription_id", value)

    @property
    @pulumi.getter(name="updatePolicyOnChange")
    def update_policy_on_change(self) -> Optional[pulumi.Input[bool]]:
        """
        If true, there is no initial update notification with the current value of all the data. NOT CURRENTLY SUPPORTED. If
        specified, must be false
        """
        return pulumi.get(self, "update_policy_on_change")

    @update_policy_on_change.setter
    def update_policy_on_change(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "update_policy_on_change", value)

    @property
    @pulumi.getter(name="updatePolicyPeriodic")
    def update_policy_periodic(self) -> Optional[pulumi.Input[int]]:
        """
        Period of update notifications in hundredths of a second - Range: `0`-`4294967295`
        """
        return pulumi.get(self, "update_policy_periodic")

    @update_policy_periodic.setter
    def update_policy_periodic(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "update_policy_periodic", value)


class MdtSubscription(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 encoding: Optional[pulumi.Input[str]] = None,
                 filter_xpath: Optional[pulumi.Input[str]] = None,
                 receivers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MdtSubscriptionReceiverArgs']]]]] = None,
                 source_address: Optional[pulumi.Input[str]] = None,
                 source_vrf: Optional[pulumi.Input[str]] = None,
                 stream: Optional[pulumi.Input[str]] = None,
                 subscription_id: Optional[pulumi.Input[int]] = None,
                 update_policy_on_change: Optional[pulumi.Input[bool]] = None,
                 update_policy_periodic: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Create a MdtSubscription resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] encoding: Update notification encoding
        :param pulumi.Input[str] filter_xpath: XPath expression describing the set of objects wanted as part of the subscription
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MdtSubscriptionReceiverArgs']]]] receivers: Configuration of receivers of configured subscriptions. Use of this is deprecated. Use mdt-receiver-names instead.
        :param pulumi.Input[str] source_address: The source address for the notifications
        :param pulumi.Input[str] source_vrf: Network instance name for the VRF
        :param pulumi.Input[str] stream: The name of the event stream being subscribed to
        :param pulumi.Input[int] subscription_id: Unique subscription identifier. - Range: `0`-`2147483647`
        :param pulumi.Input[bool] update_policy_on_change: If true, there is no initial update notification with the current value of all the data. NOT CURRENTLY SUPPORTED. If
               specified, must be false
        :param pulumi.Input[int] update_policy_periodic: Period of update notifications in hundredths of a second - Range: `0`-`4294967295`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MdtSubscriptionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a MdtSubscription resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param MdtSubscriptionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MdtSubscriptionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 encoding: Optional[pulumi.Input[str]] = None,
                 filter_xpath: Optional[pulumi.Input[str]] = None,
                 receivers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MdtSubscriptionReceiverArgs']]]]] = None,
                 source_address: Optional[pulumi.Input[str]] = None,
                 source_vrf: Optional[pulumi.Input[str]] = None,
                 stream: Optional[pulumi.Input[str]] = None,
                 subscription_id: Optional[pulumi.Input[int]] = None,
                 update_policy_on_change: Optional[pulumi.Input[bool]] = None,
                 update_policy_periodic: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MdtSubscriptionArgs.__new__(MdtSubscriptionArgs)

            __props__.__dict__["device"] = device
            __props__.__dict__["encoding"] = encoding
            __props__.__dict__["filter_xpath"] = filter_xpath
            __props__.__dict__["receivers"] = receivers
            __props__.__dict__["source_address"] = source_address
            __props__.__dict__["source_vrf"] = source_vrf
            __props__.__dict__["stream"] = stream
            if subscription_id is None and not opts.urn:
                raise TypeError("Missing required property 'subscription_id'")
            __props__.__dict__["subscription_id"] = subscription_id
            __props__.__dict__["update_policy_on_change"] = update_policy_on_change
            __props__.__dict__["update_policy_periodic"] = update_policy_periodic
        super(MdtSubscription, __self__).__init__(
            'iosxe:iosxe/mdtSubscription:MdtSubscription',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            device: Optional[pulumi.Input[str]] = None,
            encoding: Optional[pulumi.Input[str]] = None,
            filter_xpath: Optional[pulumi.Input[str]] = None,
            receivers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MdtSubscriptionReceiverArgs']]]]] = None,
            source_address: Optional[pulumi.Input[str]] = None,
            source_vrf: Optional[pulumi.Input[str]] = None,
            stream: Optional[pulumi.Input[str]] = None,
            subscription_id: Optional[pulumi.Input[int]] = None,
            update_policy_on_change: Optional[pulumi.Input[bool]] = None,
            update_policy_periodic: Optional[pulumi.Input[int]] = None) -> 'MdtSubscription':
        """
        Get an existing MdtSubscription resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] encoding: Update notification encoding
        :param pulumi.Input[str] filter_xpath: XPath expression describing the set of objects wanted as part of the subscription
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MdtSubscriptionReceiverArgs']]]] receivers: Configuration of receivers of configured subscriptions. Use of this is deprecated. Use mdt-receiver-names instead.
        :param pulumi.Input[str] source_address: The source address for the notifications
        :param pulumi.Input[str] source_vrf: Network instance name for the VRF
        :param pulumi.Input[str] stream: The name of the event stream being subscribed to
        :param pulumi.Input[int] subscription_id: Unique subscription identifier. - Range: `0`-`2147483647`
        :param pulumi.Input[bool] update_policy_on_change: If true, there is no initial update notification with the current value of all the data. NOT CURRENTLY SUPPORTED. If
               specified, must be false
        :param pulumi.Input[int] update_policy_periodic: Period of update notifications in hundredths of a second - Range: `0`-`4294967295`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MdtSubscriptionState.__new__(_MdtSubscriptionState)

        __props__.__dict__["device"] = device
        __props__.__dict__["encoding"] = encoding
        __props__.__dict__["filter_xpath"] = filter_xpath
        __props__.__dict__["receivers"] = receivers
        __props__.__dict__["source_address"] = source_address
        __props__.__dict__["source_vrf"] = source_vrf
        __props__.__dict__["stream"] = stream
        __props__.__dict__["subscription_id"] = subscription_id
        __props__.__dict__["update_policy_on_change"] = update_policy_on_change
        __props__.__dict__["update_policy_periodic"] = update_policy_periodic
        return MdtSubscription(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def device(self) -> pulumi.Output[Optional[str]]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def encoding(self) -> pulumi.Output[Optional[str]]:
        """
        Update notification encoding
        """
        return pulumi.get(self, "encoding")

    @property
    @pulumi.getter(name="filterXpath")
    def filter_xpath(self) -> pulumi.Output[Optional[str]]:
        """
        XPath expression describing the set of objects wanted as part of the subscription
        """
        return pulumi.get(self, "filter_xpath")

    @property
    @pulumi.getter
    def receivers(self) -> pulumi.Output[Optional[Sequence['outputs.MdtSubscriptionReceiver']]]:
        """
        Configuration of receivers of configured subscriptions. Use of this is deprecated. Use mdt-receiver-names instead.
        """
        return pulumi.get(self, "receivers")

    @property
    @pulumi.getter(name="sourceAddress")
    def source_address(self) -> pulumi.Output[Optional[str]]:
        """
        The source address for the notifications
        """
        return pulumi.get(self, "source_address")

    @property
    @pulumi.getter(name="sourceVrf")
    def source_vrf(self) -> pulumi.Output[Optional[str]]:
        """
        Network instance name for the VRF
        """
        return pulumi.get(self, "source_vrf")

    @property
    @pulumi.getter
    def stream(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the event stream being subscribed to
        """
        return pulumi.get(self, "stream")

    @property
    @pulumi.getter(name="subscriptionId")
    def subscription_id(self) -> pulumi.Output[int]:
        """
        Unique subscription identifier. - Range: `0`-`2147483647`
        """
        return pulumi.get(self, "subscription_id")

    @property
    @pulumi.getter(name="updatePolicyOnChange")
    def update_policy_on_change(self) -> pulumi.Output[Optional[bool]]:
        """
        If true, there is no initial update notification with the current value of all the data. NOT CURRENTLY SUPPORTED. If
        specified, must be false
        """
        return pulumi.get(self, "update_policy_on_change")

    @property
    @pulumi.getter(name="updatePolicyPeriodic")
    def update_policy_periodic(self) -> pulumi.Output[Optional[int]]:
        """
        Period of update notifications in hundredths of a second - Range: `0`-`4294967295`
        """
        return pulumi.get(self, "update_policy_periodic")
