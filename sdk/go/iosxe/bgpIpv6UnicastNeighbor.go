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

// This resource can manage the BGP IPv6 Unicast Neighbor configuration.
//
// ## Import
//
// ```sh
//
//	$ pulumi import iosxe:index/bgpIpv6UnicastNeighbor:BgpIpv6UnicastNeighbor example "Cisco-IOS-XE-native:native/router/Cisco-IOS-XE-bgp:bgp=65000/address-family/no-vrf/ipv6=unicast/ipv6-unicast/neighbor=3.3.3.3"
//
// ```
type BgpIpv6UnicastNeighbor struct {
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
	RouteMaps BgpIpv6UnicastNeighborRouteMapArrayOutput `pulumi:"routeMaps"`
	// Configure a neighbor as Route Reflector client
	RouteReflectorClient pulumi.BoolPtrOutput `pulumi:"routeReflectorClient"`
	// - Choices: `both`, `extended`, `standard`
	SendCommunity pulumi.StringPtrOutput `pulumi:"sendCommunity"`
}

// NewBgpIpv6UnicastNeighbor registers a new resource with the given unique name, arguments, and options.
func NewBgpIpv6UnicastNeighbor(ctx *pulumi.Context,
	name string, args *BgpIpv6UnicastNeighborArgs, opts ...pulumi.ResourceOption) (*BgpIpv6UnicastNeighbor, error) {
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
	var resource BgpIpv6UnicastNeighbor
	err := ctx.RegisterResource("iosxe:index/bgpIpv6UnicastNeighbor:BgpIpv6UnicastNeighbor", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBgpIpv6UnicastNeighbor gets an existing BgpIpv6UnicastNeighbor resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBgpIpv6UnicastNeighbor(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BgpIpv6UnicastNeighborState, opts ...pulumi.ResourceOption) (*BgpIpv6UnicastNeighbor, error) {
	var resource BgpIpv6UnicastNeighbor
	err := ctx.ReadResource("iosxe:index/bgpIpv6UnicastNeighbor:BgpIpv6UnicastNeighbor", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BgpIpv6UnicastNeighbor resources.
type bgpIpv6UnicastNeighborState struct {
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
	RouteMaps []BgpIpv6UnicastNeighborRouteMap `pulumi:"routeMaps"`
	// Configure a neighbor as Route Reflector client
	RouteReflectorClient *bool `pulumi:"routeReflectorClient"`
	// - Choices: `both`, `extended`, `standard`
	SendCommunity *string `pulumi:"sendCommunity"`
}

type BgpIpv6UnicastNeighborState struct {
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
	RouteMaps BgpIpv6UnicastNeighborRouteMapArrayInput
	// Configure a neighbor as Route Reflector client
	RouteReflectorClient pulumi.BoolPtrInput
	// - Choices: `both`, `extended`, `standard`
	SendCommunity pulumi.StringPtrInput
}

func (BgpIpv6UnicastNeighborState) ElementType() reflect.Type {
	return reflect.TypeOf((*bgpIpv6UnicastNeighborState)(nil)).Elem()
}

type bgpIpv6UnicastNeighborArgs struct {
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
	RouteMaps []BgpIpv6UnicastNeighborRouteMap `pulumi:"routeMaps"`
	// Configure a neighbor as Route Reflector client
	RouteReflectorClient *bool `pulumi:"routeReflectorClient"`
	// - Choices: `both`, `extended`, `standard`
	SendCommunity *string `pulumi:"sendCommunity"`
}

// The set of arguments for constructing a BgpIpv6UnicastNeighbor resource.
type BgpIpv6UnicastNeighborArgs struct {
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
	RouteMaps BgpIpv6UnicastNeighborRouteMapArrayInput
	// Configure a neighbor as Route Reflector client
	RouteReflectorClient pulumi.BoolPtrInput
	// - Choices: `both`, `extended`, `standard`
	SendCommunity pulumi.StringPtrInput
}

func (BgpIpv6UnicastNeighborArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*bgpIpv6UnicastNeighborArgs)(nil)).Elem()
}

type BgpIpv6UnicastNeighborInput interface {
	pulumi.Input

	ToBgpIpv6UnicastNeighborOutput() BgpIpv6UnicastNeighborOutput
	ToBgpIpv6UnicastNeighborOutputWithContext(ctx context.Context) BgpIpv6UnicastNeighborOutput
}

func (*BgpIpv6UnicastNeighbor) ElementType() reflect.Type {
	return reflect.TypeOf((**BgpIpv6UnicastNeighbor)(nil)).Elem()
}

func (i *BgpIpv6UnicastNeighbor) ToBgpIpv6UnicastNeighborOutput() BgpIpv6UnicastNeighborOutput {
	return i.ToBgpIpv6UnicastNeighborOutputWithContext(context.Background())
}

func (i *BgpIpv6UnicastNeighbor) ToBgpIpv6UnicastNeighborOutputWithContext(ctx context.Context) BgpIpv6UnicastNeighborOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BgpIpv6UnicastNeighborOutput)
}

func (i *BgpIpv6UnicastNeighbor) ToOutput(ctx context.Context) pulumix.Output[*BgpIpv6UnicastNeighbor] {
	return pulumix.Output[*BgpIpv6UnicastNeighbor]{
		OutputState: i.ToBgpIpv6UnicastNeighborOutputWithContext(ctx).OutputState,
	}
}

// BgpIpv6UnicastNeighborArrayInput is an input type that accepts BgpIpv6UnicastNeighborArray and BgpIpv6UnicastNeighborArrayOutput values.
// You can construct a concrete instance of `BgpIpv6UnicastNeighborArrayInput` via:
//
//	BgpIpv6UnicastNeighborArray{ BgpIpv6UnicastNeighborArgs{...} }
type BgpIpv6UnicastNeighborArrayInput interface {
	pulumi.Input

	ToBgpIpv6UnicastNeighborArrayOutput() BgpIpv6UnicastNeighborArrayOutput
	ToBgpIpv6UnicastNeighborArrayOutputWithContext(context.Context) BgpIpv6UnicastNeighborArrayOutput
}

type BgpIpv6UnicastNeighborArray []BgpIpv6UnicastNeighborInput

func (BgpIpv6UnicastNeighborArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BgpIpv6UnicastNeighbor)(nil)).Elem()
}

func (i BgpIpv6UnicastNeighborArray) ToBgpIpv6UnicastNeighborArrayOutput() BgpIpv6UnicastNeighborArrayOutput {
	return i.ToBgpIpv6UnicastNeighborArrayOutputWithContext(context.Background())
}

func (i BgpIpv6UnicastNeighborArray) ToBgpIpv6UnicastNeighborArrayOutputWithContext(ctx context.Context) BgpIpv6UnicastNeighborArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BgpIpv6UnicastNeighborArrayOutput)
}

func (i BgpIpv6UnicastNeighborArray) ToOutput(ctx context.Context) pulumix.Output[[]*BgpIpv6UnicastNeighbor] {
	return pulumix.Output[[]*BgpIpv6UnicastNeighbor]{
		OutputState: i.ToBgpIpv6UnicastNeighborArrayOutputWithContext(ctx).OutputState,
	}
}

// BgpIpv6UnicastNeighborMapInput is an input type that accepts BgpIpv6UnicastNeighborMap and BgpIpv6UnicastNeighborMapOutput values.
// You can construct a concrete instance of `BgpIpv6UnicastNeighborMapInput` via:
//
//	BgpIpv6UnicastNeighborMap{ "key": BgpIpv6UnicastNeighborArgs{...} }
type BgpIpv6UnicastNeighborMapInput interface {
	pulumi.Input

	ToBgpIpv6UnicastNeighborMapOutput() BgpIpv6UnicastNeighborMapOutput
	ToBgpIpv6UnicastNeighborMapOutputWithContext(context.Context) BgpIpv6UnicastNeighborMapOutput
}

type BgpIpv6UnicastNeighborMap map[string]BgpIpv6UnicastNeighborInput

func (BgpIpv6UnicastNeighborMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BgpIpv6UnicastNeighbor)(nil)).Elem()
}

func (i BgpIpv6UnicastNeighborMap) ToBgpIpv6UnicastNeighborMapOutput() BgpIpv6UnicastNeighborMapOutput {
	return i.ToBgpIpv6UnicastNeighborMapOutputWithContext(context.Background())
}

func (i BgpIpv6UnicastNeighborMap) ToBgpIpv6UnicastNeighborMapOutputWithContext(ctx context.Context) BgpIpv6UnicastNeighborMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BgpIpv6UnicastNeighborMapOutput)
}

func (i BgpIpv6UnicastNeighborMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*BgpIpv6UnicastNeighbor] {
	return pulumix.Output[map[string]*BgpIpv6UnicastNeighbor]{
		OutputState: i.ToBgpIpv6UnicastNeighborMapOutputWithContext(ctx).OutputState,
	}
}

type BgpIpv6UnicastNeighborOutput struct{ *pulumi.OutputState }

func (BgpIpv6UnicastNeighborOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BgpIpv6UnicastNeighbor)(nil)).Elem()
}

func (o BgpIpv6UnicastNeighborOutput) ToBgpIpv6UnicastNeighborOutput() BgpIpv6UnicastNeighborOutput {
	return o
}

func (o BgpIpv6UnicastNeighborOutput) ToBgpIpv6UnicastNeighborOutputWithContext(ctx context.Context) BgpIpv6UnicastNeighborOutput {
	return o
}

func (o BgpIpv6UnicastNeighborOutput) ToOutput(ctx context.Context) pulumix.Output[*BgpIpv6UnicastNeighbor] {
	return pulumix.Output[*BgpIpv6UnicastNeighbor]{
		OutputState: o.OutputState,
	}
}

// Enable the address family for this neighbor - Default value: `true`
func (o BgpIpv6UnicastNeighborOutput) Activate() pulumi.BoolOutput {
	return o.ApplyT(func(v *BgpIpv6UnicastNeighbor) pulumi.BoolOutput { return v.Activate }).(pulumi.BoolOutput)
}

func (o BgpIpv6UnicastNeighborOutput) Asn() pulumi.StringOutput {
	return o.ApplyT(func(v *BgpIpv6UnicastNeighbor) pulumi.StringOutput { return v.Asn }).(pulumi.StringOutput)
}

// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
// Default value is `all`. - Choices: `all`, `attributes`
func (o BgpIpv6UnicastNeighborOutput) DeleteMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BgpIpv6UnicastNeighbor) pulumi.StringPtrOutput { return v.DeleteMode }).(pulumi.StringPtrOutput)
}

// A device name from the provider configuration.
func (o BgpIpv6UnicastNeighborOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BgpIpv6UnicastNeighbor) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

func (o BgpIpv6UnicastNeighborOutput) Ip() pulumi.StringOutput {
	return o.ApplyT(func(v *BgpIpv6UnicastNeighbor) pulumi.StringOutput { return v.Ip }).(pulumi.StringOutput)
}

// Apply route map to neighbor
func (o BgpIpv6UnicastNeighborOutput) RouteMaps() BgpIpv6UnicastNeighborRouteMapArrayOutput {
	return o.ApplyT(func(v *BgpIpv6UnicastNeighbor) BgpIpv6UnicastNeighborRouteMapArrayOutput { return v.RouteMaps }).(BgpIpv6UnicastNeighborRouteMapArrayOutput)
}

// Configure a neighbor as Route Reflector client
func (o BgpIpv6UnicastNeighborOutput) RouteReflectorClient() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *BgpIpv6UnicastNeighbor) pulumi.BoolPtrOutput { return v.RouteReflectorClient }).(pulumi.BoolPtrOutput)
}

// - Choices: `both`, `extended`, `standard`
func (o BgpIpv6UnicastNeighborOutput) SendCommunity() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BgpIpv6UnicastNeighbor) pulumi.StringPtrOutput { return v.SendCommunity }).(pulumi.StringPtrOutput)
}

type BgpIpv6UnicastNeighborArrayOutput struct{ *pulumi.OutputState }

func (BgpIpv6UnicastNeighborArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BgpIpv6UnicastNeighbor)(nil)).Elem()
}

func (o BgpIpv6UnicastNeighborArrayOutput) ToBgpIpv6UnicastNeighborArrayOutput() BgpIpv6UnicastNeighborArrayOutput {
	return o
}

func (o BgpIpv6UnicastNeighborArrayOutput) ToBgpIpv6UnicastNeighborArrayOutputWithContext(ctx context.Context) BgpIpv6UnicastNeighborArrayOutput {
	return o
}

func (o BgpIpv6UnicastNeighborArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*BgpIpv6UnicastNeighbor] {
	return pulumix.Output[[]*BgpIpv6UnicastNeighbor]{
		OutputState: o.OutputState,
	}
}

func (o BgpIpv6UnicastNeighborArrayOutput) Index(i pulumi.IntInput) BgpIpv6UnicastNeighborOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BgpIpv6UnicastNeighbor {
		return vs[0].([]*BgpIpv6UnicastNeighbor)[vs[1].(int)]
	}).(BgpIpv6UnicastNeighborOutput)
}

type BgpIpv6UnicastNeighborMapOutput struct{ *pulumi.OutputState }

func (BgpIpv6UnicastNeighborMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BgpIpv6UnicastNeighbor)(nil)).Elem()
}

func (o BgpIpv6UnicastNeighborMapOutput) ToBgpIpv6UnicastNeighborMapOutput() BgpIpv6UnicastNeighborMapOutput {
	return o
}

func (o BgpIpv6UnicastNeighborMapOutput) ToBgpIpv6UnicastNeighborMapOutputWithContext(ctx context.Context) BgpIpv6UnicastNeighborMapOutput {
	return o
}

func (o BgpIpv6UnicastNeighborMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*BgpIpv6UnicastNeighbor] {
	return pulumix.Output[map[string]*BgpIpv6UnicastNeighbor]{
		OutputState: o.OutputState,
	}
}

func (o BgpIpv6UnicastNeighborMapOutput) MapIndex(k pulumi.StringInput) BgpIpv6UnicastNeighborOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BgpIpv6UnicastNeighbor {
		return vs[0].(map[string]*BgpIpv6UnicastNeighbor)[vs[1].(string)]
	}).(BgpIpv6UnicastNeighborOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BgpIpv6UnicastNeighborInput)(nil)).Elem(), &BgpIpv6UnicastNeighbor{})
	pulumi.RegisterInputType(reflect.TypeOf((*BgpIpv6UnicastNeighborArrayInput)(nil)).Elem(), BgpIpv6UnicastNeighborArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BgpIpv6UnicastNeighborMapInput)(nil)).Elem(), BgpIpv6UnicastNeighborMap{})
	pulumi.RegisterOutputType(BgpIpv6UnicastNeighborOutput{})
	pulumi.RegisterOutputType(BgpIpv6UnicastNeighborArrayOutput{})
	pulumi.RegisterOutputType(BgpIpv6UnicastNeighborMapOutput{})
}
