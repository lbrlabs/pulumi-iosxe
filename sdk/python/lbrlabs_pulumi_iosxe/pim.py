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

__all__ = ['PimArgs', 'Pim']

@pulumi.input_type
class PimArgs:
    def __init__(__self__, *,
                 autorp: Optional[pulumi.Input[bool]] = None,
                 autorp_listener: Optional[pulumi.Input[bool]] = None,
                 bsr_candidate_accept_rp_candidate: Optional[pulumi.Input[str]] = None,
                 bsr_candidate_loopback: Optional[pulumi.Input[int]] = None,
                 bsr_candidate_mask: Optional[pulumi.Input[int]] = None,
                 bsr_candidate_priority: Optional[pulumi.Input[int]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 rp_address: Optional[pulumi.Input[str]] = None,
                 rp_address_bidir: Optional[pulumi.Input[bool]] = None,
                 rp_address_override: Optional[pulumi.Input[bool]] = None,
                 rp_addresses: Optional[pulumi.Input[Sequence[pulumi.Input['PimRpAddressArgs']]]] = None,
                 rp_candidates: Optional[pulumi.Input[Sequence[pulumi.Input['PimRpCandidateArgs']]]] = None,
                 ssm_default: Optional[pulumi.Input[bool]] = None,
                 ssm_range: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Pim resource.
        :param pulumi.Input[bool] autorp: Configure AutoRP global operations
        :param pulumi.Input[bool] autorp_listener: Allow AutoRP packets across sparse mode interface
        :param pulumi.Input[str] bsr_candidate_accept_rp_candidate: BSR RP candidate filter
        :param pulumi.Input[int] bsr_candidate_loopback: Loopback interface - Range: `0`-`2147483647`
        :param pulumi.Input[int] bsr_candidate_mask: Hash Mask length for RP selection - Range: `0`-`32`
        :param pulumi.Input[int] bsr_candidate_priority: Priority value for candidate bootstrap router - Range: `0`-`255`
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] rp_address: IP address of Rendezvous-point for group
        :param pulumi.Input[bool] rp_address_bidir: Group range treated in bidirectional shared-tree mode
        :param pulumi.Input[bool] rp_address_override: Overrides dynamically learnt RP mappings
        :param pulumi.Input[Sequence[pulumi.Input['PimRpAddressArgs']]] rp_addresses: PIM RP-address (Rendezvous Point)
        :param pulumi.Input[Sequence[pulumi.Input['PimRpCandidateArgs']]] rp_candidates: To be a PIM version 2 RP candidate
        :param pulumi.Input[bool] ssm_default: Use 232/8 group range for SSM
        :param pulumi.Input[str] ssm_range: ACL for group range to be used for SSM
        """
        if autorp is not None:
            pulumi.set(__self__, "autorp", autorp)
        if autorp_listener is not None:
            pulumi.set(__self__, "autorp_listener", autorp_listener)
        if bsr_candidate_accept_rp_candidate is not None:
            pulumi.set(__self__, "bsr_candidate_accept_rp_candidate", bsr_candidate_accept_rp_candidate)
        if bsr_candidate_loopback is not None:
            pulumi.set(__self__, "bsr_candidate_loopback", bsr_candidate_loopback)
        if bsr_candidate_mask is not None:
            pulumi.set(__self__, "bsr_candidate_mask", bsr_candidate_mask)
        if bsr_candidate_priority is not None:
            pulumi.set(__self__, "bsr_candidate_priority", bsr_candidate_priority)
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if rp_address is not None:
            pulumi.set(__self__, "rp_address", rp_address)
        if rp_address_bidir is not None:
            pulumi.set(__self__, "rp_address_bidir", rp_address_bidir)
        if rp_address_override is not None:
            pulumi.set(__self__, "rp_address_override", rp_address_override)
        if rp_addresses is not None:
            pulumi.set(__self__, "rp_addresses", rp_addresses)
        if rp_candidates is not None:
            pulumi.set(__self__, "rp_candidates", rp_candidates)
        if ssm_default is not None:
            pulumi.set(__self__, "ssm_default", ssm_default)
        if ssm_range is not None:
            pulumi.set(__self__, "ssm_range", ssm_range)

    @property
    @pulumi.getter
    def autorp(self) -> Optional[pulumi.Input[bool]]:
        """
        Configure AutoRP global operations
        """
        return pulumi.get(self, "autorp")

    @autorp.setter
    def autorp(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "autorp", value)

    @property
    @pulumi.getter(name="autorpListener")
    def autorp_listener(self) -> Optional[pulumi.Input[bool]]:
        """
        Allow AutoRP packets across sparse mode interface
        """
        return pulumi.get(self, "autorp_listener")

    @autorp_listener.setter
    def autorp_listener(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "autorp_listener", value)

    @property
    @pulumi.getter(name="bsrCandidateAcceptRpCandidate")
    def bsr_candidate_accept_rp_candidate(self) -> Optional[pulumi.Input[str]]:
        """
        BSR RP candidate filter
        """
        return pulumi.get(self, "bsr_candidate_accept_rp_candidate")

    @bsr_candidate_accept_rp_candidate.setter
    def bsr_candidate_accept_rp_candidate(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bsr_candidate_accept_rp_candidate", value)

    @property
    @pulumi.getter(name="bsrCandidateLoopback")
    def bsr_candidate_loopback(self) -> Optional[pulumi.Input[int]]:
        """
        Loopback interface - Range: `0`-`2147483647`
        """
        return pulumi.get(self, "bsr_candidate_loopback")

    @bsr_candidate_loopback.setter
    def bsr_candidate_loopback(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "bsr_candidate_loopback", value)

    @property
    @pulumi.getter(name="bsrCandidateMask")
    def bsr_candidate_mask(self) -> Optional[pulumi.Input[int]]:
        """
        Hash Mask length for RP selection - Range: `0`-`32`
        """
        return pulumi.get(self, "bsr_candidate_mask")

    @bsr_candidate_mask.setter
    def bsr_candidate_mask(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "bsr_candidate_mask", value)

    @property
    @pulumi.getter(name="bsrCandidatePriority")
    def bsr_candidate_priority(self) -> Optional[pulumi.Input[int]]:
        """
        Priority value for candidate bootstrap router - Range: `0`-`255`
        """
        return pulumi.get(self, "bsr_candidate_priority")

    @bsr_candidate_priority.setter
    def bsr_candidate_priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "bsr_candidate_priority", value)

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
    @pulumi.getter(name="rpAddress")
    def rp_address(self) -> Optional[pulumi.Input[str]]:
        """
        IP address of Rendezvous-point for group
        """
        return pulumi.get(self, "rp_address")

    @rp_address.setter
    def rp_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rp_address", value)

    @property
    @pulumi.getter(name="rpAddressBidir")
    def rp_address_bidir(self) -> Optional[pulumi.Input[bool]]:
        """
        Group range treated in bidirectional shared-tree mode
        """
        return pulumi.get(self, "rp_address_bidir")

    @rp_address_bidir.setter
    def rp_address_bidir(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "rp_address_bidir", value)

    @property
    @pulumi.getter(name="rpAddressOverride")
    def rp_address_override(self) -> Optional[pulumi.Input[bool]]:
        """
        Overrides dynamically learnt RP mappings
        """
        return pulumi.get(self, "rp_address_override")

    @rp_address_override.setter
    def rp_address_override(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "rp_address_override", value)

    @property
    @pulumi.getter(name="rpAddresses")
    def rp_addresses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PimRpAddressArgs']]]]:
        """
        PIM RP-address (Rendezvous Point)
        """
        return pulumi.get(self, "rp_addresses")

    @rp_addresses.setter
    def rp_addresses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PimRpAddressArgs']]]]):
        pulumi.set(self, "rp_addresses", value)

    @property
    @pulumi.getter(name="rpCandidates")
    def rp_candidates(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PimRpCandidateArgs']]]]:
        """
        To be a PIM version 2 RP candidate
        """
        return pulumi.get(self, "rp_candidates")

    @rp_candidates.setter
    def rp_candidates(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PimRpCandidateArgs']]]]):
        pulumi.set(self, "rp_candidates", value)

    @property
    @pulumi.getter(name="ssmDefault")
    def ssm_default(self) -> Optional[pulumi.Input[bool]]:
        """
        Use 232/8 group range for SSM
        """
        return pulumi.get(self, "ssm_default")

    @ssm_default.setter
    def ssm_default(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ssm_default", value)

    @property
    @pulumi.getter(name="ssmRange")
    def ssm_range(self) -> Optional[pulumi.Input[str]]:
        """
        ACL for group range to be used for SSM
        """
        return pulumi.get(self, "ssm_range")

    @ssm_range.setter
    def ssm_range(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ssm_range", value)


@pulumi.input_type
class _PimState:
    def __init__(__self__, *,
                 autorp: Optional[pulumi.Input[bool]] = None,
                 autorp_listener: Optional[pulumi.Input[bool]] = None,
                 bsr_candidate_accept_rp_candidate: Optional[pulumi.Input[str]] = None,
                 bsr_candidate_loopback: Optional[pulumi.Input[int]] = None,
                 bsr_candidate_mask: Optional[pulumi.Input[int]] = None,
                 bsr_candidate_priority: Optional[pulumi.Input[int]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 rp_address: Optional[pulumi.Input[str]] = None,
                 rp_address_bidir: Optional[pulumi.Input[bool]] = None,
                 rp_address_override: Optional[pulumi.Input[bool]] = None,
                 rp_addresses: Optional[pulumi.Input[Sequence[pulumi.Input['PimRpAddressArgs']]]] = None,
                 rp_candidates: Optional[pulumi.Input[Sequence[pulumi.Input['PimRpCandidateArgs']]]] = None,
                 ssm_default: Optional[pulumi.Input[bool]] = None,
                 ssm_range: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Pim resources.
        :param pulumi.Input[bool] autorp: Configure AutoRP global operations
        :param pulumi.Input[bool] autorp_listener: Allow AutoRP packets across sparse mode interface
        :param pulumi.Input[str] bsr_candidate_accept_rp_candidate: BSR RP candidate filter
        :param pulumi.Input[int] bsr_candidate_loopback: Loopback interface - Range: `0`-`2147483647`
        :param pulumi.Input[int] bsr_candidate_mask: Hash Mask length for RP selection - Range: `0`-`32`
        :param pulumi.Input[int] bsr_candidate_priority: Priority value for candidate bootstrap router - Range: `0`-`255`
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] rp_address: IP address of Rendezvous-point for group
        :param pulumi.Input[bool] rp_address_bidir: Group range treated in bidirectional shared-tree mode
        :param pulumi.Input[bool] rp_address_override: Overrides dynamically learnt RP mappings
        :param pulumi.Input[Sequence[pulumi.Input['PimRpAddressArgs']]] rp_addresses: PIM RP-address (Rendezvous Point)
        :param pulumi.Input[Sequence[pulumi.Input['PimRpCandidateArgs']]] rp_candidates: To be a PIM version 2 RP candidate
        :param pulumi.Input[bool] ssm_default: Use 232/8 group range for SSM
        :param pulumi.Input[str] ssm_range: ACL for group range to be used for SSM
        """
        if autorp is not None:
            pulumi.set(__self__, "autorp", autorp)
        if autorp_listener is not None:
            pulumi.set(__self__, "autorp_listener", autorp_listener)
        if bsr_candidate_accept_rp_candidate is not None:
            pulumi.set(__self__, "bsr_candidate_accept_rp_candidate", bsr_candidate_accept_rp_candidate)
        if bsr_candidate_loopback is not None:
            pulumi.set(__self__, "bsr_candidate_loopback", bsr_candidate_loopback)
        if bsr_candidate_mask is not None:
            pulumi.set(__self__, "bsr_candidate_mask", bsr_candidate_mask)
        if bsr_candidate_priority is not None:
            pulumi.set(__self__, "bsr_candidate_priority", bsr_candidate_priority)
        if delete_mode is not None:
            pulumi.set(__self__, "delete_mode", delete_mode)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if rp_address is not None:
            pulumi.set(__self__, "rp_address", rp_address)
        if rp_address_bidir is not None:
            pulumi.set(__self__, "rp_address_bidir", rp_address_bidir)
        if rp_address_override is not None:
            pulumi.set(__self__, "rp_address_override", rp_address_override)
        if rp_addresses is not None:
            pulumi.set(__self__, "rp_addresses", rp_addresses)
        if rp_candidates is not None:
            pulumi.set(__self__, "rp_candidates", rp_candidates)
        if ssm_default is not None:
            pulumi.set(__self__, "ssm_default", ssm_default)
        if ssm_range is not None:
            pulumi.set(__self__, "ssm_range", ssm_range)

    @property
    @pulumi.getter
    def autorp(self) -> Optional[pulumi.Input[bool]]:
        """
        Configure AutoRP global operations
        """
        return pulumi.get(self, "autorp")

    @autorp.setter
    def autorp(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "autorp", value)

    @property
    @pulumi.getter(name="autorpListener")
    def autorp_listener(self) -> Optional[pulumi.Input[bool]]:
        """
        Allow AutoRP packets across sparse mode interface
        """
        return pulumi.get(self, "autorp_listener")

    @autorp_listener.setter
    def autorp_listener(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "autorp_listener", value)

    @property
    @pulumi.getter(name="bsrCandidateAcceptRpCandidate")
    def bsr_candidate_accept_rp_candidate(self) -> Optional[pulumi.Input[str]]:
        """
        BSR RP candidate filter
        """
        return pulumi.get(self, "bsr_candidate_accept_rp_candidate")

    @bsr_candidate_accept_rp_candidate.setter
    def bsr_candidate_accept_rp_candidate(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bsr_candidate_accept_rp_candidate", value)

    @property
    @pulumi.getter(name="bsrCandidateLoopback")
    def bsr_candidate_loopback(self) -> Optional[pulumi.Input[int]]:
        """
        Loopback interface - Range: `0`-`2147483647`
        """
        return pulumi.get(self, "bsr_candidate_loopback")

    @bsr_candidate_loopback.setter
    def bsr_candidate_loopback(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "bsr_candidate_loopback", value)

    @property
    @pulumi.getter(name="bsrCandidateMask")
    def bsr_candidate_mask(self) -> Optional[pulumi.Input[int]]:
        """
        Hash Mask length for RP selection - Range: `0`-`32`
        """
        return pulumi.get(self, "bsr_candidate_mask")

    @bsr_candidate_mask.setter
    def bsr_candidate_mask(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "bsr_candidate_mask", value)

    @property
    @pulumi.getter(name="bsrCandidatePriority")
    def bsr_candidate_priority(self) -> Optional[pulumi.Input[int]]:
        """
        Priority value for candidate bootstrap router - Range: `0`-`255`
        """
        return pulumi.get(self, "bsr_candidate_priority")

    @bsr_candidate_priority.setter
    def bsr_candidate_priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "bsr_candidate_priority", value)

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
    @pulumi.getter(name="rpAddress")
    def rp_address(self) -> Optional[pulumi.Input[str]]:
        """
        IP address of Rendezvous-point for group
        """
        return pulumi.get(self, "rp_address")

    @rp_address.setter
    def rp_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rp_address", value)

    @property
    @pulumi.getter(name="rpAddressBidir")
    def rp_address_bidir(self) -> Optional[pulumi.Input[bool]]:
        """
        Group range treated in bidirectional shared-tree mode
        """
        return pulumi.get(self, "rp_address_bidir")

    @rp_address_bidir.setter
    def rp_address_bidir(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "rp_address_bidir", value)

    @property
    @pulumi.getter(name="rpAddressOverride")
    def rp_address_override(self) -> Optional[pulumi.Input[bool]]:
        """
        Overrides dynamically learnt RP mappings
        """
        return pulumi.get(self, "rp_address_override")

    @rp_address_override.setter
    def rp_address_override(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "rp_address_override", value)

    @property
    @pulumi.getter(name="rpAddresses")
    def rp_addresses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PimRpAddressArgs']]]]:
        """
        PIM RP-address (Rendezvous Point)
        """
        return pulumi.get(self, "rp_addresses")

    @rp_addresses.setter
    def rp_addresses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PimRpAddressArgs']]]]):
        pulumi.set(self, "rp_addresses", value)

    @property
    @pulumi.getter(name="rpCandidates")
    def rp_candidates(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PimRpCandidateArgs']]]]:
        """
        To be a PIM version 2 RP candidate
        """
        return pulumi.get(self, "rp_candidates")

    @rp_candidates.setter
    def rp_candidates(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PimRpCandidateArgs']]]]):
        pulumi.set(self, "rp_candidates", value)

    @property
    @pulumi.getter(name="ssmDefault")
    def ssm_default(self) -> Optional[pulumi.Input[bool]]:
        """
        Use 232/8 group range for SSM
        """
        return pulumi.get(self, "ssm_default")

    @ssm_default.setter
    def ssm_default(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ssm_default", value)

    @property
    @pulumi.getter(name="ssmRange")
    def ssm_range(self) -> Optional[pulumi.Input[str]]:
        """
        ACL for group range to be used for SSM
        """
        return pulumi.get(self, "ssm_range")

    @ssm_range.setter
    def ssm_range(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ssm_range", value)


class Pim(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 autorp: Optional[pulumi.Input[bool]] = None,
                 autorp_listener: Optional[pulumi.Input[bool]] = None,
                 bsr_candidate_accept_rp_candidate: Optional[pulumi.Input[str]] = None,
                 bsr_candidate_loopback: Optional[pulumi.Input[int]] = None,
                 bsr_candidate_mask: Optional[pulumi.Input[int]] = None,
                 bsr_candidate_priority: Optional[pulumi.Input[int]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 rp_address: Optional[pulumi.Input[str]] = None,
                 rp_address_bidir: Optional[pulumi.Input[bool]] = None,
                 rp_address_override: Optional[pulumi.Input[bool]] = None,
                 rp_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PimRpAddressArgs']]]]] = None,
                 rp_candidates: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PimRpCandidateArgs']]]]] = None,
                 ssm_default: Optional[pulumi.Input[bool]] = None,
                 ssm_range: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource can manage the PIM configuration.

        ## Import

        ```sh
         $ pulumi import iosxe:index/pim:Pim example "Cisco-IOS-XE-native:native/ip/pim"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] autorp: Configure AutoRP global operations
        :param pulumi.Input[bool] autorp_listener: Allow AutoRP packets across sparse mode interface
        :param pulumi.Input[str] bsr_candidate_accept_rp_candidate: BSR RP candidate filter
        :param pulumi.Input[int] bsr_candidate_loopback: Loopback interface - Range: `0`-`2147483647`
        :param pulumi.Input[int] bsr_candidate_mask: Hash Mask length for RP selection - Range: `0`-`32`
        :param pulumi.Input[int] bsr_candidate_priority: Priority value for candidate bootstrap router - Range: `0`-`255`
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] rp_address: IP address of Rendezvous-point for group
        :param pulumi.Input[bool] rp_address_bidir: Group range treated in bidirectional shared-tree mode
        :param pulumi.Input[bool] rp_address_override: Overrides dynamically learnt RP mappings
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PimRpAddressArgs']]]] rp_addresses: PIM RP-address (Rendezvous Point)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PimRpCandidateArgs']]]] rp_candidates: To be a PIM version 2 RP candidate
        :param pulumi.Input[bool] ssm_default: Use 232/8 group range for SSM
        :param pulumi.Input[str] ssm_range: ACL for group range to be used for SSM
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[PimArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage the PIM configuration.

        ## Import

        ```sh
         $ pulumi import iosxe:index/pim:Pim example "Cisco-IOS-XE-native:native/ip/pim"
        ```

        :param str resource_name: The name of the resource.
        :param PimArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PimArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 autorp: Optional[pulumi.Input[bool]] = None,
                 autorp_listener: Optional[pulumi.Input[bool]] = None,
                 bsr_candidate_accept_rp_candidate: Optional[pulumi.Input[str]] = None,
                 bsr_candidate_loopback: Optional[pulumi.Input[int]] = None,
                 bsr_candidate_mask: Optional[pulumi.Input[int]] = None,
                 bsr_candidate_priority: Optional[pulumi.Input[int]] = None,
                 delete_mode: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 rp_address: Optional[pulumi.Input[str]] = None,
                 rp_address_bidir: Optional[pulumi.Input[bool]] = None,
                 rp_address_override: Optional[pulumi.Input[bool]] = None,
                 rp_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PimRpAddressArgs']]]]] = None,
                 rp_candidates: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PimRpCandidateArgs']]]]] = None,
                 ssm_default: Optional[pulumi.Input[bool]] = None,
                 ssm_range: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PimArgs.__new__(PimArgs)

            __props__.__dict__["autorp"] = autorp
            __props__.__dict__["autorp_listener"] = autorp_listener
            __props__.__dict__["bsr_candidate_accept_rp_candidate"] = bsr_candidate_accept_rp_candidate
            __props__.__dict__["bsr_candidate_loopback"] = bsr_candidate_loopback
            __props__.__dict__["bsr_candidate_mask"] = bsr_candidate_mask
            __props__.__dict__["bsr_candidate_priority"] = bsr_candidate_priority
            __props__.__dict__["delete_mode"] = delete_mode
            __props__.__dict__["device"] = device
            __props__.__dict__["rp_address"] = rp_address
            __props__.__dict__["rp_address_bidir"] = rp_address_bidir
            __props__.__dict__["rp_address_override"] = rp_address_override
            __props__.__dict__["rp_addresses"] = rp_addresses
            __props__.__dict__["rp_candidates"] = rp_candidates
            __props__.__dict__["ssm_default"] = ssm_default
            __props__.__dict__["ssm_range"] = ssm_range
        super(Pim, __self__).__init__(
            'iosxe:index/pim:Pim',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            autorp: Optional[pulumi.Input[bool]] = None,
            autorp_listener: Optional[pulumi.Input[bool]] = None,
            bsr_candidate_accept_rp_candidate: Optional[pulumi.Input[str]] = None,
            bsr_candidate_loopback: Optional[pulumi.Input[int]] = None,
            bsr_candidate_mask: Optional[pulumi.Input[int]] = None,
            bsr_candidate_priority: Optional[pulumi.Input[int]] = None,
            delete_mode: Optional[pulumi.Input[str]] = None,
            device: Optional[pulumi.Input[str]] = None,
            rp_address: Optional[pulumi.Input[str]] = None,
            rp_address_bidir: Optional[pulumi.Input[bool]] = None,
            rp_address_override: Optional[pulumi.Input[bool]] = None,
            rp_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PimRpAddressArgs']]]]] = None,
            rp_candidates: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PimRpCandidateArgs']]]]] = None,
            ssm_default: Optional[pulumi.Input[bool]] = None,
            ssm_range: Optional[pulumi.Input[str]] = None) -> 'Pim':
        """
        Get an existing Pim resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] autorp: Configure AutoRP global operations
        :param pulumi.Input[bool] autorp_listener: Allow AutoRP packets across sparse mode interface
        :param pulumi.Input[str] bsr_candidate_accept_rp_candidate: BSR RP candidate filter
        :param pulumi.Input[int] bsr_candidate_loopback: Loopback interface - Range: `0`-`2147483647`
        :param pulumi.Input[int] bsr_candidate_mask: Hash Mask length for RP selection - Range: `0`-`32`
        :param pulumi.Input[int] bsr_candidate_priority: Priority value for candidate bootstrap router - Range: `0`-`255`
        :param pulumi.Input[str] delete_mode: Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
               managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
               Default value is `all`. - Choices: `all`, `attributes`
        :param pulumi.Input[str] device: A device name from the provider configuration.
        :param pulumi.Input[str] rp_address: IP address of Rendezvous-point for group
        :param pulumi.Input[bool] rp_address_bidir: Group range treated in bidirectional shared-tree mode
        :param pulumi.Input[bool] rp_address_override: Overrides dynamically learnt RP mappings
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PimRpAddressArgs']]]] rp_addresses: PIM RP-address (Rendezvous Point)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PimRpCandidateArgs']]]] rp_candidates: To be a PIM version 2 RP candidate
        :param pulumi.Input[bool] ssm_default: Use 232/8 group range for SSM
        :param pulumi.Input[str] ssm_range: ACL for group range to be used for SSM
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PimState.__new__(_PimState)

        __props__.__dict__["autorp"] = autorp
        __props__.__dict__["autorp_listener"] = autorp_listener
        __props__.__dict__["bsr_candidate_accept_rp_candidate"] = bsr_candidate_accept_rp_candidate
        __props__.__dict__["bsr_candidate_loopback"] = bsr_candidate_loopback
        __props__.__dict__["bsr_candidate_mask"] = bsr_candidate_mask
        __props__.__dict__["bsr_candidate_priority"] = bsr_candidate_priority
        __props__.__dict__["delete_mode"] = delete_mode
        __props__.__dict__["device"] = device
        __props__.__dict__["rp_address"] = rp_address
        __props__.__dict__["rp_address_bidir"] = rp_address_bidir
        __props__.__dict__["rp_address_override"] = rp_address_override
        __props__.__dict__["rp_addresses"] = rp_addresses
        __props__.__dict__["rp_candidates"] = rp_candidates
        __props__.__dict__["ssm_default"] = ssm_default
        __props__.__dict__["ssm_range"] = ssm_range
        return Pim(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def autorp(self) -> pulumi.Output[Optional[bool]]:
        """
        Configure AutoRP global operations
        """
        return pulumi.get(self, "autorp")

    @property
    @pulumi.getter(name="autorpListener")
    def autorp_listener(self) -> pulumi.Output[Optional[bool]]:
        """
        Allow AutoRP packets across sparse mode interface
        """
        return pulumi.get(self, "autorp_listener")

    @property
    @pulumi.getter(name="bsrCandidateAcceptRpCandidate")
    def bsr_candidate_accept_rp_candidate(self) -> pulumi.Output[Optional[str]]:
        """
        BSR RP candidate filter
        """
        return pulumi.get(self, "bsr_candidate_accept_rp_candidate")

    @property
    @pulumi.getter(name="bsrCandidateLoopback")
    def bsr_candidate_loopback(self) -> pulumi.Output[Optional[int]]:
        """
        Loopback interface - Range: `0`-`2147483647`
        """
        return pulumi.get(self, "bsr_candidate_loopback")

    @property
    @pulumi.getter(name="bsrCandidateMask")
    def bsr_candidate_mask(self) -> pulumi.Output[Optional[int]]:
        """
        Hash Mask length for RP selection - Range: `0`-`32`
        """
        return pulumi.get(self, "bsr_candidate_mask")

    @property
    @pulumi.getter(name="bsrCandidatePriority")
    def bsr_candidate_priority(self) -> pulumi.Output[Optional[int]]:
        """
        Priority value for candidate bootstrap router - Range: `0`-`255`
        """
        return pulumi.get(self, "bsr_candidate_priority")

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
    @pulumi.getter(name="rpAddress")
    def rp_address(self) -> pulumi.Output[Optional[str]]:
        """
        IP address of Rendezvous-point for group
        """
        return pulumi.get(self, "rp_address")

    @property
    @pulumi.getter(name="rpAddressBidir")
    def rp_address_bidir(self) -> pulumi.Output[Optional[bool]]:
        """
        Group range treated in bidirectional shared-tree mode
        """
        return pulumi.get(self, "rp_address_bidir")

    @property
    @pulumi.getter(name="rpAddressOverride")
    def rp_address_override(self) -> pulumi.Output[Optional[bool]]:
        """
        Overrides dynamically learnt RP mappings
        """
        return pulumi.get(self, "rp_address_override")

    @property
    @pulumi.getter(name="rpAddresses")
    def rp_addresses(self) -> pulumi.Output[Optional[Sequence['outputs.PimRpAddress']]]:
        """
        PIM RP-address (Rendezvous Point)
        """
        return pulumi.get(self, "rp_addresses")

    @property
    @pulumi.getter(name="rpCandidates")
    def rp_candidates(self) -> pulumi.Output[Optional[Sequence['outputs.PimRpCandidate']]]:
        """
        To be a PIM version 2 RP candidate
        """
        return pulumi.get(self, "rp_candidates")

    @property
    @pulumi.getter(name="ssmDefault")
    def ssm_default(self) -> pulumi.Output[Optional[bool]]:
        """
        Use 232/8 group range for SSM
        """
        return pulumi.get(self, "ssm_default")

    @property
    @pulumi.getter(name="ssmRange")
    def ssm_range(self) -> pulumi.Output[Optional[str]]:
        """
        ACL for group range to be used for SSM
        """
        return pulumi.get(self, "ssm_range")
