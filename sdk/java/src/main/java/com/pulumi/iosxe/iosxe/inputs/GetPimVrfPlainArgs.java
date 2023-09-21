// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPimVrfPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPimVrfPlainArgs Empty = new GetPimVrfPlainArgs();

    @Import(name="device")
    private @Nullable String device;

    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }

    @Import(name="vrf", required=true)
    private String vrf;

    public String vrf() {
        return this.vrf;
    }

    private GetPimVrfPlainArgs() {}

    private GetPimVrfPlainArgs(GetPimVrfPlainArgs $) {
        this.device = $.device;
        this.vrf = $.vrf;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPimVrfPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPimVrfPlainArgs $;

        public Builder() {
            $ = new GetPimVrfPlainArgs();
        }

        public Builder(GetPimVrfPlainArgs defaults) {
            $ = new GetPimVrfPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder device(@Nullable String device) {
            $.device = device;
            return this;
        }

        public Builder vrf(String vrf) {
            $.vrf = vrf;
            return this;
        }

        public GetPimVrfPlainArgs build() {
            $.vrf = Objects.requireNonNull($.vrf, "expected parameter 'vrf' to be non-null");
            return $;
        }
    }

}