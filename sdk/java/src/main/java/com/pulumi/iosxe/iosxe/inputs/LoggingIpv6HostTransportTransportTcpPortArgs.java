// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class LoggingIpv6HostTransportTransportTcpPortArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggingIpv6HostTransportTransportTcpPortArgs Empty = new LoggingIpv6HostTransportTransportTcpPortArgs();

    @Import(name="portNumber", required=true)
    private Output<Integer> portNumber;

    public Output<Integer> portNumber() {
        return this.portNumber;
    }

    private LoggingIpv6HostTransportTransportTcpPortArgs() {}

    private LoggingIpv6HostTransportTransportTcpPortArgs(LoggingIpv6HostTransportTransportTcpPortArgs $) {
        this.portNumber = $.portNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingIpv6HostTransportTransportTcpPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingIpv6HostTransportTransportTcpPortArgs $;

        public Builder() {
            $ = new LoggingIpv6HostTransportTransportTcpPortArgs();
        }

        public Builder(LoggingIpv6HostTransportTransportTcpPortArgs defaults) {
            $ = new LoggingIpv6HostTransportTransportTcpPortArgs(Objects.requireNonNull(defaults));
        }

        public Builder portNumber(Output<Integer> portNumber) {
            $.portNumber = portNumber;
            return this;
        }

        public Builder portNumber(Integer portNumber) {
            return portNumber(Output.of(portNumber));
        }

        public LoggingIpv6HostTransportTransportTcpPortArgs build() {
            $.portNumber = Objects.requireNonNull($.portNumber, "expected parameter 'portNumber' to be non-null");
            return $;
        }
    }

}
