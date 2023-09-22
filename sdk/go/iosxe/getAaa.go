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

// This data source can read the AAA configuration.
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
//			_, err := iosxe.LookupAaa(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupAaa(ctx *pulumi.Context, args *LookupAaaArgs, opts ...pulumi.InvokeOption) (*LookupAaaResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAaaResult
	err := ctx.Invoke("iosxe:index/getAaa:getAaa", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAaa.
type LookupAaaArgs struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
}

// A collection of values returned by getAaa.
type LookupAaaResult struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// Radius server-group definition
	GroupServerRadii []GetAaaGroupServerRadius `pulumi:"groupServerRadii"`
	// Tacacs+ server-group definition
	GroupServerTacacspluses []GetAaaGroupServerTacacsplus `pulumi:"groupServerTacacspluses"`
	// The path of the retrieved object.
	Id string `pulumi:"id"`
	// Enable NEW access control commands and functions.(Disables OLD commands.)
	NewModel bool `pulumi:"newModel"`
	// Local server profile for RFC 3576 support
	ServerRadiusDynamicAuthor bool `pulumi:"serverRadiusDynamicAuthor"`
	// Specify a RADIUS client
	ServerRadiusDynamicAuthorClients []GetAaaServerRadiusDynamicAuthorClient `pulumi:"serverRadiusDynamicAuthorClients"`
	// AAA Session ID
	SessionId string `pulumi:"sessionId"`
}

func LookupAaaOutput(ctx *pulumi.Context, args LookupAaaOutputArgs, opts ...pulumi.InvokeOption) LookupAaaResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAaaResult, error) {
			args := v.(LookupAaaArgs)
			r, err := LookupAaa(ctx, &args, opts...)
			var s LookupAaaResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAaaResultOutput)
}

// A collection of arguments for invoking getAaa.
type LookupAaaOutputArgs struct {
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput `pulumi:"device"`
}

func (LookupAaaOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAaaArgs)(nil)).Elem()
}

// A collection of values returned by getAaa.
type LookupAaaResultOutput struct{ *pulumi.OutputState }

func (LookupAaaResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAaaResult)(nil)).Elem()
}

func (o LookupAaaResultOutput) ToLookupAaaResultOutput() LookupAaaResultOutput {
	return o
}

func (o LookupAaaResultOutput) ToLookupAaaResultOutputWithContext(ctx context.Context) LookupAaaResultOutput {
	return o
}

func (o LookupAaaResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupAaaResult] {
	return pulumix.Output[LookupAaaResult]{
		OutputState: o.OutputState,
	}
}

// A device name from the provider configuration.
func (o LookupAaaResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAaaResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// Radius server-group definition
func (o LookupAaaResultOutput) GroupServerRadii() GetAaaGroupServerRadiusArrayOutput {
	return o.ApplyT(func(v LookupAaaResult) []GetAaaGroupServerRadius { return v.GroupServerRadii }).(GetAaaGroupServerRadiusArrayOutput)
}

// Tacacs+ server-group definition
func (o LookupAaaResultOutput) GroupServerTacacspluses() GetAaaGroupServerTacacsplusArrayOutput {
	return o.ApplyT(func(v LookupAaaResult) []GetAaaGroupServerTacacsplus { return v.GroupServerTacacspluses }).(GetAaaGroupServerTacacsplusArrayOutput)
}

// The path of the retrieved object.
func (o LookupAaaResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAaaResult) string { return v.Id }).(pulumi.StringOutput)
}

// Enable NEW access control commands and functions.(Disables OLD commands.)
func (o LookupAaaResultOutput) NewModel() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAaaResult) bool { return v.NewModel }).(pulumi.BoolOutput)
}

// Local server profile for RFC 3576 support
func (o LookupAaaResultOutput) ServerRadiusDynamicAuthor() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAaaResult) bool { return v.ServerRadiusDynamicAuthor }).(pulumi.BoolOutput)
}

// Specify a RADIUS client
func (o LookupAaaResultOutput) ServerRadiusDynamicAuthorClients() GetAaaServerRadiusDynamicAuthorClientArrayOutput {
	return o.ApplyT(func(v LookupAaaResult) []GetAaaServerRadiusDynamicAuthorClient {
		return v.ServerRadiusDynamicAuthorClients
	}).(GetAaaServerRadiusDynamicAuthorClientArrayOutput)
}

// AAA Session ID
func (o LookupAaaResultOutput) SessionId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAaaResult) string { return v.SessionId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAaaResultOutput{})
}