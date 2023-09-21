// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.iosxe.Utilities;
import com.pulumi.iosxe.iosxe.UsernameArgs;
import com.pulumi.iosxe.iosxe.inputs.UsernameState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource can manage the Username configuration.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.iosxe.iosxe.Username;
 * import com.pulumi.iosxe.iosxe.UsernameArgs;
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
 *         var example = new Username(&#34;example&#34;, UsernameArgs.builder()        
 *             .description(&#34;User1 description&#34;)
 *             .password(&#34;MyPassword&#34;)
 *             .passwordEncryption(&#34;0&#34;)
 *             .privilege(15)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import iosxe:iosxe/username:Username example &#34;Cisco-IOS-XE-native:native/username=user1&#34;
 * ```
 * 
 */
@ResourceType(type="iosxe:iosxe/username:Username")
public class Username extends com.pulumi.resources.CustomResource {
    /**
     * description string with max 128 characters
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return description string with max 128 characters
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
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
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> password;

    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }
    /**
     * - Choices: `0`, `6`, `7`
     * 
     */
    @Export(name="passwordEncryption", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> passwordEncryption;

    /**
     * @return - Choices: `0`, `6`, `7`
     * 
     */
    public Output<Optional<String>> passwordEncryption() {
        return Codegen.optional(this.passwordEncryption);
    }
    /**
     * Set user privilege level - Range: `0`-`15`
     * 
     */
    @Export(name="privilege", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> privilege;

    /**
     * @return Set user privilege level - Range: `0`-`15`
     * 
     */
    public Output<Optional<Integer>> privilege() {
        return Codegen.optional(this.privilege);
    }
    @Export(name="secret", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> secret;

    public Output<Optional<String>> secret() {
        return Codegen.optional(this.secret);
    }
    /**
     * - Choices: `0`, `5`, `8`, `9`
     * 
     */
    @Export(name="secretEncryption", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> secretEncryption;

    /**
     * @return - Choices: `0`, `5`, `8`, `9`
     * 
     */
    public Output<Optional<String>> secretEncryption() {
        return Codegen.optional(this.secretEncryption);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Username(String name) {
        this(name, UsernameArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Username(String name, @Nullable UsernameArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Username(String name, @Nullable UsernameArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/username:Username", name, args == null ? UsernameArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Username(String name, Output<String> id, @Nullable UsernameState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/username:Username", name, state, makeResourceOptions(options, id));
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
    public static Username get(String name, Output<String> id, @Nullable UsernameState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Username(name, id, state, options);
    }
}
