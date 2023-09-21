// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.GetInterfaceOspfProcessIdArea;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInterfaceOspfProcessId {
    private List<GetInterfaceOspfProcessIdArea> areas;
    private Integer id;

    private GetInterfaceOspfProcessId() {}
    public List<GetInterfaceOspfProcessIdArea> areas() {
        return this.areas;
    }
    public Integer id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInterfaceOspfProcessId defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetInterfaceOspfProcessIdArea> areas;
        private Integer id;
        public Builder() {}
        public Builder(GetInterfaceOspfProcessId defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.areas = defaults.areas;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder areas(List<GetInterfaceOspfProcessIdArea> areas) {
            this.areas = Objects.requireNonNull(areas);
            return this;
        }
        public Builder areas(GetInterfaceOspfProcessIdArea... areas) {
            return areas(List.of(areas));
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetInterfaceOspfProcessId build() {
            final var o = new GetInterfaceOspfProcessId();
            o.areas = areas;
            o.id = id;
            return o;
        }
    }
}