// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.GetAaaGroupServerRadiusServerName;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAaaGroupServerRadius {
    private Integer ipRadiusSourceInterfaceLoopback;
    private String name;
    private List<GetAaaGroupServerRadiusServerName> serverNames;

    private GetAaaGroupServerRadius() {}
    public Integer ipRadiusSourceInterfaceLoopback() {
        return this.ipRadiusSourceInterfaceLoopback;
    }
    public String name() {
        return this.name;
    }
    public List<GetAaaGroupServerRadiusServerName> serverNames() {
        return this.serverNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAaaGroupServerRadius defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer ipRadiusSourceInterfaceLoopback;
        private String name;
        private List<GetAaaGroupServerRadiusServerName> serverNames;
        public Builder() {}
        public Builder(GetAaaGroupServerRadius defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipRadiusSourceInterfaceLoopback = defaults.ipRadiusSourceInterfaceLoopback;
    	      this.name = defaults.name;
    	      this.serverNames = defaults.serverNames;
        }

        @CustomType.Setter
        public Builder ipRadiusSourceInterfaceLoopback(Integer ipRadiusSourceInterfaceLoopback) {
            this.ipRadiusSourceInterfaceLoopback = Objects.requireNonNull(ipRadiusSourceInterfaceLoopback);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder serverNames(List<GetAaaGroupServerRadiusServerName> serverNames) {
            this.serverNames = Objects.requireNonNull(serverNames);
            return this;
        }
        public Builder serverNames(GetAaaGroupServerRadiusServerName... serverNames) {
            return serverNames(List.of(serverNames));
        }
        public GetAaaGroupServerRadius build() {
            final var o = new GetAaaGroupServerRadius();
            o.ipRadiusSourceInterfaceLoopback = ipRadiusSourceInterfaceLoopback;
            o.name = name;
            o.serverNames = serverNames;
            return o;
        }
    }
}
