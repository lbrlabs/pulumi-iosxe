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
    'GetCdpResult',
    'AwaitableGetCdpResult',
    'get_cdp',
    'get_cdp_output',
]

@pulumi.output_type
class GetCdpResult:
    """
    A collection of values returned by getCdp.
    """
    def __init__(__self__, device=None, filter_tlv_list=None, holdtime=None, id=None, run=None, timer=None, tlv_lists=None):
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if filter_tlv_list and not isinstance(filter_tlv_list, str):
            raise TypeError("Expected argument 'filter_tlv_list' to be a str")
        pulumi.set(__self__, "filter_tlv_list", filter_tlv_list)
        if holdtime and not isinstance(holdtime, int):
            raise TypeError("Expected argument 'holdtime' to be a int")
        pulumi.set(__self__, "holdtime", holdtime)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if run and not isinstance(run, bool):
            raise TypeError("Expected argument 'run' to be a bool")
        pulumi.set(__self__, "run", run)
        if timer and not isinstance(timer, int):
            raise TypeError("Expected argument 'timer' to be a int")
        pulumi.set(__self__, "timer", timer)
        if tlv_lists and not isinstance(tlv_lists, list):
            raise TypeError("Expected argument 'tlv_lists' to be a list")
        pulumi.set(__self__, "tlv_lists", tlv_lists)

    @property
    @pulumi.getter
    def device(self) -> Optional[str]:
        return pulumi.get(self, "device")

    @property
    @pulumi.getter(name="filterTlvList")
    def filter_tlv_list(self) -> str:
        return pulumi.get(self, "filter_tlv_list")

    @property
    @pulumi.getter
    def holdtime(self) -> int:
        return pulumi.get(self, "holdtime")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def run(self) -> bool:
        return pulumi.get(self, "run")

    @property
    @pulumi.getter
    def timer(self) -> int:
        return pulumi.get(self, "timer")

    @property
    @pulumi.getter(name="tlvLists")
    def tlv_lists(self) -> Sequence['outputs.GetCdpTlvListResult']:
        return pulumi.get(self, "tlv_lists")


class AwaitableGetCdpResult(GetCdpResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCdpResult(
            device=self.device,
            filter_tlv_list=self.filter_tlv_list,
            holdtime=self.holdtime,
            id=self.id,
            run=self.run,
            timer=self.timer,
            tlv_lists=self.tlv_lists)


def get_cdp(device: Optional[str] = None,
            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCdpResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['device'] = device
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:iosxe/getCdp:getCdp', __args__, opts=opts, typ=GetCdpResult).value

    return AwaitableGetCdpResult(
        device=pulumi.get(__ret__, 'device'),
        filter_tlv_list=pulumi.get(__ret__, 'filter_tlv_list'),
        holdtime=pulumi.get(__ret__, 'holdtime'),
        id=pulumi.get(__ret__, 'id'),
        run=pulumi.get(__ret__, 'run'),
        timer=pulumi.get(__ret__, 'timer'),
        tlv_lists=pulumi.get(__ret__, 'tlv_lists'))


@_utilities.lift_output_func(get_cdp)
def get_cdp_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCdpResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...
