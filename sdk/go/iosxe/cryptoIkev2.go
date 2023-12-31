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

// This resource can manage the Crypto IKEv2 configuration.
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
//			_, err := iosxe.NewCryptoIkev2(ctx, "example", &iosxe.CryptoIkev2Args{
//				Dpd:              pulumi.Int(10),
//				DpdQuery:         pulumi.String("periodic"),
//				DpdRetryInterval: pulumi.Int(5),
//				NatKeepalive:     pulumi.Int(20),
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
//	$ pulumi import iosxe:index/cryptoIkev2:CryptoIkev2 example "Cisco-IOS-XE-native:native/crypto/Cisco-IOS-XE-crypto:ikev2"
//
// ```
type CryptoIkev2 struct {
	pulumi.CustomResourceState

	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrOutput `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device pulumi.StringPtrOutput `pulumi:"device"`
	// Enable IKE liveness check for peers - Range: `10`-`3600`
	Dpd pulumi.IntPtrOutput `pulumi:"dpd"`
	// - Choices: `on-demand`, `periodic`
	DpdQuery pulumi.StringPtrOutput `pulumi:"dpdQuery"`
	// - Range: `2`-`60`
	DpdRetryInterval pulumi.IntPtrOutput `pulumi:"dpdRetryInterval"`
	// Set NAT keepalive interval - Range: `5`-`3600`
	NatKeepalive pulumi.IntPtrOutput `pulumi:"natKeepalive"`
}

// NewCryptoIkev2 registers a new resource with the given unique name, arguments, and options.
func NewCryptoIkev2(ctx *pulumi.Context,
	name string, args *CryptoIkev2Args, opts ...pulumi.ResourceOption) (*CryptoIkev2, error) {
	if args == nil {
		args = &CryptoIkev2Args{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CryptoIkev2
	err := ctx.RegisterResource("iosxe:index/cryptoIkev2:CryptoIkev2", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCryptoIkev2 gets an existing CryptoIkev2 resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCryptoIkev2(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CryptoIkev2State, opts ...pulumi.ResourceOption) (*CryptoIkev2, error) {
	var resource CryptoIkev2
	err := ctx.ReadResource("iosxe:index/cryptoIkev2:CryptoIkev2", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CryptoIkev2 resources.
type cryptoIkev2State struct {
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode *string `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// Enable IKE liveness check for peers - Range: `10`-`3600`
	Dpd *int `pulumi:"dpd"`
	// - Choices: `on-demand`, `periodic`
	DpdQuery *string `pulumi:"dpdQuery"`
	// - Range: `2`-`60`
	DpdRetryInterval *int `pulumi:"dpdRetryInterval"`
	// Set NAT keepalive interval - Range: `5`-`3600`
	NatKeepalive *int `pulumi:"natKeepalive"`
}

type CryptoIkev2State struct {
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// Enable IKE liveness check for peers - Range: `10`-`3600`
	Dpd pulumi.IntPtrInput
	// - Choices: `on-demand`, `periodic`
	DpdQuery pulumi.StringPtrInput
	// - Range: `2`-`60`
	DpdRetryInterval pulumi.IntPtrInput
	// Set NAT keepalive interval - Range: `5`-`3600`
	NatKeepalive pulumi.IntPtrInput
}

func (CryptoIkev2State) ElementType() reflect.Type {
	return reflect.TypeOf((*cryptoIkev2State)(nil)).Elem()
}

type cryptoIkev2Args struct {
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode *string `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// Enable IKE liveness check for peers - Range: `10`-`3600`
	Dpd *int `pulumi:"dpd"`
	// - Choices: `on-demand`, `periodic`
	DpdQuery *string `pulumi:"dpdQuery"`
	// - Range: `2`-`60`
	DpdRetryInterval *int `pulumi:"dpdRetryInterval"`
	// Set NAT keepalive interval - Range: `5`-`3600`
	NatKeepalive *int `pulumi:"natKeepalive"`
}

// The set of arguments for constructing a CryptoIkev2 resource.
type CryptoIkev2Args struct {
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// Enable IKE liveness check for peers - Range: `10`-`3600`
	Dpd pulumi.IntPtrInput
	// - Choices: `on-demand`, `periodic`
	DpdQuery pulumi.StringPtrInput
	// - Range: `2`-`60`
	DpdRetryInterval pulumi.IntPtrInput
	// Set NAT keepalive interval - Range: `5`-`3600`
	NatKeepalive pulumi.IntPtrInput
}

func (CryptoIkev2Args) ElementType() reflect.Type {
	return reflect.TypeOf((*cryptoIkev2Args)(nil)).Elem()
}

type CryptoIkev2Input interface {
	pulumi.Input

	ToCryptoIkev2Output() CryptoIkev2Output
	ToCryptoIkev2OutputWithContext(ctx context.Context) CryptoIkev2Output
}

func (*CryptoIkev2) ElementType() reflect.Type {
	return reflect.TypeOf((**CryptoIkev2)(nil)).Elem()
}

func (i *CryptoIkev2) ToCryptoIkev2Output() CryptoIkev2Output {
	return i.ToCryptoIkev2OutputWithContext(context.Background())
}

func (i *CryptoIkev2) ToCryptoIkev2OutputWithContext(ctx context.Context) CryptoIkev2Output {
	return pulumi.ToOutputWithContext(ctx, i).(CryptoIkev2Output)
}

func (i *CryptoIkev2) ToOutput(ctx context.Context) pulumix.Output[*CryptoIkev2] {
	return pulumix.Output[*CryptoIkev2]{
		OutputState: i.ToCryptoIkev2OutputWithContext(ctx).OutputState,
	}
}

// CryptoIkev2ArrayInput is an input type that accepts CryptoIkev2Array and CryptoIkev2ArrayOutput values.
// You can construct a concrete instance of `CryptoIkev2ArrayInput` via:
//
//	CryptoIkev2Array{ CryptoIkev2Args{...} }
type CryptoIkev2ArrayInput interface {
	pulumi.Input

	ToCryptoIkev2ArrayOutput() CryptoIkev2ArrayOutput
	ToCryptoIkev2ArrayOutputWithContext(context.Context) CryptoIkev2ArrayOutput
}

type CryptoIkev2Array []CryptoIkev2Input

func (CryptoIkev2Array) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CryptoIkev2)(nil)).Elem()
}

func (i CryptoIkev2Array) ToCryptoIkev2ArrayOutput() CryptoIkev2ArrayOutput {
	return i.ToCryptoIkev2ArrayOutputWithContext(context.Background())
}

func (i CryptoIkev2Array) ToCryptoIkev2ArrayOutputWithContext(ctx context.Context) CryptoIkev2ArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CryptoIkev2ArrayOutput)
}

func (i CryptoIkev2Array) ToOutput(ctx context.Context) pulumix.Output[[]*CryptoIkev2] {
	return pulumix.Output[[]*CryptoIkev2]{
		OutputState: i.ToCryptoIkev2ArrayOutputWithContext(ctx).OutputState,
	}
}

// CryptoIkev2MapInput is an input type that accepts CryptoIkev2Map and CryptoIkev2MapOutput values.
// You can construct a concrete instance of `CryptoIkev2MapInput` via:
//
//	CryptoIkev2Map{ "key": CryptoIkev2Args{...} }
type CryptoIkev2MapInput interface {
	pulumi.Input

	ToCryptoIkev2MapOutput() CryptoIkev2MapOutput
	ToCryptoIkev2MapOutputWithContext(context.Context) CryptoIkev2MapOutput
}

type CryptoIkev2Map map[string]CryptoIkev2Input

func (CryptoIkev2Map) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CryptoIkev2)(nil)).Elem()
}

func (i CryptoIkev2Map) ToCryptoIkev2MapOutput() CryptoIkev2MapOutput {
	return i.ToCryptoIkev2MapOutputWithContext(context.Background())
}

func (i CryptoIkev2Map) ToCryptoIkev2MapOutputWithContext(ctx context.Context) CryptoIkev2MapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CryptoIkev2MapOutput)
}

func (i CryptoIkev2Map) ToOutput(ctx context.Context) pulumix.Output[map[string]*CryptoIkev2] {
	return pulumix.Output[map[string]*CryptoIkev2]{
		OutputState: i.ToCryptoIkev2MapOutputWithContext(ctx).OutputState,
	}
}

type CryptoIkev2Output struct{ *pulumi.OutputState }

func (CryptoIkev2Output) ElementType() reflect.Type {
	return reflect.TypeOf((**CryptoIkev2)(nil)).Elem()
}

func (o CryptoIkev2Output) ToCryptoIkev2Output() CryptoIkev2Output {
	return o
}

func (o CryptoIkev2Output) ToCryptoIkev2OutputWithContext(ctx context.Context) CryptoIkev2Output {
	return o
}

func (o CryptoIkev2Output) ToOutput(ctx context.Context) pulumix.Output[*CryptoIkev2] {
	return pulumix.Output[*CryptoIkev2]{
		OutputState: o.OutputState,
	}
}

// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
// Default value is `all`. - Choices: `all`, `attributes`
func (o CryptoIkev2Output) DeleteMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CryptoIkev2) pulumi.StringPtrOutput { return v.DeleteMode }).(pulumi.StringPtrOutput)
}

// A device name from the provider configuration.
func (o CryptoIkev2Output) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CryptoIkev2) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

// Enable IKE liveness check for peers - Range: `10`-`3600`
func (o CryptoIkev2Output) Dpd() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *CryptoIkev2) pulumi.IntPtrOutput { return v.Dpd }).(pulumi.IntPtrOutput)
}

// - Choices: `on-demand`, `periodic`
func (o CryptoIkev2Output) DpdQuery() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CryptoIkev2) pulumi.StringPtrOutput { return v.DpdQuery }).(pulumi.StringPtrOutput)
}

// - Range: `2`-`60`
func (o CryptoIkev2Output) DpdRetryInterval() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *CryptoIkev2) pulumi.IntPtrOutput { return v.DpdRetryInterval }).(pulumi.IntPtrOutput)
}

// Set NAT keepalive interval - Range: `5`-`3600`
func (o CryptoIkev2Output) NatKeepalive() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *CryptoIkev2) pulumi.IntPtrOutput { return v.NatKeepalive }).(pulumi.IntPtrOutput)
}

type CryptoIkev2ArrayOutput struct{ *pulumi.OutputState }

func (CryptoIkev2ArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CryptoIkev2)(nil)).Elem()
}

func (o CryptoIkev2ArrayOutput) ToCryptoIkev2ArrayOutput() CryptoIkev2ArrayOutput {
	return o
}

func (o CryptoIkev2ArrayOutput) ToCryptoIkev2ArrayOutputWithContext(ctx context.Context) CryptoIkev2ArrayOutput {
	return o
}

func (o CryptoIkev2ArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*CryptoIkev2] {
	return pulumix.Output[[]*CryptoIkev2]{
		OutputState: o.OutputState,
	}
}

func (o CryptoIkev2ArrayOutput) Index(i pulumi.IntInput) CryptoIkev2Output {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CryptoIkev2 {
		return vs[0].([]*CryptoIkev2)[vs[1].(int)]
	}).(CryptoIkev2Output)
}

type CryptoIkev2MapOutput struct{ *pulumi.OutputState }

func (CryptoIkev2MapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CryptoIkev2)(nil)).Elem()
}

func (o CryptoIkev2MapOutput) ToCryptoIkev2MapOutput() CryptoIkev2MapOutput {
	return o
}

func (o CryptoIkev2MapOutput) ToCryptoIkev2MapOutputWithContext(ctx context.Context) CryptoIkev2MapOutput {
	return o
}

func (o CryptoIkev2MapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*CryptoIkev2] {
	return pulumix.Output[map[string]*CryptoIkev2]{
		OutputState: o.OutputState,
	}
}

func (o CryptoIkev2MapOutput) MapIndex(k pulumi.StringInput) CryptoIkev2Output {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CryptoIkev2 {
		return vs[0].(map[string]*CryptoIkev2)[vs[1].(string)]
	}).(CryptoIkev2Output)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CryptoIkev2Input)(nil)).Elem(), &CryptoIkev2{})
	pulumi.RegisterInputType(reflect.TypeOf((*CryptoIkev2ArrayInput)(nil)).Elem(), CryptoIkev2Array{})
	pulumi.RegisterInputType(reflect.TypeOf((*CryptoIkev2MapInput)(nil)).Elem(), CryptoIkev2Map{})
	pulumi.RegisterOutputType(CryptoIkev2Output{})
	pulumi.RegisterOutputType(CryptoIkev2ArrayOutput{})
	pulumi.RegisterOutputType(CryptoIkev2MapOutput{})
}
