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

func LookupErrdisable(ctx *pulumi.Context, args *LookupErrdisableArgs, opts ...pulumi.InvokeOption) (*LookupErrdisableResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupErrdisableResult
	err := ctx.Invoke("iosxe:iosxe/getErrdisable:getErrdisable", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getErrdisable.
type LookupErrdisableArgs struct {
	Device *string `pulumi:"device"`
}

// A collection of values returned by getErrdisable.
type LookupErrdisableResult struct {
	DetectCauseAll                           bool    `pulumi:"detectCauseAll"`
	DetectCauseArpInspection                 bool    `pulumi:"detectCauseArpInspection"`
	DetectCauseBpduguard                     bool    `pulumi:"detectCauseBpduguard"`
	DetectCauseDhcpRateLimit                 bool    `pulumi:"detectCauseDhcpRateLimit"`
	DetectCauseDtpFlap                       bool    `pulumi:"detectCauseDtpFlap"`
	DetectCauseGbicInvalid                   bool    `pulumi:"detectCauseGbicInvalid"`
	DetectCauseInlinePower                   bool    `pulumi:"detectCauseInlinePower"`
	DetectCauseL2ptguard                     bool    `pulumi:"detectCauseL2ptguard"`
	DetectCauseLinkFlap                      bool    `pulumi:"detectCauseLinkFlap"`
	DetectCauseLoopback                      bool    `pulumi:"detectCauseLoopback"`
	DetectCauseLoopdetect                    bool    `pulumi:"detectCauseLoopdetect"`
	DetectCauseMlacpMinlink                  bool    `pulumi:"detectCauseMlacpMinlink"`
	DetectCausePagpFlap                      bool    `pulumi:"detectCausePagpFlap"`
	DetectCausePppoeIaRateLimit              bool    `pulumi:"detectCausePppoeIaRateLimit"`
	DetectCauseSecurityViolationShutdownVlan bool    `pulumi:"detectCauseSecurityViolationShutdownVlan"`
	DetectCauseSfpConfigMismatch             bool    `pulumi:"detectCauseSfpConfigMismatch"`
	DetectCauseSmallFrame                    bool    `pulumi:"detectCauseSmallFrame"`
	Device                                   *string `pulumi:"device"`
	FlapSettingCauseDtpFlapMaxFlaps          int     `pulumi:"flapSettingCauseDtpFlapMaxFlaps"`
	FlapSettingCauseDtpFlapTime              int     `pulumi:"flapSettingCauseDtpFlapTime"`
	FlapSettingCauseLinkFlapMaxFlaps         int     `pulumi:"flapSettingCauseLinkFlapMaxFlaps"`
	FlapSettingCauseLinkFlapTime             int     `pulumi:"flapSettingCauseLinkFlapTime"`
	FlapSettingCausePagpFlapMaxFlaps         int     `pulumi:"flapSettingCausePagpFlapMaxFlaps"`
	FlapSettingCausePagpFlapTime             int     `pulumi:"flapSettingCausePagpFlapTime"`
	Id                                       string  `pulumi:"id"`
	RecoveryCauseAll                         bool    `pulumi:"recoveryCauseAll"`
	RecoveryCauseArpInspection               bool    `pulumi:"recoveryCauseArpInspection"`
	RecoveryCauseBpduguard                   bool    `pulumi:"recoveryCauseBpduguard"`
	RecoveryCauseChannelMisconfig            bool    `pulumi:"recoveryCauseChannelMisconfig"`
	RecoveryCauseDhcpRateLimit               bool    `pulumi:"recoveryCauseDhcpRateLimit"`
	RecoveryCauseDtpFlap                     bool    `pulumi:"recoveryCauseDtpFlap"`
	RecoveryCauseGbicInvalid                 bool    `pulumi:"recoveryCauseGbicInvalid"`
	RecoveryCauseInlinePower                 bool    `pulumi:"recoveryCauseInlinePower"`
	RecoveryCauseL2ptguard                   bool    `pulumi:"recoveryCauseL2ptguard"`
	RecoveryCauseLinkFlap                    bool    `pulumi:"recoveryCauseLinkFlap"`
	RecoveryCauseLinkMonitorFailure          bool    `pulumi:"recoveryCauseLinkMonitorFailure"`
	RecoveryCauseLoopback                    bool    `pulumi:"recoveryCauseLoopback"`
	RecoveryCauseLoopdetect                  bool    `pulumi:"recoveryCauseLoopdetect"`
	RecoveryCauseMacLimit                    bool    `pulumi:"recoveryCauseMacLimit"`
	RecoveryCauseMlacpMinlink                bool    `pulumi:"recoveryCauseMlacpMinlink"`
	RecoveryCausePagpFlap                    bool    `pulumi:"recoveryCausePagpFlap"`
	RecoveryCausePortModeFailure             bool    `pulumi:"recoveryCausePortModeFailure"`
	RecoveryCausePppoeIaRateLimit            bool    `pulumi:"recoveryCausePppoeIaRateLimit"`
	RecoveryCausePsecureViolation            bool    `pulumi:"recoveryCausePsecureViolation"`
	RecoveryCausePsp                         bool    `pulumi:"recoveryCausePsp"`
	RecoveryCauseSecurityViolation           bool    `pulumi:"recoveryCauseSecurityViolation"`
	RecoveryCauseSfpConfigMismatch           bool    `pulumi:"recoveryCauseSfpConfigMismatch"`
	RecoveryCauseSmallFrame                  bool    `pulumi:"recoveryCauseSmallFrame"`
	RecoveryCauseStormControl                bool    `pulumi:"recoveryCauseStormControl"`
	RecoveryCauseUdld                        bool    `pulumi:"recoveryCauseUdld"`
	RecoveryCauseUnicastFlood                bool    `pulumi:"recoveryCauseUnicastFlood"`
	RecoveryCauseVmps                        bool    `pulumi:"recoveryCauseVmps"`
	RecoveryInterval                         int     `pulumi:"recoveryInterval"`
}

func LookupErrdisableOutput(ctx *pulumi.Context, args LookupErrdisableOutputArgs, opts ...pulumi.InvokeOption) LookupErrdisableResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupErrdisableResult, error) {
			args := v.(LookupErrdisableArgs)
			r, err := LookupErrdisable(ctx, &args, opts...)
			var s LookupErrdisableResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupErrdisableResultOutput)
}

// A collection of arguments for invoking getErrdisable.
type LookupErrdisableOutputArgs struct {
	Device pulumi.StringPtrInput `pulumi:"device"`
}

func (LookupErrdisableOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupErrdisableArgs)(nil)).Elem()
}

// A collection of values returned by getErrdisable.
type LookupErrdisableResultOutput struct{ *pulumi.OutputState }

func (LookupErrdisableResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupErrdisableResult)(nil)).Elem()
}

func (o LookupErrdisableResultOutput) ToLookupErrdisableResultOutput() LookupErrdisableResultOutput {
	return o
}

func (o LookupErrdisableResultOutput) ToLookupErrdisableResultOutputWithContext(ctx context.Context) LookupErrdisableResultOutput {
	return o
}

func (o LookupErrdisableResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupErrdisableResult] {
	return pulumix.Output[LookupErrdisableResult]{
		OutputState: o.OutputState,
	}
}

func (o LookupErrdisableResultOutput) DetectCauseAll() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseAll }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) DetectCauseArpInspection() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseArpInspection }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) DetectCauseBpduguard() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseBpduguard }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) DetectCauseDhcpRateLimit() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseDhcpRateLimit }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) DetectCauseDtpFlap() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseDtpFlap }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) DetectCauseGbicInvalid() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseGbicInvalid }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) DetectCauseInlinePower() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseInlinePower }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) DetectCauseL2ptguard() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseL2ptguard }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) DetectCauseLinkFlap() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseLinkFlap }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) DetectCauseLoopback() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseLoopback }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) DetectCauseLoopdetect() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseLoopdetect }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) DetectCauseMlacpMinlink() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseMlacpMinlink }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) DetectCausePagpFlap() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCausePagpFlap }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) DetectCausePppoeIaRateLimit() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCausePppoeIaRateLimit }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) DetectCauseSecurityViolationShutdownVlan() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseSecurityViolationShutdownVlan }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) DetectCauseSfpConfigMismatch() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseSfpConfigMismatch }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) DetectCauseSmallFrame() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseSmallFrame }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupErrdisableResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

func (o LookupErrdisableResultOutput) FlapSettingCauseDtpFlapMaxFlaps() pulumi.IntOutput {
	return o.ApplyT(func(v LookupErrdisableResult) int { return v.FlapSettingCauseDtpFlapMaxFlaps }).(pulumi.IntOutput)
}

func (o LookupErrdisableResultOutput) FlapSettingCauseDtpFlapTime() pulumi.IntOutput {
	return o.ApplyT(func(v LookupErrdisableResult) int { return v.FlapSettingCauseDtpFlapTime }).(pulumi.IntOutput)
}

func (o LookupErrdisableResultOutput) FlapSettingCauseLinkFlapMaxFlaps() pulumi.IntOutput {
	return o.ApplyT(func(v LookupErrdisableResult) int { return v.FlapSettingCauseLinkFlapMaxFlaps }).(pulumi.IntOutput)
}

func (o LookupErrdisableResultOutput) FlapSettingCauseLinkFlapTime() pulumi.IntOutput {
	return o.ApplyT(func(v LookupErrdisableResult) int { return v.FlapSettingCauseLinkFlapTime }).(pulumi.IntOutput)
}

func (o LookupErrdisableResultOutput) FlapSettingCausePagpFlapMaxFlaps() pulumi.IntOutput {
	return o.ApplyT(func(v LookupErrdisableResult) int { return v.FlapSettingCausePagpFlapMaxFlaps }).(pulumi.IntOutput)
}

func (o LookupErrdisableResultOutput) FlapSettingCausePagpFlapTime() pulumi.IntOutput {
	return o.ApplyT(func(v LookupErrdisableResult) int { return v.FlapSettingCausePagpFlapTime }).(pulumi.IntOutput)
}

func (o LookupErrdisableResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupErrdisableResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseAll() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseAll }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseArpInspection() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseArpInspection }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseBpduguard() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseBpduguard }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseChannelMisconfig() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseChannelMisconfig }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseDhcpRateLimit() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseDhcpRateLimit }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseDtpFlap() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseDtpFlap }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseGbicInvalid() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseGbicInvalid }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseInlinePower() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseInlinePower }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseL2ptguard() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseL2ptguard }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseLinkFlap() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseLinkFlap }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseLinkMonitorFailure() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseLinkMonitorFailure }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseLoopback() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseLoopback }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseLoopdetect() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseLoopdetect }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseMacLimit() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseMacLimit }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseMlacpMinlink() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseMlacpMinlink }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCausePagpFlap() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCausePagpFlap }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCausePortModeFailure() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCausePortModeFailure }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCausePppoeIaRateLimit() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCausePppoeIaRateLimit }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCausePsecureViolation() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCausePsecureViolation }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCausePsp() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCausePsp }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseSecurityViolation() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseSecurityViolation }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseSfpConfigMismatch() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseSfpConfigMismatch }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseSmallFrame() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseSmallFrame }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseStormControl() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseStormControl }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseUdld() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseUdld }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseUnicastFlood() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseUnicastFlood }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseVmps() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseVmps }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryInterval() pulumi.IntOutput {
	return o.ApplyT(func(v LookupErrdisableResult) int { return v.RecoveryInterval }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupErrdisableResultOutput{})
}