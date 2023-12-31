// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.iosxe.Utilities;
import com.pulumi.iosxe.iosxe.StaticRouteArgs;
import com.pulumi.iosxe.iosxe.inputs.StaticRouteState;
import com.pulumi.iosxe.iosxe.outputs.StaticRouteNextHop;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource can manage the Static Route configuration.
 * 
 * ## Example Usage
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.iosxe.iosxe.StaticRoute;
 * import com.pulumi.iosxe.iosxe.StaticRouteArgs;
 * import com.pulumi.iosxe.iosxe.inputs.StaticRouteNextHopArgs;
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
 *         var example = new StaticRoute(&#34;example&#34;, StaticRouteArgs.builder()        
 *             .mask(&#34;255.255.255.255&#34;)
 *             .nextHops(StaticRouteNextHopArgs.builder()
 *                 .global(false)
 *                 .metric(10)
 *                 .name(&#34;Route1&#34;)
 *                 .next_hop(&#34;6.6.6.6&#34;)
 *                 .permanent(true)
 *                 .tag(100)
 *                 .build())
 *             .prefix(&#34;5.5.5.5&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import iosxe:iosxe/staticRoute:StaticRoute example &#34;Cisco-IOS-XE-native:native/ip/route/ip-route-interface-forwarding-list=5.5.5.5,255.255.255.255&#34;
 * ```
 * 
 */
@ResourceType(type="iosxe:iosxe/staticRoute:StaticRoute")
public class StaticRoute extends com.pulumi.resources.CustomResource {
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
    @Export(name="mask", refs={String.class}, tree="[0]")
    private Output<String> mask;

    public Output<String> mask() {
        return this.mask;
    }
    @Export(name="nextHops", refs={List.class,StaticRouteNextHop.class}, tree="[0,1]")
    private Output</* @Nullable */ List<StaticRouteNextHop>> nextHops;

    public Output<Optional<List<StaticRouteNextHop>>> nextHops() {
        return Codegen.optional(this.nextHops);
    }
    @Export(name="prefix", refs={String.class}, tree="[0]")
    private Output<String> prefix;

    public Output<String> prefix() {
        return this.prefix;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StaticRoute(String name) {
        this(name, StaticRouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StaticRoute(String name, StaticRouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StaticRoute(String name, StaticRouteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/staticRoute:StaticRoute", name, args == null ? StaticRouteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StaticRoute(String name, Output<String> id, @Nullable StaticRouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/staticRoute:StaticRoute", name, state, makeResourceOptions(options, id));
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
    public static StaticRoute get(String name, Output<String> id, @Nullable StaticRouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StaticRoute(name, id, state, options);
    }
}
