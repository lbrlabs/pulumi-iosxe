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

func LookupCts(ctx *pulumi.Context, args *LookupCtsArgs, opts ...pulumi.InvokeOption) (*LookupCtsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCtsResult
	err := ctx.Invoke("iosxe:iosxe/getCts:getCts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCts.
type LookupCtsArgs struct {
	Device *string `pulumi:"device"`
}

// A collection of values returned by getCts.
type LookupCtsResult struct {
	AuthorizationList string  `pulumi:"authorizationList"`
	Device            *string `pulumi:"device"`
	Id                string  `pulumi:"id"`
}

func LookupCtsOutput(ctx *pulumi.Context, args LookupCtsOutputArgs, opts ...pulumi.InvokeOption) LookupCtsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupCtsResult, error) {
			args := v.(LookupCtsArgs)
			r, err := LookupCts(ctx, &args, opts...)
			var s LookupCtsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupCtsResultOutput)
}

// A collection of arguments for invoking getCts.
type LookupCtsOutputArgs struct {
	Device pulumi.StringPtrInput `pulumi:"device"`
}

func (LookupCtsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCtsArgs)(nil)).Elem()
}

// A collection of values returned by getCts.
type LookupCtsResultOutput struct{ *pulumi.OutputState }

func (LookupCtsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCtsResult)(nil)).Elem()
}

func (o LookupCtsResultOutput) ToLookupCtsResultOutput() LookupCtsResultOutput {
	return o
}

func (o LookupCtsResultOutput) ToLookupCtsResultOutputWithContext(ctx context.Context) LookupCtsResultOutput {
	return o
}

func (o LookupCtsResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupCtsResult] {
	return pulumix.Output[LookupCtsResult]{
		OutputState: o.OutputState,
	}
}

func (o LookupCtsResultOutput) AuthorizationList() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCtsResult) string { return v.AuthorizationList }).(pulumi.StringOutput)
}

func (o LookupCtsResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupCtsResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

func (o LookupCtsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCtsResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCtsResultOutput{})
}
