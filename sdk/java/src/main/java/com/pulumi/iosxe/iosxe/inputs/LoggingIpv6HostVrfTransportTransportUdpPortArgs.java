// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class LoggingIpv6HostVrfTransportTransportUdpPortArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggingIpv6HostVrfTransportTransportUdpPortArgs Empty = new LoggingIpv6HostVrfTransportTransportUdpPortArgs();

    @Import(name="portNumber", required=true)
    private Output<Integer> portNumber;

    public Output<Integer> portNumber() {
        return this.portNumber;
    }

    private LoggingIpv6HostVrfTransportTransportUdpPortArgs() {}

    private LoggingIpv6HostVrfTransportTransportUdpPortArgs(LoggingIpv6HostVrfTransportTransportUdpPortArgs $) {
        this.portNumber = $.portNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingIpv6HostVrfTransportTransportUdpPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingIpv6HostVrfTransportTransportUdpPortArgs $;

        public Builder() {
            $ = new LoggingIpv6HostVrfTransportTransportUdpPortArgs();
        }

        public Builder(LoggingIpv6HostVrfTransportTransportUdpPortArgs defaults) {
            $ = new LoggingIpv6HostVrfTransportTransportUdpPortArgs(Objects.requireNonNull(defaults));
        }

        public Builder portNumber(Output<Integer> portNumber) {
            $.portNumber = portNumber;
            return this;
        }

        public Builder portNumber(Integer portNumber) {
            return portNumber(Output.of(portNumber));
        }

        public LoggingIpv6HostVrfTransportTransportUdpPortArgs build() {
            $.portNumber = Objects.requireNonNull($.portNumber, "expected parameter 'portNumber' to be non-null");
            return $;
        }
    }

}
