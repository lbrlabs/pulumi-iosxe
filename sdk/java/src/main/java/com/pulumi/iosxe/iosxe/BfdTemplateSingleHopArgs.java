// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BfdTemplateSingleHopArgs extends com.pulumi.resources.ResourceArgs {

    public static final BfdTemplateSingleHopArgs Empty = new BfdTemplateSingleHopArgs();

    /**
     * keychain name
     * 
     */
    @Import(name="authenticationMd5Keychain")
    private @Nullable Output<String> authenticationMd5Keychain;

    /**
     * @return keychain name
     * 
     */
    public Optional<Output<String>> authenticationMd5Keychain() {
        return Optional.ofNullable(this.authenticationMd5Keychain);
    }

    /**
     * keychain name
     * 
     */
    @Import(name="authenticationMeticulousMd5Keychain")
    private @Nullable Output<String> authenticationMeticulousMd5Keychain;

    /**
     * @return keychain name
     * 
     */
    public Optional<Output<String>> authenticationMeticulousMd5Keychain() {
        return Optional.ofNullable(this.authenticationMeticulousMd5Keychain);
    }

    /**
     * keychain name
     * 
     */
    @Import(name="authenticationMeticulousSha1Keychain")
    private @Nullable Output<String> authenticationMeticulousSha1Keychain;

    /**
     * @return keychain name
     * 
     */
    public Optional<Output<String>> authenticationMeticulousSha1Keychain() {
        return Optional.ofNullable(this.authenticationMeticulousSha1Keychain);
    }

    /**
     * keychain name
     * 
     */
    @Import(name="authenticationSha1Keychain")
    private @Nullable Output<String> authenticationSha1Keychain;

    /**
     * @return keychain name
     * 
     */
    public Optional<Output<String>> authenticationSha1Keychain() {
        return Optional.ofNullable(this.authenticationSha1Keychain);
    }

    /**
     * Half-life time for the penalty - Range: `1`-`30`
     * 
     */
    @Import(name="dampeningHalfTime")
    private @Nullable Output<Integer> dampeningHalfTime;

    /**
     * @return Half-life time for the penalty - Range: `1`-`30`
     * 
     */
    public Optional<Output<Integer>> dampeningHalfTime() {
        return Optional.ofNullable(this.dampeningHalfTime);
    }

    /**
     * Maximum duration to suppress a session - Range: `1`-`420`
     * 
     */
    @Import(name="dampeningMaxSuppressingTime")
    private @Nullable Output<Integer> dampeningMaxSuppressingTime;

    /**
     * @return Maximum duration to suppress a session - Range: `1`-`420`
     * 
     */
    public Optional<Output<Integer>> dampeningMaxSuppressingTime() {
        return Optional.ofNullable(this.dampeningMaxSuppressingTime);
    }

    /**
     * Value to start suppressing a session - Range: `1`-`18000`
     * 
     */
    @Import(name="dampeningSuppressTime")
    private @Nullable Output<Integer> dampeningSuppressTime;

    /**
     * @return Value to start suppressing a session - Range: `1`-`18000`
     * 
     */
    public Optional<Output<Integer>> dampeningSuppressTime() {
        return Optional.ofNullable(this.dampeningSuppressTime);
    }

    /**
     * Value to unsuppress a session - Range: `1`-`18000`
     * 
     */
    @Import(name="dampeningUnsuppressTime")
    private @Nullable Output<Integer> dampeningUnsuppressTime;

    /**
     * @return Value to unsuppress a session - Range: `1`-`18000`
     * 
     */
    public Optional<Output<Integer>> dampeningUnsuppressTime() {
        return Optional.ofNullable(this.dampeningUnsuppressTime);
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
     * Use echo adjunct as bfd detection mechanism
     * 
     */
    @Import(name="echo")
    private @Nullable Output<Boolean> echo;

    /**
     * @return Use echo adjunct as bfd detection mechanism
     * 
     */
    public Optional<Output<Boolean>> echo() {
        return Optional.ofNullable(this.echo);
    }

    /**
     * Minimum receive interval capability - Range: `3300`-`9999000`
     * 
     */
    @Import(name="intervalMicrosecondsMinRx")
    private @Nullable Output<Integer> intervalMicrosecondsMinRx;

    /**
     * @return Minimum receive interval capability - Range: `3300`-`9999000`
     * 
     */
    public Optional<Output<Integer>> intervalMicrosecondsMinRx() {
        return Optional.ofNullable(this.intervalMicrosecondsMinRx);
    }

    /**
     * Minimum transmit interval capability - Range: `3300`-`9999000`
     * 
     */
    @Import(name="intervalMicrosecondsMinTx")
    private @Nullable Output<Integer> intervalMicrosecondsMinTx;

    /**
     * @return Minimum transmit interval capability - Range: `3300`-`9999000`
     * 
     */
    public Optional<Output<Integer>> intervalMicrosecondsMinTx() {
        return Optional.ofNullable(this.intervalMicrosecondsMinTx);
    }

    /**
     * Minimum transmit and receive interval capability - Range: `4`-`9999`
     * 
     */
    @Import(name="intervalMillisecondsBoth")
    private @Nullable Output<Integer> intervalMillisecondsBoth;

    /**
     * @return Minimum transmit and receive interval capability - Range: `4`-`9999`
     * 
     */
    public Optional<Output<Integer>> intervalMillisecondsBoth() {
        return Optional.ofNullable(this.intervalMillisecondsBoth);
    }

    /**
     * Minimum receive interval capability - Range: `4`-`9999`
     * 
     */
    @Import(name="intervalMillisecondsMinRx")
    private @Nullable Output<Integer> intervalMillisecondsMinRx;

    /**
     * @return Minimum receive interval capability - Range: `4`-`9999`
     * 
     */
    public Optional<Output<Integer>> intervalMillisecondsMinRx() {
        return Optional.ofNullable(this.intervalMillisecondsMinRx);
    }

    /**
     * Minimum transmit interval capability - Range: `4`-`9999`
     * 
     */
    @Import(name="intervalMillisecondsMinTx")
    private @Nullable Output<Integer> intervalMillisecondsMinTx;

    /**
     * @return Minimum transmit interval capability - Range: `4`-`9999`
     * 
     */
    public Optional<Output<Integer>> intervalMillisecondsMinTx() {
        return Optional.ofNullable(this.intervalMillisecondsMinTx);
    }

    /**
     * Multiplier value used to compute holddown - Range: `3`-`50`
     * 
     */
    @Import(name="intervalMillisecondsMultiplier")
    private @Nullable Output<Integer> intervalMillisecondsMultiplier;

    /**
     * @return Multiplier value used to compute holddown - Range: `3`-`50`
     * 
     */
    public Optional<Output<Integer>> intervalMillisecondsMultiplier() {
        return Optional.ofNullable(this.intervalMillisecondsMultiplier);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private BfdTemplateSingleHopArgs() {}

    private BfdTemplateSingleHopArgs(BfdTemplateSingleHopArgs $) {
        this.authenticationMd5Keychain = $.authenticationMd5Keychain;
        this.authenticationMeticulousMd5Keychain = $.authenticationMeticulousMd5Keychain;
        this.authenticationMeticulousSha1Keychain = $.authenticationMeticulousSha1Keychain;
        this.authenticationSha1Keychain = $.authenticationSha1Keychain;
        this.dampeningHalfTime = $.dampeningHalfTime;
        this.dampeningMaxSuppressingTime = $.dampeningMaxSuppressingTime;
        this.dampeningSuppressTime = $.dampeningSuppressTime;
        this.dampeningUnsuppressTime = $.dampeningUnsuppressTime;
        this.device = $.device;
        this.echo = $.echo;
        this.intervalMicrosecondsMinRx = $.intervalMicrosecondsMinRx;
        this.intervalMicrosecondsMinTx = $.intervalMicrosecondsMinTx;
        this.intervalMillisecondsBoth = $.intervalMillisecondsBoth;
        this.intervalMillisecondsMinRx = $.intervalMillisecondsMinRx;
        this.intervalMillisecondsMinTx = $.intervalMillisecondsMinTx;
        this.intervalMillisecondsMultiplier = $.intervalMillisecondsMultiplier;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BfdTemplateSingleHopArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BfdTemplateSingleHopArgs $;

        public Builder() {
            $ = new BfdTemplateSingleHopArgs();
        }

        public Builder(BfdTemplateSingleHopArgs defaults) {
            $ = new BfdTemplateSingleHopArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationMd5Keychain keychain name
         * 
         * @return builder
         * 
         */
        public Builder authenticationMd5Keychain(@Nullable Output<String> authenticationMd5Keychain) {
            $.authenticationMd5Keychain = authenticationMd5Keychain;
            return this;
        }

        /**
         * @param authenticationMd5Keychain keychain name
         * 
         * @return builder
         * 
         */
        public Builder authenticationMd5Keychain(String authenticationMd5Keychain) {
            return authenticationMd5Keychain(Output.of(authenticationMd5Keychain));
        }

        /**
         * @param authenticationMeticulousMd5Keychain keychain name
         * 
         * @return builder
         * 
         */
        public Builder authenticationMeticulousMd5Keychain(@Nullable Output<String> authenticationMeticulousMd5Keychain) {
            $.authenticationMeticulousMd5Keychain = authenticationMeticulousMd5Keychain;
            return this;
        }

        /**
         * @param authenticationMeticulousMd5Keychain keychain name
         * 
         * @return builder
         * 
         */
        public Builder authenticationMeticulousMd5Keychain(String authenticationMeticulousMd5Keychain) {
            return authenticationMeticulousMd5Keychain(Output.of(authenticationMeticulousMd5Keychain));
        }

        /**
         * @param authenticationMeticulousSha1Keychain keychain name
         * 
         * @return builder
         * 
         */
        public Builder authenticationMeticulousSha1Keychain(@Nullable Output<String> authenticationMeticulousSha1Keychain) {
            $.authenticationMeticulousSha1Keychain = authenticationMeticulousSha1Keychain;
            return this;
        }

        /**
         * @param authenticationMeticulousSha1Keychain keychain name
         * 
         * @return builder
         * 
         */
        public Builder authenticationMeticulousSha1Keychain(String authenticationMeticulousSha1Keychain) {
            return authenticationMeticulousSha1Keychain(Output.of(authenticationMeticulousSha1Keychain));
        }

        /**
         * @param authenticationSha1Keychain keychain name
         * 
         * @return builder
         * 
         */
        public Builder authenticationSha1Keychain(@Nullable Output<String> authenticationSha1Keychain) {
            $.authenticationSha1Keychain = authenticationSha1Keychain;
            return this;
        }

        /**
         * @param authenticationSha1Keychain keychain name
         * 
         * @return builder
         * 
         */
        public Builder authenticationSha1Keychain(String authenticationSha1Keychain) {
            return authenticationSha1Keychain(Output.of(authenticationSha1Keychain));
        }

        /**
         * @param dampeningHalfTime Half-life time for the penalty - Range: `1`-`30`
         * 
         * @return builder
         * 
         */
        public Builder dampeningHalfTime(@Nullable Output<Integer> dampeningHalfTime) {
            $.dampeningHalfTime = dampeningHalfTime;
            return this;
        }

        /**
         * @param dampeningHalfTime Half-life time for the penalty - Range: `1`-`30`
         * 
         * @return builder
         * 
         */
        public Builder dampeningHalfTime(Integer dampeningHalfTime) {
            return dampeningHalfTime(Output.of(dampeningHalfTime));
        }

        /**
         * @param dampeningMaxSuppressingTime Maximum duration to suppress a session - Range: `1`-`420`
         * 
         * @return builder
         * 
         */
        public Builder dampeningMaxSuppressingTime(@Nullable Output<Integer> dampeningMaxSuppressingTime) {
            $.dampeningMaxSuppressingTime = dampeningMaxSuppressingTime;
            return this;
        }

        /**
         * @param dampeningMaxSuppressingTime Maximum duration to suppress a session - Range: `1`-`420`
         * 
         * @return builder
         * 
         */
        public Builder dampeningMaxSuppressingTime(Integer dampeningMaxSuppressingTime) {
            return dampeningMaxSuppressingTime(Output.of(dampeningMaxSuppressingTime));
        }

        /**
         * @param dampeningSuppressTime Value to start suppressing a session - Range: `1`-`18000`
         * 
         * @return builder
         * 
         */
        public Builder dampeningSuppressTime(@Nullable Output<Integer> dampeningSuppressTime) {
            $.dampeningSuppressTime = dampeningSuppressTime;
            return this;
        }

        /**
         * @param dampeningSuppressTime Value to start suppressing a session - Range: `1`-`18000`
         * 
         * @return builder
         * 
         */
        public Builder dampeningSuppressTime(Integer dampeningSuppressTime) {
            return dampeningSuppressTime(Output.of(dampeningSuppressTime));
        }

        /**
         * @param dampeningUnsuppressTime Value to unsuppress a session - Range: `1`-`18000`
         * 
         * @return builder
         * 
         */
        public Builder dampeningUnsuppressTime(@Nullable Output<Integer> dampeningUnsuppressTime) {
            $.dampeningUnsuppressTime = dampeningUnsuppressTime;
            return this;
        }

        /**
         * @param dampeningUnsuppressTime Value to unsuppress a session - Range: `1`-`18000`
         * 
         * @return builder
         * 
         */
        public Builder dampeningUnsuppressTime(Integer dampeningUnsuppressTime) {
            return dampeningUnsuppressTime(Output.of(dampeningUnsuppressTime));
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
         * @param echo Use echo adjunct as bfd detection mechanism
         * 
         * @return builder
         * 
         */
        public Builder echo(@Nullable Output<Boolean> echo) {
            $.echo = echo;
            return this;
        }

        /**
         * @param echo Use echo adjunct as bfd detection mechanism
         * 
         * @return builder
         * 
         */
        public Builder echo(Boolean echo) {
            return echo(Output.of(echo));
        }

        /**
         * @param intervalMicrosecondsMinRx Minimum receive interval capability - Range: `3300`-`9999000`
         * 
         * @return builder
         * 
         */
        public Builder intervalMicrosecondsMinRx(@Nullable Output<Integer> intervalMicrosecondsMinRx) {
            $.intervalMicrosecondsMinRx = intervalMicrosecondsMinRx;
            return this;
        }

        /**
         * @param intervalMicrosecondsMinRx Minimum receive interval capability - Range: `3300`-`9999000`
         * 
         * @return builder
         * 
         */
        public Builder intervalMicrosecondsMinRx(Integer intervalMicrosecondsMinRx) {
            return intervalMicrosecondsMinRx(Output.of(intervalMicrosecondsMinRx));
        }

        /**
         * @param intervalMicrosecondsMinTx Minimum transmit interval capability - Range: `3300`-`9999000`
         * 
         * @return builder
         * 
         */
        public Builder intervalMicrosecondsMinTx(@Nullable Output<Integer> intervalMicrosecondsMinTx) {
            $.intervalMicrosecondsMinTx = intervalMicrosecondsMinTx;
            return this;
        }

        /**
         * @param intervalMicrosecondsMinTx Minimum transmit interval capability - Range: `3300`-`9999000`
         * 
         * @return builder
         * 
         */
        public Builder intervalMicrosecondsMinTx(Integer intervalMicrosecondsMinTx) {
            return intervalMicrosecondsMinTx(Output.of(intervalMicrosecondsMinTx));
        }

        /**
         * @param intervalMillisecondsBoth Minimum transmit and receive interval capability - Range: `4`-`9999`
         * 
         * @return builder
         * 
         */
        public Builder intervalMillisecondsBoth(@Nullable Output<Integer> intervalMillisecondsBoth) {
            $.intervalMillisecondsBoth = intervalMillisecondsBoth;
            return this;
        }

        /**
         * @param intervalMillisecondsBoth Minimum transmit and receive interval capability - Range: `4`-`9999`
         * 
         * @return builder
         * 
         */
        public Builder intervalMillisecondsBoth(Integer intervalMillisecondsBoth) {
            return intervalMillisecondsBoth(Output.of(intervalMillisecondsBoth));
        }

        /**
         * @param intervalMillisecondsMinRx Minimum receive interval capability - Range: `4`-`9999`
         * 
         * @return builder
         * 
         */
        public Builder intervalMillisecondsMinRx(@Nullable Output<Integer> intervalMillisecondsMinRx) {
            $.intervalMillisecondsMinRx = intervalMillisecondsMinRx;
            return this;
        }

        /**
         * @param intervalMillisecondsMinRx Minimum receive interval capability - Range: `4`-`9999`
         * 
         * @return builder
         * 
         */
        public Builder intervalMillisecondsMinRx(Integer intervalMillisecondsMinRx) {
            return intervalMillisecondsMinRx(Output.of(intervalMillisecondsMinRx));
        }

        /**
         * @param intervalMillisecondsMinTx Minimum transmit interval capability - Range: `4`-`9999`
         * 
         * @return builder
         * 
         */
        public Builder intervalMillisecondsMinTx(@Nullable Output<Integer> intervalMillisecondsMinTx) {
            $.intervalMillisecondsMinTx = intervalMillisecondsMinTx;
            return this;
        }

        /**
         * @param intervalMillisecondsMinTx Minimum transmit interval capability - Range: `4`-`9999`
         * 
         * @return builder
         * 
         */
        public Builder intervalMillisecondsMinTx(Integer intervalMillisecondsMinTx) {
            return intervalMillisecondsMinTx(Output.of(intervalMillisecondsMinTx));
        }

        /**
         * @param intervalMillisecondsMultiplier Multiplier value used to compute holddown - Range: `3`-`50`
         * 
         * @return builder
         * 
         */
        public Builder intervalMillisecondsMultiplier(@Nullable Output<Integer> intervalMillisecondsMultiplier) {
            $.intervalMillisecondsMultiplier = intervalMillisecondsMultiplier;
            return this;
        }

        /**
         * @param intervalMillisecondsMultiplier Multiplier value used to compute holddown - Range: `3`-`50`
         * 
         * @return builder
         * 
         */
        public Builder intervalMillisecondsMultiplier(Integer intervalMillisecondsMultiplier) {
            return intervalMillisecondsMultiplier(Output.of(intervalMillisecondsMultiplier));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public BfdTemplateSingleHopArgs build() {
            return $;
        }
    }

}
