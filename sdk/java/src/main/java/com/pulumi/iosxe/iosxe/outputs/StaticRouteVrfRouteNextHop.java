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
public final class StaticRouteVrfRouteNextHop {
    private @Nullable Boolean global;
    private @Nullable Integer metric;
    private @Nullable String name;
    private String nextHop;
    private @Nullable Boolean permanent;
    private @Nullable Integer tag;

    private StaticRouteVrfRouteNextHop() {}
    public Optional<Boolean> global() {
        return Optional.ofNullable(this.global);
    }
    public Optional<Integer> metric() {
        return Optional.ofNullable(this.metric);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public String nextHop() {
        return this.nextHop;
    }
    public Optional<Boolean> permanent() {
        return Optional.ofNullable(this.permanent);
    }
    public Optional<Integer> tag() {
        return Optional.ofNullable(this.tag);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticRouteVrfRouteNextHop defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean global;
        private @Nullable Integer metric;
        private @Nullable String name;
        private String nextHop;
        private @Nullable Boolean permanent;
        private @Nullable Integer tag;
        public Builder() {}
        public Builder(StaticRouteVrfRouteNextHop defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.global = defaults.global;
    	      this.metric = defaults.metric;
    	      this.name = defaults.name;
    	      this.nextHop = defaults.nextHop;
    	      this.permanent = defaults.permanent;
    	      this.tag = defaults.tag;
        }

        @CustomType.Setter
        public Builder global(@Nullable Boolean global) {
            this.global = global;
            return this;
        }
        @CustomType.Setter
        public Builder metric(@Nullable Integer metric) {
            this.metric = metric;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nextHop(String nextHop) {
            this.nextHop = Objects.requireNonNull(nextHop);
            return this;
        }
        @CustomType.Setter
        public Builder permanent(@Nullable Boolean permanent) {
            this.permanent = permanent;
            return this;
        }
        @CustomType.Setter
        public Builder tag(@Nullable Integer tag) {
            this.tag = tag;
            return this;
        }
        public StaticRouteVrfRouteNextHop build() {
            final var o = new StaticRouteVrfRouteNextHop();
            o.global = global;
            o.metric = metric;
            o.name = name;
            o.nextHop = nextHop;
            o.permanent = permanent;
            o.tag = tag;
            return o;
        }
    }
}
