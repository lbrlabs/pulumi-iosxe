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

type SnmpServerGroup struct {
	pulumi.CustomResourceState

	// A device name from the provider configuration.
	Device pulumi.StringPtrOutput `pulumi:"device"`
	Name   pulumi.StringOutput    `pulumi:"name"`
	// group using security Level
	V3Securities SnmpServerGroupV3SecurityArrayOutput `pulumi:"v3Securities"`
}

// NewSnmpServerGroup registers a new resource with the given unique name, arguments, and options.
func NewSnmpServerGroup(ctx *pulumi.Context,
	name string, args *SnmpServerGroupArgs, opts ...pulumi.ResourceOption) (*SnmpServerGroup, error) {
	if args == nil {
		args = &SnmpServerGroupArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SnmpServerGroup
	err := ctx.RegisterResource("iosxe:iosxe/snmpServerGroup:SnmpServerGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSnmpServerGroup gets an existing SnmpServerGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSnmpServerGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SnmpServerGroupState, opts ...pulumi.ResourceOption) (*SnmpServerGroup, error) {
	var resource SnmpServerGroup
	err := ctx.ReadResource("iosxe:iosxe/snmpServerGroup:SnmpServerGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SnmpServerGroup resources.
type snmpServerGroupState struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	Name   *string `pulumi:"name"`
	// group using security Level
	V3Securities []SnmpServerGroupV3Security `pulumi:"v3Securities"`
}

type SnmpServerGroupState struct {
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	Name   pulumi.StringPtrInput
	// group using security Level
	V3Securities SnmpServerGroupV3SecurityArrayInput
}

func (SnmpServerGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*snmpServerGroupState)(nil)).Elem()
}

type snmpServerGroupArgs struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	Name   *string `pulumi:"name"`
	// group using security Level
	V3Securities []SnmpServerGroupV3Security `pulumi:"v3Securities"`
}

// The set of arguments for constructing a SnmpServerGroup resource.
type SnmpServerGroupArgs struct {
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	Name   pulumi.StringPtrInput
	// group using security Level
	V3Securities SnmpServerGroupV3SecurityArrayInput
}

func (SnmpServerGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*snmpServerGroupArgs)(nil)).Elem()
}

type SnmpServerGroupInput interface {
	pulumi.Input

	ToSnmpServerGroupOutput() SnmpServerGroupOutput
	ToSnmpServerGroupOutputWithContext(ctx context.Context) SnmpServerGroupOutput
}

func (*SnmpServerGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**SnmpServerGroup)(nil)).Elem()
}

func (i *SnmpServerGroup) ToSnmpServerGroupOutput() SnmpServerGroupOutput {
	return i.ToSnmpServerGroupOutputWithContext(context.Background())
}

func (i *SnmpServerGroup) ToSnmpServerGroupOutputWithContext(ctx context.Context) SnmpServerGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SnmpServerGroupOutput)
}

func (i *SnmpServerGroup) ToOutput(ctx context.Context) pulumix.Output[*SnmpServerGroup] {
	return pulumix.Output[*SnmpServerGroup]{
		OutputState: i.ToSnmpServerGroupOutputWithContext(ctx).OutputState,
	}
}

// SnmpServerGroupArrayInput is an input type that accepts SnmpServerGroupArray and SnmpServerGroupArrayOutput values.
// You can construct a concrete instance of `SnmpServerGroupArrayInput` via:
//
//	SnmpServerGroupArray{ SnmpServerGroupArgs{...} }
type SnmpServerGroupArrayInput interface {
	pulumi.Input

	ToSnmpServerGroupArrayOutput() SnmpServerGroupArrayOutput
	ToSnmpServerGroupArrayOutputWithContext(context.Context) SnmpServerGroupArrayOutput
}

type SnmpServerGroupArray []SnmpServerGroupInput

func (SnmpServerGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SnmpServerGroup)(nil)).Elem()
}

func (i SnmpServerGroupArray) ToSnmpServerGroupArrayOutput() SnmpServerGroupArrayOutput {
	return i.ToSnmpServerGroupArrayOutputWithContext(context.Background())
}

func (i SnmpServerGroupArray) ToSnmpServerGroupArrayOutputWithContext(ctx context.Context) SnmpServerGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SnmpServerGroupArrayOutput)
}

func (i SnmpServerGroupArray) ToOutput(ctx context.Context) pulumix.Output[[]*SnmpServerGroup] {
	return pulumix.Output[[]*SnmpServerGroup]{
		OutputState: i.ToSnmpServerGroupArrayOutputWithContext(ctx).OutputState,
	}
}

// SnmpServerGroupMapInput is an input type that accepts SnmpServerGroupMap and SnmpServerGroupMapOutput values.
// You can construct a concrete instance of `SnmpServerGroupMapInput` via:
//
//	SnmpServerGroupMap{ "key": SnmpServerGroupArgs{...} }
type SnmpServerGroupMapInput interface {
	pulumi.Input

	ToSnmpServerGroupMapOutput() SnmpServerGroupMapOutput
	ToSnmpServerGroupMapOutputWithContext(context.Context) SnmpServerGroupMapOutput
}

type SnmpServerGroupMap map[string]SnmpServerGroupInput

func (SnmpServerGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SnmpServerGroup)(nil)).Elem()
}

func (i SnmpServerGroupMap) ToSnmpServerGroupMapOutput() SnmpServerGroupMapOutput {
	return i.ToSnmpServerGroupMapOutputWithContext(context.Background())
}

func (i SnmpServerGroupMap) ToSnmpServerGroupMapOutputWithContext(ctx context.Context) SnmpServerGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SnmpServerGroupMapOutput)
}

func (i SnmpServerGroupMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*SnmpServerGroup] {
	return pulumix.Output[map[string]*SnmpServerGroup]{
		OutputState: i.ToSnmpServerGroupMapOutputWithContext(ctx).OutputState,
	}
}

type SnmpServerGroupOutput struct{ *pulumi.OutputState }

func (SnmpServerGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SnmpServerGroup)(nil)).Elem()
}

func (o SnmpServerGroupOutput) ToSnmpServerGroupOutput() SnmpServerGroupOutput {
	return o
}

func (o SnmpServerGroupOutput) ToSnmpServerGroupOutputWithContext(ctx context.Context) SnmpServerGroupOutput {
	return o
}

func (o SnmpServerGroupOutput) ToOutput(ctx context.Context) pulumix.Output[*SnmpServerGroup] {
	return pulumix.Output[*SnmpServerGroup]{
		OutputState: o.OutputState,
	}
}

// A device name from the provider configuration.
func (o SnmpServerGroupOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SnmpServerGroup) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

func (o SnmpServerGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SnmpServerGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// group using security Level
func (o SnmpServerGroupOutput) V3Securities() SnmpServerGroupV3SecurityArrayOutput {
	return o.ApplyT(func(v *SnmpServerGroup) SnmpServerGroupV3SecurityArrayOutput { return v.V3Securities }).(SnmpServerGroupV3SecurityArrayOutput)
}

type SnmpServerGroupArrayOutput struct{ *pulumi.OutputState }

func (SnmpServerGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SnmpServerGroup)(nil)).Elem()
}

func (o SnmpServerGroupArrayOutput) ToSnmpServerGroupArrayOutput() SnmpServerGroupArrayOutput {
	return o
}

func (o SnmpServerGroupArrayOutput) ToSnmpServerGroupArrayOutputWithContext(ctx context.Context) SnmpServerGroupArrayOutput {
	return o
}

func (o SnmpServerGroupArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*SnmpServerGroup] {
	return pulumix.Output[[]*SnmpServerGroup]{
		OutputState: o.OutputState,
	}
}

func (o SnmpServerGroupArrayOutput) Index(i pulumi.IntInput) SnmpServerGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SnmpServerGroup {
		return vs[0].([]*SnmpServerGroup)[vs[1].(int)]
	}).(SnmpServerGroupOutput)
}

type SnmpServerGroupMapOutput struct{ *pulumi.OutputState }

func (SnmpServerGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SnmpServerGroup)(nil)).Elem()
}

func (o SnmpServerGroupMapOutput) ToSnmpServerGroupMapOutput() SnmpServerGroupMapOutput {
	return o
}

func (o SnmpServerGroupMapOutput) ToSnmpServerGroupMapOutputWithContext(ctx context.Context) SnmpServerGroupMapOutput {
	return o
}

func (o SnmpServerGroupMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*SnmpServerGroup] {
	return pulumix.Output[map[string]*SnmpServerGroup]{
		OutputState: o.OutputState,
	}
}

func (o SnmpServerGroupMapOutput) MapIndex(k pulumi.StringInput) SnmpServerGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SnmpServerGroup {
		return vs[0].(map[string]*SnmpServerGroup)[vs[1].(string)]
	}).(SnmpServerGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SnmpServerGroupInput)(nil)).Elem(), &SnmpServerGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*SnmpServerGroupArrayInput)(nil)).Elem(), SnmpServerGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SnmpServerGroupMapInput)(nil)).Elem(), SnmpServerGroupMap{})
	pulumi.RegisterOutputType(SnmpServerGroupOutput{})
	pulumi.RegisterOutputType(SnmpServerGroupArrayOutput{})
	pulumi.RegisterOutputType(SnmpServerGroupMapOutput{})
}
