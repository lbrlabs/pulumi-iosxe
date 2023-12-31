// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLoggingIpv6HostVrfTransportTransportTlsPort {
    /**
     * @return Specify the TLS port number (default=6514)
     * 
     */
    private Integer portNumber;
    /**
     * @return Specify the TLS profile
     * 
     */
    private String profile;

    private GetLoggingIpv6HostVrfTransportTransportTlsPort() {}
    /**
     * @return Specify the TLS port number (default=6514)
     * 
     */
    public Integer portNumber() {
        return this.portNumber;
    }
    /**
     * @return Specify the TLS profile
     * 
     */
    public String profile() {
        return this.profile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoggingIpv6HostVrfTransportTransportTlsPort defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer portNumber;
        private String profile;
        public Builder() {}
        public Builder(GetLoggingIpv6HostVrfTransportTransportTlsPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.portNumber = defaults.portNumber;
    	      this.profile = defaults.profile;
        }

        @CustomType.Setter
        public Builder portNumber(Integer portNumber) {
            this.portNumber = Objects.requireNonNull(portNumber);
            return this;
        }
        @CustomType.Setter
        public Builder profile(String profile) {
            this.profile = Objects.requireNonNull(profile);
            return this;
        }
        public GetLoggingIpv6HostVrfTransportTransportTlsPort build() {
            final var o = new GetLoggingIpv6HostVrfTransportTransportTlsPort();
            o.portNumber = portNumber;
            o.profile = profile;
            return o;
        }
    }
}
