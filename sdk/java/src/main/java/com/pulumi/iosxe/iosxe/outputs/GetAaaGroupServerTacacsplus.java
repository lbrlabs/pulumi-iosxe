// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.GetAaaGroupServerTacacsplusServerName;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAaaGroupServerTacacsplus {
    /**
     * @return Server-group name with max string length 32
     * 
     */
    private String name;
    /**
     * @return Name of tacacs server
     * 
     */
    private List<GetAaaGroupServerTacacsplusServerName> serverNames;

    private GetAaaGroupServerTacacsplus() {}
    /**
     * @return Server-group name with max string length 32
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Name of tacacs server
     * 
     */
    public List<GetAaaGroupServerTacacsplusServerName> serverNames() {
        return this.serverNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAaaGroupServerTacacsplus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private List<GetAaaGroupServerTacacsplusServerName> serverNames;
        public Builder() {}
        public Builder(GetAaaGroupServerTacacsplus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.serverNames = defaults.serverNames;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder serverNames(List<GetAaaGroupServerTacacsplusServerName> serverNames) {
            this.serverNames = Objects.requireNonNull(serverNames);
            return this;
        }
        public Builder serverNames(GetAaaGroupServerTacacsplusServerName... serverNames) {
            return serverNames(List.of(serverNames));
        }
        public GetAaaGroupServerTacacsplus build() {
            final var o = new GetAaaGroupServerTacacsplus();
            o.name = name;
            o.serverNames = serverNames;
            return o;
        }
    }
}
