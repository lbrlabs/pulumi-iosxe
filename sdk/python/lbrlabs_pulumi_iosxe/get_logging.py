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
    'GetLoggingResult',
    'AwaitableGetLoggingResult',
    'get_logging',
    'get_logging_output',
]

@pulumi.output_type
class GetLoggingResult:
    """
    A collection of values returned by getLogging.
    """
    def __init__(__self__, buffered_severity=None, buffered_size=None, console_severity=None, device=None, facility=None, file_max_size=None, file_min_size=None, file_name=None, file_severity=None, history_severity=None, history_size=None, id=None, ipv4_hosts=None, ipv4_vrf_hosts=None, ipv6_hosts=None, ipv6_vrf_hosts=None, monitor_severity=None, origin_id_name=None, origin_id_type=None, source_interface=None, source_interfaces_vrves=None, trap=None, trap_severity=None):
        if buffered_severity and not isinstance(buffered_severity, str):
            raise TypeError("Expected argument 'buffered_severity' to be a str")
        pulumi.set(__self__, "buffered_severity", buffered_severity)
        if buffered_size and not isinstance(buffered_size, int):
            raise TypeError("Expected argument 'buffered_size' to be a int")
        pulumi.set(__self__, "buffered_size", buffered_size)
        if console_severity and not isinstance(console_severity, str):
            raise TypeError("Expected argument 'console_severity' to be a str")
        pulumi.set(__self__, "console_severity", console_severity)
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if facility and not isinstance(facility, str):
            raise TypeError("Expected argument 'facility' to be a str")
        pulumi.set(__self__, "facility", facility)
        if file_max_size and not isinstance(file_max_size, int):
            raise TypeError("Expected argument 'file_max_size' to be a int")
        pulumi.set(__self__, "file_max_size", file_max_size)
        if file_min_size and not isinstance(file_min_size, int):
            raise TypeError("Expected argument 'file_min_size' to be a int")
        pulumi.set(__self__, "file_min_size", file_min_size)
        if file_name and not isinstance(file_name, str):
            raise TypeError("Expected argument 'file_name' to be a str")
        pulumi.set(__self__, "file_name", file_name)
        if file_severity and not isinstance(file_severity, str):
            raise TypeError("Expected argument 'file_severity' to be a str")
        pulumi.set(__self__, "file_severity", file_severity)
        if history_severity and not isinstance(history_severity, str):
            raise TypeError("Expected argument 'history_severity' to be a str")
        pulumi.set(__self__, "history_severity", history_severity)
        if history_size and not isinstance(history_size, int):
            raise TypeError("Expected argument 'history_size' to be a int")
        pulumi.set(__self__, "history_size", history_size)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ipv4_hosts and not isinstance(ipv4_hosts, list):
            raise TypeError("Expected argument 'ipv4_hosts' to be a list")
        pulumi.set(__self__, "ipv4_hosts", ipv4_hosts)
        if ipv4_vrf_hosts and not isinstance(ipv4_vrf_hosts, list):
            raise TypeError("Expected argument 'ipv4_vrf_hosts' to be a list")
        pulumi.set(__self__, "ipv4_vrf_hosts", ipv4_vrf_hosts)
        if ipv6_hosts and not isinstance(ipv6_hosts, list):
            raise TypeError("Expected argument 'ipv6_hosts' to be a list")
        pulumi.set(__self__, "ipv6_hosts", ipv6_hosts)
        if ipv6_vrf_hosts and not isinstance(ipv6_vrf_hosts, list):
            raise TypeError("Expected argument 'ipv6_vrf_hosts' to be a list")
        pulumi.set(__self__, "ipv6_vrf_hosts", ipv6_vrf_hosts)
        if monitor_severity and not isinstance(monitor_severity, str):
            raise TypeError("Expected argument 'monitor_severity' to be a str")
        pulumi.set(__self__, "monitor_severity", monitor_severity)
        if origin_id_name and not isinstance(origin_id_name, str):
            raise TypeError("Expected argument 'origin_id_name' to be a str")
        pulumi.set(__self__, "origin_id_name", origin_id_name)
        if origin_id_type and not isinstance(origin_id_type, str):
            raise TypeError("Expected argument 'origin_id_type' to be a str")
        pulumi.set(__self__, "origin_id_type", origin_id_type)
        if source_interface and not isinstance(source_interface, str):
            raise TypeError("Expected argument 'source_interface' to be a str")
        pulumi.set(__self__, "source_interface", source_interface)
        if source_interfaces_vrves and not isinstance(source_interfaces_vrves, list):
            raise TypeError("Expected argument 'source_interfaces_vrves' to be a list")
        pulumi.set(__self__, "source_interfaces_vrves", source_interfaces_vrves)
        if trap and not isinstance(trap, bool):
            raise TypeError("Expected argument 'trap' to be a bool")
        pulumi.set(__self__, "trap", trap)
        if trap_severity and not isinstance(trap_severity, str):
            raise TypeError("Expected argument 'trap_severity' to be a str")
        pulumi.set(__self__, "trap_severity", trap_severity)

    @property
    @pulumi.getter(name="bufferedSeverity")
    def buffered_severity(self) -> str:
        """
        Logging severity level
        """
        return pulumi.get(self, "buffered_severity")

    @property
    @pulumi.getter(name="bufferedSize")
    def buffered_size(self) -> int:
        """
        Logging buffer size
        """
        return pulumi.get(self, "buffered_size")

    @property
    @pulumi.getter(name="consoleSeverity")
    def console_severity(self) -> str:
        return pulumi.get(self, "console_severity")

    @property
    @pulumi.getter
    def device(self) -> Optional[str]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def facility(self) -> str:
        """
        Facility parameter for syslog messages
        """
        return pulumi.get(self, "facility")

    @property
    @pulumi.getter(name="fileMaxSize")
    def file_max_size(self) -> int:
        return pulumi.get(self, "file_max_size")

    @property
    @pulumi.getter(name="fileMinSize")
    def file_min_size(self) -> int:
        return pulumi.get(self, "file_min_size")

    @property
    @pulumi.getter(name="fileName")
    def file_name(self) -> str:
        return pulumi.get(self, "file_name")

    @property
    @pulumi.getter(name="fileSeverity")
    def file_severity(self) -> str:
        return pulumi.get(self, "file_severity")

    @property
    @pulumi.getter(name="historySeverity")
    def history_severity(self) -> str:
        return pulumi.get(self, "history_severity")

    @property
    @pulumi.getter(name="historySize")
    def history_size(self) -> int:
        """
        Set history table size
        """
        return pulumi.get(self, "history_size")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The path of the retrieved object.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipv4Hosts")
    def ipv4_hosts(self) -> Sequence['outputs.GetLoggingIpv4HostResult']:
        return pulumi.get(self, "ipv4_hosts")

    @property
    @pulumi.getter(name="ipv4VrfHosts")
    def ipv4_vrf_hosts(self) -> Sequence['outputs.GetLoggingIpv4VrfHostResult']:
        return pulumi.get(self, "ipv4_vrf_hosts")

    @property
    @pulumi.getter(name="ipv6Hosts")
    def ipv6_hosts(self) -> Sequence['outputs.GetLoggingIpv6HostResult']:
        return pulumi.get(self, "ipv6_hosts")

    @property
    @pulumi.getter(name="ipv6VrfHosts")
    def ipv6_vrf_hosts(self) -> Sequence['outputs.GetLoggingIpv6VrfHostResult']:
        return pulumi.get(self, "ipv6_vrf_hosts")

    @property
    @pulumi.getter(name="monitorSeverity")
    def monitor_severity(self) -> str:
        return pulumi.get(self, "monitor_severity")

    @property
    @pulumi.getter(name="originIdName")
    def origin_id_name(self) -> str:
        """
        Define a unique text string as ID
        """
        return pulumi.get(self, "origin_id_name")

    @property
    @pulumi.getter(name="originIdType")
    def origin_id_type(self) -> str:
        """
        Use origin hostname/ip/ipv6 as ID
        """
        return pulumi.get(self, "origin_id_type")

    @property
    @pulumi.getter(name="sourceInterface")
    def source_interface(self) -> str:
        return pulumi.get(self, "source_interface")

    @property
    @pulumi.getter(name="sourceInterfacesVrves")
    def source_interfaces_vrves(self) -> Sequence['outputs.GetLoggingSourceInterfacesVrfResult']:
        """
        Specify interface and vrf for source address in logging transactions
        """
        return pulumi.get(self, "source_interfaces_vrves")

    @property
    @pulumi.getter
    def trap(self) -> bool:
        """
        Set trap server logging level
        """
        return pulumi.get(self, "trap")

    @property
    @pulumi.getter(name="trapSeverity")
    def trap_severity(self) -> str:
        return pulumi.get(self, "trap_severity")


class AwaitableGetLoggingResult(GetLoggingResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLoggingResult(
            buffered_severity=self.buffered_severity,
            buffered_size=self.buffered_size,
            console_severity=self.console_severity,
            device=self.device,
            facility=self.facility,
            file_max_size=self.file_max_size,
            file_min_size=self.file_min_size,
            file_name=self.file_name,
            file_severity=self.file_severity,
            history_severity=self.history_severity,
            history_size=self.history_size,
            id=self.id,
            ipv4_hosts=self.ipv4_hosts,
            ipv4_vrf_hosts=self.ipv4_vrf_hosts,
            ipv6_hosts=self.ipv6_hosts,
            ipv6_vrf_hosts=self.ipv6_vrf_hosts,
            monitor_severity=self.monitor_severity,
            origin_id_name=self.origin_id_name,
            origin_id_type=self.origin_id_type,
            source_interface=self.source_interface,
            source_interfaces_vrves=self.source_interfaces_vrves,
            trap=self.trap,
            trap_severity=self.trap_severity)


def get_logging(device: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetLoggingResult:
    """
    This data source can read the Logging configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.get_logging()
    ```


    :param str device: A device name from the provider configuration.
    """
    __args__ = dict()
    __args__['device'] = device
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:index/getLogging:getLogging', __args__, opts=opts, typ=GetLoggingResult).value

    return AwaitableGetLoggingResult(
        buffered_severity=pulumi.get(__ret__, 'buffered_severity'),
        buffered_size=pulumi.get(__ret__, 'buffered_size'),
        console_severity=pulumi.get(__ret__, 'console_severity'),
        device=pulumi.get(__ret__, 'device'),
        facility=pulumi.get(__ret__, 'facility'),
        file_max_size=pulumi.get(__ret__, 'file_max_size'),
        file_min_size=pulumi.get(__ret__, 'file_min_size'),
        file_name=pulumi.get(__ret__, 'file_name'),
        file_severity=pulumi.get(__ret__, 'file_severity'),
        history_severity=pulumi.get(__ret__, 'history_severity'),
        history_size=pulumi.get(__ret__, 'history_size'),
        id=pulumi.get(__ret__, 'id'),
        ipv4_hosts=pulumi.get(__ret__, 'ipv4_hosts'),
        ipv4_vrf_hosts=pulumi.get(__ret__, 'ipv4_vrf_hosts'),
        ipv6_hosts=pulumi.get(__ret__, 'ipv6_hosts'),
        ipv6_vrf_hosts=pulumi.get(__ret__, 'ipv6_vrf_hosts'),
        monitor_severity=pulumi.get(__ret__, 'monitor_severity'),
        origin_id_name=pulumi.get(__ret__, 'origin_id_name'),
        origin_id_type=pulumi.get(__ret__, 'origin_id_type'),
        source_interface=pulumi.get(__ret__, 'source_interface'),
        source_interfaces_vrves=pulumi.get(__ret__, 'source_interfaces_vrves'),
        trap=pulumi.get(__ret__, 'trap'),
        trap_severity=pulumi.get(__ret__, 'trap_severity'))


@_utilities.lift_output_func(get_logging)
def get_logging_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetLoggingResult]:
    """
    This data source can read the Logging configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.get_logging()
    ```


    :param str device: A device name from the provider configuration.
    """
    ...
