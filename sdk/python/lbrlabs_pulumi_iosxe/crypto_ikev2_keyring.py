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
from ._inputs import *

__all__ = ['CryptoIkev2KeyringArgs', 'CryptoIkev2Keyring']

@pulumi.input_type
class CryptoIkev2KeyringArgs:
    def __init__(__self__, *,
                 device: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 peers: Optional[pulumi.Input[Sequence[pulumi.Input['CryptoIkev2KeyringPeerArgs']]]] = None):
        """
        The set of arguments for constructing a CryptoIkev2Keyring resource.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input['CryptoIkev2KeyringPeerArgs']]] peers: Configure a Peer and associated keys
        """
        if device is not None:
            pulumi.set(__self__, "device", device)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if peers is not None:
            pulumi.set(__self__, "peers", peers)

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
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def peers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CryptoIkev2KeyringPeerArgs']]]]:
        """
        Configure a Peer and associated keys
        """
        return pulumi.get(self, "peers")

    @peers.setter
    def peers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CryptoIkev2KeyringPeerArgs']]]]):
        pulumi.set(self, "peers", value)


@pulumi.input_type
class _CryptoIkev2KeyringState:
    def __init__(__self__, *,
                 device: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 peers: Optional[pulumi.Input[Sequence[pulumi.Input['CryptoIkev2KeyringPeerArgs']]]] = None):
        """
        Input properties used for looking up and filtering CryptoIkev2Keyring resources.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input['CryptoIkev2KeyringPeerArgs']]] peers: Configure a Peer and associated keys
        """
        if device is not None:
            pulumi.set(__self__, "device", device)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if peers is not None:
            pulumi.set(__self__, "peers", peers)

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
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def peers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CryptoIkev2KeyringPeerArgs']]]]:
        """
        Configure a Peer and associated keys
        """
        return pulumi.get(self, "peers")

    @peers.setter
    def peers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CryptoIkev2KeyringPeerArgs']]]]):
        pulumi.set(self, "peers", value)


class CryptoIkev2Keyring(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 peers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CryptoIkev2KeyringPeerArgs']]]]] = None,
                 __props__=None):
        """
        This resource can manage the Crypto IKEv2 Keyring configuration.

        ## Import

        ```sh
         $ pulumi import iosxe:index/cryptoIkev2Keyring:CryptoIkev2Keyring example "Cisco-IOS-XE-native:native/crypto/Cisco-IOS-XE-crypto:ikev2/keyring=keyring1"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CryptoIkev2KeyringPeerArgs']]]] peers: Configure a Peer and associated keys
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[CryptoIkev2KeyringArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage the Crypto IKEv2 Keyring configuration.

        ## Import

        ```sh
         $ pulumi import iosxe:index/cryptoIkev2Keyring:CryptoIkev2Keyring example "Cisco-IOS-XE-native:native/crypto/Cisco-IOS-XE-crypto:ikev2/keyring=keyring1"
        ```

        :param str resource_name: The name of the resource.
        :param CryptoIkev2KeyringArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CryptoIkev2KeyringArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 peers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CryptoIkev2KeyringPeerArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CryptoIkev2KeyringArgs.__new__(CryptoIkev2KeyringArgs)

            __props__.__dict__["device"] = device
            __props__.__dict__["name"] = name
            __props__.__dict__["peers"] = peers
        super(CryptoIkev2Keyring, __self__).__init__(
            'iosxe:index/cryptoIkev2Keyring:CryptoIkev2Keyring',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            device: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            peers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CryptoIkev2KeyringPeerArgs']]]]] = None) -> 'CryptoIkev2Keyring':
        """
        Get an existing CryptoIkev2Keyring resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CryptoIkev2KeyringPeerArgs']]]] peers: Configure a Peer and associated keys
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CryptoIkev2KeyringState.__new__(_CryptoIkev2KeyringState)

        __props__.__dict__["device"] = device
        __props__.__dict__["name"] = name
        __props__.__dict__["peers"] = peers
        return CryptoIkev2Keyring(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def device(self) -> pulumi.Output[Optional[str]]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def peers(self) -> pulumi.Output[Optional[Sequence['outputs.CryptoIkev2KeyringPeer']]]:
        """
        Configure a Peer and associated keys
        """
        return pulumi.get(self, "peers")

