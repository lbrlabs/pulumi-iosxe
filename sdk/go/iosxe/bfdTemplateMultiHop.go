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

// This resource can manage the BFD Template Multi Hop configuration.
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
//			_, err := iosxe.NewBfdTemplateMultiHop(ctx, "example", &iosxe.BfdTemplateMultiHopArgs{
//				AuthenticationMd5Keychain:   pulumi.String("KEYNAME"),
//				DampeningHalfTime:           pulumi.Int(21),
//				DampeningMaxSuppressingTime: pulumi.Int(70),
//				DampeningSuppressTime:       pulumi.Int(1900),
//				DampeningUnsuppressTime:     pulumi.Int(1800),
//				Echo:                        pulumi.Bool(true),
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
//	$ pulumi import iosxe:index/bfdTemplateMultiHop:BfdTemplateMultiHop example "Cisco-IOS-XE-native:native/bfd-template/Cisco-IOS-XE-bfd:multi-hop=T11"
//
// ```
type BfdTemplateMultiHop struct {
	pulumi.CustomResourceState

	// keychain name
	AuthenticationMd5Keychain pulumi.StringPtrOutput `pulumi:"authenticationMd5Keychain"`
	// keychain name
	AuthenticationMeticulousMd5Keychain pulumi.StringPtrOutput `pulumi:"authenticationMeticulousMd5Keychain"`
	// keychain name
	AuthenticationMeticulousSha1keychain pulumi.StringPtrOutput `pulumi:"authenticationMeticulousSha1keychain"`
	// keychain name
	AuthenticationSha1Keychain pulumi.StringPtrOutput `pulumi:"authenticationSha1Keychain"`
	// down monitoring
	DampeningDownMonitoring pulumi.BoolPtrOutput `pulumi:"dampeningDownMonitoring"`
	// Half-life time for the penalty - Range: `1`-`30`
	DampeningHalfTime pulumi.IntPtrOutput `pulumi:"dampeningHalfTime"`
	// Maximum duration to suppress a session - Range: `1`-`420`
	DampeningMaxSuppressingTime pulumi.IntPtrOutput `pulumi:"dampeningMaxSuppressingTime"`
	// Value to start suppressing a session - Range: `1`-`18000`
	DampeningSuppressTime pulumi.IntPtrOutput `pulumi:"dampeningSuppressTime"`
	// Stability threshold to enter dampening in down dampened state(seconds) - Range: `60`-`3600`
	DampeningThreshold pulumi.IntPtrOutput `pulumi:"dampeningThreshold"`
	// Value to unsuppress a session - Range: `1`-`18000`
	DampeningUnsuppressTime pulumi.IntPtrOutput `pulumi:"dampeningUnsuppressTime"`
	// A device name from the provider configuration.
	Device pulumi.StringPtrOutput `pulumi:"device"`
	// Use echo adjunct as bfd detection mechanism
	Echo pulumi.BoolPtrOutput `pulumi:"echo"`
	// Specify BFD timers in microseconds
	IntervalMicroseconds pulumi.BoolPtrOutput `pulumi:"intervalMicroseconds"`
	// Minimum transmit and receive interval capability - Range: `3300`-`9999000`
	IntervalMicrosecondsBoth pulumi.IntPtrOutput `pulumi:"intervalMicrosecondsBoth"`
	// Minimum receive interval capability - Range: `3300`-`9999000`
	IntervalMicrosecondsMinRx pulumi.IntPtrOutput `pulumi:"intervalMicrosecondsMinRx"`
	// Minimum transmit interval capability - Range: `3300`-`9999000`
	IntervalMicrosecondsMinTx pulumi.IntPtrOutput `pulumi:"intervalMicrosecondsMinTx"`
	// Multiplier value used to compute holddown - Range: `3`-`50`
	IntervalMicrosecondsMultiplier pulumi.IntPtrOutput `pulumi:"intervalMicrosecondsMultiplier"`
	// Minimum transmit and receive interval capability - Range: `4`-`9999`
	IntervalMillisecondsBoth pulumi.IntPtrOutput `pulumi:"intervalMillisecondsBoth"`
	// Minimum receive interval capability - Range: `4`-`9999`
	IntervalMillisecondsMinRx pulumi.IntPtrOutput `pulumi:"intervalMillisecondsMinRx"`
	// Minimum transmit interval capability - Range: `4`-`9999`
	IntervalMillisecondsMinTx pulumi.IntPtrOutput `pulumi:"intervalMillisecondsMinTx"`
	// Multiplier value used to compute holddown - Range: `3`-`50`
	IntervalMillisecondsMultiplier pulumi.IntPtrOutput `pulumi:"intervalMillisecondsMultiplier"`
	Name                           pulumi.StringOutput `pulumi:"name"`
}

// NewBfdTemplateMultiHop registers a new resource with the given unique name, arguments, and options.
func NewBfdTemplateMultiHop(ctx *pulumi.Context,
	name string, args *BfdTemplateMultiHopArgs, opts ...pulumi.ResourceOption) (*BfdTemplateMultiHop, error) {
	if args == nil {
		args = &BfdTemplateMultiHopArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BfdTemplateMultiHop
	err := ctx.RegisterResource("iosxe:index/bfdTemplateMultiHop:BfdTemplateMultiHop", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBfdTemplateMultiHop gets an existing BfdTemplateMultiHop resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBfdTemplateMultiHop(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BfdTemplateMultiHopState, opts ...pulumi.ResourceOption) (*BfdTemplateMultiHop, error) {
	var resource BfdTemplateMultiHop
	err := ctx.ReadResource("iosxe:index/bfdTemplateMultiHop:BfdTemplateMultiHop", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BfdTemplateMultiHop resources.
type bfdTemplateMultiHopState struct {
	// keychain name
	AuthenticationMd5Keychain *string `pulumi:"authenticationMd5Keychain"`
	// keychain name
	AuthenticationMeticulousMd5Keychain *string `pulumi:"authenticationMeticulousMd5Keychain"`
	// keychain name
	AuthenticationMeticulousSha1keychain *string `pulumi:"authenticationMeticulousSha1keychain"`
	// keychain name
	AuthenticationSha1Keychain *string `pulumi:"authenticationSha1Keychain"`
	// down monitoring
	DampeningDownMonitoring *bool `pulumi:"dampeningDownMonitoring"`
	// Half-life time for the penalty - Range: `1`-`30`
	DampeningHalfTime *int `pulumi:"dampeningHalfTime"`
	// Maximum duration to suppress a session - Range: `1`-`420`
	DampeningMaxSuppressingTime *int `pulumi:"dampeningMaxSuppressingTime"`
	// Value to start suppressing a session - Range: `1`-`18000`
	DampeningSuppressTime *int `pulumi:"dampeningSuppressTime"`
	// Stability threshold to enter dampening in down dampened state(seconds) - Range: `60`-`3600`
	DampeningThreshold *int `pulumi:"dampeningThreshold"`
	// Value to unsuppress a session - Range: `1`-`18000`
	DampeningUnsuppressTime *int `pulumi:"dampeningUnsuppressTime"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// Use echo adjunct as bfd detection mechanism
	Echo *bool `pulumi:"echo"`
	// Specify BFD timers in microseconds
	IntervalMicroseconds *bool `pulumi:"intervalMicroseconds"`
	// Minimum transmit and receive interval capability - Range: `3300`-`9999000`
	IntervalMicrosecondsBoth *int `pulumi:"intervalMicrosecondsBoth"`
	// Minimum receive interval capability - Range: `3300`-`9999000`
	IntervalMicrosecondsMinRx *int `pulumi:"intervalMicrosecondsMinRx"`
	// Minimum transmit interval capability - Range: `3300`-`9999000`
	IntervalMicrosecondsMinTx *int `pulumi:"intervalMicrosecondsMinTx"`
	// Multiplier value used to compute holddown - Range: `3`-`50`
	IntervalMicrosecondsMultiplier *int `pulumi:"intervalMicrosecondsMultiplier"`
	// Minimum transmit and receive interval capability - Range: `4`-`9999`
	IntervalMillisecondsBoth *int `pulumi:"intervalMillisecondsBoth"`
	// Minimum receive interval capability - Range: `4`-`9999`
	IntervalMillisecondsMinRx *int `pulumi:"intervalMillisecondsMinRx"`
	// Minimum transmit interval capability - Range: `4`-`9999`
	IntervalMillisecondsMinTx *int `pulumi:"intervalMillisecondsMinTx"`
	// Multiplier value used to compute holddown - Range: `3`-`50`
	IntervalMillisecondsMultiplier *int    `pulumi:"intervalMillisecondsMultiplier"`
	Name                           *string `pulumi:"name"`
}

type BfdTemplateMultiHopState struct {
	// keychain name
	AuthenticationMd5Keychain pulumi.StringPtrInput
	// keychain name
	AuthenticationMeticulousMd5Keychain pulumi.StringPtrInput
	// keychain name
	AuthenticationMeticulousSha1keychain pulumi.StringPtrInput
	// keychain name
	AuthenticationSha1Keychain pulumi.StringPtrInput
	// down monitoring
	DampeningDownMonitoring pulumi.BoolPtrInput
	// Half-life time for the penalty - Range: `1`-`30`
	DampeningHalfTime pulumi.IntPtrInput
	// Maximum duration to suppress a session - Range: `1`-`420`
	DampeningMaxSuppressingTime pulumi.IntPtrInput
	// Value to start suppressing a session - Range: `1`-`18000`
	DampeningSuppressTime pulumi.IntPtrInput
	// Stability threshold to enter dampening in down dampened state(seconds) - Range: `60`-`3600`
	DampeningThreshold pulumi.IntPtrInput
	// Value to unsuppress a session - Range: `1`-`18000`
	DampeningUnsuppressTime pulumi.IntPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// Use echo adjunct as bfd detection mechanism
	Echo pulumi.BoolPtrInput
	// Specify BFD timers in microseconds
	IntervalMicroseconds pulumi.BoolPtrInput
	// Minimum transmit and receive interval capability - Range: `3300`-`9999000`
	IntervalMicrosecondsBoth pulumi.IntPtrInput
	// Minimum receive interval capability - Range: `3300`-`9999000`
	IntervalMicrosecondsMinRx pulumi.IntPtrInput
	// Minimum transmit interval capability - Range: `3300`-`9999000`
	IntervalMicrosecondsMinTx pulumi.IntPtrInput
	// Multiplier value used to compute holddown - Range: `3`-`50`
	IntervalMicrosecondsMultiplier pulumi.IntPtrInput
	// Minimum transmit and receive interval capability - Range: `4`-`9999`
	IntervalMillisecondsBoth pulumi.IntPtrInput
	// Minimum receive interval capability - Range: `4`-`9999`
	IntervalMillisecondsMinRx pulumi.IntPtrInput
	// Minimum transmit interval capability - Range: `4`-`9999`
	IntervalMillisecondsMinTx pulumi.IntPtrInput
	// Multiplier value used to compute holddown - Range: `3`-`50`
	IntervalMillisecondsMultiplier pulumi.IntPtrInput
	Name                           pulumi.StringPtrInput
}

func (BfdTemplateMultiHopState) ElementType() reflect.Type {
	return reflect.TypeOf((*bfdTemplateMultiHopState)(nil)).Elem()
}

type bfdTemplateMultiHopArgs struct {
	// keychain name
	AuthenticationMd5Keychain *string `pulumi:"authenticationMd5Keychain"`
	// keychain name
	AuthenticationMeticulousMd5Keychain *string `pulumi:"authenticationMeticulousMd5Keychain"`
	// keychain name
	AuthenticationMeticulousSha1keychain *string `pulumi:"authenticationMeticulousSha1keychain"`
	// keychain name
	AuthenticationSha1Keychain *string `pulumi:"authenticationSha1Keychain"`
	// down monitoring
	DampeningDownMonitoring *bool `pulumi:"dampeningDownMonitoring"`
	// Half-life time for the penalty - Range: `1`-`30`
	DampeningHalfTime *int `pulumi:"dampeningHalfTime"`
	// Maximum duration to suppress a session - Range: `1`-`420`
	DampeningMaxSuppressingTime *int `pulumi:"dampeningMaxSuppressingTime"`
	// Value to start suppressing a session - Range: `1`-`18000`
	DampeningSuppressTime *int `pulumi:"dampeningSuppressTime"`
	// Stability threshold to enter dampening in down dampened state(seconds) - Range: `60`-`3600`
	DampeningThreshold *int `pulumi:"dampeningThreshold"`
	// Value to unsuppress a session - Range: `1`-`18000`
	DampeningUnsuppressTime *int `pulumi:"dampeningUnsuppressTime"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// Use echo adjunct as bfd detection mechanism
	Echo *bool `pulumi:"echo"`
	// Specify BFD timers in microseconds
	IntervalMicroseconds *bool `pulumi:"intervalMicroseconds"`
	// Minimum transmit and receive interval capability - Range: `3300`-`9999000`
	IntervalMicrosecondsBoth *int `pulumi:"intervalMicrosecondsBoth"`
	// Minimum receive interval capability - Range: `3300`-`9999000`
	IntervalMicrosecondsMinRx *int `pulumi:"intervalMicrosecondsMinRx"`
	// Minimum transmit interval capability - Range: `3300`-`9999000`
	IntervalMicrosecondsMinTx *int `pulumi:"intervalMicrosecondsMinTx"`
	// Multiplier value used to compute holddown - Range: `3`-`50`
	IntervalMicrosecondsMultiplier *int `pulumi:"intervalMicrosecondsMultiplier"`
	// Minimum transmit and receive interval capability - Range: `4`-`9999`
	IntervalMillisecondsBoth *int `pulumi:"intervalMillisecondsBoth"`
	// Minimum receive interval capability - Range: `4`-`9999`
	IntervalMillisecondsMinRx *int `pulumi:"intervalMillisecondsMinRx"`
	// Minimum transmit interval capability - Range: `4`-`9999`
	IntervalMillisecondsMinTx *int `pulumi:"intervalMillisecondsMinTx"`
	// Multiplier value used to compute holddown - Range: `3`-`50`
	IntervalMillisecondsMultiplier *int    `pulumi:"intervalMillisecondsMultiplier"`
	Name                           *string `pulumi:"name"`
}

// The set of arguments for constructing a BfdTemplateMultiHop resource.
type BfdTemplateMultiHopArgs struct {
	// keychain name
	AuthenticationMd5Keychain pulumi.StringPtrInput
	// keychain name
	AuthenticationMeticulousMd5Keychain pulumi.StringPtrInput
	// keychain name
	AuthenticationMeticulousSha1keychain pulumi.StringPtrInput
	// keychain name
	AuthenticationSha1Keychain pulumi.StringPtrInput
	// down monitoring
	DampeningDownMonitoring pulumi.BoolPtrInput
	// Half-life time for the penalty - Range: `1`-`30`
	DampeningHalfTime pulumi.IntPtrInput
	// Maximum duration to suppress a session - Range: `1`-`420`
	DampeningMaxSuppressingTime pulumi.IntPtrInput
	// Value to start suppressing a session - Range: `1`-`18000`
	DampeningSuppressTime pulumi.IntPtrInput
	// Stability threshold to enter dampening in down dampened state(seconds) - Range: `60`-`3600`
	DampeningThreshold pulumi.IntPtrInput
	// Value to unsuppress a session - Range: `1`-`18000`
	DampeningUnsuppressTime pulumi.IntPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// Use echo adjunct as bfd detection mechanism
	Echo pulumi.BoolPtrInput
	// Specify BFD timers in microseconds
	IntervalMicroseconds pulumi.BoolPtrInput
	// Minimum transmit and receive interval capability - Range: `3300`-`9999000`
	IntervalMicrosecondsBoth pulumi.IntPtrInput
	// Minimum receive interval capability - Range: `3300`-`9999000`
	IntervalMicrosecondsMinRx pulumi.IntPtrInput
	// Minimum transmit interval capability - Range: `3300`-`9999000`
	IntervalMicrosecondsMinTx pulumi.IntPtrInput
	// Multiplier value used to compute holddown - Range: `3`-`50`
	IntervalMicrosecondsMultiplier pulumi.IntPtrInput
	// Minimum transmit and receive interval capability - Range: `4`-`9999`
	IntervalMillisecondsBoth pulumi.IntPtrInput
	// Minimum receive interval capability - Range: `4`-`9999`
	IntervalMillisecondsMinRx pulumi.IntPtrInput
	// Minimum transmit interval capability - Range: `4`-`9999`
	IntervalMillisecondsMinTx pulumi.IntPtrInput
	// Multiplier value used to compute holddown - Range: `3`-`50`
	IntervalMillisecondsMultiplier pulumi.IntPtrInput
	Name                           pulumi.StringPtrInput
}

func (BfdTemplateMultiHopArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*bfdTemplateMultiHopArgs)(nil)).Elem()
}

type BfdTemplateMultiHopInput interface {
	pulumi.Input

	ToBfdTemplateMultiHopOutput() BfdTemplateMultiHopOutput
	ToBfdTemplateMultiHopOutputWithContext(ctx context.Context) BfdTemplateMultiHopOutput
}

func (*BfdTemplateMultiHop) ElementType() reflect.Type {
	return reflect.TypeOf((**BfdTemplateMultiHop)(nil)).Elem()
}

func (i *BfdTemplateMultiHop) ToBfdTemplateMultiHopOutput() BfdTemplateMultiHopOutput {
	return i.ToBfdTemplateMultiHopOutputWithContext(context.Background())
}

func (i *BfdTemplateMultiHop) ToBfdTemplateMultiHopOutputWithContext(ctx context.Context) BfdTemplateMultiHopOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BfdTemplateMultiHopOutput)
}

func (i *BfdTemplateMultiHop) ToOutput(ctx context.Context) pulumix.Output[*BfdTemplateMultiHop] {
	return pulumix.Output[*BfdTemplateMultiHop]{
		OutputState: i.ToBfdTemplateMultiHopOutputWithContext(ctx).OutputState,
	}
}

// BfdTemplateMultiHopArrayInput is an input type that accepts BfdTemplateMultiHopArray and BfdTemplateMultiHopArrayOutput values.
// You can construct a concrete instance of `BfdTemplateMultiHopArrayInput` via:
//
//	BfdTemplateMultiHopArray{ BfdTemplateMultiHopArgs{...} }
type BfdTemplateMultiHopArrayInput interface {
	pulumi.Input

	ToBfdTemplateMultiHopArrayOutput() BfdTemplateMultiHopArrayOutput
	ToBfdTemplateMultiHopArrayOutputWithContext(context.Context) BfdTemplateMultiHopArrayOutput
}

type BfdTemplateMultiHopArray []BfdTemplateMultiHopInput

func (BfdTemplateMultiHopArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BfdTemplateMultiHop)(nil)).Elem()
}

func (i BfdTemplateMultiHopArray) ToBfdTemplateMultiHopArrayOutput() BfdTemplateMultiHopArrayOutput {
	return i.ToBfdTemplateMultiHopArrayOutputWithContext(context.Background())
}

func (i BfdTemplateMultiHopArray) ToBfdTemplateMultiHopArrayOutputWithContext(ctx context.Context) BfdTemplateMultiHopArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BfdTemplateMultiHopArrayOutput)
}

func (i BfdTemplateMultiHopArray) ToOutput(ctx context.Context) pulumix.Output[[]*BfdTemplateMultiHop] {
	return pulumix.Output[[]*BfdTemplateMultiHop]{
		OutputState: i.ToBfdTemplateMultiHopArrayOutputWithContext(ctx).OutputState,
	}
}

// BfdTemplateMultiHopMapInput is an input type that accepts BfdTemplateMultiHopMap and BfdTemplateMultiHopMapOutput values.
// You can construct a concrete instance of `BfdTemplateMultiHopMapInput` via:
//
//	BfdTemplateMultiHopMap{ "key": BfdTemplateMultiHopArgs{...} }
type BfdTemplateMultiHopMapInput interface {
	pulumi.Input

	ToBfdTemplateMultiHopMapOutput() BfdTemplateMultiHopMapOutput
	ToBfdTemplateMultiHopMapOutputWithContext(context.Context) BfdTemplateMultiHopMapOutput
}

type BfdTemplateMultiHopMap map[string]BfdTemplateMultiHopInput

func (BfdTemplateMultiHopMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BfdTemplateMultiHop)(nil)).Elem()
}

func (i BfdTemplateMultiHopMap) ToBfdTemplateMultiHopMapOutput() BfdTemplateMultiHopMapOutput {
	return i.ToBfdTemplateMultiHopMapOutputWithContext(context.Background())
}

func (i BfdTemplateMultiHopMap) ToBfdTemplateMultiHopMapOutputWithContext(ctx context.Context) BfdTemplateMultiHopMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BfdTemplateMultiHopMapOutput)
}

func (i BfdTemplateMultiHopMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*BfdTemplateMultiHop] {
	return pulumix.Output[map[string]*BfdTemplateMultiHop]{
		OutputState: i.ToBfdTemplateMultiHopMapOutputWithContext(ctx).OutputState,
	}
}

type BfdTemplateMultiHopOutput struct{ *pulumi.OutputState }

func (BfdTemplateMultiHopOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BfdTemplateMultiHop)(nil)).Elem()
}

func (o BfdTemplateMultiHopOutput) ToBfdTemplateMultiHopOutput() BfdTemplateMultiHopOutput {
	return o
}

func (o BfdTemplateMultiHopOutput) ToBfdTemplateMultiHopOutputWithContext(ctx context.Context) BfdTemplateMultiHopOutput {
	return o
}

func (o BfdTemplateMultiHopOutput) ToOutput(ctx context.Context) pulumix.Output[*BfdTemplateMultiHop] {
	return pulumix.Output[*BfdTemplateMultiHop]{
		OutputState: o.OutputState,
	}
}

// keychain name
func (o BfdTemplateMultiHopOutput) AuthenticationMd5Keychain() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BfdTemplateMultiHop) pulumi.StringPtrOutput { return v.AuthenticationMd5Keychain }).(pulumi.StringPtrOutput)
}

// keychain name
func (o BfdTemplateMultiHopOutput) AuthenticationMeticulousMd5Keychain() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BfdTemplateMultiHop) pulumi.StringPtrOutput { return v.AuthenticationMeticulousMd5Keychain }).(pulumi.StringPtrOutput)
}

// keychain name
func (o BfdTemplateMultiHopOutput) AuthenticationMeticulousSha1keychain() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BfdTemplateMultiHop) pulumi.StringPtrOutput { return v.AuthenticationMeticulousSha1keychain }).(pulumi.StringPtrOutput)
}

// keychain name
func (o BfdTemplateMultiHopOutput) AuthenticationSha1Keychain() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BfdTemplateMultiHop) pulumi.StringPtrOutput { return v.AuthenticationSha1Keychain }).(pulumi.StringPtrOutput)
}

// down monitoring
func (o BfdTemplateMultiHopOutput) DampeningDownMonitoring() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *BfdTemplateMultiHop) pulumi.BoolPtrOutput { return v.DampeningDownMonitoring }).(pulumi.BoolPtrOutput)
}

// Half-life time for the penalty - Range: `1`-`30`
func (o BfdTemplateMultiHopOutput) DampeningHalfTime() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *BfdTemplateMultiHop) pulumi.IntPtrOutput { return v.DampeningHalfTime }).(pulumi.IntPtrOutput)
}

// Maximum duration to suppress a session - Range: `1`-`420`
func (o BfdTemplateMultiHopOutput) DampeningMaxSuppressingTime() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *BfdTemplateMultiHop) pulumi.IntPtrOutput { return v.DampeningMaxSuppressingTime }).(pulumi.IntPtrOutput)
}

// Value to start suppressing a session - Range: `1`-`18000`
func (o BfdTemplateMultiHopOutput) DampeningSuppressTime() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *BfdTemplateMultiHop) pulumi.IntPtrOutput { return v.DampeningSuppressTime }).(pulumi.IntPtrOutput)
}

// Stability threshold to enter dampening in down dampened state(seconds) - Range: `60`-`3600`
func (o BfdTemplateMultiHopOutput) DampeningThreshold() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *BfdTemplateMultiHop) pulumi.IntPtrOutput { return v.DampeningThreshold }).(pulumi.IntPtrOutput)
}

// Value to unsuppress a session - Range: `1`-`18000`
func (o BfdTemplateMultiHopOutput) DampeningUnsuppressTime() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *BfdTemplateMultiHop) pulumi.IntPtrOutput { return v.DampeningUnsuppressTime }).(pulumi.IntPtrOutput)
}

// A device name from the provider configuration.
func (o BfdTemplateMultiHopOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BfdTemplateMultiHop) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

// Use echo adjunct as bfd detection mechanism
func (o BfdTemplateMultiHopOutput) Echo() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *BfdTemplateMultiHop) pulumi.BoolPtrOutput { return v.Echo }).(pulumi.BoolPtrOutput)
}

// Specify BFD timers in microseconds
func (o BfdTemplateMultiHopOutput) IntervalMicroseconds() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *BfdTemplateMultiHop) pulumi.BoolPtrOutput { return v.IntervalMicroseconds }).(pulumi.BoolPtrOutput)
}

// Minimum transmit and receive interval capability - Range: `3300`-`9999000`
func (o BfdTemplateMultiHopOutput) IntervalMicrosecondsBoth() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *BfdTemplateMultiHop) pulumi.IntPtrOutput { return v.IntervalMicrosecondsBoth }).(pulumi.IntPtrOutput)
}

// Minimum receive interval capability - Range: `3300`-`9999000`
func (o BfdTemplateMultiHopOutput) IntervalMicrosecondsMinRx() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *BfdTemplateMultiHop) pulumi.IntPtrOutput { return v.IntervalMicrosecondsMinRx }).(pulumi.IntPtrOutput)
}

// Minimum transmit interval capability - Range: `3300`-`9999000`
func (o BfdTemplateMultiHopOutput) IntervalMicrosecondsMinTx() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *BfdTemplateMultiHop) pulumi.IntPtrOutput { return v.IntervalMicrosecondsMinTx }).(pulumi.IntPtrOutput)
}

// Multiplier value used to compute holddown - Range: `3`-`50`
func (o BfdTemplateMultiHopOutput) IntervalMicrosecondsMultiplier() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *BfdTemplateMultiHop) pulumi.IntPtrOutput { return v.IntervalMicrosecondsMultiplier }).(pulumi.IntPtrOutput)
}

// Minimum transmit and receive interval capability - Range: `4`-`9999`
func (o BfdTemplateMultiHopOutput) IntervalMillisecondsBoth() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *BfdTemplateMultiHop) pulumi.IntPtrOutput { return v.IntervalMillisecondsBoth }).(pulumi.IntPtrOutput)
}

// Minimum receive interval capability - Range: `4`-`9999`
func (o BfdTemplateMultiHopOutput) IntervalMillisecondsMinRx() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *BfdTemplateMultiHop) pulumi.IntPtrOutput { return v.IntervalMillisecondsMinRx }).(pulumi.IntPtrOutput)
}

// Minimum transmit interval capability - Range: `4`-`9999`
func (o BfdTemplateMultiHopOutput) IntervalMillisecondsMinTx() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *BfdTemplateMultiHop) pulumi.IntPtrOutput { return v.IntervalMillisecondsMinTx }).(pulumi.IntPtrOutput)
}

// Multiplier value used to compute holddown - Range: `3`-`50`
func (o BfdTemplateMultiHopOutput) IntervalMillisecondsMultiplier() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *BfdTemplateMultiHop) pulumi.IntPtrOutput { return v.IntervalMillisecondsMultiplier }).(pulumi.IntPtrOutput)
}

func (o BfdTemplateMultiHopOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *BfdTemplateMultiHop) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type BfdTemplateMultiHopArrayOutput struct{ *pulumi.OutputState }

func (BfdTemplateMultiHopArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BfdTemplateMultiHop)(nil)).Elem()
}

func (o BfdTemplateMultiHopArrayOutput) ToBfdTemplateMultiHopArrayOutput() BfdTemplateMultiHopArrayOutput {
	return o
}

func (o BfdTemplateMultiHopArrayOutput) ToBfdTemplateMultiHopArrayOutputWithContext(ctx context.Context) BfdTemplateMultiHopArrayOutput {
	return o
}

func (o BfdTemplateMultiHopArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*BfdTemplateMultiHop] {
	return pulumix.Output[[]*BfdTemplateMultiHop]{
		OutputState: o.OutputState,
	}
}

func (o BfdTemplateMultiHopArrayOutput) Index(i pulumi.IntInput) BfdTemplateMultiHopOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BfdTemplateMultiHop {
		return vs[0].([]*BfdTemplateMultiHop)[vs[1].(int)]
	}).(BfdTemplateMultiHopOutput)
}

type BfdTemplateMultiHopMapOutput struct{ *pulumi.OutputState }

func (BfdTemplateMultiHopMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BfdTemplateMultiHop)(nil)).Elem()
}

func (o BfdTemplateMultiHopMapOutput) ToBfdTemplateMultiHopMapOutput() BfdTemplateMultiHopMapOutput {
	return o
}

func (o BfdTemplateMultiHopMapOutput) ToBfdTemplateMultiHopMapOutputWithContext(ctx context.Context) BfdTemplateMultiHopMapOutput {
	return o
}

func (o BfdTemplateMultiHopMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*BfdTemplateMultiHop] {
	return pulumix.Output[map[string]*BfdTemplateMultiHop]{
		OutputState: o.OutputState,
	}
}

func (o BfdTemplateMultiHopMapOutput) MapIndex(k pulumi.StringInput) BfdTemplateMultiHopOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BfdTemplateMultiHop {
		return vs[0].(map[string]*BfdTemplateMultiHop)[vs[1].(string)]
	}).(BfdTemplateMultiHopOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BfdTemplateMultiHopInput)(nil)).Elem(), &BfdTemplateMultiHop{})
	pulumi.RegisterInputType(reflect.TypeOf((*BfdTemplateMultiHopArrayInput)(nil)).Elem(), BfdTemplateMultiHopArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BfdTemplateMultiHopMapInput)(nil)).Elem(), BfdTemplateMultiHopMap{})
	pulumi.RegisterOutputType(BfdTemplateMultiHopOutput{})
	pulumi.RegisterOutputType(BfdTemplateMultiHopArrayOutput{})
	pulumi.RegisterOutputType(BfdTemplateMultiHopMapOutput{})
}
