// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMdtSubscriptionReceiver {
    /**
     * @return IP address of the receiver
     * 
     */
    private String address;
    /**
     * @return Network port of the receiver
     * 
     */
    private Integer port;
    /**
     * @return Receiver transport protocol.
     * 
     */
    private String protocol;

    private GetMdtSubscriptionReceiver() {}
    /**
     * @return IP address of the receiver
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return Network port of the receiver
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Receiver transport protocol.
     * 
     */
    public String protocol() {
        return this.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMdtSubscriptionReceiver defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private Integer port;
        private String protocol;
        public Builder() {}
        public Builder(GetMdtSubscriptionReceiver defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        @CustomType.Setter
        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public GetMdtSubscriptionReceiver build() {
            final var o = new GetMdtSubscriptionReceiver();
            o.address = address;
            o.port = port;
            o.protocol = protocol;
            return o;
        }
    }
}
