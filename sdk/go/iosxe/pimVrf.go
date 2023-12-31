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

// This resource can manage the PIM VRF configuration.
//
// ## Import
//
// ```sh
//
//	$ pulumi import iosxe:index/pimVrf:PimVrf example "Cisco-IOS-XE-native:native/ip/pim/Cisco-IOS-XE-multicast:vrf=VRF1"
//
// ```
type PimVrf struct {
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
	// Cache outgoing interface RPF info
	CacheRpfOif pulumi.BoolPtrOutput `pulumi:"cacheRpfOif"`
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
	RpAddresses PimVrfRpAddressArrayOutput `pulumi:"rpAddresses"`
	// To be a PIM version 2 RP candidate
	RpCandidates PimVrfRpCandidateArrayOutput `pulumi:"rpCandidates"`
	// Use 232/8 group range for SSM
	SsmDefault pulumi.BoolPtrOutput `pulumi:"ssmDefault"`
	// ACL for group range to be used for SSM
	SsmRange pulumi.StringPtrOutput `pulumi:"ssmRange"`
	Vrf      pulumi.StringOutput    `pulumi:"vrf"`
}

// NewPimVrf registers a new resource with the given unique name, arguments, and options.
func NewPimVrf(ctx *pulumi.Context,
	name string, args *PimVrfArgs, opts ...pulumi.ResourceOption) (*PimVrf, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Vrf == nil {
		return nil, errors.New("invalid value for required argument 'Vrf'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PimVrf
	err := ctx.RegisterResource("iosxe:index/pimVrf:PimVrf", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPimVrf gets an existing PimVrf resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPimVrf(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PimVrfState, opts ...pulumi.ResourceOption) (*PimVrf, error) {
	var resource PimVrf
	err := ctx.ReadResource("iosxe:index/pimVrf:PimVrf", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PimVrf resources.
type pimVrfState struct {
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
	// Cache outgoing interface RPF info
	CacheRpfOif *bool `pulumi:"cacheRpfOif"`
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
	RpAddresses []PimVrfRpAddress `pulumi:"rpAddresses"`
	// To be a PIM version 2 RP candidate
	RpCandidates []PimVrfRpCandidate `pulumi:"rpCandidates"`
	// Use 232/8 group range for SSM
	SsmDefault *bool `pulumi:"ssmDefault"`
	// ACL for group range to be used for SSM
	SsmRange *string `pulumi:"ssmRange"`
	Vrf      *string `pulumi:"vrf"`
}

type PimVrfState struct {
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
	// Cache outgoing interface RPF info
	CacheRpfOif pulumi.BoolPtrInput
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
	RpAddresses PimVrfRpAddressArrayInput
	// To be a PIM version 2 RP candidate
	RpCandidates PimVrfRpCandidateArrayInput
	// Use 232/8 group range for SSM
	SsmDefault pulumi.BoolPtrInput
	// ACL for group range to be used for SSM
	SsmRange pulumi.StringPtrInput
	Vrf      pulumi.StringPtrInput
}

func (PimVrfState) ElementType() reflect.Type {
	return reflect.TypeOf((*pimVrfState)(nil)).Elem()
}

type pimVrfArgs struct {
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
	// Cache outgoing interface RPF info
	CacheRpfOif *bool `pulumi:"cacheRpfOif"`
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
	RpAddresses []PimVrfRpAddress `pulumi:"rpAddresses"`
	// To be a PIM version 2 RP candidate
	RpCandidates []PimVrfRpCandidate `pulumi:"rpCandidates"`
	// Use 232/8 group range for SSM
	SsmDefault *bool `pulumi:"ssmDefault"`
	// ACL for group range to be used for SSM
	SsmRange *string `pulumi:"ssmRange"`
	Vrf      string  `pulumi:"vrf"`
}

// The set of arguments for constructing a PimVrf resource.
type PimVrfArgs struct {
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
	// Cache outgoing interface RPF info
	CacheRpfOif pulumi.BoolPtrInput
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
	RpAddresses PimVrfRpAddressArrayInput
	// To be a PIM version 2 RP candidate
	RpCandidates PimVrfRpCandidateArrayInput
	// Use 232/8 group range for SSM
	SsmDefault pulumi.BoolPtrInput
	// ACL for group range to be used for SSM
	SsmRange pulumi.StringPtrInput
	Vrf      pulumi.StringInput
}

func (PimVrfArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*pimVrfArgs)(nil)).Elem()
}

type PimVrfInput interface {
	pulumi.Input

	ToPimVrfOutput() PimVrfOutput
	ToPimVrfOutputWithContext(ctx context.Context) PimVrfOutput
}

func (*PimVrf) ElementType() reflect.Type {
	return reflect.TypeOf((**PimVrf)(nil)).Elem()
}

func (i *PimVrf) ToPimVrfOutput() PimVrfOutput {
	return i.ToPimVrfOutputWithContext(context.Background())
}

func (i *PimVrf) ToPimVrfOutputWithContext(ctx context.Context) PimVrfOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PimVrfOutput)
}

func (i *PimVrf) ToOutput(ctx context.Context) pulumix.Output[*PimVrf] {
	return pulumix.Output[*PimVrf]{
		OutputState: i.ToPimVrfOutputWithContext(ctx).OutputState,
	}
}

// PimVrfArrayInput is an input type that accepts PimVrfArray and PimVrfArrayOutput values.
// You can construct a concrete instance of `PimVrfArrayInput` via:
//
//	PimVrfArray{ PimVrfArgs{...} }
type PimVrfArrayInput interface {
	pulumi.Input

	ToPimVrfArrayOutput() PimVrfArrayOutput
	ToPimVrfArrayOutputWithContext(context.Context) PimVrfArrayOutput
}

type PimVrfArray []PimVrfInput

func (PimVrfArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PimVrf)(nil)).Elem()
}

func (i PimVrfArray) ToPimVrfArrayOutput() PimVrfArrayOutput {
	return i.ToPimVrfArrayOutputWithContext(context.Background())
}

func (i PimVrfArray) ToPimVrfArrayOutputWithContext(ctx context.Context) PimVrfArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PimVrfArrayOutput)
}

func (i PimVrfArray) ToOutput(ctx context.Context) pulumix.Output[[]*PimVrf] {
	return pulumix.Output[[]*PimVrf]{
		OutputState: i.ToPimVrfArrayOutputWithContext(ctx).OutputState,
	}
}

// PimVrfMapInput is an input type that accepts PimVrfMap and PimVrfMapOutput values.
// You can construct a concrete instance of `PimVrfMapInput` via:
//
//	PimVrfMap{ "key": PimVrfArgs{...} }
type PimVrfMapInput interface {
	pulumi.Input

	ToPimVrfMapOutput() PimVrfMapOutput
	ToPimVrfMapOutputWithContext(context.Context) PimVrfMapOutput
}

type PimVrfMap map[string]PimVrfInput

func (PimVrfMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PimVrf)(nil)).Elem()
}

func (i PimVrfMap) ToPimVrfMapOutput() PimVrfMapOutput {
	return i.ToPimVrfMapOutputWithContext(context.Background())
}

func (i PimVrfMap) ToPimVrfMapOutputWithContext(ctx context.Context) PimVrfMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PimVrfMapOutput)
}

func (i PimVrfMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*PimVrf] {
	return pulumix.Output[map[string]*PimVrf]{
		OutputState: i.ToPimVrfMapOutputWithContext(ctx).OutputState,
	}
}

type PimVrfOutput struct{ *pulumi.OutputState }

func (PimVrfOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PimVrf)(nil)).Elem()
}

func (o PimVrfOutput) ToPimVrfOutput() PimVrfOutput {
	return o
}

func (o PimVrfOutput) ToPimVrfOutputWithContext(ctx context.Context) PimVrfOutput {
	return o
}

func (o PimVrfOutput) ToOutput(ctx context.Context) pulumix.Output[*PimVrf] {
	return pulumix.Output[*PimVrf]{
		OutputState: o.OutputState,
	}
}

// Configure AutoRP global operations
func (o PimVrfOutput) Autorp() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PimVrf) pulumi.BoolPtrOutput { return v.Autorp }).(pulumi.BoolPtrOutput)
}

// Allow AutoRP packets across sparse mode interface
func (o PimVrfOutput) AutorpListener() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PimVrf) pulumi.BoolPtrOutput { return v.AutorpListener }).(pulumi.BoolPtrOutput)
}

// BSR RP candidate filter
func (o PimVrfOutput) BsrCandidateAcceptRpCandidate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PimVrf) pulumi.StringPtrOutput { return v.BsrCandidateAcceptRpCandidate }).(pulumi.StringPtrOutput)
}

// Loopback interface - Range: `0`-`2147483647`
func (o PimVrfOutput) BsrCandidateLoopback() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *PimVrf) pulumi.IntPtrOutput { return v.BsrCandidateLoopback }).(pulumi.IntPtrOutput)
}

// Hash Mask length for RP selection - Range: `0`-`32`
func (o PimVrfOutput) BsrCandidateMask() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *PimVrf) pulumi.IntPtrOutput { return v.BsrCandidateMask }).(pulumi.IntPtrOutput)
}

// Priority value for candidate bootstrap router - Range: `0`-`255`
func (o PimVrfOutput) BsrCandidatePriority() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *PimVrf) pulumi.IntPtrOutput { return v.BsrCandidatePriority }).(pulumi.IntPtrOutput)
}

// Cache outgoing interface RPF info
func (o PimVrfOutput) CacheRpfOif() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PimVrf) pulumi.BoolPtrOutput { return v.CacheRpfOif }).(pulumi.BoolPtrOutput)
}

// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
// Default value is `all`. - Choices: `all`, `attributes`
func (o PimVrfOutput) DeleteMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PimVrf) pulumi.StringPtrOutput { return v.DeleteMode }).(pulumi.StringPtrOutput)
}

// A device name from the provider configuration.
func (o PimVrfOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PimVrf) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

// IP address of Rendezvous-point for group
func (o PimVrfOutput) RpAddress() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PimVrf) pulumi.StringPtrOutput { return v.RpAddress }).(pulumi.StringPtrOutput)
}

// Group range treated in bidirectional shared-tree mode
func (o PimVrfOutput) RpAddressBidir() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PimVrf) pulumi.BoolPtrOutput { return v.RpAddressBidir }).(pulumi.BoolPtrOutput)
}

// Overrides dynamically learnt RP mappings
func (o PimVrfOutput) RpAddressOverride() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PimVrf) pulumi.BoolPtrOutput { return v.RpAddressOverride }).(pulumi.BoolPtrOutput)
}

// PIM RP-address (Rendezvous Point)
func (o PimVrfOutput) RpAddresses() PimVrfRpAddressArrayOutput {
	return o.ApplyT(func(v *PimVrf) PimVrfRpAddressArrayOutput { return v.RpAddresses }).(PimVrfRpAddressArrayOutput)
}

// To be a PIM version 2 RP candidate
func (o PimVrfOutput) RpCandidates() PimVrfRpCandidateArrayOutput {
	return o.ApplyT(func(v *PimVrf) PimVrfRpCandidateArrayOutput { return v.RpCandidates }).(PimVrfRpCandidateArrayOutput)
}

// Use 232/8 group range for SSM
func (o PimVrfOutput) SsmDefault() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PimVrf) pulumi.BoolPtrOutput { return v.SsmDefault }).(pulumi.BoolPtrOutput)
}

// ACL for group range to be used for SSM
func (o PimVrfOutput) SsmRange() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PimVrf) pulumi.StringPtrOutput { return v.SsmRange }).(pulumi.StringPtrOutput)
}

func (o PimVrfOutput) Vrf() pulumi.StringOutput {
	return o.ApplyT(func(v *PimVrf) pulumi.StringOutput { return v.Vrf }).(pulumi.StringOutput)
}

type PimVrfArrayOutput struct{ *pulumi.OutputState }

func (PimVrfArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PimVrf)(nil)).Elem()
}

func (o PimVrfArrayOutput) ToPimVrfArrayOutput() PimVrfArrayOutput {
	return o
}

func (o PimVrfArrayOutput) ToPimVrfArrayOutputWithContext(ctx context.Context) PimVrfArrayOutput {
	return o
}

func (o PimVrfArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*PimVrf] {
	return pulumix.Output[[]*PimVrf]{
		OutputState: o.OutputState,
	}
}

func (o PimVrfArrayOutput) Index(i pulumi.IntInput) PimVrfOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PimVrf {
		return vs[0].([]*PimVrf)[vs[1].(int)]
	}).(PimVrfOutput)
}

type PimVrfMapOutput struct{ *pulumi.OutputState }

func (PimVrfMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PimVrf)(nil)).Elem()
}

func (o PimVrfMapOutput) ToPimVrfMapOutput() PimVrfMapOutput {
	return o
}

func (o PimVrfMapOutput) ToPimVrfMapOutputWithContext(ctx context.Context) PimVrfMapOutput {
	return o
}

func (o PimVrfMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*PimVrf] {
	return pulumix.Output[map[string]*PimVrf]{
		OutputState: o.OutputState,
	}
}

func (o PimVrfMapOutput) MapIndex(k pulumi.StringInput) PimVrfOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PimVrf {
		return vs[0].(map[string]*PimVrf)[vs[1].(string)]
	}).(PimVrfOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PimVrfInput)(nil)).Elem(), &PimVrf{})
	pulumi.RegisterInputType(reflect.TypeOf((*PimVrfArrayInput)(nil)).Elem(), PimVrfArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PimVrfMapInput)(nil)).Elem(), PimVrfMap{})
	pulumi.RegisterOutputType(PimVrfOutput{})
	pulumi.RegisterOutputType(PimVrfArrayOutput{})
	pulumi.RegisterOutputType(PimVrfMapOutput{})
}
