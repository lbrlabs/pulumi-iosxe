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

// This data source can read the VLAN Access Map configuration.
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
//			_, err := iosxe.LookupVlanAccessMap(ctx, &iosxe.LookupVlanAccessMapArgs{
//				Name:     "VAM1",
//				Sequence: 10,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupVlanAccessMap(ctx *pulumi.Context, args *LookupVlanAccessMapArgs, opts ...pulumi.InvokeOption) (*LookupVlanAccessMapResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupVlanAccessMapResult
	err := ctx.Invoke("iosxe:index/getVlanAccessMap:getVlanAccessMap", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVlanAccessMap.
type LookupVlanAccessMapArgs struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// Vlan access map tag
	Name string `pulumi:"name"`
	// Sequence to insert to/delete from existing vlan access-map entry
	Sequence int `pulumi:"sequence"`
}

// A collection of values returned by getVlanAccessMap.
type LookupVlanAccessMapResult struct {
	// Take the action
	Action string `pulumi:"action"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// The path of the retrieved object.
	Id               string   `pulumi:"id"`
	MatchIpAddresses []string `pulumi:"matchIpAddresses"`
	// Match IPv6 address to access control.
	MatchIpv6Addresses []string `pulumi:"matchIpv6Addresses"`
	// Vlan access map tag
	Name string `pulumi:"name"`
	// Sequence to insert to/delete from existing vlan access-map entry
	Sequence int `pulumi:"sequence"`
}

func LookupVlanAccessMapOutput(ctx *pulumi.Context, args LookupVlanAccessMapOutputArgs, opts ...pulumi.InvokeOption) LookupVlanAccessMapResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupVlanAccessMapResult, error) {
			args := v.(LookupVlanAccessMapArgs)
			r, err := LookupVlanAccessMap(ctx, &args, opts...)
			var s LookupVlanAccessMapResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupVlanAccessMapResultOutput)
}

// A collection of arguments for invoking getVlanAccessMap.
type LookupVlanAccessMapOutputArgs struct {
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput `pulumi:"device"`
	// Vlan access map tag
	Name pulumi.StringInput `pulumi:"name"`
	// Sequence to insert to/delete from existing vlan access-map entry
	Sequence pulumi.IntInput `pulumi:"sequence"`
}

func (LookupVlanAccessMapOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVlanAccessMapArgs)(nil)).Elem()
}

// A collection of values returned by getVlanAccessMap.
type LookupVlanAccessMapResultOutput struct{ *pulumi.OutputState }

func (LookupVlanAccessMapResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVlanAccessMapResult)(nil)).Elem()
}

func (o LookupVlanAccessMapResultOutput) ToLookupVlanAccessMapResultOutput() LookupVlanAccessMapResultOutput {
	return o
}

func (o LookupVlanAccessMapResultOutput) ToLookupVlanAccessMapResultOutputWithContext(ctx context.Context) LookupVlanAccessMapResultOutput {
	return o
}

func (o LookupVlanAccessMapResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupVlanAccessMapResult] {
	return pulumix.Output[LookupVlanAccessMapResult]{
		OutputState: o.OutputState,
	}
}

// Take the action
func (o LookupVlanAccessMapResultOutput) Action() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVlanAccessMapResult) string { return v.Action }).(pulumi.StringOutput)
}

// A device name from the provider configuration.
func (o LookupVlanAccessMapResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupVlanAccessMapResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// The path of the retrieved object.
func (o LookupVlanAccessMapResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVlanAccessMapResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupVlanAccessMapResultOutput) MatchIpAddresses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupVlanAccessMapResult) []string { return v.MatchIpAddresses }).(pulumi.StringArrayOutput)
}

// Match IPv6 address to access control.
func (o LookupVlanAccessMapResultOutput) MatchIpv6Addresses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupVlanAccessMapResult) []string { return v.MatchIpv6Addresses }).(pulumi.StringArrayOutput)
}

// Vlan access map tag
func (o LookupVlanAccessMapResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVlanAccessMapResult) string { return v.Name }).(pulumi.StringOutput)
}

// Sequence to insert to/delete from existing vlan access-map entry
func (o LookupVlanAccessMapResultOutput) Sequence() pulumi.IntOutput {
	return o.ApplyT(func(v LookupVlanAccessMapResult) int { return v.Sequence }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupVlanAccessMapResultOutput{})
}