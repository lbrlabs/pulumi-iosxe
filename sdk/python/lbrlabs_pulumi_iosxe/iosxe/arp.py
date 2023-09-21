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

__all__ = ['ArpArgs', 'Arp']

@pulumi.input_type
class ArpArgs:
    def __init__(__self__, *,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 entry_learn: Optional[pulumi.Input[int]] = None,
                 incomplete_entries: Optional[pulumi.Input[int]] = None,
                 inspection_filters: Optional[pulumi.Input[Sequence[pulumi.Input['ArpInspectionFilterArgs']]]] = None,
                 inspection_log_buffer_entries: Optional[pulumi.Input[int]] = None,
                 inspection_log_buffer_logs_entries: Optional[pulumi.Input[int]] = None,
                 inspection_log_buffer_logs_interval: Optional[pulumi.Input[int]] = None,
                 inspection_validate_allow_zeros: Optional[pulumi.Input[bool]] = None,
                 inspection_validate_dst_mac: Optional[pulumi.Input[bool]] = None,
                 inspection_validate_ip: Optional[pulumi.Input[bool]] = None,
                 inspection_validate_src_mac: Optional[pulumi.Input[bool]] = None,
                 inspection_vlan: Optional[pulumi.Input[str]] = None,
                 proxy_disable: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a Arp resource.
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[int] entry_learn: Maximum learn entry limit - Range: `255`-`512000`
        :param pulumi.Input[int] incomplete_entries: Specify the number of IP addresses to resolve - Range: `1`-`2147483647`
        :param pulumi.Input[Sequence[pulumi.Input['ArpInspectionFilterArgs']]] inspection_filters: Specify ARP acl to be applied
        :param pulumi.Input[int] inspection_log_buffer_entries: Number of entries for log buffer - Range: `0`-`1024`
        :param pulumi.Input[int] inspection_log_buffer_logs_entries: Number of entries for log buffer - Range: `0`-`1024`
        :param pulumi.Input[int] inspection_log_buffer_logs_interval: Interval for controlling logging rate - Range: `0`-`86400`
        :param pulumi.Input[bool] inspection_validate_allow_zeros: Allow 0.0.0.0 sender IP address
        :param pulumi.Input[bool] inspection_validate_dst_mac: Validate destination MAC address
        :param pulumi.Input[bool] inspection_validate_ip: Validate IP addresses
        :param pulumi.Input[bool] inspection_validate_src_mac: Validate source MAC address
        :param pulumi.Input[str] inspection_vlan: Enable/Disable ARP Inspection on vlans
        :param pulumi.Input[bool] proxy_disable: Disable proxy ARP on all interfaces
        """
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if entry_learn is not None:
            pulumi.set(__self__, "entry_learn", entry_learn)
        if incomplete_entries is not None:
            pulumi.set(__self__, "incomplete_entries", incomplete_entries)
        if inspection_filters is not None:
            pulumi.set(__self__, "inspection_filters", inspection_filters)
        if inspection_log_buffer_entries is not None:
            pulumi.set(__self__, "inspection_log_buffer_entries", inspection_log_buffer_entries)
        if inspection_log_buffer_logs_entries is not None:
            pulumi.set(__self__, "inspection_log_buffer_logs_entries", inspection_log_buffer_logs_entries)
        if inspection_log_buffer_logs_interval is not None:
            pulumi.set(__self__, "inspection_log_buffer_logs_interval", inspection_log_buffer_logs_interval)
        if inspection_validate_allow_zeros is not None:
            pulumi.set(__self__, "inspection_validate_allow_zeros", inspection_validate_allow_zeros)
        if inspection_validate_dst_mac is not None:
            pulumi.set(__self__, "inspection_validate_dst_mac", inspection_validate_dst_mac)
        if inspection_validate_ip is not None:
            pulumi.set(__self__, "inspection_validate_ip", inspection_validate_ip)
        if inspection_validate_src_mac is not None:
            pulumi.set(__self__, "inspection_validate_src_mac", inspection_validate_src_mac)
        if inspection_vlan is not None:
            pulumi.set(__self__, "inspection_vlan", inspection_vlan)
        if proxy_disable is not None:
            pulumi.set(__self__, "proxy_disable", proxy_disable)

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
    @pulumi.getter(name="entryLearn")
    def entry_learn(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum learn entry limit - Range: `255`-`512000`
        """
        return pulumi.get(self, "entry_learn")

    @entry_learn.setter
    def entry_learn(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "entry_learn", value)

    @property
    @pulumi.getter(name="incompleteEntries")
    def incomplete_entries(self) -> Optional[pulumi.Input[int]]:
        """
        Specify the number of IP addresses to resolve - Range: `1`-`2147483647`
        """
        return pulumi.get(self, "incomplete_entries")

    @incomplete_entries.setter
    def incomplete_entries(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "incomplete_entries", value)

    @property
    @pulumi.getter(name="inspectionFilters")
    def inspection_filters(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ArpInspectionFilterArgs']]]]:
        """
        Specify ARP acl to be applied
        """
        return pulumi.get(self, "inspection_filters")

    @inspection_filters.setter
    def inspection_filters(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ArpInspectionFilterArgs']]]]):
        pulumi.set(self, "inspection_filters", value)

    @property
    @pulumi.getter(name="inspectionLogBufferEntries")
    def inspection_log_buffer_entries(self) -> Optional[pulumi.Input[int]]:
        """
        Number of entries for log buffer - Range: `0`-`1024`
        """
        return pulumi.get(self, "inspection_log_buffer_entries")

    @inspection_log_buffer_entries.setter
    def inspection_log_buffer_entries(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "inspection_log_buffer_entries", value)

    @property
    @pulumi.getter(name="inspectionLogBufferLogsEntries")
    def inspection_log_buffer_logs_entries(self) -> Optional[pulumi.Input[int]]:
        """
        Number of entries for log buffer - Range: `0`-`1024`
        """
        return pulumi.get(self, "inspection_log_buffer_logs_entries")

    @inspection_log_buffer_logs_entries.setter
    def inspection_log_buffer_logs_entries(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "inspection_log_buffer_logs_entries", value)

    @property
    @pulumi.getter(name="inspectionLogBufferLogsInterval")
    def inspection_log_buffer_logs_interval(self) -> Optional[pulumi.Input[int]]:
        """
        Interval for controlling logging rate - Range: `0`-`86400`
        """
        return pulumi.get(self, "inspection_log_buffer_logs_interval")

    @inspection_log_buffer_logs_interval.setter
    def inspection_log_buffer_logs_interval(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "inspection_log_buffer_logs_interval", value)

    @property
    @pulumi.getter(name="inspectionValidateAllowZeros")
    def inspection_validate_allow_zeros(self) -> Optional[pulumi.Input[bool]]:
        """
        Allow 0.0.0.0 sender IP address
        """
        return pulumi.get(self, "inspection_validate_allow_zeros")

    @inspection_validate_allow_zeros.setter
    def inspection_validate_allow_zeros(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "inspection_validate_allow_zeros", value)

    @property
    @pulumi.getter(name="inspectionValidateDstMac")
    def inspection_validate_dst_mac(self) -> Optional[pulumi.Input[bool]]:
        """
        Validate destination MAC address
        """
        return pulumi.get(self, "inspection_validate_dst_mac")

    @inspection_validate_dst_mac.setter
    def inspection_validate_dst_mac(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "inspection_validate_dst_mac", value)

    @property
    @pulumi.getter(name="inspectionValidateIp")
    def inspection_validate_ip(self) -> Optional[pulumi.Input[bool]]:
        """
        Validate IP addresses
        """
        return pulumi.get(self, "inspection_validate_ip")

    @inspection_validate_ip.setter
    def inspection_validate_ip(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "inspection_validate_ip", value)

    @property
    @pulumi.getter(name="inspectionValidateSrcMac")
    def inspection_validate_src_mac(self) -> Optional[pulumi.Input[bool]]:
        """
        Validate source MAC address
        """
        return pulumi.get(self, "inspection_validate_src_mac")

    @inspection_validate_src_mac.setter
    def inspection_validate_src_mac(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "inspection_validate_src_mac", value)

    @property
    @pulumi.getter(name="inspectionVlan")
    def inspection_vlan(self) -> Optional[pulumi.Input[str]]:
        """
        Enable/Disable ARP Inspection on vlans
        """
        return pulumi.get(self, "inspection_vlan")

    @inspection_vlan.setter
    def inspection_vlan(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "inspection_vlan", value)

    @property
    @pulumi.getter(name="proxyDisable")
    def proxy_disable(self) -> Optional[pulumi.Input[bool]]:
        """
        Disable proxy ARP on all interfaces
        """
        return pulumi.get(self, "proxy_disable")

    @proxy_disable.setter
    def proxy_disable(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "proxy_disable", value)


@pulumi.input_type
class _ArpState:
    def __init__(__self__, *,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 entry_learn: Optional[pulumi.Input[int]] = None,
                 incomplete_entries: Optional[pulumi.Input[int]] = None,
                 inspection_filters: Optional[pulumi.Input[Sequence[pulumi.Input['ArpInspectionFilterArgs']]]] = None,
                 inspection_log_buffer_entries: Optional[pulumi.Input[int]] = None,
                 inspection_log_buffer_logs_entries: Optional[pulumi.Input[int]] = None,
                 inspection_log_buffer_logs_interval: Optional[pulumi.Input[int]] = None,
                 inspection_validate_allow_zeros: Optional[pulumi.Input[bool]] = None,
                 inspection_validate_dst_mac: Optional[pulumi.Input[bool]] = None,
                 inspection_validate_ip: Optional[pulumi.Input[bool]] = None,
                 inspection_validate_src_mac: Optional[pulumi.Input[bool]] = None,
                 inspection_vlan: Optional[pulumi.Input[str]] = None,
                 proxy_disable: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering Arp resources.
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[int] entry_learn: Maximum learn entry limit - Range: `255`-`512000`
        :param pulumi.Input[int] incomplete_entries: Specify the number of IP addresses to resolve - Range: `1`-`2147483647`
        :param pulumi.Input[Sequence[pulumi.Input['ArpInspectionFilterArgs']]] inspection_filters: Specify ARP acl to be applied
        :param pulumi.Input[int] inspection_log_buffer_entries: Number of entries for log buffer - Range: `0`-`1024`
        :param pulumi.Input[int] inspection_log_buffer_logs_entries: Number of entries for log buffer - Range: `0`-`1024`
        :param pulumi.Input[int] inspection_log_buffer_logs_interval: Interval for controlling logging rate - Range: `0`-`86400`
        :param pulumi.Input[bool] inspection_validate_allow_zeros: Allow 0.0.0.0 sender IP address
        :param pulumi.Input[bool] inspection_validate_dst_mac: Validate destination MAC address
        :param pulumi.Input[bool] inspection_validate_ip: Validate IP addresses
        :param pulumi.Input[bool] inspection_validate_src_mac: Validate source MAC address
        :param pulumi.Input[str] inspection_vlan: Enable/Disable ARP Inspection on vlans
        :param pulumi.Input[bool] proxy_disable: Disable proxy ARP on all interfaces
        """
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if entry_learn is not None:
            pulumi.set(__self__, "entry_learn", entry_learn)
        if incomplete_entries is not None:
            pulumi.set(__self__, "incomplete_entries", incomplete_entries)
        if inspection_filters is not None:
            pulumi.set(__self__, "inspection_filters", inspection_filters)
        if inspection_log_buffer_entries is not None:
            pulumi.set(__self__, "inspection_log_buffer_entries", inspection_log_buffer_entries)
        if inspection_log_buffer_logs_entries is not None:
            pulumi.set(__self__, "inspection_log_buffer_logs_entries", inspection_log_buffer_logs_entries)
        if inspection_log_buffer_logs_interval is not None:
            pulumi.set(__self__, "inspection_log_buffer_logs_interval", inspection_log_buffer_logs_interval)
        if inspection_validate_allow_zeros is not None:
            pulumi.set(__self__, "inspection_validate_allow_zeros", inspection_validate_allow_zeros)
        if inspection_validate_dst_mac is not None:
            pulumi.set(__self__, "inspection_validate_dst_mac", inspection_validate_dst_mac)
        if inspection_validate_ip is not None:
            pulumi.set(__self__, "inspection_validate_ip", inspection_validate_ip)
        if inspection_validate_src_mac is not None:
            pulumi.set(__self__, "inspection_validate_src_mac", inspection_validate_src_mac)
        if inspection_vlan is not None:
            pulumi.set(__self__, "inspection_vlan", inspection_vlan)
        if proxy_disable is not None:
            pulumi.set(__self__, "proxy_disable", proxy_disable)

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
    @pulumi.getter(name="entryLearn")
    def entry_learn(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum learn entry limit - Range: `255`-`512000`
        """
        return pulumi.get(self, "entry_learn")

    @entry_learn.setter
    def entry_learn(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "entry_learn", value)

    @property
    @pulumi.getter(name="incompleteEntries")
    def incomplete_entries(self) -> Optional[pulumi.Input[int]]:
        """
        Specify the number of IP addresses to resolve - Range: `1`-`2147483647`
        """
        return pulumi.get(self, "incomplete_entries")

    @incomplete_entries.setter
    def incomplete_entries(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "incomplete_entries", value)

    @property
    @pulumi.getter(name="inspectionFilters")
    def inspection_filters(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ArpInspectionFilterArgs']]]]:
        """
        Specify ARP acl to be applied
        """
        return pulumi.get(self, "inspection_filters")

    @inspection_filters.setter
    def inspection_filters(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ArpInspectionFilterArgs']]]]):
        pulumi.set(self, "inspection_filters", value)

    @property
    @pulumi.getter(name="inspectionLogBufferEntries")
    def inspection_log_buffer_entries(self) -> Optional[pulumi.Input[int]]:
        """
        Number of entries for log buffer - Range: `0`-`1024`
        """
        return pulumi.get(self, "inspection_log_buffer_entries")

    @inspection_log_buffer_entries.setter
    def inspection_log_buffer_entries(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "inspection_log_buffer_entries", value)

    @property
    @pulumi.getter(name="inspectionLogBufferLogsEntries")
    def inspection_log_buffer_logs_entries(self) -> Optional[pulumi.Input[int]]:
        """
        Number of entries for log buffer - Range: `0`-`1024`
        """
        return pulumi.get(self, "inspection_log_buffer_logs_entries")

    @inspection_log_buffer_logs_entries.setter
    def inspection_log_buffer_logs_entries(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "inspection_log_buffer_logs_entries", value)

    @property
    @pulumi.getter(name="inspectionLogBufferLogsInterval")
    def inspection_log_buffer_logs_interval(self) -> Optional[pulumi.Input[int]]:
        """
        Interval for controlling logging rate - Range: `0`-`86400`
        """
        return pulumi.get(self, "inspection_log_buffer_logs_interval")

    @inspection_log_buffer_logs_interval.setter
    def inspection_log_buffer_logs_interval(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "inspection_log_buffer_logs_interval", value)

    @property
    @pulumi.getter(name="inspectionValidateAllowZeros")
    def inspection_validate_allow_zeros(self) -> Optional[pulumi.Input[bool]]:
        """
        Allow 0.0.0.0 sender IP address
        """
        return pulumi.get(self, "inspection_validate_allow_zeros")

    @inspection_validate_allow_zeros.setter
    def inspection_validate_allow_zeros(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "inspection_validate_allow_zeros", value)

    @property
    @pulumi.getter(name="inspectionValidateDstMac")
    def inspection_validate_dst_mac(self) -> Optional[pulumi.Input[bool]]:
        """
        Validate destination MAC address
        """
        return pulumi.get(self, "inspection_validate_dst_mac")

    @inspection_validate_dst_mac.setter
    def inspection_validate_dst_mac(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "inspection_validate_dst_mac", value)

    @property
    @pulumi.getter(name="inspectionValidateIp")
    def inspection_validate_ip(self) -> Optional[pulumi.Input[bool]]:
        """
        Validate IP addresses
        """
        return pulumi.get(self, "inspection_validate_ip")

    @inspection_validate_ip.setter
    def inspection_validate_ip(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "inspection_validate_ip", value)

    @property
    @pulumi.getter(name="inspectionValidateSrcMac")
    def inspection_validate_src_mac(self) -> Optional[pulumi.Input[bool]]:
        """
        Validate source MAC address
        """
        return pulumi.get(self, "inspection_validate_src_mac")

    @inspection_validate_src_mac.setter
    def inspection_validate_src_mac(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "inspection_validate_src_mac", value)

    @property
    @pulumi.getter(name="inspectionVlan")
    def inspection_vlan(self) -> Optional[pulumi.Input[str]]:
        """
        Enable/Disable ARP Inspection on vlans
        """
        return pulumi.get(self, "inspection_vlan")

    @inspection_vlan.setter
    def inspection_vlan(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "inspection_vlan", value)

    @property
    @pulumi.getter(name="proxyDisable")
    def proxy_disable(self) -> Optional[pulumi.Input[bool]]:
        """
        Disable proxy ARP on all interfaces
        """
        return pulumi.get(self, "proxy_disable")

    @proxy_disable.setter
    def proxy_disable(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "proxy_disable", value)


class Arp(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 entry_learn: Optional[pulumi.Input[int]] = None,
                 incomplete_entries: Optional[pulumi.Input[int]] = None,
                 inspection_filters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ArpInspectionFilterArgs']]]]] = None,
                 inspection_log_buffer_entries: Optional[pulumi.Input[int]] = None,
                 inspection_log_buffer_logs_entries: Optional[pulumi.Input[int]] = None,
                 inspection_log_buffer_logs_interval: Optional[pulumi.Input[int]] = None,
                 inspection_validate_allow_zeros: Optional[pulumi.Input[bool]] = None,
                 inspection_validate_dst_mac: Optional[pulumi.Input[bool]] = None,
                 inspection_validate_ip: Optional[pulumi.Input[bool]] = None,
                 inspection_validate_src_mac: Optional[pulumi.Input[bool]] = None,
                 inspection_vlan: Optional[pulumi.Input[str]] = None,
                 proxy_disable: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        This resource can manage the ARP configuration.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_iosxe as iosxe

        example = iosxe.iosxe.Arp("example",
            incomplete_entries=10,
            proxy_disable=True)
        ```

        ## Import

        ```sh
         $ pulumi import iosxe:iosxe/arp:Arp example "Cisco-IOS-XE-native:native/ip/arp"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[int] entry_learn: Maximum learn entry limit - Range: `255`-`512000`
        :param pulumi.Input[int] incomplete_entries: Specify the number of IP addresses to resolve - Range: `1`-`2147483647`
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ArpInspectionFilterArgs']]]] inspection_filters: Specify ARP acl to be applied
        :param pulumi.Input[int] inspection_log_buffer_entries: Number of entries for log buffer - Range: `0`-`1024`
        :param pulumi.Input[int] inspection_log_buffer_logs_entries: Number of entries for log buffer - Range: `0`-`1024`
        :param pulumi.Input[int] inspection_log_buffer_logs_interval: Interval for controlling logging rate - Range: `0`-`86400`
        :param pulumi.Input[bool] inspection_validate_allow_zeros: Allow 0.0.0.0 sender IP address
        :param pulumi.Input[bool] inspection_validate_dst_mac: Validate destination MAC address
        :param pulumi.Input[bool] inspection_validate_ip: Validate IP addresses
        :param pulumi.Input[bool] inspection_validate_src_mac: Validate source MAC address
        :param pulumi.Input[str] inspection_vlan: Enable/Disable ARP Inspection on vlans
        :param pulumi.Input[bool] proxy_disable: Disable proxy ARP on all interfaces
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ArpArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage the ARP configuration.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_iosxe as iosxe

        example = iosxe.iosxe.Arp("example",
            incomplete_entries=10,
            proxy_disable=True)
        ```

        ## Import

        ```sh
         $ pulumi import iosxe:iosxe/arp:Arp example "Cisco-IOS-XE-native:native/ip/arp"
        ```

        :param str resource_name: The name of the resource.
        :param ArpArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ArpArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 entry_learn: Optional[pulumi.Input[int]] = None,
                 incomplete_entries: Optional[pulumi.Input[int]] = None,
                 inspection_filters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ArpInspectionFilterArgs']]]]] = None,
                 inspection_log_buffer_entries: Optional[pulumi.Input[int]] = None,
                 inspection_log_buffer_logs_entries: Optional[pulumi.Input[int]] = None,
                 inspection_log_buffer_logs_interval: Optional[pulumi.Input[int]] = None,
                 inspection_validate_allow_zeros: Optional[pulumi.Input[bool]] = None,
                 inspection_validate_dst_mac: Optional[pulumi.Input[bool]] = None,
                 inspection_validate_ip: Optional[pulumi.Input[bool]] = None,
                 inspection_validate_src_mac: Optional[pulumi.Input[bool]] = None,
                 inspection_vlan: Optional[pulumi.Input[str]] = None,
                 proxy_disable: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ArpArgs.__new__(ArpArgs)

            __props__.__dict__["delete_mode"] = delete_mode
            __props__.__dict__["device"] = device
            __props__.__dict__["entry_learn"] = entry_learn
            __props__.__dict__["incomplete_entries"] = incomplete_entries
            __props__.__dict__["inspection_filters"] = inspection_filters
            __props__.__dict__["inspection_log_buffer_entries"] = inspection_log_buffer_entries
            __props__.__dict__["inspection_log_buffer_logs_entries"] = inspection_log_buffer_logs_entries
            __props__.__dict__["inspection_log_buffer_logs_interval"] = inspection_log_buffer_logs_interval
            __props__.__dict__["inspection_validate_allow_zeros"] = inspection_validate_allow_zeros
            __props__.__dict__["inspection_validate_dst_mac"] = inspection_validate_dst_mac
            __props__.__dict__["inspection_validate_ip"] = inspection_validate_ip
            __props__.__dict__["inspection_validate_src_mac"] = inspection_validate_src_mac
            __props__.__dict__["inspection_vlan"] = inspection_vlan
            __props__.__dict__["proxy_disable"] = proxy_disable
        super(Arp, __self__).__init__(
            'iosxe:iosxe/arp:Arp',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            delete_mode: Optional[pulumi.Input[str]] = None,
            device: Optional[pulumi.Input[str]] = None,
            entry_learn: Optional[pulumi.Input[int]] = None,
            incomplete_entries: Optional[pulumi.Input[int]] = None,
            inspection_filters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ArpInspectionFilterArgs']]]]] = None,
            inspection_log_buffer_entries: Optional[pulumi.Input[int]] = None,
            inspection_log_buffer_logs_entries: Optional[pulumi.Input[int]] = None,
            inspection_log_buffer_logs_interval: Optional[pulumi.Input[int]] = None,
            inspection_validate_allow_zeros: Optional[pulumi.Input[bool]] = None,
            inspection_validate_dst_mac: Optional[pulumi.Input[bool]] = None,
            inspection_validate_ip: Optional[pulumi.Input[bool]] = None,
            inspection_validate_src_mac: Optional[pulumi.Input[bool]] = None,
            inspection_vlan: Optional[pulumi.Input[str]] = None,
            proxy_disable: Optional[pulumi.Input[bool]] = None) -> 'Arp':
        """
        Get an existing Arp resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[int] entry_learn: Maximum learn entry limit - Range: `255`-`512000`
        :param pulumi.Input[int] incomplete_entries: Specify the number of IP addresses to resolve - Range: `1`-`2147483647`
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ArpInspectionFilterArgs']]]] inspection_filters: Specify ARP acl to be applied
        :param pulumi.Input[int] inspection_log_buffer_entries: Number of entries for log buffer - Range: `0`-`1024`
        :param pulumi.Input[int] inspection_log_buffer_logs_entries: Number of entries for log buffer - Range: `0`-`1024`
        :param pulumi.Input[int] inspection_log_buffer_logs_interval: Interval for controlling logging rate - Range: `0`-`86400`
        :param pulumi.Input[bool] inspection_validate_allow_zeros: Allow 0.0.0.0 sender IP address
        :param pulumi.Input[bool] inspection_validate_dst_mac: Validate destination MAC address
        :param pulumi.Input[bool] inspection_validate_ip: Validate IP addresses
        :param pulumi.Input[bool] inspection_validate_src_mac: Validate source MAC address
        :param pulumi.Input[str] inspection_vlan: Enable/Disable ARP Inspection on vlans
        :param pulumi.Input[bool] proxy_disable: Disable proxy ARP on all interfaces
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ArpState.__new__(_ArpState)

        __props__.__dict__["delete_mode"] = delete_mode
        __props__.__dict__["device"] = device
        __props__.__dict__["entry_learn"] = entry_learn
        __props__.__dict__["incomplete_entries"] = incomplete_entries
        __props__.__dict__["inspection_filters"] = inspection_filters
        __props__.__dict__["inspection_log_buffer_entries"] = inspection_log_buffer_entries
        __props__.__dict__["inspection_log_buffer_logs_entries"] = inspection_log_buffer_logs_entries
        __props__.__dict__["inspection_log_buffer_logs_interval"] = inspection_log_buffer_logs_interval
        __props__.__dict__["inspection_validate_allow_zeros"] = inspection_validate_allow_zeros
        __props__.__dict__["inspection_validate_dst_mac"] = inspection_validate_dst_mac
        __props__.__dict__["inspection_validate_ip"] = inspection_validate_ip
        __props__.__dict__["inspection_validate_src_mac"] = inspection_validate_src_mac
        __props__.__dict__["inspection_vlan"] = inspection_vlan
        __props__.__dict__["proxy_disable"] = proxy_disable
        return Arp(resource_name, opts=opts, __props__=__props__)

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
    @pulumi.getter(name="entryLearn")
    def entry_learn(self) -> pulumi.Output[Optional[int]]:
        """
        Maximum learn entry limit - Range: `255`-`512000`
        """
        return pulumi.get(self, "entry_learn")

    @property
    @pulumi.getter(name="incompleteEntries")
    def incomplete_entries(self) -> pulumi.Output[Optional[int]]:
        """
        Specify the number of IP addresses to resolve - Range: `1`-`2147483647`
        """
        return pulumi.get(self, "incomplete_entries")

    @property
    @pulumi.getter(name="inspectionFilters")
    def inspection_filters(self) -> pulumi.Output[Optional[Sequence['outputs.ArpInspectionFilter']]]:
        """
        Specify ARP acl to be applied
        """
        return pulumi.get(self, "inspection_filters")

    @property
    @pulumi.getter(name="inspectionLogBufferEntries")
    def inspection_log_buffer_entries(self) -> pulumi.Output[Optional[int]]:
        """
        Number of entries for log buffer - Range: `0`-`1024`
        """
        return pulumi.get(self, "inspection_log_buffer_entries")

    @property
    @pulumi.getter(name="inspectionLogBufferLogsEntries")
    def inspection_log_buffer_logs_entries(self) -> pulumi.Output[Optional[int]]:
        """
        Number of entries for log buffer - Range: `0`-`1024`
        """
        return pulumi.get(self, "inspection_log_buffer_logs_entries")

    @property
    @pulumi.getter(name="inspectionLogBufferLogsInterval")
    def inspection_log_buffer_logs_interval(self) -> pulumi.Output[Optional[int]]:
        """
        Interval for controlling logging rate - Range: `0`-`86400`
        """
        return pulumi.get(self, "inspection_log_buffer_logs_interval")

    @property
    @pulumi.getter(name="inspectionValidateAllowZeros")
    def inspection_validate_allow_zeros(self) -> pulumi.Output[Optional[bool]]:
        """
        Allow 0.0.0.0 sender IP address
        """
        return pulumi.get(self, "inspection_validate_allow_zeros")

    @property
    @pulumi.getter(name="inspectionValidateDstMac")
    def inspection_validate_dst_mac(self) -> pulumi.Output[Optional[bool]]:
        """
        Validate destination MAC address
        """
        return pulumi.get(self, "inspection_validate_dst_mac")

    @property
    @pulumi.getter(name="inspectionValidateIp")
    def inspection_validate_ip(self) -> pulumi.Output[Optional[bool]]:
        """
        Validate IP addresses
        """
        return pulumi.get(self, "inspection_validate_ip")

    @property
    @pulumi.getter(name="inspectionValidateSrcMac")
    def inspection_validate_src_mac(self) -> pulumi.Output[Optional[bool]]:
        """
        Validate source MAC address
        """
        return pulumi.get(self, "inspection_validate_src_mac")

    @property
    @pulumi.getter(name="inspectionVlan")
    def inspection_vlan(self) -> pulumi.Output[Optional[str]]:
        """
        Enable/Disable ARP Inspection on vlans
        """
        return pulumi.get(self, "inspection_vlan")

    @property
    @pulumi.getter(name="proxyDisable")
    def proxy_disable(self) -> pulumi.Output[Optional[bool]]:
        """
        Disable proxy ARP on all interfaces
        """
        return pulumi.get(self, "proxy_disable")

