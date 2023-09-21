// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.GetPrefixListPrefix;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPrefixListResult {
    /**
     * @return A device name from the provider configuration.
     * 
     */
    private @Nullable String device;
    /**
     * @return The path of the retrieved object.
     * 
     */
    private String id;
    /**
     * @return Build prefix-lists with name ans seq.no
     * 
     */
    private List<GetPrefixListPrefix> prefixes;

    private GetPrefixListResult() {}
    /**
     * @return A device name from the provider configuration.
     * 
     */
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }
    /**
     * @return The path of the retrieved object.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Build prefix-lists with name ans seq.no
     * 
     */
    public List<GetPrefixListPrefix> prefixes() {
        return this.prefixes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrefixListResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String device;
        private String id;
        private List<GetPrefixListPrefix> prefixes;
        public Builder() {}
        public Builder(GetPrefixListResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.device = defaults.device;
    	      this.id = defaults.id;
    	      this.prefixes = defaults.prefixes;
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
        public Builder prefixes(List<GetPrefixListPrefix> prefixes) {
            this.prefixes = Objects.requireNonNull(prefixes);
            return this;
        }
        public Builder prefixes(GetPrefixListPrefix... prefixes) {
            return prefixes(List.of(prefixes));
        }
        public GetPrefixListResult build() {
            final var o = new GetPrefixListResult();
            o.device = device;
            o.id = id;
            o.prefixes = prefixes;
            return o;
        }
    }
}
