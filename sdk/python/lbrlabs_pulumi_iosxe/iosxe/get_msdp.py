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
    'GetMsdpResult',
    'AwaitableGetMsdpResult',
    'get_msdp',
    'get_msdp_output',
]

@pulumi.output_type
class GetMsdpResult:
    """
    A collection of values returned by getMsdp.
    """
    def __init__(__self__, device=None, id=None, originator_id=None, passwords=None, peers=None):
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
    def passwords(self) -> Sequence['outputs.GetMsdpPasswordResult']:
        """
        MSDP peer on which the password is to be set
        """
        return pulumi.get(self, "passwords")

    @property
    @pulumi.getter
    def peers(self) -> Sequence['outputs.GetMsdpPeerResult']:
        """
        Configure an MSDP peer
        """
        return pulumi.get(self, "peers")


class AwaitableGetMsdpResult(GetMsdpResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMsdpResult(
            device=self.device,
            id=self.id,
            originator_id=self.originator_id,
            passwords=self.passwords,
            peers=self.peers)


def get_msdp(device: Optional[str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMsdpResult:
    """
    This data source can read the MSDP configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_msdp()
    ```


    :param str device: A device name from the provider configuration.
    """
    __args__ = dict()
    __args__['device'] = device
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:iosxe/getMsdp:getMsdp', __args__, opts=opts, typ=GetMsdpResult).value

    return AwaitableGetMsdpResult(
        device=pulumi.get(__ret__, 'device'),
        id=pulumi.get(__ret__, 'id'),
        originator_id=pulumi.get(__ret__, 'originator_id'),
        passwords=pulumi.get(__ret__, 'passwords'),
        peers=pulumi.get(__ret__, 'peers'))


@_utilities.lift_output_func(get_msdp)
def get_msdp_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetMsdpResult]:
    """
    This data source can read the MSDP configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_msdp()
    ```


    :param str device: A device name from the provider configuration.
    """
    ...
