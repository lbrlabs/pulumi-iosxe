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

type RadiusServer struct {
	pulumi.CustomResourceState

	// Customize selected radius attributes
	Attributes RadiusServerAttributeArrayOutput `pulumi:"attributes"`
	// The time during which no properly formed response must be received from the RADIUS server - Range: `1`-`120`
	DeadCriteriaTime pulumi.IntPtrOutput `pulumi:"deadCriteriaTime"`
	// The number of times the router must fail to receive a response from the radius server to mark it as dead - Range:
	// `1`-`100`
	DeadCriteriaTries pulumi.IntPtrOutput `pulumi:"deadCriteriaTries"`
	// Time to stop using a server that does not respond - Range: `1`-`1440`
	Deadtime pulumi.IntPtrOutput `pulumi:"deadtime"`
	// A device name from the provider configuration.
	Device pulumi.StringPtrOutput `pulumi:"device"`
}

// NewRadiusServer registers a new resource with the given unique name, arguments, and options.
func NewRadiusServer(ctx *pulumi.Context,
	name string, args *RadiusServerArgs, opts ...pulumi.ResourceOption) (*RadiusServer, error) {
	if args == nil {
		args = &RadiusServerArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RadiusServer
	err := ctx.RegisterResource("iosxe:iosxe/radiusServer:RadiusServer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRadiusServer gets an existing RadiusServer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRadiusServer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RadiusServerState, opts ...pulumi.ResourceOption) (*RadiusServer, error) {
	var resource RadiusServer
	err := ctx.ReadResource("iosxe:iosxe/radiusServer:RadiusServer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RadiusServer resources.
type radiusServerState struct {
	// Customize selected radius attributes
	Attributes []RadiusServerAttribute `pulumi:"attributes"`
	// The time during which no properly formed response must be received from the RADIUS server - Range: `1`-`120`
	DeadCriteriaTime *int `pulumi:"deadCriteriaTime"`
	// The number of times the router must fail to receive a response from the radius server to mark it as dead - Range:
	// `1`-`100`
	DeadCriteriaTries *int `pulumi:"deadCriteriaTries"`
	// Time to stop using a server that does not respond - Range: `1`-`1440`
	Deadtime *int `pulumi:"deadtime"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
}

type RadiusServerState struct {
	// Customize selected radius attributes
	Attributes RadiusServerAttributeArrayInput
	// The time during which no properly formed response must be received from the RADIUS server - Range: `1`-`120`
	DeadCriteriaTime pulumi.IntPtrInput
	// The number of times the router must fail to receive a response from the radius server to mark it as dead - Range:
	// `1`-`100`
	DeadCriteriaTries pulumi.IntPtrInput
	// Time to stop using a server that does not respond - Range: `1`-`1440`
	Deadtime pulumi.IntPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
}

func (RadiusServerState) ElementType() reflect.Type {
	return reflect.TypeOf((*radiusServerState)(nil)).Elem()
}

type radiusServerArgs struct {
	// Customize selected radius attributes
	Attributes []RadiusServerAttribute `pulumi:"attributes"`
	// The time during which no properly formed response must be received from the RADIUS server - Range: `1`-`120`
	DeadCriteriaTime *int `pulumi:"deadCriteriaTime"`
	// The number of times the router must fail to receive a response from the radius server to mark it as dead - Range:
	// `1`-`100`
	DeadCriteriaTries *int `pulumi:"deadCriteriaTries"`
	// Time to stop using a server that does not respond - Range: `1`-`1440`
	Deadtime *int `pulumi:"deadtime"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
}

// The set of arguments for constructing a RadiusServer resource.
type RadiusServerArgs struct {
	// Customize selected radius attributes
	Attributes RadiusServerAttributeArrayInput
	// The time during which no properly formed response must be received from the RADIUS server - Range: `1`-`120`
	DeadCriteriaTime pulumi.IntPtrInput
	// The number of times the router must fail to receive a response from the radius server to mark it as dead - Range:
	// `1`-`100`
	DeadCriteriaTries pulumi.IntPtrInput
	// Time to stop using a server that does not respond - Range: `1`-`1440`
	Deadtime pulumi.IntPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
}

func (RadiusServerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*radiusServerArgs)(nil)).Elem()
}

type RadiusServerInput interface {
	pulumi.Input

	ToRadiusServerOutput() RadiusServerOutput
	ToRadiusServerOutputWithContext(ctx context.Context) RadiusServerOutput
}

func (*RadiusServer) ElementType() reflect.Type {
	return reflect.TypeOf((**RadiusServer)(nil)).Elem()
}

func (i *RadiusServer) ToRadiusServerOutput() RadiusServerOutput {
	return i.ToRadiusServerOutputWithContext(context.Background())
}

func (i *RadiusServer) ToRadiusServerOutputWithContext(ctx context.Context) RadiusServerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RadiusServerOutput)
}

func (i *RadiusServer) ToOutput(ctx context.Context) pulumix.Output[*RadiusServer] {
	return pulumix.Output[*RadiusServer]{
		OutputState: i.ToRadiusServerOutputWithContext(ctx).OutputState,
	}
}

// RadiusServerArrayInput is an input type that accepts RadiusServerArray and RadiusServerArrayOutput values.
// You can construct a concrete instance of `RadiusServerArrayInput` via:
//
//	RadiusServerArray{ RadiusServerArgs{...} }
type RadiusServerArrayInput interface {
	pulumi.Input

	ToRadiusServerArrayOutput() RadiusServerArrayOutput
	ToRadiusServerArrayOutputWithContext(context.Context) RadiusServerArrayOutput
}

type RadiusServerArray []RadiusServerInput

func (RadiusServerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RadiusServer)(nil)).Elem()
}

func (i RadiusServerArray) ToRadiusServerArrayOutput() RadiusServerArrayOutput {
	return i.ToRadiusServerArrayOutputWithContext(context.Background())
}

func (i RadiusServerArray) ToRadiusServerArrayOutputWithContext(ctx context.Context) RadiusServerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RadiusServerArrayOutput)
}

func (i RadiusServerArray) ToOutput(ctx context.Context) pulumix.Output[[]*RadiusServer] {
	return pulumix.Output[[]*RadiusServer]{
		OutputState: i.ToRadiusServerArrayOutputWithContext(ctx).OutputState,
	}
}

// RadiusServerMapInput is an input type that accepts RadiusServerMap and RadiusServerMapOutput values.
// You can construct a concrete instance of `RadiusServerMapInput` via:
//
//	RadiusServerMap{ "key": RadiusServerArgs{...} }
type RadiusServerMapInput interface {
	pulumi.Input

	ToRadiusServerMapOutput() RadiusServerMapOutput
	ToRadiusServerMapOutputWithContext(context.Context) RadiusServerMapOutput
}

type RadiusServerMap map[string]RadiusServerInput

func (RadiusServerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RadiusServer)(nil)).Elem()
}

func (i RadiusServerMap) ToRadiusServerMapOutput() RadiusServerMapOutput {
	return i.ToRadiusServerMapOutputWithContext(context.Background())
}

func (i RadiusServerMap) ToRadiusServerMapOutputWithContext(ctx context.Context) RadiusServerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RadiusServerMapOutput)
}

func (i RadiusServerMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*RadiusServer] {
	return pulumix.Output[map[string]*RadiusServer]{
		OutputState: i.ToRadiusServerMapOutputWithContext(ctx).OutputState,
	}
}

type RadiusServerOutput struct{ *pulumi.OutputState }

func (RadiusServerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RadiusServer)(nil)).Elem()
}

func (o RadiusServerOutput) ToRadiusServerOutput() RadiusServerOutput {
	return o
}

func (o RadiusServerOutput) ToRadiusServerOutputWithContext(ctx context.Context) RadiusServerOutput {
	return o
}

func (o RadiusServerOutput) ToOutput(ctx context.Context) pulumix.Output[*RadiusServer] {
	return pulumix.Output[*RadiusServer]{
		OutputState: o.OutputState,
	}
}

// Customize selected radius attributes
func (o RadiusServerOutput) Attributes() RadiusServerAttributeArrayOutput {
	return o.ApplyT(func(v *RadiusServer) RadiusServerAttributeArrayOutput { return v.Attributes }).(RadiusServerAttributeArrayOutput)
}

// The time during which no properly formed response must be received from the RADIUS server - Range: `1`-`120`
func (o RadiusServerOutput) DeadCriteriaTime() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RadiusServer) pulumi.IntPtrOutput { return v.DeadCriteriaTime }).(pulumi.IntPtrOutput)
}

// The number of times the router must fail to receive a response from the radius server to mark it as dead - Range:
// `1`-`100`
func (o RadiusServerOutput) DeadCriteriaTries() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RadiusServer) pulumi.IntPtrOutput { return v.DeadCriteriaTries }).(pulumi.IntPtrOutput)
}

// Time to stop using a server that does not respond - Range: `1`-`1440`
func (o RadiusServerOutput) Deadtime() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *RadiusServer) pulumi.IntPtrOutput { return v.Deadtime }).(pulumi.IntPtrOutput)
}

// A device name from the provider configuration.
func (o RadiusServerOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RadiusServer) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

type RadiusServerArrayOutput struct{ *pulumi.OutputState }

func (RadiusServerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RadiusServer)(nil)).Elem()
}

func (o RadiusServerArrayOutput) ToRadiusServerArrayOutput() RadiusServerArrayOutput {
	return o
}

func (o RadiusServerArrayOutput) ToRadiusServerArrayOutputWithContext(ctx context.Context) RadiusServerArrayOutput {
	return o
}

func (o RadiusServerArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*RadiusServer] {
	return pulumix.Output[[]*RadiusServer]{
		OutputState: o.OutputState,
	}
}

func (o RadiusServerArrayOutput) Index(i pulumi.IntInput) RadiusServerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RadiusServer {
		return vs[0].([]*RadiusServer)[vs[1].(int)]
	}).(RadiusServerOutput)
}

type RadiusServerMapOutput struct{ *pulumi.OutputState }

func (RadiusServerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RadiusServer)(nil)).Elem()
}

func (o RadiusServerMapOutput) ToRadiusServerMapOutput() RadiusServerMapOutput {
	return o
}

func (o RadiusServerMapOutput) ToRadiusServerMapOutputWithContext(ctx context.Context) RadiusServerMapOutput {
	return o
}

func (o RadiusServerMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*RadiusServer] {
	return pulumix.Output[map[string]*RadiusServer]{
		OutputState: o.OutputState,
	}
}

func (o RadiusServerMapOutput) MapIndex(k pulumi.StringInput) RadiusServerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RadiusServer {
		return vs[0].(map[string]*RadiusServer)[vs[1].(string)]
	}).(RadiusServerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RadiusServerInput)(nil)).Elem(), &RadiusServer{})
	pulumi.RegisterInputType(reflect.TypeOf((*RadiusServerArrayInput)(nil)).Elem(), RadiusServerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RadiusServerMapInput)(nil)).Elem(), RadiusServerMap{})
	pulumi.RegisterOutputType(RadiusServerOutput{})
	pulumi.RegisterOutputType(RadiusServerArrayOutput{})
	pulumi.RegisterOutputType(RadiusServerMapOutput{})
}
