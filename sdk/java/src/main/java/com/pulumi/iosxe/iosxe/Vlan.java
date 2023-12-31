// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.iosxe.Utilities;
import com.pulumi.iosxe.iosxe.VlanArgs;
import com.pulumi.iosxe.iosxe.inputs.VlanState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource can manage the VLAN configuration.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.iosxe.iosxe.Vlan;
 * import com.pulumi.iosxe.iosxe.VlanArgs;
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
 *         var example = new Vlan(&#34;example&#34;, VlanArgs.builder()        
 *             .shutdown(false)
 *             .vlanId(123)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import iosxe:iosxe/vlan:Vlan example &#34;Cisco-IOS-XE-native:native/vlan/Cisco-IOS-XE-vlan:vlan-list=123&#34;
 * ```
 * 
 */
@ResourceType(type="iosxe:iosxe/vlan:Vlan")
public class Vlan extends com.pulumi.resources.CustomResource {
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
     * Ascii name of the VLAN
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Ascii name of the VLAN
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Configure association between private VLANs
     * 
     */
    @Export(name="privateVlanAssociation", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privateVlanAssociation;

    /**
     * @return Configure association between private VLANs
     * 
     */
    public Output<Optional<String>> privateVlanAssociation() {
        return Codegen.optional(this.privateVlanAssociation);
    }
    /**
     * Configure the VLAN as a community private VLAN
     * 
     */
    @Export(name="privateVlanCommunity", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> privateVlanCommunity;

    /**
     * @return Configure the VLAN as a community private VLAN
     * 
     */
    public Output<Optional<Boolean>> privateVlanCommunity() {
        return Codegen.optional(this.privateVlanCommunity);
    }
    /**
     * Configure the VLAN as an isolated private VLAN
     * 
     */
    @Export(name="privateVlanIsolated", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> privateVlanIsolated;

    /**
     * @return Configure the VLAN as an isolated private VLAN
     * 
     */
    public Output<Optional<Boolean>> privateVlanIsolated() {
        return Codegen.optional(this.privateVlanIsolated);
    }
    /**
     * Configure the VLAN as a primary private VLAN
     * 
     */
    @Export(name="privateVlanPrimary", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> privateVlanPrimary;

    /**
     * @return Configure the VLAN as a primary private VLAN
     * 
     */
    public Output<Optional<Boolean>> privateVlanPrimary() {
        return Codegen.optional(this.privateVlanPrimary);
    }
    /**
     * Configure as Remote SPAN VLAN
     * 
     */
    @Export(name="remoteSpan", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> remoteSpan;

    /**
     * @return Configure as Remote SPAN VLAN
     * 
     */
    public Output<Optional<Boolean>> remoteSpan() {
        return Codegen.optional(this.remoteSpan);
    }
    /**
     * Shutdown VLAN switching
     * 
     */
    @Export(name="shutdown", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> shutdown;

    /**
     * @return Shutdown VLAN switching
     * 
     */
    public Output<Optional<Boolean>> shutdown() {
        return Codegen.optional(this.shutdown);
    }
    /**
     * a single VLAN id (allowed value range 1-4094)or Comma-separated VLAN id range.e.g. 99 or 1-30 or 1-20,30,40-50 - Range:
     * `1`-`4094`
     * 
     */
    @Export(name="vlanId", refs={Integer.class}, tree="[0]")
    private Output<Integer> vlanId;

    /**
     * @return a single VLAN id (allowed value range 1-4094)or Comma-separated VLAN id range.e.g. 99 or 1-30 or 1-20,30,40-50 - Range:
     * `1`-`4094`
     * 
     */
    public Output<Integer> vlanId() {
        return this.vlanId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Vlan(String name) {
        this(name, VlanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Vlan(String name, VlanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Vlan(String name, VlanArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/vlan:Vlan", name, args == null ? VlanArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Vlan(String name, Output<String> id, @Nullable VlanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/vlan:Vlan", name, state, makeResourceOptions(options, id));
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
    public static Vlan get(String name, Output<String> id, @Nullable VlanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Vlan(name, id, state, options);
    }
}
