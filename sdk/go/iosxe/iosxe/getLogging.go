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

func LookupLogging(ctx *pulumi.Context, args *LookupLoggingArgs, opts ...pulumi.InvokeOption) (*LookupLoggingResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupLoggingResult
	err := ctx.Invoke("iosxe:iosxe/getLogging:getLogging", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLogging.
type LookupLoggingArgs struct {
	Device *string `pulumi:"device"`
}

// A collection of values returned by getLogging.
type LookupLoggingResult struct {
	BufferedSeverity      string                          `pulumi:"bufferedSeverity"`
	BufferedSize          int                             `pulumi:"bufferedSize"`
	ConsoleSeverity       string                          `pulumi:"consoleSeverity"`
	Device                *string                         `pulumi:"device"`
	Facility              string                          `pulumi:"facility"`
	FileMaxSize           int                             `pulumi:"fileMaxSize"`
	FileMinSize           int                             `pulumi:"fileMinSize"`
	FileName              string                          `pulumi:"fileName"`
	FileSeverity          string                          `pulumi:"fileSeverity"`
	HistorySeverity       string                          `pulumi:"historySeverity"`
	HistorySize           int                             `pulumi:"historySize"`
	Id                    string                          `pulumi:"id"`
	Ipv4Hosts             []GetLoggingIpv4Host            `pulumi:"ipv4Hosts"`
	Ipv4VrfHosts          []GetLoggingIpv4VrfHost         `pulumi:"ipv4VrfHosts"`
	Ipv6Hosts             []GetLoggingIpv6Host            `pulumi:"ipv6Hosts"`
	Ipv6VrfHosts          []GetLoggingIpv6VrfHost         `pulumi:"ipv6VrfHosts"`
	MonitorSeverity       string                          `pulumi:"monitorSeverity"`
	OriginIdName          string                          `pulumi:"originIdName"`
	OriginIdType          string                          `pulumi:"originIdType"`
	SourceInterface       string                          `pulumi:"sourceInterface"`
	SourceInterfacesVrves []GetLoggingSourceInterfacesVrf `pulumi:"sourceInterfacesVrves"`
	Trap                  bool                            `pulumi:"trap"`
	TrapSeverity          string                          `pulumi:"trapSeverity"`
}

func LookupLoggingOutput(ctx *pulumi.Context, args LookupLoggingOutputArgs, opts ...pulumi.InvokeOption) LookupLoggingResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupLoggingResult, error) {
			args := v.(LookupLoggingArgs)
			r, err := LookupLogging(ctx, &args, opts...)
			var s LookupLoggingResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupLoggingResultOutput)
}

// A collection of arguments for invoking getLogging.
type LookupLoggingOutputArgs struct {
	Device pulumi.StringPtrInput `pulumi:"device"`
}

func (LookupLoggingOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLoggingArgs)(nil)).Elem()
}

// A collection of values returned by getLogging.
type LookupLoggingResultOutput struct{ *pulumi.OutputState }

func (LookupLoggingResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLoggingResult)(nil)).Elem()
}

func (o LookupLoggingResultOutput) ToLookupLoggingResultOutput() LookupLoggingResultOutput {
	return o
}

func (o LookupLoggingResultOutput) ToLookupLoggingResultOutputWithContext(ctx context.Context) LookupLoggingResultOutput {
	return o
}

func (o LookupLoggingResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupLoggingResult] {
	return pulumix.Output[LookupLoggingResult]{
		OutputState: o.OutputState,
	}
}

func (o LookupLoggingResultOutput) BufferedSeverity() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoggingResult) string { return v.BufferedSeverity }).(pulumi.StringOutput)
}

func (o LookupLoggingResultOutput) BufferedSize() pulumi.IntOutput {
	return o.ApplyT(func(v LookupLoggingResult) int { return v.BufferedSize }).(pulumi.IntOutput)
}

func (o LookupLoggingResultOutput) ConsoleSeverity() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoggingResult) string { return v.ConsoleSeverity }).(pulumi.StringOutput)
}

func (o LookupLoggingResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupLoggingResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

func (o LookupLoggingResultOutput) Facility() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoggingResult) string { return v.Facility }).(pulumi.StringOutput)
}

func (o LookupLoggingResultOutput) FileMaxSize() pulumi.IntOutput {
	return o.ApplyT(func(v LookupLoggingResult) int { return v.FileMaxSize }).(pulumi.IntOutput)
}

func (o LookupLoggingResultOutput) FileMinSize() pulumi.IntOutput {
	return o.ApplyT(func(v LookupLoggingResult) int { return v.FileMinSize }).(pulumi.IntOutput)
}

func (o LookupLoggingResultOutput) FileName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoggingResult) string { return v.FileName }).(pulumi.StringOutput)
}

func (o LookupLoggingResultOutput) FileSeverity() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoggingResult) string { return v.FileSeverity }).(pulumi.StringOutput)
}

func (o LookupLoggingResultOutput) HistorySeverity() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoggingResult) string { return v.HistorySeverity }).(pulumi.StringOutput)
}

func (o LookupLoggingResultOutput) HistorySize() pulumi.IntOutput {
	return o.ApplyT(func(v LookupLoggingResult) int { return v.HistorySize }).(pulumi.IntOutput)
}

func (o LookupLoggingResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoggingResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupLoggingResultOutput) Ipv4Hosts() GetLoggingIpv4HostArrayOutput {
	return o.ApplyT(func(v LookupLoggingResult) []GetLoggingIpv4Host { return v.Ipv4Hosts }).(GetLoggingIpv4HostArrayOutput)
}

func (o LookupLoggingResultOutput) Ipv4VrfHosts() GetLoggingIpv4VrfHostArrayOutput {
	return o.ApplyT(func(v LookupLoggingResult) []GetLoggingIpv4VrfHost { return v.Ipv4VrfHosts }).(GetLoggingIpv4VrfHostArrayOutput)
}

func (o LookupLoggingResultOutput) Ipv6Hosts() GetLoggingIpv6HostArrayOutput {
	return o.ApplyT(func(v LookupLoggingResult) []GetLoggingIpv6Host { return v.Ipv6Hosts }).(GetLoggingIpv6HostArrayOutput)
}

func (o LookupLoggingResultOutput) Ipv6VrfHosts() GetLoggingIpv6VrfHostArrayOutput {
	return o.ApplyT(func(v LookupLoggingResult) []GetLoggingIpv6VrfHost { return v.Ipv6VrfHosts }).(GetLoggingIpv6VrfHostArrayOutput)
}

func (o LookupLoggingResultOutput) MonitorSeverity() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoggingResult) string { return v.MonitorSeverity }).(pulumi.StringOutput)
}

func (o LookupLoggingResultOutput) OriginIdName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoggingResult) string { return v.OriginIdName }).(pulumi.StringOutput)
}

func (o LookupLoggingResultOutput) OriginIdType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoggingResult) string { return v.OriginIdType }).(pulumi.StringOutput)
}

func (o LookupLoggingResultOutput) SourceInterface() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoggingResult) string { return v.SourceInterface }).(pulumi.StringOutput)
}

func (o LookupLoggingResultOutput) SourceInterfacesVrves() GetLoggingSourceInterfacesVrfArrayOutput {
	return o.ApplyT(func(v LookupLoggingResult) []GetLoggingSourceInterfacesVrf { return v.SourceInterfacesVrves }).(GetLoggingSourceInterfacesVrfArrayOutput)
}

func (o LookupLoggingResultOutput) Trap() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupLoggingResult) bool { return v.Trap }).(pulumi.BoolOutput)
}

func (o LookupLoggingResultOutput) TrapSeverity() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoggingResult) string { return v.TrapSeverity }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupLoggingResultOutput{})
}