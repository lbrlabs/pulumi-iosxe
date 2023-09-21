// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PimVrfRpAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final PimVrfRpAddressArgs Empty = new PimVrfRpAddressArgs();

    @Import(name="accessList", required=true)
    private Output<String> accessList;

    public Output<String> accessList() {
        return this.accessList;
    }

    @Import(name="bidir")
    private @Nullable Output<Boolean> bidir;

    public Optional<Output<Boolean>> bidir() {
        return Optional.ofNullable(this.bidir);
    }

    @Import(name="override")
    private @Nullable Output<Boolean> override;

    public Optional<Output<Boolean>> override() {
        return Optional.ofNullable(this.override);
    }

    @Import(name="rpAddress")
    private @Nullable Output<String> rpAddress;

    public Optional<Output<String>> rpAddress() {
        return Optional.ofNullable(this.rpAddress);
    }

    private PimVrfRpAddressArgs() {}

    private PimVrfRpAddressArgs(PimVrfRpAddressArgs $) {
        this.accessList = $.accessList;
        this.bidir = $.bidir;
        this.override = $.override;
        this.rpAddress = $.rpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PimVrfRpAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PimVrfRpAddressArgs $;

        public Builder() {
            $ = new PimVrfRpAddressArgs();
        }

        public Builder(PimVrfRpAddressArgs defaults) {
            $ = new PimVrfRpAddressArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessList(Output<String> accessList) {
            $.accessList = accessList;
            return this;
        }

        public Builder accessList(String accessList) {
            return accessList(Output.of(accessList));
        }

        public Builder bidir(@Nullable Output<Boolean> bidir) {
            $.bidir = bidir;
            return this;
        }

        public Builder bidir(Boolean bidir) {
            return bidir(Output.of(bidir));
        }

        public Builder override(@Nullable Output<Boolean> override) {
            $.override = override;
            return this;
        }

        public Builder override(Boolean override) {
            return override(Output.of(override));
        }

        public Builder rpAddress(@Nullable Output<String> rpAddress) {
            $.rpAddress = rpAddress;
            return this;
        }

        public Builder rpAddress(String rpAddress) {
            return rpAddress(Output.of(rpAddress));
        }

        public PimVrfRpAddressArgs build() {
            $.accessList = Objects.requireNonNull($.accessList, "expected parameter 'accessList' to be non-null");
            return $;
        }
    }

}
