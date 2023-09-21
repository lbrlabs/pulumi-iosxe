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

func LookupLine(ctx *pulumi.Context, args *LookupLineArgs, opts ...pulumi.InvokeOption) (*LookupLineResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupLineResult
	err := ctx.Invoke("iosxe:iosxe/getLine:getLine", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLine.
type LookupLineArgs struct {
	Device *string `pulumi:"device"`
}

// A collection of values returned by getLine.
type LookupLineResult struct {
	Consoles []GetLineConsole `pulumi:"consoles"`
	Device   *string          `pulumi:"device"`
	Id       string           `pulumi:"id"`
	Vties    []GetLineVty     `pulumi:"vties"`
}

func LookupLineOutput(ctx *pulumi.Context, args LookupLineOutputArgs, opts ...pulumi.InvokeOption) LookupLineResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupLineResult, error) {
			args := v.(LookupLineArgs)
			r, err := LookupLine(ctx, &args, opts...)
			var s LookupLineResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupLineResultOutput)
}

// A collection of arguments for invoking getLine.
type LookupLineOutputArgs struct {
	Device pulumi.StringPtrInput `pulumi:"device"`
}

func (LookupLineOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLineArgs)(nil)).Elem()
}

// A collection of values returned by getLine.
type LookupLineResultOutput struct{ *pulumi.OutputState }

func (LookupLineResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLineResult)(nil)).Elem()
}

func (o LookupLineResultOutput) ToLookupLineResultOutput() LookupLineResultOutput {
	return o
}

func (o LookupLineResultOutput) ToLookupLineResultOutputWithContext(ctx context.Context) LookupLineResultOutput {
	return o
}

func (o LookupLineResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupLineResult] {
	return pulumix.Output[LookupLineResult]{
		OutputState: o.OutputState,
	}
}

func (o LookupLineResultOutput) Consoles() GetLineConsoleArrayOutput {
	return o.ApplyT(func(v LookupLineResult) []GetLineConsole { return v.Consoles }).(GetLineConsoleArrayOutput)
}

func (o LookupLineResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupLineResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

func (o LookupLineResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLineResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupLineResultOutput) Vties() GetLineVtyArrayOutput {
	return o.ApplyT(func(v LookupLineResult) []GetLineVty { return v.Vties }).(GetLineVtyArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupLineResultOutput{})
}
