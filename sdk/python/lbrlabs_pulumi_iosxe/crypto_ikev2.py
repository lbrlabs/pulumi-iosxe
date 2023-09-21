# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['CryptoIkev2Args', 'CryptoIkev2']

@pulumi.input_type
class CryptoIkev2Args:
    def __init__(__self__, *,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 dpd: Optional[pulumi.Input[int]] = None,
                 dpd_query: Optional[pulumi.Input[str]] = None,
                 dpd_retry_interval: Optional[pulumi.Input[int]] = None,
                 nat_keepalive: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a CryptoIkev2 resource.
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[int] dpd: Enable IKE liveness check for peers - Range: `10`-`3600`
        :param pulumi.Input[str] dpd_query: - Choices: `on-demand`, `periodic`
        :param pulumi.Input[int] dpd_retry_interval: - Range: `2`-`60`
        :param pulumi.Input[int] nat_keepalive: Set NAT keepalive interval - Range: `5`-`3600`
        """
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if dpd is not None:
            pulumi.set(__self__, "dpd", dpd)
        if dpd_query is not None:
            pulumi.set(__self__, "dpd_query", dpd_query)
        if dpd_retry_interval is not None:
            pulumi.set(__self__, "dpd_retry_interval", dpd_retry_interval)
        if nat_keepalive is not None:
            pulumi.set(__self__, "nat_keepalive", nat_keepalive)

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
    @pulumi.getter
    def dpd(self) -> Optional[pulumi.Input[int]]:
        """
        Enable IKE liveness check for peers - Range: `10`-`3600`
        """
        return pulumi.get(self, "dpd")

    @dpd.setter
    def dpd(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "dpd", value)

    @property
    @pulumi.getter(name="dpdQuery")
    def dpd_query(self) -> Optional[pulumi.Input[str]]:
        """
        - Choices: `on-demand`, `periodic`
        """
        return pulumi.get(self, "dpd_query")

    @dpd_query.setter
    def dpd_query(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dpd_query", value)

    @property
    @pulumi.getter(name="dpdRetryInterval")
    def dpd_retry_interval(self) -> Optional[pulumi.Input[int]]:
        """
        - Range: `2`-`60`
        """
        return pulumi.get(self, "dpd_retry_interval")

    @dpd_retry_interval.setter
    def dpd_retry_interval(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "dpd_retry_interval", value)

    @property
    @pulumi.getter(name="natKeepalive")
    def nat_keepalive(self) -> Optional[pulumi.Input[int]]:
        """
        Set NAT keepalive interval - Range: `5`-`3600`
        """
        return pulumi.get(self, "nat_keepalive")

    @nat_keepalive.setter
    def nat_keepalive(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "nat_keepalive", value)


@pulumi.input_type
class _CryptoIkev2State:
    def __init__(__self__, *,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 dpd: Optional[pulumi.Input[int]] = None,
                 dpd_query: Optional[pulumi.Input[str]] = None,
                 dpd_retry_interval: Optional[pulumi.Input[int]] = None,
                 nat_keepalive: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering CryptoIkev2 resources.
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[int] dpd: Enable IKE liveness check for peers - Range: `10`-`3600`
        :param pulumi.Input[str] dpd_query: - Choices: `on-demand`, `periodic`
        :param pulumi.Input[int] dpd_retry_interval: - Range: `2`-`60`
        :param pulumi.Input[int] nat_keepalive: Set NAT keepalive interval - Range: `5`-`3600`
        """
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if dpd is not None:
            pulumi.set(__self__, "dpd", dpd)
        if dpd_query is not None:
            pulumi.set(__self__, "dpd_query", dpd_query)
        if dpd_retry_interval is not None:
            pulumi.set(__self__, "dpd_retry_interval", dpd_retry_interval)
        if nat_keepalive is not None:
            pulumi.set(__self__, "nat_keepalive", nat_keepalive)

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
    @pulumi.getter
    def dpd(self) -> Optional[pulumi.Input[int]]:
        """
        Enable IKE liveness check for peers - Range: `10`-`3600`
        """
        return pulumi.get(self, "dpd")

    @dpd.setter
    def dpd(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "dpd", value)

    @property
    @pulumi.getter(name="dpdQuery")
    def dpd_query(self) -> Optional[pulumi.Input[str]]:
        """
        - Choices: `on-demand`, `periodic`
        """
        return pulumi.get(self, "dpd_query")

    @dpd_query.setter
    def dpd_query(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dpd_query", value)

    @property
    @pulumi.getter(name="dpdRetryInterval")
    def dpd_retry_interval(self) -> Optional[pulumi.Input[int]]:
        """
        - Range: `2`-`60`
        """
        return pulumi.get(self, "dpd_retry_interval")

    @dpd_retry_interval.setter
    def dpd_retry_interval(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "dpd_retry_interval", value)

    @property
    @pulumi.getter(name="natKeepalive")
    def nat_keepalive(self) -> Optional[pulumi.Input[int]]:
        """
        Set NAT keepalive interval - Range: `5`-`3600`
        """
        return pulumi.get(self, "nat_keepalive")

    @nat_keepalive.setter
    def nat_keepalive(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "nat_keepalive", value)


class CryptoIkev2(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 dpd: Optional[pulumi.Input[int]] = None,
                 dpd_query: Optional[pulumi.Input[str]] = None,
                 dpd_retry_interval: Optional[pulumi.Input[int]] = None,
                 nat_keepalive: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        This resource can manage the Crypto IKEv2 configuration.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_iosxe as iosxe

        example = iosxe.CryptoIkev2("example",
            dpd=10,
            dpd_query="periodic",
            dpd_retry_interval=5,
            nat_keepalive=20)
        ```

        ## Import

        ```sh
         $ pulumi import iosxe:index/cryptoIkev2:CryptoIkev2 example "Cisco-IOS-XE-native:native/crypto/Cisco-IOS-XE-crypto:ikev2"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[int] dpd: Enable IKE liveness check for peers - Range: `10`-`3600`
        :param pulumi.Input[str] dpd_query: - Choices: `on-demand`, `periodic`
        :param pulumi.Input[int] dpd_retry_interval: - Range: `2`-`60`
        :param pulumi.Input[int] nat_keepalive: Set NAT keepalive interval - Range: `5`-`3600`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[CryptoIkev2Args] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage the Crypto IKEv2 configuration.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_iosxe as iosxe

        example = iosxe.CryptoIkev2("example",
            dpd=10,
            dpd_query="periodic",
            dpd_retry_interval=5,
            nat_keepalive=20)
        ```

        ## Import

        ```sh
         $ pulumi import iosxe:index/cryptoIkev2:CryptoIkev2 example "Cisco-IOS-XE-native:native/crypto/Cisco-IOS-XE-crypto:ikev2"
        ```

        :param str resource_name: The name of the resource.
        :param CryptoIkev2Args args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CryptoIkev2Args, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 dpd: Optional[pulumi.Input[int]] = None,
                 dpd_query: Optional[pulumi.Input[str]] = None,
                 dpd_retry_interval: Optional[pulumi.Input[int]] = None,
                 nat_keepalive: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CryptoIkev2Args.__new__(CryptoIkev2Args)

            __props__.__dict__["delete_mode"] = delete_mode
            __props__.__dict__["device"] = device
            __props__.__dict__["dpd"] = dpd
            __props__.__dict__["dpd_query"] = dpd_query
            __props__.__dict__["dpd_retry_interval"] = dpd_retry_interval
            __props__.__dict__["nat_keepalive"] = nat_keepalive
        super(CryptoIkev2, __self__).__init__(
            'iosxe:index/cryptoIkev2:CryptoIkev2',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            delete_mode: Optional[pulumi.Input[str]] = None,
            device: Optional[pulumi.Input[str]] = None,
            dpd: Optional[pulumi.Input[int]] = None,
            dpd_query: Optional[pulumi.Input[str]] = None,
            dpd_retry_interval: Optional[pulumi.Input[int]] = None,
            nat_keepalive: Optional[pulumi.Input[int]] = None) -> 'CryptoIkev2':
        """
        Get an existing CryptoIkev2 resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[int] dpd: Enable IKE liveness check for peers - Range: `10`-`3600`
        :param pulumi.Input[str] dpd_query: - Choices: `on-demand`, `periodic`
        :param pulumi.Input[int] dpd_retry_interval: - Range: `2`-`60`
        :param pulumi.Input[int] nat_keepalive: Set NAT keepalive interval - Range: `5`-`3600`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CryptoIkev2State.__new__(_CryptoIkev2State)

        __props__.__dict__["delete_mode"] = delete_mode
        __props__.__dict__["device"] = device
        __props__.__dict__["dpd"] = dpd
        __props__.__dict__["dpd_query"] = dpd_query
        __props__.__dict__["dpd_retry_interval"] = dpd_retry_interval
        __props__.__dict__["nat_keepalive"] = nat_keepalive
        return CryptoIkev2(resource_name, opts=opts, __props__=__props__)

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
    @pulumi.getter
    def dpd(self) -> pulumi.Output[Optional[int]]:
        """
        Enable IKE liveness check for peers - Range: `10`-`3600`
        """
        return pulumi.get(self, "dpd")

    @property
    @pulumi.getter(name="dpdQuery")
    def dpd_query(self) -> pulumi.Output[Optional[str]]:
        """
        - Choices: `on-demand`, `periodic`
        """
        return pulumi.get(self, "dpd_query")

    @property
    @pulumi.getter(name="dpdRetryInterval")
    def dpd_retry_interval(self) -> pulumi.Output[Optional[int]]:
        """
        - Range: `2`-`60`
        """
        return pulumi.get(self, "dpd_retry_interval")

    @property
    @pulumi.getter(name="natKeepalive")
    def nat_keepalive(self) -> pulumi.Output[Optional[int]]:
        """
        Set NAT keepalive interval - Range: `5`-`3600`
        """
        return pulumi.get(self, "nat_keepalive")

