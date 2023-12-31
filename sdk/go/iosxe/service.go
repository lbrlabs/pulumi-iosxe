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

// This resource can manage the Service configuration.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-iosxe/sdk/go/iosxe"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := iosxe.NewService(ctx, "example", &iosxe.ServiceArgs{
//				CallHome:                            pulumi.Bool(true),
//				CompressConfig:                      pulumi.Bool(true),
//				Dhcp:                                pulumi.Bool(true),
//				Pad:                                 pulumi.Bool(true),
//				PasswordEncryption:                  pulumi.Bool(true),
//				PasswordRecovery:                    pulumi.Bool(true),
//				SequenceNumbers:                     pulumi.Bool(true),
//				TcpKeepalivesIn:                     pulumi.Bool(true),
//				TcpKeepalivesOut:                    pulumi.Bool(true),
//				Timestamps:                          pulumi.Bool(true),
//				TimestampsDebug:                     pulumi.Bool(true),
//				TimestampsDebugDatetime:             pulumi.Bool(true),
//				TimestampsDebugDatetimeLocaltime:    pulumi.Bool(true),
//				TimestampsDebugDatetimeMsec:         pulumi.Bool(true),
//				TimestampsDebugDatetimeShowTimezone: pulumi.Bool(true),
//				TimestampsDebugDatetimeYear:         pulumi.Bool(true),
//				TimestampsDebugUptime:               pulumi.Bool(true),
//				TimestampsLog:                       pulumi.Bool(true),
//				TimestampsLogDatetime:               pulumi.Bool(true),
//				TimestampsLogDatetimeLocaltime:      pulumi.Bool(true),
//				TimestampsLogDatetimeMsec:           pulumi.Bool(true),
//				TimestampsLogDatetimeShowTimezone:   pulumi.Bool(true),
//				TimestampsLogDatetimeYear:           pulumi.Bool(true),
//				TimestampsLogUptime:                 pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
//
//	$ pulumi import iosxe:index/service:Service example "Cisco-IOS-XE-native:native/service"
//
// ```
type Service struct {
	pulumi.CustomResourceState

	// Enable call-home service
	CallHome pulumi.BoolPtrOutput `pulumi:"callHome"`
	// Compress the configuration file
	CompressConfig pulumi.BoolPtrOutput `pulumi:"compressConfig"`
	// A device name from the provider configuration.
	Device pulumi.StringPtrOutput `pulumi:"device"`
	// Enable DHCP server and relay agent
	Dhcp pulumi.BoolPtrOutput `pulumi:"dhcp"`
	// Enable PAD commands
	Pad pulumi.BoolPtrOutput `pulumi:"pad"`
	// Encrypt system passwords
	PasswordEncryption pulumi.BoolPtrOutput `pulumi:"passwordEncryption"`
	// Enable password recovery
	PasswordRecovery pulumi.BoolPtrOutput `pulumi:"passwordRecovery"`
	// Stamp logger messages with a sequence number
	SequenceNumbers pulumi.BoolPtrOutput `pulumi:"sequenceNumbers"`
	// Generate keepalives on idle incoming network connections
	TcpKeepalivesIn pulumi.BoolPtrOutput `pulumi:"tcpKeepalivesIn"`
	// Generate keepalives on idle outgoing network connections
	TcpKeepalivesOut pulumi.BoolPtrOutput `pulumi:"tcpKeepalivesOut"`
	// Timestamp debug/log messages
	Timestamps pulumi.BoolPtrOutput `pulumi:"timestamps"`
	// Timestamp debug messages
	TimestampsDebug pulumi.BoolPtrOutput `pulumi:"timestampsDebug"`
	// Timestamp with date and time
	TimestampsDebugDatetime pulumi.BoolPtrOutput `pulumi:"timestampsDebugDatetime"`
	// Use local time zone for timestamps
	TimestampsDebugDatetimeLocaltime pulumi.BoolPtrOutput `pulumi:"timestampsDebugDatetimeLocaltime"`
	// Include milliseconds in timestamp
	TimestampsDebugDatetimeMsec pulumi.BoolPtrOutput `pulumi:"timestampsDebugDatetimeMsec"`
	// Add time zone information to timestamp
	TimestampsDebugDatetimeShowTimezone pulumi.BoolPtrOutput `pulumi:"timestampsDebugDatetimeShowTimezone"`
	// Include year in timestamp
	TimestampsDebugDatetimeYear pulumi.BoolPtrOutput `pulumi:"timestampsDebugDatetimeYear"`
	// Timestamp with system uptime
	TimestampsDebugUptime pulumi.BoolPtrOutput `pulumi:"timestampsDebugUptime"`
	// Timestamp log messages
	TimestampsLog pulumi.BoolPtrOutput `pulumi:"timestampsLog"`
	// Timestamp with date and time
	TimestampsLogDatetime pulumi.BoolPtrOutput `pulumi:"timestampsLogDatetime"`
	// Use local time zone for timestamps
	TimestampsLogDatetimeLocaltime pulumi.BoolPtrOutput `pulumi:"timestampsLogDatetimeLocaltime"`
	// Include milliseconds in timestamp
	TimestampsLogDatetimeMsec pulumi.BoolPtrOutput `pulumi:"timestampsLogDatetimeMsec"`
	// Add time zone information to timestamp
	TimestampsLogDatetimeShowTimezone pulumi.BoolPtrOutput `pulumi:"timestampsLogDatetimeShowTimezone"`
	// Include year in timestamp
	TimestampsLogDatetimeYear pulumi.BoolPtrOutput `pulumi:"timestampsLogDatetimeYear"`
	// Timestamp with system uptime
	TimestampsLogUptime pulumi.BoolPtrOutput `pulumi:"timestampsLogUptime"`
}

// NewService registers a new resource with the given unique name, arguments, and options.
func NewService(ctx *pulumi.Context,
	name string, args *ServiceArgs, opts ...pulumi.ResourceOption) (*Service, error) {
	if args == nil {
		args = &ServiceArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Service
	err := ctx.RegisterResource("iosxe:index/service:Service", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetService gets an existing Service resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetService(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceState, opts ...pulumi.ResourceOption) (*Service, error) {
	var resource Service
	err := ctx.ReadResource("iosxe:index/service:Service", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Service resources.
type serviceState struct {
	// Enable call-home service
	CallHome *bool `pulumi:"callHome"`
	// Compress the configuration file
	CompressConfig *bool `pulumi:"compressConfig"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// Enable DHCP server and relay agent
	Dhcp *bool `pulumi:"dhcp"`
	// Enable PAD commands
	Pad *bool `pulumi:"pad"`
	// Encrypt system passwords
	PasswordEncryption *bool `pulumi:"passwordEncryption"`
	// Enable password recovery
	PasswordRecovery *bool `pulumi:"passwordRecovery"`
	// Stamp logger messages with a sequence number
	SequenceNumbers *bool `pulumi:"sequenceNumbers"`
	// Generate keepalives on idle incoming network connections
	TcpKeepalivesIn *bool `pulumi:"tcpKeepalivesIn"`
	// Generate keepalives on idle outgoing network connections
	TcpKeepalivesOut *bool `pulumi:"tcpKeepalivesOut"`
	// Timestamp debug/log messages
	Timestamps *bool `pulumi:"timestamps"`
	// Timestamp debug messages
	TimestampsDebug *bool `pulumi:"timestampsDebug"`
	// Timestamp with date and time
	TimestampsDebugDatetime *bool `pulumi:"timestampsDebugDatetime"`
	// Use local time zone for timestamps
	TimestampsDebugDatetimeLocaltime *bool `pulumi:"timestampsDebugDatetimeLocaltime"`
	// Include milliseconds in timestamp
	TimestampsDebugDatetimeMsec *bool `pulumi:"timestampsDebugDatetimeMsec"`
	// Add time zone information to timestamp
	TimestampsDebugDatetimeShowTimezone *bool `pulumi:"timestampsDebugDatetimeShowTimezone"`
	// Include year in timestamp
	TimestampsDebugDatetimeYear *bool `pulumi:"timestampsDebugDatetimeYear"`
	// Timestamp with system uptime
	TimestampsDebugUptime *bool `pulumi:"timestampsDebugUptime"`
	// Timestamp log messages
	TimestampsLog *bool `pulumi:"timestampsLog"`
	// Timestamp with date and time
	TimestampsLogDatetime *bool `pulumi:"timestampsLogDatetime"`
	// Use local time zone for timestamps
	TimestampsLogDatetimeLocaltime *bool `pulumi:"timestampsLogDatetimeLocaltime"`
	// Include milliseconds in timestamp
	TimestampsLogDatetimeMsec *bool `pulumi:"timestampsLogDatetimeMsec"`
	// Add time zone information to timestamp
	TimestampsLogDatetimeShowTimezone *bool `pulumi:"timestampsLogDatetimeShowTimezone"`
	// Include year in timestamp
	TimestampsLogDatetimeYear *bool `pulumi:"timestampsLogDatetimeYear"`
	// Timestamp with system uptime
	TimestampsLogUptime *bool `pulumi:"timestampsLogUptime"`
}

type ServiceState struct {
	// Enable call-home service
	CallHome pulumi.BoolPtrInput
	// Compress the configuration file
	CompressConfig pulumi.BoolPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// Enable DHCP server and relay agent
	Dhcp pulumi.BoolPtrInput
	// Enable PAD commands
	Pad pulumi.BoolPtrInput
	// Encrypt system passwords
	PasswordEncryption pulumi.BoolPtrInput
	// Enable password recovery
	PasswordRecovery pulumi.BoolPtrInput
	// Stamp logger messages with a sequence number
	SequenceNumbers pulumi.BoolPtrInput
	// Generate keepalives on idle incoming network connections
	TcpKeepalivesIn pulumi.BoolPtrInput
	// Generate keepalives on idle outgoing network connections
	TcpKeepalivesOut pulumi.BoolPtrInput
	// Timestamp debug/log messages
	Timestamps pulumi.BoolPtrInput
	// Timestamp debug messages
	TimestampsDebug pulumi.BoolPtrInput
	// Timestamp with date and time
	TimestampsDebugDatetime pulumi.BoolPtrInput
	// Use local time zone for timestamps
	TimestampsDebugDatetimeLocaltime pulumi.BoolPtrInput
	// Include milliseconds in timestamp
	TimestampsDebugDatetimeMsec pulumi.BoolPtrInput
	// Add time zone information to timestamp
	TimestampsDebugDatetimeShowTimezone pulumi.BoolPtrInput
	// Include year in timestamp
	TimestampsDebugDatetimeYear pulumi.BoolPtrInput
	// Timestamp with system uptime
	TimestampsDebugUptime pulumi.BoolPtrInput
	// Timestamp log messages
	TimestampsLog pulumi.BoolPtrInput
	// Timestamp with date and time
	TimestampsLogDatetime pulumi.BoolPtrInput
	// Use local time zone for timestamps
	TimestampsLogDatetimeLocaltime pulumi.BoolPtrInput
	// Include milliseconds in timestamp
	TimestampsLogDatetimeMsec pulumi.BoolPtrInput
	// Add time zone information to timestamp
	TimestampsLogDatetimeShowTimezone pulumi.BoolPtrInput
	// Include year in timestamp
	TimestampsLogDatetimeYear pulumi.BoolPtrInput
	// Timestamp with system uptime
	TimestampsLogUptime pulumi.BoolPtrInput
}

func (ServiceState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceState)(nil)).Elem()
}

type serviceArgs struct {
	// Enable call-home service
	CallHome *bool `pulumi:"callHome"`
	// Compress the configuration file
	CompressConfig *bool `pulumi:"compressConfig"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// Enable DHCP server and relay agent
	Dhcp *bool `pulumi:"dhcp"`
	// Enable PAD commands
	Pad *bool `pulumi:"pad"`
	// Encrypt system passwords
	PasswordEncryption *bool `pulumi:"passwordEncryption"`
	// Enable password recovery
	PasswordRecovery *bool `pulumi:"passwordRecovery"`
	// Stamp logger messages with a sequence number
	SequenceNumbers *bool `pulumi:"sequenceNumbers"`
	// Generate keepalives on idle incoming network connections
	TcpKeepalivesIn *bool `pulumi:"tcpKeepalivesIn"`
	// Generate keepalives on idle outgoing network connections
	TcpKeepalivesOut *bool `pulumi:"tcpKeepalivesOut"`
	// Timestamp debug/log messages
	Timestamps *bool `pulumi:"timestamps"`
	// Timestamp debug messages
	TimestampsDebug *bool `pulumi:"timestampsDebug"`
	// Timestamp with date and time
	TimestampsDebugDatetime *bool `pulumi:"timestampsDebugDatetime"`
	// Use local time zone for timestamps
	TimestampsDebugDatetimeLocaltime *bool `pulumi:"timestampsDebugDatetimeLocaltime"`
	// Include milliseconds in timestamp
	TimestampsDebugDatetimeMsec *bool `pulumi:"timestampsDebugDatetimeMsec"`
	// Add time zone information to timestamp
	TimestampsDebugDatetimeShowTimezone *bool `pulumi:"timestampsDebugDatetimeShowTimezone"`
	// Include year in timestamp
	TimestampsDebugDatetimeYear *bool `pulumi:"timestampsDebugDatetimeYear"`
	// Timestamp with system uptime
	TimestampsDebugUptime *bool `pulumi:"timestampsDebugUptime"`
	// Timestamp log messages
	TimestampsLog *bool `pulumi:"timestampsLog"`
	// Timestamp with date and time
	TimestampsLogDatetime *bool `pulumi:"timestampsLogDatetime"`
	// Use local time zone for timestamps
	TimestampsLogDatetimeLocaltime *bool `pulumi:"timestampsLogDatetimeLocaltime"`
	// Include milliseconds in timestamp
	TimestampsLogDatetimeMsec *bool `pulumi:"timestampsLogDatetimeMsec"`
	// Add time zone information to timestamp
	TimestampsLogDatetimeShowTimezone *bool `pulumi:"timestampsLogDatetimeShowTimezone"`
	// Include year in timestamp
	TimestampsLogDatetimeYear *bool `pulumi:"timestampsLogDatetimeYear"`
	// Timestamp with system uptime
	TimestampsLogUptime *bool `pulumi:"timestampsLogUptime"`
}

// The set of arguments for constructing a Service resource.
type ServiceArgs struct {
	// Enable call-home service
	CallHome pulumi.BoolPtrInput
	// Compress the configuration file
	CompressConfig pulumi.BoolPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// Enable DHCP server and relay agent
	Dhcp pulumi.BoolPtrInput
	// Enable PAD commands
	Pad pulumi.BoolPtrInput
	// Encrypt system passwords
	PasswordEncryption pulumi.BoolPtrInput
	// Enable password recovery
	PasswordRecovery pulumi.BoolPtrInput
	// Stamp logger messages with a sequence number
	SequenceNumbers pulumi.BoolPtrInput
	// Generate keepalives on idle incoming network connections
	TcpKeepalivesIn pulumi.BoolPtrInput
	// Generate keepalives on idle outgoing network connections
	TcpKeepalivesOut pulumi.BoolPtrInput
	// Timestamp debug/log messages
	Timestamps pulumi.BoolPtrInput
	// Timestamp debug messages
	TimestampsDebug pulumi.BoolPtrInput
	// Timestamp with date and time
	TimestampsDebugDatetime pulumi.BoolPtrInput
	// Use local time zone for timestamps
	TimestampsDebugDatetimeLocaltime pulumi.BoolPtrInput
	// Include milliseconds in timestamp
	TimestampsDebugDatetimeMsec pulumi.BoolPtrInput
	// Add time zone information to timestamp
	TimestampsDebugDatetimeShowTimezone pulumi.BoolPtrInput
	// Include year in timestamp
	TimestampsDebugDatetimeYear pulumi.BoolPtrInput
	// Timestamp with system uptime
	TimestampsDebugUptime pulumi.BoolPtrInput
	// Timestamp log messages
	TimestampsLog pulumi.BoolPtrInput
	// Timestamp with date and time
	TimestampsLogDatetime pulumi.BoolPtrInput
	// Use local time zone for timestamps
	TimestampsLogDatetimeLocaltime pulumi.BoolPtrInput
	// Include milliseconds in timestamp
	TimestampsLogDatetimeMsec pulumi.BoolPtrInput
	// Add time zone information to timestamp
	TimestampsLogDatetimeShowTimezone pulumi.BoolPtrInput
	// Include year in timestamp
	TimestampsLogDatetimeYear pulumi.BoolPtrInput
	// Timestamp with system uptime
	TimestampsLogUptime pulumi.BoolPtrInput
}

func (ServiceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceArgs)(nil)).Elem()
}

type ServiceInput interface {
	pulumi.Input

	ToServiceOutput() ServiceOutput
	ToServiceOutputWithContext(ctx context.Context) ServiceOutput
}

func (*Service) ElementType() reflect.Type {
	return reflect.TypeOf((**Service)(nil)).Elem()
}

func (i *Service) ToServiceOutput() ServiceOutput {
	return i.ToServiceOutputWithContext(context.Background())
}

func (i *Service) ToServiceOutputWithContext(ctx context.Context) ServiceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceOutput)
}

func (i *Service) ToOutput(ctx context.Context) pulumix.Output[*Service] {
	return pulumix.Output[*Service]{
		OutputState: i.ToServiceOutputWithContext(ctx).OutputState,
	}
}

// ServiceArrayInput is an input type that accepts ServiceArray and ServiceArrayOutput values.
// You can construct a concrete instance of `ServiceArrayInput` via:
//
//	ServiceArray{ ServiceArgs{...} }
type ServiceArrayInput interface {
	pulumi.Input

	ToServiceArrayOutput() ServiceArrayOutput
	ToServiceArrayOutputWithContext(context.Context) ServiceArrayOutput
}

type ServiceArray []ServiceInput

func (ServiceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Service)(nil)).Elem()
}

func (i ServiceArray) ToServiceArrayOutput() ServiceArrayOutput {
	return i.ToServiceArrayOutputWithContext(context.Background())
}

func (i ServiceArray) ToServiceArrayOutputWithContext(ctx context.Context) ServiceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceArrayOutput)
}

func (i ServiceArray) ToOutput(ctx context.Context) pulumix.Output[[]*Service] {
	return pulumix.Output[[]*Service]{
		OutputState: i.ToServiceArrayOutputWithContext(ctx).OutputState,
	}
}

// ServiceMapInput is an input type that accepts ServiceMap and ServiceMapOutput values.
// You can construct a concrete instance of `ServiceMapInput` via:
//
//	ServiceMap{ "key": ServiceArgs{...} }
type ServiceMapInput interface {
	pulumi.Input

	ToServiceMapOutput() ServiceMapOutput
	ToServiceMapOutputWithContext(context.Context) ServiceMapOutput
}

type ServiceMap map[string]ServiceInput

func (ServiceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Service)(nil)).Elem()
}

func (i ServiceMap) ToServiceMapOutput() ServiceMapOutput {
	return i.ToServiceMapOutputWithContext(context.Background())
}

func (i ServiceMap) ToServiceMapOutputWithContext(ctx context.Context) ServiceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceMapOutput)
}

func (i ServiceMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Service] {
	return pulumix.Output[map[string]*Service]{
		OutputState: i.ToServiceMapOutputWithContext(ctx).OutputState,
	}
}

type ServiceOutput struct{ *pulumi.OutputState }

func (ServiceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Service)(nil)).Elem()
}

func (o ServiceOutput) ToServiceOutput() ServiceOutput {
	return o
}

func (o ServiceOutput) ToServiceOutputWithContext(ctx context.Context) ServiceOutput {
	return o
}

func (o ServiceOutput) ToOutput(ctx context.Context) pulumix.Output[*Service] {
	return pulumix.Output[*Service]{
		OutputState: o.OutputState,
	}
}

// Enable call-home service
func (o ServiceOutput) CallHome() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolPtrOutput { return v.CallHome }).(pulumi.BoolPtrOutput)
}

// Compress the configuration file
func (o ServiceOutput) CompressConfig() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolPtrOutput { return v.CompressConfig }).(pulumi.BoolPtrOutput)
}

// A device name from the provider configuration.
func (o ServiceOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

// Enable DHCP server and relay agent
func (o ServiceOutput) Dhcp() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolPtrOutput { return v.Dhcp }).(pulumi.BoolPtrOutput)
}

// Enable PAD commands
func (o ServiceOutput) Pad() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolPtrOutput { return v.Pad }).(pulumi.BoolPtrOutput)
}

// Encrypt system passwords
func (o ServiceOutput) PasswordEncryption() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolPtrOutput { return v.PasswordEncryption }).(pulumi.BoolPtrOutput)
}

// Enable password recovery
func (o ServiceOutput) PasswordRecovery() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolPtrOutput { return v.PasswordRecovery }).(pulumi.BoolPtrOutput)
}

// Stamp logger messages with a sequence number
func (o ServiceOutput) SequenceNumbers() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolPtrOutput { return v.SequenceNumbers }).(pulumi.BoolPtrOutput)
}

// Generate keepalives on idle incoming network connections
func (o ServiceOutput) TcpKeepalivesIn() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolPtrOutput { return v.TcpKeepalivesIn }).(pulumi.BoolPtrOutput)
}

// Generate keepalives on idle outgoing network connections
func (o ServiceOutput) TcpKeepalivesOut() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolPtrOutput { return v.TcpKeepalivesOut }).(pulumi.BoolPtrOutput)
}

// Timestamp debug/log messages
func (o ServiceOutput) Timestamps() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolPtrOutput { return v.Timestamps }).(pulumi.BoolPtrOutput)
}

// Timestamp debug messages
func (o ServiceOutput) TimestampsDebug() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolPtrOutput { return v.TimestampsDebug }).(pulumi.BoolPtrOutput)
}

// Timestamp with date and time
func (o ServiceOutput) TimestampsDebugDatetime() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolPtrOutput { return v.TimestampsDebugDatetime }).(pulumi.BoolPtrOutput)
}

// Use local time zone for timestamps
func (o ServiceOutput) TimestampsDebugDatetimeLocaltime() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolPtrOutput { return v.TimestampsDebugDatetimeLocaltime }).(pulumi.BoolPtrOutput)
}

// Include milliseconds in timestamp
func (o ServiceOutput) TimestampsDebugDatetimeMsec() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolPtrOutput { return v.TimestampsDebugDatetimeMsec }).(pulumi.BoolPtrOutput)
}

// Add time zone information to timestamp
func (o ServiceOutput) TimestampsDebugDatetimeShowTimezone() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolPtrOutput { return v.TimestampsDebugDatetimeShowTimezone }).(pulumi.BoolPtrOutput)
}

// Include year in timestamp
func (o ServiceOutput) TimestampsDebugDatetimeYear() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolPtrOutput { return v.TimestampsDebugDatetimeYear }).(pulumi.BoolPtrOutput)
}

// Timestamp with system uptime
func (o ServiceOutput) TimestampsDebugUptime() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolPtrOutput { return v.TimestampsDebugUptime }).(pulumi.BoolPtrOutput)
}

// Timestamp log messages
func (o ServiceOutput) TimestampsLog() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolPtrOutput { return v.TimestampsLog }).(pulumi.BoolPtrOutput)
}

// Timestamp with date and time
func (o ServiceOutput) TimestampsLogDatetime() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolPtrOutput { return v.TimestampsLogDatetime }).(pulumi.BoolPtrOutput)
}

// Use local time zone for timestamps
func (o ServiceOutput) TimestampsLogDatetimeLocaltime() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolPtrOutput { return v.TimestampsLogDatetimeLocaltime }).(pulumi.BoolPtrOutput)
}

// Include milliseconds in timestamp
func (o ServiceOutput) TimestampsLogDatetimeMsec() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolPtrOutput { return v.TimestampsLogDatetimeMsec }).(pulumi.BoolPtrOutput)
}

// Add time zone information to timestamp
func (o ServiceOutput) TimestampsLogDatetimeShowTimezone() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolPtrOutput { return v.TimestampsLogDatetimeShowTimezone }).(pulumi.BoolPtrOutput)
}

// Include year in timestamp
func (o ServiceOutput) TimestampsLogDatetimeYear() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolPtrOutput { return v.TimestampsLogDatetimeYear }).(pulumi.BoolPtrOutput)
}

// Timestamp with system uptime
func (o ServiceOutput) TimestampsLogUptime() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolPtrOutput { return v.TimestampsLogUptime }).(pulumi.BoolPtrOutput)
}

type ServiceArrayOutput struct{ *pulumi.OutputState }

func (ServiceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Service)(nil)).Elem()
}

func (o ServiceArrayOutput) ToServiceArrayOutput() ServiceArrayOutput {
	return o
}

func (o ServiceArrayOutput) ToServiceArrayOutputWithContext(ctx context.Context) ServiceArrayOutput {
	return o
}

func (o ServiceArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Service] {
	return pulumix.Output[[]*Service]{
		OutputState: o.OutputState,
	}
}

func (o ServiceArrayOutput) Index(i pulumi.IntInput) ServiceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Service {
		return vs[0].([]*Service)[vs[1].(int)]
	}).(ServiceOutput)
}

type ServiceMapOutput struct{ *pulumi.OutputState }

func (ServiceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Service)(nil)).Elem()
}

func (o ServiceMapOutput) ToServiceMapOutput() ServiceMapOutput {
	return o
}

func (o ServiceMapOutput) ToServiceMapOutputWithContext(ctx context.Context) ServiceMapOutput {
	return o
}

func (o ServiceMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Service] {
	return pulumix.Output[map[string]*Service]{
		OutputState: o.OutputState,
	}
}

func (o ServiceMapOutput) MapIndex(k pulumi.StringInput) ServiceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Service {
		return vs[0].(map[string]*Service)[vs[1].(string)]
	}).(ServiceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceInput)(nil)).Elem(), &Service{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceArrayInput)(nil)).Elem(), ServiceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceMapInput)(nil)).Elem(), ServiceMap{})
	pulumi.RegisterOutputType(ServiceOutput{})
	pulumi.RegisterOutputType(ServiceArrayOutput{})
	pulumi.RegisterOutputType(ServiceMapOutput{})
}
