// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CryptoIpsecProfileState extends com.pulumi.resources.ResourceArgs {

    public static final CryptoIpsecProfileState Empty = new CryptoIpsecProfileState();

    /**
     * A device name from the provider configuration.
     * 
     */
    @Import(name="device")
    private @Nullable Output<String> device;

    /**
     * @return A device name from the provider configuration.
     * 
     */
    public Optional<Output<String>> device() {
        return Optional.ofNullable(this.device);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specify ikev2 Profile
     * 
     */
    @Import(name="setIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile")
    private @Nullable Output<String> setIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile;

    /**
     * @return Specify ikev2 Profile
     * 
     */
    public Optional<Output<String>> setIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile() {
        return Optional.ofNullable(this.setIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile);
    }

    /**
     * Specify isakmp Profile
     * 
     */
    @Import(name="setIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile")
    private @Nullable Output<String> setIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile;

    /**
     * @return Specify isakmp Profile
     * 
     */
    public Optional<Output<String>> setIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile() {
        return Optional.ofNullable(this.setIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile);
    }

    /**
     * Specify list of transform sets in priority order
     * 
     */
    @Import(name="setTransformSets")
    private @Nullable Output<List<String>> setTransformSets;

    /**
     * @return Specify list of transform sets in priority order
     * 
     */
    public Optional<Output<List<String>>> setTransformSets() {
        return Optional.ofNullable(this.setTransformSets);
    }

    private CryptoIpsecProfileState() {}

    private CryptoIpsecProfileState(CryptoIpsecProfileState $) {
        this.device = $.device;
        this.name = $.name;
        this.setIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile = $.setIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile;
        this.setIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile = $.setIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile;
        this.setTransformSets = $.setTransformSets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CryptoIpsecProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CryptoIpsecProfileState $;

        public Builder() {
            $ = new CryptoIpsecProfileState();
        }

        public Builder(CryptoIpsecProfileState defaults) {
            $ = new CryptoIpsecProfileState(Objects.requireNonNull(defaults));
        }

        /**
         * @param device A device name from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder device(@Nullable Output<String> device) {
            $.device = device;
            return this;
        }

        /**
         * @param device A device name from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder device(String device) {
            return device(Output.of(device));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param setIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile Specify ikev2 Profile
         * 
         * @return builder
         * 
         */
        public Builder setIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile(@Nullable Output<String> setIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile) {
            $.setIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile = setIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile;
            return this;
        }

        /**
         * @param setIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile Specify ikev2 Profile
         * 
         * @return builder
         * 
         */
        public Builder setIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile(String setIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile) {
            return setIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile(Output.of(setIsakmpProfileIkev2ProfileIkev2ProfileCaseIkev2Profile));
        }

        /**
         * @param setIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile Specify isakmp Profile
         * 
         * @return builder
         * 
         */
        public Builder setIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile(@Nullable Output<String> setIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile) {
            $.setIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile = setIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile;
            return this;
        }

        /**
         * @param setIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile Specify isakmp Profile
         * 
         * @return builder
         * 
         */
        public Builder setIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile(String setIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile) {
            return setIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile(Output.of(setIsakmpProfileIkev2ProfileIsakmpProfileCaseIsakmpProfile));
        }

        /**
         * @param setTransformSets Specify list of transform sets in priority order
         * 
         * @return builder
         * 
         */
        public Builder setTransformSets(@Nullable Output<List<String>> setTransformSets) {
            $.setTransformSets = setTransformSets;
            return this;
        }

        /**
         * @param setTransformSets Specify list of transform sets in priority order
         * 
         * @return builder
         * 
         */
        public Builder setTransformSets(List<String> setTransformSets) {
            return setTransformSets(Output.of(setTransformSets));
        }

        /**
         * @param setTransformSets Specify list of transform sets in priority order
         * 
         * @return builder
         * 
         */
        public Builder setTransformSets(String... setTransformSets) {
            return setTransformSets(List.of(setTransformSets));
        }

        public CryptoIpsecProfileState build() {
            return $;
        }
    }

}
