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

func LookupDot1x(ctx *pulumi.Context, args *LookupDot1xArgs, opts ...pulumi.InvokeOption) (*LookupDot1xResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDot1xResult
	err := ctx.Invoke("iosxe:iosxe/getDot1x:getDot1x", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDot1x.
type LookupDot1xArgs struct {
	Device *string `pulumi:"device"`
}

// A collection of values returned by getDot1x.
type LookupDot1xResult struct {
	AuthFailEapol                 bool                 `pulumi:"authFailEapol"`
	Credentials                   []GetDot1xCredential `pulumi:"credentials"`
	CriticalEapolConfigBlock      bool                 `pulumi:"criticalEapolConfigBlock"`
	CriticalRecoveryDelay         int                  `pulumi:"criticalRecoveryDelay"`
	Device                        *string              `pulumi:"device"`
	Id                            string               `pulumi:"id"`
	LoggingVerbose                bool                 `pulumi:"loggingVerbose"`
	SupplicantControlledTransient bool                 `pulumi:"supplicantControlledTransient"`
	SupplicantForceMulticast      bool                 `pulumi:"supplicantForceMulticast"`
	SystemAuthControl             bool                 `pulumi:"systemAuthControl"`
	TestTimeout                   int                  `pulumi:"testTimeout"`
}

func LookupDot1xOutput(ctx *pulumi.Context, args LookupDot1xOutputArgs, opts ...pulumi.InvokeOption) LookupDot1xResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDot1xResult, error) {
			args := v.(LookupDot1xArgs)
			r, err := LookupDot1x(ctx, &args, opts...)
			var s LookupDot1xResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupDot1xResultOutput)
}

// A collection of arguments for invoking getDot1x.
type LookupDot1xOutputArgs struct {
	Device pulumi.StringPtrInput `pulumi:"device"`
}

func (LookupDot1xOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDot1xArgs)(nil)).Elem()
}

// A collection of values returned by getDot1x.
type LookupDot1xResultOutput struct{ *pulumi.OutputState }

func (LookupDot1xResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDot1xResult)(nil)).Elem()
}

func (o LookupDot1xResultOutput) ToLookupDot1xResultOutput() LookupDot1xResultOutput {
	return o
}

func (o LookupDot1xResultOutput) ToLookupDot1xResultOutputWithContext(ctx context.Context) LookupDot1xResultOutput {
	return o
}

func (o LookupDot1xResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupDot1xResult] {
	return pulumix.Output[LookupDot1xResult]{
		OutputState: o.OutputState,
	}
}

func (o LookupDot1xResultOutput) AuthFailEapol() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDot1xResult) bool { return v.AuthFailEapol }).(pulumi.BoolOutput)
}

func (o LookupDot1xResultOutput) Credentials() GetDot1xCredentialArrayOutput {
	return o.ApplyT(func(v LookupDot1xResult) []GetDot1xCredential { return v.Credentials }).(GetDot1xCredentialArrayOutput)
}

func (o LookupDot1xResultOutput) CriticalEapolConfigBlock() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDot1xResult) bool { return v.CriticalEapolConfigBlock }).(pulumi.BoolOutput)
}

func (o LookupDot1xResultOutput) CriticalRecoveryDelay() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDot1xResult) int { return v.CriticalRecoveryDelay }).(pulumi.IntOutput)
}

func (o LookupDot1xResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupDot1xResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

func (o LookupDot1xResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDot1xResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupDot1xResultOutput) LoggingVerbose() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDot1xResult) bool { return v.LoggingVerbose }).(pulumi.BoolOutput)
}

func (o LookupDot1xResultOutput) SupplicantControlledTransient() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDot1xResult) bool { return v.SupplicantControlledTransient }).(pulumi.BoolOutput)
}

func (o LookupDot1xResultOutput) SupplicantForceMulticast() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDot1xResult) bool { return v.SupplicantForceMulticast }).(pulumi.BoolOutput)
}

func (o LookupDot1xResultOutput) SystemAuthControl() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDot1xResult) bool { return v.SystemAuthControl }).(pulumi.BoolOutput)
}

func (o LookupDot1xResultOutput) TestTimeout() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDot1xResult) int { return v.TestTimeout }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDot1xResultOutput{})
}