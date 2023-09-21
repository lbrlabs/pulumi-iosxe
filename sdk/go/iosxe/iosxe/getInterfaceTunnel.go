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

func LookupInterfaceTunnel(ctx *pulumi.Context, args *LookupInterfaceTunnelArgs, opts ...pulumi.InvokeOption) (*LookupInterfaceTunnelResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupInterfaceTunnelResult
	err := ctx.Invoke("iosxe:iosxe/getInterfaceTunnel:getInterfaceTunnel", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInterfaceTunnel.
type LookupInterfaceTunnelArgs struct {
	Device *string `pulumi:"device"`
	Name   int     `pulumi:"name"`
}

// A collection of values returned by getInterfaceTunnel.
type LookupInterfaceTunnelResult struct {
	ArpTimeout                   int                                      `pulumi:"arpTimeout"`
	BfdEcho                      bool                                     `pulumi:"bfdEcho"`
	BfdEnable                    bool                                     `pulumi:"bfdEnable"`
	BfdInterval                  int                                      `pulumi:"bfdInterval"`
	BfdIntervalMinRx             int                                      `pulumi:"bfdIntervalMinRx"`
	BfdIntervalMultiplier        int                                      `pulumi:"bfdIntervalMultiplier"`
	BfdLocalAddress              string                                   `pulumi:"bfdLocalAddress"`
	BfdTemplate                  string                                   `pulumi:"bfdTemplate"`
	CryptoIpsecDfBit             string                                   `pulumi:"cryptoIpsecDfBit"`
	Description                  string                                   `pulumi:"description"`
	Device                       *string                                  `pulumi:"device"`
	HelperAddresses              []GetInterfaceTunnelHelperAddress        `pulumi:"helperAddresses"`
	Id                           string                                   `pulumi:"id"`
	IpAccessGroupIn              string                                   `pulumi:"ipAccessGroupIn"`
	IpAccessGroupInEnable        bool                                     `pulumi:"ipAccessGroupInEnable"`
	IpAccessGroupOut             string                                   `pulumi:"ipAccessGroupOut"`
	IpAccessGroupOutEnable       bool                                     `pulumi:"ipAccessGroupOutEnable"`
	IpDhcpRelaySourceInterface   string                                   `pulumi:"ipDhcpRelaySourceInterface"`
	IpProxyArp                   bool                                     `pulumi:"ipProxyArp"`
	IpRedirects                  bool                                     `pulumi:"ipRedirects"`
	IpUnreachables               bool                                     `pulumi:"ipUnreachables"`
	Ipv4Address                  string                                   `pulumi:"ipv4Address"`
	Ipv4AddressMask              string                                   `pulumi:"ipv4AddressMask"`
	Ipv6AddressAutoconfigDefault bool                                     `pulumi:"ipv6AddressAutoconfigDefault"`
	Ipv6AddressDhcp              bool                                     `pulumi:"ipv6AddressDhcp"`
	Ipv6Addresses                []GetInterfaceTunnelIpv6Address          `pulumi:"ipv6Addresses"`
	Ipv6Enable                   bool                                     `pulumi:"ipv6Enable"`
	Ipv6LinkLocalAddresses       []GetInterfaceTunnelIpv6LinkLocalAddress `pulumi:"ipv6LinkLocalAddresses"`
	Ipv6Mtu                      int                                      `pulumi:"ipv6Mtu"`
	Ipv6NdRaSuppressAll          bool                                     `pulumi:"ipv6NdRaSuppressAll"`
	Name                         int                                      `pulumi:"name"`
	Shutdown                     bool                                     `pulumi:"shutdown"`
	TunnelDestinationIpv4        string                                   `pulumi:"tunnelDestinationIpv4"`
	TunnelModeIpsecIpv4          bool                                     `pulumi:"tunnelModeIpsecIpv4"`
	TunnelProtectionIpsecProfile string                                   `pulumi:"tunnelProtectionIpsecProfile"`
	TunnelSource                 string                                   `pulumi:"tunnelSource"`
	Unnumbered                   string                                   `pulumi:"unnumbered"`
	VrfForwarding                string                                   `pulumi:"vrfForwarding"`
}

func LookupInterfaceTunnelOutput(ctx *pulumi.Context, args LookupInterfaceTunnelOutputArgs, opts ...pulumi.InvokeOption) LookupInterfaceTunnelResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupInterfaceTunnelResult, error) {
			args := v.(LookupInterfaceTunnelArgs)
			r, err := LookupInterfaceTunnel(ctx, &args, opts...)
			var s LookupInterfaceTunnelResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupInterfaceTunnelResultOutput)
}

// A collection of arguments for invoking getInterfaceTunnel.
type LookupInterfaceTunnelOutputArgs struct {
	Device pulumi.StringPtrInput `pulumi:"device"`
	Name   pulumi.IntInput       `pulumi:"name"`
}

func (LookupInterfaceTunnelOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupInterfaceTunnelArgs)(nil)).Elem()
}

// A collection of values returned by getInterfaceTunnel.
type LookupInterfaceTunnelResultOutput struct{ *pulumi.OutputState }

func (LookupInterfaceTunnelResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupInterfaceTunnelResult)(nil)).Elem()
}

func (o LookupInterfaceTunnelResultOutput) ToLookupInterfaceTunnelResultOutput() LookupInterfaceTunnelResultOutput {
	return o
}

func (o LookupInterfaceTunnelResultOutput) ToLookupInterfaceTunnelResultOutputWithContext(ctx context.Context) LookupInterfaceTunnelResultOutput {
	return o
}

func (o LookupInterfaceTunnelResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupInterfaceTunnelResult] {
	return pulumix.Output[LookupInterfaceTunnelResult]{
		OutputState: o.OutputState,
	}
}

func (o LookupInterfaceTunnelResultOutput) ArpTimeout() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) int { return v.ArpTimeout }).(pulumi.IntOutput)
}

func (o LookupInterfaceTunnelResultOutput) BfdEcho() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) bool { return v.BfdEcho }).(pulumi.BoolOutput)
}

func (o LookupInterfaceTunnelResultOutput) BfdEnable() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) bool { return v.BfdEnable }).(pulumi.BoolOutput)
}

func (o LookupInterfaceTunnelResultOutput) BfdInterval() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) int { return v.BfdInterval }).(pulumi.IntOutput)
}

func (o LookupInterfaceTunnelResultOutput) BfdIntervalMinRx() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) int { return v.BfdIntervalMinRx }).(pulumi.IntOutput)
}

func (o LookupInterfaceTunnelResultOutput) BfdIntervalMultiplier() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) int { return v.BfdIntervalMultiplier }).(pulumi.IntOutput)
}

func (o LookupInterfaceTunnelResultOutput) BfdLocalAddress() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) string { return v.BfdLocalAddress }).(pulumi.StringOutput)
}

func (o LookupInterfaceTunnelResultOutput) BfdTemplate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) string { return v.BfdTemplate }).(pulumi.StringOutput)
}

func (o LookupInterfaceTunnelResultOutput) CryptoIpsecDfBit() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) string { return v.CryptoIpsecDfBit }).(pulumi.StringOutput)
}

func (o LookupInterfaceTunnelResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupInterfaceTunnelResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

func (o LookupInterfaceTunnelResultOutput) HelperAddresses() GetInterfaceTunnelHelperAddressArrayOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) []GetInterfaceTunnelHelperAddress { return v.HelperAddresses }).(GetInterfaceTunnelHelperAddressArrayOutput)
}

func (o LookupInterfaceTunnelResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupInterfaceTunnelResultOutput) IpAccessGroupIn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) string { return v.IpAccessGroupIn }).(pulumi.StringOutput)
}

func (o LookupInterfaceTunnelResultOutput) IpAccessGroupInEnable() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) bool { return v.IpAccessGroupInEnable }).(pulumi.BoolOutput)
}

func (o LookupInterfaceTunnelResultOutput) IpAccessGroupOut() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) string { return v.IpAccessGroupOut }).(pulumi.StringOutput)
}

func (o LookupInterfaceTunnelResultOutput) IpAccessGroupOutEnable() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) bool { return v.IpAccessGroupOutEnable }).(pulumi.BoolOutput)
}

func (o LookupInterfaceTunnelResultOutput) IpDhcpRelaySourceInterface() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) string { return v.IpDhcpRelaySourceInterface }).(pulumi.StringOutput)
}

func (o LookupInterfaceTunnelResultOutput) IpProxyArp() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) bool { return v.IpProxyArp }).(pulumi.BoolOutput)
}

func (o LookupInterfaceTunnelResultOutput) IpRedirects() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) bool { return v.IpRedirects }).(pulumi.BoolOutput)
}

func (o LookupInterfaceTunnelResultOutput) IpUnreachables() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) bool { return v.IpUnreachables }).(pulumi.BoolOutput)
}

func (o LookupInterfaceTunnelResultOutput) Ipv4Address() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) string { return v.Ipv4Address }).(pulumi.StringOutput)
}

func (o LookupInterfaceTunnelResultOutput) Ipv4AddressMask() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) string { return v.Ipv4AddressMask }).(pulumi.StringOutput)
}

func (o LookupInterfaceTunnelResultOutput) Ipv6AddressAutoconfigDefault() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) bool { return v.Ipv6AddressAutoconfigDefault }).(pulumi.BoolOutput)
}

func (o LookupInterfaceTunnelResultOutput) Ipv6AddressDhcp() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) bool { return v.Ipv6AddressDhcp }).(pulumi.BoolOutput)
}

func (o LookupInterfaceTunnelResultOutput) Ipv6Addresses() GetInterfaceTunnelIpv6AddressArrayOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) []GetInterfaceTunnelIpv6Address { return v.Ipv6Addresses }).(GetInterfaceTunnelIpv6AddressArrayOutput)
}

func (o LookupInterfaceTunnelResultOutput) Ipv6Enable() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) bool { return v.Ipv6Enable }).(pulumi.BoolOutput)
}

func (o LookupInterfaceTunnelResultOutput) Ipv6LinkLocalAddresses() GetInterfaceTunnelIpv6LinkLocalAddressArrayOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) []GetInterfaceTunnelIpv6LinkLocalAddress {
		return v.Ipv6LinkLocalAddresses
	}).(GetInterfaceTunnelIpv6LinkLocalAddressArrayOutput)
}

func (o LookupInterfaceTunnelResultOutput) Ipv6Mtu() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) int { return v.Ipv6Mtu }).(pulumi.IntOutput)
}

func (o LookupInterfaceTunnelResultOutput) Ipv6NdRaSuppressAll() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) bool { return v.Ipv6NdRaSuppressAll }).(pulumi.BoolOutput)
}

func (o LookupInterfaceTunnelResultOutput) Name() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) int { return v.Name }).(pulumi.IntOutput)
}

func (o LookupInterfaceTunnelResultOutput) Shutdown() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) bool { return v.Shutdown }).(pulumi.BoolOutput)
}

func (o LookupInterfaceTunnelResultOutput) TunnelDestinationIpv4() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) string { return v.TunnelDestinationIpv4 }).(pulumi.StringOutput)
}

func (o LookupInterfaceTunnelResultOutput) TunnelModeIpsecIpv4() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) bool { return v.TunnelModeIpsecIpv4 }).(pulumi.BoolOutput)
}

func (o LookupInterfaceTunnelResultOutput) TunnelProtectionIpsecProfile() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) string { return v.TunnelProtectionIpsecProfile }).(pulumi.StringOutput)
}

func (o LookupInterfaceTunnelResultOutput) TunnelSource() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) string { return v.TunnelSource }).(pulumi.StringOutput)
}

func (o LookupInterfaceTunnelResultOutput) Unnumbered() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) string { return v.Unnumbered }).(pulumi.StringOutput)
}

func (o LookupInterfaceTunnelResultOutput) VrfForwarding() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInterfaceTunnelResult) string { return v.VrfForwarding }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupInterfaceTunnelResultOutput{})
}
