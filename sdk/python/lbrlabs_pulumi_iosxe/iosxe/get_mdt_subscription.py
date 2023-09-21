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

__all__ = [
    'GetMdtSubscriptionResult',
    'AwaitableGetMdtSubscriptionResult',
    'get_mdt_subscription',
    'get_mdt_subscription_output',
]

@pulumi.output_type
class GetMdtSubscriptionResult:
    """
    A collection of values returned by getMdtSubscription.
    """
    def __init__(__self__, device=None, encoding=None, filter_xpath=None, id=None, receivers=None, source_address=None, source_vrf=None, stream=None, subscription_id=None, update_policy_on_change=None, update_policy_periodic=None):
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if encoding and not isinstance(encoding, str):
            raise TypeError("Expected argument 'encoding' to be a str")
        pulumi.set(__self__, "encoding", encoding)
        if filter_xpath and not isinstance(filter_xpath, str):
            raise TypeError("Expected argument 'filter_xpath' to be a str")
        pulumi.set(__self__, "filter_xpath", filter_xpath)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if receivers and not isinstance(receivers, list):
            raise TypeError("Expected argument 'receivers' to be a list")
        pulumi.set(__self__, "receivers", receivers)
        if source_address and not isinstance(source_address, str):
            raise TypeError("Expected argument 'source_address' to be a str")
        pulumi.set(__self__, "source_address", source_address)
        if source_vrf and not isinstance(source_vrf, str):
            raise TypeError("Expected argument 'source_vrf' to be a str")
        pulumi.set(__self__, "source_vrf", source_vrf)
        if stream and not isinstance(stream, str):
            raise TypeError("Expected argument 'stream' to be a str")
        pulumi.set(__self__, "stream", stream)
        if subscription_id and not isinstance(subscription_id, int):
            raise TypeError("Expected argument 'subscription_id' to be a int")
        pulumi.set(__self__, "subscription_id", subscription_id)
        if update_policy_on_change and not isinstance(update_policy_on_change, bool):
            raise TypeError("Expected argument 'update_policy_on_change' to be a bool")
        pulumi.set(__self__, "update_policy_on_change", update_policy_on_change)
        if update_policy_periodic and not isinstance(update_policy_periodic, int):
            raise TypeError("Expected argument 'update_policy_periodic' to be a int")
        pulumi.set(__self__, "update_policy_periodic", update_policy_periodic)

    @property
    @pulumi.getter
    def device(self) -> Optional[str]:
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def encoding(self) -> str:
        return pulumi.get(self, "encoding")

    @property
    @pulumi.getter(name="filterXpath")
    def filter_xpath(self) -> str:
        return pulumi.get(self, "filter_xpath")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def receivers(self) -> Sequence['outputs.GetMdtSubscriptionReceiverResult']:
        return pulumi.get(self, "receivers")

    @property
    @pulumi.getter(name="sourceAddress")
    def source_address(self) -> str:
        return pulumi.get(self, "source_address")

    @property
    @pulumi.getter(name="sourceVrf")
    def source_vrf(self) -> str:
        return pulumi.get(self, "source_vrf")

    @property
    @pulumi.getter
    def stream(self) -> str:
        return pulumi.get(self, "stream")

    @property
    @pulumi.getter(name="subscriptionId")
    def subscription_id(self) -> int:
        return pulumi.get(self, "subscription_id")

    @property
    @pulumi.getter(name="updatePolicyOnChange")
    def update_policy_on_change(self) -> bool:
        return pulumi.get(self, "update_policy_on_change")

    @property
    @pulumi.getter(name="updatePolicyPeriodic")
    def update_policy_periodic(self) -> int:
        return pulumi.get(self, "update_policy_periodic")


class AwaitableGetMdtSubscriptionResult(GetMdtSubscriptionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMdtSubscriptionResult(
            device=self.device,
            encoding=self.encoding,
            filter_xpath=self.filter_xpath,
            id=self.id,
            receivers=self.receivers,
            source_address=self.source_address,
            source_vrf=self.source_vrf,
            stream=self.stream,
            subscription_id=self.subscription_id,
            update_policy_on_change=self.update_policy_on_change,
            update_policy_periodic=self.update_policy_periodic)


def get_mdt_subscription(device: Optional[str] = None,
                         subscription_id: Optional[int] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMdtSubscriptionResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['device'] = device
    __args__['subscriptionId'] = subscription_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:iosxe/getMdtSubscription:getMdtSubscription', __args__, opts=opts, typ=GetMdtSubscriptionResult).value

    return AwaitableGetMdtSubscriptionResult(
        device=pulumi.get(__ret__, 'device'),
        encoding=pulumi.get(__ret__, 'encoding'),
        filter_xpath=pulumi.get(__ret__, 'filter_xpath'),
        id=pulumi.get(__ret__, 'id'),
        receivers=pulumi.get(__ret__, 'receivers'),
        source_address=pulumi.get(__ret__, 'source_address'),
        source_vrf=pulumi.get(__ret__, 'source_vrf'),
        stream=pulumi.get(__ret__, 'stream'),
        subscription_id=pulumi.get(__ret__, 'subscription_id'),
        update_policy_on_change=pulumi.get(__ret__, 'update_policy_on_change'),
        update_policy_periodic=pulumi.get(__ret__, 'update_policy_periodic'))


@_utilities.lift_output_func(get_mdt_subscription)
def get_mdt_subscription_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                                subscription_id: Optional[pulumi.Input[int]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetMdtSubscriptionResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...