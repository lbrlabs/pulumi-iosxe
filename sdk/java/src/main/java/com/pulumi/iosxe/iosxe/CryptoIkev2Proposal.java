// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.iosxe.Utilities;
import com.pulumi.iosxe.iosxe.CryptoIkev2ProposalArgs;
import com.pulumi.iosxe.iosxe.inputs.CryptoIkev2ProposalState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="iosxe:iosxe/cryptoIkev2Proposal:CryptoIkev2Proposal")
public class CryptoIkev2Proposal extends com.pulumi.resources.CustomResource {
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
     * AES-CBC-128
     * 
     */
    @Export(name="encryptionAesCbc128", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> encryptionAesCbc128;

    /**
     * @return AES-CBC-128
     * 
     */
    public Output<Optional<Boolean>> encryptionAesCbc128() {
        return Codegen.optional(this.encryptionAesCbc128);
    }
    /**
     * AES-CBC-192
     * 
     */
    @Export(name="encryptionAesCbc192", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> encryptionAesCbc192;

    /**
     * @return AES-CBC-192
     * 
     */
    public Output<Optional<Boolean>> encryptionAesCbc192() {
        return Codegen.optional(this.encryptionAesCbc192);
    }
    /**
     * AES-CBC-256
     * 
     */
    @Export(name="encryptionAesCbc256", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> encryptionAesCbc256;

    /**
     * @return AES-CBC-256
     * 
     */
    public Output<Optional<Boolean>> encryptionAesCbc256() {
        return Codegen.optional(this.encryptionAesCbc256);
    }
    /**
     * Combined-mode,128 bit key,16 byte ICV(Authentication Tag)
     * 
     */
    @Export(name="encryptionAesGcm128", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> encryptionAesGcm128;

    /**
     * @return Combined-mode,128 bit key,16 byte ICV(Authentication Tag)
     * 
     */
    public Output<Optional<Boolean>> encryptionAesGcm128() {
        return Codegen.optional(this.encryptionAesGcm128);
    }
    /**
     * Combined-mode,256 bit key,16 byte ICV(Authentication Tag)
     * 
     */
    @Export(name="encryptionAesGcm256", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> encryptionAesGcm256;

    /**
     * @return Combined-mode,256 bit key,16 byte ICV(Authentication Tag)
     * 
     */
    public Output<Optional<Boolean>> encryptionAesGcm256() {
        return Codegen.optional(this.encryptionAesGcm256);
    }
    /**
     * 3DES
     * 
     */
    @Export(name="encryptionEn3des", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> encryptionEn3des;

    /**
     * @return 3DES
     * 
     */
    public Output<Optional<Boolean>> encryptionEn3des() {
        return Codegen.optional(this.encryptionEn3des);
    }
    /**
     * DH 3072 MODP
     * 
     */
    @Export(name="groupFifteen", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> groupFifteen;

    /**
     * @return DH 3072 MODP
     * 
     */
    public Output<Optional<Boolean>> groupFifteen() {
        return Codegen.optional(this.groupFifteen);
    }
    /**
     * DH 2048 MODP
     * 
     */
    @Export(name="groupFourteen", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> groupFourteen;

    /**
     * @return DH 2048 MODP
     * 
     */
    public Output<Optional<Boolean>> groupFourteen() {
        return Codegen.optional(this.groupFourteen);
    }
    /**
     * DH 256 ECP
     * 
     */
    @Export(name="groupNineteen", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> groupNineteen;

    /**
     * @return DH 256 ECP
     * 
     */
    public Output<Optional<Boolean>> groupNineteen() {
        return Codegen.optional(this.groupNineteen);
    }
    /**
     * DH 768 MODP
     * 
     */
    @Export(name="groupOne", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> groupOne;

    /**
     * @return DH 768 MODP
     * 
     */
    public Output<Optional<Boolean>> groupOne() {
        return Codegen.optional(this.groupOne);
    }
    /**
     * DH 4096 MODP
     * 
     */
    @Export(name="groupSixteen", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> groupSixteen;

    /**
     * @return DH 4096 MODP
     * 
     */
    public Output<Optional<Boolean>> groupSixteen() {
        return Codegen.optional(this.groupSixteen);
    }
    /**
     * DH 384 ECP
     * 
     */
    @Export(name="groupTwenty", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> groupTwenty;

    /**
     * @return DH 384 ECP
     * 
     */
    public Output<Optional<Boolean>> groupTwenty() {
        return Codegen.optional(this.groupTwenty);
    }
    /**
     * DH 2048 (256 subgroup) MODP
     * 
     */
    @Export(name="groupTwentyFour", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> groupTwentyFour;

    /**
     * @return DH 2048 (256 subgroup) MODP
     * 
     */
    public Output<Optional<Boolean>> groupTwentyFour() {
        return Codegen.optional(this.groupTwentyFour);
    }
    /**
     * DH 521 ECP
     * 
     */
    @Export(name="groupTwentyOne", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> groupTwentyOne;

    /**
     * @return DH 521 ECP
     * 
     */
    public Output<Optional<Boolean>> groupTwentyOne() {
        return Codegen.optional(this.groupTwentyOne);
    }
    /**
     * DH 1024 MODP
     * 
     */
    @Export(name="groupTwo", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> groupTwo;

    /**
     * @return DH 1024 MODP
     * 
     */
    public Output<Optional<Boolean>> groupTwo() {
        return Codegen.optional(this.groupTwo);
    }
    /**
     * Message Digest 5
     * 
     */
    @Export(name="integrityMd5", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> integrityMd5;

    /**
     * @return Message Digest 5
     * 
     */
    public Output<Optional<Boolean>> integrityMd5() {
        return Codegen.optional(this.integrityMd5);
    }
    /**
     * Secure Hash Standard
     * 
     */
    @Export(name="integritySha1", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> integritySha1;

    /**
     * @return Secure Hash Standard
     * 
     */
    public Output<Optional<Boolean>> integritySha1() {
        return Codegen.optional(this.integritySha1);
    }
    /**
     * Secure Hash Standard 2 (256 bit)
     * 
     */
    @Export(name="integritySha256", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> integritySha256;

    /**
     * @return Secure Hash Standard 2 (256 bit)
     * 
     */
    public Output<Optional<Boolean>> integritySha256() {
        return Codegen.optional(this.integritySha256);
    }
    /**
     * Secure Hash Standard 2 (384 bit)
     * 
     */
    @Export(name="integritySha384", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> integritySha384;

    /**
     * @return Secure Hash Standard 2 (384 bit)
     * 
     */
    public Output<Optional<Boolean>> integritySha384() {
        return Codegen.optional(this.integritySha384);
    }
    /**
     * Secure Hash Standard 2 (512 bit)
     * 
     */
    @Export(name="integritySha512", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> integritySha512;

    /**
     * @return Secure Hash Standard 2 (512 bit)
     * 
     */
    public Output<Optional<Boolean>> integritySha512() {
        return Codegen.optional(this.integritySha512);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    /**
     * Message Digest 5
     * 
     */
    @Export(name="prfMd5", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> prfMd5;

    /**
     * @return Message Digest 5
     * 
     */
    public Output<Optional<Boolean>> prfMd5() {
        return Codegen.optional(this.prfMd5);
    }
    /**
     * Secure Hash Standard
     * 
     */
    @Export(name="prfSha1", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> prfSha1;

    /**
     * @return Secure Hash Standard
     * 
     */
    public Output<Optional<Boolean>> prfSha1() {
        return Codegen.optional(this.prfSha1);
    }
    /**
     * Secure Hash Standard 2 (256 bit)
     * 
     */
    @Export(name="prfSha256", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> prfSha256;

    /**
     * @return Secure Hash Standard 2 (256 bit)
     * 
     */
    public Output<Optional<Boolean>> prfSha256() {
        return Codegen.optional(this.prfSha256);
    }
    /**
     * Secure Hash Standard 2 (384 bit)
     * 
     */
    @Export(name="prfSha384", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> prfSha384;

    /**
     * @return Secure Hash Standard 2 (384 bit)
     * 
     */
    public Output<Optional<Boolean>> prfSha384() {
        return Codegen.optional(this.prfSha384);
    }
    /**
     * Secure Hash Standard 2 (512 bit)
     * 
     */
    @Export(name="prfSha512", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> prfSha512;

    /**
     * @return Secure Hash Standard 2 (512 bit)
     * 
     */
    public Output<Optional<Boolean>> prfSha512() {
        return Codegen.optional(this.prfSha512);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CryptoIkev2Proposal(String name) {
        this(name, CryptoIkev2ProposalArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CryptoIkev2Proposal(String name, @Nullable CryptoIkev2ProposalArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CryptoIkev2Proposal(String name, @Nullable CryptoIkev2ProposalArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/cryptoIkev2Proposal:CryptoIkev2Proposal", name, args == null ? CryptoIkev2ProposalArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CryptoIkev2Proposal(String name, Output<String> id, @Nullable CryptoIkev2ProposalState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("iosxe:iosxe/cryptoIkev2Proposal:CryptoIkev2Proposal", name, state, makeResourceOptions(options, id));
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
    public static CryptoIkev2Proposal get(String name, Output<String> id, @Nullable CryptoIkev2ProposalState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CryptoIkev2Proposal(name, id, state, options);
    }
}