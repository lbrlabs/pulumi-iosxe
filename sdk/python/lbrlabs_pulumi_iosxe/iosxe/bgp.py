# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['BgpArgs', 'Bgp']

@pulumi.input_type
class BgpArgs:
    def __init__(__self__, *,
                 asn: pulumi.Input[str],
                 default_ipv4_unicast: Optional[pulumi.Input[bool]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 log_neighbor_changes: Optional[pulumi.Input[bool]] = None,
                 router_id_loopback: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a Bgp resource.
        :param pulumi.Input[bool] default_ipv4_unicast: Activate ipv4-unicast for a peer by default
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[bool] log_neighbor_changes: Log neighbor up/down and reset reason
        :param pulumi.Input[int] router_id_loopback: Loopback interface - Range: `0`-`2147483647`
        """
        pulumi.set(__self__, "asn", asn)
        if default_ipv4_unicast is not None:
            pulumi.set(__self__, "default_ipv4_unicast", default_ipv4_unicast)
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if log_neighbor_changes is not None:
            pulumi.set(__self__, "log_neighbor_changes", log_neighbor_changes)
        if router_id_loopback is not None:
            pulumi.set(__self__, "router_id_loopback", router_id_loopback)

    @property
    @pulumi.getter
    def asn(self) -> pulumi.Input[str]:
        return pulumi.get(self, "asn")

    @asn.setter
    def asn(self, value: pulumi.Input[str]):
        pulumi.set(self, "asn", value)

    @property
    @pulumi.getter(name="defaultIpv4Unicast")
    def default_ipv4_unicast(self) -> Optional[pulumi.Input[bool]]:
        """
        Activate ipv4-unicast for a peer by default
        """
        return pulumi.get(self, "default_ipv4_unicast")

    @default_ipv4_unicast.setter
    def default_ipv4_unicast(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "default_ipv4_unicast", value)

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
    @pulumi.getter(name="logNeighborChanges")
    def log_neighbor_changes(self) -> Optional[pulumi.Input[bool]]:
        """
        Log neighbor up/down and reset reason
        """
        return pulumi.get(self, "log_neighbor_changes")

    @log_neighbor_changes.setter
    def log_neighbor_changes(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "log_neighbor_changes", value)

    @property
    @pulumi.getter(name="routerIdLoopback")
    def router_id_loopback(self) -> Optional[pulumi.Input[int]]:
        """
        Loopback interface - Range: `0`-`2147483647`
        """
        return pulumi.get(self, "router_id_loopback")

    @router_id_loopback.setter
    def router_id_loopback(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "router_id_loopback", value)


@pulumi.input_type
class _BgpState:
    def __init__(__self__, *,
                 asn: Optional[pulumi.Input[str]] = None,
                 default_ipv4_unicast: Optional[pulumi.Input[bool]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 log_neighbor_changes: Optional[pulumi.Input[bool]] = None,
                 router_id_loopback: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering Bgp resources.
        :param pulumi.Input[bool] default_ipv4_unicast: Activate ipv4-unicast for a peer by default
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[bool] log_neighbor_changes: Log neighbor up/down and reset reason
        :param pulumi.Input[int] router_id_loopback: Loopback interface - Range: `0`-`2147483647`
        """
        if asn is not None:
            pulumi.set(__self__, "asn", asn)
        if default_ipv4_unicast is not None:
            pulumi.set(__self__, "default_ipv4_unicast", default_ipv4_unicast)
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if log_neighbor_changes is not None:
            pulumi.set(__self__, "log_neighbor_changes", log_neighbor_changes)
        if router_id_loopback is not None:
            pulumi.set(__self__, "router_id_loopback", router_id_loopback)

    @property
    @pulumi.getter
    def asn(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "asn")

    @asn.setter
    def asn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "asn", value)

    @property
    @pulumi.getter(name="defaultIpv4Unicast")
    def default_ipv4_unicast(self) -> Optional[pulumi.Input[bool]]:
        """
        Activate ipv4-unicast for a peer by default
        """
        return pulumi.get(self, "default_ipv4_unicast")

    @default_ipv4_unicast.setter
    def default_ipv4_unicast(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "default_ipv4_unicast", value)

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
    @pulumi.getter(name="logNeighborChanges")
    def log_neighbor_changes(self) -> Optional[pulumi.Input[bool]]:
        """
        Log neighbor up/down and reset reason
        """
        return pulumi.get(self, "log_neighbor_changes")

    @log_neighbor_changes.setter
    def log_neighbor_changes(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "log_neighbor_changes", value)

    @property
    @pulumi.getter(name="routerIdLoopback")
    def router_id_loopback(self) -> Optional[pulumi.Input[int]]:
        """
        Loopback interface - Range: `0`-`2147483647`
        """
        return pulumi.get(self, "router_id_loopback")

    @router_id_loopback.setter
    def router_id_loopback(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "router_id_loopback", value)


class Bgp(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 asn: Optional[pulumi.Input[str]] = None,
                 default_ipv4_unicast: Optional[pulumi.Input[bool]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 log_neighbor_changes: Optional[pulumi.Input[bool]] = None,
                 router_id_loopback: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        This resource can manage the BGP configuration.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_iosxe as iosxe

        example = iosxe.iosxe.Bgp("example",
            asn="65000",
            default_ipv4_unicast=False,
            log_neighbor_changes=True,
            router_id_loopback=100)
        ```

        ## Import

        ```sh
         $ pulumi import iosxe:iosxe/bgp:Bgp example "Cisco-IOS-XE-native:native/router/Cisco-IOS-XE-bgp:bgp=65000"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] default_ipv4_unicast: Activate ipv4-unicast for a peer by default
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[bool] log_neighbor_changes: Log neighbor up/down and reset reason
        :param pulumi.Input[int] router_id_loopback: Loopback interface - Range: `0`-`2147483647`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BgpArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage the BGP configuration.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_iosxe as iosxe

        example = iosxe.iosxe.Bgp("example",
            asn="65000",
            default_ipv4_unicast=False,
            log_neighbor_changes=True,
            router_id_loopback=100)
        ```

        ## Import

        ```sh
         $ pulumi import iosxe:iosxe/bgp:Bgp example "Cisco-IOS-XE-native:native/router/Cisco-IOS-XE-bgp:bgp=65000"
        ```

        :param str resource_name: The name of the resource.
        :param BgpArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BgpArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 asn: Optional[pulumi.Input[str]] = None,
                 default_ipv4_unicast: Optional[pulumi.Input[bool]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 log_neighbor_changes: Optional[pulumi.Input[bool]] = None,
                 router_id_loopback: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BgpArgs.__new__(BgpArgs)

            if asn is None and not opts.urn:
                raise TypeError("Missing required property 'asn'")
            __props__.__dict__["asn"] = asn
            __props__.__dict__["default_ipv4_unicast"] = default_ipv4_unicast
            __props__.__dict__["delete_mode"] = delete_mode
            __props__.__dict__["device"] = device
            __props__.__dict__["log_neighbor_changes"] = log_neighbor_changes
            __props__.__dict__["router_id_loopback"] = router_id_loopback
        super(Bgp, __self__).__init__(
            'iosxe:iosxe/bgp:Bgp',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            asn: Optional[pulumi.Input[str]] = None,
            default_ipv4_unicast: Optional[pulumi.Input[bool]] = None,
            delete_mode: Optional[pulumi.Input[str]] = None,
            device: Optional[pulumi.Input[str]] = None,
            log_neighbor_changes: Optional[pulumi.Input[bool]] = None,
            router_id_loopback: Optional[pulumi.Input[int]] = None) -> 'Bgp':
        """
        Get an existing Bgp resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] default_ipv4_unicast: Activate ipv4-unicast for a peer by default
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[bool] log_neighbor_changes: Log neighbor up/down and reset reason
        :param pulumi.Input[int] router_id_loopback: Loopback interface - Range: `0`-`2147483647`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BgpState.__new__(_BgpState)

        __props__.__dict__["asn"] = asn
        __props__.__dict__["default_ipv4_unicast"] = default_ipv4_unicast
        __props__.__dict__["delete_mode"] = delete_mode
        __props__.__dict__["device"] = device
        __props__.__dict__["log_neighbor_changes"] = log_neighbor_changes
        __props__.__dict__["router_id_loopback"] = router_id_loopback
        return Bgp(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def asn(self) -> pulumi.Output[str]:
        return pulumi.get(self, "asn")

    @property
    @pulumi.getter(name="defaultIpv4Unicast")
    def default_ipv4_unicast(self) -> pulumi.Output[Optional[bool]]:
        """
        Activate ipv4-unicast for a peer by default
        """
        return pulumi.get(self, "default_ipv4_unicast")

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
    @pulumi.getter(name="logNeighborChanges")
    def log_neighbor_changes(self) -> pulumi.Output[Optional[bool]]:
        """
        Log neighbor up/down and reset reason
        """
        return pulumi.get(self, "log_neighbor_changes")

    @property
    @pulumi.getter(name="routerIdLoopback")
    def router_id_loopback(self) -> pulumi.Output[Optional[int]]:
        """
        Loopback interface - Range: `0`-`2147483647`
        """
        return pulumi.get(self, "router_id_loopback")

