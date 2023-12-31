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

// This data source can retrieve one or more attributes via RESTCONF.
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
//			_, err := iosxe.LookupRestconf(ctx, &iosxe.LookupRestconfArgs{
//				Path: "Cisco-IOS-XE-native:native/banner/login",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupRestconf(ctx *pulumi.Context, args *LookupRestconfArgs, opts ...pulumi.InvokeOption) (*LookupRestconfResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupRestconfResult
	err := ctx.Invoke("iosxe:index/getRestconf:getRestconf", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRestconf.
type LookupRestconfArgs struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// A RESTCONF path, e.g. `openconfig-interfaces:interfaces`.
	Path string `pulumi:"path"`
}

// A collection of values returned by getRestconf.
type LookupRestconfResult struct {
	// Map of key-value pairs which represents the attributes and its values.
	Attributes map[string]string `pulumi:"attributes"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// The path of the retrieved object.
	Id string `pulumi:"id"`
	// A RESTCONF path, e.g. `openconfig-interfaces:interfaces`.
	Path string `pulumi:"path"`
}

func LookupRestconfOutput(ctx *pulumi.Context, args LookupRestconfOutputArgs, opts ...pulumi.InvokeOption) LookupRestconfResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupRestconfResult, error) {
			args := v.(LookupRestconfArgs)
			r, err := LookupRestconf(ctx, &args, opts...)
			var s LookupRestconfResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupRestconfResultOutput)
}

// A collection of arguments for invoking getRestconf.
type LookupRestconfOutputArgs struct {
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput `pulumi:"device"`
	// A RESTCONF path, e.g. `openconfig-interfaces:interfaces`.
	Path pulumi.StringInput `pulumi:"path"`
}

func (LookupRestconfOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRestconfArgs)(nil)).Elem()
}

// A collection of values returned by getRestconf.
type LookupRestconfResultOutput struct{ *pulumi.OutputState }

func (LookupRestconfResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRestconfResult)(nil)).Elem()
}

func (o LookupRestconfResultOutput) ToLookupRestconfResultOutput() LookupRestconfResultOutput {
	return o
}

func (o LookupRestconfResultOutput) ToLookupRestconfResultOutputWithContext(ctx context.Context) LookupRestconfResultOutput {
	return o
}

func (o LookupRestconfResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupRestconfResult] {
	return pulumix.Output[LookupRestconfResult]{
		OutputState: o.OutputState,
	}
}

// Map of key-value pairs which represents the attributes and its values.
func (o LookupRestconfResultOutput) Attributes() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupRestconfResult) map[string]string { return v.Attributes }).(pulumi.StringMapOutput)
}

// A device name from the provider configuration.
func (o LookupRestconfResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupRestconfResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// The path of the retrieved object.
func (o LookupRestconfResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRestconfResult) string { return v.Id }).(pulumi.StringOutput)
}

// A RESTCONF path, e.g. `openconfig-interfaces:interfaces`.
func (o LookupRestconfResultOutput) Path() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRestconfResult) string { return v.Path }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupRestconfResultOutput{})
}
