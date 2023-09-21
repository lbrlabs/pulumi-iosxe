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
    'GetVrfResult',
    'AwaitableGetVrfResult',
    'get_vrf',
    'get_vrf_output',
]

@pulumi.output_type
class GetVrfResult:
    """
    A collection of values returned by getVrf.
    """
    def __init__(__self__, address_family_ipv4=None, address_family_ipv6=None, description=None, device=None, id=None, ipv4_route_target_export_stitchings=None, ipv4_route_target_exports=None, ipv4_route_target_import_stitchings=None, ipv4_route_target_imports=None, ipv6_route_target_export_stitchings=None, ipv6_route_target_exports=None, ipv6_route_target_import_stitchings=None, ipv6_route_target_imports=None, name=None, rd=None, route_target_exports=None, route_target_imports=None, vpn_id=None):
        if address_family_ipv4 and not isinstance(address_family_ipv4, bool):
            raise TypeError("Expected argument 'address_family_ipv4' to be a bool")
        pulumi.set(__self__, "address_family_ipv4", address_family_ipv4)
        if address_family_ipv6 and not isinstance(address_family_ipv6, bool):
            raise TypeError("Expected argument 'address_family_ipv6' to be a bool")
        pulumi.set(__self__, "address_family_ipv6", address_family_ipv6)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ipv4_route_target_export_stitchings and not isinstance(ipv4_route_target_export_stitchings, list):
            raise TypeError("Expected argument 'ipv4_route_target_export_stitchings' to be a list")
        pulumi.set(__self__, "ipv4_route_target_export_stitchings", ipv4_route_target_export_stitchings)
        if ipv4_route_target_exports and not isinstance(ipv4_route_target_exports, list):
            raise TypeError("Expected argument 'ipv4_route_target_exports' to be a list")
        pulumi.set(__self__, "ipv4_route_target_exports", ipv4_route_target_exports)
        if ipv4_route_target_import_stitchings and not isinstance(ipv4_route_target_import_stitchings, list):
            raise TypeError("Expected argument 'ipv4_route_target_import_stitchings' to be a list")
        pulumi.set(__self__, "ipv4_route_target_import_stitchings", ipv4_route_target_import_stitchings)
        if ipv4_route_target_imports and not isinstance(ipv4_route_target_imports, list):
            raise TypeError("Expected argument 'ipv4_route_target_imports' to be a list")
        pulumi.set(__self__, "ipv4_route_target_imports", ipv4_route_target_imports)
        if ipv6_route_target_export_stitchings and not isinstance(ipv6_route_target_export_stitchings, list):
            raise TypeError("Expected argument 'ipv6_route_target_export_stitchings' to be a list")
        pulumi.set(__self__, "ipv6_route_target_export_stitchings", ipv6_route_target_export_stitchings)
        if ipv6_route_target_exports and not isinstance(ipv6_route_target_exports, list):
            raise TypeError("Expected argument 'ipv6_route_target_exports' to be a list")
        pulumi.set(__self__, "ipv6_route_target_exports", ipv6_route_target_exports)
        if ipv6_route_target_import_stitchings and not isinstance(ipv6_route_target_import_stitchings, list):
            raise TypeError("Expected argument 'ipv6_route_target_import_stitchings' to be a list")
        pulumi.set(__self__, "ipv6_route_target_import_stitchings", ipv6_route_target_import_stitchings)
        if ipv6_route_target_imports and not isinstance(ipv6_route_target_imports, list):
            raise TypeError("Expected argument 'ipv6_route_target_imports' to be a list")
        pulumi.set(__self__, "ipv6_route_target_imports", ipv6_route_target_imports)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if rd and not isinstance(rd, str):
            raise TypeError("Expected argument 'rd' to be a str")
        pulumi.set(__self__, "rd", rd)
        if route_target_exports and not isinstance(route_target_exports, list):
            raise TypeError("Expected argument 'route_target_exports' to be a list")
        pulumi.set(__self__, "route_target_exports", route_target_exports)
        if route_target_imports and not isinstance(route_target_imports, list):
            raise TypeError("Expected argument 'route_target_imports' to be a list")
        pulumi.set(__self__, "route_target_imports", route_target_imports)
        if vpn_id and not isinstance(vpn_id, str):
            raise TypeError("Expected argument 'vpn_id' to be a str")
        pulumi.set(__self__, "vpn_id", vpn_id)

    @property
    @pulumi.getter(name="addressFamilyIpv4")
    def address_family_ipv4(self) -> bool:
        return pulumi.get(self, "address_family_ipv4")

    @property
    @pulumi.getter(name="addressFamilyIpv6")
    def address_family_ipv6(self) -> bool:
        return pulumi.get(self, "address_family_ipv6")

    @property
    @pulumi.getter
    def description(self) -> str:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def device(self) -> Optional[str]:
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipv4RouteTargetExportStitchings")
    def ipv4_route_target_export_stitchings(self) -> Sequence['outputs.GetVrfIpv4RouteTargetExportStitchingResult']:
        return pulumi.get(self, "ipv4_route_target_export_stitchings")

    @property
    @pulumi.getter(name="ipv4RouteTargetExports")
    def ipv4_route_target_exports(self) -> Sequence['outputs.GetVrfIpv4RouteTargetExportResult']:
        return pulumi.get(self, "ipv4_route_target_exports")

    @property
    @pulumi.getter(name="ipv4RouteTargetImportStitchings")
    def ipv4_route_target_import_stitchings(self) -> Sequence['outputs.GetVrfIpv4RouteTargetImportStitchingResult']:
        return pulumi.get(self, "ipv4_route_target_import_stitchings")

    @property
    @pulumi.getter(name="ipv4RouteTargetImports")
    def ipv4_route_target_imports(self) -> Sequence['outputs.GetVrfIpv4RouteTargetImportResult']:
        return pulumi.get(self, "ipv4_route_target_imports")

    @property
    @pulumi.getter(name="ipv6RouteTargetExportStitchings")
    def ipv6_route_target_export_stitchings(self) -> Sequence['outputs.GetVrfIpv6RouteTargetExportStitchingResult']:
        return pulumi.get(self, "ipv6_route_target_export_stitchings")

    @property
    @pulumi.getter(name="ipv6RouteTargetExports")
    def ipv6_route_target_exports(self) -> Sequence['outputs.GetVrfIpv6RouteTargetExportResult']:
        return pulumi.get(self, "ipv6_route_target_exports")

    @property
    @pulumi.getter(name="ipv6RouteTargetImportStitchings")
    def ipv6_route_target_import_stitchings(self) -> Sequence['outputs.GetVrfIpv6RouteTargetImportStitchingResult']:
        return pulumi.get(self, "ipv6_route_target_import_stitchings")

    @property
    @pulumi.getter(name="ipv6RouteTargetImports")
    def ipv6_route_target_imports(self) -> Sequence['outputs.GetVrfIpv6RouteTargetImportResult']:
        return pulumi.get(self, "ipv6_route_target_imports")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def rd(self) -> str:
        return pulumi.get(self, "rd")

    @property
    @pulumi.getter(name="routeTargetExports")
    def route_target_exports(self) -> Sequence['outputs.GetVrfRouteTargetExportResult']:
        return pulumi.get(self, "route_target_exports")

    @property
    @pulumi.getter(name="routeTargetImports")
    def route_target_imports(self) -> Sequence['outputs.GetVrfRouteTargetImportResult']:
        return pulumi.get(self, "route_target_imports")

    @property
    @pulumi.getter(name="vpnId")
    def vpn_id(self) -> str:
        return pulumi.get(self, "vpn_id")


class AwaitableGetVrfResult(GetVrfResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVrfResult(
            address_family_ipv4=self.address_family_ipv4,
            address_family_ipv6=self.address_family_ipv6,
            description=self.description,
            device=self.device,
            id=self.id,
            ipv4_route_target_export_stitchings=self.ipv4_route_target_export_stitchings,
            ipv4_route_target_exports=self.ipv4_route_target_exports,
            ipv4_route_target_import_stitchings=self.ipv4_route_target_import_stitchings,
            ipv4_route_target_imports=self.ipv4_route_target_imports,
            ipv6_route_target_export_stitchings=self.ipv6_route_target_export_stitchings,
            ipv6_route_target_exports=self.ipv6_route_target_exports,
            ipv6_route_target_import_stitchings=self.ipv6_route_target_import_stitchings,
            ipv6_route_target_imports=self.ipv6_route_target_imports,
            name=self.name,
            rd=self.rd,
            route_target_exports=self.route_target_exports,
            route_target_imports=self.route_target_imports,
            vpn_id=self.vpn_id)


def get_vrf(device: Optional[str] = None,
            name: Optional[str] = None,
            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVrfResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['device'] = device
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:iosxe/getVrf:getVrf', __args__, opts=opts, typ=GetVrfResult).value

    return AwaitableGetVrfResult(
        address_family_ipv4=pulumi.get(__ret__, 'address_family_ipv4'),
        address_family_ipv6=pulumi.get(__ret__, 'address_family_ipv6'),
        description=pulumi.get(__ret__, 'description'),
        device=pulumi.get(__ret__, 'device'),
        id=pulumi.get(__ret__, 'id'),
        ipv4_route_target_export_stitchings=pulumi.get(__ret__, 'ipv4_route_target_export_stitchings'),
        ipv4_route_target_exports=pulumi.get(__ret__, 'ipv4_route_target_exports'),
        ipv4_route_target_import_stitchings=pulumi.get(__ret__, 'ipv4_route_target_import_stitchings'),
        ipv4_route_target_imports=pulumi.get(__ret__, 'ipv4_route_target_imports'),
        ipv6_route_target_export_stitchings=pulumi.get(__ret__, 'ipv6_route_target_export_stitchings'),
        ipv6_route_target_exports=pulumi.get(__ret__, 'ipv6_route_target_exports'),
        ipv6_route_target_import_stitchings=pulumi.get(__ret__, 'ipv6_route_target_import_stitchings'),
        ipv6_route_target_imports=pulumi.get(__ret__, 'ipv6_route_target_imports'),
        name=pulumi.get(__ret__, 'name'),
        rd=pulumi.get(__ret__, 'rd'),
        route_target_exports=pulumi.get(__ret__, 'route_target_exports'),
        route_target_imports=pulumi.get(__ret__, 'route_target_imports'),
        vpn_id=pulumi.get(__ret__, 'vpn_id'))


@_utilities.lift_output_func(get_vrf)
def get_vrf_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                   name: Optional[pulumi.Input[str]] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetVrfResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...