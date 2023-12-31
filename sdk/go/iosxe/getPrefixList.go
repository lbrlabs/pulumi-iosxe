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

// This data source can read the Prefix List configuration.
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
//			_, err := iosxe.LookupPrefixList(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupPrefixList(ctx *pulumi.Context, args *LookupPrefixListArgs, opts ...pulumi.InvokeOption) (*LookupPrefixListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPrefixListResult
	err := ctx.Invoke("iosxe:index/getPrefixList:getPrefixList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPrefixList.
type LookupPrefixListArgs struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
}

// A collection of values returned by getPrefixList.
type LookupPrefixListResult struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// The path of the retrieved object.
	Id string `pulumi:"id"`
	// Build prefix-lists with name ans seq.no
	Prefixes []GetPrefixListPrefix `pulumi:"prefixes"`
}

func LookupPrefixListOutput(ctx *pulumi.Context, args LookupPrefixListOutputArgs, opts ...pulumi.InvokeOption) LookupPrefixListResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupPrefixListResult, error) {
			args := v.(LookupPrefixListArgs)
			r, err := LookupPrefixList(ctx, &args, opts...)
			var s LookupPrefixListResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupPrefixListResultOutput)
}

// A collection of arguments for invoking getPrefixList.
type LookupPrefixListOutputArgs struct {
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput `pulumi:"device"`
}

func (LookupPrefixListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPrefixListArgs)(nil)).Elem()
}

// A collection of values returned by getPrefixList.
type LookupPrefixListResultOutput struct{ *pulumi.OutputState }

func (LookupPrefixListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPrefixListResult)(nil)).Elem()
}

func (o LookupPrefixListResultOutput) ToLookupPrefixListResultOutput() LookupPrefixListResultOutput {
	return o
}

func (o LookupPrefixListResultOutput) ToLookupPrefixListResultOutputWithContext(ctx context.Context) LookupPrefixListResultOutput {
	return o
}

func (o LookupPrefixListResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupPrefixListResult] {
	return pulumix.Output[LookupPrefixListResult]{
		OutputState: o.OutputState,
	}
}

// A device name from the provider configuration.
func (o LookupPrefixListResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupPrefixListResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// The path of the retrieved object.
func (o LookupPrefixListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrefixListResult) string { return v.Id }).(pulumi.StringOutput)
}

// Build prefix-lists with name ans seq.no
func (o LookupPrefixListResultOutput) Prefixes() GetPrefixListPrefixArrayOutput {
	return o.ApplyT(func(v LookupPrefixListResult) []GetPrefixListPrefix { return v.Prefixes }).(GetPrefixListPrefixArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPrefixListResultOutput{})
}
