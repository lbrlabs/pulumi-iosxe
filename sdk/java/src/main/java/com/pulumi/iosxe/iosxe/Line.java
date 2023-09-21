// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.iosxe.Utilities;
import com.pulumi.iosxe.iosxe.LineArgs;
import com.pulumi.iosxe.iosxe.inputs.LineState;
import com.pulumi.iosxe.iosxe.outputs.LineConsole;
import com.pulumi.iosxe.iosxe.outputs.LineVty;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="iosxe:iosxe/line:Line")
public class Line extends com.pulumi.resources.CustomResource {
    /**
     * Primary terminal line
     * 
     */
    @Export(name="consoles", refs={List.class,LineConsole.class}, tree="[0,1]")
    private Output</* @Nullable */ List<LineConsole>> consoles;

    /**
     * @return Primary terminal line
     * 
     */
    public Output<Optional<List<LineConsole>>> consoles() {
        return Codegen.optional(this.consoles);
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
     * Virtual terminal
     * 
     */
    @Export(name="vties", refs={List.class,LineVty.class}, tree="[0,1]")
    private Output</* @Nullable */ List<LineVty>> vties;

    /**
     * @return Virtual terminal
     * 
     */
    public Output<Optional<List<LineVty>>> vties() {
        return Codegen.optional(this.vties);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Line(String name) {
        this(name, LineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Line(String name, @Nullable LineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Line(String name, @Nullable LineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/line:Line", name, args == null ? LineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Line(String name, Output<String> id, @Nullable LineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/line:Line", name, state, makeResourceOptions(options, id));
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
    public static Line get(String name, Output<String> id, @Nullable LineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Line(name, id, state, options);
    }
}