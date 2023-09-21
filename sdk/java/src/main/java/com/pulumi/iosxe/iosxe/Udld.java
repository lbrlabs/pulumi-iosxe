// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.iosxe.Utilities;
import com.pulumi.iosxe.iosxe.UdldArgs;
import com.pulumi.iosxe.iosxe.inputs.UdldState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="iosxe:iosxe/udld:Udld")
public class Udld extends com.pulumi.resources.CustomResource {
    /**
     * Enable UDLD protocol in aggressive mode on fiber ports exceptwhere locally configured
     * 
     */
    @Export(name="aggressive", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> aggressive;

    /**
     * @return Enable UDLD protocol in aggressive mode on fiber ports exceptwhere locally configured
     * 
     */
    public Output<Optional<Boolean>> aggressive() {
        return Codegen.optional(this.aggressive);
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
     * Enable UDLD protocol on fiber ports except where locally configured
     * 
     */
    @Export(name="enable", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enable;

    /**
     * @return Enable UDLD protocol on fiber ports except where locally configured
     * 
     */
    public Output<Optional<Boolean>> enable() {
        return Codegen.optional(this.enable);
    }
    /**
     * Set UDLD message time period - Range: `1`-`90`
     * 
     */
    @Export(name="messageTime", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> messageTime;

    /**
     * @return Set UDLD message time period - Range: `1`-`90`
     * 
     */
    public Output<Optional<Integer>> messageTime() {
        return Codegen.optional(this.messageTime);
    }
    /**
     * timer-interval(sec) - Range: `30`-`86400`
     * 
     */
    @Export(name="recoveryInterval", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> recoveryInterval;

    /**
     * @return timer-interval(sec) - Range: `30`-`86400`
     * 
     */
    public Output<Optional<Integer>> recoveryInterval() {
        return Codegen.optional(this.recoveryInterval);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Udld(String name) {
        this(name, UdldArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Udld(String name, @Nullable UdldArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Udld(String name, @Nullable UdldArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/udld:Udld", name, args == null ? UdldArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Udld(String name, Output<String> id, @Nullable UdldState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/udld:Udld", name, state, makeResourceOptions(options, id));
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
    public static Udld get(String name, Output<String> id, @Nullable UdldState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Udld(name, id, state, options);
    }
}