// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.config.inputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class Devices {
    private String name;
    private String url;

    private Devices() {}
    public String name() {
        return this.name;
    }
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Devices defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String url;
        public Builder() {}
        public Builder(Devices defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Devices build() {
            final var o = new Devices();
            o.name = name;
            o.url = url;
            return o;
        }
    }
}
