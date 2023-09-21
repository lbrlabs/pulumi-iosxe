// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.iosxe.Utilities;
import com.pulumi.iosxe.iosxe.MsdpVrfArgs;
import com.pulumi.iosxe.iosxe.inputs.MsdpVrfState;
import com.pulumi.iosxe.iosxe.outputs.MsdpVrfPassword;
import com.pulumi.iosxe.iosxe.outputs.MsdpVrfPeer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="iosxe:iosxe/msdpVrf:MsdpVrf")
public class MsdpVrf extends com.pulumi.resources.CustomResource {
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
     * Configure MSDP Originator ID
     * 
     */
    @Export(name="originatorId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> originatorId;

    /**
     * @return Configure MSDP Originator ID
     * 
     */
    public Output<Optional<String>> originatorId() {
        return Codegen.optional(this.originatorId);
    }
    /**
     * MSDP peer on which the password is to be set
     * 
     */
    @Export(name="passwords", refs={List.class,MsdpVrfPassword.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MsdpVrfPassword>> passwords;

    /**
     * @return MSDP peer on which the password is to be set
     * 
     */
    public Output<Optional<List<MsdpVrfPassword>>> passwords() {
        return Codegen.optional(this.passwords);
    }
    /**
     * Configure an MSDP peer
     * 
     */
    @Export(name="peers", refs={List.class,MsdpVrfPeer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MsdpVrfPeer>> peers;

    /**
     * @return Configure an MSDP peer
     * 
     */
    public Output<Optional<List<MsdpVrfPeer>>> peers() {
        return Codegen.optional(this.peers);
    }
    @Export(name="vrf", refs={String.class}, tree="[0]")
    private Output<String> vrf;

    public Output<String> vrf() {
        return this.vrf;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MsdpVrf(String name) {
        this(name, MsdpVrfArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MsdpVrf(String name, MsdpVrfArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MsdpVrf(String name, MsdpVrfArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/msdpVrf:MsdpVrf", name, args == null ? MsdpVrfArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MsdpVrf(String name, Output<String> id, @Nullable MsdpVrfState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/msdpVrf:MsdpVrf", name, state, makeResourceOptions(options, id));
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
    public static MsdpVrf get(String name, Output<String> id, @Nullable MsdpVrfState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MsdpVrf(name, id, state, options);
    }
}