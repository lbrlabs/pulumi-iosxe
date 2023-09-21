// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class RestconfList {
    private @Nullable List<Map<String,String>> items;
    private String key;
    private String name;
    private @Nullable List<String> values;

    private RestconfList() {}
    public List<Map<String,String>> items() {
        return this.items == null ? List.of() : this.items;
    }
    public String key() {
        return this.key;
    }
    public String name() {
        return this.name;
    }
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestconfList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<Map<String,String>> items;
        private String key;
        private String name;
        private @Nullable List<String> values;
        public Builder() {}
        public Builder(RestconfList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.key = defaults.key;
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder items(@Nullable List<Map<String,String>> items) {
            this.items = items;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public RestconfList build() {
            final var o = new RestconfList();
            o.items = items;
            o.key = key;
            o.name = name;
            o.values = values;
            return o;
        }
    }
}
