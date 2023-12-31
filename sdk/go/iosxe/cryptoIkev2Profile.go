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

// This resource can manage the Crypto IKEv2 Profile configuration.
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
//			_, err := iosxe.NewCryptoIkev2Profile(ctx, "example", &iosxe.CryptoIkev2ProfileArgs{
//				AuthenticationLocalPreShare:  pulumi.Bool(true),
//				AuthenticationRemotePreShare: pulumi.Bool(true),
//				ConfigExchangeRequest:        pulumi.Bool(false),
//				Description:                  pulumi.String("My description"),
//				DpdInterval:                  pulumi.Int(10),
//				DpdQuery:                     pulumi.String("periodic"),
//				DpdRetry:                     pulumi.Int(2),
//				IdentityLocalKeyId:           pulumi.String("key1"),
//				KeyringLocal:                 pulumi.String("test"),
//				MatchAddressLocalIp:          pulumi.String("1.2.3.4"),
//				MatchFvrfAny:                 pulumi.Bool(true),
//				MatchIdentityRemoteIpv4Addresses: iosxe.CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArray{
//					&iosxe.CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArgs{
//						Address: pulumi.String("1.2.3.4"),
//						Mask:    pulumi.String("255.255.255.0"),
//					},
//				},
//				MatchIdentityRemoteKeys: pulumi.StringArray{
//					pulumi.String("key1"),
//				},
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
//	$ pulumi import iosxe:index/cryptoIkev2Profile:CryptoIkev2Profile example "Cisco-IOS-XE-native:native/crypto/Cisco-IOS-XE-crypto:ikev2/profile=profile1"
//
// ```
type CryptoIkev2Profile struct {
	pulumi.CustomResourceState

	// Pre-Shared Key
	AuthenticationLocalPreShare pulumi.BoolPtrOutput `pulumi:"authenticationLocalPreShare"`
	// Pre-Shared Key
	AuthenticationRemotePreShare pulumi.BoolPtrOutput `pulumi:"authenticationRemotePreShare"`
	// enable config-exchange request
	ConfigExchangeRequest pulumi.BoolPtrOutput `pulumi:"configExchangeRequest"`
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrOutput `pulumi:"deleteMode"`
	// Specify a description of this profile
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// A device name from the provider configuration.
	Device pulumi.StringPtrOutput `pulumi:"device"`
	// - Range: `10`-`3600`
	DpdInterval pulumi.IntPtrOutput `pulumi:"dpdInterval"`
	// - Choices: `on-demand`, `periodic`
	DpdQuery pulumi.StringPtrOutput `pulumi:"dpdQuery"`
	// - Range: `2`-`60`
	DpdRetry pulumi.IntPtrOutput `pulumi:"dpdRetry"`
	// address
	IdentityLocalAddress pulumi.StringPtrOutput `pulumi:"identityLocalAddress"`
	// key-id opaque string - proprietary types of identification key-id string
	IdentityLocalKeyId pulumi.StringPtrOutput `pulumi:"identityLocalKeyId"`
	// Keyring name
	KeyringLocal        pulumi.StringPtrOutput `pulumi:"keyringLocal"`
	MatchAddressLocalIp pulumi.StringPtrOutput `pulumi:"matchAddressLocalIp"`
	MatchFvrf           pulumi.StringPtrOutput `pulumi:"matchFvrf"`
	// Any fvrf
	MatchFvrfAny                     pulumi.BoolPtrOutput                                        `pulumi:"matchFvrfAny"`
	MatchIdentityRemoteIpv4Addresses CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArrayOutput `pulumi:"matchIdentityRemoteIpv4Addresses"`
	MatchIdentityRemoteIpv6Prefixes  pulumi.StringArrayOutput                                    `pulumi:"matchIdentityRemoteIpv6Prefixes"`
	// key-id opaque string
	MatchIdentityRemoteKeys pulumi.StringArrayOutput `pulumi:"matchIdentityRemoteKeys"`
	// Match the profile for incoming connections only
	MatchInboundOnly pulumi.BoolPtrOutput `pulumi:"matchInboundOnly"`
	Name             pulumi.StringOutput  `pulumi:"name"`
}

// NewCryptoIkev2Profile registers a new resource with the given unique name, arguments, and options.
func NewCryptoIkev2Profile(ctx *pulumi.Context,
	name string, args *CryptoIkev2ProfileArgs, opts ...pulumi.ResourceOption) (*CryptoIkev2Profile, error) {
	if args == nil {
		args = &CryptoIkev2ProfileArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CryptoIkev2Profile
	err := ctx.RegisterResource("iosxe:index/cryptoIkev2Profile:CryptoIkev2Profile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCryptoIkev2Profile gets an existing CryptoIkev2Profile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCryptoIkev2Profile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CryptoIkev2ProfileState, opts ...pulumi.ResourceOption) (*CryptoIkev2Profile, error) {
	var resource CryptoIkev2Profile
	err := ctx.ReadResource("iosxe:index/cryptoIkev2Profile:CryptoIkev2Profile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CryptoIkev2Profile resources.
type cryptoIkev2ProfileState struct {
	// Pre-Shared Key
	AuthenticationLocalPreShare *bool `pulumi:"authenticationLocalPreShare"`
	// Pre-Shared Key
	AuthenticationRemotePreShare *bool `pulumi:"authenticationRemotePreShare"`
	// enable config-exchange request
	ConfigExchangeRequest *bool `pulumi:"configExchangeRequest"`
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode *string `pulumi:"deleteMode"`
	// Specify a description of this profile
	Description *string `pulumi:"description"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// - Range: `10`-`3600`
	DpdInterval *int `pulumi:"dpdInterval"`
	// - Choices: `on-demand`, `periodic`
	DpdQuery *string `pulumi:"dpdQuery"`
	// - Range: `2`-`60`
	DpdRetry *int `pulumi:"dpdRetry"`
	// address
	IdentityLocalAddress *string `pulumi:"identityLocalAddress"`
	// key-id opaque string - proprietary types of identification key-id string
	IdentityLocalKeyId *string `pulumi:"identityLocalKeyId"`
	// Keyring name
	KeyringLocal        *string `pulumi:"keyringLocal"`
	MatchAddressLocalIp *string `pulumi:"matchAddressLocalIp"`
	MatchFvrf           *string `pulumi:"matchFvrf"`
	// Any fvrf
	MatchFvrfAny                     *bool                                              `pulumi:"matchFvrfAny"`
	MatchIdentityRemoteIpv4Addresses []CryptoIkev2ProfileMatchIdentityRemoteIpv4Address `pulumi:"matchIdentityRemoteIpv4Addresses"`
	MatchIdentityRemoteIpv6Prefixes  []string                                           `pulumi:"matchIdentityRemoteIpv6Prefixes"`
	// key-id opaque string
	MatchIdentityRemoteKeys []string `pulumi:"matchIdentityRemoteKeys"`
	// Match the profile for incoming connections only
	MatchInboundOnly *bool   `pulumi:"matchInboundOnly"`
	Name             *string `pulumi:"name"`
}

type CryptoIkev2ProfileState struct {
	// Pre-Shared Key
	AuthenticationLocalPreShare pulumi.BoolPtrInput
	// Pre-Shared Key
	AuthenticationRemotePreShare pulumi.BoolPtrInput
	// enable config-exchange request
	ConfigExchangeRequest pulumi.BoolPtrInput
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrInput
	// Specify a description of this profile
	Description pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// - Range: `10`-`3600`
	DpdInterval pulumi.IntPtrInput
	// - Choices: `on-demand`, `periodic`
	DpdQuery pulumi.StringPtrInput
	// - Range: `2`-`60`
	DpdRetry pulumi.IntPtrInput
	// address
	IdentityLocalAddress pulumi.StringPtrInput
	// key-id opaque string - proprietary types of identification key-id string
	IdentityLocalKeyId pulumi.StringPtrInput
	// Keyring name
	KeyringLocal        pulumi.StringPtrInput
	MatchAddressLocalIp pulumi.StringPtrInput
	MatchFvrf           pulumi.StringPtrInput
	// Any fvrf
	MatchFvrfAny                     pulumi.BoolPtrInput
	MatchIdentityRemoteIpv4Addresses CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArrayInput
	MatchIdentityRemoteIpv6Prefixes  pulumi.StringArrayInput
	// key-id opaque string
	MatchIdentityRemoteKeys pulumi.StringArrayInput
	// Match the profile for incoming connections only
	MatchInboundOnly pulumi.BoolPtrInput
	Name             pulumi.StringPtrInput
}

func (CryptoIkev2ProfileState) ElementType() reflect.Type {
	return reflect.TypeOf((*cryptoIkev2ProfileState)(nil)).Elem()
}

type cryptoIkev2ProfileArgs struct {
	// Pre-Shared Key
	AuthenticationLocalPreShare *bool `pulumi:"authenticationLocalPreShare"`
	// Pre-Shared Key
	AuthenticationRemotePreShare *bool `pulumi:"authenticationRemotePreShare"`
	// enable config-exchange request
	ConfigExchangeRequest *bool `pulumi:"configExchangeRequest"`
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode *string `pulumi:"deleteMode"`
	// Specify a description of this profile
	Description *string `pulumi:"description"`
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// - Range: `10`-`3600`
	DpdInterval *int `pulumi:"dpdInterval"`
	// - Choices: `on-demand`, `periodic`
	DpdQuery *string `pulumi:"dpdQuery"`
	// - Range: `2`-`60`
	DpdRetry *int `pulumi:"dpdRetry"`
	// address
	IdentityLocalAddress *string `pulumi:"identityLocalAddress"`
	// key-id opaque string - proprietary types of identification key-id string
	IdentityLocalKeyId *string `pulumi:"identityLocalKeyId"`
	// Keyring name
	KeyringLocal        *string `pulumi:"keyringLocal"`
	MatchAddressLocalIp *string `pulumi:"matchAddressLocalIp"`
	MatchFvrf           *string `pulumi:"matchFvrf"`
	// Any fvrf
	MatchFvrfAny                     *bool                                              `pulumi:"matchFvrfAny"`
	MatchIdentityRemoteIpv4Addresses []CryptoIkev2ProfileMatchIdentityRemoteIpv4Address `pulumi:"matchIdentityRemoteIpv4Addresses"`
	MatchIdentityRemoteIpv6Prefixes  []string                                           `pulumi:"matchIdentityRemoteIpv6Prefixes"`
	// key-id opaque string
	MatchIdentityRemoteKeys []string `pulumi:"matchIdentityRemoteKeys"`
	// Match the profile for incoming connections only
	MatchInboundOnly *bool   `pulumi:"matchInboundOnly"`
	Name             *string `pulumi:"name"`
}

// The set of arguments for constructing a CryptoIkev2Profile resource.
type CryptoIkev2ProfileArgs struct {
	// Pre-Shared Key
	AuthenticationLocalPreShare pulumi.BoolPtrInput
	// Pre-Shared Key
	AuthenticationRemotePreShare pulumi.BoolPtrInput
	// enable config-exchange request
	ConfigExchangeRequest pulumi.BoolPtrInput
	// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
	// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
	// Default value is `all`. - Choices: `all`, `attributes`
	DeleteMode pulumi.StringPtrInput
	// Specify a description of this profile
	Description pulumi.StringPtrInput
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// - Range: `10`-`3600`
	DpdInterval pulumi.IntPtrInput
	// - Choices: `on-demand`, `periodic`
	DpdQuery pulumi.StringPtrInput
	// - Range: `2`-`60`
	DpdRetry pulumi.IntPtrInput
	// address
	IdentityLocalAddress pulumi.StringPtrInput
	// key-id opaque string - proprietary types of identification key-id string
	IdentityLocalKeyId pulumi.StringPtrInput
	// Keyring name
	KeyringLocal        pulumi.StringPtrInput
	MatchAddressLocalIp pulumi.StringPtrInput
	MatchFvrf           pulumi.StringPtrInput
	// Any fvrf
	MatchFvrfAny                     pulumi.BoolPtrInput
	MatchIdentityRemoteIpv4Addresses CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArrayInput
	MatchIdentityRemoteIpv6Prefixes  pulumi.StringArrayInput
	// key-id opaque string
	MatchIdentityRemoteKeys pulumi.StringArrayInput
	// Match the profile for incoming connections only
	MatchInboundOnly pulumi.BoolPtrInput
	Name             pulumi.StringPtrInput
}

func (CryptoIkev2ProfileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cryptoIkev2ProfileArgs)(nil)).Elem()
}

type CryptoIkev2ProfileInput interface {
	pulumi.Input

	ToCryptoIkev2ProfileOutput() CryptoIkev2ProfileOutput
	ToCryptoIkev2ProfileOutputWithContext(ctx context.Context) CryptoIkev2ProfileOutput
}

func (*CryptoIkev2Profile) ElementType() reflect.Type {
	return reflect.TypeOf((**CryptoIkev2Profile)(nil)).Elem()
}

func (i *CryptoIkev2Profile) ToCryptoIkev2ProfileOutput() CryptoIkev2ProfileOutput {
	return i.ToCryptoIkev2ProfileOutputWithContext(context.Background())
}

func (i *CryptoIkev2Profile) ToCryptoIkev2ProfileOutputWithContext(ctx context.Context) CryptoIkev2ProfileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CryptoIkev2ProfileOutput)
}

func (i *CryptoIkev2Profile) ToOutput(ctx context.Context) pulumix.Output[*CryptoIkev2Profile] {
	return pulumix.Output[*CryptoIkev2Profile]{
		OutputState: i.ToCryptoIkev2ProfileOutputWithContext(ctx).OutputState,
	}
}

// CryptoIkev2ProfileArrayInput is an input type that accepts CryptoIkev2ProfileArray and CryptoIkev2ProfileArrayOutput values.
// You can construct a concrete instance of `CryptoIkev2ProfileArrayInput` via:
//
//	CryptoIkev2ProfileArray{ CryptoIkev2ProfileArgs{...} }
type CryptoIkev2ProfileArrayInput interface {
	pulumi.Input

	ToCryptoIkev2ProfileArrayOutput() CryptoIkev2ProfileArrayOutput
	ToCryptoIkev2ProfileArrayOutputWithContext(context.Context) CryptoIkev2ProfileArrayOutput
}

type CryptoIkev2ProfileArray []CryptoIkev2ProfileInput

func (CryptoIkev2ProfileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CryptoIkev2Profile)(nil)).Elem()
}

func (i CryptoIkev2ProfileArray) ToCryptoIkev2ProfileArrayOutput() CryptoIkev2ProfileArrayOutput {
	return i.ToCryptoIkev2ProfileArrayOutputWithContext(context.Background())
}

func (i CryptoIkev2ProfileArray) ToCryptoIkev2ProfileArrayOutputWithContext(ctx context.Context) CryptoIkev2ProfileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CryptoIkev2ProfileArrayOutput)
}

func (i CryptoIkev2ProfileArray) ToOutput(ctx context.Context) pulumix.Output[[]*CryptoIkev2Profile] {
	return pulumix.Output[[]*CryptoIkev2Profile]{
		OutputState: i.ToCryptoIkev2ProfileArrayOutputWithContext(ctx).OutputState,
	}
}

// CryptoIkev2ProfileMapInput is an input type that accepts CryptoIkev2ProfileMap and CryptoIkev2ProfileMapOutput values.
// You can construct a concrete instance of `CryptoIkev2ProfileMapInput` via:
//
//	CryptoIkev2ProfileMap{ "key": CryptoIkev2ProfileArgs{...} }
type CryptoIkev2ProfileMapInput interface {
	pulumi.Input

	ToCryptoIkev2ProfileMapOutput() CryptoIkev2ProfileMapOutput
	ToCryptoIkev2ProfileMapOutputWithContext(context.Context) CryptoIkev2ProfileMapOutput
}

type CryptoIkev2ProfileMap map[string]CryptoIkev2ProfileInput

func (CryptoIkev2ProfileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CryptoIkev2Profile)(nil)).Elem()
}

func (i CryptoIkev2ProfileMap) ToCryptoIkev2ProfileMapOutput() CryptoIkev2ProfileMapOutput {
	return i.ToCryptoIkev2ProfileMapOutputWithContext(context.Background())
}

func (i CryptoIkev2ProfileMap) ToCryptoIkev2ProfileMapOutputWithContext(ctx context.Context) CryptoIkev2ProfileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CryptoIkev2ProfileMapOutput)
}

func (i CryptoIkev2ProfileMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*CryptoIkev2Profile] {
	return pulumix.Output[map[string]*CryptoIkev2Profile]{
		OutputState: i.ToCryptoIkev2ProfileMapOutputWithContext(ctx).OutputState,
	}
}

type CryptoIkev2ProfileOutput struct{ *pulumi.OutputState }

func (CryptoIkev2ProfileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CryptoIkev2Profile)(nil)).Elem()
}

func (o CryptoIkev2ProfileOutput) ToCryptoIkev2ProfileOutput() CryptoIkev2ProfileOutput {
	return o
}

func (o CryptoIkev2ProfileOutput) ToCryptoIkev2ProfileOutputWithContext(ctx context.Context) CryptoIkev2ProfileOutput {
	return o
}

func (o CryptoIkev2ProfileOutput) ToOutput(ctx context.Context) pulumix.Output[*CryptoIkev2Profile] {
	return pulumix.Output[*CryptoIkev2Profile]{
		OutputState: o.OutputState,
	}
}

// Pre-Shared Key
func (o CryptoIkev2ProfileOutput) AuthenticationLocalPreShare() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CryptoIkev2Profile) pulumi.BoolPtrOutput { return v.AuthenticationLocalPreShare }).(pulumi.BoolPtrOutput)
}

// Pre-Shared Key
func (o CryptoIkev2ProfileOutput) AuthenticationRemotePreShare() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CryptoIkev2Profile) pulumi.BoolPtrOutput { return v.AuthenticationRemotePreShare }).(pulumi.BoolPtrOutput)
}

// enable config-exchange request
func (o CryptoIkev2ProfileOutput) ConfigExchangeRequest() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CryptoIkev2Profile) pulumi.BoolPtrOutput { return v.ConfigExchangeRequest }).(pulumi.BoolPtrOutput)
}

// Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
// managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
// Default value is `all`. - Choices: `all`, `attributes`
func (o CryptoIkev2ProfileOutput) DeleteMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CryptoIkev2Profile) pulumi.StringPtrOutput { return v.DeleteMode }).(pulumi.StringPtrOutput)
}

// Specify a description of this profile
func (o CryptoIkev2ProfileOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CryptoIkev2Profile) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// A device name from the provider configuration.
func (o CryptoIkev2ProfileOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CryptoIkev2Profile) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

// - Range: `10`-`3600`
func (o CryptoIkev2ProfileOutput) DpdInterval() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *CryptoIkev2Profile) pulumi.IntPtrOutput { return v.DpdInterval }).(pulumi.IntPtrOutput)
}

// - Choices: `on-demand`, `periodic`
func (o CryptoIkev2ProfileOutput) DpdQuery() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CryptoIkev2Profile) pulumi.StringPtrOutput { return v.DpdQuery }).(pulumi.StringPtrOutput)
}

// - Range: `2`-`60`
func (o CryptoIkev2ProfileOutput) DpdRetry() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *CryptoIkev2Profile) pulumi.IntPtrOutput { return v.DpdRetry }).(pulumi.IntPtrOutput)
}

// address
func (o CryptoIkev2ProfileOutput) IdentityLocalAddress() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CryptoIkev2Profile) pulumi.StringPtrOutput { return v.IdentityLocalAddress }).(pulumi.StringPtrOutput)
}

// key-id opaque string - proprietary types of identification key-id string
func (o CryptoIkev2ProfileOutput) IdentityLocalKeyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CryptoIkev2Profile) pulumi.StringPtrOutput { return v.IdentityLocalKeyId }).(pulumi.StringPtrOutput)
}

// Keyring name
func (o CryptoIkev2ProfileOutput) KeyringLocal() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CryptoIkev2Profile) pulumi.StringPtrOutput { return v.KeyringLocal }).(pulumi.StringPtrOutput)
}

func (o CryptoIkev2ProfileOutput) MatchAddressLocalIp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CryptoIkev2Profile) pulumi.StringPtrOutput { return v.MatchAddressLocalIp }).(pulumi.StringPtrOutput)
}

func (o CryptoIkev2ProfileOutput) MatchFvrf() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CryptoIkev2Profile) pulumi.StringPtrOutput { return v.MatchFvrf }).(pulumi.StringPtrOutput)
}

// Any fvrf
func (o CryptoIkev2ProfileOutput) MatchFvrfAny() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CryptoIkev2Profile) pulumi.BoolPtrOutput { return v.MatchFvrfAny }).(pulumi.BoolPtrOutput)
}

func (o CryptoIkev2ProfileOutput) MatchIdentityRemoteIpv4Addresses() CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArrayOutput {
	return o.ApplyT(func(v *CryptoIkev2Profile) CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArrayOutput {
		return v.MatchIdentityRemoteIpv4Addresses
	}).(CryptoIkev2ProfileMatchIdentityRemoteIpv4AddressArrayOutput)
}

func (o CryptoIkev2ProfileOutput) MatchIdentityRemoteIpv6Prefixes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CryptoIkev2Profile) pulumi.StringArrayOutput { return v.MatchIdentityRemoteIpv6Prefixes }).(pulumi.StringArrayOutput)
}

// key-id opaque string
func (o CryptoIkev2ProfileOutput) MatchIdentityRemoteKeys() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CryptoIkev2Profile) pulumi.StringArrayOutput { return v.MatchIdentityRemoteKeys }).(pulumi.StringArrayOutput)
}

// Match the profile for incoming connections only
func (o CryptoIkev2ProfileOutput) MatchInboundOnly() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CryptoIkev2Profile) pulumi.BoolPtrOutput { return v.MatchInboundOnly }).(pulumi.BoolPtrOutput)
}

func (o CryptoIkev2ProfileOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CryptoIkev2Profile) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type CryptoIkev2ProfileArrayOutput struct{ *pulumi.OutputState }

func (CryptoIkev2ProfileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CryptoIkev2Profile)(nil)).Elem()
}

func (o CryptoIkev2ProfileArrayOutput) ToCryptoIkev2ProfileArrayOutput() CryptoIkev2ProfileArrayOutput {
	return o
}

func (o CryptoIkev2ProfileArrayOutput) ToCryptoIkev2ProfileArrayOutputWithContext(ctx context.Context) CryptoIkev2ProfileArrayOutput {
	return o
}

func (o CryptoIkev2ProfileArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*CryptoIkev2Profile] {
	return pulumix.Output[[]*CryptoIkev2Profile]{
		OutputState: o.OutputState,
	}
}

func (o CryptoIkev2ProfileArrayOutput) Index(i pulumi.IntInput) CryptoIkev2ProfileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CryptoIkev2Profile {
		return vs[0].([]*CryptoIkev2Profile)[vs[1].(int)]
	}).(CryptoIkev2ProfileOutput)
}

type CryptoIkev2ProfileMapOutput struct{ *pulumi.OutputState }

func (CryptoIkev2ProfileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CryptoIkev2Profile)(nil)).Elem()
}

func (o CryptoIkev2ProfileMapOutput) ToCryptoIkev2ProfileMapOutput() CryptoIkev2ProfileMapOutput {
	return o
}

func (o CryptoIkev2ProfileMapOutput) ToCryptoIkev2ProfileMapOutputWithContext(ctx context.Context) CryptoIkev2ProfileMapOutput {
	return o
}

func (o CryptoIkev2ProfileMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*CryptoIkev2Profile] {
	return pulumix.Output[map[string]*CryptoIkev2Profile]{
		OutputState: o.OutputState,
	}
}

func (o CryptoIkev2ProfileMapOutput) MapIndex(k pulumi.StringInput) CryptoIkev2ProfileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CryptoIkev2Profile {
		return vs[0].(map[string]*CryptoIkev2Profile)[vs[1].(string)]
	}).(CryptoIkev2ProfileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CryptoIkev2ProfileInput)(nil)).Elem(), &CryptoIkev2Profile{})
	pulumi.RegisterInputType(reflect.TypeOf((*CryptoIkev2ProfileArrayInput)(nil)).Elem(), CryptoIkev2ProfileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CryptoIkev2ProfileMapInput)(nil)).Elem(), CryptoIkev2ProfileMap{})
	pulumi.RegisterOutputType(CryptoIkev2ProfileOutput{})
	pulumi.RegisterOutputType(CryptoIkev2ProfileArrayOutput{})
	pulumi.RegisterOutputType(CryptoIkev2ProfileMapOutput{})
}
