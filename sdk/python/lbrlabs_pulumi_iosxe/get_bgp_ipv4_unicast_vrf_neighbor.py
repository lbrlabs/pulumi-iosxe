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
    'GetBgpIpv4UnicastVrfNeighborResult',
    'AwaitableGetBgpIpv4UnicastVrfNeighborResult',
    'get_bgp_ipv4_unicast_vrf_neighbor',
    'get_bgp_ipv4_unicast_vrf_neighbor_output',
]

@pulumi.output_type
class GetBgpIpv4UnicastVrfNeighborResult:
    """
    A collection of values returned by getBgpIpv4UnicastVrfNeighbor.
    """
    def __init__(__self__, activate=None, asn=None, cluster_id=None, description=None, device=None, disable_connected_check=None, ebgp_multihop=None, ebgp_multihop_max_hop=None, fall_over_bfd_check_control_plane_failure=None, fall_over_bfd_multi_hop=None, fall_over_bfd_single_hop=None, fall_over_bfd_strict_mode=None, fall_over_default_route_map=None, fall_over_maximum_metric_route_map=None, id=None, ip=None, local_as=None, local_as_dual_as=None, local_as_no_prepend=None, local_as_replace_as=None, log_neighbor_changes_disable=None, password=None, password_type=None, remote_as=None, route_maps=None, route_reflector_client=None, send_community=None, shutdown=None, timers_holdtime=None, timers_keepalive_interval=None, timers_minimum_neighbor_hold=None, ttl_security_hops=None, update_source_loopback=None, version=None, vrf=None):
        if activate and not isinstance(activate, bool):
            raise TypeError("Expected argument 'activate' to be a bool")
        pulumi.set(__self__, "activate", activate)
        if asn and not isinstance(asn, str):
            raise TypeError("Expected argument 'asn' to be a str")
        pulumi.set(__self__, "asn", asn)
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        pulumi.set(__self__, "cluster_id", cluster_id)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if disable_connected_check and not isinstance(disable_connected_check, bool):
            raise TypeError("Expected argument 'disable_connected_check' to be a bool")
        pulumi.set(__self__, "disable_connected_check", disable_connected_check)
        if ebgp_multihop and not isinstance(ebgp_multihop, bool):
            raise TypeError("Expected argument 'ebgp_multihop' to be a bool")
        pulumi.set(__self__, "ebgp_multihop", ebgp_multihop)
        if ebgp_multihop_max_hop and not isinstance(ebgp_multihop_max_hop, int):
            raise TypeError("Expected argument 'ebgp_multihop_max_hop' to be a int")
        pulumi.set(__self__, "ebgp_multihop_max_hop", ebgp_multihop_max_hop)
        if fall_over_bfd_check_control_plane_failure and not isinstance(fall_over_bfd_check_control_plane_failure, bool):
            raise TypeError("Expected argument 'fall_over_bfd_check_control_plane_failure' to be a bool")
        pulumi.set(__self__, "fall_over_bfd_check_control_plane_failure", fall_over_bfd_check_control_plane_failure)
        if fall_over_bfd_multi_hop and not isinstance(fall_over_bfd_multi_hop, bool):
            raise TypeError("Expected argument 'fall_over_bfd_multi_hop' to be a bool")
        pulumi.set(__self__, "fall_over_bfd_multi_hop", fall_over_bfd_multi_hop)
        if fall_over_bfd_single_hop and not isinstance(fall_over_bfd_single_hop, bool):
            raise TypeError("Expected argument 'fall_over_bfd_single_hop' to be a bool")
        pulumi.set(__self__, "fall_over_bfd_single_hop", fall_over_bfd_single_hop)
        if fall_over_bfd_strict_mode and not isinstance(fall_over_bfd_strict_mode, bool):
            raise TypeError("Expected argument 'fall_over_bfd_strict_mode' to be a bool")
        pulumi.set(__self__, "fall_over_bfd_strict_mode", fall_over_bfd_strict_mode)
        if fall_over_default_route_map and not isinstance(fall_over_default_route_map, str):
            raise TypeError("Expected argument 'fall_over_default_route_map' to be a str")
        pulumi.set(__self__, "fall_over_default_route_map", fall_over_default_route_map)
        if fall_over_maximum_metric_route_map and not isinstance(fall_over_maximum_metric_route_map, str):
            raise TypeError("Expected argument 'fall_over_maximum_metric_route_map' to be a str")
        pulumi.set(__self__, "fall_over_maximum_metric_route_map", fall_over_maximum_metric_route_map)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ip and not isinstance(ip, str):
            raise TypeError("Expected argument 'ip' to be a str")
        pulumi.set(__self__, "ip", ip)
        if local_as and not isinstance(local_as, str):
            raise TypeError("Expected argument 'local_as' to be a str")
        pulumi.set(__self__, "local_as", local_as)
        if local_as_dual_as and not isinstance(local_as_dual_as, bool):
            raise TypeError("Expected argument 'local_as_dual_as' to be a bool")
        pulumi.set(__self__, "local_as_dual_as", local_as_dual_as)
        if local_as_no_prepend and not isinstance(local_as_no_prepend, bool):
            raise TypeError("Expected argument 'local_as_no_prepend' to be a bool")
        pulumi.set(__self__, "local_as_no_prepend", local_as_no_prepend)
        if local_as_replace_as and not isinstance(local_as_replace_as, bool):
            raise TypeError("Expected argument 'local_as_replace_as' to be a bool")
        pulumi.set(__self__, "local_as_replace_as", local_as_replace_as)
        if log_neighbor_changes_disable and not isinstance(log_neighbor_changes_disable, bool):
            raise TypeError("Expected argument 'log_neighbor_changes_disable' to be a bool")
        pulumi.set(__self__, "log_neighbor_changes_disable", log_neighbor_changes_disable)
        if password and not isinstance(password, str):
            raise TypeError("Expected argument 'password' to be a str")
        pulumi.set(__self__, "password", password)
        if password_type and not isinstance(password_type, int):
            raise TypeError("Expected argument 'password_type' to be a int")
        pulumi.set(__self__, "password_type", password_type)
        if remote_as and not isinstance(remote_as, str):
            raise TypeError("Expected argument 'remote_as' to be a str")
        pulumi.set(__self__, "remote_as", remote_as)
        if route_maps and not isinstance(route_maps, list):
            raise TypeError("Expected argument 'route_maps' to be a list")
        pulumi.set(__self__, "route_maps", route_maps)
        if route_reflector_client and not isinstance(route_reflector_client, bool):
            raise TypeError("Expected argument 'route_reflector_client' to be a bool")
        pulumi.set(__self__, "route_reflector_client", route_reflector_client)
        if send_community and not isinstance(send_community, str):
            raise TypeError("Expected argument 'send_community' to be a str")
        pulumi.set(__self__, "send_community", send_community)
        if shutdown and not isinstance(shutdown, bool):
            raise TypeError("Expected argument 'shutdown' to be a bool")
        pulumi.set(__self__, "shutdown", shutdown)
        if timers_holdtime and not isinstance(timers_holdtime, int):
            raise TypeError("Expected argument 'timers_holdtime' to be a int")
        pulumi.set(__self__, "timers_holdtime", timers_holdtime)
        if timers_keepalive_interval and not isinstance(timers_keepalive_interval, int):
            raise TypeError("Expected argument 'timers_keepalive_interval' to be a int")
        pulumi.set(__self__, "timers_keepalive_interval", timers_keepalive_interval)
        if timers_minimum_neighbor_hold and not isinstance(timers_minimum_neighbor_hold, int):
            raise TypeError("Expected argument 'timers_minimum_neighbor_hold' to be a int")
        pulumi.set(__self__, "timers_minimum_neighbor_hold", timers_minimum_neighbor_hold)
        if ttl_security_hops and not isinstance(ttl_security_hops, int):
            raise TypeError("Expected argument 'ttl_security_hops' to be a int")
        pulumi.set(__self__, "ttl_security_hops", ttl_security_hops)
        if update_source_loopback and not isinstance(update_source_loopback, str):
            raise TypeError("Expected argument 'update_source_loopback' to be a str")
        pulumi.set(__self__, "update_source_loopback", update_source_loopback)
        if version and not isinstance(version, int):
            raise TypeError("Expected argument 'version' to be a int")
        pulumi.set(__self__, "version", version)
        if vrf and not isinstance(vrf, str):
            raise TypeError("Expected argument 'vrf' to be a str")
        pulumi.set(__self__, "vrf", vrf)

    @property
    @pulumi.getter
    def activate(self) -> bool:
        """
        Enable the address family for this neighbor
        """
        return pulumi.get(self, "activate")

    @property
    @pulumi.getter
    def asn(self) -> str:
        return pulumi.get(self, "asn")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> str:
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Neighbor specific description
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
    @pulumi.getter(name="disableConnectedCheck")
    def disable_connected_check(self) -> bool:
        """
        one-hop away EBGP peer using loopback address
        """
        return pulumi.get(self, "disable_connected_check")

    @property
    @pulumi.getter(name="ebgpMultihop")
    def ebgp_multihop(self) -> bool:
        """
        Allow EBGP neighbors not on directly connected networks. For single-hop ebgp peers, delete ebgp-multihop directly.
        """
        return pulumi.get(self, "ebgp_multihop")

    @property
    @pulumi.getter(name="ebgpMultihopMaxHop")
    def ebgp_multihop_max_hop(self) -> int:
        return pulumi.get(self, "ebgp_multihop_max_hop")

    @property
    @pulumi.getter(name="fallOverBfdCheckControlPlaneFailure")
    def fall_over_bfd_check_control_plane_failure(self) -> bool:
        """
        Retrieve control plane dependent failure info from BFD for BGP GR/NSR operation
        """
        return pulumi.get(self, "fall_over_bfd_check_control_plane_failure")

    @property
    @pulumi.getter(name="fallOverBfdMultiHop")
    def fall_over_bfd_multi_hop(self) -> bool:
        """
        Force BFD multi-hop to detect failure
        """
        return pulumi.get(self, "fall_over_bfd_multi_hop")

    @property
    @pulumi.getter(name="fallOverBfdSingleHop")
    def fall_over_bfd_single_hop(self) -> bool:
        """
        Force BFD single-hop to detect failure
        """
        return pulumi.get(self, "fall_over_bfd_single_hop")

    @property
    @pulumi.getter(name="fallOverBfdStrictMode")
    def fall_over_bfd_strict_mode(self) -> bool:
        """
        Enable BFD strict-mode
        """
        return pulumi.get(self, "fall_over_bfd_strict_mode")

    @property
    @pulumi.getter(name="fallOverDefaultRouteMap")
    def fall_over_default_route_map(self) -> str:
        return pulumi.get(self, "fall_over_default_route_map")

    @property
    @pulumi.getter(name="fallOverMaximumMetricRouteMap")
    def fall_over_maximum_metric_route_map(self) -> str:
        return pulumi.get(self, "fall_over_maximum_metric_route_map")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The path of the retrieved object.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ip(self) -> str:
        return pulumi.get(self, "ip")

    @property
    @pulumi.getter(name="localAs")
    def local_as(self) -> str:
        return pulumi.get(self, "local_as")

    @property
    @pulumi.getter(name="localAsDualAs")
    def local_as_dual_as(self) -> bool:
        """
        Accept either real AS or local AS from the ebgp peer
        """
        return pulumi.get(self, "local_as_dual_as")

    @property
    @pulumi.getter(name="localAsNoPrepend")
    def local_as_no_prepend(self) -> bool:
        """
        Do not prepend local-as to updates from ebgp peers
        """
        return pulumi.get(self, "local_as_no_prepend")

    @property
    @pulumi.getter(name="localAsReplaceAs")
    def local_as_replace_as(self) -> bool:
        """
        Replace real AS with local AS in the EBGP updates
        """
        return pulumi.get(self, "local_as_replace_as")

    @property
    @pulumi.getter(name="logNeighborChangesDisable")
    def log_neighbor_changes_disable(self) -> bool:
        """
        disable
        """
        return pulumi.get(self, "log_neighbor_changes_disable")

    @property
    @pulumi.getter
    def password(self) -> str:
        return pulumi.get(self, "password")

    @property
    @pulumi.getter(name="passwordType")
    def password_type(self) -> int:
        """
        Encryption type (0 to disable encryption, 7 for proprietary)
        """
        return pulumi.get(self, "password_type")

    @property
    @pulumi.getter(name="remoteAs")
    def remote_as(self) -> str:
        """
        Specify a BGP peer-group remote-as
        """
        return pulumi.get(self, "remote_as")

    @property
    @pulumi.getter(name="routeMaps")
    def route_maps(self) -> Sequence['outputs.GetBgpIpv4UnicastVrfNeighborRouteMapResult']:
        """
        Apply route map to neighbor
        """
        return pulumi.get(self, "route_maps")

    @property
    @pulumi.getter(name="routeReflectorClient")
    def route_reflector_client(self) -> bool:
        """
        Configure a neighbor as Route Reflector client
        """
        return pulumi.get(self, "route_reflector_client")

    @property
    @pulumi.getter(name="sendCommunity")
    def send_community(self) -> str:
        return pulumi.get(self, "send_community")

    @property
    @pulumi.getter
    def shutdown(self) -> bool:
        """
        Administratively shut down this neighbor
        """
        return pulumi.get(self, "shutdown")

    @property
    @pulumi.getter(name="timersHoldtime")
    def timers_holdtime(self) -> int:
        return pulumi.get(self, "timers_holdtime")

    @property
    @pulumi.getter(name="timersKeepaliveInterval")
    def timers_keepalive_interval(self) -> int:
        return pulumi.get(self, "timers_keepalive_interval")

    @property
    @pulumi.getter(name="timersMinimumNeighborHold")
    def timers_minimum_neighbor_hold(self) -> int:
        return pulumi.get(self, "timers_minimum_neighbor_hold")

    @property
    @pulumi.getter(name="ttlSecurityHops")
    def ttl_security_hops(self) -> int:
        """
        IP hops
        """
        return pulumi.get(self, "ttl_security_hops")

    @property
    @pulumi.getter(name="updateSourceLoopback")
    def update_source_loopback(self) -> str:
        """
        Loopback interface
        """
        return pulumi.get(self, "update_source_loopback")

    @property
    @pulumi.getter
    def version(self) -> int:
        """
        Set the BGP version to match a neighbor
        """
        return pulumi.get(self, "version")

    @property
    @pulumi.getter
    def vrf(self) -> str:
        return pulumi.get(self, "vrf")


class AwaitableGetBgpIpv4UnicastVrfNeighborResult(GetBgpIpv4UnicastVrfNeighborResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBgpIpv4UnicastVrfNeighborResult(
            activate=self.activate,
            asn=self.asn,
            cluster_id=self.cluster_id,
            description=self.description,
            device=self.device,
            disable_connected_check=self.disable_connected_check,
            ebgp_multihop=self.ebgp_multihop,
            ebgp_multihop_max_hop=self.ebgp_multihop_max_hop,
            fall_over_bfd_check_control_plane_failure=self.fall_over_bfd_check_control_plane_failure,
            fall_over_bfd_multi_hop=self.fall_over_bfd_multi_hop,
            fall_over_bfd_single_hop=self.fall_over_bfd_single_hop,
            fall_over_bfd_strict_mode=self.fall_over_bfd_strict_mode,
            fall_over_default_route_map=self.fall_over_default_route_map,
            fall_over_maximum_metric_route_map=self.fall_over_maximum_metric_route_map,
            id=self.id,
            ip=self.ip,
            local_as=self.local_as,
            local_as_dual_as=self.local_as_dual_as,
            local_as_no_prepend=self.local_as_no_prepend,
            local_as_replace_as=self.local_as_replace_as,
            log_neighbor_changes_disable=self.log_neighbor_changes_disable,
            password=self.password,
            password_type=self.password_type,
            remote_as=self.remote_as,
            route_maps=self.route_maps,
            route_reflector_client=self.route_reflector_client,
            send_community=self.send_community,
            shutdown=self.shutdown,
            timers_holdtime=self.timers_holdtime,
            timers_keepalive_interval=self.timers_keepalive_interval,
            timers_minimum_neighbor_hold=self.timers_minimum_neighbor_hold,
            ttl_security_hops=self.ttl_security_hops,
            update_source_loopback=self.update_source_loopback,
            version=self.version,
            vrf=self.vrf)


def get_bgp_ipv4_unicast_vrf_neighbor(asn: Optional[str] = None,
                                      device: Optional[str] = None,
                                      ip: Optional[str] = None,
                                      vrf: Optional[str] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBgpIpv4UnicastVrfNeighborResult:
    """
    This data source can read the BGP IPv4 Unicast VRF Neighbor configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.get_bgp_ipv4_unicast_vrf_neighbor(asn="65000",
        ip="3.3.3.3",
        vrf="VRF1")
    ```


    :param str device: A device name from the provider configuration.
    """
    __args__ = dict()
    __args__['asn'] = asn
    __args__['device'] = device
    __args__['ip'] = ip
    __args__['vrf'] = vrf
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:index/getBgpIpv4UnicastVrfNeighbor:getBgpIpv4UnicastVrfNeighbor', __args__, opts=opts, typ=GetBgpIpv4UnicastVrfNeighborResult).value

    return AwaitableGetBgpIpv4UnicastVrfNeighborResult(
        activate=pulumi.get(__ret__, 'activate'),
        asn=pulumi.get(__ret__, 'asn'),
        cluster_id=pulumi.get(__ret__, 'cluster_id'),
        description=pulumi.get(__ret__, 'description'),
        device=pulumi.get(__ret__, 'device'),
        disable_connected_check=pulumi.get(__ret__, 'disable_connected_check'),
        ebgp_multihop=pulumi.get(__ret__, 'ebgp_multihop'),
        ebgp_multihop_max_hop=pulumi.get(__ret__, 'ebgp_multihop_max_hop'),
        fall_over_bfd_check_control_plane_failure=pulumi.get(__ret__, 'fall_over_bfd_check_control_plane_failure'),
        fall_over_bfd_multi_hop=pulumi.get(__ret__, 'fall_over_bfd_multi_hop'),
        fall_over_bfd_single_hop=pulumi.get(__ret__, 'fall_over_bfd_single_hop'),
        fall_over_bfd_strict_mode=pulumi.get(__ret__, 'fall_over_bfd_strict_mode'),
        fall_over_default_route_map=pulumi.get(__ret__, 'fall_over_default_route_map'),
        fall_over_maximum_metric_route_map=pulumi.get(__ret__, 'fall_over_maximum_metric_route_map'),
        id=pulumi.get(__ret__, 'id'),
        ip=pulumi.get(__ret__, 'ip'),
        local_as=pulumi.get(__ret__, 'local_as'),
        local_as_dual_as=pulumi.get(__ret__, 'local_as_dual_as'),
        local_as_no_prepend=pulumi.get(__ret__, 'local_as_no_prepend'),
        local_as_replace_as=pulumi.get(__ret__, 'local_as_replace_as'),
        log_neighbor_changes_disable=pulumi.get(__ret__, 'log_neighbor_changes_disable'),
        password=pulumi.get(__ret__, 'password'),
        password_type=pulumi.get(__ret__, 'password_type'),
        remote_as=pulumi.get(__ret__, 'remote_as'),
        route_maps=pulumi.get(__ret__, 'route_maps'),
        route_reflector_client=pulumi.get(__ret__, 'route_reflector_client'),
        send_community=pulumi.get(__ret__, 'send_community'),
        shutdown=pulumi.get(__ret__, 'shutdown'),
        timers_holdtime=pulumi.get(__ret__, 'timers_holdtime'),
        timers_keepalive_interval=pulumi.get(__ret__, 'timers_keepalive_interval'),
        timers_minimum_neighbor_hold=pulumi.get(__ret__, 'timers_minimum_neighbor_hold'),
        ttl_security_hops=pulumi.get(__ret__, 'ttl_security_hops'),
        update_source_loopback=pulumi.get(__ret__, 'update_source_loopback'),
        version=pulumi.get(__ret__, 'version'),
        vrf=pulumi.get(__ret__, 'vrf'))


@_utilities.lift_output_func(get_bgp_ipv4_unicast_vrf_neighbor)
def get_bgp_ipv4_unicast_vrf_neighbor_output(asn: Optional[pulumi.Input[str]] = None,
                                             device: Optional[pulumi.Input[Optional[str]]] = None,
                                             ip: Optional[pulumi.Input[str]] = None,
                                             vrf: Optional[pulumi.Input[str]] = None,
                                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetBgpIpv4UnicastVrfNeighborResult]:
    """
    This data source can read the BGP IPv4 Unicast VRF Neighbor configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.get_bgp_ipv4_unicast_vrf_neighbor(asn="65000",
        ip="3.3.3.3",
        vrf="VRF1")
    ```


    :param str device: A device name from the provider configuration.
    """
    ...
