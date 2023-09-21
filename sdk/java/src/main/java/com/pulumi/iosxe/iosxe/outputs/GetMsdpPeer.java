// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMsdpPeer {
    private String addr;
    private Integer connectSourceLoopback;
    private Integer remoteAs;

    private GetMsdpPeer() {}
    public String addr() {
        return this.addr;
    }
    public Integer connectSourceLoopback() {
        return this.connectSourceLoopback;
    }
    public Integer remoteAs() {
        return this.remoteAs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMsdpPeer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String addr;
        private Integer connectSourceLoopback;
        private Integer remoteAs;
        public Builder() {}
        public Builder(GetMsdpPeer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addr = defaults.addr;
    	      this.connectSourceLoopback = defaults.connectSourceLoopback;
    	      this.remoteAs = defaults.remoteAs;
        }

        @CustomType.Setter
        public Builder addr(String addr) {
            this.addr = Objects.requireNonNull(addr);
            return this;
        }
        @CustomType.Setter
        public Builder connectSourceLoopback(Integer connectSourceLoopback) {
            this.connectSourceLoopback = Objects.requireNonNull(connectSourceLoopback);
            return this;
        }
        @CustomType.Setter
        public Builder remoteAs(Integer remoteAs) {
            this.remoteAs = Objects.requireNonNull(remoteAs);
            return this;
        }
        public GetMsdpPeer build() {
            final var o = new GetMsdpPeer();
            o.addr = addr;
            o.connectSourceLoopback = connectSourceLoopback;
            o.remoteAs = remoteAs;
            return o;
        }
    }
}
