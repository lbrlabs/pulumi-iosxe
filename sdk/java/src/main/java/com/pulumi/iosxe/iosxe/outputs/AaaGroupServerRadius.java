// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.AaaGroupServerRadiusServerName;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AaaGroupServerRadius {
    private @Nullable Integer ipRadiusSourceInterfaceLoopback;
    private String name;
    private @Nullable List<AaaGroupServerRadiusServerName> serverNames;

    private AaaGroupServerRadius() {}
    public Optional<Integer> ipRadiusSourceInterfaceLoopback() {
        return Optional.ofNullable(this.ipRadiusSourceInterfaceLoopback);
    }
    public String name() {
        return this.name;
    }
    public List<AaaGroupServerRadiusServerName> serverNames() {
        return this.serverNames == null ? List.of() : this.serverNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AaaGroupServerRadius defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer ipRadiusSourceInterfaceLoopback;
        private String name;
        private @Nullable List<AaaGroupServerRadiusServerName> serverNames;
        public Builder() {}
        public Builder(AaaGroupServerRadius defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipRadiusSourceInterfaceLoopback = defaults.ipRadiusSourceInterfaceLoopback;
    	      this.name = defaults.name;
    	      this.serverNames = defaults.serverNames;
        }

        @CustomType.Setter
        public Builder ipRadiusSourceInterfaceLoopback(@Nullable Integer ipRadiusSourceInterfaceLoopback) {
            this.ipRadiusSourceInterfaceLoopback = ipRadiusSourceInterfaceLoopback;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder serverNames(@Nullable List<AaaGroupServerRadiusServerName> serverNames) {
            this.serverNames = serverNames;
            return this;
        }
        public Builder serverNames(AaaGroupServerRadiusServerName... serverNames) {
            return serverNames(List.of(serverNames));
        }
        public AaaGroupServerRadius build() {
            final var o = new AaaGroupServerRadius();
            o.ipRadiusSourceInterfaceLoopback = ipRadiusSourceInterfaceLoopback;
            o.name = name;
            o.serverNames = serverNames;
            return o;
        }
    }
}
