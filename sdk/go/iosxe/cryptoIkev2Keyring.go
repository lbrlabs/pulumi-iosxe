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

// This resource can manage the Crypto IKEv2 Keyring configuration.
//
// ## Import
//
// ```sh
//
//	$ pulumi import iosxe:index/cryptoIkev2Keyring:CryptoIkev2Keyring example "Cisco-IOS-XE-native:native/crypto/Cisco-IOS-XE-crypto:ikev2/keyring=keyring1"
//
// ```
type CryptoIkev2Keyring struct {
	pulumi.CustomResourceState

	// A device name from the provider configuration.
	Device pulumi.StringPtrOutput `pulumi:"device"`
	Name   pulumi.StringOutput    `pulumi:"name"`
	// Configure a Peer and associated keys
	Peers CryptoIkev2KeyringPeerArrayOutput `pulumi:"peers"`
}

// NewCryptoIkev2Keyring registers a new resource with the given unique name, arguments, and options.
func NewCryptoIkev2Keyring(ctx *pulumi.Context,
	name string, args *CryptoIkev2KeyringArgs, opts ...pulumi.ResourceOption) (*CryptoIkev2Keyring, error) {
	if args == nil {
		args = &CryptoIkev2KeyringArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CryptoIkev2Keyring
	err := ctx.RegisterResource("iosxe:index/cryptoIkev2Keyring:CryptoIkev2Keyring", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCryptoIkev2Keyring gets an existing CryptoIkev2Keyring resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCryptoIkev2Keyring(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CryptoIkev2KeyringState, opts ...pulumi.ResourceOption) (*CryptoIkev2Keyring, error) {
	var resource CryptoIkev2Keyring
	err := ctx.ReadResource("iosxe:index/cryptoIkev2Keyring:CryptoIkev2Keyring", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CryptoIkev2Keyring resources.
type cryptoIkev2KeyringState struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	Name   *string `pulumi:"name"`
	// Configure a Peer and associated keys
	Peers []CryptoIkev2KeyringPeer `pulumi:"peers"`
}

type CryptoIkev2KeyringState struct {
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	Name   pulumi.StringPtrInput
	// Configure a Peer and associated keys
	Peers CryptoIkev2KeyringPeerArrayInput
}

func (CryptoIkev2KeyringState) ElementType() reflect.Type {
	return reflect.TypeOf((*cryptoIkev2KeyringState)(nil)).Elem()
}

type cryptoIkev2KeyringArgs struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	Name   *string `pulumi:"name"`
	// Configure a Peer and associated keys
	Peers []CryptoIkev2KeyringPeer `pulumi:"peers"`
}

// The set of arguments for constructing a CryptoIkev2Keyring resource.
type CryptoIkev2KeyringArgs struct {
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	Name   pulumi.StringPtrInput
	// Configure a Peer and associated keys
	Peers CryptoIkev2KeyringPeerArrayInput
}

func (CryptoIkev2KeyringArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cryptoIkev2KeyringArgs)(nil)).Elem()
}

type CryptoIkev2KeyringInput interface {
	pulumi.Input

	ToCryptoIkev2KeyringOutput() CryptoIkev2KeyringOutput
	ToCryptoIkev2KeyringOutputWithContext(ctx context.Context) CryptoIkev2KeyringOutput
}

func (*CryptoIkev2Keyring) ElementType() reflect.Type {
	return reflect.TypeOf((**CryptoIkev2Keyring)(nil)).Elem()
}

func (i *CryptoIkev2Keyring) ToCryptoIkev2KeyringOutput() CryptoIkev2KeyringOutput {
	return i.ToCryptoIkev2KeyringOutputWithContext(context.Background())
}

func (i *CryptoIkev2Keyring) ToCryptoIkev2KeyringOutputWithContext(ctx context.Context) CryptoIkev2KeyringOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CryptoIkev2KeyringOutput)
}

func (i *CryptoIkev2Keyring) ToOutput(ctx context.Context) pulumix.Output[*CryptoIkev2Keyring] {
	return pulumix.Output[*CryptoIkev2Keyring]{
		OutputState: i.ToCryptoIkev2KeyringOutputWithContext(ctx).OutputState,
	}
}

// CryptoIkev2KeyringArrayInput is an input type that accepts CryptoIkev2KeyringArray and CryptoIkev2KeyringArrayOutput values.
// You can construct a concrete instance of `CryptoIkev2KeyringArrayInput` via:
//
//	CryptoIkev2KeyringArray{ CryptoIkev2KeyringArgs{...} }
type CryptoIkev2KeyringArrayInput interface {
	pulumi.Input

	ToCryptoIkev2KeyringArrayOutput() CryptoIkev2KeyringArrayOutput
	ToCryptoIkev2KeyringArrayOutputWithContext(context.Context) CryptoIkev2KeyringArrayOutput
}

type CryptoIkev2KeyringArray []CryptoIkev2KeyringInput

func (CryptoIkev2KeyringArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CryptoIkev2Keyring)(nil)).Elem()
}

func (i CryptoIkev2KeyringArray) ToCryptoIkev2KeyringArrayOutput() CryptoIkev2KeyringArrayOutput {
	return i.ToCryptoIkev2KeyringArrayOutputWithContext(context.Background())
}

func (i CryptoIkev2KeyringArray) ToCryptoIkev2KeyringArrayOutputWithContext(ctx context.Context) CryptoIkev2KeyringArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CryptoIkev2KeyringArrayOutput)
}

func (i CryptoIkev2KeyringArray) ToOutput(ctx context.Context) pulumix.Output[[]*CryptoIkev2Keyring] {
	return pulumix.Output[[]*CryptoIkev2Keyring]{
		OutputState: i.ToCryptoIkev2KeyringArrayOutputWithContext(ctx).OutputState,
	}
}

// CryptoIkev2KeyringMapInput is an input type that accepts CryptoIkev2KeyringMap and CryptoIkev2KeyringMapOutput values.
// You can construct a concrete instance of `CryptoIkev2KeyringMapInput` via:
//
//	CryptoIkev2KeyringMap{ "key": CryptoIkev2KeyringArgs{...} }
type CryptoIkev2KeyringMapInput interface {
	pulumi.Input

	ToCryptoIkev2KeyringMapOutput() CryptoIkev2KeyringMapOutput
	ToCryptoIkev2KeyringMapOutputWithContext(context.Context) CryptoIkev2KeyringMapOutput
}

type CryptoIkev2KeyringMap map[string]CryptoIkev2KeyringInput

func (CryptoIkev2KeyringMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CryptoIkev2Keyring)(nil)).Elem()
}

func (i CryptoIkev2KeyringMap) ToCryptoIkev2KeyringMapOutput() CryptoIkev2KeyringMapOutput {
	return i.ToCryptoIkev2KeyringMapOutputWithContext(context.Background())
}

func (i CryptoIkev2KeyringMap) ToCryptoIkev2KeyringMapOutputWithContext(ctx context.Context) CryptoIkev2KeyringMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CryptoIkev2KeyringMapOutput)
}

func (i CryptoIkev2KeyringMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*CryptoIkev2Keyring] {
	return pulumix.Output[map[string]*CryptoIkev2Keyring]{
		OutputState: i.ToCryptoIkev2KeyringMapOutputWithContext(ctx).OutputState,
	}
}

type CryptoIkev2KeyringOutput struct{ *pulumi.OutputState }

func (CryptoIkev2KeyringOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CryptoIkev2Keyring)(nil)).Elem()
}

func (o CryptoIkev2KeyringOutput) ToCryptoIkev2KeyringOutput() CryptoIkev2KeyringOutput {
	return o
}

func (o CryptoIkev2KeyringOutput) ToCryptoIkev2KeyringOutputWithContext(ctx context.Context) CryptoIkev2KeyringOutput {
	return o
}

func (o CryptoIkev2KeyringOutput) ToOutput(ctx context.Context) pulumix.Output[*CryptoIkev2Keyring] {
	return pulumix.Output[*CryptoIkev2Keyring]{
		OutputState: o.OutputState,
	}
}

// A device name from the provider configuration.
func (o CryptoIkev2KeyringOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CryptoIkev2Keyring) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

func (o CryptoIkev2KeyringOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CryptoIkev2Keyring) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Configure a Peer and associated keys
func (o CryptoIkev2KeyringOutput) Peers() CryptoIkev2KeyringPeerArrayOutput {
	return o.ApplyT(func(v *CryptoIkev2Keyring) CryptoIkev2KeyringPeerArrayOutput { return v.Peers }).(CryptoIkev2KeyringPeerArrayOutput)
}

type CryptoIkev2KeyringArrayOutput struct{ *pulumi.OutputState }

func (CryptoIkev2KeyringArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CryptoIkev2Keyring)(nil)).Elem()
}

func (o CryptoIkev2KeyringArrayOutput) ToCryptoIkev2KeyringArrayOutput() CryptoIkev2KeyringArrayOutput {
	return o
}

func (o CryptoIkev2KeyringArrayOutput) ToCryptoIkev2KeyringArrayOutputWithContext(ctx context.Context) CryptoIkev2KeyringArrayOutput {
	return o
}

func (o CryptoIkev2KeyringArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*CryptoIkev2Keyring] {
	return pulumix.Output[[]*CryptoIkev2Keyring]{
		OutputState: o.OutputState,
	}
}

func (o CryptoIkev2KeyringArrayOutput) Index(i pulumi.IntInput) CryptoIkev2KeyringOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CryptoIkev2Keyring {
		return vs[0].([]*CryptoIkev2Keyring)[vs[1].(int)]
	}).(CryptoIkev2KeyringOutput)
}

type CryptoIkev2KeyringMapOutput struct{ *pulumi.OutputState }

func (CryptoIkev2KeyringMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CryptoIkev2Keyring)(nil)).Elem()
}

func (o CryptoIkev2KeyringMapOutput) ToCryptoIkev2KeyringMapOutput() CryptoIkev2KeyringMapOutput {
	return o
}

func (o CryptoIkev2KeyringMapOutput) ToCryptoIkev2KeyringMapOutputWithContext(ctx context.Context) CryptoIkev2KeyringMapOutput {
	return o
}

func (o CryptoIkev2KeyringMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*CryptoIkev2Keyring] {
	return pulumix.Output[map[string]*CryptoIkev2Keyring]{
		OutputState: o.OutputState,
	}
}

func (o CryptoIkev2KeyringMapOutput) MapIndex(k pulumi.StringInput) CryptoIkev2KeyringOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CryptoIkev2Keyring {
		return vs[0].(map[string]*CryptoIkev2Keyring)[vs[1].(string)]
	}).(CryptoIkev2KeyringOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CryptoIkev2KeyringInput)(nil)).Elem(), &CryptoIkev2Keyring{})
	pulumi.RegisterInputType(reflect.TypeOf((*CryptoIkev2KeyringArrayInput)(nil)).Elem(), CryptoIkev2KeyringArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CryptoIkev2KeyringMapInput)(nil)).Elem(), CryptoIkev2KeyringMap{})
	pulumi.RegisterOutputType(CryptoIkev2KeyringOutput{})
	pulumi.RegisterOutputType(CryptoIkev2KeyringArrayOutput{})
	pulumi.RegisterOutputType(CryptoIkev2KeyringMapOutput{})
}
