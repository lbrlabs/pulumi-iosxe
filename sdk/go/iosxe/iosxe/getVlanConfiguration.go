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

func LookupVlanConfiguration(ctx *pulumi.Context, args *LookupVlanConfigurationArgs, opts ...pulumi.InvokeOption) (*LookupVlanConfigurationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupVlanConfigurationResult
	err := ctx.Invoke("iosxe:iosxe/getVlanConfiguration:getVlanConfiguration", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVlanConfiguration.
type LookupVlanConfigurationArgs struct {
	Device *string `pulumi:"device"`
	VlanId int     `pulumi:"vlanId"`
}

// A collection of values returned by getVlanConfiguration.
type LookupVlanConfigurationResult struct {
	AccessVfi       string  `pulumi:"accessVfi"`
	Device          *string `pulumi:"device"`
	EvpnInstance    int     `pulumi:"evpnInstance"`
	EvpnInstanceVni int     `pulumi:"evpnInstanceVni"`
	Id              string  `pulumi:"id"`
	VlanId          int     `pulumi:"vlanId"`
	Vni             int     `pulumi:"vni"`
}

func LookupVlanConfigurationOutput(ctx *pulumi.Context, args LookupVlanConfigurationOutputArgs, opts ...pulumi.InvokeOption) LookupVlanConfigurationResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupVlanConfigurationResult, error) {
			args := v.(LookupVlanConfigurationArgs)
			r, err := LookupVlanConfiguration(ctx, &args, opts...)
			var s LookupVlanConfigurationResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupVlanConfigurationResultOutput)
}

// A collection of arguments for invoking getVlanConfiguration.
type LookupVlanConfigurationOutputArgs struct {
	Device pulumi.StringPtrInput `pulumi:"device"`
	VlanId pulumi.IntInput       `pulumi:"vlanId"`
}

func (LookupVlanConfigurationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVlanConfigurationArgs)(nil)).Elem()
}

// A collection of values returned by getVlanConfiguration.
type LookupVlanConfigurationResultOutput struct{ *pulumi.OutputState }

func (LookupVlanConfigurationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVlanConfigurationResult)(nil)).Elem()
}

func (o LookupVlanConfigurationResultOutput) ToLookupVlanConfigurationResultOutput() LookupVlanConfigurationResultOutput {
	return o
}

func (o LookupVlanConfigurationResultOutput) ToLookupVlanConfigurationResultOutputWithContext(ctx context.Context) LookupVlanConfigurationResultOutput {
	return o
}

func (o LookupVlanConfigurationResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupVlanConfigurationResult] {
	return pulumix.Output[LookupVlanConfigurationResult]{
		OutputState: o.OutputState,
	}
}

func (o LookupVlanConfigurationResultOutput) AccessVfi() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVlanConfigurationResult) string { return v.AccessVfi }).(pulumi.StringOutput)
}

func (o LookupVlanConfigurationResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupVlanConfigurationResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

func (o LookupVlanConfigurationResultOutput) EvpnInstance() pulumi.IntOutput {
	return o.ApplyT(func(v LookupVlanConfigurationResult) int { return v.EvpnInstance }).(pulumi.IntOutput)
}

func (o LookupVlanConfigurationResultOutput) EvpnInstanceVni() pulumi.IntOutput {
	return o.ApplyT(func(v LookupVlanConfigurationResult) int { return v.EvpnInstanceVni }).(pulumi.IntOutput)
}

func (o LookupVlanConfigurationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVlanConfigurationResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupVlanConfigurationResultOutput) VlanId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupVlanConfigurationResult) int { return v.VlanId }).(pulumi.IntOutput)
}

func (o LookupVlanConfigurationResultOutput) Vni() pulumi.IntOutput {
	return o.ApplyT(func(v LookupVlanConfigurationResult) int { return v.Vni }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupVlanConfigurationResultOutput{})
}