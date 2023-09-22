# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['CryptoIpsecTransformSetArgs', 'CryptoIpsecTransformSet']

@pulumi.input_type
class CryptoIpsecTransformSetArgs:
    def __init__(__self__, *,
                 esp: pulumi.Input[str],
                 esp_hmac: pulumi.Input[str],
                 device: Optional[pulumi.Input[str]] = None,
                 mode_tunnel: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a CryptoIpsecTransformSet resource.
        :param pulumi.Input[str] esp: - Choices: `esp-3des`, `esp-aes`, `esp-des`, `esp-gcm`, `esp-gmac`, `esp-null`, `esp-seal`
        :param pulumi.Input[str] esp_hmac: - Choices: `esp-md5-hmac`, `esp-sha-hmac`, `esp-sha256-hmac`, `esp-sha384-hmac`, `esp-sha512-hmac`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[bool] mode_tunnel: tunnel (datagram encapsulation) mode
        """
        pulumi.set(__self__, "esp", esp)
        pulumi.set(__self__, "esp_hmac", esp_hmac)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if mode_tunnel is not None:
            pulumi.set(__self__, "mode_tunnel", mode_tunnel)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def esp(self) -> pulumi.Input[str]:
        """
        - Choices: `esp-3des`, `esp-aes`, `esp-des`, `esp-gcm`, `esp-gmac`, `esp-null`, `esp-seal`
        """
        return pulumi.get(self, "esp")

    @esp.setter
    def esp(self, value: pulumi.Input[str]):
        pulumi.set(self, "esp", value)

    @property
    @pulumi.getter(name="espHmac")
    def esp_hmac(self) -> pulumi.Input[str]:
        """
        - Choices: `esp-md5-hmac`, `esp-sha-hmac`, `esp-sha256-hmac`, `esp-sha384-hmac`, `esp-sha512-hmac`
        """
        return pulumi.get(self, "esp_hmac")

    @esp_hmac.setter
    def esp_hmac(self, value: pulumi.Input[str]):
        pulumi.set(self, "esp_hmac", value)

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
    @pulumi.getter(name="modeTunnel")
    def mode_tunnel(self) -> Optional[pulumi.Input[bool]]:
        """
        tunnel (datagram encapsulation) mode
        """
        return pulumi.get(self, "mode_tunnel")

    @mode_tunnel.setter
    def mode_tunnel(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "mode_tunnel", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _CryptoIpsecTransformSetState:
    def __init__(__self__, *,
                 device: Optional[pulumi.Input[str]] = None,
                 esp: Optional[pulumi.Input[str]] = None,
                 esp_hmac: Optional[pulumi.Input[str]] = None,
                 mode_tunnel: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CryptoIpsecTransformSet resources.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] esp: - Choices: `esp-3des`, `esp-aes`, `esp-des`, `esp-gcm`, `esp-gmac`, `esp-null`, `esp-seal`
        :param pulumi.Input[str] esp_hmac: - Choices: `esp-md5-hmac`, `esp-sha-hmac`, `esp-sha256-hmac`, `esp-sha384-hmac`, `esp-sha512-hmac`
        :param pulumi.Input[bool] mode_tunnel: tunnel (datagram encapsulation) mode
        """
        if device is not None:
            pulumi.set(__self__, "device", device)
        if esp is not None:
            pulumi.set(__self__, "esp", esp)
        if esp_hmac is not None:
            pulumi.set(__self__, "esp_hmac", esp_hmac)
        if mode_tunnel is not None:
            pulumi.set(__self__, "mode_tunnel", mode_tunnel)
        if name is not None:
            pulumi.set(__self__, "name", name)

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
    def esp(self) -> Optional[pulumi.Input[str]]:
        """
        - Choices: `esp-3des`, `esp-aes`, `esp-des`, `esp-gcm`, `esp-gmac`, `esp-null`, `esp-seal`
        """
        return pulumi.get(self, "esp")

    @esp.setter
    def esp(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "esp", value)

    @property
    @pulumi.getter(name="espHmac")
    def esp_hmac(self) -> Optional[pulumi.Input[str]]:
        """
        - Choices: `esp-md5-hmac`, `esp-sha-hmac`, `esp-sha256-hmac`, `esp-sha384-hmac`, `esp-sha512-hmac`
        """
        return pulumi.get(self, "esp_hmac")

    @esp_hmac.setter
    def esp_hmac(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "esp_hmac", value)

    @property
    @pulumi.getter(name="modeTunnel")
    def mode_tunnel(self) -> Optional[pulumi.Input[bool]]:
        """
        tunnel (datagram encapsulation) mode
        """
        return pulumi.get(self, "mode_tunnel")

    @mode_tunnel.setter
    def mode_tunnel(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "mode_tunnel", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class CryptoIpsecTransformSet(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 esp: Optional[pulumi.Input[str]] = None,
                 esp_hmac: Optional[pulumi.Input[str]] = None,
                 mode_tunnel: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource can manage the Crypto IPSec Transform Set configuration.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_iosxe as iosxe

        example = iosxe.CryptoIpsecTransformSet("example",
            esp="esp-aes",
            esp_hmac="esp-sha-hmac",
            mode_tunnel=True)
        ```

        ## Import

        ```sh
         $ pulumi import iosxe:index/cryptoIpsecTransformSet:CryptoIpsecTransformSet example "Cisco-IOS-XE-native:native/crypto/Cisco-IOS-XE-crypto:ipsec/transform-set=TEST"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] esp: - Choices: `esp-3des`, `esp-aes`, `esp-des`, `esp-gcm`, `esp-gmac`, `esp-null`, `esp-seal`
        :param pulumi.Input[str] esp_hmac: - Choices: `esp-md5-hmac`, `esp-sha-hmac`, `esp-sha256-hmac`, `esp-sha384-hmac`, `esp-sha512-hmac`
        :param pulumi.Input[bool] mode_tunnel: tunnel (datagram encapsulation) mode
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CryptoIpsecTransformSetArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage the Crypto IPSec Transform Set configuration.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_iosxe as iosxe

        example = iosxe.CryptoIpsecTransformSet("example",
            esp="esp-aes",
            esp_hmac="esp-sha-hmac",
            mode_tunnel=True)
        ```

        ## Import

        ```sh
         $ pulumi import iosxe:index/cryptoIpsecTransformSet:CryptoIpsecTransformSet example "Cisco-IOS-XE-native:native/crypto/Cisco-IOS-XE-crypto:ipsec/transform-set=TEST"
        ```

        :param str resource_name: The name of the resource.
        :param CryptoIpsecTransformSetArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CryptoIpsecTransformSetArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 esp: Optional[pulumi.Input[str]] = None,
                 esp_hmac: Optional[pulumi.Input[str]] = None,
                 mode_tunnel: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CryptoIpsecTransformSetArgs.__new__(CryptoIpsecTransformSetArgs)

            __props__.__dict__["device"] = device
            if esp is None and not opts.urn:
                raise TypeError("Missing required property 'esp'")
            __props__.__dict__["esp"] = esp
            if esp_hmac is None and not opts.urn:
                raise TypeError("Missing required property 'esp_hmac'")
            __props__.__dict__["esp_hmac"] = esp_hmac
            __props__.__dict__["mode_tunnel"] = mode_tunnel
            __props__.__dict__["name"] = name
        super(CryptoIpsecTransformSet, __self__).__init__(
            'iosxe:index/cryptoIpsecTransformSet:CryptoIpsecTransformSet',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            device: Optional[pulumi.Input[str]] = None,
            esp: Optional[pulumi.Input[str]] = None,
            esp_hmac: Optional[pulumi.Input[str]] = None,
            mode_tunnel: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'CryptoIpsecTransformSet':
        """
        Get an existing CryptoIpsecTransformSet resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] esp: - Choices: `esp-3des`, `esp-aes`, `esp-des`, `esp-gcm`, `esp-gmac`, `esp-null`, `esp-seal`
        :param pulumi.Input[str] esp_hmac: - Choices: `esp-md5-hmac`, `esp-sha-hmac`, `esp-sha256-hmac`, `esp-sha384-hmac`, `esp-sha512-hmac`
        :param pulumi.Input[bool] mode_tunnel: tunnel (datagram encapsulation) mode
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CryptoIpsecTransformSetState.__new__(_CryptoIpsecTransformSetState)

        __props__.__dict__["device"] = device
        __props__.__dict__["esp"] = esp
        __props__.__dict__["esp_hmac"] = esp_hmac
        __props__.__dict__["mode_tunnel"] = mode_tunnel
        __props__.__dict__["name"] = name
        return CryptoIpsecTransformSet(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def device(self) -> pulumi.Output[Optional[str]]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def esp(self) -> pulumi.Output[str]:
        """
        - Choices: `esp-3des`, `esp-aes`, `esp-des`, `esp-gcm`, `esp-gmac`, `esp-null`, `esp-seal`
        """
        return pulumi.get(self, "esp")

    @property
    @pulumi.getter(name="espHmac")
    def esp_hmac(self) -> pulumi.Output[str]:
        """
        - Choices: `esp-md5-hmac`, `esp-sha-hmac`, `esp-sha256-hmac`, `esp-sha384-hmac`, `esp-sha512-hmac`
        """
        return pulumi.get(self, "esp_hmac")

    @property
    @pulumi.getter(name="modeTunnel")
    def mode_tunnel(self) -> pulumi.Output[Optional[bool]]:
        """
        tunnel (datagram encapsulation) mode
        """
        return pulumi.get(self, "mode_tunnel")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")
