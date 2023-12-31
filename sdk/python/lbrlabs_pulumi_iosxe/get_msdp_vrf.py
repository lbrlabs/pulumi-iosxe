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

__all__ = [
    'GetMsdpVrfResult',
    'AwaitableGetMsdpVrfResult',
    'get_msdp_vrf',
    'get_msdp_vrf_output',
]

@pulumi.output_type
class GetMsdpVrfResult:
    """
    A collection of values returned by getMsdpVrf.
    """
    def __init__(__self__, device=None, id=None, originator_id=None, passwords=None, peers=None, vrf=None):
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if originator_id and not isinstance(originator_id, str):
            raise TypeError("Expected argument 'originator_id' to be a str")
        pulumi.set(__self__, "originator_id", originator_id)
        if passwords and not isinstance(passwords, list):
            raise TypeError("Expected argument 'passwords' to be a list")
        pulumi.set(__self__, "passwords", passwords)
        if peers and not isinstance(peers, list):
            raise TypeError("Expected argument 'peers' to be a list")
        pulumi.set(__self__, "peers", peers)
        if vrf and not isinstance(vrf, str):
            raise TypeError("Expected argument 'vrf' to be a str")
        pulumi.set(__self__, "vrf", vrf)

    @property
    @pulumi.getter
    def device(self) -> Optional[str]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The path of the retrieved object.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="originatorId")
    def originator_id(self) -> str:
        """
        Configure MSDP Originator ID
        """
        return pulumi.get(self, "originator_id")

    @property
    @pulumi.getter
    def passwords(self) -> Sequence['outputs.GetMsdpVrfPasswordResult']:
        """
        MSDP peer on which the password is to be set
        """
        return pulumi.get(self, "passwords")

    @property
    @pulumi.getter
    def peers(self) -> Sequence['outputs.GetMsdpVrfPeerResult']:
        """
        Configure an MSDP peer
        """
        return pulumi.get(self, "peers")

    @property
    @pulumi.getter
    def vrf(self) -> str:
        return pulumi.get(self, "vrf")


class AwaitableGetMsdpVrfResult(GetMsdpVrfResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMsdpVrfResult(
            device=self.device,
            id=self.id,
            originator_id=self.originator_id,
            passwords=self.passwords,
            peers=self.peers,
            vrf=self.vrf)


def get_msdp_vrf(device: Optional[str] = None,
                 vrf: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMsdpVrfResult:
    """
    This data source can read the MSDP VRF configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.get_msdp_vrf(vrf="VRF1")
    ```


    :param str device: A device name from the provider configuration.
    """
    __args__ = dict()
    __args__['device'] = device
    __args__['vrf'] = vrf
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:index/getMsdpVrf:getMsdpVrf', __args__, opts=opts, typ=GetMsdpVrfResult).value

    return AwaitableGetMsdpVrfResult(
        device=pulumi.get(__ret__, 'device'),
        id=pulumi.get(__ret__, 'id'),
        originator_id=pulumi.get(__ret__, 'originator_id'),
        passwords=pulumi.get(__ret__, 'passwords'),
        peers=pulumi.get(__ret__, 'peers'),
        vrf=pulumi.get(__ret__, 'vrf'))


@_utilities.lift_output_func(get_msdp_vrf)
def get_msdp_vrf_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                        vrf: Optional[pulumi.Input[str]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetMsdpVrfResult]:
    """
    This data source can read the MSDP VRF configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.get_msdp_vrf(vrf="VRF1")
    ```


    :param str device: A device name from the provider configuration.
    """
    ...
