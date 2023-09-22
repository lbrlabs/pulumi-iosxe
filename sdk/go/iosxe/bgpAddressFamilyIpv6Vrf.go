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

// This resource can manage the BGP Address Family IPv6 VRF configuration.
//
// ## Import
//
// ```sh
//
//	$ pulumi import iosxe:index/bgpAddressFamilyIpv6Vrf:BgpAddressFamilyIpv6Vrf example "Cisco-IOS-XE-native:native/router/Cisco-IOS-XE-bgp:bgp=65000/address-family/with-vrf/ipv6=unicast"
//
// ```
type BgpAddressFamilyIpv6Vrf struct {
	pulumi.CustomResourceState

	// - Choices: `flowspec`, `mdt`, `multicast`, `mvpn`, `unicast`
	AfName pulumi.StringOutput `pulumi:"afName"`
	Asn    pulumi.StringOutput `pulumi:"asn"`
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrOutput `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device pulumi.StringPtrOutput                `pulumi:"device"`
	Vrfs   BgpAddressFamilyIpv6VrfVrfArrayOutput `pulumi:"vrfs"`
}

// NewBgpAddressFamilyIpv6Vrf registers a new resource with the given unique name, arguments, and options.
func NewBgpAddressFamilyIpv6Vrf(ctx *pulumi.Context,
	name string, args *BgpAddressFamilyIpv6VrfArgs, opts ...pulumi.ResourceOption) (*BgpAddressFamilyIpv6Vrf, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AfName == nil {
		return nil, errors.New("invalid value for required argument 'AfName'")
	}
	if args.Asn == nil {
		return nil, errors.New("invalid value for required argument 'Asn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BgpAddressFamilyIpv6Vrf
	err := ctx.RegisterResource("iosxe:index/bgpAddressFamilyIpv6Vrf:BgpAddressFamilyIpv6Vrf", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBgpAddressFamilyIpv6Vrf gets an existing BgpAddressFamilyIpv6Vrf resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBgpAddressFamilyIpv6Vrf(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BgpAddressFamilyIpv6VrfState, opts ...pulumi.ResourceOption) (*BgpAddressFamilyIpv6Vrf, error) {
	var resource BgpAddressFamilyIpv6Vrf
	err := ctx.ReadResource("iosxe:index/bgpAddressFamilyIpv6Vrf:BgpAddressFamilyIpv6Vrf", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BgpAddressFamilyIpv6Vrf resources.
type bgpAddressFamilyIpv6VrfState struct {
	// - Choices: `flowspec`, `mdt`, `multicast`, `mvpn`, `unicast`
	AfName *string `pulumi:"afName"`
	Asn    *string `pulumi:"asn"`
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode *string `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device *string                      `pulumi:"device"`
	Vrfs   []BgpAddressFamilyIpv6VrfVrf `pulumi:"vrfs"`
}

type BgpAddressFamilyIpv6VrfState struct {
	// - Choices: `flowspec`, `mdt`, `multicast`, `mvpn`, `unicast`
	AfName pulumi.StringPtrInput
	Asn    pulumi.StringPtrInput
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	Vrfs   BgpAddressFamilyIpv6VrfVrfArrayInput
}

func (BgpAddressFamilyIpv6VrfState) ElementType() reflect.Type {
	return reflect.TypeOf((*bgpAddressFamilyIpv6VrfState)(nil)).Elem()
}

type bgpAddressFamilyIpv6VrfArgs struct {
	// - Choices: `flowspec`, `mdt`, `multicast`, `mvpn`, `unicast`
	AfName string `pulumi:"afName"`
	Asn    string `pulumi:"asn"`
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode *string `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device *string                      `pulumi:"device"`
	Vrfs   []BgpAddressFamilyIpv6VrfVrf `pulumi:"vrfs"`
}

// The set of arguments for constructing a BgpAddressFamilyIpv6Vrf resource.
type BgpAddressFamilyIpv6VrfArgs struct {
	// - Choices: `flowspec`, `mdt`, `multicast`, `mvpn`, `unicast`
	AfName pulumi.StringInput
	Asn    pulumi.StringInput
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	Vrfs   BgpAddressFamilyIpv6VrfVrfArrayInput
}

func (BgpAddressFamilyIpv6VrfArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*bgpAddressFamilyIpv6VrfArgs)(nil)).Elem()
}

type BgpAddressFamilyIpv6VrfInput interface {
	pulumi.Input

	ToBgpAddressFamilyIpv6VrfOutput() BgpAddressFamilyIpv6VrfOutput
	ToBgpAddressFamilyIpv6VrfOutputWithContext(ctx context.Context) BgpAddressFamilyIpv6VrfOutput
}

func (*BgpAddressFamilyIpv6Vrf) ElementType() reflect.Type {
	return reflect.TypeOf((**BgpAddressFamilyIpv6Vrf)(nil)).Elem()
}

func (i *BgpAddressFamilyIpv6Vrf) ToBgpAddressFamilyIpv6VrfOutput() BgpAddressFamilyIpv6VrfOutput {
	return i.ToBgpAddressFamilyIpv6VrfOutputWithContext(context.Background())
}

func (i *BgpAddressFamilyIpv6Vrf) ToBgpAddressFamilyIpv6VrfOutputWithContext(ctx context.Context) BgpAddressFamilyIpv6VrfOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BgpAddressFamilyIpv6VrfOutput)
}

func (i *BgpAddressFamilyIpv6Vrf) ToOutput(ctx context.Context) pulumix.Output[*BgpAddressFamilyIpv6Vrf] {
	return pulumix.Output[*BgpAddressFamilyIpv6Vrf]{
		OutputState: i.ToBgpAddressFamilyIpv6VrfOutputWithContext(ctx).OutputState,
	}
}

// BgpAddressFamilyIpv6VrfArrayInput is an input type that accepts BgpAddressFamilyIpv6VrfArray and BgpAddressFamilyIpv6VrfArrayOutput values.
// You can construct a concrete instance of `BgpAddressFamilyIpv6VrfArrayInput` via:
//
//	BgpAddressFamilyIpv6VrfArray{ BgpAddressFamilyIpv6VrfArgs{...} }
type BgpAddressFamilyIpv6VrfArrayInput interface {
	pulumi.Input

	ToBgpAddressFamilyIpv6VrfArrayOutput() BgpAddressFamilyIpv6VrfArrayOutput
	ToBgpAddressFamilyIpv6VrfArrayOutputWithContext(context.Context) BgpAddressFamilyIpv6VrfArrayOutput
}

type BgpAddressFamilyIpv6VrfArray []BgpAddressFamilyIpv6VrfInput

func (BgpAddressFamilyIpv6VrfArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BgpAddressFamilyIpv6Vrf)(nil)).Elem()
}

func (i BgpAddressFamilyIpv6VrfArray) ToBgpAddressFamilyIpv6VrfArrayOutput() BgpAddressFamilyIpv6VrfArrayOutput {
	return i.ToBgpAddressFamilyIpv6VrfArrayOutputWithContext(context.Background())
}

func (i BgpAddressFamilyIpv6VrfArray) ToBgpAddressFamilyIpv6VrfArrayOutputWithContext(ctx context.Context) BgpAddressFamilyIpv6VrfArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BgpAddressFamilyIpv6VrfArrayOutput)
}

func (i BgpAddressFamilyIpv6VrfArray) ToOutput(ctx context.Context) pulumix.Output[[]*BgpAddressFamilyIpv6Vrf] {
	return pulumix.Output[[]*BgpAddressFamilyIpv6Vrf]{
		OutputState: i.ToBgpAddressFamilyIpv6VrfArrayOutputWithContext(ctx).OutputState,
	}
}

// BgpAddressFamilyIpv6VrfMapInput is an input type that accepts BgpAddressFamilyIpv6VrfMap and BgpAddressFamilyIpv6VrfMapOutput values.
// You can construct a concrete instance of `BgpAddressFamilyIpv6VrfMapInput` via:
//
//	BgpAddressFamilyIpv6VrfMap{ "key": BgpAddressFamilyIpv6VrfArgs{...} }
type BgpAddressFamilyIpv6VrfMapInput interface {
	pulumi.Input

	ToBgpAddressFamilyIpv6VrfMapOutput() BgpAddressFamilyIpv6VrfMapOutput
	ToBgpAddressFamilyIpv6VrfMapOutputWithContext(context.Context) BgpAddressFamilyIpv6VrfMapOutput
}

type BgpAddressFamilyIpv6VrfMap map[string]BgpAddressFamilyIpv6VrfInput

func (BgpAddressFamilyIpv6VrfMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BgpAddressFamilyIpv6Vrf)(nil)).Elem()
}

func (i BgpAddressFamilyIpv6VrfMap) ToBgpAddressFamilyIpv6VrfMapOutput() BgpAddressFamilyIpv6VrfMapOutput {
	return i.ToBgpAddressFamilyIpv6VrfMapOutputWithContext(context.Background())
}

func (i BgpAddressFamilyIpv6VrfMap) ToBgpAddressFamilyIpv6VrfMapOutputWithContext(ctx context.Context) BgpAddressFamilyIpv6VrfMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BgpAddressFamilyIpv6VrfMapOutput)
}

func (i BgpAddressFamilyIpv6VrfMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*BgpAddressFamilyIpv6Vrf] {
	return pulumix.Output[map[string]*BgpAddressFamilyIpv6Vrf]{
		OutputState: i.ToBgpAddressFamilyIpv6VrfMapOutputWithContext(ctx).OutputState,
	}
}

type BgpAddressFamilyIpv6VrfOutput struct{ *pulumi.OutputState }

func (BgpAddressFamilyIpv6VrfOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BgpAddressFamilyIpv6Vrf)(nil)).Elem()
}

func (o BgpAddressFamilyIpv6VrfOutput) ToBgpAddressFamilyIpv6VrfOutput() BgpAddressFamilyIpv6VrfOutput {
	return o
}

func (o BgpAddressFamilyIpv6VrfOutput) ToBgpAddressFamilyIpv6VrfOutputWithContext(ctx context.Context) BgpAddressFamilyIpv6VrfOutput {
	return o
}

func (o BgpAddressFamilyIpv6VrfOutput) ToOutput(ctx context.Context) pulumix.Output[*BgpAddressFamilyIpv6Vrf] {
	return pulumix.Output[*BgpAddressFamilyIpv6Vrf]{
		OutputState: o.OutputState,
	}
}

// - Choices: `flowspec`, `mdt`, `multicast`, `mvpn`, `unicast`
func (o BgpAddressFamilyIpv6VrfOutput) AfName() pulumi.StringOutput {
	return o.ApplyT(func(v *BgpAddressFamilyIpv6Vrf) pulumi.StringOutput { return v.AfName }).(pulumi.StringOutput)
}

func (o BgpAddressFamilyIpv6VrfOutput) Asn() pulumi.StringOutput {
	return o.ApplyT(func(v *BgpAddressFamilyIpv6Vrf) pulumi.StringOutput { return v.Asn }).(pulumi.StringOutput)
}

// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
// Default value is `all`. - Choices: `all`, `attributes`
func (o BgpAddressFamilyIpv6VrfOutput) DeleteMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BgpAddressFamilyIpv6Vrf) pulumi.StringPtrOutput { return v.DeleteMode }).(pulumi.StringPtrOutput)
}

// A device name from the provider configuration.
func (o BgpAddressFamilyIpv6VrfOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BgpAddressFamilyIpv6Vrf) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

func (o BgpAddressFamilyIpv6VrfOutput) Vrfs() BgpAddressFamilyIpv6VrfVrfArrayOutput {
	return o.ApplyT(func(v *BgpAddressFamilyIpv6Vrf) BgpAddressFamilyIpv6VrfVrfArrayOutput { return v.Vrfs }).(BgpAddressFamilyIpv6VrfVrfArrayOutput)
}

type BgpAddressFamilyIpv6VrfArrayOutput struct{ *pulumi.OutputState }

func (BgpAddressFamilyIpv6VrfArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BgpAddressFamilyIpv6Vrf)(nil)).Elem()
}

func (o BgpAddressFamilyIpv6VrfArrayOutput) ToBgpAddressFamilyIpv6VrfArrayOutput() BgpAddressFamilyIpv6VrfArrayOutput {
	return o
}

func (o BgpAddressFamilyIpv6VrfArrayOutput) ToBgpAddressFamilyIpv6VrfArrayOutputWithContext(ctx context.Context) BgpAddressFamilyIpv6VrfArrayOutput {
	return o
}

func (o BgpAddressFamilyIpv6VrfArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*BgpAddressFamilyIpv6Vrf] {
	return pulumix.Output[[]*BgpAddressFamilyIpv6Vrf]{
		OutputState: o.OutputState,
	}
}

func (o BgpAddressFamilyIpv6VrfArrayOutput) Index(i pulumi.IntInput) BgpAddressFamilyIpv6VrfOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BgpAddressFamilyIpv6Vrf {
		return vs[0].([]*BgpAddressFamilyIpv6Vrf)[vs[1].(int)]
	}).(BgpAddressFamilyIpv6VrfOutput)
}

type BgpAddressFamilyIpv6VrfMapOutput struct{ *pulumi.OutputState }

func (BgpAddressFamilyIpv6VrfMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BgpAddressFamilyIpv6Vrf)(nil)).Elem()
}

func (o BgpAddressFamilyIpv6VrfMapOutput) ToBgpAddressFamilyIpv6VrfMapOutput() BgpAddressFamilyIpv6VrfMapOutput {
	return o
}

func (o BgpAddressFamilyIpv6VrfMapOutput) ToBgpAddressFamilyIpv6VrfMapOutputWithContext(ctx context.Context) BgpAddressFamilyIpv6VrfMapOutput {
	return o
}

func (o BgpAddressFamilyIpv6VrfMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*BgpAddressFamilyIpv6Vrf] {
	return pulumix.Output[map[string]*BgpAddressFamilyIpv6Vrf]{
		OutputState: o.OutputState,
	}
}

func (o BgpAddressFamilyIpv6VrfMapOutput) MapIndex(k pulumi.StringInput) BgpAddressFamilyIpv6VrfOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BgpAddressFamilyIpv6Vrf {
		return vs[0].(map[string]*BgpAddressFamilyIpv6Vrf)[vs[1].(string)]
	}).(BgpAddressFamilyIpv6VrfOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BgpAddressFamilyIpv6VrfInput)(nil)).Elem(), &BgpAddressFamilyIpv6Vrf{})
	pulumi.RegisterInputType(reflect.TypeOf((*BgpAddressFamilyIpv6VrfArrayInput)(nil)).Elem(), BgpAddressFamilyIpv6VrfArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BgpAddressFamilyIpv6VrfMapInput)(nil)).Elem(), BgpAddressFamilyIpv6VrfMap{})
	pulumi.RegisterOutputType(BgpAddressFamilyIpv6VrfOutput{})
	pulumi.RegisterOutputType(BgpAddressFamilyIpv6VrfArrayOutput{})
	pulumi.RegisterOutputType(BgpAddressFamilyIpv6VrfMapOutput{})
}