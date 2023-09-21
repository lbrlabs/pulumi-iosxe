// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDot1xCredential {
    /**
     * @return Set the anonymous userid
     * 
     */
    private String anonymousId;
    /**
     * @return Provide a description for the credentials profile
     * 
     */
    private String description;
    private String password;
    private String passwordType;
    /**
     * @return Set the default pki trustpoint
     * 
     */
    private String pkiTrustpoint;
    /**
     * @return Specify a profile name
     * 
     */
    private String profileName;
    /**
     * @return Set the authentication userid
     * 
     */
    private String username;

    private GetDot1xCredential() {}
    /**
     * @return Set the anonymous userid
     * 
     */
    public String anonymousId() {
        return this.anonymousId;
    }
    /**
     * @return Provide a description for the credentials profile
     * 
     */
    public String description() {
        return this.description;
    }
    public String password() {
        return this.password;
    }
    public String passwordType() {
        return this.passwordType;
    }
    /**
     * @return Set the default pki trustpoint
     * 
     */
    public String pkiTrustpoint() {
        return this.pkiTrustpoint;
    }
    /**
     * @return Specify a profile name
     * 
     */
    public String profileName() {
        return this.profileName;
    }
    /**
     * @return Set the authentication userid
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDot1xCredential defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String anonymousId;
        private String description;
        private String password;
        private String passwordType;
        private String pkiTrustpoint;
        private String profileName;
        private String username;
        public Builder() {}
        public Builder(GetDot1xCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.anonymousId = defaults.anonymousId;
    	      this.description = defaults.description;
    	      this.password = defaults.password;
    	      this.passwordType = defaults.passwordType;
    	      this.pkiTrustpoint = defaults.pkiTrustpoint;
    	      this.profileName = defaults.profileName;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder anonymousId(String anonymousId) {
            this.anonymousId = Objects.requireNonNull(anonymousId);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        @CustomType.Setter
        public Builder passwordType(String passwordType) {
            this.passwordType = Objects.requireNonNull(passwordType);
            return this;
        }
        @CustomType.Setter
        public Builder pkiTrustpoint(String pkiTrustpoint) {
            this.pkiTrustpoint = Objects.requireNonNull(pkiTrustpoint);
            return this;
        }
        @CustomType.Setter
        public Builder profileName(String profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public GetDot1xCredential build() {
            final var o = new GetDot1xCredential();
            o.anonymousId = anonymousId;
            o.description = description;
            o.password = password;
            o.passwordType = passwordType;
            o.pkiTrustpoint = pkiTrustpoint;
            o.profileName = profileName;
            o.username = username;
            return o;
        }
    }
}
