// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.iosxe.Utilities;
import com.pulumi.iosxe.iosxe.EvpnInstanceArgs;
import com.pulumi.iosxe.iosxe.inputs.EvpnInstanceState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource can manage the EVPN Instance configuration.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.iosxe.iosxe.EvpnInstance;
 * import com.pulumi.iosxe.iosxe.EvpnInstanceArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new EvpnInstance(&#34;example&#34;, EvpnInstanceArgs.builder()        
 *             .evpnInstanceNum(10)
 *             .vlanBasedAutoRouteTarget(false)
 *             .vlanBasedDefaultGatewayAdvertise(&#34;enable&#34;)
 *             .vlanBasedEncapsulation(&#34;vxlan&#34;)
 *             .vlanBasedIpLocalLearningDisable(false)
 *             .vlanBasedIpLocalLearningEnable(true)
 *             .vlanBasedRd(&#34;10:10&#34;)
 *             .vlanBasedReOriginateRouteType5(true)
 *             .vlanBasedReplicationTypeIngress(false)
 *             .vlanBasedReplicationTypeMp2mp(false)
 *             .vlanBasedReplicationTypeP2mp(false)
 *             .vlanBasedReplicationTypeStatic(true)
 *             .vlanBasedRouteTarget(&#34;10:10&#34;)
 *             .vlanBasedRouteTargetBoth(&#34;10:10&#34;)
 *             .vlanBasedRouteTargetExport(&#34;10:10&#34;)
 *             .vlanBasedRouteTargetImport(&#34;10:10&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import iosxe:iosxe/evpnInstance:EvpnInstance example &#34;Cisco-IOS-XE-native:native/l2vpn/Cisco-IOS-XE-l2vpn:evpn_cont/evpn-instance/evpn/instance/instance=10&#34;
 * ```
 * 
 */
@ResourceType(type="iosxe:iosxe/evpnInstance:EvpnInstance")
public class EvpnInstance extends com.pulumi.resources.CustomResource {
    /**
     * A device name from the provider configuration.
     * 
     */
    @Export(name="device", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> device;

    /**
     * @return A device name from the provider configuration.
     * 
     */
    public Output<Optional<String>> device() {
        return Codegen.optional(this.device);
    }
    /**
     * evpn instance number - Range: `1`-`65535`
     * 
     */
    @Export(name="evpnInstanceNum", refs={Integer.class}, tree="[0]")
    private Output<Integer> evpnInstanceNum;

    /**
     * @return evpn instance number - Range: `1`-`65535`
     * 
     */
    public Output<Integer> evpnInstanceNum() {
        return this.evpnInstanceNum;
    }
    /**
     * Automatically set a route-target
     * 
     */
    @Export(name="vlanBasedAutoRouteTarget", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> vlanBasedAutoRouteTarget;

    /**
     * @return Automatically set a route-target
     * 
     */
    public Output<Optional<Boolean>> vlanBasedAutoRouteTarget() {
        return Codegen.optional(this.vlanBasedAutoRouteTarget);
    }
    /**
     * Advertise Default Gateway MAC/IP routes - Choices: `disable`, `enable`
     * 
     */
    @Export(name="vlanBasedDefaultGatewayAdvertise", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vlanBasedDefaultGatewayAdvertise;

    /**
     * @return Advertise Default Gateway MAC/IP routes - Choices: `disable`, `enable`
     * 
     */
    public Output<Optional<String>> vlanBasedDefaultGatewayAdvertise() {
        return Codegen.optional(this.vlanBasedDefaultGatewayAdvertise);
    }
    /**
     * Data encapsulation method - Choices: `mpls`, `vxlan`
     * 
     */
    @Export(name="vlanBasedEncapsulation", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vlanBasedEncapsulation;

    /**
     * @return Data encapsulation method - Choices: `mpls`, `vxlan`
     * 
     */
    public Output<Optional<String>> vlanBasedEncapsulation() {
        return Codegen.optional(this.vlanBasedEncapsulation);
    }
    /**
     * Disable IP local learning from dataplane
     * 
     */
    @Export(name="vlanBasedIpLocalLearningDisable", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> vlanBasedIpLocalLearningDisable;

    /**
     * @return Disable IP local learning from dataplane
     * 
     */
    public Output<Optional<Boolean>> vlanBasedIpLocalLearningDisable() {
        return Codegen.optional(this.vlanBasedIpLocalLearningDisable);
    }
    /**
     * Enable IP local learning from dataplane
     * 
     */
    @Export(name="vlanBasedIpLocalLearningEnable", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> vlanBasedIpLocalLearningEnable;

    /**
     * @return Enable IP local learning from dataplane
     * 
     */
    public Output<Optional<Boolean>> vlanBasedIpLocalLearningEnable() {
        return Codegen.optional(this.vlanBasedIpLocalLearningEnable);
    }
    /**
     * ASN:nn or IP-address:nn
     * 
     */
    @Export(name="vlanBasedRd", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vlanBasedRd;

    /**
     * @return ASN:nn or IP-address:nn
     * 
     */
    public Output<Optional<String>> vlanBasedRd() {
        return Codegen.optional(this.vlanBasedRd);
    }
    /**
     * Re-originate route-type 5
     * 
     */
    @Export(name="vlanBasedReOriginateRouteType5", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> vlanBasedReOriginateRouteType5;

    /**
     * @return Re-originate route-type 5
     * 
     */
    public Output<Optional<Boolean>> vlanBasedReOriginateRouteType5() {
        return Codegen.optional(this.vlanBasedReOriginateRouteType5);
    }
    /**
     * Ingress replication
     * 
     */
    @Export(name="vlanBasedReplicationTypeIngress", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> vlanBasedReplicationTypeIngress;

    /**
     * @return Ingress replication
     * 
     */
    public Output<Optional<Boolean>> vlanBasedReplicationTypeIngress() {
        return Codegen.optional(this.vlanBasedReplicationTypeIngress);
    }
    /**
     * mp2mp replication
     * 
     */
    @Export(name="vlanBasedReplicationTypeMp2mp", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> vlanBasedReplicationTypeMp2mp;

    /**
     * @return mp2mp replication
     * 
     */
    public Output<Optional<Boolean>> vlanBasedReplicationTypeMp2mp() {
        return Codegen.optional(this.vlanBasedReplicationTypeMp2mp);
    }
    /**
     * p2mp replication
     * 
     */
    @Export(name="vlanBasedReplicationTypeP2mp", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> vlanBasedReplicationTypeP2mp;

    /**
     * @return p2mp replication
     * 
     */
    public Output<Optional<Boolean>> vlanBasedReplicationTypeP2mp() {
        return Codegen.optional(this.vlanBasedReplicationTypeP2mp);
    }
    /**
     * Static replication
     * 
     */
    @Export(name="vlanBasedReplicationTypeStatic", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> vlanBasedReplicationTypeStatic;

    /**
     * @return Static replication
     * 
     */
    public Output<Optional<Boolean>> vlanBasedReplicationTypeStatic() {
        return Codegen.optional(this.vlanBasedReplicationTypeStatic);
    }
    /**
     * ASN:nn or IP-address:nn
     * 
     */
    @Export(name="vlanBasedRouteTarget", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vlanBasedRouteTarget;

    /**
     * @return ASN:nn or IP-address:nn
     * 
     */
    public Output<Optional<String>> vlanBasedRouteTarget() {
        return Codegen.optional(this.vlanBasedRouteTarget);
    }
    /**
     * ASN:nn or IP-address:nn
     * 
     */
    @Export(name="vlanBasedRouteTargetBoth", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vlanBasedRouteTargetBoth;

    /**
     * @return ASN:nn or IP-address:nn
     * 
     */
    public Output<Optional<String>> vlanBasedRouteTargetBoth() {
        return Codegen.optional(this.vlanBasedRouteTargetBoth);
    }
    /**
     * ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
     * 
     */
    @Export(name="vlanBasedRouteTargetExport", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vlanBasedRouteTargetExport;

    /**
     * @return ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
     * 
     */
    public Output<Optional<String>> vlanBasedRouteTargetExport() {
        return Codegen.optional(this.vlanBasedRouteTargetExport);
    }
    /**
     * ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
     * 
     */
    @Export(name="vlanBasedRouteTargetImport", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vlanBasedRouteTargetImport;

    /**
     * @return ASN:nn or IP-address:nn (DEPRECATED, use rt-value-entry)
     * 
     */
    public Output<Optional<String>> vlanBasedRouteTargetImport() {
        return Codegen.optional(this.vlanBasedRouteTargetImport);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EvpnInstance(String name) {
        this(name, EvpnInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EvpnInstance(String name, EvpnInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EvpnInstance(String name, EvpnInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/evpnInstance:EvpnInstance", name, args == null ? EvpnInstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EvpnInstance(String name, Output<String> id, @Nullable EvpnInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/evpnInstance:EvpnInstance", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static EvpnInstance get(String name, Output<String> id, @Nullable EvpnInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EvpnInstance(name, id, state, options);
    }
}
