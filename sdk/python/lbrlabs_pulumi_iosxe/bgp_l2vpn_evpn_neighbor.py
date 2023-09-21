# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['BgpL2vpnEvpnNeighborArgs', 'BgpL2vpnEvpnNeighbor']

@pulumi.input_type
class BgpL2vpnEvpnNeighborArgs:
    def __init__(__self__, *,
                 asn: pulumi.Input[str],
                 ip: pulumi.Input[str],
                 activate: Optional[pulumi.Input[bool]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 route_reflector_client: Optional[pulumi.Input[bool]] = None,
                 send_community: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a BgpL2vpnEvpnNeighbor resource.
        :param pulumi.Input[bool] activate: Enable the address family for this neighbor - Default value: `true`
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[bool] route_reflector_client: Configure a neighbor as Route Reflector client
        :param pulumi.Input[str] send_community: - Choices: `both`, `extended`, `standard`
        """
        pulumi.set(__self__, "asn", asn)
        pulumi.set(__self__, "ip", ip)
        if activate is not None:
            pulumi.set(__self__, "activate", activate)
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if route_reflector_client is not None:
            pulumi.set(__self__, "route_reflector_client", route_reflector_client)
        if send_community is not None:
            pulumi.set(__self__, "send_community", send_community)

    @property
    @pulumi.getter
    def asn(self) -> pulumi.Input[str]:
        return pulumi.get(self, "asn")

    @asn.setter
    def asn(self, value: pulumi.Input[str]):
        pulumi.set(self, "asn", value)

    @property
    @pulumi.getter
    def ip(self) -> pulumi.Input[str]:
        return pulumi.get(self, "ip")

    @ip.setter
    def ip(self, value: pulumi.Input[str]):
        pulumi.set(self, "ip", value)

    @property
    @pulumi.getter
    def activate(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable the address family for this neighbor - Default value: `true`
        """
        return pulumi.get(self, "activate")

    @activate.setter
    def activate(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "activate", value)

    @property
    @pulumi.getter(name="deleteMode")
    def delete_mode(self) -> Optional[pulumi.Input[str]]:
        """
        Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
        managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
        Default value is `all`. - Choices: `all`, `attributes`
        """
        return pulumi.get(self, "delete_mode")

    @delete_mode.setter
    def delete_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delete_mode", value)

    @property
    @pulumi.getter
    def device(self) -> Optional[pulumi.Input[str]]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @device.setter
    def device(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device", value)

    @property
    @pulumi.getter(name="routeReflectorClient")
    def route_reflector_client(self) -> Optional[pulumi.Input[bool]]:
        """
        Configure a neighbor as Route Reflector client
        """
        return pulumi.get(self, "route_reflector_client")

    @route_reflector_client.setter
    def route_reflector_client(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "route_reflector_client", value)

    @property
    @pulumi.getter(name="sendCommunity")
    def send_community(self) -> Optional[pulumi.Input[str]]:
        """
        - Choices: `both`, `extended`, `standard`
        """
        return pulumi.get(self, "send_community")

    @send_community.setter
    def send_community(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "send_community", value)


@pulumi.input_type
class _BgpL2vpnEvpnNeighborState:
    def __init__(__self__, *,
                 activate: Optional[pulumi.Input[bool]] = None,
                 asn: Optional[pulumi.Input[str]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 route_reflector_client: Optional[pulumi.Input[bool]] = None,
                 send_community: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering BgpL2vpnEvpnNeighbor resources.
        :param pulumi.Input[bool] activate: Enable the address family for this neighbor - Default value: `true`
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[bool] route_reflector_client: Configure a neighbor as Route Reflector client
        :param pulumi.Input[str] send_community: - Choices: `both`, `extended`, `standard`
        """
        if activate is not None:
            pulumi.set(__self__, "activate", activate)
        if asn is not None:
            pulumi.set(__self__, "asn", asn)
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if ip is not None:
            pulumi.set(__self__, "ip", ip)
        if route_reflector_client is not None:
            pulumi.set(__self__, "route_reflector_client", route_reflector_client)
        if send_community is not None:
            pulumi.set(__self__, "send_community", send_community)

    @property
    @pulumi.getter
    def activate(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable the address family for this neighbor - Default value: `true`
        """
        return pulumi.get(self, "activate")

    @activate.setter
    def activate(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "activate", value)

    @property
    @pulumi.getter
    def asn(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "asn")

    @asn.setter
    def asn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "asn", value)

    @property
    @pulumi.getter(name="deleteMode")
    def delete_mode(self) -> Optional[pulumi.Input[str]]:
        """
        Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
        managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
        Default value is `all`. - Choices: `all`, `attributes`
        """
        return pulumi.get(self, "delete_mode")

    @delete_mode.setter
    def delete_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delete_mode", value)

    @property
    @pulumi.getter
    def device(self) -> Optional[pulumi.Input[str]]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @device.setter
    def device(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device", value)

    @property
    @pulumi.getter
    def ip(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ip")

    @ip.setter
    def ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip", value)

    @property
    @pulumi.getter(name="routeReflectorClient")
    def route_reflector_client(self) -> Optional[pulumi.Input[bool]]:
        """
        Configure a neighbor as Route Reflector client
        """
        return pulumi.get(self, "route_reflector_client")

    @route_reflector_client.setter
    def route_reflector_client(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "route_reflector_client", value)

    @property
    @pulumi.getter(name="sendCommunity")
    def send_community(self) -> Optional[pulumi.Input[str]]:
        """
        - Choices: `both`, `extended`, `standard`
        """
        return pulumi.get(self, "send_community")

    @send_community.setter
    def send_community(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "send_community", value)


class BgpL2vpnEvpnNeighbor(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 activate: Optional[pulumi.Input[bool]] = None,
                 asn: Optional[pulumi.Input[str]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 route_reflector_client: Optional[pulumi.Input[bool]] = None,
                 send_community: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource can manage the BGP L2VPN EVPN Neighbor configuration.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_iosxe as iosxe

        example = iosxe.BgpL2vpnEvpnNeighbor("example",
            activate=True,
            asn="65000",
            ip="3.3.3.3",
            route_reflector_client=False,
            send_community="both")
        ```

        ## Import

        ```sh
         $ pulumi import iosxe:index/bgpL2vpnEvpnNeighbor:BgpL2vpnEvpnNeighbor example "Cisco-IOS-XE-native:native/router/Cisco-IOS-XE-bgp:bgp=65000/address-family/no-vrf/l2vpn=evpn/l2vpn-evpn/neighbor=3.3.3.3"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] activate: Enable the address family for this neighbor - Default value: `true`
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[bool] route_reflector_client: Configure a neighbor as Route Reflector client
        :param pulumi.Input[str] send_community: - Choices: `both`, `extended`, `standard`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BgpL2vpnEvpnNeighborArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage the BGP L2VPN EVPN Neighbor configuration.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_iosxe as iosxe

        example = iosxe.BgpL2vpnEvpnNeighbor("example",
            activate=True,
            asn="65000",
            ip="3.3.3.3",
            route_reflector_client=False,
            send_community="both")
        ```

        ## Import

        ```sh
         $ pulumi import iosxe:index/bgpL2vpnEvpnNeighbor:BgpL2vpnEvpnNeighbor example "Cisco-IOS-XE-native:native/router/Cisco-IOS-XE-bgp:bgp=65000/address-family/no-vrf/l2vpn=evpn/l2vpn-evpn/neighbor=3.3.3.3"
        ```

        :param str resource_name: The name of the resource.
        :param BgpL2vpnEvpnNeighborArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BgpL2vpnEvpnNeighborArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 activate: Optional[pulumi.Input[bool]] = None,
                 asn: Optional[pulumi.Input[str]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 route_reflector_client: Optional[pulumi.Input[bool]] = None,
                 send_community: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BgpL2vpnEvpnNeighborArgs.__new__(BgpL2vpnEvpnNeighborArgs)

            __props__.__dict__["activate"] = activate
            if asn is None and not opts.urn:
                raise TypeError("Missing required property 'asn'")
            __props__.__dict__["asn"] = asn
            __props__.__dict__["delete_mode"] = delete_mode
            __props__.__dict__["device"] = device
            if ip is None and not opts.urn:
                raise TypeError("Missing required property 'ip'")
            __props__.__dict__["ip"] = ip
            __props__.__dict__["route_reflector_client"] = route_reflector_client
            __props__.__dict__["send_community"] = send_community
        super(BgpL2vpnEvpnNeighbor, __self__).__init__(
            'iosxe:index/bgpL2vpnEvpnNeighbor:BgpL2vpnEvpnNeighbor',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            activate: Optional[pulumi.Input[bool]] = None,
            asn: Optional[pulumi.Input[str]] = None,
            delete_mode: Optional[pulumi.Input[str]] = None,
            device: Optional[pulumi.Input[str]] = None,
            ip: Optional[pulumi.Input[str]] = None,
            route_reflector_client: Optional[pulumi.Input[bool]] = None,
            send_community: Optional[pulumi.Input[str]] = None) -> 'BgpL2vpnEvpnNeighbor':
        """
        Get an existing BgpL2vpnEvpnNeighbor resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] activate: Enable the address family for this neighbor - Default value: `true`
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[bool] route_reflector_client: Configure a neighbor as Route Reflector client
        :param pulumi.Input[str] send_community: - Choices: `both`, `extended`, `standard`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BgpL2vpnEvpnNeighborState.__new__(_BgpL2vpnEvpnNeighborState)

        __props__.__dict__["activate"] = activate
        __props__.__dict__["asn"] = asn
        __props__.__dict__["delete_mode"] = delete_mode
        __props__.__dict__["device"] = device
        __props__.__dict__["ip"] = ip
        __props__.__dict__["route_reflector_client"] = route_reflector_client
        __props__.__dict__["send_community"] = send_community
        return BgpL2vpnEvpnNeighbor(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def activate(self) -> pulumi.Output[bool]:
        """
        Enable the address family for this neighbor - Default value: `true`
        """
        return pulumi.get(self, "activate")

    @property
    @pulumi.getter
    def asn(self) -> pulumi.Output[str]:
        return pulumi.get(self, "asn")

    @property
    @pulumi.getter(name="deleteMode")
    def delete_mode(self) -> pulumi.Output[Optional[str]]:
        """
        Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
        managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
        Default value is `all`. - Choices: `all`, `attributes`
        """
        return pulumi.get(self, "delete_mode")

    @property
    @pulumi.getter
    def device(self) -> pulumi.Output[Optional[str]]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def ip(self) -> pulumi.Output[str]:
        return pulumi.get(self, "ip")

    @property
    @pulumi.getter(name="routeReflectorClient")
    def route_reflector_client(self) -> pulumi.Output[Optional[bool]]:
        """
        Configure a neighbor as Route Reflector client
        """
        return pulumi.get(self, "route_reflector_client")

    @property
    @pulumi.getter(name="sendCommunity")
    def send_community(self) -> pulumi.Output[Optional[str]]:
        """
        - Choices: `both`, `extended`, `standard`
        """
        return pulumi.get(self, "send_community")

