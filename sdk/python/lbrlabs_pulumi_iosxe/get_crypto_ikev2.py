# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetCryptoIkev2Result',
    'AwaitableGetCryptoIkev2Result',
    'get_crypto_ikev2',
    'get_crypto_ikev2_output',
]

@pulumi.output_type
class GetCryptoIkev2Result:
    """
    A collection of values returned by getCryptoIkev2.
    """
    def __init__(__self__, device=None, dpd=None, dpd_query=None, dpd_retry_interval=None, id=None, nat_keepalive=None):
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if dpd and not isinstance(dpd, int):
            raise TypeError("Expected argument 'dpd' to be a int")
        pulumi.set(__self__, "dpd", dpd)
        if dpd_query and not isinstance(dpd_query, str):
            raise TypeError("Expected argument 'dpd_query' to be a str")
        pulumi.set(__self__, "dpd_query", dpd_query)
        if dpd_retry_interval and not isinstance(dpd_retry_interval, int):
            raise TypeError("Expected argument 'dpd_retry_interval' to be a int")
        pulumi.set(__self__, "dpd_retry_interval", dpd_retry_interval)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if nat_keepalive and not isinstance(nat_keepalive, int):
            raise TypeError("Expected argument 'nat_keepalive' to be a int")
        pulumi.set(__self__, "nat_keepalive", nat_keepalive)

    @property
    @pulumi.getter
    def device(self) -> Optional[str]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def dpd(self) -> int:
        """
        Enable IKE liveness check for peers
        """
        return pulumi.get(self, "dpd")

    @property
    @pulumi.getter(name="dpdQuery")
    def dpd_query(self) -> str:
        return pulumi.get(self, "dpd_query")

    @property
    @pulumi.getter(name="dpdRetryInterval")
    def dpd_retry_interval(self) -> int:
        return pulumi.get(self, "dpd_retry_interval")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The path of the retrieved object.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="natKeepalive")
    def nat_keepalive(self) -> int:
        """
        Set NAT keepalive interval
        """
        return pulumi.get(self, "nat_keepalive")


class AwaitableGetCryptoIkev2Result(GetCryptoIkev2Result):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCryptoIkev2Result(
            device=self.device,
            dpd=self.dpd,
            dpd_query=self.dpd_query,
            dpd_retry_interval=self.dpd_retry_interval,
            id=self.id,
            nat_keepalive=self.nat_keepalive)


def get_crypto_ikev2(device: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCryptoIkev2Result:
    """
    This data source can read the Crypto IKEv2 configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.get_crypto_ikev2()
    ```


    :param str device: A device name from the provider configuration.
    """
    __args__ = dict()
    __args__['device'] = device
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:index/getCryptoIkev2:getCryptoIkev2', __args__, opts=opts, typ=GetCryptoIkev2Result).value

    return AwaitableGetCryptoIkev2Result(
        device=pulumi.get(__ret__, 'device'),
        dpd=pulumi.get(__ret__, 'dpd'),
        dpd_query=pulumi.get(__ret__, 'dpd_query'),
        dpd_retry_interval=pulumi.get(__ret__, 'dpd_retry_interval'),
        id=pulumi.get(__ret__, 'id'),
        nat_keepalive=pulumi.get(__ret__, 'nat_keepalive'))


@_utilities.lift_output_func(get_crypto_ikev2)
def get_crypto_ikev2_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCryptoIkev2Result]:
    """
    This data source can read the Crypto IKEv2 configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.get_crypto_ikev2()
    ```


    :param str device: A device name from the provider configuration.
    """
    ...
