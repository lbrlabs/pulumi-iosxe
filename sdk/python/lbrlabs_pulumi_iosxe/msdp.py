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

__all__ = ['MsdpArgs', 'Msdp']

@pulumi.input_type
class MsdpArgs:
    def __init__(__self__, *,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 originator_id: Optional[pulumi.Input[str]] = None,
                 passwords: Optional[pulumi.Input[Sequence[pulumi.Input['MsdpPasswordArgs']]]] = None,
                 peers: Optional[pulumi.Input[Sequence[pulumi.Input['MsdpPeerArgs']]]] = None):
        """
        The set of arguments for constructing a Msdp resource.
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] originator_id: Configure MSDP Originator ID
        :param pulumi.Input[Sequence[pulumi.Input['MsdpPasswordArgs']]] passwords: MSDP peer on which the password is to be set
        :param pulumi.Input[Sequence[pulumi.Input['MsdpPeerArgs']]] peers: Configure an MSDP peer
        """
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if originator_id is not None:
            pulumi.set(__self__, "originator_id", originator_id)
        if passwords is not None:
            pulumi.set(__self__, "passwords", passwords)
        if peers is not None:
            pulumi.set(__self__, "peers", peers)

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
    @pulumi.getter(name="originatorId")
    def originator_id(self) -> Optional[pulumi.Input[str]]:
        """
        Configure MSDP Originator ID
        """
        return pulumi.get(self, "originator_id")

    @originator_id.setter
    def originator_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "originator_id", value)

    @property
    @pulumi.getter
    def passwords(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['MsdpPasswordArgs']]]]:
        """
        MSDP peer on which the password is to be set
        """
        return pulumi.get(self, "passwords")

    @passwords.setter
    def passwords(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['MsdpPasswordArgs']]]]):
        pulumi.set(self, "passwords", value)

    @property
    @pulumi.getter
    def peers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['MsdpPeerArgs']]]]:
        """
        Configure an MSDP peer
        """
        return pulumi.get(self, "peers")

    @peers.setter
    def peers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['MsdpPeerArgs']]]]):
        pulumi.set(self, "peers", value)


@pulumi.input_type
class _MsdpState:
    def __init__(__self__, *,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 originator_id: Optional[pulumi.Input[str]] = None,
                 passwords: Optional[pulumi.Input[Sequence[pulumi.Input['MsdpPasswordArgs']]]] = None,
                 peers: Optional[pulumi.Input[Sequence[pulumi.Input['MsdpPeerArgs']]]] = None):
        """
        Input properties used for looking up and filtering Msdp resources.
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] originator_id: Configure MSDP Originator ID
        :param pulumi.Input[Sequence[pulumi.Input['MsdpPasswordArgs']]] passwords: MSDP peer on which the password is to be set
        :param pulumi.Input[Sequence[pulumi.Input['MsdpPeerArgs']]] peers: Configure an MSDP peer
        """
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if originator_id is not None:
            pulumi.set(__self__, "originator_id", originator_id)
        if passwords is not None:
            pulumi.set(__self__, "passwords", passwords)
        if peers is not None:
            pulumi.set(__self__, "peers", peers)

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
    @pulumi.getter(name="originatorId")
    def originator_id(self) -> Optional[pulumi.Input[str]]:
        """
        Configure MSDP Originator ID
        """
        return pulumi.get(self, "originator_id")

    @originator_id.setter
    def originator_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "originator_id", value)

    @property
    @pulumi.getter
    def passwords(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['MsdpPasswordArgs']]]]:
        """
        MSDP peer on which the password is to be set
        """
        return pulumi.get(self, "passwords")

    @passwords.setter
    def passwords(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['MsdpPasswordArgs']]]]):
        pulumi.set(self, "passwords", value)

    @property
    @pulumi.getter
    def peers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['MsdpPeerArgs']]]]:
        """
        Configure an MSDP peer
        """
        return pulumi.get(self, "peers")

    @peers.setter
    def peers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['MsdpPeerArgs']]]]):
        pulumi.set(self, "peers", value)


class Msdp(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 originator_id: Optional[pulumi.Input[str]] = None,
                 passwords: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MsdpPasswordArgs']]]]] = None,
                 peers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MsdpPeerArgs']]]]] = None,
                 __props__=None):
        """
        This resource can manage the MSDP configuration.

        ## Import

        ```sh
         $ pulumi import iosxe:index/msdp:Msdp example "Cisco-IOS-XE-native:native/ip/Cisco-IOS-XE-multicast:msdp"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] originator_id: Configure MSDP Originator ID
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MsdpPasswordArgs']]]] passwords: MSDP peer on which the password is to be set
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MsdpPeerArgs']]]] peers: Configure an MSDP peer
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[MsdpArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage the MSDP configuration.

        ## Import

        ```sh
         $ pulumi import iosxe:index/msdp:Msdp example "Cisco-IOS-XE-native:native/ip/Cisco-IOS-XE-multicast:msdp"
        ```

        :param str resource_name: The name of the resource.
        :param MsdpArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MsdpArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 originator_id: Optional[pulumi.Input[str]] = None,
                 passwords: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MsdpPasswordArgs']]]]] = None,
                 peers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MsdpPeerArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MsdpArgs.__new__(MsdpArgs)

            __props__.__dict__["delete_mode"] = delete_mode
            __props__.__dict__["device"] = device
            __props__.__dict__["originator_id"] = originator_id
            __props__.__dict__["passwords"] = passwords
            __props__.__dict__["peers"] = peers
        super(Msdp, __self__).__init__(
            'iosxe:index/msdp:Msdp',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            delete_mode: Optional[pulumi.Input[str]] = None,
            device: Optional[pulumi.Input[str]] = None,
            originator_id: Optional[pulumi.Input[str]] = None,
            passwords: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MsdpPasswordArgs']]]]] = None,
            peers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MsdpPeerArgs']]]]] = None) -> 'Msdp':
        """
        Get an existing Msdp resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] originator_id: Configure MSDP Originator ID
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MsdpPasswordArgs']]]] passwords: MSDP peer on which the password is to be set
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MsdpPeerArgs']]]] peers: Configure an MSDP peer
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MsdpState.__new__(_MsdpState)

        __props__.__dict__["delete_mode"] = delete_mode
        __props__.__dict__["device"] = device
        __props__.__dict__["originator_id"] = originator_id
        __props__.__dict__["passwords"] = passwords
        __props__.__dict__["peers"] = peers
        return Msdp(resource_name, opts=opts, __props__=__props__)

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
    @pulumi.getter(name="originatorId")
    def originator_id(self) -> pulumi.Output[Optional[str]]:
        """
        Configure MSDP Originator ID
        """
        return pulumi.get(self, "originator_id")

    @property
    @pulumi.getter
    def passwords(self) -> pulumi.Output[Optional[Sequence['outputs.MsdpPassword']]]:
        """
        MSDP peer on which the password is to be set
        """
        return pulumi.get(self, "passwords")

    @property
    @pulumi.getter
    def peers(self) -> pulumi.Output[Optional[Sequence['outputs.MsdpPeer']]]:
        """
        Configure an MSDP peer
        """
        return pulumi.get(self, "peers")

