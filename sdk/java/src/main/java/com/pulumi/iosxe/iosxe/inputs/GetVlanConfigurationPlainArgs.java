// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVlanConfigurationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVlanConfigurationPlainArgs Empty = new GetVlanConfigurationPlainArgs();

    @Import(name="device")
    private @Nullable String device;

    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }

    @Import(name="vlanId", required=true)
    private Integer vlanId;

    public Integer vlanId() {
        return this.vlanId;
    }

    private GetVlanConfigurationPlainArgs() {}

    private GetVlanConfigurationPlainArgs(GetVlanConfigurationPlainArgs $) {
        this.device = $.device;
        this.vlanId = $.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVlanConfigurationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVlanConfigurationPlainArgs $;

        public Builder() {
            $ = new GetVlanConfigurationPlainArgs();
        }

        public Builder(GetVlanConfigurationPlainArgs defaults) {
            $ = new GetVlanConfigurationPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder device(@Nullable String device) {
            $.device = device;
            return this;
        }

        public Builder vlanId(Integer vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        public GetVlanConfigurationPlainArgs build() {
            $.vlanId = Objects.requireNonNull($.vlanId, "expected parameter 'vlanId' to be non-null");
            return $;
        }
    }

}
