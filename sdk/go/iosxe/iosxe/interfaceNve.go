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

type InterfaceNve struct {
	pulumi.CustomResourceState

	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrOutput `pulumi:"deleteMode"`
	// Interface specific description
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// A device name from the provider configuration.
	Device                      pulumi.StringPtrOutput `pulumi:"device"`
	HostReachabilityProtocolBgp pulumi.BoolPtrOutput   `pulumi:"hostReachabilityProtocolBgp"`
	// - Range: `1`-`4096`
	Name pulumi.IntOutput `pulumi:"name"`
	// Shutdown the selected interface
	Shutdown pulumi.BoolPtrOutput `pulumi:"shutdown"`
	// Loopback interface - Range: `0`-`2147483647`
	SourceInterfaceLoopback pulumi.IntPtrOutput `pulumi:"sourceInterfaceLoopback"`
	// Configure VNI information
	VniVrfs InterfaceNveVniVrfArrayOutput `pulumi:"vniVrfs"`
	// Configure VNI information
	Vnis InterfaceNveVniArrayOutput `pulumi:"vnis"`
}

// NewInterfaceNve registers a new resource with the given unique name, arguments, and options.
func NewInterfaceNve(ctx *pulumi.Context,
	name string, args *InterfaceNveArgs, opts ...pulumi.ResourceOption) (*InterfaceNve, error) {
	if args == nil {
		args = &InterfaceNveArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource InterfaceNve
	err := ctx.RegisterResource("iosxe:iosxe/interfaceNve:InterfaceNve", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInterfaceNve gets an existing InterfaceNve resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInterfaceNve(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InterfaceNveState, opts ...pulumi.ResourceOption) (*InterfaceNve, error) {
	var resource InterfaceNve
	err := ctx.ReadResource("iosxe:iosxe/interfaceNve:InterfaceNve", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InterfaceNve resources.
type interfaceNveState struct {
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode *string `pulumi:"deleteMode"`
	// Interface specific description
	Description *string `pulumi:"description"`
	// A device name from the provider configuration.
	Device                      *string `pulumi:"device"`
	HostReachabilityProtocolBgp *bool   `pulumi:"hostReachabilityProtocolBgp"`
	// - Range: `1`-`4096`
	Name *int `pulumi:"name"`
	// Shutdown the selected interface
	Shutdown *bool `pulumi:"shutdown"`
	// Loopback interface - Range: `0`-`2147483647`
	SourceInterfaceLoopback *int `pulumi:"sourceInterfaceLoopback"`
	// Configure VNI information
	VniVrfs []InterfaceNveVniVrf `pulumi:"vniVrfs"`
	// Configure VNI information
	Vnis []InterfaceNveVni `pulumi:"vnis"`
}

type InterfaceNveState struct {
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrInput
	// Interface specific description
	Description pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device                      pulumi.StringPtrInput
	HostReachabilityProtocolBgp pulumi.BoolPtrInput
	// - Range: `1`-`4096`
	Name pulumi.IntPtrInput
	// Shutdown the selected interface
	Shutdown pulumi.BoolPtrInput
	// Loopback interface - Range: `0`-`2147483647`
	SourceInterfaceLoopback pulumi.IntPtrInput
	// Configure VNI information
	VniVrfs InterfaceNveVniVrfArrayInput
	// Configure VNI information
	Vnis InterfaceNveVniArrayInput
}

func (InterfaceNveState) ElementType() reflect.Type {
	return reflect.TypeOf((*interfaceNveState)(nil)).Elem()
}

type interfaceNveArgs struct {
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode *string `pulumi:"deleteMode"`
	// Interface specific description
	Description *string `pulumi:"description"`
	// A device name from the provider configuration.
	Device                      *string `pulumi:"device"`
	HostReachabilityProtocolBgp *bool   `pulumi:"hostReachabilityProtocolBgp"`
	// - Range: `1`-`4096`
	Name *int `pulumi:"name"`
	// Shutdown the selected interface
	Shutdown *bool `pulumi:"shutdown"`
	// Loopback interface - Range: `0`-`2147483647`
	SourceInterfaceLoopback *int `pulumi:"sourceInterfaceLoopback"`
	// Configure VNI information
	VniVrfs []InterfaceNveVniVrf `pulumi:"vniVrfs"`
	// Configure VNI information
	Vnis []InterfaceNveVni `pulumi:"vnis"`
}

// The set of arguments for constructing a InterfaceNve resource.
type InterfaceNveArgs struct {
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrInput
	// Interface specific description
	Description pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device                      pulumi.StringPtrInput
	HostReachabilityProtocolBgp pulumi.BoolPtrInput
	// - Range: `1`-`4096`
	Name pulumi.IntPtrInput
	// Shutdown the selected interface
	Shutdown pulumi.BoolPtrInput
	// Loopback interface - Range: `0`-`2147483647`
	SourceInterfaceLoopback pulumi.IntPtrInput
	// Configure VNI information
	VniVrfs InterfaceNveVniVrfArrayInput
	// Configure VNI information
	Vnis InterfaceNveVniArrayInput
}

func (InterfaceNveArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*interfaceNveArgs)(nil)).Elem()
}

type InterfaceNveInput interface {
	pulumi.Input

	ToInterfaceNveOutput() InterfaceNveOutput
	ToInterfaceNveOutputWithContext(ctx context.Context) InterfaceNveOutput
}

func (*InterfaceNve) ElementType() reflect.Type {
	return reflect.TypeOf((**InterfaceNve)(nil)).Elem()
}

func (i *InterfaceNve) ToInterfaceNveOutput() InterfaceNveOutput {
	return i.ToInterfaceNveOutputWithContext(context.Background())
}

func (i *InterfaceNve) ToInterfaceNveOutputWithContext(ctx context.Context) InterfaceNveOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InterfaceNveOutput)
}

func (i *InterfaceNve) ToOutput(ctx context.Context) pulumix.Output[*InterfaceNve] {
	return pulumix.Output[*InterfaceNve]{
		OutputState: i.ToInterfaceNveOutputWithContext(ctx).OutputState,
	}
}

// InterfaceNveArrayInput is an input type that accepts InterfaceNveArray and InterfaceNveArrayOutput values.
// You can construct a concrete instance of `InterfaceNveArrayInput` via:
//
//	InterfaceNveArray{ InterfaceNveArgs{...} }
type InterfaceNveArrayInput interface {
	pulumi.Input

	ToInterfaceNveArrayOutput() InterfaceNveArrayOutput
	ToInterfaceNveArrayOutputWithContext(context.Context) InterfaceNveArrayOutput
}

type InterfaceNveArray []InterfaceNveInput

func (InterfaceNveArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InterfaceNve)(nil)).Elem()
}

func (i InterfaceNveArray) ToInterfaceNveArrayOutput() InterfaceNveArrayOutput {
	return i.ToInterfaceNveArrayOutputWithContext(context.Background())
}

func (i InterfaceNveArray) ToInterfaceNveArrayOutputWithContext(ctx context.Context) InterfaceNveArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InterfaceNveArrayOutput)
}

func (i InterfaceNveArray) ToOutput(ctx context.Context) pulumix.Output[[]*InterfaceNve] {
	return pulumix.Output[[]*InterfaceNve]{
		OutputState: i.ToInterfaceNveArrayOutputWithContext(ctx).OutputState,
	}
}

// InterfaceNveMapInput is an input type that accepts InterfaceNveMap and InterfaceNveMapOutput values.
// You can construct a concrete instance of `InterfaceNveMapInput` via:
//
//	InterfaceNveMap{ "key": InterfaceNveArgs{...} }
type InterfaceNveMapInput interface {
	pulumi.Input

	ToInterfaceNveMapOutput() InterfaceNveMapOutput
	ToInterfaceNveMapOutputWithContext(context.Context) InterfaceNveMapOutput
}

type InterfaceNveMap map[string]InterfaceNveInput

func (InterfaceNveMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InterfaceNve)(nil)).Elem()
}

func (i InterfaceNveMap) ToInterfaceNveMapOutput() InterfaceNveMapOutput {
	return i.ToInterfaceNveMapOutputWithContext(context.Background())
}

func (i InterfaceNveMap) ToInterfaceNveMapOutputWithContext(ctx context.Context) InterfaceNveMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InterfaceNveMapOutput)
}

func (i InterfaceNveMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*InterfaceNve] {
	return pulumix.Output[map[string]*InterfaceNve]{
		OutputState: i.ToInterfaceNveMapOutputWithContext(ctx).OutputState,
	}
}

type InterfaceNveOutput struct{ *pulumi.OutputState }

func (InterfaceNveOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InterfaceNve)(nil)).Elem()
}

func (o InterfaceNveOutput) ToInterfaceNveOutput() InterfaceNveOutput {
	return o
}

func (o InterfaceNveOutput) ToInterfaceNveOutputWithContext(ctx context.Context) InterfaceNveOutput {
	return o
}

func (o InterfaceNveOutput) ToOutput(ctx context.Context) pulumix.Output[*InterfaceNve] {
	return pulumix.Output[*InterfaceNve]{
		OutputState: o.OutputState,
	}
}

// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
// Default value is `all`. - Choices: `all`, `attributes`
func (o InterfaceNveOutput) DeleteMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *InterfaceNve) pulumi.StringPtrOutput { return v.DeleteMode }).(pulumi.StringPtrOutput)
}

// Interface specific description
func (o InterfaceNveOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *InterfaceNve) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// A device name from the provider configuration.
func (o InterfaceNveOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *InterfaceNve) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

func (o InterfaceNveOutput) HostReachabilityProtocolBgp() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *InterfaceNve) pulumi.BoolPtrOutput { return v.HostReachabilityProtocolBgp }).(pulumi.BoolPtrOutput)
}

// - Range: `1`-`4096`
func (o InterfaceNveOutput) Name() pulumi.IntOutput {
	return o.ApplyT(func(v *InterfaceNve) pulumi.IntOutput { return v.Name }).(pulumi.IntOutput)
}

// Shutdown the selected interface
func (o InterfaceNveOutput) Shutdown() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *InterfaceNve) pulumi.BoolPtrOutput { return v.Shutdown }).(pulumi.BoolPtrOutput)
}

// Loopback interface - Range: `0`-`2147483647`
func (o InterfaceNveOutput) SourceInterfaceLoopback() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *InterfaceNve) pulumi.IntPtrOutput { return v.SourceInterfaceLoopback }).(pulumi.IntPtrOutput)
}

// Configure VNI information
func (o InterfaceNveOutput) VniVrfs() InterfaceNveVniVrfArrayOutput {
	return o.ApplyT(func(v *InterfaceNve) InterfaceNveVniVrfArrayOutput { return v.VniVrfs }).(InterfaceNveVniVrfArrayOutput)
}

// Configure VNI information
func (o InterfaceNveOutput) Vnis() InterfaceNveVniArrayOutput {
	return o.ApplyT(func(v *InterfaceNve) InterfaceNveVniArrayOutput { return v.Vnis }).(InterfaceNveVniArrayOutput)
}

type InterfaceNveArrayOutput struct{ *pulumi.OutputState }

func (InterfaceNveArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InterfaceNve)(nil)).Elem()
}

func (o InterfaceNveArrayOutput) ToInterfaceNveArrayOutput() InterfaceNveArrayOutput {
	return o
}

func (o InterfaceNveArrayOutput) ToInterfaceNveArrayOutputWithContext(ctx context.Context) InterfaceNveArrayOutput {
	return o
}

func (o InterfaceNveArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*InterfaceNve] {
	return pulumix.Output[[]*InterfaceNve]{
		OutputState: o.OutputState,
	}
}

func (o InterfaceNveArrayOutput) Index(i pulumi.IntInput) InterfaceNveOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InterfaceNve {
		return vs[0].([]*InterfaceNve)[vs[1].(int)]
	}).(InterfaceNveOutput)
}

type InterfaceNveMapOutput struct{ *pulumi.OutputState }

func (InterfaceNveMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InterfaceNve)(nil)).Elem()
}

func (o InterfaceNveMapOutput) ToInterfaceNveMapOutput() InterfaceNveMapOutput {
	return o
}

func (o InterfaceNveMapOutput) ToInterfaceNveMapOutputWithContext(ctx context.Context) InterfaceNveMapOutput {
	return o
}

func (o InterfaceNveMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*InterfaceNve] {
	return pulumix.Output[map[string]*InterfaceNve]{
		OutputState: o.OutputState,
	}
}

func (o InterfaceNveMapOutput) MapIndex(k pulumi.StringInput) InterfaceNveOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InterfaceNve {
		return vs[0].(map[string]*InterfaceNve)[vs[1].(string)]
	}).(InterfaceNveOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InterfaceNveInput)(nil)).Elem(), &InterfaceNve{})
	pulumi.RegisterInputType(reflect.TypeOf((*InterfaceNveArrayInput)(nil)).Elem(), InterfaceNveArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InterfaceNveMapInput)(nil)).Elem(), InterfaceNveMap{})
	pulumi.RegisterOutputType(InterfaceNveOutput{})
	pulumi.RegisterOutputType(InterfaceNveArrayOutput{})
	pulumi.RegisterOutputType(InterfaceNveMapOutput{})
}