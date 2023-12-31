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

// This resource can manage the MDT Subscription configuration.
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
//			_, err := iosxe.NewMdtSubscription(ctx, "example", &iosxe.MdtSubscriptionArgs{
//				Encoding:    pulumi.String("encode-kvgpb"),
//				FilterXpath: pulumi.String("/ios-events-ios-xe-oper:ospf-neighbor-state-change"),
//				Receivers: iosxe.MdtSubscriptionReceiverArray{
//					&iosxe.MdtSubscriptionReceiverArgs{
//						Address:  pulumi.String("5.6.7.8"),
//						Port:     pulumi.Int(57600),
//						Protocol: pulumi.String("grpc-tcp"),
//					},
//				},
//				SourceAddress:        pulumi.String("1.2.3.4"),
//				SourceVrf:            pulumi.String("Mgmt-vrf"),
//				Stream:               pulumi.String("yang-notif-native"),
//				SubscriptionId:       pulumi.Int(101),
//				UpdatePolicyOnChange: pulumi.Bool(true),
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
//	$ pulumi import iosxe:index/mdtSubscription:MdtSubscription example "Cisco-IOS-XE-mdt-cfg:mdt-config-data/mdt-subscription=101"
//
// ```
type MdtSubscription struct {
	pulumi.CustomResourceState

	// A device name from the provider configuration.
	Device pulumi.StringPtrOutput `pulumi:"device"`
	// Update notification encoding
	Encoding pulumi.StringPtrOutput `pulumi:"encoding"`
	// XPath expression describing the set of objects wanted as part of the subscription
	FilterXpath pulumi.StringPtrOutput `pulumi:"filterXpath"`
	// Configuration of receivers of configured subscriptions. Use of this is deprecated. Use mdt-receiver-names instead.
	Receivers MdtSubscriptionReceiverArrayOutput `pulumi:"receivers"`
	// The source address for the notifications
	SourceAddress pulumi.StringPtrOutput `pulumi:"sourceAddress"`
	// Network instance name for the VRF
	SourceVrf pulumi.StringPtrOutput `pulumi:"sourceVrf"`
	// The name of the event stream being subscribed to
	Stream pulumi.StringPtrOutput `pulumi:"stream"`
	// Unique subscription identifier. - Range: `0`-`2147483647`
	SubscriptionId pulumi.IntOutput `pulumi:"subscriptionId"`
	// If true, there is no initial update notification with the current value of all the data. NOT CURRENTLY SUPPORTED. If
	// specified, must be false
	UpdatePolicyOnChange pulumi.BoolPtrOutput `pulumi:"updatePolicyOnChange"`
	// Period of update notifications in hundredths of a second - Range: `0`-`4294967295`
	UpdatePolicyPeriodic pulumi.IntPtrOutput `pulumi:"updatePolicyPeriodic"`
}

// NewMdtSubscription registers a new resource with the given unique name, arguments, and options.
func NewMdtSubscription(ctx *pulumi.Context,
	name string, args *MdtSubscriptionArgs, opts ...pulumi.ResourceOption) (*MdtSubscription, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SubscriptionId == nil {
		return nil, errors.New("invalid value for required argument 'SubscriptionId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MdtSubscription
	err := ctx.RegisterResource("iosxe:index/mdtSubscription:MdtSubscription", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMdtSubscription gets an existing MdtSubscription resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMdtSubscription(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MdtSubscriptionState, opts ...pulumi.ResourceOption) (*MdtSubscription, error) {
	var resource MdtSubscription
	err := ctx.ReadResource("iosxe:index/mdtSubscription:MdtSubscription", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MdtSubscription resources.
type mdtSubscriptionState struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// Update notification encoding
	Encoding *string `pulumi:"encoding"`
	// XPath expression describing the set of objects wanted as part of the subscription
	FilterXpath *string `pulumi:"filterXpath"`
	// Configuration of receivers of configured subscriptions. Use of this is deprecated. Use mdt-receiver-names instead.
	Receivers []MdtSubscriptionReceiver `pulumi:"receivers"`
	// The source address for the notifications
	SourceAddress *string `pulumi:"sourceAddress"`
	// Network instance name for the VRF
	SourceVrf *string `pulumi:"sourceVrf"`
	// The name of the event stream being subscribed to
	Stream *string `pulumi:"stream"`
	// Unique subscription identifier. - Range: `0`-`2147483647`
	SubscriptionId *int `pulumi:"subscriptionId"`
	// If true, there is no initial update notification with the current value of all the data. NOT CURRENTLY SUPPORTED. If
	// specified, must be false
	UpdatePolicyOnChange *bool `pulumi:"updatePolicyOnChange"`
	// Period of update notifications in hundredths of a second - Range: `0`-`4294967295`
	UpdatePolicyPeriodic *int `pulumi:"updatePolicyPeriodic"`
}

type MdtSubscriptionState struct {
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// Update notification encoding
	Encoding pulumi.StringPtrInput
	// XPath expression describing the set of objects wanted as part of the subscription
	FilterXpath pulumi.StringPtrInput
	// Configuration of receivers of configured subscriptions. Use of this is deprecated. Use mdt-receiver-names instead.
	Receivers MdtSubscriptionReceiverArrayInput
	// The source address for the notifications
	SourceAddress pulumi.StringPtrInput
	// Network instance name for the VRF
	SourceVrf pulumi.StringPtrInput
	// The name of the event stream being subscribed to
	Stream pulumi.StringPtrInput
	// Unique subscription identifier. - Range: `0`-`2147483647`
	SubscriptionId pulumi.IntPtrInput
	// If true, there is no initial update notification with the current value of all the data. NOT CURRENTLY SUPPORTED. If
	// specified, must be false
	UpdatePolicyOnChange pulumi.BoolPtrInput
	// Period of update notifications in hundredths of a second - Range: `0`-`4294967295`
	UpdatePolicyPeriodic pulumi.IntPtrInput
}

func (MdtSubscriptionState) ElementType() reflect.Type {
	return reflect.TypeOf((*mdtSubscriptionState)(nil)).Elem()
}

type mdtSubscriptionArgs struct {
	// A device name from the provider configuration.
	Device *string `pulumi:"device"`
	// Update notification encoding
	Encoding *string `pulumi:"encoding"`
	// XPath expression describing the set of objects wanted as part of the subscription
	FilterXpath *string `pulumi:"filterXpath"`
	// Configuration of receivers of configured subscriptions. Use of this is deprecated. Use mdt-receiver-names instead.
	Receivers []MdtSubscriptionReceiver `pulumi:"receivers"`
	// The source address for the notifications
	SourceAddress *string `pulumi:"sourceAddress"`
	// Network instance name for the VRF
	SourceVrf *string `pulumi:"sourceVrf"`
	// The name of the event stream being subscribed to
	Stream *string `pulumi:"stream"`
	// Unique subscription identifier. - Range: `0`-`2147483647`
	SubscriptionId int `pulumi:"subscriptionId"`
	// If true, there is no initial update notification with the current value of all the data. NOT CURRENTLY SUPPORTED. If
	// specified, must be false
	UpdatePolicyOnChange *bool `pulumi:"updatePolicyOnChange"`
	// Period of update notifications in hundredths of a second - Range: `0`-`4294967295`
	UpdatePolicyPeriodic *int `pulumi:"updatePolicyPeriodic"`
}

// The set of arguments for constructing a MdtSubscription resource.
type MdtSubscriptionArgs struct {
	// A device name from the provider configuration.
	Device pulumi.StringPtrInput
	// Update notification encoding
	Encoding pulumi.StringPtrInput
	// XPath expression describing the set of objects wanted as part of the subscription
	FilterXpath pulumi.StringPtrInput
	// Configuration of receivers of configured subscriptions. Use of this is deprecated. Use mdt-receiver-names instead.
	Receivers MdtSubscriptionReceiverArrayInput
	// The source address for the notifications
	SourceAddress pulumi.StringPtrInput
	// Network instance name for the VRF
	SourceVrf pulumi.StringPtrInput
	// The name of the event stream being subscribed to
	Stream pulumi.StringPtrInput
	// Unique subscription identifier. - Range: `0`-`2147483647`
	SubscriptionId pulumi.IntInput
	// If true, there is no initial update notification with the current value of all the data. NOT CURRENTLY SUPPORTED. If
	// specified, must be false
	UpdatePolicyOnChange pulumi.BoolPtrInput
	// Period of update notifications in hundredths of a second - Range: `0`-`4294967295`
	UpdatePolicyPeriodic pulumi.IntPtrInput
}

func (MdtSubscriptionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*mdtSubscriptionArgs)(nil)).Elem()
}

type MdtSubscriptionInput interface {
	pulumi.Input

	ToMdtSubscriptionOutput() MdtSubscriptionOutput
	ToMdtSubscriptionOutputWithContext(ctx context.Context) MdtSubscriptionOutput
}

func (*MdtSubscription) ElementType() reflect.Type {
	return reflect.TypeOf((**MdtSubscription)(nil)).Elem()
}

func (i *MdtSubscription) ToMdtSubscriptionOutput() MdtSubscriptionOutput {
	return i.ToMdtSubscriptionOutputWithContext(context.Background())
}

func (i *MdtSubscription) ToMdtSubscriptionOutputWithContext(ctx context.Context) MdtSubscriptionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MdtSubscriptionOutput)
}

func (i *MdtSubscription) ToOutput(ctx context.Context) pulumix.Output[*MdtSubscription] {
	return pulumix.Output[*MdtSubscription]{
		OutputState: i.ToMdtSubscriptionOutputWithContext(ctx).OutputState,
	}
}

// MdtSubscriptionArrayInput is an input type that accepts MdtSubscriptionArray and MdtSubscriptionArrayOutput values.
// You can construct a concrete instance of `MdtSubscriptionArrayInput` via:
//
//	MdtSubscriptionArray{ MdtSubscriptionArgs{...} }
type MdtSubscriptionArrayInput interface {
	pulumi.Input

	ToMdtSubscriptionArrayOutput() MdtSubscriptionArrayOutput
	ToMdtSubscriptionArrayOutputWithContext(context.Context) MdtSubscriptionArrayOutput
}

type MdtSubscriptionArray []MdtSubscriptionInput

func (MdtSubscriptionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MdtSubscription)(nil)).Elem()
}

func (i MdtSubscriptionArray) ToMdtSubscriptionArrayOutput() MdtSubscriptionArrayOutput {
	return i.ToMdtSubscriptionArrayOutputWithContext(context.Background())
}

func (i MdtSubscriptionArray) ToMdtSubscriptionArrayOutputWithContext(ctx context.Context) MdtSubscriptionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MdtSubscriptionArrayOutput)
}

func (i MdtSubscriptionArray) ToOutput(ctx context.Context) pulumix.Output[[]*MdtSubscription] {
	return pulumix.Output[[]*MdtSubscription]{
		OutputState: i.ToMdtSubscriptionArrayOutputWithContext(ctx).OutputState,
	}
}

// MdtSubscriptionMapInput is an input type that accepts MdtSubscriptionMap and MdtSubscriptionMapOutput values.
// You can construct a concrete instance of `MdtSubscriptionMapInput` via:
//
//	MdtSubscriptionMap{ "key": MdtSubscriptionArgs{...} }
type MdtSubscriptionMapInput interface {
	pulumi.Input

	ToMdtSubscriptionMapOutput() MdtSubscriptionMapOutput
	ToMdtSubscriptionMapOutputWithContext(context.Context) MdtSubscriptionMapOutput
}

type MdtSubscriptionMap map[string]MdtSubscriptionInput

func (MdtSubscriptionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MdtSubscription)(nil)).Elem()
}

func (i MdtSubscriptionMap) ToMdtSubscriptionMapOutput() MdtSubscriptionMapOutput {
	return i.ToMdtSubscriptionMapOutputWithContext(context.Background())
}

func (i MdtSubscriptionMap) ToMdtSubscriptionMapOutputWithContext(ctx context.Context) MdtSubscriptionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MdtSubscriptionMapOutput)
}

func (i MdtSubscriptionMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*MdtSubscription] {
	return pulumix.Output[map[string]*MdtSubscription]{
		OutputState: i.ToMdtSubscriptionMapOutputWithContext(ctx).OutputState,
	}
}

type MdtSubscriptionOutput struct{ *pulumi.OutputState }

func (MdtSubscriptionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MdtSubscription)(nil)).Elem()
}

func (o MdtSubscriptionOutput) ToMdtSubscriptionOutput() MdtSubscriptionOutput {
	return o
}

func (o MdtSubscriptionOutput) ToMdtSubscriptionOutputWithContext(ctx context.Context) MdtSubscriptionOutput {
	return o
}

func (o MdtSubscriptionOutput) ToOutput(ctx context.Context) pulumix.Output[*MdtSubscription] {
	return pulumix.Output[*MdtSubscription]{
		OutputState: o.OutputState,
	}
}

// A device name from the provider configuration.
func (o MdtSubscriptionOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MdtSubscription) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

// Update notification encoding
func (o MdtSubscriptionOutput) Encoding() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MdtSubscription) pulumi.StringPtrOutput { return v.Encoding }).(pulumi.StringPtrOutput)
}

// XPath expression describing the set of objects wanted as part of the subscription
func (o MdtSubscriptionOutput) FilterXpath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MdtSubscription) pulumi.StringPtrOutput { return v.FilterXpath }).(pulumi.StringPtrOutput)
}

// Configuration of receivers of configured subscriptions. Use of this is deprecated. Use mdt-receiver-names instead.
func (o MdtSubscriptionOutput) Receivers() MdtSubscriptionReceiverArrayOutput {
	return o.ApplyT(func(v *MdtSubscription) MdtSubscriptionReceiverArrayOutput { return v.Receivers }).(MdtSubscriptionReceiverArrayOutput)
}

// The source address for the notifications
func (o MdtSubscriptionOutput) SourceAddress() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MdtSubscription) pulumi.StringPtrOutput { return v.SourceAddress }).(pulumi.StringPtrOutput)
}

// Network instance name for the VRF
func (o MdtSubscriptionOutput) SourceVrf() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MdtSubscription) pulumi.StringPtrOutput { return v.SourceVrf }).(pulumi.StringPtrOutput)
}

// The name of the event stream being subscribed to
func (o MdtSubscriptionOutput) Stream() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MdtSubscription) pulumi.StringPtrOutput { return v.Stream }).(pulumi.StringPtrOutput)
}

// Unique subscription identifier. - Range: `0`-`2147483647`
func (o MdtSubscriptionOutput) SubscriptionId() pulumi.IntOutput {
	return o.ApplyT(func(v *MdtSubscription) pulumi.IntOutput { return v.SubscriptionId }).(pulumi.IntOutput)
}

// If true, there is no initial update notification with the current value of all the data. NOT CURRENTLY SUPPORTED. If
// specified, must be false
func (o MdtSubscriptionOutput) UpdatePolicyOnChange() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MdtSubscription) pulumi.BoolPtrOutput { return v.UpdatePolicyOnChange }).(pulumi.BoolPtrOutput)
}

// Period of update notifications in hundredths of a second - Range: `0`-`4294967295`
func (o MdtSubscriptionOutput) UpdatePolicyPeriodic() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *MdtSubscription) pulumi.IntPtrOutput { return v.UpdatePolicyPeriodic }).(pulumi.IntPtrOutput)
}

type MdtSubscriptionArrayOutput struct{ *pulumi.OutputState }

func (MdtSubscriptionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MdtSubscription)(nil)).Elem()
}

func (o MdtSubscriptionArrayOutput) ToMdtSubscriptionArrayOutput() MdtSubscriptionArrayOutput {
	return o
}

func (o MdtSubscriptionArrayOutput) ToMdtSubscriptionArrayOutputWithContext(ctx context.Context) MdtSubscriptionArrayOutput {
	return o
}

func (o MdtSubscriptionArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*MdtSubscription] {
	return pulumix.Output[[]*MdtSubscription]{
		OutputState: o.OutputState,
	}
}

func (o MdtSubscriptionArrayOutput) Index(i pulumi.IntInput) MdtSubscriptionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MdtSubscription {
		return vs[0].([]*MdtSubscription)[vs[1].(int)]
	}).(MdtSubscriptionOutput)
}

type MdtSubscriptionMapOutput struct{ *pulumi.OutputState }

func (MdtSubscriptionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MdtSubscription)(nil)).Elem()
}

func (o MdtSubscriptionMapOutput) ToMdtSubscriptionMapOutput() MdtSubscriptionMapOutput {
	return o
}

func (o MdtSubscriptionMapOutput) ToMdtSubscriptionMapOutputWithContext(ctx context.Context) MdtSubscriptionMapOutput {
	return o
}

func (o MdtSubscriptionMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*MdtSubscription] {
	return pulumix.Output[map[string]*MdtSubscription]{
		OutputState: o.OutputState,
	}
}

func (o MdtSubscriptionMapOutput) MapIndex(k pulumi.StringInput) MdtSubscriptionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MdtSubscription {
		return vs[0].(map[string]*MdtSubscription)[vs[1].(string)]
	}).(MdtSubscriptionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MdtSubscriptionInput)(nil)).Elem(), &MdtSubscription{})
	pulumi.RegisterInputType(reflect.TypeOf((*MdtSubscriptionArrayInput)(nil)).Elem(), MdtSubscriptionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MdtSubscriptionMapInput)(nil)).Elem(), MdtSubscriptionMap{})
	pulumi.RegisterOutputType(MdtSubscriptionOutput{})
	pulumi.RegisterOutputType(MdtSubscriptionArrayOutput{})
	pulumi.RegisterOutputType(MdtSubscriptionMapOutput{})
}
