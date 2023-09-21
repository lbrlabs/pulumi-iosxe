// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LineVtyAccessClass {
    private String accessList;
    private String direction;
    private @Nullable Boolean vrfAlso;

    private LineVtyAccessClass() {}
    public String accessList() {
        return this.accessList;
    }
    public String direction() {
        return this.direction;
    }
    public Optional<Boolean> vrfAlso() {
        return Optional.ofNullable(this.vrfAlso);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LineVtyAccessClass defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessList;
        private String direction;
        private @Nullable Boolean vrfAlso;
        public Builder() {}
        public Builder(LineVtyAccessClass defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessList = defaults.accessList;
    	      this.direction = defaults.direction;
    	      this.vrfAlso = defaults.vrfAlso;
        }

        @CustomType.Setter
        public Builder accessList(String accessList) {
            this.accessList = Objects.requireNonNull(accessList);
            return this;
        }
        @CustomType.Setter
        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        @CustomType.Setter
        public Builder vrfAlso(@Nullable Boolean vrfAlso) {
            this.vrfAlso = vrfAlso;
            return this;
        }
        public LineVtyAccessClass build() {
            final var o = new LineVtyAccessClass();
            o.accessList = accessList;
            o.direction = direction;
            o.vrfAlso = vrfAlso;
            return o;
        }
    }
}
