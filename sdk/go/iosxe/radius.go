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

// This resource can manage the Radius configuration.
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
//			_, err := iosxe.NewRadius(ctx, "example", &iosxe.RadiusArgs{
//				AccountingPort:               pulumi.Int(1812),
//				AuthenticationPort:           pulumi.Int(1813),
//				AutomateTesterIgnoreAcctPort: pulumi.Bool(true),
//				AutomateTesterProbeOnConfig:  pulumi.Bool(true),
//				AutomateTesterUsername:       pulumi.String("dummy"),
//				Ipv4Address:                  pulumi.String("10.10.15.12"),
//				Key:                          pulumi.String("123"),
//				PacKey:                       pulumi.String("123"),
//				PacKeyEncryption:             pulumi.String("0"),
//				Retransmit:                   pulumi.Int(3),
//				Timeout:                      pulumi.Int(4),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
//
//	$ pulumi import iosxe:index/radius:Radius example "Cisco-IOS-XE-native:native/radius/Cisco-IOS-XE-aaa:server=radius_10.10.15.12"
//
// ```
type Radius struct {
	pulumi.CustomResourceState

	// UDP port for RADIUS accounting server (default is 1813) - Range: `0`-`65534`
	AccountingPort pulumi.IntPtrOutput `pulumi:"accountingPort"`
	// UDP port for RADIUS authentication server (default is 1812) - Range: `0`-`65534`
	AuthenticationPort pulumi.IntPtrOutput `pulumi:"authenticationPort"`
	// Do not test accounting ports of the servers.
	AutomateTesterIgnoreAcctPort pulumi.BoolPtrOutput `pulumi:"automateTesterIgnoreAcctPort"`
	// Send a packet to verify the server status
	AutomateTesterProbeOnConfig pulumi.BoolPtrOutput   `pulumi:"automateTesterProbeOnConfig"`
	AutomateTesterUsername      pulumi.StringPtrOutput `pulumi:"automateTesterUsername"`
	// A device name from the provider configuration.
	Device pulumi.StringPtrOutput `pulumi:"device"`
	// IPv4 address or Hostname for radius server
	Ipv4Address pulumi.StringPtrOutput `pulumi:"ipv4Address"`
	Key         pulumi.StringPtrOutput `pulumi:"key"`
	// Name for the radius server configuration
	Name pulumi.StringOutput `pulumi:"name"`
	// The UNENCRYPTED (cleartext) server key
	PacKey pulumi.StringPtrOutput `pulumi:"pacKey"`
	// 0 - Specifies an UNENCRYPTED key will follow 6 - Specifies an ENCRYPTED key will follow 7 - Specifies HIDDEN key will
	// follow - Choices: `0`, `6`, `7`
	PacKeyEncryption pulumi.StringPtrOutput `pulumi:"pacKeyEncryption"`
	// Number of retries to active server (overrides default) - Range: `0`-`100`
	Retransmit pulumi.IntPtrOutput `pulumi:"retransmit"`
	// Time to wait for a RADIUS server to reply (overrides default) - Range: `1`-`1000`
	Timeout pulumi.IntPtrOutput `pulumi:"timeout"`
}

// NewRadius registers a new resource with the given unique name, arguments, and options.
func NewRadius(ctx *pulumi.Context,
	name string, args *RadiusArgs, opts ...pulumi.ResourceOption) (*Radius, error) {
	if args == nil {
		args = &RadiusArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Radius
	err := ctx.RegisterResource("iosxe:index/radius:Radius", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRadius gets an existing Radius resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRadius(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RadiusState, opts ...pulumi.ResourceOption) (*Radius, error) {
	var resource Radius
	err := ctx.ReadResource("iosxe:index/radius:Radius", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Radius resources.
type radiusState struct {
	// UDP port for RADIUS accounting server (default is 1813) - Range: `0`-`65534`
	AccountingPort *int `pulumi:"accountingPort"`
	// UDP port for RADIUS authentication server (default is 1812) - Range: `0`-`65534`
	AuthenticationPort *int `pulumi:"authenticationPort"`
	// Do not test accounting ports of the servers.
	AutomateTesterIgnoreAcctPort *bool `pulumi:"automateTesterIgnoreAcctPort"`
	// Send a packet to verify the server status
	AutomateTesterProbeOnConfig *bool   `pulumi:"automateTesterProbeOnConfig"`
	AutomateTesterUsername      *string `pulumi:"automateTesterUsername"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// IPv4 address or Hostname for radius server
	Ipv4Address *string `pulumi:"ipv4Address"`
	Key         *string `pulumi:"key"`
	// Name for the radius server configuration
	Name *string `pulumi:"name"`
	// The UNENCRYPTED (cleartext) server key
	PacKey *string `pulumi:"pacKey"`
	// 0 - Specifies an UNENCRYPTED key will follow 6 - Specifies an ENCRYPTED key will follow 7 - Specifies HIDDEN key will
	// follow - Choices: `0`, `6`, `7`
	PacKeyEncryption *string `pulumi:"pacKeyEncryption"`
	// Number of retries to active server (overrides default) - Range: `0`-`100`
	Retransmit *int `pulumi:"retransmit"`
	// Time to wait for a RADIUS server to reply (overrides default) - Range: `1`-`1000`
	Timeout *int `pulumi:"timeout"`
}

type RadiusState struct {
	// UDP port for RADIUS accounting server (default is 1813) - Range: `0`-`65534`
	AccountingPort pulumi.IntPtrInput
	// UDP port for RADIUS authentication server (default is 1812) - Range: `0`-`65534`
	AuthenticationPort pulumi.IntPtrInput
	// Do not test accounting ports of the servers.
	AutomateTesterIgnoreAcctPort pulumi.BoolPtrInput
	// Send a packet to verify the server status
	AutomateTesterProbeOnConfig pulumi.BoolPtrInput
	AutomateTesterUsername      pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// IPv4 address or Hostname for radius server
	Ipv4Address pulumi.StringPtrInput
	Key         pulumi.StringPtrInput
	// Name for the radius server configuration
	Name pulumi.StringPtrInput
	// The UNENCRYPTED (cleartext) server key
	PacKey pulumi.StringPtrInput
	// 0 - Specifies an UNENCRYPTED key will follow 6 - Specifies an ENCRYPTED key will follow 7 - Specifies HIDDEN key will
	// follow - Choices: `0`, `6`, `7`
	PacKeyEncryption pulumi.StringPtrInput
	// Number of retries to active server (overrides default) - Range: `0`-`100`
	Retransmit pulumi.IntPtrInput
	// Time to wait for a RADIUS server to reply (overrides default) - Range: `1`-`1000`
	Timeout pulumi.IntPtrInput
}

func (RadiusState) ElementType() reflect.Type {
	return reflect.TypeOf((*radiusState)(nil)).Elem()
}

type radiusArgs struct {
	// UDP port for RADIUS accounting server (default is 1813) - Range: `0`-`65534`
	AccountingPort *int `pulumi:"accountingPort"`
	// UDP port for RADIUS authentication server (default is 1812) - Range: `0`-`65534`
	AuthenticationPort *int `pulumi:"authenticationPort"`
	// Do not test accounting ports of the servers.
	AutomateTesterIgnoreAcctPort *bool `pulumi:"automateTesterIgnoreAcctPort"`
	// Send a packet to verify the server status
	AutomateTesterProbeOnConfig *bool   `pulumi:"automateTesterProbeOnConfig"`
	AutomateTesterUsername      *string `pulumi:"automateTesterUsername"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// IPv4 address or Hostname for radius server
	Ipv4Address *string `pulumi:"ipv4Address"`
	Key         *string `pulumi:"key"`
	// Name for the radius server configuration
	Name *string `pulumi:"name"`
	// The UNENCRYPTED (cleartext) server key
	PacKey *string `pulumi:"pacKey"`
	// 0 - Specifies an UNENCRYPTED key will follow 6 - Specifies an ENCRYPTED key will follow 7 - Specifies HIDDEN key will
	// follow - Choices: `0`, `6`, `7`
	PacKeyEncryption *string `pulumi:"pacKeyEncryption"`
	// Number of retries to active server (overrides default) - Range: `0`-`100`
	Retransmit *int `pulumi:"retransmit"`
	// Time to wait for a RADIUS server to reply (overrides default) - Range: `1`-`1000`
	Timeout *int `pulumi:"timeout"`
}

// The set of arguments for constructing a Radius resource.
type RadiusArgs struct {
	// UDP port for RADIUS accounting server (default is 1813) - Range: `0`-`65534`
	AccountingPort pulumi.IntPtrInput
	// UDP port for RADIUS authentication server (default is 1812) - Range: `0`-`65534`
	AuthenticationPort pulumi.IntPtrInput
	// Do not test accounting ports of the servers.
	AutomateTesterIgnoreAcctPort pulumi.BoolPtrInput
	// Send a packet to verify the server status
	AutomateTesterProbeOnConfig pulumi.BoolPtrInput
	AutomateTesterUsername      pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// IPv4 address or Hostname for radius server
	Ipv4Address pulumi.StringPtrInput
	Key         pulumi.StringPtrInput
	// Name for the radius server configuration
	Name pulumi.StringPtrInput
	// The UNENCRYPTED (cleartext) server key
	PacKey pulumi.StringPtrInput
	// 0 - Specifies an UNENCRYPTED key will follow 6 - Specifies an ENCRYPTED key will follow 7 - Specifies HIDDEN key will
	// follow - Choices: `0`, `6`, `7`
	PacKeyEncryption pulumi.StringPtrInput
	// Number of retries to active server (overrides default) - Range: `0`-`100`
	Retransmit pulumi.IntPtrInput
	// Time to wait for a RADIUS server to reply (overrides default) - Range: `1`-`1000`
	Timeout pulumi.IntPtrInput
}

func (RadiusArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*radiusArgs)(nil)).Elem()
}

type RadiusInput interface {
	pulumi.Input

	ToRadiusOutput() RadiusOutput
	ToRadiusOutputWithContext(ctx context.Context) RadiusOutput
}

func (*Radius) ElementType() reflect.Type {
	return reflect.TypeOf((**Radius)(nil)).Elem()
}

func (i *Radius) ToRadiusOutput() RadiusOutput {
	return i.ToRadiusOutputWithContext(context.Background())
}

func (i *Radius) ToRadiusOutputWithContext(ctx context.Context) RadiusOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RadiusOutput)
}

func (i *Radius) ToOutput(ctx context.Context) pulumix.Output[*Radius] {
	return pulumix.Output[*Radius]{
		OutputState: i.ToRadiusOutputWithContext(ctx).OutputState,
	}
}

// RadiusArrayInput is an input type that accepts RadiusArray and RadiusArrayOutput values.
// You can construct a concrete instance of `RadiusArrayInput` via:
//
//	RadiusArray{ RadiusArgs{...} }
type RadiusArrayInput interface {
	pulumi.Input

	ToRadiusArrayOutput() RadiusArrayOutput
	ToRadiusArrayOutputWithContext(context.Context) RadiusArrayOutput
}

type RadiusArray []RadiusInput

func (RadiusArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Radius)(nil)).Elem()
}

func (i RadiusArray) ToRadiusArrayOutput() RadiusArrayOutput {
	return i.ToRadiusArrayOutputWithContext(context.Background())
}

func (i RadiusArray) ToRadiusArrayOutputWithContext(ctx context.Context) RadiusArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RadiusArrayOutput)
}

func (i RadiusArray) ToOutput(ctx context.Context) pulumix.Output[[]*Radius] {
	return pulumix.Output[[]*Radius]{
		OutputState: i.ToRadiusArrayOutputWithContext(ctx).OutputState,
	}
}

// RadiusMapInput is an input type that accepts RadiusMap and RadiusMapOutput values.
// You can construct a concrete instance of `RadiusMapInput` via:
//
//	RadiusMap{ "key": RadiusArgs{...} }
type RadiusMapInput interface {
	pulumi.Input

	ToRadiusMapOutput() RadiusMapOutput
	ToRadiusMapOutputWithContext(context.Context) RadiusMapOutput
}

type RadiusMap map[string]RadiusInput

func (RadiusMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Radius)(nil)).Elem()
}

func (i RadiusMap) ToRadiusMapOutput() RadiusMapOutput {
	return i.ToRadiusMapOutputWithContext(context.Background())
}

func (i RadiusMap) ToRadiusMapOutputWithContext(ctx context.Context) RadiusMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RadiusMapOutput)
}

func (i RadiusMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Radius] {
	return pulumix.Output[map[string]*Radius]{
		OutputState: i.ToRadiusMapOutputWithContext(ctx).OutputState,
	}
}

type RadiusOutput struct{ *pulumi.OutputState }

func (RadiusOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Radius)(nil)).Elem()
}

func (o RadiusOutput) ToRadiusOutput() RadiusOutput {
	return o
}

func (o RadiusOutput) ToRadiusOutputWithContext(ctx context.Context) RadiusOutput {
	return o
}

func (o RadiusOutput) ToOutput(ctx context.Context) pulumix.Output[*Radius] {
	return pulumix.Output[*Radius]{
		OutputState: o.OutputState,
	}
}

// UDP port for RADIUS accounting server (default is 1813) - Range: `0`-`65534`
func (o RadiusOutput) AccountingPort() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Radius) pulumi.IntPtrOutput { return v.AccountingPort }).(pulumi.IntPtrOutput)
}

// UDP port for RADIUS authentication server (default is 1812) - Range: `0`-`65534`
func (o RadiusOutput) AuthenticationPort() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Radius) pulumi.IntPtrOutput { return v.AuthenticationPort }).(pulumi.IntPtrOutput)
}

// Do not test accounting ports of the servers.
func (o RadiusOutput) AutomateTesterIgnoreAcctPort() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Radius) pulumi.BoolPtrOutput { return v.AutomateTesterIgnoreAcctPort }).(pulumi.BoolPtrOutput)
}

// Send a packet to verify the server status
func (o RadiusOutput) AutomateTesterProbeOnConfig() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Radius) pulumi.BoolPtrOutput { return v.AutomateTesterProbeOnConfig }).(pulumi.BoolPtrOutput)
}

func (o RadiusOutput) AutomateTesterUsername() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Radius) pulumi.StringPtrOutput { return v.AutomateTesterUsername }).(pulumi.StringPtrOutput)
}

// A device name from the provider configuration.
func (o RadiusOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Radius) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

// IPv4 address or Hostname for radius server
func (o RadiusOutput) Ipv4Address() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Radius) pulumi.StringPtrOutput { return v.Ipv4Address }).(pulumi.StringPtrOutput)
}

func (o RadiusOutput) Key() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Radius) pulumi.StringPtrOutput { return v.Key }).(pulumi.StringPtrOutput)
}

// Name for the radius server configuration
func (o RadiusOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Radius) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The UNENCRYPTED (cleartext) server key
func (o RadiusOutput) PacKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Radius) pulumi.StringPtrOutput { return v.PacKey }).(pulumi.StringPtrOutput)
}

// 0 - Specifies an UNENCRYPTED key will follow 6 - Specifies an ENCRYPTED key will follow 7 - Specifies HIDDEN key will
// follow - Choices: `0`, `6`, `7`
func (o RadiusOutput) PacKeyEncryption() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Radius) pulumi.StringPtrOutput { return v.PacKeyEncryption }).(pulumi.StringPtrOutput)
}

// Number of retries to active server (overrides default) - Range: `0`-`100`
func (o RadiusOutput) Retransmit() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Radius) pulumi.IntPtrOutput { return v.Retransmit }).(pulumi.IntPtrOutput)
}

// Time to wait for a RADIUS server to reply (overrides default) - Range: `1`-`1000`
func (o RadiusOutput) Timeout() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Radius) pulumi.IntPtrOutput { return v.Timeout }).(pulumi.IntPtrOutput)
}

type RadiusArrayOutput struct{ *pulumi.OutputState }

func (RadiusArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Radius)(nil)).Elem()
}

func (o RadiusArrayOutput) ToRadiusArrayOutput() RadiusArrayOutput {
	return o
}

func (o RadiusArrayOutput) ToRadiusArrayOutputWithContext(ctx context.Context) RadiusArrayOutput {
	return o
}

func (o RadiusArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Radius] {
	return pulumix.Output[[]*Radius]{
		OutputState: o.OutputState,
	}
}

func (o RadiusArrayOutput) Index(i pulumi.IntInput) RadiusOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Radius {
		return vs[0].([]*Radius)[vs[1].(int)]
	}).(RadiusOutput)
}

type RadiusMapOutput struct{ *pulumi.OutputState }

func (RadiusMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Radius)(nil)).Elem()
}

func (o RadiusMapOutput) ToRadiusMapOutput() RadiusMapOutput {
	return o
}

func (o RadiusMapOutput) ToRadiusMapOutputWithContext(ctx context.Context) RadiusMapOutput {
	return o
}

func (o RadiusMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Radius] {
	return pulumix.Output[map[string]*Radius]{
		OutputState: o.OutputState,
	}
}

func (o RadiusMapOutput) MapIndex(k pulumi.StringInput) RadiusOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Radius {
		return vs[0].(map[string]*Radius)[vs[1].(string)]
	}).(RadiusOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RadiusInput)(nil)).Elem(), &Radius{})
	pulumi.RegisterInputType(reflect.TypeOf((*RadiusArrayInput)(nil)).Elem(), RadiusArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RadiusMapInput)(nil)).Elem(), RadiusMap{})
	pulumi.RegisterOutputType(RadiusOutput{})
	pulumi.RegisterOutputType(RadiusArrayOutput{})
	pulumi.RegisterOutputType(RadiusMapOutput{})
}