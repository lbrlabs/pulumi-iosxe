// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package iosxe

import (
	"context"
	"reflect"

	"errors"
	"github.com/lbrlabs/pulumi-iosxe/sdk/go/iosxe/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

type EvpnInstance struct {
	pulumi.CustomResourceState

	// A device name from the provider configuration.
	Device pulumi.StringPtrOutput `pulumi:"device"`
	// evpn instance number - Range: `1`-`65535`
	EvpnInstanceNum pulumi.IntOutput `pulumi:"evpnInstanceNum"`
	// Automatically set a route-target
	VlanBasedAutoRouteTarget pulumi.BoolPtrOutput `pulumi:"vlanBasedAutoRouteTarget"`
	// Advertise Default Gateway MAC/IP routes - Choices: `disable`, `enable`
	VlanBasedDefaultGatewayAdvertise pulumi.StringPtrOutput `pulumi:"vlanBasedDefaultGatewayAdvertise"`
	// Data encapsulation method - Choices: `mpls`, `vxlan`
	VlanBasedEncapsulation pulumi.StringPtrOutput `pulumi:"vlanBasedEncapsulation"`
	// Disable IP local learning from dataplane
	VlanBasedIpLocalLearningDisable pulumi.BoolPtrOutput `pulumi:"vlanBasedIpLocalLearningDisable"`
	// Enable IP local learning from dataplane
	VlanBasedIpLocalLearningEnable pulumi.BoolPtrOutput `pulumi:"vlanBasedIpLocalLearningEnable"`
	// ASN:nn or IP-address:nn
	VlanBasedRd pulumi.StringPtrOutput `pulumi:"vlanBasedRd"`
	// Re-originate route-type 5
	VlanBasedReOriginateRouteType5 pulumi.BoolPtrOutput `pulumi:"vlanBasedReOriginateRouteType5"`
	// Ingress replication
	VlanBasedReplicationTypeIngress pulumi.BoolPtrOutput `pulumi:"vlanBasedReplicationTypeIngress"`
	// mp2mp replication
	VlanBasedReplicationTypeMp2mp pulumi.BoolPtrOutput `pulumi:"vlanBasedReplicationTypeMp2mp"`
	// p2mp replication
	VlanBasedReplicationTypeP2mp pulumi.BoolPtrOutput `pulumi:"vlanBasedReplicationTypeP2mp"`
	// Static replication
	VlanBasedReplicationTypeStatic pulumi.BoolPtrOutput `pulumi:"vlanBasedReplicationTypeStatic"`
	// ASN:nn or IP-address:nn
	VlanBasedRouteTarget pulumi.StringPtrOutput `pulumi:"vlanBasedRouteTarget"`
	// ASN:nn or IP-address:nn
	VlanBasedRouteTargetBoth pulumi.StringPtrOutput `pulumi:"vlanBasedRouteTargetBoth"`
	// ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
	VlanBasedRouteTargetExport pulumi.StringPtrOutput `pulumi:"vlanBasedRouteTargetExport"`
	// ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
	VlanBasedRouteTargetImport pulumi.StringPtrOutput `pulumi:"vlanBasedRouteTargetImport"`
}

// NewEvpnInstance registers a new resource with the given unique name, arguments, and options.
func NewEvpnInstance(ctx *pulumi.Context,
	name string, args *EvpnInstanceArgs, opts ...pulumi.ResourceOption) (*EvpnInstance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EvpnInstanceNum == nil {
		return nil, errors.New("invalid value for required argument 'EvpnInstanceNum'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EvpnInstance
	err := ctx.RegisterResource("iosxe:iosxe/evpnInstance:EvpnInstance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEvpnInstance gets an existing EvpnInstance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEvpnInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EvpnInstanceState, opts ...pulumi.ResourceOption) (*EvpnInstance, error) {
	var resource EvpnInstance
	err := ctx.ReadResource("iosxe:iosxe/evpnInstance:EvpnInstance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EvpnInstance resources.
type evpnInstanceState struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// evpn instance number - Range: `1`-`65535`
	EvpnInstanceNum *int `pulumi:"evpnInstanceNum"`
	// Automatically set a route-target
	VlanBasedAutoRouteTarget *bool `pulumi:"vlanBasedAutoRouteTarget"`
	// Advertise Default Gateway MAC/IP routes - Choices: `disable`, `enable`
	VlanBasedDefaultGatewayAdvertise *string `pulumi:"vlanBasedDefaultGatewayAdvertise"`
	// Data encapsulation method - Choices: `mpls`, `vxlan`
	VlanBasedEncapsulation *string `pulumi:"vlanBasedEncapsulation"`
	// Disable IP local learning from dataplane
	VlanBasedIpLocalLearningDisable *bool `pulumi:"vlanBasedIpLocalLearningDisable"`
	// Enable IP local learning from dataplane
	VlanBasedIpLocalLearningEnable *bool `pulumi:"vlanBasedIpLocalLearningEnable"`
	// ASN:nn or IP-address:nn
	VlanBasedRd *string `pulumi:"vlanBasedRd"`
	// Re-originate route-type 5
	VlanBasedReOriginateRouteType5 *bool `pulumi:"vlanBasedReOriginateRouteType5"`
	// Ingress replication
	VlanBasedReplicationTypeIngress *bool `pulumi:"vlanBasedReplicationTypeIngress"`
	// mp2mp replication
	VlanBasedReplicationTypeMp2mp *bool `pulumi:"vlanBasedReplicationTypeMp2mp"`
	// p2mp replication
	VlanBasedReplicationTypeP2mp *bool `pulumi:"vlanBasedReplicationTypeP2mp"`
	// Static replication
	VlanBasedReplicationTypeStatic *bool `pulumi:"vlanBasedReplicationTypeStatic"`
	// ASN:nn or IP-address:nn
	VlanBasedRouteTarget *string `pulumi:"vlanBasedRouteTarget"`
	// ASN:nn or IP-address:nn
	VlanBasedRouteTargetBoth *string `pulumi:"vlanBasedRouteTargetBoth"`
	// ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
	VlanBasedRouteTargetExport *string `pulumi:"vlanBasedRouteTargetExport"`
	// ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
	VlanBasedRouteTargetImport *string `pulumi:"vlanBasedRouteTargetImport"`
}

type EvpnInstanceState struct {
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// evpn instance number - Range: `1`-`65535`
	EvpnInstanceNum pulumi.IntPtrInput
	// Automatically set a route-target
	VlanBasedAutoRouteTarget pulumi.BoolPtrInput
	// Advertise Default Gateway MAC/IP routes - Choices: `disable`, `enable`
	VlanBasedDefaultGatewayAdvertise pulumi.StringPtrInput
	// Data encapsulation method - Choices: `mpls`, `vxlan`
	VlanBasedEncapsulation pulumi.StringPtrInput
	// Disable IP local learning from dataplane
	VlanBasedIpLocalLearningDisable pulumi.BoolPtrInput
	// Enable IP local learning from dataplane
	VlanBasedIpLocalLearningEnable pulumi.BoolPtrInput
	// ASN:nn or IP-address:nn
	VlanBasedRd pulumi.StringPtrInput
	// Re-originate route-type 5
	VlanBasedReOriginateRouteType5 pulumi.BoolPtrInput
	// Ingress replication
	VlanBasedReplicationTypeIngress pulumi.BoolPtrInput
	// mp2mp replication
	VlanBasedReplicationTypeMp2mp pulumi.BoolPtrInput
	// p2mp replication
	VlanBasedReplicationTypeP2mp pulumi.BoolPtrInput
	// Static replication
	VlanBasedReplicationTypeStatic pulumi.BoolPtrInput
	// ASN:nn or IP-address:nn
	VlanBasedRouteTarget pulumi.StringPtrInput
	// ASN:nn or IP-address:nn
	VlanBasedRouteTargetBoth pulumi.StringPtrInput
	// ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
	VlanBasedRouteTargetExport pulumi.StringPtrInput
	// ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
	VlanBasedRouteTargetImport pulumi.StringPtrInput
}

func (EvpnInstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*evpnInstanceState)(nil)).Elem()
}

type evpnInstanceArgs struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// evpn instance number - Range: `1`-`65535`
	EvpnInstanceNum int `pulumi:"evpnInstanceNum"`
	// Automatically set a route-target
	VlanBasedAutoRouteTarget *bool `pulumi:"vlanBasedAutoRouteTarget"`
	// Advertise Default Gateway MAC/IP routes - Choices: `disable`, `enable`
	VlanBasedDefaultGatewayAdvertise *string `pulumi:"vlanBasedDefaultGatewayAdvertise"`
	// Data encapsulation method - Choices: `mpls`, `vxlan`
	VlanBasedEncapsulation *string `pulumi:"vlanBasedEncapsulation"`
	// Disable IP local learning from dataplane
	VlanBasedIpLocalLearningDisable *bool `pulumi:"vlanBasedIpLocalLearningDisable"`
	// Enable IP local learning from dataplane
	VlanBasedIpLocalLearningEnable *bool `pulumi:"vlanBasedIpLocalLearningEnable"`
	// ASN:nn or IP-address:nn
	VlanBasedRd *string `pulumi:"vlanBasedRd"`
	// Re-originate route-type 5
	VlanBasedReOriginateRouteType5 *bool `pulumi:"vlanBasedReOriginateRouteType5"`
	// Ingress replication
	VlanBasedReplicationTypeIngress *bool `pulumi:"vlanBasedReplicationTypeIngress"`
	// mp2mp replication
	VlanBasedReplicationTypeMp2mp *bool `pulumi:"vlanBasedReplicationTypeMp2mp"`
	// p2mp replication
	VlanBasedReplicationTypeP2mp *bool `pulumi:"vlanBasedReplicationTypeP2mp"`
	// Static replication
	VlanBasedReplicationTypeStatic *bool `pulumi:"vlanBasedReplicationTypeStatic"`
	// ASN:nn or IP-address:nn
	VlanBasedRouteTarget *string `pulumi:"vlanBasedRouteTarget"`
	// ASN:nn or IP-address:nn
	VlanBasedRouteTargetBoth *string `pulumi:"vlanBasedRouteTargetBoth"`
	// ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
	VlanBasedRouteTargetExport *string `pulumi:"vlanBasedRouteTargetExport"`
	// ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
	VlanBasedRouteTargetImport *string `pulumi:"vlanBasedRouteTargetImport"`
}

// The set of arguments for constructing a EvpnInstance resource.
type EvpnInstanceArgs struct {
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// evpn instance number - Range: `1`-`65535`
	EvpnInstanceNum pulumi.IntInput
	// Automatically set a route-target
	VlanBasedAutoRouteTarget pulumi.BoolPtrInput
	// Advertise Default Gateway MAC/IP routes - Choices: `disable`, `enable`
	VlanBasedDefaultGatewayAdvertise pulumi.StringPtrInput
	// Data encapsulation method - Choices: `mpls`, `vxlan`
	VlanBasedEncapsulation pulumi.StringPtrInput
	// Disable IP local learning from dataplane
	VlanBasedIpLocalLearningDisable pulumi.BoolPtrInput
	// Enable IP local learning from dataplane
	VlanBasedIpLocalLearningEnable pulumi.BoolPtrInput
	// ASN:nn or IP-address:nn
	VlanBasedRd pulumi.StringPtrInput
	// Re-originate route-type 5
	VlanBasedReOriginateRouteType5 pulumi.BoolPtrInput
	// Ingress replication
	VlanBasedReplicationTypeIngress pulumi.BoolPtrInput
	// mp2mp replication
	VlanBasedReplicationTypeMp2mp pulumi.BoolPtrInput
	// p2mp replication
	VlanBasedReplicationTypeP2mp pulumi.BoolPtrInput
	// Static replication
	VlanBasedReplicationTypeStatic pulumi.BoolPtrInput
	// ASN:nn or IP-address:nn
	VlanBasedRouteTarget pulumi.StringPtrInput
	// ASN:nn or IP-address:nn
	VlanBasedRouteTargetBoth pulumi.StringPtrInput
	// ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
	VlanBasedRouteTargetExport pulumi.StringPtrInput
	// ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
	VlanBasedRouteTargetImport pulumi.StringPtrInput
}

func (EvpnInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*evpnInstanceArgs)(nil)).Elem()
}

type EvpnInstanceInput interface {
	pulumi.Input

	ToEvpnInstanceOutput() EvpnInstanceOutput
	ToEvpnInstanceOutputWithContext(ctx context.Context) EvpnInstanceOutput
}

func (*EvpnInstance) ElementType() reflect.Type {
	return reflect.TypeOf((**EvpnInstance)(nil)).Elem()
}

func (i *EvpnInstance) ToEvpnInstanceOutput() EvpnInstanceOutput {
	return i.ToEvpnInstanceOutputWithContext(context.Background())
}

func (i *EvpnInstance) ToEvpnInstanceOutputWithContext(ctx context.Context) EvpnInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EvpnInstanceOutput)
}

func (i *EvpnInstance) ToOutput(ctx context.Context) pulumix.Output[*EvpnInstance] {
	return pulumix.Output[*EvpnInstance]{
		OutputState: i.ToEvpnInstanceOutputWithContext(ctx).OutputState,
	}
}

// EvpnInstanceArrayInput is an input type that accepts EvpnInstanceArray and EvpnInstanceArrayOutput values.
// You can construct a concrete instance of `EvpnInstanceArrayInput` via:
//
//	EvpnInstanceArray{ EvpnInstanceArgs{...} }
type EvpnInstanceArrayInput interface {
	pulumi.Input

	ToEvpnInstanceArrayOutput() EvpnInstanceArrayOutput
	ToEvpnInstanceArrayOutputWithContext(context.Context) EvpnInstanceArrayOutput
}

type EvpnInstanceArray []EvpnInstanceInput

func (EvpnInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EvpnInstance)(nil)).Elem()
}

func (i EvpnInstanceArray) ToEvpnInstanceArrayOutput() EvpnInstanceArrayOutput {
	return i.ToEvpnInstanceArrayOutputWithContext(context.Background())
}

func (i EvpnInstanceArray) ToEvpnInstanceArrayOutputWithContext(ctx context.Context) EvpnInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EvpnInstanceArrayOutput)
}

func (i EvpnInstanceArray) ToOutput(ctx context.Context) pulumix.Output[[]*EvpnInstance] {
	return pulumix.Output[[]*EvpnInstance]{
		OutputState: i.ToEvpnInstanceArrayOutputWithContext(ctx).OutputState,
	}
}

// EvpnInstanceMapInput is an input type that accepts EvpnInstanceMap and EvpnInstanceMapOutput values.
// You can construct a concrete instance of `EvpnInstanceMapInput` via:
//
//	EvpnInstanceMap{ "key": EvpnInstanceArgs{...} }
type EvpnInstanceMapInput interface {
	pulumi.Input

	ToEvpnInstanceMapOutput() EvpnInstanceMapOutput
	ToEvpnInstanceMapOutputWithContext(context.Context) EvpnInstanceMapOutput
}

type EvpnInstanceMap map[string]EvpnInstanceInput

func (EvpnInstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EvpnInstance)(nil)).Elem()
}

func (i EvpnInstanceMap) ToEvpnInstanceMapOutput() EvpnInstanceMapOutput {
	return i.ToEvpnInstanceMapOutputWithContext(context.Background())
}

func (i EvpnInstanceMap) ToEvpnInstanceMapOutputWithContext(ctx context.Context) EvpnInstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EvpnInstanceMapOutput)
}

func (i EvpnInstanceMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*EvpnInstance] {
	return pulumix.Output[map[string]*EvpnInstance]{
		OutputState: i.ToEvpnInstanceMapOutputWithContext(ctx).OutputState,
	}
}

type EvpnInstanceOutput struct{ *pulumi.OutputState }

func (EvpnInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EvpnInstance)(nil)).Elem()
}

func (o EvpnInstanceOutput) ToEvpnInstanceOutput() EvpnInstanceOutput {
	return o
}

func (o EvpnInstanceOutput) ToEvpnInstanceOutputWithContext(ctx context.Context) EvpnInstanceOutput {
	return o
}

func (o EvpnInstanceOutput) ToOutput(ctx context.Context) pulumix.Output[*EvpnInstance] {
	return pulumix.Output[*EvpnInstance]{
		OutputState: o.OutputState,
	}
}

// A device name from the provider configuration.
func (o EvpnInstanceOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EvpnInstance) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

// evpn instance number - Range: `1`-`65535`
func (o EvpnInstanceOutput) EvpnInstanceNum() pulumi.IntOutput {
	return o.ApplyT(func(v *EvpnInstance) pulumi.IntOutput { return v.EvpnInstanceNum }).(pulumi.IntOutput)
}

// Automatically set a route-target
func (o EvpnInstanceOutput) VlanBasedAutoRouteTarget() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EvpnInstance) pulumi.BoolPtrOutput { return v.VlanBasedAutoRouteTarget }).(pulumi.BoolPtrOutput)
}

// Advertise Default Gateway MAC/IP routes - Choices: `disable`, `enable`
func (o EvpnInstanceOutput) VlanBasedDefaultGatewayAdvertise() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EvpnInstance) pulumi.StringPtrOutput { return v.VlanBasedDefaultGatewayAdvertise }).(pulumi.StringPtrOutput)
}

// Data encapsulation method - Choices: `mpls`, `vxlan`
func (o EvpnInstanceOutput) VlanBasedEncapsulation() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EvpnInstance) pulumi.StringPtrOutput { return v.VlanBasedEncapsulation }).(pulumi.StringPtrOutput)
}

// Disable IP local learning from dataplane
func (o EvpnInstanceOutput) VlanBasedIpLocalLearningDisable() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EvpnInstance) pulumi.BoolPtrOutput { return v.VlanBasedIpLocalLearningDisable }).(pulumi.BoolPtrOutput)
}

// Enable IP local learning from dataplane
func (o EvpnInstanceOutput) VlanBasedIpLocalLearningEnable() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EvpnInstance) pulumi.BoolPtrOutput { return v.VlanBasedIpLocalLearningEnable }).(pulumi.BoolPtrOutput)
}

// ASN:nn or IP-address:nn
func (o EvpnInstanceOutput) VlanBasedRd() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EvpnInstance) pulumi.StringPtrOutput { return v.VlanBasedRd }).(pulumi.StringPtrOutput)
}

// Re-originate route-type 5
func (o EvpnInstanceOutput) VlanBasedReOriginateRouteType5() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EvpnInstance) pulumi.BoolPtrOutput { return v.VlanBasedReOriginateRouteType5 }).(pulumi.BoolPtrOutput)
}

// Ingress replication
func (o EvpnInstanceOutput) VlanBasedReplicationTypeIngress() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EvpnInstance) pulumi.BoolPtrOutput { return v.VlanBasedReplicationTypeIngress }).(pulumi.BoolPtrOutput)
}

// mp2mp replication
func (o EvpnInstanceOutput) VlanBasedReplicationTypeMp2mp() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EvpnInstance) pulumi.BoolPtrOutput { return v.VlanBasedReplicationTypeMp2mp }).(pulumi.BoolPtrOutput)
}

// p2mp replication
func (o EvpnInstanceOutput) VlanBasedReplicationTypeP2mp() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EvpnInstance) pulumi.BoolPtrOutput { return v.VlanBasedReplicationTypeP2mp }).(pulumi.BoolPtrOutput)
}

// Static replication
func (o EvpnInstanceOutput) VlanBasedReplicationTypeStatic() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EvpnInstance) pulumi.BoolPtrOutput { return v.VlanBasedReplicationTypeStatic }).(pulumi.BoolPtrOutput)
}

// ASN:nn or IP-address:nn
func (o EvpnInstanceOutput) VlanBasedRouteTarget() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EvpnInstance) pulumi.StringPtrOutput { return v.VlanBasedRouteTarget }).(pulumi.StringPtrOutput)
}

// ASN:nn or IP-address:nn
func (o EvpnInstanceOutput) VlanBasedRouteTargetBoth() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EvpnInstance) pulumi.StringPtrOutput { return v.VlanBasedRouteTargetBoth }).(pulumi.StringPtrOutput)
}

// ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
func (o EvpnInstanceOutput) VlanBasedRouteTargetExport() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EvpnInstance) pulumi.StringPtrOutput { return v.VlanBasedRouteTargetExport }).(pulumi.StringPtrOutput)
}

// ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
func (o EvpnInstanceOutput) VlanBasedRouteTargetImport() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EvpnInstance) pulumi.StringPtrOutput { return v.VlanBasedRouteTargetImport }).(pulumi.StringPtrOutput)
}

type EvpnInstanceArrayOutput struct{ *pulumi.OutputState }

func (EvpnInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EvpnInstance)(nil)).Elem()
}

func (o EvpnInstanceArrayOutput) ToEvpnInstanceArrayOutput() EvpnInstanceArrayOutput {
	return o
}

func (o EvpnInstanceArrayOutput) ToEvpnInstanceArrayOutputWithContext(ctx context.Context) EvpnInstanceArrayOutput {
	return o
}

func (o EvpnInstanceArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*EvpnInstance] {
	return pulumix.Output[[]*EvpnInstance]{
		OutputState: o.OutputState,
	}
}

func (o EvpnInstanceArrayOutput) Index(i pulumi.IntInput) EvpnInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EvpnInstance {
		return vs[0].([]*EvpnInstance)[vs[1].(int)]
	}).(EvpnInstanceOutput)
}

type EvpnInstanceMapOutput struct{ *pulumi.OutputState }

func (EvpnInstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EvpnInstance)(nil)).Elem()
}

func (o EvpnInstanceMapOutput) ToEvpnInstanceMapOutput() EvpnInstanceMapOutput {
	return o
}

func (o EvpnInstanceMapOutput) ToEvpnInstanceMapOutputWithContext(ctx context.Context) EvpnInstanceMapOutput {
	return o
}

func (o EvpnInstanceMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*EvpnInstance] {
	return pulumix.Output[map[string]*EvpnInstance]{
		OutputState: o.OutputState,
	}
}

func (o EvpnInstanceMapOutput) MapIndex(k pulumi.StringInput) EvpnInstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EvpnInstance {
		return vs[0].(map[string]*EvpnInstance)[vs[1].(string)]
	}).(EvpnInstanceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EvpnInstanceInput)(nil)).Elem(), &EvpnInstance{})
	pulumi.RegisterInputType(reflect.TypeOf((*EvpnInstanceArrayInput)(nil)).Elem(), EvpnInstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EvpnInstanceMapInput)(nil)).Elem(), EvpnInstanceMap{})
	pulumi.RegisterOutputType(EvpnInstanceOutput{})
	pulumi.RegisterOutputType(EvpnInstanceArrayOutput{})
	pulumi.RegisterOutputType(EvpnInstanceMapOutput{})
}
