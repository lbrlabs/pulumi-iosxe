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

type MsdpVrf struct {
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
	Passwords MsdpVrfPasswordArrayOutput `pulumi:"passwords"`
	// Configure an MSDP peer
	Peers MsdpVrfPeerArrayOutput `pulumi:"peers"`
	Vrf   pulumi.StringOutput    `pulumi:"vrf"`
}

// NewMsdpVrf registers a new resource with the given unique name, arguments, and options.
func NewMsdpVrf(ctx *pulumi.Context,
	name string, args *MsdpVrfArgs, opts ...pulumi.ResourceOption) (*MsdpVrf, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Vrf == nil {
		return nil, errors.New("invalid value for required argument 'Vrf'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MsdpVrf
	err := ctx.RegisterResource("iosxe:iosxe/msdpVrf:MsdpVrf", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMsdpVrf gets an existing MsdpVrf resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMsdpVrf(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MsdpVrfState, opts ...pulumi.ResourceOption) (*MsdpVrf, error) {
	var resource MsdpVrf
	err := ctx.ReadResource("iosxe:iosxe/msdpVrf:MsdpVrf", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MsdpVrf resources.
type msdpVrfState struct {
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode *string `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// Configure MSDP Originator ID
	OriginatorId *string `pulumi:"originatorId"`
	// MSDP peer on which the password is to be set
	Passwords []MsdpVrfPassword `pulumi:"passwords"`
	// Configure an MSDP peer
	Peers []MsdpVrfPeer `pulumi:"peers"`
	Vrf   *string       `pulumi:"vrf"`
}

type MsdpVrfState struct {
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// Configure MSDP Originator ID
	OriginatorId pulumi.StringPtrInput
	// MSDP peer on which the password is to be set
	Passwords MsdpVrfPasswordArrayInput
	// Configure an MSDP peer
	Peers MsdpVrfPeerArrayInput
	Vrf   pulumi.StringPtrInput
}

func (MsdpVrfState) ElementType() reflect.Type {
	return reflect.TypeOf((*msdpVrfState)(nil)).Elem()
}

type msdpVrfArgs struct {
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode *string `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// Configure MSDP Originator ID
	OriginatorId *string `pulumi:"originatorId"`
	// MSDP peer on which the password is to be set
	Passwords []MsdpVrfPassword `pulumi:"passwords"`
	// Configure an MSDP peer
	Peers []MsdpVrfPeer `pulumi:"peers"`
	Vrf   string        `pulumi:"vrf"`
}

// The set of arguments for constructing a MsdpVrf resource.
type MsdpVrfArgs struct {
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// Configure MSDP Originator ID
	OriginatorId pulumi.StringPtrInput
	// MSDP peer on which the password is to be set
	Passwords MsdpVrfPasswordArrayInput
	// Configure an MSDP peer
	Peers MsdpVrfPeerArrayInput
	Vrf   pulumi.StringInput
}

func (MsdpVrfArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*msdpVrfArgs)(nil)).Elem()
}

type MsdpVrfInput interface {
	pulumi.Input

	ToMsdpVrfOutput() MsdpVrfOutput
	ToMsdpVrfOutputWithContext(ctx context.Context) MsdpVrfOutput
}

func (*MsdpVrf) ElementType() reflect.Type {
	return reflect.TypeOf((**MsdpVrf)(nil)).Elem()
}

func (i *MsdpVrf) ToMsdpVrfOutput() MsdpVrfOutput {
	return i.ToMsdpVrfOutputWithContext(context.Background())
}

func (i *MsdpVrf) ToMsdpVrfOutputWithContext(ctx context.Context) MsdpVrfOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MsdpVrfOutput)
}

func (i *MsdpVrf) ToOutput(ctx context.Context) pulumix.Output[*MsdpVrf] {
	return pulumix.Output[*MsdpVrf]{
		OutputState: i.ToMsdpVrfOutputWithContext(ctx).OutputState,
	}
}

// MsdpVrfArrayInput is an input type that accepts MsdpVrfArray and MsdpVrfArrayOutput values.
// You can construct a concrete instance of `MsdpVrfArrayInput` via:
//
//	MsdpVrfArray{ MsdpVrfArgs{...} }
type MsdpVrfArrayInput interface {
	pulumi.Input

	ToMsdpVrfArrayOutput() MsdpVrfArrayOutput
	ToMsdpVrfArrayOutputWithContext(context.Context) MsdpVrfArrayOutput
}

type MsdpVrfArray []MsdpVrfInput

func (MsdpVrfArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MsdpVrf)(nil)).Elem()
}

func (i MsdpVrfArray) ToMsdpVrfArrayOutput() MsdpVrfArrayOutput {
	return i.ToMsdpVrfArrayOutputWithContext(context.Background())
}

func (i MsdpVrfArray) ToMsdpVrfArrayOutputWithContext(ctx context.Context) MsdpVrfArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MsdpVrfArrayOutput)
}

func (i MsdpVrfArray) ToOutput(ctx context.Context) pulumix.Output[[]*MsdpVrf] {
	return pulumix.Output[[]*MsdpVrf]{
		OutputState: i.ToMsdpVrfArrayOutputWithContext(ctx).OutputState,
	}
}

// MsdpVrfMapInput is an input type that accepts MsdpVrfMap and MsdpVrfMapOutput values.
// You can construct a concrete instance of `MsdpVrfMapInput` via:
//
//	MsdpVrfMap{ "key": MsdpVrfArgs{...} }
type MsdpVrfMapInput interface {
	pulumi.Input

	ToMsdpVrfMapOutput() MsdpVrfMapOutput
	ToMsdpVrfMapOutputWithContext(context.Context) MsdpVrfMapOutput
}

type MsdpVrfMap map[string]MsdpVrfInput

func (MsdpVrfMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MsdpVrf)(nil)).Elem()
}

func (i MsdpVrfMap) ToMsdpVrfMapOutput() MsdpVrfMapOutput {
	return i.ToMsdpVrfMapOutputWithContext(context.Background())
}

func (i MsdpVrfMap) ToMsdpVrfMapOutputWithContext(ctx context.Context) MsdpVrfMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MsdpVrfMapOutput)
}

func (i MsdpVrfMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*MsdpVrf] {
	return pulumix.Output[map[string]*MsdpVrf]{
		OutputState: i.ToMsdpVrfMapOutputWithContext(ctx).OutputState,
	}
}

type MsdpVrfOutput struct{ *pulumi.OutputState }

func (MsdpVrfOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MsdpVrf)(nil)).Elem()
}

func (o MsdpVrfOutput) ToMsdpVrfOutput() MsdpVrfOutput {
	return o
}

func (o MsdpVrfOutput) ToMsdpVrfOutputWithContext(ctx context.Context) MsdpVrfOutput {
	return o
}

func (o MsdpVrfOutput) ToOutput(ctx context.Context) pulumix.Output[*MsdpVrf] {
	return pulumix.Output[*MsdpVrf]{
		OutputState: o.OutputState,
	}
}

// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
// Default value is `all`. - Choices: `all`, `attributes`
func (o MsdpVrfOutput) DeleteMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MsdpVrf) pulumi.StringPtrOutput { return v.DeleteMode }).(pulumi.StringPtrOutput)
}

// A device name from the provider configuration.
func (o MsdpVrfOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MsdpVrf) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

// Configure MSDP Originator ID
func (o MsdpVrfOutput) OriginatorId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MsdpVrf) pulumi.StringPtrOutput { return v.OriginatorId }).(pulumi.StringPtrOutput)
}

// MSDP peer on which the password is to be set
func (o MsdpVrfOutput) Passwords() MsdpVrfPasswordArrayOutput {
	return o.ApplyT(func(v *MsdpVrf) MsdpVrfPasswordArrayOutput { return v.Passwords }).(MsdpVrfPasswordArrayOutput)
}

// Configure an MSDP peer
func (o MsdpVrfOutput) Peers() MsdpVrfPeerArrayOutput {
	return o.ApplyT(func(v *MsdpVrf) MsdpVrfPeerArrayOutput { return v.Peers }).(MsdpVrfPeerArrayOutput)
}

func (o MsdpVrfOutput) Vrf() pulumi.StringOutput {
	return o.ApplyT(func(v *MsdpVrf) pulumi.StringOutput { return v.Vrf }).(pulumi.StringOutput)
}

type MsdpVrfArrayOutput struct{ *pulumi.OutputState }

func (MsdpVrfArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MsdpVrf)(nil)).Elem()
}

func (o MsdpVrfArrayOutput) ToMsdpVrfArrayOutput() MsdpVrfArrayOutput {
	return o
}

func (o MsdpVrfArrayOutput) ToMsdpVrfArrayOutputWithContext(ctx context.Context) MsdpVrfArrayOutput {
	return o
}

func (o MsdpVrfArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*MsdpVrf] {
	return pulumix.Output[[]*MsdpVrf]{
		OutputState: o.OutputState,
	}
}

func (o MsdpVrfArrayOutput) Index(i pulumi.IntInput) MsdpVrfOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MsdpVrf {
		return vs[0].([]*MsdpVrf)[vs[1].(int)]
	}).(MsdpVrfOutput)
}

type MsdpVrfMapOutput struct{ *pulumi.OutputState }

func (MsdpVrfMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MsdpVrf)(nil)).Elem()
}

func (o MsdpVrfMapOutput) ToMsdpVrfMapOutput() MsdpVrfMapOutput {
	return o
}

func (o MsdpVrfMapOutput) ToMsdpVrfMapOutputWithContext(ctx context.Context) MsdpVrfMapOutput {
	return o
}

func (o MsdpVrfMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*MsdpVrf] {
	return pulumix.Output[map[string]*MsdpVrf]{
		OutputState: o.OutputState,
	}
}

func (o MsdpVrfMapOutput) MapIndex(k pulumi.StringInput) MsdpVrfOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MsdpVrf {
		return vs[0].(map[string]*MsdpVrf)[vs[1].(string)]
	}).(MsdpVrfOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MsdpVrfInput)(nil)).Elem(), &MsdpVrf{})
	pulumi.RegisterInputType(reflect.TypeOf((*MsdpVrfArrayInput)(nil)).Elem(), MsdpVrfArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MsdpVrfMapInput)(nil)).Elem(), MsdpVrfMap{})
	pulumi.RegisterOutputType(MsdpVrfOutput{})
	pulumi.RegisterOutputType(MsdpVrfArrayOutput{})
	pulumi.RegisterOutputType(MsdpVrfMapOutput{})
}