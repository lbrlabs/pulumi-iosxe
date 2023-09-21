// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.iosxe.Utilities;
import com.pulumi.iosxe.iosxe.CryptoIkev2KeyringArgs;
import com.pulumi.iosxe.iosxe.inputs.CryptoIkev2KeyringState;
import com.pulumi.iosxe.iosxe.outputs.CryptoIkev2KeyringPeer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="iosxe:iosxe/cryptoIkev2Keyring:CryptoIkev2Keyring")
public class CryptoIkev2Keyring extends com.pulumi.resources.CustomResource {
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
     * Configure a Peer and associated keys
     * 
     */
    @Export(name="peers", refs={List.class,CryptoIkev2KeyringPeer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CryptoIkev2KeyringPeer>> peers;

    /**
     * @return Configure a Peer and associated keys
     * 
     */
    public Output<Optional<List<CryptoIkev2KeyringPeer>>> peers() {
        return Codegen.optional(this.peers);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CryptoIkev2Keyring(String name) {
        this(name, CryptoIkev2KeyringArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CryptoIkev2Keyring(String name, @Nullable CryptoIkev2KeyringArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CryptoIkev2Keyring(String name, @Nullable CryptoIkev2KeyringArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/cryptoIkev2Keyring:CryptoIkev2Keyring", name, args == null ? CryptoIkev2KeyringArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CryptoIkev2Keyring(String name, Output<String> id, @Nullable CryptoIkev2KeyringState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/cryptoIkev2Keyring:CryptoIkev2Keyring", name, state, makeResourceOptions(options, id));
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
    public static CryptoIkev2Keyring get(String name, Output<String> id, @Nullable CryptoIkev2KeyringState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CryptoIkev2Keyring(name, id, state, options);
    }
}