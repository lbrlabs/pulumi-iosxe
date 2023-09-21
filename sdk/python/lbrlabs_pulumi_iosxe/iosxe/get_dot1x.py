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

__all__ = [
    'GetDot1xResult',
    'AwaitableGetDot1xResult',
    'get_dot1x',
    'get_dot1x_output',
]

@pulumi.output_type
class GetDot1xResult:
    """
    A collection of values returned by getDot1x.
    """
    def __init__(__self__, auth_fail_eapol=None, credentials=None, critical_eapol_config_block=None, critical_recovery_delay=None, device=None, id=None, logging_verbose=None, supplicant_controlled_transient=None, supplicant_force_multicast=None, system_auth_control=None, test_timeout=None):
        if auth_fail_eapol and not isinstance(auth_fail_eapol, bool):
            raise TypeError("Expected argument 'auth_fail_eapol' to be a bool")
        pulumi.set(__self__, "auth_fail_eapol", auth_fail_eapol)
        if credentials and not isinstance(credentials, list):
            raise TypeError("Expected argument 'credentials' to be a list")
        pulumi.set(__self__, "credentials", credentials)
        if critical_eapol_config_block and not isinstance(critical_eapol_config_block, bool):
            raise TypeError("Expected argument 'critical_eapol_config_block' to be a bool")
        pulumi.set(__self__, "critical_eapol_config_block", critical_eapol_config_block)
        if critical_recovery_delay and not isinstance(critical_recovery_delay, int):
            raise TypeError("Expected argument 'critical_recovery_delay' to be a int")
        pulumi.set(__self__, "critical_recovery_delay", critical_recovery_delay)
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if logging_verbose and not isinstance(logging_verbose, bool):
            raise TypeError("Expected argument 'logging_verbose' to be a bool")
        pulumi.set(__self__, "logging_verbose", logging_verbose)
        if supplicant_controlled_transient and not isinstance(supplicant_controlled_transient, bool):
            raise TypeError("Expected argument 'supplicant_controlled_transient' to be a bool")
        pulumi.set(__self__, "supplicant_controlled_transient", supplicant_controlled_transient)
        if supplicant_force_multicast and not isinstance(supplicant_force_multicast, bool):
            raise TypeError("Expected argument 'supplicant_force_multicast' to be a bool")
        pulumi.set(__self__, "supplicant_force_multicast", supplicant_force_multicast)
        if system_auth_control and not isinstance(system_auth_control, bool):
            raise TypeError("Expected argument 'system_auth_control' to be a bool")
        pulumi.set(__self__, "system_auth_control", system_auth_control)
        if test_timeout and not isinstance(test_timeout, int):
            raise TypeError("Expected argument 'test_timeout' to be a int")
        pulumi.set(__self__, "test_timeout", test_timeout)

    @property
    @pulumi.getter(name="authFailEapol")
    def auth_fail_eapol(self) -> bool:
        return pulumi.get(self, "auth_fail_eapol")

    @property
    @pulumi.getter
    def credentials(self) -> Sequence['outputs.GetDot1xCredentialResult']:
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter(name="criticalEapolConfigBlock")
    def critical_eapol_config_block(self) -> bool:
        return pulumi.get(self, "critical_eapol_config_block")

    @property
    @pulumi.getter(name="criticalRecoveryDelay")
    def critical_recovery_delay(self) -> int:
        return pulumi.get(self, "critical_recovery_delay")

    @property
    @pulumi.getter
    def device(self) -> Optional[str]:
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="loggingVerbose")
    def logging_verbose(self) -> bool:
        return pulumi.get(self, "logging_verbose")

    @property
    @pulumi.getter(name="supplicantControlledTransient")
    def supplicant_controlled_transient(self) -> bool:
        return pulumi.get(self, "supplicant_controlled_transient")

    @property
    @pulumi.getter(name="supplicantForceMulticast")
    def supplicant_force_multicast(self) -> bool:
        return pulumi.get(self, "supplicant_force_multicast")

    @property
    @pulumi.getter(name="systemAuthControl")
    def system_auth_control(self) -> bool:
        return pulumi.get(self, "system_auth_control")

    @property
    @pulumi.getter(name="testTimeout")
    def test_timeout(self) -> int:
        return pulumi.get(self, "test_timeout")


class AwaitableGetDot1xResult(GetDot1xResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDot1xResult(
            auth_fail_eapol=self.auth_fail_eapol,
            credentials=self.credentials,
            critical_eapol_config_block=self.critical_eapol_config_block,
            critical_recovery_delay=self.critical_recovery_delay,
            device=self.device,
            id=self.id,
            logging_verbose=self.logging_verbose,
            supplicant_controlled_transient=self.supplicant_controlled_transient,
            supplicant_force_multicast=self.supplicant_force_multicast,
            system_auth_control=self.system_auth_control,
            test_timeout=self.test_timeout)


def get_dot1x(device: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDot1xResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['device'] = device
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:iosxe/getDot1x:getDot1x', __args__, opts=opts, typ=GetDot1xResult).value

    return AwaitableGetDot1xResult(
        auth_fail_eapol=pulumi.get(__ret__, 'auth_fail_eapol'),
        credentials=pulumi.get(__ret__, 'credentials'),
        critical_eapol_config_block=pulumi.get(__ret__, 'critical_eapol_config_block'),
        critical_recovery_delay=pulumi.get(__ret__, 'critical_recovery_delay'),
        device=pulumi.get(__ret__, 'device'),
        id=pulumi.get(__ret__, 'id'),
        logging_verbose=pulumi.get(__ret__, 'logging_verbose'),
        supplicant_controlled_transient=pulumi.get(__ret__, 'supplicant_controlled_transient'),
        supplicant_force_multicast=pulumi.get(__ret__, 'supplicant_force_multicast'),
        system_auth_control=pulumi.get(__ret__, 'system_auth_control'),
        test_timeout=pulumi.get(__ret__, 'test_timeout'))


@_utilities.lift_output_func(get_dot1x)
def get_dot1x_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDot1xResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...
