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

type Dot1x struct {
	pulumi.CustomResourceState

	// Send EAPOL-Success on successful auth-fail Authorization
	AuthFailEapol pulumi.BoolPtrOutput `pulumi:"authFailEapol"`
	// Configure 802.1X credentials profiles
	Credentials Dot1xCredentialArrayOutput `pulumi:"credentials"`
	// Block all EAPoL transaction on Critical Authentication
	CriticalEapolConfigBlock pulumi.BoolPtrOutput `pulumi:"criticalEapolConfigBlock"`
	// Set 802.1x Critical Authentication Recovery Delay period - Range: `1`-`10000`
	CriticalRecoveryDelay pulumi.IntPtrOutput `pulumi:"criticalRecoveryDelay"`
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrOutput `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device pulumi.StringPtrOutput `pulumi:"device"`
	// Show verbose messages in system logs
	LoggingVerbose pulumi.BoolPtrOutput `pulumi:"loggingVerbose"`
	// Controlled access is only applied during authentication
	SupplicantControlledTransient pulumi.BoolPtrOutput `pulumi:"supplicantControlledTransient"`
	// Force 802.1X supplicant to send multicast packets
	SupplicantForceMulticast pulumi.BoolPtrOutput `pulumi:"supplicantForceMulticast"`
	// Enable or Disable SysAuthControl
	SystemAuthControl pulumi.BoolPtrOutput `pulumi:"systemAuthControl"`
	// Timeout for device EAPOL capabilities test in seconds - Range: `1`-`65535`
	TestTimeout pulumi.IntPtrOutput `pulumi:"testTimeout"`
}

// NewDot1x registers a new resource with the given unique name, arguments, and options.
func NewDot1x(ctx *pulumi.Context,
	name string, args *Dot1xArgs, opts ...pulumi.ResourceOption) (*Dot1x, error) {
	if args == nil {
		args = &Dot1xArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Dot1x
	err := ctx.RegisterResource("iosxe:iosxe/dot1x:Dot1x", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDot1x gets an existing Dot1x resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDot1x(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *Dot1xState, opts ...pulumi.ResourceOption) (*Dot1x, error) {
	var resource Dot1x
	err := ctx.ReadResource("iosxe:iosxe/dot1x:Dot1x", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Dot1x resources.
type dot1xState struct {
	// Send EAPOL-Success on successful auth-fail Authorization
	AuthFailEapol *bool `pulumi:"authFailEapol"`
	// Configure 802.1X credentials profiles
	Credentials []Dot1xCredential `pulumi:"credentials"`
	// Block all EAPoL transaction on Critical Authentication
	CriticalEapolConfigBlock *bool `pulumi:"criticalEapolConfigBlock"`
	// Set 802.1x Critical Authentication Recovery Delay period - Range: `1`-`10000`
	CriticalRecoveryDelay *int `pulumi:"criticalRecoveryDelay"`
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode *string `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// Show verbose messages in system logs
	LoggingVerbose *bool `pulumi:"loggingVerbose"`
	// Controlled access is only applied during authentication
	SupplicantControlledTransient *bool `pulumi:"supplicantControlledTransient"`
	// Force 802.1X supplicant to send multicast packets
	SupplicantForceMulticast *bool `pulumi:"supplicantForceMulticast"`
	// Enable or Disable SysAuthControl
	SystemAuthControl *bool `pulumi:"systemAuthControl"`
	// Timeout for device EAPOL capabilities test in seconds - Range: `1`-`65535`
	TestTimeout *int `pulumi:"testTimeout"`
}

type Dot1xState struct {
	// Send EAPOL-Success on successful auth-fail Authorization
	AuthFailEapol pulumi.BoolPtrInput
	// Configure 802.1X credentials profiles
	Credentials Dot1xCredentialArrayInput
	// Block all EAPoL transaction on Critical Authentication
	CriticalEapolConfigBlock pulumi.BoolPtrInput
	// Set 802.1x Critical Authentication Recovery Delay period - Range: `1`-`10000`
	CriticalRecoveryDelay pulumi.IntPtrInput
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// Show verbose messages in system logs
	LoggingVerbose pulumi.BoolPtrInput
	// Controlled access is only applied during authentication
	SupplicantControlledTransient pulumi.BoolPtrInput
	// Force 802.1X supplicant to send multicast packets
	SupplicantForceMulticast pulumi.BoolPtrInput
	// Enable or Disable SysAuthControl
	SystemAuthControl pulumi.BoolPtrInput
	// Timeout for device EAPOL capabilities test in seconds - Range: `1`-`65535`
	TestTimeout pulumi.IntPtrInput
}

func (Dot1xState) ElementType() reflect.Type {
	return reflect.TypeOf((*dot1xState)(nil)).Elem()
}

type dot1xArgs struct {
	// Send EAPOL-Success on successful auth-fail Authorization
	AuthFailEapol *bool `pulumi:"authFailEapol"`
	// Configure 802.1X credentials profiles
	Credentials []Dot1xCredential `pulumi:"credentials"`
	// Block all EAPoL transaction on Critical Authentication
	CriticalEapolConfigBlock *bool `pulumi:"criticalEapolConfigBlock"`
	// Set 802.1x Critical Authentication Recovery Delay period - Range: `1`-`10000`
	CriticalRecoveryDelay *int `pulumi:"criticalRecoveryDelay"`
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode *string `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// Show verbose messages in system logs
	LoggingVerbose *bool `pulumi:"loggingVerbose"`
	// Controlled access is only applied during authentication
	SupplicantControlledTransient *bool `pulumi:"supplicantControlledTransient"`
	// Force 802.1X supplicant to send multicast packets
	SupplicantForceMulticast *bool `pulumi:"supplicantForceMulticast"`
	// Enable or Disable SysAuthControl
	SystemAuthControl *bool `pulumi:"systemAuthControl"`
	// Timeout for device EAPOL capabilities test in seconds - Range: `1`-`65535`
	TestTimeout *int `pulumi:"testTimeout"`
}

// The set of arguments for constructing a Dot1x resource.
type Dot1xArgs struct {
	// Send EAPOL-Success on successful auth-fail Authorization
	AuthFailEapol pulumi.BoolPtrInput
	// Configure 802.1X credentials profiles
	Credentials Dot1xCredentialArrayInput
	// Block all EAPoL transaction on Critical Authentication
	CriticalEapolConfigBlock pulumi.BoolPtrInput
	// Set 802.1x Critical Authentication Recovery Delay period - Range: `1`-`10000`
	CriticalRecoveryDelay pulumi.IntPtrInput
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// Show verbose messages in system logs
	LoggingVerbose pulumi.BoolPtrInput
	// Controlled access is only applied during authentication
	SupplicantControlledTransient pulumi.BoolPtrInput
	// Force 802.1X supplicant to send multicast packets
	SupplicantForceMulticast pulumi.BoolPtrInput
	// Enable or Disable SysAuthControl
	SystemAuthControl pulumi.BoolPtrInput
	// Timeout for device EAPOL capabilities test in seconds - Range: `1`-`65535`
	TestTimeout pulumi.IntPtrInput
}

func (Dot1xArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dot1xArgs)(nil)).Elem()
}

type Dot1xInput interface {
	pulumi.Input

	ToDot1xOutput() Dot1xOutput
	ToDot1xOutputWithContext(ctx context.Context) Dot1xOutput
}

func (*Dot1x) ElementType() reflect.Type {
	return reflect.TypeOf((**Dot1x)(nil)).Elem()
}

func (i *Dot1x) ToDot1xOutput() Dot1xOutput {
	return i.ToDot1xOutputWithContext(context.Background())
}

func (i *Dot1x) ToDot1xOutputWithContext(ctx context.Context) Dot1xOutput {
	return pulumi.ToOutputWithContext(ctx, i).(Dot1xOutput)
}

func (i *Dot1x) ToOutput(ctx context.Context) pulumix.Output[*Dot1x] {
	return pulumix.Output[*Dot1x]{
		OutputState: i.ToDot1xOutputWithContext(ctx).OutputState,
	}
}

// Dot1xArrayInput is an input type that accepts Dot1xArray and Dot1xArrayOutput values.
// You can construct a concrete instance of `Dot1xArrayInput` via:
//
//	Dot1xArray{ Dot1xArgs{...} }
type Dot1xArrayInput interface {
	pulumi.Input

	ToDot1xArrayOutput() Dot1xArrayOutput
	ToDot1xArrayOutputWithContext(context.Context) Dot1xArrayOutput
}

type Dot1xArray []Dot1xInput

func (Dot1xArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Dot1x)(nil)).Elem()
}

func (i Dot1xArray) ToDot1xArrayOutput() Dot1xArrayOutput {
	return i.ToDot1xArrayOutputWithContext(context.Background())
}

func (i Dot1xArray) ToDot1xArrayOutputWithContext(ctx context.Context) Dot1xArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(Dot1xArrayOutput)
}

func (i Dot1xArray) ToOutput(ctx context.Context) pulumix.Output[[]*Dot1x] {
	return pulumix.Output[[]*Dot1x]{
		OutputState: i.ToDot1xArrayOutputWithContext(ctx).OutputState,
	}
}

// Dot1xMapInput is an input type that accepts Dot1xMap and Dot1xMapOutput values.
// You can construct a concrete instance of `Dot1xMapInput` via:
//
//	Dot1xMap{ "key": Dot1xArgs{...} }
type Dot1xMapInput interface {
	pulumi.Input

	ToDot1xMapOutput() Dot1xMapOutput
	ToDot1xMapOutputWithContext(context.Context) Dot1xMapOutput
}

type Dot1xMap map[string]Dot1xInput

func (Dot1xMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Dot1x)(nil)).Elem()
}

func (i Dot1xMap) ToDot1xMapOutput() Dot1xMapOutput {
	return i.ToDot1xMapOutputWithContext(context.Background())
}

func (i Dot1xMap) ToDot1xMapOutputWithContext(ctx context.Context) Dot1xMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(Dot1xMapOutput)
}

func (i Dot1xMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Dot1x] {
	return pulumix.Output[map[string]*Dot1x]{
		OutputState: i.ToDot1xMapOutputWithContext(ctx).OutputState,
	}
}

type Dot1xOutput struct{ *pulumi.OutputState }

func (Dot1xOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Dot1x)(nil)).Elem()
}

func (o Dot1xOutput) ToDot1xOutput() Dot1xOutput {
	return o
}

func (o Dot1xOutput) ToDot1xOutputWithContext(ctx context.Context) Dot1xOutput {
	return o
}

func (o Dot1xOutput) ToOutput(ctx context.Context) pulumix.Output[*Dot1x] {
	return pulumix.Output[*Dot1x]{
		OutputState: o.OutputState,
	}
}

// Send EAPOL-Success on successful auth-fail Authorization
func (o Dot1xOutput) AuthFailEapol() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Dot1x) pulumi.BoolPtrOutput { return v.AuthFailEapol }).(pulumi.BoolPtrOutput)
}

// Configure 802.1X credentials profiles
func (o Dot1xOutput) Credentials() Dot1xCredentialArrayOutput {
	return o.ApplyT(func(v *Dot1x) Dot1xCredentialArrayOutput { return v.Credentials }).(Dot1xCredentialArrayOutput)
}

// Block all EAPoL transaction on Critical Authentication
func (o Dot1xOutput) CriticalEapolConfigBlock() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Dot1x) pulumi.BoolPtrOutput { return v.CriticalEapolConfigBlock }).(pulumi.BoolPtrOutput)
}

// Set 802.1x Critical Authentication Recovery Delay period - Range: `1`-`10000`
func (o Dot1xOutput) CriticalRecoveryDelay() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Dot1x) pulumi.IntPtrOutput { return v.CriticalRecoveryDelay }).(pulumi.IntPtrOutput)
}

// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
// Default value is `all`. - Choices: `all`, `attributes`
func (o Dot1xOutput) DeleteMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Dot1x) pulumi.StringPtrOutput { return v.DeleteMode }).(pulumi.StringPtrOutput)
}

// A device name from the provider configuration.
func (o Dot1xOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Dot1x) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

// Show verbose messages in system logs
func (o Dot1xOutput) LoggingVerbose() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Dot1x) pulumi.BoolPtrOutput { return v.LoggingVerbose }).(pulumi.BoolPtrOutput)
}

// Controlled access is only applied during authentication
func (o Dot1xOutput) SupplicantControlledTransient() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Dot1x) pulumi.BoolPtrOutput { return v.SupplicantControlledTransient }).(pulumi.BoolPtrOutput)
}

// Force 802.1X supplicant to send multicast packets
func (o Dot1xOutput) SupplicantForceMulticast() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Dot1x) pulumi.BoolPtrOutput { return v.SupplicantForceMulticast }).(pulumi.BoolPtrOutput)
}

// Enable or Disable SysAuthControl
func (o Dot1xOutput) SystemAuthControl() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Dot1x) pulumi.BoolPtrOutput { return v.SystemAuthControl }).(pulumi.BoolPtrOutput)
}

// Timeout for device EAPOL capabilities test in seconds - Range: `1`-`65535`
func (o Dot1xOutput) TestTimeout() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Dot1x) pulumi.IntPtrOutput { return v.TestTimeout }).(pulumi.IntPtrOutput)
}

type Dot1xArrayOutput struct{ *pulumi.OutputState }

func (Dot1xArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Dot1x)(nil)).Elem()
}

func (o Dot1xArrayOutput) ToDot1xArrayOutput() Dot1xArrayOutput {
	return o
}

func (o Dot1xArrayOutput) ToDot1xArrayOutputWithContext(ctx context.Context) Dot1xArrayOutput {
	return o
}

func (o Dot1xArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Dot1x] {
	return pulumix.Output[[]*Dot1x]{
		OutputState: o.OutputState,
	}
}

func (o Dot1xArrayOutput) Index(i pulumi.IntInput) Dot1xOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Dot1x {
		return vs[0].([]*Dot1x)[vs[1].(int)]
	}).(Dot1xOutput)
}

type Dot1xMapOutput struct{ *pulumi.OutputState }

func (Dot1xMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Dot1x)(nil)).Elem()
}

func (o Dot1xMapOutput) ToDot1xMapOutput() Dot1xMapOutput {
	return o
}

func (o Dot1xMapOutput) ToDot1xMapOutputWithContext(ctx context.Context) Dot1xMapOutput {
	return o
}

func (o Dot1xMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Dot1x] {
	return pulumix.Output[map[string]*Dot1x]{
		OutputState: o.OutputState,
	}
}

func (o Dot1xMapOutput) MapIndex(k pulumi.StringInput) Dot1xOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Dot1x {
		return vs[0].(map[string]*Dot1x)[vs[1].(string)]
	}).(Dot1xOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*Dot1xInput)(nil)).Elem(), &Dot1x{})
	pulumi.RegisterInputType(reflect.TypeOf((*Dot1xArrayInput)(nil)).Elem(), Dot1xArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*Dot1xMapInput)(nil)).Elem(), Dot1xMap{})
	pulumi.RegisterOutputType(Dot1xOutput{})
	pulumi.RegisterOutputType(Dot1xArrayOutput{})
	pulumi.RegisterOutputType(Dot1xMapOutput{})
}
