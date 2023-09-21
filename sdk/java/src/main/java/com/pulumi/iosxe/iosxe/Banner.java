// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.iosxe.Utilities;
import com.pulumi.iosxe.iosxe.BannerArgs;
import com.pulumi.iosxe.iosxe.inputs.BannerState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource can manage the Banner configuration.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.iosxe.iosxe.Banner;
 * import com.pulumi.iosxe.iosxe.BannerArgs;
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
 *         var example = new Banner(&#34;example&#34;, BannerArgs.builder()        
 *             .execBanner(&#34;My Exec Banner&#34;)
 *             .loginBanner(&#34;My Login Banner&#34;)
 *             .motdBanner(&#34;My MOTD Banner&#34;)
 *             .promptTimeoutBanner(&#34;My Prompt-Timeout Banner&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import iosxe:iosxe/banner:Banner example &#34;Cisco-IOS-XE-native:native/banner&#34;
 * ```
 * 
 */
@ResourceType(type="iosxe:iosxe/banner:Banner")
public class Banner extends com.pulumi.resources.CustomResource {
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
     * Banner message
     * 
     */
    @Export(name="execBanner", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> execBanner;

    /**
     * @return Banner message
     * 
     */
    public Output<Optional<String>> execBanner() {
        return Codegen.optional(this.execBanner);
    }
    /**
     * Banner message
     * 
     */
    @Export(name="loginBanner", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> loginBanner;

    /**
     * @return Banner message
     * 
     */
    public Output<Optional<String>> loginBanner() {
        return Codegen.optional(this.loginBanner);
    }
    /**
     * Banner message
     * 
     */
    @Export(name="motdBanner", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> motdBanner;

    /**
     * @return Banner message
     * 
     */
    public Output<Optional<String>> motdBanner() {
        return Codegen.optional(this.motdBanner);
    }
    /**
     * Banner message
     * 
     */
    @Export(name="promptTimeoutBanner", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> promptTimeoutBanner;

    /**
     * @return Banner message
     * 
     */
    public Output<Optional<String>> promptTimeoutBanner() {
        return Codegen.optional(this.promptTimeoutBanner);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Banner(String name) {
        this(name, BannerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Banner(String name, @Nullable BannerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Banner(String name, @Nullable BannerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/banner:Banner", name, args == null ? BannerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Banner(String name, Output<String> id, @Nullable BannerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/banner:Banner", name, state, makeResourceOptions(options, id));
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
    public static Banner get(String name, Output<String> id, @Nullable BannerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Banner(name, id, state, options);
    }
}
