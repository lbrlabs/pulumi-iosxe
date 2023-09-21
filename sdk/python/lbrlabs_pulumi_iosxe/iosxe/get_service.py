# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetServiceResult',
    'AwaitableGetServiceResult',
    'get_service',
    'get_service_output',
]

@pulumi.output_type
class GetServiceResult:
    """
    A collection of values returned by getService.
    """
    def __init__(__self__, call_home=None, compress_config=None, device=None, dhcp=None, id=None, pad=None, password_encryption=None, password_recovery=None, sequence_numbers=None, tcp_keepalives_in=None, tcp_keepalives_out=None, timestamps=None, timestamps_debug=None, timestamps_debug_datetime=None, timestamps_debug_datetime_localtime=None, timestamps_debug_datetime_msec=None, timestamps_debug_datetime_show_timezone=None, timestamps_debug_datetime_year=None, timestamps_debug_uptime=None, timestamps_log=None, timestamps_log_datetime=None, timestamps_log_datetime_localtime=None, timestamps_log_datetime_msec=None, timestamps_log_datetime_show_timezone=None, timestamps_log_datetime_year=None, timestamps_log_uptime=None):
        if call_home and not isinstance(call_home, bool):
            raise TypeError("Expected argument 'call_home' to be a bool")
        pulumi.set(__self__, "call_home", call_home)
        if compress_config and not isinstance(compress_config, bool):
            raise TypeError("Expected argument 'compress_config' to be a bool")
        pulumi.set(__self__, "compress_config", compress_config)
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if dhcp and not isinstance(dhcp, bool):
            raise TypeError("Expected argument 'dhcp' to be a bool")
        pulumi.set(__self__, "dhcp", dhcp)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if pad and not isinstance(pad, bool):
            raise TypeError("Expected argument 'pad' to be a bool")
        pulumi.set(__self__, "pad", pad)
        if password_encryption and not isinstance(password_encryption, bool):
            raise TypeError("Expected argument 'password_encryption' to be a bool")
        pulumi.set(__self__, "password_encryption", password_encryption)
        if password_recovery and not isinstance(password_recovery, bool):
            raise TypeError("Expected argument 'password_recovery' to be a bool")
        pulumi.set(__self__, "password_recovery", password_recovery)
        if sequence_numbers and not isinstance(sequence_numbers, bool):
            raise TypeError("Expected argument 'sequence_numbers' to be a bool")
        pulumi.set(__self__, "sequence_numbers", sequence_numbers)
        if tcp_keepalives_in and not isinstance(tcp_keepalives_in, bool):
            raise TypeError("Expected argument 'tcp_keepalives_in' to be a bool")
        pulumi.set(__self__, "tcp_keepalives_in", tcp_keepalives_in)
        if tcp_keepalives_out and not isinstance(tcp_keepalives_out, bool):
            raise TypeError("Expected argument 'tcp_keepalives_out' to be a bool")
        pulumi.set(__self__, "tcp_keepalives_out", tcp_keepalives_out)
        if timestamps and not isinstance(timestamps, bool):
            raise TypeError("Expected argument 'timestamps' to be a bool")
        pulumi.set(__self__, "timestamps", timestamps)
        if timestamps_debug and not isinstance(timestamps_debug, bool):
            raise TypeError("Expected argument 'timestamps_debug' to be a bool")
        pulumi.set(__self__, "timestamps_debug", timestamps_debug)
        if timestamps_debug_datetime and not isinstance(timestamps_debug_datetime, bool):
            raise TypeError("Expected argument 'timestamps_debug_datetime' to be a bool")
        pulumi.set(__self__, "timestamps_debug_datetime", timestamps_debug_datetime)
        if timestamps_debug_datetime_localtime and not isinstance(timestamps_debug_datetime_localtime, bool):
            raise TypeError("Expected argument 'timestamps_debug_datetime_localtime' to be a bool")
        pulumi.set(__self__, "timestamps_debug_datetime_localtime", timestamps_debug_datetime_localtime)
        if timestamps_debug_datetime_msec and not isinstance(timestamps_debug_datetime_msec, bool):
            raise TypeError("Expected argument 'timestamps_debug_datetime_msec' to be a bool")
        pulumi.set(__self__, "timestamps_debug_datetime_msec", timestamps_debug_datetime_msec)
        if timestamps_debug_datetime_show_timezone and not isinstance(timestamps_debug_datetime_show_timezone, bool):
            raise TypeError("Expected argument 'timestamps_debug_datetime_show_timezone' to be a bool")
        pulumi.set(__self__, "timestamps_debug_datetime_show_timezone", timestamps_debug_datetime_show_timezone)
        if timestamps_debug_datetime_year and not isinstance(timestamps_debug_datetime_year, bool):
            raise TypeError("Expected argument 'timestamps_debug_datetime_year' to be a bool")
        pulumi.set(__self__, "timestamps_debug_datetime_year", timestamps_debug_datetime_year)
        if timestamps_debug_uptime and not isinstance(timestamps_debug_uptime, bool):
            raise TypeError("Expected argument 'timestamps_debug_uptime' to be a bool")
        pulumi.set(__self__, "timestamps_debug_uptime", timestamps_debug_uptime)
        if timestamps_log and not isinstance(timestamps_log, bool):
            raise TypeError("Expected argument 'timestamps_log' to be a bool")
        pulumi.set(__self__, "timestamps_log", timestamps_log)
        if timestamps_log_datetime and not isinstance(timestamps_log_datetime, bool):
            raise TypeError("Expected argument 'timestamps_log_datetime' to be a bool")
        pulumi.set(__self__, "timestamps_log_datetime", timestamps_log_datetime)
        if timestamps_log_datetime_localtime and not isinstance(timestamps_log_datetime_localtime, bool):
            raise TypeError("Expected argument 'timestamps_log_datetime_localtime' to be a bool")
        pulumi.set(__self__, "timestamps_log_datetime_localtime", timestamps_log_datetime_localtime)
        if timestamps_log_datetime_msec and not isinstance(timestamps_log_datetime_msec, bool):
            raise TypeError("Expected argument 'timestamps_log_datetime_msec' to be a bool")
        pulumi.set(__self__, "timestamps_log_datetime_msec", timestamps_log_datetime_msec)
        if timestamps_log_datetime_show_timezone and not isinstance(timestamps_log_datetime_show_timezone, bool):
            raise TypeError("Expected argument 'timestamps_log_datetime_show_timezone' to be a bool")
        pulumi.set(__self__, "timestamps_log_datetime_show_timezone", timestamps_log_datetime_show_timezone)
        if timestamps_log_datetime_year and not isinstance(timestamps_log_datetime_year, bool):
            raise TypeError("Expected argument 'timestamps_log_datetime_year' to be a bool")
        pulumi.set(__self__, "timestamps_log_datetime_year", timestamps_log_datetime_year)
        if timestamps_log_uptime and not isinstance(timestamps_log_uptime, bool):
            raise TypeError("Expected argument 'timestamps_log_uptime' to be a bool")
        pulumi.set(__self__, "timestamps_log_uptime", timestamps_log_uptime)

    @property
    @pulumi.getter(name="callHome")
    def call_home(self) -> bool:
        """
        Enable call-home service
        """
        return pulumi.get(self, "call_home")

    @property
    @pulumi.getter(name="compressConfig")
    def compress_config(self) -> bool:
        """
        Compress the configuration file
        """
        return pulumi.get(self, "compress_config")

    @property
    @pulumi.getter
    def device(self) -> Optional[str]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def dhcp(self) -> bool:
        """
        Enable DHCP server and relay agent
        """
        return pulumi.get(self, "dhcp")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The path of the retrieved object.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def pad(self) -> bool:
        """
        Enable PAD commands
        """
        return pulumi.get(self, "pad")

    @property
    @pulumi.getter(name="passwordEncryption")
    def password_encryption(self) -> bool:
        """
        Encrypt system passwords
        """
        return pulumi.get(self, "password_encryption")

    @property
    @pulumi.getter(name="passwordRecovery")
    def password_recovery(self) -> bool:
        """
        Enable password recovery
        """
        return pulumi.get(self, "password_recovery")

    @property
    @pulumi.getter(name="sequenceNumbers")
    def sequence_numbers(self) -> bool:
        """
        Stamp logger messages with a sequence number
        """
        return pulumi.get(self, "sequence_numbers")

    @property
    @pulumi.getter(name="tcpKeepalivesIn")
    def tcp_keepalives_in(self) -> bool:
        """
        Generate keepalives on idle incoming network connections
        """
        return pulumi.get(self, "tcp_keepalives_in")

    @property
    @pulumi.getter(name="tcpKeepalivesOut")
    def tcp_keepalives_out(self) -> bool:
        """
        Generate keepalives on idle outgoing network connections
        """
        return pulumi.get(self, "tcp_keepalives_out")

    @property
    @pulumi.getter
    def timestamps(self) -> bool:
        """
        Timestamp debug/log messages
        """
        return pulumi.get(self, "timestamps")

    @property
    @pulumi.getter(name="timestampsDebug")
    def timestamps_debug(self) -> bool:
        """
        Timestamp debug messages
        """
        return pulumi.get(self, "timestamps_debug")

    @property
    @pulumi.getter(name="timestampsDebugDatetime")
    def timestamps_debug_datetime(self) -> bool:
        """
        Timestamp with date and time
        """
        return pulumi.get(self, "timestamps_debug_datetime")

    @property
    @pulumi.getter(name="timestampsDebugDatetimeLocaltime")
    def timestamps_debug_datetime_localtime(self) -> bool:
        """
        Use local time zone for timestamps
        """
        return pulumi.get(self, "timestamps_debug_datetime_localtime")

    @property
    @pulumi.getter(name="timestampsDebugDatetimeMsec")
    def timestamps_debug_datetime_msec(self) -> bool:
        """
        Include milliseconds in timestamp
        """
        return pulumi.get(self, "timestamps_debug_datetime_msec")

    @property
    @pulumi.getter(name="timestampsDebugDatetimeShowTimezone")
    def timestamps_debug_datetime_show_timezone(self) -> bool:
        """
        Add time zone information to timestamp
        """
        return pulumi.get(self, "timestamps_debug_datetime_show_timezone")

    @property
    @pulumi.getter(name="timestampsDebugDatetimeYear")
    def timestamps_debug_datetime_year(self) -> bool:
        """
        Include year in timestamp
        """
        return pulumi.get(self, "timestamps_debug_datetime_year")

    @property
    @pulumi.getter(name="timestampsDebugUptime")
    def timestamps_debug_uptime(self) -> bool:
        """
        Timestamp with system uptime
        """
        return pulumi.get(self, "timestamps_debug_uptime")

    @property
    @pulumi.getter(name="timestampsLog")
    def timestamps_log(self) -> bool:
        """
        Timestamp log messages
        """
        return pulumi.get(self, "timestamps_log")

    @property
    @pulumi.getter(name="timestampsLogDatetime")
    def timestamps_log_datetime(self) -> bool:
        """
        Timestamp with date and time
        """
        return pulumi.get(self, "timestamps_log_datetime")

    @property
    @pulumi.getter(name="timestampsLogDatetimeLocaltime")
    def timestamps_log_datetime_localtime(self) -> bool:
        """
        Use local time zone for timestamps
        """
        return pulumi.get(self, "timestamps_log_datetime_localtime")

    @property
    @pulumi.getter(name="timestampsLogDatetimeMsec")
    def timestamps_log_datetime_msec(self) -> bool:
        """
        Include milliseconds in timestamp
        """
        return pulumi.get(self, "timestamps_log_datetime_msec")

    @property
    @pulumi.getter(name="timestampsLogDatetimeShowTimezone")
    def timestamps_log_datetime_show_timezone(self) -> bool:
        """
        Add time zone information to timestamp
        """
        return pulumi.get(self, "timestamps_log_datetime_show_timezone")

    @property
    @pulumi.getter(name="timestampsLogDatetimeYear")
    def timestamps_log_datetime_year(self) -> bool:
        """
        Include year in timestamp
        """
        return pulumi.get(self, "timestamps_log_datetime_year")

    @property
    @pulumi.getter(name="timestampsLogUptime")
    def timestamps_log_uptime(self) -> bool:
        """
        Timestamp with system uptime
        """
        return pulumi.get(self, "timestamps_log_uptime")


class AwaitableGetServiceResult(GetServiceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServiceResult(
            call_home=self.call_home,
            compress_config=self.compress_config,
            device=self.device,
            dhcp=self.dhcp,
            id=self.id,
            pad=self.pad,
            password_encryption=self.password_encryption,
            password_recovery=self.password_recovery,
            sequence_numbers=self.sequence_numbers,
            tcp_keepalives_in=self.tcp_keepalives_in,
            tcp_keepalives_out=self.tcp_keepalives_out,
            timestamps=self.timestamps,
            timestamps_debug=self.timestamps_debug,
            timestamps_debug_datetime=self.timestamps_debug_datetime,
            timestamps_debug_datetime_localtime=self.timestamps_debug_datetime_localtime,
            timestamps_debug_datetime_msec=self.timestamps_debug_datetime_msec,
            timestamps_debug_datetime_show_timezone=self.timestamps_debug_datetime_show_timezone,
            timestamps_debug_datetime_year=self.timestamps_debug_datetime_year,
            timestamps_debug_uptime=self.timestamps_debug_uptime,
            timestamps_log=self.timestamps_log,
            timestamps_log_datetime=self.timestamps_log_datetime,
            timestamps_log_datetime_localtime=self.timestamps_log_datetime_localtime,
            timestamps_log_datetime_msec=self.timestamps_log_datetime_msec,
            timestamps_log_datetime_show_timezone=self.timestamps_log_datetime_show_timezone,
            timestamps_log_datetime_year=self.timestamps_log_datetime_year,
            timestamps_log_uptime=self.timestamps_log_uptime)


def get_service(device: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceResult:
    """
    This data source can read the Service configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_service()
    ```


    :param str device: A device name from the provider configuration.
    """
    __args__ = dict()
    __args__['device'] = device
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:iosxe/getService:getService', __args__, opts=opts, typ=GetServiceResult).value

    return AwaitableGetServiceResult(
        call_home=pulumi.get(__ret__, 'call_home'),
        compress_config=pulumi.get(__ret__, 'compress_config'),
        device=pulumi.get(__ret__, 'device'),
        dhcp=pulumi.get(__ret__, 'dhcp'),
        id=pulumi.get(__ret__, 'id'),
        pad=pulumi.get(__ret__, 'pad'),
        password_encryption=pulumi.get(__ret__, 'password_encryption'),
        password_recovery=pulumi.get(__ret__, 'password_recovery'),
        sequence_numbers=pulumi.get(__ret__, 'sequence_numbers'),
        tcp_keepalives_in=pulumi.get(__ret__, 'tcp_keepalives_in'),
        tcp_keepalives_out=pulumi.get(__ret__, 'tcp_keepalives_out'),
        timestamps=pulumi.get(__ret__, 'timestamps'),
        timestamps_debug=pulumi.get(__ret__, 'timestamps_debug'),
        timestamps_debug_datetime=pulumi.get(__ret__, 'timestamps_debug_datetime'),
        timestamps_debug_datetime_localtime=pulumi.get(__ret__, 'timestamps_debug_datetime_localtime'),
        timestamps_debug_datetime_msec=pulumi.get(__ret__, 'timestamps_debug_datetime_msec'),
        timestamps_debug_datetime_show_timezone=pulumi.get(__ret__, 'timestamps_debug_datetime_show_timezone'),
        timestamps_debug_datetime_year=pulumi.get(__ret__, 'timestamps_debug_datetime_year'),
        timestamps_debug_uptime=pulumi.get(__ret__, 'timestamps_debug_uptime'),
        timestamps_log=pulumi.get(__ret__, 'timestamps_log'),
        timestamps_log_datetime=pulumi.get(__ret__, 'timestamps_log_datetime'),
        timestamps_log_datetime_localtime=pulumi.get(__ret__, 'timestamps_log_datetime_localtime'),
        timestamps_log_datetime_msec=pulumi.get(__ret__, 'timestamps_log_datetime_msec'),
        timestamps_log_datetime_show_timezone=pulumi.get(__ret__, 'timestamps_log_datetime_show_timezone'),
        timestamps_log_datetime_year=pulumi.get(__ret__, 'timestamps_log_datetime_year'),
        timestamps_log_uptime=pulumi.get(__ret__, 'timestamps_log_uptime'))


@_utilities.lift_output_func(get_service)
def get_service_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetServiceResult]:
    """
    This data source can read the Service configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_iosxe as iosxe

    example = iosxe.iosxe.get_service()
    ```


    :param str device: A device name from the provider configuration.
    """
    ...
