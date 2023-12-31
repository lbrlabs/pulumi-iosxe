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

// This data source can read the Crypto IPSec Transform Set configuration.
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
//			_, err := iosxe.LookupCryptoIpsecTransformSet(ctx, &iosxe.LookupCryptoIpsecTransformSetArgs{
//				Name: "TEST",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupCryptoIpsecTransformSet(ctx *pulumi.Context, args *LookupCryptoIpsecTransformSetArgs, opts ...pulumi.InvokeOption) (*LookupCryptoIpsecTransformSetResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCryptoIpsecTransformSetResult
	err := ctx.Invoke("iosxe:index/getCryptoIpsecTransformSet:getCryptoIpsecTransformSet", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCryptoIpsecTransformSet.
type LookupCryptoIpsecTransformSetArgs struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	Name   string  `pulumi:"name"`
}

// A collection of values returned by getCryptoIpsecTransformSet.
type LookupCryptoIpsecTransformSetResult struct {
	// A device name from the provider configuration.
	Device  *string `pulumi:"device"`
	Esp     string  `pulumi:"esp"`
	EspHmac string  `pulumi:"espHmac"`
	// The path of the retrieved object.
	Id string `pulumi:"id"`
	// tunnel (datagram encapsulation) mode
	ModeTunnel bool   `pulumi:"modeTunnel"`
	Name       string `pulumi:"name"`
}

func LookupCryptoIpsecTransformSetOutput(ctx *pulumi.Context, args LookupCryptoIpsecTransformSetOutputArgs, opts ...pulumi.InvokeOption) LookupCryptoIpsecTransformSetResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupCryptoIpsecTransformSetResult, error) {
			args := v.(LookupCryptoIpsecTransformSetArgs)
			r, err := LookupCryptoIpsecTransformSet(ctx, &args, opts...)
			var s LookupCryptoIpsecTransformSetResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupCryptoIpsecTransformSetResultOutput)
}

// A collection of arguments for invoking getCryptoIpsecTransformSet.
type LookupCryptoIpsecTransformSetOutputArgs struct {
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput `pulumi:"device"`
	Name   pulumi.StringInput    `pulumi:"name"`
}

func (LookupCryptoIpsecTransformSetOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCryptoIpsecTransformSetArgs)(nil)).Elem()
}

// A collection of values returned by getCryptoIpsecTransformSet.
type LookupCryptoIpsecTransformSetResultOutput struct{ *pulumi.OutputState }

func (LookupCryptoIpsecTransformSetResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCryptoIpsecTransformSetResult)(nil)).Elem()
}

func (o LookupCryptoIpsecTransformSetResultOutput) ToLookupCryptoIpsecTransformSetResultOutput() LookupCryptoIpsecTransformSetResultOutput {
	return o
}

func (o LookupCryptoIpsecTransformSetResultOutput) ToLookupCryptoIpsecTransformSetResultOutputWithContext(ctx context.Context) LookupCryptoIpsecTransformSetResultOutput {
	return o
}

func (o LookupCryptoIpsecTransformSetResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupCryptoIpsecTransformSetResult] {
	return pulumix.Output[LookupCryptoIpsecTransformSetResult]{
		OutputState: o.OutputState,
	}
}

// A device name from the provider configuration.
func (o LookupCryptoIpsecTransformSetResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupCryptoIpsecTransformSetResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

func (o LookupCryptoIpsecTransformSetResultOutput) Esp() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCryptoIpsecTransformSetResult) string { return v.Esp }).(pulumi.StringOutput)
}

func (o LookupCryptoIpsecTransformSetResultOutput) EspHmac() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCryptoIpsecTransformSetResult) string { return v.EspHmac }).(pulumi.StringOutput)
}

// The path of the retrieved object.
func (o LookupCryptoIpsecTransformSetResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCryptoIpsecTransformSetResult) string { return v.Id }).(pulumi.StringOutput)
}

// tunnel (datagram encapsulation) mode
func (o LookupCryptoIpsecTransformSetResultOutput) ModeTunnel() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIpsecTransformSetResult) bool { return v.ModeTunnel }).(pulumi.BoolOutput)
}

func (o LookupCryptoIpsecTransformSetResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCryptoIpsecTransformSetResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCryptoIpsecTransformSetResultOutput{})
}
