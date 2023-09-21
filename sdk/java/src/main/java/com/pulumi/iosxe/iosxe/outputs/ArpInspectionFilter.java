// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.ArpInspectionFilterVlan;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ArpInspectionFilter {
    private String name;
    private @Nullable List<ArpInspectionFilterVlan> vlans;

    private ArpInspectionFilter() {}
    public String name() {
        return this.name;
    }
    public List<ArpInspectionFilterVlan> vlans() {
        return this.vlans == null ? List.of() : this.vlans;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArpInspectionFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private @Nullable List<ArpInspectionFilterVlan> vlans;
        public Builder() {}
        public Builder(ArpInspectionFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.vlans = defaults.vlans;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder vlans(@Nullable List<ArpInspectionFilterVlan> vlans) {
            this.vlans = vlans;
            return this;
        }
        public Builder vlans(ArpInspectionFilterVlan... vlans) {
            return vlans(List.of(vlans));
        }
        public ArpInspectionFilter build() {
            final var o = new ArpInspectionFilter();
            o.name = name;
            o.vlans = vlans;
            return o;
        }
    }
}
