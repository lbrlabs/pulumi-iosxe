# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['UsernameArgs', 'Username']

@pulumi.input_type
class UsernameArgs:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 password_encryption: Optional[pulumi.Input[str]] = None,
                 privilege: Optional[pulumi.Input[int]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 secret_encryption: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Username resource.
        :param pulumi.Input[str] description: description string with max 128 characters
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] password_encryption: - Choices: `0`, `6`, `7`
        :param pulumi.Input[int] privilege: Set user privilege level - Range: `0`-`15`
        :param pulumi.Input[str] secret_encryption: - Choices: `0`, `5`, `8`, `9`
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if password_encryption is not None:
            pulumi.set(__self__, "password_encryption", password_encryption)
        if privilege is not None:
            pulumi.set(__self__, "privilege", privilege)
        if secret is not None:
            pulumi.set(__self__, "secret", secret)
        if secret_encryption is not None:
            pulumi.set(__self__, "secret_encryption", secret_encryption)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        description string with max 128 characters
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

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
    def password(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter(name="passwordEncryption")
    def password_encryption(self) -> Optional[pulumi.Input[str]]:
        """
        - Choices: `0`, `6`, `7`
        """
        return pulumi.get(self, "password_encryption")

    @password_encryption.setter
    def password_encryption(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password_encryption", value)

    @property
    @pulumi.getter
    def privilege(self) -> Optional[pulumi.Input[int]]:
        """
        Set user privilege level - Range: `0`-`15`
        """
        return pulumi.get(self, "privilege")

    @privilege.setter
    def privilege(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "privilege", value)

    @property
    @pulumi.getter
    def secret(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "secret")

    @secret.setter
    def secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret", value)

    @property
    @pulumi.getter(name="secretEncryption")
    def secret_encryption(self) -> Optional[pulumi.Input[str]]:
        """
        - Choices: `0`, `5`, `8`, `9`
        """
        return pulumi.get(self, "secret_encryption")

    @secret_encryption.setter
    def secret_encryption(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_encryption", value)


@pulumi.input_type
class _UsernameState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 password_encryption: Optional[pulumi.Input[str]] = None,
                 privilege: Optional[pulumi.Input[int]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 secret_encryption: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Username resources.
        :param pulumi.Input[str] description: description string with max 128 characters
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] password_encryption: - Choices: `0`, `6`, `7`
        :param pulumi.Input[int] privilege: Set user privilege level - Range: `0`-`15`
        :param pulumi.Input[str] secret_encryption: - Choices: `0`, `5`, `8`, `9`
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if password_encryption is not None:
            pulumi.set(__self__, "password_encryption", password_encryption)
        if privilege is not None:
            pulumi.set(__self__, "privilege", privilege)
        if secret is not None:
            pulumi.set(__self__, "secret", secret)
        if secret_encryption is not None:
            pulumi.set(__self__, "secret_encryption", secret_encryption)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        description string with max 128 characters
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

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
    def password(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter(name="passwordEncryption")
    def password_encryption(self) -> Optional[pulumi.Input[str]]:
        """
        - Choices: `0`, `6`, `7`
        """
        return pulumi.get(self, "password_encryption")

    @password_encryption.setter
    def password_encryption(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password_encryption", value)

    @property
    @pulumi.getter
    def privilege(self) -> Optional[pulumi.Input[int]]:
        """
        Set user privilege level - Range: `0`-`15`
        """
        return pulumi.get(self, "privilege")

    @privilege.setter
    def privilege(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "privilege", value)

    @property
    @pulumi.getter
    def secret(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "secret")

    @secret.setter
    def secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret", value)

    @property
    @pulumi.getter(name="secretEncryption")
    def secret_encryption(self) -> Optional[pulumi.Input[str]]:
        """
        - Choices: `0`, `5`, `8`, `9`
        """
        return pulumi.get(self, "secret_encryption")

    @secret_encryption.setter
    def secret_encryption(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_encryption", value)


class Username(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 password_encryption: Optional[pulumi.Input[str]] = None,
                 privilege: Optional[pulumi.Input[int]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 secret_encryption: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource can manage the Username configuration.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_iosxe as iosxe

        example = iosxe.Username("example",
            description="User1 description",
            password="MyPassword",
            password_encryption="0",
            privilege=15)
        ```

        ## Import

        ```sh
         $ pulumi import iosxe:index/username:Username example "Cisco-IOS-XE-native:native/username=user1"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: description string with max 128 characters
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] password_encryption: - Choices: `0`, `6`, `7`
        :param pulumi.Input[int] privilege: Set user privilege level - Range: `0`-`15`
        :param pulumi.Input[str] secret_encryption: - Choices: `0`, `5`, `8`, `9`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[UsernameArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage the Username configuration.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_iosxe as iosxe

        example = iosxe.Username("example",
            description="User1 description",
            password="MyPassword",
            password_encryption="0",
            privilege=15)
        ```

        ## Import

        ```sh
         $ pulumi import iosxe:index/username:Username example "Cisco-IOS-XE-native:native/username=user1"
        ```

        :param str resource_name: The name of the resource.
        :param UsernameArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UsernameArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 password_encryption: Optional[pulumi.Input[str]] = None,
                 privilege: Optional[pulumi.Input[int]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 secret_encryption: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UsernameArgs.__new__(UsernameArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["device"] = device
            __props__.__dict__["name"] = name
            __props__.__dict__["password"] = password
            __props__.__dict__["password_encryption"] = password_encryption
            __props__.__dict__["privilege"] = privilege
            __props__.__dict__["secret"] = secret
            __props__.__dict__["secret_encryption"] = secret_encryption
        super(Username, __self__).__init__(
            'iosxe:index/username:Username',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            device: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            password: Optional[pulumi.Input[str]] = None,
            password_encryption: Optional[pulumi.Input[str]] = None,
            privilege: Optional[pulumi.Input[int]] = None,
            secret: Optional[pulumi.Input[str]] = None,
            secret_encryption: Optional[pulumi.Input[str]] = None) -> 'Username':
        """
        Get an existing Username resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: description string with max 128 characters
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] password_encryption: - Choices: `0`, `6`, `7`
        :param pulumi.Input[int] privilege: Set user privilege level - Range: `0`-`15`
        :param pulumi.Input[str] secret_encryption: - Choices: `0`, `5`, `8`, `9`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UsernameState.__new__(_UsernameState)

        __props__.__dict__["description"] = description
        __props__.__dict__["device"] = device
        __props__.__dict__["name"] = name
        __props__.__dict__["password"] = password
        __props__.__dict__["password_encryption"] = password_encryption
        __props__.__dict__["privilege"] = privilege
        __props__.__dict__["secret"] = secret
        __props__.__dict__["secret_encryption"] = secret_encryption
        return Username(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        description string with max 128 characters
        """
        return pulumi.get(self, "description")

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
    def password(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "password")

    @property
    @pulumi.getter(name="passwordEncryption")
    def password_encryption(self) -> pulumi.Output[Optional[str]]:
        """
        - Choices: `0`, `6`, `7`
        """
        return pulumi.get(self, "password_encryption")

    @property
    @pulumi.getter
    def privilege(self) -> pulumi.Output[Optional[int]]:
        """
        Set user privilege level - Range: `0`-`15`
        """
        return pulumi.get(self, "privilege")

    @property
    @pulumi.getter
    def secret(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "secret")

    @property
    @pulumi.getter(name="secretEncryption")
    def secret_encryption(self) -> pulumi.Output[Optional[str]]:
        """
        - Choices: `0`, `5`, `8`, `9`
        """
        return pulumi.get(self, "secret_encryption")

