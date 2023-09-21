// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InterfaceOspfMessageDigestKey {
    private Integer id;
    private @Nullable String md5AuthKey;
    private @Nullable Integer md5AuthType;

    private InterfaceOspfMessageDigestKey() {}
    public Integer id() {
        return this.id;
    }
    public Optional<String> md5AuthKey() {
        return Optional.ofNullable(this.md5AuthKey);
    }
    public Optional<Integer> md5AuthType() {
        return Optional.ofNullable(this.md5AuthType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InterfaceOspfMessageDigestKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer id;
        private @Nullable String md5AuthKey;
        private @Nullable Integer md5AuthType;
        public Builder() {}
        public Builder(InterfaceOspfMessageDigestKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.md5AuthKey = defaults.md5AuthKey;
    	      this.md5AuthType = defaults.md5AuthType;
        }

        @CustomType.Setter
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder md5AuthKey(@Nullable String md5AuthKey) {
            this.md5AuthKey = md5AuthKey;
            return this;
        }
        @CustomType.Setter
        public Builder md5AuthType(@Nullable Integer md5AuthType) {
            this.md5AuthType = md5AuthType;
            return this;
        }
        public InterfaceOspfMessageDigestKey build() {
            final var o = new InterfaceOspfMessageDigestKey();
            o.id = id;
            o.md5AuthKey = md5AuthKey;
            o.md5AuthType = md5AuthType;
            return o;
        }
    }
}