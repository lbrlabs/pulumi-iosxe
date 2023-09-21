// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrefixListPrefix {
    private @Nullable String action;
    private @Nullable Integer ge;
    private @Nullable String ip;
    private @Nullable Integer le;
    private String name;
    private Integer seq;

    private PrefixListPrefix() {}
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    public Optional<Integer> ge() {
        return Optional.ofNullable(this.ge);
    }
    public Optional<String> ip() {
        return Optional.ofNullable(this.ip);
    }
    public Optional<Integer> le() {
        return Optional.ofNullable(this.le);
    }
    public String name() {
        return this.name;
    }
    public Integer seq() {
        return this.seq;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrefixListPrefix defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String action;
        private @Nullable Integer ge;
        private @Nullable String ip;
        private @Nullable Integer le;
        private String name;
        private Integer seq;
        public Builder() {}
        public Builder(PrefixListPrefix defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.ge = defaults.ge;
    	      this.ip = defaults.ip;
    	      this.le = defaults.le;
    	      this.name = defaults.name;
    	      this.seq = defaults.seq;
        }

        @CustomType.Setter
        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder ge(@Nullable Integer ge) {
            this.ge = ge;
            return this;
        }
        @CustomType.Setter
        public Builder ip(@Nullable String ip) {
            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder le(@Nullable Integer le) {
            this.le = le;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder seq(Integer seq) {
            this.seq = Objects.requireNonNull(seq);
            return this;
        }
        public PrefixListPrefix build() {
            final var o = new PrefixListPrefix();
            o.action = action;
            o.ge = ge;
            o.ip = ip;
            o.le = le;
            o.name = name;
            o.seq = seq;
            return o;
        }
    }
}
