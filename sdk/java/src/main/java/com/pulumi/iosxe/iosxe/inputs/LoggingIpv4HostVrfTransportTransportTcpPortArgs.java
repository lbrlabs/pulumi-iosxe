// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class LoggingIpv4HostVrfTransportTransportTcpPortArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggingIpv4HostVrfTransportTransportTcpPortArgs Empty = new LoggingIpv4HostVrfTransportTransportTcpPortArgs();

    @Import(name="portNumber", required=true)
    private Output<Integer> portNumber;

    public Output<Integer> portNumber() {
        return this.portNumber;
    }

    private LoggingIpv4HostVrfTransportTransportTcpPortArgs() {}

    private LoggingIpv4HostVrfTransportTransportTcpPortArgs(LoggingIpv4HostVrfTransportTransportTcpPortArgs $) {
        this.portNumber = $.portNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingIpv4HostVrfTransportTransportTcpPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingIpv4HostVrfTransportTransportTcpPortArgs $;

        public Builder() {
            $ = new LoggingIpv4HostVrfTransportTransportTcpPortArgs();
        }

        public Builder(LoggingIpv4HostVrfTransportTransportTcpPortArgs defaults) {
            $ = new LoggingIpv4HostVrfTransportTransportTcpPortArgs(Objects.requireNonNull(defaults));
        }

        public Builder portNumber(Output<Integer> portNumber) {
            $.portNumber = portNumber;
            return this;
        }

        public Builder portNumber(Integer portNumber) {
            return portNumber(Output.of(portNumber));
        }

        public LoggingIpv4HostVrfTransportTransportTcpPortArgs build() {
            $.portNumber = Objects.requireNonNull($.portNumber, "expected parameter 'portNumber' to be non-null");
            return $;
        }
    }

}
