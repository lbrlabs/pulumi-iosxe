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

// This data source can read the Policy Map configuration.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-iosxe/sdk/go/iosxe"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := iosxe.LookupPolicyMap(ctx, &iosxe.LookupPolicyMapArgs{
//				Name: "dot1x_policy",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupPolicyMap(ctx *pulumi.Context, args *LookupPolicyMapArgs, opts ...pulumi.InvokeOption) (*LookupPolicyMapResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPolicyMapResult
	err := ctx.Invoke("iosxe:index/getPolicyMap:getPolicyMap", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPolicyMap.
type LookupPolicyMapArgs struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// Name of the policy map
	Name string `pulumi:"name"`
}

// A collection of values returned by getPolicyMap.
type LookupPolicyMapResult struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// The path of the retrieved object.
	Id string `pulumi:"id"`
	// Name of the policy map
	Name string `pulumi:"name"`
	// Domain name of the policy map
	Subscriber bool `pulumi:"subscriber"`
	// type of the policy-map
	Type string `pulumi:"type"`
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
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput `pulumi:"device"`
	// Name of the policy map
	Name pulumi.StringInput `pulumi:"name"`
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

// A device name from the provider configuration.
func (o LookupPolicyMapResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupPolicyMapResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// The path of the retrieved object.
func (o LookupPolicyMapResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPolicyMapResult) string { return v.Id }).(pulumi.StringOutput)
}

// Name of the policy map
func (o LookupPolicyMapResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPolicyMapResult) string { return v.Name }).(pulumi.StringOutput)
}

// Domain name of the policy map
func (o LookupPolicyMapResultOutput) Subscriber() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupPolicyMapResult) bool { return v.Subscriber }).(pulumi.BoolOutput)
}

// type of the policy-map
func (o LookupPolicyMapResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPolicyMapResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPolicyMapResultOutput{})
}
