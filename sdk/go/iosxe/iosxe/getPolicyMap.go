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

func LookupPolicyMap(ctx *pulumi.Context, args *LookupPolicyMapArgs, opts ...pulumi.InvokeOption) (*LookupPolicyMapResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPolicyMapResult
	err := ctx.Invoke("iosxe:iosxe/getPolicyMap:getPolicyMap", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPolicyMap.
type LookupPolicyMapArgs struct {
	Device *string `pulumi:"device"`
	Name   string  `pulumi:"name"`
}

// A collection of values returned by getPolicyMap.
type LookupPolicyMapResult struct {
	Device     *string `pulumi:"device"`
	Id         string  `pulumi:"id"`
	Name       string  `pulumi:"name"`
	Subscriber bool    `pulumi:"subscriber"`
	Type       string  `pulumi:"type"`
}

func LookupPolicyMapOutput(ctx *pulumi.Context, args LookupPolicyMapOutputArgs, opts ...pulumi.InvokeOption) LookupPolicyMapResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupPolicyMapResult, error) {
			args := v.(LookupPolicyMapArgs)
			r, err := LookupPolicyMap(ctx, &args, opts...)
			var s LookupPolicyMapResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupPolicyMapResultOutput)
}

// A collection of arguments for invoking getPolicyMap.
type LookupPolicyMapOutputArgs struct {
	Device pulumi.StringPtrInput `pulumi:"device"`
	Name   pulumi.StringInput    `pulumi:"name"`
}

func (LookupPolicyMapOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPolicyMapArgs)(nil)).Elem()
}

// A collection of values returned by getPolicyMap.
type LookupPolicyMapResultOutput struct{ *pulumi.OutputState }

func (LookupPolicyMapResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPolicyMapResult)(nil)).Elem()
}

func (o LookupPolicyMapResultOutput) ToLookupPolicyMapResultOutput() LookupPolicyMapResultOutput {
	return o
}

func (o LookupPolicyMapResultOutput) ToLookupPolicyMapResultOutputWithContext(ctx context.Context) LookupPolicyMapResultOutput {
	return o
}

func (o LookupPolicyMapResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupPolicyMapResult] {
	return pulumix.Output[LookupPolicyMapResult]{
		OutputState: o.OutputState,
	}
}

func (o LookupPolicyMapResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupPolicyMapResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

func (o LookupPolicyMapResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPolicyMapResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupPolicyMapResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPolicyMapResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupPolicyMapResultOutput) Subscriber() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupPolicyMapResult) bool { return v.Subscriber }).(pulumi.BoolOutput)
}

func (o LookupPolicyMapResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPolicyMapResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPolicyMapResultOutput{})
}
