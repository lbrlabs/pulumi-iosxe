// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.iosxe.iosxe.inputs.CryptoIkev2KeyringPeerArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CryptoIkev2KeyringArgs extends com.pulumi.resources.ResourceArgs {

    public static final CryptoIkev2KeyringArgs Empty = new CryptoIkev2KeyringArgs();

    /**
     * A device name from the provider configuration.
     * 
     */
    @Import(name="device")
    private @Nullable Output<String> device;

    /**
     * @return A device name from the provider configuration.
     * 
     */
    public Optional<Output<String>> device() {
        return Optional.ofNullable(this.device);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Configure a Peer and associated keys
     * 
     */
    @Import(name="peers")
    private @Nullable Output<List<CryptoIkev2KeyringPeerArgs>> peers;

    /**
     * @return Configure a Peer and associated keys
     * 
     */
    public Optional<Output<List<CryptoIkev2KeyringPeerArgs>>> peers() {
        return Optional.ofNullable(this.peers);
    }

    private CryptoIkev2KeyringArgs() {}

    private CryptoIkev2KeyringArgs(CryptoIkev2KeyringArgs $) {
        this.device = $.device;
        this.name = $.name;
        this.peers = $.peers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CryptoIkev2KeyringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CryptoIkev2KeyringArgs $;

        public Builder() {
            $ = new CryptoIkev2KeyringArgs();
        }

        public Builder(CryptoIkev2KeyringArgs defaults) {
            $ = new CryptoIkev2KeyringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param device A device name from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder device(@Nullable Output<String> device) {
            $.device = device;
            return this;
        }

        /**
         * @param device A device name from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder device(String device) {
            return device(Output.of(device));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param peers Configure a Peer and associated keys
         * 
         * @return builder
         * 
         */
        public Builder peers(@Nullable Output<List<CryptoIkev2KeyringPeerArgs>> peers) {
            $.peers = peers;
            return this;
        }

        /**
         * @param peers Configure a Peer and associated keys
         * 
         * @return builder
         * 
         */
        public Builder peers(List<CryptoIkev2KeyringPeerArgs> peers) {
            return peers(Output.of(peers));
        }

        /**
         * @param peers Configure a Peer and associated keys
         * 
         * @return builder
         * 
         */
        public Builder peers(CryptoIkev2KeyringPeerArgs... peers) {
            return peers(List.of(peers));
        }

        public CryptoIkev2KeyringArgs build() {
            return $;
        }
    }

}
