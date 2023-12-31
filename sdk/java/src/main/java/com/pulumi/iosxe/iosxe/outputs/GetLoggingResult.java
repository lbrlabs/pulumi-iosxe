// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.GetLoggingIpv4Host;
import com.pulumi.iosxe.iosxe.outputs.GetLoggingIpv4VrfHost;
import com.pulumi.iosxe.iosxe.outputs.GetLoggingIpv6Host;
import com.pulumi.iosxe.iosxe.outputs.GetLoggingIpv6VrfHost;
import com.pulumi.iosxe.iosxe.outputs.GetLoggingSourceInterfacesVrf;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLoggingResult {
    /**
     * @return Logging severity level
     * 
     */
    private String bufferedSeverity;
    /**
     * @return Logging buffer size
     * 
     */
    private Integer bufferedSize;
    private String consoleSeverity;
    /**
     * @return A device name from the provider configuration.
     * 
     */
    private @Nullable String device;
    /**
     * @return Facility parameter for syslog messages
     * 
     */
    private String facility;
    private Integer fileMaxSize;
    private Integer fileMinSize;
    private String fileName;
    private String fileSeverity;
    private String historySeverity;
    /**
     * @return Set history table size
     * 
     */
    private Integer historySize;
    /**
     * @return The path of the retrieved object.
     * 
     */
    private String id;
    private List<GetLoggingIpv4Host> ipv4Hosts;
    private List<GetLoggingIpv4VrfHost> ipv4VrfHosts;
    private List<GetLoggingIpv6Host> ipv6Hosts;
    private List<GetLoggingIpv6VrfHost> ipv6VrfHosts;
    private String monitorSeverity;
    /**
     * @return Define a unique text string as ID
     * 
     */
    private String originIdName;
    /**
     * @return Use origin hostname/ip/ipv6 as ID
     * 
     */
    private String originIdType;
    private String sourceInterface;
    /**
     * @return Specify interface and vrf for source address in logging transactions
     * 
     */
    private List<GetLoggingSourceInterfacesVrf> sourceInterfacesVrves;
    /**
     * @return Set trap server logging level
     * 
     */
    private Boolean trap;
    private String trapSeverity;

    private GetLoggingResult() {}
    /**
     * @return Logging severity level
     * 
     */
    public String bufferedSeverity() {
        return this.bufferedSeverity;
    }
    /**
     * @return Logging buffer size
     * 
     */
    public Integer bufferedSize() {
        return this.bufferedSize;
    }
    public String consoleSeverity() {
        return this.consoleSeverity;
    }
    /**
     * @return A device name from the provider configuration.
     * 
     */
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }
    /**
     * @return Facility parameter for syslog messages
     * 
     */
    public String facility() {
        return this.facility;
    }
    public Integer fileMaxSize() {
        return this.fileMaxSize;
    }
    public Integer fileMinSize() {
        return this.fileMinSize;
    }
    public String fileName() {
        return this.fileName;
    }
    public String fileSeverity() {
        return this.fileSeverity;
    }
    public String historySeverity() {
        return this.historySeverity;
    }
    /**
     * @return Set history table size
     * 
     */
    public Integer historySize() {
        return this.historySize;
    }
    /**
     * @return The path of the retrieved object.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetLoggingIpv4Host> ipv4Hosts() {
        return this.ipv4Hosts;
    }
    public List<GetLoggingIpv4VrfHost> ipv4VrfHosts() {
        return this.ipv4VrfHosts;
    }
    public List<GetLoggingIpv6Host> ipv6Hosts() {
        return this.ipv6Hosts;
    }
    public List<GetLoggingIpv6VrfHost> ipv6VrfHosts() {
        return this.ipv6VrfHosts;
    }
    public String monitorSeverity() {
        return this.monitorSeverity;
    }
    /**
     * @return Define a unique text string as ID
     * 
     */
    public String originIdName() {
        return this.originIdName;
    }
    /**
     * @return Use origin hostname/ip/ipv6 as ID
     * 
     */
    public String originIdType() {
        return this.originIdType;
    }
    public String sourceInterface() {
        return this.sourceInterface;
    }
    /**
     * @return Specify interface and vrf for source address in logging transactions
     * 
     */
    public List<GetLoggingSourceInterfacesVrf> sourceInterfacesVrves() {
        return this.sourceInterfacesVrves;
    }
    /**
     * @return Set trap server logging level
     * 
     */
    public Boolean trap() {
        return this.trap;
    }
    public String trapSeverity() {
        return this.trapSeverity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoggingResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bufferedSeverity;
        private Integer bufferedSize;
        private String consoleSeverity;
        private @Nullable String device;
        private String facility;
        private Integer fileMaxSize;
        private Integer fileMinSize;
        private String fileName;
        private String fileSeverity;
        private String historySeverity;
        private Integer historySize;
        private String id;
        private List<GetLoggingIpv4Host> ipv4Hosts;
        private List<GetLoggingIpv4VrfHost> ipv4VrfHosts;
        private List<GetLoggingIpv6Host> ipv6Hosts;
        private List<GetLoggingIpv6VrfHost> ipv6VrfHosts;
        private String monitorSeverity;
        private String originIdName;
        private String originIdType;
        private String sourceInterface;
        private List<GetLoggingSourceInterfacesVrf> sourceInterfacesVrves;
        private Boolean trap;
        private String trapSeverity;
        public Builder() {}
        public Builder(GetLoggingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bufferedSeverity = defaults.bufferedSeverity;
    	      this.bufferedSize = defaults.bufferedSize;
    	      this.consoleSeverity = defaults.consoleSeverity;
    	      this.device = defaults.device;
    	      this.facility = defaults.facility;
    	      this.fileMaxSize = defaults.fileMaxSize;
    	      this.fileMinSize = defaults.fileMinSize;
    	      this.fileName = defaults.fileName;
    	      this.fileSeverity = defaults.fileSeverity;
    	      this.historySeverity = defaults.historySeverity;
    	      this.historySize = defaults.historySize;
    	      this.id = defaults.id;
    	      this.ipv4Hosts = defaults.ipv4Hosts;
    	      this.ipv4VrfHosts = defaults.ipv4VrfHosts;
    	      this.ipv6Hosts = defaults.ipv6Hosts;
    	      this.ipv6VrfHosts = defaults.ipv6VrfHosts;
    	      this.monitorSeverity = defaults.monitorSeverity;
    	      this.originIdName = defaults.originIdName;
    	      this.originIdType = defaults.originIdType;
    	      this.sourceInterface = defaults.sourceInterface;
    	      this.sourceInterfacesVrves = defaults.sourceInterfacesVrves;
    	      this.trap = defaults.trap;
    	      this.trapSeverity = defaults.trapSeverity;
        }

        @CustomType.Setter
        public Builder bufferedSeverity(String bufferedSeverity) {
            this.bufferedSeverity = Objects.requireNonNull(bufferedSeverity);
            return this;
        }
        @CustomType.Setter
        public Builder bufferedSize(Integer bufferedSize) {
            this.bufferedSize = Objects.requireNonNull(bufferedSize);
            return this;
        }
        @CustomType.Setter
        public Builder consoleSeverity(String consoleSeverity) {
            this.consoleSeverity = Objects.requireNonNull(consoleSeverity);
            return this;
        }
        @CustomType.Setter
        public Builder device(@Nullable String device) {
            this.device = device;
            return this;
        }
        @CustomType.Setter
        public Builder facility(String facility) {
            this.facility = Objects.requireNonNull(facility);
            return this;
        }
        @CustomType.Setter
        public Builder fileMaxSize(Integer fileMaxSize) {
            this.fileMaxSize = Objects.requireNonNull(fileMaxSize);
            return this;
        }
        @CustomType.Setter
        public Builder fileMinSize(Integer fileMinSize) {
            this.fileMinSize = Objects.requireNonNull(fileMinSize);
            return this;
        }
        @CustomType.Setter
        public Builder fileName(String fileName) {
            this.fileName = Objects.requireNonNull(fileName);
            return this;
        }
        @CustomType.Setter
        public Builder fileSeverity(String fileSeverity) {
            this.fileSeverity = Objects.requireNonNull(fileSeverity);
            return this;
        }
        @CustomType.Setter
        public Builder historySeverity(String historySeverity) {
            this.historySeverity = Objects.requireNonNull(historySeverity);
            return this;
        }
        @CustomType.Setter
        public Builder historySize(Integer historySize) {
            this.historySize = Objects.requireNonNull(historySize);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipv4Hosts(List<GetLoggingIpv4Host> ipv4Hosts) {
            this.ipv4Hosts = Objects.requireNonNull(ipv4Hosts);
            return this;
        }
        public Builder ipv4Hosts(GetLoggingIpv4Host... ipv4Hosts) {
            return ipv4Hosts(List.of(ipv4Hosts));
        }
        @CustomType.Setter
        public Builder ipv4VrfHosts(List<GetLoggingIpv4VrfHost> ipv4VrfHosts) {
            this.ipv4VrfHosts = Objects.requireNonNull(ipv4VrfHosts);
            return this;
        }
        public Builder ipv4VrfHosts(GetLoggingIpv4VrfHost... ipv4VrfHosts) {
            return ipv4VrfHosts(List.of(ipv4VrfHosts));
        }
        @CustomType.Setter
        public Builder ipv6Hosts(List<GetLoggingIpv6Host> ipv6Hosts) {
            this.ipv6Hosts = Objects.requireNonNull(ipv6Hosts);
            return this;
        }
        public Builder ipv6Hosts(GetLoggingIpv6Host... ipv6Hosts) {
            return ipv6Hosts(List.of(ipv6Hosts));
        }
        @CustomType.Setter
        public Builder ipv6VrfHosts(List<GetLoggingIpv6VrfHost> ipv6VrfHosts) {
            this.ipv6VrfHosts = Objects.requireNonNull(ipv6VrfHosts);
            return this;
        }
        public Builder ipv6VrfHosts(GetLoggingIpv6VrfHost... ipv6VrfHosts) {
            return ipv6VrfHosts(List.of(ipv6VrfHosts));
        }
        @CustomType.Setter
        public Builder monitorSeverity(String monitorSeverity) {
            this.monitorSeverity = Objects.requireNonNull(monitorSeverity);
            return this;
        }
        @CustomType.Setter
        public Builder originIdName(String originIdName) {
            this.originIdName = Objects.requireNonNull(originIdName);
            return this;
        }
        @CustomType.Setter
        public Builder originIdType(String originIdType) {
            this.originIdType = Objects.requireNonNull(originIdType);
            return this;
        }
        @CustomType.Setter
        public Builder sourceInterface(String sourceInterface) {
            this.sourceInterface = Objects.requireNonNull(sourceInterface);
            return this;
        }
        @CustomType.Setter
        public Builder sourceInterfacesVrves(List<GetLoggingSourceInterfacesVrf> sourceInterfacesVrves) {
            this.sourceInterfacesVrves = Objects.requireNonNull(sourceInterfacesVrves);
            return this;
        }
        public Builder sourceInterfacesVrves(GetLoggingSourceInterfacesVrf... sourceInterfacesVrves) {
            return sourceInterfacesVrves(List.of(sourceInterfacesVrves));
        }
        @CustomType.Setter
        public Builder trap(Boolean trap) {
            this.trap = Objects.requireNonNull(trap);
            return this;
        }
        @CustomType.Setter
        public Builder trapSeverity(String trapSeverity) {
            this.trapSeverity = Objects.requireNonNull(trapSeverity);
            return this;
        }
        public GetLoggingResult build() {
            final var o = new GetLoggingResult();
            o.bufferedSeverity = bufferedSeverity;
            o.bufferedSize = bufferedSize;
            o.consoleSeverity = consoleSeverity;
            o.device = device;
            o.facility = facility;
            o.fileMaxSize = fileMaxSize;
            o.fileMinSize = fileMinSize;
            o.fileName = fileName;
            o.fileSeverity = fileSeverity;
            o.historySeverity = historySeverity;
            o.historySize = historySize;
            o.id = id;
            o.ipv4Hosts = ipv4Hosts;
            o.ipv4VrfHosts = ipv4VrfHosts;
            o.ipv6Hosts = ipv6Hosts;
            o.ipv6VrfHosts = ipv6VrfHosts;
            o.monitorSeverity = monitorSeverity;
            o.originIdName = originIdName;
            o.originIdType = originIdType;
            o.sourceInterface = sourceInterface;
            o.sourceInterfacesVrves = sourceInterfacesVrves;
            o.trap = trap;
            o.trapSeverity = trapSeverity;
            return o;
        }
    }
}
