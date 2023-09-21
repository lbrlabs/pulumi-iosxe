// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNtpPeerVrfPeer {
    private String ipAddress;
    private Integer key;
    private Boolean prefer;
    private Integer version;

    private GetNtpPeerVrfPeer() {}
    public String ipAddress() {
        return this.ipAddress;
    }
    public Integer key() {
        return this.key;
    }
    public Boolean prefer() {
        return this.prefer;
    }
    public Integer version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNtpPeerVrfPeer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ipAddress;
        private Integer key;
        private Boolean prefer;
        private Integer version;
        public Builder() {}
        public Builder(GetNtpPeerVrfPeer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.key = defaults.key;
    	      this.prefer = defaults.prefer;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        @CustomType.Setter
        public Builder key(Integer key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder prefer(Boolean prefer) {
            this.prefer = Objects.requireNonNull(prefer);
            return this;
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetNtpPeerVrfPeer build() {
            final var o = new GetNtpPeerVrfPeer();
            o.ipAddress = ipAddress;
            o.key = key;
            o.prefer = prefer;
            o.version = version;
            return o;
        }
    }
}
