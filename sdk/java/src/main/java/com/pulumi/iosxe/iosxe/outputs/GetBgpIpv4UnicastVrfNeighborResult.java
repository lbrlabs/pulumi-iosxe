// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.GetBgpIpv4UnicastVrfNeighborRouteMap;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBgpIpv4UnicastVrfNeighborResult {
    private Boolean activate;
    private String asn;
    private String clusterId;
    private String description;
    private @Nullable String device;
    private Boolean disableConnectedCheck;
    private Boolean ebgpMultihop;
    private Integer ebgpMultihopMaxHop;
    private Boolean fallOverBfdCheckControlPlaneFailure;
    private Boolean fallOverBfdMultiHop;
    private Boolean fallOverBfdSingleHop;
    private Boolean fallOverBfdStrictMode;
    private String fallOverDefaultRouteMap;
    private String fallOverMaximumMetricRouteMap;
    private String id;
    private String ip;
    private String localAs;
    private Boolean localAsDualAs;
    private Boolean localAsNoPrepend;
    private Boolean localAsReplaceAs;
    private Boolean logNeighborChangesDisable;
    private String password;
    private Integer passwordType;
    private String remoteAs;
    private List<GetBgpIpv4UnicastVrfNeighborRouteMap> routeMaps;
    private Boolean routeReflectorClient;
    private String sendCommunity;
    private Boolean shutdown;
    private Integer timersHoldtime;
    private Integer timersKeepaliveInterval;
    private Integer timersMinimumNeighborHold;
    private Integer ttlSecurityHops;
    private String updateSourceLoopback;
    private Integer version;
    private String vrf;

    private GetBgpIpv4UnicastVrfNeighborResult() {}
    public Boolean activate() {
        return this.activate;
    }
    public String asn() {
        return this.asn;
    }
    public String clusterId() {
        return this.clusterId;
    }
    public String description() {
        return this.description;
    }
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }
    public Boolean disableConnectedCheck() {
        return this.disableConnectedCheck;
    }
    public Boolean ebgpMultihop() {
        return this.ebgpMultihop;
    }
    public Integer ebgpMultihopMaxHop() {
        return this.ebgpMultihopMaxHop;
    }
    public Boolean fallOverBfdCheckControlPlaneFailure() {
        return this.fallOverBfdCheckControlPlaneFailure;
    }
    public Boolean fallOverBfdMultiHop() {
        return this.fallOverBfdMultiHop;
    }
    public Boolean fallOverBfdSingleHop() {
        return this.fallOverBfdSingleHop;
    }
    public Boolean fallOverBfdStrictMode() {
        return this.fallOverBfdStrictMode;
    }
    public String fallOverDefaultRouteMap() {
        return this.fallOverDefaultRouteMap;
    }
    public String fallOverMaximumMetricRouteMap() {
        return this.fallOverMaximumMetricRouteMap;
    }
    public String id() {
        return this.id;
    }
    public String ip() {
        return this.ip;
    }
    public String localAs() {
        return this.localAs;
    }
    public Boolean localAsDualAs() {
        return this.localAsDualAs;
    }
    public Boolean localAsNoPrepend() {
        return this.localAsNoPrepend;
    }
    public Boolean localAsReplaceAs() {
        return this.localAsReplaceAs;
    }
    public Boolean logNeighborChangesDisable() {
        return this.logNeighborChangesDisable;
    }
    public String password() {
        return this.password;
    }
    public Integer passwordType() {
        return this.passwordType;
    }
    public String remoteAs() {
        return this.remoteAs;
    }
    public List<GetBgpIpv4UnicastVrfNeighborRouteMap> routeMaps() {
        return this.routeMaps;
    }
    public Boolean routeReflectorClient() {
        return this.routeReflectorClient;
    }
    public String sendCommunity() {
        return this.sendCommunity;
    }
    public Boolean shutdown() {
        return this.shutdown;
    }
    public Integer timersHoldtime() {
        return this.timersHoldtime;
    }
    public Integer timersKeepaliveInterval() {
        return this.timersKeepaliveInterval;
    }
    public Integer timersMinimumNeighborHold() {
        return this.timersMinimumNeighborHold;
    }
    public Integer ttlSecurityHops() {
        return this.ttlSecurityHops;
    }
    public String updateSourceLoopback() {
        return this.updateSourceLoopback;
    }
    public Integer version() {
        return this.version;
    }
    public String vrf() {
        return this.vrf;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBgpIpv4UnicastVrfNeighborResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean activate;
        private String asn;
        private String clusterId;
        private String description;
        private @Nullable String device;
        private Boolean disableConnectedCheck;
        private Boolean ebgpMultihop;
        private Integer ebgpMultihopMaxHop;
        private Boolean fallOverBfdCheckControlPlaneFailure;
        private Boolean fallOverBfdMultiHop;
        private Boolean fallOverBfdSingleHop;
        private Boolean fallOverBfdStrictMode;
        private String fallOverDefaultRouteMap;
        private String fallOverMaximumMetricRouteMap;
        private String id;
        private String ip;
        private String localAs;
        private Boolean localAsDualAs;
        private Boolean localAsNoPrepend;
        private Boolean localAsReplaceAs;
        private Boolean logNeighborChangesDisable;
        private String password;
        private Integer passwordType;
        private String remoteAs;
        private List<GetBgpIpv4UnicastVrfNeighborRouteMap> routeMaps;
        private Boolean routeReflectorClient;
        private String sendCommunity;
        private Boolean shutdown;
        private Integer timersHoldtime;
        private Integer timersKeepaliveInterval;
        private Integer timersMinimumNeighborHold;
        private Integer ttlSecurityHops;
        private String updateSourceLoopback;
        private Integer version;
        private String vrf;
        public Builder() {}
        public Builder(GetBgpIpv4UnicastVrfNeighborResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activate = defaults.activate;
    	      this.asn = defaults.asn;
    	      this.clusterId = defaults.clusterId;
    	      this.description = defaults.description;
    	      this.device = defaults.device;
    	      this.disableConnectedCheck = defaults.disableConnectedCheck;
    	      this.ebgpMultihop = defaults.ebgpMultihop;
    	      this.ebgpMultihopMaxHop = defaults.ebgpMultihopMaxHop;
    	      this.fallOverBfdCheckControlPlaneFailure = defaults.fallOverBfdCheckControlPlaneFailure;
    	      this.fallOverBfdMultiHop = defaults.fallOverBfdMultiHop;
    	      this.fallOverBfdSingleHop = defaults.fallOverBfdSingleHop;
    	      this.fallOverBfdStrictMode = defaults.fallOverBfdStrictMode;
    	      this.fallOverDefaultRouteMap = defaults.fallOverDefaultRouteMap;
    	      this.fallOverMaximumMetricRouteMap = defaults.fallOverMaximumMetricRouteMap;
    	      this.id = defaults.id;
    	      this.ip = defaults.ip;
    	      this.localAs = defaults.localAs;
    	      this.localAsDualAs = defaults.localAsDualAs;
    	      this.localAsNoPrepend = defaults.localAsNoPrepend;
    	      this.localAsReplaceAs = defaults.localAsReplaceAs;
    	      this.logNeighborChangesDisable = defaults.logNeighborChangesDisable;
    	      this.password = defaults.password;
    	      this.passwordType = defaults.passwordType;
    	      this.remoteAs = defaults.remoteAs;
    	      this.routeMaps = defaults.routeMaps;
    	      this.routeReflectorClient = defaults.routeReflectorClient;
    	      this.sendCommunity = defaults.sendCommunity;
    	      this.shutdown = defaults.shutdown;
    	      this.timersHoldtime = defaults.timersHoldtime;
    	      this.timersKeepaliveInterval = defaults.timersKeepaliveInterval;
    	      this.timersMinimumNeighborHold = defaults.timersMinimumNeighborHold;
    	      this.ttlSecurityHops = defaults.ttlSecurityHops;
    	      this.updateSourceLoopback = defaults.updateSourceLoopback;
    	      this.version = defaults.version;
    	      this.vrf = defaults.vrf;
        }

        @CustomType.Setter
        public Builder activate(Boolean activate) {
            this.activate = Objects.requireNonNull(activate);
            return this;
        }
        @CustomType.Setter
        public Builder asn(String asn) {
            this.asn = Objects.requireNonNull(asn);
            return this;
        }
        @CustomType.Setter
        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder device(@Nullable String device) {
            this.device = device;
            return this;
        }
        @CustomType.Setter
        public Builder disableConnectedCheck(Boolean disableConnectedCheck) {
            this.disableConnectedCheck = Objects.requireNonNull(disableConnectedCheck);
            return this;
        }
        @CustomType.Setter
        public Builder ebgpMultihop(Boolean ebgpMultihop) {
            this.ebgpMultihop = Objects.requireNonNull(ebgpMultihop);
            return this;
        }
        @CustomType.Setter
        public Builder ebgpMultihopMaxHop(Integer ebgpMultihopMaxHop) {
            this.ebgpMultihopMaxHop = Objects.requireNonNull(ebgpMultihopMaxHop);
            return this;
        }
        @CustomType.Setter
        public Builder fallOverBfdCheckControlPlaneFailure(Boolean fallOverBfdCheckControlPlaneFailure) {
            this.fallOverBfdCheckControlPlaneFailure = Objects.requireNonNull(fallOverBfdCheckControlPlaneFailure);
            return this;
        }
        @CustomType.Setter
        public Builder fallOverBfdMultiHop(Boolean fallOverBfdMultiHop) {
            this.fallOverBfdMultiHop = Objects.requireNonNull(fallOverBfdMultiHop);
            return this;
        }
        @CustomType.Setter
        public Builder fallOverBfdSingleHop(Boolean fallOverBfdSingleHop) {
            this.fallOverBfdSingleHop = Objects.requireNonNull(fallOverBfdSingleHop);
            return this;
        }
        @CustomType.Setter
        public Builder fallOverBfdStrictMode(Boolean fallOverBfdStrictMode) {
            this.fallOverBfdStrictMode = Objects.requireNonNull(fallOverBfdStrictMode);
            return this;
        }
        @CustomType.Setter
        public Builder fallOverDefaultRouteMap(String fallOverDefaultRouteMap) {
            this.fallOverDefaultRouteMap = Objects.requireNonNull(fallOverDefaultRouteMap);
            return this;
        }
        @CustomType.Setter
        public Builder fallOverMaximumMetricRouteMap(String fallOverMaximumMetricRouteMap) {
            this.fallOverMaximumMetricRouteMap = Objects.requireNonNull(fallOverMaximumMetricRouteMap);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ip(String ip) {
            this.ip = Objects.requireNonNull(ip);
            return this;
        }
        @CustomType.Setter
        public Builder localAs(String localAs) {
            this.localAs = Objects.requireNonNull(localAs);
            return this;
        }
        @CustomType.Setter
        public Builder localAsDualAs(Boolean localAsDualAs) {
            this.localAsDualAs = Objects.requireNonNull(localAsDualAs);
            return this;
        }
        @CustomType.Setter
        public Builder localAsNoPrepend(Boolean localAsNoPrepend) {
            this.localAsNoPrepend = Objects.requireNonNull(localAsNoPrepend);
            return this;
        }
        @CustomType.Setter
        public Builder localAsReplaceAs(Boolean localAsReplaceAs) {
            this.localAsReplaceAs = Objects.requireNonNull(localAsReplaceAs);
            return this;
        }
        @CustomType.Setter
        public Builder logNeighborChangesDisable(Boolean logNeighborChangesDisable) {
            this.logNeighborChangesDisable = Objects.requireNonNull(logNeighborChangesDisable);
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        @CustomType.Setter
        public Builder passwordType(Integer passwordType) {
            this.passwordType = Objects.requireNonNull(passwordType);
            return this;
        }
        @CustomType.Setter
        public Builder remoteAs(String remoteAs) {
            this.remoteAs = Objects.requireNonNull(remoteAs);
            return this;
        }
        @CustomType.Setter
        public Builder routeMaps(List<GetBgpIpv4UnicastVrfNeighborRouteMap> routeMaps) {
            this.routeMaps = Objects.requireNonNull(routeMaps);
            return this;
        }
        public Builder routeMaps(GetBgpIpv4UnicastVrfNeighborRouteMap... routeMaps) {
            return routeMaps(List.of(routeMaps));
        }
        @CustomType.Setter
        public Builder routeReflectorClient(Boolean routeReflectorClient) {
            this.routeReflectorClient = Objects.requireNonNull(routeReflectorClient);
            return this;
        }
        @CustomType.Setter
        public Builder sendCommunity(String sendCommunity) {
            this.sendCommunity = Objects.requireNonNull(sendCommunity);
            return this;
        }
        @CustomType.Setter
        public Builder shutdown(Boolean shutdown) {
            this.shutdown = Objects.requireNonNull(shutdown);
            return this;
        }
        @CustomType.Setter
        public Builder timersHoldtime(Integer timersHoldtime) {
            this.timersHoldtime = Objects.requireNonNull(timersHoldtime);
            return this;
        }
        @CustomType.Setter
        public Builder timersKeepaliveInterval(Integer timersKeepaliveInterval) {
            this.timersKeepaliveInterval = Objects.requireNonNull(timersKeepaliveInterval);
            return this;
        }
        @CustomType.Setter
        public Builder timersMinimumNeighborHold(Integer timersMinimumNeighborHold) {
            this.timersMinimumNeighborHold = Objects.requireNonNull(timersMinimumNeighborHold);
            return this;
        }
        @CustomType.Setter
        public Builder ttlSecurityHops(Integer ttlSecurityHops) {
            this.ttlSecurityHops = Objects.requireNonNull(ttlSecurityHops);
            return this;
        }
        @CustomType.Setter
        public Builder updateSourceLoopback(String updateSourceLoopback) {
            this.updateSourceLoopback = Objects.requireNonNull(updateSourceLoopback);
            return this;
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        @CustomType.Setter
        public Builder vrf(String vrf) {
            this.vrf = Objects.requireNonNull(vrf);
            return this;
        }
        public GetBgpIpv4UnicastVrfNeighborResult build() {
            final var o = new GetBgpIpv4UnicastVrfNeighborResult();
            o.activate = activate;
            o.asn = asn;
            o.clusterId = clusterId;
            o.description = description;
            o.device = device;
            o.disableConnectedCheck = disableConnectedCheck;
            o.ebgpMultihop = ebgpMultihop;
            o.ebgpMultihopMaxHop = ebgpMultihopMaxHop;
            o.fallOverBfdCheckControlPlaneFailure = fallOverBfdCheckControlPlaneFailure;
            o.fallOverBfdMultiHop = fallOverBfdMultiHop;
            o.fallOverBfdSingleHop = fallOverBfdSingleHop;
            o.fallOverBfdStrictMode = fallOverBfdStrictMode;
            o.fallOverDefaultRouteMap = fallOverDefaultRouteMap;
            o.fallOverMaximumMetricRouteMap = fallOverMaximumMetricRouteMap;
            o.id = id;
            o.ip = ip;
            o.localAs = localAs;
            o.localAsDualAs = localAsDualAs;
            o.localAsNoPrepend = localAsNoPrepend;
            o.localAsReplaceAs = localAsReplaceAs;
            o.logNeighborChangesDisable = logNeighborChangesDisable;
            o.password = password;
            o.passwordType = passwordType;
            o.remoteAs = remoteAs;
            o.routeMaps = routeMaps;
            o.routeReflectorClient = routeReflectorClient;
            o.sendCommunity = sendCommunity;
            o.shutdown = shutdown;
            o.timersHoldtime = timersHoldtime;
            o.timersKeepaliveInterval = timersKeepaliveInterval;
            o.timersMinimumNeighborHold = timersMinimumNeighborHold;
            o.ttlSecurityHops = ttlSecurityHops;
            o.updateSourceLoopback = updateSourceLoopback;
            o.version = version;
            o.vrf = vrf;
            return o;
        }
    }
}
