// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.iosxe.Utilities;
import com.pulumi.iosxe.iosxe.AccessListStandardArgs;
import com.pulumi.iosxe.iosxe.inputs.AccessListStandardState;
import com.pulumi.iosxe.iosxe.outputs.AccessListStandardEntry;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource can manage the Access List Standard configuration.
 * 
 * ## Example Usage
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.iosxe.iosxe.AccessListStandard;
 * import com.pulumi.iosxe.iosxe.AccessListStandardArgs;
 * import com.pulumi.iosxe.iosxe.inputs.AccessListStandardEntryArgs;
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
 *         var example = new AccessListStandard(&#34;example&#34;, AccessListStandardArgs.builder()        
 *             .entries(AccessListStandardEntryArgs.builder()
 *                 .deny_log(true)
 *                 .deny_prefix(&#34;10.0.0.0&#34;)
 *                 .deny_prefix_mask(&#34;0.0.0.255&#34;)
 *                 .remark(&#34;Description&#34;)
 *                 .sequence(10)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import iosxe:iosxe/accessListStandard:AccessListStandard example &#34;Cisco-IOS-XE-native:native/ip/access-list/Cisco-IOS-XE-acl:standard=SACL1&#34;
 * ```
 * 
 */
@ResourceType(type="iosxe:iosxe/accessListStandard:AccessListStandard")
public class AccessListStandard extends com.pulumi.resources.CustomResource {
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
    @Export(name="entries", refs={List.class,AccessListStandardEntry.class}, tree="[0,1]")
    private Output</* @Nullable */ List<AccessListStandardEntry>> entries;

    public Output<Optional<List<AccessListStandardEntry>>> entries() {
        return Codegen.optional(this.entries);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessListStandard(String name) {
        this(name, AccessListStandardArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessListStandard(String name, @Nullable AccessListStandardArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessListStandard(String name, @Nullable AccessListStandardArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/accessListStandard:AccessListStandard", name, args == null ? AccessListStandardArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessListStandard(String name, Output<String> id, @Nullable AccessListStandardState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/accessListStandard:AccessListStandard", name, state, makeResourceOptions(options, id));
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
    public static AccessListStandard get(String name, Output<String> id, @Nullable AccessListStandardState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessListStandard(name, id, state, options);
    }
}
