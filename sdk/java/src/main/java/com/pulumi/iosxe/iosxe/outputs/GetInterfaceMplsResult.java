// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInterfaceMplsResult {
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
     * @return Configure dynamic MPLS forwarding for IP
     * 
     */
    private Boolean ip;
    /**
     * @return Set MPLS Maximum Transmission Unit
     * 
     */
    private String mtu;
    private String name;
    /**
     * @return Interface type
     * 
     */
    private String type;

    private GetInterfaceMplsResult() {}
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
     * @return Configure dynamic MPLS forwarding for IP
     * 
     */
    public Boolean ip() {
        return this.ip;
    }
    /**
     * @return Set MPLS Maximum Transmission Unit
     * 
     */
    public String mtu() {
        return this.mtu;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return Interface type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInterfaceMplsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String device;
        private String id;
        private Boolean ip;
        private String mtu;
        private String name;
        private String type;
        public Builder() {}
        public Builder(GetInterfaceMplsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.device = defaults.device;
    	      this.id = defaults.id;
    	      this.ip = defaults.ip;
    	      this.mtu = defaults.mtu;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
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
        public Builder ip(Boolean ip) {
            this.ip = Objects.requireNonNull(ip);
            return this;
        }
        @CustomType.Setter
        public Builder mtu(String mtu) {
            this.mtu = Objects.requireNonNull(mtu);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetInterfaceMplsResult build() {
            final var o = new GetInterfaceMplsResult();
            o.device = device;
            o.id = id;
            o.ip = ip;
            o.mtu = mtu;
            o.name = name;
            o.type = type;
            return o;
        }
    }
}
