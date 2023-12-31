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

// This data source can read the BGP Neighbor configuration.
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
//			_, err := iosxe.LookupBgpNeighbor(ctx, &iosxe.LookupBgpNeighborArgs{
//				Asn: "65000",
//				Ip:  "3.3.3.3",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupBgpNeighbor(ctx *pulumi.Context, args *LookupBgpNeighborArgs, opts ...pulumi.InvokeOption) (*LookupBgpNeighborResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupBgpNeighborResult
	err := ctx.Invoke("iosxe:index/getBgpNeighbor:getBgpNeighbor", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBgpNeighbor.
type LookupBgpNeighborArgs struct {
	Asn string `pulumi:"asn"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	Ip     string  `pulumi:"ip"`
}

// A collection of values returned by getBgpNeighbor.
type LookupBgpNeighborResult struct {
	Asn       string `pulumi:"asn"`
	ClusterId string `pulumi:"clusterId"`
	// Neighbor specific description
	Description string `pulumi:"description"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// one-hop away EBGP peer using loopback address
	DisableConnectedCheck bool `pulumi:"disableConnectedCheck"`
	// Allow EBGP neighbors not on directly connected networks. For single-hop ebgp peers, delete ebgp-multihop directly.
	EbgpMultihop       bool `pulumi:"ebgpMultihop"`
	EbgpMultihopMaxHop int  `pulumi:"ebgpMultihopMaxHop"`
	// Retrieve control plane dependent failure info from BFD for BGP GR/NSR operation
	FallOverBfdCheckControlPlaneFailure bool `pulumi:"fallOverBfdCheckControlPlaneFailure"`
	// Force BFD multi-hop to detect failure
	FallOverBfdMultiHop bool `pulumi:"fallOverBfdMultiHop"`
	// Force BFD single-hop to detect failure
	FallOverBfdSingleHop bool `pulumi:"fallOverBfdSingleHop"`
	// Enable BFD strict-mode
	FallOverBfdStrictMode         bool   `pulumi:"fallOverBfdStrictMode"`
	FallOverDefaultEnable         bool   `pulumi:"fallOverDefaultEnable"`
	FallOverDefaultRouteMap       string `pulumi:"fallOverDefaultRouteMap"`
	FallOverMaximumMetricRouteMap string `pulumi:"fallOverMaximumMetricRouteMap"`
	// The path of the retrieved object.
	Id      string `pulumi:"id"`
	Ip      string `pulumi:"ip"`
	LocalAs string `pulumi:"localAs"`
	// Accept either real AS or local AS from the ebgp peer
	LocalAsDualAs bool `pulumi:"localAsDualAs"`
	// Do not prepend local-as to updates from ebgp peers
	LocalAsNoPrepend bool `pulumi:"localAsNoPrepend"`
	// Replace real AS with local AS in the EBGP updates
	LocalAsReplaceAs bool `pulumi:"localAsReplaceAs"`
	// Log neighbor up/down and reset reason
	LogNeighborChanges bool   `pulumi:"logNeighborChanges"`
	Password           string `pulumi:"password"`
	// Encryption type (0 to disable encryption, 7 for proprietary)
	PasswordType int `pulumi:"passwordType"`
	// Specify a BGP peer-group remote-as
	RemoteAs string `pulumi:"remoteAs"`
	// Administratively shut down this neighbor
	Shutdown                  bool `pulumi:"shutdown"`
	TimersHoldtime            int  `pulumi:"timersHoldtime"`
	TimersKeepaliveInterval   int  `pulumi:"timersKeepaliveInterval"`
	TimersMinimumNeighborHold int  `pulumi:"timersMinimumNeighborHold"`
	// IP hops
	TtlSecurityHops int `pulumi:"ttlSecurityHops"`
	// Loopback interface
	UpdateSourceLoopback string `pulumi:"updateSourceLoopback"`
	// Set the BGP version to match a neighbor
	Version int `pulumi:"version"`
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
	Asn pulumi.StringInput `pulumi:"asn"`
	// A device name from the provider configuration.
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

// Neighbor specific description
func (o LookupBgpNeighborResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) string { return v.Description }).(pulumi.StringOutput)
}

// A device name from the provider configuration.
func (o LookupBgpNeighborResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// one-hop away EBGP peer using loopback address
func (o LookupBgpNeighborResultOutput) DisableConnectedCheck() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) bool { return v.DisableConnectedCheck }).(pulumi.BoolOutput)
}

// Allow EBGP neighbors not on directly connected networks. For single-hop ebgp peers, delete ebgp-multihop directly.
func (o LookupBgpNeighborResultOutput) EbgpMultihop() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) bool { return v.EbgpMultihop }).(pulumi.BoolOutput)
}

func (o LookupBgpNeighborResultOutput) EbgpMultihopMaxHop() pulumi.IntOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) int { return v.EbgpMultihopMaxHop }).(pulumi.IntOutput)
}

// Retrieve control plane dependent failure info from BFD for BGP GR/NSR operation
func (o LookupBgpNeighborResultOutput) FallOverBfdCheckControlPlaneFailure() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) bool { return v.FallOverBfdCheckControlPlaneFailure }).(pulumi.BoolOutput)
}

// Force BFD multi-hop to detect failure
func (o LookupBgpNeighborResultOutput) FallOverBfdMultiHop() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) bool { return v.FallOverBfdMultiHop }).(pulumi.BoolOutput)
}

// Force BFD single-hop to detect failure
func (o LookupBgpNeighborResultOutput) FallOverBfdSingleHop() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) bool { return v.FallOverBfdSingleHop }).(pulumi.BoolOutput)
}

// Enable BFD strict-mode
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

// The path of the retrieved object.
func (o LookupBgpNeighborResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupBgpNeighborResultOutput) Ip() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) string { return v.Ip }).(pulumi.StringOutput)
}

func (o LookupBgpNeighborResultOutput) LocalAs() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) string { return v.LocalAs }).(pulumi.StringOutput)
}

// Accept either real AS or local AS from the ebgp peer
func (o LookupBgpNeighborResultOutput) LocalAsDualAs() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) bool { return v.LocalAsDualAs }).(pulumi.BoolOutput)
}

// Do not prepend local-as to updates from ebgp peers
func (o LookupBgpNeighborResultOutput) LocalAsNoPrepend() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) bool { return v.LocalAsNoPrepend }).(pulumi.BoolOutput)
}

// Replace real AS with local AS in the EBGP updates
func (o LookupBgpNeighborResultOutput) LocalAsReplaceAs() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) bool { return v.LocalAsReplaceAs }).(pulumi.BoolOutput)
}

// Log neighbor up/down and reset reason
func (o LookupBgpNeighborResultOutput) LogNeighborChanges() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) bool { return v.LogNeighborChanges }).(pulumi.BoolOutput)
}

func (o LookupBgpNeighborResultOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) string { return v.Password }).(pulumi.StringOutput)
}

// Encryption type (0 to disable encryption, 7 for proprietary)
func (o LookupBgpNeighborResultOutput) PasswordType() pulumi.IntOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) int { return v.PasswordType }).(pulumi.IntOutput)
}

// Specify a BGP peer-group remote-as
func (o LookupBgpNeighborResultOutput) RemoteAs() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) string { return v.RemoteAs }).(pulumi.StringOutput)
}

// Administratively shut down this neighbor
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

// IP hops
func (o LookupBgpNeighborResultOutput) TtlSecurityHops() pulumi.IntOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) int { return v.TtlSecurityHops }).(pulumi.IntOutput)
}

// Loopback interface
func (o LookupBgpNeighborResultOutput) UpdateSourceLoopback() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) string { return v.UpdateSourceLoopback }).(pulumi.StringOutput)
}

// Set the BGP version to match a neighbor
func (o LookupBgpNeighborResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupBgpNeighborResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupBgpNeighborResultOutput{})
}
