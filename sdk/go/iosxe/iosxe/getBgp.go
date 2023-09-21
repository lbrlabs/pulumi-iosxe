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

func LookupBgp(ctx *pulumi.Context, args *LookupBgpArgs, opts ...pulumi.InvokeOption) (*LookupBgpResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupBgpResult
	err := ctx.Invoke("iosxe:iosxe/getBgp:getBgp", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBgp.
type LookupBgpArgs struct {
	Asn    string  `pulumi:"asn"`
	Device *string `pulumi:"device"`
}

// A collection of values returned by getBgp.
type LookupBgpResult struct {
	Asn                string  `pulumi:"asn"`
	DefaultIpv4Unicast bool    `pulumi:"defaultIpv4Unicast"`
	Device             *string `pulumi:"device"`
	Id                 string  `pulumi:"id"`
	LogNeighborChanges bool    `pulumi:"logNeighborChanges"`
	RouterIdLoopback   int     `pulumi:"routerIdLoopback"`
}

func LookupBgpOutput(ctx *pulumi.Context, args LookupBgpOutputArgs, opts ...pulumi.InvokeOption) LookupBgpResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupBgpResult, error) {
			args := v.(LookupBgpArgs)
			r, err := LookupBgp(ctx, &args, opts...)
			var s LookupBgpResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupBgpResultOutput)
}

// A collection of arguments for invoking getBgp.
type LookupBgpOutputArgs struct {
	Asn    pulumi.StringInput    `pulumi:"asn"`
	Device pulumi.StringPtrInput `pulumi:"device"`
}

func (LookupBgpOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBgpArgs)(nil)).Elem()
}

// A collection of values returned by getBgp.
type LookupBgpResultOutput struct{ *pulumi.OutputState }

func (LookupBgpResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBgpResult)(nil)).Elem()
}

func (o LookupBgpResultOutput) ToLookupBgpResultOutput() LookupBgpResultOutput {
	return o
}

func (o LookupBgpResultOutput) ToLookupBgpResultOutputWithContext(ctx context.Context) LookupBgpResultOutput {
	return o
}

func (o LookupBgpResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupBgpResult] {
	return pulumix.Output[LookupBgpResult]{
		OutputState: o.OutputState,
	}
}

func (o LookupBgpResultOutput) Asn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBgpResult) string { return v.Asn }).(pulumi.StringOutput)
}

func (o LookupBgpResultOutput) DefaultIpv4Unicast() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBgpResult) bool { return v.DefaultIpv4Unicast }).(pulumi.BoolOutput)
}

func (o LookupBgpResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupBgpResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

func (o LookupBgpResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBgpResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupBgpResultOutput) LogNeighborChanges() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBgpResult) bool { return v.LogNeighborChanges }).(pulumi.BoolOutput)
}

func (o LookupBgpResultOutput) RouterIdLoopback() pulumi.IntOutput {
	return o.ApplyT(func(v LookupBgpResult) int { return v.RouterIdLoopback }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupBgpResultOutput{})
}