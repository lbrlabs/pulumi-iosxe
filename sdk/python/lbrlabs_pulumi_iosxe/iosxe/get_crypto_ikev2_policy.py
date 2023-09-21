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
    'GetCryptoIkev2PolicyResult',
    'AwaitableGetCryptoIkev2PolicyResult',
    'get_crypto_ikev2_policy',
    'get_crypto_ikev2_policy_output',
]

@pulumi.output_type
class GetCryptoIkev2PolicyResult:
    """
    A collection of values returned by getCryptoIkev2Policy.
    """
    def __init__(__self__, device=None, id=None, match_address_local_ips=None, match_fvrf=None, match_fvrf_any=None, match_inbound_only=None, name=None, proposals=None):
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if match_address_local_ips and not isinstance(match_address_local_ips, list):
            raise TypeError("Expected argument 'match_address_local_ips' to be a list")
        pulumi.set(__self__, "match_address_local_ips", match_address_local_ips)
        if match_fvrf and not isinstance(match_fvrf, str):
            raise TypeError("Expected argument 'match_fvrf' to be a str")
        pulumi.set(__self__, "match_fvrf", match_fvrf)
        if match_fvrf_any and not isinstance(match_fvrf_any, bool):
            raise TypeError("Expected argument 'match_fvrf_any' to be a bool")
        pulumi.set(__self__, "match_fvrf_any", match_fvrf_any)
        if match_inbound_only and not isinstance(match_inbound_only, bool):
            raise TypeError("Expected argument 'match_inbound_only' to be a bool")
        pulumi.set(__self__, "match_inbound_only", match_inbound_only)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if proposals and not isinstance(proposals, list):
            raise TypeError("Expected argument 'proposals' to be a list")
        pulumi.set(__self__, "proposals", proposals)

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
    @pulumi.getter(name="matchAddressLocalIps")
    def match_address_local_ips(self) -> Sequence[str]:
        """
        Local address
        """
        return pulumi.get(self, "match_address_local_ips")

    @property
    @pulumi.getter(name="matchFvrf")
    def match_fvrf(self) -> str:
        return pulumi.get(self, "match_fvrf")

    @property
    @pulumi.getter(name="matchFvrfAny")
    def match_fvrf_any(self) -> bool:
        """
        Any fvrf
        """
        return pulumi.get(self, "match_fvrf_any")

    @property
    @pulumi.getter(name="matchInboundOnly")
    def match_inbound_only(self) -> bool:
        """
        inbound only for controller
        """
        return pulumi.get(self, "match_inbound_only")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def proposals(self) -> Sequence['outputs.GetCryptoIkev2PolicyProposalResult']:
        """
        Specify Proposal
        """
        return pulumi.get(self, "proposals")


class AwaitableGetCryptoIkev2PolicyResult(GetCryptoIkev2PolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCryptoIkev2PolicyResult(
            device=self.device,
            id=self.id,
            match_address_local_ips=self.match_address_local_ips,
            match_fvrf=self.match_fvrf,
            match_fvrf_any=self.match_fvrf_any,
            match_inbound_only=self.match_inbound_only,
            name=self.name,
            proposals=self.proposals)


def get_crypto_ikev2_policy(device: Optional[str] = None,
                            name: Optional[str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCryptoIkev2PolicyResult:
    """
    This data source can read the Crypto IKEv2 Policy configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_crypto_ikev2_policy(name="policy1")
    ```


    :param str device: A device name from the provider configuration.
    """
    __args__ = dict()
    __args__['device'] = device
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:iosxe/getCryptoIkev2Policy:getCryptoIkev2Policy', __args__, opts=opts, typ=GetCryptoIkev2PolicyResult).value

    return AwaitableGetCryptoIkev2PolicyResult(
        device=pulumi.get(__ret__, 'device'),
        id=pulumi.get(__ret__, 'id'),
        match_address_local_ips=pulumi.get(__ret__, 'match_address_local_ips'),
        match_fvrf=pulumi.get(__ret__, 'match_fvrf'),
        match_fvrf_any=pulumi.get(__ret__, 'match_fvrf_any'),
        match_inbound_only=pulumi.get(__ret__, 'match_inbound_only'),
        name=pulumi.get(__ret__, 'name'),
        proposals=pulumi.get(__ret__, 'proposals'))


@_utilities.lift_output_func(get_crypto_ikev2_policy)
def get_crypto_ikev2_policy_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                                   name: Optional[pulumi.Input[str]] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCryptoIkev2PolicyResult]:
    """
    This data source can read the Crypto IKEv2 Policy configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_crypto_ikev2_policy(name="policy1")
    ```


    :param str device: A device name from the provider configuration.
    """
    ...
