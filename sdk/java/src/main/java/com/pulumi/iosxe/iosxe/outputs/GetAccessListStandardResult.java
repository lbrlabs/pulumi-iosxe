// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.GetAccessListStandardEntry;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccessListStandardResult {
    /**
     * @return A device name from the provider configuration.
     * 
     */
    private @Nullable String device;
    private List<GetAccessListStandardEntry> entries;
    /**
     * @return The path of the retrieved object.
     * 
     */
    private String id;
    private String name;

    private GetAccessListStandardResult() {}
    /**
     * @return A device name from the provider configuration.
     * 
     */
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }
    public List<GetAccessListStandardEntry> entries() {
        return this.entries;
    }
    /**
     * @return The path of the retrieved object.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessListStandardResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String device;
        private List<GetAccessListStandardEntry> entries;
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetAccessListStandardResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.device = defaults.device;
    	      this.entries = defaults.entries;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder device(@Nullable String device) {
            this.device = device;
            return this;
        }
        @CustomType.Setter
        public Builder entries(List<GetAccessListStandardEntry> entries) {
            this.entries = Objects.requireNonNull(entries);
            return this;
        }
        public Builder entries(GetAccessListStandardEntry... entries) {
            return entries(List.of(entries));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetAccessListStandardResult build() {
            final var o = new GetAccessListStandardResult();
            o.device = device;
            o.entries = entries;
            o.id = id;
            o.name = name;
            return o;
        }
    }
}
