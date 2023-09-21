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

type BgpIpv4UnicastNeighbor struct {
	pulumi.CustomResourceState

	// Enable the address family for this neighbor - Default value: `true`
	Activate pulumi.BoolOutput   `pulumi:"activate"`
	Asn      pulumi.StringOutput `pulumi:"asn"`
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrOutput `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device pulumi.StringPtrOutput `pulumi:"device"`
	Ip     pulumi.StringOutput    `pulumi:"ip"`
	// Apply route map to neighbor
	RouteMaps BgpIpv4UnicastNeighborRouteMapArrayOutput `pulumi:"routeMaps"`
	// Configure a neighbor as Route Reflector client
	RouteReflectorClient pulumi.BoolPtrOutput `pulumi:"routeReflectorClient"`
	// - Choices: `both`, `extended`, `standard`
	SendCommunity pulumi.StringPtrOutput `pulumi:"sendCommunity"`
}

// NewBgpIpv4UnicastNeighbor registers a new resource with the given unique name, arguments, and options.
func NewBgpIpv4UnicastNeighbor(ctx *pulumi.Context,
	name string, args *BgpIpv4UnicastNeighborArgs, opts ...pulumi.ResourceOption) (*BgpIpv4UnicastNeighbor, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Asn == nil {
		return nil, errors.New("invalid value for required argument 'Asn'")
	}
	if args.Ip == nil {
		return nil, errors.New("invalid value for required argument 'Ip'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BgpIpv4UnicastNeighbor
	err := ctx.RegisterResource("iosxe:iosxe/bgpIpv4UnicastNeighbor:BgpIpv4UnicastNeighbor", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBgpIpv4UnicastNeighbor gets an existing BgpIpv4UnicastNeighbor resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBgpIpv4UnicastNeighbor(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BgpIpv4UnicastNeighborState, opts ...pulumi.ResourceOption) (*BgpIpv4UnicastNeighbor, error) {
	var resource BgpIpv4UnicastNeighbor
	err := ctx.ReadResource("iosxe:iosxe/bgpIpv4UnicastNeighbor:BgpIpv4UnicastNeighbor", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BgpIpv4UnicastNeighbor resources.
type bgpIpv4UnicastNeighborState struct {
	// Enable the address family for this neighbor - Default value: `true`
	Activate *bool   `pulumi:"activate"`
	Asn      *string `pulumi:"asn"`
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode *string `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	Ip     *string `pulumi:"ip"`
	// Apply route map to neighbor
	RouteMaps []BgpIpv4UnicastNeighborRouteMap `pulumi:"routeMaps"`
	// Configure a neighbor as Route Reflector client
	RouteReflectorClient *bool `pulumi:"routeReflectorClient"`
	// - Choices: `both`, `extended`, `standard`
	SendCommunity *string `pulumi:"sendCommunity"`
}

type BgpIpv4UnicastNeighborState struct {
	// Enable the address family for this neighbor - Default value: `true`
	Activate pulumi.BoolPtrInput
	Asn      pulumi.StringPtrInput
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	Ip     pulumi.StringPtrInput
	// Apply route map to neighbor
	RouteMaps BgpIpv4UnicastNeighborRouteMapArrayInput
	// Configure a neighbor as Route Reflector client
	RouteReflectorClient pulumi.BoolPtrInput
	// - Choices: `both`, `extended`, `standard`
	SendCommunity pulumi.StringPtrInput
}

func (BgpIpv4UnicastNeighborState) ElementType() reflect.Type {
	return reflect.TypeOf((*bgpIpv4UnicastNeighborState)(nil)).Elem()
}

type bgpIpv4UnicastNeighborArgs struct {
	// Enable the address family for this neighbor - Default value: `true`
	Activate *bool  `pulumi:"activate"`
	Asn      string `pulumi:"asn"`
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode *string `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	Ip     string  `pulumi:"ip"`
	// Apply route map to neighbor
	RouteMaps []BgpIpv4UnicastNeighborRouteMap `pulumi:"routeMaps"`
	// Configure a neighbor as Route Reflector client
	RouteReflectorClient *bool `pulumi:"routeReflectorClient"`
	// - Choices: `both`, `extended`, `standard`
	SendCommunity *string `pulumi:"sendCommunity"`
}

// The set of arguments for constructing a BgpIpv4UnicastNeighbor resource.
type BgpIpv4UnicastNeighborArgs struct {
	// Enable the address family for this neighbor - Default value: `true`
	Activate pulumi.BoolPtrInput
	Asn      pulumi.StringInput
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	Ip     pulumi.StringInput
	// Apply route map to neighbor
	RouteMaps BgpIpv4UnicastNeighborRouteMapArrayInput
	// Configure a neighbor as Route Reflector client
	RouteReflectorClient pulumi.BoolPtrInput
	// - Choices: `both`, `extended`, `standard`
	SendCommunity pulumi.StringPtrInput
}

func (BgpIpv4UnicastNeighborArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*bgpIpv4UnicastNeighborArgs)(nil)).Elem()
}

type BgpIpv4UnicastNeighborInput interface {
	pulumi.Input

	ToBgpIpv4UnicastNeighborOutput() BgpIpv4UnicastNeighborOutput
	ToBgpIpv4UnicastNeighborOutputWithContext(ctx context.Context) BgpIpv4UnicastNeighborOutput
}

func (*BgpIpv4UnicastNeighbor) ElementType() reflect.Type {
	return reflect.TypeOf((**BgpIpv4UnicastNeighbor)(nil)).Elem()
}

func (i *BgpIpv4UnicastNeighbor) ToBgpIpv4UnicastNeighborOutput() BgpIpv4UnicastNeighborOutput {
	return i.ToBgpIpv4UnicastNeighborOutputWithContext(context.Background())
}

func (i *BgpIpv4UnicastNeighbor) ToBgpIpv4UnicastNeighborOutputWithContext(ctx context.Context) BgpIpv4UnicastNeighborOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BgpIpv4UnicastNeighborOutput)
}

func (i *BgpIpv4UnicastNeighbor) ToOutput(ctx context.Context) pulumix.Output[*BgpIpv4UnicastNeighbor] {
	return pulumix.Output[*BgpIpv4UnicastNeighbor]{
		OutputState: i.ToBgpIpv4UnicastNeighborOutputWithContext(ctx).OutputState,
	}
}

// BgpIpv4UnicastNeighborArrayInput is an input type that accepts BgpIpv4UnicastNeighborArray and BgpIpv4UnicastNeighborArrayOutput values.
// You can construct a concrete instance of `BgpIpv4UnicastNeighborArrayInput` via:
//
//	BgpIpv4UnicastNeighborArray{ BgpIpv4UnicastNeighborArgs{...} }
type BgpIpv4UnicastNeighborArrayInput interface {
	pulumi.Input

	ToBgpIpv4UnicastNeighborArrayOutput() BgpIpv4UnicastNeighborArrayOutput
	ToBgpIpv4UnicastNeighborArrayOutputWithContext(context.Context) BgpIpv4UnicastNeighborArrayOutput
}

type BgpIpv4UnicastNeighborArray []BgpIpv4UnicastNeighborInput

func (BgpIpv4UnicastNeighborArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BgpIpv4UnicastNeighbor)(nil)).Elem()
}

func (i BgpIpv4UnicastNeighborArray) ToBgpIpv4UnicastNeighborArrayOutput() BgpIpv4UnicastNeighborArrayOutput {
	return i.ToBgpIpv4UnicastNeighborArrayOutputWithContext(context.Background())
}

func (i BgpIpv4UnicastNeighborArray) ToBgpIpv4UnicastNeighborArrayOutputWithContext(ctx context.Context) BgpIpv4UnicastNeighborArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BgpIpv4UnicastNeighborArrayOutput)
}

func (i BgpIpv4UnicastNeighborArray) ToOutput(ctx context.Context) pulumix.Output[[]*BgpIpv4UnicastNeighbor] {
	return pulumix.Output[[]*BgpIpv4UnicastNeighbor]{
		OutputState: i.ToBgpIpv4UnicastNeighborArrayOutputWithContext(ctx).OutputState,
	}
}

// BgpIpv4UnicastNeighborMapInput is an input type that accepts BgpIpv4UnicastNeighborMap and BgpIpv4UnicastNeighborMapOutput values.
// You can construct a concrete instance of `BgpIpv4UnicastNeighborMapInput` via:
//
//	BgpIpv4UnicastNeighborMap{ "key": BgpIpv4UnicastNeighborArgs{...} }
type BgpIpv4UnicastNeighborMapInput interface {
	pulumi.Input

	ToBgpIpv4UnicastNeighborMapOutput() BgpIpv4UnicastNeighborMapOutput
	ToBgpIpv4UnicastNeighborMapOutputWithContext(context.Context) BgpIpv4UnicastNeighborMapOutput
}

type BgpIpv4UnicastNeighborMap map[string]BgpIpv4UnicastNeighborInput

func (BgpIpv4UnicastNeighborMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BgpIpv4UnicastNeighbor)(nil)).Elem()
}

func (i BgpIpv4UnicastNeighborMap) ToBgpIpv4UnicastNeighborMapOutput() BgpIpv4UnicastNeighborMapOutput {
	return i.ToBgpIpv4UnicastNeighborMapOutputWithContext(context.Background())
}

func (i BgpIpv4UnicastNeighborMap) ToBgpIpv4UnicastNeighborMapOutputWithContext(ctx context.Context) BgpIpv4UnicastNeighborMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BgpIpv4UnicastNeighborMapOutput)
}

func (i BgpIpv4UnicastNeighborMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*BgpIpv4UnicastNeighbor] {
	return pulumix.Output[map[string]*BgpIpv4UnicastNeighbor]{
		OutputState: i.ToBgpIpv4UnicastNeighborMapOutputWithContext(ctx).OutputState,
	}
}

type BgpIpv4UnicastNeighborOutput struct{ *pulumi.OutputState }

func (BgpIpv4UnicastNeighborOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BgpIpv4UnicastNeighbor)(nil)).Elem()
}

func (o BgpIpv4UnicastNeighborOutput) ToBgpIpv4UnicastNeighborOutput() BgpIpv4UnicastNeighborOutput {
	return o
}

func (o BgpIpv4UnicastNeighborOutput) ToBgpIpv4UnicastNeighborOutputWithContext(ctx context.Context) BgpIpv4UnicastNeighborOutput {
	return o
}

func (o BgpIpv4UnicastNeighborOutput) ToOutput(ctx context.Context) pulumix.Output[*BgpIpv4UnicastNeighbor] {
	return pulumix.Output[*BgpIpv4UnicastNeighbor]{
		OutputState: o.OutputState,
	}
}

// Enable the address family for this neighbor - Default value: `true`
func (o BgpIpv4UnicastNeighborOutput) Activate() pulumi.BoolOutput {
	return o.ApplyT(func(v *BgpIpv4UnicastNeighbor) pulumi.BoolOutput { return v.Activate }).(pulumi.BoolOutput)
}

func (o BgpIpv4UnicastNeighborOutput) Asn() pulumi.StringOutput {
	return o.ApplyT(func(v *BgpIpv4UnicastNeighbor) pulumi.StringOutput { return v.Asn }).(pulumi.StringOutput)
}

// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
// Default value is `all`. - Choices: `all`, `attributes`
func (o BgpIpv4UnicastNeighborOutput) DeleteMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BgpIpv4UnicastNeighbor) pulumi.StringPtrOutput { return v.DeleteMode }).(pulumi.StringPtrOutput)
}

// A device name from the provider configuration.
func (o BgpIpv4UnicastNeighborOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BgpIpv4UnicastNeighbor) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

func (o BgpIpv4UnicastNeighborOutput) Ip() pulumi.StringOutput {
	return o.ApplyT(func(v *BgpIpv4UnicastNeighbor) pulumi.StringOutput { return v.Ip }).(pulumi.StringOutput)
}

// Apply route map to neighbor
func (o BgpIpv4UnicastNeighborOutput) RouteMaps() BgpIpv4UnicastNeighborRouteMapArrayOutput {
	return o.ApplyT(func(v *BgpIpv4UnicastNeighbor) BgpIpv4UnicastNeighborRouteMapArrayOutput { return v.RouteMaps }).(BgpIpv4UnicastNeighborRouteMapArrayOutput)
}

// Configure a neighbor as Route Reflector client
func (o BgpIpv4UnicastNeighborOutput) RouteReflectorClient() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *BgpIpv4UnicastNeighbor) pulumi.BoolPtrOutput { return v.RouteReflectorClient }).(pulumi.BoolPtrOutput)
}

// - Choices: `both`, `extended`, `standard`
func (o BgpIpv4UnicastNeighborOutput) SendCommunity() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BgpIpv4UnicastNeighbor) pulumi.StringPtrOutput { return v.SendCommunity }).(pulumi.StringPtrOutput)
}

type BgpIpv4UnicastNeighborArrayOutput struct{ *pulumi.OutputState }

func (BgpIpv4UnicastNeighborArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BgpIpv4UnicastNeighbor)(nil)).Elem()
}

func (o BgpIpv4UnicastNeighborArrayOutput) ToBgpIpv4UnicastNeighborArrayOutput() BgpIpv4UnicastNeighborArrayOutput {
	return o
}

func (o BgpIpv4UnicastNeighborArrayOutput) ToBgpIpv4UnicastNeighborArrayOutputWithContext(ctx context.Context) BgpIpv4UnicastNeighborArrayOutput {
	return o
}

func (o BgpIpv4UnicastNeighborArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*BgpIpv4UnicastNeighbor] {
	return pulumix.Output[[]*BgpIpv4UnicastNeighbor]{
		OutputState: o.OutputState,
	}
}

func (o BgpIpv4UnicastNeighborArrayOutput) Index(i pulumi.IntInput) BgpIpv4UnicastNeighborOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BgpIpv4UnicastNeighbor {
		return vs[0].([]*BgpIpv4UnicastNeighbor)[vs[1].(int)]
	}).(BgpIpv4UnicastNeighborOutput)
}

type BgpIpv4UnicastNeighborMapOutput struct{ *pulumi.OutputState }

func (BgpIpv4UnicastNeighborMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BgpIpv4UnicastNeighbor)(nil)).Elem()
}

func (o BgpIpv4UnicastNeighborMapOutput) ToBgpIpv4UnicastNeighborMapOutput() BgpIpv4UnicastNeighborMapOutput {
	return o
}

func (o BgpIpv4UnicastNeighborMapOutput) ToBgpIpv4UnicastNeighborMapOutputWithContext(ctx context.Context) BgpIpv4UnicastNeighborMapOutput {
	return o
}

func (o BgpIpv4UnicastNeighborMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*BgpIpv4UnicastNeighbor] {
	return pulumix.Output[map[string]*BgpIpv4UnicastNeighbor]{
		OutputState: o.OutputState,
	}
}

func (o BgpIpv4UnicastNeighborMapOutput) MapIndex(k pulumi.StringInput) BgpIpv4UnicastNeighborOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BgpIpv4UnicastNeighbor {
		return vs[0].(map[string]*BgpIpv4UnicastNeighbor)[vs[1].(string)]
	}).(BgpIpv4UnicastNeighborOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BgpIpv4UnicastNeighborInput)(nil)).Elem(), &BgpIpv4UnicastNeighbor{})
	pulumi.RegisterInputType(reflect.TypeOf((*BgpIpv4UnicastNeighborArrayInput)(nil)).Elem(), BgpIpv4UnicastNeighborArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BgpIpv4UnicastNeighborMapInput)(nil)).Elem(), BgpIpv4UnicastNeighborMap{})
	pulumi.RegisterOutputType(BgpIpv4UnicastNeighborOutput{})
	pulumi.RegisterOutputType(BgpIpv4UnicastNeighborArrayOutput{})
	pulumi.RegisterOutputType(BgpIpv4UnicastNeighborMapOutput{})
}