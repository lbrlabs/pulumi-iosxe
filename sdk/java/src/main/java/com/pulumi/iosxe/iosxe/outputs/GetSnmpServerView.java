// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSnmpServerView {
    private String incExl;
    private String mib;
    private String name;

    private GetSnmpServerView() {}
    public String incExl() {
        return this.incExl;
    }
    public String mib() {
        return this.mib;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnmpServerView defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String incExl;
        private String mib;
        private String name;
        public Builder() {}
        public Builder(GetSnmpServerView defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.incExl = defaults.incExl;
    	      this.mib = defaults.mib;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder incExl(String incExl) {
            this.incExl = Objects.requireNonNull(incExl);
            return this;
        }
        @CustomType.Setter
        public Builder mib(String mib) {
            this.mib = Objects.requireNonNull(mib);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetSnmpServerView build() {
            final var o = new GetSnmpServerView();
            o.incExl = incExl;
            o.mib = mib;
            o.name = name;
            return o;
        }
    }
}
