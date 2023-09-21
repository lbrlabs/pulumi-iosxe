// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.iosxe.iosxe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.iosxe.iosxe.outputs.GetCryptoIkev2KeyringPeer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCryptoIkev2KeyringResult {
    /**
     * @return A device name from the provider configuration.
     * 
     */
    private @Nullable String device;
    /**
     * @return The path of the retrieved object.
     * 
     */
    private String id;
    private String name;
    /**
     * @return Configure a Peer and associated keys
     * 
     */
    private List<GetCryptoIkev2KeyringPeer> peers;

    private GetCryptoIkev2KeyringResult() {}
    /**
     * @return A device name from the provider configuration.
     * 
     */
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }
    /**
     * @return The path of the retrieved object.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return Configure a Peer and associated keys
     * 
     */
    public List<GetCryptoIkev2KeyringPeer> peers() {
        return this.peers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCryptoIkev2KeyringResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String device;
        private String id;
        private String name;
        private List<GetCryptoIkev2KeyringPeer> peers;
        public Builder() {}
        public Builder(GetCryptoIkev2KeyringResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.device = defaults.device;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.peers = defaults.peers;
        }

        @CustomType.Setter
        public Builder device(@Nullable String device) {
            this.device = device;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder peers(List<GetCryptoIkev2KeyringPeer> peers) {
            this.peers = Objects.requireNonNull(peers);
            return this;
        }
        public Builder peers(GetCryptoIkev2KeyringPeer... peers) {
            return peers(List.of(peers));
        }
        public GetCryptoIkev2KeyringResult build() {
            final var o = new GetCryptoIkev2KeyringResult();
            o.device = device;
            o.id = id;
            o.name = name;
            o.peers = peers;
            return o;
        }
    }
}
