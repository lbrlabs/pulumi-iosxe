// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MsdpVrfPasswordArgs extends com.pulumi.resources.ResourceArgs {

    public static final MsdpVrfPasswordArgs Empty = new MsdpVrfPasswordArgs();

    @Import(name="addr", required=true)
    private Output<String> addr;

    public Output<String> addr() {
        return this.addr;
    }

    @Import(name="encryption")
    private @Nullable Output<Integer> encryption;

    public Optional<Output<Integer>> encryption() {
        return Optional.ofNullable(this.encryption);
    }

    @Import(name="password", required=true)
    private Output<String> password;

    public Output<String> password() {
        return this.password;
    }

    private MsdpVrfPasswordArgs() {}

    private MsdpVrfPasswordArgs(MsdpVrfPasswordArgs $) {
        this.addr = $.addr;
        this.encryption = $.encryption;
        this.password = $.password;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MsdpVrfPasswordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MsdpVrfPasswordArgs $;

        public Builder() {
            $ = new MsdpVrfPasswordArgs();
        }

        public Builder(MsdpVrfPasswordArgs defaults) {
            $ = new MsdpVrfPasswordArgs(Objects.requireNonNull(defaults));
        }

        public Builder addr(Output<String> addr) {
            $.addr = addr;
            return this;
        }

        public Builder addr(String addr) {
            return addr(Output.of(addr));
        }

        public Builder encryption(@Nullable Output<Integer> encryption) {
            $.encryption = encryption;
            return this;
        }

        public Builder encryption(Integer encryption) {
            return encryption(Output.of(encryption));
        }

        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public MsdpVrfPasswordArgs build() {
            $.addr = Objects.requireNonNull($.addr, "expected parameter 'addr' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            return $;
        }
    }

}
