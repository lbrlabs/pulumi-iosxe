// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBfdTemplateSingleHopResult {
    private String authenticationMd5Keychain;
    private String authenticationMeticulousMd5Keychain;
    private String authenticationMeticulousSha1Keychain;
    private String authenticationSha1Keychain;
    private Integer dampeningHalfTime;
    private Integer dampeningMaxSuppressingTime;
    private Integer dampeningSuppressTime;
    private Integer dampeningUnsuppressTime;
    private @Nullable String device;
    private Boolean echo;
    private String id;
    private Integer intervalMicrosecondsMinRx;
    private Integer intervalMicrosecondsMinTx;
    private Integer intervalMillisecondsBoth;
    private Integer intervalMillisecondsMinRx;
    private Integer intervalMillisecondsMinTx;
    private Integer intervalMillisecondsMultiplier;
    private String name;

    private GetBfdTemplateSingleHopResult() {}
    public String authenticationMd5Keychain() {
        return this.authenticationMd5Keychain;
    }
    public String authenticationMeticulousMd5Keychain() {
        return this.authenticationMeticulousMd5Keychain;
    }
    public String authenticationMeticulousSha1Keychain() {
        return this.authenticationMeticulousSha1Keychain;
    }
    public String authenticationSha1Keychain() {
        return this.authenticationSha1Keychain;
    }
    public Integer dampeningHalfTime() {
        return this.dampeningHalfTime;
    }
    public Integer dampeningMaxSuppressingTime() {
        return this.dampeningMaxSuppressingTime;
    }
    public Integer dampeningSuppressTime() {
        return this.dampeningSuppressTime;
    }
    public Integer dampeningUnsuppressTime() {
        return this.dampeningUnsuppressTime;
    }
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }
    public Boolean echo() {
        return this.echo;
    }
    public String id() {
        return this.id;
    }
    public Integer intervalMicrosecondsMinRx() {
        return this.intervalMicrosecondsMinRx;
    }
    public Integer intervalMicrosecondsMinTx() {
        return this.intervalMicrosecondsMinTx;
    }
    public Integer intervalMillisecondsBoth() {
        return this.intervalMillisecondsBoth;
    }
    public Integer intervalMillisecondsMinRx() {
        return this.intervalMillisecondsMinRx;
    }
    public Integer intervalMillisecondsMinTx() {
        return this.intervalMillisecondsMinTx;
    }
    public Integer intervalMillisecondsMultiplier() {
        return this.intervalMillisecondsMultiplier;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBfdTemplateSingleHopResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authenticationMd5Keychain;
        private String authenticationMeticulousMd5Keychain;
        private String authenticationMeticulousSha1Keychain;
        private String authenticationSha1Keychain;
        private Integer dampeningHalfTime;
        private Integer dampeningMaxSuppressingTime;
        private Integer dampeningSuppressTime;
        private Integer dampeningUnsuppressTime;
        private @Nullable String device;
        private Boolean echo;
        private String id;
        private Integer intervalMicrosecondsMinRx;
        private Integer intervalMicrosecondsMinTx;
        private Integer intervalMillisecondsBoth;
        private Integer intervalMillisecondsMinRx;
        private Integer intervalMillisecondsMinTx;
        private Integer intervalMillisecondsMultiplier;
        private String name;
        public Builder() {}
        public Builder(GetBfdTemplateSingleHopResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationMd5Keychain = defaults.authenticationMd5Keychain;
    	      this.authenticationMeticulousMd5Keychain = defaults.authenticationMeticulousMd5Keychain;
    	      this.authenticationMeticulousSha1Keychain = defaults.authenticationMeticulousSha1Keychain;
    	      this.authenticationSha1Keychain = defaults.authenticationSha1Keychain;
    	      this.dampeningHalfTime = defaults.dampeningHalfTime;
    	      this.dampeningMaxSuppressingTime = defaults.dampeningMaxSuppressingTime;
    	      this.dampeningSuppressTime = defaults.dampeningSuppressTime;
    	      this.dampeningUnsuppressTime = defaults.dampeningUnsuppressTime;
    	      this.device = defaults.device;
    	      this.echo = defaults.echo;
    	      this.id = defaults.id;
    	      this.intervalMicrosecondsMinRx = defaults.intervalMicrosecondsMinRx;
    	      this.intervalMicrosecondsMinTx = defaults.intervalMicrosecondsMinTx;
    	      this.intervalMillisecondsBoth = defaults.intervalMillisecondsBoth;
    	      this.intervalMillisecondsMinRx = defaults.intervalMillisecondsMinRx;
    	      this.intervalMillisecondsMinTx = defaults.intervalMillisecondsMinTx;
    	      this.intervalMillisecondsMultiplier = defaults.intervalMillisecondsMultiplier;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder authenticationMd5Keychain(String authenticationMd5Keychain) {
            this.authenticationMd5Keychain = Objects.requireNonNull(authenticationMd5Keychain);
            return this;
        }
        @CustomType.Setter
        public Builder authenticationMeticulousMd5Keychain(String authenticationMeticulousMd5Keychain) {
            this.authenticationMeticulousMd5Keychain = Objects.requireNonNull(authenticationMeticulousMd5Keychain);
            return this;
        }
        @CustomType.Setter
        public Builder authenticationMeticulousSha1Keychain(String authenticationMeticulousSha1Keychain) {
            this.authenticationMeticulousSha1Keychain = Objects.requireNonNull(authenticationMeticulousSha1Keychain);
            return this;
        }
        @CustomType.Setter
        public Builder authenticationSha1Keychain(String authenticationSha1Keychain) {
            this.authenticationSha1Keychain = Objects.requireNonNull(authenticationSha1Keychain);
            return this;
        }
        @CustomType.Setter
        public Builder dampeningHalfTime(Integer dampeningHalfTime) {
            this.dampeningHalfTime = Objects.requireNonNull(dampeningHalfTime);
            return this;
        }
        @CustomType.Setter
        public Builder dampeningMaxSuppressingTime(Integer dampeningMaxSuppressingTime) {
            this.dampeningMaxSuppressingTime = Objects.requireNonNull(dampeningMaxSuppressingTime);
            return this;
        }
        @CustomType.Setter
        public Builder dampeningSuppressTime(Integer dampeningSuppressTime) {
            this.dampeningSuppressTime = Objects.requireNonNull(dampeningSuppressTime);
            return this;
        }
        @CustomType.Setter
        public Builder dampeningUnsuppressTime(Integer dampeningUnsuppressTime) {
            this.dampeningUnsuppressTime = Objects.requireNonNull(dampeningUnsuppressTime);
            return this;
        }
        @CustomType.Setter
        public Builder device(@Nullable String device) {
            this.device = device;
            return this;
        }
        @CustomType.Setter
        public Builder echo(Boolean echo) {
            this.echo = Objects.requireNonNull(echo);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder intervalMicrosecondsMinRx(Integer intervalMicrosecondsMinRx) {
            this.intervalMicrosecondsMinRx = Objects.requireNonNull(intervalMicrosecondsMinRx);
            return this;
        }
        @CustomType.Setter
        public Builder intervalMicrosecondsMinTx(Integer intervalMicrosecondsMinTx) {
            this.intervalMicrosecondsMinTx = Objects.requireNonNull(intervalMicrosecondsMinTx);
            return this;
        }
        @CustomType.Setter
        public Builder intervalMillisecondsBoth(Integer intervalMillisecondsBoth) {
            this.intervalMillisecondsBoth = Objects.requireNonNull(intervalMillisecondsBoth);
            return this;
        }
        @CustomType.Setter
        public Builder intervalMillisecondsMinRx(Integer intervalMillisecondsMinRx) {
            this.intervalMillisecondsMinRx = Objects.requireNonNull(intervalMillisecondsMinRx);
            return this;
        }
        @CustomType.Setter
        public Builder intervalMillisecondsMinTx(Integer intervalMillisecondsMinTx) {
            this.intervalMillisecondsMinTx = Objects.requireNonNull(intervalMillisecondsMinTx);
            return this;
        }
        @CustomType.Setter
        public Builder intervalMillisecondsMultiplier(Integer intervalMillisecondsMultiplier) {
            this.intervalMillisecondsMultiplier = Objects.requireNonNull(intervalMillisecondsMultiplier);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetBfdTemplateSingleHopResult build() {
            final var o = new GetBfdTemplateSingleHopResult();
            o.authenticationMd5Keychain = authenticationMd5Keychain;
            o.authenticationMeticulousMd5Keychain = authenticationMeticulousMd5Keychain;
            o.authenticationMeticulousSha1Keychain = authenticationMeticulousSha1Keychain;
            o.authenticationSha1Keychain = authenticationSha1Keychain;
            o.dampeningHalfTime = dampeningHalfTime;
            o.dampeningMaxSuppressingTime = dampeningMaxSuppressingTime;
            o.dampeningSuppressTime = dampeningSuppressTime;
            o.dampeningUnsuppressTime = dampeningUnsuppressTime;
            o.device = device;
            o.echo = echo;
            o.id = id;
            o.intervalMicrosecondsMinRx = intervalMicrosecondsMinRx;
            o.intervalMicrosecondsMinTx = intervalMicrosecondsMinTx;
            o.intervalMillisecondsBoth = intervalMillisecondsBoth;
            o.intervalMillisecondsMinRx = intervalMillisecondsMinRx;
            o.intervalMillisecondsMinTx = intervalMillisecondsMinTx;
            o.intervalMillisecondsMultiplier = intervalMillisecondsMultiplier;
            o.name = name;
            return o;
        }
    }
}