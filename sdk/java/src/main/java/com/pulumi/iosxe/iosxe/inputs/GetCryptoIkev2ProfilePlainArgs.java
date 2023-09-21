// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCryptoIkev2ProfilePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCryptoIkev2ProfilePlainArgs Empty = new GetCryptoIkev2ProfilePlainArgs();

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

    private GetCryptoIkev2ProfilePlainArgs() {}

    private GetCryptoIkev2ProfilePlainArgs(GetCryptoIkev2ProfilePlainArgs $) {
        this.device = $.device;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCryptoIkev2ProfilePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCryptoIkev2ProfilePlainArgs $;

        public Builder() {
            $ = new GetCryptoIkev2ProfilePlainArgs();
        }

        public Builder(GetCryptoIkev2ProfilePlainArgs defaults) {
            $ = new GetCryptoIkev2ProfilePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder device(@Nullable String device) {
            $.device = device;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetCryptoIkev2ProfilePlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}