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

// This data source can read the EVPN Instance configuration.
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
//			_, err := iosxe.LookupEvpnInstance(ctx, &iosxe.LookupEvpnInstanceArgs{
//				EvpnInstanceNum: 10,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupEvpnInstance(ctx *pulumi.Context, args *LookupEvpnInstanceArgs, opts ...pulumi.InvokeOption) (*LookupEvpnInstanceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupEvpnInstanceResult
	err := ctx.Invoke("iosxe:index/getEvpnInstance:getEvpnInstance", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEvpnInstance.
type LookupEvpnInstanceArgs struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// evpn instance number
	EvpnInstanceNum int `pulumi:"evpnInstanceNum"`
}

// A collection of values returned by getEvpnInstance.
type LookupEvpnInstanceResult struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// evpn instance number
	EvpnInstanceNum int `pulumi:"evpnInstanceNum"`
	// The path of the retrieved object.
	Id string `pulumi:"id"`
	// Automatically set a route-target
	VlanBasedAutoRouteTarget bool `pulumi:"vlanBasedAutoRouteTarget"`
	// Advertise Default Gateway MAC/IP routes
	VlanBasedDefaultGatewayAdvertise string `pulumi:"vlanBasedDefaultGatewayAdvertise"`
	// Data encapsulation method
	VlanBasedEncapsulation string `pulumi:"vlanBasedEncapsulation"`
	// Disable IP local learning from dataplane
	VlanBasedIpLocalLearningDisable bool `pulumi:"vlanBasedIpLocalLearningDisable"`
	// Enable IP local learning from dataplane
	VlanBasedIpLocalLearningEnable bool `pulumi:"vlanBasedIpLocalLearningEnable"`
	// ASN:nn or IP-address:nn
	VlanBasedRd string `pulumi:"vlanBasedRd"`
	// Re-originate route-type 5
	VlanBasedReOriginateRouteType5 bool `pulumi:"vlanBasedReOriginateRouteType5"`
	// Ingress replication
	VlanBasedReplicationTypeIngress bool `pulumi:"vlanBasedReplicationTypeIngress"`
	// mp2mp replication
	VlanBasedReplicationTypeMp2mp bool `pulumi:"vlanBasedReplicationTypeMp2mp"`
	// p2mp replication
	VlanBasedReplicationTypeP2mp bool `pulumi:"vlanBasedReplicationTypeP2mp"`
	// Static replication
	VlanBasedReplicationTypeStatic bool `pulumi:"vlanBasedReplicationTypeStatic"`
	// ASN:nn or IP-address:nn
	VlanBasedRouteTarget string `pulumi:"vlanBasedRouteTarget"`
	// ASN:nn or IP-address:nn
	VlanBasedRouteTargetBoth string `pulumi:"vlanBasedRouteTargetBoth"`
	// ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
	VlanBasedRouteTargetExport string `pulumi:"vlanBasedRouteTargetExport"`
	// ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
	VlanBasedRouteTargetImport string `pulumi:"vlanBasedRouteTargetImport"`
}

func LookupEvpnInstanceOutput(ctx *pulumi.Context, args LookupEvpnInstanceOutputArgs, opts ...pulumi.InvokeOption) LookupEvpnInstanceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupEvpnInstanceResult, error) {
			args := v.(LookupEvpnInstanceArgs)
			r, err := LookupEvpnInstance(ctx, &args, opts...)
			var s LookupEvpnInstanceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupEvpnInstanceResultOutput)
}

// A collection of arguments for invoking getEvpnInstance.
type LookupEvpnInstanceOutputArgs struct {
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput `pulumi:"device"`
	// evpn instance number
	EvpnInstanceNum pulumi.IntInput `pulumi:"evpnInstanceNum"`
}

func (LookupEvpnInstanceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEvpnInstanceArgs)(nil)).Elem()
}

// A collection of values returned by getEvpnInstance.
type LookupEvpnInstanceResultOutput struct{ *pulumi.OutputState }

func (LookupEvpnInstanceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEvpnInstanceResult)(nil)).Elem()
}

func (o LookupEvpnInstanceResultOutput) ToLookupEvpnInstanceResultOutput() LookupEvpnInstanceResultOutput {
	return o
}

func (o LookupEvpnInstanceResultOutput) ToLookupEvpnInstanceResultOutputWithContext(ctx context.Context) LookupEvpnInstanceResultOutput {
	return o
}

func (o LookupEvpnInstanceResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupEvpnInstanceResult] {
	return pulumix.Output[LookupEvpnInstanceResult]{
		OutputState: o.OutputState,
	}
}

// A device name from the provider configuration.
func (o LookupEvpnInstanceResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupEvpnInstanceResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// evpn instance number
func (o LookupEvpnInstanceResultOutput) EvpnInstanceNum() pulumi.IntOutput {
	return o.ApplyT(func(v LookupEvpnInstanceResult) int { return v.EvpnInstanceNum }).(pulumi.IntOutput)
}

// The path of the retrieved object.
func (o LookupEvpnInstanceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEvpnInstanceResult) string { return v.Id }).(pulumi.StringOutput)
}

// Automatically set a route-target
func (o LookupEvpnInstanceResultOutput) VlanBasedAutoRouteTarget() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupEvpnInstanceResult) bool { return v.VlanBasedAutoRouteTarget }).(pulumi.BoolOutput)
}

// Advertise Default Gateway MAC/IP routes
func (o LookupEvpnInstanceResultOutput) VlanBasedDefaultGatewayAdvertise() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEvpnInstanceResult) string { return v.VlanBasedDefaultGatewayAdvertise }).(pulumi.StringOutput)
}

// Data encapsulation method
func (o LookupEvpnInstanceResultOutput) VlanBasedEncapsulation() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEvpnInstanceResult) string { return v.VlanBasedEncapsulation }).(pulumi.StringOutput)
}

// Disable IP local learning from dataplane
func (o LookupEvpnInstanceResultOutput) VlanBasedIpLocalLearningDisable() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupEvpnInstanceResult) bool { return v.VlanBasedIpLocalLearningDisable }).(pulumi.BoolOutput)
}

// Enable IP local learning from dataplane
func (o LookupEvpnInstanceResultOutput) VlanBasedIpLocalLearningEnable() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupEvpnInstanceResult) bool { return v.VlanBasedIpLocalLearningEnable }).(pulumi.BoolOutput)
}

// ASN:nn or IP-address:nn
func (o LookupEvpnInstanceResultOutput) VlanBasedRd() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEvpnInstanceResult) string { return v.VlanBasedRd }).(pulumi.StringOutput)
}

// Re-originate route-type 5
func (o LookupEvpnInstanceResultOutput) VlanBasedReOriginateRouteType5() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupEvpnInstanceResult) bool { return v.VlanBasedReOriginateRouteType5 }).(pulumi.BoolOutput)
}

// Ingress replication
func (o LookupEvpnInstanceResultOutput) VlanBasedReplicationTypeIngress() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupEvpnInstanceResult) bool { return v.VlanBasedReplicationTypeIngress }).(pulumi.BoolOutput)
}

// mp2mp replication
func (o LookupEvpnInstanceResultOutput) VlanBasedReplicationTypeMp2mp() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupEvpnInstanceResult) bool { return v.VlanBasedReplicationTypeMp2mp }).(pulumi.BoolOutput)
}

// p2mp replication
func (o LookupEvpnInstanceResultOutput) VlanBasedReplicationTypeP2mp() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupEvpnInstanceResult) bool { return v.VlanBasedReplicationTypeP2mp }).(pulumi.BoolOutput)
}

// Static replication
func (o LookupEvpnInstanceResultOutput) VlanBasedReplicationTypeStatic() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupEvpnInstanceResult) bool { return v.VlanBasedReplicationTypeStatic }).(pulumi.BoolOutput)
}

// ASN:nn or IP-address:nn
func (o LookupEvpnInstanceResultOutput) VlanBasedRouteTarget() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEvpnInstanceResult) string { return v.VlanBasedRouteTarget }).(pulumi.StringOutput)
}

// ASN:nn or IP-address:nn
func (o LookupEvpnInstanceResultOutput) VlanBasedRouteTargetBoth() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEvpnInstanceResult) string { return v.VlanBasedRouteTargetBoth }).(pulumi.StringOutput)
}

// ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
func (o LookupEvpnInstanceResultOutput) VlanBasedRouteTargetExport() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEvpnInstanceResult) string { return v.VlanBasedRouteTargetExport }).(pulumi.StringOutput)
}

// ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
func (o LookupEvpnInstanceResultOutput) VlanBasedRouteTargetImport() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEvpnInstanceResult) string { return v.VlanBasedRouteTargetImport }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEvpnInstanceResultOutput{})
}
