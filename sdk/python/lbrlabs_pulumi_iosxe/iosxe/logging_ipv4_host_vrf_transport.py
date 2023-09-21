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

__all__ = ['LoggingIpv4HostVrfTransportArgs', 'LoggingIpv4HostVrfTransport']

@pulumi.input_type
class LoggingIpv4HostVrfTransportArgs:
    def __init__(__self__, *,
                 ipv4_host: pulumi.Input[str],
                 vrf: pulumi.Input[str],
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 transport_tcp_ports: Optional[pulumi.Input[Sequence[pulumi.Input['LoggingIpv4HostVrfTransportTransportTcpPortArgs']]]] = None,
                 transport_tls_ports: Optional[pulumi.Input[Sequence[pulumi.Input['LoggingIpv4HostVrfTransportTransportTlsPortArgs']]]] = None,
                 transport_udp_ports: Optional[pulumi.Input[Sequence[pulumi.Input['LoggingIpv4HostVrfTransportTransportUdpPortArgs']]]] = None):
        """
        The set of arguments for constructing a LoggingIpv4HostVrfTransport resource.
        :param pulumi.Input[str] vrf: Set VRF option
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input['LoggingIpv4HostVrfTransportTransportTcpPortArgs']]] transport_tcp_ports: Port Number List
        :param pulumi.Input[Sequence[pulumi.Input['LoggingIpv4HostVrfTransportTransportTlsPortArgs']]] transport_tls_ports: Port Number List
        :param pulumi.Input[Sequence[pulumi.Input['LoggingIpv4HostVrfTransportTransportUdpPortArgs']]] transport_udp_ports: Port Number List
        """
        pulumi.set(__self__, "ipv4_host", ipv4_host)
        pulumi.set(__self__, "vrf", vrf)
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if transport_tcp_ports is not None:
            pulumi.set(__self__, "transport_tcp_ports", transport_tcp_ports)
        if transport_tls_ports is not None:
            pulumi.set(__self__, "transport_tls_ports", transport_tls_ports)
        if transport_udp_ports is not None:
            pulumi.set(__self__, "transport_udp_ports", transport_udp_ports)

    @property
    @pulumi.getter(name="ipv4Host")
    def ipv4_host(self) -> pulumi.Input[str]:
        return pulumi.get(self, "ipv4_host")

    @ipv4_host.setter
    def ipv4_host(self, value: pulumi.Input[str]):
        pulumi.set(self, "ipv4_host", value)

    @property
    @pulumi.getter
    def vrf(self) -> pulumi.Input[str]:
        """
        Set VRF option
        """
        return pulumi.get(self, "vrf")

    @vrf.setter
    def vrf(self, value: pulumi.Input[str]):
        pulumi.set(self, "vrf", value)

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
    @pulumi.getter(name="transportTcpPorts")
    def transport_tcp_ports(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['LoggingIpv4HostVrfTransportTransportTcpPortArgs']]]]:
        """
        Port Number List
        """
        return pulumi.get(self, "transport_tcp_ports")

    @transport_tcp_ports.setter
    def transport_tcp_ports(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['LoggingIpv4HostVrfTransportTransportTcpPortArgs']]]]):
        pulumi.set(self, "transport_tcp_ports", value)

    @property
    @pulumi.getter(name="transportTlsPorts")
    def transport_tls_ports(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['LoggingIpv4HostVrfTransportTransportTlsPortArgs']]]]:
        """
        Port Number List
        """
        return pulumi.get(self, "transport_tls_ports")

    @transport_tls_ports.setter
    def transport_tls_ports(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['LoggingIpv4HostVrfTransportTransportTlsPortArgs']]]]):
        pulumi.set(self, "transport_tls_ports", value)

    @property
    @pulumi.getter(name="transportUdpPorts")
    def transport_udp_ports(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['LoggingIpv4HostVrfTransportTransportUdpPortArgs']]]]:
        """
        Port Number List
        """
        return pulumi.get(self, "transport_udp_ports")

    @transport_udp_ports.setter
    def transport_udp_ports(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['LoggingIpv4HostVrfTransportTransportUdpPortArgs']]]]):
        pulumi.set(self, "transport_udp_ports", value)


@pulumi.input_type
class _LoggingIpv4HostVrfTransportState:
    def __init__(__self__, *,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 ipv4_host: Optional[pulumi.Input[str]] = None,
                 transport_tcp_ports: Optional[pulumi.Input[Sequence[pulumi.Input['LoggingIpv4HostVrfTransportTransportTcpPortArgs']]]] = None,
                 transport_tls_ports: Optional[pulumi.Input[Sequence[pulumi.Input['LoggingIpv4HostVrfTransportTransportTlsPortArgs']]]] = None,
                 transport_udp_ports: Optional[pulumi.Input[Sequence[pulumi.Input['LoggingIpv4HostVrfTransportTransportUdpPortArgs']]]] = None,
                 vrf: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering LoggingIpv4HostVrfTransport resources.
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input['LoggingIpv4HostVrfTransportTransportTcpPortArgs']]] transport_tcp_ports: Port Number List
        :param pulumi.Input[Sequence[pulumi.Input['LoggingIpv4HostVrfTransportTransportTlsPortArgs']]] transport_tls_ports: Port Number List
        :param pulumi.Input[Sequence[pulumi.Input['LoggingIpv4HostVrfTransportTransportUdpPortArgs']]] transport_udp_ports: Port Number List
        :param pulumi.Input[str] vrf: Set VRF option
        """
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if ipv4_host is not None:
            pulumi.set(__self__, "ipv4_host", ipv4_host)
        if transport_tcp_ports is not None:
            pulumi.set(__self__, "transport_tcp_ports", transport_tcp_ports)
        if transport_tls_ports is not None:
            pulumi.set(__self__, "transport_tls_ports", transport_tls_ports)
        if transport_udp_ports is not None:
            pulumi.set(__self__, "transport_udp_ports", transport_udp_ports)
        if vrf is not None:
            pulumi.set(__self__, "vrf", vrf)

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
    @pulumi.getter(name="ipv4Host")
    def ipv4_host(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ipv4_host")

    @ipv4_host.setter
    def ipv4_host(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipv4_host", value)

    @property
    @pulumi.getter(name="transportTcpPorts")
    def transport_tcp_ports(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['LoggingIpv4HostVrfTransportTransportTcpPortArgs']]]]:
        """
        Port Number List
        """
        return pulumi.get(self, "transport_tcp_ports")

    @transport_tcp_ports.setter
    def transport_tcp_ports(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['LoggingIpv4HostVrfTransportTransportTcpPortArgs']]]]):
        pulumi.set(self, "transport_tcp_ports", value)

    @property
    @pulumi.getter(name="transportTlsPorts")
    def transport_tls_ports(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['LoggingIpv4HostVrfTransportTransportTlsPortArgs']]]]:
        """
        Port Number List
        """
        return pulumi.get(self, "transport_tls_ports")

    @transport_tls_ports.setter
    def transport_tls_ports(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['LoggingIpv4HostVrfTransportTransportTlsPortArgs']]]]):
        pulumi.set(self, "transport_tls_ports", value)

    @property
    @pulumi.getter(name="transportUdpPorts")
    def transport_udp_ports(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['LoggingIpv4HostVrfTransportTransportUdpPortArgs']]]]:
        """
        Port Number List
        """
        return pulumi.get(self, "transport_udp_ports")

    @transport_udp_ports.setter
    def transport_udp_ports(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['LoggingIpv4HostVrfTransportTransportUdpPortArgs']]]]):
        pulumi.set(self, "transport_udp_ports", value)

    @property
    @pulumi.getter
    def vrf(self) -> Optional[pulumi.Input[str]]:
        """
        Set VRF option
        """
        return pulumi.get(self, "vrf")

    @vrf.setter
    def vrf(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vrf", value)


class LoggingIpv4HostVrfTransport(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 ipv4_host: Optional[pulumi.Input[str]] = None,
                 transport_tcp_ports: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoggingIpv4HostVrfTransportTransportTcpPortArgs']]]]] = None,
                 transport_tls_ports: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoggingIpv4HostVrfTransportTransportTlsPortArgs']]]]] = None,
                 transport_udp_ports: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoggingIpv4HostVrfTransportTransportUdpPortArgs']]]]] = None,
                 vrf: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource can manage the Logging IPv4 Host VRF Transport configuration.

        ## Import

        ```sh
         $ pulumi import iosxe:iosxe/loggingIpv4HostVrfTransport:LoggingIpv4HostVrfTransport example "Cisco-IOS-XE-native:native/logging/host/ipv4-host-vrf-transport-list=2.2.2.2,VRF1"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoggingIpv4HostVrfTransportTransportTcpPortArgs']]]] transport_tcp_ports: Port Number List
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoggingIpv4HostVrfTransportTransportTlsPortArgs']]]] transport_tls_ports: Port Number List
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoggingIpv4HostVrfTransportTransportUdpPortArgs']]]] transport_udp_ports: Port Number List
        :param pulumi.Input[str] vrf: Set VRF option
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LoggingIpv4HostVrfTransportArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage the Logging IPv4 Host VRF Transport configuration.

        ## Import

        ```sh
         $ pulumi import iosxe:iosxe/loggingIpv4HostVrfTransport:LoggingIpv4HostVrfTransport example "Cisco-IOS-XE-native:native/logging/host/ipv4-host-vrf-transport-list=2.2.2.2,VRF1"
        ```

        :param str resource_name: The name of the resource.
        :param LoggingIpv4HostVrfTransportArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LoggingIpv4HostVrfTransportArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 ipv4_host: Optional[pulumi.Input[str]] = None,
                 transport_tcp_ports: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoggingIpv4HostVrfTransportTransportTcpPortArgs']]]]] = None,
                 transport_tls_ports: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoggingIpv4HostVrfTransportTransportTlsPortArgs']]]]] = None,
                 transport_udp_ports: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoggingIpv4HostVrfTransportTransportUdpPortArgs']]]]] = None,
                 vrf: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LoggingIpv4HostVrfTransportArgs.__new__(LoggingIpv4HostVrfTransportArgs)

            __props__.__dict__["delete_mode"] = delete_mode
            __props__.__dict__["device"] = device
            if ipv4_host is None and not opts.urn:
                raise TypeError("Missing required property 'ipv4_host'")
            __props__.__dict__["ipv4_host"] = ipv4_host
            __props__.__dict__["transport_tcp_ports"] = transport_tcp_ports
            __props__.__dict__["transport_tls_ports"] = transport_tls_ports
            __props__.__dict__["transport_udp_ports"] = transport_udp_ports
            if vrf is None and not opts.urn:
                raise TypeError("Missing required property 'vrf'")
            __props__.__dict__["vrf"] = vrf
        super(LoggingIpv4HostVrfTransport, __self__).__init__(
            'iosxe:iosxe/loggingIpv4HostVrfTransport:LoggingIpv4HostVrfTransport',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            delete_mode: Optional[pulumi.Input[str]] = None,
            device: Optional[pulumi.Input[str]] = None,
            ipv4_host: Optional[pulumi.Input[str]] = None,
            transport_tcp_ports: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoggingIpv4HostVrfTransportTransportTcpPortArgs']]]]] = None,
            transport_tls_ports: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoggingIpv4HostVrfTransportTransportTlsPortArgs']]]]] = None,
            transport_udp_ports: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoggingIpv4HostVrfTransportTransportUdpPortArgs']]]]] = None,
            vrf: Optional[pulumi.Input[str]] = None) -> 'LoggingIpv4HostVrfTransport':
        """
        Get an existing LoggingIpv4HostVrfTransport resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoggingIpv4HostVrfTransportTransportTcpPortArgs']]]] transport_tcp_ports: Port Number List
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoggingIpv4HostVrfTransportTransportTlsPortArgs']]]] transport_tls_ports: Port Number List
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoggingIpv4HostVrfTransportTransportUdpPortArgs']]]] transport_udp_ports: Port Number List
        :param pulumi.Input[str] vrf: Set VRF option
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LoggingIpv4HostVrfTransportState.__new__(_LoggingIpv4HostVrfTransportState)

        __props__.__dict__["delete_mode"] = delete_mode
        __props__.__dict__["device"] = device
        __props__.__dict__["ipv4_host"] = ipv4_host
        __props__.__dict__["transport_tcp_ports"] = transport_tcp_ports
        __props__.__dict__["transport_tls_ports"] = transport_tls_ports
        __props__.__dict__["transport_udp_ports"] = transport_udp_ports
        __props__.__dict__["vrf"] = vrf
        return LoggingIpv4HostVrfTransport(resource_name, opts=opts, __props__=__props__)

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
    @pulumi.getter(name="ipv4Host")
    def ipv4_host(self) -> pulumi.Output[str]:
        return pulumi.get(self, "ipv4_host")

    @property
    @pulumi.getter(name="transportTcpPorts")
    def transport_tcp_ports(self) -> pulumi.Output[Optional[Sequence['outputs.LoggingIpv4HostVrfTransportTransportTcpPort']]]:
        """
        Port Number List
        """
        return pulumi.get(self, "transport_tcp_ports")

    @property
    @pulumi.getter(name="transportTlsPorts")
    def transport_tls_ports(self) -> pulumi.Output[Optional[Sequence['outputs.LoggingIpv4HostVrfTransportTransportTlsPort']]]:
        """
        Port Number List
        """
        return pulumi.get(self, "transport_tls_ports")

    @property
    @pulumi.getter(name="transportUdpPorts")
    def transport_udp_ports(self) -> pulumi.Output[Optional[Sequence['outputs.LoggingIpv4HostVrfTransportTransportUdpPort']]]:
        """
        Port Number List
        """
        return pulumi.get(self, "transport_udp_ports")

    @property
    @pulumi.getter
    def vrf(self) -> pulumi.Output[str]:
        """
        Set VRF option
        """
        return pulumi.get(self, "vrf")

