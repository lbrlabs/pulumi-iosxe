// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVlanResult {
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
     * @return Ascii name of the VLAN
     * 
     */
    private String name;
    /**
     * @return Configure association between private VLANs
     * 
     */
    private String privateVlanAssociation;
    /**
     * @return Configure the VLAN as a community private VLAN
     * 
     */
    private Boolean privateVlanCommunity;
    /**
     * @return Configure the VLAN as an isolated private VLAN
     * 
     */
    private Boolean privateVlanIsolated;
    /**
     * @return Configure the VLAN as a primary private VLAN
     * 
     */
    private Boolean privateVlanPrimary;
    /**
     * @return Configure as Remote SPAN VLAN
     * 
     */
    private Boolean remoteSpan;
    /**
     * @return Shutdown VLAN switching
     * 
     */
    private Boolean shutdown;
    /**
     * @return a single VLAN id (allowed value range 1-4094)or Comma-separated VLAN id range.e.g. 99 or 1-30 or  1-20,30,40-50
     * 
     */
    private Integer vlanId;

    private GetVlanResult() {}
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
     * @return Ascii name of the VLAN
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Configure association between private VLANs
     * 
     */
    public String privateVlanAssociation() {
        return this.privateVlanAssociation;
    }
    /**
     * @return Configure the VLAN as a community private VLAN
     * 
     */
    public Boolean privateVlanCommunity() {
        return this.privateVlanCommunity;
    }
    /**
     * @return Configure the VLAN as an isolated private VLAN
     * 
     */
    public Boolean privateVlanIsolated() {
        return this.privateVlanIsolated;
    }
    /**
     * @return Configure the VLAN as a primary private VLAN
     * 
     */
    public Boolean privateVlanPrimary() {
        return this.privateVlanPrimary;
    }
    /**
     * @return Configure as Remote SPAN VLAN
     * 
     */
    public Boolean remoteSpan() {
        return this.remoteSpan;
    }
    /**
     * @return Shutdown VLAN switching
     * 
     */
    public Boolean shutdown() {
        return this.shutdown;
    }
    /**
     * @return a single VLAN id (allowed value range 1-4094)or Comma-separated VLAN id range.e.g. 99 or 1-30 or  1-20,30,40-50
     * 
     */
    public Integer vlanId() {
        return this.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVlanResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String device;
        private String id;
        private String name;
        private String privateVlanAssociation;
        private Boolean privateVlanCommunity;
        private Boolean privateVlanIsolated;
        private Boolean privateVlanPrimary;
        private Boolean remoteSpan;
        private Boolean shutdown;
        private Integer vlanId;
        public Builder() {}
        public Builder(GetVlanResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.device = defaults.device;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateVlanAssociation = defaults.privateVlanAssociation;
    	      this.privateVlanCommunity = defaults.privateVlanCommunity;
    	      this.privateVlanIsolated = defaults.privateVlanIsolated;
    	      this.privateVlanPrimary = defaults.privateVlanPrimary;
    	      this.remoteSpan = defaults.remoteSpan;
    	      this.shutdown = defaults.shutdown;
    	      this.vlanId = defaults.vlanId;
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
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder privateVlanAssociation(String privateVlanAssociation) {
            this.privateVlanAssociation = Objects.requireNonNull(privateVlanAssociation);
            return this;
        }
        @CustomType.Setter
        public Builder privateVlanCommunity(Boolean privateVlanCommunity) {
            this.privateVlanCommunity = Objects.requireNonNull(privateVlanCommunity);
            return this;
        }
        @CustomType.Setter
        public Builder privateVlanIsolated(Boolean privateVlanIsolated) {
            this.privateVlanIsolated = Objects.requireNonNull(privateVlanIsolated);
            return this;
        }
        @CustomType.Setter
        public Builder privateVlanPrimary(Boolean privateVlanPrimary) {
            this.privateVlanPrimary = Objects.requireNonNull(privateVlanPrimary);
            return this;
        }
        @CustomType.Setter
        public Builder remoteSpan(Boolean remoteSpan) {
            this.remoteSpan = Objects.requireNonNull(remoteSpan);
            return this;
        }
        @CustomType.Setter
        public Builder shutdown(Boolean shutdown) {
            this.shutdown = Objects.requireNonNull(shutdown);
            return this;
        }
        @CustomType.Setter
        public Builder vlanId(Integer vlanId) {
            this.vlanId = Objects.requireNonNull(vlanId);
            return this;
        }
        public GetVlanResult build() {
            final var o = new GetVlanResult();
            o.device = device;
            o.id = id;
            o.name = name;
            o.privateVlanAssociation = privateVlanAssociation;
            o.privateVlanCommunity = privateVlanCommunity;
            o.privateVlanIsolated = privateVlanIsolated;
            o.privateVlanPrimary = privateVlanPrimary;
            o.remoteSpan = remoteSpan;
            o.shutdown = shutdown;
            o.vlanId = vlanId;
            return o;
        }
    }
}
