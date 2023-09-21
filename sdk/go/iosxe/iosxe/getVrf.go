// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package iosxe

import (
	"context"
	"reflect"

	"github.com/lbrlabs/pulumi-iosxe/sdk/go/iosxe/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

func LookupVrf(ctx *pulumi.Context, args *LookupVrfArgs, opts ...pulumi.InvokeOption) (*LookupVrfResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupVrfResult
	err := ctx.Invoke("iosxe:iosxe/getVrf:getVrf", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVrf.
type LookupVrfArgs struct {
	Device *string `pulumi:"device"`
	Name   string  `pulumi:"name"`
}

// A collection of values returned by getVrf.
type LookupVrfResult struct {
	AddressFamilyIpv4               bool                                   `pulumi:"addressFamilyIpv4"`
	AddressFamilyIpv6               bool                                   `pulumi:"addressFamilyIpv6"`
	Description                     string                                 `pulumi:"description"`
	Device                          *string                                `pulumi:"device"`
	Id                              string                                 `pulumi:"id"`
	Ipv4RouteTargetExportStitchings []GetVrfIpv4RouteTargetExportStitching `pulumi:"ipv4RouteTargetExportStitchings"`
	Ipv4RouteTargetExports          []GetVrfIpv4RouteTargetExport          `pulumi:"ipv4RouteTargetExports"`
	Ipv4RouteTargetImportStitchings []GetVrfIpv4RouteTargetImportStitching `pulumi:"ipv4RouteTargetImportStitchings"`
	Ipv4RouteTargetImports          []GetVrfIpv4RouteTargetImport          `pulumi:"ipv4RouteTargetImports"`
	Ipv6RouteTargetExportStitchings []GetVrfIpv6RouteTargetExportStitching `pulumi:"ipv6RouteTargetExportStitchings"`
	Ipv6RouteTargetExports          []GetVrfIpv6RouteTargetExport          `pulumi:"ipv6RouteTargetExports"`
	Ipv6RouteTargetImportStitchings []GetVrfIpv6RouteTargetImportStitching `pulumi:"ipv6RouteTargetImportStitchings"`
	Ipv6RouteTargetImports          []GetVrfIpv6RouteTargetImport          `pulumi:"ipv6RouteTargetImports"`
	Name                            string                                 `pulumi:"name"`
	Rd                              string                                 `pulumi:"rd"`
	RouteTargetExports              []GetVrfRouteTargetExport              `pulumi:"routeTargetExports"`
	RouteTargetImports              []GetVrfRouteTargetImport              `pulumi:"routeTargetImports"`
	VpnId                           string                                 `pulumi:"vpnId"`
}

func LookupVrfOutput(ctx *pulumi.Context, args LookupVrfOutputArgs, opts ...pulumi.InvokeOption) LookupVrfResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupVrfResult, error) {
			args := v.(LookupVrfArgs)
			r, err := LookupVrf(ctx, &args, opts...)
			var s LookupVrfResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupVrfResultOutput)
}

// A collection of arguments for invoking getVrf.
type LookupVrfOutputArgs struct {
	Device pulumi.StringPtrInput `pulumi:"device"`
	Name   pulumi.StringInput    `pulumi:"name"`
}

func (LookupVrfOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVrfArgs)(nil)).Elem()
}

// A collection of values returned by getVrf.
type LookupVrfResultOutput struct{ *pulumi.OutputState }

func (LookupVrfResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVrfResult)(nil)).Elem()
}

func (o LookupVrfResultOutput) ToLookupVrfResultOutput() LookupVrfResultOutput {
	return o
}

func (o LookupVrfResultOutput) ToLookupVrfResultOutputWithContext(ctx context.Context) LookupVrfResultOutput {
	return o
}

func (o LookupVrfResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupVrfResult] {
	return pulumix.Output[LookupVrfResult]{
		OutputState: o.OutputState,
	}
}

func (o LookupVrfResultOutput) AddressFamilyIpv4() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupVrfResult) bool { return v.AddressFamilyIpv4 }).(pulumi.BoolOutput)
}

func (o LookupVrfResultOutput) AddressFamilyIpv6() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupVrfResult) bool { return v.AddressFamilyIpv6 }).(pulumi.BoolOutput)
}

func (o LookupVrfResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVrfResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupVrfResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupVrfResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

func (o LookupVrfResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVrfResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupVrfResultOutput) Ipv4RouteTargetExportStitchings() GetVrfIpv4RouteTargetExportStitchingArrayOutput {
	return o.ApplyT(func(v LookupVrfResult) []GetVrfIpv4RouteTargetExportStitching {
		return v.Ipv4RouteTargetExportStitchings
	}).(GetVrfIpv4RouteTargetExportStitchingArrayOutput)
}

func (o LookupVrfResultOutput) Ipv4RouteTargetExports() GetVrfIpv4RouteTargetExportArrayOutput {
	return o.ApplyT(func(v LookupVrfResult) []GetVrfIpv4RouteTargetExport { return v.Ipv4RouteTargetExports }).(GetVrfIpv4RouteTargetExportArrayOutput)
}

func (o LookupVrfResultOutput) Ipv4RouteTargetImportStitchings() GetVrfIpv4RouteTargetImportStitchingArrayOutput {
	return o.ApplyT(func(v LookupVrfResult) []GetVrfIpv4RouteTargetImportStitching {
		return v.Ipv4RouteTargetImportStitchings
	}).(GetVrfIpv4RouteTargetImportStitchingArrayOutput)
}

func (o LookupVrfResultOutput) Ipv4RouteTargetImports() GetVrfIpv4RouteTargetImportArrayOutput {
	return o.ApplyT(func(v LookupVrfResult) []GetVrfIpv4RouteTargetImport { return v.Ipv4RouteTargetImports }).(GetVrfIpv4RouteTargetImportArrayOutput)
}

func (o LookupVrfResultOutput) Ipv6RouteTargetExportStitchings() GetVrfIpv6RouteTargetExportStitchingArrayOutput {
	return o.ApplyT(func(v LookupVrfResult) []GetVrfIpv6RouteTargetExportStitching {
		return v.Ipv6RouteTargetExportStitchings
	}).(GetVrfIpv6RouteTargetExportStitchingArrayOutput)
}

func (o LookupVrfResultOutput) Ipv6RouteTargetExports() GetVrfIpv6RouteTargetExportArrayOutput {
	return o.ApplyT(func(v LookupVrfResult) []GetVrfIpv6RouteTargetExport { return v.Ipv6RouteTargetExports }).(GetVrfIpv6RouteTargetExportArrayOutput)
}

func (o LookupVrfResultOutput) Ipv6RouteTargetImportStitchings() GetVrfIpv6RouteTargetImportStitchingArrayOutput {
	return o.ApplyT(func(v LookupVrfResult) []GetVrfIpv6RouteTargetImportStitching {
		return v.Ipv6RouteTargetImportStitchings
	}).(GetVrfIpv6RouteTargetImportStitchingArrayOutput)
}

func (o LookupVrfResultOutput) Ipv6RouteTargetImports() GetVrfIpv6RouteTargetImportArrayOutput {
	return o.ApplyT(func(v LookupVrfResult) []GetVrfIpv6RouteTargetImport { return v.Ipv6RouteTargetImports }).(GetVrfIpv6RouteTargetImportArrayOutput)
}

func (o LookupVrfResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVrfResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupVrfResultOutput) Rd() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVrfResult) string { return v.Rd }).(pulumi.StringOutput)
}

func (o LookupVrfResultOutput) RouteTargetExports() GetVrfRouteTargetExportArrayOutput {
	return o.ApplyT(func(v LookupVrfResult) []GetVrfRouteTargetExport { return v.RouteTargetExports }).(GetVrfRouteTargetExportArrayOutput)
}

func (o LookupVrfResultOutput) RouteTargetImports() GetVrfRouteTargetImportArrayOutput {
	return o.ApplyT(func(v LookupVrfResult) []GetVrfRouteTargetImport { return v.RouteTargetImports }).(GetVrfRouteTargetImportArrayOutput)
}

func (o LookupVrfResultOutput) VpnId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVrfResult) string { return v.VpnId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupVrfResultOutput{})
}
