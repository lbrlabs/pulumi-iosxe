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

// This data source can read the Access List Standard configuration.
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
//			_, err := iosxe.LookupAccessListStandard(ctx, &iosxe.LookupAccessListStandardArgs{
//				Name: "SACL1",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupAccessListStandard(ctx *pulumi.Context, args *LookupAccessListStandardArgs, opts ...pulumi.InvokeOption) (*LookupAccessListStandardResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAccessListStandardResult
	err := ctx.Invoke("iosxe:index/getAccessListStandard:getAccessListStandard", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccessListStandard.
type LookupAccessListStandardArgs struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	Name   string  `pulumi:"name"`
}

// A collection of values returned by getAccessListStandard.
type LookupAccessListStandardResult struct {
	// A device name from the provider configuration.
	Device  *string                      `pulumi:"device"`
	Entries []GetAccessListStandardEntry `pulumi:"entries"`
	// The path of the retrieved object.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
}

func LookupAccessListStandardOutput(ctx *pulumi.Context, args LookupAccessListStandardOutputArgs, opts ...pulumi.InvokeOption) LookupAccessListStandardResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAccessListStandardResult, error) {
			args := v.(LookupAccessListStandardArgs)
			r, err := LookupAccessListStandard(ctx, &args, opts...)
			var s LookupAccessListStandardResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAccessListStandardResultOutput)
}

// A collection of arguments for invoking getAccessListStandard.
type LookupAccessListStandardOutputArgs struct {
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput `pulumi:"device"`
	Name   pulumi.StringInput    `pulumi:"name"`
}

func (LookupAccessListStandardOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccessListStandardArgs)(nil)).Elem()
}

// A collection of values returned by getAccessListStandard.
type LookupAccessListStandardResultOutput struct{ *pulumi.OutputState }

func (LookupAccessListStandardResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccessListStandardResult)(nil)).Elem()
}

func (o LookupAccessListStandardResultOutput) ToLookupAccessListStandardResultOutput() LookupAccessListStandardResultOutput {
	return o
}

func (o LookupAccessListStandardResultOutput) ToLookupAccessListStandardResultOutputWithContext(ctx context.Context) LookupAccessListStandardResultOutput {
	return o
}

func (o LookupAccessListStandardResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupAccessListStandardResult] {
	return pulumix.Output[LookupAccessListStandardResult]{
		OutputState: o.OutputState,
	}
}

// A device name from the provider configuration.
func (o LookupAccessListStandardResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAccessListStandardResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

func (o LookupAccessListStandardResultOutput) Entries() GetAccessListStandardEntryArrayOutput {
	return o.ApplyT(func(v LookupAccessListStandardResult) []GetAccessListStandardEntry { return v.Entries }).(GetAccessListStandardEntryArrayOutput)
}

// The path of the retrieved object.
func (o LookupAccessListStandardResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessListStandardResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAccessListStandardResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessListStandardResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAccessListStandardResultOutput{})
}