// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.iosxe.Utilities;
import com.pulumi.iosxe.iosxe.CryptoIpsecProfileArgs;
import com.pulumi.iosxe.iosxe.inputs.CryptoIpsecProfileState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource can manage the Crypto IPSec Profile configuration.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.iosxe.iosxe.CryptoIpsecProfile;
 * import com.pulumi.iosxe.iosxe.CryptoIpsecProfileArgs;
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
 *         var example = new CryptoIpsecProfile(&#34;example&#34;, CryptoIpsecProfileArgs.builder()        
 *             .setIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile(&#34;vpn300&#34;)
 *             .setTransformSets(&#34;TS1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import iosxe:iosxe/cryptoIpsecProfile:CryptoIpsecProfile example &#34;Cisco-IOS-XE-native:native/crypto/Cisco-IOS-XE-crypto:ipsec/profile=vpn200&#34;
 * ```
 * 
 */
@ResourceType(type="iosxe:iosxe/cryptoIpsecProfile:CryptoIpsecProfile")
public class CryptoIpsecProfile extends com.pulumi.resources.CustomResource {
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
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    /**
     * Specify ikev2 Profile
     * 
     */
    @Export(name="setIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> setIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile;

    /**
     * @return Specify ikev2 Profile
     * 
     */
    public Output<Optional<String>> setIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile() {
        return Codegen.optional(this.setIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile);
    }
    /**
     * Specify isakmp Profile
     * 
     */
    @Export(name="setIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> setIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile;

    /**
     * @return Specify isakmp Profile
     * 
     */
    public Output<Optional<String>> setIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile() {
        return Codegen.optional(this.setIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile);
    }
    /**
     * Specify list of transform sets in priority order
     * 
     */
    @Export(name="setTransformSets", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> setTransformSets;

    /**
     * @return Specify list of transform sets in priority order
     * 
     */
    public Output<Optional<List<String>>> setTransformSets() {
        return Codegen.optional(this.setTransformSets);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CryptoIpsecProfile(String name) {
        this(name, CryptoIpsecProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CryptoIpsecProfile(String name, @Nullable CryptoIpsecProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CryptoIpsecProfile(String name, @Nullable CryptoIpsecProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/cryptoIpsecProfile:CryptoIpsecProfile", name, args == null ? CryptoIpsecProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CryptoIpsecProfile(String name, Output<String> id, @Nullable CryptoIpsecProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/cryptoIpsecProfile:CryptoIpsecProfile", name, state, makeResourceOptions(options, id));
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
    public static CryptoIpsecProfile get(String name, Output<String> id, @Nullable CryptoIpsecProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CryptoIpsecProfile(name, id, state, options);
    }
}
