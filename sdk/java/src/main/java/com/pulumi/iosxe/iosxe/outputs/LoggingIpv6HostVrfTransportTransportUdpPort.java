// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class LoggingIpv6HostVrfTransportTransportUdpPort {
    private Integer portNumber;

    private LoggingIpv6HostVrfTransportTransportUdpPort() {}
    public Integer portNumber() {
        return this.portNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingIpv6HostVrfTransportTransportUdpPort defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer portNumber;
        public Builder() {}
        public Builder(LoggingIpv6HostVrfTransportTransportUdpPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.portNumber = defaults.portNumber;
        }

        @CustomType.Setter
        public Builder portNumber(Integer portNumber) {
            this.portNumber = Objects.requireNonNull(portNumber);
            return this;
        }
        public LoggingIpv6HostVrfTransportTransportUdpPort build() {
            final var o = new LoggingIpv6HostVrfTransportTransportUdpPort();
            o.portNumber = portNumber;
            return o;
        }
    }
}
