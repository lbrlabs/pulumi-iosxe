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
    'GetOspfVrfResult',
    'AwaitableGetOspfVrfResult',
    'get_ospf_vrf',
    'get_ospf_vrf_output',
]

@pulumi.output_type
class GetOspfVrfResult:
    """
    A collection of values returned by getOspfVrf.
    """
    def __init__(__self__, areas=None, bfd_all_interfaces=None, default_information_originate=None, default_information_originate_always=None, default_metric=None, device=None, distance=None, domain_tag=None, id=None, mpls_ldp_autoconfig=None, mpls_ldp_sync=None, neighbors=None, networks=None, passive_interface_default=None, priority=None, process_id=None, router_id=None, shutdown=None, summary_addresses=None, vrf=None):
        if areas and not isinstance(areas, list):
            raise TypeError("Expected argument 'areas' to be a list")
        pulumi.set(__self__, "areas", areas)
        if bfd_all_interfaces and not isinstance(bfd_all_interfaces, bool):
            raise TypeError("Expected argument 'bfd_all_interfaces' to be a bool")
        pulumi.set(__self__, "bfd_all_interfaces", bfd_all_interfaces)
        if default_information_originate and not isinstance(default_information_originate, bool):
            raise TypeError("Expected argument 'default_information_originate' to be a bool")
        pulumi.set(__self__, "default_information_originate", default_information_originate)
        if default_information_originate_always and not isinstance(default_information_originate_always, bool):
            raise TypeError("Expected argument 'default_information_originate_always' to be a bool")
        pulumi.set(__self__, "default_information_originate_always", default_information_originate_always)
        if default_metric and not isinstance(default_metric, int):
            raise TypeError("Expected argument 'default_metric' to be a int")
        pulumi.set(__self__, "default_metric", default_metric)
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if distance and not isinstance(distance, int):
            raise TypeError("Expected argument 'distance' to be a int")
        pulumi.set(__self__, "distance", distance)
        if domain_tag and not isinstance(domain_tag, int):
            raise TypeError("Expected argument 'domain_tag' to be a int")
        pulumi.set(__self__, "domain_tag", domain_tag)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if mpls_ldp_autoconfig and not isinstance(mpls_ldp_autoconfig, bool):
            raise TypeError("Expected argument 'mpls_ldp_autoconfig' to be a bool")
        pulumi.set(__self__, "mpls_ldp_autoconfig", mpls_ldp_autoconfig)
        if mpls_ldp_sync and not isinstance(mpls_ldp_sync, bool):
            raise TypeError("Expected argument 'mpls_ldp_sync' to be a bool")
        pulumi.set(__self__, "mpls_ldp_sync", mpls_ldp_sync)
        if neighbors and not isinstance(neighbors, list):
            raise TypeError("Expected argument 'neighbors' to be a list")
        pulumi.set(__self__, "neighbors", neighbors)
        if networks and not isinstance(networks, list):
            raise TypeError("Expected argument 'networks' to be a list")
        pulumi.set(__self__, "networks", networks)
        if passive_interface_default and not isinstance(passive_interface_default, bool):
            raise TypeError("Expected argument 'passive_interface_default' to be a bool")
        pulumi.set(__self__, "passive_interface_default", passive_interface_default)
        if priority and not isinstance(priority, int):
            raise TypeError("Expected argument 'priority' to be a int")
        pulumi.set(__self__, "priority", priority)
        if process_id and not isinstance(process_id, int):
            raise TypeError("Expected argument 'process_id' to be a int")
        pulumi.set(__self__, "process_id", process_id)
        if router_id and not isinstance(router_id, str):
            raise TypeError("Expected argument 'router_id' to be a str")
        pulumi.set(__self__, "router_id", router_id)
        if shutdown and not isinstance(shutdown, bool):
            raise TypeError("Expected argument 'shutdown' to be a bool")
        pulumi.set(__self__, "shutdown", shutdown)
        if summary_addresses and not isinstance(summary_addresses, list):
            raise TypeError("Expected argument 'summary_addresses' to be a list")
        pulumi.set(__self__, "summary_addresses", summary_addresses)
        if vrf and not isinstance(vrf, str):
            raise TypeError("Expected argument 'vrf' to be a str")
        pulumi.set(__self__, "vrf", vrf)

    @property
    @pulumi.getter
    def areas(self) -> Sequence['outputs.GetOspfVrfAreaResult']:
        """
        OSPF area parameters
        """
        return pulumi.get(self, "areas")

    @property
    @pulumi.getter(name="bfdAllInterfaces")
    def bfd_all_interfaces(self) -> bool:
        """
        Enable BFD on all interfaces
        """
        return pulumi.get(self, "bfd_all_interfaces")

    @property
    @pulumi.getter(name="defaultInformationOriginate")
    def default_information_originate(self) -> bool:
        """
        Distribute a default route
        """
        return pulumi.get(self, "default_information_originate")

    @property
    @pulumi.getter(name="defaultInformationOriginateAlways")
    def default_information_originate_always(self) -> bool:
        """
        Always advertise default route
        """
        return pulumi.get(self, "default_information_originate_always")

    @property
    @pulumi.getter(name="defaultMetric")
    def default_metric(self) -> int:
        """
        Set metric of redistributed routes
        """
        return pulumi.get(self, "default_metric")

    @property
    @pulumi.getter
    def device(self) -> Optional[str]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def distance(self) -> int:
        """
        Administrative distance
        """
        return pulumi.get(self, "distance")

    @property
    @pulumi.getter(name="domainTag")
    def domain_tag(self) -> int:
        """
        OSPF domain-tag
        """
        return pulumi.get(self, "domain_tag")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The path of the retrieved object.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="mplsLdpAutoconfig")
    def mpls_ldp_autoconfig(self) -> bool:
        """
        Configure LDP automatic configuration
        """
        return pulumi.get(self, "mpls_ldp_autoconfig")

    @property
    @pulumi.getter(name="mplsLdpSync")
    def mpls_ldp_sync(self) -> bool:
        """
        Configure LDP-IGP Synchronization
        """
        return pulumi.get(self, "mpls_ldp_sync")

    @property
    @pulumi.getter
    def neighbors(self) -> Sequence['outputs.GetOspfVrfNeighborResult']:
        """
        Specify a neighbor router
        """
        return pulumi.get(self, "neighbors")

    @property
    @pulumi.getter
    def networks(self) -> Sequence['outputs.GetOspfVrfNetworkResult']:
        """
        Enable routing on an IP network
        """
        return pulumi.get(self, "networks")

    @property
    @pulumi.getter(name="passiveInterfaceDefault")
    def passive_interface_default(self) -> bool:
        """
        Suppress routing updates on all interfaces
        """
        return pulumi.get(self, "passive_interface_default")

    @property
    @pulumi.getter
    def priority(self) -> int:
        """
        OSPF topology priority
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter(name="processId")
    def process_id(self) -> int:
        """
        Process ID
        """
        return pulumi.get(self, "process_id")

    @property
    @pulumi.getter(name="routerId")
    def router_id(self) -> str:
        """
        Override configured router identifier (peers will reset)
        """
        return pulumi.get(self, "router_id")

    @property
    @pulumi.getter
    def shutdown(self) -> bool:
        """
        Shutdown the OSPF protocol under the current instance
        """
        return pulumi.get(self, "shutdown")

    @property
    @pulumi.getter(name="summaryAddresses")
    def summary_addresses(self) -> Sequence['outputs.GetOspfVrfSummaryAddressResult']:
        """
        Configure IP address summaries
        """
        return pulumi.get(self, "summary_addresses")

    @property
    @pulumi.getter
    def vrf(self) -> str:
        """
        VPN Routing/Forwarding Instance
        """
        return pulumi.get(self, "vrf")


class AwaitableGetOspfVrfResult(GetOspfVrfResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetOspfVrfResult(
            areas=self.areas,
            bfd_all_interfaces=self.bfd_all_interfaces,
            default_information_originate=self.default_information_originate,
            default_information_originate_always=self.default_information_originate_always,
            default_metric=self.default_metric,
            device=self.device,
            distance=self.distance,
            domain_tag=self.domain_tag,
            id=self.id,
            mpls_ldp_autoconfig=self.mpls_ldp_autoconfig,
            mpls_ldp_sync=self.mpls_ldp_sync,
            neighbors=self.neighbors,
            networks=self.networks,
            passive_interface_default=self.passive_interface_default,
            priority=self.priority,
            process_id=self.process_id,
            router_id=self.router_id,
            shutdown=self.shutdown,
            summary_addresses=self.summary_addresses,
            vrf=self.vrf)


def get_ospf_vrf(device: Optional[str] = None,
                 process_id: Optional[int] = None,
                 vrf: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetOspfVrfResult:
    """
    This data source can read the OSPF VRF configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_ospf_vrf(process_id=2,
        vrf="VRF1")
    ```


    :param str device: A device name from the provider configuration.
    :param int process_id: Process ID
    :param str vrf: VPN Routing/Forwarding Instance
    """
    __args__ = dict()
    __args__['device'] = device
    __args__['processId'] = process_id
    __args__['vrf'] = vrf
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:iosxe/getOspfVrf:getOspfVrf', __args__, opts=opts, typ=GetOspfVrfResult).value

    return AwaitableGetOspfVrfResult(
        areas=pulumi.get(__ret__, 'areas'),
        bfd_all_interfaces=pulumi.get(__ret__, 'bfd_all_interfaces'),
        default_information_originate=pulumi.get(__ret__, 'default_information_originate'),
        default_information_originate_always=pulumi.get(__ret__, 'default_information_originate_always'),
        default_metric=pulumi.get(__ret__, 'default_metric'),
        device=pulumi.get(__ret__, 'device'),
        distance=pulumi.get(__ret__, 'distance'),
        domain_tag=pulumi.get(__ret__, 'domain_tag'),
        id=pulumi.get(__ret__, 'id'),
        mpls_ldp_autoconfig=pulumi.get(__ret__, 'mpls_ldp_autoconfig'),
        mpls_ldp_sync=pulumi.get(__ret__, 'mpls_ldp_sync'),
        neighbors=pulumi.get(__ret__, 'neighbors'),
        networks=pulumi.get(__ret__, 'networks'),
        passive_interface_default=pulumi.get(__ret__, 'passive_interface_default'),
        priority=pulumi.get(__ret__, 'priority'),
        process_id=pulumi.get(__ret__, 'process_id'),
        router_id=pulumi.get(__ret__, 'router_id'),
        shutdown=pulumi.get(__ret__, 'shutdown'),
        summary_addresses=pulumi.get(__ret__, 'summary_addresses'),
        vrf=pulumi.get(__ret__, 'vrf'))


@_utilities.lift_output_func(get_ospf_vrf)
def get_ospf_vrf_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                        process_id: Optional[pulumi.Input[int]] = None,
                        vrf: Optional[pulumi.Input[str]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetOspfVrfResult]:
    """
    This data source can read the OSPF VRF configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_ospf_vrf(process_id=2,
        vrf="VRF1")
    ```


    :param str device: A device name from the provider configuration.
    :param int process_id: Process ID
    :param str vrf: VPN Routing/Forwarding Instance
    """
    ...
