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

__all__ = ['CryptoIkev2PolicyArgs', 'CryptoIkev2Policy']

@pulumi.input_type
class CryptoIkev2PolicyArgs:
    def __init__(__self__, *,
                 proposals: pulumi.Input[Sequence[pulumi.Input['CryptoIkev2PolicyProposalArgs']]],
                 device: Optional[pulumi.Input[str]] = None,
                 match_address_local_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 match_fvrf: Optional[pulumi.Input[str]] = None,
                 match_fvrf_any: Optional[pulumi.Input[bool]] = None,
                 match_inbound_only: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a CryptoIkev2Policy resource.
        :param pulumi.Input[Sequence[pulumi.Input['CryptoIkev2PolicyProposalArgs']]] proposals: Specify Proposal
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] match_address_local_ips: Local address
        :param pulumi.Input[bool] match_fvrf_any: Any fvrf
        :param pulumi.Input[bool] match_inbound_only: inbound only for controller
        """
        pulumi.set(__self__, "proposals", proposals)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if match_address_local_ips is not None:
            pulumi.set(__self__, "match_address_local_ips", match_address_local_ips)
        if match_fvrf is not None:
            pulumi.set(__self__, "match_fvrf", match_fvrf)
        if match_fvrf_any is not None:
            pulumi.set(__self__, "match_fvrf_any", match_fvrf_any)
        if match_inbound_only is not None:
            pulumi.set(__self__, "match_inbound_only", match_inbound_only)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def proposals(self) -> pulumi.Input[Sequence[pulumi.Input['CryptoIkev2PolicyProposalArgs']]]:
        """
        Specify Proposal
        """
        return pulumi.get(self, "proposals")

    @proposals.setter
    def proposals(self, value: pulumi.Input[Sequence[pulumi.Input['CryptoIkev2PolicyProposalArgs']]]):
        pulumi.set(self, "proposals", value)

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
    @pulumi.getter(name="matchAddressLocalIps")
    def match_address_local_ips(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Local address
        """
        return pulumi.get(self, "match_address_local_ips")

    @match_address_local_ips.setter
    def match_address_local_ips(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "match_address_local_ips", value)

    @property
    @pulumi.getter(name="matchFvrf")
    def match_fvrf(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "match_fvrf")

    @match_fvrf.setter
    def match_fvrf(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "match_fvrf", value)

    @property
    @pulumi.getter(name="matchFvrfAny")
    def match_fvrf_any(self) -> Optional[pulumi.Input[bool]]:
        """
        Any fvrf
        """
        return pulumi.get(self, "match_fvrf_any")

    @match_fvrf_any.setter
    def match_fvrf_any(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "match_fvrf_any", value)

    @property
    @pulumi.getter(name="matchInboundOnly")
    def match_inbound_only(self) -> Optional[pulumi.Input[bool]]:
        """
        inbound only for controller
        """
        return pulumi.get(self, "match_inbound_only")

    @match_inbound_only.setter
    def match_inbound_only(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "match_inbound_only", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _CryptoIkev2PolicyState:
    def __init__(__self__, *,
                 device: Optional[pulumi.Input[str]] = None,
                 match_address_local_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 match_fvrf: Optional[pulumi.Input[str]] = None,
                 match_fvrf_any: Optional[pulumi.Input[bool]] = None,
                 match_inbound_only: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 proposals: Optional[pulumi.Input[Sequence[pulumi.Input['CryptoIkev2PolicyProposalArgs']]]] = None):
        """
        Input properties used for looking up and filtering CryptoIkev2Policy resources.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] match_address_local_ips: Local address
        :param pulumi.Input[bool] match_fvrf_any: Any fvrf
        :param pulumi.Input[bool] match_inbound_only: inbound only for controller
        :param pulumi.Input[Sequence[pulumi.Input['CryptoIkev2PolicyProposalArgs']]] proposals: Specify Proposal
        """
        if device is not None:
            pulumi.set(__self__, "device", device)
        if match_address_local_ips is not None:
            pulumi.set(__self__, "match_address_local_ips", match_address_local_ips)
        if match_fvrf is not None:
            pulumi.set(__self__, "match_fvrf", match_fvrf)
        if match_fvrf_any is not None:
            pulumi.set(__self__, "match_fvrf_any", match_fvrf_any)
        if match_inbound_only is not None:
            pulumi.set(__self__, "match_inbound_only", match_inbound_only)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if proposals is not None:
            pulumi.set(__self__, "proposals", proposals)

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
    @pulumi.getter(name="matchAddressLocalIps")
    def match_address_local_ips(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Local address
        """
        return pulumi.get(self, "match_address_local_ips")

    @match_address_local_ips.setter
    def match_address_local_ips(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "match_address_local_ips", value)

    @property
    @pulumi.getter(name="matchFvrf")
    def match_fvrf(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "match_fvrf")

    @match_fvrf.setter
    def match_fvrf(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "match_fvrf", value)

    @property
    @pulumi.getter(name="matchFvrfAny")
    def match_fvrf_any(self) -> Optional[pulumi.Input[bool]]:
        """
        Any fvrf
        """
        return pulumi.get(self, "match_fvrf_any")

    @match_fvrf_any.setter
    def match_fvrf_any(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "match_fvrf_any", value)

    @property
    @pulumi.getter(name="matchInboundOnly")
    def match_inbound_only(self) -> Optional[pulumi.Input[bool]]:
        """
        inbound only for controller
        """
        return pulumi.get(self, "match_inbound_only")

    @match_inbound_only.setter
    def match_inbound_only(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "match_inbound_only", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def proposals(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CryptoIkev2PolicyProposalArgs']]]]:
        """
        Specify Proposal
        """
        return pulumi.get(self, "proposals")

    @proposals.setter
    def proposals(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CryptoIkev2PolicyProposalArgs']]]]):
        pulumi.set(self, "proposals", value)


class CryptoIkev2Policy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 match_address_local_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 match_fvrf: Optional[pulumi.Input[str]] = None,
                 match_fvrf_any: Optional[pulumi.Input[bool]] = None,
                 match_inbound_only: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 proposals: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CryptoIkev2PolicyProposalArgs']]]]] = None,
                 __props__=None):
        """
        This resource can manage the Crypto IKEv2 Policy configuration.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_iosxe as iosxe

        example = iosxe.CryptoIkev2Policy("example",
            match_address_local_ips=["1.2.3.4"],
            match_fvrf_any=True,
            proposals=[iosxe.CryptoIkev2PolicyProposalArgs(
                proposals="proposal123",
            )])
        ```

        ## Import

        ```sh
         $ pulumi import iosxe:index/cryptoIkev2Policy:CryptoIkev2Policy example "Cisco-IOS-XE-native:native/crypto/Cisco-IOS-XE-crypto:ikev2/policy=policy1"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] match_address_local_ips: Local address
        :param pulumi.Input[bool] match_fvrf_any: Any fvrf
        :param pulumi.Input[bool] match_inbound_only: inbound only for controller
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CryptoIkev2PolicyProposalArgs']]]] proposals: Specify Proposal
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CryptoIkev2PolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage the Crypto IKEv2 Policy configuration.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_iosxe as iosxe

        example = iosxe.CryptoIkev2Policy("example",
            match_address_local_ips=["1.2.3.4"],
            match_fvrf_any=True,
            proposals=[iosxe.CryptoIkev2PolicyProposalArgs(
                proposals="proposal123",
            )])
        ```

        ## Import

        ```sh
         $ pulumi import iosxe:index/cryptoIkev2Policy:CryptoIkev2Policy example "Cisco-IOS-XE-native:native/crypto/Cisco-IOS-XE-crypto:ikev2/policy=policy1"
        ```

        :param str resource_name: The name of the resource.
        :param CryptoIkev2PolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CryptoIkev2PolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 match_address_local_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 match_fvrf: Optional[pulumi.Input[str]] = None,
                 match_fvrf_any: Optional[pulumi.Input[bool]] = None,
                 match_inbound_only: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 proposals: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CryptoIkev2PolicyProposalArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CryptoIkev2PolicyArgs.__new__(CryptoIkev2PolicyArgs)

            __props__.__dict__["device"] = device
            __props__.__dict__["match_address_local_ips"] = match_address_local_ips
            __props__.__dict__["match_fvrf"] = match_fvrf
            __props__.__dict__["match_fvrf_any"] = match_fvrf_any
            __props__.__dict__["match_inbound_only"] = match_inbound_only
            __props__.__dict__["name"] = name
            if proposals is None and not opts.urn:
                raise TypeError("Missing required property 'proposals'")
            __props__.__dict__["proposals"] = proposals
        super(CryptoIkev2Policy, __self__).__init__(
            'iosxe:index/cryptoIkev2Policy:CryptoIkev2Policy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            device: Optional[pulumi.Input[str]] = None,
            match_address_local_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            match_fvrf: Optional[pulumi.Input[str]] = None,
            match_fvrf_any: Optional[pulumi.Input[bool]] = None,
            match_inbound_only: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            proposals: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CryptoIkev2PolicyProposalArgs']]]]] = None) -> 'CryptoIkev2Policy':
        """
        Get an existing CryptoIkev2Policy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] match_address_local_ips: Local address
        :param pulumi.Input[bool] match_fvrf_any: Any fvrf
        :param pulumi.Input[bool] match_inbound_only: inbound only for controller
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CryptoIkev2PolicyProposalArgs']]]] proposals: Specify Proposal
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CryptoIkev2PolicyState.__new__(_CryptoIkev2PolicyState)

        __props__.__dict__["device"] = device
        __props__.__dict__["match_address_local_ips"] = match_address_local_ips
        __props__.__dict__["match_fvrf"] = match_fvrf
        __props__.__dict__["match_fvrf_any"] = match_fvrf_any
        __props__.__dict__["match_inbound_only"] = match_inbound_only
        __props__.__dict__["name"] = name
        __props__.__dict__["proposals"] = proposals
        return CryptoIkev2Policy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def device(self) -> pulumi.Output[Optional[str]]:
        """
        A device name from the provider configuration.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter(name="matchAddressLocalIps")
    def match_address_local_ips(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Local address
        """
        return pulumi.get(self, "match_address_local_ips")

    @property
    @pulumi.getter(name="matchFvrf")
    def match_fvrf(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "match_fvrf")

    @property
    @pulumi.getter(name="matchFvrfAny")
    def match_fvrf_any(self) -> pulumi.Output[Optional[bool]]:
        """
        Any fvrf
        """
        return pulumi.get(self, "match_fvrf_any")

    @property
    @pulumi.getter(name="matchInboundOnly")
    def match_inbound_only(self) -> pulumi.Output[Optional[bool]]:
        """
        inbound only for controller
        """
        return pulumi.get(self, "match_inbound_only")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def proposals(self) -> pulumi.Output[Sequence['outputs.CryptoIkev2PolicyProposal']]:
        """
        Specify Proposal
        """
        return pulumi.get(self, "proposals")
