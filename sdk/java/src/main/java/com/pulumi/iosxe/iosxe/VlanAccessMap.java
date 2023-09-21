// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.iosxe.Utilities;
import com.pulumi.iosxe.iosxe.VlanAccessMapArgs;
import com.pulumi.iosxe.iosxe.inputs.VlanAccessMapState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="iosxe:iosxe/vlanAccessMap:VlanAccessMap")
public class VlanAccessMap extends com.pulumi.resources.CustomResource {
    /**
     * Take the action - Choices: `drop`, `forward`
     * 
     */
    @Export(name="action", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> action;

    /**
     * @return Take the action - Choices: `drop`, `forward`
     * 
     */
    public Output<Optional<String>> action() {
        return Codegen.optional(this.action);
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
    @Export(name="matchIpAddresses", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> matchIpAddresses;

    public Output<Optional<List<String>>> matchIpAddresses() {
        return Codegen.optional(this.matchIpAddresses);
    }
    /**
     * Match IPv6 address to access control.
     * 
     */
    @Export(name="matchIpv6Addresses", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> matchIpv6Addresses;

    /**
     * @return Match IPv6 address to access control.
     * 
     */
    public Output<Optional<List<String>>> matchIpv6Addresses() {
        return Codegen.optional(this.matchIpv6Addresses);
    }
    /**
     * Vlan access map tag
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Vlan access map tag
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Sequence to insert to/delete from existing vlan access-map entry - Range: `0`-`65535`
     * 
     */
    @Export(name="sequence", refs={Integer.class}, tree="[0]")
    private Output<Integer> sequence;

    /**
     * @return Sequence to insert to/delete from existing vlan access-map entry - Range: `0`-`65535`
     * 
     */
    public Output<Integer> sequence() {
        return this.sequence;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VlanAccessMap(String name) {
        this(name, VlanAccessMapArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VlanAccessMap(String name, VlanAccessMapArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VlanAccessMap(String name, VlanAccessMapArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/vlanAccessMap:VlanAccessMap", name, args == null ? VlanAccessMapArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VlanAccessMap(String name, Output<String> id, @Nullable VlanAccessMapState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/vlanAccessMap:VlanAccessMap", name, state, makeResourceOptions(options, id));
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
    public static VlanAccessMap get(String name, Output<String> id, @Nullable VlanAccessMapState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VlanAccessMap(name, id, state, options);
    }
}