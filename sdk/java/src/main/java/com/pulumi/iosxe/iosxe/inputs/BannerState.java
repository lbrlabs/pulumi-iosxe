// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BannerState extends com.pulumi.resources.ResourceArgs {

    public static final BannerState Empty = new BannerState();

    /**
     * Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
     * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
     * Default value is `all`. - Choices: `all`, `attributes`
     * 
     */
    @Import(name="deleteMode")
    private @Nullable Output<String> deleteMode;

    /**
     * @return Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
     * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
     * Default value is `all`. - Choices: `all`, `attributes`
     * 
     */
    public Optional<Output<String>> deleteMode() {
        return Optional.ofNullable(this.deleteMode);
    }

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

    /**
     * Banner message
     * 
     */
    @Import(name="execBanner")
    private @Nullable Output<String> execBanner;

    /**
     * @return Banner message
     * 
     */
    public Optional<Output<String>> execBanner() {
        return Optional.ofNullable(this.execBanner);
    }

    /**
     * Banner message
     * 
     */
    @Import(name="loginBanner")
    private @Nullable Output<String> loginBanner;

    /**
     * @return Banner message
     * 
     */
    public Optional<Output<String>> loginBanner() {
        return Optional.ofNullable(this.loginBanner);
    }

    /**
     * Banner message
     * 
     */
    @Import(name="motdBanner")
    private @Nullable Output<String> motdBanner;

    /**
     * @return Banner message
     * 
     */
    public Optional<Output<String>> motdBanner() {
        return Optional.ofNullable(this.motdBanner);
    }

    /**
     * Banner message
     * 
     */
    @Import(name="promptTimeoutBanner")
    private @Nullable Output<String> promptTimeoutBanner;

    /**
     * @return Banner message
     * 
     */
    public Optional<Output<String>> promptTimeoutBanner() {
        return Optional.ofNullable(this.promptTimeoutBanner);
    }

    private BannerState() {}

    private BannerState(BannerState $) {
        this.deleteMode = $.deleteMode;
        this.device = $.device;
        this.execBanner = $.execBanner;
        this.loginBanner = $.loginBanner;
        this.motdBanner = $.motdBanner;
        this.promptTimeoutBanner = $.promptTimeoutBanner;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BannerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BannerState $;

        public Builder() {
            $ = new BannerState();
        }

        public Builder(BannerState defaults) {
            $ = new BannerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param deleteMode Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
         * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
         * Default value is `all`. - Choices: `all`, `attributes`
         * 
         * @return builder
         * 
         */
        public Builder deleteMode(@Nullable Output<String> deleteMode) {
            $.deleteMode = deleteMode;
            return this;
        }

        /**
         * @param deleteMode Configure behavior when deleting/destroying the resource. Either delete the entire object (YANG container) being
         * managed, or only delete the individual resource attributes configured explicitly and leave everything else as-is.
         * Default value is `all`. - Choices: `all`, `attributes`
         * 
         * @return builder
         * 
         */
        public Builder deleteMode(String deleteMode) {
            return deleteMode(Output.of(deleteMode));
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

        /**
         * @param execBanner Banner message
         * 
         * @return builder
         * 
         */
        public Builder execBanner(@Nullable Output<String> execBanner) {
            $.execBanner = execBanner;
            return this;
        }

        /**
         * @param execBanner Banner message
         * 
         * @return builder
         * 
         */
        public Builder execBanner(String execBanner) {
            return execBanner(Output.of(execBanner));
        }

        /**
         * @param loginBanner Banner message
         * 
         * @return builder
         * 
         */
        public Builder loginBanner(@Nullable Output<String> loginBanner) {
            $.loginBanner = loginBanner;
            return this;
        }

        /**
         * @param loginBanner Banner message
         * 
         * @return builder
         * 
         */
        public Builder loginBanner(String loginBanner) {
            return loginBanner(Output.of(loginBanner));
        }

        /**
         * @param motdBanner Banner message
         * 
         * @return builder
         * 
         */
        public Builder motdBanner(@Nullable Output<String> motdBanner) {
            $.motdBanner = motdBanner;
            return this;
        }

        /**
         * @param motdBanner Banner message
         * 
         * @return builder
         * 
         */
        public Builder motdBanner(String motdBanner) {
            return motdBanner(Output.of(motdBanner));
        }

        /**
         * @param promptTimeoutBanner Banner message
         * 
         * @return builder
         * 
         */
        public Builder promptTimeoutBanner(@Nullable Output<String> promptTimeoutBanner) {
            $.promptTimeoutBanner = promptTimeoutBanner;
            return this;
        }

        /**
         * @param promptTimeoutBanner Banner message
         * 
         * @return builder
         * 
         */
        public Builder promptTimeoutBanner(String promptTimeoutBanner) {
            return promptTimeoutBanner(Output.of(promptTimeoutBanner));
        }

        public BannerState build() {
            return $;
        }
    }

}
