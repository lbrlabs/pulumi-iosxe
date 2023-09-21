// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSnmpServerHost {
    private String communityOrUser;
    private String encryption;
    private String ipAddress;
    private String version;

    private GetSnmpServerHost() {}
    public String communityOrUser() {
        return this.communityOrUser;
    }
    public String encryption() {
        return this.encryption;
    }
    public String ipAddress() {
        return this.ipAddress;
    }
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnmpServerHost defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String communityOrUser;
        private String encryption;
        private String ipAddress;
        private String version;
        public Builder() {}
        public Builder(GetSnmpServerHost defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.communityOrUser = defaults.communityOrUser;
    	      this.encryption = defaults.encryption;
    	      this.ipAddress = defaults.ipAddress;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder communityOrUser(String communityOrUser) {
            this.communityOrUser = Objects.requireNonNull(communityOrUser);
            return this;
        }
        @CustomType.Setter
        public Builder encryption(String encryption) {
            this.encryption = Objects.requireNonNull(encryption);
            return this;
        }
        @CustomType.Setter
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetSnmpServerHost build() {
            final var o = new GetSnmpServerHost();
            o.communityOrUser = communityOrUser;
            o.encryption = encryption;
            o.ipAddress = ipAddress;
            o.version = version;
            return o;
        }
    }
}
