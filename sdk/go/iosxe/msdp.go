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

// This resource can manage the MSDP configuration.
//
// ## Import
//
// ```sh
//
//	$ pulumi import iosxe:index/msdp:Msdp example "Cisco-IOS-XE-native:native/ip/Cisco-IOS-XE-multicast:msdp"
//
// ```
type Msdp struct {
	pulumi.CustomResourceState

	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrOutput `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device pulumi.StringPtrOutput `pulumi:"device"`
	// Configure MSDP Originator ID
	OriginatorId pulumi.StringPtrOutput `pulumi:"originatorId"`
	// MSDP peer on which the password is to be set
	Passwords MsdpPasswordArrayOutput `pulumi:"passwords"`
	// Configure an MSDP peer
	Peers MsdpPeerArrayOutput `pulumi:"peers"`
}

// NewMsdp registers a new resource with the given unique name, arguments, and options.
func NewMsdp(ctx *pulumi.Context,
	name string, args *MsdpArgs, opts ...pulumi.ResourceOption) (*Msdp, error) {
	if args == nil {
		args = &MsdpArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Msdp
	err := ctx.RegisterResource("iosxe:index/msdp:Msdp", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMsdp gets an existing Msdp resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMsdp(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MsdpState, opts ...pulumi.ResourceOption) (*Msdp, error) {
	var resource Msdp
	err := ctx.ReadResource("iosxe:index/msdp:Msdp", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Msdp resources.
type msdpState struct {
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode *string `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// Configure MSDP Originator ID
	OriginatorId *string `pulumi:"originatorId"`
	// MSDP peer on which the password is to be set
	Passwords []MsdpPassword `pulumi:"passwords"`
	// Configure an MSDP peer
	Peers []MsdpPeer `pulumi:"peers"`
}

type MsdpState struct {
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// Configure MSDP Originator ID
	OriginatorId pulumi.StringPtrInput
	// MSDP peer on which the password is to be set
	Passwords MsdpPasswordArrayInput
	// Configure an MSDP peer
	Peers MsdpPeerArrayInput
}

func (MsdpState) ElementType() reflect.Type {
	return reflect.TypeOf((*msdpState)(nil)).Elem()
}

type msdpArgs struct {
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode *string `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// Configure MSDP Originator ID
	OriginatorId *string `pulumi:"originatorId"`
	// MSDP peer on which the password is to be set
	Passwords []MsdpPassword `pulumi:"passwords"`
	// Configure an MSDP peer
	Peers []MsdpPeer `pulumi:"peers"`
}

// The set of arguments for constructing a Msdp resource.
type MsdpArgs struct {
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// Configure MSDP Originator ID
	OriginatorId pulumi.StringPtrInput
	// MSDP peer on which the password is to be set
	Passwords MsdpPasswordArrayInput
	// Configure an MSDP peer
	Peers MsdpPeerArrayInput
}

func (MsdpArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*msdpArgs)(nil)).Elem()
}

type MsdpInput interface {
	pulumi.Input

	ToMsdpOutput() MsdpOutput
	ToMsdpOutputWithContext(ctx context.Context) MsdpOutput
}

func (*Msdp) ElementType() reflect.Type {
	return reflect.TypeOf((**Msdp)(nil)).Elem()
}

func (i *Msdp) ToMsdpOutput() MsdpOutput {
	return i.ToMsdpOutputWithContext(context.Background())
}

func (i *Msdp) ToMsdpOutputWithContext(ctx context.Context) MsdpOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MsdpOutput)
}

func (i *Msdp) ToOutput(ctx context.Context) pulumix.Output[*Msdp] {
	return pulumix.Output[*Msdp]{
		OutputState: i.ToMsdpOutputWithContext(ctx).OutputState,
	}
}

// MsdpArrayInput is an input type that accepts MsdpArray and MsdpArrayOutput values.
// You can construct a concrete instance of `MsdpArrayInput` via:
//
//	MsdpArray{ MsdpArgs{...} }
type MsdpArrayInput interface {
	pulumi.Input

	ToMsdpArrayOutput() MsdpArrayOutput
	ToMsdpArrayOutputWithContext(context.Context) MsdpArrayOutput
}

type MsdpArray []MsdpInput

func (MsdpArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Msdp)(nil)).Elem()
}

func (i MsdpArray) ToMsdpArrayOutput() MsdpArrayOutput {
	return i.ToMsdpArrayOutputWithContext(context.Background())
}

func (i MsdpArray) ToMsdpArrayOutputWithContext(ctx context.Context) MsdpArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MsdpArrayOutput)
}

func (i MsdpArray) ToOutput(ctx context.Context) pulumix.Output[[]*Msdp] {
	return pulumix.Output[[]*Msdp]{
		OutputState: i.ToMsdpArrayOutputWithContext(ctx).OutputState,
	}
}

// MsdpMapInput is an input type that accepts MsdpMap and MsdpMapOutput values.
// You can construct a concrete instance of `MsdpMapInput` via:
//
//	MsdpMap{ "key": MsdpArgs{...} }
type MsdpMapInput interface {
	pulumi.Input

	ToMsdpMapOutput() MsdpMapOutput
	ToMsdpMapOutputWithContext(context.Context) MsdpMapOutput
}

type MsdpMap map[string]MsdpInput

func (MsdpMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Msdp)(nil)).Elem()
}

func (i MsdpMap) ToMsdpMapOutput() MsdpMapOutput {
	return i.ToMsdpMapOutputWithContext(context.Background())
}

func (i MsdpMap) ToMsdpMapOutputWithContext(ctx context.Context) MsdpMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MsdpMapOutput)
}

func (i MsdpMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Msdp] {
	return pulumix.Output[map[string]*Msdp]{
		OutputState: i.ToMsdpMapOutputWithContext(ctx).OutputState,
	}
}

type MsdpOutput struct{ *pulumi.OutputState }

func (MsdpOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Msdp)(nil)).Elem()
}

func (o MsdpOutput) ToMsdpOutput() MsdpOutput {
	return o
}

func (o MsdpOutput) ToMsdpOutputWithContext(ctx context.Context) MsdpOutput {
	return o
}

func (o MsdpOutput) ToOutput(ctx context.Context) pulumix.Output[*Msdp] {
	return pulumix.Output[*Msdp]{
		OutputState: o.OutputState,
	}
}

// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
// Default value is `all`. - Choices: `all`, `attributes`
func (o MsdpOutput) DeleteMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Msdp) pulumi.StringPtrOutput { return v.DeleteMode }).(pulumi.StringPtrOutput)
}

// A device name from the provider configuration.
func (o MsdpOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Msdp) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

// Configure MSDP Originator ID
func (o MsdpOutput) OriginatorId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Msdp) pulumi.StringPtrOutput { return v.OriginatorId }).(pulumi.StringPtrOutput)
}

// MSDP peer on which the password is to be set
func (o MsdpOutput) Passwords() MsdpPasswordArrayOutput {
	return o.ApplyT(func(v *Msdp) MsdpPasswordArrayOutput { return v.Passwords }).(MsdpPasswordArrayOutput)
}

// Configure an MSDP peer
func (o MsdpOutput) Peers() MsdpPeerArrayOutput {
	return o.ApplyT(func(v *Msdp) MsdpPeerArrayOutput { return v.Peers }).(MsdpPeerArrayOutput)
}

type MsdpArrayOutput struct{ *pulumi.OutputState }

func (MsdpArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Msdp)(nil)).Elem()
}

func (o MsdpArrayOutput) ToMsdpArrayOutput() MsdpArrayOutput {
	return o
}

func (o MsdpArrayOutput) ToMsdpArrayOutputWithContext(ctx context.Context) MsdpArrayOutput {
	return o
}

func (o MsdpArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Msdp] {
	return pulumix.Output[[]*Msdp]{
		OutputState: o.OutputState,
	}
}

func (o MsdpArrayOutput) Index(i pulumi.IntInput) MsdpOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Msdp {
		return vs[0].([]*Msdp)[vs[1].(int)]
	}).(MsdpOutput)
}

type MsdpMapOutput struct{ *pulumi.OutputState }

func (MsdpMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Msdp)(nil)).Elem()
}

func (o MsdpMapOutput) ToMsdpMapOutput() MsdpMapOutput {
	return o
}

func (o MsdpMapOutput) ToMsdpMapOutputWithContext(ctx context.Context) MsdpMapOutput {
	return o
}

func (o MsdpMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Msdp] {
	return pulumix.Output[map[string]*Msdp]{
		OutputState: o.OutputState,
	}
}

func (o MsdpMapOutput) MapIndex(k pulumi.StringInput) MsdpOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Msdp {
		return vs[0].(map[string]*Msdp)[vs[1].(string)]
	}).(MsdpOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MsdpInput)(nil)).Elem(), &Msdp{})
	pulumi.RegisterInputType(reflect.TypeOf((*MsdpArrayInput)(nil)).Elem(), MsdpArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MsdpMapInput)(nil)).Elem(), MsdpMap{})
	pulumi.RegisterOutputType(MsdpOutput{})
	pulumi.RegisterOutputType(MsdpArrayOutput{})
	pulumi.RegisterOutputType(MsdpMapOutput{})
}
