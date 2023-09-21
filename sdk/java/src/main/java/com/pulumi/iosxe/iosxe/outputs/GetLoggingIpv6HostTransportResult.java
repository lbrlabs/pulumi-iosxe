// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.GetLoggingIpv6HostTransportTransportTcpPort;
import com.pulumi.iosxe.iosxe.outputs.GetLoggingIpv6HostTransportTransportTlsPort;
import com.pulumi.iosxe.iosxe.outputs.GetLoggingIpv6HostTransportTransportUdpPort;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLoggingIpv6HostTransportResult {
    private @Nullable String device;
    private String id;
    private String ipv6Host;
    private List<GetLoggingIpv6HostTransportTransportTcpPort> transportTcpPorts;
    private List<GetLoggingIpv6HostTransportTransportTlsPort> transportTlsPorts;
    private List<GetLoggingIpv6HostTransportTransportUdpPort> transportUdpPorts;

    private GetLoggingIpv6HostTransportResult() {}
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }
    public String id() {
        return this.id;
    }
    public String ipv6Host() {
        return this.ipv6Host;
    }
    public List<GetLoggingIpv6HostTransportTransportTcpPort> transportTcpPorts() {
        return this.transportTcpPorts;
    }
    public List<GetLoggingIpv6HostTransportTransportTlsPort> transportTlsPorts() {
        return this.transportTlsPorts;
    }
    public List<GetLoggingIpv6HostTransportTransportUdpPort> transportUdpPorts() {
        return this.transportUdpPorts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoggingIpv6HostTransportResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String device;
        private String id;
        private String ipv6Host;
        private List<GetLoggingIpv6HostTransportTransportTcpPort> transportTcpPorts;
        private List<GetLoggingIpv6HostTransportTransportTlsPort> transportTlsPorts;
        private List<GetLoggingIpv6HostTransportTransportUdpPort> transportUdpPorts;
        public Builder() {}
        public Builder(GetLoggingIpv6HostTransportResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.device = defaults.device;
    	      this.id = defaults.id;
    	      this.ipv6Host = defaults.ipv6Host;
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
        public Builder ipv6Host(String ipv6Host) {
            this.ipv6Host = Objects.requireNonNull(ipv6Host);
            return this;
        }
        @CustomType.Setter
        public Builder transportTcpPorts(List<GetLoggingIpv6HostTransportTransportTcpPort> transportTcpPorts) {
            this.transportTcpPorts = Objects.requireNonNull(transportTcpPorts);
            return this;
        }
        public Builder transportTcpPorts(GetLoggingIpv6HostTransportTransportTcpPort... transportTcpPorts) {
            return transportTcpPorts(List.of(transportTcpPorts));
        }
        @CustomType.Setter
        public Builder transportTlsPorts(List<GetLoggingIpv6HostTransportTransportTlsPort> transportTlsPorts) {
            this.transportTlsPorts = Objects.requireNonNull(transportTlsPorts);
            return this;
        }
        public Builder transportTlsPorts(GetLoggingIpv6HostTransportTransportTlsPort... transportTlsPorts) {
            return transportTlsPorts(List.of(transportTlsPorts));
        }
        @CustomType.Setter
        public Builder transportUdpPorts(List<GetLoggingIpv6HostTransportTransportUdpPort> transportUdpPorts) {
            this.transportUdpPorts = Objects.requireNonNull(transportUdpPorts);
            return this;
        }
        public Builder transportUdpPorts(GetLoggingIpv6HostTransportTransportUdpPort... transportUdpPorts) {
            return transportUdpPorts(List.of(transportUdpPorts));
        }
        public GetLoggingIpv6HostTransportResult build() {
            final var o = new GetLoggingIpv6HostTransportResult();
            o.device = device;
            o.id = id;
            o.ipv6Host = ipv6Host;
            o.transportTcpPorts = transportTcpPorts;
            o.transportTlsPorts = transportTlsPorts;
            o.transportUdpPorts = transportUdpPorts;
            return o;
        }
    }
}