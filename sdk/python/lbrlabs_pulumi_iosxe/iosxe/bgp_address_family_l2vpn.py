# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['BgpAddressFamilyL2vpnArgs', 'BgpAddressFamilyL2vpn']

@pulumi.input_type
class BgpAddressFamilyL2vpnArgs:
    def __init__(__self__, *,
                 af_name: pulumi.Input[str],
                 asn: pulumi.Input[str],
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a BgpAddressFamilyL2vpn resource.
        :param pulumi.Input[str] af_name: - Choices: `evpn`, `vpls`
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        """
        pulumi.set(__self__, "af_name", af_name)
        pulumi.set(__self__, "asn", asn)
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)

    @property
    @pulumi.getter(name="afName")
    def af_name(self) -> pulumi.Input[str]:
        """
        - Choices: `evpn`, `vpls`
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


@pulumi.input_type
class _BgpAddressFamilyL2vpnState:
    def __init__(__self__, *,
                 af_name: Optional[pulumi.Input[str]] = None,
                 asn: Optional[pulumi.Input[str]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering BgpAddressFamilyL2vpn resources.
        :param pulumi.Input[str] af_name: - Choices: `evpn`, `vpls`
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        """
        if af_name is not None:
            pulumi.set(__self__, "af_name", af_name)
        if asn is not None:
            pulumi.set(__self__, "asn", asn)
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)

    @property
    @pulumi.getter(name="afName")
    def af_name(self) -> Optional[pulumi.Input[str]]:
        """
        - Choices: `evpn`, `vpls`
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


class BgpAddressFamilyL2vpn(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 af_name: Optional[pulumi.Input[str]] = None,
                 asn: Optional[pulumi.Input[str]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource can manage the BGP Address Family L2VPN configuration.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_iosxe as iosxe

        example = iosxe.iosxe.BgpAddressFamilyL2vpn("example",
            af_name="evpn",
            asn="65000")
        ```

        ## Import

        ```sh
         $ pulumi import iosxe:iosxe/bgpAddressFamilyL2vpn:BgpAddressFamilyL2vpn example "Cisco-IOS-XE-native:native/router/Cisco-IOS-XE-bgp:bgp=65000/address-family/no-vrf/l2vpn=evpn"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] af_name: - Choices: `evpn`, `vpls`
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BgpAddressFamilyL2vpnArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage the BGP Address Family L2VPN configuration.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_iosxe as iosxe

        example = iosxe.iosxe.BgpAddressFamilyL2vpn("example",
            af_name="evpn",
            asn="65000")
        ```

        ## Import

        ```sh
         $ pulumi import iosxe:iosxe/bgpAddressFamilyL2vpn:BgpAddressFamilyL2vpn example "Cisco-IOS-XE-native:native/router/Cisco-IOS-XE-bgp:bgp=65000/address-family/no-vrf/l2vpn=evpn"
        ```

        :param str resource_name: The name of the resource.
        :param BgpAddressFamilyL2vpnArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BgpAddressFamilyL2vpnArgs, pulumi.ResourceOptions, *args, **kwargs)
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
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BgpAddressFamilyL2vpnArgs.__new__(BgpAddressFamilyL2vpnArgs)

            if af_name is None and not opts.urn:
                raise TypeError("Missing required property 'af_name'")
            __props__.__dict__["af_name"] = af_name
            if asn is None and not opts.urn:
                raise TypeError("Missing required property 'asn'")
            __props__.__dict__["asn"] = asn
            __props__.__dict__["delete_mode"] = delete_mode
            __props__.__dict__["device"] = device
        super(BgpAddressFamilyL2vpn, __self__).__init__(
            'iosxe:iosxe/bgpAddressFamilyL2vpn:BgpAddressFamilyL2vpn',
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
            device: Optional[pulumi.Input[str]] = None) -> 'BgpAddressFamilyL2vpn':
        """
        Get an existing BgpAddressFamilyL2vpn resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] af_name: - Choices: `evpn`, `vpls`
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BgpAddressFamilyL2vpnState.__new__(_BgpAddressFamilyL2vpnState)

        __props__.__dict__["af_name"] = af_name
        __props__.__dict__["asn"] = asn
        __props__.__dict__["delete_mode"] = delete_mode
        __props__.__dict__["device"] = device
        return BgpAddressFamilyL2vpn(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="afName")
    def af_name(self) -> pulumi.Output[str]:
        """
        - Choices: `evpn`, `vpls`
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

