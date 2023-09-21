// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInterfaceLoopbackIpv6LinkLocalAddress {
    private String address;
    private Boolean linkLocal;

    private GetInterfaceLoopbackIpv6LinkLocalAddress() {}
    public String address() {
        return this.address;
    }
    public Boolean linkLocal() {
        return this.linkLocal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInterfaceLoopbackIpv6LinkLocalAddress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private Boolean linkLocal;
        public Builder() {}
        public Builder(GetInterfaceLoopbackIpv6LinkLocalAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.linkLocal = defaults.linkLocal;
        }

        @CustomType.Setter
        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        @CustomType.Setter
        public Builder linkLocal(Boolean linkLocal) {
            this.linkLocal = Objects.requireNonNull(linkLocal);
            return this;
        }
        public GetInterfaceLoopbackIpv6LinkLocalAddress build() {
            final var o = new GetInterfaceLoopbackIpv6LinkLocalAddress();
            o.address = address;
            o.linkLocal = linkLocal;
            return o;
        }
    }
}
