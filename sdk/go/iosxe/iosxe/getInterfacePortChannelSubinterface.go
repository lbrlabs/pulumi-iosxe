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

func LookupInterfacePortChannelSubinterface(ctx *pulumi.Context, args *LookupInterfacePortChannelSubinterfaceArgs, opts ...pulumi.InvokeOption) (*LookupInterfacePortChannelSubinterfaceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupInterfacePortChannelSubinterfaceResult
	err := ctx.Invoke("iosxe:iosxe/getInterfacePortChannelSubinterface:getInterfacePortChannelSubinterface", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInterfacePortChannelSubinterface.
type LookupInterfacePortChannelSubinterfaceArgs struct {
	Device *string `pulumi:"device"`
	Name   string  `pulumi:"name"`
}

// A collection of values returned by getInterfacePortChannelSubinterface.
type LookupInterfacePortChannelSubinterfaceResult struct {
	ArpTimeout                   int                                                       `pulumi:"arpTimeout"`
	AutoQosClassify              bool                                                      `pulumi:"autoQosClassify"`
	AutoQosClassifyPolice        bool                                                      `pulumi:"autoQosClassifyPolice"`
	AutoQosTrust                 bool                                                      `pulumi:"autoQosTrust"`
	AutoQosTrustCos              bool                                                      `pulumi:"autoQosTrustCos"`
	AutoQosTrustDscp             bool                                                      `pulumi:"autoQosTrustDscp"`
	AutoQosVideoCts              bool                                                      `pulumi:"autoQosVideoCts"`
	AutoQosVideoIpCamera         bool                                                      `pulumi:"autoQosVideoIpCamera"`
	AutoQosVideoMediaPlayer      bool                                                      `pulumi:"autoQosVideoMediaPlayer"`
	AutoQosVoip                  bool                                                      `pulumi:"autoQosVoip"`
	AutoQosVoipCiscoPhone        bool                                                      `pulumi:"autoQosVoipCiscoPhone"`
	AutoQosVoipCiscoSoftphone    bool                                                      `pulumi:"autoQosVoipCiscoSoftphone"`
	AutoQosVoipTrust             bool                                                      `pulumi:"autoQosVoipTrust"`
	BfdEcho                      bool                                                      `pulumi:"bfdEcho"`
	BfdEnable                    bool                                                      `pulumi:"bfdEnable"`
	BfdInterval                  int                                                       `pulumi:"bfdInterval"`
	BfdIntervalMinRx             int                                                       `pulumi:"bfdIntervalMinRx"`
	BfdIntervalMultiplier        int                                                       `pulumi:"bfdIntervalMultiplier"`
	BfdLocalAddress              string                                                    `pulumi:"bfdLocalAddress"`
	BfdTemplate                  string                                                    `pulumi:"bfdTemplate"`
	Description                  string                                                    `pulumi:"description"`
	Device                       *string                                                   `pulumi:"device"`
	EncapsulationDot1qVlanId     int                                                       `pulumi:"encapsulationDot1qVlanId"`
	HelperAddresses              []GetInterfacePortChannelSubinterfaceHelperAddress        `pulumi:"helperAddresses"`
	Id                           string                                                    `pulumi:"id"`
	IpAccessGroupIn              string                                                    `pulumi:"ipAccessGroupIn"`
	IpAccessGroupInEnable        bool                                                      `pulumi:"ipAccessGroupInEnable"`
	IpAccessGroupOut             string                                                    `pulumi:"ipAccessGroupOut"`
	IpAccessGroupOutEnable       bool                                                      `pulumi:"ipAccessGroupOutEnable"`
	IpArpInspectionLimitRate     int                                                       `pulumi:"ipArpInspectionLimitRate"`
	IpArpInspectionTrust         bool                                                      `pulumi:"ipArpInspectionTrust"`
	IpProxyArp                   bool                                                      `pulumi:"ipProxyArp"`
	IpRedirects                  bool                                                      `pulumi:"ipRedirects"`
	IpUnreachables               bool                                                      `pulumi:"ipUnreachables"`
	Ipv4Address                  string                                                    `pulumi:"ipv4Address"`
	Ipv4AddressMask              string                                                    `pulumi:"ipv4AddressMask"`
	Ipv6AddressAutoconfigDefault bool                                                      `pulumi:"ipv6AddressAutoconfigDefault"`
	Ipv6AddressDhcp              bool                                                      `pulumi:"ipv6AddressDhcp"`
	Ipv6Addresses                []GetInterfacePortChannelSubinterfaceIpv6Address          `pulumi:"ipv6Addresses"`
	Ipv6Enable                   bool                                                      `pulumi:"ipv6Enable"`
	Ipv6LinkLocalAddresses       []GetInterfacePortChannelSubinterfaceIpv6LinkLocalAddress `pulumi:"ipv6LinkLocalAddresses"`
	Ipv6Mtu                      int                                                       `pulumi:"ipv6Mtu"`
	Ipv6NdRaSuppressAll          bool                                                      `pulumi:"ipv6NdRaSuppressAll"`
	Name                         string                                                    `pulumi:"name"`
	Shutdown                     bool                                                      `pulumi:"shutdown"`
	TrustDevice                  string                                                    `pulumi:"trustDevice"`
	VrfForwarding                string                                                    `pulumi:"vrfForwarding"`
}

func LookupInterfacePortChannelSubinterfaceOutput(ctx *pulumi.Context, args LookupInterfacePortChannelSubinterfaceOutputArgs, opts ...pulumi.InvokeOption) LookupInterfacePortChannelSubinterfaceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupInterfacePortChannelSubinterfaceResult, error) {
			args := v.(LookupInterfacePortChannelSubinterfaceArgs)
			r, err := LookupInterfacePortChannelSubinterface(ctx, &args, opts...)
			var s LookupInterfacePortChannelSubinterfaceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupInterfacePortChannelSubinterfaceResultOutput)
}

// A collection of arguments for invoking getInterfacePortChannelSubinterface.
type LookupInterfacePortChannelSubinterfaceOutputArgs struct {
	Device pulumi.StringPtrInput `pulumi:"device"`
	Name   pulumi.StringInput    `pulumi:"name"`
}

func (LookupInterfacePortChannelSubinterfaceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupInterfacePortChannelSubinterfaceArgs)(nil)).Elem()
}

// A collection of values returned by getInterfacePortChannelSubinterface.
type LookupInterfacePortChannelSubinterfaceResultOutput struct{ *pulumi.OutputState }

func (LookupInterfacePortChannelSubinterfaceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupInterfacePortChannelSubinterfaceResult)(nil)).Elem()
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) ToLookupInterfacePortChannelSubinterfaceResultOutput() LookupInterfacePortChannelSubinterfaceResultOutput {
	return o
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) ToLookupInterfacePortChannelSubinterfaceResultOutputWithContext(ctx context.Context) LookupInterfacePortChannelSubinterfaceResultOutput {
	return o
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupInterfacePortChannelSubinterfaceResult] {
	return pulumix.Output[LookupInterfacePortChannelSubinterfaceResult]{
		OutputState: o.OutputState,
	}
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) ArpTimeout() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) int { return v.ArpTimeout }).(pulumi.IntOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) AutoQosClassify() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.AutoQosClassify }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) AutoQosClassifyPolice() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.AutoQosClassifyPolice }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) AutoQosTrust() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.AutoQosTrust }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) AutoQosTrustCos() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.AutoQosTrustCos }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) AutoQosTrustDscp() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.AutoQosTrustDscp }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) AutoQosVideoCts() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.AutoQosVideoCts }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) AutoQosVideoIpCamera() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.AutoQosVideoIpCamera }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) AutoQosVideoMediaPlayer() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.AutoQosVideoMediaPlayer }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) AutoQosVoip() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.AutoQosVoip }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) AutoQosVoipCiscoPhone() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.AutoQosVoipCiscoPhone }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) AutoQosVoipCiscoSoftphone() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.AutoQosVoipCiscoSoftphone }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) AutoQosVoipTrust() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.AutoQosVoipTrust }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) BfdEcho() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.BfdEcho }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) BfdEnable() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.BfdEnable }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) BfdInterval() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) int { return v.BfdInterval }).(pulumi.IntOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) BfdIntervalMinRx() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) int { return v.BfdIntervalMinRx }).(pulumi.IntOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) BfdIntervalMultiplier() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) int { return v.BfdIntervalMultiplier }).(pulumi.IntOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) BfdLocalAddress() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) string { return v.BfdLocalAddress }).(pulumi.StringOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) BfdTemplate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) string { return v.BfdTemplate }).(pulumi.StringOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) EncapsulationDot1qVlanId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) int { return v.EncapsulationDot1qVlanId }).(pulumi.IntOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) HelperAddresses() GetInterfacePortChannelSubinterfaceHelperAddressArrayOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) []GetInterfacePortChannelSubinterfaceHelperAddress {
		return v.HelperAddresses
	}).(GetInterfacePortChannelSubinterfaceHelperAddressArrayOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) IpAccessGroupIn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) string { return v.IpAccessGroupIn }).(pulumi.StringOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) IpAccessGroupInEnable() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.IpAccessGroupInEnable }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) IpAccessGroupOut() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) string { return v.IpAccessGroupOut }).(pulumi.StringOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) IpAccessGroupOutEnable() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.IpAccessGroupOutEnable }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) IpArpInspectionLimitRate() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) int { return v.IpArpInspectionLimitRate }).(pulumi.IntOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) IpArpInspectionTrust() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.IpArpInspectionTrust }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) IpProxyArp() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.IpProxyArp }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) IpRedirects() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.IpRedirects }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) IpUnreachables() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.IpUnreachables }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) Ipv4Address() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) string { return v.Ipv4Address }).(pulumi.StringOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) Ipv4AddressMask() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) string { return v.Ipv4AddressMask }).(pulumi.StringOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) Ipv6AddressAutoconfigDefault() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.Ipv6AddressAutoconfigDefault }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) Ipv6AddressDhcp() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.Ipv6AddressDhcp }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) Ipv6Addresses() GetInterfacePortChannelSubinterfaceIpv6AddressArrayOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) []GetInterfacePortChannelSubinterfaceIpv6Address {
		return v.Ipv6Addresses
	}).(GetInterfacePortChannelSubinterfaceIpv6AddressArrayOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) Ipv6Enable() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.Ipv6Enable }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) Ipv6LinkLocalAddresses() GetInterfacePortChannelSubinterfaceIpv6LinkLocalAddressArrayOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) []GetInterfacePortChannelSubinterfaceIpv6LinkLocalAddress {
		return v.Ipv6LinkLocalAddresses
	}).(GetInterfacePortChannelSubinterfaceIpv6LinkLocalAddressArrayOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) Ipv6Mtu() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) int { return v.Ipv6Mtu }).(pulumi.IntOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) Ipv6NdRaSuppressAll() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.Ipv6NdRaSuppressAll }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) Shutdown() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) bool { return v.Shutdown }).(pulumi.BoolOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) TrustDevice() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) string { return v.TrustDevice }).(pulumi.StringOutput)
}

func (o LookupInterfacePortChannelSubinterfaceResultOutput) VrfForwarding() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfacePortChannelSubinterfaceResult) string { return v.VrfForwarding }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupInterfacePortChannelSubinterfaceResultOutput{})
}
