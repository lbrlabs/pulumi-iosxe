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
    'GetEvpnInstanceResult',
    'AwaitableGetEvpnInstanceResult',
    'get_evpn_instance',
    'get_evpn_instance_output',
]

@pulumi.output_type
class GetEvpnInstanceResult:
    """
    A collection of values returned by getEvpnInstance.
    """
    def __init__(__self__, device=None, evpn_instance_num=None, id=None, vlan_based_auto_route_target=None, vlan_based_default_gateway_advertise=None, vlan_based_encapsulation=None, vlan_based_ip_local_learning_disable=None, vlan_based_ip_local_learning_enable=None, vlan_based_rd=None, vlan_based_re_originate_route_type5=None, vlan_based_replication_type_ingress=None, vlan_based_replication_type_mp2mp=None, vlan_based_replication_type_p2mp=None, vlan_based_replication_type_static=None, vlan_based_route_target=None, vlan_based_route_target_both=None, vlan_based_route_target_export=None, vlan_based_route_target_import=None):
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if evpn_instance_num and not isinstance(evpn_instance_num, int):
            raise TypeError("Expected argument 'evpn_instance_num' to be a int")
        pulumi.set(__self__, "evpn_instance_num", evpn_instance_num)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if vlan_based_auto_route_target and not isinstance(vlan_based_auto_route_target, bool):
            raise TypeError("Expected argument 'vlan_based_auto_route_target' to be a bool")
        pulumi.set(__self__, "vlan_based_auto_route_target", vlan_based_auto_route_target)
        if vlan_based_default_gateway_advertise and not isinstance(vlan_based_default_gateway_advertise, str):
            raise TypeError("Expected argument 'vlan_based_default_gateway_advertise' to be a str")
        pulumi.set(__self__, "vlan_based_default_gateway_advertise", vlan_based_default_gateway_advertise)
        if vlan_based_encapsulation and not isinstance(vlan_based_encapsulation, str):
            raise TypeError("Expected argument 'vlan_based_encapsulation' to be a str")
        pulumi.set(__self__, "vlan_based_encapsulation", vlan_based_encapsulation)
        if vlan_based_ip_local_learning_disable and not isinstance(vlan_based_ip_local_learning_disable, bool):
            raise TypeError("Expected argument 'vlan_based_ip_local_learning_disable' to be a bool")
        pulumi.set(__self__, "vlan_based_ip_local_learning_disable", vlan_based_ip_local_learning_disable)
        if vlan_based_ip_local_learning_enable and not isinstance(vlan_based_ip_local_learning_enable, bool):
            raise TypeError("Expected argument 'vlan_based_ip_local_learning_enable' to be a bool")
        pulumi.set(__self__, "vlan_based_ip_local_learning_enable", vlan_based_ip_local_learning_enable)
        if vlan_based_rd and not isinstance(vlan_based_rd, str):
            raise TypeError("Expected argument 'vlan_based_rd' to be a str")
        pulumi.set(__self__, "vlan_based_rd", vlan_based_rd)
        if vlan_based_re_originate_route_type5 and not isinstance(vlan_based_re_originate_route_type5, bool):
            raise TypeError("Expected argument 'vlan_based_re_originate_route_type5' to be a bool")
        pulumi.set(__self__, "vlan_based_re_originate_route_type5", vlan_based_re_originate_route_type5)
        if vlan_based_replication_type_ingress and not isinstance(vlan_based_replication_type_ingress, bool):
            raise TypeError("Expected argument 'vlan_based_replication_type_ingress' to be a bool")
        pulumi.set(__self__, "vlan_based_replication_type_ingress", vlan_based_replication_type_ingress)
        if vlan_based_replication_type_mp2mp and not isinstance(vlan_based_replication_type_mp2mp, bool):
            raise TypeError("Expected argument 'vlan_based_replication_type_mp2mp' to be a bool")
        pulumi.set(__self__, "vlan_based_replication_type_mp2mp", vlan_based_replication_type_mp2mp)
        if vlan_based_replication_type_p2mp and not isinstance(vlan_based_replication_type_p2mp, bool):
            raise TypeError("Expected argument 'vlan_based_replication_type_p2mp' to be a bool")
        pulumi.set(__self__, "vlan_based_replication_type_p2mp", vlan_based_replication_type_p2mp)
        if vlan_based_replication_type_static and not isinstance(vlan_based_replication_type_static, bool):
            raise TypeError("Expected argument 'vlan_based_replication_type_static' to be a bool")
        pulumi.set(__self__, "vlan_based_replication_type_static", vlan_based_replication_type_static)
        if vlan_based_route_target and not isinstance(vlan_based_route_target, str):
            raise TypeError("Expected argument 'vlan_based_route_target' to be a str")
        pulumi.set(__self__, "vlan_based_route_target", vlan_based_route_target)
        if vlan_based_route_target_both and not isinstance(vlan_based_route_target_both, str):
            raise TypeError("Expected argument 'vlan_based_route_target_both' to be a str")
        pulumi.set(__self__, "vlan_based_route_target_both", vlan_based_route_target_both)
        if vlan_based_route_target_export and not isinstance(vlan_based_route_target_export, str):
            raise TypeError("Expected argument 'vlan_based_route_target_export' to be a str")
        pulumi.set(__self__, "vlan_based_route_target_export", vlan_based_route_target_export)
        if vlan_based_route_target_import and not isinstance(vlan_based_route_target_import, str):
            raise TypeError("Expected argument 'vlan_based_route_target_import' to be a str")
        pulumi.set(__self__, "vlan_based_route_target_import", vlan_based_route_target_import)

    @property
    @pulumi.getter
    def device(self) -> Optional[str]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter(name="evpnInstanceNum")
    def evpn_instance_num(self) -> int:
        """
        evpn instance number
        """
        return pulumi.get(self, "evpn_instance_num")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The path of the retrieved object.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="vlanBasedAutoRouteTarget")
    def vlan_based_auto_route_target(self) -> bool:
        """
        Automatically set a route-target
        """
        return pulumi.get(self, "vlan_based_auto_route_target")

    @property
    @pulumi.getter(name="vlanBasedDefaultGatewayAdvertise")
    def vlan_based_default_gateway_advertise(self) -> str:
        """
        Advertise Default Gateway MAC/IP routes
        """
        return pulumi.get(self, "vlan_based_default_gateway_advertise")

    @property
    @pulumi.getter(name="vlanBasedEncapsulation")
    def vlan_based_encapsulation(self) -> str:
        """
        Data encapsulation method
        """
        return pulumi.get(self, "vlan_based_encapsulation")

    @property
    @pulumi.getter(name="vlanBasedIpLocalLearningDisable")
    def vlan_based_ip_local_learning_disable(self) -> bool:
        """
        Disable IP local learning from dataplane
        """
        return pulumi.get(self, "vlan_based_ip_local_learning_disable")

    @property
    @pulumi.getter(name="vlanBasedIpLocalLearningEnable")
    def vlan_based_ip_local_learning_enable(self) -> bool:
        """
        Enable IP local learning from dataplane
        """
        return pulumi.get(self, "vlan_based_ip_local_learning_enable")

    @property
    @pulumi.getter(name="vlanBasedRd")
    def vlan_based_rd(self) -> str:
        """
        ASN:nn or IP-address:nn
        """
        return pulumi.get(self, "vlan_based_rd")

    @property
    @pulumi.getter(name="vlanBasedReOriginateRouteType5")
    def vlan_based_re_originate_route_type5(self) -> bool:
        """
        Re-originate route-type 5
        """
        return pulumi.get(self, "vlan_based_re_originate_route_type5")

    @property
    @pulumi.getter(name="vlanBasedReplicationTypeIngress")
    def vlan_based_replication_type_ingress(self) -> bool:
        """
        Ingress replication
        """
        return pulumi.get(self, "vlan_based_replication_type_ingress")

    @property
    @pulumi.getter(name="vlanBasedReplicationTypeMp2mp")
    def vlan_based_replication_type_mp2mp(self) -> bool:
        """
        mp2mp replication
        """
        return pulumi.get(self, "vlan_based_replication_type_mp2mp")

    @property
    @pulumi.getter(name="vlanBasedReplicationTypeP2mp")
    def vlan_based_replication_type_p2mp(self) -> bool:
        """
        p2mp replication
        """
        return pulumi.get(self, "vlan_based_replication_type_p2mp")

    @property
    @pulumi.getter(name="vlanBasedReplicationTypeStatic")
    def vlan_based_replication_type_static(self) -> bool:
        """
        Static replication
        """
        return pulumi.get(self, "vlan_based_replication_type_static")

    @property
    @pulumi.getter(name="vlanBasedRouteTarget")
    def vlan_based_route_target(self) -> str:
        """
        ASN:nn or IP-address:nn
        """
        return pulumi.get(self, "vlan_based_route_target")

    @property
    @pulumi.getter(name="vlanBasedRouteTargetBoth")
    def vlan_based_route_target_both(self) -> str:
        """
        ASN:nn or IP-address:nn
        """
        return pulumi.get(self, "vlan_based_route_target_both")

    @property
    @pulumi.getter(name="vlanBasedRouteTargetExport")
    def vlan_based_route_target_export(self) -> str:
        """
        ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
        """
        return pulumi.get(self, "vlan_based_route_target_export")

    @property
    @pulumi.getter(name="vlanBasedRouteTargetImport")
    def vlan_based_route_target_import(self) -> str:
        """
        ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
        """
        return pulumi.get(self, "vlan_based_route_target_import")


class AwaitableGetEvpnInstanceResult(GetEvpnInstanceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEvpnInstanceResult(
            device=self.device,
            evpn_instance_num=self.evpn_instance_num,
            id=self.id,
            vlan_based_auto_route_target=self.vlan_based_auto_route_target,
            vlan_based_default_gateway_advertise=self.vlan_based_default_gateway_advertise,
            vlan_based_encapsulation=self.vlan_based_encapsulation,
            vlan_based_ip_local_learning_disable=self.vlan_based_ip_local_learning_disable,
            vlan_based_ip_local_learning_enable=self.vlan_based_ip_local_learning_enable,
            vlan_based_rd=self.vlan_based_rd,
            vlan_based_re_originate_route_type5=self.vlan_based_re_originate_route_type5,
            vlan_based_replication_type_ingress=self.vlan_based_replication_type_ingress,
            vlan_based_replication_type_mp2mp=self.vlan_based_replication_type_mp2mp,
            vlan_based_replication_type_p2mp=self.vlan_based_replication_type_p2mp,
            vlan_based_replication_type_static=self.vlan_based_replication_type_static,
            vlan_based_route_target=self.vlan_based_route_target,
            vlan_based_route_target_both=self.vlan_based_route_target_both,
            vlan_based_route_target_export=self.vlan_based_route_target_export,
            vlan_based_route_target_import=self.vlan_based_route_target_import)


def get_evpn_instance(device: Optional[str] = None,
                      evpn_instance_num: Optional[int] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEvpnInstanceResult:
    """
    This data source can read the EVPN Instance configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.get_evpn_instance(evpn_instance_num=10)
    ```


    :param str device: A device name from the provider configuration.
    :param int evpn_instance_num: evpn instance number
    """
    __args__ = dict()
    __args__['device'] = device
    __args__['evpnInstanceNum'] = evpn_instance_num
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:index/getEvpnInstance:getEvpnInstance', __args__, opts=opts, typ=GetEvpnInstanceResult).value

    return AwaitableGetEvpnInstanceResult(
        device=pulumi.get(__ret__, 'device'),
        evpn_instance_num=pulumi.get(__ret__, 'evpn_instance_num'),
        id=pulumi.get(__ret__, 'id'),
        vlan_based_auto_route_target=pulumi.get(__ret__, 'vlan_based_auto_route_target'),
        vlan_based_default_gateway_advertise=pulumi.get(__ret__, 'vlan_based_default_gateway_advertise'),
        vlan_based_encapsulation=pulumi.get(__ret__, 'vlan_based_encapsulation'),
        vlan_based_ip_local_learning_disable=pulumi.get(__ret__, 'vlan_based_ip_local_learning_disable'),
        vlan_based_ip_local_learning_enable=pulumi.get(__ret__, 'vlan_based_ip_local_learning_enable'),
        vlan_based_rd=pulumi.get(__ret__, 'vlan_based_rd'),
        vlan_based_re_originate_route_type5=pulumi.get(__ret__, 'vlan_based_re_originate_route_type5'),
        vlan_based_replication_type_ingress=pulumi.get(__ret__, 'vlan_based_replication_type_ingress'),
        vlan_based_replication_type_mp2mp=pulumi.get(__ret__, 'vlan_based_replication_type_mp2mp'),
        vlan_based_replication_type_p2mp=pulumi.get(__ret__, 'vlan_based_replication_type_p2mp'),
        vlan_based_replication_type_static=pulumi.get(__ret__, 'vlan_based_replication_type_static'),
        vlan_based_route_target=pulumi.get(__ret__, 'vlan_based_route_target'),
        vlan_based_route_target_both=pulumi.get(__ret__, 'vlan_based_route_target_both'),
        vlan_based_route_target_export=pulumi.get(__ret__, 'vlan_based_route_target_export'),
        vlan_based_route_target_import=pulumi.get(__ret__, 'vlan_based_route_target_import'))


@_utilities.lift_output_func(get_evpn_instance)
def get_evpn_instance_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                             evpn_instance_num: Optional[pulumi.Input[int]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEvpnInstanceResult]:
    """
    This data source can read the EVPN Instance configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.get_evpn_instance(evpn_instance_num=10)
    ```


    :param str device: A device name from the provider configuration.
    :param int evpn_instance_num: evpn instance number
    """
    ...