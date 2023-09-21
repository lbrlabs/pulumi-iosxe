// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.iosxe.Utilities;
import com.pulumi.iosxe.iosxe.VlanConfigurationArgs;
import com.pulumi.iosxe.iosxe.inputs.VlanConfigurationState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="iosxe:iosxe/vlanConfiguration:VlanConfiguration")
public class VlanConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * Enter VFI name
     * 
     */
    @Export(name="accessVfi", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accessVfi;

    /**
     * @return Enter VFI name
     * 
     */
    public Output<Optional<String>> accessVfi() {
        return Codegen.optional(this.accessVfi);
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
     * - Range: `1`-`65535`
     * 
     */
    @Export(name="evpnInstance", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> evpnInstance;

    /**
     * @return - Range: `1`-`65535`
     * 
     */
    public Output<Optional<Integer>> evpnInstance() {
        return Codegen.optional(this.evpnInstance);
    }
    /**
     * VxLAN VNI value - Range: `4096`-`16777215`
     * 
     */
    @Export(name="evpnInstanceVni", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> evpnInstanceVni;

    /**
     * @return VxLAN VNI value - Range: `4096`-`16777215`
     * 
     */
    public Output<Optional<Integer>> evpnInstanceVni() {
        return Codegen.optional(this.evpnInstanceVni);
    }
    /**
     * VLAN ID List Eg. 1-10,15 - Range: `1`-`4094`
     * 
     */
    @Export(name="vlanId", refs={Integer.class}, tree="[0]")
    private Output<Integer> vlanId;

    /**
     * @return VLAN ID List Eg. 1-10,15 - Range: `1`-`4094`
     * 
     */
    public Output<Integer> vlanId() {
        return this.vlanId;
    }
    /**
     * VxLAN VNI value - Range: `4096`-`16777215`
     * 
     */
    @Export(name="vni", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> vni;

    /**
     * @return VxLAN VNI value - Range: `4096`-`16777215`
     * 
     */
    public Output<Optional<Integer>> vni() {
        return Codegen.optional(this.vni);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VlanConfiguration(String name) {
        this(name, VlanConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VlanConfiguration(String name, VlanConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VlanConfiguration(String name, VlanConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/vlanConfiguration:VlanConfiguration", name, args == null ? VlanConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VlanConfiguration(String name, Output<String> id, @Nullable VlanConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/vlanConfiguration:VlanConfiguration", name, state, makeResourceOptions(options, id));
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
    public static VlanConfiguration get(String name, Output<String> id, @Nullable VlanConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VlanConfiguration(name, id, state, options);
    }
}