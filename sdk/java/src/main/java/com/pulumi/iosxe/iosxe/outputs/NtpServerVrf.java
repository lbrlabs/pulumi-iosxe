// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.NtpServerVrfServer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class NtpServerVrf {
    private String name;
    private @Nullable List<NtpServerVrfServer> servers;

    private NtpServerVrf() {}
    public String name() {
        return this.name;
    }
    public List<NtpServerVrfServer> servers() {
        return this.servers == null ? List.of() : this.servers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NtpServerVrf defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private @Nullable List<NtpServerVrfServer> servers;
        public Builder() {}
        public Builder(NtpServerVrf defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.servers = defaults.servers;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder servers(@Nullable List<NtpServerVrfServer> servers) {
            this.servers = servers;
            return this;
        }
        public Builder servers(NtpServerVrfServer... servers) {
            return servers(List.of(servers));
        }
        public NtpServerVrf build() {
            final var o = new NtpServerVrf();
            o.name = name;
            o.servers = servers;
            return o;
        }
    }
}