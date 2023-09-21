// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.iosxe.Utilities;
import com.pulumi.iosxe.iosxe.StaticRouteVrfArgs;
import com.pulumi.iosxe.iosxe.inputs.StaticRouteVrfState;
import com.pulumi.iosxe.iosxe.outputs.StaticRouteVrfRoute;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="iosxe:iosxe/staticRouteVrf:StaticRouteVrf")
public class StaticRouteVrf extends com.pulumi.resources.CustomResource {
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
    @Export(name="routes", refs={List.class,StaticRouteVrfRoute.class}, tree="[0,1]")
    private Output</* @Nullable */ List<StaticRouteVrfRoute>> routes;

    public Output<Optional<List<StaticRouteVrfRoute>>> routes() {
        return Codegen.optional(this.routes);
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
    public StaticRouteVrf(String name) {
        this(name, StaticRouteVrfArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StaticRouteVrf(String name, StaticRouteVrfArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StaticRouteVrf(String name, StaticRouteVrfArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/staticRouteVrf:StaticRouteVrf", name, args == null ? StaticRouteVrfArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StaticRouteVrf(String name, Output<String> id, @Nullable StaticRouteVrfState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/staticRouteVrf:StaticRouteVrf", name, state, makeResourceOptions(options, id));
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
    public static StaticRouteVrf get(String name, Output<String> id, @Nullable StaticRouteVrfState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StaticRouteVrf(name, id, state, options);
    }
}
