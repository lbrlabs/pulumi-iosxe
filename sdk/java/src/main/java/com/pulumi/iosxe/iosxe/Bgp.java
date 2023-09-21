// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.iosxe.Utilities;
import com.pulumi.iosxe.iosxe.BgpArgs;
import com.pulumi.iosxe.iosxe.inputs.BgpState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="iosxe:iosxe/bgp:Bgp")
public class Bgp extends com.pulumi.resources.CustomResource {
    @Export(name="asn", refs={String.class}, tree="[0]")
    private Output<String> asn;

    public Output<String> asn() {
        return this.asn;
    }
    /**
     * Activate ipv4-unicast for a peer by default
     * 
     */
    @Export(name="defaultIpv4Unicast", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> defaultIpv4Unicast;

    /**
     * @return Activate ipv4-unicast for a peer by default
     * 
     */
    public Output<Optional<Boolean>> defaultIpv4Unicast() {
        return Codegen.optional(this.defaultIpv4Unicast);
    }
    /**
     * Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
     * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
     * Default value is `all`. - Choices: `all`, `attributes`
     * 
     */
    @Export(name="deleteMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deleteMode;

    /**
     * @return Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
     * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
     * Default value is `all`. - Choices: `all`, `attributes`
     * 
     */
    public Output<Optional<String>> deleteMode() {
        return Codegen.optional(this.deleteMode);
    }
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
     * Log neighbor up/down and reset reason
     * 
     */
    @Export(name="logNeighborChanges", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> logNeighborChanges;

    /**
     * @return Log neighbor up/down and reset reason
     * 
     */
    public Output<Optional<Boolean>> logNeighborChanges() {
        return Codegen.optional(this.logNeighborChanges);
    }
    /**
     * Loopback interface - Range: `0`-`2147483647`
     * 
     */
    @Export(name="routerIdLoopback", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> routerIdLoopback;

    /**
     * @return Loopback interface - Range: `0`-`2147483647`
     * 
     */
    public Output<Optional<Integer>> routerIdLoopback() {
        return Codegen.optional(this.routerIdLoopback);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Bgp(String name) {
        this(name, BgpArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Bgp(String name, BgpArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Bgp(String name, BgpArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/bgp:Bgp", name, args == null ? BgpArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Bgp(String name, Output<String> id, @Nullable BgpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/bgp:Bgp", name, state, makeResourceOptions(options, id));
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
    public static Bgp get(String name, Output<String> id, @Nullable BgpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Bgp(name, id, state, options);
    }
}