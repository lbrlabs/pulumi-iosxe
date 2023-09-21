// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class LoggingIpv4HostVrfTransportTransportUdpPortArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggingIpv4HostVrfTransportTransportUdpPortArgs Empty = new LoggingIpv4HostVrfTransportTransportUdpPortArgs();

    @Import(name="portNumber", required=true)
    private Output<Integer> portNumber;

    public Output<Integer> portNumber() {
        return this.portNumber;
    }

    private LoggingIpv4HostVrfTransportTransportUdpPortArgs() {}

    private LoggingIpv4HostVrfTransportTransportUdpPortArgs(LoggingIpv4HostVrfTransportTransportUdpPortArgs $) {
        this.portNumber = $.portNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingIpv4HostVrfTransportTransportUdpPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingIpv4HostVrfTransportTransportUdpPortArgs $;

        public Builder() {
            $ = new LoggingIpv4HostVrfTransportTransportUdpPortArgs();
        }

        public Builder(LoggingIpv4HostVrfTransportTransportUdpPortArgs defaults) {
            $ = new LoggingIpv4HostVrfTransportTransportUdpPortArgs(Objects.requireNonNull(defaults));
        }

        public Builder portNumber(Output<Integer> portNumber) {
            $.portNumber = portNumber;
            return this;
        }

        public Builder portNumber(Integer portNumber) {
            return portNumber(Output.of(portNumber));
        }

        public LoggingIpv4HostVrfTransportTransportUdpPortArgs build() {
            $.portNumber = Objects.requireNonNull($.portNumber, "expected parameter 'portNumber' to be non-null");
            return $;
        }
    }

}
