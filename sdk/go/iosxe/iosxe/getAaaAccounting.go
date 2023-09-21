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

func LookupAaaAccounting(ctx *pulumi.Context, args *LookupAaaAccountingArgs, opts ...pulumi.InvokeOption) (*LookupAaaAccountingResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAaaAccountingResult
	err := ctx.Invoke("iosxe:iosxe/getAaaAccounting:getAaaAccounting", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAaaAccounting.
type LookupAaaAccountingArgs struct {
	Device *string `pulumi:"device"`
}

// A collection of values returned by getAaaAccounting.
type LookupAaaAccountingResult struct {
	Device                         *string                   `pulumi:"device"`
	Execs                          []GetAaaAccountingExec    `pulumi:"execs"`
	Id                             string                    `pulumi:"id"`
	IdentityDefaultStartStopGroup1 string                    `pulumi:"identityDefaultStartStopGroup1"`
	IdentityDefaultStartStopGroup2 string                    `pulumi:"identityDefaultStartStopGroup2"`
	IdentityDefaultStartStopGroup3 string                    `pulumi:"identityDefaultStartStopGroup3"`
	IdentityDefaultStartStopGroup4 string                    `pulumi:"identityDefaultStartStopGroup4"`
	Networks                       []GetAaaAccountingNetwork `pulumi:"networks"`
	SystemGuaranteeFirst           bool                      `pulumi:"systemGuaranteeFirst"`
	UpdateNewinfoPeriodic          int                       `pulumi:"updateNewinfoPeriodic"`
}

func LookupAaaAccountingOutput(ctx *pulumi.Context, args LookupAaaAccountingOutputArgs, opts ...pulumi.InvokeOption) LookupAaaAccountingResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAaaAccountingResult, error) {
			args := v.(LookupAaaAccountingArgs)
			r, err := LookupAaaAccounting(ctx, &args, opts...)
			var s LookupAaaAccountingResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAaaAccountingResultOutput)
}

// A collection of arguments for invoking getAaaAccounting.
type LookupAaaAccountingOutputArgs struct {
	Device pulumi.StringPtrInput `pulumi:"device"`
}

func (LookupAaaAccountingOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAaaAccountingArgs)(nil)).Elem()
}

// A collection of values returned by getAaaAccounting.
type LookupAaaAccountingResultOutput struct{ *pulumi.OutputState }

func (LookupAaaAccountingResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAaaAccountingResult)(nil)).Elem()
}

func (o LookupAaaAccountingResultOutput) ToLookupAaaAccountingResultOutput() LookupAaaAccountingResultOutput {
	return o
}

func (o LookupAaaAccountingResultOutput) ToLookupAaaAccountingResultOutputWithContext(ctx context.Context) LookupAaaAccountingResultOutput {
	return o
}

func (o LookupAaaAccountingResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupAaaAccountingResult] {
	return pulumix.Output[LookupAaaAccountingResult]{
		OutputState: o.OutputState,
	}
}

func (o LookupAaaAccountingResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAaaAccountingResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

func (o LookupAaaAccountingResultOutput) Execs() GetAaaAccountingExecArrayOutput {
	return o.ApplyT(func(v LookupAaaAccountingResult) []GetAaaAccountingExec { return v.Execs }).(GetAaaAccountingExecArrayOutput)
}

func (o LookupAaaAccountingResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAaaAccountingResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAaaAccountingResultOutput) IdentityDefaultStartStopGroup1() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAaaAccountingResult) string { return v.IdentityDefaultStartStopGroup1 }).(pulumi.StringOutput)
}

func (o LookupAaaAccountingResultOutput) IdentityDefaultStartStopGroup2() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAaaAccountingResult) string { return v.IdentityDefaultStartStopGroup2 }).(pulumi.StringOutput)
}

func (o LookupAaaAccountingResultOutput) IdentityDefaultStartStopGroup3() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAaaAccountingResult) string { return v.IdentityDefaultStartStopGroup3 }).(pulumi.StringOutput)
}

func (o LookupAaaAccountingResultOutput) IdentityDefaultStartStopGroup4() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAaaAccountingResult) string { return v.IdentityDefaultStartStopGroup4 }).(pulumi.StringOutput)
}

func (o LookupAaaAccountingResultOutput) Networks() GetAaaAccountingNetworkArrayOutput {
	return o.ApplyT(func(v LookupAaaAccountingResult) []GetAaaAccountingNetwork { return v.Networks }).(GetAaaAccountingNetworkArrayOutput)
}

func (o LookupAaaAccountingResultOutput) SystemGuaranteeFirst() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAaaAccountingResult) bool { return v.SystemGuaranteeFirst }).(pulumi.BoolOutput)
}

func (o LookupAaaAccountingResultOutput) UpdateNewinfoPeriodic() pulumi.IntOutput {
	return o.ApplyT(func(v LookupAaaAccountingResult) int { return v.UpdateNewinfoPeriodic }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAaaAccountingResultOutput{})
}