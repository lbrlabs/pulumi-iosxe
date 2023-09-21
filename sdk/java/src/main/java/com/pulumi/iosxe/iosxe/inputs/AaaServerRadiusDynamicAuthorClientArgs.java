// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AaaServerRadiusDynamicAuthorClientArgs extends com.pulumi.resources.ResourceArgs {

    public static final AaaServerRadiusDynamicAuthorClientArgs Empty = new AaaServerRadiusDynamicAuthorClientArgs();

    @Import(name="ip", required=true)
    private Output<String> ip;

    public Output<String> ip() {
        return this.ip;
    }

    @Import(name="serverKey")
    private @Nullable Output<String> serverKey;

    public Optional<Output<String>> serverKey() {
        return Optional.ofNullable(this.serverKey);
    }

    @Import(name="serverKeyType")
    private @Nullable Output<String> serverKeyType;

    public Optional<Output<String>> serverKeyType() {
        return Optional.ofNullable(this.serverKeyType);
    }

    private AaaServerRadiusDynamicAuthorClientArgs() {}

    private AaaServerRadiusDynamicAuthorClientArgs(AaaServerRadiusDynamicAuthorClientArgs $) {
        this.ip = $.ip;
        this.serverKey = $.serverKey;
        this.serverKeyType = $.serverKeyType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AaaServerRadiusDynamicAuthorClientArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AaaServerRadiusDynamicAuthorClientArgs $;

        public Builder() {
            $ = new AaaServerRadiusDynamicAuthorClientArgs();
        }

        public Builder(AaaServerRadiusDynamicAuthorClientArgs defaults) {
            $ = new AaaServerRadiusDynamicAuthorClientArgs(Objects.requireNonNull(defaults));
        }

        public Builder ip(Output<String> ip) {
            $.ip = ip;
            return this;
        }

        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        public Builder serverKey(@Nullable Output<String> serverKey) {
            $.serverKey = serverKey;
            return this;
        }

        public Builder serverKey(String serverKey) {
            return serverKey(Output.of(serverKey));
        }

        public Builder serverKeyType(@Nullable Output<String> serverKeyType) {
            $.serverKeyType = serverKeyType;
            return this;
        }

        public Builder serverKeyType(String serverKeyType) {
            return serverKeyType(Output.of(serverKeyType));
        }

        public AaaServerRadiusDynamicAuthorClientArgs build() {
            $.ip = Objects.requireNonNull($.ip, "expected parameter 'ip' to be non-null");
            return $;
        }
    }

}
