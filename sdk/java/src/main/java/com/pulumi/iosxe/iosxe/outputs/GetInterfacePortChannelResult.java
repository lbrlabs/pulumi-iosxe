// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.GetInterfacePortChannelHelperAddress;
import com.pulumi.iosxe.iosxe.outputs.GetInterfacePortChannelIpv6Address;
import com.pulumi.iosxe.iosxe.outputs.GetInterfacePortChannelIpv6LinkLocalAddress;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInterfacePortChannelResult {
    private Integer arpTimeout;
    private Boolean autoQosClassify;
    private Boolean autoQosClassifyPolice;
    private Boolean autoQosTrust;
    private Boolean autoQosTrustCos;
    private Boolean autoQosTrustDscp;
    private Boolean autoQosVideoCts;
    private Boolean autoQosVideoIpCamera;
    private Boolean autoQosVideoMediaPlayer;
    private Boolean autoQosVoip;
    private Boolean autoQosVoipCiscoPhone;
    private Boolean autoQosVoipCiscoSoftphone;
    private Boolean autoQosVoipTrust;
    private Boolean bfdEcho;
    private Boolean bfdEnable;
    private Integer bfdInterval;
    private Integer bfdIntervalMinRx;
    private Integer bfdIntervalMultiplier;
    private String bfdLocalAddress;
    private String bfdTemplate;
    private String description;
    private @Nullable String device;
    private List<GetInterfacePortChannelHelperAddress> helperAddresses;
    private String id;
    private String ipAccessGroupIn;
    private Boolean ipAccessGroupInEnable;
    private String ipAccessGroupOut;
    private Boolean ipAccessGroupOutEnable;
    private Integer ipArpInspectionLimitRate;
    private Boolean ipArpInspectionTrust;
    private String ipDhcpRelaySourceInterface;
    private Boolean ipDhcpSnoopingTrust;
    private Boolean ipProxyArp;
    private Boolean ipRedirects;
    private Boolean ipUnreachables;
    private String ipv4Address;
    private String ipv4AddressMask;
    private Boolean ipv6AddressAutoconfigDefault;
    private Boolean ipv6AddressDhcp;
    private List<GetInterfacePortChannelIpv6Address> ipv6Addresses;
    private Boolean ipv6Enable;
    private List<GetInterfacePortChannelIpv6LinkLocalAddress> ipv6LinkLocalAddresses;
    private Integer ipv6Mtu;
    private Boolean ipv6NdRaSuppressAll;
    private Integer name;
    private Boolean shutdown;
    private String spanningTreeGuard;
    private String spanningTreeLinkType;
    private Boolean switchport;
    private String trustDevice;
    private String vrfForwarding;

    private GetInterfacePortChannelResult() {}
    public Integer arpTimeout() {
        return this.arpTimeout;
    }
    public Boolean autoQosClassify() {
        return this.autoQosClassify;
    }
    public Boolean autoQosClassifyPolice() {
        return this.autoQosClassifyPolice;
    }
    public Boolean autoQosTrust() {
        return this.autoQosTrust;
    }
    public Boolean autoQosTrustCos() {
        return this.autoQosTrustCos;
    }
    public Boolean autoQosTrustDscp() {
        return this.autoQosTrustDscp;
    }
    public Boolean autoQosVideoCts() {
        return this.autoQosVideoCts;
    }
    public Boolean autoQosVideoIpCamera() {
        return this.autoQosVideoIpCamera;
    }
    public Boolean autoQosVideoMediaPlayer() {
        return this.autoQosVideoMediaPlayer;
    }
    public Boolean autoQosVoip() {
        return this.autoQosVoip;
    }
    public Boolean autoQosVoipCiscoPhone() {
        return this.autoQosVoipCiscoPhone;
    }
    public Boolean autoQosVoipCiscoSoftphone() {
        return this.autoQosVoipCiscoSoftphone;
    }
    public Boolean autoQosVoipTrust() {
        return this.autoQosVoipTrust;
    }
    public Boolean bfdEcho() {
        return this.bfdEcho;
    }
    public Boolean bfdEnable() {
        return this.bfdEnable;
    }
    public Integer bfdInterval() {
        return this.bfdInterval;
    }
    public Integer bfdIntervalMinRx() {
        return this.bfdIntervalMinRx;
    }
    public Integer bfdIntervalMultiplier() {
        return this.bfdIntervalMultiplier;
    }
    public String bfdLocalAddress() {
        return this.bfdLocalAddress;
    }
    public String bfdTemplate() {
        return this.bfdTemplate;
    }
    public String description() {
        return this.description;
    }
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }
    public List<GetInterfacePortChannelHelperAddress> helperAddresses() {
        return this.helperAddresses;
    }
    public String id() {
        return this.id;
    }
    public String ipAccessGroupIn() {
        return this.ipAccessGroupIn;
    }
    public Boolean ipAccessGroupInEnable() {
        return this.ipAccessGroupInEnable;
    }
    public String ipAccessGroupOut() {
        return this.ipAccessGroupOut;
    }
    public Boolean ipAccessGroupOutEnable() {
        return this.ipAccessGroupOutEnable;
    }
    public Integer ipArpInspectionLimitRate() {
        return this.ipArpInspectionLimitRate;
    }
    public Boolean ipArpInspectionTrust() {
        return this.ipArpInspectionTrust;
    }
    public String ipDhcpRelaySourceInterface() {
        return this.ipDhcpRelaySourceInterface;
    }
    public Boolean ipDhcpSnoopingTrust() {
        return this.ipDhcpSnoopingTrust;
    }
    public Boolean ipProxyArp() {
        return this.ipProxyArp;
    }
    public Boolean ipRedirects() {
        return this.ipRedirects;
    }
    public Boolean ipUnreachables() {
        return this.ipUnreachables;
    }
    public String ipv4Address() {
        return this.ipv4Address;
    }
    public String ipv4AddressMask() {
        return this.ipv4AddressMask;
    }
    public Boolean ipv6AddressAutoconfigDefault() {
        return this.ipv6AddressAutoconfigDefault;
    }
    public Boolean ipv6AddressDhcp() {
        return this.ipv6AddressDhcp;
    }
    public List<GetInterfacePortChannelIpv6Address> ipv6Addresses() {
        return this.ipv6Addresses;
    }
    public Boolean ipv6Enable() {
        return this.ipv6Enable;
    }
    public List<GetInterfacePortChannelIpv6LinkLocalAddress> ipv6LinkLocalAddresses() {
        return this.ipv6LinkLocalAddresses;
    }
    public Integer ipv6Mtu() {
        return this.ipv6Mtu;
    }
    public Boolean ipv6NdRaSuppressAll() {
        return this.ipv6NdRaSuppressAll;
    }
    public Integer name() {
        return this.name;
    }
    public Boolean shutdown() {
        return this.shutdown;
    }
    public String spanningTreeGuard() {
        return this.spanningTreeGuard;
    }
    public String spanningTreeLinkType() {
        return this.spanningTreeLinkType;
    }
    public Boolean switchport() {
        return this.switchport;
    }
    public String trustDevice() {
        return this.trustDevice;
    }
    public String vrfForwarding() {
        return this.vrfForwarding;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInterfacePortChannelResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer arpTimeout;
        private Boolean autoQosClassify;
        private Boolean autoQosClassifyPolice;
        private Boolean autoQosTrust;
        private Boolean autoQosTrustCos;
        private Boolean autoQosTrustDscp;
        private Boolean autoQosVideoCts;
        private Boolean autoQosVideoIpCamera;
        private Boolean autoQosVideoMediaPlayer;
        private Boolean autoQosVoip;
        private Boolean autoQosVoipCiscoPhone;
        private Boolean autoQosVoipCiscoSoftphone;
        private Boolean autoQosVoipTrust;
        private Boolean bfdEcho;
        private Boolean bfdEnable;
        private Integer bfdInterval;
        private Integer bfdIntervalMinRx;
        private Integer bfdIntervalMultiplier;
        private String bfdLocalAddress;
        private String bfdTemplate;
        private String description;
        private @Nullable String device;
        private List<GetInterfacePortChannelHelperAddress> helperAddresses;
        private String id;
        private String ipAccessGroupIn;
        private Boolean ipAccessGroupInEnable;
        private String ipAccessGroupOut;
        private Boolean ipAccessGroupOutEnable;
        private Integer ipArpInspectionLimitRate;
        private Boolean ipArpInspectionTrust;
        private String ipDhcpRelaySourceInterface;
        private Boolean ipDhcpSnoopingTrust;
        private Boolean ipProxyArp;
        private Boolean ipRedirects;
        private Boolean ipUnreachables;
        private String ipv4Address;
        private String ipv4AddressMask;
        private Boolean ipv6AddressAutoconfigDefault;
        private Boolean ipv6AddressDhcp;
        private List<GetInterfacePortChannelIpv6Address> ipv6Addresses;
        private Boolean ipv6Enable;
        private List<GetInterfacePortChannelIpv6LinkLocalAddress> ipv6LinkLocalAddresses;
        private Integer ipv6Mtu;
        private Boolean ipv6NdRaSuppressAll;
        private Integer name;
        private Boolean shutdown;
        private String spanningTreeGuard;
        private String spanningTreeLinkType;
        private Boolean switchport;
        private String trustDevice;
        private String vrfForwarding;
        public Builder() {}
        public Builder(GetInterfacePortChannelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arpTimeout = defaults.arpTimeout;
    	      this.autoQosClassify = defaults.autoQosClassify;
    	      this.autoQosClassifyPolice = defaults.autoQosClassifyPolice;
    	      this.autoQosTrust = defaults.autoQosTrust;
    	      this.autoQosTrustCos = defaults.autoQosTrustCos;
    	      this.autoQosTrustDscp = defaults.autoQosTrustDscp;
    	      this.autoQosVideoCts = defaults.autoQosVideoCts;
    	      this.autoQosVideoIpCamera = defaults.autoQosVideoIpCamera;
    	      this.autoQosVideoMediaPlayer = defaults.autoQosVideoMediaPlayer;
    	      this.autoQosVoip = defaults.autoQosVoip;
    	      this.autoQosVoipCiscoPhone = defaults.autoQosVoipCiscoPhone;
    	      this.autoQosVoipCiscoSoftphone = defaults.autoQosVoipCiscoSoftphone;
    	      this.autoQosVoipTrust = defaults.autoQosVoipTrust;
    	      this.bfdEcho = defaults.bfdEcho;
    	      this.bfdEnable = defaults.bfdEnable;
    	      this.bfdInterval = defaults.bfdInterval;
    	      this.bfdIntervalMinRx = defaults.bfdIntervalMinRx;
    	      this.bfdIntervalMultiplier = defaults.bfdIntervalMultiplier;
    	      this.bfdLocalAddress = defaults.bfdLocalAddress;
    	      this.bfdTemplate = defaults.bfdTemplate;
    	      this.description = defaults.description;
    	      this.device = defaults.device;
    	      this.helperAddresses = defaults.helperAddresses;
    	      this.id = defaults.id;
    	      this.ipAccessGroupIn = defaults.ipAccessGroupIn;
    	      this.ipAccessGroupInEnable = defaults.ipAccessGroupInEnable;
    	      this.ipAccessGroupOut = defaults.ipAccessGroupOut;
    	      this.ipAccessGroupOutEnable = defaults.ipAccessGroupOutEnable;
    	      this.ipArpInspectionLimitRate = defaults.ipArpInspectionLimitRate;
    	      this.ipArpInspectionTrust = defaults.ipArpInspectionTrust;
    	      this.ipDhcpRelaySourceInterface = defaults.ipDhcpRelaySourceInterface;
    	      this.ipDhcpSnoopingTrust = defaults.ipDhcpSnoopingTrust;
    	      this.ipProxyArp = defaults.ipProxyArp;
    	      this.ipRedirects = defaults.ipRedirects;
    	      this.ipUnreachables = defaults.ipUnreachables;
    	      this.ipv4Address = defaults.ipv4Address;
    	      this.ipv4AddressMask = defaults.ipv4AddressMask;
    	      this.ipv6AddressAutoconfigDefault = defaults.ipv6AddressAutoconfigDefault;
    	      this.ipv6AddressDhcp = defaults.ipv6AddressDhcp;
    	      this.ipv6Addresses = defaults.ipv6Addresses;
    	      this.ipv6Enable = defaults.ipv6Enable;
    	      this.ipv6LinkLocalAddresses = defaults.ipv6LinkLocalAddresses;
    	      this.ipv6Mtu = defaults.ipv6Mtu;
    	      this.ipv6NdRaSuppressAll = defaults.ipv6NdRaSuppressAll;
    	      this.name = defaults.name;
    	      this.shutdown = defaults.shutdown;
    	      this.spanningTreeGuard = defaults.spanningTreeGuard;
    	      this.spanningTreeLinkType = defaults.spanningTreeLinkType;
    	      this.switchport = defaults.switchport;
    	      this.trustDevice = defaults.trustDevice;
    	      this.vrfForwarding = defaults.vrfForwarding;
        }

        @CustomType.Setter
        public Builder arpTimeout(Integer arpTimeout) {
            this.arpTimeout = Objects.requireNonNull(arpTimeout);
            return this;
        }
        @CustomType.Setter
        public Builder autoQosClassify(Boolean autoQosClassify) {
            this.autoQosClassify = Objects.requireNonNull(autoQosClassify);
            return this;
        }
        @CustomType.Setter
        public Builder autoQosClassifyPolice(Boolean autoQosClassifyPolice) {
            this.autoQosClassifyPolice = Objects.requireNonNull(autoQosClassifyPolice);
            return this;
        }
        @CustomType.Setter
        public Builder autoQosTrust(Boolean autoQosTrust) {
            this.autoQosTrust = Objects.requireNonNull(autoQosTrust);
            return this;
        }
        @CustomType.Setter
        public Builder autoQosTrustCos(Boolean autoQosTrustCos) {
            this.autoQosTrustCos = Objects.requireNonNull(autoQosTrustCos);
            return this;
        }
        @CustomType.Setter
        public Builder autoQosTrustDscp(Boolean autoQosTrustDscp) {
            this.autoQosTrustDscp = Objects.requireNonNull(autoQosTrustDscp);
            return this;
        }
        @CustomType.Setter
        public Builder autoQosVideoCts(Boolean autoQosVideoCts) {
            this.autoQosVideoCts = Objects.requireNonNull(autoQosVideoCts);
            return this;
        }
        @CustomType.Setter
        public Builder autoQosVideoIpCamera(Boolean autoQosVideoIpCamera) {
            this.autoQosVideoIpCamera = Objects.requireNonNull(autoQosVideoIpCamera);
            return this;
        }
        @CustomType.Setter
        public Builder autoQosVideoMediaPlayer(Boolean autoQosVideoMediaPlayer) {
            this.autoQosVideoMediaPlayer = Objects.requireNonNull(autoQosVideoMediaPlayer);
            return this;
        }
        @CustomType.Setter
        public Builder autoQosVoip(Boolean autoQosVoip) {
            this.autoQosVoip = Objects.requireNonNull(autoQosVoip);
            return this;
        }
        @CustomType.Setter
        public Builder autoQosVoipCiscoPhone(Boolean autoQosVoipCiscoPhone) {
            this.autoQosVoipCiscoPhone = Objects.requireNonNull(autoQosVoipCiscoPhone);
            return this;
        }
        @CustomType.Setter
        public Builder autoQosVoipCiscoSoftphone(Boolean autoQosVoipCiscoSoftphone) {
            this.autoQosVoipCiscoSoftphone = Objects.requireNonNull(autoQosVoipCiscoSoftphone);
            return this;
        }
        @CustomType.Setter
        public Builder autoQosVoipTrust(Boolean autoQosVoipTrust) {
            this.autoQosVoipTrust = Objects.requireNonNull(autoQosVoipTrust);
            return this;
        }
        @CustomType.Setter
        public Builder bfdEcho(Boolean bfdEcho) {
            this.bfdEcho = Objects.requireNonNull(bfdEcho);
            return this;
        }
        @CustomType.Setter
        public Builder bfdEnable(Boolean bfdEnable) {
            this.bfdEnable = Objects.requireNonNull(bfdEnable);
            return this;
        }
        @CustomType.Setter
        public Builder bfdInterval(Integer bfdInterval) {
            this.bfdInterval = Objects.requireNonNull(bfdInterval);
            return this;
        }
        @CustomType.Setter
        public Builder bfdIntervalMinRx(Integer bfdIntervalMinRx) {
            this.bfdIntervalMinRx = Objects.requireNonNull(bfdIntervalMinRx);
            return this;
        }
        @CustomType.Setter
        public Builder bfdIntervalMultiplier(Integer bfdIntervalMultiplier) {
            this.bfdIntervalMultiplier = Objects.requireNonNull(bfdIntervalMultiplier);
            return this;
        }
        @CustomType.Setter
        public Builder bfdLocalAddress(String bfdLocalAddress) {
            this.bfdLocalAddress = Objects.requireNonNull(bfdLocalAddress);
            return this;
        }
        @CustomType.Setter
        public Builder bfdTemplate(String bfdTemplate) {
            this.bfdTemplate = Objects.requireNonNull(bfdTemplate);
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
        public Builder helperAddresses(List<GetInterfacePortChannelHelperAddress> helperAddresses) {
            this.helperAddresses = Objects.requireNonNull(helperAddresses);
            return this;
        }
        public Builder helperAddresses(GetInterfacePortChannelHelperAddress... helperAddresses) {
            return helperAddresses(List.of(helperAddresses));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipAccessGroupIn(String ipAccessGroupIn) {
            this.ipAccessGroupIn = Objects.requireNonNull(ipAccessGroupIn);
            return this;
        }
        @CustomType.Setter
        public Builder ipAccessGroupInEnable(Boolean ipAccessGroupInEnable) {
            this.ipAccessGroupInEnable = Objects.requireNonNull(ipAccessGroupInEnable);
            return this;
        }
        @CustomType.Setter
        public Builder ipAccessGroupOut(String ipAccessGroupOut) {
            this.ipAccessGroupOut = Objects.requireNonNull(ipAccessGroupOut);
            return this;
        }
        @CustomType.Setter
        public Builder ipAccessGroupOutEnable(Boolean ipAccessGroupOutEnable) {
            this.ipAccessGroupOutEnable = Objects.requireNonNull(ipAccessGroupOutEnable);
            return this;
        }
        @CustomType.Setter
        public Builder ipArpInspectionLimitRate(Integer ipArpInspectionLimitRate) {
            this.ipArpInspectionLimitRate = Objects.requireNonNull(ipArpInspectionLimitRate);
            return this;
        }
        @CustomType.Setter
        public Builder ipArpInspectionTrust(Boolean ipArpInspectionTrust) {
            this.ipArpInspectionTrust = Objects.requireNonNull(ipArpInspectionTrust);
            return this;
        }
        @CustomType.Setter
        public Builder ipDhcpRelaySourceInterface(String ipDhcpRelaySourceInterface) {
            this.ipDhcpRelaySourceInterface = Objects.requireNonNull(ipDhcpRelaySourceInterface);
            return this;
        }
        @CustomType.Setter
        public Builder ipDhcpSnoopingTrust(Boolean ipDhcpSnoopingTrust) {
            this.ipDhcpSnoopingTrust = Objects.requireNonNull(ipDhcpSnoopingTrust);
            return this;
        }
        @CustomType.Setter
        public Builder ipProxyArp(Boolean ipProxyArp) {
            this.ipProxyArp = Objects.requireNonNull(ipProxyArp);
            return this;
        }
        @CustomType.Setter
        public Builder ipRedirects(Boolean ipRedirects) {
            this.ipRedirects = Objects.requireNonNull(ipRedirects);
            return this;
        }
        @CustomType.Setter
        public Builder ipUnreachables(Boolean ipUnreachables) {
            this.ipUnreachables = Objects.requireNonNull(ipUnreachables);
            return this;
        }
        @CustomType.Setter
        public Builder ipv4Address(String ipv4Address) {
            this.ipv4Address = Objects.requireNonNull(ipv4Address);
            return this;
        }
        @CustomType.Setter
        public Builder ipv4AddressMask(String ipv4AddressMask) {
            this.ipv4AddressMask = Objects.requireNonNull(ipv4AddressMask);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6AddressAutoconfigDefault(Boolean ipv6AddressAutoconfigDefault) {
            this.ipv6AddressAutoconfigDefault = Objects.requireNonNull(ipv6AddressAutoconfigDefault);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6AddressDhcp(Boolean ipv6AddressDhcp) {
            this.ipv6AddressDhcp = Objects.requireNonNull(ipv6AddressDhcp);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6Addresses(List<GetInterfacePortChannelIpv6Address> ipv6Addresses) {
            this.ipv6Addresses = Objects.requireNonNull(ipv6Addresses);
            return this;
        }
        public Builder ipv6Addresses(GetInterfacePortChannelIpv6Address... ipv6Addresses) {
            return ipv6Addresses(List.of(ipv6Addresses));
        }
        @CustomType.Setter
        public Builder ipv6Enable(Boolean ipv6Enable) {
            this.ipv6Enable = Objects.requireNonNull(ipv6Enable);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6LinkLocalAddresses(List<GetInterfacePortChannelIpv6LinkLocalAddress> ipv6LinkLocalAddresses) {
            this.ipv6LinkLocalAddresses = Objects.requireNonNull(ipv6LinkLocalAddresses);
            return this;
        }
        public Builder ipv6LinkLocalAddresses(GetInterfacePortChannelIpv6LinkLocalAddress... ipv6LinkLocalAddresses) {
            return ipv6LinkLocalAddresses(List.of(ipv6LinkLocalAddresses));
        }
        @CustomType.Setter
        public Builder ipv6Mtu(Integer ipv6Mtu) {
            this.ipv6Mtu = Objects.requireNonNull(ipv6Mtu);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6NdRaSuppressAll(Boolean ipv6NdRaSuppressAll) {
            this.ipv6NdRaSuppressAll = Objects.requireNonNull(ipv6NdRaSuppressAll);
            return this;
        }
        @CustomType.Setter
        public Builder name(Integer name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder shutdown(Boolean shutdown) {
            this.shutdown = Objects.requireNonNull(shutdown);
            return this;
        }
        @CustomType.Setter
        public Builder spanningTreeGuard(String spanningTreeGuard) {
            this.spanningTreeGuard = Objects.requireNonNull(spanningTreeGuard);
            return this;
        }
        @CustomType.Setter
        public Builder spanningTreeLinkType(String spanningTreeLinkType) {
            this.spanningTreeLinkType = Objects.requireNonNull(spanningTreeLinkType);
            return this;
        }
        @CustomType.Setter
        public Builder switchport(Boolean switchport) {
            this.switchport = Objects.requireNonNull(switchport);
            return this;
        }
        @CustomType.Setter
        public Builder trustDevice(String trustDevice) {
            this.trustDevice = Objects.requireNonNull(trustDevice);
            return this;
        }
        @CustomType.Setter
        public Builder vrfForwarding(String vrfForwarding) {
            this.vrfForwarding = Objects.requireNonNull(vrfForwarding);
            return this;
        }
        public GetInterfacePortChannelResult build() {
            final var o = new GetInterfacePortChannelResult();
            o.arpTimeout = arpTimeout;
            o.autoQosClassify = autoQosClassify;
            o.autoQosClassifyPolice = autoQosClassifyPolice;
            o.autoQosTrust = autoQosTrust;
            o.autoQosTrustCos = autoQosTrustCos;
            o.autoQosTrustDscp = autoQosTrustDscp;
            o.autoQosVideoCts = autoQosVideoCts;
            o.autoQosVideoIpCamera = autoQosVideoIpCamera;
            o.autoQosVideoMediaPlayer = autoQosVideoMediaPlayer;
            o.autoQosVoip = autoQosVoip;
            o.autoQosVoipCiscoPhone = autoQosVoipCiscoPhone;
            o.autoQosVoipCiscoSoftphone = autoQosVoipCiscoSoftphone;
            o.autoQosVoipTrust = autoQosVoipTrust;
            o.bfdEcho = bfdEcho;
            o.bfdEnable = bfdEnable;
            o.bfdInterval = bfdInterval;
            o.bfdIntervalMinRx = bfdIntervalMinRx;
            o.bfdIntervalMultiplier = bfdIntervalMultiplier;
            o.bfdLocalAddress = bfdLocalAddress;
            o.bfdTemplate = bfdTemplate;
            o.description = description;
            o.device = device;
            o.helperAddresses = helperAddresses;
            o.id = id;
            o.ipAccessGroupIn = ipAccessGroupIn;
            o.ipAccessGroupInEnable = ipAccessGroupInEnable;
            o.ipAccessGroupOut = ipAccessGroupOut;
            o.ipAccessGroupOutEnable = ipAccessGroupOutEnable;
            o.ipArpInspectionLimitRate = ipArpInspectionLimitRate;
            o.ipArpInspectionTrust = ipArpInspectionTrust;
            o.ipDhcpRelaySourceInterface = ipDhcpRelaySourceInterface;
            o.ipDhcpSnoopingTrust = ipDhcpSnoopingTrust;
            o.ipProxyArp = ipProxyArp;
            o.ipRedirects = ipRedirects;
            o.ipUnreachables = ipUnreachables;
            o.ipv4Address = ipv4Address;
            o.ipv4AddressMask = ipv4AddressMask;
            o.ipv6AddressAutoconfigDefault = ipv6AddressAutoconfigDefault;
            o.ipv6AddressDhcp = ipv6AddressDhcp;
            o.ipv6Addresses = ipv6Addresses;
            o.ipv6Enable = ipv6Enable;
            o.ipv6LinkLocalAddresses = ipv6LinkLocalAddresses;
            o.ipv6Mtu = ipv6Mtu;
            o.ipv6NdRaSuppressAll = ipv6NdRaSuppressAll;
            o.name = name;
            o.shutdown = shutdown;
            o.spanningTreeGuard = spanningTreeGuard;
            o.spanningTreeLinkType = spanningTreeLinkType;
            o.switchport = switchport;
            o.trustDevice = trustDevice;
            o.vrfForwarding = vrfForwarding;
            return o;
        }
    }
}
