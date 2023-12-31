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

// This data source can read the Errdisable configuration.
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
//			_, err := iosxe.LookupErrdisable(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupErrdisable(ctx *pulumi.Context, args *LookupErrdisableArgs, opts ...pulumi.InvokeOption) (*LookupErrdisableResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupErrdisableResult
	err := ctx.Invoke("iosxe:index/getErrdisable:getErrdisable", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getErrdisable.
type LookupErrdisableArgs struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
}

// A collection of values returned by getErrdisable.
type LookupErrdisableResult struct {
	// Enable error detection on all cases
	DetectCauseAll bool `pulumi:"detectCauseAll"`
	// Enable error detection for arp inspection
	DetectCauseArpInspection bool `pulumi:"detectCauseArpInspection"`
	// Enable error detection on bpdu-guard
	DetectCauseBpduguard bool `pulumi:"detectCauseBpduguard"`
	// Enable error detection on dhcp-rate-limit
	DetectCauseDhcpRateLimit bool `pulumi:"detectCauseDhcpRateLimit"`
	// Enable error detection on dtp-flapping
	DetectCauseDtpFlap bool `pulumi:"detectCauseDtpFlap"`
	// Enable error detection on gbic-invalid
	DetectCauseGbicInvalid bool `pulumi:"detectCauseGbicInvalid"`
	// Enable error detection for inline-power
	DetectCauseInlinePower bool `pulumi:"detectCauseInlinePower"`
	// Enable timer to recover from l2protocol-tunnel error disable state
	DetectCauseL2ptguard bool `pulumi:"detectCauseL2ptguard"`
	// Enable error detection on linkstate-flapping
	DetectCauseLinkFlap bool `pulumi:"detectCauseLinkFlap"`
	// Enable error detection on loopback
	DetectCauseLoopback bool `pulumi:"detectCauseLoopback"`
	// Enable error detection on loop detect
	DetectCauseLoopdetect   bool `pulumi:"detectCauseLoopdetect"`
	DetectCauseMlacpMinlink bool `pulumi:"detectCauseMlacpMinlink"`
	// Enable error detection on pagp-flapping
	DetectCausePagpFlap bool `pulumi:"detectCausePagpFlap"`
	// Enable error detection on PPPoE IA rate-limit
	DetectCausePppoeIaRateLimit bool `pulumi:"detectCausePppoeIaRateLimit"`
	// Shutdown vlan on 802.1x-guard violation
	DetectCauseSecurityViolationShutdownVlan bool `pulumi:"detectCauseSecurityViolationShutdownVlan"`
	// Enable error detection on SFP config mismatch
	DetectCauseSfpConfigMismatch bool `pulumi:"detectCauseSfpConfigMismatch"`
	// Enable error detection on small_frame
	DetectCauseSmallFrame bool `pulumi:"detectCauseSmallFrame"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// maximum flaps allowed before setting to errdisable
	FlapSettingCauseDtpFlapMaxFlaps int `pulumi:"flapSettingCauseDtpFlapMaxFlaps"`
	// time period the flaps are counted
	FlapSettingCauseDtpFlapTime int `pulumi:"flapSettingCauseDtpFlapTime"`
	// maximum flaps allowed before setting to errdisable
	FlapSettingCauseLinkFlapMaxFlaps int `pulumi:"flapSettingCauseLinkFlapMaxFlaps"`
	// time period the flaps are counted
	FlapSettingCauseLinkFlapTime int `pulumi:"flapSettingCauseLinkFlapTime"`
	// maximum flaps allowed before setting to errdisable
	FlapSettingCausePagpFlapMaxFlaps int `pulumi:"flapSettingCausePagpFlapMaxFlaps"`
	// time period the flaps are counted
	FlapSettingCausePagpFlapTime int `pulumi:"flapSettingCausePagpFlapTime"`
	// The path of the retrieved object.
	Id string `pulumi:"id"`
	// Enable timer to recover from all error causes
	RecoveryCauseAll bool `pulumi:"recoveryCauseAll"`
	// Enable timer to recover from arp inspection error disable state
	RecoveryCauseArpInspection bool `pulumi:"recoveryCauseArpInspection"`
	// Enable timer to recover from BPDU Guard error
	RecoveryCauseBpduguard bool `pulumi:"recoveryCauseBpduguard"`
	// (STP)  Enable timer to recover from channel misconfiguration error
	RecoveryCauseChannelMisconfig bool `pulumi:"recoveryCauseChannelMisconfig"`
	// Enable timer to recover from dhcp-rate-limit error
	RecoveryCauseDhcpRateLimit bool `pulumi:"recoveryCauseDhcpRateLimit"`
	// Enable timer to recover from dtp-flap error
	RecoveryCauseDtpFlap bool `pulumi:"recoveryCauseDtpFlap"`
	// Enable timer to recover from invalid GBIC error
	RecoveryCauseGbicInvalid bool `pulumi:"recoveryCauseGbicInvalid"`
	// Enable timer to recover from inline-power error
	RecoveryCauseInlinePower bool `pulumi:"recoveryCauseInlinePower"`
	// Enable timer to recover from l2protocol-tunnel error disable state
	RecoveryCauseL2ptguard bool `pulumi:"recoveryCauseL2ptguard"`
	// Enable timer to recover from link-flap error
	RecoveryCauseLinkFlap           bool `pulumi:"recoveryCauseLinkFlap"`
	RecoveryCauseLinkMonitorFailure bool `pulumi:"recoveryCauseLinkMonitorFailure"`
	// Enable timer to recover from loopback error
	RecoveryCauseLoopback bool `pulumi:"recoveryCauseLoopback"`
	// Enable timer to recover from loop detect error
	RecoveryCauseLoopdetect bool `pulumi:"recoveryCauseLoopdetect"`
	// Enable timer to recover from mac limit disable state
	RecoveryCauseMacLimit     bool `pulumi:"recoveryCauseMacLimit"`
	RecoveryCauseMlacpMinlink bool `pulumi:"recoveryCauseMlacpMinlink"`
	// Enable timer to recover from pagp-flap error
	RecoveryCausePagpFlap bool `pulumi:"recoveryCausePagpFlap"`
	// Enable timer to recover from port mode change failure
	RecoveryCausePortModeFailure bool `pulumi:"recoveryCausePortModeFailure"`
	// Enable timer to recover from PPPoE IA rate-limit error
	RecoveryCausePppoeIaRateLimit bool `pulumi:"recoveryCausePppoeIaRateLimit"`
	// Enable timer to recover from psecure violation error
	RecoveryCausePsecureViolation bool `pulumi:"recoveryCausePsecureViolation"`
	RecoveryCausePsp              bool `pulumi:"recoveryCausePsp"`
	// Enable timer to recover from 802.1x violation error
	RecoveryCauseSecurityViolation bool `pulumi:"recoveryCauseSecurityViolation"`
	// Enable timer to recover from SFP config mismatch error
	RecoveryCauseSfpConfigMismatch bool `pulumi:"recoveryCauseSfpConfigMismatch"`
	// Enable timer to recover from small frame error
	RecoveryCauseSmallFrame bool `pulumi:"recoveryCauseSmallFrame"`
	// Enable timer to recover from storm-control error
	RecoveryCauseStormControl bool `pulumi:"recoveryCauseStormControl"`
	// Enable timer to recover from udld error
	RecoveryCauseUdld         bool `pulumi:"recoveryCauseUdld"`
	RecoveryCauseUnicastFlood bool `pulumi:"recoveryCauseUnicastFlood"`
	// Enable timer to recover from vmps shutdown error
	RecoveryCauseVmps bool `pulumi:"recoveryCauseVmps"`
	// Error disable recovery timer value
	RecoveryInterval int `pulumi:"recoveryInterval"`
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
	// A device name from the provider configuration.
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

// Enable error detection on all cases
func (o LookupErrdisableResultOutput) DetectCauseAll() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseAll }).(pulumi.BoolOutput)
}

// Enable error detection for arp inspection
func (o LookupErrdisableResultOutput) DetectCauseArpInspection() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseArpInspection }).(pulumi.BoolOutput)
}

// Enable error detection on bpdu-guard
func (o LookupErrdisableResultOutput) DetectCauseBpduguard() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseBpduguard }).(pulumi.BoolOutput)
}

// Enable error detection on dhcp-rate-limit
func (o LookupErrdisableResultOutput) DetectCauseDhcpRateLimit() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseDhcpRateLimit }).(pulumi.BoolOutput)
}

// Enable error detection on dtp-flapping
func (o LookupErrdisableResultOutput) DetectCauseDtpFlap() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseDtpFlap }).(pulumi.BoolOutput)
}

// Enable error detection on gbic-invalid
func (o LookupErrdisableResultOutput) DetectCauseGbicInvalid() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseGbicInvalid }).(pulumi.BoolOutput)
}

// Enable error detection for inline-power
func (o LookupErrdisableResultOutput) DetectCauseInlinePower() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseInlinePower }).(pulumi.BoolOutput)
}

// Enable timer to recover from l2protocol-tunnel error disable state
func (o LookupErrdisableResultOutput) DetectCauseL2ptguard() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseL2ptguard }).(pulumi.BoolOutput)
}

// Enable error detection on linkstate-flapping
func (o LookupErrdisableResultOutput) DetectCauseLinkFlap() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseLinkFlap }).(pulumi.BoolOutput)
}

// Enable error detection on loopback
func (o LookupErrdisableResultOutput) DetectCauseLoopback() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseLoopback }).(pulumi.BoolOutput)
}

// Enable error detection on loop detect
func (o LookupErrdisableResultOutput) DetectCauseLoopdetect() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseLoopdetect }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) DetectCauseMlacpMinlink() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseMlacpMinlink }).(pulumi.BoolOutput)
}

// Enable error detection on pagp-flapping
func (o LookupErrdisableResultOutput) DetectCausePagpFlap() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCausePagpFlap }).(pulumi.BoolOutput)
}

// Enable error detection on PPPoE IA rate-limit
func (o LookupErrdisableResultOutput) DetectCausePppoeIaRateLimit() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCausePppoeIaRateLimit }).(pulumi.BoolOutput)
}

// Shutdown vlan on 802.1x-guard violation
func (o LookupErrdisableResultOutput) DetectCauseSecurityViolationShutdownVlan() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseSecurityViolationShutdownVlan }).(pulumi.BoolOutput)
}

// Enable error detection on SFP config mismatch
func (o LookupErrdisableResultOutput) DetectCauseSfpConfigMismatch() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseSfpConfigMismatch }).(pulumi.BoolOutput)
}

// Enable error detection on small_frame
func (o LookupErrdisableResultOutput) DetectCauseSmallFrame() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.DetectCauseSmallFrame }).(pulumi.BoolOutput)
}

// A device name from the provider configuration.
func (o LookupErrdisableResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupErrdisableResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// maximum flaps allowed before setting to errdisable
func (o LookupErrdisableResultOutput) FlapSettingCauseDtpFlapMaxFlaps() pulumi.IntOutput {
	return o.ApplyT(func(v LookupErrdisableResult) int { return v.FlapSettingCauseDtpFlapMaxFlaps }).(pulumi.IntOutput)
}

// time period the flaps are counted
func (o LookupErrdisableResultOutput) FlapSettingCauseDtpFlapTime() pulumi.IntOutput {
	return o.ApplyT(func(v LookupErrdisableResult) int { return v.FlapSettingCauseDtpFlapTime }).(pulumi.IntOutput)
}

// maximum flaps allowed before setting to errdisable
func (o LookupErrdisableResultOutput) FlapSettingCauseLinkFlapMaxFlaps() pulumi.IntOutput {
	return o.ApplyT(func(v LookupErrdisableResult) int { return v.FlapSettingCauseLinkFlapMaxFlaps }).(pulumi.IntOutput)
}

// time period the flaps are counted
func (o LookupErrdisableResultOutput) FlapSettingCauseLinkFlapTime() pulumi.IntOutput {
	return o.ApplyT(func(v LookupErrdisableResult) int { return v.FlapSettingCauseLinkFlapTime }).(pulumi.IntOutput)
}

// maximum flaps allowed before setting to errdisable
func (o LookupErrdisableResultOutput) FlapSettingCausePagpFlapMaxFlaps() pulumi.IntOutput {
	return o.ApplyT(func(v LookupErrdisableResult) int { return v.FlapSettingCausePagpFlapMaxFlaps }).(pulumi.IntOutput)
}

// time period the flaps are counted
func (o LookupErrdisableResultOutput) FlapSettingCausePagpFlapTime() pulumi.IntOutput {
	return o.ApplyT(func(v LookupErrdisableResult) int { return v.FlapSettingCausePagpFlapTime }).(pulumi.IntOutput)
}

// The path of the retrieved object.
func (o LookupErrdisableResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupErrdisableResult) string { return v.Id }).(pulumi.StringOutput)
}

// Enable timer to recover from all error causes
func (o LookupErrdisableResultOutput) RecoveryCauseAll() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseAll }).(pulumi.BoolOutput)
}

// Enable timer to recover from arp inspection error disable state
func (o LookupErrdisableResultOutput) RecoveryCauseArpInspection() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseArpInspection }).(pulumi.BoolOutput)
}

// Enable timer to recover from BPDU Guard error
func (o LookupErrdisableResultOutput) RecoveryCauseBpduguard() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseBpduguard }).(pulumi.BoolOutput)
}

// (STP)  Enable timer to recover from channel misconfiguration error
func (o LookupErrdisableResultOutput) RecoveryCauseChannelMisconfig() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseChannelMisconfig }).(pulumi.BoolOutput)
}

// Enable timer to recover from dhcp-rate-limit error
func (o LookupErrdisableResultOutput) RecoveryCauseDhcpRateLimit() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseDhcpRateLimit }).(pulumi.BoolOutput)
}

// Enable timer to recover from dtp-flap error
func (o LookupErrdisableResultOutput) RecoveryCauseDtpFlap() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseDtpFlap }).(pulumi.BoolOutput)
}

// Enable timer to recover from invalid GBIC error
func (o LookupErrdisableResultOutput) RecoveryCauseGbicInvalid() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseGbicInvalid }).(pulumi.BoolOutput)
}

// Enable timer to recover from inline-power error
func (o LookupErrdisableResultOutput) RecoveryCauseInlinePower() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseInlinePower }).(pulumi.BoolOutput)
}

// Enable timer to recover from l2protocol-tunnel error disable state
func (o LookupErrdisableResultOutput) RecoveryCauseL2ptguard() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseL2ptguard }).(pulumi.BoolOutput)
}

// Enable timer to recover from link-flap error
func (o LookupErrdisableResultOutput) RecoveryCauseLinkFlap() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseLinkFlap }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseLinkMonitorFailure() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseLinkMonitorFailure }).(pulumi.BoolOutput)
}

// Enable timer to recover from loopback error
func (o LookupErrdisableResultOutput) RecoveryCauseLoopback() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseLoopback }).(pulumi.BoolOutput)
}

// Enable timer to recover from loop detect error
func (o LookupErrdisableResultOutput) RecoveryCauseLoopdetect() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseLoopdetect }).(pulumi.BoolOutput)
}

// Enable timer to recover from mac limit disable state
func (o LookupErrdisableResultOutput) RecoveryCauseMacLimit() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseMacLimit }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseMlacpMinlink() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseMlacpMinlink }).(pulumi.BoolOutput)
}

// Enable timer to recover from pagp-flap error
func (o LookupErrdisableResultOutput) RecoveryCausePagpFlap() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCausePagpFlap }).(pulumi.BoolOutput)
}

// Enable timer to recover from port mode change failure
func (o LookupErrdisableResultOutput) RecoveryCausePortModeFailure() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCausePortModeFailure }).(pulumi.BoolOutput)
}

// Enable timer to recover from PPPoE IA rate-limit error
func (o LookupErrdisableResultOutput) RecoveryCausePppoeIaRateLimit() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCausePppoeIaRateLimit }).(pulumi.BoolOutput)
}

// Enable timer to recover from psecure violation error
func (o LookupErrdisableResultOutput) RecoveryCausePsecureViolation() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCausePsecureViolation }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCausePsp() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCausePsp }).(pulumi.BoolOutput)
}

// Enable timer to recover from 802.1x violation error
func (o LookupErrdisableResultOutput) RecoveryCauseSecurityViolation() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseSecurityViolation }).(pulumi.BoolOutput)
}

// Enable timer to recover from SFP config mismatch error
func (o LookupErrdisableResultOutput) RecoveryCauseSfpConfigMismatch() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseSfpConfigMismatch }).(pulumi.BoolOutput)
}

// Enable timer to recover from small frame error
func (o LookupErrdisableResultOutput) RecoveryCauseSmallFrame() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseSmallFrame }).(pulumi.BoolOutput)
}

// Enable timer to recover from storm-control error
func (o LookupErrdisableResultOutput) RecoveryCauseStormControl() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseStormControl }).(pulumi.BoolOutput)
}

// Enable timer to recover from udld error
func (o LookupErrdisableResultOutput) RecoveryCauseUdld() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseUdld }).(pulumi.BoolOutput)
}

func (o LookupErrdisableResultOutput) RecoveryCauseUnicastFlood() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseUnicastFlood }).(pulumi.BoolOutput)
}

// Enable timer to recover from vmps shutdown error
func (o LookupErrdisableResultOutput) RecoveryCauseVmps() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupErrdisableResult) bool { return v.RecoveryCauseVmps }).(pulumi.BoolOutput)
}

// Error disable recovery timer value
func (o LookupErrdisableResultOutput) RecoveryInterval() pulumi.IntOutput {
	return o.ApplyT(func(v LookupErrdisableResult) int { return v.RecoveryInterval }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupErrdisableResultOutput{})
}
