// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.iosxe.Utilities;
import com.pulumi.iosxe.iosxe.Dot1xArgs;
import com.pulumi.iosxe.iosxe.inputs.Dot1xState;
import com.pulumi.iosxe.iosxe.outputs.Dot1xCredential;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource can manage the Dot1x configuration.
 * 
 * ## Example Usage
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.iosxe.iosxe.Dot1x;
 * import com.pulumi.iosxe.iosxe.Dot1xArgs;
 * import com.pulumi.iosxe.iosxe.inputs.Dot1xCredentialArgs;
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
 *         var example = new Dot1x(&#34;example&#34;, Dot1xArgs.builder()        
 *             .authFailEapol(true)
 *             .credentials(Dot1xCredentialArgs.builder()
 *                 .anonymous_id(&#34;1&#34;)
 *                 .description(&#34;credential_profile_name&#34;)
 *                 .password(&#34;password123&#34;)
 *                 .password_type(&#34;0&#34;)
 *                 .pki_trustpoint(&#34;trustpoint1&#34;)
 *                 .profile_name(&#34;profile1&#34;)
 *                 .username(&#34;username1&#34;)
 *                 .build())
 *             .criticalEapolConfigBlock(true)
 *             .loggingVerbose(true)
 *             .supplicantControlledTransient(true)
 *             .supplicantForceMulticast(true)
 *             .systemAuthControl(true)
 *             .testTimeout(1000)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import iosxe:iosxe/dot1x:Dot1x example &#34;Cisco-IOS-XE-native:native/dot1x&#34;
 * ```
 * 
 */
@ResourceType(type="iosxe:iosxe/dot1x:Dot1x")
public class Dot1x extends com.pulumi.resources.CustomResource {
    /**
     * Send EAPOL-Success on successful auth-fail Authorization
     * 
     */
    @Export(name="authFailEapol", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> authFailEapol;

    /**
     * @return Send EAPOL-Success on successful auth-fail Authorization
     * 
     */
    public Output<Optional<Boolean>> authFailEapol() {
        return Codegen.optional(this.authFailEapol);
    }
    /**
     * Configure 802.1X credentials profiles
     * 
     */
    @Export(name="credentials", refs={List.class,Dot1xCredential.class}, tree="[0,1]")
    private Output</* @Nullable */ List<Dot1xCredential>> credentials;

    /**
     * @return Configure 802.1X credentials profiles
     * 
     */
    public Output<Optional<List<Dot1xCredential>>> credentials() {
        return Codegen.optional(this.credentials);
    }
    /**
     * Block all EAPoL transaction on Critical Authentication
     * 
     */
    @Export(name="criticalEapolConfigBlock", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> criticalEapolConfigBlock;

    /**
     * @return Block all EAPoL transaction on Critical Authentication
     * 
     */
    public Output<Optional<Boolean>> criticalEapolConfigBlock() {
        return Codegen.optional(this.criticalEapolConfigBlock);
    }
    /**
     * Set 802.1x Critical Authentication Recovery Delay period - Range: `1`-`10000`
     * 
     */
    @Export(name="criticalRecoveryDelay", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> criticalRecoveryDelay;

    /**
     * @return Set 802.1x Critical Authentication Recovery Delay period - Range: `1`-`10000`
     * 
     */
    public Output<Optional<Integer>> criticalRecoveryDelay() {
        return Codegen.optional(this.criticalRecoveryDelay);
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
     * Show verbose messages in system logs
     * 
     */
    @Export(name="loggingVerbose", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> loggingVerbose;

    /**
     * @return Show verbose messages in system logs
     * 
     */
    public Output<Optional<Boolean>> loggingVerbose() {
        return Codegen.optional(this.loggingVerbose);
    }
    /**
     * Controlled access is only applied during authentication
     * 
     */
    @Export(name="supplicantControlledTransient", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> supplicantControlledTransient;

    /**
     * @return Controlled access is only applied during authentication
     * 
     */
    public Output<Optional<Boolean>> supplicantControlledTransient() {
        return Codegen.optional(this.supplicantControlledTransient);
    }
    /**
     * Force 802.1X supplicant to send multicast packets
     * 
     */
    @Export(name="supplicantForceMulticast", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> supplicantForceMulticast;

    /**
     * @return Force 802.1X supplicant to send multicast packets
     * 
     */
    public Output<Optional<Boolean>> supplicantForceMulticast() {
        return Codegen.optional(this.supplicantForceMulticast);
    }
    /**
     * Enable or Disable SysAuthControl
     * 
     */
    @Export(name="systemAuthControl", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> systemAuthControl;

    /**
     * @return Enable or Disable SysAuthControl
     * 
     */
    public Output<Optional<Boolean>> systemAuthControl() {
        return Codegen.optional(this.systemAuthControl);
    }
    /**
     * Timeout for device EAPOL capabilities test in seconds - Range: `1`-`65535`
     * 
     */
    @Export(name="testTimeout", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> testTimeout;

    /**
     * @return Timeout for device EAPOL capabilities test in seconds - Range: `1`-`65535`
     * 
     */
    public Output<Optional<Integer>> testTimeout() {
        return Codegen.optional(this.testTimeout);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Dot1x(String name) {
        this(name, Dot1xArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Dot1x(String name, @Nullable Dot1xArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Dot1x(String name, @Nullable Dot1xArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/dot1x:Dot1x", name, args == null ? Dot1xArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Dot1x(String name, Output<String> id, @Nullable Dot1xState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/dot1x:Dot1x", name, state, makeResourceOptions(options, id));
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
    public static Dot1x get(String name, Output<String> id, @Nullable Dot1xState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Dot1x(name, id, state, options);
    }
}
