// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.GetLoggingIpv4HostTransportTransportTcpPort;
import com.pulumi.iosxe.iosxe.outputs.GetLoggingIpv4HostTransportTransportTlsPort;
import com.pulumi.iosxe.iosxe.outputs.GetLoggingIpv4HostTransportTransportUdpPort;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLoggingIpv4HostTransportResult {
    private @Nullable String device;
    private String id;
    private String ipv4Host;
    private List<GetLoggingIpv4HostTransportTransportTcpPort> transportTcpPorts;
    private List<GetLoggingIpv4HostTransportTransportTlsPort> transportTlsPorts;
    private List<GetLoggingIpv4HostTransportTransportUdpPort> transportUdpPorts;

    private GetLoggingIpv4HostTransportResult() {}
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }
    public String id() {
        return this.id;
    }
    public String ipv4Host() {
        return this.ipv4Host;
    }
    public List<GetLoggingIpv4HostTransportTransportTcpPort> transportTcpPorts() {
        return this.transportTcpPorts;
    }
    public List<GetLoggingIpv4HostTransportTransportTlsPort> transportTlsPorts() {
        return this.transportTlsPorts;
    }
    public List<GetLoggingIpv4HostTransportTransportUdpPort> transportUdpPorts() {
        return this.transportUdpPorts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoggingIpv4HostTransportResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String device;
        private String id;
        private String ipv4Host;
        private List<GetLoggingIpv4HostTransportTransportTcpPort> transportTcpPorts;
        private List<GetLoggingIpv4HostTransportTransportTlsPort> transportTlsPorts;
        private List<GetLoggingIpv4HostTransportTransportUdpPort> transportUdpPorts;
        public Builder() {}
        public Builder(GetLoggingIpv4HostTransportResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.device = defaults.device;
    	      this.id = defaults.id;
    	      this.ipv4Host = defaults.ipv4Host;
    	      this.transportTcpPorts = defaults.transportTcpPorts;
    	      this.transportTlsPorts = defaults.transportTlsPorts;
    	      this.transportUdpPorts = defaults.transportUdpPorts;
        }

        @CustomType.Setter
        public Builder device(@Nullable String device) {
            this.device = device;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipv4Host(String ipv4Host) {
            this.ipv4Host = Objects.requireNonNull(ipv4Host);
            return this;
        }
        @CustomType.Setter
        public Builder transportTcpPorts(List<GetLoggingIpv4HostTransportTransportTcpPort> transportTcpPorts) {
            this.transportTcpPorts = Objects.requireNonNull(transportTcpPorts);
            return this;
        }
        public Builder transportTcpPorts(GetLoggingIpv4HostTransportTransportTcpPort... transportTcpPorts) {
            return transportTcpPorts(List.of(transportTcpPorts));
        }
        @CustomType.Setter
        public Builder transportTlsPorts(List<GetLoggingIpv4HostTransportTransportTlsPort> transportTlsPorts) {
            this.transportTlsPorts = Objects.requireNonNull(transportTlsPorts);
            return this;
        }
        public Builder transportTlsPorts(GetLoggingIpv4HostTransportTransportTlsPort... transportTlsPorts) {
            return transportTlsPorts(List.of(transportTlsPorts));
        }
        @CustomType.Setter
        public Builder transportUdpPorts(List<GetLoggingIpv4HostTransportTransportUdpPort> transportUdpPorts) {
            this.transportUdpPorts = Objects.requireNonNull(transportUdpPorts);
            return this;
        }
        public Builder transportUdpPorts(GetLoggingIpv4HostTransportTransportUdpPort... transportUdpPorts) {
            return transportUdpPorts(List.of(transportUdpPorts));
        }
        public GetLoggingIpv4HostTransportResult build() {
            final var o = new GetLoggingIpv4HostTransportResult();
            o.device = device;
            o.id = id;
            o.ipv4Host = ipv4Host;
            o.transportTcpPorts = transportTcpPorts;
            o.transportTlsPorts = transportTlsPorts;
            o.transportUdpPorts = transportUdpPorts;
            return o;
        }
    }
}