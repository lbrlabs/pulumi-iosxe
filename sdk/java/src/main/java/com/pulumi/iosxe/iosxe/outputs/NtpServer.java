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
public final class NtpServer {
    private String ipAddress;
    private @Nullable Integer key;
    private @Nullable Boolean prefer;
    private @Nullable String source;
    private @Nullable Integer version;

    private NtpServer() {}
    public String ipAddress() {
        return this.ipAddress;
    }
    public Optional<Integer> key() {
        return Optional.ofNullable(this.key);
    }
    public Optional<Boolean> prefer() {
        return Optional.ofNullable(this.prefer);
    }
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    public Optional<Integer> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NtpServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ipAddress;
        private @Nullable Integer key;
        private @Nullable Boolean prefer;
        private @Nullable String source;
        private @Nullable Integer version;
        public Builder() {}
        public Builder(NtpServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.key = defaults.key;
    	      this.prefer = defaults.prefer;
    	      this.source = defaults.source;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        @CustomType.Setter
        public Builder key(@Nullable Integer key) {
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder prefer(@Nullable Boolean prefer) {
            this.prefer = prefer;
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable Integer version) {
            this.version = version;
            return this;
        }
        public NtpServer build() {
            final var o = new NtpServer();
            o.ipAddress = ipAddress;
            o.key = key;
            o.prefer = prefer;
            o.source = source;
            o.version = version;
            return o;
        }
    }
}
