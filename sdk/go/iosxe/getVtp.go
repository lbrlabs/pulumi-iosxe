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

// This data source can read the VTP configuration.
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
//			_, err := iosxe.LookupVtp(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupVtp(ctx *pulumi.Context, args *LookupVtpArgs, opts ...pulumi.InvokeOption) (*LookupVtpResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupVtpResult
	err := ctx.Invoke("iosxe:index/getVtp:getVtp", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVtp.
type LookupVtpArgs struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
}

// A collection of values returned by getVtp.
type LookupVtpResult struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// Set the name of the VTP administrative domain.
	Domain string `pulumi:"domain"`
	// Configure IFS filesystem file where VTP configuration is stored.
	File string `pulumi:"file"`
	// The path of the retrieved object.
	Id string `pulumi:"id"`
	// The name of the interface providing the VTP updater ID for this device
	Interface string `pulumi:"interface"`
	// Use only this interface's IP address as the VTP IP updater address
	InterfaceOnly bool `pulumi:"interfaceOnly"`
	// Set the mode for MST VTP instance
	ModeClientMst bool `pulumi:"modeClientMst"`
	// Set the mode for unknown VTP instances
	ModeClientUnknown bool `pulumi:"modeClientUnknown"`
	// Set the mode for VLAN VTP instance
	ModeClientVlan bool `pulumi:"modeClientVlan"`
	// Set the mode for MST VTP instance
	ModeOffMst bool `pulumi:"modeOffMst"`
	// Set the mode for unknown VTP instances
	ModeOffUnknown bool `pulumi:"modeOffUnknown"`
	// Set the mode for VLAN VTP instance
	ModeOffVlan bool `pulumi:"modeOffVlan"`
	// Set the mode for MST VTP instance
	ModeServerMst bool `pulumi:"modeServerMst"`
	// Set the mode for unknown VTP instances
	ModeServerUnknown bool `pulumi:"modeServerUnknown"`
	// Set the mode for VLAN VTP instance
	ModeServerVlan bool `pulumi:"modeServerVlan"`
	// Set the mode for MST VTP instance
	ModeTransparentMst bool `pulumi:"modeTransparentMst"`
	// Set the mode for unknown VTP instances
	ModeTransparentUnknown bool `pulumi:"modeTransparentUnknown"`
	// Set the mode for VLAN VTP instance
	ModeTransparentVlan bool `pulumi:"modeTransparentVlan"`
	// The ascii password for the VTP administrative domain
	Password string `pulumi:"password"`
	// Set the VTP password hidden option
	PasswordHidden bool `pulumi:"passwordHidden"`
	// Specify the vtp password in encrypted form
	PasswordSecret bool `pulumi:"passwordSecret"`
	// Set the administrative domain to permit pruning
	Pruning bool `pulumi:"pruning"`
	// Set the administrative domain to VTP version
	Version int `pulumi:"version"`
}

func LookupVtpOutput(ctx *pulumi.Context, args LookupVtpOutputArgs, opts ...pulumi.InvokeOption) LookupVtpResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupVtpResult, error) {
			args := v.(LookupVtpArgs)
			r, err := LookupVtp(ctx, &args, opts...)
			var s LookupVtpResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupVtpResultOutput)
}

// A collection of arguments for invoking getVtp.
type LookupVtpOutputArgs struct {
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput `pulumi:"device"`
}

func (LookupVtpOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVtpArgs)(nil)).Elem()
}

// A collection of values returned by getVtp.
type LookupVtpResultOutput struct{ *pulumi.OutputState }

func (LookupVtpResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVtpResult)(nil)).Elem()
}

func (o LookupVtpResultOutput) ToLookupVtpResultOutput() LookupVtpResultOutput {
	return o
}

func (o LookupVtpResultOutput) ToLookupVtpResultOutputWithContext(ctx context.Context) LookupVtpResultOutput {
	return o
}

func (o LookupVtpResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupVtpResult] {
	return pulumix.Output[LookupVtpResult]{
		OutputState: o.OutputState,
	}
}

// A device name from the provider configuration.
func (o LookupVtpResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupVtpResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// Set the name of the VTP administrative domain.
func (o LookupVtpResultOutput) Domain() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVtpResult) string { return v.Domain }).(pulumi.StringOutput)
}

// Configure IFS filesystem file where VTP configuration is stored.
func (o LookupVtpResultOutput) File() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVtpResult) string { return v.File }).(pulumi.StringOutput)
}

// The path of the retrieved object.
func (o LookupVtpResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVtpResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the interface providing the VTP updater ID for this device
func (o LookupVtpResultOutput) Interface() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVtpResult) string { return v.Interface }).(pulumi.StringOutput)
}

// Use only this interface's IP address as the VTP IP updater address
func (o LookupVtpResultOutput) InterfaceOnly() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupVtpResult) bool { return v.InterfaceOnly }).(pulumi.BoolOutput)
}

// Set the mode for MST VTP instance
func (o LookupVtpResultOutput) ModeClientMst() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupVtpResult) bool { return v.ModeClientMst }).(pulumi.BoolOutput)
}

// Set the mode for unknown VTP instances
func (o LookupVtpResultOutput) ModeClientUnknown() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupVtpResult) bool { return v.ModeClientUnknown }).(pulumi.BoolOutput)
}

// Set the mode for VLAN VTP instance
func (o LookupVtpResultOutput) ModeClientVlan() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupVtpResult) bool { return v.ModeClientVlan }).(pulumi.BoolOutput)
}

// Set the mode for MST VTP instance
func (o LookupVtpResultOutput) ModeOffMst() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupVtpResult) bool { return v.ModeOffMst }).(pulumi.BoolOutput)
}

// Set the mode for unknown VTP instances
func (o LookupVtpResultOutput) ModeOffUnknown() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupVtpResult) bool { return v.ModeOffUnknown }).(pulumi.BoolOutput)
}

// Set the mode for VLAN VTP instance
func (o LookupVtpResultOutput) ModeOffVlan() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupVtpResult) bool { return v.ModeOffVlan }).(pulumi.BoolOutput)
}

// Set the mode for MST VTP instance
func (o LookupVtpResultOutput) ModeServerMst() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupVtpResult) bool { return v.ModeServerMst }).(pulumi.BoolOutput)
}

// Set the mode for unknown VTP instances
func (o LookupVtpResultOutput) ModeServerUnknown() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupVtpResult) bool { return v.ModeServerUnknown }).(pulumi.BoolOutput)
}

// Set the mode for VLAN VTP instance
func (o LookupVtpResultOutput) ModeServerVlan() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupVtpResult) bool { return v.ModeServerVlan }).(pulumi.BoolOutput)
}

// Set the mode for MST VTP instance
func (o LookupVtpResultOutput) ModeTransparentMst() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupVtpResult) bool { return v.ModeTransparentMst }).(pulumi.BoolOutput)
}

// Set the mode for unknown VTP instances
func (o LookupVtpResultOutput) ModeTransparentUnknown() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupVtpResult) bool { return v.ModeTransparentUnknown }).(pulumi.BoolOutput)
}

// Set the mode for VLAN VTP instance
func (o LookupVtpResultOutput) ModeTransparentVlan() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupVtpResult) bool { return v.ModeTransparentVlan }).(pulumi.BoolOutput)
}

// The ascii password for the VTP administrative domain
func (o LookupVtpResultOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVtpResult) string { return v.Password }).(pulumi.StringOutput)
}

// Set the VTP password hidden option
func (o LookupVtpResultOutput) PasswordHidden() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupVtpResult) bool { return v.PasswordHidden }).(pulumi.BoolOutput)
}

// Specify the vtp password in encrypted form
func (o LookupVtpResultOutput) PasswordSecret() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupVtpResult) bool { return v.PasswordSecret }).(pulumi.BoolOutput)
}

// Set the administrative domain to permit pruning
func (o LookupVtpResultOutput) Pruning() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupVtpResult) bool { return v.Pruning }).(pulumi.BoolOutput)
}

// Set the administrative domain to VTP version
func (o LookupVtpResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupVtpResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupVtpResultOutput{})
}
