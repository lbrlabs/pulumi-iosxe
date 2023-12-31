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

// This resource can manage the PIM configuration.
//
// ## Import
//
// ```sh
//
//	$ pulumi import iosxe:index/pim:Pim example "Cisco-IOS-XE-native:native/ip/pim"
//
// ```
type Pim struct {
	pulumi.CustomResourceState

	// Configure AutoRP global operations
	Autorp pulumi.BoolPtrOutput `pulumi:"autorp"`
	// Allow AutoRP packets across sparse mode interface
	AutorpListener pulumi.BoolPtrOutput `pulumi:"autorpListener"`
	// BSR RP candidate filter
	BsrCandidateAcceptRpCandidate pulumi.StringPtrOutput `pulumi:"bsrCandidateAcceptRpCandidate"`
	// Loopback interface - Range: `0`-`2147483647`
	BsrCandidateLoopback pulumi.IntPtrOutput `pulumi:"bsrCandidateLoopback"`
	// Hash Mask length for RP selection - Range: `0`-`32`
	BsrCandidateMask pulumi.IntPtrOutput `pulumi:"bsrCandidateMask"`
	// Priority value for candidate bootstrap router - Range: `0`-`255`
	BsrCandidatePriority pulumi.IntPtrOutput `pulumi:"bsrCandidatePriority"`
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrOutput `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device pulumi.StringPtrOutput `pulumi:"device"`
	// IP address of Rendezvous-point for group
	RpAddress pulumi.StringPtrOutput `pulumi:"rpAddress"`
	// Group range treated in bidirectional shared-tree mode
	RpAddressBidir pulumi.BoolPtrOutput `pulumi:"rpAddressBidir"`
	// Overrides dynamically learnt RP mappings
	RpAddressOverride pulumi.BoolPtrOutput `pulumi:"rpAddressOverride"`
	// PIM RP-address (Rendezvous Point)
	RpAddresses PimRpAddressArrayOutput `pulumi:"rpAddresses"`
	// To be a PIM version 2 RP candidate
	RpCandidates PimRpCandidateArrayOutput `pulumi:"rpCandidates"`
	// Use 232/8 group range for SSM
	SsmDefault pulumi.BoolPtrOutput `pulumi:"ssmDefault"`
	// ACL for group range to be used for SSM
	SsmRange pulumi.StringPtrOutput `pulumi:"ssmRange"`
}

// NewPim registers a new resource with the given unique name, arguments, and options.
func NewPim(ctx *pulumi.Context,
	name string, args *PimArgs, opts ...pulumi.ResourceOption) (*Pim, error) {
	if args == nil {
		args = &PimArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Pim
	err := ctx.RegisterResource("iosxe:index/pim:Pim", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPim gets an existing Pim resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPim(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PimState, opts ...pulumi.ResourceOption) (*Pim, error) {
	var resource Pim
	err := ctx.ReadResource("iosxe:index/pim:Pim", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Pim resources.
type pimState struct {
	// Configure AutoRP global operations
	Autorp *bool `pulumi:"autorp"`
	// Allow AutoRP packets across sparse mode interface
	AutorpListener *bool `pulumi:"autorpListener"`
	// BSR RP candidate filter
	BsrCandidateAcceptRpCandidate *string `pulumi:"bsrCandidateAcceptRpCandidate"`
	// Loopback interface - Range: `0`-`2147483647`
	BsrCandidateLoopback *int `pulumi:"bsrCandidateLoopback"`
	// Hash Mask length for RP selection - Range: `0`-`32`
	BsrCandidateMask *int `pulumi:"bsrCandidateMask"`
	// Priority value for candidate bootstrap router - Range: `0`-`255`
	BsrCandidatePriority *int `pulumi:"bsrCandidatePriority"`
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode *string `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// IP address of Rendezvous-point for group
	RpAddress *string `pulumi:"rpAddress"`
	// Group range treated in bidirectional shared-tree mode
	RpAddressBidir *bool `pulumi:"rpAddressBidir"`
	// Overrides dynamically learnt RP mappings
	RpAddressOverride *bool `pulumi:"rpAddressOverride"`
	// PIM RP-address (Rendezvous Point)
	RpAddresses []PimRpAddress `pulumi:"rpAddresses"`
	// To be a PIM version 2 RP candidate
	RpCandidates []PimRpCandidate `pulumi:"rpCandidates"`
	// Use 232/8 group range for SSM
	SsmDefault *bool `pulumi:"ssmDefault"`
	// ACL for group range to be used for SSM
	SsmRange *string `pulumi:"ssmRange"`
}

type PimState struct {
	// Configure AutoRP global operations
	Autorp pulumi.BoolPtrInput
	// Allow AutoRP packets across sparse mode interface
	AutorpListener pulumi.BoolPtrInput
	// BSR RP candidate filter
	BsrCandidateAcceptRpCandidate pulumi.StringPtrInput
	// Loopback interface - Range: `0`-`2147483647`
	BsrCandidateLoopback pulumi.IntPtrInput
	// Hash Mask length for RP selection - Range: `0`-`32`
	BsrCandidateMask pulumi.IntPtrInput
	// Priority value for candidate bootstrap router - Range: `0`-`255`
	BsrCandidatePriority pulumi.IntPtrInput
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// IP address of Rendezvous-point for group
	RpAddress pulumi.StringPtrInput
	// Group range treated in bidirectional shared-tree mode
	RpAddressBidir pulumi.BoolPtrInput
	// Overrides dynamically learnt RP mappings
	RpAddressOverride pulumi.BoolPtrInput
	// PIM RP-address (Rendezvous Point)
	RpAddresses PimRpAddressArrayInput
	// To be a PIM version 2 RP candidate
	RpCandidates PimRpCandidateArrayInput
	// Use 232/8 group range for SSM
	SsmDefault pulumi.BoolPtrInput
	// ACL for group range to be used for SSM
	SsmRange pulumi.StringPtrInput
}

func (PimState) ElementType() reflect.Type {
	return reflect.TypeOf((*pimState)(nil)).Elem()
}

type pimArgs struct {
	// Configure AutoRP global operations
	Autorp *bool `pulumi:"autorp"`
	// Allow AutoRP packets across sparse mode interface
	AutorpListener *bool `pulumi:"autorpListener"`
	// BSR RP candidate filter
	BsrCandidateAcceptRpCandidate *string `pulumi:"bsrCandidateAcceptRpCandidate"`
	// Loopback interface - Range: `0`-`2147483647`
	BsrCandidateLoopback *int `pulumi:"bsrCandidateLoopback"`
	// Hash Mask length for RP selection - Range: `0`-`32`
	BsrCandidateMask *int `pulumi:"bsrCandidateMask"`
	// Priority value for candidate bootstrap router - Range: `0`-`255`
	BsrCandidatePriority *int `pulumi:"bsrCandidatePriority"`
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode *string `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// IP address of Rendezvous-point for group
	RpAddress *string `pulumi:"rpAddress"`
	// Group range treated in bidirectional shared-tree mode
	RpAddressBidir *bool `pulumi:"rpAddressBidir"`
	// Overrides dynamically learnt RP mappings
	RpAddressOverride *bool `pulumi:"rpAddressOverride"`
	// PIM RP-address (Rendezvous Point)
	RpAddresses []PimRpAddress `pulumi:"rpAddresses"`
	// To be a PIM version 2 RP candidate
	RpCandidates []PimRpCandidate `pulumi:"rpCandidates"`
	// Use 232/8 group range for SSM
	SsmDefault *bool `pulumi:"ssmDefault"`
	// ACL for group range to be used for SSM
	SsmRange *string `pulumi:"ssmRange"`
}

// The set of arguments for constructing a Pim resource.
type PimArgs struct {
	// Configure AutoRP global operations
	Autorp pulumi.BoolPtrInput
	// Allow AutoRP packets across sparse mode interface
	AutorpListener pulumi.BoolPtrInput
	// BSR RP candidate filter
	BsrCandidateAcceptRpCandidate pulumi.StringPtrInput
	// Loopback interface - Range: `0`-`2147483647`
	BsrCandidateLoopback pulumi.IntPtrInput
	// Hash Mask length for RP selection - Range: `0`-`32`
	BsrCandidateMask pulumi.IntPtrInput
	// Priority value for candidate bootstrap router - Range: `0`-`255`
	BsrCandidatePriority pulumi.IntPtrInput
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// IP address of Rendezvous-point for group
	RpAddress pulumi.StringPtrInput
	// Group range treated in bidirectional shared-tree mode
	RpAddressBidir pulumi.BoolPtrInput
	// Overrides dynamically learnt RP mappings
	RpAddressOverride pulumi.BoolPtrInput
	// PIM RP-address (Rendezvous Point)
	RpAddresses PimRpAddressArrayInput
	// To be a PIM version 2 RP candidate
	RpCandidates PimRpCandidateArrayInput
	// Use 232/8 group range for SSM
	SsmDefault pulumi.BoolPtrInput
	// ACL for group range to be used for SSM
	SsmRange pulumi.StringPtrInput
}

func (PimArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*pimArgs)(nil)).Elem()
}

type PimInput interface {
	pulumi.Input

	ToPimOutput() PimOutput
	ToPimOutputWithContext(ctx context.Context) PimOutput
}

func (*Pim) ElementType() reflect.Type {
	return reflect.TypeOf((**Pim)(nil)).Elem()
}

func (i *Pim) ToPimOutput() PimOutput {
	return i.ToPimOutputWithContext(context.Background())
}

func (i *Pim) ToPimOutputWithContext(ctx context.Context) PimOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PimOutput)
}

func (i *Pim) ToOutput(ctx context.Context) pulumix.Output[*Pim] {
	return pulumix.Output[*Pim]{
		OutputState: i.ToPimOutputWithContext(ctx).OutputState,
	}
}

// PimArrayInput is an input type that accepts PimArray and PimArrayOutput values.
// You can construct a concrete instance of `PimArrayInput` via:
//
//	PimArray{ PimArgs{...} }
type PimArrayInput interface {
	pulumi.Input

	ToPimArrayOutput() PimArrayOutput
	ToPimArrayOutputWithContext(context.Context) PimArrayOutput
}

type PimArray []PimInput

func (PimArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Pim)(nil)).Elem()
}

func (i PimArray) ToPimArrayOutput() PimArrayOutput {
	return i.ToPimArrayOutputWithContext(context.Background())
}

func (i PimArray) ToPimArrayOutputWithContext(ctx context.Context) PimArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PimArrayOutput)
}

func (i PimArray) ToOutput(ctx context.Context) pulumix.Output[[]*Pim] {
	return pulumix.Output[[]*Pim]{
		OutputState: i.ToPimArrayOutputWithContext(ctx).OutputState,
	}
}

// PimMapInput is an input type that accepts PimMap and PimMapOutput values.
// You can construct a concrete instance of `PimMapInput` via:
//
//	PimMap{ "key": PimArgs{...} }
type PimMapInput interface {
	pulumi.Input

	ToPimMapOutput() PimMapOutput
	ToPimMapOutputWithContext(context.Context) PimMapOutput
}

type PimMap map[string]PimInput

func (PimMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Pim)(nil)).Elem()
}

func (i PimMap) ToPimMapOutput() PimMapOutput {
	return i.ToPimMapOutputWithContext(context.Background())
}

func (i PimMap) ToPimMapOutputWithContext(ctx context.Context) PimMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PimMapOutput)
}

func (i PimMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Pim] {
	return pulumix.Output[map[string]*Pim]{
		OutputState: i.ToPimMapOutputWithContext(ctx).OutputState,
	}
}

type PimOutput struct{ *pulumi.OutputState }

func (PimOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Pim)(nil)).Elem()
}

func (o PimOutput) ToPimOutput() PimOutput {
	return o
}

func (o PimOutput) ToPimOutputWithContext(ctx context.Context) PimOutput {
	return o
}

func (o PimOutput) ToOutput(ctx context.Context) pulumix.Output[*Pim] {
	return pulumix.Output[*Pim]{
		OutputState: o.OutputState,
	}
}

// Configure AutoRP global operations
func (o PimOutput) Autorp() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Pim) pulumi.BoolPtrOutput { return v.Autorp }).(pulumi.BoolPtrOutput)
}

// Allow AutoRP packets across sparse mode interface
func (o PimOutput) AutorpListener() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Pim) pulumi.BoolPtrOutput { return v.AutorpListener }).(pulumi.BoolPtrOutput)
}

// BSR RP candidate filter
func (o PimOutput) BsrCandidateAcceptRpCandidate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Pim) pulumi.StringPtrOutput { return v.BsrCandidateAcceptRpCandidate }).(pulumi.StringPtrOutput)
}

// Loopback interface - Range: `0`-`2147483647`
func (o PimOutput) BsrCandidateLoopback() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Pim) pulumi.IntPtrOutput { return v.BsrCandidateLoopback }).(pulumi.IntPtrOutput)
}

// Hash Mask length for RP selection - Range: `0`-`32`
func (o PimOutput) BsrCandidateMask() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Pim) pulumi.IntPtrOutput { return v.BsrCandidateMask }).(pulumi.IntPtrOutput)
}

// Priority value for candidate bootstrap router - Range: `0`-`255`
func (o PimOutput) BsrCandidatePriority() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Pim) pulumi.IntPtrOutput { return v.BsrCandidatePriority }).(pulumi.IntPtrOutput)
}

// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
// Default value is `all`. - Choices: `all`, `attributes`
func (o PimOutput) DeleteMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Pim) pulumi.StringPtrOutput { return v.DeleteMode }).(pulumi.StringPtrOutput)
}

// A device name from the provider configuration.
func (o PimOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Pim) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

// IP address of Rendezvous-point for group
func (o PimOutput) RpAddress() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Pim) pulumi.StringPtrOutput { return v.RpAddress }).(pulumi.StringPtrOutput)
}

// Group range treated in bidirectional shared-tree mode
func (o PimOutput) RpAddressBidir() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Pim) pulumi.BoolPtrOutput { return v.RpAddressBidir }).(pulumi.BoolPtrOutput)
}

// Overrides dynamically learnt RP mappings
func (o PimOutput) RpAddressOverride() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Pim) pulumi.BoolPtrOutput { return v.RpAddressOverride }).(pulumi.BoolPtrOutput)
}

// PIM RP-address (Rendezvous Point)
func (o PimOutput) RpAddresses() PimRpAddressArrayOutput {
	return o.ApplyT(func(v *Pim) PimRpAddressArrayOutput { return v.RpAddresses }).(PimRpAddressArrayOutput)
}

// To be a PIM version 2 RP candidate
func (o PimOutput) RpCandidates() PimRpCandidateArrayOutput {
	return o.ApplyT(func(v *Pim) PimRpCandidateArrayOutput { return v.RpCandidates }).(PimRpCandidateArrayOutput)
}

// Use 232/8 group range for SSM
func (o PimOutput) SsmDefault() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Pim) pulumi.BoolPtrOutput { return v.SsmDefault }).(pulumi.BoolPtrOutput)
}

// ACL for group range to be used for SSM
func (o PimOutput) SsmRange() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Pim) pulumi.StringPtrOutput { return v.SsmRange }).(pulumi.StringPtrOutput)
}

type PimArrayOutput struct{ *pulumi.OutputState }

func (PimArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Pim)(nil)).Elem()
}

func (o PimArrayOutput) ToPimArrayOutput() PimArrayOutput {
	return o
}

func (o PimArrayOutput) ToPimArrayOutputWithContext(ctx context.Context) PimArrayOutput {
	return o
}

func (o PimArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Pim] {
	return pulumix.Output[[]*Pim]{
		OutputState: o.OutputState,
	}
}

func (o PimArrayOutput) Index(i pulumi.IntInput) PimOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Pim {
		return vs[0].([]*Pim)[vs[1].(int)]
	}).(PimOutput)
}

type PimMapOutput struct{ *pulumi.OutputState }

func (PimMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Pim)(nil)).Elem()
}

func (o PimMapOutput) ToPimMapOutput() PimMapOutput {
	return o
}

func (o PimMapOutput) ToPimMapOutputWithContext(ctx context.Context) PimMapOutput {
	return o
}

func (o PimMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Pim] {
	return pulumix.Output[map[string]*Pim]{
		OutputState: o.OutputState,
	}
}

func (o PimMapOutput) MapIndex(k pulumi.StringInput) PimOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Pim {
		return vs[0].(map[string]*Pim)[vs[1].(string)]
	}).(PimOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PimInput)(nil)).Elem(), &Pim{})
	pulumi.RegisterInputType(reflect.TypeOf((*PimArrayInput)(nil)).Elem(), PimArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PimMapInput)(nil)).Elem(), PimMap{})
	pulumi.RegisterOutputType(PimOutput{})
	pulumi.RegisterOutputType(PimArrayOutput{})
	pulumi.RegisterOutputType(PimMapOutput{})
}
