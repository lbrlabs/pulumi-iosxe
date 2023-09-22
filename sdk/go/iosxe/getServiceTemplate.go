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

// This data source can read the Service Template configuration.
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
//			_, err := iosxe.LookupServiceTemplate(ctx, &iosxe.LookupServiceTemplateArgs{
//				Name: "MY_TEMPLATE",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupServiceTemplate(ctx *pulumi.Context, args *LookupServiceTemplateArgs, opts ...pulumi.InvokeOption) (*LookupServiceTemplateResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupServiceTemplateResult
	err := ctx.Invoke("iosxe:index/getServiceTemplate:getServiceTemplate", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceTemplate.
type LookupServiceTemplateArgs struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// Specify a template name (maximum 48 characters)
	Name string `pulumi:"name"`
}

// A collection of values returned by getServiceTemplate.
type LookupServiceTemplateResult struct {
	// Enter a value between 1 and 1073741823
	AbsoluteTimer int `pulumi:"absoluteTimer"`
	// Access list to be applied
	AccessGroups []GetServiceTemplateAccessGroup `pulumi:"accessGroups"`
	// Enter a description
	Description string `pulumi:"description"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// pre-authentication
	DnsAclPreauth string `pulumi:"dnsAclPreauth"`
	// Enter a value between 1 and 65535
	IanctivityTimer int `pulumi:"ianctivityTimer"`
	// The path of the retrieved object.
	Id string `pulumi:"id"`
	// ARP probe
	InactivityTimerProbe bool `pulumi:"inactivityTimerProbe"`
	// Interface template to be applied
	InterfaceTemplates []GetServiceTemplateInterfaceTemplate `pulumi:"interfaceTemplates"`
	// Set the link security policy
	LinksecPolicy string `pulumi:"linksecPolicy"`
	// mdns policy to be applied
	MdnsServicePolicy string `pulumi:"mdnsServicePolicy"`
	// Specify a template name (maximum 48 characters)
	Name string `pulumi:"name"`
	// Append client Mac Address in redirect URL
	RedirectAppendClientMac string `pulumi:"redirectAppendClientMac"`
	// Append switch Mac Address in redirect URL
	RedirectAppendSwitchMac string `pulumi:"redirectAppendSwitchMac"`
	// Specify a valid URL
	RedirectUrl string `pulumi:"redirectUrl"`
	// Specify the access list name
	RedirectUrlMatchAcl    string `pulumi:"redirectUrlMatchAcl"`
	RedirectUrlMatchAction string `pulumi:"redirectUrlMatchAction"`
	// Configure input Qos policy
	ServicePolicyQosInput string `pulumi:"servicePolicyQosInput"`
	// Configure output Qos policy
	ServicePolicyQosOutput string `pulumi:"servicePolicyQosOutput"`
	// SGT tag
	Sgt int `pulumi:"sgt"`
	// tag name
	Tags []GetServiceTemplateTag `pulumi:"tags"`
	// tunnel profile name
	TunnelCapwapName string `pulumi:"tunnelCapwapName"`
	// Vlan to be applied
	Vlan int `pulumi:"vlan"`
	// Vnid to be applied
	Vnid string `pulumi:"vnid"`
	// Critical voice vlan
	VoiceVlan bool `pulumi:"voiceVlan"`
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
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput `pulumi:"device"`
	// Specify a template name (maximum 48 characters)
	Name pulumi.StringInput `pulumi:"name"`
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

// Enter a value between 1 and 1073741823
func (o LookupServiceTemplateResultOutput) AbsoluteTimer() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) int { return v.AbsoluteTimer }).(pulumi.IntOutput)
}

// Access list to be applied
func (o LookupServiceTemplateResultOutput) AccessGroups() GetServiceTemplateAccessGroupArrayOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) []GetServiceTemplateAccessGroup { return v.AccessGroups }).(GetServiceTemplateAccessGroupArrayOutput)
}

// Enter a description
func (o LookupServiceTemplateResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.Description }).(pulumi.StringOutput)
}

// A device name from the provider configuration.
func (o LookupServiceTemplateResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// pre-authentication
func (o LookupServiceTemplateResultOutput) DnsAclPreauth() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.DnsAclPreauth }).(pulumi.StringOutput)
}

// Enter a value between 1 and 65535
func (o LookupServiceTemplateResultOutput) IanctivityTimer() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) int { return v.IanctivityTimer }).(pulumi.IntOutput)
}

// The path of the retrieved object.
func (o LookupServiceTemplateResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.Id }).(pulumi.StringOutput)
}

// ARP probe
func (o LookupServiceTemplateResultOutput) InactivityTimerProbe() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) bool { return v.InactivityTimerProbe }).(pulumi.BoolOutput)
}

// Interface template to be applied
func (o LookupServiceTemplateResultOutput) InterfaceTemplates() GetServiceTemplateInterfaceTemplateArrayOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) []GetServiceTemplateInterfaceTemplate { return v.InterfaceTemplates }).(GetServiceTemplateInterfaceTemplateArrayOutput)
}

// Set the link security policy
func (o LookupServiceTemplateResultOutput) LinksecPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.LinksecPolicy }).(pulumi.StringOutput)
}

// mdns policy to be applied
func (o LookupServiceTemplateResultOutput) MdnsServicePolicy() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.MdnsServicePolicy }).(pulumi.StringOutput)
}

// Specify a template name (maximum 48 characters)
func (o LookupServiceTemplateResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.Name }).(pulumi.StringOutput)
}

// Append client Mac Address in redirect URL
func (o LookupServiceTemplateResultOutput) RedirectAppendClientMac() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.RedirectAppendClientMac }).(pulumi.StringOutput)
}

// Append switch Mac Address in redirect URL
func (o LookupServiceTemplateResultOutput) RedirectAppendSwitchMac() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.RedirectAppendSwitchMac }).(pulumi.StringOutput)
}

// Specify a valid URL
func (o LookupServiceTemplateResultOutput) RedirectUrl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.RedirectUrl }).(pulumi.StringOutput)
}

// Specify the access list name
func (o LookupServiceTemplateResultOutput) RedirectUrlMatchAcl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.RedirectUrlMatchAcl }).(pulumi.StringOutput)
}

func (o LookupServiceTemplateResultOutput) RedirectUrlMatchAction() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.RedirectUrlMatchAction }).(pulumi.StringOutput)
}

// Configure input Qos policy
func (o LookupServiceTemplateResultOutput) ServicePolicyQosInput() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.ServicePolicyQosInput }).(pulumi.StringOutput)
}

// Configure output Qos policy
func (o LookupServiceTemplateResultOutput) ServicePolicyQosOutput() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.ServicePolicyQosOutput }).(pulumi.StringOutput)
}

// SGT tag
func (o LookupServiceTemplateResultOutput) Sgt() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) int { return v.Sgt }).(pulumi.IntOutput)
}

// tag name
func (o LookupServiceTemplateResultOutput) Tags() GetServiceTemplateTagArrayOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) []GetServiceTemplateTag { return v.Tags }).(GetServiceTemplateTagArrayOutput)
}

// tunnel profile name
func (o LookupServiceTemplateResultOutput) TunnelCapwapName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.TunnelCapwapName }).(pulumi.StringOutput)
}

// Vlan to be applied
func (o LookupServiceTemplateResultOutput) Vlan() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) int { return v.Vlan }).(pulumi.IntOutput)
}

// Vnid to be applied
func (o LookupServiceTemplateResultOutput) Vnid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) string { return v.Vnid }).(pulumi.StringOutput)
}

// Critical voice vlan
func (o LookupServiceTemplateResultOutput) VoiceVlan() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupServiceTemplateResult) bool { return v.VoiceVlan }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServiceTemplateResultOutput{})
}