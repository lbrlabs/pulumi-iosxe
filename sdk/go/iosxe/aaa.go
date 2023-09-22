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

// This resource can manage the AAA configuration.
//
// ## Import
//
// ```sh
//
//	$ pulumi import iosxe:index/aaa:Aaa example "Cisco-IOS-XE-native:native/aaa"
//
// ```
type Aaa struct {
	pulumi.CustomResourceState

	// A device name from the provider configuration.
	Device pulumi.StringPtrOutput `pulumi:"device"`
	// Radius server-group definition
	GroupServerRadii AaaGroupServerRadiusArrayOutput `pulumi:"groupServerRadii"`
	// Tacacs+ server-group definition
	GroupServerTacacspluses AaaGroupServerTacacsplusArrayOutput `pulumi:"groupServerTacacspluses"`
	// Enable NEW access control commands and functions.(Disables OLD commands.)
	NewModel pulumi.BoolPtrOutput `pulumi:"newModel"`
	// Local server profile for RFC 3576 support
	ServerRadiusDynamicAuthor pulumi.BoolPtrOutput `pulumi:"serverRadiusDynamicAuthor"`
	// Specify a RADIUS client
	ServerRadiusDynamicAuthorClients AaaServerRadiusDynamicAuthorClientArrayOutput `pulumi:"serverRadiusDynamicAuthorClients"`
	// AAA Session ID - Choices: `common`, `unique`
	SessionId pulumi.StringPtrOutput `pulumi:"sessionId"`
}

// NewAaa registers a new resource with the given unique name, arguments, and options.
func NewAaa(ctx *pulumi.Context,
	name string, args *AaaArgs, opts ...pulumi.ResourceOption) (*Aaa, error) {
	if args == nil {
		args = &AaaArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Aaa
	err := ctx.RegisterResource("iosxe:index/aaa:Aaa", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAaa gets an existing Aaa resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAaa(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AaaState, opts ...pulumi.ResourceOption) (*Aaa, error) {
	var resource Aaa
	err := ctx.ReadResource("iosxe:index/aaa:Aaa", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Aaa resources.
type aaaState struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// Radius server-group definition
	GroupServerRadii []AaaGroupServerRadius `pulumi:"groupServerRadii"`
	// Tacacs+ server-group definition
	GroupServerTacacspluses []AaaGroupServerTacacsplus `pulumi:"groupServerTacacspluses"`
	// Enable NEW access control commands and functions.(Disables OLD commands.)
	NewModel *bool `pulumi:"newModel"`
	// Local server profile for RFC 3576 support
	ServerRadiusDynamicAuthor *bool `pulumi:"serverRadiusDynamicAuthor"`
	// Specify a RADIUS client
	ServerRadiusDynamicAuthorClients []AaaServerRadiusDynamicAuthorClient `pulumi:"serverRadiusDynamicAuthorClients"`
	// AAA Session ID - Choices: `common`, `unique`
	SessionId *string `pulumi:"sessionId"`
}

type AaaState struct {
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// Radius server-group definition
	GroupServerRadii AaaGroupServerRadiusArrayInput
	// Tacacs+ server-group definition
	GroupServerTacacspluses AaaGroupServerTacacsplusArrayInput
	// Enable NEW access control commands and functions.(Disables OLD commands.)
	NewModel pulumi.BoolPtrInput
	// Local server profile for RFC 3576 support
	ServerRadiusDynamicAuthor pulumi.BoolPtrInput
	// Specify a RADIUS client
	ServerRadiusDynamicAuthorClients AaaServerRadiusDynamicAuthorClientArrayInput
	// AAA Session ID - Choices: `common`, `unique`
	SessionId pulumi.StringPtrInput
}

func (AaaState) ElementType() reflect.Type {
	return reflect.TypeOf((*aaaState)(nil)).Elem()
}

type aaaArgs struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// Radius server-group definition
	GroupServerRadii []AaaGroupServerRadius `pulumi:"groupServerRadii"`
	// Tacacs+ server-group definition
	GroupServerTacacspluses []AaaGroupServerTacacsplus `pulumi:"groupServerTacacspluses"`
	// Enable NEW access control commands and functions.(Disables OLD commands.)
	NewModel *bool `pulumi:"newModel"`
	// Local server profile for RFC 3576 support
	ServerRadiusDynamicAuthor *bool `pulumi:"serverRadiusDynamicAuthor"`
	// Specify a RADIUS client
	ServerRadiusDynamicAuthorClients []AaaServerRadiusDynamicAuthorClient `pulumi:"serverRadiusDynamicAuthorClients"`
	// AAA Session ID - Choices: `common`, `unique`
	SessionId *string `pulumi:"sessionId"`
}

// The set of arguments for constructing a Aaa resource.
type AaaArgs struct {
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// Radius server-group definition
	GroupServerRadii AaaGroupServerRadiusArrayInput
	// Tacacs+ server-group definition
	GroupServerTacacspluses AaaGroupServerTacacsplusArrayInput
	// Enable NEW access control commands and functions.(Disables OLD commands.)
	NewModel pulumi.BoolPtrInput
	// Local server profile for RFC 3576 support
	ServerRadiusDynamicAuthor pulumi.BoolPtrInput
	// Specify a RADIUS client
	ServerRadiusDynamicAuthorClients AaaServerRadiusDynamicAuthorClientArrayInput
	// AAA Session ID - Choices: `common`, `unique`
	SessionId pulumi.StringPtrInput
}

func (AaaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*aaaArgs)(nil)).Elem()
}

type AaaInput interface {
	pulumi.Input

	ToAaaOutput() AaaOutput
	ToAaaOutputWithContext(ctx context.Context) AaaOutput
}

func (*Aaa) ElementType() reflect.Type {
	return reflect.TypeOf((**Aaa)(nil)).Elem()
}

func (i *Aaa) ToAaaOutput() AaaOutput {
	return i.ToAaaOutputWithContext(context.Background())
}

func (i *Aaa) ToAaaOutputWithContext(ctx context.Context) AaaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AaaOutput)
}

func (i *Aaa) ToOutput(ctx context.Context) pulumix.Output[*Aaa] {
	return pulumix.Output[*Aaa]{
		OutputState: i.ToAaaOutputWithContext(ctx).OutputState,
	}
}

// AaaArrayInput is an input type that accepts AaaArray and AaaArrayOutput values.
// You can construct a concrete instance of `AaaArrayInput` via:
//
//	AaaArray{ AaaArgs{...} }
type AaaArrayInput interface {
	pulumi.Input

	ToAaaArrayOutput() AaaArrayOutput
	ToAaaArrayOutputWithContext(context.Context) AaaArrayOutput
}

type AaaArray []AaaInput

func (AaaArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Aaa)(nil)).Elem()
}

func (i AaaArray) ToAaaArrayOutput() AaaArrayOutput {
	return i.ToAaaArrayOutputWithContext(context.Background())
}

func (i AaaArray) ToAaaArrayOutputWithContext(ctx context.Context) AaaArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AaaArrayOutput)
}

func (i AaaArray) ToOutput(ctx context.Context) pulumix.Output[[]*Aaa] {
	return pulumix.Output[[]*Aaa]{
		OutputState: i.ToAaaArrayOutputWithContext(ctx).OutputState,
	}
}

// AaaMapInput is an input type that accepts AaaMap and AaaMapOutput values.
// You can construct a concrete instance of `AaaMapInput` via:
//
//	AaaMap{ "key": AaaArgs{...} }
type AaaMapInput interface {
	pulumi.Input

	ToAaaMapOutput() AaaMapOutput
	ToAaaMapOutputWithContext(context.Context) AaaMapOutput
}

type AaaMap map[string]AaaInput

func (AaaMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Aaa)(nil)).Elem()
}

func (i AaaMap) ToAaaMapOutput() AaaMapOutput {
	return i.ToAaaMapOutputWithContext(context.Background())
}

func (i AaaMap) ToAaaMapOutputWithContext(ctx context.Context) AaaMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AaaMapOutput)
}

func (i AaaMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Aaa] {
	return pulumix.Output[map[string]*Aaa]{
		OutputState: i.ToAaaMapOutputWithContext(ctx).OutputState,
	}
}

type AaaOutput struct{ *pulumi.OutputState }

func (AaaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Aaa)(nil)).Elem()
}

func (o AaaOutput) ToAaaOutput() AaaOutput {
	return o
}

func (o AaaOutput) ToAaaOutputWithContext(ctx context.Context) AaaOutput {
	return o
}

func (o AaaOutput) ToOutput(ctx context.Context) pulumix.Output[*Aaa] {
	return pulumix.Output[*Aaa]{
		OutputState: o.OutputState,
	}
}

// A device name from the provider configuration.
func (o AaaOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Aaa) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

// Radius server-group definition
func (o AaaOutput) GroupServerRadii() AaaGroupServerRadiusArrayOutput {
	return o.ApplyT(func(v *Aaa) AaaGroupServerRadiusArrayOutput { return v.GroupServerRadii }).(AaaGroupServerRadiusArrayOutput)
}

// Tacacs+ server-group definition
func (o AaaOutput) GroupServerTacacspluses() AaaGroupServerTacacsplusArrayOutput {
	return o.ApplyT(func(v *Aaa) AaaGroupServerTacacsplusArrayOutput { return v.GroupServerTacacspluses }).(AaaGroupServerTacacsplusArrayOutput)
}

// Enable NEW access control commands and functions.(Disables OLD commands.)
func (o AaaOutput) NewModel() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Aaa) pulumi.BoolPtrOutput { return v.NewModel }).(pulumi.BoolPtrOutput)
}

// Local server profile for RFC 3576 support
func (o AaaOutput) ServerRadiusDynamicAuthor() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Aaa) pulumi.BoolPtrOutput { return v.ServerRadiusDynamicAuthor }).(pulumi.BoolPtrOutput)
}

// Specify a RADIUS client
func (o AaaOutput) ServerRadiusDynamicAuthorClients() AaaServerRadiusDynamicAuthorClientArrayOutput {
	return o.ApplyT(func(v *Aaa) AaaServerRadiusDynamicAuthorClientArrayOutput { return v.ServerRadiusDynamicAuthorClients }).(AaaServerRadiusDynamicAuthorClientArrayOutput)
}

// AAA Session ID - Choices: `common`, `unique`
func (o AaaOutput) SessionId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Aaa) pulumi.StringPtrOutput { return v.SessionId }).(pulumi.StringPtrOutput)
}

type AaaArrayOutput struct{ *pulumi.OutputState }

func (AaaArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Aaa)(nil)).Elem()
}

func (o AaaArrayOutput) ToAaaArrayOutput() AaaArrayOutput {
	return o
}

func (o AaaArrayOutput) ToAaaArrayOutputWithContext(ctx context.Context) AaaArrayOutput {
	return o
}

func (o AaaArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Aaa] {
	return pulumix.Output[[]*Aaa]{
		OutputState: o.OutputState,
	}
}

func (o AaaArrayOutput) Index(i pulumi.IntInput) AaaOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Aaa {
		return vs[0].([]*Aaa)[vs[1].(int)]
	}).(AaaOutput)
}

type AaaMapOutput struct{ *pulumi.OutputState }

func (AaaMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Aaa)(nil)).Elem()
}

func (o AaaMapOutput) ToAaaMapOutput() AaaMapOutput {
	return o
}

func (o AaaMapOutput) ToAaaMapOutputWithContext(ctx context.Context) AaaMapOutput {
	return o
}

func (o AaaMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Aaa] {
	return pulumix.Output[map[string]*Aaa]{
		OutputState: o.OutputState,
	}
}

func (o AaaMapOutput) MapIndex(k pulumi.StringInput) AaaOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Aaa {
		return vs[0].(map[string]*Aaa)[vs[1].(string)]
	}).(AaaOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AaaInput)(nil)).Elem(), &Aaa{})
	pulumi.RegisterInputType(reflect.TypeOf((*AaaArrayInput)(nil)).Elem(), AaaArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AaaMapInput)(nil)).Elem(), AaaMap{})
	pulumi.RegisterOutputType(AaaOutput{})
	pulumi.RegisterOutputType(AaaArrayOutput{})
	pulumi.RegisterOutputType(AaaMapOutput{})
}