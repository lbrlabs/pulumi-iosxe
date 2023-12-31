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

// This resource can manage the Logging IPv4 Host Transport configuration.
//
// ## Import
//
// ```sh
//
//	$ pulumi import iosxe:index/loggingIpv4HostTransport:LoggingIpv4HostTransport example "Cisco-IOS-XE-native:native/logging/host/ipv4-host-transport-list=2.2.2.2"
//
// ```
type LoggingIpv4HostTransport struct {
	pulumi.CustomResourceState

	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrOutput `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device   pulumi.StringPtrOutput `pulumi:"device"`
	Ipv4Host pulumi.StringOutput    `pulumi:"ipv4Host"`
	// Port Number List
	TransportTcpPorts LoggingIpv4HostTransportTransportTcpPortArrayOutput `pulumi:"transportTcpPorts"`
	// Port Number List
	TransportTlsPorts LoggingIpv4HostTransportTransportTlsPortArrayOutput `pulumi:"transportTlsPorts"`
	// Port Number List
	TransportUdpPorts LoggingIpv4HostTransportTransportUdpPortArrayOutput `pulumi:"transportUdpPorts"`
}

// NewLoggingIpv4HostTransport registers a new resource with the given unique name, arguments, and options.
func NewLoggingIpv4HostTransport(ctx *pulumi.Context,
	name string, args *LoggingIpv4HostTransportArgs, opts ...pulumi.ResourceOption) (*LoggingIpv4HostTransport, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Ipv4Host == nil {
		return nil, errors.New("invalid value for required argument 'Ipv4Host'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LoggingIpv4HostTransport
	err := ctx.RegisterResource("iosxe:index/loggingIpv4HostTransport:LoggingIpv4HostTransport", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoggingIpv4HostTransport gets an existing LoggingIpv4HostTransport resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoggingIpv4HostTransport(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoggingIpv4HostTransportState, opts ...pulumi.ResourceOption) (*LoggingIpv4HostTransport, error) {
	var resource LoggingIpv4HostTransport
	err := ctx.ReadResource("iosxe:index/loggingIpv4HostTransport:LoggingIpv4HostTransport", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoggingIpv4HostTransport resources.
type loggingIpv4HostTransportState struct {
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode *string `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device   *string `pulumi:"device"`
	Ipv4Host *string `pulumi:"ipv4Host"`
	// Port Number List
	TransportTcpPorts []LoggingIpv4HostTransportTransportTcpPort `pulumi:"transportTcpPorts"`
	// Port Number List
	TransportTlsPorts []LoggingIpv4HostTransportTransportTlsPort `pulumi:"transportTlsPorts"`
	// Port Number List
	TransportUdpPorts []LoggingIpv4HostTransportTransportUdpPort `pulumi:"transportUdpPorts"`
}

type LoggingIpv4HostTransportState struct {
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device   pulumi.StringPtrInput
	Ipv4Host pulumi.StringPtrInput
	// Port Number List
	TransportTcpPorts LoggingIpv4HostTransportTransportTcpPortArrayInput
	// Port Number List
	TransportTlsPorts LoggingIpv4HostTransportTransportTlsPortArrayInput
	// Port Number List
	TransportUdpPorts LoggingIpv4HostTransportTransportUdpPortArrayInput
}

func (LoggingIpv4HostTransportState) ElementType() reflect.Type {
	return reflect.TypeOf((*loggingIpv4HostTransportState)(nil)).Elem()
}

type loggingIpv4HostTransportArgs struct {
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode *string `pulumi:"deleteMode"`
	// A device name from the provider configuration.
	Device   *string `pulumi:"device"`
	Ipv4Host string  `pulumi:"ipv4Host"`
	// Port Number List
	TransportTcpPorts []LoggingIpv4HostTransportTransportTcpPort `pulumi:"transportTcpPorts"`
	// Port Number List
	TransportTlsPorts []LoggingIpv4HostTransportTransportTlsPort `pulumi:"transportTlsPorts"`
	// Port Number List
	TransportUdpPorts []LoggingIpv4HostTransportTransportUdpPort `pulumi:"transportUdpPorts"`
}

// The set of arguments for constructing a LoggingIpv4HostTransport resource.
type LoggingIpv4HostTransportArgs struct {
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device   pulumi.StringPtrInput
	Ipv4Host pulumi.StringInput
	// Port Number List
	TransportTcpPorts LoggingIpv4HostTransportTransportTcpPortArrayInput
	// Port Number List
	TransportTlsPorts LoggingIpv4HostTransportTransportTlsPortArrayInput
	// Port Number List
	TransportUdpPorts LoggingIpv4HostTransportTransportUdpPortArrayInput
}

func (LoggingIpv4HostTransportArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loggingIpv4HostTransportArgs)(nil)).Elem()
}

type LoggingIpv4HostTransportInput interface {
	pulumi.Input

	ToLoggingIpv4HostTransportOutput() LoggingIpv4HostTransportOutput
	ToLoggingIpv4HostTransportOutputWithContext(ctx context.Context) LoggingIpv4HostTransportOutput
}

func (*LoggingIpv4HostTransport) ElementType() reflect.Type {
	return reflect.TypeOf((**LoggingIpv4HostTransport)(nil)).Elem()
}

func (i *LoggingIpv4HostTransport) ToLoggingIpv4HostTransportOutput() LoggingIpv4HostTransportOutput {
	return i.ToLoggingIpv4HostTransportOutputWithContext(context.Background())
}

func (i *LoggingIpv4HostTransport) ToLoggingIpv4HostTransportOutputWithContext(ctx context.Context) LoggingIpv4HostTransportOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoggingIpv4HostTransportOutput)
}

func (i *LoggingIpv4HostTransport) ToOutput(ctx context.Context) pulumix.Output[*LoggingIpv4HostTransport] {
	return pulumix.Output[*LoggingIpv4HostTransport]{
		OutputState: i.ToLoggingIpv4HostTransportOutputWithContext(ctx).OutputState,
	}
}

// LoggingIpv4HostTransportArrayInput is an input type that accepts LoggingIpv4HostTransportArray and LoggingIpv4HostTransportArrayOutput values.
// You can construct a concrete instance of `LoggingIpv4HostTransportArrayInput` via:
//
//	LoggingIpv4HostTransportArray{ LoggingIpv4HostTransportArgs{...} }
type LoggingIpv4HostTransportArrayInput interface {
	pulumi.Input

	ToLoggingIpv4HostTransportArrayOutput() LoggingIpv4HostTransportArrayOutput
	ToLoggingIpv4HostTransportArrayOutputWithContext(context.Context) LoggingIpv4HostTransportArrayOutput
}

type LoggingIpv4HostTransportArray []LoggingIpv4HostTransportInput

func (LoggingIpv4HostTransportArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoggingIpv4HostTransport)(nil)).Elem()
}

func (i LoggingIpv4HostTransportArray) ToLoggingIpv4HostTransportArrayOutput() LoggingIpv4HostTransportArrayOutput {
	return i.ToLoggingIpv4HostTransportArrayOutputWithContext(context.Background())
}

func (i LoggingIpv4HostTransportArray) ToLoggingIpv4HostTransportArrayOutputWithContext(ctx context.Context) LoggingIpv4HostTransportArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoggingIpv4HostTransportArrayOutput)
}

func (i LoggingIpv4HostTransportArray) ToOutput(ctx context.Context) pulumix.Output[[]*LoggingIpv4HostTransport] {
	return pulumix.Output[[]*LoggingIpv4HostTransport]{
		OutputState: i.ToLoggingIpv4HostTransportArrayOutputWithContext(ctx).OutputState,
	}
}

// LoggingIpv4HostTransportMapInput is an input type that accepts LoggingIpv4HostTransportMap and LoggingIpv4HostTransportMapOutput values.
// You can construct a concrete instance of `LoggingIpv4HostTransportMapInput` via:
//
//	LoggingIpv4HostTransportMap{ "key": LoggingIpv4HostTransportArgs{...} }
type LoggingIpv4HostTransportMapInput interface {
	pulumi.Input

	ToLoggingIpv4HostTransportMapOutput() LoggingIpv4HostTransportMapOutput
	ToLoggingIpv4HostTransportMapOutputWithContext(context.Context) LoggingIpv4HostTransportMapOutput
}

type LoggingIpv4HostTransportMap map[string]LoggingIpv4HostTransportInput

func (LoggingIpv4HostTransportMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoggingIpv4HostTransport)(nil)).Elem()
}

func (i LoggingIpv4HostTransportMap) ToLoggingIpv4HostTransportMapOutput() LoggingIpv4HostTransportMapOutput {
	return i.ToLoggingIpv4HostTransportMapOutputWithContext(context.Background())
}

func (i LoggingIpv4HostTransportMap) ToLoggingIpv4HostTransportMapOutputWithContext(ctx context.Context) LoggingIpv4HostTransportMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoggingIpv4HostTransportMapOutput)
}

func (i LoggingIpv4HostTransportMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*LoggingIpv4HostTransport] {
	return pulumix.Output[map[string]*LoggingIpv4HostTransport]{
		OutputState: i.ToLoggingIpv4HostTransportMapOutputWithContext(ctx).OutputState,
	}
}

type LoggingIpv4HostTransportOutput struct{ *pulumi.OutputState }

func (LoggingIpv4HostTransportOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LoggingIpv4HostTransport)(nil)).Elem()
}

func (o LoggingIpv4HostTransportOutput) ToLoggingIpv4HostTransportOutput() LoggingIpv4HostTransportOutput {
	return o
}

func (o LoggingIpv4HostTransportOutput) ToLoggingIpv4HostTransportOutputWithContext(ctx context.Context) LoggingIpv4HostTransportOutput {
	return o
}

func (o LoggingIpv4HostTransportOutput) ToOutput(ctx context.Context) pulumix.Output[*LoggingIpv4HostTransport] {
	return pulumix.Output[*LoggingIpv4HostTransport]{
		OutputState: o.OutputState,
	}
}

// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
// Default value is `all`. - Choices: `all`, `attributes`
func (o LoggingIpv4HostTransportOutput) DeleteMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LoggingIpv4HostTransport) pulumi.StringPtrOutput { return v.DeleteMode }).(pulumi.StringPtrOutput)
}

// A device name from the provider configuration.
func (o LoggingIpv4HostTransportOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LoggingIpv4HostTransport) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

func (o LoggingIpv4HostTransportOutput) Ipv4Host() pulumi.StringOutput {
	return o.ApplyT(func(v *LoggingIpv4HostTransport) pulumi.StringOutput { return v.Ipv4Host }).(pulumi.StringOutput)
}

// Port Number List
func (o LoggingIpv4HostTransportOutput) TransportTcpPorts() LoggingIpv4HostTransportTransportTcpPortArrayOutput {
	return o.ApplyT(func(v *LoggingIpv4HostTransport) LoggingIpv4HostTransportTransportTcpPortArrayOutput {
		return v.TransportTcpPorts
	}).(LoggingIpv4HostTransportTransportTcpPortArrayOutput)
}

// Port Number List
func (o LoggingIpv4HostTransportOutput) TransportTlsPorts() LoggingIpv4HostTransportTransportTlsPortArrayOutput {
	return o.ApplyT(func(v *LoggingIpv4HostTransport) LoggingIpv4HostTransportTransportTlsPortArrayOutput {
		return v.TransportTlsPorts
	}).(LoggingIpv4HostTransportTransportTlsPortArrayOutput)
}

// Port Number List
func (o LoggingIpv4HostTransportOutput) TransportUdpPorts() LoggingIpv4HostTransportTransportUdpPortArrayOutput {
	return o.ApplyT(func(v *LoggingIpv4HostTransport) LoggingIpv4HostTransportTransportUdpPortArrayOutput {
		return v.TransportUdpPorts
	}).(LoggingIpv4HostTransportTransportUdpPortArrayOutput)
}

type LoggingIpv4HostTransportArrayOutput struct{ *pulumi.OutputState }

func (LoggingIpv4HostTransportArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoggingIpv4HostTransport)(nil)).Elem()
}

func (o LoggingIpv4HostTransportArrayOutput) ToLoggingIpv4HostTransportArrayOutput() LoggingIpv4HostTransportArrayOutput {
	return o
}

func (o LoggingIpv4HostTransportArrayOutput) ToLoggingIpv4HostTransportArrayOutputWithContext(ctx context.Context) LoggingIpv4HostTransportArrayOutput {
	return o
}

func (o LoggingIpv4HostTransportArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*LoggingIpv4HostTransport] {
	return pulumix.Output[[]*LoggingIpv4HostTransport]{
		OutputState: o.OutputState,
	}
}

func (o LoggingIpv4HostTransportArrayOutput) Index(i pulumi.IntInput) LoggingIpv4HostTransportOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LoggingIpv4HostTransport {
		return vs[0].([]*LoggingIpv4HostTransport)[vs[1].(int)]
	}).(LoggingIpv4HostTransportOutput)
}

type LoggingIpv4HostTransportMapOutput struct{ *pulumi.OutputState }

func (LoggingIpv4HostTransportMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoggingIpv4HostTransport)(nil)).Elem()
}

func (o LoggingIpv4HostTransportMapOutput) ToLoggingIpv4HostTransportMapOutput() LoggingIpv4HostTransportMapOutput {
	return o
}

func (o LoggingIpv4HostTransportMapOutput) ToLoggingIpv4HostTransportMapOutputWithContext(ctx context.Context) LoggingIpv4HostTransportMapOutput {
	return o
}

func (o LoggingIpv4HostTransportMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*LoggingIpv4HostTransport] {
	return pulumix.Output[map[string]*LoggingIpv4HostTransport]{
		OutputState: o.OutputState,
	}
}

func (o LoggingIpv4HostTransportMapOutput) MapIndex(k pulumi.StringInput) LoggingIpv4HostTransportOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LoggingIpv4HostTransport {
		return vs[0].(map[string]*LoggingIpv4HostTransport)[vs[1].(string)]
	}).(LoggingIpv4HostTransportOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LoggingIpv4HostTransportInput)(nil)).Elem(), &LoggingIpv4HostTransport{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoggingIpv4HostTransportArrayInput)(nil)).Elem(), LoggingIpv4HostTransportArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoggingIpv4HostTransportMapInput)(nil)).Elem(), LoggingIpv4HostTransportMap{})
	pulumi.RegisterOutputType(LoggingIpv4HostTransportOutput{})
	pulumi.RegisterOutputType(LoggingIpv4HostTransportArrayOutput{})
	pulumi.RegisterOutputType(LoggingIpv4HostTransportMapOutput{})
}
