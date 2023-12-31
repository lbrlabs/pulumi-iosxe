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

// This data source can read the Interface NVE configuration.
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
//			_, err := iosxe.LookupInterfaceNve(ctx, &iosxe.LookupInterfaceNveArgs{
//				Name: 1,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupInterfaceNve(ctx *pulumi.Context, args *LookupInterfaceNveArgs, opts ...pulumi.InvokeOption) (*LookupInterfaceNveResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupInterfaceNveResult
	err := ctx.Invoke("iosxe:index/getInterfaceNve:getInterfaceNve", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInterfaceNve.
type LookupInterfaceNveArgs struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	Name   int     `pulumi:"name"`
}

// A collection of values returned by getInterfaceNve.
type LookupInterfaceNveResult struct {
	// Interface specific description
	Description string `pulumi:"description"`
	// A device name from the provider configuration.
	Device                      *string `pulumi:"device"`
	HostReachabilityProtocolBgp bool    `pulumi:"hostReachabilityProtocolBgp"`
	// The path of the retrieved object.
	Id   string `pulumi:"id"`
	Name int    `pulumi:"name"`
	// Shutdown the selected interface
	Shutdown bool `pulumi:"shutdown"`
	// Loopback interface
	SourceInterfaceLoopback int `pulumi:"sourceInterfaceLoopback"`
	// Configure VNI information
	VniVrfs []GetInterfaceNveVniVrf `pulumi:"vniVrfs"`
	// Configure VNI information
	Vnis []GetInterfaceNveVni `pulumi:"vnis"`
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
	// A device name from the provider configuration.
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

// Interface specific description
func (o LookupInterfaceNveResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfaceNveResult) string { return v.Description }).(pulumi.StringOutput)
}

// A device name from the provider configuration.
func (o LookupInterfaceNveResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupInterfaceNveResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

func (o LookupInterfaceNveResultOutput) HostReachabilityProtocolBgp() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfaceNveResult) bool { return v.HostReachabilityProtocolBgp }).(pulumi.BoolOutput)
}

// The path of the retrieved object.
func (o LookupInterfaceNveResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfaceNveResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupInterfaceNveResultOutput) Name() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInterfaceNveResult) int { return v.Name }).(pulumi.IntOutput)
}

// Shutdown the selected interface
func (o LookupInterfaceNveResultOutput) Shutdown() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfaceNveResult) bool { return v.Shutdown }).(pulumi.BoolOutput)
}

// Loopback interface
func (o LookupInterfaceNveResultOutput) SourceInterfaceLoopback() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInterfaceNveResult) int { return v.SourceInterfaceLoopback }).(pulumi.IntOutput)
}

// Configure VNI information
func (o LookupInterfaceNveResultOutput) VniVrfs() GetInterfaceNveVniVrfArrayOutput {
	return o.ApplyT(func(v LookupInterfaceNveResult) []GetInterfaceNveVniVrf { return v.VniVrfs }).(GetInterfaceNveVniVrfArrayOutput)
}

// Configure VNI information
func (o LookupInterfaceNveResultOutput) Vnis() GetInterfaceNveVniArrayOutput {
	return o.ApplyT(func(v LookupInterfaceNveResult) []GetInterfaceNveVni { return v.Vnis }).(GetInterfaceNveVniArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupInterfaceNveResultOutput{})
}
