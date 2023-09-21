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
from ._inputs import *

__all__ = ['BgpAddressFamilyIpv4Args', 'BgpAddressFamilyIpv4']

@pulumi.input_type
class BgpAddressFamilyIpv4Args:
    def __init__(__self__, *,
                 af_name: pulumi.Input[str],
                 asn: pulumi.Input[str],
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 ipv4_unicast_networks: Optional[pulumi.Input[Sequence[pulumi.Input['BgpAddressFamilyIpv4Ipv4UnicastNetworkArgs']]]] = None,
                 ipv4_unicast_networks_masks: Optional[pulumi.Input[Sequence[pulumi.Input['BgpAddressFamilyIpv4Ipv4UnicastNetworksMaskArgs']]]] = None,
                 ipv4_unicast_redistribute_connected: Optional[pulumi.Input[bool]] = None,
                 ipv4_unicast_redistribute_static: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a BgpAddressFamilyIpv4 resource.
        :param pulumi.Input[str] af_name: - Choices: `flowspec`, `labeled-unicast`, `mdt`, `multicast`, `mvpn`, `sr-policy`, `tunnel`, `unicast`
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input['BgpAddressFamilyIpv4Ipv4UnicastNetworkArgs']]] ipv4_unicast_networks: Specify a network to announce via BGP
        :param pulumi.Input[Sequence[pulumi.Input['BgpAddressFamilyIpv4Ipv4UnicastNetworksMaskArgs']]] ipv4_unicast_networks_masks: Specify a network to announce via BGP
        :param pulumi.Input[bool] ipv4_unicast_redistribute_connected: Connected
        :param pulumi.Input[bool] ipv4_unicast_redistribute_static: Static routes
        """
        pulumi.set(__self__, "af_name", af_name)
        pulumi.set(__self__, "asn", asn)
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if ipv4_unicast_networks is not None:
            pulumi.set(__self__, "ipv4_unicast_networks", ipv4_unicast_networks)
        if ipv4_unicast_networks_masks is not None:
            pulumi.set(__self__, "ipv4_unicast_networks_masks", ipv4_unicast_networks_masks)
        if ipv4_unicast_redistribute_connected is not None:
            pulumi.set(__self__, "ipv4_unicast_redistribute_connected", ipv4_unicast_redistribute_connected)
        if ipv4_unicast_redistribute_static is not None:
            pulumi.set(__self__, "ipv4_unicast_redistribute_static", ipv4_unicast_redistribute_static)

    @property
    @pulumi.getter(name="afName")
    def af_name(self) -> pulumi.Input[str]:
        """
        - Choices: `flowspec`, `labeled-unicast`, `mdt`, `multicast`, `mvpn`, `sr-policy`, `tunnel`, `unicast`
        """
        return pulumi.get(self, "af_name")

    @af_name.setter
    def af_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "af_name", value)

    @property
    @pulumi.getter
    def asn(self) -> pulumi.Input[str]:
        return pulumi.get(self, "asn")

    @asn.setter
    def asn(self, value: pulumi.Input[str]):
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
    @pulumi.getter(name="ipv4UnicastNetworks")
    def ipv4_unicast_networks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BgpAddressFamilyIpv4Ipv4UnicastNetworkArgs']]]]:
        """
        Specify a network to announce via BGP
        """
        return pulumi.get(self, "ipv4_unicast_networks")

    @ipv4_unicast_networks.setter
    def ipv4_unicast_networks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BgpAddressFamilyIpv4Ipv4UnicastNetworkArgs']]]]):
        pulumi.set(self, "ipv4_unicast_networks", value)

    @property
    @pulumi.getter(name="ipv4UnicastNetworksMasks")
    def ipv4_unicast_networks_masks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BgpAddressFamilyIpv4Ipv4UnicastNetworksMaskArgs']]]]:
        """
        Specify a network to announce via BGP
        """
        return pulumi.get(self, "ipv4_unicast_networks_masks")

    @ipv4_unicast_networks_masks.setter
    def ipv4_unicast_networks_masks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BgpAddressFamilyIpv4Ipv4UnicastNetworksMaskArgs']]]]):
        pulumi.set(self, "ipv4_unicast_networks_masks", value)

    @property
    @pulumi.getter(name="ipv4UnicastRedistributeConnected")
    def ipv4_unicast_redistribute_connected(self) -> Optional[pulumi.Input[bool]]:
        """
        Connected
        """
        return pulumi.get(self, "ipv4_unicast_redistribute_connected")

    @ipv4_unicast_redistribute_connected.setter
    def ipv4_unicast_redistribute_connected(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ipv4_unicast_redistribute_connected", value)

    @property
    @pulumi.getter(name="ipv4UnicastRedistributeStatic")
    def ipv4_unicast_redistribute_static(self) -> Optional[pulumi.Input[bool]]:
        """
        Static routes
        """
        return pulumi.get(self, "ipv4_unicast_redistribute_static")

    @ipv4_unicast_redistribute_static.setter
    def ipv4_unicast_redistribute_static(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ipv4_unicast_redistribute_static", value)


@pulumi.input_type
class _BgpAddressFamilyIpv4State:
    def __init__(__self__, *,
                 af_name: Optional[pulumi.Input[str]] = None,
                 asn: Optional[pulumi.Input[str]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 ipv4_unicast_networks: Optional[pulumi.Input[Sequence[pulumi.Input['BgpAddressFamilyIpv4Ipv4UnicastNetworkArgs']]]] = None,
                 ipv4_unicast_networks_masks: Optional[pulumi.Input[Sequence[pulumi.Input['BgpAddressFamilyIpv4Ipv4UnicastNetworksMaskArgs']]]] = None,
                 ipv4_unicast_redistribute_connected: Optional[pulumi.Input[bool]] = None,
                 ipv4_unicast_redistribute_static: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering BgpAddressFamilyIpv4 resources.
        :param pulumi.Input[str] af_name: - Choices: `flowspec`, `labeled-unicast`, `mdt`, `multicast`, `mvpn`, `sr-policy`, `tunnel`, `unicast`
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input['BgpAddressFamilyIpv4Ipv4UnicastNetworkArgs']]] ipv4_unicast_networks: Specify a network to announce via BGP
        :param pulumi.Input[Sequence[pulumi.Input['BgpAddressFamilyIpv4Ipv4UnicastNetworksMaskArgs']]] ipv4_unicast_networks_masks: Specify a network to announce via BGP
        :param pulumi.Input[bool] ipv4_unicast_redistribute_connected: Connected
        :param pulumi.Input[bool] ipv4_unicast_redistribute_static: Static routes
        """
        if af_name is not None:
            pulumi.set(__self__, "af_name", af_name)
        if asn is not None:
            pulumi.set(__self__, "asn", asn)
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if ipv4_unicast_networks is not None:
            pulumi.set(__self__, "ipv4_unicast_networks", ipv4_unicast_networks)
        if ipv4_unicast_networks_masks is not None:
            pulumi.set(__self__, "ipv4_unicast_networks_masks", ipv4_unicast_networks_masks)
        if ipv4_unicast_redistribute_connected is not None:
            pulumi.set(__self__, "ipv4_unicast_redistribute_connected", ipv4_unicast_redistribute_connected)
        if ipv4_unicast_redistribute_static is not None:
            pulumi.set(__self__, "ipv4_unicast_redistribute_static", ipv4_unicast_redistribute_static)

    @property
    @pulumi.getter(name="afName")
    def af_name(self) -> Optional[pulumi.Input[str]]:
        """
        - Choices: `flowspec`, `labeled-unicast`, `mdt`, `multicast`, `mvpn`, `sr-policy`, `tunnel`, `unicast`
        """
        return pulumi.get(self, "af_name")

    @af_name.setter
    def af_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "af_name", value)

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
    @pulumi.getter(name="ipv4UnicastNetworks")
    def ipv4_unicast_networks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BgpAddressFamilyIpv4Ipv4UnicastNetworkArgs']]]]:
        """
        Specify a network to announce via BGP
        """
        return pulumi.get(self, "ipv4_unicast_networks")

    @ipv4_unicast_networks.setter
    def ipv4_unicast_networks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BgpAddressFamilyIpv4Ipv4UnicastNetworkArgs']]]]):
        pulumi.set(self, "ipv4_unicast_networks", value)

    @property
    @pulumi.getter(name="ipv4UnicastNetworksMasks")
    def ipv4_unicast_networks_masks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BgpAddressFamilyIpv4Ipv4UnicastNetworksMaskArgs']]]]:
        """
        Specify a network to announce via BGP
        """
        return pulumi.get(self, "ipv4_unicast_networks_masks")

    @ipv4_unicast_networks_masks.setter
    def ipv4_unicast_networks_masks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BgpAddressFamilyIpv4Ipv4UnicastNetworksMaskArgs']]]]):
        pulumi.set(self, "ipv4_unicast_networks_masks", value)

    @property
    @pulumi.getter(name="ipv4UnicastRedistributeConnected")
    def ipv4_unicast_redistribute_connected(self) -> Optional[pulumi.Input[bool]]:
        """
        Connected
        """
        return pulumi.get(self, "ipv4_unicast_redistribute_connected")

    @ipv4_unicast_redistribute_connected.setter
    def ipv4_unicast_redistribute_connected(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ipv4_unicast_redistribute_connected", value)

    @property
    @pulumi.getter(name="ipv4UnicastRedistributeStatic")
    def ipv4_unicast_redistribute_static(self) -> Optional[pulumi.Input[bool]]:
        """
        Static routes
        """
        return pulumi.get(self, "ipv4_unicast_redistribute_static")

    @ipv4_unicast_redistribute_static.setter
    def ipv4_unicast_redistribute_static(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ipv4_unicast_redistribute_static", value)


class BgpAddressFamilyIpv4(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 af_name: Optional[pulumi.Input[str]] = None,
                 asn: Optional[pulumi.Input[str]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 ipv4_unicast_networks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BgpAddressFamilyIpv4Ipv4UnicastNetworkArgs']]]]] = None,
                 ipv4_unicast_networks_masks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BgpAddressFamilyIpv4Ipv4UnicastNetworksMaskArgs']]]]] = None,
                 ipv4_unicast_redistribute_connected: Optional[pulumi.Input[bool]] = None,
                 ipv4_unicast_redistribute_static: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Create a BgpAddressFamilyIpv4 resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] af_name: - Choices: `flowspec`, `labeled-unicast`, `mdt`, `multicast`, `mvpn`, `sr-policy`, `tunnel`, `unicast`
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BgpAddressFamilyIpv4Ipv4UnicastNetworkArgs']]]] ipv4_unicast_networks: Specify a network to announce via BGP
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BgpAddressFamilyIpv4Ipv4UnicastNetworksMaskArgs']]]] ipv4_unicast_networks_masks: Specify a network to announce via BGP
        :param pulumi.Input[bool] ipv4_unicast_redistribute_connected: Connected
        :param pulumi.Input[bool] ipv4_unicast_redistribute_static: Static routes
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BgpAddressFamilyIpv4Args,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a BgpAddressFamilyIpv4 resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param BgpAddressFamilyIpv4Args args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BgpAddressFamilyIpv4Args, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 af_name: Optional[pulumi.Input[str]] = None,
                 asn: Optional[pulumi.Input[str]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 ipv4_unicast_networks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BgpAddressFamilyIpv4Ipv4UnicastNetworkArgs']]]]] = None,
                 ipv4_unicast_networks_masks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BgpAddressFamilyIpv4Ipv4UnicastNetworksMaskArgs']]]]] = None,
                 ipv4_unicast_redistribute_connected: Optional[pulumi.Input[bool]] = None,
                 ipv4_unicast_redistribute_static: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BgpAddressFamilyIpv4Args.__new__(BgpAddressFamilyIpv4Args)

            if af_name is None and not opts.urn:
                raise TypeError("Missing required property 'af_name'")
            __props__.__dict__["af_name"] = af_name
            if asn is None and not opts.urn:
                raise TypeError("Missing required property 'asn'")
            __props__.__dict__["asn"] = asn
            __props__.__dict__["delete_mode"] = delete_mode
            __props__.__dict__["device"] = device
            __props__.__dict__["ipv4_unicast_networks"] = ipv4_unicast_networks
            __props__.__dict__["ipv4_unicast_networks_masks"] = ipv4_unicast_networks_masks
            __props__.__dict__["ipv4_unicast_redistribute_connected"] = ipv4_unicast_redistribute_connected
            __props__.__dict__["ipv4_unicast_redistribute_static"] = ipv4_unicast_redistribute_static
        super(BgpAddressFamilyIpv4, __self__).__init__(
            'iosxe:iosxe/bgpAddressFamilyIpv4:BgpAddressFamilyIpv4',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            af_name: Optional[pulumi.Input[str]] = None,
            asn: Optional[pulumi.Input[str]] = None,
            delete_mode: Optional[pulumi.Input[str]] = None,
            device: Optional[pulumi.Input[str]] = None,
            ipv4_unicast_networks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BgpAddressFamilyIpv4Ipv4UnicastNetworkArgs']]]]] = None,
            ipv4_unicast_networks_masks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BgpAddressFamilyIpv4Ipv4UnicastNetworksMaskArgs']]]]] = None,
            ipv4_unicast_redistribute_connected: Optional[pulumi.Input[bool]] = None,
            ipv4_unicast_redistribute_static: Optional[pulumi.Input[bool]] = None) -> 'BgpAddressFamilyIpv4':
        """
        Get an existing BgpAddressFamilyIpv4 resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] af_name: - Choices: `flowspec`, `labeled-unicast`, `mdt`, `multicast`, `mvpn`, `sr-policy`, `tunnel`, `unicast`
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BgpAddressFamilyIpv4Ipv4UnicastNetworkArgs']]]] ipv4_unicast_networks: Specify a network to announce via BGP
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BgpAddressFamilyIpv4Ipv4UnicastNetworksMaskArgs']]]] ipv4_unicast_networks_masks: Specify a network to announce via BGP
        :param pulumi.Input[bool] ipv4_unicast_redistribute_connected: Connected
        :param pulumi.Input[bool] ipv4_unicast_redistribute_static: Static routes
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BgpAddressFamilyIpv4State.__new__(_BgpAddressFamilyIpv4State)

        __props__.__dict__["af_name"] = af_name
        __props__.__dict__["asn"] = asn
        __props__.__dict__["delete_mode"] = delete_mode
        __props__.__dict__["device"] = device
        __props__.__dict__["ipv4_unicast_networks"] = ipv4_unicast_networks
        __props__.__dict__["ipv4_unicast_networks_masks"] = ipv4_unicast_networks_masks
        __props__.__dict__["ipv4_unicast_redistribute_connected"] = ipv4_unicast_redistribute_connected
        __props__.__dict__["ipv4_unicast_redistribute_static"] = ipv4_unicast_redistribute_static
        return BgpAddressFamilyIpv4(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="afName")
    def af_name(self) -> pulumi.Output[str]:
        """
        - Choices: `flowspec`, `labeled-unicast`, `mdt`, `multicast`, `mvpn`, `sr-policy`, `tunnel`, `unicast`
        """
        return pulumi.get(self, "af_name")

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
    @pulumi.getter(name="ipv4UnicastNetworks")
    def ipv4_unicast_networks(self) -> pulumi.Output[Optional[Sequence['outputs.BgpAddressFamilyIpv4Ipv4UnicastNetwork']]]:
        """
        Specify a network to announce via BGP
        """
        return pulumi.get(self, "ipv4_unicast_networks")

    @property
    @pulumi.getter(name="ipv4UnicastNetworksMasks")
    def ipv4_unicast_networks_masks(self) -> pulumi.Output[Optional[Sequence['outputs.BgpAddressFamilyIpv4Ipv4UnicastNetworksMask']]]:
        """
        Specify a network to announce via BGP
        """
        return pulumi.get(self, "ipv4_unicast_networks_masks")

    @property
    @pulumi.getter(name="ipv4UnicastRedistributeConnected")
    def ipv4_unicast_redistribute_connected(self) -> pulumi.Output[Optional[bool]]:
        """
        Connected
        """
        return pulumi.get(self, "ipv4_unicast_redistribute_connected")

    @property
    @pulumi.getter(name="ipv4UnicastRedistributeStatic")
    def ipv4_unicast_redistribute_static(self) -> pulumi.Output[Optional[bool]]:
        """
        Static routes
        """
        return pulumi.get(self, "ipv4_unicast_redistribute_static")
