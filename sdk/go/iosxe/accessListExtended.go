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

// This resource can manage the Access List Extended configuration.
//
// ## Import
//
// ```sh
//
//	$ pulumi import iosxe:index/accessListExtended:AccessListExtended example "Cisco-IOS-XE-native:native/ip/access-list/Cisco-IOS-XE-acl:extended=EACL1"
//
// ```
type AccessListExtended struct {
	pulumi.CustomResourceState

	// A device name from the provider configuration.
	Device  pulumi.StringPtrOutput             `pulumi:"device"`
	Entries AccessListExtendedEntryArrayOutput `pulumi:"entries"`
	Name    pulumi.StringOutput                `pulumi:"name"`
}

// NewAccessListExtended registers a new resource with the given unique name, arguments, and options.
func NewAccessListExtended(ctx *pulumi.Context,
	name string, args *AccessListExtendedArgs, opts ...pulumi.ResourceOption) (*AccessListExtended, error) {
	if args == nil {
		args = &AccessListExtendedArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AccessListExtended
	err := ctx.RegisterResource("iosxe:index/accessListExtended:AccessListExtended", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessListExtended gets an existing AccessListExtended resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessListExtended(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessListExtendedState, opts ...pulumi.ResourceOption) (*AccessListExtended, error) {
	var resource AccessListExtended
	err := ctx.ReadResource("iosxe:index/accessListExtended:AccessListExtended", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessListExtended resources.
type accessListExtendedState struct {
	// A device name from the provider configuration.
	Device  *string                   `pulumi:"device"`
	Entries []AccessListExtendedEntry `pulumi:"entries"`
	Name    *string                   `pulumi:"name"`
}

type AccessListExtendedState struct {
	// A device name from the provider configuration.
	Device  pulumi.StringPtrInput
	Entries AccessListExtendedEntryArrayInput
	Name    pulumi.StringPtrInput
}

func (AccessListExtendedState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessListExtendedState)(nil)).Elem()
}

type accessListExtendedArgs struct {
	// A device name from the provider configuration.
	Device  *string                   `pulumi:"device"`
	Entries []AccessListExtendedEntry `pulumi:"entries"`
	Name    *string                   `pulumi:"name"`
}

// The set of arguments for constructing a AccessListExtended resource.
type AccessListExtendedArgs struct {
	// A device name from the provider configuration.
	Device  pulumi.StringPtrInput
	Entries AccessListExtendedEntryArrayInput
	Name    pulumi.StringPtrInput
}

func (AccessListExtendedArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessListExtendedArgs)(nil)).Elem()
}

type AccessListExtendedInput interface {
	pulumi.Input

	ToAccessListExtendedOutput() AccessListExtendedOutput
	ToAccessListExtendedOutputWithContext(ctx context.Context) AccessListExtendedOutput
}

func (*AccessListExtended) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessListExtended)(nil)).Elem()
}

func (i *AccessListExtended) ToAccessListExtendedOutput() AccessListExtendedOutput {
	return i.ToAccessListExtendedOutputWithContext(context.Background())
}

func (i *AccessListExtended) ToAccessListExtendedOutputWithContext(ctx context.Context) AccessListExtendedOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessListExtendedOutput)
}

func (i *AccessListExtended) ToOutput(ctx context.Context) pulumix.Output[*AccessListExtended] {
	return pulumix.Output[*AccessListExtended]{
		OutputState: i.ToAccessListExtendedOutputWithContext(ctx).OutputState,
	}
}

// AccessListExtendedArrayInput is an input type that accepts AccessListExtendedArray and AccessListExtendedArrayOutput values.
// You can construct a concrete instance of `AccessListExtendedArrayInput` via:
//
//	AccessListExtendedArray{ AccessListExtendedArgs{...} }
type AccessListExtendedArrayInput interface {
	pulumi.Input

	ToAccessListExtendedArrayOutput() AccessListExtendedArrayOutput
	ToAccessListExtendedArrayOutputWithContext(context.Context) AccessListExtendedArrayOutput
}

type AccessListExtendedArray []AccessListExtendedInput

func (AccessListExtendedArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessListExtended)(nil)).Elem()
}

func (i AccessListExtendedArray) ToAccessListExtendedArrayOutput() AccessListExtendedArrayOutput {
	return i.ToAccessListExtendedArrayOutputWithContext(context.Background())
}

func (i AccessListExtendedArray) ToAccessListExtendedArrayOutputWithContext(ctx context.Context) AccessListExtendedArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessListExtendedArrayOutput)
}

func (i AccessListExtendedArray) ToOutput(ctx context.Context) pulumix.Output[[]*AccessListExtended] {
	return pulumix.Output[[]*AccessListExtended]{
		OutputState: i.ToAccessListExtendedArrayOutputWithContext(ctx).OutputState,
	}
}

// AccessListExtendedMapInput is an input type that accepts AccessListExtendedMap and AccessListExtendedMapOutput values.
// You can construct a concrete instance of `AccessListExtendedMapInput` via:
//
//	AccessListExtendedMap{ "key": AccessListExtendedArgs{...} }
type AccessListExtendedMapInput interface {
	pulumi.Input

	ToAccessListExtendedMapOutput() AccessListExtendedMapOutput
	ToAccessListExtendedMapOutputWithContext(context.Context) AccessListExtendedMapOutput
}

type AccessListExtendedMap map[string]AccessListExtendedInput

func (AccessListExtendedMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessListExtended)(nil)).Elem()
}

func (i AccessListExtendedMap) ToAccessListExtendedMapOutput() AccessListExtendedMapOutput {
	return i.ToAccessListExtendedMapOutputWithContext(context.Background())
}

func (i AccessListExtendedMap) ToAccessListExtendedMapOutputWithContext(ctx context.Context) AccessListExtendedMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessListExtendedMapOutput)
}

func (i AccessListExtendedMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*AccessListExtended] {
	return pulumix.Output[map[string]*AccessListExtended]{
		OutputState: i.ToAccessListExtendedMapOutputWithContext(ctx).OutputState,
	}
}

type AccessListExtendedOutput struct{ *pulumi.OutputState }

func (AccessListExtendedOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessListExtended)(nil)).Elem()
}

func (o AccessListExtendedOutput) ToAccessListExtendedOutput() AccessListExtendedOutput {
	return o
}

func (o AccessListExtendedOutput) ToAccessListExtendedOutputWithContext(ctx context.Context) AccessListExtendedOutput {
	return o
}

func (o AccessListExtendedOutput) ToOutput(ctx context.Context) pulumix.Output[*AccessListExtended] {
	return pulumix.Output[*AccessListExtended]{
		OutputState: o.OutputState,
	}
}

// A device name from the provider configuration.
func (o AccessListExtendedOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessListExtended) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

func (o AccessListExtendedOutput) Entries() AccessListExtendedEntryArrayOutput {
	return o.ApplyT(func(v *AccessListExtended) AccessListExtendedEntryArrayOutput { return v.Entries }).(AccessListExtendedEntryArrayOutput)
}

func (o AccessListExtendedOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessListExtended) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type AccessListExtendedArrayOutput struct{ *pulumi.OutputState }

func (AccessListExtendedArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessListExtended)(nil)).Elem()
}

func (o AccessListExtendedArrayOutput) ToAccessListExtendedArrayOutput() AccessListExtendedArrayOutput {
	return o
}

func (o AccessListExtendedArrayOutput) ToAccessListExtendedArrayOutputWithContext(ctx context.Context) AccessListExtendedArrayOutput {
	return o
}

func (o AccessListExtendedArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*AccessListExtended] {
	return pulumix.Output[[]*AccessListExtended]{
		OutputState: o.OutputState,
	}
}

func (o AccessListExtendedArrayOutput) Index(i pulumi.IntInput) AccessListExtendedOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccessListExtended {
		return vs[0].([]*AccessListExtended)[vs[1].(int)]
	}).(AccessListExtendedOutput)
}

type AccessListExtendedMapOutput struct{ *pulumi.OutputState }

func (AccessListExtendedMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessListExtended)(nil)).Elem()
}

func (o AccessListExtendedMapOutput) ToAccessListExtendedMapOutput() AccessListExtendedMapOutput {
	return o
}

func (o AccessListExtendedMapOutput) ToAccessListExtendedMapOutputWithContext(ctx context.Context) AccessListExtendedMapOutput {
	return o
}

func (o AccessListExtendedMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*AccessListExtended] {
	return pulumix.Output[map[string]*AccessListExtended]{
		OutputState: o.OutputState,
	}
}

func (o AccessListExtendedMapOutput) MapIndex(k pulumi.StringInput) AccessListExtendedOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccessListExtended {
		return vs[0].(map[string]*AccessListExtended)[vs[1].(string)]
	}).(AccessListExtendedOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccessListExtendedInput)(nil)).Elem(), &AccessListExtended{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessListExtendedArrayInput)(nil)).Elem(), AccessListExtendedArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessListExtendedMapInput)(nil)).Elem(), AccessListExtendedMap{})
	pulumi.RegisterOutputType(AccessListExtendedOutput{})
	pulumi.RegisterOutputType(AccessListExtendedArrayOutput{})
	pulumi.RegisterOutputType(AccessListExtendedMapOutput{})
}
