// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInterfaceOspfProcessIdArea {
    private String areaId;

    private GetInterfaceOspfProcessIdArea() {}
    public String areaId() {
        return this.areaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInterfaceOspfProcessIdArea defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String areaId;
        public Builder() {}
        public Builder(GetInterfaceOspfProcessIdArea defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.areaId = defaults.areaId;
        }

        @CustomType.Setter
        public Builder areaId(String areaId) {
            this.areaId = Objects.requireNonNull(areaId);
            return this;
        }
        public GetInterfaceOspfProcessIdArea build() {
            final var o = new GetInterfaceOspfProcessIdArea();
            o.areaId = areaId;
            return o;
        }
    }
}
