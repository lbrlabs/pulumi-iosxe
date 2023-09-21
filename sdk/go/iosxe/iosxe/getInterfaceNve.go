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

func LookupInterfaceNve(ctx *pulumi.Context, args *LookupInterfaceNveArgs, opts ...pulumi.InvokeOption) (*LookupInterfaceNveResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupInterfaceNveResult
	err := ctx.Invoke("iosxe:iosxe/getInterfaceNve:getInterfaceNve", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInterfaceNve.
type LookupInterfaceNveArgs struct {
	Device *string `pulumi:"device"`
	Name   int     `pulumi:"name"`
}

// A collection of values returned by getInterfaceNve.
type LookupInterfaceNveResult struct {
	Description                 string                  `pulumi:"description"`
	Device                      *string                 `pulumi:"device"`
	HostReachabilityProtocolBgp bool                    `pulumi:"hostReachabilityProtocolBgp"`
	Id                          string                  `pulumi:"id"`
	Name                        int                     `pulumi:"name"`
	Shutdown                    bool                    `pulumi:"shutdown"`
	SourceInterfaceLoopback     int                     `pulumi:"sourceInterfaceLoopback"`
	VniVrfs                     []GetInterfaceNveVniVrf `pulumi:"vniVrfs"`
	Vnis                        []GetInterfaceNveVni    `pulumi:"vnis"`
}

func LookupInterfaceNveOutput(ctx *pulumi.Context, args LookupInterfaceNveOutputArgs, opts ...pulumi.InvokeOption) LookupInterfaceNveResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupInterfaceNveResult, error) {
			args := v.(LookupInterfaceNveArgs)
			r, err := LookupInterfaceNve(ctx, &args, opts...)
			var s LookupInterfaceNveResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupInterfaceNveResultOutput)
}

// A collection of arguments for invoking getInterfaceNve.
type LookupInterfaceNveOutputArgs struct {
	Device pulumi.StringPtrInput `pulumi:"device"`
	Name   pulumi.IntInput       `pulumi:"name"`
}

func (LookupInterfaceNveOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupInterfaceNveArgs)(nil)).Elem()
}

// A collection of values returned by getInterfaceNve.
type LookupInterfaceNveResultOutput struct{ *pulumi.OutputState }

func (LookupInterfaceNveResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupInterfaceNveResult)(nil)).Elem()
}

func (o LookupInterfaceNveResultOutput) ToLookupInterfaceNveResultOutput() LookupInterfaceNveResultOutput {
	return o
}

func (o LookupInterfaceNveResultOutput) ToLookupInterfaceNveResultOutputWithContext(ctx context.Context) LookupInterfaceNveResultOutput {
	return o
}

func (o LookupInterfaceNveResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupInterfaceNveResult] {
	return pulumix.Output[LookupInterfaceNveResult]{
		OutputState: o.OutputState,
	}
}

func (o LookupInterfaceNveResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfaceNveResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupInterfaceNveResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupInterfaceNveResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

func (o LookupInterfaceNveResultOutput) HostReachabilityProtocolBgp() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfaceNveResult) bool { return v.HostReachabilityProtocolBgp }).(pulumi.BoolOutput)
}

func (o LookupInterfaceNveResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfaceNveResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupInterfaceNveResultOutput) Name() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInterfaceNveResult) int { return v.Name }).(pulumi.IntOutput)
}

func (o LookupInterfaceNveResultOutput) Shutdown() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfaceNveResult) bool { return v.Shutdown }).(pulumi.BoolOutput)
}

func (o LookupInterfaceNveResultOutput) SourceInterfaceLoopback() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInterfaceNveResult) int { return v.SourceInterfaceLoopback }).(pulumi.IntOutput)
}

func (o LookupInterfaceNveResultOutput) VniVrfs() GetInterfaceNveVniVrfArrayOutput {
	return o.ApplyT(func(v LookupInterfaceNveResult) []GetInterfaceNveVniVrf { return v.VniVrfs }).(GetInterfaceNveVniVrfArrayOutput)
}

func (o LookupInterfaceNveResultOutput) Vnis() GetInterfaceNveVniArrayOutput {
	return o.ApplyT(func(v LookupInterfaceNveResult) []GetInterfaceNveVni { return v.Vnis }).(GetInterfaceNveVniArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupInterfaceNveResultOutput{})
}