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
    'GetAaaAccountingResult',
    'AwaitableGetAaaAccountingResult',
    'get_aaa_accounting',
    'get_aaa_accounting_output',
]

@pulumi.output_type
class GetAaaAccountingResult:
    """
    A collection of values returned by getAaaAccounting.
    """
    def __init__(__self__, device=None, execs=None, id=None, identity_default_start_stop_group1=None, identity_default_start_stop_group2=None, identity_default_start_stop_group3=None, identity_default_start_stop_group4=None, networks=None, system_guarantee_first=None, update_newinfo_periodic=None):
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if execs and not isinstance(execs, list):
            raise TypeError("Expected argument 'execs' to be a list")
        pulumi.set(__self__, "execs", execs)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identity_default_start_stop_group1 and not isinstance(identity_default_start_stop_group1, str):
            raise TypeError("Expected argument 'identity_default_start_stop_group1' to be a str")
        pulumi.set(__self__, "identity_default_start_stop_group1", identity_default_start_stop_group1)
        if identity_default_start_stop_group2 and not isinstance(identity_default_start_stop_group2, str):
            raise TypeError("Expected argument 'identity_default_start_stop_group2' to be a str")
        pulumi.set(__self__, "identity_default_start_stop_group2", identity_default_start_stop_group2)
        if identity_default_start_stop_group3 and not isinstance(identity_default_start_stop_group3, str):
            raise TypeError("Expected argument 'identity_default_start_stop_group3' to be a str")
        pulumi.set(__self__, "identity_default_start_stop_group3", identity_default_start_stop_group3)
        if identity_default_start_stop_group4 and not isinstance(identity_default_start_stop_group4, str):
            raise TypeError("Expected argument 'identity_default_start_stop_group4' to be a str")
        pulumi.set(__self__, "identity_default_start_stop_group4", identity_default_start_stop_group4)
        if networks and not isinstance(networks, list):
            raise TypeError("Expected argument 'networks' to be a list")
        pulumi.set(__self__, "networks", networks)
        if system_guarantee_first and not isinstance(system_guarantee_first, bool):
            raise TypeError("Expected argument 'system_guarantee_first' to be a bool")
        pulumi.set(__self__, "system_guarantee_first", system_guarantee_first)
        if update_newinfo_periodic and not isinstance(update_newinfo_periodic, int):
            raise TypeError("Expected argument 'update_newinfo_periodic' to be a int")
        pulumi.set(__self__, "update_newinfo_periodic", update_newinfo_periodic)

    @property
    @pulumi.getter
    def device(self) -> Optional[str]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def execs(self) -> Sequence['outputs.GetAaaAccountingExecResult']:
        """
        For starting an exec (shell).
        """
        return pulumi.get(self, "execs")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The path of the retrieved object.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="identityDefaultStartStopGroup1")
    def identity_default_start_stop_group1(self) -> str:
        """
        Use Server-group
        """
        return pulumi.get(self, "identity_default_start_stop_group1")

    @property
    @pulumi.getter(name="identityDefaultStartStopGroup2")
    def identity_default_start_stop_group2(self) -> str:
        """
        Use Server-group
        """
        return pulumi.get(self, "identity_default_start_stop_group2")

    @property
    @pulumi.getter(name="identityDefaultStartStopGroup3")
    def identity_default_start_stop_group3(self) -> str:
        """
        Use Server-group
        """
        return pulumi.get(self, "identity_default_start_stop_group3")

    @property
    @pulumi.getter(name="identityDefaultStartStopGroup4")
    def identity_default_start_stop_group4(self) -> str:
        """
        Use Server-group
        """
        return pulumi.get(self, "identity_default_start_stop_group4")

    @property
    @pulumi.getter
    def networks(self) -> Sequence['outputs.GetAaaAccountingNetworkResult']:
        """
        For network services. (PPP, SLIP, ARAP)
        """
        return pulumi.get(self, "networks")

    @property
    @pulumi.getter(name="systemGuaranteeFirst")
    def system_guarantee_first(self) -> bool:
        """
        Guarantee system accounting as first record.
        """
        return pulumi.get(self, "system_guarantee_first")

    @property
    @pulumi.getter(name="updateNewinfoPeriodic")
    def update_newinfo_periodic(self) -> int:
        """
        Periodic intervals to send accounting update records(in minutes)
        """
        return pulumi.get(self, "update_newinfo_periodic")


class AwaitableGetAaaAccountingResult(GetAaaAccountingResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAaaAccountingResult(
            device=self.device,
            execs=self.execs,
            id=self.id,
            identity_default_start_stop_group1=self.identity_default_start_stop_group1,
            identity_default_start_stop_group2=self.identity_default_start_stop_group2,
            identity_default_start_stop_group3=self.identity_default_start_stop_group3,
            identity_default_start_stop_group4=self.identity_default_start_stop_group4,
            networks=self.networks,
            system_guarantee_first=self.system_guarantee_first,
            update_newinfo_periodic=self.update_newinfo_periodic)


def get_aaa_accounting(device: Optional[str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAaaAccountingResult:
    """
    This data source can read the AAA Accounting configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_aaa_accounting()
    ```


    :param str device: A device name from the provider configuration.
    """
    __args__ = dict()
    __args__['device'] = device
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:iosxe/getAaaAccounting:getAaaAccounting', __args__, opts=opts, typ=GetAaaAccountingResult).value

    return AwaitableGetAaaAccountingResult(
        device=pulumi.get(__ret__, 'device'),
        execs=pulumi.get(__ret__, 'execs'),
        id=pulumi.get(__ret__, 'id'),
        identity_default_start_stop_group1=pulumi.get(__ret__, 'identity_default_start_stop_group1'),
        identity_default_start_stop_group2=pulumi.get(__ret__, 'identity_default_start_stop_group2'),
        identity_default_start_stop_group3=pulumi.get(__ret__, 'identity_default_start_stop_group3'),
        identity_default_start_stop_group4=pulumi.get(__ret__, 'identity_default_start_stop_group4'),
        networks=pulumi.get(__ret__, 'networks'),
        system_guarantee_first=pulumi.get(__ret__, 'system_guarantee_first'),
        update_newinfo_periodic=pulumi.get(__ret__, 'update_newinfo_periodic'))


@_utilities.lift_output_func(get_aaa_accounting)
def get_aaa_accounting_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAaaAccountingResult]:
    """
    This data source can read the AAA Accounting configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_aaa_accounting()
    ```


    :param str device: A device name from the provider configuration.
    """
    ...
