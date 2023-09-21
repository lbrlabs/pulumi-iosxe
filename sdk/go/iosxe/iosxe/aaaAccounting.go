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

type AaaAccounting struct {
	pulumi.CustomResourceState

	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrOutput `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device pulumi.StringPtrOutput `pulumi:"device"`
	// For starting an exec (shell).
	Execs AaaAccountingExecArrayOutput `pulumi:"execs"`
	// Use Server-group
	IdentityDefaultStartStopGroup1 pulumi.StringPtrOutput `pulumi:"identityDefaultStartStopGroup1"`
	// Use Server-group
	IdentityDefaultStartStopGroup2 pulumi.StringPtrOutput `pulumi:"identityDefaultStartStopGroup2"`
	// Use Server-group
	IdentityDefaultStartStopGroup3 pulumi.StringPtrOutput `pulumi:"identityDefaultStartStopGroup3"`
	// Use Server-group
	IdentityDefaultStartStopGroup4 pulumi.StringPtrOutput `pulumi:"identityDefaultStartStopGroup4"`
	// For network services. (PPP, SLIP, ARAP)
	Networks AaaAccountingNetworkArrayOutput `pulumi:"networks"`
	// Guarantee system accounting as first record.
	SystemGuaranteeFirst pulumi.BoolPtrOutput `pulumi:"systemGuaranteeFirst"`
	// Periodic intervals to send accounting update records(in minutes) - Range: `1`-`71582`
	UpdateNewinfoPeriodic pulumi.IntPtrOutput `pulumi:"updateNewinfoPeriodic"`
}

// NewAaaAccounting registers a new resource with the given unique name, arguments, and options.
func NewAaaAccounting(ctx *pulumi.Context,
	name string, args *AaaAccountingArgs, opts ...pulumi.ResourceOption) (*AaaAccounting, error) {
	if args == nil {
		args = &AaaAccountingArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AaaAccounting
	err := ctx.RegisterResource("iosxe:iosxe/aaaAccounting:AaaAccounting", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAaaAccounting gets an existing AaaAccounting resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAaaAccounting(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AaaAccountingState, opts ...pulumi.ResourceOption) (*AaaAccounting, error) {
	var resource AaaAccounting
	err := ctx.ReadResource("iosxe:iosxe/aaaAccounting:AaaAccounting", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AaaAccounting resources.
type aaaAccountingState struct {
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode *string `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// For starting an exec (shell).
	Execs []AaaAccountingExec `pulumi:"execs"`
	// Use Server-group
	IdentityDefaultStartStopGroup1 *string `pulumi:"identityDefaultStartStopGroup1"`
	// Use Server-group
	IdentityDefaultStartStopGroup2 *string `pulumi:"identityDefaultStartStopGroup2"`
	// Use Server-group
	IdentityDefaultStartStopGroup3 *string `pulumi:"identityDefaultStartStopGroup3"`
	// Use Server-group
	IdentityDefaultStartStopGroup4 *string `pulumi:"identityDefaultStartStopGroup4"`
	// For network services. (PPP, SLIP, ARAP)
	Networks []AaaAccountingNetwork `pulumi:"networks"`
	// Guarantee system accounting as first record.
	SystemGuaranteeFirst *bool `pulumi:"systemGuaranteeFirst"`
	// Periodic intervals to send accounting update records(in minutes) - Range: `1`-`71582`
	UpdateNewinfoPeriodic *int `pulumi:"updateNewinfoPeriodic"`
}

type AaaAccountingState struct {
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// For starting an exec (shell).
	Execs AaaAccountingExecArrayInput
	// Use Server-group
	IdentityDefaultStartStopGroup1 pulumi.StringPtrInput
	// Use Server-group
	IdentityDefaultStartStopGroup2 pulumi.StringPtrInput
	// Use Server-group
	IdentityDefaultStartStopGroup3 pulumi.StringPtrInput
	// Use Server-group
	IdentityDefaultStartStopGroup4 pulumi.StringPtrInput
	// For network services. (PPP, SLIP, ARAP)
	Networks AaaAccountingNetworkArrayInput
	// Guarantee system accounting as first record.
	SystemGuaranteeFirst pulumi.BoolPtrInput
	// Periodic intervals to send accounting update records(in minutes) - Range: `1`-`71582`
	UpdateNewinfoPeriodic pulumi.IntPtrInput
}

func (AaaAccountingState) ElementType() reflect.Type {
	return reflect.TypeOf((*aaaAccountingState)(nil)).Elem()
}

type aaaAccountingArgs struct {
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode *string `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// For starting an exec (shell).
	Execs []AaaAccountingExec `pulumi:"execs"`
	// Use Server-group
	IdentityDefaultStartStopGroup1 *string `pulumi:"identityDefaultStartStopGroup1"`
	// Use Server-group
	IdentityDefaultStartStopGroup2 *string `pulumi:"identityDefaultStartStopGroup2"`
	// Use Server-group
	IdentityDefaultStartStopGroup3 *string `pulumi:"identityDefaultStartStopGroup3"`
	// Use Server-group
	IdentityDefaultStartStopGroup4 *string `pulumi:"identityDefaultStartStopGroup4"`
	// For network services. (PPP, SLIP, ARAP)
	Networks []AaaAccountingNetwork `pulumi:"networks"`
	// Guarantee system accounting as first record.
	SystemGuaranteeFirst *bool `pulumi:"systemGuaranteeFirst"`
	// Periodic intervals to send accounting update records(in minutes) - Range: `1`-`71582`
	UpdateNewinfoPeriodic *int `pulumi:"updateNewinfoPeriodic"`
}

// The set of arguments for constructing a AaaAccounting resource.
type AaaAccountingArgs struct {
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// For starting an exec (shell).
	Execs AaaAccountingExecArrayInput
	// Use Server-group
	IdentityDefaultStartStopGroup1 pulumi.StringPtrInput
	// Use Server-group
	IdentityDefaultStartStopGroup2 pulumi.StringPtrInput
	// Use Server-group
	IdentityDefaultStartStopGroup3 pulumi.StringPtrInput
	// Use Server-group
	IdentityDefaultStartStopGroup4 pulumi.StringPtrInput
	// For network services. (PPP, SLIP, ARAP)
	Networks AaaAccountingNetworkArrayInput
	// Guarantee system accounting as first record.
	SystemGuaranteeFirst pulumi.BoolPtrInput
	// Periodic intervals to send accounting update records(in minutes) - Range: `1`-`71582`
	UpdateNewinfoPeriodic pulumi.IntPtrInput
}

func (AaaAccountingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*aaaAccountingArgs)(nil)).Elem()
}

type AaaAccountingInput interface {
	pulumi.Input

	ToAaaAccountingOutput() AaaAccountingOutput
	ToAaaAccountingOutputWithContext(ctx context.Context) AaaAccountingOutput
}

func (*AaaAccounting) ElementType() reflect.Type {
	return reflect.TypeOf((**AaaAccounting)(nil)).Elem()
}

func (i *AaaAccounting) ToAaaAccountingOutput() AaaAccountingOutput {
	return i.ToAaaAccountingOutputWithContext(context.Background())
}

func (i *AaaAccounting) ToAaaAccountingOutputWithContext(ctx context.Context) AaaAccountingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AaaAccountingOutput)
}

func (i *AaaAccounting) ToOutput(ctx context.Context) pulumix.Output[*AaaAccounting] {
	return pulumix.Output[*AaaAccounting]{
		OutputState: i.ToAaaAccountingOutputWithContext(ctx).OutputState,
	}
}

// AaaAccountingArrayInput is an input type that accepts AaaAccountingArray and AaaAccountingArrayOutput values.
// You can construct a concrete instance of `AaaAccountingArrayInput` via:
//
//	AaaAccountingArray{ AaaAccountingArgs{...} }
type AaaAccountingArrayInput interface {
	pulumi.Input

	ToAaaAccountingArrayOutput() AaaAccountingArrayOutput
	ToAaaAccountingArrayOutputWithContext(context.Context) AaaAccountingArrayOutput
}

type AaaAccountingArray []AaaAccountingInput

func (AaaAccountingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AaaAccounting)(nil)).Elem()
}

func (i AaaAccountingArray) ToAaaAccountingArrayOutput() AaaAccountingArrayOutput {
	return i.ToAaaAccountingArrayOutputWithContext(context.Background())
}

func (i AaaAccountingArray) ToAaaAccountingArrayOutputWithContext(ctx context.Context) AaaAccountingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AaaAccountingArrayOutput)
}

func (i AaaAccountingArray) ToOutput(ctx context.Context) pulumix.Output[[]*AaaAccounting] {
	return pulumix.Output[[]*AaaAccounting]{
		OutputState: i.ToAaaAccountingArrayOutputWithContext(ctx).OutputState,
	}
}

// AaaAccountingMapInput is an input type that accepts AaaAccountingMap and AaaAccountingMapOutput values.
// You can construct a concrete instance of `AaaAccountingMapInput` via:
//
//	AaaAccountingMap{ "key": AaaAccountingArgs{...} }
type AaaAccountingMapInput interface {
	pulumi.Input

	ToAaaAccountingMapOutput() AaaAccountingMapOutput
	ToAaaAccountingMapOutputWithContext(context.Context) AaaAccountingMapOutput
}

type AaaAccountingMap map[string]AaaAccountingInput

func (AaaAccountingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AaaAccounting)(nil)).Elem()
}

func (i AaaAccountingMap) ToAaaAccountingMapOutput() AaaAccountingMapOutput {
	return i.ToAaaAccountingMapOutputWithContext(context.Background())
}

func (i AaaAccountingMap) ToAaaAccountingMapOutputWithContext(ctx context.Context) AaaAccountingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AaaAccountingMapOutput)
}

func (i AaaAccountingMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*AaaAccounting] {
	return pulumix.Output[map[string]*AaaAccounting]{
		OutputState: i.ToAaaAccountingMapOutputWithContext(ctx).OutputState,
	}
}

type AaaAccountingOutput struct{ *pulumi.OutputState }

func (AaaAccountingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AaaAccounting)(nil)).Elem()
}

func (o AaaAccountingOutput) ToAaaAccountingOutput() AaaAccountingOutput {
	return o
}

func (o AaaAccountingOutput) ToAaaAccountingOutputWithContext(ctx context.Context) AaaAccountingOutput {
	return o
}

func (o AaaAccountingOutput) ToOutput(ctx context.Context) pulumix.Output[*AaaAccounting] {
	return pulumix.Output[*AaaAccounting]{
		OutputState: o.OutputState,
	}
}

// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
// Default value is `all`. - Choices: `all`, `attributes`
func (o AaaAccountingOutput) DeleteMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AaaAccounting) pulumi.StringPtrOutput { return v.DeleteMode }).(pulumi.StringPtrOutput)
}

// A device name from the provider configuration.
func (o AaaAccountingOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AaaAccounting) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

// For starting an exec (shell).
func (o AaaAccountingOutput) Execs() AaaAccountingExecArrayOutput {
	return o.ApplyT(func(v *AaaAccounting) AaaAccountingExecArrayOutput { return v.Execs }).(AaaAccountingExecArrayOutput)
}

// Use Server-group
func (o AaaAccountingOutput) IdentityDefaultStartStopGroup1() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AaaAccounting) pulumi.StringPtrOutput { return v.IdentityDefaultStartStopGroup1 }).(pulumi.StringPtrOutput)
}

// Use Server-group
func (o AaaAccountingOutput) IdentityDefaultStartStopGroup2() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AaaAccounting) pulumi.StringPtrOutput { return v.IdentityDefaultStartStopGroup2 }).(pulumi.StringPtrOutput)
}

// Use Server-group
func (o AaaAccountingOutput) IdentityDefaultStartStopGroup3() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AaaAccounting) pulumi.StringPtrOutput { return v.IdentityDefaultStartStopGroup3 }).(pulumi.StringPtrOutput)
}

// Use Server-group
func (o AaaAccountingOutput) IdentityDefaultStartStopGroup4() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AaaAccounting) pulumi.StringPtrOutput { return v.IdentityDefaultStartStopGroup4 }).(pulumi.StringPtrOutput)
}

// For network services. (PPP, SLIP, ARAP)
func (o AaaAccountingOutput) Networks() AaaAccountingNetworkArrayOutput {
	return o.ApplyT(func(v *AaaAccounting) AaaAccountingNetworkArrayOutput { return v.Networks }).(AaaAccountingNetworkArrayOutput)
}

// Guarantee system accounting as first record.
func (o AaaAccountingOutput) SystemGuaranteeFirst() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AaaAccounting) pulumi.BoolPtrOutput { return v.SystemGuaranteeFirst }).(pulumi.BoolPtrOutput)
}

// Periodic intervals to send accounting update records(in minutes) - Range: `1`-`71582`
func (o AaaAccountingOutput) UpdateNewinfoPeriodic() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *AaaAccounting) pulumi.IntPtrOutput { return v.UpdateNewinfoPeriodic }).(pulumi.IntPtrOutput)
}

type AaaAccountingArrayOutput struct{ *pulumi.OutputState }

func (AaaAccountingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AaaAccounting)(nil)).Elem()
}

func (o AaaAccountingArrayOutput) ToAaaAccountingArrayOutput() AaaAccountingArrayOutput {
	return o
}

func (o AaaAccountingArrayOutput) ToAaaAccountingArrayOutputWithContext(ctx context.Context) AaaAccountingArrayOutput {
	return o
}

func (o AaaAccountingArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*AaaAccounting] {
	return pulumix.Output[[]*AaaAccounting]{
		OutputState: o.OutputState,
	}
}

func (o AaaAccountingArrayOutput) Index(i pulumi.IntInput) AaaAccountingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AaaAccounting {
		return vs[0].([]*AaaAccounting)[vs[1].(int)]
	}).(AaaAccountingOutput)
}

type AaaAccountingMapOutput struct{ *pulumi.OutputState }

func (AaaAccountingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AaaAccounting)(nil)).Elem()
}

func (o AaaAccountingMapOutput) ToAaaAccountingMapOutput() AaaAccountingMapOutput {
	return o
}

func (o AaaAccountingMapOutput) ToAaaAccountingMapOutputWithContext(ctx context.Context) AaaAccountingMapOutput {
	return o
}

func (o AaaAccountingMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*AaaAccounting] {
	return pulumix.Output[map[string]*AaaAccounting]{
		OutputState: o.OutputState,
	}
}

func (o AaaAccountingMapOutput) MapIndex(k pulumi.StringInput) AaaAccountingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AaaAccounting {
		return vs[0].(map[string]*AaaAccounting)[vs[1].(string)]
	}).(AaaAccountingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AaaAccountingInput)(nil)).Elem(), &AaaAccounting{})
	pulumi.RegisterInputType(reflect.TypeOf((*AaaAccountingArrayInput)(nil)).Elem(), AaaAccountingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AaaAccountingMapInput)(nil)).Elem(), AaaAccountingMap{})
	pulumi.RegisterOutputType(AaaAccountingOutput{})
	pulumi.RegisterOutputType(AaaAccountingArrayOutput{})
	pulumi.RegisterOutputType(AaaAccountingMapOutput{})
}
