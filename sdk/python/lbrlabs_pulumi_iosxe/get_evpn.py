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
    'GetEvpnResult',
    'AwaitableGetEvpnResult',
    'get_evpn',
    'get_evpn_output',
]

@pulumi.output_type
class GetEvpnResult:
    """
    A collection of values returned by getEvpn.
    """
    def __init__(__self__, default_gateway_advertise=None, device=None, id=None, ip_duplication_limit=None, ip_duplication_time=None, logging_peer_state=None, mac_duplication_limit=None, mac_duplication_time=None, replication_type_ingress=None, replication_type_mp2mp=None, replication_type_p2mp=None, replication_type_static=None, route_target_auto_vni=None, router_id_loopback=None):
        if default_gateway_advertise and not isinstance(default_gateway_advertise, bool):
            raise TypeError("Expected argument 'default_gateway_advertise' to be a bool")
        pulumi.set(__self__, "default_gateway_advertise", default_gateway_advertise)
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ip_duplication_limit and not isinstance(ip_duplication_limit, int):
            raise TypeError("Expected argument 'ip_duplication_limit' to be a int")
        pulumi.set(__self__, "ip_duplication_limit", ip_duplication_limit)
        if ip_duplication_time and not isinstance(ip_duplication_time, int):
            raise TypeError("Expected argument 'ip_duplication_time' to be a int")
        pulumi.set(__self__, "ip_duplication_time", ip_duplication_time)
        if logging_peer_state and not isinstance(logging_peer_state, bool):
            raise TypeError("Expected argument 'logging_peer_state' to be a bool")
        pulumi.set(__self__, "logging_peer_state", logging_peer_state)
        if mac_duplication_limit and not isinstance(mac_duplication_limit, int):
            raise TypeError("Expected argument 'mac_duplication_limit' to be a int")
        pulumi.set(__self__, "mac_duplication_limit", mac_duplication_limit)
        if mac_duplication_time and not isinstance(mac_duplication_time, int):
            raise TypeError("Expected argument 'mac_duplication_time' to be a int")
        pulumi.set(__self__, "mac_duplication_time", mac_duplication_time)
        if replication_type_ingress and not isinstance(replication_type_ingress, bool):
            raise TypeError("Expected argument 'replication_type_ingress' to be a bool")
        pulumi.set(__self__, "replication_type_ingress", replication_type_ingress)
        if replication_type_mp2mp and not isinstance(replication_type_mp2mp, bool):
            raise TypeError("Expected argument 'replication_type_mp2mp' to be a bool")
        pulumi.set(__self__, "replication_type_mp2mp", replication_type_mp2mp)
        if replication_type_p2mp and not isinstance(replication_type_p2mp, bool):
            raise TypeError("Expected argument 'replication_type_p2mp' to be a bool")
        pulumi.set(__self__, "replication_type_p2mp", replication_type_p2mp)
        if replication_type_static and not isinstance(replication_type_static, bool):
            raise TypeError("Expected argument 'replication_type_static' to be a bool")
        pulumi.set(__self__, "replication_type_static", replication_type_static)
        if route_target_auto_vni and not isinstance(route_target_auto_vni, bool):
            raise TypeError("Expected argument 'route_target_auto_vni' to be a bool")
        pulumi.set(__self__, "route_target_auto_vni", route_target_auto_vni)
        if router_id_loopback and not isinstance(router_id_loopback, int):
            raise TypeError("Expected argument 'router_id_loopback' to be a int")
        pulumi.set(__self__, "router_id_loopback", router_id_loopback)

    @property
    @pulumi.getter(name="defaultGatewayAdvertise")
    def default_gateway_advertise(self) -> bool:
        """
        Advertise Default Gateway MAC/IP routes
        """
        return pulumi.get(self, "default_gateway_advertise")

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
    @pulumi.getter(name="ipDuplicationLimit")
    def ip_duplication_limit(self) -> int:
        """
        Number of IP moves within specified time interval
        """
        return pulumi.get(self, "ip_duplication_limit")

    @property
    @pulumi.getter(name="ipDuplicationTime")
    def ip_duplication_time(self) -> int:
        """
        IP duplication timer
        """
        return pulumi.get(self, "ip_duplication_time")

    @property
    @pulumi.getter(name="loggingPeerState")
    def logging_peer_state(self) -> bool:
        """
        Peer state transition logging
        """
        return pulumi.get(self, "logging_peer_state")

    @property
    @pulumi.getter(name="macDuplicationLimit")
    def mac_duplication_limit(self) -> int:
        """
        Number of MAC moves within specified time interval
        """
        return pulumi.get(self, "mac_duplication_limit")

    @property
    @pulumi.getter(name="macDuplicationTime")
    def mac_duplication_time(self) -> int:
        """
        MAC duplication timer
        """
        return pulumi.get(self, "mac_duplication_time")

    @property
    @pulumi.getter(name="replicationTypeIngress")
    def replication_type_ingress(self) -> bool:
        """
        Ingress replication
        """
        return pulumi.get(self, "replication_type_ingress")

    @property
    @pulumi.getter(name="replicationTypeMp2mp")
    def replication_type_mp2mp(self) -> bool:
        """
        mp2mp replication
        """
        return pulumi.get(self, "replication_type_mp2mp")

    @property
    @pulumi.getter(name="replicationTypeP2mp")
    def replication_type_p2mp(self) -> bool:
        """
        p2mp replication
        """
        return pulumi.get(self, "replication_type_p2mp")

    @property
    @pulumi.getter(name="replicationTypeStatic")
    def replication_type_static(self) -> bool:
        """
        Static replication
        """
        return pulumi.get(self, "replication_type_static")

    @property
    @pulumi.getter(name="routeTargetAutoVni")
    def route_target_auto_vni(self) -> bool:
        """
        Set vni-based route-target
        """
        return pulumi.get(self, "route_target_auto_vni")

    @property
    @pulumi.getter(name="routerIdLoopback")
    def router_id_loopback(self) -> int:
        """
        Loopback interface
        """
        return pulumi.get(self, "router_id_loopback")


class AwaitableGetEvpnResult(GetEvpnResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEvpnResult(
            default_gateway_advertise=self.default_gateway_advertise,
            device=self.device,
            id=self.id,
            ip_duplication_limit=self.ip_duplication_limit,
            ip_duplication_time=self.ip_duplication_time,
            logging_peer_state=self.logging_peer_state,
            mac_duplication_limit=self.mac_duplication_limit,
            mac_duplication_time=self.mac_duplication_time,
            replication_type_ingress=self.replication_type_ingress,
            replication_type_mp2mp=self.replication_type_mp2mp,
            replication_type_p2mp=self.replication_type_p2mp,
            replication_type_static=self.replication_type_static,
            route_target_auto_vni=self.route_target_auto_vni,
            router_id_loopback=self.router_id_loopback)


def get_evpn(device: Optional[str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEvpnResult:
    """
    This data source can read the EVPN configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.get_evpn()
    ```


    :param str device: A device name from the provider configuration.
    """
    __args__ = dict()
    __args__['device'] = device
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:index/getEvpn:getEvpn', __args__, opts=opts, typ=GetEvpnResult).value

    return AwaitableGetEvpnResult(
        default_gateway_advertise=pulumi.get(__ret__, 'default_gateway_advertise'),
        device=pulumi.get(__ret__, 'device'),
        id=pulumi.get(__ret__, 'id'),
        ip_duplication_limit=pulumi.get(__ret__, 'ip_duplication_limit'),
        ip_duplication_time=pulumi.get(__ret__, 'ip_duplication_time'),
        logging_peer_state=pulumi.get(__ret__, 'logging_peer_state'),
        mac_duplication_limit=pulumi.get(__ret__, 'mac_duplication_limit'),
        mac_duplication_time=pulumi.get(__ret__, 'mac_duplication_time'),
        replication_type_ingress=pulumi.get(__ret__, 'replication_type_ingress'),
        replication_type_mp2mp=pulumi.get(__ret__, 'replication_type_mp2mp'),
        replication_type_p2mp=pulumi.get(__ret__, 'replication_type_p2mp'),
        replication_type_static=pulumi.get(__ret__, 'replication_type_static'),
        route_target_auto_vni=pulumi.get(__ret__, 'route_target_auto_vni'),
        router_id_loopback=pulumi.get(__ret__, 'router_id_loopback'))


@_utilities.lift_output_func(get_evpn)
def get_evpn_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEvpnResult]:
    """
    This data source can read the EVPN configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.get_evpn()
    ```


    :param str device: A device name from the provider configuration.
    """
    ...
