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
    'GetInterfaceNveResult',
    'AwaitableGetInterfaceNveResult',
    'get_interface_nve',
    'get_interface_nve_output',
]

@pulumi.output_type
class GetInterfaceNveResult:
    """
    A collection of values returned by getInterfaceNve.
    """
    def __init__(__self__, description=None, device=None, host_reachability_protocol_bgp=None, id=None, name=None, shutdown=None, source_interface_loopback=None, vni_vrfs=None, vnis=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if host_reachability_protocol_bgp and not isinstance(host_reachability_protocol_bgp, bool):
            raise TypeError("Expected argument 'host_reachability_protocol_bgp' to be a bool")
        pulumi.set(__self__, "host_reachability_protocol_bgp", host_reachability_protocol_bgp)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, int):
            raise TypeError("Expected argument 'name' to be a int")
        pulumi.set(__self__, "name", name)
        if shutdown and not isinstance(shutdown, bool):
            raise TypeError("Expected argument 'shutdown' to be a bool")
        pulumi.set(__self__, "shutdown", shutdown)
        if source_interface_loopback and not isinstance(source_interface_loopback, int):
            raise TypeError("Expected argument 'source_interface_loopback' to be a int")
        pulumi.set(__self__, "source_interface_loopback", source_interface_loopback)
        if vni_vrfs and not isinstance(vni_vrfs, list):
            raise TypeError("Expected argument 'vni_vrfs' to be a list")
        pulumi.set(__self__, "vni_vrfs", vni_vrfs)
        if vnis and not isinstance(vnis, list):
            raise TypeError("Expected argument 'vnis' to be a list")
        pulumi.set(__self__, "vnis", vnis)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Interface specific description
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def device(self) -> Optional[str]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter(name="hostReachabilityProtocolBgp")
    def host_reachability_protocol_bgp(self) -> bool:
        return pulumi.get(self, "host_reachability_protocol_bgp")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The path of the retrieved object.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> int:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def shutdown(self) -> bool:
        """
        Shutdown the selected interface
        """
        return pulumi.get(self, "shutdown")

    @property
    @pulumi.getter(name="sourceInterfaceLoopback")
    def source_interface_loopback(self) -> int:
        """
        Loopback interface
        """
        return pulumi.get(self, "source_interface_loopback")

    @property
    @pulumi.getter(name="vniVrfs")
    def vni_vrfs(self) -> Sequence['outputs.GetInterfaceNveVniVrfResult']:
        """
        Configure VNI information
        """
        return pulumi.get(self, "vni_vrfs")

    @property
    @pulumi.getter
    def vnis(self) -> Sequence['outputs.GetInterfaceNveVniResult']:
        """
        Configure VNI information
        """
        return pulumi.get(self, "vnis")


class AwaitableGetInterfaceNveResult(GetInterfaceNveResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInterfaceNveResult(
            description=self.description,
            device=self.device,
            host_reachability_protocol_bgp=self.host_reachability_protocol_bgp,
            id=self.id,
            name=self.name,
            shutdown=self.shutdown,
            source_interface_loopback=self.source_interface_loopback,
            vni_vrfs=self.vni_vrfs,
            vnis=self.vnis)


def get_interface_nve(device: Optional[str] = None,
                      name: Optional[int] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInterfaceNveResult:
    """
    This data source can read the Interface NVE configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_interface_nve(name=1)
    ```


    :param str device: A device name from the provider configuration.
    """
    __args__ = dict()
    __args__['device'] = device
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:iosxe/getInterfaceNve:getInterfaceNve', __args__, opts=opts, typ=GetInterfaceNveResult).value

    return AwaitableGetInterfaceNveResult(
        description=pulumi.get(__ret__, 'description'),
        device=pulumi.get(__ret__, 'device'),
        host_reachability_protocol_bgp=pulumi.get(__ret__, 'host_reachability_protocol_bgp'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        shutdown=pulumi.get(__ret__, 'shutdown'),
        source_interface_loopback=pulumi.get(__ret__, 'source_interface_loopback'),
        vni_vrfs=pulumi.get(__ret__, 'vni_vrfs'),
        vnis=pulumi.get(__ret__, 'vnis'))


@_utilities.lift_output_func(get_interface_nve)
def get_interface_nve_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                             name: Optional[pulumi.Input[int]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetInterfaceNveResult]:
    """
    This data source can read the Interface NVE configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_interface_nve(name=1)
    ```


    :param str device: A device name from the provider configuration.
    """
    ...
