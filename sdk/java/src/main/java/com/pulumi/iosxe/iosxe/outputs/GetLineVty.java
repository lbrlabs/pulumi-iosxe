// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.GetLineVtyAccessClass;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLineVty {
    private List<GetLineVtyAccessClass> accessClasses;
    private String escapeCharacter;
    /**
     * @return \n\n;;Timeout in minutes
     * 
     */
    private Integer execTimeoutMinutes;
    /**
     * @return \n\n;;Timeout in seconds
     * 
     */
    private Integer execTimeoutSeconds;
    private Integer first;
    private Integer last;
    private String loginAuthentication;
    private String password;
    /**
     * @return Set exec level password
     * 
     */
    private Integer passwordLevel;
    private String passwordType;
    private String transportPreferredProtocol;

    private GetLineVty() {}
    public List<GetLineVtyAccessClass> accessClasses() {
        return this.accessClasses;
    }
    public String escapeCharacter() {
        return this.escapeCharacter;
    }
    /**
     * @return \n\n;;Timeout in minutes
     * 
     */
    public Integer execTimeoutMinutes() {
        return this.execTimeoutMinutes;
    }
    /**
     * @return \n\n;;Timeout in seconds
     * 
     */
    public Integer execTimeoutSeconds() {
        return this.execTimeoutSeconds;
    }
    public Integer first() {
        return this.first;
    }
    public Integer last() {
        return this.last;
    }
    public String loginAuthentication() {
        return this.loginAuthentication;
    }
    public String password() {
        return this.password;
    }
    /**
     * @return Set exec level password
     * 
     */
    public Integer passwordLevel() {
        return this.passwordLevel;
    }
    public String passwordType() {
        return this.passwordType;
    }
    public String transportPreferredProtocol() {
        return this.transportPreferredProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLineVty defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetLineVtyAccessClass> accessClasses;
        private String escapeCharacter;
        private Integer execTimeoutMinutes;
        private Integer execTimeoutSeconds;
        private Integer first;
        private Integer last;
        private String loginAuthentication;
        private String password;
        private Integer passwordLevel;
        private String passwordType;
        private String transportPreferredProtocol;
        public Builder() {}
        public Builder(GetLineVty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessClasses = defaults.accessClasses;
    	      this.escapeCharacter = defaults.escapeCharacter;
    	      this.execTimeoutMinutes = defaults.execTimeoutMinutes;
    	      this.execTimeoutSeconds = defaults.execTimeoutSeconds;
    	      this.first = defaults.first;
    	      this.last = defaults.last;
    	      this.loginAuthentication = defaults.loginAuthentication;
    	      this.password = defaults.password;
    	      this.passwordLevel = defaults.passwordLevel;
    	      this.passwordType = defaults.passwordType;
    	      this.transportPreferredProtocol = defaults.transportPreferredProtocol;
        }

        @CustomType.Setter
        public Builder accessClasses(List<GetLineVtyAccessClass> accessClasses) {
            this.accessClasses = Objects.requireNonNull(accessClasses);
            return this;
        }
        public Builder accessClasses(GetLineVtyAccessClass... accessClasses) {
            return accessClasses(List.of(accessClasses));
        }
        @CustomType.Setter
        public Builder escapeCharacter(String escapeCharacter) {
            this.escapeCharacter = Objects.requireNonNull(escapeCharacter);
            return this;
        }
        @CustomType.Setter
        public Builder execTimeoutMinutes(Integer execTimeoutMinutes) {
            this.execTimeoutMinutes = Objects.requireNonNull(execTimeoutMinutes);
            return this;
        }
        @CustomType.Setter
        public Builder execTimeoutSeconds(Integer execTimeoutSeconds) {
            this.execTimeoutSeconds = Objects.requireNonNull(execTimeoutSeconds);
            return this;
        }
        @CustomType.Setter
        public Builder first(Integer first) {
            this.first = Objects.requireNonNull(first);
            return this;
        }
        @CustomType.Setter
        public Builder last(Integer last) {
            this.last = Objects.requireNonNull(last);
            return this;
        }
        @CustomType.Setter
        public Builder loginAuthentication(String loginAuthentication) {
            this.loginAuthentication = Objects.requireNonNull(loginAuthentication);
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        @CustomType.Setter
        public Builder passwordLevel(Integer passwordLevel) {
            this.passwordLevel = Objects.requireNonNull(passwordLevel);
            return this;
        }
        @CustomType.Setter
        public Builder passwordType(String passwordType) {
            this.passwordType = Objects.requireNonNull(passwordType);
            return this;
        }
        @CustomType.Setter
        public Builder transportPreferredProtocol(String transportPreferredProtocol) {
            this.transportPreferredProtocol = Objects.requireNonNull(transportPreferredProtocol);
            return this;
        }
        public GetLineVty build() {
            final var o = new GetLineVty();
            o.accessClasses = accessClasses;
            o.escapeCharacter = escapeCharacter;
            o.execTimeoutMinutes = execTimeoutMinutes;
            o.execTimeoutSeconds = execTimeoutSeconds;
            o.first = first;
            o.last = last;
            o.loginAuthentication = loginAuthentication;
            o.password = password;
            o.passwordLevel = passwordLevel;
            o.passwordType = passwordType;
            o.transportPreferredProtocol = transportPreferredProtocol;
            return o;
        }
    }
}
