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

type VlanAccessMap struct {
	pulumi.CustomResourceState

	// Take the action - Choices: `drop`, `forward`
	Action pulumi.StringPtrOutput `pulumi:"action"`
	// A device name from the provider configuration.
	Device           pulumi.StringPtrOutput   `pulumi:"device"`
	MatchIpAddresses pulumi.StringArrayOutput `pulumi:"matchIpAddresses"`
	// Match IPv6 address to access control.
	MatchIpv6Addresses pulumi.StringArrayOutput `pulumi:"matchIpv6Addresses"`
	// Vlan access map tag
	Name pulumi.StringOutput `pulumi:"name"`
	// Sequence to insert to/delete from existing vlan access-map entry - Range: `0`-`65535`
	Sequence pulumi.IntOutput `pulumi:"sequence"`
}

// NewVlanAccessMap registers a new resource with the given unique name, arguments, and options.
func NewVlanAccessMap(ctx *pulumi.Context,
	name string, args *VlanAccessMapArgs, opts ...pulumi.ResourceOption) (*VlanAccessMap, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Sequence == nil {
		return nil, errors.New("invalid value for required argument 'Sequence'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VlanAccessMap
	err := ctx.RegisterResource("iosxe:iosxe/vlanAccessMap:VlanAccessMap", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVlanAccessMap gets an existing VlanAccessMap resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVlanAccessMap(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VlanAccessMapState, opts ...pulumi.ResourceOption) (*VlanAccessMap, error) {
	var resource VlanAccessMap
	err := ctx.ReadResource("iosxe:iosxe/vlanAccessMap:VlanAccessMap", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VlanAccessMap resources.
type vlanAccessMapState struct {
	// Take the action - Choices: `drop`, `forward`
	Action *string `pulumi:"action"`
	// A device name from the provider configuration.
	Device           *string  `pulumi:"device"`
	MatchIpAddresses []string `pulumi:"matchIpAddresses"`
	// Match IPv6 address to access control.
	MatchIpv6Addresses []string `pulumi:"matchIpv6Addresses"`
	// Vlan access map tag
	Name *string `pulumi:"name"`
	// Sequence to insert to/delete from existing vlan access-map entry - Range: `0`-`65535`
	Sequence *int `pulumi:"sequence"`
}

type VlanAccessMapState struct {
	// Take the action - Choices: `drop`, `forward`
	Action pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device           pulumi.StringPtrInput
	MatchIpAddresses pulumi.StringArrayInput
	// Match IPv6 address to access control.
	MatchIpv6Addresses pulumi.StringArrayInput
	// Vlan access map tag
	Name pulumi.StringPtrInput
	// Sequence to insert to/delete from existing vlan access-map entry - Range: `0`-`65535`
	Sequence pulumi.IntPtrInput
}

func (VlanAccessMapState) ElementType() reflect.Type {
	return reflect.TypeOf((*vlanAccessMapState)(nil)).Elem()
}

type vlanAccessMapArgs struct {
	// Take the action - Choices: `drop`, `forward`
	Action *string `pulumi:"action"`
	// A device name from the provider configuration.
	Device           *string  `pulumi:"device"`
	MatchIpAddresses []string `pulumi:"matchIpAddresses"`
	// Match IPv6 address to access control.
	MatchIpv6Addresses []string `pulumi:"matchIpv6Addresses"`
	// Vlan access map tag
	Name *string `pulumi:"name"`
	// Sequence to insert to/delete from existing vlan access-map entry - Range: `0`-`65535`
	Sequence int `pulumi:"sequence"`
}

// The set of arguments for constructing a VlanAccessMap resource.
type VlanAccessMapArgs struct {
	// Take the action - Choices: `drop`, `forward`
	Action pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device           pulumi.StringPtrInput
	MatchIpAddresses pulumi.StringArrayInput
	// Match IPv6 address to access control.
	MatchIpv6Addresses pulumi.StringArrayInput
	// Vlan access map tag
	Name pulumi.StringPtrInput
	// Sequence to insert to/delete from existing vlan access-map entry - Range: `0`-`65535`
	Sequence pulumi.IntInput
}

func (VlanAccessMapArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*vlanAccessMapArgs)(nil)).Elem()
}

type VlanAccessMapInput interface {
	pulumi.Input

	ToVlanAccessMapOutput() VlanAccessMapOutput
	ToVlanAccessMapOutputWithContext(ctx context.Context) VlanAccessMapOutput
}

func (*VlanAccessMap) ElementType() reflect.Type {
	return reflect.TypeOf((**VlanAccessMap)(nil)).Elem()
}

func (i *VlanAccessMap) ToVlanAccessMapOutput() VlanAccessMapOutput {
	return i.ToVlanAccessMapOutputWithContext(context.Background())
}

func (i *VlanAccessMap) ToVlanAccessMapOutputWithContext(ctx context.Context) VlanAccessMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VlanAccessMapOutput)
}

func (i *VlanAccessMap) ToOutput(ctx context.Context) pulumix.Output[*VlanAccessMap] {
	return pulumix.Output[*VlanAccessMap]{
		OutputState: i.ToVlanAccessMapOutputWithContext(ctx).OutputState,
	}
}

// VlanAccessMapArrayInput is an input type that accepts VlanAccessMapArray and VlanAccessMapArrayOutput values.
// You can construct a concrete instance of `VlanAccessMapArrayInput` via:
//
//	VlanAccessMapArray{ VlanAccessMapArgs{...} }
type VlanAccessMapArrayInput interface {
	pulumi.Input

	ToVlanAccessMapArrayOutput() VlanAccessMapArrayOutput
	ToVlanAccessMapArrayOutputWithContext(context.Context) VlanAccessMapArrayOutput
}

type VlanAccessMapArray []VlanAccessMapInput

func (VlanAccessMapArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VlanAccessMap)(nil)).Elem()
}

func (i VlanAccessMapArray) ToVlanAccessMapArrayOutput() VlanAccessMapArrayOutput {
	return i.ToVlanAccessMapArrayOutputWithContext(context.Background())
}

func (i VlanAccessMapArray) ToVlanAccessMapArrayOutputWithContext(ctx context.Context) VlanAccessMapArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VlanAccessMapArrayOutput)
}

func (i VlanAccessMapArray) ToOutput(ctx context.Context) pulumix.Output[[]*VlanAccessMap] {
	return pulumix.Output[[]*VlanAccessMap]{
		OutputState: i.ToVlanAccessMapArrayOutputWithContext(ctx).OutputState,
	}
}

// VlanAccessMapMapInput is an input type that accepts VlanAccessMapMap and VlanAccessMapMapOutput values.
// You can construct a concrete instance of `VlanAccessMapMapInput` via:
//
//	VlanAccessMapMap{ "key": VlanAccessMapArgs{...} }
type VlanAccessMapMapInput interface {
	pulumi.Input

	ToVlanAccessMapMapOutput() VlanAccessMapMapOutput
	ToVlanAccessMapMapOutputWithContext(context.Context) VlanAccessMapMapOutput
}

type VlanAccessMapMap map[string]VlanAccessMapInput

func (VlanAccessMapMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VlanAccessMap)(nil)).Elem()
}

func (i VlanAccessMapMap) ToVlanAccessMapMapOutput() VlanAccessMapMapOutput {
	return i.ToVlanAccessMapMapOutputWithContext(context.Background())
}

func (i VlanAccessMapMap) ToVlanAccessMapMapOutputWithContext(ctx context.Context) VlanAccessMapMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VlanAccessMapMapOutput)
}

func (i VlanAccessMapMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*VlanAccessMap] {
	return pulumix.Output[map[string]*VlanAccessMap]{
		OutputState: i.ToVlanAccessMapMapOutputWithContext(ctx).OutputState,
	}
}

type VlanAccessMapOutput struct{ *pulumi.OutputState }

func (VlanAccessMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VlanAccessMap)(nil)).Elem()
}

func (o VlanAccessMapOutput) ToVlanAccessMapOutput() VlanAccessMapOutput {
	return o
}

func (o VlanAccessMapOutput) ToVlanAccessMapOutputWithContext(ctx context.Context) VlanAccessMapOutput {
	return o
}

func (o VlanAccessMapOutput) ToOutput(ctx context.Context) pulumix.Output[*VlanAccessMap] {
	return pulumix.Output[*VlanAccessMap]{
		OutputState: o.OutputState,
	}
}

// Take the action - Choices: `drop`, `forward`
func (o VlanAccessMapOutput) Action() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VlanAccessMap) pulumi.StringPtrOutput { return v.Action }).(pulumi.StringPtrOutput)
}

// A device name from the provider configuration.
func (o VlanAccessMapOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VlanAccessMap) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

func (o VlanAccessMapOutput) MatchIpAddresses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *VlanAccessMap) pulumi.StringArrayOutput { return v.MatchIpAddresses }).(pulumi.StringArrayOutput)
}

// Match IPv6 address to access control.
func (o VlanAccessMapOutput) MatchIpv6Addresses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *VlanAccessMap) pulumi.StringArrayOutput { return v.MatchIpv6Addresses }).(pulumi.StringArrayOutput)
}

// Vlan access map tag
func (o VlanAccessMapOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *VlanAccessMap) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Sequence to insert to/delete from existing vlan access-map entry - Range: `0`-`65535`
func (o VlanAccessMapOutput) Sequence() pulumi.IntOutput {
	return o.ApplyT(func(v *VlanAccessMap) pulumi.IntOutput { return v.Sequence }).(pulumi.IntOutput)
}

type VlanAccessMapArrayOutput struct{ *pulumi.OutputState }

func (VlanAccessMapArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VlanAccessMap)(nil)).Elem()
}

func (o VlanAccessMapArrayOutput) ToVlanAccessMapArrayOutput() VlanAccessMapArrayOutput {
	return o
}

func (o VlanAccessMapArrayOutput) ToVlanAccessMapArrayOutputWithContext(ctx context.Context) VlanAccessMapArrayOutput {
	return o
}

func (o VlanAccessMapArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*VlanAccessMap] {
	return pulumix.Output[[]*VlanAccessMap]{
		OutputState: o.OutputState,
	}
}

func (o VlanAccessMapArrayOutput) Index(i pulumi.IntInput) VlanAccessMapOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VlanAccessMap {
		return vs[0].([]*VlanAccessMap)[vs[1].(int)]
	}).(VlanAccessMapOutput)
}

type VlanAccessMapMapOutput struct{ *pulumi.OutputState }

func (VlanAccessMapMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VlanAccessMap)(nil)).Elem()
}

func (o VlanAccessMapMapOutput) ToVlanAccessMapMapOutput() VlanAccessMapMapOutput {
	return o
}

func (o VlanAccessMapMapOutput) ToVlanAccessMapMapOutputWithContext(ctx context.Context) VlanAccessMapMapOutput {
	return o
}

func (o VlanAccessMapMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*VlanAccessMap] {
	return pulumix.Output[map[string]*VlanAccessMap]{
		OutputState: o.OutputState,
	}
}

func (o VlanAccessMapMapOutput) MapIndex(k pulumi.StringInput) VlanAccessMapOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VlanAccessMap {
		return vs[0].(map[string]*VlanAccessMap)[vs[1].(string)]
	}).(VlanAccessMapOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VlanAccessMapInput)(nil)).Elem(), &VlanAccessMap{})
	pulumi.RegisterInputType(reflect.TypeOf((*VlanAccessMapArrayInput)(nil)).Elem(), VlanAccessMapArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VlanAccessMapMapInput)(nil)).Elem(), VlanAccessMapMap{})
	pulumi.RegisterOutputType(VlanAccessMapOutput{})
	pulumi.RegisterOutputType(VlanAccessMapArrayOutput{})
	pulumi.RegisterOutputType(VlanAccessMapMapOutput{})
}
