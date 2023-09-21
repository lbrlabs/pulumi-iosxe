// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCryptoIpsecProfilePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCryptoIpsecProfilePlainArgs Empty = new GetCryptoIpsecProfilePlainArgs();

    @Import(name="device")
    private @Nullable String device;

    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    private GetCryptoIpsecProfilePlainArgs() {}

    private GetCryptoIpsecProfilePlainArgs(GetCryptoIpsecProfilePlainArgs $) {
        this.device = $.device;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCryptoIpsecProfilePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCryptoIpsecProfilePlainArgs $;

        public Builder() {
            $ = new GetCryptoIpsecProfilePlainArgs();
        }

        public Builder(GetCryptoIpsecProfilePlainArgs defaults) {
            $ = new GetCryptoIpsecProfilePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder device(@Nullable String device) {
            $.device = device;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetCryptoIpsecProfilePlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
