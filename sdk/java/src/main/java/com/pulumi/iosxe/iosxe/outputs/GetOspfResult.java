// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.GetOspfArea;
import com.pulumi.iosxe.iosxe.outputs.GetOspfNeighbor;
import com.pulumi.iosxe.iosxe.outputs.GetOspfNetwork;
import com.pulumi.iosxe.iosxe.outputs.GetOspfSummaryAddress;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOspfResult {
    private List<GetOspfArea> areas;
    private Boolean bfdAllInterfaces;
    private Boolean defaultInformationOriginate;
    private Boolean defaultInformationOriginateAlways;
    private Integer defaultMetric;
    private @Nullable String device;
    private Integer distance;
    private Integer domainTag;
    private String id;
    private Boolean mplsLdpAutoconfig;
    private Boolean mplsLdpSync;
    private List<GetOspfNeighbor> neighbors;
    private List<GetOspfNetwork> networks;
    private Boolean passiveInterfaceDefault;
    private Integer priority;
    private Integer processId;
    private String routerId;
    private Boolean shutdown;
    private List<GetOspfSummaryAddress> summaryAddresses;

    private GetOspfResult() {}
    public List<GetOspfArea> areas() {
        return this.areas;
    }
    public Boolean bfdAllInterfaces() {
        return this.bfdAllInterfaces;
    }
    public Boolean defaultInformationOriginate() {
        return this.defaultInformationOriginate;
    }
    public Boolean defaultInformationOriginateAlways() {
        return this.defaultInformationOriginateAlways;
    }
    public Integer defaultMetric() {
        return this.defaultMetric;
    }
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }
    public Integer distance() {
        return this.distance;
    }
    public Integer domainTag() {
        return this.domainTag;
    }
    public String id() {
        return this.id;
    }
    public Boolean mplsLdpAutoconfig() {
        return this.mplsLdpAutoconfig;
    }
    public Boolean mplsLdpSync() {
        return this.mplsLdpSync;
    }
    public List<GetOspfNeighbor> neighbors() {
        return this.neighbors;
    }
    public List<GetOspfNetwork> networks() {
        return this.networks;
    }
    public Boolean passiveInterfaceDefault() {
        return this.passiveInterfaceDefault;
    }
    public Integer priority() {
        return this.priority;
    }
    public Integer processId() {
        return this.processId;
    }
    public String routerId() {
        return this.routerId;
    }
    public Boolean shutdown() {
        return this.shutdown;
    }
    public List<GetOspfSummaryAddress> summaryAddresses() {
        return this.summaryAddresses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOspfResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetOspfArea> areas;
        private Boolean bfdAllInterfaces;
        private Boolean defaultInformationOriginate;
        private Boolean defaultInformationOriginateAlways;
        private Integer defaultMetric;
        private @Nullable String device;
        private Integer distance;
        private Integer domainTag;
        private String id;
        private Boolean mplsLdpAutoconfig;
        private Boolean mplsLdpSync;
        private List<GetOspfNeighbor> neighbors;
        private List<GetOspfNetwork> networks;
        private Boolean passiveInterfaceDefault;
        private Integer priority;
        private Integer processId;
        private String routerId;
        private Boolean shutdown;
        private List<GetOspfSummaryAddress> summaryAddresses;
        public Builder() {}
        public Builder(GetOspfResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.areas = defaults.areas;
    	      this.bfdAllInterfaces = defaults.bfdAllInterfaces;
    	      this.defaultInformationOriginate = defaults.defaultInformationOriginate;
    	      this.defaultInformationOriginateAlways = defaults.defaultInformationOriginateAlways;
    	      this.defaultMetric = defaults.defaultMetric;
    	      this.device = defaults.device;
    	      this.distance = defaults.distance;
    	      this.domainTag = defaults.domainTag;
    	      this.id = defaults.id;
    	      this.mplsLdpAutoconfig = defaults.mplsLdpAutoconfig;
    	      this.mplsLdpSync = defaults.mplsLdpSync;
    	      this.neighbors = defaults.neighbors;
    	      this.networks = defaults.networks;
    	      this.passiveInterfaceDefault = defaults.passiveInterfaceDefault;
    	      this.priority = defaults.priority;
    	      this.processId = defaults.processId;
    	      this.routerId = defaults.routerId;
    	      this.shutdown = defaults.shutdown;
    	      this.summaryAddresses = defaults.summaryAddresses;
        }

        @CustomType.Setter
        public Builder areas(List<GetOspfArea> areas) {
            this.areas = Objects.requireNonNull(areas);
            return this;
        }
        public Builder areas(GetOspfArea... areas) {
            return areas(List.of(areas));
        }
        @CustomType.Setter
        public Builder bfdAllInterfaces(Boolean bfdAllInterfaces) {
            this.bfdAllInterfaces = Objects.requireNonNull(bfdAllInterfaces);
            return this;
        }
        @CustomType.Setter
        public Builder defaultInformationOriginate(Boolean defaultInformationOriginate) {
            this.defaultInformationOriginate = Objects.requireNonNull(defaultInformationOriginate);
            return this;
        }
        @CustomType.Setter
        public Builder defaultInformationOriginateAlways(Boolean defaultInformationOriginateAlways) {
            this.defaultInformationOriginateAlways = Objects.requireNonNull(defaultInformationOriginateAlways);
            return this;
        }
        @CustomType.Setter
        public Builder defaultMetric(Integer defaultMetric) {
            this.defaultMetric = Objects.requireNonNull(defaultMetric);
            return this;
        }
        @CustomType.Setter
        public Builder device(@Nullable String device) {
            this.device = device;
            return this;
        }
        @CustomType.Setter
        public Builder distance(Integer distance) {
            this.distance = Objects.requireNonNull(distance);
            return this;
        }
        @CustomType.Setter
        public Builder domainTag(Integer domainTag) {
            this.domainTag = Objects.requireNonNull(domainTag);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder mplsLdpAutoconfig(Boolean mplsLdpAutoconfig) {
            this.mplsLdpAutoconfig = Objects.requireNonNull(mplsLdpAutoconfig);
            return this;
        }
        @CustomType.Setter
        public Builder mplsLdpSync(Boolean mplsLdpSync) {
            this.mplsLdpSync = Objects.requireNonNull(mplsLdpSync);
            return this;
        }
        @CustomType.Setter
        public Builder neighbors(List<GetOspfNeighbor> neighbors) {
            this.neighbors = Objects.requireNonNull(neighbors);
            return this;
        }
        public Builder neighbors(GetOspfNeighbor... neighbors) {
            return neighbors(List.of(neighbors));
        }
        @CustomType.Setter
        public Builder networks(List<GetOspfNetwork> networks) {
            this.networks = Objects.requireNonNull(networks);
            return this;
        }
        public Builder networks(GetOspfNetwork... networks) {
            return networks(List.of(networks));
        }
        @CustomType.Setter
        public Builder passiveInterfaceDefault(Boolean passiveInterfaceDefault) {
            this.passiveInterfaceDefault = Objects.requireNonNull(passiveInterfaceDefault);
            return this;
        }
        @CustomType.Setter
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        @CustomType.Setter
        public Builder processId(Integer processId) {
            this.processId = Objects.requireNonNull(processId);
            return this;
        }
        @CustomType.Setter
        public Builder routerId(String routerId) {
            this.routerId = Objects.requireNonNull(routerId);
            return this;
        }
        @CustomType.Setter
        public Builder shutdown(Boolean shutdown) {
            this.shutdown = Objects.requireNonNull(shutdown);
            return this;
        }
        @CustomType.Setter
        public Builder summaryAddresses(List<GetOspfSummaryAddress> summaryAddresses) {
            this.summaryAddresses = Objects.requireNonNull(summaryAddresses);
            return this;
        }
        public Builder summaryAddresses(GetOspfSummaryAddress... summaryAddresses) {
            return summaryAddresses(List.of(summaryAddresses));
        }
        public GetOspfResult build() {
            final var o = new GetOspfResult();
            o.areas = areas;
            o.bfdAllInterfaces = bfdAllInterfaces;
            o.defaultInformationOriginate = defaultInformationOriginate;
            o.defaultInformationOriginateAlways = defaultInformationOriginateAlways;
            o.defaultMetric = defaultMetric;
            o.device = device;
            o.distance = distance;
            o.domainTag = domainTag;
            o.id = id;
            o.mplsLdpAutoconfig = mplsLdpAutoconfig;
            o.mplsLdpSync = mplsLdpSync;
            o.neighbors = neighbors;
            o.networks = networks;
            o.passiveInterfaceDefault = passiveInterfaceDefault;
            o.priority = priority;
            o.processId = processId;
            o.routerId = routerId;
            o.shutdown = shutdown;
            o.summaryAddresses = summaryAddresses;
            return o;
        }
    }
}