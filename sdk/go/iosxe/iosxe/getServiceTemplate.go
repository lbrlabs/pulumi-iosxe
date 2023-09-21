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

func LookupServiceTemplate(ctx *pulumi.Context, args *LookupServiceTemplateArgs, opts ...pulumi.InvokeOption) (*LookupServiceTemplateResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupServiceTemplateResult
	err := ctx.Invoke("iosxe:iosxe/getServiceTemplate:getServiceTemplate", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceTemplate.
type LookupServiceTemplateArgs struct {
	Device *string `pulumi:"device"`
	Name   string  `pulumi:"name"`
}

// A collection of values returned by getServiceTemplate.
type LookupServiceTemplateResult struct {
	AbsoluteTimer           int                                   `pulumi:"absoluteTimer"`
	AccessGroups            []GetServiceTemplateAccessGroup       `pulumi:"accessGroups"`
	Description             string                                `pulumi:"description"`
	Device                  *string                               `pulumi:"device"`
	DnsAclPreauth           string                                `pulumi:"dnsAclPreauth"`
	IanctivityTimer         int                                   `pulumi:"ianctivityTimer"`
	Id                      string                                `pulumi:"id"`
	InactivityTimerProbe    bool                                  `pulumi:"inactivityTimerProbe"`
	InterfaceTemplates      []GetServiceTemplateInterfaceTemplate `pulumi:"interfaceTemplates"`
	LinksecPolicy           string                                `pulumi:"linksecPolicy"`
	MdnsServicePolicy       string                                `pulumi:"mdnsServicePolicy"`
	Name                    string                                `pulumi:"name"`
	RedirectAppendClientMac string                                `pulumi:"redirectAppendClientMac"`
	RedirectAppendSwitchMac string                                `pulumi:"redirectAppendSwitchMac"`
	RedirectUrl             string                                `pulumi:"redirectUrl"`
	RedirectUrlMatchAcl     string                                `pulumi:"redirectUrlMatchAcl"`
	RedirectUrlMatchAction  string                                `pulumi:"redirectUrlMatchAction"`
	ServicePolicyQosInput   string                                `pulumi:"servicePolicyQosInput"`
	ServicePolicyQosOutput  string                                `pulumi:"servicePolicyQosOutput"`
	Sgt                     int                                   `pulumi:"sgt"`
	Tags                    []GetServiceTemplateTag               `pulumi:"tags"`
	TunnelCapwapName        string                                `pulumi:"tunnelCapwapName"`
	Vlan                    int                                   `pulumi:"vlan"`
	Vnid                    string                                `pulumi:"vnid"`
	VoiceVlan               bool                                  `pulumi:"voiceVlan"`
}

func LookupServiceTemplateOutput(ctx *pulumi.Context, args LookupServiceTemplateOutputArgs, opts ...pulumi.InvokeOption) LookupServiceTemplateResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupServiceTemplateResult, error) {
			args := v.(LookupServiceTemplateArgs)
			r, err := LookupServiceTemplate(ctx, &args, opts...)
			var s LookupServiceTemplateResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupServiceTemplateResultOutput)
}

// A collection of arguments for invoking getServiceTemplate.
type LookupServiceTemplateOutputArgs struct {
	Device pulumi.StringPtrInput `pulumi:"device"`
	Name   pulumi.StringInput    `pulumi:"name"`
}

func (LookupServiceTemplateOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceTemplateArgs)(nil)).Elem()
}

// A collection of values returned by getServiceTemplate.
type LookupServiceTemplateResultOutput struct{ *pulumi.OutputState }

func (LookupServiceTemplateResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceTemplateResult)(nil)).Elem()
}

func (o LookupServiceTemplateResultOutput) ToLookupServiceTemplateResultOutput() LookupServiceTemplateResultOutput {
	return o
}

func (o LookupServiceTemplateResultOutput) ToLookupServiceTemplateResultOutputWithContext(ctx context.Context) LookupServiceTemplateResultOutput {
	return o
}

func (o LookupServiceTemplateResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupServiceTemplateResult] {
	return pulumix.Output[LookupServiceTemplateResult]{
		OutputState: o.OutputState,
	}
}

func (o LookupServiceTemplateResultOutput) AbsoluteTimer() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) int { return v.AbsoluteTimer }).(pulumi.IntOutput)
}

func (o LookupServiceTemplateResultOutput) AccessGroups() GetServiceTemplateAccessGroupArrayOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) []GetServiceTemplateAccessGroup { return v.AccessGroups }).(GetServiceTemplateAccessGroupArrayOutput)
}

func (o LookupServiceTemplateResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupServiceTemplateResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

func (o LookupServiceTemplateResultOutput) DnsAclPreauth() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.DnsAclPreauth }).(pulumi.StringOutput)
}

func (o LookupServiceTemplateResultOutput) IanctivityTimer() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) int { return v.IanctivityTimer }).(pulumi.IntOutput)
}

func (o LookupServiceTemplateResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupServiceTemplateResultOutput) InactivityTimerProbe() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) bool { return v.InactivityTimerProbe }).(pulumi.BoolOutput)
}

func (o LookupServiceTemplateResultOutput) InterfaceTemplates() GetServiceTemplateInterfaceTemplateArrayOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) []GetServiceTemplateInterfaceTemplate { return v.InterfaceTemplates }).(GetServiceTemplateInterfaceTemplateArrayOutput)
}

func (o LookupServiceTemplateResultOutput) LinksecPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.LinksecPolicy }).(pulumi.StringOutput)
}

func (o LookupServiceTemplateResultOutput) MdnsServicePolicy() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.MdnsServicePolicy }).(pulumi.StringOutput)
}

func (o LookupServiceTemplateResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupServiceTemplateResultOutput) RedirectAppendClientMac() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.RedirectAppendClientMac }).(pulumi.StringOutput)
}

func (o LookupServiceTemplateResultOutput) RedirectAppendSwitchMac() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.RedirectAppendSwitchMac }).(pulumi.StringOutput)
}

func (o LookupServiceTemplateResultOutput) RedirectUrl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.RedirectUrl }).(pulumi.StringOutput)
}

func (o LookupServiceTemplateResultOutput) RedirectUrlMatchAcl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.RedirectUrlMatchAcl }).(pulumi.StringOutput)
}

func (o LookupServiceTemplateResultOutput) RedirectUrlMatchAction() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.RedirectUrlMatchAction }).(pulumi.StringOutput)
}

func (o LookupServiceTemplateResultOutput) ServicePolicyQosInput() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.ServicePolicyQosInput }).(pulumi.StringOutput)
}

func (o LookupServiceTemplateResultOutput) ServicePolicyQosOutput() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.ServicePolicyQosOutput }).(pulumi.StringOutput)
}

func (o LookupServiceTemplateResultOutput) Sgt() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) int { return v.Sgt }).(pulumi.IntOutput)
}

func (o LookupServiceTemplateResultOutput) Tags() GetServiceTemplateTagArrayOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) []GetServiceTemplateTag { return v.Tags }).(GetServiceTemplateTagArrayOutput)
}

func (o LookupServiceTemplateResultOutput) TunnelCapwapName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.TunnelCapwapName }).(pulumi.StringOutput)
}

func (o LookupServiceTemplateResultOutput) Vlan() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) int { return v.Vlan }).(pulumi.IntOutput)
}

func (o LookupServiceTemplateResultOutput) Vnid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.Vnid }).(pulumi.StringOutput)
}

func (o LookupServiceTemplateResultOutput) VoiceVlan() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) bool { return v.VoiceVlan }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServiceTemplateResultOutput{})
}
