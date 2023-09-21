// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CryptoIkev2ProfileMatchIdentityRemoteIpv4Address {
    private String address;
    private @Nullable String mask;

    private CryptoIkev2ProfileMatchIdentityRemoteIpv4Address() {}
    public String address() {
        return this.address;
    }
    public Optional<String> mask() {
        return Optional.ofNullable(this.mask);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CryptoIkev2ProfileMatchIdentityRemoteIpv4Address defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private @Nullable String mask;
        public Builder() {}
        public Builder(CryptoIkev2ProfileMatchIdentityRemoteIpv4Address defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.mask = defaults.mask;
        }

        @CustomType.Setter
        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        @CustomType.Setter
        public Builder mask(@Nullable String mask) {
            this.mask = mask;
            return this;
        }
        public CryptoIkev2ProfileMatchIdentityRemoteIpv4Address build() {
            final var o = new CryptoIkev2ProfileMatchIdentityRemoteIpv4Address();
            o.address = address;
            o.mask = mask;
            return o;
        }
    }
}
