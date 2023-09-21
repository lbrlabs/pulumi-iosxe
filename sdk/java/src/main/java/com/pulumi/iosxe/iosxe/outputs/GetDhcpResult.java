// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.GetDhcpSnoopingVlan;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDhcpResult {
    private String compatibilitySuboptionLinkSelection;
    private String compatibilitySuboptionServerOverride;
    /**
     * @return A device name from the provider configuration.
     * 
     */
    private @Nullable String device;
    /**
     * @return The path of the retrieved object.
     * 
     */
    private String id;
    /**
     * @return Default option, no vpn
     * 
     */
    private Boolean relayInformationOptionDefault;
    /**
     * @return Insert VPN sub-options and change the giaddr to the outgoing interface
     * 
     */
    private Boolean relayInformationOptionVpn;
    /**
     * @return Received DHCP packets may contain relay info option with zero giaddr
     * 
     */
    private Boolean relayInformationTrustAll;
    /**
     * @return DHCP Snooping
     * 
     */
    private Boolean snooping;
    /**
     * @return Use configured hostname for remote id
     * 
     */
    private Boolean snoopingInformationOptionFormatRemoteIdHostname;
    /**
     * @return DHCP Snooping vlan
     * 
     */
    private List<GetDhcpSnoopingVlan> snoopingVlans;

    private GetDhcpResult() {}
    public String compatibilitySuboptionLinkSelection() {
        return this.compatibilitySuboptionLinkSelection;
    }
    public String compatibilitySuboptionServerOverride() {
        return this.compatibilitySuboptionServerOverride;
    }
    /**
     * @return A device name from the provider configuration.
     * 
     */
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }
    /**
     * @return The path of the retrieved object.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Default option, no vpn
     * 
     */
    public Boolean relayInformationOptionDefault() {
        return this.relayInformationOptionDefault;
    }
    /**
     * @return Insert VPN sub-options and change the giaddr to the outgoing interface
     * 
     */
    public Boolean relayInformationOptionVpn() {
        return this.relayInformationOptionVpn;
    }
    /**
     * @return Received DHCP packets may contain relay info option with zero giaddr
     * 
     */
    public Boolean relayInformationTrustAll() {
        return this.relayInformationTrustAll;
    }
    /**
     * @return DHCP Snooping
     * 
     */
    public Boolean snooping() {
        return this.snooping;
    }
    /**
     * @return Use configured hostname for remote id
     * 
     */
    public Boolean snoopingInformationOptionFormatRemoteIdHostname() {
        return this.snoopingInformationOptionFormatRemoteIdHostname;
    }
    /**
     * @return DHCP Snooping vlan
     * 
     */
    public List<GetDhcpSnoopingVlan> snoopingVlans() {
        return this.snoopingVlans;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDhcpResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String compatibilitySuboptionLinkSelection;
        private String compatibilitySuboptionServerOverride;
        private @Nullable String device;
        private String id;
        private Boolean relayInformationOptionDefault;
        private Boolean relayInformationOptionVpn;
        private Boolean relayInformationTrustAll;
        private Boolean snooping;
        private Boolean snoopingInformationOptionFormatRemoteIdHostname;
        private List<GetDhcpSnoopingVlan> snoopingVlans;
        public Builder() {}
        public Builder(GetDhcpResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compatibilitySuboptionLinkSelection = defaults.compatibilitySuboptionLinkSelection;
    	      this.compatibilitySuboptionServerOverride = defaults.compatibilitySuboptionServerOverride;
    	      this.device = defaults.device;
    	      this.id = defaults.id;
    	      this.relayInformationOptionDefault = defaults.relayInformationOptionDefault;
    	      this.relayInformationOptionVpn = defaults.relayInformationOptionVpn;
    	      this.relayInformationTrustAll = defaults.relayInformationTrustAll;
    	      this.snooping = defaults.snooping;
    	      this.snoopingInformationOptionFormatRemoteIdHostname = defaults.snoopingInformationOptionFormatRemoteIdHostname;
    	      this.snoopingVlans = defaults.snoopingVlans;
        }

        @CustomType.Setter
        public Builder compatibilitySuboptionLinkSelection(String compatibilitySuboptionLinkSelection) {
            this.compatibilitySuboptionLinkSelection = Objects.requireNonNull(compatibilitySuboptionLinkSelection);
            return this;
        }
        @CustomType.Setter
        public Builder compatibilitySuboptionServerOverride(String compatibilitySuboptionServerOverride) {
            this.compatibilitySuboptionServerOverride = Objects.requireNonNull(compatibilitySuboptionServerOverride);
            return this;
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
        public Builder relayInformationOptionDefault(Boolean relayInformationOptionDefault) {
            this.relayInformationOptionDefault = Objects.requireNonNull(relayInformationOptionDefault);
            return this;
        }
        @CustomType.Setter
        public Builder relayInformationOptionVpn(Boolean relayInformationOptionVpn) {
            this.relayInformationOptionVpn = Objects.requireNonNull(relayInformationOptionVpn);
            return this;
        }
        @CustomType.Setter
        public Builder relayInformationTrustAll(Boolean relayInformationTrustAll) {
            this.relayInformationTrustAll = Objects.requireNonNull(relayInformationTrustAll);
            return this;
        }
        @CustomType.Setter
        public Builder snooping(Boolean snooping) {
            this.snooping = Objects.requireNonNull(snooping);
            return this;
        }
        @CustomType.Setter
        public Builder snoopingInformationOptionFormatRemoteIdHostname(Boolean snoopingInformationOptionFormatRemoteIdHostname) {
            this.snoopingInformationOptionFormatRemoteIdHostname = Objects.requireNonNull(snoopingInformationOptionFormatRemoteIdHostname);
            return this;
        }
        @CustomType.Setter
        public Builder snoopingVlans(List<GetDhcpSnoopingVlan> snoopingVlans) {
            this.snoopingVlans = Objects.requireNonNull(snoopingVlans);
            return this;
        }
        public Builder snoopingVlans(GetDhcpSnoopingVlan... snoopingVlans) {
            return snoopingVlans(List.of(snoopingVlans));
        }
        public GetDhcpResult build() {
            final var o = new GetDhcpResult();
            o.compatibilitySuboptionLinkSelection = compatibilitySuboptionLinkSelection;
            o.compatibilitySuboptionServerOverride = compatibilitySuboptionServerOverride;
            o.device = device;
            o.id = id;
            o.relayInformationOptionDefault = relayInformationOptionDefault;
            o.relayInformationOptionVpn = relayInformationOptionVpn;
            o.relayInformationTrustAll = relayInformationTrustAll;
            o.snooping = snooping;
            o.snoopingInformationOptionFormatRemoteIdHostname = snoopingInformationOptionFormatRemoteIdHostname;
            o.snoopingVlans = snoopingVlans;
            return o;
        }
    }
}
