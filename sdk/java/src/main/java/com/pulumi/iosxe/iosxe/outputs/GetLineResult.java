// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.GetLineConsole;
import com.pulumi.iosxe.iosxe.outputs.GetLineVty;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLineResult {
    private List<GetLineConsole> consoles;
    private @Nullable String device;
    private String id;
    private List<GetLineVty> vties;

    private GetLineResult() {}
    public List<GetLineConsole> consoles() {
        return this.consoles;
    }
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }
    public String id() {
        return this.id;
    }
    public List<GetLineVty> vties() {
        return this.vties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLineResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetLineConsole> consoles;
        private @Nullable String device;
        private String id;
        private List<GetLineVty> vties;
        public Builder() {}
        public Builder(GetLineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consoles = defaults.consoles;
    	      this.device = defaults.device;
    	      this.id = defaults.id;
    	      this.vties = defaults.vties;
        }

        @CustomType.Setter
        public Builder consoles(List<GetLineConsole> consoles) {
            this.consoles = Objects.requireNonNull(consoles);
            return this;
        }
        public Builder consoles(GetLineConsole... consoles) {
            return consoles(List.of(consoles));
        }
        @CustomType.Setter
        public Builder device(@Nullable String device) {
            this.device = device;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder vties(List<GetLineVty> vties) {
            this.vties = Objects.requireNonNull(vties);
            return this;
        }
        public Builder vties(GetLineVty... vties) {
            return vties(List.of(vties));
        }
        public GetLineResult build() {
            final var o = new GetLineResult();
            o.consoles = consoles;
            o.device = device;
            o.id = id;
            o.vties = vties;
            return o;
        }
    }
}
