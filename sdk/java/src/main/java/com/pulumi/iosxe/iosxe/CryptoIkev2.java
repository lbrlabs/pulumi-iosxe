// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.iosxe.Utilities;
import com.pulumi.iosxe.iosxe.CryptoIkev2Args;
import com.pulumi.iosxe.iosxe.inputs.CryptoIkev2State;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource can manage the Crypto IKEv2 configuration.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.iosxe.iosxe.CryptoIkev2;
 * import com.pulumi.iosxe.iosxe.CryptoIkev2Args;
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
 *         var example = new CryptoIkev2(&#34;example&#34;, CryptoIkev2Args.builder()        
 *             .dpd(10)
 *             .dpdQuery(&#34;periodic&#34;)
 *             .dpdRetryInterval(5)
 *             .natKeepalive(20)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import iosxe:iosxe/cryptoIkev2:CryptoIkev2 example &#34;Cisco-IOS-XE-native:native/crypto/Cisco-IOS-XE-crypto:ikev2&#34;
 * ```
 * 
 */
@ResourceType(type="iosxe:iosxe/cryptoIkev2:CryptoIkev2")
public class CryptoIkev2 extends com.pulumi.resources.CustomResource {
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
     * Enable IKE liveness check for peers - Range: `10`-`3600`
     * 
     */
    @Export(name="dpd", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> dpd;

    /**
     * @return Enable IKE liveness check for peers - Range: `10`-`3600`
     * 
     */
    public Output<Optional<Integer>> dpd() {
        return Codegen.optional(this.dpd);
    }
    /**
     * - Choices: `on-demand`, `periodic`
     * 
     */
    @Export(name="dpdQuery", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dpdQuery;

    /**
     * @return - Choices: `on-demand`, `periodic`
     * 
     */
    public Output<Optional<String>> dpdQuery() {
        return Codegen.optional(this.dpdQuery);
    }
    /**
     * - Range: `2`-`60`
     * 
     */
    @Export(name="dpdRetryInterval", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> dpdRetryInterval;

    /**
     * @return - Range: `2`-`60`
     * 
     */
    public Output<Optional<Integer>> dpdRetryInterval() {
        return Codegen.optional(this.dpdRetryInterval);
    }
    /**
     * Set NAT keepalive interval - Range: `5`-`3600`
     * 
     */
    @Export(name="natKeepalive", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> natKeepalive;

    /**
     * @return Set NAT keepalive interval - Range: `5`-`3600`
     * 
     */
    public Output<Optional<Integer>> natKeepalive() {
        return Codegen.optional(this.natKeepalive);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CryptoIkev2(String name) {
        this(name, CryptoIkev2Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CryptoIkev2(String name, @Nullable CryptoIkev2Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CryptoIkev2(String name, @Nullable CryptoIkev2Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/cryptoIkev2:CryptoIkev2", name, args == null ? CryptoIkev2Args.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CryptoIkev2(String name, Output<String> id, @Nullable CryptoIkev2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/cryptoIkev2:CryptoIkev2", name, state, makeResourceOptions(options, id));
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
    public static CryptoIkev2 get(String name, Output<String> id, @Nullable CryptoIkev2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CryptoIkev2(name, id, state, options);
    }
}
