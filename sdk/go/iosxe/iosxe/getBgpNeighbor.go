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

func LookupBgpNeighbor(ctx *pulumi.Context, args *LookupBgpNeighborArgs, opts ...pulumi.InvokeOption) (*LookupBgpNeighborResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupBgpNeighborResult
	err := ctx.Invoke("iosxe:iosxe/getBgpNeighbor:getBgpNeighbor", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBgpNeighbor.
type LookupBgpNeighborArgs struct {
	Asn    string  `pulumi:"asn"`
	Device *string `pulumi:"device"`
	Ip     string  `pulumi:"ip"`
}

// A collection of values returned by getBgpNeighbor.
type LookupBgpNeighborResult struct {
	Asn                                 string  `pulumi:"asn"`
	ClusterId                           string  `pulumi:"clusterId"`
	Description                         string  `pulumi:"description"`
	Device                              *string `pulumi:"device"`
	DisableConnectedCheck               bool    `pulumi:"disableConnectedCheck"`
	EbgpMultihop                        bool    `pulumi:"ebgpMultihop"`
	EbgpMultihopMaxHop                  int     `pulumi:"ebgpMultihopMaxHop"`
	FallOverBfdCheckControlPlaneFailure bool    `pulumi:"fallOverBfdCheckControlPlaneFailure"`
	FallOverBfdMultiHop                 bool    `pulumi:"fallOverBfdMultiHop"`
	FallOverBfdSingleHop                bool    `pulumi:"fallOverBfdSingleHop"`
	FallOverBfdStrictMode               bool    `pulumi:"fallOverBfdStrictMode"`
	FallOverDefaultEnable               bool    `pulumi:"fallOverDefaultEnable"`
	FallOverDefaultRouteMap             string  `pulumi:"fallOverDefaultRouteMap"`
	FallOverMaximumMetricRouteMap       string  `pulumi:"fallOverMaximumMetricRouteMap"`
	Id                                  string  `pulumi:"id"`
	Ip                                  string  `pulumi:"ip"`
	LocalAs                             string  `pulumi:"localAs"`
	LocalAsDualAs                       bool    `pulumi:"localAsDualAs"`
	LocalAsNoPrepend                    bool    `pulumi:"localAsNoPrepend"`
	LocalAsReplaceAs                    bool    `pulumi:"localAsReplaceAs"`
	LogNeighborChanges                  bool    `pulumi:"logNeighborChanges"`
	Password                            string  `pulumi:"password"`
	PasswordType                        int     `pulumi:"passwordType"`
	RemoteAs                            string  `pulumi:"remoteAs"`
	Shutdown                            bool    `pulumi:"shutdown"`
	TimersHoldtime                      int     `pulumi:"timersHoldtime"`
	TimersKeepaliveInterval             int     `pulumi:"timersKeepaliveInterval"`
	TimersMinimumNeighborHold           int     `pulumi:"timersMinimumNeighborHold"`
	TtlSecurityHops                     int     `pulumi:"ttlSecurityHops"`
	UpdateSourceLoopback                string  `pulumi:"updateSourceLoopback"`
	Version                             int     `pulumi:"version"`
}

func LookupBgpNeighborOutput(ctx *pulumi.Context, args LookupBgpNeighborOutputArgs, opts ...pulumi.InvokeOption) LookupBgpNeighborResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupBgpNeighborResult, error) {
			args := v.(LookupBgpNeighborArgs)
			r, err := LookupBgpNeighbor(ctx, &args, opts...)
			var s LookupBgpNeighborResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupBgpNeighborResultOutput)
}

// A collection of arguments for invoking getBgpNeighbor.
type LookupBgpNeighborOutputArgs struct {
	Asn    pulumi.StringInput    `pulumi:"asn"`
	Device pulumi.StringPtrInput `pulumi:"device"`
	Ip     pulumi.StringInput    `pulumi:"ip"`
}

func (LookupBgpNeighborOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBgpNeighborArgs)(nil)).Elem()
}

// A collection of values returned by getBgpNeighbor.
type LookupBgpNeighborResultOutput struct{ *pulumi.OutputState }

func (LookupBgpNeighborResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBgpNeighborResult)(nil)).Elem()
}

func (o LookupBgpNeighborResultOutput) ToLookupBgpNeighborResultOutput() LookupBgpNeighborResultOutput {
	return o
}

func (o LookupBgpNeighborResultOutput) ToLookupBgpNeighborResultOutputWithContext(ctx context.Context) LookupBgpNeighborResultOutput {
	return o
}

func (o LookupBgpNeighborResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupBgpNeighborResult] {
	return pulumix.Output[LookupBgpNeighborResult]{
		OutputState: o.OutputState,
	}
}

func (o LookupBgpNeighborResultOutput) Asn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) string { return v.Asn }).(pulumi.StringOutput)
}

func (o LookupBgpNeighborResultOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) string { return v.ClusterId }).(pulumi.StringOutput)
}

func (o LookupBgpNeighborResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupBgpNeighborResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

func (o LookupBgpNeighborResultOutput) DisableConnectedCheck() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) bool { return v.DisableConnectedCheck }).(pulumi.BoolOutput)
}

func (o LookupBgpNeighborResultOutput) EbgpMultihop() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) bool { return v.EbgpMultihop }).(pulumi.BoolOutput)
}

func (o LookupBgpNeighborResultOutput) EbgpMultihopMaxHop() pulumi.IntOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) int { return v.EbgpMultihopMaxHop }).(pulumi.IntOutput)
}

func (o LookupBgpNeighborResultOutput) FallOverBfdCheckControlPlaneFailure() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) bool { return v.FallOverBfdCheckControlPlaneFailure }).(pulumi.BoolOutput)
}

func (o LookupBgpNeighborResultOutput) FallOverBfdMultiHop() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) bool { return v.FallOverBfdMultiHop }).(pulumi.BoolOutput)
}

func (o LookupBgpNeighborResultOutput) FallOverBfdSingleHop() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) bool { return v.FallOverBfdSingleHop }).(pulumi.BoolOutput)
}

func (o LookupBgpNeighborResultOutput) FallOverBfdStrictMode() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) bool { return v.FallOverBfdStrictMode }).(pulumi.BoolOutput)
}

func (o LookupBgpNeighborResultOutput) FallOverDefaultEnable() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) bool { return v.FallOverDefaultEnable }).(pulumi.BoolOutput)
}

func (o LookupBgpNeighborResultOutput) FallOverDefaultRouteMap() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) string { return v.FallOverDefaultRouteMap }).(pulumi.StringOutput)
}

func (o LookupBgpNeighborResultOutput) FallOverMaximumMetricRouteMap() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) string { return v.FallOverMaximumMetricRouteMap }).(pulumi.StringOutput)
}

func (o LookupBgpNeighborResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupBgpNeighborResultOutput) Ip() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) string { return v.Ip }).(pulumi.StringOutput)
}

func (o LookupBgpNeighborResultOutput) LocalAs() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) string { return v.LocalAs }).(pulumi.StringOutput)
}

func (o LookupBgpNeighborResultOutput) LocalAsDualAs() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) bool { return v.LocalAsDualAs }).(pulumi.BoolOutput)
}

func (o LookupBgpNeighborResultOutput) LocalAsNoPrepend() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) bool { return v.LocalAsNoPrepend }).(pulumi.BoolOutput)
}

func (o LookupBgpNeighborResultOutput) LocalAsReplaceAs() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) bool { return v.LocalAsReplaceAs }).(pulumi.BoolOutput)
}

func (o LookupBgpNeighborResultOutput) LogNeighborChanges() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) bool { return v.LogNeighborChanges }).(pulumi.BoolOutput)
}

func (o LookupBgpNeighborResultOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) string { return v.Password }).(pulumi.StringOutput)
}

func (o LookupBgpNeighborResultOutput) PasswordType() pulumi.IntOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) int { return v.PasswordType }).(pulumi.IntOutput)
}

func (o LookupBgpNeighborResultOutput) RemoteAs() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) string { return v.RemoteAs }).(pulumi.StringOutput)
}

func (o LookupBgpNeighborResultOutput) Shutdown() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) bool { return v.Shutdown }).(pulumi.BoolOutput)
}

func (o LookupBgpNeighborResultOutput) TimersHoldtime() pulumi.IntOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) int { return v.TimersHoldtime }).(pulumi.IntOutput)
}

func (o LookupBgpNeighborResultOutput) TimersKeepaliveInterval() pulumi.IntOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) int { return v.TimersKeepaliveInterval }).(pulumi.IntOutput)
}

func (o LookupBgpNeighborResultOutput) TimersMinimumNeighborHold() pulumi.IntOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) int { return v.TimersMinimumNeighborHold }).(pulumi.IntOutput)
}

func (o LookupBgpNeighborResultOutput) TtlSecurityHops() pulumi.IntOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) int { return v.TtlSecurityHops }).(pulumi.IntOutput)
}

func (o LookupBgpNeighborResultOutput) UpdateSourceLoopback() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) string { return v.UpdateSourceLoopback }).(pulumi.StringOutput)
}

func (o LookupBgpNeighborResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupBgpNeighborResultOutput{})
}
