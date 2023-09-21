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

func LookupCryptoIkev2Proposal(ctx *pulumi.Context, args *LookupCryptoIkev2ProposalArgs, opts ...pulumi.InvokeOption) (*LookupCryptoIkev2ProposalResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCryptoIkev2ProposalResult
	err := ctx.Invoke("iosxe:iosxe/getCryptoIkev2Proposal:getCryptoIkev2Proposal", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCryptoIkev2Proposal.
type LookupCryptoIkev2ProposalArgs struct {
	Device *string `pulumi:"device"`
	Name   string  `pulumi:"name"`
}

// A collection of values returned by getCryptoIkev2Proposal.
type LookupCryptoIkev2ProposalResult struct {
	Device              *string `pulumi:"device"`
	EncryptionAesCbc128 bool    `pulumi:"encryptionAesCbc128"`
	EncryptionAesCbc192 bool    `pulumi:"encryptionAesCbc192"`
	EncryptionAesCbc256 bool    `pulumi:"encryptionAesCbc256"`
	EncryptionAesGcm128 bool    `pulumi:"encryptionAesGcm128"`
	EncryptionAesGcm256 bool    `pulumi:"encryptionAesGcm256"`
	EncryptionEn3des    bool    `pulumi:"encryptionEn3des"`
	GroupFifteen        bool    `pulumi:"groupFifteen"`
	GroupFourteen       bool    `pulumi:"groupFourteen"`
	GroupNineteen       bool    `pulumi:"groupNineteen"`
	GroupOne            bool    `pulumi:"groupOne"`
	GroupSixteen        bool    `pulumi:"groupSixteen"`
	GroupTwenty         bool    `pulumi:"groupTwenty"`
	GroupTwentyFour     bool    `pulumi:"groupTwentyFour"`
	GroupTwentyOne      bool    `pulumi:"groupTwentyOne"`
	GroupTwo            bool    `pulumi:"groupTwo"`
	Id                  string  `pulumi:"id"`
	IntegrityMd5        bool    `pulumi:"integrityMd5"`
	IntegritySha1       bool    `pulumi:"integritySha1"`
	IntegritySha256     bool    `pulumi:"integritySha256"`
	IntegritySha384     bool    `pulumi:"integritySha384"`
	IntegritySha512     bool    `pulumi:"integritySha512"`
	Name                string  `pulumi:"name"`
	PrfMd5              bool    `pulumi:"prfMd5"`
	PrfSha1             bool    `pulumi:"prfSha1"`
	PrfSha256           bool    `pulumi:"prfSha256"`
	PrfSha384           bool    `pulumi:"prfSha384"`
	PrfSha512           bool    `pulumi:"prfSha512"`
}

func LookupCryptoIkev2ProposalOutput(ctx *pulumi.Context, args LookupCryptoIkev2ProposalOutputArgs, opts ...pulumi.InvokeOption) LookupCryptoIkev2ProposalResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupCryptoIkev2ProposalResult, error) {
			args := v.(LookupCryptoIkev2ProposalArgs)
			r, err := LookupCryptoIkev2Proposal(ctx, &args, opts...)
			var s LookupCryptoIkev2ProposalResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupCryptoIkev2ProposalResultOutput)
}

// A collection of arguments for invoking getCryptoIkev2Proposal.
type LookupCryptoIkev2ProposalOutputArgs struct {
	Device pulumi.StringPtrInput `pulumi:"device"`
	Name   pulumi.StringInput    `pulumi:"name"`
}

func (LookupCryptoIkev2ProposalOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCryptoIkev2ProposalArgs)(nil)).Elem()
}

// A collection of values returned by getCryptoIkev2Proposal.
type LookupCryptoIkev2ProposalResultOutput struct{ *pulumi.OutputState }

func (LookupCryptoIkev2ProposalResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCryptoIkev2ProposalResult)(nil)).Elem()
}

func (o LookupCryptoIkev2ProposalResultOutput) ToLookupCryptoIkev2ProposalResultOutput() LookupCryptoIkev2ProposalResultOutput {
	return o
}

func (o LookupCryptoIkev2ProposalResultOutput) ToLookupCryptoIkev2ProposalResultOutputWithContext(ctx context.Context) LookupCryptoIkev2ProposalResultOutput {
	return o
}

func (o LookupCryptoIkev2ProposalResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupCryptoIkev2ProposalResult] {
	return pulumix.Output[LookupCryptoIkev2ProposalResult]{
		OutputState: o.OutputState,
	}
}

func (o LookupCryptoIkev2ProposalResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) EncryptionAesCbc128() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.EncryptionAesCbc128 }).(pulumi.BoolOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) EncryptionAesCbc192() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.EncryptionAesCbc192 }).(pulumi.BoolOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) EncryptionAesCbc256() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.EncryptionAesCbc256 }).(pulumi.BoolOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) EncryptionAesGcm128() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.EncryptionAesGcm128 }).(pulumi.BoolOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) EncryptionAesGcm256() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.EncryptionAesGcm256 }).(pulumi.BoolOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) EncryptionEn3des() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.EncryptionEn3des }).(pulumi.BoolOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) GroupFifteen() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.GroupFifteen }).(pulumi.BoolOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) GroupFourteen() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.GroupFourteen }).(pulumi.BoolOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) GroupNineteen() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.GroupNineteen }).(pulumi.BoolOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) GroupOne() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.GroupOne }).(pulumi.BoolOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) GroupSixteen() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.GroupSixteen }).(pulumi.BoolOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) GroupTwenty() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.GroupTwenty }).(pulumi.BoolOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) GroupTwentyFour() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.GroupTwentyFour }).(pulumi.BoolOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) GroupTwentyOne() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.GroupTwentyOne }).(pulumi.BoolOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) GroupTwo() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.GroupTwo }).(pulumi.BoolOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) IntegrityMd5() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.IntegrityMd5 }).(pulumi.BoolOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) IntegritySha1() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.IntegritySha1 }).(pulumi.BoolOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) IntegritySha256() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.IntegritySha256 }).(pulumi.BoolOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) IntegritySha384() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.IntegritySha384 }).(pulumi.BoolOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) IntegritySha512() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.IntegritySha512 }).(pulumi.BoolOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) PrfMd5() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.PrfMd5 }).(pulumi.BoolOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) PrfSha1() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.PrfSha1 }).(pulumi.BoolOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) PrfSha256() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.PrfSha256 }).(pulumi.BoolOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) PrfSha384() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.PrfSha384 }).(pulumi.BoolOutput)
}

func (o LookupCryptoIkev2ProposalResultOutput) PrfSha512() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCryptoIkev2ProposalResult) bool { return v.PrfSha512 }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCryptoIkev2ProposalResultOutput{})
}
